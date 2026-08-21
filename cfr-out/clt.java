/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;

public class clt {
    public static <E extends chn> cje<E> a(b<E> $$02) {
        return clt.a((axf $$0, E $$1) -> true, $$02);
    }

    public static <E extends chn> cje<E> a(a<E> $$0, b<E> $$1) {
        return cmv.a((cmv.b<E> $$22) -> $$22.group($$22.c(cqw.p), $$22.a(cqw.F)).apply((Applicative)$$22, ($$2, $$3) -> ($$4, $$5, $$6) -> {
            if (!$$0.test($$4, $$5)) {
                return false;
            }
            Optional<chl> $$7 = $$1.get($$4, $$5);
            if ($$7.isEmpty()) {
                return false;
            }
            chl $$8 = $$7.get();
            if (!$$5.c($$8)) {
                return false;
            }
            $$2.a($$8);
            $$3.b();
            return true;
        }));
    }

    @FunctionalInterface
    public static interface a<E> {
        public boolean test(axf var1, E var2);
    }

    @FunctionalInterface
    public static interface b<E> {
        public Optional<? extends chl> get(axf var1, E var2);
    }
}

