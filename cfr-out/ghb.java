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

public record ghb(int b) implements ggz
{
    public static final MapCodec<ghb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)bfm.l.fieldOf("default").forGetter(ghb::b)).apply((Applicative)$$0, ghb::new));

    public ghb() {
        this(dot.c.a());
    }

    @Override
    public int a(dlt $$0, @Nullable hif $$1, @Nullable chl $$2) {
        dot $$3 = $$0.a(ki.S);
        if ($$3 != null) {
            return bel.g($$3.a());
        }
        return bel.g(this.b);
    }

    public MapCodec<ghb> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ghb.class, "defaultColor", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ghb.class, "defaultColor", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ghb.class, "defaultColor", "b"}, this, $$0);
    }
}

