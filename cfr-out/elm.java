/*
 * Decompiled with CFR 0.152.
 */
public class elm
extends elb {
    private static final boolean a = false;
    private static final boolean b = false;
    private static final boolean c = false;
    private boolean d = false;
    private boolean e = false;
    private boolean f = false;
    private final dvo g = new dvo(){

        @Override
        public void a(String $$0) {
            super.a($$0);
            elm.this.e();
        }

        @Override
        public void a(axf $$0) {
            eoh $$1 = $$0.a_(elm.this.o);
            $$0.a(elm.this.o, $$1, $$1, 3);
        }

        @Override
        public ed a(axf $$0, ec $$1) {
            iz $$2 = elm.this.o().c(eba.b);
            return new ed($$1, ftm.b(elm.this.o), new ftl(0.0f, $$2.p()), $$0, bbh.c, this.e().getString(), this.e(), $$0.s(), null);
        }

        @Override
        public boolean a() {
            return !elm.this.p();
        }
    };

    public elm(is $$0, eoh $$1) {
        super(eld.x, $$0, $$1);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        this.g.a($$0);
        $$0.a("powered", this.c());
        $$0.a("conditionMet", this.h());
        $$0.a("auto", this.d());
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.g.a($$0);
        this.d = $$0.a("powered", false);
        this.f = $$0.a("conditionMet", false);
        this.b($$0.a("auto", false));
    }

    public dvo a() {
        return this.g;
    }

    public void a(boolean $$0) {
        this.d = $$0;
    }

    public boolean c() {
        return this.d;
    }

    public boolean d() {
        return this.e;
    }

    public void b(boolean $$0) {
        boolean $$1 = this.e;
        this.e = $$0;
        if (!$$1 && $$0 && !this.d && this.n != null && this.l() != elm$a.a) {
            this.w();
        }
    }

    public void f() {
        a $$0 = this.l();
        if ($$0 == elm$a.b && (this.d || this.e) && this.n != null) {
            this.w();
        }
    }

    private void w() {
        dzq $$0 = this.o().b();
        if ($$0 instanceof eba) {
            this.k();
            this.n.a(this.o, $$0, 1);
        }
    }

    public boolean h() {
        return this.f;
    }

    public boolean k() {
        this.f = true;
        if (this.m()) {
            elb $$1;
            is $$0 = this.o.a(this.n.a_(this.o).c(eba.b).g());
            this.f = this.n.a_($$0).b() instanceof eba ? ($$1 = this.n.c_($$0)) instanceof elm && ((elm)$$1).a().b() > 0 : false;
        }
        return this.f;
    }

    public a l() {
        eoh $$0 = this.o();
        if ($$0.a(dzs.gC)) {
            return elm$a.c;
        }
        if ($$0.a(dzs.lC)) {
            return elm$a.b;
        }
        if ($$0.a(dzs.lD)) {
            return elm$a.a;
        }
        return elm$a.c;
    }

    public boolean m() {
        eoh $$0 = this.n.a_(this.aD_());
        if ($$0.b() instanceof eba) {
            return $$0.c(eba.c);
        }
        return false;
    }

    @Override
    protected void a(kd $$0) {
        super.a($$0);
        this.g.a($$0.a(ki.h));
    }

    @Override
    protected void a(kf.a $$0) {
        super.a($$0);
        $$0.a(ki.h, this.g.f());
    }

    @Override
    public void b(fns $$0) {
        super.b($$0);
        $$0.c("CustomName");
        $$0.c("conditionMet");
        $$0.c("powered");
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = elm$a.a();
        }
    }
}

