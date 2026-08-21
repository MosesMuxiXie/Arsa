/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;

public class cjv {
    public static cje<dcx> a(float $$0, int $$1) {
        return cmv.a($$22 -> $$22.group($$22.c(cqw.n)).apply((Applicative)$$22, $$2 -> ($$3, $$4, $$5) -> {
            if ($$3.e($$4.dK())) {
                return false;
            }
            csx $$6 = $$3.F();
            int $$7 = $$6.a(jw.a($$4.dK()));
            ftm $$8 = null;
            for (int $$9 = 0; $$9 < 5; ++$$9) {
                ftm $$10 = csr.a((cht)$$4, 15, 7, $$1 -> -$$6.a(jw.a($$1)));
                if ($$10 == null) continue;
                int $$11 = $$6.a(jw.a(is.a($$10)));
                if ($$11 < $$7) {
                    $$8 = $$10;
                    break;
                }
                if ($$11 != $$7) continue;
                $$8 = $$10;
            }
            if ($$8 != null) {
                $$2.a(new cqz($$8, $$0, $$1));
            }
            return true;
        }));
    }
}

