/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.util.Pair
 */
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.function.Function;

public class qw {
    public static final amt<fgy> a = qy.a("pillager_outpost/base_plates");

    public static void a(qr<fgy> $$0) {
        je<fjo> $$1 = $$0.a(mj.bq);
        jd.c<fjo> $$2 = $$1.b(qz.q);
        je<fgy> $$3 = $$0.a(mj.bt);
        jd.c<fgy> $$4 = $$3.b(qy.a);
        $$0.a(a, new fgy($$4, (List<Pair<Function<fgy.a, ? extends fgw>, Integer>>)ImmutableList.of((Object)Pair.of(fgw.a("pillager_outpost/base_plate"), (Object)1)), fgy.a.b));
        qy.a($$0, "pillager_outpost/towers", new fgy($$4, (List<Pair<Function<fgy.a, ? extends fgw>, Integer>>)ImmutableList.of((Object)Pair.of(fgw.b((List<Function<fgy.a, ? extends fgw>>)ImmutableList.of(fgw.a("pillager_outpost/watchtower"), fgw.a("pillager_outpost/watchtower_overgrown", $$2))), (Object)1)), fgy.a.b));
        qy.a($$0, "pillager_outpost/feature_plates", new fgy($$4, (List<Pair<Function<fgy.a, ? extends fgw>, Integer>>)ImmutableList.of((Object)Pair.of(fgw.a("pillager_outpost/feature_plate"), (Object)1)), fgy.a.a));
        qy.a($$0, "pillager_outpost/features", new fgy($$4, (List<Pair<Function<fgy.a, ? extends fgw>, Integer>>)ImmutableList.of((Object)Pair.of(fgw.a("pillager_outpost/feature_cage1"), (Object)1), (Object)Pair.of(fgw.a("pillager_outpost/feature_cage2"), (Object)1), (Object)Pair.of(fgw.a("pillager_outpost/feature_cage_with_allays"), (Object)1), (Object)Pair.of(fgw.a("pillager_outpost/feature_logs"), (Object)1), (Object)Pair.of(fgw.a("pillager_outpost/feature_tent1"), (Object)1), (Object)Pair.of(fgw.a("pillager_outpost/feature_tent2"), (Object)1), (Object)Pair.of(fgw.a("pillager_outpost/feature_targets"), (Object)1), (Object)Pair.of(fgw.i(), (Object)6)), fgy.a.b));
    }
}

