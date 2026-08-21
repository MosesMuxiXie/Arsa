/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public interface ele {
    public a b();

    public b c();

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
            d = ele$a.a();
        }
    }

    public record b(is a, jy b) {
        public static b a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
            int $$6 = Math.min($$0, $$3);
            int $$7 = Math.min($$1, $$4);
            int $$8 = Math.min($$2, $$5);
            return new b(new is($$6, $$7, $$8), new jy(Math.max($$0, $$3) - $$6, Math.max($$1, $$4) - $$7, Math.max($$2, $$5) - $$8));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "localPos;size", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "localPos;size", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "localPos;size", "a", "b"}, this, $$0);
        }
    }
}

