/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;

public class cov
extends cop {
    private final chn a;
    private chl b;
    private final float c;

    public cov(chn $$0, float $$1) {
        this.a = $$0;
        this.c = $$1;
        this.a(EnumSet.of(cop.a.c, cop.a.a));
    }

    @Override
    public boolean b() {
        if (this.a.dm()) {
            return false;
        }
        this.b = this.a.ag_();
        if (this.b == null) {
            return false;
        }
        double $$0 = this.a.g((cgk)this.b);
        if ($$0 < 4.0 || $$0 > 16.0) {
            return false;
        }
        if (!this.a.aV()) {
            return false;
        }
        return this.a.ep().a(cov.b(5)) == 0;
    }

    @Override
    public boolean c() {
        return !this.a.aV();
    }

    @Override
    public void d() {
        ftm $$0 = this.a.dN();
        ftm $$1 = new ftm(this.b.dP() - this.a.dP(), 0.0, this.b.dV() - this.a.dV());
        if ($$1.h() > 1.0E-7) {
            $$1 = $$1.d().c(0.4).e($$0.c(0.2));
        }
        this.a.m($$1.g, this.c, $$1.i);
    }
}

