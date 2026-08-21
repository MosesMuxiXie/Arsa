/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.List;

public class exo
extends exx<faj> {
    private static final eoq a = eoq.a(dzs.L);
    private final eoh b = dzs.L.m();
    private final eoh c = dzs.ky.m();
    private final eoh d = dzs.bc.m();
    private final eoh ap = dzs.J.m();

    public exo(Codec<faj> $$0) {
        super($$0);
    }

    @Override
    public boolean a(exz<faj> $$0) {
        dxn $$1 = $$0.b();
        is $$2 = $$0.e();
        $$2 = $$2.d();
        while ($$1.A($$2) && $$2.v() > $$1.K_() + 2) {
            $$2 = $$2.e();
        }
        if (!a.a($$1.a_($$2))) {
            return false;
        }
        for (int $$3 = -2; $$3 <= 2; ++$$3) {
            for (int $$4 = -2; $$4 <= 2; ++$$4) {
                if (!$$1.A($$2.b($$3, -1, $$4)) || !$$1.A($$2.b($$3, -2, $$4))) continue;
                return false;
            }
        }
        for (int $$5 = -2; $$5 <= 0; ++$$5) {
            for (int $$6 = -2; $$6 <= 2; ++$$6) {
                for (int $$7 = -2; $$7 <= 2; ++$$7) {
                    $$1.a($$2.b($$6, $$5, $$7), this.d, 2);
                }
            }
        }
        $$1.a($$2, this.ap, 2);
        for (iz $$8 : iz.c.a) {
            $$1.a($$2.a($$8), this.ap, 2);
        }
        is $$9 = $$2.e();
        $$1.a($$9, this.b, 2);
        for (iz $$10 : iz.c.a) {
            $$1.a($$9.a($$10), this.b, 2);
        }
        for (int $$11 = -2; $$11 <= 2; ++$$11) {
            for (int $$12 = -2; $$12 <= 2; ++$$12) {
                if ($$11 != -2 && $$11 != 2 && $$12 != -2 && $$12 != 2) continue;
                $$1.a($$2.b($$11, 1, $$12), this.d, 2);
            }
        }
        $$1.a($$2.b(2, 1, 0), this.c, 2);
        $$1.a($$2.b(-2, 1, 0), this.c, 2);
        $$1.a($$2.b(0, 1, 2), this.c, 2);
        $$1.a($$2.b(0, 1, -2), this.c, 2);
        for (int $$13 = -1; $$13 <= 1; ++$$13) {
            for (int $$14 = -1; $$14 <= 1; ++$$14) {
                if ($$13 == 0 && $$14 == 0) {
                    $$1.a($$2.b($$13, 4, $$14), this.d, 2);
                    continue;
                }
                $$1.a($$2.b($$13, 4, $$14), this.c, 2);
            }
        }
        for (int $$15 = 1; $$15 <= 3; ++$$15) {
            $$1.a($$2.b(-1, $$15, -1), this.d, 2);
            $$1.a($$2.b(-1, $$15, 1), this.d, 2);
            $$1.a($$2.b(1, $$15, -1), this.d, 2);
            $$1.a($$2.b(1, $$15, 1), this.d, 2);
        }
        is $$16 = $$2;
        List<is> $$17 = List.of($$16, $$16.i(), $$16.g(), $$16.h(), $$16.f());
        bgr $$18 = $$0.d();
        exo.b($$1, bhs.a($$17, $$18).c(1));
        exo.b($$1, bhs.a($$17, $$18).c(2));
        return true;
    }

    private static void b(dxn $$0, is $$12) {
        $$0.a($$12, dzs.M.m(), 3);
        $$0.a($$12, eld.P).ifPresent($$1 -> $$1.a(fnv.bj, $$12.a()));
    }
}

