/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public class bhc {
    public static <T extends chn> Optional<T> a(cgu<T> $$0, cgt $$1, axf $$2, is $$3, int $$4, int $$5, int $$6, a $$7, boolean $$8) {
        is.a $$9 = $$3.k();
        for (int $$10 = 0; $$10 < $$4; ++$$10) {
            chn $$13;
            int $$11 = bgj.b($$2.y, -$$5, $$5);
            int $$12 = bgj.b($$2.y, -$$5, $$5);
            $$9.a($$3, $$11, $$6, $$12);
            if (!$$2.w().a($$9) || !bhc.a($$2, $$6, $$9, $$7) || $$8 && !$$2.b($$0.a((double)$$9.u() + 0.5, $$9.v(), (double)$$9.w() + 0.5)) || ($$13 = (chn)$$0.b($$2, null, $$9, $$1, false, false)) == null) continue;
            if ($$13.a((dwp)$$2, $$1) && $$13.a((dwr)$$2)) {
                $$2.a_($$13);
                $$13.T();
                return Optional.of($$13);
            }
            $$13.aC();
        }
        return Optional.empty();
    }

    private static boolean a(axf $$0, int $$1, is.a $$2, a $$3) {
        is.a $$4 = new is.a().g($$2);
        eoh $$5 = $$0.a_($$4);
        for (int $$6 = $$1; $$6 >= -$$1; --$$6) {
            $$2.c(iz.a);
            $$4.a((jy)$$2, iz.b);
            eoh $$7 = $$0.a_($$2);
            if ($$3.canSpawnOn($$0, $$2, $$7, $$4, $$5)) {
                $$2.c(iz.b);
                return true;
            }
            $$5 = $$7;
        }
        return false;
    }

    public static interface a {
        @Deprecated
        public static final a a = ($$0, $$1, $$2, $$3, $$4) -> {
            if ($$2.a(dzs.bz) || $$2.a(dzs.es) || $$2.a(dzs.fG) || $$2.b() instanceof ehy || $$2.b() instanceof ehx || $$2.b() instanceof eei || $$2.a(dzs.nU) || $$2.a(dzs.eq) || $$2.a(dzs.cu) || $$2.a(dzs.eH) || $$2.a(dzs.gD) || $$2.a(dzs.ja) || $$2.a(dzs.lE) || $$2.a(dzs.rO) || $$2.a(dzs.aX)) {
                return false;
            }
            return !(!$$4.l() && !$$4.n() || !$$2.e() && !$$2.a(dzs.rP));
        };
        public static final a b = ($$0, $$1, $$2, $$3, $$4) -> $$4.g($$0, $$3).c() && dzq.a($$2.g($$0, $$1), iz.b);
        public static final a c = ($$0, $$1, $$2, $$3, $$4) -> $$4.g($$0, $$3).c() && !$$2.a(bdp.M) && dzq.a($$2.g($$0, $$1), iz.b);

        public boolean canSpawnOn(axf var1, is var2, eoh var3, is var4, eoh var5);
    }
}

