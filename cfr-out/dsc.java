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

public final class dsc
extends Record
implements dry {
    private final int f;
    private final int g;
    private final List<dse> h;
    private final dse i;
    private final dse j;
    public static final MapCodec<dsc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.INT.fieldOf("width").forGetter(dsc::b), (App)Codec.INT.fieldOf("height").forGetter(dsc::c), (App)dse.a.listOf().fieldOf("ingredients").forGetter(dsc::f), (App)dse.a.fieldOf("result").forGetter(dsc::d), (App)dse.a.fieldOf("crafting_station").forGetter(dsc::e)).apply((Applicative)$$0, dsc::new));
    public static final aao<xq, dsc> b = aao.a(aam.h, dsc::b, aam.h, dsc::c, dse.b.a(aam.a()), dsc::f, dse.b, dsc::d, dse.b, dsc::e, dsc::new);
    public static final dry.a<dsc> c = new dry.a<dsc>(a, b);

    public dsc(int $$0, int $$1, List<dse> $$2, dse $$3, dse $$4) {
        if ($$2.size() != $$0 * $$1) {
            throw new IllegalArgumentException("Invalid shaped recipe display contents");
        }
        this.f = $$0;
        this.g = $$1;
        this.h = $$2;
        this.i = $$3;
        this.j = $$4;
    }

    public dry.a<dsc> a() {
        return c;
    }

    @Override
    public boolean a(dgz $$0) {
        return this.h.stream().allMatch($$1 -> $$1.a($$0)) && dry.super.a($$0);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dsc.class, "width;height;ingredients;result;craftingStation", "f", "g", "h", "i", "j"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dsc.class, "width;height;ingredients;result;craftingStation", "f", "g", "h", "i", "j"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dsc.class, "width;height;ingredients;result;craftingStation", "f", "g", "h", "i", "j"}, this, $$0);
    }

    public int b() {
        return this.f;
    }

    public int c() {
        return this.g;
    }

    public List<dse> f() {
        return this.h;
    }

    @Override
    public dse d() {
        return this.i;
    }

    @Override
    public dse e() {
        return this.j;
    }
}

