/*
 * Decompiled with CFR 0.152.
 */
public abstract class gjb
extends gix {
    private static final gku c = new gku(amo.b("widget/text_field"), amo.b("widget/text_field_highlighted"));
    private static final int d = 4;
    public static final int a = 8;
    private boolean e = true;
    private boolean f = true;

    public gjb(int $$0, int $$1, int $$2, int $$3, yh $$4) {
        super($$0, $$1, $$2, $$3, $$4);
    }

    public gjb(int $$0, int $$1, int $$2, int $$3, yh $$4, boolean $$5, boolean $$6) {
        this($$0, $$1, $$2, $$3, $$4);
        this.e = $$5;
        this.f = $$6;
    }

    @Override
    public boolean a(gzc $$0, boolean $$1) {
        boolean $$2 = this.c($$0);
        return super.a($$0, $$1) || $$2;
    }

    @Override
    public boolean a(gzb $$0) {
        boolean $$1 = $$0.h();
        boolean $$2 = $$0.i();
        if ($$1 || $$2) {
            double $$3 = this.h();
            this.a(this.h() + (double)($$1 ? -1 : 1) * this.p());
            if ($$3 != this.h()) {
                return true;
            }
        }
        return super.a($$0);
    }

    @Override
    public void a_(gir $$0, int $$1, int $$2, float $$3) {
        if (!this.l) {
            return;
        }
        if (this.e) {
            this.b($$0);
        }
        $$0.c(this.aT_() + 1, this.aU_() + 1, this.aT_() + this.g - 1, this.aU_() + this.h - 1);
        $$0.e().pushMatrix();
        $$0.e().translate(0.0f, (float)(-this.h()));
        this.c($$0, $$1, $$2, $$3);
        $$0.e().popMatrix();
        $$0.f();
        this.a($$0, $$1, $$2);
        if (this.f) {
            this.a($$0);
        }
    }

    protected void a(gir $$0) {
    }

    protected int a() {
        return 4;
    }

    protected int c() {
        return this.a() * 2;
    }

    @Override
    public boolean a_(double $$0, double $$1) {
        return this.k && this.l && $$0 >= (double)this.aT_() && $$1 >= (double)this.aU_() && $$0 < (double)(this.E() + 6) && $$1 < (double)this.F();
    }

    @Override
    protected int m() {
        return this.E();
    }

    @Override
    protected int o() {
        return this.d() + this.c();
    }

    protected void b(gir $$0) {
        this.a($$0, this.aT_(), this.aU_(), this.aS_(), this.aR_());
    }

    protected void a(gir $$0, int $$1, int $$2, int $$3, int $$4) {
        amo $$5 = c.a(this.b(), this.aP_());
        $$0.a(hpa.at, $$5, $$1, $$2, $$3, $$4);
    }

    protected boolean a(int $$0, int $$1) {
        return (double)$$1 - this.h() >= (double)this.aU_() && (double)$$0 - this.h() <= (double)(this.aU_() + this.h);
    }

    protected abstract int d();

    protected abstract void c(gir var1, int var2, int var3, float var4);

    protected int e() {
        return this.aT_() + this.a();
    }

    protected int t() {
        return this.aU_() + this.a();
    }

    @Override
    public void a(iqr $$0) {
    }
}

