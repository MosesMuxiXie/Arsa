/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ikx {
    public double a;
    public double b;
    public double c;
    public double d;
    public int e;
    public double f;

    public List<a> a(double $$02, double $$1) {
        a[] $$2 = new a[]{new a(iz.c, $$1 - this.c), new a(iz.d, this.d - $$1), new a(iz.e, $$02 - this.a), new a(iz.f, this.b - $$02)};
        return Arrays.stream($$2).sorted(Comparator.comparingDouble($$0 -> $$0.b)).toList();
    }

    public void a() {
        this.f = 0.0;
    }

    public static final class a
    extends Record {
        private final iz a;
        final double b;

        public a(iz $$0, double $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "direction;distance", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "direction;distance", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "direction;distance", "a", "b"}, this, $$0);
        }

        public iz a() {
            return this.a;
        }

        public double b() {
            return this.b;
        }
    }
}

