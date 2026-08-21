/*
 * Decompiled with CFR 0.152.
 */
public class hxt
extends hvh<cus, iei, hbu> {
    private static final amo a = amo.b("textures/entity/llama/creamy.png");
    private static final amo i = amo.b("textures/entity/llama/white.png");
    private static final amo j = amo.b("textures/entity/llama/brown.png");
    private static final amo k = amo.b("textures/entity/llama/gray.png");

    public hxt(hwq.a $$0, hde $$1, hde $$2) {
        super($$0, new hbu($$0.a($$1)), new hbu($$0.a($$2)), 0.7f);
        this.a(new ibd(this, $$0.f(), $$0.h()));
    }

    public amo a(iei $$0) {
        return switch ($$0.a) {
            default -> throw new MatchException(null, null);
            case cus.d.a -> a;
            case cus.d.b -> i;
            case cus.d.c -> j;
            case cus.d.d -> k;
        };
    }

    public iei b() {
        return new iei();
    }

    @Override
    public void a(cus $$0, iei $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = $$0.he();
        $$1.b = !$$0.e_() && $$0.gP();
        $$1.c = $$0.ak();
        $$1.d = $$0.gS();
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((iei)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

