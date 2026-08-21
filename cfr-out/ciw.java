/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  org.apache.commons.lang3.mutable.MutableLong
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.apache.commons.lang3.mutable.MutableLong;
import org.jspecify.annotations.Nullable;

public class ciw {
    public static final int a = 48;

    public static cje<cht> a(Predicate<jd<cta>> $$0, cqw<jc> $$1, boolean $$2, Optional<Byte> $$3, BiPredicate<axf, is> $$4) {
        return ciw.a($$0, $$1, $$1, $$2, $$3, $$4);
    }

    public static cje<cht> a(Predicate<jd<cta>> $$02, cqw<jc> $$12, boolean $$2, Optional<Byte> $$3) {
        return ciw.a($$02, $$12, $$12, $$2, $$3, ($$0, $$1) -> true);
    }

    public static cje<cht> a(Predicate<jd<cta>> $$0, cqw<jc> $$1, cqw<jc> $$22, boolean $$3, Optional<Byte> $$4, BiPredicate<axf, is> $$5) {
        int $$6 = 5;
        int $$7 = 20;
        MutableLong $$8 = new MutableLong(0L);
        Long2ObjectOpenHashMap $$9 = new Long2ObjectOpenHashMap();
        ckp<cht> $$10 = cmv.a(arg_0 -> ciw.a($$22, $$3, $$8, (Long2ObjectMap)$$9, $$0, $$5, $$4, arg_0));
        if ($$22 == $$1) {
            return $$10;
        }
        return cmv.a($$2 -> $$2.group($$2.c($$1)).apply((Applicative)$$2, $$1 -> $$10));
    }

    public static @Nullable flp a(chn $$0, Set<Pair<jd<cta>, is>> $$1) {
        if ($$1.isEmpty()) {
            return null;
        }
        HashSet<is> $$2 = new HashSet<is>();
        int $$3 = 1;
        for (Pair<jd<cta>, is> $$4 : $$1) {
            $$3 = Math.max($$3, ((cta)((jd)$$4.getFirst()).a()).c());
            $$2.add((is)$$4.getSecond());
        }
        return $$0.N().a($$2, $$3);
    }

    private static /* synthetic */ App a(cqw $$0, boolean $$1, MutableLong $$2, Long2ObjectMap $$3, Predicate $$4, BiPredicate $$5, Optional $$62, cmv.b $$7) {
        return $$7.group($$7.c($$0)).apply((Applicative)$$7, $$6 -> ($$7, $$82, $$9) -> {
            if ($$1 && $$82.e_()) {
                return false;
            }
            if ($$2.longValue() == 0L) {
                $$2.setValue($$7.au() + (long)$$7.y.a(20));
                return false;
            }
            if ($$7.au() < $$2.longValue()) {
                return false;
            }
            $$2.setValue($$9 + 20L + (long)$$7.G_().a(20));
            csx $$10 = $$7.F();
            $$3.long2ObjectEntrySet().removeIf($$1 -> !((a)$$1.getValue()).b($$9));
            Predicate<is> $$11 = $$2 -> {
                a $$3 = (a)$$3.get($$2.a());
                if ($$3 == null) {
                    return true;
                }
                if (!$$3.c($$9)) {
                    return false;
                }
                $$3.a($$9);
                return true;
            };
            Set<Pair<jd<cta>, is>> $$122 = $$10.c($$4, $$11, $$82.dK(), 48, csx.b.a).limit(5L).filter($$2 -> $$5.test($$7, (is)$$2.getSecond())).collect(Collectors.toSet());
            flp $$13 = ciw.a($$82, $$122);
            if ($$13 != null && $$13.j()) {
                is $$14 = $$13.l();
                $$10.c($$14).ifPresent($$8 -> {
                    $$10.a((Predicate<jd<cta>>)$$4, ($$1, $$2) -> $$2.equals($$14), $$14, 1);
                    $$6.a(jc.a($$7.aq(), $$14));
                    $$62.ifPresent($$2 -> $$7.a((cgk)$$82, (byte)$$2));
                    $$3.clear();
                    $$7.W().b($$14);
                });
            } else {
                for (Pair<jd<cta>, is> $$15 : $$122) {
                    $$3.computeIfAbsent(((is)$$15.getSecond()).a(), $$2 -> new a($$0.y, $$9));
                }
            }
            return true;
        });
    }

    static class a {
        private static final int a = 40;
        private static final int b = 80;
        private static final int c = 400;
        private final bgr d;
        private long e;
        private long f;
        private int g;

        a(bgr $$0, long $$1) {
            this.d = $$0;
            this.a($$1);
        }

        public void a(long $$0) {
            this.e = $$0;
            int $$1 = this.g + this.d.a(40) + 40;
            this.g = Math.min($$1, 400);
            this.f = $$0 + (long)this.g;
        }

        public boolean b(long $$0) {
            return $$0 - this.e < 400L;
        }

        public boolean c(long $$0) {
            return $$0 >= this.f;
        }

        public String toString() {
            return "RetryMarker{, previousAttemptAt=" + this.e + ", nextScheduledAttemptAt=" + this.f + ", currentDelay=" + this.g + "}";
        }
    }
}

