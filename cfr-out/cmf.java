/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 *  org.apache.commons.lang3.mutable.MutableLong
 */
import com.mojang.datafixers.kinds.Applicative;
import org.apache.commons.lang3.mutable.MutableLong;

public class cmf {
    private static final int a = 60;

    public static cje<cht> a(int $$0, float $$1) {
        MutableLong $$2 = new MutableLong(0L);
        return cmv.a($$32 -> $$32.group($$32.c(cqw.p), $$32.c(cqw.n), $$32.a(cqw.o)).apply((Applicative)$$32, ($$3, $$4, $$52) -> ($$5, $$6, $$7) -> {
            if (!$$5.b_($$6.dK()).a(bdv.a)) {
                return false;
            }
            if ($$7 < $$2.longValue()) {
                $$2.setValue($$7 + 60L);
                return true;
            }
            is $$8 = $$6.dK();
            is.a $$9 = new is.a();
            ftr $$10 = ftr.a($$6);
            for (is $$11 : is.a($$8, $$0, $$0, $$0)) {
                if ($$11.u() == $$8.u() && $$11.w() == $$8.w()) continue;
                eoh $$12 = $$5.a_($$11);
                eoh $$13 = $$5.a_($$9.a((jy)$$11, iz.a));
                if ($$12.a(dzs.J) || !$$5.b_($$11).c() || !$$12.b((dvt)$$5, $$11, $$10).c() || !$$13.c((dvt)$$5, (is)$$9, iz.b)) continue;
                is $$14 = $$11.j();
                $$52.a(new cjg($$14));
                $$4.a(new cqz(new cjg($$14), $$1, 1));
                break;
            }
            $$2.setValue($$7 + 60L);
            return true;
        }));
    }
}

