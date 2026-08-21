/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public abstract class cyf
implements cyn {
    protected final cyc a;

    public cyf(cyc $$0) {
        this.a = $$0;
    }

    @Override
    public boolean a() {
        return false;
    }

    @Override
    public void b() {
    }

    @Override
    public void a(axf $$0) {
    }

    @Override
    public void a(cyb $$0, is $$1, cex $$2, @Nullable ddm $$3) {
    }

    @Override
    public void c() {
    }

    @Override
    public void d() {
    }

    @Override
    public float e() {
        return 0.6f;
    }

    @Override
    public @Nullable ftm f() {
        return null;
    }

    @Override
    public float a(cex $$0, float $$1) {
        return $$1;
    }

    @Override
    public float g() {
        float $$0 = (float)this.a.dN().i() + 1.0f;
        float $$1 = Math.min($$0, 40.0f);
        return 0.7f / $$1 / $$0;
    }
}

