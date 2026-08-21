/*
 * Decompiled with CFR 0.152.
 */
public class hxf
extends hvh<cwk, idt, hbm> {
    private static final amo a = amo.b("textures/entity/ghast/happy_ghast.png");
    private static final amo i = amo.b("textures/entity/ghast/happy_ghast_baby.png");
    private static final amo j = amo.b("textures/entity/ghast/happy_ghast_ropes.png");

    public hxf(hwq.a $$02) {
        super($$02, new hbm($$02.a(hdf.bo)), new hbm($$02.a(hdf.bp)), 2.0f);
        this.a(new ibn<idt, hbm, hbl>(this, $$02.h(), inr.d.p, $$0 -> $$0.a, new hbl($$02.a(hdf.bq)), new hbl($$02.a(hdf.br))));
        this.a(new ibk<hbm>(this, $$02.f(), j));
    }

    public amo a(idt $$0) {
        if ($$0.aE) {
            return i;
        }
        return a;
    }

    public idt b() {
        return new idt();
    }

    @Override
    protected fth a(cwk $$0) {
        fth $$1 = super.a($$0);
        float $$2 = $$0.dG();
        return $$1.b($$1.b - (double)($$2 / 2.0f));
    }

    @Override
    public void a(cwk $$0, idt $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = $$0.a(cgv.g).v();
        $$1.b = $$0.cr();
        $$1.c = $$0.gP();
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((idt)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

