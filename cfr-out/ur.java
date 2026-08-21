/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.OptionalDouble;

public record ur(ftm a, String b, a c) implements uh
{
    @Override
    public void a(uj $$0, float $$1) {
        a $$3;
        if ($$1 < 1.0f) {
            a $$2 = new a(bel.a(this.c.b, $$1), this.c.c, this.c.d);
        } else {
            $$3 = this.c;
        }
        $$0.a(this.a, this.b, $$3);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ur.class, "pos;text;style", "a", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ur.class, "pos;text;style", "a", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ur.class, "pos;text;style", "a", "b", "c"}, this, $$0);
    }

    public static final class a
    extends Record {
        final int b;
        final float c;
        final OptionalDouble d;
        public static final float a = 0.32f;

        public a(int $$0, float $$1, OptionalDouble $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        public static a a() {
            return new a(-1, 0.32f, OptionalDouble.empty());
        }

        public static a a(int $$0) {
            return new a($$0, 0.32f, OptionalDouble.empty());
        }

        public static a b(int $$0) {
            return new a($$0, 0.32f, OptionalDouble.of(0.0));
        }

        public a a(float $$0) {
            return new a(this.b, $$0, this.d);
        }

        public a b(float $$0) {
            return new a(this.b, this.c, OptionalDouble.of($$0));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "color;scale;adjustLeft", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "color;scale;adjustLeft", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "color;scale;adjustLeft", "b", "c", "d"}, this, $$0);
        }

        public int b() {
            return this.b;
        }

        public float c() {
            return this.c;
        }

        public OptionalDouble d() {
            return this.d;
        }
    }
}

