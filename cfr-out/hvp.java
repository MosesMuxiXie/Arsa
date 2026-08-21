/*
 * Decompiled with CFR 0.152.
 */
public class hvp
extends hvh<ctw, icn, haa> {
    private static final amo a = amo.b("textures/entity/bee/bee_angry.png");
    private static final amo i = amo.b("textures/entity/bee/bee_angry_nectar.png");
    private static final amo j = amo.b("textures/entity/bee/bee.png");
    private static final amo k = amo.b("textures/entity/bee/bee_nectar.png");

    public hvp(hwq.a $$0) {
        super($$0, new haa($$0.a(hdf.v)), new haa($$0.a(hdf.w)), 0.4f);
    }

    public amo a(icn $$0) {
        if ($$0.d) {
            if ($$0.e) {
                return i;
            }
            return a;
        }
        if ($$0.e) {
            return k;
        }
        return j;
    }

    public icn a() {
        return new icn();
    }

    @Override
    public void a(ctw $$0, icn $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = $$0.L($$2);
        $$1.b = !$$0.he();
        $$1.c = $$0.aV() && $$0.dN().h() < 1.0E-7;
        $$1.d = $$0.ab_();
        $$1.e = $$0.hd();
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((icn)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.a();
    }
}

