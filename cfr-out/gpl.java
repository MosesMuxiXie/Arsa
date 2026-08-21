/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record gpl(int a, int b) {
    public static gpl a(gpj $$0, int $$1, int $$2) {
        return switch ($$0) {
            default -> throw new MatchException(null, null);
            case gpj.a -> new gpl($$1, $$2);
            case gpj.b -> new gpl($$2, $$1);
        };
    }

    public gpl a(gpk $$0) {
        return switch ($$0) {
            default -> throw new MatchException(null, null);
            case gpk.b -> new gpl(this.a, this.b + 1);
            case gpk.a -> new gpl(this.a, this.b - 1);
            case gpk.c -> new gpl(this.a - 1, this.b);
            case gpk.d -> new gpl(this.a + 1, this.b);
        };
    }

    public int a(gpj $$0) {
        return switch ($$0) {
            default -> throw new MatchException(null, null);
            case gpj.a -> this.a;
            case gpj.b -> this.b;
        };
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gpl.class, "x;y", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gpl.class, "x;y", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gpl.class, "x;y", "a", "b"}, this, $$0);
    }
}

