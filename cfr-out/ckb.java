/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import java.util.function.Predicate;

public class ckb {
    public static <T extends chl> cje<chl> a(cgu<? extends T> $$02, int $$1, cqw<T> $$2, float $$3, int $$4) {
        return ckb.a($$02, $$1, (E $$0) -> true, $$0 -> true, $$2, $$3, $$4);
    }

    public static <E extends chl, T extends chl> cje<E> a(cgu<? extends T> $$0, int $$1, Predicate<E> $$22, Predicate<T> $$3, cqw<T> $$4, float $$5, int $$6) {
        int $$7 = $$1 * $$1;
        Predicate<chl> $$8 = $$2 -> $$0.equals($$2.ay()) && $$3.test($$2);
        return cmv.a((cmv.b<E> $$62) -> $$62.group($$62.a($$4), $$62.a(cqw.o), $$62.c(cqw.n), $$62.b(cqw.h)).apply((Applicative)$$62, ($$6, $$7, $$8, $$9) -> ($$10, $$11, $$12) -> {
            cqy $$13 = (cqy)$$62.b($$9);
            if ($$22.test($$11) && $$13.d($$8)) {
                Optional<chl> $$14 = $$13.a($$3 -> $$3.g($$11) <= (double)$$7 && $$8.test((chl)$$3));
                $$14.ifPresent($$5 -> {
                    $$6.a($$5);
                    $$7.a(new cjp((cgk)$$5, true));
                    $$8.a(new cqz(new cjp((cgk)$$5, false), $$5, $$6));
                });
                return true;
            }
            return false;
        }));
    }
}

