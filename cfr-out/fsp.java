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

public record fsp(String b) implements fsr
{
    private final String b;
    public static final MapCodec<fsp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.STRING.fieldOf("name").forGetter(fsp::c)).apply((Applicative)$$0, fsp::new));

    public static fsr a(String $$0) {
        return new fsp($$0);
    }

    @Override
    public fsq a() {
        return fss.b;
    }

    @Override
    public fuq a(fnz $$0) {
        return fuq.c(this.b);
    }

    @Override
    public Set<bhv<?>> b() {
        return Set.of();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fsp.class, "name", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fsp.class, "name", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fsp.class, "name", "b"}, this, $$0);
    }

    public String c() {
        return this.b;
    }
}

