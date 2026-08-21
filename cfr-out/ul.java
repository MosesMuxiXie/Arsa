/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record ul(int a, float b, int c) {
    private final int a;
    private final float b;
    private final int c;
    private static final float d = 2.5f;

    public static ul a(int $$0) {
        return new ul($$0, 2.5f, 0);
    }

    public static ul a(int $$0, float $$1) {
        return new ul($$0, $$1, 0);
    }

    public static ul b(int $$0) {
        return new ul(0, 0.0f, $$0);
    }

    public static ul a(int $$0, float $$1, int $$2) {
        return new ul($$0, $$1, $$2);
    }

    public boolean a() {
        return this.c != 0;
    }

    public boolean b() {
        return this.a != 0 && this.b > 0.0f;
    }

    public int a(float $$0) {
        return bel.a(this.a, $$0);
    }

    public int b(float $$0) {
        return bel.a(this.c, $$0);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ul.class, "stroke;strokeWidth;fill", "a", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ul.class, "stroke;strokeWidth;fill", "a", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ul.class, "stroke;strokeWidth;fill", "a", "b", "c"}, this, $$0);
    }

    public int c() {
        return this.a;
    }

    public float d() {
        return this.b;
    }

    public int e() {
        return this.c;
    }
}

