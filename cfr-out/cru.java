/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.longs.Long2LongMap
 *  it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap
 */
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cru
extends csd<chn> {
    private static final int a = 40;
    private static final int b = 5;
    private static final int c = 20;
    private final Long2LongMap d = new Long2LongOpenHashMap();
    private int e;
    private long f;

    public cru() {
        super(20);
    }

    @Override
    public Set<cqw<?>> a() {
        return ImmutableSet.of(cqw.x);
    }

    @Override
    protected void a(axf $$02, chn $$1) {
        Predicate<is> $$3;
        if (!$$1.e_()) {
            return;
        }
        this.e = 0;
        this.f = $$02.au() + (long)$$02.G_().a(20);
        csx $$2 = $$02.F();
        Set<Pair<jd<cta>, is>> $$4 = $$2.b($$0 -> $$0.a(ctb.n), $$3 = $$0 -> {
            long $$1 = $$0.a();
            if (this.d.containsKey($$1)) {
                return false;
            }
            if (++this.e >= 5) {
                return false;
            }
            this.d.put($$1, this.f + 40L);
            return true;
        }, $$1.dK(), 48, csx.b.c).collect(Collectors.toSet());
        flp $$5 = ciw.a($$1, $$4);
        if ($$5 != null && $$5.j()) {
            is $$6 = $$5.l();
            Optional<jd<cta>> $$7 = $$2.c($$6);
            if ($$7.isPresent()) {
                $$1.ev().a(cqw.x, $$6);
            }
        } else if (this.e < 5) {
            this.d.long2LongEntrySet().removeIf($$0 -> $$0.getLongValue() < this.f);
        }
    }
}

