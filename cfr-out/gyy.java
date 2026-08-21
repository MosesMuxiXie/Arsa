/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record gyy(int a, @gza.a int b) {
    private final int a;
    @gza.a
    private final int b;

    public String a() {
        return Character.toString(this.a);
    }

    public boolean b() {
        return bhi.a(this.a);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{gyy.class, "codepoint;modifiers", "a", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{gyy.class, "codepoint;modifiers", "a", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{gyy.class, "codepoint;modifiers", "a", "b"}, this, $$0);
    }

    public int c() {
        return this.a;
    }

    @gza.a
    public int d() {
        return this.b;
    }
}

