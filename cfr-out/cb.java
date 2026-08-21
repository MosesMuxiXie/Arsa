/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Arrays;
import java.util.List;

public final class cb
extends Record {
    private final List<dwl> d;
    public static final cb a = cb.a(dwl.values());
    public static final cb b = cb.a(dwl.a, dwl.c);
    public static final Codec<cb> c = dwl.f.listOf().xmap(cb::new, cb::a);

    public cb(List<dwl> $$0) {
        this.d = $$0;
    }

    public static cb a(dwl ... $$0) {
        return new cb(Arrays.stream($$0).toList());
    }

    public boolean a(dwl $$0) {
        return this.d.contains($$0);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cb.class, "types", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cb.class, "types", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cb.class, "types", "d"}, this, $$0);
    }

    public List<dwl> a() {
        return this.d;
    }
}

