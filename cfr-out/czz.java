/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Predicate;

public abstract class czz
extends cht
implements czu {
    protected czz(cgu<? extends czz> $$0, dwo $$1) {
        super((cgu<? extends cht>)$$0, $$1);
        this.cn = 5;
    }

    @Override
    public bdb dB() {
        return bdb.f;
    }

    @Override
    public void d_() {
        this.fv();
        this.gV();
        super.d_();
    }

    protected void gV() {
        float $$0 = this.bO();
        if ($$0 > 0.5f) {
            this.bK += 2;
        }
    }

    @Override
    protected bcz bk() {
        return bda.oX;
    }

    @Override
    protected bcz bl() {
        return bda.oW;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.oU;
    }

    @Override
    protected bcz fd() {
        return bda.oT;
    }

    @Override
    public chl.a fj() {
        return new chl.a(bda.oV, bda.oS);
    }

    @Override
    public float a(is $$0, dwr $$1) {
        return -$$1.C($$0);
    }

    public static boolean a(dxf $$0, is $$1, bgr $$2) {
        if ($$0.a(dww.a, $$1) > $$2.a(32)) {
            return false;
        }
        esh $$3 = $$0.F_();
        int $$4 = $$3.b();
        if ($$4 < 15 && $$0.a(dww.b, $$1) > $$4) {
            return false;
        }
        int $$5 = $$0.a().an() ? $$0.c($$1, 10) : $$0.G($$1);
        return $$5 <= $$3.a().a($$2);
    }

    public static boolean a(cgu<? extends chn> $$0, dxf $$1, cgt $$2, is $$3, bgr $$4) {
        return $$1.av() != ccz.a && (cgt.b($$2) || czz.a($$1, $$3, $$4)) && czz.a($$0, $$1, $$2, $$3, $$4);
    }

    public static boolean c(cgu<? extends czz> $$0, dwp $$1, cgt $$2, is $$3, bgr $$4) {
        return $$1.av() != ccz.a && czz.a($$0, $$1, $$2, $$3, $$4);
    }

    public static boolean b(cgu<? extends chn> $$0, dxf $$1, cgt $$2, is $$3, bgr $$4) {
        return czz.a($$0, $$1, $$2, $$3, $$4) && (cgt.a($$2) || $$1.k($$3));
    }

    public static cir.a gW() {
        return chn.E().a(cis.d);
    }

    @Override
    public boolean eI() {
        return true;
    }

    @Override
    protected boolean e(axf $$0) {
        return $$0.U().a(eua.D);
    }

    public boolean a(axf $$0, ddm $$1) {
        return true;
    }

    @Override
    public dlt d(dlt $$0) {
        if ($$0.h() instanceof dmo) {
            Predicate<dlt> $$1 = ((dmo)$$0.h()).c();
            dlt $$2 = dmo.a(this, $$1);
            return $$2.f() ? new dlt(dlx.pX) : $$2;
        }
        return dlt.l;
    }
}

