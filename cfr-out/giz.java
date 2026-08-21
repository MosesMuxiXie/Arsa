/*
 * Decompiled with CFR 0.152.
 */
public abstract class giz
extends gjc.a {
    private static final amo a = amo.b("widget/slider");
    private static final amo n = amo.b("widget/slider_highlighted");
    private static final amo o = amo.b("widget/slider_handle");
    private static final amo p = amo.b("widget/slider_handle_highlighted");
    protected static final int b = 2;
    public static final int c = 20;
    protected static final int d = 8;
    private static final int q = 4;
    protected double e;
    protected boolean f;
    private boolean r;

    public giz(int $$0, int $$1, int $$2, int $$3, yh $$4, double $$5) {
        super($$0, $$1, $$2, $$3, $$4);
        this.e = $$5;
    }

    private amo d() {
        if (this.b() && this.aP_() && !this.f) {
            return n;
        }
        return a;
    }

    private amo e() {
        if (this.b() && (this.j || this.f)) {
            return p;
        }
        return o;
    }

    @Override
    protected yw f() {
        return yh.a("gui.narrate.slider", this.B());
    }

    @Override
    public void a(gpd $$0) {
        $$0.a(gpc.a, (yh)this.f());
        if (this.k) {
            if (this.aP_()) {
                if (this.f) {
                    $$0.a(gpc.d, (yh)yh.c("narration.slider.usage.focused"));
                } else {
                    $$0.a(gpc.d, (yh)yh.c("narration.slider.usage.focused.keyboard_cannot_change_value"));
                }
            } else {
                $$0.a(gpc.d, (yh)yh.c("narration.slider.usage.hovered"));
            }
        }
    }

    @Override
    public void a_(gir $$0, int $$1, int $$2, float $$3) {
        $$0.a(hpa.at, this.d(), this.aT_(), this.aU_(), this.aS_(), this.aR_(), bel.b(this.m));
        $$0.a(hpa.at, this.e(), this.aT_() + (int)(this.e * (double)(this.g - 8)), this.aU_(), 8, this.aR_(), bel.b(this.m));
        this.a($$0.a(this, gir.a.a), this.B(), 2);
        if (this.C()) {
            $$0.a(this.r ? fyn.f : fyn.d);
        }
    }

    @Override
    public void b(gzc $$0, boolean $$1) {
        this.r = this.k;
        this.c($$0);
    }

    @Override
    public void b(boolean $$0) {
        super.b($$0);
        if (!$$0) {
            this.f = false;
            return;
        }
        gfg $$1 = gfj.V().aY();
        if ($$1 == gfg.b || $$1 == gfg.d) {
            this.f = true;
        }
    }

    @Override
    public boolean a(gzb $$0) {
        if ($$0.c()) {
            this.f = !this.f;
            return true;
        }
        if (this.f) {
            boolean $$1 = $$0.f();
            boolean $$2 = $$0.g();
            if ($$1 || $$2) {
                float $$3 = $$1 ? -1.0f : 1.0f;
                this.a(this.e + (double)($$3 / (float)(this.g - 8)));
                return true;
            }
        }
        return false;
    }

    private void c(gzc $$0) {
        this.a(($$0.u() - (double)(this.aT_() + 4)) / (double)(this.g - 8));
    }

    protected void a(double $$0) {
        double $$1 = this.e;
        this.e = bgj.a($$0, 0.0, 1.0);
        if ($$1 != this.e) {
            this.a();
        }
        this.c();
    }

    @Override
    protected void b(gzc $$0, double $$1, double $$2) {
        this.c($$0);
        super.b($$0, $$1, $$2);
    }

    @Override
    public void a(iqr $$0) {
    }

    @Override
    public void a(gzc $$0) {
        this.r = false;
        super.a(gfj.V().ap());
    }

    protected abstract void c();

    protected abstract void a();
}

