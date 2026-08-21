/*
 * Decompiled with CFR 0.152.
 */
public abstract class dba
extends dfi {
    protected dba(cgu<? extends dba> $$0, dwo $$1) {
        super((cgu<? extends dfi>)$$0, $$1);
    }

    @Override
    protected void D() {
        super.D();
    }

    public a gY() {
        return dba$a.a;
    }

    @Override
    public boolean c(chl $$0) {
        if ($$0 instanceof dcw && $$0.e_()) {
            return false;
        }
        return super.c($$0);
    }

    @Override
    protected boolean u(cgk $$0) {
        if (super.u($$0)) {
            return true;
        }
        if ($$0.ay().a(bdt.A)) {
            return this.cI() == null && $$0.cI() == null;
        }
        return false;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        public static final /* enum */ a e = new a();
        public static final /* enum */ a f = new a();
        public static final /* enum */ a g = new a();
        public static final /* enum */ a h = new a();
        private static final /* synthetic */ a[] i;

        public static a[] values() {
            return (a[])i.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d, e, f, g, h};
        }

        static {
            i = dba$a.a();
        }
    }

    protected class b
    extends cph {
        public b(dfi $$1) {
            super($$1, false);
        }

        @Override
        public boolean b() {
            return super.b() && dba.this.hh();
        }
    }
}

