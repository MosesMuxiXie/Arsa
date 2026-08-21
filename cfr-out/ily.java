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

public final class ily
extends Record
implements ilu {
    private final String c;
    private final String d;
    public static final MapCodec<ily> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.STRING.fieldOf("source").forGetter(ily::b), (App)Codec.STRING.fieldOf("prefix").forGetter(ily::c)).apply((Applicative)$$0, ily::new));

    public ily(String $$0, String $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    @Override
    public void a(baz $$0, ilu.c $$1) {
        amm $$22 = new amm("textures/" + this.c, ".png");
        $$22.a($$0).forEach(($$2, $$3) -> {
            amo $$4 = $$22.b((amo)$$2).f(this.d);
            $$1.a($$4, (bax)$$3);
        });
    }

    public MapCodec<ily> a() {
        return b;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ily.class, "sourcePath;idPrefix", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ily.class, "sourcePath;idPrefix", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ily.class, "sourcePath;idPrefix", "c", "d"}, this, $$0);
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.d;
    }
}

