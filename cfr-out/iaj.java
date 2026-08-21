/*
 * Decompiled with CFR 0.152.
 */
public class iaj
extends ibj<ick, hht> {
    private final gzo<ick> a;
    private final inq b;

    public iaj(hyq<ick, hht> $$0, hdc $$1, inq $$2) {
        super($$0);
        this.a = new hhr($$1.a(hdf.cF));
        this.b = $$2;
    }

    private boolean a(dlt $$0, inr.d $$1) {
        dun $$2 = $$0.a(ki.H);
        if ($$2 == null || $$2.d().isEmpty()) {
            return false;
        }
        inr $$3 = this.b.a($$2.d().get());
        return !$$3.a($$1).isEmpty();
    }

    @Override
    public void a(fzm $$0, hpo $$1, int $$2, ick $$3, float $$4, float $$5) {
        if ($$3.Q || !$$3.w) {
            return;
        }
        ddq $$6 = $$3.a;
        if ($$6.b() == null) {
            return;
        }
        if (this.a($$3.aq, inr.d.c)) {
            return;
        }
        $$0.a();
        if (this.a($$3.aq, inr.d.a)) {
            $$0.a(0.0f, -0.053125f, 0.06875f);
        }
        $$1.a(this.a, $$3, $$0, ijt.d($$6.b().b()), $$2, ilg.d, $$3.U, null);
        $$0.b();
    }
}

