/*
 * Decompiled with CFR 0.152.
 */
public class hwf
extends hvh<cum, ida, han> {
    private static final amo a = amo.b("textures/entity/dolphin.png");

    public hwf(hwq.a $$0) {
        super($$0, new han($$0.a(hdf.aE)), new han($$0.a(hdf.aF)), 0.7f);
        this.a(new iaq(this));
    }

    public amo a(ida $$0) {
        return a;
    }

    public ida a() {
        return new ida();
    }

    @Override
    public void a(cum $$0, ida $$1, float $$2) {
        super.a($$0, $$1, $$2);
        idw.a($$0, $$1, this.g);
        $$1.a = $$0.dN().j() > 1.0E-7;
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((ida)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.a();
    }
}

