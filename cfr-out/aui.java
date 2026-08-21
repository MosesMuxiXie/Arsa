/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.net.URI;
import java.util.List;

public record aui<T>(String a, URI b, auh<T> c) {
    private final String a;
    private final URI b;
    private final auh<T> c;

    public auh<T> a() {
        return auh.a(this.b, this.c.j());
    }

    public auh<List<T>> b() {
        return auh.a(this.a(), this.c.j());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aui.class, "name;ref;schema", "a", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aui.class, "name;ref;schema", "a", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aui.class, "name;ref;schema", "a", "b", "c"}, this, $$0);
    }

    public String c() {
        return this.a;
    }

    public URI d() {
        return this.b;
    }

    public auh<T> e() {
        return this.c;
    }
}

