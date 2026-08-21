/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.longs.Long2LongMap
 *  it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap
 *  org.apache.commons.lang3.mutable.MutableInt
 *  org.apache.commons.lang3.mutable.MutableLong
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.apache.commons.lang3.mutable.MutableInt;
import org.apache.commons.lang3.mutable.MutableLong;

public class clc {
    private static final int a = 40;
    private static final int b = 5;
    private static final int c = 20;
    private static final int d = 4;

    public static cje<cht> a(float $$0) {
        Long2LongOpenHashMap $$1 = new Long2LongOpenHashMap();
        MutableLong $$2 = new MutableLong(0L);
        return cmv.a(arg_0 -> clc.a($$2, (Long2LongMap)$$1, $$0, arg_0));
    }

    private static /* synthetic */ App a(MutableLong $$0, Long2LongMap $$1, float $$2, cmv.b $$32) {
        return $$32.group($$32.c(cqw.n), $$32.c(cqw.b)).apply((Applicative)$$32, ($$3, $$42) -> ($$4, $$5, $$6) -> {
            if ($$4.au() - $$0.longValue() < 20L) {
                return false;
            }
            csx $$7 = $$4.F();
            Optional<is> $$8 = $$7.d($$0 -> $$0.a(ctb.n), $$5.dK(), 48, csx.b.c);
            if ($$8.isEmpty() || $$8.get().j($$5.dK()) <= 4.0) {
                return false;
            }
            MutableInt $$9 = new MutableInt(0);
            $$0.setValue($$4.au() + (long)$$4.G_().a(20));
            Predicate<is> $$10 = $$3 -> {
                axf $$4 = $$3.a();
                if ($$1.containsKey($$4)) {
                    return false;
                }
                if ($$9.incrementAndGet() >= 5) {
                    return false;
                }
                $$1.put($$4, $$0.longValue() + 40L);
                return true;
            };
            Set<Pair<jd<cta>, is>> $$11 = $$7.b($$0 -> $$0.a(ctb.n), $$10, $$5.dK(), 48, csx.b.c).collect(Collectors.toSet());
            flp $$122 = ciw.a($$5, $$11);
            if ($$122 != null && $$122.j()) {
                is $$13 = $$122.l();
                Optional<jd<cta>> $$14 = $$7.c($$13);
                if ($$14.isPresent()) {
                    $$3.a(new cqz($$13, $$2, 1));
                    $$4.W().b($$13);
                }
            } else if ($$9.intValue() < 5) {
                $$1.long2LongEntrySet().removeIf($$1 -> $$1.getLongValue() < $$0.longValue());
            }
            return true;
        });
    }
}

