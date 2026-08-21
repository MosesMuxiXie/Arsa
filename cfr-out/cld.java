/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import java.util.function.Predicate;

public class cld {
    public static cje<chl> a(cho $$0, float $$12) {
        return cld.a((chl $$1) -> $$0.equals($$1.ay().f()), $$12);
    }

    public static ckp<chl> a(cgu<?> $$0, float $$12) {
        return cld.a((chl $$1) -> $$0.equals($$1.ay()), $$12);
    }

    public static ckp<chl> a(float $$02) {
        return cld.a((chl $$0) -> true, $$02);
    }

    public static ckp<chl> a(Predicate<chl> $$0, float $$1) {
        float $$22 = $$1 * $$1;
        return cmv.a((cmv.b<E> $$2) -> $$2.group($$2.c(cqw.o), $$2.b(cqw.h)).apply((Applicative)$$2, ($$3, $$4) -> ($$5, $$6, $$7) -> {
            Optional<chl> $$8 = ((cqy)$$2.b($$4)).a($$0.and($$2 -> $$2.g($$6) <= (double)$$22 && !$$6.z((cgk)$$2)));
            if ($$8.isEmpty()) {
                return false;
            }
            $$3.a(new cjp($$8.get(), true));
            return true;
        }));
    }
}

