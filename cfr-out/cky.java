/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;

public class cky {
    public static cje<dcx> a() {
        return cmv.a((cmv.b<E> $$0) -> $$0.group($$0.c(cqw.c)).apply((Applicative)$$0, $$02 -> ($$0, $$1, $$2) -> {
            boolean $$4;
            dcy $$3 = $$1.gZ();
            boolean bl2 = $$4 = !$$3.b().a(dda.b) && !$$3.b().a(dda.m);
            if ($$4 && $$1.d() == 0 && $$3.c() <= 1) {
                $$1.a($$1.gZ().b($$0.J_(), dda.b));
                $$1.i($$0);
                return true;
            }
            return false;
        }));
    }
}

