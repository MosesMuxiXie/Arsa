/*
 * Decompiled with CFR 0.152.
 */
public class hyn
extends hvh<cxh, iew, hcl> {
    private static final amo a = amo.b("textures/entity/rabbit/brown.png");
    private static final amo i = amo.b("textures/entity/rabbit/white.png");
    private static final amo j = amo.b("textures/entity/rabbit/black.png");
    private static final amo k = amo.b("textures/entity/rabbit/gold.png");
    private static final amo l = amo.b("textures/entity/rabbit/salt.png");
    private static final amo m = amo.b("textures/entity/rabbit/white_splotched.png");
    private static final amo n = amo.b("textures/entity/rabbit/toast.png");
    private static final amo o = amo.b("textures/entity/rabbit/caerbannog.png");

    public hyn(hwq.a $$0) {
        super($$0, new hcl($$0.a(hdf.cR)), new hcl($$0.a(hdf.cS)), 0.3f);
    }

    public amo a(iew $$0) {
        if ($$0.b) {
            return n;
        }
        return switch ($$0.c) {
            default -> throw new MatchException(null, null);
            case cxh.g.a -> a;
            case cxh.g.b -> i;
            case cxh.g.c -> j;
            case cxh.g.e -> k;
            case cxh.g.f -> l;
            case cxh.g.d -> m;
            case cxh.g.g -> o;
        };
    }

    public iew b() {
        return new iew();
    }

    @Override
    public void a(cxh $$0, iew $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = $$0.L($$2);
        $$1.b = hyn.a($$0, "Toast");
        $$1.c = $$0.gR();
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((iew)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

