/*
 * Decompiled with CFR 0.152.
 */
public class czy
extends dag {
    public czy(cgu<? extends czy> $$0, dwo $$1) {
        super((cgu<? extends dag>)$$0, $$1);
    }

    public static cir.a k() {
        return czz.gW().a(cis.x, 0.2f);
    }

    public static boolean b(cgu<czy> $$0, dwp $$1, cgt $$2, is $$3, bgr $$4) {
        return $$1.av() != ccz.a;
    }

    @Override
    public void a(int $$0, boolean $$1) {
        super.a($$0, $$1);
        this.h(cis.b).a($$0 * 3);
    }

    @Override
    public float bO() {
        return 1.0f;
    }

    @Override
    protected lw p() {
        return ly.G;
    }

    @Override
    public boolean cp() {
        return false;
    }

    @Override
    protected int gL() {
        return super.gL() * 4;
    }

    @Override
    protected void gM() {
        this.d *= 0.9f;
    }

    @Override
    public void u() {
        ftm $$0 = this.dN();
        float $$1 = (float)this.gR() * 0.1f;
        this.m($$0.g, this.fF() + $$1, $$0.i);
        this.aF = true;
    }

    @Override
    protected void c(bef<fla> $$0) {
        if ($$0 == bdv.b) {
            ftm $$1 = this.dN();
            this.m($$1.g, 0.22f + (float)this.gR() * 0.05f, $$1.i);
            this.aF = true;
        } else {
            super.c($$0);
        }
    }

    @Override
    protected boolean gN() {
        return this.dy();
    }

    @Override
    protected float gO() {
        return super.gO() + 2.0f;
    }

    @Override
    protected bcz h(cex $$0) {
        if (this.gS()) {
            return bda.qH;
        }
        return bda.qG;
    }

    @Override
    protected bcz fd() {
        if (this.gS()) {
            return bda.qs;
        }
        return bda.qF;
    }

    @Override
    protected bcz gP() {
        if (this.gS()) {
            return bda.qK;
        }
        return bda.qJ;
    }

    @Override
    protected bcz gQ() {
        return bda.qI;
    }
}

