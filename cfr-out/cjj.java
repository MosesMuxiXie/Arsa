/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.function.Predicate;

public class cjj {
    public static <E extends chl, T> cje<E> a(Predicate<E> $$0, cqw<? extends T> $$1, cqw<T> $$2, ccn $$3) {
        return cmv.a($$42 -> $$42.group($$42.b($$1), $$42.c($$2)).apply((Applicative)$$42, ($$3, $$4) -> ($$5, $$6, $$7) -> {
            if (!$$0.test($$6)) {
                return false;
            }
            $$4.a($$42.b($$3), $$3.a($$5.y));
            return true;
        }));
    }
}

