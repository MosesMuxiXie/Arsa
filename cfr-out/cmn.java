/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;

public class cmn {
    private static final int a = 36;

    public static cje<chl> a() {
        return cmv.a((cmv.b<E> $$0) -> $$0.group($$0.a(cqw.y), $$0.a(cqw.z), $$0.a(cqw.B)).apply((Applicative)$$0, ($$1, $$2, $$3) -> ($$4, $$5, $$6) -> {
            boolean $$7;
            boolean bl2 = $$7 = $$0.a($$1).isPresent() || $$0.a($$3).isPresent() || $$0.a($$2).filter($$1 -> $$1.g($$5) <= 36.0).isPresent();
            if (!$$7) {
                $$1.b();
                $$2.b();
                $$5.ev().a($$4.c(), $$4.au(), $$5.dI());
            }
            return true;
        }));
    }
}

