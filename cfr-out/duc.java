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

public final class duc
extends Record
implements dtz {
    private final jh<dso> d;
    private final int e;
    private final int f;
    public static final int b = 10000;
    public static final MapCodec<duc> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)js.a(mj.bf).fieldOf("enchantments").forGetter(duc::b), (App)bfm.a(1, 10000).fieldOf("min_cost").forGetter(duc::c), (App)bfm.a(0, 10000).fieldOf("max_cost_span").forGetter(duc::d)).apply((Applicative)$$0, duc::new));

    public duc(jh<dso> $$0, int $$1, int $$2) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
    }

    @Override
    public void a(dlt $$0, dsu.a $$1, bgr $$2, cda $$3) {
        float $$4 = $$3.d();
        int $$5 = bgj.b($$2, this.e, this.e + (int)($$4 * (float)this.f));
        List<dsr> $$6 = dsq.b($$2, $$0, $$5, this.d.a());
        for (dsr $$7 : $$6) {
            $$1.b($$7.b(), $$7.c());
        }
    }

    public MapCodec<duc> a() {
        return c;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{duc.class, "enchantments;minCost;maxCostSpan", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{duc.class, "enchantments;minCost;maxCostSpan", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{duc.class, "enchantments;minCost;maxCostSpan", "d", "e", "f"}, this, $$0);
    }

    public jh<dso> b() {
        return this.d;
    }

    public int c() {
        return this.e;
    }

    public int d() {
        return this.f;
    }
}

