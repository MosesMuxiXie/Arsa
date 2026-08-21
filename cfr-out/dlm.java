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

public final class dlm
extends Record {
    private final jd<bcz> e;
    private final float f;
    private final float g;
    private final yh h;
    public static final Codec<dlm> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bcz.b.fieldOf("sound_event").forGetter(dlm::a), (App)bfm.v.fieldOf("use_duration").forGetter(dlm::b), (App)bfm.v.fieldOf("range").forGetter(dlm::c), (App)yj.a.fieldOf("description").forGetter(dlm::d)).apply((Applicative)$$0, dlm::new));
    public static final aao<xq, dlm> b = aao.a(bcz.d, dlm::a, aam.l, dlm::b, aam.l, dlm::c, yj.b, dlm::d, dlm::new);
    public static final Codec<jd<dlm>> c = amq.a(mj.bi, a);
    public static final aao<xq, jd<dlm>> d = aam.a(mj.bi, b);

    public dlm(jd<bcz> $$0, float $$1, float $$2, yh $$3) {
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
        this.h = $$3;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dlm.class, "soundEvent;useDuration;range;description", "e", "f", "g", "h"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dlm.class, "soundEvent;useDuration;range;description", "e", "f", "g", "h"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dlm.class, "soundEvent;useDuration;range;description", "e", "f", "g", "h"}, this, $$0);
    }

    public jd<bcz> a() {
        return this.e;
    }

    public float b() {
        return this.f;
    }

    public float c() {
        return this.g;
    }

    public yh d() {
        return this.h;
    }
}

