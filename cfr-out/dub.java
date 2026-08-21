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

public final class dub
extends Record
implements dtz {
    private final jh<dso> c;
    private final cch d;
    public static final MapCodec<dub> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)js.a(mj.bf).fieldOf("enchantments").forGetter(dub::b), (App)cch.c.fieldOf("cost").forGetter(dub::c)).apply((Applicative)$$0, dub::new));

    public dub(jh<dso> $$0, cch $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    @Override
    public void a(dlt $$0, dsu.a $$1, bgr $$2, cda $$3) {
        List<dsr> $$4 = dsq.b($$2, $$0, this.d.a($$2), this.c.a());
        for (dsr $$5 : $$4) {
            $$1.b($$5.b(), $$5.c());
        }
    }

    public MapCodec<dub> a() {
        return b;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dub.class, "enchantments;cost", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dub.class, "enchantments;cost", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dub.class, "enchantments;cost", "c", "d"}, this, $$0);
    }

    public jh<dso> b() {
        return this.c;
    }

    public cch c() {
        return this.d;
    }
}

