/*
 * Decompiled with CFR 0.152.
 */
public class hyp
extends hxx<dad, iex, hez> {
    private static final amo a = amo.b("textures/entity/illager/ravager.png");

    public hyp(hwq.a $$0) {
        super($$0, new hez($$0.a(hdf.cT)), 1.1f);
    }

    public amo a(iex $$0) {
        return a;
    }

    public iex b() {
        return new iex();
    }

    @Override
    public void a(dad $$0, iex $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = (float)$$0.gZ() > 0.0f ? (float)$$0.gZ() - $$2 : 0.0f;
        $$1.b = (float)$$0.gY() > 0.0f ? (float)$$0.gY() - $$2 : 0.0f;
        $$1.c = $$0.ha() > 0 ? ((float)(20 - $$0.ha()) + $$2) / 20.0f : 0.0f;
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((iex)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

