/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import org.joml.Quaternionfc;

public class hwy
extends hvh<cvo, ido, hbg> {
    private static final amo a = amo.b("textures/entity/fox/fox.png");
    private static final amo i = amo.b("textures/entity/fox/fox_sleep.png");
    private static final amo j = amo.b("textures/entity/fox/snow_fox.png");
    private static final amo k = amo.b("textures/entity/fox/snow_fox_sleep.png");

    public hwy(hwq.a $$0) {
        super($$0, new hbg($$0.a(hdf.bc)), new hbg($$0.a(hdf.bd)), 0.4f);
        this.a(new iaw(this));
    }

    @Override
    protected void a(ido $$0, fzm $$1, float $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        if ($$0.g || $$0.f) {
            $$1.a((Quaternionfc)a.b.rotationDegrees(-$$0.av));
        }
    }

    public amo a(ido $$0) {
        if ($$0.h == cvo.v.a) {
            return $$0.d ? i : a;
        }
        return $$0.d ? k : j;
    }

    public ido b() {
        return new ido();
    }

    @Override
    public void a(cvo $$0, ido $$1, float $$2) {
        super.a($$0, $$1, $$2);
        idw.a($$0, $$1, this.g);
        $$1.a = $$0.L($$2);
        $$1.c = $$0.cz();
        $$1.b = $$0.M($$2);
        $$1.d = $$0.gr();
        $$1.e = $$0.gQ();
        $$1.f = $$0.gR();
        $$1.g = $$0.gS();
        $$1.h = $$0.gP();
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((ido)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

