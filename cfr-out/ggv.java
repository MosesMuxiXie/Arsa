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

public record ggv(int b, int c) implements ggz
{
    public static final MapCodec<ggv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)bfm.q.optionalFieldOf("index", (Object)0).forGetter(ggv::b), (App)bfm.l.fieldOf("default").forGetter(ggv::c)).apply((Applicative)$$0, ggv::new));

    @Override
    public int a(dlt $$0, @Nullable hif $$1, @Nullable chl $$2) {
        Integer $$4;
        dof $$3 = $$0.a(ki.s);
        if ($$3 != null && ($$4 = $$3.d(this.b)) != null) {
            return bel.g($$4);
        }
        return bel.g(this.c);
    }

    public MapCodec<ggv> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ggv.class, "index;defaultColor", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ggv.class, "index;defaultColor", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ggv.class, "index;defaultColor", "b", "c"}, this, $$0);
    }
}

