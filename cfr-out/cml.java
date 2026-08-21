/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.List;
import java.util.function.Predicate;

public class cml {
    private static final int a = 16;

    public static cje<chl> a(Predicate<jd<cta>> $$0, cqw<jc> $$1) {
        return cmv.a($$22 -> $$22.group($$22.b($$1)).apply((Applicative)$$22, $$2 -> ($$3, $$4, $$5) -> {
            jc $$6 = (jc)$$22.b($$2);
            is $$7 = $$6.b();
            if ($$3.aq() != $$6.a() || !$$7.a($$4.dI(), 16.0)) {
                return false;
            }
            axf $$8 = $$3.s().a($$6.a());
            if ($$8 == null || !$$8.F().a($$7, $$0)) {
                $$2.b();
            } else if (cml.a($$8, $$7, $$4)) {
                $$2.b();
                if (!cml.a($$8, $$7)) {
                    $$3.F().b($$7);
                    $$3.W().b($$7);
                }
            }
            return true;
        }));
    }

    private static boolean a(axf $$0, is $$1, chl $$2) {
        eoh $$3 = $$0.a_($$1);
        return $$3.a(bdp.R) && $$3.c(dzj.c) != false && !$$2.gr();
    }

    private static boolean a(axf $$0, is $$1) {
        List<dcx> $$2 = $$0.a(dcx.class, new fth($$1), chl::gr);
        return !$$2.isEmpty();
    }
}

