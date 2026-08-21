/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 */
import com.mojang.datafixers.kinds.Applicative;

public class dbq {
    public static ckp<dbj> a() {
        return cmv.a((cmv.b<E> $$0) -> $$0.group($$0.b(cqw.av), $$0.c(cqw.am), $$0.c(cqw.as), $$0.a(cqw.az)).apply((Applicative)$$0, ($$1, $$2, $$32, $$42) -> ($$3, $$4, $$5) -> {
            if ($$4.e_() || $$0.a($$42).map($$0 -> $$0.stream().anyMatch(dbq::a)).isPresent()) {
                return false;
            }
            daw $$6 = (daw)$$0.b($$1);
            dbk.c($$3, $$4, $$6);
            dbk.b((dbi)$$4);
            dbk.b($$3, (dbi)$$4, (chl)$$6);
            $$0.a($$42).ifPresent($$0 -> $$0.forEach(dbk::b));
            return true;
        }));
    }

    private static boolean a(dbi $$0) {
        return $$0.ev().a(cqw.as);
    }
}

