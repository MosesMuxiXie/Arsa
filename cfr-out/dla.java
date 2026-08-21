/*
 * Decompiled with CFR 0.152.
 */
public class dla
extends dlp
implements dmn {
    public dla(dlp.a $$0) {
        super($$0);
    }

    @Override
    public cdc a(dpw $$0) {
        dwo $$1 = $$0.q();
        is $$2 = $$0.a();
        eoh $$3 = $$1.a_($$2);
        boolean $$4 = false;
        if (eag.i($$3) || eah.h($$3) || eai.h($$3)) {
            this.a($$1, $$2);
            $$1.c($$2, (eoh)$$3.b(eox.u, true));
            $$1.a((cgk)$$0.o(), etk.c, $$2);
            $$4 = true;
        } else if (dzd.a($$1, $$2 = $$2.a($$0.k()), $$0.g())) {
            this.a($$1, $$2);
            $$1.c($$2, dzd.a($$1, $$2));
            $$1.a((cgk)$$0.o(), etk.i, $$2);
            $$4 = true;
        }
        if ($$4) {
            $$0.n().h(1);
            return cdc.a;
        }
        return cdc.d;
    }

    private void a(dwo $$0, is $$1) {
        bgr $$2 = $$0.G_();
        $$0.a(null, $$1, bda.kx, bdb.e, 1.0f, ($$2.i() - $$2.i()) * 0.2f + 1.0f);
    }

    @Override
    public dec a(dwo $$0, jn $$1, dlt $$2, iz $$3) {
        bgr $$4 = $$0.G_();
        double $$5 = $$4.a((double)$$3.j(), 0.11485000000000001);
        double $$6 = $$4.a((double)$$3.k(), 0.11485000000000001);
        double $$7 = $$4.a((double)$$3.l(), 0.11485000000000001);
        ftm $$8 = new ftm($$5, $$6, $$7);
        deq $$9 = new deq($$0, $$1.a(), $$1.b(), $$1.c(), $$8.d());
        $$9.a($$2);
        return $$9;
    }

    @Override
    public void a(dec $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
    }

    @Override
    public dmn.a a() {
        return dmn.a.a().a((ld $$0, iz $$1) -> eby.a($$0, 1.0, ftm.c)).a(6.6666665f).b(1.0f).a(1018).a();
    }
}

