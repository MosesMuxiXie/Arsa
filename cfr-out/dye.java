/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 */
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Consumer;

public final class dye {
    private static final float h = 0.05f;
    private static final float i = 0.26666668f;
    public static final float a = 0.4f;
    private static final float j = 0.93333334f;
    private static final float k = 0.1f;
    public static final float b = 0.56666666f;
    private static final float l = 0.7666667f;
    public static final float c = -0.11f;
    public static final float d = 0.03f;
    public static final float e = 0.3f;
    public static final float f = -0.78f;
    public static final float g = -0.375f;
    private static final float m = -0.225f;
    private static final float n = 0.9f;
    private final dxx.b o = dxx.b.a(-1.0f, 1.0f);
    private final dxx.b[] p = new dxx.b[]{dxx.b.a(-1.0f, -0.45f), dxx.b.a(-0.45f, -0.15f), dxx.b.a(-0.15f, 0.2f), dxx.b.a(0.2f, 0.55f), dxx.b.a(0.55f, 1.0f)};
    private final dxx.b[] q = new dxx.b[]{dxx.b.a(-1.0f, -0.35f), dxx.b.a(-0.35f, -0.1f), dxx.b.a(-0.1f, 0.1f), dxx.b.a(0.1f, 0.3f), dxx.b.a(0.3f, 1.0f)};
    private final dxx.b[] r = new dxx.b[]{dxx.b.a(-1.0f, -0.78f), dxx.b.a(-0.78f, -0.375f), dxx.b.a(-0.375f, -0.2225f), dxx.b.a(-0.2225f, 0.05f), dxx.b.a(0.05f, 0.45f), dxx.b.a(0.45f, 0.55f), dxx.b.a(0.55f, 1.0f)};
    private final dxx.b s = this.p[0];
    private final dxx.b t = dxx.b.a(this.p[1], this.p[4]);
    private final dxx.b u = dxx.b.a(-1.2f, -1.05f);
    private final dxx.b v = dxx.b.a(-1.05f, -0.455f);
    private final dxx.b w = dxx.b.a(-0.455f, -0.19f);
    private final dxx.b x = dxx.b.a(-0.19f, -0.11f);
    private final dxx.b y = dxx.b.a(-0.11f, 0.55f);
    private final dxx.b z = dxx.b.a(-0.11f, 0.03f);
    private final dxx.b A = dxx.b.a(0.03f, 0.3f);
    private final dxx.b B = dxx.b.a(0.3f, 1.0f);
    private final amt<dxo>[][] C = new amt[][]{{dxv.Y, dxv.W, dxv.U, dxv.S, dxv.Q}, {dxv.X, dxv.V, dxv.T, dxv.R, dxv.Q}};
    private final amt<dxo>[][] D = new amt[][]{{dxv.d, dxv.d, dxv.d, dxv.r, dxv.q}, {dxv.b, dxv.b, dxv.i, dxv.q, dxv.p}, {dxv.j, dxv.b, dxv.i, dxv.k, dxv.l}, {dxv.s, dxv.s, dxv.i, dxv.y, dxv.y}, {dxv.f, dxv.f, dxv.f, dxv.f, dxv.f}};
    private final amt<dxo>[][] E = new amt[][]{{dxv.e, null, dxv.r, null, null}, {null, null, null, null, dxv.o}, {dxv.c, null, null, dxv.n, null}, {null, null, dxv.b, dxv.z, dxv.A}, {null, null, null, null, null}};
    private final amt<dxo>[][] F = new amt[][]{{dxv.d, dxv.d, dxv.d, dxv.r, dxv.r}, {dxv.E, dxv.E, dxv.i, dxv.q, dxv.p}, {dxv.E, dxv.E, dxv.E, dxv.E, dxv.m}, {dxv.t, dxv.t, dxv.i, dxv.i, dxv.y}, {dxv.B, dxv.B, dxv.B, dxv.D, dxv.D}};
    private final amt<dxo>[][] G = new amt[][]{{dxv.e, null, null, null, null}, {dxv.F, null, dxv.E, dxv.E, dxv.o}, {dxv.F, dxv.F, dxv.i, dxv.k, null}, {null, null, null, null, null}, {dxv.C, dxv.C, null, null, null}};
    private final amt<dxo>[][] H = new amt[][]{{dxv.v, dxv.v, dxv.u, dxv.w, dxv.w}, {dxv.v, dxv.v, dxv.u, dxv.w, dxv.w}, {dxv.u, dxv.u, dxv.u, dxv.w, dxv.w}, {null, null, null, null, null}, {null, null, null, null, null}};

    public List<dxx.d> a() {
        dxx.b $$0 = dxx.b.a(0.0f);
        float $$1 = 0.16f;
        return List.of(new dxx.d(this.o, this.o, dxx.b.a(this.y, this.o), this.o, $$0, dxx.b.a(-1.0f, -0.16f), 0L), new dxx.d(this.o, this.o, dxx.b.a(this.y, this.o), this.o, $$0, dxx.b.a(0.16f, 1.0f), 0L));
    }

    protected void a(Consumer<Pair<dxx.d, amt<dxo>>> $$0) {
        if (w.aw) {
            this.b($$0);
            return;
        }
        this.c($$0);
        this.d($$0);
        this.e($$0);
    }

    private void b(Consumer<Pair<dxx.d, amt<dxo>>> $$0) {
        bfe $$10;
        jf.a $$1 = new jt().a(mj.bb, eux::a).a(mj.bm, qv::a).a(jr.a(mi.aR));
        jf.b<euj> $$2 = $$1.e(mj.bb);
        euk.x.a $$3 = new euk.x.a($$2.b(eux.e));
        euk.x.a $$4 = new euk.x.a($$2.b(eux.f));
        euk.x.a $$5 = new euk.x.a($$2.b(eux.h));
        $$0.accept((Pair<dxx.d, amt<dxo>>)Pair.of((Object)dxx.a(this.o, this.o, this.o, this.o, dxx.b.a(0.0f), this.o, 0.01f), dxv.b));
        bfe $$6 = rg.a($$4, $$5, -0.15f, 0.0f, 0.0f, 0.1f, 0.0f, -0.03f, false, false, bes.a);
        if ($$6 instanceof bfe.e) {
            bfe.e $$7 = (bfe.e)$$6;
            amt<dxo> $$8 = dxv.f;
            for (float $$9 : $$7.e()) {
                $$0.accept((Pair<dxx.d, amt<dxo>>)Pair.of((Object)dxx.a(this.o, this.o, this.o, dxx.b.a($$9), dxx.b.a(0.0f), this.o, 0.0f), $$8));
                $$8 = $$8 == dxv.f ? dxv.B : dxv.f;
            }
        }
        if (($$10 = rg.a($$3, $$4, $$5, false)) instanceof bfe.e) {
            bfe.e $$11 = (bfe.e)$$10;
            for (float $$12 : $$11.e()) {
                $$0.accept((Pair<dxx.d, amt<dxo>>)Pair.of((Object)dxx.a(this.o, this.o, dxx.b.a($$12), this.o, dxx.b.a(0.0f), this.o, 0.0f), dxv.r));
            }
        }
    }

    private void c(Consumer<Pair<dxx.d, amt<dxo>>> $$0) {
        this.a($$0, this.o, this.o, this.u, this.o, this.o, 0.0f, dxv.Z);
        for (int $$1 = 0; $$1 < this.p.length; ++$$1) {
            dxx.b $$2 = this.p[$$1];
            this.a($$0, $$2, this.o, this.v, this.o, this.o, 0.0f, this.C[0][$$1]);
            this.a($$0, $$2, this.o, this.w, this.o, this.o, 0.0f, this.C[1][$$1]);
        }
    }

    private void d(Consumer<Pair<dxx.d, amt<dxo>>> $$0) {
        this.c($$0, dxx.b.a(-1.0f, -0.93333334f));
        this.b($$0, dxx.b.a(-0.93333334f, -0.7666667f));
        this.a($$0, dxx.b.a(-0.7666667f, -0.56666666f));
        this.b($$0, dxx.b.a(-0.56666666f, -0.4f));
        this.c($$0, dxx.b.a(-0.4f, -0.26666668f));
        this.d($$0, dxx.b.a(-0.26666668f, -0.05f));
        this.e($$0, dxx.b.a(-0.05f, 0.05f));
        this.d($$0, dxx.b.a(0.05f, 0.26666668f));
        this.c($$0, dxx.b.a(0.26666668f, 0.4f));
        this.b($$0, dxx.b.a(0.4f, 0.56666666f));
        this.a($$0, dxx.b.a(0.56666666f, 0.7666667f));
        this.b($$0, dxx.b.a(0.7666667f, 0.93333334f));
        this.c($$0, dxx.b.a(0.93333334f, 1.0f));
    }

    private void a(Consumer<Pair<dxx.d, amt<dxo>>> $$0, dxx.b $$1) {
        for (int $$2 = 0; $$2 < this.p.length; ++$$2) {
            dxx.b $$3 = this.p[$$2];
            for (int $$4 = 0; $$4 < this.q.length; ++$$4) {
                dxx.b $$5 = this.q[$$4];
                amt<dxo> $$6 = this.a($$2, $$4, $$1);
                amt<dxo> $$7 = this.b($$2, $$4, $$1);
                amt<dxo> $$8 = this.c($$2, $$4, $$1);
                amt<dxo> $$9 = this.e($$2, $$4, $$1);
                amt<dxo> $$10 = this.h($$2, $$4, $$1);
                amt<dxo> $$11 = this.a($$2, $$4, $$1, $$10);
                amt<dxo> $$12 = this.f($$2, $$4, $$1);
                this.a($$0, $$3, $$5, dxx.b.a(this.x, this.B), this.r[0], $$1, 0.0f, $$12);
                this.a($$0, $$3, $$5, dxx.b.a(this.x, this.z), this.r[1], $$1, 0.0f, $$8);
                this.a($$0, $$3, $$5, dxx.b.a(this.A, this.B), this.r[1], $$1, 0.0f, $$12);
                this.a($$0, $$3, $$5, dxx.b.a(this.x, this.z), dxx.b.a(this.r[2], this.r[3]), $$1, 0.0f, $$6);
                this.a($$0, $$3, $$5, dxx.b.a(this.A, this.B), this.r[2], $$1, 0.0f, $$9);
                this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0f, $$7);
                this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0f, $$9);
                this.a($$0, $$3, $$5, dxx.b.a(this.x, this.B), this.r[4], $$1, 0.0f, $$6);
                this.a($$0, $$3, $$5, dxx.b.a(this.x, this.z), this.r[5], $$1, 0.0f, $$11);
                this.a($$0, $$3, $$5, dxx.b.a(this.A, this.B), this.r[5], $$1, 0.0f, $$10);
                this.a($$0, $$3, $$5, dxx.b.a(this.x, this.B), this.r[6], $$1, 0.0f, $$6);
            }
        }
    }

    private void b(Consumer<Pair<dxx.d, amt<dxo>>> $$0, dxx.b $$1) {
        for (int $$2 = 0; $$2 < this.p.length; ++$$2) {
            dxx.b $$3 = this.p[$$2];
            for (int $$4 = 0; $$4 < this.q.length; ++$$4) {
                dxx.b $$5 = this.q[$$4];
                amt<dxo> $$6 = this.a($$2, $$4, $$1);
                amt<dxo> $$7 = this.b($$2, $$4, $$1);
                amt<dxo> $$8 = this.c($$2, $$4, $$1);
                amt<dxo> $$9 = this.e($$2, $$4, $$1);
                amt<dxo> $$10 = this.h($$2, $$4, $$1);
                amt<dxo> $$11 = this.a($$2, $$4, $$1, $$6);
                amt<dxo> $$12 = this.g($$2, $$4, $$1);
                amt<dxo> $$13 = this.f($$2, $$4, $$1);
                this.a($$0, $$3, $$5, this.x, dxx.b.a(this.r[0], this.r[1]), $$1, 0.0f, $$6);
                this.a($$0, $$3, $$5, this.z, this.r[0], $$1, 0.0f, $$12);
                this.a($$0, $$3, $$5, dxx.b.a(this.A, this.B), this.r[0], $$1, 0.0f, $$13);
                this.a($$0, $$3, $$5, this.z, this.r[1], $$1, 0.0f, $$8);
                this.a($$0, $$3, $$5, dxx.b.a(this.A, this.B), this.r[1], $$1, 0.0f, $$12);
                this.a($$0, $$3, $$5, dxx.b.a(this.x, this.z), dxx.b.a(this.r[2], this.r[3]), $$1, 0.0f, $$6);
                this.a($$0, $$3, $$5, dxx.b.a(this.A, this.B), this.r[2], $$1, 0.0f, $$9);
                this.a($$0, $$3, $$5, this.A, this.r[3], $$1, 0.0f, $$7);
                this.a($$0, $$3, $$5, this.B, this.r[3], $$1, 0.0f, $$9);
                this.a($$0, $$3, $$5, dxx.b.a(this.x, this.B), this.r[4], $$1, 0.0f, $$6);
                this.a($$0, $$3, $$5, dxx.b.a(this.x, this.z), this.r[5], $$1, 0.0f, $$11);
                this.a($$0, $$3, $$5, dxx.b.a(this.A, this.B), this.r[5], $$1, 0.0f, $$10);
                this.a($$0, $$3, $$5, dxx.b.a(this.x, this.B), this.r[6], $$1, 0.0f, $$6);
            }
        }
    }

    private void c(Consumer<Pair<dxx.d, amt<dxo>>> $$0, dxx.b $$1) {
        this.a($$0, this.o, this.o, this.x, dxx.b.a(this.r[0], this.r[2]), $$1, 0.0f, dxv.P);
        this.a($$0, dxx.b.a(this.p[1], this.p[2]), this.o, dxx.b.a(this.z, this.B), this.r[6], $$1, 0.0f, dxv.g);
        this.a($$0, dxx.b.a(this.p[3], this.p[4]), this.o, dxx.b.a(this.z, this.B), this.r[6], $$1, 0.0f, dxv.h);
        for (int $$2 = 0; $$2 < this.p.length; ++$$2) {
            dxx.b $$3 = this.p[$$2];
            for (int $$4 = 0; $$4 < this.q.length; ++$$4) {
                dxx.b $$5 = this.q[$$4];
                amt<dxo> $$6 = this.a($$2, $$4, $$1);
                amt<dxo> $$7 = this.b($$2, $$4, $$1);
                amt<dxo> $$8 = this.c($$2, $$4, $$1);
                amt<dxo> $$9 = this.h($$2, $$4, $$1);
                amt<dxo> $$10 = this.e($$2, $$4, $$1);
                amt<dxo> $$11 = this.a($$2, $$4);
                amt<dxo> $$12 = this.a($$2, $$4, $$1, $$6);
                amt<dxo> $$13 = this.d($$2, $$4, $$1);
                amt<dxo> $$14 = this.g($$2, $$4, $$1);
                this.a($$0, $$3, $$5, dxx.b.a(this.z, this.B), this.r[0], $$1, 0.0f, $$14);
                this.a($$0, $$3, $$5, dxx.b.a(this.z, this.A), this.r[1], $$1, 0.0f, $$8);
                this.a($$0, $$3, $$5, this.B, this.r[1], $$1, 0.0f, $$2 == 0 ? $$14 : $$10);
                this.a($$0, $$3, $$5, this.z, this.r[2], $$1, 0.0f, $$6);
                this.a($$0, $$3, $$5, this.A, this.r[2], $$1, 0.0f, $$7);
                this.a($$0, $$3, $$5, this.B, this.r[2], $$1, 0.0f, $$10);
                this.a($$0, $$3, $$5, dxx.b.a(this.x, this.z), this.r[3], $$1, 0.0f, $$6);
                this.a($$0, $$3, $$5, dxx.b.a(this.A, this.B), this.r[3], $$1, 0.0f, $$7);
                if ($$1.b() < 0L) {
                    this.a($$0, $$3, $$5, this.x, this.r[4], $$1, 0.0f, $$11);
                    this.a($$0, $$3, $$5, dxx.b.a(this.z, this.B), this.r[4], $$1, 0.0f, $$6);
                } else {
                    this.a($$0, $$3, $$5, dxx.b.a(this.x, this.B), this.r[4], $$1, 0.0f, $$6);
                }
                this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0f, $$13);
                this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0f, $$12);
                this.a($$0, $$3, $$5, dxx.b.a(this.A, this.B), this.r[5], $$1, 0.0f, $$9);
                if ($$1.b() < 0L) {
                    this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0f, $$11);
                } else {
                    this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0f, $$6);
                }
                if ($$2 != 0) continue;
                this.a($$0, $$3, $$5, dxx.b.a(this.z, this.B), this.r[6], $$1, 0.0f, $$6);
            }
        }
    }

    private void d(Consumer<Pair<dxx.d, amt<dxo>>> $$0, dxx.b $$1) {
        this.a($$0, this.o, this.o, this.x, dxx.b.a(this.r[0], this.r[2]), $$1, 0.0f, dxv.P);
        this.a($$0, dxx.b.a(this.p[1], this.p[2]), this.o, dxx.b.a(this.z, this.B), this.r[6], $$1, 0.0f, dxv.g);
        this.a($$0, dxx.b.a(this.p[3], this.p[4]), this.o, dxx.b.a(this.z, this.B), this.r[6], $$1, 0.0f, dxv.h);
        for (int $$2 = 0; $$2 < this.p.length; ++$$2) {
            dxx.b $$3 = this.p[$$2];
            for (int $$4 = 0; $$4 < this.q.length; ++$$4) {
                dxx.b $$5 = this.q[$$4];
                amt<dxo> $$6 = this.a($$2, $$4, $$1);
                amt<dxo> $$7 = this.b($$2, $$4, $$1);
                amt<dxo> $$8 = this.c($$2, $$4, $$1);
                amt<dxo> $$9 = this.a($$2, $$4);
                amt<dxo> $$10 = this.a($$2, $$4, $$1, $$6);
                amt<dxo> $$11 = this.d($$2, $$4, $$1);
                this.a($$0, $$3, $$5, this.z, dxx.b.a(this.r[0], this.r[1]), $$1, 0.0f, $$7);
                this.a($$0, $$3, $$5, dxx.b.a(this.A, this.B), dxx.b.a(this.r[0], this.r[1]), $$1, 0.0f, $$8);
                this.a($$0, $$3, $$5, this.z, dxx.b.a(this.r[2], this.r[3]), $$1, 0.0f, $$6);
                this.a($$0, $$3, $$5, dxx.b.a(this.A, this.B), dxx.b.a(this.r[2], this.r[3]), $$1, 0.0f, $$7);
                this.a($$0, $$3, $$5, this.x, dxx.b.a(this.r[3], this.r[4]), $$1, 0.0f, $$9);
                this.a($$0, $$3, $$5, dxx.b.a(this.z, this.B), this.r[4], $$1, 0.0f, $$6);
                this.a($$0, $$3, $$5, this.x, this.r[5], $$1, 0.0f, $$11);
                this.a($$0, $$3, $$5, this.z, this.r[5], $$1, 0.0f, $$10);
                this.a($$0, $$3, $$5, dxx.b.a(this.A, this.B), this.r[5], $$1, 0.0f, $$6);
                this.a($$0, $$3, $$5, this.x, this.r[6], $$1, 0.0f, $$9);
                if ($$2 != 0) continue;
                this.a($$0, $$3, $$5, dxx.b.a(this.z, this.B), this.r[6], $$1, 0.0f, $$6);
            }
        }
    }

    private void e(Consumer<Pair<dxx.d, amt<dxo>>> $$0, dxx.b $$1) {
        this.a($$0, this.s, this.o, this.x, dxx.b.a(this.r[0], this.r[1]), $$1, 0.0f, $$1.b() < 0L ? dxv.P : dxv.M);
        this.a($$0, this.t, this.o, this.x, dxx.b.a(this.r[0], this.r[1]), $$1, 0.0f, $$1.b() < 0L ? dxv.P : dxv.L);
        this.a($$0, this.s, this.o, this.z, dxx.b.a(this.r[0], this.r[1]), $$1, 0.0f, dxv.M);
        this.a($$0, this.t, this.o, this.z, dxx.b.a(this.r[0], this.r[1]), $$1, 0.0f, dxv.L);
        this.a($$0, this.s, this.o, dxx.b.a(this.x, this.B), dxx.b.a(this.r[2], this.r[5]), $$1, 0.0f, dxv.M);
        this.a($$0, this.t, this.o, dxx.b.a(this.x, this.B), dxx.b.a(this.r[2], this.r[5]), $$1, 0.0f, dxv.L);
        this.a($$0, this.s, this.o, this.x, this.r[6], $$1, 0.0f, dxv.M);
        this.a($$0, this.t, this.o, this.x, this.r[6], $$1, 0.0f, dxv.L);
        this.a($$0, dxx.b.a(this.p[1], this.p[2]), this.o, dxx.b.a(this.y, this.B), this.r[6], $$1, 0.0f, dxv.g);
        this.a($$0, dxx.b.a(this.p[3], this.p[4]), this.o, dxx.b.a(this.y, this.B), this.r[6], $$1, 0.0f, dxv.h);
        this.a($$0, this.s, this.o, dxx.b.a(this.y, this.B), this.r[6], $$1, 0.0f, dxv.M);
        for (int $$2 = 0; $$2 < this.p.length; ++$$2) {
            dxx.b $$3 = this.p[$$2];
            for (int $$4 = 0; $$4 < this.q.length; ++$$4) {
                dxx.b $$5 = this.q[$$4];
                amt<dxo> $$6 = this.b($$2, $$4, $$1);
                this.a($$0, $$3, $$5, dxx.b.a(this.A, this.B), dxx.b.a(this.r[0], this.r[1]), $$1, 0.0f, $$6);
            }
        }
    }

    private void e(Consumer<Pair<dxx.d, amt<dxo>>> $$0) {
        this.b($$0, this.o, this.o, dxx.b.a(0.8f, 1.0f), this.o, this.o, 0.0f, dxv.aa);
        this.b($$0, this.o, dxx.b.a(0.7f, 1.0f), this.o, this.o, this.o, 0.0f, dxv.ab);
        this.c($$0, this.o, this.o, this.o, dxx.b.a(this.r[0], this.r[1]), this.o, 0.0f, dxv.ac);
    }

    private amt<dxo> a(int $$0, int $$1, dxx.b $$2) {
        if ($$2.b() < 0L) {
            return this.D[$$0][$$1];
        }
        amt<dxo> $$3 = this.E[$$0][$$1];
        return $$3 == null ? this.D[$$0][$$1] : $$3;
    }

    private amt<dxo> b(int $$0, int $$1, dxx.b $$2) {
        return $$0 == 4 ? this.a($$1, $$2) : this.a($$0, $$1, $$2);
    }

    private amt<dxo> c(int $$0, int $$1, dxx.b $$2) {
        return $$0 == 0 ? this.g($$0, $$1, $$2) : this.b($$0, $$1, $$2);
    }

    private amt<dxo> a(int $$0, int $$1, dxx.b $$2, amt<dxo> $$3) {
        if ($$0 > 1 && $$1 < 4 && $$2.b() >= 0L) {
            return dxv.x;
        }
        return $$3;
    }

    private amt<dxo> d(int $$0, int $$1, dxx.b $$2) {
        amt<dxo> $$3 = $$2.b() >= 0L ? this.a($$0, $$1, $$2) : this.a($$0, $$1);
        return this.a($$0, $$1, $$2, $$3);
    }

    private amt<dxo> a(int $$0, int $$1) {
        if ($$0 == 0) {
            return dxv.O;
        }
        if ($$0 == 4) {
            return dxv.f;
        }
        return dxv.N;
    }

    private amt<dxo> a(int $$0, dxx.b $$1) {
        if ($$0 < 2) {
            return $$1.b() < 0L ? dxv.B : dxv.C;
        }
        if ($$0 < 3) {
            return dxv.B;
        }
        return dxv.D;
    }

    private amt<dxo> e(int $$0, int $$1, dxx.b $$2) {
        amt<dxo> $$3;
        if ($$2.b() >= 0L && ($$3 = this.G[$$0][$$1]) != null) {
            return $$3;
        }
        return this.F[$$0][$$1];
    }

    private amt<dxo> f(int $$0, int $$1, dxx.b $$2) {
        if ($$0 <= 2) {
            return $$2.b() < 0L ? dxv.J : dxv.I;
        }
        if ($$0 == 3) {
            return dxv.K;
        }
        return this.a($$1, $$2);
    }

    private amt<dxo> g(int $$0, int $$1, dxx.b $$2) {
        if ($$0 >= 3) {
            return this.e($$0, $$1, $$2);
        }
        if ($$1 <= 1) {
            return dxv.H;
        }
        return dxv.G;
    }

    private amt<dxo> h(int $$0, int $$1, dxx.b $$2) {
        amt<dxo> $$3 = this.H[$$0][$$1];
        return $$3 == null ? this.a($$0, $$1, $$2) : $$3;
    }

    private void a(Consumer<Pair<dxx.d, amt<dxo>>> $$0, dxx.b $$1, dxx.b $$2, dxx.b $$3, dxx.b $$4, dxx.b $$5, float $$6, amt<dxo> $$7) {
        $$0.accept((Pair<dxx.d, amt<dxo>>)Pair.of((Object)dxx.a($$1, $$2, $$3, $$4, dxx.b.a(0.0f), $$5, $$6), $$7));
        $$0.accept((Pair<dxx.d, amt<dxo>>)Pair.of((Object)dxx.a($$1, $$2, $$3, $$4, dxx.b.a(1.0f), $$5, $$6), $$7));
    }

    private void b(Consumer<Pair<dxx.d, amt<dxo>>> $$0, dxx.b $$1, dxx.b $$2, dxx.b $$3, dxx.b $$4, dxx.b $$5, float $$6, amt<dxo> $$7) {
        $$0.accept((Pair<dxx.d, amt<dxo>>)Pair.of((Object)dxx.a($$1, $$2, $$3, $$4, dxx.b.a(0.2f, 0.9f), $$5, $$6), $$7));
    }

    private void c(Consumer<Pair<dxx.d, amt<dxo>>> $$0, dxx.b $$1, dxx.b $$2, dxx.b $$3, dxx.b $$4, dxx.b $$5, float $$6, amt<dxo> $$7) {
        $$0.accept((Pair<dxx.d, amt<dxo>>)Pair.of((Object)dxx.a($$1, $$2, $$3, $$4, dxx.b.a(1.1f), $$5, $$6), $$7));
    }

    public static boolean a(euj $$0, euj $$1, euj.b $$2) {
        return $$0.a($$2) < (double)-0.225f && $$1.a($$2) > (double)0.9f;
    }

    public static String a(double $$0) {
        if ($$0 < (double)eux.a(0.05f)) {
            return "Valley";
        }
        if ($$0 < (double)eux.a(0.26666668f)) {
            return "Low";
        }
        if ($$0 < (double)eux.a(0.4f)) {
            return "Mid";
        }
        if ($$0 < (double)eux.a(0.56666666f)) {
            return "High";
        }
        return "Peak";
    }

    public String b(double $$0) {
        double $$1 = dxx.a((float)$$0);
        if ($$1 < (double)this.u.b()) {
            return "Mushroom fields";
        }
        if ($$1 < (double)this.v.b()) {
            return "Deep ocean";
        }
        if ($$1 < (double)this.w.b()) {
            return "Ocean";
        }
        if ($$1 < (double)this.x.b()) {
            return "Coast";
        }
        if ($$1 < (double)this.z.b()) {
            return "Near inland";
        }
        if ($$1 < (double)this.A.b()) {
            return "Mid inland";
        }
        return "Far inland";
    }

    public String c(double $$0) {
        return dye.a($$0, this.r);
    }

    public String d(double $$0) {
        return dye.a($$0, this.p);
    }

    public String e(double $$0) {
        return dye.a($$0, this.q);
    }

    private static String a(double $$0, dxx.b[] $$1) {
        double $$2 = dxx.a((float)$$0);
        for (int $$3 = 0; $$3 < $$1.length; ++$$3) {
            if (!($$2 < (double)$$1[$$3].b())) continue;
            return "" + $$3;
        }
        return "?";
    }

    @bht
    public dxx.b[] b() {
        return this.p;
    }

    @bht
    public dxx.b[] c() {
        return this.q;
    }

    @bht
    public dxx.b[] d() {
        return this.r;
    }

    @bht
    public dxx.b[] e() {
        return new dxx.b[]{this.u, this.v, this.w, this.x, this.z, this.A, this.B};
    }

    @bht
    public dxx.b[] f() {
        return new dxx.b[]{dxx.b.a(-2.0f, eux.a(0.05f)), dxx.b.a(eux.a(0.05f), eux.a(0.26666668f)), dxx.b.a(eux.a(0.26666668f), eux.a(0.4f)), dxx.b.a(eux.a(0.4f), eux.a(0.56666666f)), dxx.b.a(eux.a(0.56666666f), 2.0f)};
    }

    @bht
    public dxx.b[] g() {
        return new dxx.b[]{dxx.b.a(-2.0f, 0.0f), dxx.b.a(0.0f, 2.0f)};
    }
}

