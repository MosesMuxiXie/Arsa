/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;
import org.jspecify.annotations.Nullable;

public record fso(fnz.c c) implements fsr
{
    public static final MapCodec<fso> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)fnz.c.g.fieldOf("target").forGetter(fso::c)).apply((Applicative)$$0, fso::new));
    public static final Codec<fso> b = fnz.c.g.xmap(fso::new, fso::c);

    public static fsr a(fnz.c $$0) {
        return new fso($$0);
    }

    @Override
    public fsq a() {
        return fss.c;
    }

    @Override
    public @Nullable fuq a(fnz $$0) {
        return $$0.c(this.c.a());
    }

    @Override
    public Set<bhv<?>> b() {
        return Set.of(this.c.a());
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fso.class, "target", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fso.class, "target", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fso.class, "target", "c"}, this, $$0);
    }
}

