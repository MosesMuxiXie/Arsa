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

public record axy(String b, yl c) {
    private final String b;
    private final yl c;
    public static final axy a = axy.a("");

    public static axy a(String $$0) {
        return new axy($$0, yl.c);
    }

    public static axy b(String $$0) {
        return new axy($$0, yl.b);
    }

    public @Nullable String a() {
        return this.c.a(this.b);
    }

    public String b() {
        return Objects.requireNonNullElse(this.a(), "");
    }

    public boolean c() {
        return !this.c.a();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{axy.class, "raw;mask", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{axy.class, "raw;mask", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{axy.class, "raw;mask", "b", "c"}, this, $$0);
    }

    public String d() {
        return this.b;
    }

    public yl e() {
        return this.c;
    }
}

