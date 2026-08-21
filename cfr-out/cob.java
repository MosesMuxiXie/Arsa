/*
 * Decompiled with CFR 0.152.
 */
public class cob
extends cpc {
    private final cvb g;

    public cob(cvb $$0, double $$1) {
        super($$0, $$1, 8);
        this.g = $$0;
    }

    @Override
    public boolean b() {
        return this.g.p() && !this.g.gR() && super.b();
    }

    @Override
    public void d() {
        super.d();
        this.g.y(false);
    }

    @Override
    public void e() {
        super.e();
        this.g.y(false);
    }

    @Override
    public void a() {
        super.a();
        this.g.y(this.m());
    }

    @Override
    protected boolean a(dwr $$0, is $$1) {
        if (!$$0.A($$1.d())) {
            return false;
        }
        eoh $$2 = $$0.a_($$1);
        if ($$2.a(dzs.cS)) {
            return elj.a($$0, $$1) < 1;
        }
        if ($$2.a(dzs.da) && $$2.c(edd.b).booleanValue()) {
            return true;
        }
        return $$2.a(bdp.R, (eog.a $$02) -> $$02.d(dzj.b).map($$0 -> $$0 != eou.a).orElse(true));
    }
}

