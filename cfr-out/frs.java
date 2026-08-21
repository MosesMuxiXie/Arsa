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
import java.util.Set;

public final class frs
extends Record
implements frm {
    private final float b;
    private final dsv c;
    private final jd<dso> g;
    public static final MapCodec<frs> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("unenchanted_chance").forGetter(frs::c), (App)dsv.b.fieldOf("enchanted_chance").forGetter(frs::d), (App)dso.c.fieldOf("enchantment").forGetter(frs::e)).apply((Applicative)$$0, frs::new));

    public frs(float $$0, dsv $$1, jd<dso> $$2) {
        this.b = $$0;
        this.c = $$1;
        this.g = $$2;
    }

    @Override
    public frn a() {
        return fro.e;
    }

    @Override
    public Set<bhv<?>> b() {
        return Set.of(fqx.f);
    }

    public boolean a(fnz $$0) {
        int n2;
        cgk $$1 = $$0.c(fqx.f);
        if ($$1 instanceof chl) {
            chl $$2 = (chl)$$1;
            n2 = dsq.a(this.g, $$2);
        } else {
            n2 = 0;
        }
        int $$3 = n2;
        float $$4 = $$3 > 0 ? this.c.a($$3) : this.b;
        return $$0.b().i() < $$4;
    }

    public static frm.a a(jf.a $$0, float $$1, float $$2) {
        jf.b<dso> $$3 = $$0.e(mj.bf);
        return () -> new frs($$1, new dsv.f($$1 + $$2, $$2), $$3.b(dst.s));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{frs.class, "unenchantedChance;enchantedChance;enchantment", "b", "c", "g"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{frs.class, "unenchantedChance;enchantedChance;enchantment", "b", "c", "g"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{frs.class, "unenchantedChance;enchantedChance;enchantment", "b", "c", "g"}, this, $$0);
    }

    public float c() {
        return this.b;
    }

    public dsv d() {
        return this.c;
    }

    public jd<dso> e() {
        return this.g;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.a((fnz)object);
    }
}

