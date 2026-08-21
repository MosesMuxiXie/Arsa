/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import org.joml.Quaternionfc;

public class hvw
extends hvh<cvb, ict, hau> {
    public hvw(hwq.a $$0) {
        super($$0, new hau($$0.a(hdf.Q)), new hau($$0.a(hdf.R)), 0.4f);
        this.a(new ial(this, $$0.f()));
    }

    public amo a(ict $$0) {
        return $$0.a;
    }

    public ict a() {
        return new ict();
    }

    @Override
    public void a(cvb $$0, ict $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = $$0.hd().a().b().b();
        $$1.d = $$0.cz();
        $$1.e = $$0.cA();
        $$1.f = $$0.gQ();
        $$1.g = $$0.L($$2);
        $$1.h = $$0.M($$2);
        $$1.i = $$0.N($$2);
        $$1.b = $$0.hi();
        $$1.c = $$0.p() ? $$0.hf() : null;
    }

    @Override
    protected void a(ict $$0, fzm $$1, float $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        float $$4 = $$0.g;
        if ($$4 > 0.0f) {
            $$1.a(0.4f * $$4, 0.15f * $$4, 0.1f * $$4);
            $$1.a((Quaternionfc)a.f.rotationDegrees(bgj.i($$4, 0.0f, 90.0f)));
            if ($$0.b) {
                $$1.a(0.15f * $$4, 0.0f, 0.0f);
            }
        }
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((ict)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.a();
    }
}

