/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public interface yx {
    public yh a();

    public void a(axg var1, boolean var2, yd.a var3);

    public static yx a(yy $$0) {
        if ($$0.h()) {
            return new a($$0.d());
        }
        return new b($$0);
    }

    public record a(yh a) implements yx
    {
        @Override
        public void a(axg $$0, boolean $$1, yd.a $$2) {
            $$0.g.a(this.a, $$2);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "content", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "content", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "content", "a"}, this, $$0);
        }
    }

    public record b(yy a) implements yx
    {
        private final yy a;

        @Override
        public yh a() {
            return this.a.d();
        }

        @Override
        public void a(axg $$0, boolean $$1, yd.a $$2) {
            yy $$3 = this.a.a($$1);
            if (!$$3.j()) {
                $$0.g.a($$3, $$2);
            }
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "message", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "message", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "message", "a"}, this, $$0);
        }

        public yy b() {
            return this.a;
        }
    }
}

