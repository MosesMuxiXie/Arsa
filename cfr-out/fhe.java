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

public record fhe(amt<fgy> c, cbn<amt<fgy>> d) implements fha
{
    static MapCodec<fhe> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)amt.a(mj.bt).fieldOf("alias").forGetter(fhe::c), (App)cbn.b(amt.a(mj.bt)).fieldOf("targets").forGetter(fhe::d)).apply((Applicative)$$0, fhe::new));

    @Override
    public void a(bgr $$0, BiConsumer<amt<fgy>, amt<fgy>> $$12) {
        this.d.a($$0).ifPresent($$1 -> $$12.accept(this.c, (amt<fgy>)$$1));
    }

    @Override
    public Stream<amt<fgy>> a() {
        return this.d.d().stream().map(cbm::a);
    }

    public MapCodec<fhe> b() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fhe.class, "alias;targets", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fhe.class, "alias;targets", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fhe.class, "alias;targets", "c", "d"}, this, $$0);
    }
}

