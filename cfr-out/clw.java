/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;

public class clw {
    private static final int a = 200;

    public static <E extends chn> cje<E> a(b<E> $$02) {
        return clw.a((axf $$0, chl $$1) -> false, $$02, true);
    }

    public static <E extends chn> cje<E> a(a $$02) {
        return clw.a($$02, (axf $$0, E $$1, chl $$2) -> {}, true);
    }

    public static <E extends chn> cje<E> a() {
        return clw.a((axf $$0, chl $$1) -> false, (axf $$0, E $$1, chl $$2) -> {}, true);
    }

    public static <E extends chn> cje<E> a(a $$0, b<E> $$1, boolean $$2) {
        return cmv.a((cmv.b<E> $$3) -> $$3.group($$3.b(cqw.p), $$3.a(cqw.F)).apply((Applicative)$$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
            chl $$9 = (chl)$$3.b($$4);
            if (!$$7.c($$9) || $$2 && clw.a($$7, $$3.a($$5)) || !$$9.cb() || $$9.ao() != $$7.ao() || $$0.test($$6, $$9)) {
                $$1.accept($$6, $$7, $$9);
                $$4.b();
                return true;
            }
            return true;
        }));
    }

    private static boolean a(chl $$0, Optional<Long> $$1) {
        return $$1.isPresent() && $$0.ao().au() - $$1.get() > 200L;
    }

    @FunctionalInterface
    public static interface a {
        public boolean test(axf var1, chl var2);
    }

    @FunctionalInterface
    public static interface b<E> {
        public void accept(axf var1, E var2, chl var3);
    }
}

