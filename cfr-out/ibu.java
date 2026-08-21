/*
 * Decompiled with CFR 0.152.
 */
public class ibu
extends ibj<ifn, gzm<ifn>> {
    private static final amo a = amo.b("textures/entity/fish/tropical_a_pattern_1.png");
    private static final amo b = amo.b("textures/entity/fish/tropical_a_pattern_2.png");
    private static final amo c = amo.b("textures/entity/fish/tropical_a_pattern_3.png");
    private static final amo d = amo.b("textures/entity/fish/tropical_a_pattern_4.png");
    private static final amo e = amo.b("textures/entity/fish/tropical_a_pattern_5.png");
    private static final amo f = amo.b("textures/entity/fish/tropical_a_pattern_6.png");
    private static final amo g = amo.b("textures/entity/fish/tropical_b_pattern_1.png");
    private static final amo h = amo.b("textures/entity/fish/tropical_b_pattern_2.png");
    private static final amo i = amo.b("textures/entity/fish/tropical_b_pattern_3.png");
    private static final amo j = amo.b("textures/entity/fish/tropical_b_pattern_4.png");
    private static final amo k = amo.b("textures/entity/fish/tropical_b_pattern_5.png");
    private static final amo l = amo.b("textures/entity/fish/tropical_b_pattern_6.png");
    private final hbe m;
    private final hbd n;

    public ibu(hyq<ifn, gzm<ifn>> $$0, hdc $$1) {
        super($$0);
        this.m = new hbe($$1.a(hdf.dP));
        this.n = new hbd($$1.a(hdf.dN));
    }

    @Override
    public void a(fzm $$0, hpo $$1, int $$2, ifn $$3, float $$4, float $$5) {
        cvl.b $$6 = $$3.a;
        gzm $$7 = switch ($$6.a()) {
            default -> throw new MatchException(null, null);
            case cvl.a.a -> this.m;
            case cvl.a.b -> this.n;
        };
        amo $$8 = switch ($$6) {
            default -> throw new MatchException(null, null);
            case cvl.b.a -> a;
            case cvl.b.b -> b;
            case cvl.b.c -> c;
            case cvl.b.d -> d;
            case cvl.b.e -> e;
            case cvl.b.f -> f;
            case cvl.b.g -> g;
            case cvl.b.h -> h;
            case cvl.b.i -> i;
            case cvl.b.j -> j;
            case cvl.b.k -> k;
            case cvl.b.l -> l;
        };
        ibu.a($$7, $$8, $$0, $$1, $$2, $$3, $$3.c, 1);
    }
}

