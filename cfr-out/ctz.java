/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.util.Pair
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public class ctz {
    private static final float a = 4.0f;
    private static final float b = 2.0f;
    private static final float c = 2.5f;
    private static final float d = 2.5f;
    private static final float e = 1.0f;
    private static final ccn f = ccn.a(5, 16);
    private static final ImmutableList<cse<? extends csd<? super cty>>> g = ImmutableList.of(cse.c, cse.f, cse.r, cse.o);
    private static final ImmutableList<cqw<?>> h = ImmutableList.of(cqw.aa, cqw.y, cqw.z, cqw.n, cqw.o, cqw.F, cqw.u, cqw.h, cqw.P, cqw.Q, cqw.R, cqw.S, (Object[])new cqw[]{cqw.s, cqw.L});

    protected static void a(cty $$0, bgr $$1) {
    }

    public static cim.b<cty> a() {
        return cim.a(h, g);
    }

    protected static cim<?> a(cim<cty> $$0) {
        ctz.b($$0);
        ctz.c($$0);
        $$0.a((Set<dfl>)ImmutableSet.of((Object)dfl.a));
        $$0.b(dfl.b);
        $$0.e();
        return $$0;
    }

    private static void b(cim<cty> $$0) {
        $$0.a(dfl.a, 0, (ImmutableList<cje<cty>>)ImmutableList.of(new cmb(0.8f), (Object)new a(4.0f), (Object)new ckk(45, 90), (Object)new cko(), (Object)new cjk(cqw.Q), (Object)new cjk(cqw.R)));
    }

    private static void c(cim<cty> $$02) {
        $$02.a(dfl.b, (ImmutableList<Pair<Integer, cje<cty>>>)ImmutableList.of((Object)Pair.of((Object)0, cle.a(cgu.cb, 6.0f, ccn.a(30, 60))), (Object)Pair.of((Object)1, (Object)new cix(cgu.v)), (Object)Pair.of((Object)2, new clb(ImmutableList.of((Object)Pair.of((Object)new cjr($$0 -> Float.valueOf(2.5f), $$0 -> $$0.e_() ? 2.5 : 3.5), (Object)1), (Object)Pair.of(cmv.a(Predicate.not(cty::gP), cja.a(f, 2.5f)), (Object)1)))), (Object)Pair.of((Object)3, (Object)new ckv(ccn.a(150, 250), 30.0f, 0.0f, 0.0f)), (Object)Pair.of((Object)4, new clb((Map<cqw<?>, cqx>)ImmutableMap.of(cqw.n, (Object)((Object)cqx.b)), ImmutableList.of((Object)Pair.of(cmv.a(Predicate.not(cty::gP), ckw.a(2.0f)), (Object)1), (Object)Pair.of(cmv.a(Predicate.not(cty::gP), cll.a(2.0f, 3)), (Object)1), (Object)Pair.of((Object)new b(20), (Object)1), (Object)Pair.of((Object)new cjo(30, 60), (Object)1))))));
    }

    public static void a(cty $$0) {
        $$0.ev().a((List<dfl>)ImmutableList.of((Object)dfl.b));
    }

    public static class a
    extends ciy<cty> {
        public a(float $$0) {
            super($$0);
        }

        @Override
        protected boolean a(axf $$0, cty $$1) {
            return super.a($$0, $$1) && !$$1.ho();
        }

        protected void a(axf $$0, cty $$1, long $$2) {
            $$1.hk();
            super.b($$0, $$1, $$2);
        }

        @Override
        protected /* synthetic */ void b(axf axf2, cht cht2, long l2) {
            this.a(axf2, (cty)cht2, l2);
        }

        @Override
        protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
            this.a(axf2, (cty)chl2, l2);
        }
    }

    public static class b
    extends cjd<cty> {
        private final int c;

        public b(int $$0) {
            super((Map<cqw<?>, cqx>)ImmutableMap.of());
            this.c = $$0 * 20;
        }

        @Override
        protected boolean a(axf $$0, cty $$1) {
            return !$$1.by() && $$1.hl() >= (long)this.c && !$$1.S_() && $$1.aV() && !$$1.dm() && $$1.gT();
        }

        protected void a(axf $$0, cty $$1, long $$2) {
            if ($$1.hd()) {
                $$1.hh();
            } else if (!$$1.gM()) {
                $$1.hg();
            }
        }

        @Override
        protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
            this.a(axf2, (cty)chl2, l2);
        }
    }
}

