/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.util.Optional;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public abstract class dvp {
    private static final Logger a = LogUtils.getLogger();
    public static final String b = "SpawnData";
    private static final int c = 1;
    private static final int d = 20;
    private static final int e = 200;
    private static final int f = 800;
    private static final int g = 4;
    private static final int h = 6;
    private static final int i = 16;
    private static final int j = 4;
    private int k = 20;
    private cbn<dxi> l = cbn.a();
    private @Nullable dxi m;
    private double n;
    private double o;
    private int p = 200;
    private int q = 800;
    private int r = 4;
    private @Nullable cgk s;
    private int t = 6;
    private int u = 16;
    private int v = 4;

    public void a(cgu<?> $$0, @Nullable dwo $$1, bgr $$2, is $$3) {
        this.a($$1, $$2, $$3).a().a("id", mi.g.b($$0).toString());
    }

    private boolean c(dwo $$0, is $$1) {
        return $$0.a((double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, (double)this.u);
    }

    public void a(dwo $$0, is $$1) {
        if (!this.c($$0, $$1)) {
            this.o = this.n;
        } else if (this.s != null) {
            bgr $$2 = $$0.G_();
            double $$3 = (double)$$1.u() + $$2.j();
            double $$4 = (double)$$1.v() + $$2.j();
            double $$5 = (double)$$1.w() + $$2.j();
            $$0.a(ly.ai, $$3, $$4, $$5, 0.0, 0.0, 0.0);
            $$0.a(ly.G, $$3, $$4, $$5, 0.0, 0.0, 0.0);
            if (this.k > 0) {
                --this.k;
            }
            this.o = this.n;
            this.n = (this.n + (double)(1000.0f / ((float)this.k + 200.0f))) % 360.0;
        }
    }

    public void a(axf $$0, is $$12) {
        if (!this.c($$0, $$12) || !$$0.Z()) {
            return;
        }
        if (this.k == -1) {
            this.d($$0, $$12);
        }
        if (this.k > 0) {
            --this.k;
            return;
        }
        boolean $$2 = false;
        bgr $$3 = $$0.G_();
        dxi $$4 = this.a((dwo)$$0, $$3, $$12);
        for (int $$5 = 0; $$5 < this.r; ++$$5) {
            try (bgp.j $$6 = new bgp.j(this::toString, a);){
                fnq $$7 = fno.a((bgp)$$6, (jf.a)$$0.J_(), $$4.a());
                Optional<cgu<?>> $$8 = cgu.a($$7);
                if ($$8.isEmpty()) {
                    this.d($$0, $$12);
                    return;
                }
                ftm $$9 = $$7.a("Pos", ftm.a).orElseGet(() -> new ftm((double)$$12.u() + ($$3.j() - $$3.j()) * (double)this.v + 0.5, $$12.v() + $$3.a(3) - 1, (double)$$12.w() + ($$3.j() - $$3.j()) * (double)this.v + 0.5));
                if (!$$0.b($$8.get().a($$9.g, $$9.h, $$9.i))) continue;
                is $$10 = is.a($$9);
                if ($$4.b().isPresent()) {
                    dxi.a $$11;
                    if (!$$8.get().f().d() && $$0.av() == ccz.a || !($$11 = $$4.b().get()).a($$10, $$0)) continue;
                } else if (!cih.a($$8.get(), $$0, cgt.c, $$10, $$0.G_())) continue;
                cgk $$122 = cgu.a($$7, (dwo)$$0, cgt.c, $$1 -> {
                    $$1.b($$0.g, $$0.h, $$0.i, $$1.ec(), $$1.ee());
                    return $$1;
                });
                if ($$122 == null) {
                    this.d($$0, $$12);
                    return;
                }
                int $$13 = $$0.a(esw.b($$122.getClass()), new fth($$12.u(), $$12.v(), $$12.w(), $$12.u() + 1, $$12.v() + 1, $$12.w() + 1).g(this.v), cgs.f).size();
                if ($$13 >= this.t) {
                    this.d($$0, $$12);
                    return;
                }
                $$122.b($$122.dP(), $$122.dR(), $$122.dV(), $$3.i() * 360.0f, 0.0f);
                if ($$122 instanceof chn) {
                    boolean $$15;
                    chn $$14 = (chn)$$122;
                    if ($$4.b().isEmpty() && !$$14.a((dwp)$$0, cgt.c) || !$$14.a((dwr)$$0)) continue;
                    boolean bl2 = $$15 = $$4.a().i() == 1 && $$4.a().i("id").isPresent();
                    if ($$15) {
                        ((chn)$$122).a((dxf)$$0, $$0.c($$122.dK()), cgt.c, null);
                    }
                    $$4.c().ifPresent($$14::a);
                }
                if (!$$0.e($$122)) {
                    this.d($$0, $$12);
                    return;
                }
                $$0.c(2004, $$12, 0);
                $$0.a($$122, etk.t, $$10);
                if ($$122 instanceof chn) {
                    ((chn)$$122).U();
                }
                $$2 = true;
                continue;
            }
        }
        if ($$2) {
            this.d($$0, $$12);
        }
    }

    private void d(dwo $$0, is $$1) {
        bgr $$22 = $$0.y;
        this.k = this.q <= this.p ? this.p : this.p + $$22.a(this.q - this.p);
        this.l.a($$22).ifPresent($$2 -> this.a($$0, $$1, (dxi)$$2));
        this.a($$0, $$1, 1);
    }

    public void a(@Nullable dwo $$0, is $$1, fnq $$22) {
        this.k = $$22.a("Delay", (short)20);
        $$22.a(b, dxi.b).ifPresent($$2 -> this.a($$0, $$1, (dxi)$$2));
        this.l = $$22.a("SpawnPotentials", dxi.c).orElseGet(() -> cbn.a(this.m != null ? this.m : new dxi()));
        this.p = $$22.a("MinSpawnDelay", 200);
        this.q = $$22.a("MaxSpawnDelay", 800);
        this.r = $$22.a("SpawnCount", 4);
        this.t = $$22.a("MaxNearbyEntities", 6);
        this.u = $$22.a("RequiredPlayerRange", 16);
        this.v = $$22.a("SpawnRange", 4);
        this.s = null;
    }

    public void a(fns $$0) {
        $$0.a("Delay", (short)this.k);
        $$0.a("MinSpawnDelay", (short)this.p);
        $$0.a("MaxSpawnDelay", (short)this.q);
        $$0.a("SpawnCount", (short)this.r);
        $$0.a("MaxNearbyEntities", (short)this.t);
        $$0.a("RequiredPlayerRange", (short)this.u);
        $$0.a("SpawnRange", (short)this.v);
        $$0.b(b, dxi.b, this.m);
        $$0.a("SpawnPotentials", dxi.c, this.l);
    }

    public @Nullable cgk b(dwo $$0, is $$1) {
        if (this.s == null) {
            uz $$2 = this.a($$0, $$0.G_(), $$1).a();
            if ($$2.i("id").isEmpty()) {
                return null;
            }
            this.s = cgu.a($$2, $$0, cgt.c, cgq.a);
            if ($$2.i() != 1 || this.s instanceof chn) {
                // empty if block
            }
        }
        return this.s;
    }

    public boolean a(dwo $$0, int $$1) {
        if ($$1 == 1) {
            if ($$0.B_()) {
                this.k = this.p;
            }
            return true;
        }
        return false;
    }

    protected void a(@Nullable dwo $$0, is $$1, dxi $$2) {
        this.m = $$2;
    }

    private dxi a(@Nullable dwo $$0, bgr $$1, is $$2) {
        if (this.m != null) {
            return this.m;
        }
        this.a($$0, $$2, this.l.a($$1).orElseGet(dxi::new));
        return this.m;
    }

    public abstract void a(dwo var1, is var2, int var3);

    public double a() {
        return this.n;
    }

    public double b() {
        return this.o;
    }
}

