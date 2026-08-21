/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Pair
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ctp {
    private static final float a = 2.0f;
    private static final float b = 1.0f;
    private static final float c = 1.25f;
    private static final float d = 1.25f;
    private static final float e = 1.0f;
    private static final double f = 2.0;
    private static final double g = 1.0;
    private static final ccn h = ccn.a(5, 16);
    private static final ImmutableList<cse<? extends csd<? super cto>>> i = ImmutableList.of(cse.c, cse.f, cse.r, cse.o, cse.k);
    private static final ImmutableList<cqw<?>> j = ImmutableList.of(cqw.aa, cqw.y, cqw.z, cqw.n, cqw.o, cqw.F, cqw.u, cqw.h, cqw.P, cqw.Q, cqw.R, cqw.S, (Object[])new cqw[]{cqw.s, cqw.L, cqw.H});
    private static final ckp<cto> k = cmv.a((cmv.b<E> $$0) -> $$0.group($$0.c(cqw.H)).apply((Applicative)$$0, $$02 -> ($$0, $$1, $$2) -> {
        if ($$1.gP()) {
            $$1.gU();
            return true;
        }
        return false;
    }));

    public static cim.b<cto> a() {
        return cim.a(j, i);
    }

    protected static cim<?> a(cim<cto> $$0) {
        ctp.b($$0);
        ctp.c($$0);
        ctp.d($$0);
        $$0.a(Set.of(dfl.a));
        $$0.b(dfl.b);
        $$0.e();
        return $$0;
    }

    private static void b(cim<cto> $$0) {
        $$0.a(dfl.a, 0, (ImmutableList<cje<cto>>)ImmutableList.of(new cmb(0.8f), (Object)new b(2.0f), (Object)new ckk(45, 90), (Object)new cko(){

            @Override
            protected boolean a(axf $$0, chn $$1) {
                cto $$2;
                if ($$1 instanceof cto && ($$2 = (cto)$$1).gP()) {
                    return false;
                }
                return super.a($$0, $$1);
            }
        }, (Object)new cjk(cqw.Q), (Object)new cjk(cqw.R), k));
    }

    private static void c(cim<cto> $$02) {
        $$02.a(dfl.b, (ImmutableList<Pair<Integer, cje<cto>>>)ImmutableList.of((Object)Pair.of((Object)0, cle.a(cgu.cb, 6.0f, ccn.a(30, 60))), (Object)Pair.of((Object)1, (Object)new cix(cgu.g, 1.0f, 1)), (Object)Pair.of((Object)2, new clb(ImmutableList.of((Object)Pair.of((Object)new cjr($$0 -> Float.valueOf(1.25f), $$0 -> $$0.e_() ? 1.0 : 2.0), (Object)1), (Object)Pair.of(cja.a(h, 1.25f), (Object)1)))), (Object)Pair.of((Object)3, (Object)new ckv(ccn.a(150, 250), 30.0f, 0.0f, 0.0f)), (Object)Pair.of((Object)4, new clb((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.n, (Object)((Object)cqx.b)), ImmutableList.of((Object)Pair.of(ckw.a(1.0f), (Object)1), (Object)Pair.of(cll.a(1.0f, 3), (Object)1), (Object)Pair.of((Object)new cjo(30, 60), (Object)1))))));
    }

    private static void d(cim<cto> $$0) {
        $$0.a(dfl.g, (ImmutableList<Pair<Integer, cje<cto>>>)ImmutableList.of((Object)Pair.of((Object)0, (Object)new a())), Set.of(Pair.of(cqw.H, (Object)((Object)cqx.a)), Pair.of(cqw.aa, (Object)((Object)cqx.b))));
    }

    public static void a(cto $$0) {
        $$0.ev().a((List<dfl>)ImmutableList.of((Object)dfl.g, (Object)dfl.b));
    }

    public static class b
    extends ciy<cto> {
        public b(float $$02) {
            super($$02, $$0 -> bdq.G);
        }

        protected void a(axf $$0, cto $$1, long $$2) {
            $$1.gU();
            super.b($$0, $$1, $$2);
        }

        @Override
        protected /* synthetic */ void b(axf axf2, cht cht2, long l2) {
            this.a(axf2, (cto)cht2, l2);
        }

        @Override
        protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
            this.a(axf2, (cto)chl2, l2);
        }
    }

    public static class a
    extends cjd<cto> {
        static final int c = 5 * bhn.e * 20;
        static final int d = 5;
        static final int e = 75;
        int f = 0;
        boolean g;

        public a() {
            super(Map.of(), c);
        }

        protected void a(axf $$0, cto $$1, long $$2) {
            boolean $$5;
            super.c($$0, $$1, $$2);
            if (this.f > 0) {
                --this.f;
            }
            if ($$1.gR()) {
                $$1.a(cto.a.c);
                if ($$1.aV()) {
                    $$1.a(bda.aj);
                }
                return;
            }
            cto.a $$3 = $$1.gS();
            long $$4 = $$1.ev().e(cqw.H);
            boolean bl2 = $$5 = $$4 > 75L;
            if ($$5 != this.g) {
                this.f = this.a($$1);
            }
            this.g = $$5;
            if ($$3 == cto.a.c) {
                if (this.f == 0 && $$1.aV() && $$5) {
                    $$0.a((cgk)$$1, (byte)64);
                    this.f = this.a($$1);
                }
                if ($$4 < (long)cto.a.d.b()) {
                    $$1.a(bda.an);
                    $$1.a(cto.a.d);
                }
            } else if ($$3 == cto.a.d && $$4 > (long)cto.a.d.b()) {
                $$1.a(cto.a.c);
            }
        }

        private int a(cto $$0) {
            return cto.a.c.b() + $$0.ep().a(100, 400);
        }

        @Override
        protected boolean a(axf $$0, cto $$1) {
            return $$1.aV();
        }

        protected boolean b(axf $$0, cto $$1, long $$2) {
            return $$1.gS().a();
        }

        @Override
        protected void c(axf $$0, cto $$1, long $$2) {
            $$1.gT();
        }

        @Override
        protected void d(axf $$0, cto $$1, long $$2) {
            if (!$$1.gV()) {
                $$1.gU();
            }
        }

        @Override
        protected /* synthetic */ boolean a(axf axf2, chl chl2, long l2) {
            return this.b(axf2, (cto)chl2, l2);
        }

        @Override
        protected /* synthetic */ void b(axf axf2, chl chl2, long l2) {
            this.d(axf2, (cto)chl2, l2);
        }

        @Override
        protected /* synthetic */ void c(axf axf2, chl chl2, long l2) {
            this.a(axf2, (cto)chl2, l2);
        }

        @Override
        protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
            this.c(axf2, (cto)chl2, l2);
        }
    }
}

