/*
 * Decompiled with CFR 0.152.
 */
public abstract class hmf
extends hmg {
    protected final hmo a;
    private float b;
    private float F;
    private float G;
    private boolean H;

    protected hmf(hif $$0, double $$1, double $$2, double $$3, hmo $$4, float $$5) {
        super($$0, $$1, $$2, $$3, $$4.a());
        this.C = 0.91f;
        this.B = $$5;
        this.a = $$4;
    }

    public void b(int $$0) {
        float $$1 = (float)(($$0 & 0xFF0000) >> 16) / 255.0f;
        float $$2 = (float)(($$0 & 0xFF00) >> 8) / 255.0f;
        float $$3 = (float)(($$0 & 0xFF) >> 0) / 255.0f;
        float $$4 = 1.0f;
        this.a($$1 * 1.0f, $$2 * 1.0f, $$3 * 1.0f);
    }

    public void c(int $$0) {
        this.b = (float)(($$0 & 0xFF0000) >> 16) / 255.0f;
        this.F = (float)(($$0 & 0xFF00) >> 8) / 255.0f;
        this.G = (float)(($$0 & 0xFF) >> 0) / 255.0f;
        this.H = true;
    }

    @Override
    public hmg.b b() {
        return hmg.b.d;
    }

    @Override
    public void a() {
        super.a();
        this.a(this.a);
        if (this.z > this.A / 2) {
            this.e(1.0f - ((float)this.z - (float)(this.A / 2)) / (float)this.A);
            if (this.H) {
                this.d += (this.b - this.d) * 0.2f;
                this.e += (this.F - this.e) * 0.2f;
                this.f += (this.G - this.f) * 0.2f;
            }
        }
    }

    @Override
    public int a(float $$0) {
        return 0xF000F0;
    }
}

