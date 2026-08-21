/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

public final class ky
extends Record
implements df<dnr> {
    private final jh<dnp> e;
    public static final Codec<ky> a = js.a(mj.am).xmap(ky::new, ky::b);

    public ky(jh<dnp> $$0) {
        this.e = $$0;
    }

    @Override
    public kh<dnr> a() {
        return ki.Y;
    }

    @Override
    public boolean a(dnr $$0) {
        Optional<jd<dnp>> $$1 = $$0.e();
        return !$$1.isEmpty() && this.e.a($$1.get());
    }

    public static ks a(jh<dnp> $$0) {
        return new ky($$0);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ky.class, "potions", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ky.class, "potions", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ky.class, "potions", "e"}, this, $$0);
    }

    public jh<dnp> b() {
        return this.e;
    }
}

