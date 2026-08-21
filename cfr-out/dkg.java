/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class dkg
extends dlp {
    public static final int a = 10;
    private static final int b = 200;

    public dkg(dlp.a $$0) {
        super($$0);
    }

    @Override
    public cdc a(dpw $$0) {
        ddm $$1 = $$0.o();
        if ($$1 != null && this.a($$1).d() == ftk.a.b) {
            $$1.c($$0.p());
        }
        return cdc.c;
    }

    @Override
    public dlv b(dlt $$0) {
        return dlv.j;
    }

    @Override
    public int a(dlt $$0, chl $$1) {
        return 200;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void a(dwo $$0, chl $$1, dlt $$2, int $$3) {
        boolean $$10;
        void $$5;
        block11: {
            block10: {
                if ($$3 < 0 || !($$1 instanceof ddm)) {
                    $$1.ge();
                    return;
                }
                ddm $$4 = (ddm)$$1;
                ftk $$6 = this.a((ddm)$$5);
                if (!($$6 instanceof fti)) break block10;
                fti $$7 = (fti)$$6;
                if ($$6.d() == ftk.a.b) break block11;
            }
            $$1.ge();
            return;
        }
        int $$9 = this.a($$2, $$1) - $$3 + 1;
        boolean bl2 = $$10 = $$9 % 10 == 5;
        if ($$10) {
            bcz $$16;
            dzq dzq2;
            chb $$13;
            void $$8;
            is $$11 = $$8.b();
            eoh $$12 = $$0.a_($$11);
            chb chb2 = $$13 = $$1.ga() == cdb.a ? $$5.at() : $$5.at().a();
            if ($$12.D() && $$12.o() != egf.a) {
                this.a($$0, (fti)$$8, $$12, $$1.h(0.0f), $$13);
            }
            if ((dzq2 = $$12.b()) instanceof dzw) {
                dzw $$14 = (dzw)dzq2;
                bcz $$15 = $$14.c();
            } else {
                $$16 = bda.de;
            }
            $$0.a((cgk)$$5, $$11, $$16, bdb.e);
            if ($$0 instanceof axf) {
                elg $$18;
                boolean $$19;
                axf $$17 = (axf)$$0;
                elb elb2 = $$0.c_($$11);
                if (elb2 instanceof elg && ($$19 = ($$18 = (elg)elb2).a($$0.au(), $$17, (chl)$$5, $$8.c(), $$2))) {
                    cgv $$20 = $$2.equals($$5.a(cgv.b)) ? cgv.b : cgv.a;
                    $$2.a(1, (chl)$$5, $$20);
                }
            }
        }
    }

    private ftk a(ddm $$0) {
        return dee.a((cgk)$$0, cgs.h, $$0.hm());
    }

    private void a(dwo $$0, fti $$1, eoh $$2, ftm $$3, chb $$4) {
        double $$5 = 3.0;
        int $$6 = $$4 == chb.b ? 1 : -1;
        int $$7 = $$0.G_().b(7, 12);
        lp $$8 = new lp(ly.b, $$2);
        iz $$9 = $$1.c();
        a $$10 = dkg$a.a($$3, $$9);
        ftm $$11 = $$1.g();
        for (int $$12 = 0; $$12 < $$7; ++$$12) {
            $$0.a($$8, $$11.g - (double)($$9 == iz.e ? 1.0E-6f : 0.0f), $$11.h, $$11.i - (double)($$9 == iz.c ? 1.0E-6f : 0.0f), $$10.a() * (double)$$6 * 3.0 * $$0.G_().j(), 0.0, $$10.c() * (double)$$6 * 3.0 * $$0.G_().j());
        }
    }

    record a(double a, double b, double c) {
        private static final double d = 1.0;
        private static final double e = 0.1;

        public static a a(ftm $$0, iz $$1) {
            double $$2 = 0.0;
            return switch ($$1) {
                default -> throw new MatchException(null, null);
                case iz.a, iz.b -> new a($$0.c(), 0.0, -$$0.a());
                case iz.c -> new a(1.0, 0.0, -0.1);
                case iz.d -> new a(-1.0, 0.0, 0.1);
                case iz.e -> new a(-0.1, 0.0, -1.0);
                case iz.f -> new a(0.1, 0.0, 1.0);
            };
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "xd;yd;zd", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "xd;yd;zd", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "xd;yd;zd", "a", "b", "c"}, this, $$0);
        }
    }
}

