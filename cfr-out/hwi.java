/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import org.joml.Quaternionfc;

public class hwi
extends hvg<dcl, ify, hfy> {
    private static final amo a = amo.b("textures/entity/zombie/drowned.png");

    public hwi(hwq.a $$0) {
        super($$0, new hfy($$0.a(hdf.aN)), new hfy($$0.a(hdf.aO)), hvk.a(hdf.aR, $$0.f(), hfy::new), hvk.a(hdf.aP, $$0.f(), hfy::new));
        this.a(new iar(this, $$0.f()));
    }

    public ify a() {
        return new ify();
    }

    @Override
    public amo a(ify $$0) {
        return a;
    }

    @Override
    protected void a(ify $$0, fzm $$1, float $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        float $$4 = $$0.ab;
        if ($$4 > 0.0f) {
            float $$5 = -10.0f - $$0.av;
            float $$6 = bgj.h($$4, 0.0f, $$5);
            $$1.a((Quaternionfc)a.b.rotationDegrees($$6), 0.0f, $$0.N / 2.0f / $$3, 0.0f);
        }
    }

    @Override
    protected gzo.a a(dcl $$0, chb $$1) {
        dlt $$2 = $$0.b($$1);
        if ($$0.at() == $$1 && $$0.gI() && $$2.a(dlx.yr)) {
            return gzo.a.e;
        }
        return super.a($$0, $$1);
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((ify)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.a();
    }
}

