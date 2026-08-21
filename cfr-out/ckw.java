/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class ckw {
    private static final int a = 10;
    private static final int b = 7;
    private static final int[][] c = new int[][]{{1, 1}, {3, 3}, {5, 5}, {6, 5}, {7, 7}, {10, 7}};

    public static ckp<cht> a(float $$0) {
        return ckw.a($$0, true);
    }

    public static ckp<cht> a(float $$02, boolean $$1) {
        return ckw.a($$02, $$0 -> csr.a($$0, 10, 7), $$1 ? $$0 -> true : $$0 -> !$$0.by());
    }

    public static cje<cht> a(float $$02, int $$1, int $$22) {
        return ckw.a($$02, $$2 -> csr.a($$2, $$1, $$22), (cht $$0) -> true);
    }

    public static cje<cht> b(float $$02) {
        return ckw.a($$02, $$0 -> ckw.a($$0, 10, 7), (cht $$0) -> true);
    }

    public static cje<cht> c(float $$0) {
        return ckw.a($$0, ckw::a, cgk::by);
    }

    private static ckp<cht> a(float $$0, Function<cht, ftm> $$1, Predicate<cht> $$2) {
        return cmv.a((cmv.b<E> $$32) -> $$32.group($$32.c(cqw.n)).apply((Applicative)$$32, $$3 -> ($$4, $$5, $$6) -> {
            if (!$$2.test((cht)$$5)) {
                return false;
            }
            Optional<ftm> $$7 = Optional.ofNullable((ftm)$$1.apply((cht)$$5));
            $$3.a($$7.map($$1 -> new cqz((ftm)$$1, $$0, 0)));
            return true;
        }));
    }

    private static @Nullable ftm a(cht $$0) {
        ftm $$1 = null;
        ftm $$2 = null;
        for (int[] $$3 : c) {
            $$2 = $$1 == null ? cjf.a($$0, $$3[0], $$3[1]) : $$0.dI().e($$0.dI().a($$1).d().d($$3[0], $$3[1], $$3[0]));
            boolean $$4 = csp.a($$0, $$3[0]);
            if ($$2 == null || $$0.ao().b_(is.a($$2)).c() || csp.a($$4, $$0, $$2)) {
                return $$1;
            }
            $$1 = $$2;
        }
        return $$2;
    }

    private static @Nullable ftm a(cht $$0, int $$1, int $$2) {
        ftm $$3 = $$0.h(0.0f);
        return csm.a($$0, $$1, $$2, -2, $$3.g, $$3.i, 1.5707963705062866);
    }
}

