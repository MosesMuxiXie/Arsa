/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public final class etr
extends Record {
    private final jd<etk> b;
    private final float c;
    private final ftm d;
    private final @Nullable UUID e;
    private final @Nullable UUID f;
    private final @Nullable cgk g;
    public static final Codec<etr> a = RecordCodecBuilder.create($$02 -> $$02.group((App)etk.aj.fieldOf("game_event").forGetter(etr::a), (App)Codec.floatRange((float)0.0f, (float)Float.MAX_VALUE).fieldOf("distance").forGetter(etr::b), (App)ftm.a.fieldOf("pos").forGetter(etr::c), (App)jx.a.lenientOptionalFieldOf("source").forGetter($$0 -> Optional.ofNullable($$0.d())), (App)jx.a.lenientOptionalFieldOf("projectile_owner").forGetter($$0 -> Optional.ofNullable($$0.e()))).apply((Applicative)$$02, ($$0, $$1, $$2, $$3, $$4) -> new etr((jd<etk>)$$0, $$1.floatValue(), (ftm)$$2, $$3.orElse(null), $$4.orElse(null))));

    public etr(jd<etk> $$0, float $$1, ftm $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
        this($$0, $$1, $$2, $$3, $$4, null);
    }

    public etr(jd<etk> $$0, float $$1, ftm $$2, @Nullable cgk $$3) {
        this($$0, $$1, $$2, $$3 == null ? null : $$3.cY(), etr.a($$3), $$3);
    }

    public etr(jd<etk> $$0, float $$1, ftm $$2, @Nullable UUID $$3, @Nullable UUID $$4, @Nullable cgk $$5) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
    }

    private static @Nullable UUID a(@Nullable cgk $$0) {
        dec $$1;
        if ($$0 instanceof dec && ($$1 = (dec)$$0).p() != null) {
            return $$1.p().cY();
        }
        return null;
    }

    public Optional<cgk> a(axf $$0) {
        return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::d));
    }

    public Optional<cgk> b(axf $$02) {
        return this.a($$02).filter($$0 -> $$0 instanceof dec).map($$0 -> (dec)$$0).map(dec::p).or(() -> Optional.ofNullable(this.f).map($$02::d));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{etr.class, "gameEvent;distance;pos;uuid;projectileOwnerUuid;entity", "b", "c", "d", "e", "f", "g"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{etr.class, "gameEvent;distance;pos;uuid;projectileOwnerUuid;entity", "b", "c", "d", "e", "f", "g"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{etr.class, "gameEvent;distance;pos;uuid;projectileOwnerUuid;entity", "b", "c", "d", "e", "f", "g"}, this, $$0);
    }

    public jd<etk> a() {
        return this.b;
    }

    public float b() {
        return this.c;
    }

    public ftm c() {
        return this.d;
    }

    public @Nullable UUID d() {
        return this.e;
    }

    public @Nullable UUID e() {
        return this.f;
    }

    public @Nullable cgk f() {
        return this.g;
    }
}

