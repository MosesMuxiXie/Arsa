/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;

public class cmm {
    private static final int a = 10;
    private static final int b = 7;

    public static ckp<cht> a(float $$0) {
        return cmm.a($$0, 10, 7);
    }

    public static ckp<cht> a(float $$0, int $$1, int $$2) {
        return cmv.a($$32 -> $$32.group($$32.c(cqw.n)).apply((Applicative)$$32, $$3 -> ($$4, $$5, $$6) -> {
            ftm $$122;
            is $$7 = $$5.dK();
            if ($$4.e($$7)) {
                ftm $$8 = csr.a($$5, $$1, $$2);
            } else {
                jw $$9 = jw.a($$7);
                jw $$10 = cjf.a($$4, $$9, 2);
                if ($$10 != $$9) {
                    ftm $$11 = cso.a($$5, $$1, $$2, ftm.c($$10.k()), 1.5707963705062866);
                } else {
                    $$122 = csr.a($$5, $$1, $$2);
                }
            }
            $$3.a(Optional.ofNullable($$122).map($$1 -> new cqz((ftm)$$1, $$0, 0)));
            return true;
        }));
    }
}

