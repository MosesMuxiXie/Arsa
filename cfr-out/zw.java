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
import java.util.stream.Stream;

public record zw(amo b) implements zt
{
    public static final MapCodec<zw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)amo.a.fieldOf("storage").forGetter(zw::b)).apply((Applicative)$$0, zw::new));

    @Override
    public Stream<uz> a(ed $$0) {
        uz $$1 = $$0.m().aL().a(this.b);
        return Stream.of($$1);
    }

    public MapCodec<zw> a() {
        return a;
    }

    @Override
    public String toString() {
        return "storage=" + String.valueOf(this.b);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{zw.class, "id", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{zw.class, "id", "b"}, this, $$0);
    }
}

