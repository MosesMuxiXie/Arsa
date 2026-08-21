/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public interface dnj {
    public static final a a = new a(false, false);
    public static final a b = new a(true, false);

    public boolean a();

    public boolean b();

    public record a(boolean c, boolean d) implements dnj
    {
        private final boolean c;
        private final boolean d;

        @Override
        public boolean a() {
            return this.c;
        }

        @Override
        public boolean b() {
            return this.d;
        }

        public a c() {
            return new a(this.c, true);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "advanced;creative", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "advanced;creative", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "advanced;creative", "c", "d"}, this, $$0);
        }

        public boolean d() {
            return this.c;
        }

        public boolean e() {
            return this.d;
        }
    }
}

