/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;

public class hnj
extends hne {
    private ftm a = ftm.c;
    private int b;

    public hnj(hif $$0, GameProfile $$1) {
        super($$0, $$1);
        this.ar = true;
    }

    @Override
    public boolean a(double $$0) {
        double $$1 = this.dj().a() * 10.0;
        if (Double.isNaN($$1)) {
            $$1 = 1.0;
        }
        return $$0 < ($$1 *= 64.0 * hnj.dc()) * $$1;
    }

    @Override
    public boolean b(cex $$0) {
        return true;
    }

    @Override
    public void g() {
        super.g();
        this.s(false);
    }

    @Override
    public void d_() {
        if (this.ch()) {
            this.l_().e();
        }
        if (this.bS > 0) {
            this.a(this.bS, this.bR);
            --this.bS;
        }
        if (this.b > 0) {
            this.l(new ftm((this.a.g - this.dN().g) / (double)this.b, (this.a.h - this.dN().h) / (double)this.b, (this.a.i - this.dN().i) / (double)this.b));
            --this.b;
        }
        this.fv();
        this.m();
        try (bzr $$0 = bzl.a().d("push");){
            this.q();
        }
    }

    @Override
    public void j(ftm $$0) {
        this.a = $$0;
        this.b = this.ay().p() + 1;
    }

    @Override
    protected void gE() {
    }

    @Override
    public void a(adc $$0) {
        super.a($$0);
        this.bP();
    }
}

