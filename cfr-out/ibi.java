/*
 * Decompiled with CFR 0.152.
 */
public class ibi<S extends ick, M extends gzm<S> & gzn>
extends ibb<S, M> {
    private static final float a = -0.5235988f;
    private static final float b = 1.5707964f;

    public ibi(hyq<S, M> $$0) {
        super($$0);
    }

    @Override
    protected void a(S $$0, ihm $$1, dlt $$2, chb $$3, fzm $$4, hpo $$5, int $$6) {
        cdb $$7;
        if ($$1.e()) {
            return;
        }
        cdb cdb2 = $$7 = $$3 == ((ick)$$0).e ? cdb.a : cdb.b;
        if (((ick)$$0).al && ((ick)$$0).ag == $$7 && ((ick)$$0).m < 1.0E-5f && !((ick)$$0).F.e()) {
            this.a($$0, $$3, $$4, $$5, $$6);
        } else {
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
        }
    }

    private void a(S $$0, chb $$1, fzm $$2, hpo $$3, int $$4) {
        $$2.a();
        ((gzp)this.d()).b().a($$2);
        hdg $$5 = ((gzn)this.d()).a();
        float $$6 = $$5.e;
        $$5.e = bgj.a($$5.e, -0.5235988f, 1.5707964f);
        $$5.a($$2);
        $$5.e = $$6;
        iao.a($$2, iao.a.a);
        boolean $$7 = $$1 == chb.a;
        $$2.a(($$7 ? -2.5f : 2.5f) / 16.0f, -0.0625f, 0.0f);
        ((ick)$$0).F.a($$2, $$3, $$4, ilg.d, ((ick)$$0).U);
        $$2.b();
    }
}

