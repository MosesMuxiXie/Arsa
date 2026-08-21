/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;

public class ckm {
    private static final int a = 1;

    public static cje<chl> a(float $$0) {
        return cmv.a($$1 -> $$1.group($$1.a(cqw.o), $$1.c(cqw.n), $$1.b(cqw.t)).apply((Applicative)$$1, ($$2, $$3, $$4) -> ($$5, $$6, $$7) -> {
            if ($$6.cq()) {
                return false;
            }
            cgk $$8 = (cgk)$$1.b($$4);
            if ($$8.a((cgk)$$6, 1.0)) {
                $$6.o($$8);
            } else {
                $$2.a(new cjp($$8, true));
                $$3.a(new cqz(new cjp($$8, false), $$0, 1));
            }
            return true;
        }));
    }
}

