/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;

public class clp {
    private static final float a = 0.3f;

    public static ckp<chl> a() {
        return cmv.a((cmv.b<E> $$0) -> $$0.group($$0.a(cqw.n), $$0.a(cqw.o), $$0.b(cqw.e), $$0.b(cqw.h), $$0.c(cqw.r)).apply((Applicative)$$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
            jc $$9 = (jc)$$0.b($$3);
            cqy $$10 = (cqy)$$0.b($$4);
            if ($$6.G_().a(100) == 0 && $$6.aq() == $$9.a() && $$9.b().a($$7.dI(), 4.0) && $$10.d($$0 -> cgu.bL.equals($$0.ay()))) {
                $$10.a($$1 -> cgu.bL.equals($$1.ay()) && $$1.g($$7) <= 32.0).ifPresent($$3 -> {
                    $$5.a($$3);
                    $$2.a(new cjp((cgk)$$3, true));
                    $$1.a(new cqz(new cjp((cgk)$$3, false), 0.3f, 1));
                });
                return true;
            }
            return false;
        }));
    }
}

