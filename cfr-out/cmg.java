/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 *  org.apache.commons.lang3.mutable.MutableLong
 */
import com.mojang.datafixers.kinds.Applicative;
import org.apache.commons.lang3.mutable.MutableLong;

public class cmg {
    public static cje<cht> a(int $$0, float $$1) {
        MutableLong $$2 = new MutableLong(0L);
        return cmv.a($$32 -> $$32.group($$32.c(cqw.p), $$32.c(cqw.n), $$32.a(cqw.o)).apply((Applicative)$$32, ($$3, $$4, $$52) -> ($$5, $$6, $$7) -> {
            if ($$5.b_($$6.dK()).a(bdv.a)) {
                return false;
            }
            if ($$7 < $$2.longValue()) {
                $$2.setValue($$7 + 40L);
                return true;
            }
            ftr $$8 = ftr.a($$6);
            is $$9 = $$6.dK();
            is.a $$10 = new is.a();
            block0: for (is $$11 : is.a($$9, $$0, $$0, $$0)) {
                if ($$11.u() == $$9.u() && $$11.w() == $$9.w() || !$$5.a_($$11).b((dvt)$$5, $$11, $$8).c() || $$5.a_($$10.a((jy)$$11, iz.a)).b((dvt)$$5, $$11, $$8).c()) continue;
                for (iz $$12 : iz.c.a) {
                    $$10.a((jy)$$11, $$12);
                    if (!$$5.a_($$10).l() || !$$5.a_($$10.c(iz.a)).a(dzs.J)) continue;
                    $$52.a(new cjg($$11));
                    $$4.a(new cqz(new cjg($$11), $$1, 0));
                    break block0;
                }
            }
            $$2.setValue($$7 + 40L);
            return true;
        }));
    }
}

