/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class gcz
extends isc {
    static final Logger c = LogUtils.getLogger();
    private static final yh F = yh.c("mco.selectServer.create");
    private static final yh G = yh.c("mco.selectServer.create.subtitle").b(-6250336);
    private static final yh H = yh.c("mco.configure.world.switch.slot");
    private static final yh I = yh.c("mco.configure.world.switch.slot.subtitle").b(-6250336);
    private static final yh J = yh.c("mco.reset.world.generate");
    private static final yh K = yh.c("mco.reset.world.title");
    private static final yh L = yh.c("mco.reset.world.warning").b(-65536);
    public static final yh a = yh.c("mco.create.world.reset.title");
    private static final yh M = yh.c("mco.reset.world.resetting.screen.title");
    private static final yh N = yh.c("mco.reset.world.template");
    private static final yh O = yh.c("mco.reset.world.adventure");
    private static final yh P = yh.c("mco.reset.world.experience");
    private static final yh Q = yh.c("mco.reset.world.inspiration");
    private final gsb R;
    private final gbg S;
    private final yh T;
    private final yh U;
    private static final amo V = amo.b("textures/gui/realms/upload.png");
    private static final amo W = amo.b("textures/gui/realms/adventure.png");
    private static final amo X = amo.b("textures/gui/realms/survival_spawn.png");
    private static final amo Y = amo.b("textures/gui/realms/new_world.png");
    private static final amo Z = amo.b("textures/gui/realms/experience.png");
    private static final amo aa = amo.b("textures/gui/realms/inspiration.png");
    gca ab;
    gca ac;
    gca ad;
    gca ae;
    public final int b;
    private final @Nullable gej af;
    private final Runnable ag;
    private final gou ah = new gou(this);

    private gcz(gsb $$0, gbg $$1, int $$2, yh $$3, yh $$4, yh $$5, Runnable $$6) {
        this($$0, $$1, $$2, $$3, $$4, $$5, null, $$6);
    }

    public gcz(gsb $$0, gbg $$1, int $$2, yh $$3, yh $$4, yh $$5, @Nullable gej $$6, Runnable $$7) {
        super($$3);
        this.R = $$0;
        this.S = $$1;
        this.b = $$2;
        this.T = $$4;
        this.U = $$5;
        this.af = $$6;
        this.ag = $$7;
    }

    public static gcz a(gsb $$0, gbg $$1, gej $$2, Runnable $$3) {
        return new gcz($$0, $$1, $$1.q, F, G, a, $$2, $$3);
    }

    public static gcz a(gsb $$0, int $$1, gbg $$2, Runnable $$3) {
        return new gcz($$0, $$2, $$1, H, I, a, $$3);
    }

    public static gcz a(gsb $$0, gbg $$1, Runnable $$2) {
        return new gcz($$0, $$1, $$1.q, K, L, M, $$2);
    }

    @Override
    public void bg_() {
        goy $$02 = this.ah.a(goy.d());
        $$02.c().a(this.q.b / 3);
        $$02.a(new gko(this.m, this.q), gox::b);
        $$02.a(new gko(this.T, this.q), gox::b);
        new Thread("Realms-reset-world-fetcher"){

            @Override
            public void run() {
                fzz $$0 = fzz.a();
                try {
                    gca $$1 = $$0.a(1, 10, gbg.d.a);
                    gca $$2 = $$0.a(1, 10, gbg.d.c);
                    gca $$3 = $$0.a(1, 10, gbg.d.d);
                    gca $$4 = $$0.a(1, 10, gbg.d.e);
                    gcz.this.n.execute(() -> {
                        gcz.this.ab = $$1;
                        gcz.this.ac = $$2;
                        gcz.this.ad = $$3;
                        gcz.this.ae = $$4;
                    });
                }
                catch (gce $$5) {
                    c.error("Couldn't fetch templates in reset world", (Throwable)$$5);
                }
            }
        }.start();
        got $$12 = this.ah.c(new got());
        got.b $$2 = $$12.d(3);
        $$2.c().f(16);
        $$2.a(new a(this.n.g, J, Y, $$0 -> gaf.a(this.n, this.R, this, this.b, this.S, this.af)));
        $$2.a(new a(this.n.g, gda.a, V, $$0 -> this.n.a(new gda(this.af, this.S.b, this.b, this))));
        $$2.a(new a(this.n.g, N, X, $$0 -> this.n.a(new gdb(N, this::a, gbg.d.a, this.ab))));
        $$2.a(goz.b(16), 3);
        $$2.a(new a(this.n.g, O, W, $$0 -> this.n.a(new gdb(O, this::a, gbg.d.c, this.ac))));
        $$2.a(new a(this.n.g, P, Z, $$0 -> this.n.a(new gdb(P, this::a, gbg.d.d, this.ad))));
        $$2.a(new a(this.n.g, Q, aa, $$0 -> this.n.a(new gdb(Q, this::a, gbg.d.e, this.ae))));
        this.ah.b(gje.a(yg.k, (gje $$0) -> this.aX_()).a());
        this.ah.a($$1 -> {
            gjc cfr_ignored_0 = (gjc)this.c($$1);
        });
        this.c();
    }

    @Override
    protected void c() {
        this.ah.a();
    }

    @Override
    public yh i() {
        return yg.a(new yh[]{this.q(), this.T});
    }

    @Override
    public void aX_() {
        this.n.a(this.R);
    }

    private void a(@Nullable gbz $$0) {
        this.n.a(this);
        if ($$0 != null) {
            this.a(new gek($$0, this.S.b, this.U, this.ag));
        }
        fzu.g();
    }

    private void a(geh $$0) {
        ArrayList<geh> $$1 = new ArrayList<geh>();
        if (this.af != null) {
            $$1.add(this.af);
        }
        if (this.b != this.S.q) {
            $$1.add(new geo(this.S.b, this.b, () -> {}));
        }
        $$1.add($$0);
        this.n.a(new gcu(this.R, $$1.toArray(new geh[0])));
    }

    class a
    extends gje {
        private static final amo b = amo.b("widget/slot_frame");
        private static final int c = 60;
        private static final int d = 2;
        private static final int u = 56;
        private final amo v;

        a(gio $$0, yh $$1, amo $$2, gje.c $$3) {
            super(0, 0, 60, 60 + $$0.b, $$1, $$3, r);
            this.v = $$2;
        }

        @Override
        public void b(gir $$0, int $$1, int $$2, float $$3) {
            boolean $$4 = this.D();
            int $$5 = -1;
            if ($$4) {
                $$5 = bel.a(1.0f, 0.56f, 0.56f, 0.56f);
            }
            int $$6 = this.aT_();
            int $$7 = this.aU_();
            $$0.a(hpa.at, this.v, $$6 + 2, $$7 + 2, 0.0f, 0.0f, 56, 56, 56, 56, 56, 56, $$5);
            $$0.a(hpa.at, b, $$6, $$7, 60, 60, $$5);
            int $$8 = $$4 ? -6250336 : -1;
            $$0.a(gcz.this.q, this.B(), $$6 + 28, $$7 - 14, $$8);
        }
    }
}

