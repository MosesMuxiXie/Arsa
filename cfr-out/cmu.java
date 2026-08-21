/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.List;
import java.util.Optional;

public class cmu {
    public static cje<dcx> a(float $$0) {
        return cmv.a((cmv.b<E> $$1) -> $$1.group($$1.b(cqw.d), $$1.c(cqw.c), $$1.b(cqw.g), $$1.a(cqw.n), $$1.a(cqw.o)).apply((Applicative)$$1, ($$2, $$3, $$4, $$5, $$6) -> ($$62, $$7, $$8) -> {
            if ($$7.e_()) {
                return false;
            }
            if (!$$7.gZ().b().a(dda.b)) {
                return false;
            }
            is $$9 = ((jc)$$1.b($$2)).b();
            Optional<jd<cta>> $$10 = $$62.F().c($$9);
            if ($$10.isEmpty()) {
                return true;
            }
            ((List)$$1.b($$4)).stream().filter($$1 -> $$1 instanceof dcx && $$1 != $$7).map($$0 -> (dcx)$$0).filter(chl::cb).filter($$2 -> cmu.a((jd)$$10.get(), $$2, $$9)).findFirst().ifPresent($$6 -> {
                $$5.b();
                $$6.b();
                $$2.b();
                if ($$6.ev().c(cqw.c).isEmpty()) {
                    cjf.a((chl)$$6, $$9, $$0, 1);
                    $$6.ev().a(cqw.d, jc.a($$62.aq(), $$9));
                    $$62.W().b($$9);
                }
            });
            return true;
        }));
    }

    private static boolean a(jd<cta> $$0, dcx $$1, is $$2) {
        boolean $$3 = $$1.ev().c(cqw.d).isPresent();
        if ($$3) {
            return false;
        }
        Optional<jc> $$4 = $$1.ev().c(cqw.c);
        jd<dda> $$5 = $$1.gZ().b();
        if ($$5.a().b().test($$0)) {
            if ($$4.isEmpty()) {
                return cmu.a($$1, $$2, $$0.a());
            }
            return $$4.get().b().equals($$2);
        }
        return false;
    }

    private static boolean a(cht $$0, is $$1, cta $$2) {
        flp $$3 = $$0.N().a($$1, $$2.c());
        return $$3 != null && $$3.j();
    }
}

