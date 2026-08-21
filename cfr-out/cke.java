/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;

public class cke {
    public static ckp<chl> a(int $$0, float $$1, int $$2) {
        return cmv.a((cmv.b<E> $$3) -> $$3.group($$3.c(cqw.n), $$3.a(cqw.b), $$3.a(cqw.D), $$3.a(cqw.u), $$3.a(cqw.o), $$3.a(cqw.s), $$3.a(cqw.r)).apply((Applicative)$$3, ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
            $$11.F().d($$0 -> $$0.a(ctb.n), $$0 -> true, $$12.dK(), $$2 + 1, csx.b.c).filter($$2 -> $$2.a($$12.dI(), (double)$$2)).or(() -> $$11.F().a($$0 -> $$0.a(ctb.n), $$0 -> true, csx.b.c, $$12.dK(), $$0, $$12.ep())).or(() -> $$3.a($$5).map(jc::b)).ifPresent($$10 -> {
                $$7.b();
                $$8.b();
                $$9.b();
                $$10.b();
                $$6.a(jc.a($$11.aq(), $$10));
                if (!$$10.a($$12.dI(), (double)$$2)) {
                    $$4.a(new cqz((is)$$10, $$1, $$2));
                }
            });
            return true;
        }));
    }
}

