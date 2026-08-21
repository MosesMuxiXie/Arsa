/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 *  org.apache.commons.lang3.mutable.MutableLong
 */
import com.mojang.datafixers.kinds.Applicative;
import org.apache.commons.lang3.mutable.MutableLong;

public class clz {
    public static cje<cht> a(cqw<jc> $$0, float $$1, int $$2, int $$3) {
        MutableLong $$4 = new MutableLong(0L);
        return cmv.a($$52 -> $$52.group($$52.a(cqw.n), $$52.b($$0)).apply((Applicative)$$52, ($$5, $$6) -> ($$7, $$8, $$9) -> {
            jc $$10 = (jc)$$52.b($$6);
            if ($$7.aq() != $$10.a() || !$$10.b().a($$8.dI(), (double)$$3)) {
                return false;
            }
            if ($$9 <= $$4.longValue()) {
                return true;
            }
            $$5.a(new cqz($$10.b(), $$1, $$2));
            $$4.setValue($$9 + 80L);
            return true;
        }));
    }
}

