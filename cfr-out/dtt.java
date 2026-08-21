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

public final class dtt
extends Record
implements dth {
    private final dnw d;
    private final jy e;
    private final Optional<jd<etk>> f;
    public static final MapCodec<dtt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)dnw.b.fieldOf("properties").forGetter(dtt::b), (App)jy.g.optionalFieldOf("offset", (Object)jy.i).forGetter(dtt::c), (App)etk.aj.optionalFieldOf("trigger_game_event").forGetter(dtt::d)).apply((Applicative)$$0, dtt::new));

    public dtt(dnw $$0) {
        this($$0, jy.i, Optional.of(etk.c));
    }

    public dtt(dnw $$0, jy $$1, Optional<jd<etk>> $$2) {
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
    }

    @Override
    public void a(axf $$0, int $$1, dsn $$2, cgk $$32, ftm $$4) {
        eoh $$7;
        is $$5 = is.a($$4).a(this.e);
        eoh $$6 = $$32.ao().a_($$5);
        if ($$6 != ($$7 = this.d.a($$6)) && $$32.ao().a($$5, $$7, 3)) {
            this.f.ifPresent($$3 -> $$0.a($$32, (jd<etk>)$$3, $$5));
        }
    }

    public MapCodec<dtt> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dtt.class, "properties;offset;triggerGameEvent", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dtt.class, "properties;offset;triggerGameEvent", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dtt.class, "properties;offset;triggerGameEvent", "d", "e", "f"}, this, $$0);
    }

    public dnw b() {
        return this.d;
    }

    public jy c() {
        return this.e;
    }

    public Optional<jd<etk>> d() {
        return this.f;
    }
}

