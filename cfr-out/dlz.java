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

public final class dlz
extends Record {
    private final jd<bcz> e;
    private final yh f;
    private final float g;
    private final int h;
    public static final Codec<dlz> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bcz.b.fieldOf("sound_event").forGetter(dlz::b), (App)yj.a.fieldOf("description").forGetter(dlz::c), (App)bfm.v.fieldOf("length_in_seconds").forGetter(dlz::d), (App)bfm.a(0, 15).fieldOf("comparator_output").forGetter(dlz::e)).apply((Applicative)$$0, dlz::new));
    public static final aao<xq, dlz> b = aao.a(bcz.d, dlz::b, yj.b, dlz::c, aam.l, dlz::d, aam.h, dlz::e, dlz::new);
    public static final Codec<jd<dlz>> c = amr.a(mj.bj);
    public static final aao<xq, jd<dlz>> d = aam.a(mj.bj, b);
    private static final int i = 20;

    public dlz(jd<bcz> $$0, yh $$1, float $$2, int $$3) {
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
        this.h = $$3;
    }

    public int a() {
        return bgj.d(this.g * 20.0f);
    }

    public boolean a(long $$0) {
        return $$0 >= (long)(this.a() + 20);
    }

    public static Optional<jd<dlz>> a(jf.a $$0, dlt $$1) {
        dly $$2 = $$1.a(ki.al);
        if ($$2 != null) {
            return $$2.a().a($$0);
        }
        return Optional.empty();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{dlz.class, "soundEvent;description;lengthInSeconds;comparatorOutput", "e", "f", "g", "h"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dlz.class, "soundEvent;description;lengthInSeconds;comparatorOutput", "e", "f", "g", "h"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dlz.class, "soundEvent;description;lengthInSeconds;comparatorOutput", "e", "f", "g", "h"}, this, $$0);
    }

    public jd<bcz> b() {
        return this.e;
    }

    public yh c() {
        return this.f;
    }

    public float d() {
        return this.g;
    }

    public int e() {
        return this.h;
    }
}

