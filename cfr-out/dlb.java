/*
 * Decompiled with CFR 0.152.
 */
public class dlb
extends dlp
implements dmn {
    public static final byte[] a = new byte[]{1, 2, 3};
    public static final double b = 0.15;

    public dlb(dlp.a $$0) {
        super($$0);
    }

    @Override
    public cdc a(dpw $$0) {
        dwo $$1 = $$0.q();
        ddm $$2 = $$0.o();
        if ($$2 != null && $$2.gj()) {
            return cdc.e;
        }
        if ($$1 instanceof axf) {
            axf $$3 = (axf)$$1;
            dlt $$4 = $$0.n();
            ftm $$5 = $$0.l();
            iz $$6 = $$0.k();
            dec.a(new ddy($$1, $$0.o(), $$5.g + (double)$$6.j() * 0.15, $$5.h + (double)$$6.k() * 0.15, $$5.i + (double)$$6.l() * 0.15, $$4), $$3, $$4);
            $$4.h(1);
        }
        return cdc.a;
    }

    @Override
    public cdc a(dwo $$0, ddm $$1, cdb $$2) {
        if ($$1.gj()) {
            dlt $$3 = $$1.b($$2);
            if ($$0 instanceof axf) {
                axf $$4 = (axf)$$0;
                if ($$1.d((ddm)null)) {
                    $$0.a(null, $$1, bda.qd, bdb.g, 1.0f, 1.0f);
                }
                dec.a(new ddy($$0, $$3, $$1), $$4, $$3);
                $$3.a(1, (chl)$$1);
                $$1.b(bdk.c.b(this));
            }
            return cdc.a;
        }
        return cdc.e;
    }

    @Override
    public dec a(dwo $$0, jn $$1, dlt $$2, iz $$3) {
        return new ddy($$0, $$2.c(1), $$1.a(), $$1.b(), $$1.c(), true);
    }

    @Override
    public dmn.a a() {
        return dmn.a.a().a(dlb::a).a(1.0f).b(0.5f).a(1004).a();
    }

    private static ftm a(ld $$0, iz $$1) {
        return $$0.a().b((double)$$1.j() * 0.5000099999997474, (double)$$1.k() * 0.5000099999997474, (double)$$1.l() * 0.5000099999997474);
    }
}

