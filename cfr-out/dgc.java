/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public abstract class dgc
extends dgb
implements cha,
dfy {
    private static final int s = 27;
    private jm<dlt> t = jm.a(27, dlt.l);
    private @Nullable amt<fof> u;
    private long aN;

    public dgc(cgu<? extends dgc> $$0, dwo $$1, Supplier<dlp> $$2) {
        super($$0, $$1, $$2);
    }

    @Override
    protected float E() {
        return 0.15f;
    }

    @Override
    protected int F() {
        return 1;
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
    public void a(axf $$0, cex $$1) {
        this.a($$0, this.p());
        this.a($$1, $$0, this);
    }

    @Override
    public void a(cgk.e $$0) {
        if (!this.ao().B_() && $$0.a()) {
            ccy.a(this.ao(), this, (ccv)this);
        }
        super.a($$0);
    }

    @Override
    public cdc a(ddm $$0, cdb $$1) {
        cdc $$2 = super.a($$0, $$1);
        if ($$2 != cdc.e) {
            return $$2;
        }
        if (!this.s($$0) || $$0.gA()) {
            dwo dwo2;
            cdc $$3 = this.c_($$0);
            if ($$3.a() && (dwo2 = $$0.ao()) instanceof axf) {
                axf $$4 = (axf)dwo2;
                this.a(etk.k, $$0);
                dbk.a($$4, $$0, true);
            }
            return $$3;
        }
        return cdc.e;
    }

    @Override
    public void b(ddm $$0) {
        $$0.a(this);
        dwo dwo2 = $$0.ao();
        if (dwo2 instanceof axf) {
            axf $$1 = (axf)dwo2;
            this.a(etk.k, $$0);
            dbk.a($$1, $$0, true);
        }
    }

    @Override
    public void a() {
        this.ak_();
    }

    @Override
    public int b() {
        return 27;
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
    public @Nullable dhi createMenu(int $$0, ddl $$1, ddm $$2) {
        if (this.u == null || !$$2.au()) {
            this.f($$1.j);
            return dhs.a($$0, $$1, this);
        }
        return null;
    }

    public void f(@Nullable ddm $$0) {
        this.d_($$0);
    }

    @Override
    public @Nullable amt<fof> h() {
        return this.u;
    }

    @Override
    public void a(@Nullable amt<fof> $$0) {
        this.u = $$0;
    }

    @Override
    public long i() {
        return this.aN;
    }

    @Override
    public void a(long $$0) {
        this.aN = $$0;
    }

    @Override
    public jm<dlt> j() {
        return this.t;
    }

    @Override
    public void k() {
        this.t = jm.a(this.b(), dlt.l);
    }

    @Override
    public void b(cgd $$0) {
        this.ao().a(etk.j, this.dI(), etk.a.a($$0.k_()));
    }
}

