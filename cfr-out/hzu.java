/*
 * Decompiled with CFR 0.152.
 */
public class hzu
extends hxx<daj, ifu, hft> {
    private static final amo a = amo.b("textures/entity/witch.png");

    public hzu(hwq.a $$0) {
        super($$0, new hft($$0.a(hdf.ej)), 0.5f);
        this.a(new ibx(this));
    }

    public amo a(ifu $$0) {
        return a;
    }

    public ifu b() {
        return new ifu();
    }

    @Override
    public void a(daj $$0, ifu $$1, float $$2) {
        super.a($$0, $$1, $$2);
        idw.a($$0, $$1, this.g);
        $$1.a = $$0.aA();
        dlt $$3 = $$0.fx();
        $$1.b = !$$3.f();
        $$1.c = $$3.a(dlx.up);
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((ifu)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

