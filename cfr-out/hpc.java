/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Quaternionfc
 *  org.jspecify.annotations.Nullable
 */
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionfc;
import org.jspecify.annotations.Nullable;

public class hpc {
    private static final amo b = amo.b("textures/misc/underwater.png");
    private final gfj c;
    private final inu d;
    private final hon e;
    public static final int a = 40;
    private @Nullable dlt f;
    private int g;
    private float h;
    private float i;

    public hpc(gfj $$0, inu $$1, hon $$2) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
    }

    public void a() {
        if (this.g > 0) {
            --this.g;
            if (this.g == 0) {
                this.f = null;
            }
        }
    }

    public void a(boolean $$0, float $$1, hpo $$2) {
        fzm $$3 = new fzm();
        hnh $$4 = this.c.s;
        if (this.c.k.aV().a() && !$$0) {
            eoh $$5;
            if (!$$4.ar && ($$5 = hpc.a($$4)) != null) {
                hpc.a(this.c.ax().a().a($$5), $$3, this.e);
            }
            if (!this.c.s.au()) {
                if (((cgk)this.c.s).a(bdv.a)) {
                    hpc.a(this.c, $$3, this.e);
                }
                if (this.c.s.cp()) {
                    ilp $$6 = this.d.a(inx.b);
                    hpc.a($$3, this.e, $$6);
                }
            }
        }
        if (!this.c.k.au) {
            this.a($$3, $$1, $$2);
        }
    }

    private void a(fzm $$0, float $$1, hpo $$2) {
        if (this.f == null || this.g <= 0) {
            return;
        }
        int $$3 = 40 - this.g;
        float $$4 = ((float)$$3 + $$1) / 40.0f;
        float $$5 = $$4 * $$4;
        float $$6 = $$4 * $$5;
        float $$7 = 10.25f * $$6 * $$5 - 24.95f * $$5 * $$5 + 25.5f * $$6 - 13.8f * $$5 + 4.0f * $$4;
        float $$8 = $$7 * (float)Math.PI;
        float $$9 = (float)this.c.aR().k() / (float)this.c.aR().l();
        float $$10 = this.h * 0.3f * $$9;
        float $$11 = this.i * 0.3f;
        $$0.a();
        $$0.a($$10 * bgj.c(bgj.a((double)($$8 * 2.0f))), $$11 * bgj.c(bgj.a((double)($$8 * 2.0f))), -10.0f + 9.0f * bgj.a((double)$$8));
        float $$12 = 0.8f;
        $$0.b(0.8f, 0.8f, 0.8f);
        $$0.a((Quaternionfc)a.d.rotationDegrees(900.0f * bgj.c(bgj.a((double)$$8))));
        $$0.a((Quaternionfc)a.b.rotationDegrees(6.0f * bgj.b((double)($$4 * 8.0f))));
        $$0.a((Quaternionfc)a.f.rotationDegrees(6.0f * bgj.b((double)($$4 * 8.0f))));
        this.c.i.t().a(fyd.a.c);
        ihm $$13 = new ihm();
        this.c.bh().a($$13, this.f, dlr.i, this.c.r, null, 0);
        $$13.a($$0, $$2, 0xF000F0, ilg.d, 0);
        $$0.b();
    }

    public void b() {
        this.f = null;
    }

    public void a(dlt $$0, bgr $$1) {
        this.f = $$0;
        this.g = 40;
        this.h = $$1.i() * 2.0f - 1.0f;
        this.i = $$1.i() * 2.0f - 1.0f;
    }

    private static @Nullable eoh a(ddm $$0) {
        is.a $$1 = new is.a();
        for (int $$2 = 0; $$2 < 8; ++$$2) {
            double $$3 = $$0.dP() + (double)(((float)(($$2 >> 0) % 2) - 0.5f) * $$0.dF() * 0.8f);
            double $$4 = $$0.dT() + (double)(((float)(($$2 >> 1) % 2) - 0.5f) * 0.1f * $$0.eF());
            double $$5 = $$0.dV() + (double)(((float)(($$2 >> 2) % 2) - 0.5f) * $$0.dF() * 0.8f);
            $$1.b($$3, $$4, $$5);
            eoh $$6 = $$0.ao().a_($$1);
            if ($$6.o() == egf.a || !$$6.k($$0.ao(), $$1)) continue;
            return $$6;
        }
        return null;
    }

    private static void a(ilp $$0, fzm $$1, hon $$2) {
        float $$3 = 0.1f;
        int $$4 = bel.a(1.0f, 0.1f, 0.1f, 0.1f);
        float $$5 = -1.0f;
        float $$6 = 1.0f;
        float $$7 = -1.0f;
        float $$8 = 1.0f;
        float $$9 = -0.5f;
        float $$10 = $$0.c();
        float $$11 = $$0.d();
        float $$12 = $$0.f();
        float $$13 = $$0.g();
        Matrix4f $$14 = $$1.c().a();
        fzp $$15 = $$2.a(ijt.A($$0.h()));
        $$15.a((Matrix4fc)$$14, -1.0f, -1.0f, -0.5f).a($$11, $$13).a($$4);
        $$15.a((Matrix4fc)$$14, 1.0f, -1.0f, -0.5f).a($$10, $$13).a($$4);
        $$15.a((Matrix4fc)$$14, 1.0f, 1.0f, -0.5f).a($$10, $$12).a($$4);
        $$15.a((Matrix4fc)$$14, -1.0f, 1.0f, -0.5f).a($$11, $$12).a($$4);
    }

    private static void a(gfj $$0, fzm $$1, hon $$2) {
        is $$3 = is.a($$0.s.dP(), $$0.s.dT(), $$0.s.dV());
        float $$4 = hoj.a($$0.s.ao().F_(), $$0.s.ao().G($$3));
        int $$5 = bel.a(0.1f, $$4, $$4, $$4);
        float $$6 = 4.0f;
        float $$7 = -1.0f;
        float $$8 = 1.0f;
        float $$9 = -1.0f;
        float $$10 = 1.0f;
        float $$11 = -0.5f;
        float $$12 = -$$0.s.ec() / 64.0f;
        float $$13 = $$0.s.ee() / 64.0f;
        Matrix4f $$14 = $$1.c().a();
        fzp $$15 = $$2.a(ijt.A(b));
        $$15.a((Matrix4fc)$$14, -1.0f, -1.0f, -0.5f).a(4.0f + $$12, 4.0f + $$13).a($$5);
        $$15.a((Matrix4fc)$$14, 1.0f, -1.0f, -0.5f).a(0.0f + $$12, 4.0f + $$13).a($$5);
        $$15.a((Matrix4fc)$$14, 1.0f, 1.0f, -0.5f).a(0.0f + $$12, 0.0f + $$13).a($$5);
        $$15.a((Matrix4fc)$$14, -1.0f, 1.0f, -0.5f).a(4.0f + $$12, 0.0f + $$13).a($$5);
    }

    private static void a(fzm $$0, hon $$1, ilp $$2) {
        fzp $$3 = $$1.a(ijt.B($$2.h()));
        float $$4 = $$2.c();
        float $$5 = $$2.d();
        float $$6 = $$2.f();
        float $$7 = $$2.g();
        float $$8 = 1.0f;
        for (int $$9 = 0; $$9 < 2; ++$$9) {
            $$0.a();
            float $$10 = -0.5f;
            float $$11 = 0.5f;
            float $$12 = -0.5f;
            float $$13 = 0.5f;
            float $$14 = -0.5f;
            $$0.a((float)(-($$9 * 2 - 1)) * 0.24f, -0.3f, 0.0f);
            $$0.a((Quaternionfc)a.d.rotationDegrees((float)($$9 * 2 - 1) * 10.0f));
            Matrix4f $$15 = $$0.c().a();
            $$3.a((Matrix4fc)$$15, -0.5f, -0.5f, -0.5f).a($$5, $$7).a(1.0f, 1.0f, 1.0f, 0.9f);
            $$3.a((Matrix4fc)$$15, 0.5f, -0.5f, -0.5f).a($$4, $$7).a(1.0f, 1.0f, 1.0f, 0.9f);
            $$3.a((Matrix4fc)$$15, 0.5f, 0.5f, -0.5f).a($$4, $$6).a(1.0f, 1.0f, 1.0f, 0.9f);
            $$3.a((Matrix4fc)$$15, -0.5f, 0.5f, -0.5f).a($$5, $$6).a(1.0f, 1.0f, 1.0f, 0.9f);
            $$0.b();
        }
    }
}

