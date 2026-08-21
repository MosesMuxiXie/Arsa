/*
 * Decompiled with CFR 0.152.
 */
public class dnm
extends dlp
implements dmn {
    public static float a = 1.5f;

    public dnm(dlp.a $$0) {
        super($$0);
    }

    @Override
    public cdc a(dwo $$0, ddm $$1, cdb $$22) {
        dlt $$32 = $$1.b($$22);
        if ($$0 instanceof axf) {
            axf $$42 = (axf)$$0;
            dec.a(($$2, $$3, $$4) -> new dev($$1, $$0, $$1.dI().a(), $$1.bV().b(), $$1.dI().c()), $$42, $$32, $$1, 0.0f, a, 1.0f);
        }
        $$0.a(null, $$1.dP(), $$1.dR(), $$1.dV(), bda.FK, bdb.g, 0.5f, 0.4f / ($$0.G_().i() * 0.4f + 0.8f));
        $$1.b(bdk.c.b(this));
        $$32.a(1, (chl)$$1);
        return cdc.a;
    }

    @Override
    public dec a(dwo $$0, jn $$1, dlt $$2, iz $$3) {
        bgr $$4 = $$0.G_();
        double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
        double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
        double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
        ftm $$8 = new ftm($$5, $$6, $$7);
        dev $$9 = new dev($$0, $$1.a(), $$1.b(), $$1.c(), $$8);
        $$9.k($$8);
        return $$9;
    }

    @Override
    public void a(dec $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
    }

    @Override
    public dmn.a a() {
        return dmn.a.a().a((ld $$0, iz $$1) -> eby.a($$0, 1.0, ftm.c)).a(6.6666665f).b(1.0f).a(1051).a();
    }
}

