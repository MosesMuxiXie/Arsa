/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;

public class dbo {
    public static cje<chl> a() {
        return cmv.a((cmv.b<E> $$0) -> $$0.group($$0.b(cqw.p), $$0.a(cqw.as)).apply((Applicative)$$0, ($$1, $$2) -> ($$3, $$4, $$5) -> {
            chl $$6 = (chl)$$0.b($$1);
            if ($$6.ay() == cgu.ao && $$6.fa()) {
                $$2.a(true, dbk.d.a($$4.ao().y));
            }
            return true;
        }));
    }
}

