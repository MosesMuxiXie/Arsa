/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;

public abstract class ewy
extends exx<fae> {
    public ewy(Codec<fae> $$0) {
        super($$0);
    }

    protected void a(dwp $$0, bgr $$1, is $$2, fae $$3, int $$4, is.a $$5) {
        for (int $$6 = 0; $$6 < $$4; ++$$6) {
            $$5.g($$2).c(iz.b, $$6);
            this.a($$0, $$5, $$3.c.a($$1, $$2));
        }
    }

    protected void a(dwp $$0, is.a $$1, eoh $$2) {
        eoh $$3 = $$0.a_($$1);
        if ($$3.l() || $$3.a(bdp.cF)) {
            this.a((dwv)$$0, (is)$$1, $$2);
        }
    }

    protected int a(bgr $$0) {
        int $$1 = $$0.a(3) + 4;
        if ($$0.a(12) == 0) {
            $$1 *= 2;
        }
        return $$1;
    }

    protected boolean a(dwp $$0, is $$1, int $$2, is.a $$3, fae $$4) {
        int $$5 = $$1.v();
        if ($$5 < $$0.K_() + 1 || $$5 + $$2 + 1 > $$0.aw()) {
            return false;
        }
        eoh $$6 = $$0.a_($$1.e());
        if (!ewy.b($$6) && !$$6.a(bdp.bl)) {
            return false;
        }
        for (int $$7 = 0; $$7 <= $$2; ++$$7) {
            int $$8 = this.a(-1, -1, $$4.d, $$7);
            for (int $$9 = -$$8; $$9 <= $$8; ++$$9) {
                for (int $$10 = -$$8; $$10 <= $$8; ++$$10) {
                    eoh $$11 = $$0.a_($$3.a($$1, $$9, $$7, $$10));
                    if ($$11.l() || $$11.a(bdp.M)) continue;
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean a(exz<fae> $$0) {
        is.a $$6;
        dxn $$1 = $$0.b();
        is $$2 = $$0.e();
        bgr $$3 = $$0.d();
        fae $$4 = $$0.f();
        int $$5 = this.a($$3);
        if (!this.a($$1, $$2, $$5, $$6 = new is.a(), $$4)) {
            return false;
        }
        this.a((dwp)$$1, $$3, $$2, $$5, $$6, $$4);
        this.a((dwp)$$1, $$3, $$2, $$4, $$5, $$6);
        return true;
    }

    protected abstract int a(int var1, int var2, int var3, int var4);

    protected abstract void a(dwp var1, bgr var2, is var3, int var4, is.a var5, fae var6);
}

