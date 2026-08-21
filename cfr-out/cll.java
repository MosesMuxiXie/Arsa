/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.function.Function;
import java.util.function.Predicate;

public class cll {
    public static ckp<chl> a(float $$02, int $$12) {
        return cll.a($$0 -> true, $$1 -> Float.valueOf($$02), $$12);
    }

    public static ckp<chl> a(Predicate<chl> $$0, Function<chl, Float> $$1, int $$2) {
        return cmv.a((cmv.b<E> $$3) -> $$3.group($$3.c(cqw.n), $$3.b(cqw.o)).apply((Applicative)$$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
            if (!$$0.test($$7)) {
                return false;
            }
            $$4.a(new cqz((cks)$$3.b($$5), ((Float)$$1.apply($$7)).floatValue(), $$2));
            return true;
        }));
    }
}

