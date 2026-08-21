/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;

public class clg {
    public static cje<chl> a(cgu<?> $$0, int $$1) {
        int $$22 = $$1 * $$1;
        return cmv.a($$2 -> $$2.group($$2.a(cqw.o), $$2.c(cqw.r), $$2.b(cqw.h)).apply((Applicative)$$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
            Optional<chl> $$9 = ((cqy)$$2.b($$5)).a($$3 -> $$3.g($$7) <= (double)$$22 && $$0.equals($$3.ay()));
            if ($$9.isEmpty()) {
                return false;
            }
            chl $$10 = $$9.get();
            $$4.a($$10);
            $$3.a(new cjp($$10, true));
            return true;
        }));
    }
}

