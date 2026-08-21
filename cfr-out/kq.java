/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class kq
extends Record
implements ks {
    private final ct e;
    public static final Codec<kq> a = ct.a.xmap(kq::new, kq::a);

    public kq(ct $$0) {
        this.e = $$0;
    }

    @Override
    public boolean a(kd $$0) {
        return this.e.a($$0);
    }

    public static kq a(ct $$0) {
        return new kq($$0);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{kq.class, "value", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{kq.class, "value", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{kq.class, "value", "e"}, this, $$0);
    }

    public ct a() {
        return this.e;
    }
}

