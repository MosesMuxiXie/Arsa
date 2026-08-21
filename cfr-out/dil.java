/*
 * Decompiled with CFR 0.152.
 */
public class dil
extends dhl {
    private static final amo s = amo.b("container/slot/saddle");
    private static final amo t = amo.b("container/slot/llama_armor");
    private static final amo u = amo.b("container/slot/horse_armor");

    public dil(int $$0, ddl $$1, ccv $$2, final cup $$3, int $$4) {
        super($$0, $$1, $$2, $$3);
        ccv $$5 = $$3.h(cgv.h);
        this.a(new dhn(this, $$5, $$3, cgv.h, 0, 8, 18, s){

            @Override
            public boolean b() {
                return $$3.e(cgv.h) && $$3.ay().a(bdt.K);
            }
        });
        final boolean $$6 = $$3 instanceof cus;
        amo $$7 = $$6 ? t : u;
        ccv $$8 = $$3.h(cgv.g);
        this.a(new dhn(this, $$8, $$3, cgv.g, 0, 8, 36, $$7){

            @Override
            public boolean b() {
                return $$3.e(cgv.g) && ($$3.ay().a(bdt.M) || $$6);
            }
        });
        if ($$4 > 0) {
            for (int $$9 = 0; $$9 < 3; ++$$9) {
                for (int $$10 = 0; $$10 < $$4; ++$$10) {
                    this.a(new dji($$2, $$10 + $$9 * $$4, 80 + $$10 * 18, 18 + $$9 * 18));
                }
            }
        }
        this.c($$1, 8, 84);
    }

    @Override
    protected boolean c(ccv $$0) {
        return ((cup)this.n).a($$0);
    }
}

