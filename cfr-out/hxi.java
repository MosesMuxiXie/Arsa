/*
 * Decompiled with CFR 0.152.
 */
public abstract class hxi<T extends chn, S extends idy, M extends gzo<S>>
extends hvh<T, S, M> {
    public hxi(hwq.a $$0, M $$1, float $$2) {
        this($$0, $$1, $$1, $$2);
    }

    public hxi(hwq.a $$0, M $$1, M $$2, float $$3) {
        this($$0, $$1, $$2, $$3, iao.a.a);
    }

    public hxi(hwq.a $$0, M $$1, M $$2, float $$3, iao.a $$4) {
        super($$0, $$1, $$2, $$3);
        this.a(new iao(this, $$0.f(), $$0.k(), $$4));
        this.a(new ibw(this, $$0.f(), $$0.h()));
        this.a(new ibb(this));
    }

    protected gzo.a a(T $$0, chb $$1) {
        dlt $$2 = ((chl)$$0).b($$1);
        dpb $$3 = $$2.a(ki.P);
        if ($$3 != null && $$3.a() == dnf.c && ((chn)$$0).bp) {
            return gzo.a.k;
        }
        if ($$2.a(bdy.cf)) {
            return gzo.a.k;
        }
        return gzo.a.a;
    }

    @Override
    public void a(T $$0, S $$1, float $$2) {
        super.a($$0, $$1, $$2);
        hxi.a($$0, $$1, $$2, this.g);
        ((idy)$$1).i = this.a($$0, chb.a);
        ((idy)$$1).f = this.a($$0, chb.b);
    }

    public static void a(chl $$0, idy $$1, float $$2, ihk $$3) {
        ich.a($$0, $$1, $$3, $$2);
        $$1.ah = $$0.cz();
        $$1.ai = $$0.gj();
        $$1.aj = $$0.cC();
        $$1.ak = $$0.cq();
        $$1.ac = 1.0f;
        if ($$1.ai) {
            $$1.ac = (float)$$0.dN().h();
            $$1.ac /= 0.2f;
            $$1.ac *= $$1.ac * $$1.ac;
        }
        if ($$1.ac < 1.0f) {
            $$1.ac = 1.0f;
        }
        $$1.ab = $$0.b($$2);
        $$1.af = hxi.c($$0);
        $$1.ag = $$0.ga();
        $$1.ad = dkm.b($$0.gb(), $$0);
        $$1.ae = $$0.H($$2);
        $$1.al = $$0.fZ();
        $$1.am = $$0.bG.a($$2);
        $$1.an = $$0.bG.b($$2);
        $$1.ao = $$0.bG.c($$2);
        $$1.ap = hxi.a($$0, cgv.f);
        $$1.aq = hxi.a($$0, cgv.e);
        $$1.ar = hxi.a($$0, cgv.d);
        $$1.as = hxi.a($$0, cgv.c);
    }

    private static dlt a(chl $$0, cgv $$1) {
        dlt $$2 = $$0.a($$1);
        return iay.a($$2, $$1) ? $$2.v() : dlt.l;
    }

    private static chb c(chl $$0) {
        chb $$1 = $$0.at();
        return $$0.bq == cdb.a ? $$1 : $$1.a();
    }
}

