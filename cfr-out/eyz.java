/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public class eyz
extends exx<fas> {
    public eyz(Codec<fas> $$0) {
        super($$0);
    }

    @Override
    public boolean a(exz<fas> $$0) {
        is $$2;
        dxn $$1 = $$0.b();
        if (!$$1.a_($$2 = $$0.e()).l()) {
            return false;
        }
        bgr $$3 = $$0.d();
        is $$4 = $$0.e();
        fas $$5 = $$0.f();
        is.a $$6 = $$4.k();
        if (eyz.a($$1, $$0.c(), $$5, $$3, $$6, $$4)) {
            eyz.a($$1, $$5, $$3, $$4, $$6);
        }
        return true;
    }

    private static boolean a(dxn $$0, fas $$1, is $$2) {
        is.a $$3 = $$2.k();
        for (int $$4 = 1; $$4 <= $$1.c; ++$$4) {
            $$3.c(iz.b);
            eoh $$5 = $$0.a_($$3);
            if (eyz.a($$5, $$4, $$1.n)) continue;
            return false;
        }
        return true;
    }

    private static boolean a(eoh $$0, int $$1, int $$2) {
        if ($$0.l()) {
            return true;
        }
        int $$3 = $$1 + 1;
        return $$3 <= $$2 && $$0.y().a(bdv.a);
    }

    private static boolean a(dxn $$0, eqg $$1, fas $$2, bgr $$3, is.a $$4, is $$5) {
        for (int $$6 = 0; $$6 < $$2.h; ++$$6) {
            $$4.c(iz.b);
            if (!$$2.o.test($$0, $$4) || !eyz.a($$0, $$2, $$4)) continue;
            is $$7 = $$4.e();
            if ($$0.b_($$7).a(bdv.b) || !$$0.a_($$7).e()) {
                return false;
            }
            if (!$$2.b.a().a($$0, $$1, $$3, $$4)) continue;
            eyz.a($$5, $$5.v() + $$6, $$0, $$2, $$3);
            return true;
        }
        return false;
    }

    private static void a(is $$0, int $$1, dxn $$2, fas $$3, bgr $$4) {
        int $$5 = $$0.u();
        int $$6 = $$0.w();
        is.a $$7 = $$0.k();
        for (int $$8 = $$0.v(); $$8 < $$1; ++$$8) {
            eyz.a($$2, $$3, $$4, $$5, $$6, $$7.d($$5, $$8, $$6));
        }
    }

    private static void a(dxn $$0, fas $$12, bgr $$2, int $$3, int $$4, is.a $$5) {
        int $$6 = $$12.d;
        Predicate<eoh> $$7 = $$1 -> $$1.a($$0.e);
        for (int $$8 = 0; $$8 < $$12.g; ++$$8) {
            $$5.a($$5, $$2.a($$6) - $$2.a($$6), 0, $$2.a($$6) - $$2.a($$6));
            if ($$7.test($$0.a_($$5))) {
                $$0.a((is)$$5, $$12.f.a($$2, $$5), 2);
            }
            $$5.p($$3);
            $$5.r($$4);
        }
    }

    private static void a(dxn $$0, fas $$1, bgr $$2, is $$3, is.a $$4) {
        int $$5 = $$1.i;
        int $$6 = $$1.j;
        for (int $$7 = 0; $$7 < $$1.l; ++$$7) {
            eoh $$8;
            $$4.a($$3, $$2.a($$5) - $$2.a($$5), $$2.a($$6) - $$2.a($$6), $$2.a($$5) - $$2.a($$5));
            if (!$$0.A($$4) || !($$8 = $$1.k.a($$2, $$4)).a($$0, (is)$$4) || !$$0.a_($$4.d()).c((dvt)$$0, (is)$$4, iz.a)) continue;
            $$0.a((is)$$4, $$8, 2);
        }
    }
}

