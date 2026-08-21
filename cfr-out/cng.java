/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;

public class cng {
    public static cje<chl> a() {
        return cmv.a((cmv.b<E> $$0) -> $$0.group($$0.a(cqw.o), $$0.a(cqw.aK), $$0.a(cqw.aJ), $$0.c(cqw.p)).apply((Applicative)$$0, ($$1, $$2, $$3, $$42) -> ($$4, $$5, $$6) -> {
            Optional<is> $$7 = $$0.a($$3).map(cgk::dK).or(() -> $$0.a($$2));
            if ($$7.isEmpty()) {
                return false;
            }
            $$1.a(new cjg($$7.get()));
            return true;
        }));
    }
}

