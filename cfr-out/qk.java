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

public class qk {
    public static void a(qr<fgy> $$0) {
        je<fjo> $$1 = $$0.a(mj.bq);
        jd.c<fjo> $$2 = $$1.b(qz.y);
        jd.c<fjo> $$3 = $$1.b(qz.w);
        jd.c<fjo> $$4 = $$1.b(qz.z);
        jd.c<fjo> $$5 = $$1.b(qz.x);
        je<fgy> $$6 = $$0.a(mj.bt);
        jd.c<fgy> $$7 = $$6.b(qy.a);
        qy.a($$0, "bastion/bridge/starting_pieces", new fgy($$7, (List<Pair<Function<fgy.a, ? extends fgw>, Integer>>)ImmutableList.of((Object)Pair.of(fgw.b("bastion/bridge/starting_pieces/entrance", $$2), (Object)1), (Object)Pair.of(fgw.b("bastion/bridge/starting_pieces/entrance_face", $$3), (Object)1)), fgy.a.b));
        qy.a($$0, "bastion/bridge/bridge_pieces", new fgy($$7, (List<Pair<Function<fgy.a, ? extends fgw>, Integer>>)ImmutableList.of((Object)Pair.of(fgw.b("bastion/bridge/bridge_pieces/bridge", $$4), (Object)1)), fgy.a.b));
        qy.a($$0, "bastion/bridge/legs", new fgy($$7, (List<Pair<Function<fgy.a, ? extends fgw>, Integer>>)ImmutableList.of((Object)Pair.of(fgw.b("bastion/bridge/legs/leg_0", $$3), (Object)1), (Object)Pair.of(fgw.b("bastion/bridge/legs/leg_1", $$3), (Object)1)), fgy.a.b));
        qy.a($$0, "bastion/bridge/walls", new fgy($$7, (List<Pair<Function<fgy.a, ? extends fgw>, Integer>>)ImmutableList.of((Object)Pair.of(fgw.b("bastion/bridge/walls/wall_base_0", $$5), (Object)1), (Object)Pair.of(fgw.b("bastion/bridge/walls/wall_base_1", $$5), (Object)1)), fgy.a.b));
        qy.a($$0, "bastion/bridge/ramparts", new fgy($$7, (List<Pair<Function<fgy.a, ? extends fgw>, Integer>>)ImmutableList.of((Object)Pair.of(fgw.b("bastion/bridge/ramparts/rampart_0", $$5), (Object)1), (Object)Pair.of(fgw.b("bastion/bridge/ramparts/rampart_1", $$5), (Object)1)), fgy.a.b));
        qy.a($$0, "bastion/bridge/rampart_plates", new fgy($$7, (List<Pair<Function<fgy.a, ? extends fgw>, Integer>>)ImmutableList.of((Object)Pair.of(fgw.b("bastion/bridge/rampart_plates/plate_0", $$5), (Object)1)), fgy.a.b));
        qy.a($$0, "bastion/bridge/connectors", new fgy($$7, (List<Pair<Function<fgy.a, ? extends fgw>, Integer>>)ImmutableList.of((Object)Pair.of(fgw.b("bastion/bridge/connectors/back_bridge_top", $$3), (Object)1), (Object)Pair.of(fgw.b("bastion/bridge/connectors/back_bridge_bottom", $$3), (Object)1)), fgy.a.b));
    }
}

