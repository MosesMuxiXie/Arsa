/*
 * Decompiled with CFR 0.152.
 */
public class hyg
extends hxx<cwy, ieq, hce> {
    private static final amo a = amo.b("textures/entity/parrot/parrot_red_blue.png");
    private static final amo i = amo.b("textures/entity/parrot/parrot_blue.png");
    private static final amo j = amo.b("textures/entity/parrot/parrot_green.png");
    private static final amo k = amo.b("textures/entity/parrot/parrot_yellow_blue.png");
    private static final amo l = amo.b("textures/entity/parrot/parrot_grey.png");

    public hyg(hwq.a $$0) {
        super($$0, new hce($$0.a(hdf.cq)), 0.3f);
    }

    public amo a(ieq $$0) {
        return hyg.a($$0.a);
    }

    public ieq b() {
        return new ieq();
    }

    @Override
    public void a(cwy $$0, ieq $$1, float $$2) {
        super.a($$0, $$1, $$2);
        $$1.a = $$0.hf();
        float $$3 = bgj.h($$2, $$0.cC, $$0.cz);
        float $$4 = bgj.h($$2, $$0.cB, $$0.cA);
        $$1.b = (bgj.a((double)$$3) + 1.0f) * $$4;
        $$1.c = hce.a($$0);
    }

    public static amo a(cwy.b $$0) {
        return switch ($$0) {
            default -> throw new MatchException(null, null);
            case cwy.b.a -> a;
            case cwy.b.b -> i;
            case cwy.b.c -> j;
            case cwy.b.d -> k;
            case cwy.b.e -> l;
        };
    }

    @Override
    public /* synthetic */ amo b(ieh ieh2) {
        return this.a((ieq)ieh2);
    }

    @Override
    public /* synthetic */ idf d() {
        return this.b();
    }
}

