/*
 * Decompiled with CFR 0.152.
 */
public interface axq {
    public static axq a(final axq $$0, final axq $$1) {
        return new axq(){

            @Override
            public void a(a $$02, int $$12) {
                $$0.a($$02, $$12);
                $$1.a($$02, $$12);
            }

            @Override
            public void a(a $$02, int $$12, int $$2) {
                $$0.a($$02, $$12, $$2);
                $$1.a($$02, $$12, $$2);
            }

            @Override
            public void a(a $$02) {
                $$0.a($$02);
                $$1.a($$02);
            }

            @Override
            public void a(amt<dwo> $$02, dvu $$12) {
                $$0.a($$02, $$12);
                $$1.a($$02, $$12);
            }
        };
    }

    public void a(a var1, int var2);

    public void a(a var1, int var2, int var3);

    public void a(a var1);

    public void a(amt<dwo> var1, dvu var2);

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        private static final /* synthetic */ a[] e;

        public static a[] values() {
            return (a[])e.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d};
        }

        static {
            e = axq$a.a();
        }
    }
}

