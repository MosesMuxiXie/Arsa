/*
 * Decompiled with CFR 0.152.
 */
public interface vw {
    public b a();

    public b a(String var1);

    public b a(byte var1);

    public b a(short var1);

    public b a(int var1);

    public b a(long var1);

    public b a(float var1);

    public b a(double var1);

    public b a(byte[] var1);

    public b a(int[] var1);

    public b a(long[] var1);

    public b a(wb<?> var1, int var2);

    public a a(wb<?> var1);

    public a a(wb<?> var1, String var2);

    public a b(wb<?> var1, int var2);

    public b b();

    public b b(wb<?> var1);

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
            e = vw$a.a();
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b();
        public static final /* enum */ b b = new b();
        public static final /* enum */ b c = new b();
        private static final /* synthetic */ b[] d;

        public static b[] values() {
            return (b[])d.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c};
        }

        static {
            d = vw$b.a();
        }
    }
}

