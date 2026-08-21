/*
 * Decompiled with CFR 0.152.
 */
public class diw
extends dhl {
    private static final amo s = amo.b("container/slot/saddle");
    private static final amo t = amo.b("container/slot/nautilus_armor_inventory");

    public diw(int $$0, ddl $$1, ccv $$2, final cwn $$3, int $$4) {
        super($$0, $$1, $$2, $$3);
        ccv $$5 = $$3.h(cgv.h);
        this.a(new dhn(this, $$5, $$3, cgv.h, 0, 8, 18, s){

            @Override
            public boolean b() {
                return $$3.e(cgv.h);
            }
        });
        ccv $$6 = $$3.h(cgv.g);
        this.a(new dhn(this, $$6, $$3, cgv.g, 0, 8, 36, t){

            @Override
            public boolean b() {
                return $$3.e(cgv.g);
            }
        });
        this.c($$1, 8, 84);
    }

    @Override
    protected boolean c(ccv $$0) {
        return ((cwn)this.n).a($$0);
    }
}

