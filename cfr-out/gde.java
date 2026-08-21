/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

public record gde(int a, @Nullable String b) {
    private final int a;
    private final @Nullable String b;

    public @Nullable String a() {
        if (this.a < 200 || this.a >= 300) {
            if (this.a == 400 && this.b != null) {
                return this.b;
            }
            return String.valueOf(this.a);
        }
        return null;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gde.class, "statusCode;errorMessage", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gde.class, "statusCode;errorMessage", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gde.class, "statusCode;errorMessage", "a", "b"}, this, $$0);
    }

    public int b() {
        return this.a;
    }

    public @Nullable String c() {
        return this.b;
    }

    public static class a {
        private int a = -1;
        private @Nullable String b;

        public a a(int $$0) {
            this.a = $$0;
            return this;
        }

        public a a(@Nullable String $$0) {
            this.b = $$0;
            return this;
        }

        public gde a() {
            return new gde(this.a, this.b);
        }
    }
}

