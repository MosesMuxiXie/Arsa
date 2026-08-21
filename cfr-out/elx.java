/*
 * Decompiled with CFR 0.152.
 */
public class elx
extends emm {
    public static final int d = 9;
    private static final yh e = yh.c("container.dispenser");
    private jm<dlt> f = jm.a(9, dlt.l);

    protected elx(eld<?> $$0, is $$1, eoh $$2) {
        super($$0, $$1, $$2);
    }

    public elx(is $$0, eoh $$1) {
        this(eld.f, $$0, $$1);
    }

    @Override
    public int b() {
        return 9;
    }

    public int a(bgr $$0) {
        this.f_((ddm)null);
        int $$1 = -1;
        int $$2 = 1;
        for (int $$3 = 0; $$3 < this.f.size(); ++$$3) {
            if (this.f.get($$3).f() || $$0.a($$2++) != 0) continue;
            $$1 = $$3;
        }
        return $$1;
    }

    public dlt b(dlt $$0) {
        int $$1 = this.f_($$0);
        for (int $$2 = 0; $$2 < this.f.size(); ++$$2) {
            dlt $$3 = this.f.get($$2);
            if (!$$3.f() && !dlt.c($$0, $$3)) continue;
            int $$4 = Math.min($$0.N(), $$1 - $$3.N());
            if ($$4 > 0) {
                if ($$3.f()) {
                    this.a($$2, $$0.a($$4));
                } else {
                    $$0.h($$4);
                    $$3.g($$4);
                }
            }
            if ($$0.f()) break;
        }
        return $$0;
    }

    @Override
    protected yh k() {
        return e;
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.f = jm.a(this.b(), dlt.l);
        if (!this.c_($$0)) {
            ccw.a($$0, this.f);
        }
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        if (!this.d_($$0)) {
            ccw.a($$0, this.f);
        }
    }

    @Override
    protected jm<dlt> g() {
        return this.f;
    }

    @Override
    protected void a(jm<dlt> $$0) {
        this.f = $$0;
    }

    @Override
    protected dhi a(int $$0, ddl $$1) {
        return new die($$0, $$1, this);
    }
}

