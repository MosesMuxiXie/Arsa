/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.function.Predicate;

public class ckl {
    public static <T extends chn> ckp<T> a(int $$02) {
        return ckl.a($$0 -> true, $$02);
    }

    public static <T extends chn> ckp<T> a(Predicate<T> $$0, int $$1) {
        return cmv.a((cmv.b<E> $$2) -> $$2.group($$2.a(cqw.o), $$2.b(cqw.p), $$2.c(cqw.q), $$2.b(cqw.h)).apply((Applicative)$$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
            chl $$10 = (chl)$$2.b($$4);
            if ($$0.test($$8) && !ckl.a($$8) && $$8.h($$10) && ((cqy)$$2.b($$6)).a($$10)) {
                $$3.a(new cjp($$10, true));
                $$8.a(cdb.a);
                $$8.c($$7, (cgk)$$10);
                $$5.a(true, $$1);
                return true;
            }
            return false;
        }));
    }

    private static boolean a(chn $$0) {
        return $$0.b($$0::g);
    }
}

