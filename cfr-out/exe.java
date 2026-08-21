/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public class exe
extends exx<ezt> {
    public exe(Codec<ezt> $$0) {
        super($$0);
    }

    @Override
    public boolean a(exz<ezt> $$0) {
        is $$1 = $$0.e();
        dxn $$2 = $$0.b();
        bgr $$3 = $$0.d();
        ezt $$4 = $$0.f();
        if ($$1.v() < $$2.K_() + 5) {
            return false;
        }
        int $$5 = 2 + $$3.a(2);
        int $$6 = 2 + $$3.a(2);
        for (is $$7 : is.c($$1.b(-$$5, 0, -$$6), $$1.b($$5, 1, $$6))) {
            int $$9;
            int $$8 = $$1.u() - $$7.u();
            if ((float)($$8 * $$8 + ($$9 = $$1.w() - $$7.w()) * $$9) <= $$3.i() * 10.0f - $$3.i() * 6.0f) {
                this.a((dwp)$$2, $$7, $$3, $$4);
                continue;
            }
            if (!((double)$$3.i() < 0.031)) continue;
            this.a((dwp)$$2, $$7, $$3, $$4);
        }
        return true;
    }

    private boolean a(dwp $$0, is $$1, bgr $$2) {
        is $$3 = $$1.e();
        eoh $$4 = $$0.a_($$3);
        if ($$4.a(dzs.lA)) {
            return $$2.h();
        }
        return $$4.c((dvt)$$0, $$3, iz.b);
    }

    private void a(dwp $$0, is $$1, bgr $$2, ezt $$3) {
        if ($$0.A($$1) && this.a($$0, $$1, $$2)) {
            $$0.a($$1, $$3.b.a($$2, $$1), 260);
        }
    }
}

