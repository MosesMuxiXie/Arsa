/*
 * Decompiled with CFR 0.152.
 */
public class hvt
extends hxx<dal, icr, hdw> {
    private static final amo a = amo.b("textures/entity/breeze/breeze.png");

    public hvt(hwq.a $$0) {
        super($$0, new hdw($$0.a(hdf.H)), 0.5f);
        this.a(new iai(this, $$0.f()));
        this.a(new iah(this, $$0.f()));
    }

    public amo a(icr $$0) {
        return a;
    }

    public icr a() {
        return new icr();
    }

    @Override
    public void a(dal $$0, icr $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a.a($$0.a);
        $$1.b.a($$0.e);
        $$1.c.a($$0.b);
        $$1.d.a($$0.c);
        $$1.e.a($$0.f);
        $$1.f.a($$0.d);
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((icr)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.a();
    }
}

