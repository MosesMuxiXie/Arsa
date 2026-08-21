/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.List;

public class eob
extends elb {
    private static final int b = 2;
    private static final double c = 0.01;
    public static final double a = 0.51;
    private static final eoh d = dzs.a.m();
    private static final float e = 0.0f;
    private static final boolean f = false;
    private static final boolean g = false;
    private eoh h = d;
    private iz i;
    private boolean j = false;
    private boolean k = false;
    private static final ThreadLocal<iz> l = ThreadLocal.withInitial(() -> null);
    private float m = 0.0f;
    private float q = 0.0f;
    private long r;
    private int s;

    public eob(is $$0, eoh $$1) {
        super(eld.l, $$0, $$1);
    }

    public eob(is $$0, eoh $$1, eoh $$2, iz $$3, boolean $$4, boolean $$5) {
        this($$0, $$1);
        this.h = $$2;
        this.i = $$3;
        this.j = $$4;
        this.k = $$5;
    }

    @Override
    public uz a(jf.a $$0) {
        return this.d($$0);
    }

    public boolean a() {
        return this.j;
    }

    public iz c() {
        return this.i;
    }

    public boolean d() {
        return this.k;
    }

    public float a(float $$0) {
        if ($$0 > 1.0f) {
            $$0 = 1.0f;
        }
        return bgj.h($$0, this.q, this.m);
    }

    public float b(float $$0) {
        return (float)this.i.j() * this.e(this.a($$0));
    }

    public float c(float $$0) {
        return (float)this.i.k() * this.e(this.a($$0));
    }

    public float d(float $$0) {
        return (float)this.i.l() * this.e(this.a($$0));
    }

    private float e(float $$0) {
        return this.j ? $$0 - 1.0f : 1.0f - $$0;
    }

    private eoh w() {
        if (!this.a() && this.d() && this.h.b() instanceof eny) {
            return (eoh)((eoh)((eoh)dzs.bJ.m().b(enz.d, this.m > 0.25f)).b(enz.c, this.h.a(dzs.by) ? epj.b : epj.a)).b(enz.a, (iz)this.h.c(eny.a));
        }
        return this.h;
    }

    private static void a(dwo $$0, is $$1, float $$2, eob $$3) {
        iz $$4 = $$3.f();
        double $$5 = $$2 - $$3.m;
        fug $$6 = $$3.w().g($$0, $$1);
        if ($$6.c()) {
            return;
        }
        fth $$7 = eob.a($$1, $$6.a(), $$3);
        List<cgk> $$8 = $$0.a_(null, eoa.a($$7, $$4, $$5).b($$7));
        if ($$8.isEmpty()) {
            return;
        }
        List<fth> $$9 = $$6.e();
        boolean $$10 = $$3.h.a(dzs.iN);
        for (cgk $$11 : $$8) {
            fth $$19;
            fth $$17;
            fth $$18;
            if ($$11.n_() == flg.d) continue;
            if ($$10) {
                if ($$11 instanceof axg) continue;
                ftm $$12 = $$11.dN();
                double $$13 = $$12.g;
                double $$14 = $$12.h;
                double $$15 = $$12.i;
                switch ($$4.o()) {
                    case a: {
                        $$13 = $$4.j();
                        break;
                    }
                    case b: {
                        $$14 = $$4.k();
                        break;
                    }
                    case c: {
                        $$15 = $$4.l();
                    }
                }
                $$11.m($$13, $$14, $$15);
            }
            double $$16 = 0.0;
            Iterator<fth> iterator = $$9.iterator();
            while (!(!iterator.hasNext() || ($$18 = eoa.a(eob.a($$1, $$17 = iterator.next(), $$3), $$4, $$5)).c($$19 = $$11.dj()) && ($$16 = Math.max($$16, eob.a($$18, $$4, $$19))) >= $$5)) {
            }
            if ($$16 <= 0.0) continue;
            $$16 = Math.min($$16, $$5) + 0.01;
            eob.a($$4, $$11, $$16, $$4);
            if ($$3.j || !$$3.k) continue;
            eob.a($$1, $$11, $$4, $$5);
        }
    }

    private static void a(iz $$0, cgk $$1, double $$2, iz $$3) {
        l.set($$0);
        ftm $$4 = $$1.dI();
        $$1.a(chp.c, new ftm($$2 * (double)$$3.j(), $$2 * (double)$$3.k(), $$2 * (double)$$3.l()));
        $$1.a($$4, $$1.dI());
        $$1.aX();
        l.set(null);
    }

    private static void b(dwo $$0, is $$1, float $$22, eob $$3) {
        if (!$$3.x()) {
            return;
        }
        iz $$4 = $$3.f();
        if (!$$4.o().d()) {
            return;
        }
        double $$5 = $$3.h.g($$0, $$1).c(iz.a.b);
        fth $$6 = eob.a($$1, new fth(0.0, $$5, 0.0, 1.0, 1.5000010000000001, 1.0), $$3);
        double $$7 = $$22 - $$3.m;
        List<cgk> $$8 = $$0.a((cgk)null, $$6, $$2 -> eob.a($$6, $$2, $$1));
        for (cgk $$9 : $$8) {
            eob.a($$4, $$9, $$7, $$4);
        }
    }

    private static boolean a(fth $$0, cgk $$1, is $$2) {
        return $$1.n_() == flg.a && $$1.aV() && ($$1.d($$2) || $$1.dP() >= $$0.a && $$1.dP() <= $$0.d && $$1.dV() >= $$0.c && $$1.dV() <= $$0.f);
    }

    private boolean x() {
        return this.h.a(dzs.qg);
    }

    public iz f() {
        return this.j ? this.i : this.i.g();
    }

    private static double a(fth $$0, iz $$1, fth $$2) {
        switch ($$1) {
            case f: {
                return $$0.d - $$2.a;
            }
            case e: {
                return $$2.d - $$0.a;
            }
            default: {
                return $$0.e - $$2.b;
            }
            case a: {
                return $$2.e - $$0.b;
            }
            case d: {
                return $$0.f - $$2.c;
            }
            case c: 
        }
        return $$2.f - $$0.c;
    }

    private static fth a(is $$0, fth $$1, eob $$2) {
        double $$3 = $$2.e($$2.m);
        return $$1.d((double)$$0.u() + $$3 * (double)$$2.i.j(), (double)$$0.v() + $$3 * (double)$$2.i.k(), (double)$$0.w() + $$3 * (double)$$2.i.l());
    }

    private static void a(is $$0, cgk $$1, iz $$2, double $$3) {
        double $$8;
        iz $$6;
        double $$7;
        fth $$5;
        fth $$4 = $$1.dj();
        if ($$4.c($$5 = fud.b().a().a($$0)) && Math.abs(($$7 = eob.a($$5, $$6 = $$2.g(), $$4) + 0.01) - ($$8 = eob.a($$5, $$6, $$4.a($$5)) + 0.01)) < 0.01) {
            $$7 = Math.min($$7, $$3) + 0.01;
            eob.a($$2, $$1, $$7, $$6);
        }
    }

    public eoh h() {
        return this.h;
    }

    public void k() {
        if (this.n != null && (this.q < 1.0f || this.n.B_())) {
            this.q = this.m = 1.0f;
            this.n.s(this.o);
            this.ay_();
            if (this.n.a_(this.o).a(dzs.ca)) {
                eoh $$1;
                if (this.k) {
                    eoh $$0 = dzs.a.m();
                } else {
                    $$1 = dzq.b(this.h, (dwp)this.n, this.o);
                }
                this.n.a(this.o, $$1, 3);
                this.n.b(this.o, $$1.b(), fmf.a(this.n, this.l(), null));
            }
        }
    }

    @Override
    public void a(is $$0, eoh $$1) {
        this.k();
    }

    public iz l() {
        return this.j ? this.i : this.i.g();
    }

    public static void a(dwo $$0, is $$1, eoh $$2, eob $$3) {
        $$3.r = $$0.au();
        $$3.q = $$3.m;
        if ($$3.q >= 1.0f) {
            if ($$0.B_() && $$3.s < 5) {
                ++$$3.s;
                return;
            }
            $$0.s($$1);
            $$3.ay_();
            if ($$0.a_($$1).a(dzs.ca)) {
                eoh $$4 = dzq.b($$3.h, (dwp)$$0, $$1);
                if ($$4.l()) {
                    $$0.a($$1, $$3.h, 340);
                    dzq.a($$3.h, $$4, $$0, $$1, 3);
                } else {
                    if ($$4.b(eox.I) && $$4.c(eox.I).booleanValue()) {
                        $$4 = (eoh)$$4.b(eox.I, false);
                    }
                    $$0.a($$1, $$4, 67);
                    $$0.b($$1, $$4.b(), fmf.a($$0, $$3.l(), null));
                }
            }
            return;
        }
        float $$5 = $$3.m + 0.5f;
        eob.a($$0, $$1, $$5, $$3);
        eob.b($$0, $$1, $$5, $$3);
        $$3.m = $$5;
        if ($$3.m >= 1.0f) {
            $$3.m = 1.0f;
        }
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.h = $$0.a("blockState", eoh.a).orElse(d);
        this.i = $$0.a("facing", iz.k).orElse(iz.a);
        this.q = this.m = $$0.a("progress", 0.0f);
        this.j = $$0.a("extending", false);
        this.k = $$0.a("source", false);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("blockState", eoh.a, this.h);
        $$0.a("facing", iz.k, this.i);
        $$0.a("progress", this.q);
        $$0.a("extending", this.j);
        $$0.a("source", this.k);
    }

    public fug a(dvt $$0, is $$1) {
        eoh $$6;
        fug $$3;
        if (!this.j && this.k && this.h.b() instanceof eny) {
            fug $$2 = ((eoh)this.h.b(eny.c, true)).g($$0, $$1);
        } else {
            $$3 = fud.a();
        }
        iz $$4 = l.get();
        if ((double)this.m < 1.0 && $$4 == this.f()) {
            return $$3;
        }
        if (this.d()) {
            eoh $$5 = (eoh)((eoh)dzs.bJ.m().b(enz.a, this.i)).b(enz.d, this.j != 1.0f - this.m < 0.25f);
        } else {
            $$6 = this.h;
        }
        float $$7 = this.e(this.m);
        double $$8 = (float)this.i.j() * $$7;
        double $$9 = (float)this.i.k() * $$7;
        double $$10 = (float)this.i.l() * $$7;
        return fud.a($$3, $$6.g($$0, $$1).a($$8, $$9, $$10));
    }

    public long m() {
        return this.r;
    }

    @Override
    public void a(dwo $$0) {
        super.a($$0);
        if ($$0.a(mj.i).a(this.h.b().p().h()).isEmpty()) {
            this.h = dzs.a.m();
        }
    }
}

