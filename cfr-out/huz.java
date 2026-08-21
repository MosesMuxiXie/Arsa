/*
 * Decompiled with CFR 0.152.
 */
public class huz
implements hug.a {
    private final gfj a;

    public huz(gfj $$0) {
        this.a = $$0;
    }

    @Override
    public void a(double $$0, double $$1, double $$2, bxg $$3, htx $$4, float $$5) {
        is $$6 = this.a.s.dK();
        dwo $$7 = this.a.s.ao();
        for (is $$8 : is.c($$6.b(-10, -10, -10), $$6.b(10, 10, 10))) {
            flb $$9 = $$7.b_($$8);
            if (!$$9.a(bdv.a)) continue;
            double $$10 = (float)$$8.v() + $$9.a($$7, $$8);
            um.a(new fth((float)$$8.u() + 0.01f, (float)$$8.v() + 0.01f, (float)$$8.w() + 0.01f, (float)$$8.u() + 0.99f, $$10, (float)$$8.w() + 0.99f), ul.b(bel.a(0.15f, 0.0f, 1.0f, 0.0f)));
        }
        for (is $$11 : is.c($$6.b(-10, -10, -10), $$6.b(10, 10, 10))) {
            flb $$12 = $$7.b_($$11);
            if (!$$12.a(bdv.a)) continue;
            um.a(String.valueOf($$12.e()), ftm.a($$11, 0.5, $$12.a($$7, $$11), 0.5), ur.a.a(-16777216));
        }
    }
}

