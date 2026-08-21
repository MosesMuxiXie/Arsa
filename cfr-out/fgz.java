/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public record fgz(amt<fgy> c, amt<fgy> d) implements fha
{
    static MapCodec<fgz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)amt.a(mj.bt).fieldOf("alias").forGetter(fgz::c), (App)amt.a(mj.bt).fieldOf("target").forGetter(fgz::d)).apply((Applicative)$$0, fgz::new));

    @Override
    public void a(bgr $$0, BiConsumer<amt<fgy>, amt<fgy>> $$1) {
        $$1.accept(this.c, this.d);
    }

    @Override
    public Stream<amt<fgy>> a() {
        return Stream.of(this.d);
    }

    public MapCodec<fgz> b() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fgz.class, "alias;target", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fgz.class, "alias;target", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fgz.class, "alias;target", "c", "d"}, this, $$0);
    }
}

