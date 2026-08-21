/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.function.BiPredicate;

public class clu {
    public static cje<chl> a(int $$0, BiPredicate<chl, chl> $$1) {
        return cmv.a($$2 -> $$2.group($$2.b(cqw.p), $$2.a(cqw.am), $$2.c(cqw.at), $$2.a(cqw.au)).apply((Applicative)$$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
            chl $$10 = (chl)$$2.b($$3);
            if (!$$10.fa()) {
                return false;
            }
            if ($$1.test($$8, $$10)) {
                $$6.a(true, $$0);
            }
            $$5.a($$10.dK(), $$0);
            if ($$10.ay() != cgu.cb || $$7.U().a(eua.o).booleanValue()) {
                $$3.b();
                $$4.b();
            }
            return true;
        }));
    }
}

