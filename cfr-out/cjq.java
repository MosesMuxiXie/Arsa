/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.function.Predicate;

public class cjq {
    public static <E extends chl> cje<E> a(Predicate<E> $$0, cqw<?> $$1) {
        return cmv.a($$2 -> $$2.group($$2.b($$1)).apply((Applicative)$$2, $$1 -> ($$2, $$3, $$4) -> {
            if ($$0.test($$3)) {
                $$1.b();
                return true;
            }
            return false;
        }));
    }
}

