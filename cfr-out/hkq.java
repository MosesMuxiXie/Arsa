/*
 * Decompiled with CFR 0.152.
 */
public class hkq<T extends ma>
extends hmg {
    private final hmo a;

    protected hkq(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, T $$7, hmo $$8) {
        super($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$8.a());
        this.C = 0.96f;
        this.D = true;
        this.a = $$8;
        this.q *= (double)0.1f;
        this.r *= (double)0.1f;
        this.s *= (double)0.1f;
        this.c *= 0.75f * ((ma)$$7).d();
        int $$9 = (int)(8.0 / (this.y.j() * 0.8 + 0.2));
        this.A = (int)Math.max((float)$$9 * ((ma)$$7).d(), 1.0f);
        this.a($$8);
    }

    protected float a(float $$0, float $$1) {
        return (this.y.i() * 0.2f + 0.8f) * $$0 * $$1;
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

