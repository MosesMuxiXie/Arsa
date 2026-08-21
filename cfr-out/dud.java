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

public final class dud
extends Record
implements dtz {
    private final jd<dso> c;
    private final cch d;
    public static final MapCodec<dud> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)dso.c.fieldOf("enchantment").forGetter(dud::b), (App)cch.c.fieldOf("level").forGetter(dud::c)).apply((Applicative)$$0, dud::new));

    public dud(jd<dso> $$0, cch $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    @Override
    public void a(dlt $$0, dsu.a $$1, bgr $$2, cda $$3) {
        $$1.b(this.c, bgj.a(this.d.a($$2), this.c.a().d(), this.c.a().e()));
    }

    public MapCodec<dud> a() {
        return b;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dud.class, "enchantment;level", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dud.class, "enchantment;level", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dud.class, "enchantment;level", "c", "d"}, this, $$0);
    }

    public jd<dso> b() {
        return this.c;
    }

    public cch c() {
        return this.d;
    }
}

