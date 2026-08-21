/*
 * Decompiled with CFR 0.152.
 */
public abstract class gum<T extends din>
extends gti<T>
implements dhx {
    private final amo D;

    public gum(T $$0, ddl $$1, yh $$2, amo $$3) {
        super($$0, $$1, $$2);
        this.D = $$3;
    }

    protected void I() {
    }

    @Override
    protected void bg_() {
        super.bg_();
        this.I();
        ((din)this.w).a(this);
    }

    @Override
    public void aZ_() {
        super.aZ_();
        ((din)this.w).b(this);
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        this.c($$0, $$1, $$2);
    }

    @Override
    protected void a(gir $$0, float $$1, int $$2, int $$3) {
        $$0.a(hpa.at, this.D, this.z, this.A, 0.0f, 0.0f, this.d, this.e, 256, 256);
        this.e($$0, this.z, this.A);
    }

    protected abstract void e(gir var1, int var2, int var3);

    @Override
    public void a(dhi $$0, int $$1, int $$2) {
    }

    @Override
    public void a(dhi $$0, int $$1, dlt $$2) {
    }
}

