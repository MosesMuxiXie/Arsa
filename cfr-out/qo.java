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

public class qo {
    public static void a(qr<fgy> $$0) {
        je<fgy> $$1 = $$0.a(mj.bt);
        jd.c<fgy> $$2 = $$1.b(qy.a);
        qy.a($$0, "bastion/mobs/piglin", new fgy($$2, (List<Pair<Function<fgy.a, ? extends fgw>, Integer>>)ImmutableList.of((Object)Pair.of(fgw.b("bastion/mobs/melee_piglin"), (Object)1), (Object)Pair.of(fgw.b("bastion/mobs/sword_piglin"), (Object)4), (Object)Pair.of(fgw.b("bastion/mobs/crossbow_piglin"), (Object)4), (Object)Pair.of(fgw.b("bastion/mobs/empty"), (Object)1)), fgy.a.b));
        qy.a($$0, "bastion/mobs/hoglin", new fgy($$2, (List<Pair<Function<fgy.a, ? extends fgw>, Integer>>)ImmutableList.of((Object)Pair.of(fgw.b("bastion/mobs/hoglin"), (Object)2), (Object)Pair.of(fgw.b("bastion/mobs/empty"), (Object)1)), fgy.a.b));
        qy.a($$0, "bastion/blocks/gold", new fgy($$2, (List<Pair<Function<fgy.a, ? extends fgw>, Integer>>)ImmutableList.of((Object)Pair.of(fgw.b("bastion/blocks/air"), (Object)3), (Object)Pair.of(fgw.b("bastion/blocks/gold"), (Object)1)), fgy.a.b));
        qy.a($$0, "bastion/mobs/piglin_melee", new fgy($$2, (List<Pair<Function<fgy.a, ? extends fgw>, Integer>>)ImmutableList.of((Object)Pair.of(fgw.b("bastion/mobs/melee_piglin_always"), (Object)1), (Object)Pair.of(fgw.b("bastion/mobs/melee_piglin"), (Object)5), (Object)Pair.of(fgw.b("bastion/mobs/sword_piglin"), (Object)1)), fgy.a.b));
    }
}

