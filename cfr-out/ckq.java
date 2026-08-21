/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.Applicative;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ckq {
    private static final int a = 20;
    private static final int b = 8;
    private static final float c = 0.6f;
    private static final float d = 0.6f;
    private static final int e = 5;
    private static final int f = 10;

    public static cje<cht> a() {
        return cmv.a((cmv.b<E> $$0) -> $$0.group($$0.b(cqw.i), $$0.c(cqw.n), $$0.a(cqw.o), $$0.a(cqw.r)).apply((Applicative)$$0, ($$1, $$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
            if ($$5.G_().a(10) != 0) {
                return false;
            }
            List $$8 = (List)$$0.b($$1);
            Optional<chl> $$9 = $$8.stream().filter($$1 -> ckq.a($$6, $$1)).findAny();
            if ($$9.isPresent()) {
                for (int $$10 = 0; $$10 < 10; ++$$10) {
                    ftm $$11 = csr.a($$6, 20, 8);
                    if ($$11 == null || !$$5.e(is.a($$11))) continue;
                    $$2.a(new cqz($$11, 0.6f, 0));
                    break;
                }
                return true;
            }
            Optional<chl> $$122 = ckq.a($$8);
            if ($$122.isPresent()) {
                ckq.a($$4, $$3, $$2, $$122.get());
                return true;
            }
            $$8.stream().findAny().ifPresent($$3 -> ckq.a($$4, $$3, $$2, $$3));
            return true;
        }));
    }

    private static void a(cmw<?, chl> $$0, cmw<?, cks> $$1, cmw<?, cqz> $$2, chl $$3) {
        $$0.a($$3);
        $$1.a(new cjp($$3, true));
        $$2.a(new cqz(new cjp($$3, false), 0.6f, 1));
    }

    private static Optional<chl> a(List<chl> $$02) {
        Map<chl, Integer> $$1 = ckq.b($$02);
        return $$1.entrySet().stream().sorted(Comparator.comparingInt(Map.Entry::getValue)).filter($$0 -> (Integer)$$0.getValue() > 0 && (Integer)$$0.getValue() <= 5).map(Map.Entry::getKey).findFirst();
    }

    private static Map<chl, Integer> b(List<chl> $$0) {
        HashMap $$1 = Maps.newHashMap();
        $$0.stream().filter(ckq::b).forEach($$12 -> $$1.compute(ckq.a($$12), ($$0, $$1) -> $$1 == null ? 1 : $$1 + 1));
        return $$1;
    }

    private static chl a(chl $$0) {
        return $$0.ev().c(cqw.r).get();
    }

    private static boolean b(chl $$0) {
        return $$0.ev().c(cqw.r).isPresent();
    }

    private static boolean a(chl $$0, chl $$12) {
        return $$12.ev().c(cqw.r).filter($$1 -> $$1 == $$0).isPresent();
    }
}

