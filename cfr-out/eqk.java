/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public interface eqk {
    public boolean a();

    public int b();

    public int c();

    public <T> eqw<T> a(erd<T> var1, List<T> var2);

    public record a(int a, int b) implements eqk
    {
        private final int a;
        private final int b;

        @Override
        public boolean a() {
            return true;
        }

        @Override
        public <T> eqw<T> a(erd<T> $$0, List<T> $$1) {
            return $$0.c();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "bitsInMemory;bitsInStorage", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "bitsInMemory;bitsInStorage", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "bitsInMemory;bitsInStorage", "a", "b"}, this, $$0);
        }

        @Override
        public int b() {
            return this.a;
        }

        @Override
        public int c() {
            return this.b;
        }
    }

    public record b(eqw.a a, int b) implements eqk
    {
        private final eqw.a a;

        @Override
        public boolean a() {
            return false;
        }

        @Override
        public <T> eqw<T> a(erd<T> $$0, List<T> $$1) {
            return this.a.create(this.b, $$1);
        }

        @Override
        public int c() {
            return this.b;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "factory;bits", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "factory;bits", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "factory;bits", "a", "b"}, this, $$0);
        }

        public eqw.a d() {
            return this.a;
        }

        public int e() {
            return this.b;
        }
    }
}

