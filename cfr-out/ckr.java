/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.List;
import java.util.Optional;

public class ckr {
    public static cje<dcx> a() {
        return cmv.a((cmv.b<E> $$0) -> $$0.group($$0.b(cqw.c), $$0.b(cqw.g)).apply((Applicative)$$0, ($$1, $$2) -> ($$3, $$42, $$5) -> {
            jc $$6 = (jc)$$0.b($$1);
            $$3.F().c($$6.b()).ifPresent($$4 -> ((List)$$0.b($$2)).stream().filter($$1 -> $$1 instanceof dcx && $$1 != $$42).map($$0 -> (dcx)$$0).filter(chl::cb).filter($$2 -> ckr.a($$6, $$4, $$2)).reduce((dcx)$$42, ckr::a));
            return true;
        }));
    }

    private static dcx a(dcx $$0, dcx $$1) {
        dcx $$5;
        dcx $$4;
        if ($$0.d() > $$1.d()) {
            dcx $$2 = $$0;
            dcx $$3 = $$1;
        } else {
            $$4 = $$1;
            $$5 = $$0;
        }
        $$5.ev().b(cqw.c);
        return $$4;
    }

    private static boolean a(jc $$0, jd<cta> $$1, dcx $$2) {
        Optional<jc> $$3 = $$2.ev().c(cqw.c);
        return $$3.isPresent() && $$0.equals($$3.get()) && ckr.a($$1, $$2.gZ().b());
    }

    private static boolean a(jd<cta> $$0, jd<dda> $$1) {
        return $$1.a().b().test($$0);
    }
}

