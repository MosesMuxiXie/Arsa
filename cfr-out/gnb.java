/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public interface gnb {
    public static final Object b = new Object();
    public static final int c = 160;
    public static final int d = 32;

    public a a();

    public void a(gnc var1, long var2);

    default public @Nullable bcz b() {
        return null;
    }

    public void a(gir var1, gio var2, long var3);

    default public Object h() {
        return b;
    }

    default public float a(int $$0, float $$1) {
        return (float)$$0 - (float)this.e() * $$1;
    }

    default public float a(int $$0) {
        return $$0 * this.f();
    }

    default public int e() {
        return 160;
    }

    default public int f() {
        return 32;
    }

    default public int i() {
        return bgj.f(this.f(), 32);
    }

    default public void d() {
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(bda.DQ);
        public static final /* enum */ a b = new a(bda.DR);
        private final bcz c;
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(bcz $$0) {
            this.c = $$0;
        }

        public void a(iqr $$0) {
            $$0.a(iph.a(this.c, 1.0f, 1.0f));
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        static {
            d = gnb$a.a();
        }
    }
}

