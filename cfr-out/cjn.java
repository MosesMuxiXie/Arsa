/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.function.BiPredicate;

public class cjn {
    public static <E extends chl> cje<E> a(int $$0, BiPredicate<E, cgk> $$1) {
        return cmv.a($$2 -> $$2.group($$2.a(cqw.t)).apply((Applicative)$$2, $$3 -> ($$4, $$5, $$6) -> {
            cgk $$9;
            cgk $$7 = $$5.dz();
            cgk $$8 = $$2.a($$3).orElse(null);
            if ($$7 == null && $$8 == null) {
                return false;
            }
            cgk cgk2 = $$9 = $$7 == null ? $$8 : $$7;
            if (!cjn.a($$5, $$9, $$0) || $$1.test($$5, $$9)) {
                $$5.cf();
                $$3.b();
                return true;
            }
            return false;
        }));
    }

    private static boolean a(chl $$0, cgk $$1, int $$2) {
        return $$1.cb() && $$1.a((cgk)$$0, (double)$$2) && $$1.ao() == $$0.ao();
    }
}

