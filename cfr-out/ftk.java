/*
 * Decompiled with CFR 0.152.
 */
public abstract class ftk {
    protected final ftm a;

    protected ftk(ftm $$0) {
        this.a = $$0;
    }

    public double a(cgk $$0) {
        double $$1 = this.a.g - $$0.dP();
        double $$2 = this.a.h - $$0.dR();
        double $$3 = this.a.i - $$0.dV();
        return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
    }

    public abstract a d();

    public ftm g() {
        return this.a;
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
            d = ftk$a.a();
        }
    }
}

