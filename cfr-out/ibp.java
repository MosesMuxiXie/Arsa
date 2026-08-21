/*
 * Decompiled with CFR 0.152.
 */
public class ibp
extends ibj<ifd, hfj> {
    private final hfj a;

    public ibp(hyq<ifd, hfj> $$0, hdc $$1) {
        super($$0);
        this.a = new hfj($$1.a(hdf.dq));
    }

    @Override
    public void a(fzm $$0, hpo $$1, int $$2, ifd $$3, float $$4, float $$5) {
        boolean $$6;
        boolean bl2 = $$6 = $$3.d() && $$3.Q;
        if ($$3.Q && !$$6) {
            return;
        }
        int $$7 = hxs.a($$3, 0.0f);
        if ($$6) {
            $$1.a(1).a(this.a, $$3, $$0, ijt.s(hyx.a), $$2, $$7, -1, null, $$3.U, null);
        } else {
            $$1.a(1).a(this.a, $$3, $$0, ijt.j(hyx.a), $$2, $$7, -1, null, $$3.U, null);
        }
    }
}

