/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

public interface gin {
    public static gin a(gmm $$0) {
        return new a($$0);
    }

    public static @Nullable gin a(gml $$0, @Nullable gin $$1) {
        if ($$1 == null) {
            return null;
        }
        return new b($$0, $$1);
    }

    public static gin a(gmm $$0, gml ... $$1) {
        gin $$2 = gin.a($$0);
        for (gml $$3 : $$1) {
            $$2 = gin.a($$3, $$2);
        }
        return $$2;
    }

    public gmm a();

    public void a(boolean var1);

    public record a(gmm a) implements gin
    {
        @Override
        public void a(boolean $$0) {
            this.a.b($$0);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "component", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "component", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "component", "a"}, this, $$0);
        }
    }

    public static final class b
    extends Record
    implements gin {
        private final gml a;
        private final gin b;

        public b(gml $$0, gin $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public void a(boolean $$0) {
            if (!$$0) {
                this.a.a((gmm)null);
            } else {
                this.a.a(this.b.a());
            }
            this.b.a($$0);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "component;childPath", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "component;childPath", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "component;childPath", "a", "b"}, this, $$0);
        }

        public gml b() {
            return this.a;
        }

        public gin c() {
            return this.b;
        }

        @Override
        public /* synthetic */ gmm a() {
            return this.b();
        }
    }
}

