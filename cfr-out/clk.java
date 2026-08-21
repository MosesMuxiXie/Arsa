/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;

public class clk {
    public static ckp<dcx> a(cqw<jc> $$0, float $$1, int $$2, int $$3, int $$4) {
        return cmv.a($$5 -> $$5.group($$5.a(cqw.F), $$5.c(cqw.n), $$5.b($$0)).apply((Applicative)$$5, ($$6, $$7, $$8) -> ($$9, $$10, $$11) -> {
            jc $$12 = (jc)$$5.b($$8);
            Optional $$13 = $$5.a($$6);
            if ($$12.a() != $$9.aq() || $$13.isPresent() && $$9.au() - (Long)$$13.get() > (long)$$4) {
                $$10.a($$0);
                $$8.b();
                $$6.a($$11);
            } else if ($$12.b().k($$10.dK()) > $$3) {
                ftm $$14 = null;
                int $$15 = 0;
                int $$16 = 1000;
                while ($$14 == null || is.a($$14).k($$10.dK()) > $$3) {
                    $$14 = cso.a((cht)$$10, 15, 7, ftm.c($$12.b()), 1.5707963705062866);
                    if (++$$15 != 1000) continue;
                    $$10.a($$0);
                    $$8.b();
                    $$6.a($$11);
                    return true;
                }
                $$7.a(new cqz($$14, $$1, $$2));
            } else if ($$12.b().k($$10.dK()) > $$2) {
                $$7.a(new cqz($$12.b(), $$1, $$2));
            }
            return true;
        }));
    }
}

