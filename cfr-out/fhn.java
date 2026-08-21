/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fhn {
    public static final int a = 90;
    static final amo b = amo.b("igloo/top");
    private static final amo c = amo.b("igloo/middle");
    private static final amo d = amo.b("igloo/bottom");
    static final Map<amo, is> e = ImmutableMap.of((Object)b, (Object)new is(3, 5, 5), (Object)c, (Object)new is(1, 3, 1), (Object)d, (Object)new is(3, 6, 7));
    static final Map<amo, is> f = ImmutableMap.of((Object)b, (Object)is.c, (Object)c, (Object)new is(2, -3, 4), (Object)d, (Object)new is(0, -3, -2));

    public static void a(fjr $$0, is $$1, egm $$2, fft $$3, bgr $$4) {
        if ($$4.j() < 0.5) {
            int $$5 = $$4.a(8) + 4;
            $$3.a(new a($$0, d, $$1, $$2, $$5 * 3));
            for (int $$6 = 0; $$6 < $$5 - 1; ++$$6) {
                $$3.a(new a($$0, c, $$1, $$2, $$6 * 3));
            }
        }
        $$3.a(new a($$0, b, $$1, $$2, 0));
    }

    public static class a
    extends ffy {
        public a(fjr $$0, amo $$1, is $$2, egm $$3, int $$4) {
            super(fgf.I, 0, $$0, $$1, $$1.toString(), fhn$a.a($$3, $$1), fhn$a.a($$1, $$2, $$4));
        }

        public a(fjr $$0, uz $$12) {
            super(fgf.I, $$12, $$0, $$1 -> fhn$a.a($$12.a("Rot", egm.h).orElseThrow(), $$1));
        }

        private static fjm a(egm $$0, amo $$1) {
            return new fjm().a($$0).a(eev.a).a(e.get($$1)).a(fir.b).a(fja.a);
        }

        private static is a(amo $$0, is $$1, int $$2) {
            return $$1.a(f.get($$0)).c($$2);
        }

        @Override
        protected void a(fge $$0, uz $$1) {
            super.a($$0, $$1);
            $$1.a("Rot", egm.h, this.c.d());
        }

        @Override
        protected void a(String $$0, is $$1, dxf $$2, bgr $$3, ffg $$4) {
            if (!"chest".equals($$0)) {
                return;
            }
            $$2.a($$1, dzs.a.m(), 3);
            elb $$5 = $$2.c_($$1.e());
            if ($$5 instanceof elj) {
                ((elj)$$5).a(fnv.B, $$3.g());
            }
        }

        @Override
        public void a(dxn $$0, dxk $$1, eqg $$2, bgr $$3, ffg $$4, dvu $$5, is $$6) {
            is $$13;
            eoh $$14;
            amo $$7 = amo.a(this.a);
            fjm $$8 = fhn$a.a(this.c.d(), $$7);
            is $$9 = f.get($$7);
            is $$10 = this.d.a(fjq.a($$8, new is(3 - $$9.u(), 0, -$$9.w())));
            int $$11 = $$0.a(euq.a.a, $$10.u(), $$10.w());
            is $$12 = this.d;
            this.d = this.d.b(0, $$11 - 90 - 1, 0);
            super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
            if ($$7.equals(b) && !($$14 = $$0.a_(($$13 = this.d.a(fjq.a($$8, new is(3, 0, 5)))).e())).l() && !$$14.a(dzs.dm)) {
                $$0.a($$13, dzs.er.m(), 3);
            }
            this.d = $$12;
        }
    }
}

