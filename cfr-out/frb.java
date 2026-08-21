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
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record frb(jd<dso> b, List<Float> c) implements frm
{
    private final jd<dso> b;
    private final List<Float> c;
    public static final MapCodec<frb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)dso.c.fieldOf("enchantment").forGetter(frb::c), (App)bfm.b(Codec.FLOAT.listOf()).fieldOf("chances").forGetter(frb::d)).apply((Applicative)$$0, frb::new));

    @Override
    public frn a() {
        return fro.k;
    }

    @Override
    public Set<bhv<?>> b() {
        return Set.of(fqx.k);
    }

    public boolean a(fnz $$0) {
        dlt $$1 = $$0.c(fqx.k);
        int $$2 = $$1 != null ? dsq.a(this.b, $$1) : 0;
        float $$3 = this.c.get(Math.min($$2, this.c.size() - 1)).floatValue();
        return $$0.b().i() < $$3;
    }

    public static frm.a a(jd<dso> $$0, float ... $$1) {
        ArrayList<Float> $$2 = new ArrayList<Float>($$1.length);
        for (float $$3 : $$1) {
            $$2.add(Float.valueOf($$3));
        }
        return () -> new frb($$0, $$2);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{frb.class, "enchantment;values", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{frb.class, "enchantment;values", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{frb.class, "enchantment;values", "b", "c"}, this, $$0);
    }

    public jd<dso> c() {
        return this.b;
    }

    public List<Float> d() {
        return this.c;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.a((fnz)object);
    }
}

