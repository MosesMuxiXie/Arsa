/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;

public class cjb {
    public static ckp<chn> a(int $$0, float $$1) {
        return cmv.a($$2 -> $$2.group($$2.c(cqw.n), $$2.a(cqw.o), $$2.b(cqw.p), $$2.b(cqw.h)).apply((Applicative)$$2, ($$3, $$4, $$5, $$62) -> ($$6, $$7, $$8) -> {
            chl $$9 = (chl)$$2.b($$5);
            if ($$9.a((cgk)$$7, (double)$$0) && ((cqy)$$2.b($$62)).a($$9)) {
                $$4.a(new cjp($$9, true));
                $$7.K().a(-$$1, 0.0f);
                $$7.v(bgj.c($$7.ec(), $$7.bE, 0.0f));
                return true;
            }
            return false;
        }));
    }
}

