/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import java.util.function.Function;

public class clj {
    private static final int a = 1;

    public static cje<chn> a(float $$0) {
        return clj.a($$1 -> Float.valueOf($$0));
    }

    public static cje<chn> a(Function<chl, Float> $$0) {
        return cmv.a((cmv.b<E> $$1) -> $$1.group($$1.a(cqw.n), $$1.a(cqw.o), $$1.b(cqw.p), $$1.a(cqw.h)).apply((Applicative)$$1, ($$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
            chl $$9 = (chl)$$1.b($$4);
            Optional $$10 = $$1.a($$5);
            if ($$10.isPresent() && ((cqy)$$10.get()).a($$9) && cjf.a($$7, $$9, 1)) {
                $$2.b();
            } else {
                $$3.a(new cjp($$9, true));
                $$2.a(new cqz(new cjp($$9, false), ((Float)$$0.apply($$7)).floatValue(), 0));
            }
            return true;
        }));
    }
}

