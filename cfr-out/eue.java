/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.BitSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.LongStream;

public final class eue {
    private static final BitSet c = new BitSet(0);
    private static final Codec<BitSet> d = Codec.LONG_STREAM.xmap($$0 -> BitSet.valueOf($$0.toArray()), $$0 -> LongStream.of($$0.toLongArray()));
    private static final Codec<erj> e = mi.m.q().comapFlatMap($$0 -> $$0 == erj.c ? DataResult.error(() -> "target_status cannot be empty") : DataResult.success((Object)$$0), Function.identity());
    public static final Codec<eue> a = RecordCodecBuilder.create($$02 -> $$02.group((App)e.fieldOf("target_status").forGetter(eue::a), (App)d.lenientOptionalFieldOf("missing_bedrock").forGetter($$0 -> $$0.h.isEmpty() ? Optional.empty() : Optional.of($$0.h))).apply((Applicative)$$02, eue::new));
    private static final Set<amt<dxo>> f = Set.of(dxv.ab, dxv.aa, dxv.ac);
    public static final dwq b = new dwq(){

        @Override
        public int L_() {
            return 64;
        }

        @Override
        public int K_() {
            return -64;
        }
    };
    private final erj g;
    private final BitSet h;

    private eue(erj $$0, Optional<BitSet> $$1) {
        this.g = $$0;
        this.h = $$1.orElse(c);
    }

    public static void a(erb $$0) {
        int $$12 = 4;
        is.b(0, 0, 0, 15, 4, 15).forEach($$1 -> {
            if ($$0.a_((is)$$1).a(dzs.I)) {
                $$0.a((is)$$1, dzs.ui.m());
            }
        });
    }

    public void b(erb $$0) {
        dwq $$12 = $$0.B();
        int $$2 = $$12.K_();
        int $$3 = $$12.aw();
        for (int $$4 = 0; $$4 < 16; ++$$4) {
            for (int $$5 = 0; $$5 < 16; ++$$5) {
                if (!this.a($$4, $$5)) continue;
                is.b($$4, $$2, $$5, $$4, $$3, $$5).forEach($$1 -> $$0.a((is)$$1, dzs.a.m()));
            }
        }
    }

    public erj a() {
        return this.g;
    }

    public boolean b() {
        return !this.h.isEmpty();
    }

    public boolean a(int $$0, int $$1) {
        return this.h.get(($$1 & 0xF) * 16 + ($$0 & 0xF));
    }

    public static dxr a(dxr $$0, eqf $$1) {
        if (!$$1.A()) {
            return $$0;
        }
        Predicate<amt> $$2 = f::contains;
        return ($$3, $$4, $$5, $$6) -> {
            jd<dxo> $$7 = $$0.getNoiseBiome($$3, $$4, $$5, $$6);
            if ($$7.a($$2)) {
                return $$7;
            }
            return $$1.getNoiseBiome($$3, 0, $$5);
        };
    }
}

