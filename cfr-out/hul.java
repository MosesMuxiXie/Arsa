/*
 * Decompiled with CFR 0.152.
 */
public class hul
implements hug.a {
    private static final int a = 160;
    private final gfj b;

    public hul(gfj $$0) {
        this.b = $$0;
    }

    @Override
    public void a(double $$0, double $$12, double $$22, bxg $$3, htx $$4, float $$5) {
        ger $$6 = this.b.i.p();
        is $$7 = is.a($$6.b().g, 0.0, $$6.b().i);
        $$3.c(bxf.e, ($$1, $$2) -> {
            if ($$7.a($$1.dK(), 160.0)) {
                for (int $$3 = 0; $$3 < $$2.a().size(); ++$$3) {
                    bwz.a $$4 = $$2.a().get($$3);
                    double $$5 = (double)$$1.dO() + 0.5;
                    double $$6 = $$1.dR() + 2.0 + (double)$$3 * 0.25;
                    double $$7 = (double)$$1.dU() + 0.5;
                    int $$8 = $$4.b() ? -16711936 : -3355444;
                    um.a($$4.c(), new ftm($$5, $$6, $$7), ur.a.a($$8));
                }
            }
        });
    }
}

