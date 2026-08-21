/*
 * Decompiled with CFR 0.152.
 */
public class dle<T extends cgk>
extends dlp {
    private final cgu<T> a;
    private final int b;

    public dle(cgu<T> $$0, int $$1, dlp.a $$2) {
        super($$2);
        this.a = $$0;
        this.b = $$1;
    }

    @Override
    public cdc a(dwo $$0, ddm $$1, cdb $$2) {
        dlt $$3 = $$1.b($$2);
        if ($$0.B_()) {
            return cdc.e;
        }
        cgk $$4 = $$1.dA();
        if ($$1.cq() && $$4 instanceof chi) {
            chi $$5 = (chi)((Object)$$4);
            if ($$4.ay() == this.a && $$5.a()) {
                cgv $$6 = $$2.a();
                dlt $$7 = $$3.a(this.b, dlx.sZ, $$1, $$6);
                return cdc.b.a($$7);
            }
        }
        $$1.b(bdk.c.b(this));
        return cdc.e;
    }
}

