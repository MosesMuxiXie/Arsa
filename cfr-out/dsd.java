/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public final class dsd
extends Record
implements dry {
    private final List<dse> f;
    private final dse g;
    private final dse h;
    public static final MapCodec<dsd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)dse.a.listOf().fieldOf("ingredients").forGetter(dsd::b), (App)dse.a.fieldOf("result").forGetter(dsd::d), (App)dse.a.fieldOf("crafting_station").forGetter(dsd::e)).apply((Applicative)$$0, dsd::new));
    public static final aao<xq, dsd> b = aao.a(dse.b.a(aam.a()), dsd::b, dse.b, dsd::d, dse.b, dsd::e, dsd::new);
    public static final dry.a<dsd> c = new dry.a<dsd>(a, b);

    public dsd(List<dse> $$0, dse $$1, dse $$2) {
        this.f = $$0;
        this.g = $$1;
        this.h = $$2;
    }

    public dry.a<dsd> a() {
        return c;
    }

    @Override
    public boolean a(dgz $$0) {
        return this.f.stream().allMatch($$1 -> $$1.a($$0)) && dry.super.a($$0);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dsd.class, "ingredients;result;craftingStation", "f", "g", "h"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dsd.class, "ingredients;result;craftingStation", "f", "g", "h"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dsd.class, "ingredients;result;craftingStation", "f", "g", "h"}, this, $$0);
    }

    public List<dse> b() {
        return this.f;
    }

    @Override
    public dse d() {
        return this.g;
    }

    @Override
    public dse e() {
        return this.h;
    }
}

