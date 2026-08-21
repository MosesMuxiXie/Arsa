/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import java.util.function.Function;

public class cnf {
    public static <E extends dch> cje<E> a(Function<E, Optional<? extends chl>> $$0) {
        return cmv.a((cmv.b<E> $$12) -> $$12.group($$12.c(cqw.aJ), $$12.c(cqw.p), $$12.a(cqw.F)).apply((Applicative)$$12, ($$1, $$2, $$32) -> ($$3, $$4, $$5) -> {
            Optional $$6 = (Optional)$$0.apply($$4);
            if ($$6.filter($$4::H).isEmpty()) {
                return false;
            }
            $$1.a((chl)$$6.get());
            $$32.b();
            return true;
        }));
    }
}

