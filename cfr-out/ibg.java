/*
 * Decompiled with CFR 0.152.
 */
public class ibg
extends ibj<ick, hht> {
    private final hce a;

    public ibg(hyq<ick, hht> $$0, hdc $$1) {
        super($$0);
        this.a = new hce($$1.a(hdf.cq));
    }

    @Override
    public void a(fzm $$0, hpo $$1, int $$2, ick $$3, float $$4, float $$5) {
        cwy.b $$7;
        cwy.b $$6 = $$3.B;
        if ($$6 != null) {
            this.a($$0, $$1, $$2, $$3, $$6, $$4, $$5, true);
        }
        if (($$7 = $$3.C) != null) {
            this.a($$0, $$1, $$2, $$3, $$7, $$4, $$5, false);
        }
    }

    private void a(fzm $$0, hpo $$1, int $$2, ick $$3, cwy.b $$4, float $$5, float $$6, boolean $$7) {
        $$0.a();
        $$0.a($$7 ? 0.4f : -0.4f, $$3.ah ? -1.3f : -1.5f, 0.0f);
        ieq $$8 = new ieq();
        $$8.c = hce.a.e;
        $$8.L = $$3.L;
        $$8.ax = $$3.ax;
        $$8.ay = $$3.ay;
        $$8.au = $$5;
        $$8.av = $$6;
        $$1.a(this.a, $$8, $$0, this.a.a(hyg.a($$4)), $$2, ilg.d, $$3.U, null);
        $$0.b();
    }
}

