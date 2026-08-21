/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.BanDetails
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.authlib.minecraft.BanDetails;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.lang.invoke.LambdaMetafactory;
import java.util.Objects;
import net.minecraft.server.MinecraftServer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class gsd
extends gsb {
    private static final Logger a = LogUtils.getLogger();
    private static final yh b = yh.c("narrator.screen.title");
    private static final yh c = yh.c("title.credits");
    private static final String d = "Demo_World";
    private @Nullable gkm e;
    private @Nullable gcv f;
    private boolean t;
    private long u;
    private final gjw v;

    public gsd() {
        this(false);
    }

    public gsd(boolean $$0) {
        this($$0, null);
    }

    public gsd(boolean $$0, @Nullable gjw $$1) {
        super(b);
        this.t = $$0;
        this.v = Objects.requireNonNullElseGet($$1, () -> new gjw(false));
    }

    private boolean o() {
        return this.f != null;
    }

    @Override
    public void e() {
        if (this.o()) {
            this.f.e();
        }
    }

    public static void a(ilr $$0) {
        $$0.a(gjw.a);
        $$0.a(gjw.c);
        $$0.a(hor.a);
    }

    @Override
    public boolean ba_() {
        return false;
    }

    @Override
    public boolean aY_() {
        return false;
    }

    @Override
    protected void bg_() {
        if (this.e == null) {
            this.e = this.n.aO().a();
        }
        int $$02 = this.q.a(c);
        int $$1 = this.o - $$02 - 2;
        int $$2 = 24;
        int $$3 = this.p / 4 + 48;
        $$3 = this.n.P() ? this.e($$3, 24) : this.d($$3, 24);
        $$3 = this.c($$3, 24);
        gkn $$4 = this.c(gji.a(20, (gje $$0) -> this.n.a(new gvy((gsb)this, this.n.k, this.n.am())), true));
        $$4.c(this.o / 2 - 124, $$3 += 36);
        this.c(gje.a(yh.c("menu.options"), (gje $$0) -> this.n.a(new gwb(this, this.n.k))).a(this.o / 2 - 100, $$3, 98, 20).a());
        this.c(gje.a(yh.c("menu.quit"), (gje $$0) -> this.n.u()).a(this.o / 2 + 2, $$3, 98, 20).a());
        gkn $$5 = this.c(gji.b(20, (gje $$0) -> this.n.a(new gvv(this, this.n.k)), true));
        $$5.c(this.o / 2 + 104, $$3);
        this.c(new gkd($$1, this.p - 10, $$02, 10, c, $$0 -> this.n.a(new gre(this)), this.q));
        if (this.f == null) {
            this.f = new gcv();
        }
        if (this.o()) {
            this.f.b(this.o, this.p);
        }
    }

    private int c(int $$02, int $$1) {
        if (w.aX) {
            this.c(gje.a(yh.b("Create Test World"), (gje $$0) -> gxx.b(this.n, () -> this.n.a(this))).a(this.o / 2 - 100, $$02 += $$1, 200, 20).a());
        }
        return $$02;
    }

    private int d(int $$02, int $$1) {
        this.c(gje.a(yh.c("menu.singleplayer"), (gje $$0) -> this.n.a(new gyf(this))).a(this.o / 2 - 100, $$02, 200, 20).a());
        yh $$2 = this.p();
        boolean $$3 = $$2 == null;
        gks $$4 = $$2 != null ? gks.a($$2) : null;
        $$02 += $$1;
        this.c(gje.a((yh)yh.c((String)"menu.multiplayer"), (gje.c)(gje.c)LambdaMetafactory.metafactory(null, null, null, (Lgje;)V, c(gje ), (Lgje;)V)((gsd)this)).a((int)(this.o / 2 - 100), (int)v0, (int)200, (int)20).a((gks)$$4).a()).k = $$3;
        this.c(gje.a((yh)yh.c((String)"menu.online"), (gje.c)(gje.c)LambdaMetafactory.metafactory(null, null, null, (Lgje;)V, b(gje ), (Lgje;)V)((gsd)this)).a((int)(this.o / 2 - 100), (int)v1, (int)200, (int)20).a((gks)$$4).a()).k = $$3;
        return $$02 += $$1;
    }

    private @Nullable yh p() {
        if (this.n.K()) {
            return null;
        }
        if (this.n.N()) {
            return yh.c("title.multiplayer.disabled.banned.name");
        }
        BanDetails $$0 = this.n.M();
        if ($$0 != null) {
            if ($$0.expires() != null) {
                return yh.c("title.multiplayer.disabled.banned.temporary");
            }
            return yh.c("title.multiplayer.disabled.banned.permanent");
        }
        return yh.c("title.multiplayer.disabled");
    }

    private int e(int $$02, int $$12) {
        boolean $$2 = this.F();
        this.c(gje.a(yh.c("menu.playdemo"), (gje $$1) -> {
            if ($$2) {
                this.n.B().a(d, () -> this.n.a(this));
            } else {
                this.n.B().a(d, MinecraftServer.e, evo.b, ffe::a, this);
            }
        }).a(this.o / 2 - 100, $$02, 200, 20).a());
        gje $$3 = this.c(gje.a(yh.c("menu.resetdemo"), (gje $$0) -> {
            fni $$1 = this.n.q();
            try (fni.c $$2 = $$1.e(d);){
                if ($$2.m()) {
                    this.n.a(new gra(this::c, yh.c("selectWorld.deleteQuestion"), yh.a("selectWorld.deleteWarning", new Object[]{MinecraftServer.e.a()}), yh.c("selectWorld.deleteButton"), yg.e));
                }
            }
            catch (IOException $$3) {
                gna.a(this.n, d);
                a.warn("Failed to access demo world", (Throwable)$$3);
            }
        }).a(this.o / 2 - 100, $$02 += $$12, 200, 20).a());
        $$3.k = $$2;
        return $$02;
    }

    private boolean F() {
        boolean bl2;
        block8: {
            fni.c $$0 = this.n.q().e(d);
            try {
                bl2 = $$0.m();
                if ($$0 == null) break block8;
            }
            catch (Throwable throwable) {
                try {
                    if ($$0 != null) {
                        try {
                            $$0.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (IOException $$1) {
                    gna.a(this.n, d);
                    a.warn("Failed to read demo world data", (Throwable)$$1);
                    return false;
                }
            }
            $$0.close();
        }
        return bl2;
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        if (this.u == 0L && this.t) {
            this.u = bhs.c();
        }
        float $$4 = 1.0f;
        if (this.t) {
            float $$5 = (float)(bhs.c() - this.u) / 2000.0f;
            if ($$5 > 1.0f) {
                this.t = false;
            } else {
                $$5 = bgj.a($$5, 0.0f, 1.0f);
                $$4 = bgj.b($$5, 0.5f, 1.0f, 0.0f, 1.0f);
            }
            this.a($$4);
        }
        this.a($$0, $$3);
        super.a($$0, $$1, $$2, $$3);
        this.v.a($$0, this.o, this.v.a() ? 1.0f : $$4);
        if (this.e != null && !this.n.k.c().b().booleanValue()) {
            this.e.a($$0, this.o, this.q, $$4);
        }
        String $$6 = "Minecraft " + w.b().c();
        $$6 = this.n.P() ? $$6 + " Demo" : $$6 + (String)("release".equalsIgnoreCase(this.n.n()) ? "" : "/" + this.n.n());
        if (gfj.i().a()) {
            $$6 = $$6 + imu.a("menu.modded", new Object[0]);
        }
        $$0.b(this.q, $$6, 2, this.p - 10, bel.b($$4));
        if (this.o() && $$4 >= 1.0f) {
            this.f.a($$0, $$1, $$2, $$3);
        }
    }

    @Override
    public void b(gir $$0, int $$1, int $$2, float $$3) {
    }

    @Override
    public boolean a(gzc $$0, boolean $$1) {
        if (super.a($$0, $$1)) {
            return true;
        }
        return this.o() && this.f.a($$0, $$1);
    }

    @Override
    public void aZ_() {
        if (this.f != null) {
            this.f.aZ_();
        }
    }

    @Override
    public void aK_() {
        super.aK_();
        if (this.f != null) {
            this.f.aK_();
        }
    }

    private void c(boolean $$0) {
        if ($$0) {
            try (fni.c $$1 = this.n.q().e(d);){
                $$1.k();
            }
            catch (IOException $$2) {
                gna.b(this.n, d);
                a.warn("Failed to delete demo world", (Throwable)$$2);
            }
        }
        this.n.a(this);
    }

    @Override
    public boolean aM_() {
        return true;
    }

    private /* synthetic */ void b(gje $$0) {
        this.n.a(new fzu(this));
    }

    private /* synthetic */ void c(gje $$0) {
        gsb $$1 = this.n.k.r ? new gvp(this) : new gvq(this);
        this.n.a($$1);
    }
}

