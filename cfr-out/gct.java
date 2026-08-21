/*
 * Decompiled with CFR 0.152.
 */
public class gct
extends gcu {
    private final geh b;
    private final gbc c;
    private final goy F = goy.d();

    public gct(gsb $$0, gbc $$1, geh $$2) {
        super($$0, $$2);
        this.b = $$2;
        this.c = $$1;
    }

    @Override
    public void bg_() {
        super.bg_();
        if (this.c.d() == null || this.c.d().a() == null) {
            return;
        }
        goy $$02 = goy.e().a(10);
        gko $$12 = new gko(yh.a("mco.connect.region", yh.c(this.c.d().a().z)), this.q);
        $$02.a($$12);
        amo $$2 = this.c.d().b() != null ? this.c.d().b().b() : gbu.e.b();
        $$02.a(gjr.a(10, 8, $$2), gox::d);
        this.F.a($$02, $$0 -> $$0.c(40));
        this.F.a($$1 -> {
            gjc cfr_ignored_0 = (gjc)this.c($$1);
        });
        this.c();
    }

    @Override
    protected void c() {
        super.c();
        int $$0 = this.a.aU_() + this.a.aR_();
        gpm $$1 = new gpm(0, $$0, this.o, this.p - $$0);
        this.F.a();
        gos.a(this.F, $$1, 0.5f, 0.0f);
    }

    @Override
    public void e() {
        super.e();
        this.b.c();
    }

    @Override
    protected void f() {
        this.b.b();
        super.f();
    }
}

