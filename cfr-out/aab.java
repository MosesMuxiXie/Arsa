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

public record aab(doy b, boolean c) implements zz
{
    private final doy b;
    private final boolean c;
    public static final MapCodec<aab> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)doy.a.fieldOf("player").forGetter(aab::d), (App)Codec.BOOL.optionalFieldOf("hat", (Object)true).forGetter(aab::e)).apply((Applicative)$$0, aab::new));

    @Override
    public ym b() {
        return new ym.b(this.b, this.c);
    }

    @Override
    public String c() {
        return this.b.d().map($$0 -> "[" + $$0 + " head]").orElse("[unknown player head]");
    }

    public MapCodec<aab> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{aab.class, "player;hat", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aab.class, "player;hat", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aab.class, "player;hat", "b", "c"}, this, $$0);
    }

    public doy d() {
        return this.b;
    }

    public boolean e() {
        return this.c;
    }
}

