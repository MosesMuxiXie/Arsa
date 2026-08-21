/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class diy
extends cdk {
    private @Nullable ema b;

    public diy() {
        super(27);
    }

    public void a(ema $$0) {
        this.b = $$0;
    }

    public boolean b(ema $$0) {
        return this.b == $$0;
    }

    public void b(fnq.a<cdd> $$0) {
        for (int $$1 = 0; $$1 < this.b(); ++$$1) {
            this.a($$1, dlt.l);
        }
        for (cdd $$2 : $$0) {
            if (!$$2.a(this.b())) continue;
            this.a($$2.a(), $$2.b());
        }
    }

    public void b(fns.a<cdd> $$0) {
        for (int $$1 = 0; $$1 < this.b(); ++$$1) {
            dlt $$2 = this.a($$1);
            if ($$2.f()) continue;
            $$0.a(new cdd($$1, $$2));
        }
    }

    @Override
    public boolean a(ddm $$0) {
        if (this.b != null && !this.b.a($$0)) {
            return false;
        }
        return super.a($$0);
    }

    @Override
    public void a(cgd $$0) {
        if (this.b != null) {
            this.b.a($$0);
        }
        super.a($$0);
    }

    @Override
    public void b(cgd $$0) {
        if (this.b != null) {
            this.b.b($$0);
        }
        super.b($$0);
        this.b = null;
    }
}

