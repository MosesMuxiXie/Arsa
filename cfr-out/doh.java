/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public final class doh
extends Record {
    private final List<dpp> d;
    public static final Codec<doh> a = RecordCodecBuilder.create($$0 -> $$0.group((App)dpp.d.listOf().optionalFieldOf("death_effects", List.of()).forGetter(doh::a)).apply((Applicative)$$0, doh::new));
    public static final aao<xq, doh> b = aao.a(dpp.e.a(aam.a()), doh::a, doh::new);
    public static final doh c = new doh(List.of(new dpo(), new dpn(List.of(new cfm(cfo.j, 900, 1), new cfm(cfo.v, 100, 1), new cfm(cfo.l, 800, 0)))));

    public doh(List<dpp> $$0) {
        this.d = $$0;
    }

    public void a(dlt $$0, chl $$1) {
        for (dpp $$2 : this.d) {
            $$2.a($$1.ao(), $$0, $$1);
        }
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{doh.class, "deathEffects", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{doh.class, "deathEffects", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{doh.class, "deathEffects", "d"}, this, $$0);
    }

    public List<dpp> a() {
        return this.d;
    }
}

