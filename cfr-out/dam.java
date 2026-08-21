/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.util.Pair
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;

public class dam {
    public static final float a = 0.6f;
    public static final float b = 4.0f;
    public static final float c = 8.0f;
    public static final float d = 24.0f;
    static final List<cse<? extends csd<? super dal>>> e = ImmutableList.of(cse.c, cse.f, cse.d, cse.x);
    static final List<cqw<?>> f = ImmutableList.of(cqw.o, cqw.h, cqw.C, cqw.F, cqw.p, cqw.n, cqw.bf, cqw.bk, cqw.bg, cqw.bh, cqw.bi, cqw.bj, (Object[])new cqw[]{cqw.bl, cqw.bm, cqw.y, cqw.z, cqw.u});
    private static final int g = 100;

    protected static cim<?> a(dal $$0, cim<dal> $$1) {
        dam.a($$1);
        dam.b($$1);
        dam.b($$0, $$1);
        $$1.a(Set.of(dfl.a));
        $$1.b(dfl.k);
        $$1.e();
        return $$1;
    }

    private static void a(cim<dal> $$0) {
        $$0.a(dfl.a, 0, (ImmutableList<cje<dal>>)ImmutableList.of(new cmb(0.8f), (Object)new ckk(45, 90)));
    }

    private static void b(cim<dal> $$02) {
        $$02.a(dfl.b, (ImmutableList<Pair<Integer, cje<dal>>>)ImmutableList.of((Object)Pair.of((Object)0, clt.a((axf $$0, E $$1) -> $$1.ev().c(cqw.C))), (Object)Pair.of((Object)1, clt.a((axf $$0, E $$1) -> $$1.gR())), (Object)Pair.of((Object)2, (Object)new a(20, 40)), (Object)Pair.of((Object)3, new clb(ImmutableList.of((Object)Pair.of((Object)new cjo(20, 100), (Object)1), (Object)Pair.of(ckw.a(0.6f), (Object)2))))));
    }

    private static void b(dal $$0, cim<dal> $$1) {
        $$1.a(dfl.k, (ImmutableList<Pair<Integer, cje<dal>>>)ImmutableList.of((Object)Pair.of((Object)0, clw.a(csd.a($$0, 100).negate()::test)), (Object)Pair.of((Object)1, (Object)new dap()), (Object)Pair.of((Object)2, (Object)new dao()), (Object)Pair.of((Object)3, (Object)new daq()), (Object)Pair.of((Object)4, (Object)new dar())), (Set<Pair<cqw<?>, cqx>>)ImmutableSet.of((Object)Pair.of(cqw.p, (Object)((Object)cqx.a)), (Object)Pair.of(cqw.n, (Object)((Object)cqx.b))));
    }

    static void a(dal $$0) {
        $$0.ev().a((List<dfl>)ImmutableList.of((Object)dfl.k, (Object)dfl.b));
    }

    public static class a
    extends cko {
        @VisibleForTesting
        public a(int $$0, int $$1) {
            super($$0, $$1);
        }

        @Override
        protected void c(axf $$0, chn $$1, long $$2) {
            super.c($$0, $$1, $$2);
            $$1.a(bda.cY);
            $$1.c(chx.p);
        }

        @Override
        protected void b(axf $$0, chn $$1, long $$2) {
            super.b($$0, $$1, $$2);
            $$1.c(chx.a);
            if ($$1.ev().a(cqw.p)) {
                $$1.ev().a(cqw.bg, bhr.a, 60L);
            }
        }

        @Override
        protected /* synthetic */ void d(axf axf2, chl chl2, long l2) {
            this.c(axf2, (chn)chl2, l2);
        }
    }
}

