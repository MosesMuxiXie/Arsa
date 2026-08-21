/*
 * Decompiled with CFR 0.152.
 */
public class hzo
extends hxx<dai, ifq, hfp> {
    private static final amo a = amo.b("textures/entity/illager/vex.png");
    private static final amo i = amo.b("textures/entity/illager/vex_charging.png");

    public hzo(hwq.a $$0) {
        super($$0, new hfp($$0.a(hdf.dU)), 0.3f);
        this.a(new ibb<ifq, hfp>(this));
    }

    @Override
    protected int a(dai $$0, is $$1) {
        return 15;
    }

    public amo a(ifq $$0) {
        if ($$0.a) {
            return i;
        }
        return a;
    }

    public ifq b() {
        return new ifq();
    }

    @Override
    public void a(dai $$0, ifq $$1, float $$2) {
        super.a($$0, $$1, $$2);
        ich.a($$0, $$1, this.g, $$2);
        $$1.a = $$0.gR();
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((ifq)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

