/*
 * Decompiled with CFR 0.152.
 */
public class hub
implements hug.a {
    private static final int a = bel.b(255, 255, 100, 255);
    private static final int b = bel.b(255, 100, 255, 255);
    private static final int c = bel.b(255, 0, 255, 0);
    private static final int d = bel.b(255, 255, 165, 0);
    private static final int e = bel.b(255, 255, 0, 0);
    private final gfj f;

    public hub(gfj $$0) {
        this.f = $$0;
    }

    @Override
    public void a(double $$0, double $$1, double $$22, bxg $$3, htx $$4, float $$5) {
        hif $$6 = this.f.r;
        $$3.c(bxf.d, ($$12, $$2) -> {
            $$2.a().map($$6::a).map($$0 -> $$0.p(this.f.aD().a(true))).ifPresent($$1 -> {
                um.b($$12.dI(), $$1, b);
                ftm $$2 = $$1.b(0.0, 0.01f, 0.0);
                um.a($$2, 4.0f, ul.a(c));
                um.a($$2, 8.0f, ul.a(d));
                um.a($$2, 24.0f, ul.a(e));
            });
            $$2.b().ifPresent($$1 -> {
                um.b($$12.dI(), $$1.b(), a);
                um.a(fth.a(ftm.a($$1)), ul.b(bel.a(1.0f, 1.0f, 0.0f, 0.0f)));
            });
        });
    }
}

