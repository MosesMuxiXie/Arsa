/*
 * Decompiled with CFR 0.152.
 */
public abstract class hke
extends hmg {
    private final hmo a;

    protected hke(hif $$0, double $$1, double $$2, double $$3, float $$4, float $$5, float $$6, double $$7, double $$8, double $$9, float $$10, hmo $$11, float $$12, int $$13, float $$14, boolean $$15) {
        super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0, $$11.a());
        float $$16;
        this.C = 0.96f;
        this.B = $$14;
        this.D = true;
        this.a = $$11;
        this.q *= (double)$$4;
        this.r *= (double)$$5;
        this.s *= (double)$$6;
        this.q += $$7;
        this.r += $$8;
        this.s += $$9;
        this.d = $$16 = this.y.i() * $$12;
        this.e = $$16;
        this.f = $$16;
        this.c *= 0.75f * $$10;
        this.A = (int)((double)$$13 / ((double)this.y.i() * 0.8 + 0.2) * (double)$$10);
        this.A = Math.max(this.A, 1);
        this.a($$11);
        this.u = $$15;
    }

    @Override
    public hmg.b b() {
        return hmg.b.c;
    }

    @Override
    public float b(float $$0) {
        return this.c * bgj.a(((float)this.z + $$0) / (float)this.A * 32.0f, 0.0f, 1.0f);
    }

    @Override
    public void a() {
        super.a();
        this.a(this.a);
    }
}

