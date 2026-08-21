/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public record zp(gx b, Optional<yh> c) implements yi
{
    public static final MapCodec<zp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)gx.a.fieldOf("selector").forGetter(zp::b), (App)yj.a.optionalFieldOf("separator").forGetter(zp::c)).apply((Applicative)$$0, zp::new));

    public MapCodec<zp> a() {
        return a;
    }

    @Override
    public yw a(@Nullable ed $$0, @Nullable cgk $$1, int $$2) throws CommandSyntaxException {
        if ($$0 == null) {
            return yh.i();
        }
        Optional<yw> $$3 = yk.a($$0, this.c, $$1, $$2);
        return yk.a(this.b.b().b($$0), $$3, cgk::R_);
    }

    @Override
    public <T> Optional<T> a(yn.b<T> $$0, zf $$1) {
        return $$0.accept($$1, this.b.a());
    }

    @Override
    public <T> Optional<T> a(yn.a<T> $$0) {
        return $$0.accept(this.b.a());
    }

    @Override
    public String toString() {
        return "pattern{" + String.valueOf(this.b) + "}";
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{zp.class, "selector;separator", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{zp.class, "selector;separator", "b", "c"}, this, $$0);
    }
}

