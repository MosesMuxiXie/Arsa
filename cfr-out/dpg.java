/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

public final class dpg
extends Record {
    private final float c;
    private final Optional<amo> d;
    public static final Codec<dpg> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bfm.v.fieldOf("seconds").forGetter(dpg::b), (App)amo.a.optionalFieldOf("cooldown_group").forGetter(dpg::c)).apply((Applicative)$$0, dpg::new));
    public static final aao<xq, dpg> b = aao.a(aam.l, dpg::b, amo.b.a(aam::a), dpg::c, dpg::new);

    public dpg(float $$0) {
        this($$0, Optional.empty());
    }

    public dpg(float $$0, Optional<amo> $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    public int a() {
        return (int)(this.c * 20.0f);
    }

    public void a(dlt $$0, chl $$1) {
        if ($$1 instanceof ddm) {
            ddm $$2 = (ddm)$$1;
            $$2.hh().a($$0, this.a());
        }
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dpg.class, "seconds;cooldownGroup", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dpg.class, "seconds;cooldownGroup", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dpg.class, "seconds;cooldownGroup", "c", "d"}, this, $$0);
    }

    public float b() {
        return this.c;
    }

    public Optional<amo> c() {
        return this.d;
    }
}

