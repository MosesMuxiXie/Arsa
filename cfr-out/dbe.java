/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.EnumSet;
import java.util.function.IntFunction;
import org.jspecify.annotations.Nullable;

public abstract class dbe
extends dba {
    private static final alw<Byte> a = ama.a(dbe.class, aly.a);
    private static final int e = 0;
    protected int b = 0;
    private a f = dbe$a.a;

    protected dbe(cgu<? extends dbe> $$0, dwo $$1) {
        super((cgu<? extends dba>)$$0, $$1);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(a, (byte)0);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.b = $$0.a("SpellTicks", 0);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("SpellTicks", this.b);
    }

    @Override
    public dba.a gY() {
        if (this.ha()) {
            return dba.a.c;
        }
        if (this.hj()) {
            return dba.a.g;
        }
        return dba.a.a;
    }

    public boolean ha() {
        if (this.ao().B_()) {
            return this.az.a(a) > 0;
        }
        return this.b > 0;
    }

    public void a(a $$0) {
        this.f = $$0;
        this.az.a(a, (byte)$$0.h);
    }

    protected a hb() {
        if (!this.ao().B_()) {
            return this.f;
        }
        return dbe$a.a(this.az.a(a).byteValue());
    }

    @Override
    protected void a(axf $$0) {
        super.a($$0);
        if (this.b > 0) {
            --this.b;
        }
    }

    @Override
    public void g() {
        super.g();
        if (this.ao().B_() && this.ha()) {
            a $$0 = this.hb();
            float $$1 = (float)$$0.i[0];
            float $$2 = (float)$$0.i[1];
            float $$3 = (float)$$0.i[2];
            float $$4 = this.bC * ((float)Math.PI / 180) + bgj.b((double)((float)this.at * 0.6662f)) * 0.25f;
            float $$5 = bgj.b((double)$$4);
            float $$6 = bgj.a((double)$$4);
            double $$7 = 0.6 * (double)this.eF();
            double $$8 = 1.8 * (double)this.eF();
            this.ao().a(lq.a(ly.v, $$1, $$2, $$3), this.dP() + (double)$$5 * $$7, this.dR() + $$8, this.dV() + (double)$$6 * $$7, 0.0, 0.0, 0.0);
            this.ao().a(lq.a(ly.v, $$1, $$2, $$3), this.dP() - (double)$$5 * $$7, this.dR() + $$8, this.dV() - (double)$$6 * $$7, 0.0, 0.0, 0.0);
        }
    }

    protected int hc() {
        return this.b;
    }

    protected abstract bcz gZ();

    protected static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(0, 0.0, 0.0, 0.0);
        public static final /* enum */ a b = new a(1, 0.7, 0.7, 0.8);
        public static final /* enum */ a c = new a(2, 0.4, 0.3, 0.35);
        public static final /* enum */ a d = new a(3, 0.7, 0.5, 0.2);
        public static final /* enum */ a e = new a(4, 0.3, 0.3, 0.8);
        public static final /* enum */ a f = new a(5, 0.1, 0.1, 0.2);
        private static final IntFunction<a> g;
        final int h;
        final double[] i;
        private static final /* synthetic */ a[] j;

        public static a[] values() {
            return (a[])j.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(int $$0, double $$1, double $$2, double $$3) {
            this.h = $$0;
            this.i = new double[]{$$1, $$2, $$3};
        }

        public static a a(int $$0) {
            return g.apply($$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d, e, f};
        }

        static {
            j = dbe$a.a();
            g = beu.a($$0 -> $$0.h, dbe$a.values(), beu.a.a);
        }
    }

    protected abstract class c
    extends cop {
        protected int b;
        protected int c;

        protected c() {
        }

        @Override
        public boolean b() {
            chl $$0 = dbe.this.ag_();
            if ($$0 == null || !$$0.cb()) {
                return false;
            }
            if (dbe.this.ha()) {
                return false;
            }
            return dbe.this.at >= this.c;
        }

        @Override
        public boolean c() {
            chl $$0 = dbe.this.ag_();
            return $$0 != null && $$0.cb() && this.b > 0;
        }

        @Override
        public void d() {
            this.b = this.a(this.n());
            dbe.this.b = this.h();
            this.c = dbe.this.at + this.i();
            bcz $$0 = this.l();
            if ($$0 != null) {
                dbe.this.a($$0, 1.0f, 1.0f);
            }
            dbe.this.a(this.m());
        }

        @Override
        public void a() {
            --this.b;
            if (this.b == 0) {
                this.k();
                dbe.this.a(dbe.this.gZ(), 1.0f, 1.0f);
            }
        }

        protected abstract void k();

        protected int n() {
            return 20;
        }

        protected abstract int h();

        protected abstract int i();

        protected abstract @Nullable bcz l();

        protected abstract a m();
    }

    protected class b
    extends cop {
        public b() {
            this.a(EnumSet.of(cop.a.a, cop.a.b));
        }

        @Override
        public boolean b() {
            return dbe.this.hc() > 0;
        }

        @Override
        public void d() {
            super.d();
            dbe.this.cr.n();
        }

        @Override
        public void e() {
            super.e();
            dbe.this.a(dbe$a.a);
        }

        @Override
        public void a() {
            if (dbe.this.ag_() != null) {
                dbe.this.J().a(dbe.this.ag_(), (float)dbe.this.ae(), (float)dbe.this.ac());
            }
        }
    }
}

