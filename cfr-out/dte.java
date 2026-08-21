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

public final class dte
extends Record
implements dth {
    private final dsv d;
    private final dsv e;
    private final jd<cez> f;
    public static final MapCodec<dte> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)dsv.b.fieldOf("min_damage").forGetter(dte::b), (App)dsv.b.fieldOf("max_damage").forGetter(dte::c), (App)cez.b.fieldOf("damage_type").forGetter(dte::d)).apply((Applicative)$$0, dte::new));

    public dte(dsv $$0, dsv $$1, jd<cez> $$2) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
    }

    @Override
    public void a(axf $$0, int $$1, dsn $$2, cgk $$3, ftm $$4) {
        float $$5 = bgj.b($$3.ep(), this.d.a($$1), this.e.a($$1));
        $$3.a($$0, new cex(this.f, $$2.c()), $$5);
    }

    public MapCodec<dte> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dte.class, "minDamage;maxDamage;damageType", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dte.class, "minDamage;maxDamage;damageType", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dte.class, "minDamage;maxDamage;damageType", "d", "e", "f"}, this, $$0);
    }

    public dsv b() {
        return this.d;
    }

    public dsv c() {
        return this.e;
    }

    public jd<cez> d() {
        return this.f;
    }
}

