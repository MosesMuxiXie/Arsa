/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
import java.util.Arrays;
import java.util.List;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public class ger
implements fvr.b {
    private static final float a = 4.0f;
    private static final Vector3f b = new Vector3f(0.0f, 0.0f, -1.0f);
    private static final Vector3f c = new Vector3f(0.0f, 1.0f, 0.0f);
    private static final Vector3f d = new Vector3f(-1.0f, 0.0f, 0.0f);
    private boolean e;
    private dwo f;
    private cgk g;
    private ftm h = ftm.c;
    private final is.a i = new is.a();
    private final Vector3f j = new Vector3f((Vector3fc)b);
    private final Vector3f k = new Vector3f((Vector3fc)c);
    private final Vector3f l = new Vector3f((Vector3fc)d);
    private float m;
    private float n;
    private final Quaternionf o = new Quaternionf();
    private boolean p;
    private float q;
    private float r;
    private float s;
    private final ced t = new ced();

    public void a(dwo $$0, cgk $$1, boolean $$2, boolean $$3, float $$4) {
        dgs $$6;
        dgk $$5;
        Object object;
        this.e = true;
        this.f = $$0;
        this.g = $$1;
        this.p = $$2;
        this.s = $$4;
        if ($$1.cq() && (object = $$1.dz()) instanceof dgk && (object = ($$5 = (dgk)object).q()) instanceof dgs && ($$6 = (dgs)object).o()) {
            ftm $$7 = $$5.n($$1).d($$5.dI()).d($$1.m($$5)).e(new ftm(0.0, bgj.h($$4, this.r, this.q), 0.0));
            this.a($$1.j($$4), $$1.i($$4));
            this.a($$6.e($$4).e($$7));
        } else {
            this.a($$1.j($$4), $$1.i($$4));
            this.a(bgj.d((double)$$4, $$1.Y, $$1.dP()), bgj.d((double)$$4, $$1.Z, $$1.dR()) + (double)bgj.h($$4, this.r, this.q), bgj.d((double)$$4, $$1.aa, $$1.dV()));
        }
        if ($$2) {
            cgk cgk2;
            if ($$3) {
                this.a(this.n + 180.0f, -this.m);
            }
            float $$8 = 4.0f;
            float $$9 = 1.0f;
            if ($$1 instanceof chl) {
                chl $$10 = (chl)$$1;
                $$9 = $$10.eF();
                $$8 = (float)$$10.i(cis.j);
            }
            float $$11 = $$9;
            float $$12 = $$8;
            if ($$1.cq() && (cgk2 = $$1.dz()) instanceof chl) {
                chl $$13 = (chl)cgk2;
                $$11 = $$13.eF();
                $$12 = (float)$$13.i(cis.j);
            }
            this.a(-this.a(Math.max($$9 * $$8, $$11 * $$12)), 0.0f, 0.0f);
        } else if ($$1 instanceof chl && ((chl)$$1).gr()) {
            iz $$14 = ((chl)$$1).gt();
            this.a($$14 != null ? $$14.p() - 180.0f : 0.0f, 0.0f);
            this.a(0.0f, 0.3f, 0.0f);
        }
    }

    public void c() {
        if (this.g != null) {
            this.r = this.q;
            this.q += (this.g.dk() - this.q) * 0.5f;
            this.t.a(this.f, this.h);
        }
    }

    private float a(float $$0) {
        float $$1 = 0.1f;
        for (int $$2 = 0; $$2 < 8; ++$$2) {
            float $$9;
            ftm $$7;
            float $$3 = ($$2 & 1) * 2 - 1;
            float $$4 = ($$2 >> 1 & 1) * 2 - 1;
            float $$5 = ($$2 >> 2 & 1) * 2 - 1;
            ftm $$6 = this.h.b($$3 * 0.1f, $$4 * 0.1f, $$5 * 0.1f);
            fti $$8 = this.f.a(new dvw($$6, $$7 = $$6.e(new ftm((Vector3fc)this.j).c((double)(-$$0))), dvw.a.c, dvw.b.a, this.g));
            if (((ftk)$$8).d() == ftk.a.a || !(($$9 = (float)$$8.g().g(this.h)) < bgj.j($$0))) continue;
            $$0 = bgj.a($$9);
        }
        return $$0;
    }

    protected void a(float $$0, float $$1, float $$2) {
        Vector3f $$3 = new Vector3f($$2, $$1, -$$0).rotate((Quaternionfc)this.o);
        this.a(new ftm(this.h.g + (double)$$3.x, this.h.h + (double)$$3.y, this.h.i + (double)$$3.z));
    }

    protected void a(float $$0, float $$1) {
        this.m = $$1;
        this.n = $$0;
        this.o.rotationYXZ((float)Math.PI - $$0 * ((float)Math.PI / 180), -$$1 * ((float)Math.PI / 180), 0.0f);
        b.rotate((Quaternionfc)this.o, this.j);
        c.rotate((Quaternionfc)this.o, this.k);
        d.rotate((Quaternionfc)this.o, this.l);
    }

    protected void a(double $$0, double $$1, double $$2) {
        this.a(new ftm($$0, $$1, $$2));
    }

    protected void a(ftm $$0) {
        this.h = $$0;
        this.i.b($$0.g, $$0.h, $$0.i);
    }

    @Override
    public ftm b() {
        return this.h;
    }

    public is d() {
        return this.i;
    }

    public float e() {
        return this.m;
    }

    public float f() {
        return this.n;
    }

    @Override
    public float a() {
        return bgj.f(this.f());
    }

    public Quaternionf g() {
        return this.o;
    }

    public cgk h() {
        return this.g;
    }

    public boolean i() {
        return this.e;
    }

    public boolean j() {
        return this.p;
    }

    public ced k() {
        return this.t;
    }

    public a l() {
        gfj $$0 = gfj.V();
        double $$1 = (double)$$0.aR().k() / (double)$$0.aR().l();
        double $$2 = Math.tan((double)((float)$$0.k.az().b().intValue() * ((float)Math.PI / 180)) / 2.0) * (double)0.05f;
        double $$3 = $$2 * $$1;
        ftm $$4 = new ftm((Vector3fc)this.j).c((double)0.05f);
        ftm $$5 = new ftm((Vector3fc)this.l).c($$3);
        ftm $$6 = new ftm((Vector3fc)this.k).c($$2);
        return new a($$4, $$5, $$6);
    }

    public fld m() {
        if (!this.e) {
            return fld.e;
        }
        flb $$0 = this.f.b_(this.i);
        if ($$0.a(bdv.a) && this.h.h < (double)((float)this.i.v() + $$0.a(this.f, this.i))) {
            return fld.b;
        }
        a $$1 = this.l();
        List<ftm> $$2 = Arrays.asList($$1.a, $$1.a(), $$1.b(), $$1.c(), $$1.d());
        for (ftm $$3 : $$2) {
            ftm $$4 = this.h.e($$3);
            is $$5 = is.a($$4);
            flb $$6 = this.f.b_($$5);
            if ($$6.a(bdv.b)) {
                if (!($$4.h <= (double)($$6.a(this.f, $$5) + (float)$$5.v()))) continue;
                return fld.a;
            }
            eoh $$7 = this.f.a_($$5);
            if (!$$7.a(dzs.rP)) continue;
            return fld.c;
        }
        return fld.e;
    }

    public Vector3fc n() {
        return this.j;
    }

    public Vector3fc o() {
        return this.k;
    }

    public Vector3fc p() {
        return this.l;
    }

    public void q() {
        this.f = null;
        this.g = null;
        this.t.a();
        this.e = false;
    }

    public float r() {
        return this.s;
    }

    public static class a {
        final ftm a;
        private final ftm b;
        private final ftm c;

        a(ftm $$0, ftm $$1, ftm $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        public ftm a() {
            return this.a.e(this.c).e(this.b);
        }

        public ftm b() {
            return this.a.e(this.c).d(this.b);
        }

        public ftm c() {
            return this.a.d(this.c).e(this.b);
        }

        public ftm d() {
            return this.a.d(this.c).d(this.b);
        }

        public ftm a(float $$0, float $$1) {
            return this.a.e(this.c.c((double)$$1)).d(this.b.c((double)$$0));
        }
    }
}

