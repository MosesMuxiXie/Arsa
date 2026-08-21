/*
 * Decompiled with CFR 0.152.
 */
public class huv
implements hug.a {
    private final gfj a;

    public huv(gfj $$0) {
        this.a = $$0;
    }

    @Override
    public void a(double $$0, double $$1, double $$2, bxg $$3, htx $$4, float $$5) {
        dwo $$6 = this.a.s.ao();
        is $$7 = is.a($$0, $$1, $$2);
        for (is $$8 : is.c($$7.b(-6, -6, -6), $$7.b(6, 6, 6))) {
            eoh $$9 = $$6.a_($$8);
            if ($$9.a(dzs.a)) continue;
            fug $$10 = $$9.f($$6, $$8);
            for (fth $$11 : $$10.e()) {
                fth $$12 = $$11.a($$8).g(0.002);
                int $$13 = -2130771968;
                ftm $$14 = $$12.h();
                ftm $$15 = $$12.i();
                huv.a($$8, $$9, $$6, iz.e, $$14, $$15, -2130771968);
                huv.a($$8, $$9, $$6, iz.d, $$14, $$15, -2130771968);
                huv.a($$8, $$9, $$6, iz.f, $$14, $$15, -2130771968);
                huv.a($$8, $$9, $$6, iz.c, $$14, $$15, -2130771968);
                huv.a($$8, $$9, $$6, iz.a, $$14, $$15, -2130771968);
                huv.a($$8, $$9, $$6, iz.b, $$14, $$15, -2130771968);
            }
        }
    }

    private static void a(is $$0, eoh $$1, dvt $$2, iz $$3, ftm $$4, ftm $$5, int $$6) {
        if ($$1.c($$2, $$0, $$3)) {
            um.a($$4, $$5, $$3, ul.b($$6));
        }
    }
}

