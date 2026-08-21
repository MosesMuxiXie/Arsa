/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public interface gpi {
    public gpk a();

    public record a(gpk a) implements gpi
    {
        private final gpk a;

        @Override
        public gpk a() {
            return this.a.a() == gpj.b ? this.a : gpk.b;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "direction", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "direction", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "direction", "a"}, this, $$0);
        }

        public gpk b() {
            return this.a;
        }
    }

    public static class b
    implements gpi {
        @Override
        public gpk a() {
            return gpk.b;
        }
    }

    public record c(boolean a) implements gpi
    {
        private final boolean a;

        @Override
        public gpk a() {
            return this.a ? gpk.b : gpk.a;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "forward", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "forward", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "forward", "a"}, this, $$0);
        }

        public boolean b() {
            return this.a;
        }
    }
}

