/*
 * Decompiled with CFR 0.152.
 */
public class hwt<T extends dbe>
extends hxk<T, idi> {
    private static final amo a = amo.b("textures/entity/illager/evoker.png");

    public hwt(hwq.a $$0) {
        super($$0, new hep($$0.a(hdf.ba)), 0.5f);
        this.a(new ibb<idi, hep<idi>>(this, (hyq)this){

            @Override
            public void a(fzm $$0, hpo $$1, int $$2, idi $$3, float $$4, float $$5) {
                if ($$3.a) {
                    super.a($$0, $$1, $$2, $$3, $$4, $$5);
                }
            }
        });
    }

    public amo a(idi $$0) {
        return a;
    }

    public idi b() {
        return new idi();
    }

    @Override
    public void a(T $$0, idi $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = ((dbe)$$0).ha();
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((idi)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

