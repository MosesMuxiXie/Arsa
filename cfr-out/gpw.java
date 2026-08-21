/*
 * Decompiled with CFR 0.152.
 */
public class gpw
extends gpz<gqp> {
    private final inu b;

    public gpw(hon.a $$0, inu $$1) {
        super($$0);
        this.b = $$1;
    }

    @Override
    public Class<gqp> a() {
        return gqp.class;
    }

    @Override
    protected void a(gqp $$0, fzm $$1) {
        gfj.V().i.t().a(fyd.a.b);
        $$1.a(0.0f, -0.75f, 0.0f);
        ins $$2 = hpj.a($$0.c());
        gzp.a $$3 = $$0.b();
        fzp $$4 = $$2.a(this.b, this.a, $$3::a);
        $$3.a($$1, $$4, 0xF000F0, ilg.d);
    }

    @Override
    protected String b() {
        return "sign";
    }
}

