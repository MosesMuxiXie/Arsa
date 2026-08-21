/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;

public abstract class cop {
    private final EnumSet<a> a = EnumSet.noneOf(a.class);

    public abstract boolean b();

    public boolean c() {
        return this.b();
    }

    public boolean W_() {
        return true;
    }

    public void d() {
    }

    public void e() {
    }

    public boolean X_() {
        return false;
    }

    public void a() {
    }

    public void a(EnumSet<a> $$0) {
        this.a.clear();
        this.a.addAll($$0);
    }

    public String toString() {
        return this.getClass().getSimpleName();
    }

    public EnumSet<a> j() {
        return this.a;
    }

    protected int a(int $$0) {
        return this.X_() ? $$0 : cop.b($$0);
    }

    protected static int b(int $$0) {
        return bgj.f($$0, 2);
    }

    protected static axf a(cgk $$0) {
        return (axf)$$0.ao();
    }

    protected static axf a(dwo $$0) {
        return (axf)$$0;
    }

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
            e = cop$a.a();
        }
    }
}

