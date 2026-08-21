/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

public record ghd(int b) implements ggz
{
    public static final MapCodec<ghd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)bfm.l.fieldOf("default").forGetter(ghd::b)).apply((Applicative)$$0, ghd::new));

    @Override
    public int a(dlt $$0, @Nullable hif $$1, @Nullable chl $$2) {
        l $$4;
        fum $$3;
        if ($$2 != null && ($$3 = $$2.cI()) != null && ($$4 = ((fut)$$3).o()).f() != null) {
            return bel.g($$4.f());
        }
        return bel.g(this.b);
    }

    public MapCodec<ghd> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ghd.class, "defaultColor", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ghd.class, "defaultColor", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ghd.class, "defaultColor", "b"}, this, $$0);
    }
}

