/*
 * Decompiled with CFR 0.152.
 */
public class gps
extends gpz<gql> {
    private final inu b;

    public gps(hon.a $$0, inu $$1) {
        super($$0);
        this.b = $$1;
    }

    @Override
    public Class<gql> a() {
        return gql.class;
    }

    @Override
    protected void a(gql $$0, fzm $$1) {
        gfj.V().i.t().a(fyd.a.b);
        $$1.a(0.0f, 0.25f, 0.0f);
        ige $$2 = gfj.V().i.c();
        hpp $$3 = $$2.c();
        hrd.a(this.b, $$1, $$3, 0xF000F0, ilg.d, $$0.b(), Float.valueOf(0.0f), inx.h, true, $$0.c(), $$0.d(), false, null, 0);
        $$2.a();
    }

    @Override
    protected String b() {
        return "banner result";
    }
}

