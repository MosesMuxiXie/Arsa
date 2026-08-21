/*
 * Decompiled with CFR 0.152.
 */
public class ibd
extends ibj<iei, hbu> {
    private final hbu a;
    private final hbu b;
    private final iau c;

    public ibd(hyq<iei, hbu> $$0, hdc $$1, iau $$2) {
        super($$0);
        this.c = $$2;
        this.a = new hbu($$1.a(hdf.bP));
        this.b = new hbu($$1.a(hdf.bO));
    }

    @Override
    public void a(fzm $$0, hpo $$1, int $$2, iei $$3, float $$4, float $$5) {
        dlt $$6 = $$3.c;
        dun $$7 = $$6.a(ki.H);
        if ($$7 != null && $$7.d().isPresent()) {
            this.a($$0, $$1, $$3, $$6, $$7.d().get(), $$2);
        } else if ($$3.d) {
            this.a($$0, $$1, $$3, dlt.l, dum.n, $$2);
        }
    }

    private void a(fzm $$0, hpo $$1, iei $$2, dlt $$3, amt<dul> $$4, int $$5) {
        hbu $$6 = $$2.aE ? this.b : this.a;
        this.c.a(inr.d.f, $$4, $$6, $$2, $$3, $$0, $$1, $$5, $$2.U);
    }
}

