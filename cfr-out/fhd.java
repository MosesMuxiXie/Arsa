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
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public record fhd(cbn<List<fha>> c) implements fha
{
    static MapCodec<fhd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)cbn.b(Codec.list(fha.b)).fieldOf("groups").forGetter(fhd::c)).apply((Applicative)$$0, fhd::new));

    @Override
    public void a(bgr $$0, BiConsumer<amt<fgy>, amt<fgy>> $$1) {
        this.c.a($$0).ifPresent($$22 -> $$22.forEach($$2 -> $$2.a($$0, $$1)));
    }

    @Override
    public Stream<amt<fgy>> a() {
        return this.c.d().stream().flatMap($$0 -> ((List)$$0.a()).stream()).flatMap(fha::a);
    }

    public MapCodec<fhd> b() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fhd.class, "groups", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fhd.class, "groups", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fhd.class, "groups", "c"}, this, $$0);
    }
}

