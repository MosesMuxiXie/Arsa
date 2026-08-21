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

public final class dpj
extends Record {
    private final int d;
    private final float e;
    public static final float a = 5.0f;
    public static final Codec<dpj> b = RecordCodecBuilder.create($$0 -> $$0.group((App)bfm.q.optionalFieldOf("item_damage_per_attack", (Object)1).forGetter(dpj::a), (App)bfm.u.optionalFieldOf("disable_blocking_for_seconds", (Object)Float.valueOf(0.0f)).forGetter(dpj::b)).apply((Applicative)$$0, dpj::new));
    public static final aao<xq, dpj> c = aao.a(aam.h, dpj::a, aam.l, dpj::b, dpj::new);

    public dpj(int $$0) {
        this($$0, 0.0f);
    }

    public dpj(int $$0, float $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dpj.class, "itemDamagePerAttack;disableBlockingForSeconds", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dpj.class, "itemDamagePerAttack;disableBlockingForSeconds", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dpj.class, "itemDamagePerAttack;disableBlockingForSeconds", "d", "e"}, this, $$0);
    }

    public int a() {
        return this.d;
    }

    public float b() {
        return this.e;
    }
}

