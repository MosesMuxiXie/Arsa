/*
 * Decompiled with CFR 0.152.
 */
class cfe
extends cfk {
    protected cfe(cfl $$0, int $$1) {
        super($$0, $$1);
    }

    @Override
    public boolean a(axf $$0, chl $$1, int $$2) {
        return $$1.fX() > 0.0f;
    }

    @Override
    public boolean a(int $$0, int $$1) {
        return true;
    }

    @Override
    public void a(chl $$0, int $$1) {
        super.a($$0, $$1);
        $$0.F(Math.max($$0.fX(), (float)(4 * (1 + $$1))));
    }
}

