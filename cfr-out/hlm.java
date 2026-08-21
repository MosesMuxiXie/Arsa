/*
 * Decompiled with CFR 0.152.
 */
public class hlm
extends hmg {
    hlm(hif $$0, double $$1, double $$2, double $$3, ilp $$4) {
        super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0, $$4);
        this.B = 0.75f;
        this.C = 0.999f;
        this.q *= (double)0.8f;
        this.r *= (double)0.8f;
        this.s *= (double)0.8f;
        this.r = this.y.i() * 0.4f + 0.05f;
        this.c *= this.y.i() * 2.0f + 0.2f;
        this.A = (int)(16.0 / ((double)this.y.i() * 0.8 + 0.2));
    }

    @Override
    public hmg.b b() {
        return hmg.b.c;
    }

    @Override
    public int a(float $$0) {
        int $$1 = super.a($$0);
        int $$2 = 240;
        int $$3 = $$1 >> 16 & 0xFF;
        return 0xF0 | $$3 << 16;
    }

    @Override
    public float b(float $$0) {
        float $$1 = ((float)this.z + $$0) / (float)this.A;
        return this.c * (1.0f - $$1 * $$1);
    }

    @Override
    public void a() {
        super.a();
        if (!this.v) {
            float $$0 = (float)this.z / (float)this.A;
            if (this.y.i() > $$0) {
                this.j.a(ly.ai, this.n, this.o, this.p, this.q, this.r, this.s);
            }
        }
    }

    public static class a
    implements hlu<md> {
        private final hmo a;

        public a(hmo $$0) {
            this.a = $$0;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            hlm $$9 = new hlm($$1, $$2, $$3, $$4, this.a.a($$8));
            return $$9;
        }
    }
}

