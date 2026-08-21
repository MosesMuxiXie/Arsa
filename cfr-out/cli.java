/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import java.util.function.Function;

public class cli {
    public static cje<cht> a(cqw<is> $$0, float $$1, int $$2, boolean $$3) {
        return cli.a($$0, $$1, $$2, $$3, ftm::c);
    }

    public static ckp<cht> b(cqw<? extends cgk> $$0, float $$1, int $$2, boolean $$3) {
        return cli.a($$0, $$1, $$2, $$3, cgk::dI);
    }

    private static <T> ckp<cht> a(cqw<T> $$0, float $$1, int $$2, boolean $$3, Function<T, ftm> $$4) {
        return cmv.a($$52 -> $$52.group($$52.a(cqw.n), $$52.b($$0)).apply((Applicative)$$52, ($$5, $$6) -> ($$7, $$8, $$9) -> {
            ftm $$14;
            ftm $$13;
            ftm $$12;
            Optional $$10 = $$52.a($$5);
            if ($$10.isPresent() && !$$3) {
                return false;
            }
            ftm $$11 = $$8.dI();
            if (!$$11.a((jn)($$12 = (ftm)$$4.apply($$52.b($$6))), (double)$$2)) {
                return false;
            }
            if ($$10.isPresent() && ((cqz)$$10.get()).b() == $$1 && ($$13 = ((cqz)$$10.get()).a().a().d($$11)).b($$14 = $$12.d($$11)) < 0.0) {
                return false;
            }
            for (int $$15 = 0; $$15 < 10; ++$$15) {
                ftm $$16 = csr.b($$8, 16, 7, $$12);
                if ($$16 == null) continue;
                $$5.a(new cqz($$16, $$1, 0));
                break;
            }
            return true;
        }));
    }
}

