/*
 * Decompiled with CFR 0.152.
 */
public class hvo
extends hxx<cte, icm, gzs> {
    private static final amo a = amo.b("textures/entity/bat.png");

    public hvo(hwq.a $$0) {
        super($$0, new gzs($$0.a(hdf.s)), 0.25f);
    }

    public amo a(icm $$0) {
        return a;
    }

    public icm a() {
        return new icm();
    }

    @Override
    public void a(cte $$0, icm $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = $$0.p();
        $$1.b.a($$0.c);
        $$1.c.a($$0.d);
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((icm)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.a();
    }
}

