/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public abstract class dgj
extends dgi
implements dfy {
    private jm<dlt> e = jm.a(36, dlt.l);
    private @Nullable amt<fof> f;
    private long g;

    protected dgj(cgu<?> $$0, dwo $$1) {
        super($$0, $$1);
    }

    @Override
    public void a(axf $$0, cex $$1) {
        super.a($$0, $$1);
        this.a($$1, $$0, this);
    }

    @Override
    public dlt a(int $$0) {
        return this.g_($$0);
    }

    @Override
    public dlt a(int $$0, int $$1) {
        return this.b($$0, $$1);
    }

    @Override
    public dlt b(int $$0) {
        return this.f_($$0);
    }

    @Override
    public void a(int $$0, dlt $$1) {
        this.c($$0, $$1);
    }

    @Override
    public cic a_(int $$0) {
        return this.h_($$0);
    }

    @Override
    public void e() {
    }

    @Override
    public boolean a(ddm $$0) {
        return this.e_($$0);
    }

    @Override
    public void a(cgk.e $$0) {
        if (!this.ao().B_() && $$0.a()) {
            ccy.a(this.ao(), this, (ccv)this);
        }
        super.a($$0);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        this.c_($$0);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.b_($$0);
    }

    @Override
    public cdc a(ddm $$0, cdb $$1) {
        return this.c_($$0);
    }

    @Override
    protected ftm a(ftm $$0) {
        float $$1 = 0.98f;
        if (this.f == null) {
            int $$2 = 15 - dhi.b(this);
            $$1 += (float)$$2 * 0.001f;
        }
        if (this.by()) {
            $$1 *= 0.95f;
        }
        return $$0.d($$1, 0.0, $$1);
    }

    @Override
    public void a() {
        this.ak_();
    }

    public void a(amt<fof> $$0, long $$1) {
        this.f = $$0;
        this.g = $$1;
    }

    @Override
    public @Nullable dhi createMenu(int $$0, ddl $$1, ddm $$2) {
        if (this.f == null || !$$2.au()) {
            this.d_($$1.j);
            return this.a($$0, $$1);
        }
        return null;
    }

    protected abstract dhi a(int var1, ddl var2);

    @Override
    public @Nullable amt<fof> h() {
        return this.f;
    }

    @Override
    public void a(@Nullable amt<fof> $$0) {
        this.f = $$0;
    }

    @Override
    public long i() {
        return this.g;
    }

    @Override
    public void a(long $$0) {
        this.g = $$0;
    }

    @Override
    public jm<dlt> j() {
        return this.e;
    }

    @Override
    public void k() {
        this.e = jm.a(this.b(), dlt.l);
    }
}

