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

public final class esi
extends Record {
    private final jd<esh> e;
    private final eqg f;
    public static final Codec<esi> a = RecordCodecBuilder.create($$0 -> $$0.group((App)esh.l.fieldOf("type").forGetter(esi::a), (App)eqg.a.fieldOf("generator").forGetter(esi::b)).apply((Applicative)$$0, $$0.stable(esi::new)));
    public static final amt<esi> b = amt.a(mj.bF, amo.b("overworld"));
    public static final amt<esi> c = amt.a(mj.bF, amo.b("the_nether"));
    public static final amt<esi> d = amt.a(mj.bF, amo.b("the_end"));

    public esi(jd<esh> $$0, eqg $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{esi.class, "type;generator", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{esi.class, "type;generator", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{esi.class, "type;generator", "e", "f"}, this, $$0);
    }

    public jd<esh> a() {
        return this.e;
    }

    public eqg b() {
        return this.f;
    }
}

