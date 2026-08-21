/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ObjectUtils
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Supplier;
import org.apache.commons.lang3.ObjectUtils;

public record bgi(a a, String b) {
    private final a a;
    private final String b;

    public static bgi a(String $$0, Supplier<String> $$1, String $$2, Class<?> $$3) {
        String $$4 = $$1.get();
        if (!$$0.equals($$4)) {
            return new bgi(bgi$a.c, $$2 + " brand changed to '" + $$4 + "'");
        }
        if ($$3.getSigners() == null) {
            return new bgi(bgi$a.b, $$2 + " jar signature invalidated");
        }
        return new bgi(bgi$a.a, $$2 + " jar signature and brand is untouched");
    }

    public boolean a() {
        return this.a.e;
    }

    public bgi a(bgi $$0) {
        return new bgi((a)((Object)ObjectUtils.max((Comparable[])new a[]{this.a, $$0.a})), this.b + "; " + $$0.b);
    }

    public String b() {
        return this.a.d + " " + this.b;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{bgi.class, "confidence;description", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{bgi.class, "confidence;description", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{bgi.class, "confidence;description", "a", "b"}, this, $$0);
    }

    public a c() {
        return this.a;
    }

    public String d() {
        return this.b;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a("Probably not.", false);
        public static final /* enum */ a b = new a("Very likely;", true);
        public static final /* enum */ a c = new a("Definitely;", true);
        final String d;
        final boolean e;
        private static final /* synthetic */ a[] f;

        public static a[] values() {
            return (a[])f.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0, boolean $$1) {
            this.d = $$0;
            this.e = $$1;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            f = bgi$a.a();
        }
    }
}

