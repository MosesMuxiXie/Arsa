/*
 * Decompiled with CFR 0.152.
 */
public class hzp
extends hvh<dcx, ifs, hgd> {
    private static final amo i = amo.b("textures/entity/villager/villager.png");
    public static final iao.a a = new iao.a(-0.1171875f, -0.07421875f, 1.0f);

    public hzp(hwq.a $$0) {
        super($$0, new hgd($$0.a(hdf.dV)), new hgd($$0.a(hdf.dX)), 0.5f);
        this.a(new iao<ifs, hgd>(this, $$0.f(), $$0.k(), a));
        this.a(new ibv<ifs, hgd>(this, $$0.e(), "villager", new hgd($$0.a(hdf.dW)), new hgd($$0.a(hdf.dY))));
        this.a(new ian<ifs, hgd>(this));
    }

    public amo a(ifs $$0) {
        return i;
    }

    @Override
    protected float b(ifs $$0) {
        float $$1 = super.g($$0);
        if ($$0.aE) {
            return $$1 * 0.5f;
        }
        return $$1;
    }

    public ifs b() {
        return new ifs();
    }

    @Override
    public void a(dcx $$0, ifs $$1, float $$2) {
        super.a($$0, $$1, $$2);
        idw.a($$0, $$1, this.g);
        $$1.a = $$0.p() > 0;
        $$1.b = $$0.gZ();
    }

    @Override
    protected /* synthetic */ float g(ieh ieh2) {
        return this.b((ifs)ieh2);
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((ifs)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }

    @Override
    protected /* synthetic */ float c(idf idf2) {
        return this.b((ifs)idf2);
    }
}

