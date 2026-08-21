/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class cde
extends Record {
    private final cg d;
    public static final cde a = new cde(cg.a.a().b());
    public static final Codec<cde> b = cg.a.xmap(cde::new, cde::a);
    public static final String c = "lock";

    public cde(cg $$0) {
        this.d = $$0;
    }

    public boolean a(dlt $$0) {
        return this.d.a($$0);
    }

    public void a(fns $$0) {
        if (this != a) {
            $$0.a(c, b, this);
        }
    }

    public boolean a(ddm $$0) {
        return $$0.au() || this.a($$0.fx());
    }

    public static cde a(fnq $$0) {
        return $$0.a(c, b).orElse(a);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cde.class, "predicate", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cde.class, "predicate", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cde.class, "predicate", "d"}, this, $$0);
    }

    public cg a() {
        return this.d;
    }
}

