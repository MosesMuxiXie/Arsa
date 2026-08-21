/*
 * Decompiled with CFR 0.152.
 */
public abstract class cyg
extends cyf {
    public cyg(cyc $$0) {
        super($$0);
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public float a(cex $$0, float $$1) {
        if ($$0.c() instanceof deh || $$0.c() instanceof dev) {
            $$0.c().e(1.0f);
            return 0.0f;
        }
        return super.a($$0, $$1);
    }
}

