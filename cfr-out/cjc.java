/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;

public class cjc {
    public static cje<chl> a(cqw<?> $$0, int $$1) {
        return cmv.a((cmv.b<E> $$22) -> $$22.group($$22.a(cqw.p), $$22.c(cqw.aI), $$22.b($$0)).apply((Applicative)$$22, $$22.a(() -> "[BecomePassive if " + String.valueOf($$0) + " present]", ($$1, $$2, $$32) -> ($$3, $$4, $$5) -> {
            $$2.a(true, $$1);
            $$1.b();
            return true;
        })));
    }
}

