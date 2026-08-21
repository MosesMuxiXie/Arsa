/*
 * Decompiled with CFR 0.152.
 */
public class ibk<M extends hbm>
extends ibj<idt, M> {
    private final ijs a;
    private final hbm b;
    private final hbm c;

    public ibk(hyq<idt, M> $$0, hdc $$1, amo $$2) {
        super($$0);
        this.a = ijt.g($$2);
        this.b = new hbm($$1.a(hdf.bs));
        this.c = new hbm($$1.a(hdf.bt));
    }

    @Override
    public void a(fzm $$0, hpo $$1, int $$2, idt $$3, float $$4, float $$5) {
        if (!$$3.c || !$$3.a.a(bdy.aM)) {
            return;
        }
        hbm $$6 = $$3.aE ? this.c : this.b;
        $$1.a($$6, $$3, $$0, this.a, $$2, ilg.d, $$3.U, null);
    }
}

