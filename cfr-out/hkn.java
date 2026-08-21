/*
 * Decompiled with CFR 0.152.
 */
public class hkn
extends hmg {
    private final fla b;
    protected boolean a;

    hkn(hif $$0, double $$1, double $$2, double $$3, fla $$4, ilp $$5) {
        super($$0, $$1, $$2, $$3, $$5);
        this.b(0.01f, 0.01f);
        this.B = 0.06f;
        this.b = $$4;
    }

    protected fla g() {
        return this.b;
    }

    @Override
    public hmg.b b() {
        return hmg.b.c;
    }

    @Override
    public int a(float $$0) {
        if (this.a) {
            return 240;
        }
        return super.a($$0);
    }

    @Override
    public void a() {
        this.k = this.n;
        this.l = this.o;
        this.m = this.p;
        this.h();
        if (this.v) {
            return;
        }
        this.r -= (double)this.B;
        this.a(this.q, this.r, this.s);
        this.i();
        if (this.v) {
            return;
        }
        this.q *= (double)0.98f;
        this.r *= (double)0.98f;
        this.s *= (double)0.98f;
        if (this.b == flc.a) {
            return;
        }
        is $$0 = is.a(this.n, this.o, this.p);
        flb $$1 = this.j.b_($$0);
        if ($$1.a() == this.b && this.o < (double)((float)$$0.v() + $$1.a(this.j, $$0))) {
            this.k();
        }
    }

    protected void h() {
        if (this.A-- <= 0) {
            this.k();
        }
    }

    protected void i() {
    }

    public static class u
    implements hlu<md> {
        private final hmo a;

        public u(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            c $$9 = new c($$1, $$2, $$3, $$4, flc.a, this.a.a($$8));
            $$9.a = true;
            $$9.A = (int)(28.0 / ((double)$$8.i() * 0.8 + 0.2));
            $$9.a(0.51171875f, 0.03125f, 0.890625f);
            return $$9;
        }
    }

    public static class s
    implements hlu<md> {
        private final hmo a;

        public s(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            i $$9 = new i($$1, $$2, $$3, $$4, flc.a, ly.aK, this.a.a($$8));
            $$9.a = true;
            $$9.B = 0.01f;
            $$9.a(0.51171875f, 0.03125f, 0.890625f);
            return $$9;
        }
    }

    public static class t
    implements hlu<md> {
        private final hmo a;

        public t(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            b $$9 = new b($$1, $$2, $$3, $$4, flc.a, ly.aJ, this.a.a($$8));
            $$9.a = true;
            $$9.B *= 0.01f;
            $$9.A = 100;
            $$9.a(0.51171875f, 0.03125f, 0.890625f);
            return $$9;
        }
    }

    public static class v
    implements hlu<md> {
        private final hmo a;

        public v(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            j $$9 = new j($$1, $$2, $$3, $$4, flc.a, this.a.a($$8));
            $$9.A = (int)(64.0f / bgj.b($$9.y, 0.1f, 0.9f));
            $$9.B = 0.005f;
            $$9.a(0.32f, 0.5f, 0.22f);
            return $$9;
        }
    }

    public static class r
    implements hlu<md> {
        private final hmo a;

        public r(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            j $$9 = new j($$1, $$2, $$3, $$4, flc.a, this.a.a($$8));
            $$9.A = (int)(16.0 / ((double)$$8.i() * 0.8 + 0.2));
            $$9.B = 0.007f;
            $$9.a(0.92f, 0.782f, 0.72f);
            return $$9;
        }
    }

    public static class e
    implements hlu<md> {
        private final hmo a;

        public e(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            d $$9 = new d($$1, $$2, $$3, $$4, flc.e, ly.l, this.a.a($$8));
            $$9.a(1.0f, 0.2857143f, 0.083333336f);
            return $$9;
        }
    }

    public static class f
    implements hlu<md> {
        private final hmo a;

        public f(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            a $$9 = new a($$1, $$2, $$3, $$4, flc.e, ly.aQ, this.a.a($$8));
            return $$9;
        }
    }

    public static class g
    implements hlu<md> {
        private final hmo a;

        public g(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            d $$9 = new d($$1, $$2, $$3, $$4, flc.c, ly.aq, this.a.a($$8));
            $$9.a(0.2f, 0.3f, 1.0f);
            return $$9;
        }
    }

    public static class h
    implements hlu<md> {
        private final hmo a;

        public h(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            b $$9 = new b($$1, $$2, $$3, $$4, flc.c, ly.aS, this.a.a($$8));
            $$9.a(0.2f, 0.3f, 1.0f);
            return $$9;
        }
    }

    public static class n
    implements hlu<md> {
        private final hmo a;

        public n(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            c $$9 = new c($$1, $$2, $$3, $$4, flc.a, this.a.a($$8));
            $$9.A = (int)(128.0 / ((double)$$8.i() * 0.8 + 0.2));
            $$9.a(0.522f, 0.408f, 0.082f);
            return $$9;
        }
    }

    public static class l
    implements hlu<md> {
        private final hmo a;

        public l(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            k $$9 = new k($$1, $$2, $$3, $$4, flc.a, ly.aB, this.a.a($$8));
            $$9.B = 0.01f;
            $$9.a(0.582f, 0.448f, 0.082f);
            return $$9;
        }
    }

    public static class m
    implements hlu<md> {
        private final hmo a;

        public m(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            b $$9 = new b($$1, $$2, $$3, $$4, flc.a, ly.aA, this.a.a($$8));
            $$9.B *= 0.01f;
            $$9.A = 100;
            $$9.a(0.622f, 0.508f, 0.082f);
            return $$9;
        }
    }

    public static class q
    implements hlu<md> {
        private final hmo a;

        public q(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            c $$9 = new c($$1, $$2, $$3, $$4, flc.e, this.a.a($$8));
            $$9.a(1.0f, 0.2857143f, 0.083333336f);
            return $$9;
        }
    }

    public static class o
    implements hlu<md> {
        private final hmo a;

        public o(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            i $$9 = new i($$1, $$2, $$3, $$4, flc.e, ly.l, this.a.a($$8));
            $$9.a(1.0f, 0.2857143f, 0.083333336f);
            return $$9;
        }
    }

    public static class p
    implements hlu<md> {
        private final hmo a;

        public p(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            a $$9 = new a($$1, $$2, $$3, $$4, flc.e, ly.k, this.a.a($$8));
            return $$9;
        }
    }

    public static class w
    implements hlu<md> {
        private final hmo a;

        public w(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            i $$9 = new i($$1, $$2, $$3, $$4, flc.c, ly.aq, this.a.a($$8));
            $$9.a(0.2f, 0.3f, 1.0f);
            return $$9;
        }
    }

    public static class x
    implements hlu<md> {
        private final hmo a;

        public x(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            b $$9 = new b($$1, $$2, $$3, $$4, flc.c, ly.n, this.a.a($$8));
            $$9.a(0.2f, 0.3f, 1.0f);
            return $$9;
        }
    }

    static class c
    extends hkn {
        c(hif $$0, double $$1, double $$2, double $$3, fla $$4, ilp $$5) {
            super($$0, $$1, $$2, $$3, $$4, $$5);
            this.A = (int)(16.0 / ((double)this.y.i() * 0.8 + 0.2));
        }
    }

    static class j
    extends hkn {
        j(hif $$0, double $$1, double $$2, double $$3, fla $$4, ilp $$5) {
            super($$0, $$1, $$2, $$3, $$4, $$5);
        }

        @Override
        protected void i() {
            if (this.t) {
                this.k();
            }
        }
    }

    static class d
    extends i {
        d(hif $$0, double $$1, double $$2, double $$3, fla $$4, lw $$5, ilp $$6) {
            super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
        }

        @Override
        protected void i() {
            if (this.t) {
                this.k();
                this.j.a(this.b, this.n, this.o, this.p, 0.0, 0.0, 0.0);
                bcz $$0 = this.g() == flc.e ? bda.jf : bda.jg;
                float $$1 = bgj.b(this.y, 0.3f, 1.0f);
                this.j.a(this.n, this.o, this.p, $$0, bdb.e, $$1, 1.0f, false);
            }
        }
    }

    static class k
    extends i {
        k(hif $$0, double $$1, double $$2, double $$3, fla $$4, lw $$5, ilp $$6) {
            super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
        }

        @Override
        protected void i() {
            if (this.t) {
                this.k();
                this.j.a(this.b, this.n, this.o, this.p, 0.0, 0.0, 0.0);
                float $$0 = bgj.b(this.y, 0.3f, 1.0f);
                this.j.a(this.n, this.o, this.p, bda.cg, bdb.e, $$0, 1.0f, false);
            }
        }
    }

    static class i
    extends j {
        protected final lw b;

        i(hif $$0, double $$1, double $$2, double $$3, fla $$4, lw $$5, ilp $$6) {
            super($$0, $$1, $$2, $$3, $$4, $$6);
            this.A = (int)(64.0 / ((double)this.y.i() * 0.8 + 0.2));
            this.b = $$5;
        }

        @Override
        protected void i() {
            if (this.t) {
                this.k();
                this.j.a(this.b, this.n, this.o, this.p, 0.0, 0.0, 0.0);
            }
        }
    }

    static class a
    extends b {
        a(hif $$0, double $$1, double $$2, double $$3, fla $$4, lw $$5, ilp $$6) {
            super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
        }

        @Override
        protected void h() {
            this.d = 1.0f;
            this.e = 16.0f / (float)(40 - this.A + 16);
            this.f = 4.0f / (float)(40 - this.A + 8);
            super.h();
        }
    }

    static class b
    extends hkn {
        private final lw b;

        b(hif $$0, double $$1, double $$2, double $$3, fla $$4, lw $$5, ilp $$6) {
            super($$0, $$1, $$2, $$3, $$4, $$6);
            this.b = $$5;
            this.B *= 0.02f;
            this.A = 40;
        }

        @Override
        protected void h() {
            if (this.A-- <= 0) {
                this.k();
                this.j.a(this.b, this.n, this.o, this.p, this.q, this.r, this.s);
            }
        }

        @Override
        protected void i() {
            this.q *= 0.02;
            this.r *= 0.02;
            this.s *= 0.02;
        }
    }
}

