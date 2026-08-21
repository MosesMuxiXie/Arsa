/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;

public class cmi {
    public static cje<chl> a(dzq $$0) {
        return cmv.a((cmv.b<E> $$12) -> $$12.group($$12.c(cqw.p), $$12.b(cqw.n), $$12.b(cqw.Z)).apply((Applicative)$$12, ($$1, $$22, $$32) -> ($$2, $$3, $$4) -> {
            if ($$3.by() || !$$3.aV()) {
                return false;
            }
            is $$5 = $$3.dK().e();
            for (iz $$6 : iz.c.a) {
                is $$8;
                is $$7 = $$5.a($$6);
                if (!$$2.a_($$7).g($$2, $$7).a(iz.b).c() || !$$2.b_($$7).b(flc.c) || !$$2.a_($$8 = $$7.d()).l()) continue;
                eoh $$9 = $$0.m();
                $$2.a($$8, $$9, 3);
                $$2.a(etk.i, $$8, etk.a.a($$3, $$9));
                $$2.a(null, $$3, bda.lD, bdb.e, 1.0f, 1.0f);
                $$32.b();
                return true;
            }
            return true;
        }));
    }
}

