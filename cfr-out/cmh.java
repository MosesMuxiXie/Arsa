/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 *  org.apache.commons.lang3.mutable.MutableLong
 */
import com.mojang.datafixers.kinds.Applicative;
import org.apache.commons.lang3.mutable.MutableLong;

public class cmh {
    public static cje<cht> a(int $$0, float $$1) {
        MutableLong $$2 = new MutableLong(0L);
        return cmv.a($$32 -> $$32.group($$32.c(cqw.p), $$32.c(cqw.n), $$32.a(cqw.o)).apply((Applicative)$$32, ($$3, $$4, $$52) -> ($$5, $$6, $$7) -> {
            if ($$5.b_($$6.dK()).a(bdv.a)) {
                return false;
            }
            if ($$7 < $$2.longValue()) {
                $$2.setValue($$7 + 20L + 2L);
                return true;
            }
            is $$8 = null;
            is $$9 = null;
            is $$10 = $$6.dK();
            Iterable<is> $$11 = is.a($$10, $$0, $$0, $$0);
            for (is $$12 : $$11) {
                if ($$12.u() == $$10.u() && $$12.w() == $$10.w()) continue;
                eoh $$13 = $$6.ao().a_($$12.d());
                eoh $$14 = $$6.ao().a_($$12);
                if (!$$14.a(dzs.J)) continue;
                if ($$13.l()) {
                    $$8 = $$12.j();
                    break;
                }
                if ($$9 != null || $$12.a($$6.dI(), 1.5)) continue;
                $$9 = $$12.j();
            }
            if ($$8 == null) {
                $$8 = $$9;
            }
            if ($$8 != null) {
                $$52.a(new cjg($$8));
                $$4.a(new cqz(new cjg($$8), $$1, 0));
            }
            $$2.setValue($$7 + 40L);
            return true;
        }));
    }
}

