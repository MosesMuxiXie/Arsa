/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

class dhn
extends dji {
    private final chl a;
    private final cgv b;
    private final @Nullable amo g;

    public dhn(ccv $$0, chl $$1, cgv $$2, int $$3, int $$4, int $$5, @Nullable amo $$6) {
        super($$0, $$3, $$4, $$5);
        this.a = $$1;
        this.b = $$2;
        this.g = $$6;
    }

    @Override
    public void a(dlt $$0, dlt $$1) {
        this.a.a(this.b, $$1, $$0);
        super.a($$0, $$1);
    }

    @Override
    public int a() {
        return 1;
    }

    @Override
    public boolean a(dlt $$0) {
        return this.a.a($$0, this.b);
    }

    @Override
    public boolean b() {
        return this.a.e(this.b);
    }

    @Override
    public boolean a(ddm $$0) {
        dlt $$1 = this.g();
        if (!$$1.f() && !$$0.ha() && dsq.a($$1, dsp.F)) {
            return false;
        }
        return super.a($$0);
    }

    @Override
    public @Nullable amo c() {
        return this.g;
    }
}

