/*
 * Decompiled with CFR 0.152.
 */
public class cnn
extends cnq {
    private final int l;
    private final boolean m;

    public cnn(chn $$0, int $$1, boolean $$2) {
        super($$0);
        this.l = $$1;
        this.m = $$2;
    }

    @Override
    public void a() {
        if (this.k == cnq.a.b) {
            float $$6;
            this.k = cnq.a.a;
            this.d.g(true);
            double $$0 = this.e - this.d.dP();
            double $$1 = this.f - this.d.dR();
            double $$2 = this.g - this.d.dV();
            double $$3 = $$0 * $$0 + $$1 * $$1 + $$2 * $$2;
            if ($$3 < 2.500000277905201E-7) {
                this.d.J(0.0f);
                this.d.I(0.0f);
                return;
            }
            float $$4 = (float)(bgj.d($$2, $$0) * 57.2957763671875) - 90.0f;
            this.d.v(this.b(this.d.ec(), $$4, 90.0f));
            if (this.d.aV()) {
                float $$5 = (float)(this.h * this.d.i(cis.x));
            } else {
                $$6 = (float)(this.h * this.d.i(cis.n));
            }
            this.d.C($$6);
            double $$7 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            if (Math.abs($$1) > (double)1.0E-5f || Math.abs($$7) > (double)1.0E-5f) {
                float $$8 = (float)(-(bgj.d($$1, $$7) * 57.2957763671875));
                this.d.w(this.b(this.d.ee(), $$8, this.l));
                this.d.J($$1 > 0.0 ? $$6 : -$$6);
            }
        } else {
            if (!this.m) {
                this.d.g(false);
            }
            this.d.J(0.0f);
            this.d.I(0.0f);
        }
    }
}

