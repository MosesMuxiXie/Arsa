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

public final class dur
extends Record {
    private final duq e;
    private final yh f;
    public static final Codec<dur> a = RecordCodecBuilder.create($$0 -> $$0.group((App)duq.b.forGetter(dur::a), (App)yj.a.fieldOf("description").forGetter(dur::b)).apply((Applicative)$$0, dur::new));
    public static final aao<xq, dur> b = aao.a(duq.c, dur::a, yj.b, dur::b, dur::new);
    public static final Codec<jd<dur>> c = amq.a(mj.bz, a);
    public static final aao<xq, jd<dur>> d = aam.a(mj.bz, b);

    public dur(duq $$0, yh $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dur.class, "assets;description", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dur.class, "assets;description", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dur.class, "assets;description", "e", "f"}, this, $$0);
    }

    public duq a() {
        return this.e;
    }

    public yh b() {
        return this.f;
    }
}

