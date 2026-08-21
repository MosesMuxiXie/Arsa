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

public record ghc(int b) implements ggz
{
    public static final MapCodec<ghc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)bfm.l.fieldOf("default").forGetter(ghc::b)).apply((Applicative)$$0, ghc::new));

    public ghc() {
        this(-13083194);
    }

    @Override
    public int a(dlt $$0, @Nullable hif $$1, @Nullable chl $$2) {
        dnr $$3 = $$0.a(ki.Y);
        if ($$3 != null) {
            return bel.g($$3.a(this.b));
        }
        return bel.g(this.b);
    }

    public MapCodec<ghc> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ghc.class, "defaultColor", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ghc.class, "defaultColor", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ghc.class, "defaultColor", "b"}, this, $$0);
    }
}

