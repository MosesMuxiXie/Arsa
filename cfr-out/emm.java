/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public abstract class emm
extends eku
implements cdj {
    protected @Nullable amt<fof> l;
    protected long m = 0L;

    protected emm(eld<?> $$0, is $$1, eoh $$2) {
        super($$0, $$1, $$2);
    }

    @Override
    public @Nullable amt<fof> az_() {
        return this.l;
    }

    @Override
    public void a(@Nullable amt<fof> $$0) {
        this.l = $$0;
    }

    @Override
    public long aC_() {
        return this.m;
    }

    @Override
    public void a(long $$0) {
        this.m = $$0;
    }

    @Override
    public boolean c() {
        this.f_((ddm)null);
        return super.c();
    }

    @Override
    public dlt a(int $$0) {
        this.f_((ddm)null);
        return super.a($$0);
    }

    @Override
    public dlt a(int $$0, int $$1) {
        this.f_((ddm)null);
        return super.a($$0, $$1);
    }

    @Override
    public dlt b(int $$0) {
        this.f_((ddm)null);
        return super.b($$0);
    }

    @Override
    public void a(int $$0, dlt $$1) {
        this.f_((ddm)null);
        super.a($$0, $$1);
    }

    @Override
    public boolean b(ddm $$0) {
        return super.b($$0) && (this.l == null || !$$0.au());
    }

    @Override
    public @Nullable dhi createMenu(int $$0, ddl $$1, ddm $$2) {
        if (this.b($$2)) {
            this.f_($$1.j);
            return this.a($$0, $$1);
        }
        eku.a(this.aD_().b(), $$2, this.R_());
        return null;
    }

    @Override
    protected void a(kd $$0) {
        super.a($$0);
        doz $$1 = $$0.a(ki.aA);
        if ($$1 != null) {
            this.l = $$1.a();
            this.m = $$1.b();
        }
    }

    @Override
    protected void a(kf.a $$0) {
        super.a($$0);
        if (this.l != null) {
            $$0.a(ki.aA, new doz(this.l, this.m));
        }
    }

    @Override
    public void b(fns $$0) {
        super.b($$0);
        $$0.c("LootTable");
        $$0.c("LootTableSeed");
    }
}

