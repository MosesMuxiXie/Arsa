/*
 * Decompiled with CFR 0.152.
 */
public class hzq
extends hxk<dbf, idz> {
    private static final amo a = amo.b("textures/entity/illager/vindicator.png");

    public hzq(hwq.a $$0) {
        super($$0, new hep($$0.a(hdf.dZ)), 0.5f);
        this.a(new ibb<idz, hep<idz>>(this, (hyq)this){

            @Override
            public void a(fzm $$0, hpo $$1, int $$2, idz $$3, float $$4, float $$5) {
                if ($$3.c) {
                    super.a($$0, $$1, $$2, $$3, $$4, $$5);
                }
            }
        });
    }

    public amo a(idz $$0) {
        return a;
    }

    public idz b() {
        return new idz();
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((idz)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

