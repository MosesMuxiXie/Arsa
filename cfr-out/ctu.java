/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;

public class ctu {
    public static cje<chl> a() {
        return cmv.a((cmv.b<E> $$0) -> $$0.group($$0.b(cqw.O), $$0.a(cqw.z)).apply((Applicative)$$0, ($$1, $$2) -> ($$3, $$4, $$5) -> {
            int $$6 = (Integer)$$0.b($$1);
            if ($$6 <= 0) {
                $$1.b();
                $$2.b();
                $$4.ev().e();
            } else {
                $$1.a($$6 - 1);
            }
            return true;
        }));
    }
}

