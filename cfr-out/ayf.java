/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.logging.LogUtils
 *  io.netty.channel.ChannelFutureListener
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import io.netty.channel.ChannelFutureListener;
import net.minecraft.server.MinecraftServer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public abstract class ayf
implements abv {
    private static final Logger f = LogUtils.getLogger();
    public static final int b = 15000;
    private static final int g = 15000;
    private static final yh h = yh.c("disconnect.timeout");
    static final yh c = yh.c("multiplayer.disconnect.unexpected_query_response");
    protected final MinecraftServer d;
    protected final wu e;
    private final boolean i;
    private long j;
    private boolean k;
    private long l;
    private long m;
    private boolean n = false;
    private int o;
    private volatile boolean p = false;

    public ayf(MinecraftServer $$0, wu $$1, axu $$2) {
        this.d = $$0;
        this.e = $$1;
        this.j = bhs.c();
        this.o = $$2.b();
        this.i = $$2.d();
    }

    private void l() {
        if (!this.n) {
            this.m = bhs.c();
            this.n = true;
        }
    }

    @Override
    public void a(ww $$0) {
        if (this.h()) {
            f.info("Stopping singleplayer server as player logged out");
            this.d.a(false);
        }
    }

    @Override
    public void a(aay $$0, Exception $$1) throws v {
        abv.super.a($$0, $$1);
        this.d.a($$1, $$0.a());
    }

    @Override
    public void a(abz $$0) {
        if (this.k && $$0.b() == this.l) {
            int $$1 = (int)(bhs.c() - this.j);
            this.o = (this.o * 3 + $$1) / 4;
            this.k = false;
        } else if (!this.h()) {
            this.a(h);
        }
    }

    @Override
    public void a(aca $$0) {
    }

    @Override
    public void a(aby $$0) {
    }

    @Override
    public void a(abx $$0) {
        abb.a($$0, this, this.d.bv());
        this.d.a($$0.b(), $$0.e());
    }

    @Override
    public void a(acb $$0) {
        abb.a($$0, this, this.d.bv());
        if ($$0.e() == acb.a.b && this.d.ad()) {
            f.info("Disconnecting {} due to resource pack {} rejection", (Object)this.i().name(), (Object)$$0.b());
            this.a(yh.c("multiplayer.requiredTexturePrompt.disconnect"));
        }
    }

    @Override
    public void a(acz $$0) {
        this.a(c);
    }

    protected void e() {
        bzl.a().a("keepAlive");
        long $$0 = bhs.c();
        if (!this.h() && $$0 - this.j >= 15000L) {
            if (this.k) {
                this.a(h);
            } else if (this.a($$0)) {
                this.k = true;
                this.j = $$0;
                this.l = $$0;
                this.b(new abl(this.l));
            }
        }
        bzl.a().c();
    }

    private boolean a(long $$0) {
        if (this.n) {
            if ($$0 - this.m >= 15000L) {
                this.a(h);
            }
            return false;
        }
        return true;
    }

    public void f() {
        this.p = true;
    }

    public void g() {
        this.p = false;
        this.e.a();
    }

    public void b(aay<?> $$0) {
        this.a($$0, null);
    }

    public void a(aay<?> $$0, @Nullable ChannelFutureListener $$1) {
        if ($$0.d()) {
            this.l();
        }
        boolean $$2 = !this.p || !this.d.bK();
        try {
            this.e.a($$0, $$1, $$2);
        }
        catch (Throwable $$3) {
            m $$4 = m.a($$3, "Sending packet");
            n $$5 = $$4.a("Packet being sent");
            $$5.a("Packet class", () -> $$0.getClass().getCanonicalName());
            throw new v($$4);
        }
    }

    public void a(yh $$0) {
        this.b(new ww($$0));
    }

    public void b(ww $$0) {
        this.e.a(new abk($$0.a()), xm.a(() -> this.e.a($$0)));
        this.e.m();
        this.d.h(this.e::n);
    }

    protected boolean h() {
        return this.d.a(new bbx(this.i()));
    }

    protected abstract GameProfile i();

    @bht
    public GameProfile j() {
        return this.i();
    }

    public int k() {
        return this.o;
    }

    protected axu a(awp $$0) {
        return new axu(this.i(), this.o, $$0, this.i);
    }
}

