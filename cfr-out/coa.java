/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;

public class coa
extends cpc {
    private final cvb g;

    public coa(cvb $$0, double $$1, int $$2) {
        super($$0, $$1, $$2, 6);
        this.g = $$0;
        this.f = -2;
        this.a(EnumSet.of(cop.a.c, cop.a.a));
    }

    @Override
    public boolean b() {
        return this.g.p() && !this.g.gR() && !this.g.he() && super.b();
    }

    @Override
    public void d() {
        super.d();
        this.g.y(false);
    }

    @Override
    protected int a(cht $$0) {
        return 40;
    }

    @Override
    public void e() {
        super.e();
        this.g.A(false);
    }

    @Override
    public void a() {
        super.a();
        this.g.y(false);
        if (!this.m()) {
            this.g.A(false);
        } else if (!this.g.he()) {
            this.g.A(true);
        }
    }

    @Override
    protected boolean a(dwr $$0, is $$1) {
        return $$0.A($$1.d()) && $$0.a_($$1).a(bdp.R);
    }
}

