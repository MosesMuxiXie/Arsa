/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;

public class cla {
    private static final float b = 0.95f;
    public static final int a = 3;

    public static cje<chl> a() {
        return cmv.a((cmv.b<E> $$0) -> $$0.group($$0.b(cqw.e)).apply((Applicative)$$0, $$1 -> ($$2, $$3, $$4) -> {
            eoh $$6;
            if ($$2.y.i() <= 0.95f) {
                return false;
            }
            is $$5 = ((jc)$$0.b($$1)).b();
            if ($$5.a($$3.dK(), 3.0) && ($$6 = $$2.a_($$5)).a(dzs.pa)) {
                dzm $$7 = (dzm)$$6.b();
                $$7.a($$3, (dwo)$$2, $$5, null);
            }
            return true;
        }));
    }
}

