/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public record fuk(String a, int b, @Nullable yh c, @Nullable aag d) {
    private final String a;
    private final int b;
    private final @Nullable yh c;
    private final @Nullable aag d;

    public boolean a() {
        return this.a.startsWith("#");
    }

    public yh b() {
        if (this.c != null) {
            return this.c;
        }
        return yh.b(this.c());
    }

    public yw a(aag $$0) {
        return Objects.requireNonNullElse(this.d, $$0).a(this.b);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fuk.class, "owner;value;display;numberFormatOverride", "a", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fuk.class, "owner;value;display;numberFormatOverride", "a", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fuk.class, "owner;value;display;numberFormatOverride", "a", "b", "c", "d"}, this, $$0);
    }

    public String c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public @Nullable yh e() {
        return this.c;
    }

    public @Nullable aag f() {
        return this.d;
    }
}

