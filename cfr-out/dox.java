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

public final class dox
extends Record {
    private final dku<dur> c;
    public static final Codec<dox> a = dku.a(mj.bz, dur.c).xmap(dox::new, dox::a);
    public static final aao<xq, dox> b = dku.a(mj.bz, dur.d).a(dox::new, dox::a);

    public dox(jd<dur> $$0) {
        this(new dku<dur>($$0));
    }

    @Deprecated
    public dox(amt<dur> $$0) {
        this(new dku<dur>($$0));
    }

    public dox(dku<dur> $$0) {
        this.c = $$0;
    }

    public Optional<jd<dur>> a(jf.a $$0) {
        return this.c.a($$0);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dox.class, "material", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dox.class, "material", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dox.class, "material", "c"}, this, $$0);
    }

    public dku<dur> a() {
        return this.c;
    }
}

