/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.OptionalInt;

public interface dmn {
    public dec a(dwo var1, jn var2, dlt var3, iz var4);

    default public a a() {
        return a.a;
    }

    default public void a(dec $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
        $$0.d($$1, $$2, $$3, $$4, $$5);
    }

    public record dmn$a(b b, float c, float d, OptionalInt e) {
        public static final dmn$a a = dmn$a.a().a();

        public static a a() {
            return new a();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{dmn$a.class, "positionFunction;uncertainty;power;overrideDispenseEvent", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dmn$a.class, "positionFunction;uncertainty;power;overrideDispenseEvent", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dmn$a.class, "positionFunction;uncertainty;power;overrideDispenseEvent", "b", "c", "d", "e"}, this, $$0);
        }

        public static class a {
            private b a = ($$0, $$1) -> eby.a($$0, 0.7, new ftm(0.0, 0.1, 0.0));
            private float b = 6.0f;
            private float c = 1.1f;
            private OptionalInt d = OptionalInt.empty();

            public a a(b $$0) {
                this.a = $$0;
                return this;
            }

            public a a(float $$0) {
                this.b = $$0;
                return this;
            }

            public a b(float $$0) {
                this.c = $$0;
                return this;
            }

            public a a(int $$0) {
                this.d = OptionalInt.of($$0);
                return this;
            }

            public dmn$a a() {
                return new dmn$a(this.a, this.b, this.c, this.d);
            }
        }
    }

    @FunctionalInterface
    public static interface b {
        public jn getDispensePosition(ld var1, iz var2);
    }
}

