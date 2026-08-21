/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

@FunctionalInterface
public interface app {
    public void perform(ed var1, cgk var2);

    public record b(ftm a) implements app
    {
        @Override
        public void perform(ed $$0, cgk $$1) {
            $$1.a($$0.n(), this.a);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "position", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "position", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "position", "a"}, this, $$0);
        }
    }

    public record a(cgk a, ep.a b) implements app
    {
        @Override
        public void perform(ed $$0, cgk $$1) {
            if ($$1 instanceof axg) {
                axg $$2 = (axg)$$1;
                $$2.a($$0.n(), this.a, this.b);
            } else {
                $$1.a($$0.n(), this.b.a(this.a));
            }
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "entity;anchor", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "entity;anchor", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "entity;anchor", "a", "b"}, this, $$0);
        }
    }
}

