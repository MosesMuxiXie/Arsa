/*
 * Decompiled with CFR 0.152.
 */
import java.util.UUID;

public interface ioo {
    public void a(UUID var1, b var2);

    public void a(UUID var1, a var2);

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        public static final /* enum */ a e = new a();
        private static final /* synthetic */ a[] f;

        public static a[] values() {
            return (a[])f.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d, e};
        }

        static {
            f = ioo$a.a();
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b();
        public static final /* enum */ b b = new b();
        private static final /* synthetic */ b[] c;

        public static b[] values() {
            return (b[])c.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b};
        }

        static {
            c = ioo$b.a();
        }
    }
}

