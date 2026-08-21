/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Ints
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.exceptions.AuthenticationUnavailableException
 *  com.mojang.authlib.yggdrasil.ProfileResult
 *  com.mojang.logging.LogUtils
 *  org.apache.commons.lang3.Validate
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.primitives.Ints;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.yggdrasil.ProfileResult;
import com.mojang.logging.LogUtils;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.PrivateKey;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.lang3.Validate;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class ayk
implements akw,
xv {
    private static final AtomicInteger b = new AtomicInteger(0);
    static final Logger c = LogUtils.getLogger();
    private static final int d = 600;
    private final byte[] e;
    final MinecraftServer f;
    final wu g;
    final ayz h;
    private volatile a i = a.a;
    private int j;
    @Nullable String k;
    private @Nullable GameProfile l;
    private final String m = "";
    private final boolean n;

    public ayk(MinecraftServer $$0, wu $$1, boolean $$2) {
        this.f = $$0;
        this.g = $$1;
        this.h = this.f.H();
        this.e = Ints.toByteArray((int)bgr.a().f());
        this.n = $$2;
    }

    @Override
    public void d() {
        if (this.i == a.e) {
            this.c(Objects.requireNonNull(this.l));
        }
        if (this.i == a.f && !this.a(Objects.requireNonNull(this.l))) {
            this.d(this.l);
        }
        if (this.j++ == 600) {
            this.a(yh.c("multiplayer.disconnect.slow_login"));
        }
    }

    @Override
    public boolean c() {
        return this.g.i();
    }

    public void a(yh $$0) {
        try {
            c.info("Disconnecting {}: {}", (Object)this.e(), (Object)$$0.getString());
            this.g.a(new aks($$0));
            this.g.a($$0);
        }
        catch (Exception $$1) {
            c.error("Error whilst disconnecting player", (Throwable)$$1);
        }
    }

    private boolean a(GameProfile $$0) {
        return this.f.aj().b($$0.id()) != null;
    }

    @Override
    public void a(ww $$0) {
        c.info("{} lost connection: {}", (Object)this.e(), (Object)$$0.a().getString());
    }

    public String e() {
        String $$0 = this.g.a(this.f.bn());
        if (this.k != null) {
            return this.k + " (" + $$0 + ")";
        }
        return $$0;
    }

    @Override
    public void a(aky $$0) {
        Validate.validState((this.i == a.a ? 1 : 0) != 0, (String)"Unexpected hello packet", (Object[])new Object[0]);
        Validate.validState((boolean)bhi.f($$0.b()), (String)"Invalid characters in username", (Object[])new Object[0]);
        this.k = $$0.b();
        GameProfile $$1 = this.f.W();
        if ($$1 != null && this.k.equalsIgnoreCase($$1.name())) {
            this.b($$1);
            return;
        }
        if (this.f.ae() && !this.g.e()) {
            this.i = a.b;
            this.g.a(new akq("", this.f.U().getPublic().getEncoded(), this.e, true));
        } else {
            this.b(jx.b(this.k));
        }
    }

    void b(GameProfile $$0) {
        this.l = $$0;
        this.i = a.e;
    }

    private void c(GameProfile $$0) {
        bbz $$1 = this.f.aj();
        yh $$2 = $$1.a(this.g.d(), new bbx($$0));
        if ($$2 != null) {
            this.a($$2);
        } else {
            boolean $$3;
            if (this.f.ax() >= 0 && !this.g.e()) {
                this.g.a(new akr(this.f.ax()), xm.a(() -> this.g.a(this.f.ax(), true)));
            }
            if ($$3 = $$1.a($$0.id())) {
                this.i = a.f;
            } else {
                this.d($$0);
            }
        }
    }

    private void d(GameProfile $$0) {
        this.i = a.g;
        this.g.a(new akt($$0));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void a(akz $$0) {
        void $$7;
        Validate.validState((this.i == a.b ? 1 : 0) != 0, (String)"Unexpected key packet", (Object[])new Object[0]);
        try {
            PrivateKey $$1 = this.f.U().getPrivate();
            if (!$$0.a(this.e, $$1)) {
                throw new IllegalStateException("Protocol error");
            }
            SecretKey $$2 = $$0.a($$1);
            Cipher $$3 = bfb.a(2, $$2);
            Cipher $$4 = bfb.a(1, $$2);
            String $$5 = new BigInteger(bfb.a("", this.f.U().getPublic(), $$2)).toString(16);
            this.i = a.c;
            this.g.a($$3, $$4);
        }
        catch (bfc $$6) {
            throw new IllegalStateException("Protocol error", $$6);
        }
        Thread $$8 = new Thread("User Authenticator #" + b.incrementAndGet(), (String)$$7){
            final /* synthetic */ String a;
            {
                this.a = string;
                super($$1);
            }

            @Override
            public void run() {
                String $$0 = Objects.requireNonNull(ayk.this.k, "Player name not initialized");
                try {
                    ProfileResult $$1 = ayk.this.f.ar().c().hasJoinedServer($$0, this.a, this.a());
                    if ($$1 != null) {
                        GameProfile $$2 = $$1.profile();
                        c.info("UUID of player {} is {}", (Object)$$2.name(), (Object)$$2.id());
                        ayk.this.h.b();
                        ayk.this.b($$2);
                    } else if (ayk.this.f.X()) {
                        c.warn("Failed to verify username but will let them in anyway!");
                        ayk.this.b(jx.b($$0));
                    } else {
                        ayk.this.a(yh.c("multiplayer.disconnect.unverified_username"));
                        c.error("Username '{}' tried to join with an invalid session", (Object)$$0);
                    }
                }
                catch (AuthenticationUnavailableException $$3) {
                    if (ayk.this.f.X()) {
                        c.warn("Authentication servers are down but will let them in anyway!");
                        ayk.this.b(jx.b($$0));
                    }
                    ayk.this.a(yh.c("multiplayer.disconnect.authservers_down"));
                    c.error("Couldn't verify username because servers are unavailable");
                }
            }

            private @Nullable InetAddress a() {
                SocketAddress $$0 = ayk.this.g.d();
                return ayk.this.f.af() && $$0 instanceof InetSocketAddress ? ((InetSocketAddress)$$0).getAddress() : null;
            }
        };
        $$8.setUncaughtExceptionHandler(new p(c));
        $$8.start();
    }

    @Override
    public void a(akx $$0) {
        this.a(ayf.c);
    }

    @Override
    public void a(ala $$0) {
        Validate.validState((this.i == a.g ? 1 : 0) != 0, (String)"Unexpected login acknowledgement packet", (Object[])new Object[0]);
        this.g.a(acp.d);
        axu $$1 = axu.a(Objects.requireNonNull(this.l), this.n);
        ayg $$2 = new ayg(this.f, this.g, $$1);
        this.g.a(acp.b, $$2);
        $$2.l();
        this.i = a.h;
    }

    @Override
    public void a(m $$0, n $$1) {
        $$1.a("Login phase", () -> this.i.toString());
    }

    @Override
    public void a(acz $$0) {
        this.a(ayf.c);
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        public static final /* enum */ a e = new a();
        public static final /* enum */ a f = new a();
        public static final /* enum */ a g = new a();
        public static final /* enum */ a h = new a();
        private static final /* synthetic */ a[] i;

        public static a[] values() {
            return (a[])i.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d, e, f, g, h};
        }

        static {
            i = ayk$a.a();
        }
    }
}

