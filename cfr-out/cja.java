/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;
import java.util.function.Function;

public class cja {
    public static ckp<chl> a(ccn $$0, float $$12) {
        return cja.a($$0, $$1 -> Float.valueOf($$12), cqw.L, false);
    }

    public static ckp<chl> a(ccn $$0, Function<chl, Float> $$1, cqw<? extends chl> $$2, boolean $$3) {
        return cmv.a($$42 -> $$42.group($$42.b($$2), $$42.a(cqw.o), $$42.c(cqw.n)).apply((Applicative)$$42, ($$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
            if (!$$8.e_()) {
                return false;
            }
            chl $$10 = (chl)$$42.b($$4);
            if ($$8.a((cgk)$$10, (double)($$0.b() + 1)) && !$$8.a((cgk)$$10, (double)$$0.a())) {
                cqz $$11 = new cqz(new cjp($$10, $$3, $$3), ((Float)$$1.apply($$8)).floatValue(), $$0.a() - 1);
                $$5.a(new cjp($$10, true, $$3));
                $$6.a($$11);
                return true;
            }
            return false;
        }));
    }
}

