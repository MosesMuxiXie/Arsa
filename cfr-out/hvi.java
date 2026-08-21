/*
 * Decompiled with CFR 0.152.
 */
public class hvi
extends hxx<ctl, icf, gzu> {
    private static final amo a = amo.b("textures/entity/allay/allay.png");

    public hvi(hwq.a $$0) {
        super($$0, new gzu($$0.a(hdf.c)), 0.4f);
        this.a(new ibb<icf, gzu>(this));
    }

    public amo a(icf $$0) {
        return a;
    }

    public icf a() {
        return new icf();
    }

    @Override
    public void a(ctl $$0, icf $$1, float $$2) {
        super.a($$0, $$1, $$2);
        ich.a($$0, $$1, this.g, $$2);
        $$1.a = $$0.gQ();
        $$1.b = $$0.gR();
        $$1.c = $$0.M($$2);
        $$1.d = $$0.L($$2);
    }

    @Override
    protected int a(ctl $$0, is $$1) {
        return 15;
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((icf)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.a();
    }
}

