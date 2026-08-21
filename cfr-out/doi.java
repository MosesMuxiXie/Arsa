/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;

public final class doi
extends Record {
    private final Map<jd<dzq>, epk<?>> c;
    public static final doi a = new doi(Map.of());
    public static final Codec<doi> b = Codec.dispatchedMap(mi.e.r(), $$0 -> Codec.STRING.comapFlatMap($$1 -> {
        epk<?> $$2 = ((dzq)$$0.a()).l().a((String)$$1);
        return $$2 != null ? DataResult.success($$2) : DataResult.error(() -> "No property on " + $$0.g() + " with name: " + $$1);
    }, epk::f)).xmap(doi::new, doi::a);

    public doi(Map<jd<dzq>, epk<?>> $$0) {
        this.c = $$0;
    }

    public doi a(jd<dzq> $$0, epk<?> $$1) {
        return new doi(bhs.a(this.c, $$0, $$1));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{doi.class, "properties", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{doi.class, "properties", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{doi.class, "properties", "c"}, this, $$0);
    }

    public Map<jd<dzq>, epk<?>> a() {
        return this.c;
    }
}

