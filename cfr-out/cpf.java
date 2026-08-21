/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;

public class cpf
extends cop {
    private final chn a;
    private chl b;
    private int c;

    public cpf(chn $$0) {
        this.a = $$0;
        this.a(EnumSet.of(cop.a.a, cop.a.b));
    }

    @Override
    public boolean b() {
        chl $$0 = this.a.ag_();
        if ($$0 == null) {
            return false;
        }
        this.b = $$0;
        return true;
    }

    @Override
    public boolean c() {
        if (!this.b.cb()) {
            return false;
        }
        if (this.a.g((cgk)this.b) > 225.0) {
            return false;
        }
        return !this.a.N().l() || this.b();
    }

    @Override
    public void e() {
        this.b = null;
        this.a.N().n();
    }

    @Override
    public boolean X_() {
        return true;
    }

    @Override
    public void a() {
        this.a.J().a(this.b, 30.0f, 30.0f);
        double $$0 = this.a.dF() * 2.0f * (this.a.dF() * 2.0f);
        double $$1 = this.a.h(this.b.dP(), this.b.dR(), this.b.dV());
        double $$2 = 0.8;
        if ($$1 > $$0 && $$1 < 16.0) {
            $$2 = 1.33;
        } else if ($$1 < 225.0) {
            $$2 = 0.6;
        }
        this.a.N().a((cgk)this.b, $$2);
        this.c = Math.max(this.c - 1, 0);
        if ($$1 > $$0) {
            return;
        }
        if (this.c > 0) {
            return;
        }
        this.c = 20;
        this.a.c(cpf.a(this.a), (cgk)this.b);
    }
}

