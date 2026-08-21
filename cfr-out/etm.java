/*
 * Decompiled with CFR 0.152.
 */
public interface etm {
    public eto a();

    public int b();

    public boolean a(axf var1, jd<etk> var2, etk.a var3, ftm var4);

    default public a c() {
        return a.a;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        private static final /* synthetic */ a[] c;

        public static a[] values() {
            return (a[])c.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            c = etm$a.a();
        }
    }

    public static interface b<T extends etm> {
        public T c();
    }
}

