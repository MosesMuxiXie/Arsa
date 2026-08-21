/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record dro(dlt a, dlt b, dlt c) implements dqy
{
    private final dlt a;
    private final dlt b;
    private final dlt c;

    @Override
    public dlt a(int $$0) {
        return switch ($$0) {
            case 0 -> this.a;
            case 1 -> this.b;
            case 2 -> this.c;
            default -> throw new IllegalArgumentException("Recipe does not contain slot " + $$0);
        };
    }

    @Override
    public int a() {
        return 3;
    }

    @Override
    public boolean b() {
        return this.a.f() && this.b.f() && this.c.f();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dro.class, "template;base;addition", "a", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dro.class, "template;base;addition", "a", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dro.class, "template;base;addition", "a", "b", "c"}, this, $$0);
    }

    public dlt c() {
        return this.a;
    }

    public dlt d() {
        return this.b;
    }

    public dlt e() {
        return this.c;
    }
}

