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

public class qn {
    public static final amt<fgy> a = qy.a("bastion/starts");

    public static void a(qr<fgy> $$0) {
        je<fjo> $$1 = $$0.a(mj.bq);
        jd.c<fjo> $$2 = $$1.b(qz.w);
        je<fgy> $$3 = $$0.a(mj.bt);
        jd.c<fgy> $$4 = $$3.b(qy.a);
        $$0.a(a, new fgy($$4, (List<Pair<Function<fgy.a, ? extends fgw>, Integer>>)ImmutableList.of((Object)Pair.of(fgw.b("bastion/units/air_base", $$2), (Object)1), (Object)Pair.of(fgw.b("bastion/hoglin_stable/air_base", $$2), (Object)1), (Object)Pair.of(fgw.b("bastion/treasure/big_air_full", $$2), (Object)1), (Object)Pair.of(fgw.b("bastion/bridge/starting_pieces/entrance_base", $$2), (Object)1)), fgy.a.b));
        qm.a($$0);
        ql.a($$0);
        qp.a($$0);
        qk.a($$0);
        qo.a($$0);
    }
}

