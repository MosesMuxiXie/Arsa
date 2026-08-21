/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 *  org.apache.commons.lang3.mutable.MutableInt
 */
import com.mojang.datafixers.kinds.Applicative;
import org.apache.commons.lang3.mutable.MutableInt;

public class clf {
    private static final int a = 300;

    public static cje<chl> a(int $$0, int $$1) {
        int $$2 = $$0 * 20;
        MutableInt $$32 = new MutableInt(0);
        return cmv.a($$3 -> $$3.group($$3.b(cqw.D), $$3.b(cqw.E)).apply((Applicative)$$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
            boolean $$10;
            long $$9 = (Long)$$3.b($$5);
            boolean bl2 = $$10 = $$9 + 300L <= $$8;
            if ($$32.intValue() > $$2 || $$10) {
                $$5.b();
                $$4.b();
                $$7.ev().a($$6.c(), $$6.au(), $$7.dI());
                $$32.setValue(0);
                return true;
            }
            is $$11 = ((jc)$$3.b($$4)).b();
            if ($$11.a($$7.dK(), (double)$$1)) {
                $$32.increment();
            }
            return true;
        }));
    }
}

