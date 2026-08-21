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
import java.util.Set;

public record fsk(fsr b, String c, float d) implements fsi
{
    private final fsr b;
    private final String c;
    private final float d;
    public static final MapCodec<fsk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)fss.a.fieldOf("target").forGetter(fsk::c), (App)Codec.STRING.fieldOf("score").forGetter(fsk::d), (App)Codec.FLOAT.fieldOf("scale").orElse((Object)Float.valueOf(1.0f)).forGetter(fsk::e)).apply((Applicative)$$0, fsk::new));

    @Override
    public fsh a() {
        return fsj.e;
    }

    @Override
    public Set<bhv<?>> b() {
        return this.b.b();
    }

    public static fsk a(fnz.c $$0, String $$1) {
        return fsk.a($$0, $$1, 1.0f);
    }

    public static fsk a(fnz.c $$0, String $$1, float $$2) {
        return new fsk(fso.a($$0), $$1, $$2);
    }

    @Override
    public float b(fnz $$0) {
        fuq $$1 = this.b.a($$0);
        if ($$1 == null) {
            return 0.0f;
        }
        anm $$2 = $$0.d().i();
        fuj $$3 = $$2.a(this.c);
        if ($$3 == null) {
            return 0.0f;
        }
        fun $$4 = $$2.d($$1, $$3);
        if ($$4 == null) {
            return 0.0f;
        }
        return (float)$$4.a() * this.d;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fsk.class, "target;score;scale", "b", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fsk.class, "target;score;scale", "b", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fsk.class, "target;score;scale", "b", "c", "d"}, this, $$0);
    }

    public fsr c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public float e() {
        return this.d;
    }
}

