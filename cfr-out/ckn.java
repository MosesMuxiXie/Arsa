/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class ckn {
    public static ckp<chl> a(float $$0) {
        return cmv.a($$12 -> $$12.group($$12.c(cqw.n)).apply((Applicative)$$12, $$1 -> ($$22, $$3, $$4) -> {
            if ($$22.k($$3.dK())) {
                return false;
            }
            Optional<ftm> $$5 = Optional.ofNullable(ckn.a($$22, $$3));
            $$5.ifPresent($$2 -> $$1.a(new cqz((ftm)$$2, $$0, 0)));
            return true;
        }));
    }

    private static @Nullable ftm a(axf $$0, chl $$1) {
        bgr $$2 = $$1.ep();
        is $$3 = $$1.dK();
        for (int $$4 = 0; $$4 < 10; ++$$4) {
            is $$5 = $$3.b($$2.a(20) - 10, $$2.a(6) - 3, $$2.a(20) - 10);
            if (!ckn.a($$0, $$1, $$5)) continue;
            return ftm.c($$5);
        }
        return null;
    }

    public static boolean a(axf $$0, chl $$1, is $$2) {
        return $$0.k($$2) && (double)$$0.a(euq.a.e, $$2).v() <= $$1.dR();
    }
}

