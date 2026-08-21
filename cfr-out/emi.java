/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class emi
extends elb
implements cct,
cdf {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 0;
    public static final int d = 1;
    private final ccv e = new ccv(){

        @Override
        public int b() {
            return 1;
        }

        @Override
        public boolean c() {
            return emi.this.g.f();
        }

        @Override
        public dlt a(int $$0) {
            return $$0 == 0 ? emi.this.g : dlt.l;
        }

        @Override
        public dlt a(int $$0, int $$1) {
            if ($$0 == 0) {
                dlt $$2 = emi.this.g.a($$1);
                if (emi.this.g.f()) {
                    emi.this.l();
                }
                return $$2;
            }
            return dlt.l;
        }

        @Override
        public dlt b(int $$0) {
            if ($$0 == 0) {
                dlt $$1 = emi.this.g;
                emi.this.g = dlt.l;
                emi.this.l();
                return $$1;
            }
            return dlt.l;
        }

        @Override
        public void a(int $$0, dlt $$1) {
        }

        @Override
        public int ap_() {
            return 1;
        }

        @Override
        public void e() {
            emi.this.e();
        }

        @Override
        public boolean a(ddm $$0) {
            return ccv.a(emi.this, $$0) && emi.this.f();
        }

        @Override
        public boolean b(int $$0, dlt $$1) {
            return false;
        }

        @Override
        public void a() {
        }
    };
    private final dhv f = new dhv(){

        @Override
        public int a(int $$0) {
            return $$0 == 0 ? emi.this.h : 0;
        }

        @Override
        public void a(int $$0, int $$1) {
            if ($$0 == 0) {
                emi.this.a($$1);
            }
        }

        @Override
        public int a() {
            return 1;
        }
    };
    dlt g = dlt.l;
    int h;
    private int i;

    public emi(is $$0, eoh $$1) {
        super(eld.E, $$0, $$1);
    }

    public dlt c() {
        return this.g;
    }

    public boolean f() {
        return this.g.c(ki.ab) || this.g.c(ki.ac);
    }

    public void b(dlt $$0) {
        this.a($$0, null);
    }

    void l() {
        this.h = 0;
        this.i = 0;
        eej.a(null, this.j(), this.aD_(), this.o(), false);
    }

    public void a(dlt $$0, @Nullable ddm $$1) {
        this.g = this.b($$0, $$1);
        this.h = 0;
        this.i = emi.c(this.g);
        this.e();
    }

    void a(int $$0) {
        int $$1 = bgj.a($$0, 0, this.i - 1);
        if ($$1 != this.h) {
            this.h = $$1;
            this.e();
            eej.a(this.j(), this.aD_(), this.o());
        }
    }

    public int h() {
        return this.h;
    }

    public int k() {
        float $$0 = this.i > 1 ? (float)this.h() / ((float)this.i - 1.0f) : 1.0f;
        return bgj.b($$0 * 14.0f) + (this.f() ? 1 : 0);
    }

    private dlt b(dlt $$0, @Nullable ddm $$1) {
        dwo dwo2 = this.n;
        if (dwo2 instanceof axf) {
            axf $$2 = (axf)dwo2;
            dpl.a($$0, this.a($$1, $$2), $$1);
        }
        return $$0;
    }

    private ed a(@Nullable ddm $$0, axf $$1) {
        yh $$5;
        String $$4;
        if ($$0 == null) {
            String $$2 = "Lectern";
            yw $$3 = yh.b("Lectern");
        } else {
            $$4 = $$0.aq();
            $$5 = $$0.R_();
        }
        ftm $$6 = ftm.b(this.o);
        return new ed(ec.a, $$6, ftl.a, $$1, bbh.c, $$4, $$5, $$1.s(), $$0);
    }

    @Override
    protected void a(fnq $$02) {
        super.a($$02);
        this.g = $$02.a("Book", dlt.b).map($$0 -> this.b((dlt)$$0, null)).orElse(dlt.l);
        this.i = emi.c(this.g);
        this.h = bgj.a($$02.a("Page", 0), 0, this.i - 1);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        if (!this.c().f()) {
            $$0.a("Book", dlt.b, this.c());
            $$0.a("Page", this.h);
        }
    }

    @Override
    public void a() {
        this.b(dlt.l);
    }

    @Override
    public void a(is $$0, eoh $$1) {
        if ($$1.c(eej.d).booleanValue() && this.n != null) {
            iz $$2 = $$1.c(eej.b);
            dlt $$3 = this.c().v();
            float $$4 = 0.25f * (float)$$2.j();
            float $$5 = 0.25f * (float)$$2.l();
            czl $$6 = new czl(this.n, (double)$$0.u() + 0.5 + (double)$$4, $$0.v() + 1, (double)$$0.w() + 0.5 + (double)$$5, $$3);
            $$6.i();
            this.n.b($$6);
        }
    }

    @Override
    public dhi createMenu(int $$0, ddl $$1, ddm $$2) {
        return new dip($$0, this.e, this.f);
    }

    @Override
    public yh R_() {
        return yh.c("container.lectern");
    }

    private static int c(dlt $$0) {
        dpl $$1 = $$0.a(ki.ac);
        if ($$1 != null) {
            return $$1.a().size();
        }
        dpk $$2 = $$0.a(ki.ab);
        if ($$2 != null) {
            return $$2.a().size();
        }
        return 0;
    }
}

