/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.exceptions.AuthenticationException
 *  com.mojang.authlib.exceptions.AuthenticationUnavailableException
 *  com.mojang.authlib.exceptions.ForcedUsernameChangeException
 *  com.mojang.authlib.exceptions.InsufficientPrivilegesException
 *  com.mojang.authlib.exceptions.InvalidCredentialsException
 *  com.mojang.authlib.exceptions.UserBannedException
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.exceptions.ForcedUsernameChangeException;
import com.mojang.authlib.exceptions.InsufficientPrivilegesException;
import com.mojang.authlib.exceptions.InvalidCredentialsException;
import com.mojang.authlib.exceptions.UserBannedException;
import com.mojang.logging.LogUtils;
import java.math.BigInteger;
import java.security.PublicKey;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import net.minecraft.client.ClientBrandRetriever;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class hie
implements ako {
    private static final Logger a = LogUtils.getLogger();
    private final gfj b;
    private final @Nullable hit c;
    private final @Nullable gsb d;
    private final Consumer<yh> e;
    private final wu f;
    private final boolean g;
    private final @Nullable Duration h;
    private @Nullable String i;
    private final hin j;
    private final Map<amo, byte[]> k;
    private final boolean l;
    private final Map<UUID, hiq> m;
    private final boolean n;
    private final AtomicReference<a> o = new AtomicReference<a>(hie$a.a);

    public hie(wu $$0, gfj $$1, @Nullable hit $$2, @Nullable gsb $$3, boolean $$4, @Nullable Duration $$5, Consumer<yh> $$6, hin $$7, @Nullable hix $$8) {
        this.f = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        this.e = $$6;
        this.g = $$4;
        this.h = $$5;
        this.j = $$7;
        this.k = $$8 != null ? new HashMap<amo, byte[]>($$8.a()) : new HashMap();
        this.m = $$8 != null ? $$8.b() : Map.of();
        this.n = $$8 != null ? $$8.c() : false;
        this.l = $$8 != null;
    }

    private void a(a $$0) {
        a $$12 = this.o.updateAndGet($$1 -> {
            if (!$$0.f.contains($$1)) {
                throw new IllegalStateException("Tried to switch to " + String.valueOf((Object)$$0) + " from " + String.valueOf($$1) + ", but expected one of " + String.valueOf($$0.f));
            }
            return $$0;
        });
        this.e.accept($$12.e);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void a(akq $$0) {
        this.a(hie$a.b);
        try {
            SecretKey $$1 = bfb.a();
            PublicKey $$2 = $$0.e();
            String $$3 = new BigInteger(bfb.a($$0.b(), $$2, $$1)).toString(16);
            Cipher $$4 = bfb.a(2, $$1);
            Cipher $$5 = bfb.a(1, $$1);
            byte[] $$6 = $$0.f();
            akz $$7 = new akz($$1, $$2, $$6);
        }
        catch (Exception $$8) {
            throw new IllegalStateException("Protocol error", $$8);
        }
        if ($$0.g()) {
            void $$11;
            bhs.i().execute(() -> this.a((String)$$11, (akz)$$12, (Cipher)$$9, (Cipher)$$10));
        } else {
            this.a((akz)$$12, (Cipher)$$9, (Cipher)$$10);
        }
    }

    private void a(akz $$0, Cipher $$1, Cipher $$2) {
        this.a(hie$a.c);
        this.f.a($$0, xm.a(() -> this.f.a($$1, $$2)));
    }

    private @Nullable yh b(String $$0) {
        try {
            this.b.as().c().joinServer(this.b.ac().b(), this.b.ac().d(), $$0);
        }
        catch (AuthenticationUnavailableException $$1) {
            return yh.a("disconnect.loginFailedInfo", yh.c("disconnect.loginFailedInfo.serversUnavailable"));
        }
        catch (InvalidCredentialsException $$2) {
            return yh.a("disconnect.loginFailedInfo", yh.c("disconnect.loginFailedInfo.invalidSession"));
        }
        catch (InsufficientPrivilegesException $$3) {
            return yh.a("disconnect.loginFailedInfo", yh.c("disconnect.loginFailedInfo.insufficientPrivileges"));
        }
        catch (ForcedUsernameChangeException | UserBannedException $$4) {
            return yh.a("disconnect.loginFailedInfo", yh.c("disconnect.loginFailedInfo.userBanned"));
        }
        catch (AuthenticationException $$5) {
            return yh.a("disconnect.loginFailedInfo", new Object[]{$$5.getMessage()});
        }
        return null;
    }

    @Override
    public void a(akt $$0) {
        this.a(hie$a.d);
        GameProfile $$1 = $$0.b();
        this.f.a(acp.d, new hib(this.b, this.f, new hik(this.j, $$1, this.b.y().a(this.g, this.h, this.i), hii.a().a(), dhb.h, null, this.c, this.d, this.k, null, Map.of(), anl.a, this.m, false)));
        this.f.a(ala.a);
        this.f.a(acp.b);
        this.f.a(new aby(new acc(ClientBrandRetriever.getClientModName())));
        this.f.a(new abw(this.b.k.aR()));
    }

    @Override
    public void a(ww $$0) {
        yh $$1;
        yh yh2 = $$1 = this.l ? yg.s : yg.t;
        if (this.c != null && this.c.e()) {
            this.b.a(new grj(this.d, $$1, $$0.a(), yg.k));
        } else {
            this.b.a(new grj(this.d, $$1, $$0));
        }
    }

    @Override
    public boolean c() {
        return this.f.i();
    }

    @Override
    public void a(aks $$0) {
        this.f.a($$0.b());
    }

    @Override
    public void a(akr $$0) {
        if (!this.f.e()) {
            this.f.a($$0.b(), false);
        }
    }

    @Override
    public void a(akp $$0) {
        this.e.accept(yh.c("connect.negotiating"));
        this.f.a(new akx($$0.b(), null));
    }

    public void a(@Nullable String $$0) {
        this.i = $$0;
    }

    @Override
    public void a(acw $$0) {
        this.f.a(new acz($$0.b(), this.k.get($$0.b())));
    }

    @Override
    public void a(m $$0, n $$1) {
        $$1.a("Server type", () -> this.c != null ? this.c.f().toString() : "<unknown>");
        $$1.a("Login phase", () -> this.o.get().toString());
        $$1.a("Is Local", () -> String.valueOf(this.f.e()));
    }

    private /* synthetic */ void a(String $$0, akz $$1, Cipher $$2, Cipher $$3) {
        yh $$4 = this.b($$0);
        if ($$4 != null) {
            if (this.c != null && this.c.d()) {
                a.warn($$4.getString());
            } else {
                this.f.a($$4);
                return;
            }
        }
        this.a($$1, $$2, $$3);
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(yh.c("connect.connecting"), Set.of());
        public static final /* enum */ a b = new a(yh.c("connect.authorizing"), Set.of(a));
        public static final /* enum */ a c = new a(yh.c("connect.encrypting"), Set.of(b));
        public static final /* enum */ a d = new a(yh.c("connect.joining"), Set.of(c, a));
        final yh e;
        final Set<a> f;
        private static final /* synthetic */ a[] g;

        public static a[] values() {
            return (a[])g.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(yh $$0, Set<a> $$1) {
            this.e = $$0;
            this.f = $$1;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d};
        }

        static {
            g = hie$a.a();
        }
    }
}

