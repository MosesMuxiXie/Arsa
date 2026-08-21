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

public final class cxv
extends Record {
    private final jd<bcz> e;
    private final jd<bcz> f;
    private final jd<bcz> g;
    private final jd<bcz> h;
    private final jd<bcz> i;
    private final jd<bcz> j;
    public static final Codec<cxv> a = cxv.g();
    public static final Codec<cxv> b = cxv.g();
    public static final Codec<jd<cxv>> c = amr.a(mj.bC);
    public static final aao<xq, jd<cxv>> d = aam.b(mj.bC);

    public cxv(jd<bcz> $$0, jd<bcz> $$1, jd<bcz> $$2, jd<bcz> $$3, jd<bcz> $$4, jd<bcz> $$5) {
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
        this.h = $$3;
        this.i = $$4;
        this.j = $$5;
    }

    private static Codec<cxv> g() {
        return RecordCodecBuilder.create($$0 -> $$0.group((App)bcz.b.fieldOf("ambient_sound").forGetter(cxv::a), (App)bcz.b.fieldOf("death_sound").forGetter(cxv::b), (App)bcz.b.fieldOf("growl_sound").forGetter(cxv::c), (App)bcz.b.fieldOf("hurt_sound").forGetter(cxv::d), (App)bcz.b.fieldOf("pant_sound").forGetter(cxv::e), (App)bcz.b.fieldOf("whine_sound").forGetter(cxv::f)).apply((Applicative)$$0, cxv::new));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cxv.class, "ambientSound;deathSound;growlSound;hurtSound;pantSound;whineSound", "e", "f", "g", "h", "i", "j"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cxv.class, "ambientSound;deathSound;growlSound;hurtSound;pantSound;whineSound", "e", "f", "g", "h", "i", "j"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cxv.class, "ambientSound;deathSound;growlSound;hurtSound;pantSound;whineSound", "e", "f", "g", "h", "i", "j"}, this, $$0);
    }

    public jd<bcz> a() {
        return this.e;
    }

    public jd<bcz> b() {
        return this.f;
    }

    public jd<bcz> c() {
        return this.g;
    }

    public jd<bcz> d() {
        return this.h;
    }

    public jd<bcz> e() {
        return this.i;
    }

    public jd<bcz> f() {
        return this.j;
    }
}

