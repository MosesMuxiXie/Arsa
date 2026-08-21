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
import java.util.List;
import java.util.function.Function;

abstract class evz
implements evx {
    protected final List<evx> e;

    protected evz(List<evx> $$0) {
        this.e = $$0;
    }

    public static <T extends evz> MapCodec<T> a(Function<List<evx>, T> $$0) {
        return RecordCodecBuilder.mapCodec($$1 -> $$1.group((App)evx.b.listOf().fieldOf("predicates").forGetter($$0 -> $$0.e)).apply((Applicative)$$1, $$0));
    }
}

