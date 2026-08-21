/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;

public class cjx {
    private static is a(chn $$0, is $$1) {
        bgr $$2 = $$0.ao().y;
        return $$1.b(cjx.a($$2), 0, cjx.a($$2));
    }

    private static int a(bgr $$0) {
        return $$0.a(3) - 1;
    }

    public static <E extends chn> ckp<E> a(cqw<is> $$0, int $$1, float $$2) {
        return cmv.a((cmv.b<E> $$32) -> $$32.group($$32.b($$0), $$32.c(cqw.p), $$32.c(cqw.n), $$32.a(cqw.o)).apply((Applicative)$$32, ($$3, $$42, $$52, $$62) -> ($$4, $$5, $$6) -> {
            is $$7 = (is)$$32.b($$3);
            boolean $$8 = $$7.a($$5.dK(), (double)$$1);
            if (!$$8) {
                cjf.a($$5, cjx.a($$5, $$7), $$2, $$1);
            }
            return true;
        }));
    }
}

