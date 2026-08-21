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

public class qi {
    public static final amt<fgy> a = qy.a("ancient_city/city_center");

    public static void a(qr<fgy> $$0) {
        je<fjo> $$1 = $$0.a(mj.bq);
        jd.c<fjo> $$2 = $$1.b(qz.G);
        je<fgy> $$3 = $$0.a(mj.bt);
        jd.c<fgy> $$4 = $$3.b(qy.a);
        $$0.a(a, new fgy($$4, (List<Pair<Function<fgy.a, ? extends fgw>, Integer>>)ImmutableList.of((Object)Pair.of(fgw.b("ancient_city/city_center/city_center_1", $$2), (Object)1), (Object)Pair.of(fgw.b("ancient_city/city_center/city_center_2", $$2), (Object)1), (Object)Pair.of(fgw.b("ancient_city/city_center/city_center_3", $$2), (Object)1)), fgy.a.b));
        qj.a($$0);
    }
}

