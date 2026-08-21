/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class ezb
extends exx<fat> {
    public ezb(Codec<fat> $$0) {
        super($$0);
    }

    @Override
    public boolean a(exz<fat> $$0) {
        is $$2;
        dxn $$1 = $$0.b();
        if (!this.a((dwp)$$1, $$2 = $$0.e())) {
            return false;
        }
        fat $$3 = $$0.f();
        bgr $$4 = $$0.d();
        egv $$5 = egv.b();
        int $$6 = $$3.f() + $$3.d();
        for (int $$7 = 0; $$7 < $$6; ++$$7) {
            for (int $$8 = 0; $$8 < $$3.a(); ++$$8) {
                $$5.a($$2, $$3.b());
            }
            boolean $$9 = $$7 < $$3.f();
            for (int $$10 = 0; $$10 < $$3.c(); ++$$10) {
                $$5.a($$1, $$2, $$4, $$9);
            }
            $$5.j();
        }
        is $$11 = $$2.e();
        if ($$4.i() <= $$3.h() && $$1.a_($$11).m($$1, $$11)) {
            $$1.a($$2, dzs.rU.m(), 3);
        }
        int $$12 = $$3.g().a($$4);
        for (int $$13 = 0; $$13 < $$12; ++$$13) {
            is $$14 = $$2.b($$4.a(5) - 2, 0, $$4.a(5) - 2);
            if (!$$1.a_($$14).l() || !$$1.a_($$14.e()).c((dvt)$$1, $$14.e(), iz.b)) continue;
            $$1.a($$14, (eoh)dzs.rV.m().b(egu.d, true), 3);
        }
        return true;
    }

    private boolean a(dwp $$0, is $$12) {
        block5: {
            block4: {
                eoh $$2 = $$0.a_($$12);
                if ($$2.b() instanceof egq) {
                    return true;
                }
                if ($$2.l()) break block4;
                if (!$$2.a(dzs.J) || !$$2.y().b()) break block5;
            }
            return iz.a().map($$12::a).anyMatch($$1 -> $$0.a_((is)$$1).m($$0, (is)$$1));
        }
        return false;
    }
}

