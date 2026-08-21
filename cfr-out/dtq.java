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

public final class dtq
extends Record
implements dth {
    private final dsv d;
    private final dsv e;
    private final jy f;
    private final Optional<evx> g;
    private final fcd h;
    private final Optional<jd<etk>> i;
    public static final MapCodec<dtq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)dsv.b.fieldOf("radius").forGetter(dtq::b), (App)dsv.b.fieldOf("height").forGetter(dtq::c), (App)jy.g.optionalFieldOf("offset", (Object)jy.i).forGetter(dtq::d), (App)evx.b.optionalFieldOf("predicate").forGetter(dtq::e), (App)fcd.a.fieldOf("block_state").forGetter(dtq::f), (App)etk.aj.optionalFieldOf("trigger_game_event").forGetter(dtq::g)).apply((Applicative)$$0, dtq::new));

    public dtq(dsv $$0, dsv $$1, jy $$2, Optional<evx> $$3, fcd $$4, Optional<jd<etk>> $$5) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
        this.h = $$4;
        this.i = $$5;
    }

    @Override
    public void a(axf $$0, int $$1, dsn $$22, cgk $$32, ftm $$4) {
        is $$5 = is.a($$4).a(this.f);
        bgr $$6 = $$32.ep();
        int $$7 = (int)this.d.a($$1);
        int $$8 = (int)this.e.a($$1);
        for (is $$9 : is.c($$5.b(-$$7, 0, -$$7), $$5.b($$7, Math.min($$8 - 1, 0), $$7))) {
            if (!($$9.c($$4.a(), (double)$$9.v() + 0.5, $$4.c()) < (double)bgj.i($$7)) || !this.g.map($$2 -> $$2.test($$0, $$9)).orElse(true).booleanValue() || !$$0.c($$9, this.h.a($$6, $$9))) continue;
            this.i.ifPresent($$3 -> $$0.a($$32, (jd<etk>)$$3, $$9));
        }
    }

    public MapCodec<dtq> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dtq.class, "radius;height;offset;predicate;blockState;triggerGameEvent", "d", "e", "f", "g", "h", "i"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dtq.class, "radius;height;offset;predicate;blockState;triggerGameEvent", "d", "e", "f", "g", "h", "i"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dtq.class, "radius;height;offset;predicate;blockState;triggerGameEvent", "d", "e", "f", "g", "h", "i"}, this, $$0);
    }

    public dsv b() {
        return this.d;
    }

    public dsv c() {
        return this.e;
    }

    public jy d() {
        return this.f;
    }

    public Optional<evx> e() {
        return this.g;
    }

    public fcd f() {
        return this.h;
    }

    public Optional<jd<etk>> g() {
        return this.i;
    }
}

