/*
 * Decompiled with CFR 0.152.
 */
public class huj
implements hug.a {
    private static final float a = 1.0f;

    private void a(bxg $$0, a $$12) {
        $$0.b(bxf.n, ($$1, $$2) -> $$12.accept($$1.b(), $$2.a()));
        $$0.c(bxf.n, ($$1, $$2) -> $$12.accept($$1.dI(), $$2.a()));
    }

    @Override
    public void a(double $$02, double $$12, double $$22, bxg $$3, htx $$4, float $$5) {
        this.a($$3, ($$0, $$1) -> {
            double $$2 = (double)$$1 * 2.0;
            um.a(fth.a($$0, $$2, $$2, $$2), ul.b(bel.a(0.35f, 1.0f, 1.0f, 0.0f)));
        });
        this.a($$3, ($$0, $$1) -> um.a(fth.a($$0, 0.5, 1.0, 0.5).d(0.0, 0.5, 0.0), ul.b(bel.a(0.35f, 1.0f, 1.0f, 0.0f))));
        this.a($$3, ($$0, $$1) -> {
            um.a("Listener Origin", $$0.b(0.0, 1.8, 0.0), ur.a.a().a(0.4f));
            um.a(is.a($$0).toString(), $$0.b(0.0, 1.5, 0.0), ur.a.a(-6959665).a(0.4f));
        });
        $$3.a(bxf.p, (T $$0, int $$1, int $$2) -> {
            ftm $$3 = $$0.b();
            double $$4 = 0.4;
            fth $$5 = fth.a($$3.b(0.0, 0.5, 0.0), 0.4, 0.9, 0.4);
            um.a($$5, ul.b(bel.a(0.2f, 1.0f, 1.0f, 1.0f)));
            um.a($$0.a().g(), $$3.b(0.0, 0.85, 0.0), ur.a.a(-7564911).a(0.12f));
        });
    }

    @FunctionalInterface
    static interface a {
        public void accept(ftm var1, int var2);
    }
}

