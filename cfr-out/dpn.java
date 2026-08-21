/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public final class dpn
extends Record
implements dpp {
    private final List<cfm> c;
    private final float f;
    public static final MapCodec<dpn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)cfm.d.listOf().fieldOf("effects").forGetter(dpn::b), (App)Codec.floatRange((float)0.0f, (float)1.0f).optionalFieldOf("probability", (Object)Float.valueOf(1.0f)).forGetter(dpn::c)).apply((Applicative)$$0, dpn::new));
    public static final aao<xq, dpn> b = aao.a(cfm.e.a(aam.a()), dpn::b, aam.l, dpn::c, dpn::new);

    public dpn(cfm $$0, float $$1) {
        this(List.of($$0), $$1);
    }

    public dpn(List<cfm> $$0) {
        this($$0, 1.0f);
    }

    public dpn(cfm $$0) {
        this($$0, 1.0f);
    }

    public dpn(List<cfm> $$0, float $$1) {
        this.c = $$0;
        this.f = $$1;
    }

    public dpp.a<dpn> a() {
        return dpp.a.a;
    }

    @Override
    public boolean a(dwo $$0, dlt $$1, chl $$2) {
        if ($$2.ep().i() >= this.f) {
            return false;
        }
        boolean $$3 = false;
        for (cfm $$4 : this.c) {
            if (!$$2.a(new cfm($$4))) continue;
            $$3 = true;
        }
        return $$3;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dpn.class, "effects;probability", "c", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dpn.class, "effects;probability", "c", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dpn.class, "effects;probability", "c", "f"}, this, $$0);
    }

    public List<cfm> b() {
        return this.c;
    }

    public float c() {
        return this.f;
    }
}

