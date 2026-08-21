/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class dxz
extends dxs
implements dxq.a {
    public static final MapCodec<dxz> b = dxo.c.fieldOf("biome").xmap(dxz::new, $$0 -> $$0.c).stable();
    private final jd<dxo> c;

    public dxz(jd<dxo> $$0) {
        this.c = $$0;
    }

    @Override
    protected Stream<jd<dxo>> b() {
        return Stream.of(this.c);
    }

    @Override
    protected MapCodec<? extends dxs> a() {
        return b;
    }

    @Override
    public jd<dxo> getNoiseBiome(int $$0, int $$1, int $$2, dxx.f $$3) {
        return this.c;
    }

    @Override
    public jd<dxo> getNoiseBiome(int $$0, int $$1, int $$2) {
        return this.c;
    }

    @Override
    public @Nullable Pair<is, jd<dxo>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<jd<dxo>> $$5, bgr $$6, boolean $$7, dxx.f $$8) {
        if ($$5.test(this.c)) {
            if ($$7) {
                return Pair.of((Object)new is($$0, $$1, $$2), this.c);
            }
            return Pair.of((Object)new is($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
        }
        return null;
    }

    @Override
    public @Nullable Pair<is, jd<dxo>> a(is $$0, int $$1, int $$2, int $$3, Predicate<jd<dxo>> $$4, dxx.f $$5, dwr $$6) {
        return $$4.test(this.c) ? Pair.of((Object)$$0.h(bgj.a($$0.v(), $$6.K_() + 1, $$6.aw() + 1)), this.c) : null;
    }

    @Override
    public Set<jd<dxo>> a(int $$0, int $$1, int $$2, int $$3, dxx.f $$4) {
        return Sets.newHashSet(Set.of(this.c));
    }
}

