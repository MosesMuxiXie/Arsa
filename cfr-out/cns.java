/*
 * Decompiled with CFR 0.152.
 */
public class cns
extends cnq {
    private static final float l = 10.0f;
    private static final float m = 60.0f;
    private final int n;
    private final int o;
    private final float p;
    private final float q;
    private final boolean r;

    public cns(chn $$0, int $$1, int $$2, float $$3, float $$4, boolean $$5) {
        super($$0);
        this.n = $$1;
        this.o = $$2;
        this.p = $$3;
        this.q = $$4;
        this.r = $$5;
    }

    @Override
    public void a() {
        double $$2;
        double $$1;
        if (this.r && this.d.by()) {
            this.d.k(this.d.dN().b(0.0, 0.005, 0.0));
        }
        if (this.k != cnq.a.b || this.d.N().l()) {
            this.d.C(0.0f);
            this.d.K(0.0f);
            this.d.J(0.0f);
            this.d.I(0.0f);
            return;
        }
        double $$0 = this.e - this.d.dP();
        double $$3 = $$0 * $$0 + ($$1 = this.f - this.d.dR()) * $$1 + ($$2 = this.g - this.d.dV()) * $$2;
        if ($$3 < 2.500000277905201E-7) {
            this.d.I(0.0f);
            return;
        }
        float $$4 = (float)(bgj.d($$2, $$0) * 57.2957763671875) - 90.0f;
        this.d.v(this.b(this.d.ec(), $$4, this.o));
        this.d.bC = this.d.ec();
        this.d.bE = this.d.ec();
        float $$5 = (float)(this.h * this.d.i(cis.x));
        if (this.d.by()) {
            this.d.C($$5 * this.p);
            double $$6 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            if (Math.abs($$1) > (double)1.0E-5f || Math.abs($$6) > (double)1.0E-5f) {
                float $$7 = -((float)(bgj.d($$1, $$6) * 57.2957763671875));
                $$7 = bgj.a(bgj.f($$7), (float)(-this.n), (float)this.n);
                this.d.w(this.a(this.d.ee(), $$7, 5.0f));
            }
            float $$8 = bgj.b((double)(this.d.ee() * ((float)Math.PI / 180)));
            float $$9 = bgj.a((double)(this.d.ee() * ((float)Math.PI / 180)));
            this.d.bP = $$8 * $$5;
            this.d.bO = -$$9 * $$5;
        } else {
            float $$10 = Math.abs(bgj.f(this.d.ec() - $$4));
            float $$11 = cns.a($$10);
            this.d.C($$5 * this.q * $$11);
        }
    }

    private static float a(float $$0) {
        return 1.0f - bgj.a(($$0 - 10.0f) / 50.0f, 0.0f, 1.0f);
    }
}

