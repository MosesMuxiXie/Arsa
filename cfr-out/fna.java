/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record fna(int b, String c) {
    public static final String a = "main";

    public boolean a() {
        return !this.c.equals(a);
    }

    public boolean a(fna $$0) {
        if (w.t) {
            return true;
        }
        return this.c().equals($$0.c());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fna.class, "version;series", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fna.class, "version;series", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fna.class, "version;series", "b", "c"}, this, $$0);
    }
}

