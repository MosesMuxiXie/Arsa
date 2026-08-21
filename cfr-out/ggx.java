/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.ints.IntList
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

public record ggx(int b) implements ggz
{
    public static final MapCodec<ggx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)bfm.l.fieldOf("default").forGetter(ggx::b)).apply((Applicative)$$0, ggx::new));

    public ggx() {
        this(-7697782);
    }

    @Override
    public int a(dlt $$0, @Nullable hif $$1, @Nullable chl $$2) {
        dok $$3 = $$0.a(ki.ap);
        IntList $$4 = $$3 != null ? $$3.b() : IntList.of();
        int $$5 = $$4.size();
        if ($$5 == 0) {
            return this.b;
        }
        if ($$5 == 1) {
            return bel.g($$4.getInt(0));
        }
        int $$6 = 0;
        int $$7 = 0;
        int $$8 = 0;
        for (int $$9 = 0; $$9 < $$5; ++$$9) {
            int $$10 = $$4.getInt($$9);
            $$6 += bel.c($$10);
            $$7 += bel.d($$10);
            $$8 += bel.e($$10);
        }
        return bel.a($$6 / $$5, $$7 / $$5, $$8 / $$5);
    }

    public MapCodec<ggx> a() {
        return a;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ggx.class, "defaultColor", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ggx.class, "defaultColor", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ggx.class, "defaultColor", "b"}, this, $$0);
    }
}

