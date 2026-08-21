/*
 * Decompiled with CFR 0.152.
 */
public class hwm
extends hxx<czs, ide, hee<ide>> {
    private static final amo a = amo.b("textures/entity/enderman/enderman.png");
    private final bgr i = bgr.a();

    public hwm(hwq.a $$0) {
        super($$0, new hee($$0.a(hdf.aW)), 0.5f);
        this.a(new ias(this));
        this.a(new iak(this));
    }

    @Override
    public ftm a(ide $$0) {
        ftm $$1 = super.a($$0);
        if ($$0.a) {
            double $$2 = 0.02 * (double)$$0.az;
            return $$1.b(this.i.k() * $$2, 0.0, this.i.k() * $$2);
        }
        return $$1;
    }

    @Override
    public amo b(ide $$0) {
        return a;
    }

    public ide a() {
        return new ide();
    }

    @Override
    public void a(czs $$0, ide $$1, float $$2) {
        super.a($$0, $$1, $$2);
        hxi.a($$0, $$1, $$2, this.g);
        $$1.a = $$0.gR();
        $$1.b = $$0.gQ();
    }

    @Override
    public /* synthetic */ idf d() {
        return this.a();
    }
}

