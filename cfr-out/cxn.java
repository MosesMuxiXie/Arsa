/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.slf4j.Logger;

public class cxn {
    private static final Logger c = LogUtils.getLogger();
    private static final int d = 6;
    static final List<cse<? extends csd<? super cxm>>> a = ImmutableList.of(cse.c, cse.f, cse.d, cse.r);
    static final List<cqw<?>> b = ImmutableList.of(cqw.o, cqw.n, cqw.F, cqw.u, cqw.aa, cqw.bc, cqw.bd, cqw.be, cqw.aR, cqw.bb, cqw.h, cqw.s, (Object[])new cqw[]{cqw.P, cqw.Q, cqw.S});
    private static final int e = 9600;
    private static final float f = 1.0f;
    private static final float g = 2.0f;
    private static final float h = 1.25f;
    private static final float i = 1.25f;

    protected static cim<?> a(cim<cxm> $$0) {
        cxn.b($$0);
        cxn.e($$0);
        cxn.c($$0);
        cxn.d($$0);
        $$0.a(Set.of(dfl.a));
        $$0.b(dfl.b);
        $$0.e();
        return $$0;
    }

    static cxm b(cxm $$0) {
        $$0.ev().b(cqw.bd);
        $$0.ev().b(cqw.bc);
        return $$0.a(cxm.a.a);
    }

    private static void b(cim<cxm> $$0) {
        $$0.a(dfl.a, 0, (ImmutableList<cje<cxm>>)ImmutableList.of(new cmb(0.8f), (Object)new ciy<cxm>(2.0f){

            protected void a(axf $$0, cxm $$1, long $$2) {
                cxn.b($$1);
                super.b($$0, $$1, $$2);
            }

            @Override
            protected /* synthetic */ void b(axf axf2, cht cht2, long l2) {
                this.a(axf2, (cxm)cht2, l2);
            }

            @Override
            protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
                this.a(axf2, (cxm)chl2, l2);
            }
        }, (Object)new cko(500, 700), (Object)new cjk(cqw.Q)));
    }

    private static void c(cim<cxm> $$0) {
        $$0.a(dfl.v, (ImmutableList<Pair<Integer, cje<cxm>>>)ImmutableList.of((Object)Pair.of((Object)0, (Object)new e())), Set.of(Pair.of(cqw.aa, (Object)((Object)cqx.b)), Pair.of(cqw.bc, (Object)((Object)cqx.a)), Pair.of(cqw.n, (Object)((Object)cqx.a))));
    }

    private static void d(cim<cxm> $$0) {
        $$0.a(dfl.z, (ImmutableList<Pair<Integer, cje<cxm>>>)ImmutableList.of((Object)Pair.of((Object)0, (Object)new a(160, 180)), (Object)Pair.of((Object)0, (Object)new c(40))), Set.of(Pair.of(cqw.aa, (Object)((Object)cqx.b)), Pair.of(cqw.n, (Object)((Object)cqx.b)), Pair.of(cqw.bd, (Object)((Object)cqx.a))));
    }

    private static void e(cim<cxm> $$02) {
        $$02.a(dfl.b, (ImmutableList<Pair<Integer, cje<cxm>>>)ImmutableList.of((Object)Pair.of((Object)0, (Object)new cix(cgu.br){

            @Override
            protected void a(axf $$0, cth $$1, long $$2) {
                cxn.b((cxm)$$1);
                super.a($$0, $$1, $$2);
            }

            @Override
            protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
                this.a(axf2, (cth)chl2, l2);
            }
        }), (Object)Pair.of((Object)1, (Object)new cjr($$0 -> Float.valueOf(1.25f), $$0 -> $$0.e_() ? 2.5 : 3.5){

            @Override
            protected void b(axf $$0, cht $$1, long $$2) {
                cxn.b((cxm)$$1);
                super.b($$0, $$1, $$2);
            }

            @Override
            protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
                this.b(axf2, (cht)chl2, l2);
            }
        }), (Object)Pair.of((Object)2, (Object)new ckk(45, 90)), (Object)Pair.of((Object)3, (Object)new b(40, 100)), (Object)Pair.of((Object)4, new clb(ImmutableList.of((Object)Pair.of(cll.a(1.0f, 3), (Object)2), (Object)Pair.of((Object)new d(40, 80), (Object)1), (Object)Pair.of((Object)new f(40, 80), (Object)1), (Object)Pair.of(cld.a(cgu.cb, 6.0f), (Object)1), (Object)Pair.of(ckw.a(1.0f), (Object)1), (Object)Pair.of((Object)new cjo(5, 20), (Object)2))))), Set.of(Pair.of(cqw.bd, (Object)((Object)cqx.b))));
    }

    static void a(cxm $$0) {
        $$0.ev().a((List<dfl>)ImmutableList.of((Object)dfl.z, (Object)dfl.v, (Object)dfl.b));
    }

    static class e
    extends cjd<cxm> {
        e() {
            super(Map.of(cqw.n, cqx.a, cqw.aa, cqx.b, cqw.bc, cqx.a), 600);
        }

        @Override
        protected boolean a(axf $$0, cxm $$1) {
            return $$1.gR();
        }

        @Override
        protected boolean a(axf $$0, cxm $$1, long $$2) {
            if (!$$1.gR()) {
                $$1.a(cxm.a.a);
                return false;
            }
            Optional<is> $$3 = $$1.ev().c(cqw.n).map(cqz::a).map(cks::b);
            Optional<is> $$4 = $$1.ev().c(cqw.bc);
            if ($$3.isEmpty() || $$4.isEmpty()) {
                return false;
            }
            return $$4.get().equals($$3.get());
        }

        @Override
        protected void b(axf $$0, cxm $$1, long $$2) {
            $$1.a(cxm.a.e);
        }

        @Override
        protected void c(axf $$0, cxm $$1, long $$2) {
            if ($$1.gU() && $$1.gR()) {
                $$1.ev().a(cqw.bd, true);
            }
            $$1.ev().b(cqw.n);
            $$1.ev().b(cqw.bc);
        }

        @Override
        protected /* synthetic */ void b(axf axf2, chl chl2, long l2) {
            this.c(axf2, (cxm)chl2, l2);
        }

        @Override
        protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
            this.b(axf2, (cxm)chl2, l2);
        }
    }

    static class a
    extends cjd<cxm> {
        a(int $$0, int $$1) {
            super(Map.of(cqw.aa, cqx.b, cqw.n, cqx.b, cqw.bd, cqx.a, cqw.aR, cqx.b), $$0, $$1);
        }

        @Override
        protected boolean a(axf $$0, cxm $$1) {
            return $$1.gR();
        }

        @Override
        protected boolean a(axf $$0, cxm $$1, long $$2) {
            return $$1.ev().c(cqw.bd).isPresent() && $$1.gU() && !$$1.hb();
        }

        @Override
        protected void b(axf $$0, cxm $$1, long $$2) {
            $$1.a(cxm.a.f);
        }

        @Override
        protected void c(axf $$0, cxm $$1, long $$2) {
            boolean $$3 = this.a($$2);
            if ($$3) {
                $$1.ev().a(cqw.aR, bhr.a, 9600L);
            } else {
                cxn.b($$1);
            }
        }

        @Override
        protected /* synthetic */ void b(axf axf2, chl chl2, long l2) {
            this.c(axf2, (cxm)chl2, l2);
        }

        @Override
        protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
            this.b(axf2, (cxm)chl2, l2);
        }
    }

    static class c
    extends cjd<cxm> {
        c(int $$0) {
            super(Map.of(cqw.aa, cqx.b, cqw.n, cqx.b, cqw.bd, cqx.a, cqw.aR, cqx.a), $$0, $$0);
        }

        @Override
        protected boolean a(axf $$0, cxm $$1) {
            return true;
        }

        @Override
        protected boolean a(axf $$0, cxm $$1, long $$2) {
            return $$1.ev().c(cqw.bd).isPresent();
        }

        @Override
        protected void b(axf $$0, cxm $$1, long $$2) {
            $$1.a(cxm.a.g);
        }

        @Override
        protected void c(axf $$0, cxm $$1, long $$2) {
            boolean $$3 = this.a($$2);
            $$1.a(cxm.a.a).x($$3);
            $$1.ev().b(cqw.bd);
            $$1.ev().a(cqw.be, true);
        }

        @Override
        protected /* synthetic */ void b(axf axf2, chl chl2, long l2) {
            this.c(axf2, (cxm)chl2, l2);
        }

        @Override
        protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
            this.b(axf2, (cxm)chl2, l2);
        }
    }

    static class b
    extends cjd<cxm> {
        b(int $$0, int $$1) {
            super(Map.of(cqw.be, cqx.a), $$0, $$1);
        }

        @Override
        protected boolean a(axf $$0, cxm $$1, long $$2) {
            return true;
        }

        @Override
        protected void b(axf $$0, cxm $$1, long $$2) {
            $$1.a(cxm.a.b);
        }

        @Override
        protected void c(axf $$0, cxm $$1, long $$2) {
            $$1.a(cxm.a.a);
            $$1.ev().b(cqw.be);
        }

        @Override
        protected /* synthetic */ void b(axf axf2, chl chl2, long l2) {
            this.c(axf2, (cxm)chl2, l2);
        }

        @Override
        protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
            this.b(axf2, (cxm)chl2, l2);
        }
    }

    static class d
    extends cjd<cxm> {
        d(int $$0, int $$1) {
            super(Map.of(cqw.aa, cqx.b, cqw.bd, cqx.b, cqw.bc, cqx.b, cqw.be, cqx.b, cqw.s, cqx.b), $$0, $$1);
        }

        @Override
        protected boolean a(axf $$0, cxm $$1) {
            return !$$1.gQ();
        }

        @Override
        protected boolean a(axf $$0, cxm $$1, long $$2) {
            return true;
        }

        @Override
        protected void b(axf $$0, cxm $$1, long $$2) {
            $$1.a(cxm.a.c);
        }

        @Override
        protected void c(axf $$0, cxm $$1, long $$2) {
            $$1.a(cxm.a.a);
        }

        @Override
        protected /* synthetic */ void b(axf axf2, chl chl2, long l2) {
            this.c(axf2, (cxm)chl2, l2);
        }

        @Override
        protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
            this.b(axf2, (cxm)chl2, l2);
        }
    }

    static class f
    extends cjd<cxm> {
        f(int $$0, int $$1) {
            super(Map.of(cqw.n, cqx.b, cqw.bc, cqx.b, cqw.aR, cqx.b), $$0, $$1);
        }

        @Override
        protected boolean a(axf $$0, cxm $$1) {
            return !$$1.e_() && $$1.gR();
        }

        @Override
        protected boolean a(axf $$0, cxm $$1, long $$2) {
            return $$1.gR();
        }

        @Override
        protected void b(axf $$0, cxm $$1, long $$2) {
            $$1.a(cxm.a.d);
        }

        @Override
        protected void c(axf $$0, cxm $$12, long $$2) {
            boolean $$3 = this.a($$2);
            $$12.a(cxm.a.a);
            if ($$3) {
                $$12.gT().ifPresent($$1 -> {
                    $$12.ev().a(cqw.bc, $$1);
                    $$12.ev().a(cqw.n, new cqz((is)$$1, 1.25f, 0));
                });
            }
        }

        @Override
        protected /* synthetic */ void b(axf axf2, chl chl2, long l2) {
            this.c(axf2, (cxm)chl2, l2);
        }

        @Override
        protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
            this.b(axf2, (cxm)chl2, l2);
        }
    }
}

