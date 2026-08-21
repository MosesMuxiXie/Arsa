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

public final class dtp
extends Record
implements dth {
    private final jy d;
    private final Optional<evx> e;
    private final fcd f;
    private final Optional<jd<etk>> g;
    public static final MapCodec<dtp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)jy.g.optionalFieldOf("offset", (Object)jy.i).forGetter(dtp::b), (App)evx.b.optionalFieldOf("predicate").forGetter(dtp::c), (App)fcd.a.fieldOf("block_state").forGetter(dtp::d), (App)etk.aj.optionalFieldOf("trigger_game_event").forGetter(dtp::e)).apply((Applicative)$$0, dtp::new));

    public dtp(jy $$0, Optional<evx> $$1, fcd $$2, Optional<jd<etk>> $$3) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
    }

    @Override
    public void a(axf $$0, int $$1, dsn $$22, cgk $$32, ftm $$4) {
        is $$5 = is.a($$4).a(this.d);
        if (this.e.map($$2 -> $$2.test($$0, $$5)).orElse(true).booleanValue() && $$0.c($$5, this.f.a($$32.ep(), $$5))) {
            this.g.ifPresent($$3 -> $$0.a($$32, (jd<etk>)$$3, $$5));
        }
    }

    public MapCodec<dtp> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dtp.class, "offset;predicate;blockState;triggerGameEvent", "d", "e", "f", "g"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dtp.class, "offset;predicate;blockState;triggerGameEvent", "d", "e", "f", "g"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dtp.class, "offset;predicate;blockState;triggerGameEvent", "d", "e", "f", "g"}, this, $$0);
    }

    public jy b() {
        return this.d;
    }

    public Optional<evx> c() {
        return this.e;
    }

    public fcd d() {
        return this.f;
    }

    public Optional<jd<etk>> e() {
        return this.g;
    }
}

