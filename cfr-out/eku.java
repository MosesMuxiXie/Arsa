/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public abstract class eku
extends elb
implements ccv,
cdf,
cdg {
    private cde d = cde.a;
    private @Nullable yh e;

    protected eku(eld<?> $$0, is $$1, eoh $$2) {
        super($$0, $$1, $$2);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.d = cde.a($$0);
        this.e = eku.a($$0, "CustomName");
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        this.d.a($$0);
        $$0.b("CustomName", yj.a, this.e);
    }

    @Override
    public yh ap() {
        if (this.e != null) {
            return this.e;
        }
        return this.k();
    }

    @Override
    public yh R_() {
        return this.ap();
    }

    @Override
    public @Nullable yh as() {
        return this.e;
    }

    protected abstract yh k();

    public boolean b(ddm $$0) {
        return this.d.a($$0);
    }

    public static void a(ftm $$0, ddm $$1, yh $$2) {
        dwo $$3 = $$1.ao();
        $$1.a(yh.a("container.isLocked", $$2), true);
        if (!$$3.B_()) {
            $$3.a(null, $$0.a(), $$0.b(), $$0.c(), bda.fq, bdb.e, 1.0f, 1.0f);
        }
    }

    public boolean m() {
        return !this.d.equals(cde.a);
    }

    protected abstract jm<dlt> g();

    protected abstract void a(jm<dlt> var1);

    @Override
    public boolean c() {
        for (dlt $$0 : this.g()) {
            if ($$0.f()) continue;
            return false;
        }
        return true;
    }

    @Override
    public dlt a(int $$0) {
        return this.g().get($$0);
    }

    @Override
    public dlt a(int $$0, int $$1) {
        dlt $$2 = ccw.a(this.g(), $$0, $$1);
        if (!$$2.f()) {
            this.e();
        }
        return $$2;
    }

    @Override
    public dlt b(int $$0) {
        return ccw.a(this.g(), $$0);
    }

    @Override
    public void a(int $$0, dlt $$1) {
        this.g().set($$0, $$1);
        $$1.f(this.f_($$1));
        this.e();
    }

    @Override
    public boolean a(ddm $$0) {
        return ccv.a(this, $$0);
    }

    @Override
    public void a() {
        this.g().clear();
    }

    @Override
    public @Nullable dhi createMenu(int $$0, ddl $$1, ddm $$2) {
        if (this.b($$2)) {
            return this.a($$0, $$1);
        }
        eku.a(this.aD_().b(), $$2, this.R_());
        return null;
    }

    protected abstract dhi a(int var1, ddl var2);

    @Override
    protected void a(kd $$0) {
        super.a($$0);
        this.e = $$0.a(ki.h);
        this.d = $$0.a(ki.az, cde.a);
        $$0.a(ki.aw, doo.a).a(this.g());
    }

    @Override
    protected void a(kf.a $$0) {
        super.a($$0);
        $$0.a(ki.h, this.e);
        if (this.m()) {
            $$0.a(ki.az, this.d);
        }
        $$0.a(ki.aw, doo.a(this.g()));
    }

    @Override
    public void b(fns $$0) {
        $$0.c("CustomName");
        $$0.c("lock");
        $$0.c("Items");
    }
}

