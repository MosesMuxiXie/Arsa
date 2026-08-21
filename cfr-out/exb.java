/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class exb
extends exx<faj> {
    public exb(Codec<faj> $$0) {
        super($$0);
    }

    @Override
    public boolean a(exz<faj> $$0) {
        is $$1 = $$0.e();
        dxn $$2 = $$0.b();
        bgr $$3 = $$0.d();
        if (!$$2.A($$1) || $$2.A($$1.d())) {
            return false;
        }
        is.a $$4 = $$1.k();
        is.a $$5 = $$1.k();
        boolean $$6 = true;
        boolean $$7 = true;
        boolean $$8 = true;
        boolean $$9 = true;
        while ($$2.A($$4)) {
            if ($$2.y($$4)) {
                return true;
            }
            $$2.a((is)$$4, dzs.eB.m(), 2);
            $$6 = $$6 && this.b($$2, $$3, $$5.a((jy)$$4, iz.c));
            $$7 = $$7 && this.b($$2, $$3, $$5.a((jy)$$4, iz.d));
            $$8 = $$8 && this.b($$2, $$3, $$5.a((jy)$$4, iz.e));
            $$9 = $$9 && this.b($$2, $$3, $$5.a((jy)$$4, iz.f));
            $$4.c(iz.a);
        }
        $$4.c(iz.b);
        this.a($$2, $$3, $$5.a((jy)$$4, iz.c));
        this.a($$2, $$3, $$5.a((jy)$$4, iz.d));
        this.a($$2, $$3, $$5.a((jy)$$4, iz.e));
        this.a($$2, $$3, $$5.a((jy)$$4, iz.f));
        $$4.c(iz.a);
        is.a $$10 = new is.a();
        for (int $$11 = -3; $$11 < 4; ++$$11) {
            for (int $$12 = -3; $$12 < 4; ++$$12) {
                int $$13 = bgj.a($$11) * bgj.a($$12);
                if ($$3.a(10) >= 10 - $$13) continue;
                $$10.g($$4.b($$11, 0, $$12));
                int $$14 = 3;
                while ($$2.A($$5.a((jy)$$10, iz.a))) {
                    $$10.c(iz.a);
                    if (--$$14 > 0) continue;
                }
                if ($$2.A($$5.a((jy)$$10, iz.a))) continue;
                $$2.a((is)$$10, dzs.eB.m(), 2);
            }
        }
        return true;
    }

    private void a(dwp $$0, bgr $$1, is $$2) {
        if ($$1.h()) {
            $$0.a($$2, dzs.eB.m(), 2);
        }
    }

    private boolean b(dwp $$0, bgr $$1, is $$2) {
        if ($$1.a(10) != 0) {
            $$0.a($$2, dzs.eB.m(), 2);
            return true;
        }
        return false;
    }
}

