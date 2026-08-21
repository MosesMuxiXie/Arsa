/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public interface ipm {
    public amo a();

    public @Nullable iqt a(iqr var1);

    public @Nullable ipj b();

    public bdb c();

    public boolean d();

    public boolean l();

    public int e();

    public float f();

    public float g();

    public double h();

    public double i();

    public double j();

    public a k();

    default public boolean r() {
        return false;
    }

    default public boolean s() {
        return true;
    }

    public static bgr u() {
        return bgr.a();
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
            c = ipm$a.a();
        }
    }
}

