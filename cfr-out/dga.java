/*
 * Decompiled with CFR 0.152.
 */
public abstract class dga
extends cgk {
    protected static final alw<Integer> a = ama.a(dga.class, aly.b);
    protected static final alw<Integer> b = ama.a(dga.class, aly.b);
    protected static final alw<Float> c = ama.a(dga.class, aly.d);

    public dga(cgu<?> $$0, dwo $$1) {
        super($$0, $$1);
    }

    @Override
    public boolean b(cex $$0) {
        return true;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        if (this.eh()) {
            return true;
        }
        if (this.d($$1)) {
            return false;
        }
        this.l(-this.n());
        this.d(10);
        this.bT();
        this.a(this.f() + $$2 * 10.0f);
        this.a(etk.o, $$1.d());
        var6_4 = $$1.d();
        if (!(var6_4 instanceof ddm)) ** GOTO lbl-1000
        $$3 = (ddm)var6_4;
        if ($$3.gL().d) {
            v0 = true;
        } else lbl-1000:
        // 2 sources

        {
            v0 = $$4 = false;
        }
        if ($$4 == false && this.f() > 40.0f || this.a($$1)) {
            this.a($$0, $$1);
        } else if ($$4) {
            this.aC();
        }
        return true;
    }

    protected boolean a(cex $$0) {
        return false;
    }

    @Override
    public boolean a(dwi $$0) {
        return $$0.c() instanceof chn && $$0.a().U().a(eua.F) == false;
    }

    public void a(axf $$0, dlp $$1) {
        this.c($$0);
        if (!$$0.U().a(eua.k).booleanValue()) {
            return;
        }
        dlt $$2 = new dlt($$1);
        $$2.b(ki.h, this.as());
        this.a($$0, $$2);
    }

    @Override
    protected void a(ama.a $$0) {
        $$0.a(a, 0);
        $$0.a(b, 1);
        $$0.a(c, Float.valueOf(0.0f));
    }

    public void d(int $$0) {
        this.az.a(a, $$0);
    }

    public void l(int $$0) {
        this.az.a(b, $$0);
    }

    public void a(float $$0) {
        this.az.a(c, Float.valueOf($$0));
    }

    public float f() {
        return this.az.a(c).floatValue();
    }

    public int m() {
        return this.az.a(a);
    }

    public int n() {
        return this.az.a(b);
    }

    protected void a(axf $$0, cex $$1) {
        this.a($$0, this.p());
    }

    @Override
    public int co() {
        return 10;
    }

    protected abstract dlp p();
}

