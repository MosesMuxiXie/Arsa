/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import org.jspecify.annotations.Nullable;

public record gfc(int a, yh b, @Nullable yu c, @Nullable gfd d) {
    private static final int e = 4;

    public List<bfr> a(gio $$0, int $$1) {
        if (this.d != null && this.d.f() != null) {
            $$1 -= this.d.f().c + 4 + 2;
        }
        return gjj.a(this.b, $$1, $$0);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gfc.class, "addedTime;content;signature;tag", "a", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gfc.class, "addedTime;content;signature;tag", "a", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gfc.class, "addedTime;content;signature;tag", "a", "b", "c", "d"}, this, $$0);
    }

    public record a(int a, bfr b, @Nullable gfd c, boolean d) {
        public int a(gio $$0) {
            return $$0.a(this.b) + 4;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "addedTime;content;tag;endOfEntry", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "addedTime;content;tag;endOfEntry", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "addedTime;content;tag;endOfEntry", "a", "b", "c", "d"}, this, $$0);
        }
    }
}

