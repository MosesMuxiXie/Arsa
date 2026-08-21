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
import java.util.Optional;

public final class dtc
extends Record
implements dth {
    private final jh<cfk> d;
    private final dsv e;
    private final dsv f;
    private final dsv g;
    private final dsv h;
    public static final MapCodec<dtc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)js.a(mj.ae).fieldOf("to_apply").forGetter(dtc::b), (App)dsv.b.fieldOf("min_duration").forGetter(dtc::c), (App)dsv.b.fieldOf("max_duration").forGetter(dtc::d), (App)dsv.b.fieldOf("min_amplifier").forGetter(dtc::e), (App)dsv.b.fieldOf("max_amplifier").forGetter(dtc::f)).apply((Applicative)$$0, dtc::new));

    public dtc(jh<cfk> $$0, dsv $$1, dsv $$2, dsv $$3, dsv $$4) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
        this.h = $$4;
    }

    @Override
    public void a(axf $$0, int $$1, dsn $$2, cgk $$3, ftm $$4) {
        chl $$5;
        bgr $$6;
        Optional<jd<cfk>> $$7;
        if ($$3 instanceof chl && ($$7 = this.d.a($$6 = ($$5 = (chl)$$3).ep())).isPresent()) {
            int $$8 = Math.round(bgj.b($$6, this.e.a($$1), this.f.a($$1)) * 20.0f);
            int $$9 = Math.max(0, Math.round(bgj.b($$6, this.g.a($$1), this.h.a($$1))));
            $$5.a(new cfm($$7.get(), $$8, $$9));
        }
    }

    public MapCodec<dtc> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dtc.class, "toApply;minDuration;maxDuration;minAmplifier;maxAmplifier", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dtc.class, "toApply;minDuration;maxDuration;minAmplifier;maxAmplifier", "d", "e", "f", "g", "h"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dtc.class, "toApply;minDuration;maxDuration;minAmplifier;maxAmplifier", "d", "e", "f", "g", "h"}, this, $$0);
    }

    public jh<cfk> b() {
        return this.d;
    }

    public dsv c() {
        return this.e;
    }

    public dsv d() {
        return this.f;
    }

    public dsv e() {
        return this.g;
    }

    public dsv f() {
        return this.h;
    }
}

