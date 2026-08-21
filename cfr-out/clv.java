/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class clv {
    public static cje<chl> a(Function<chl, Optional<cks>> $$0, Predicate<chl> $$1, int $$2, int $$3, float $$4) {
        return cmv.a($$52 -> $$52.group($$52.a(cqw.o), $$52.a(cqw.n)).apply((Applicative)$$52, ($$5, $$6) -> ($$7, $$8, $$9) -> {
            Optional $$10 = (Optional)$$0.apply($$8);
            if ($$10.isEmpty() || !$$1.test($$8)) {
                return false;
            }
            cks $$11 = (cks)$$10.get();
            if ($$8.dI().a((jn)$$11.a(), (double)$$3)) {
                return false;
            }
            cks $$12 = (cks)$$10.get();
            $$5.a($$12);
            $$6.a(new cqz($$12, $$4, $$2));
            return true;
        }));
    }
}

