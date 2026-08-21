/*
 * Decompiled with CFR 0.152.
 */
public class awr
extends axh {
    public static final int a = 5;
    public static final int b = 120500;
    private boolean e;
    private boolean f;
    private int g;
    private int h;

    public awr(axg $$0) {
        super($$0);
    }

    @Override
    public void a() {
        super.a();
        ++this.h;
        long $$0 = this.c.au();
        long $$1 = $$0 / 24000L + 1L;
        if (!this.e && this.h > 20) {
            this.e = true;
            this.d.g.b(new aem(aem.g, 0.0f));
        }
        boolean bl2 = this.f = $$0 > 120500L;
        if (this.f) {
            ++this.g;
        }
        if ($$0 % 24000L == 500L) {
            if ($$1 <= 6L) {
                if ($$1 == 6L) {
                    this.d.g.b(new aem(aem.g, 104.0f));
                } else {
                    this.d.a(yh.c("demo.day." + $$1));
                }
            }
        } else if ($$1 == 1L) {
            if ($$0 == 100L) {
                this.d.g.b(new aem(aem.g, 101.0f));
            } else if ($$0 == 175L) {
                this.d.g.b(new aem(aem.g, 102.0f));
            } else if ($$0 == 250L) {
                this.d.g.b(new aem(aem.g, 103.0f));
            }
        } else if ($$1 == 5L && $$0 % 24000L == 22000L) {
            this.d.a(yh.c("demo.day.warning"));
        }
    }

    private void f() {
        if (this.g > 100) {
            this.d.a(yh.c("demo.reminder"));
            this.g = 0;
        }
    }

    @Override
    public void a(is $$0, aji.a $$1, iz $$2, int $$3, int $$4) {
        if (this.f) {
            this.f();
            return;
        }
        super.a($$0, $$1, $$2, $$3, $$4);
    }

    @Override
    public cdc a(axg $$0, dwo $$1, dlt $$2, cdb $$3) {
        if (this.f) {
            this.f();
            return cdc.e;
        }
        return super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public cdc a(axg $$0, dwo $$1, dlt $$2, cdb $$3, fti $$4) {
        if (this.f) {
            this.f();
            return cdc.e;
        }
        return super.a($$0, $$1, $$2, $$3, $$4);
    }
}

