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
import java.util.Optional;

public final class dtw
extends Record
implements dth {
    private final jh<cgu<?>> d;
    private final boolean e;
    public static final MapCodec<dtw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)js.a(mj.F).fieldOf("entity").forGetter(dtw::b), (App)Codec.BOOL.optionalFieldOf("join_team", (Object)false).forGetter(dtw::c)).apply((Applicative)$$0, dtw::new));

    public dtw(jh<cgu<?>> $$0, boolean $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    @Override
    public void a(axf $$0, int $$1, dsn $$2, cgk $$3, ftm $$4) {
        is $$5 = is.a($$4);
        if (!dwo.p($$5)) {
            return;
        }
        Optional<jd<cgu<?>>> $$6 = this.b().a($$0.G_());
        if ($$6.isEmpty()) {
            return;
        }
        Object $$7 = $$6.get().a().a($$0, $$5, cgt.k);
        if ($$7 == null) {
            return;
        }
        if ($$7 instanceof chk) {
            chk $$8 = (chk)$$7;
            chl chl2 = $$2.c();
            if (chl2 instanceof axg) {
                axg $$9 = (axg)chl2;
                $$8.b($$9);
            }
        }
        if (this.e && $$3.cI() != null) {
            $$0.i().a(((cgk)$$7).da(), $$3.cI());
        }
        ((cgk)$$7).b($$4.g, $$4.h, $$4.i, ((cgk)$$7).ec(), ((cgk)$$7).ee());
    }

    public MapCodec<dtw> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dtw.class, "entityTypes;joinTeam", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dtw.class, "entityTypes;joinTeam", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dtw.class, "entityTypes;joinTeam", "d", "e"}, this, $$0);
    }

    public jh<cgu<?>> b() {
        return this.d;
    }

    public boolean c() {
        return this.e;
    }
}

