/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.function.Predicate;

public class cjy {
    public static cje<chl> a(float $$02, boolean $$1, int $$2) {
        return cjy.a($$0 -> true, $$02, $$1, $$2);
    }

    public static <E extends chl> cje<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
        return cmv.a((cmv.b<E> $$42) -> {
            cmv $$52 = $$2 ? $$42.a(cqw.n) : $$42.c(cqw.n);
            return $$42.group($$42.a(cqw.o), $$52, $$42.b(cqw.M), $$42.a(cqw.ba)).apply((Applicative)$$42, ($$4, $$5, $$6, $$7) -> ($$8, $$9, $$10) -> {
                czl $$11 = (czl)$$42.b($$6);
                if ($$42.a($$7).isEmpty() && $$0.test($$9) && $$11.a((cgk)$$9, (double)$$3) && $$9.ao().w().a($$11.dK()) && $$9.gn()) {
                    cqz $$12 = new cqz(new cjp($$11, false), $$1, 0);
                    $$4.a(new cjp($$11, true));
                    $$5.a($$12);
                    return true;
                }
                return false;
            });
        });
    }
}

