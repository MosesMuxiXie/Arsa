/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.ImmutableBiMap
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.datafixers.util.Pair
 */
import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Supplier;

public class dlk
extends dlp
implements dmv {
    public static final Supplier<BiMap<dzq, dzq>> a = Suppliers.memoize(() -> ImmutableBiMap.builder().put((Object)dzs.rW, (Object)dzs.sw).put((Object)dzs.rX, (Object)dzs.sy).put((Object)dzs.rY, (Object)dzs.sx).put((Object)dzs.rZ, (Object)dzs.sz).put((Object)dzs.sf, (Object)dzs.sD).put((Object)dzs.se, (Object)dzs.sC).put((Object)dzs.sd, (Object)dzs.sB).put((Object)dzs.sc, (Object)dzs.sA).put((Object)dzs.sv, (Object)dzs.sL).put((Object)dzs.su, (Object)dzs.sK).put((Object)dzs.st, (Object)dzs.sJ).put((Object)dzs.ss, (Object)dzs.sI).put((Object)dzs.sr, (Object)dzs.sH).put((Object)dzs.sq, (Object)dzs.sG).put((Object)dzs.sp, (Object)dzs.sF).put((Object)dzs.so, (Object)dzs.sE).put((Object)dzs.sj, (Object)dzs.sn).put((Object)dzs.si, (Object)dzs.sm).put((Object)dzs.sh, (Object)dzs.sl).put((Object)dzs.sg, (Object)dzs.sk).put((Object)dzs.sM, (Object)dzs.sQ).put((Object)dzs.sN, (Object)dzs.sR).put((Object)dzs.sP, (Object)dzs.sT).put((Object)dzs.sO, (Object)dzs.sS).put((Object)dzs.sU, (Object)dzs.sY).put((Object)dzs.sV, (Object)dzs.sZ).put((Object)dzs.sX, (Object)dzs.tb).put((Object)dzs.sW, (Object)dzs.ta).putAll(dzs.fD.b()).put((Object)dzs.tc, (Object)dzs.tg).put((Object)dzs.td, (Object)dzs.th).put((Object)dzs.te, (Object)dzs.ti).put((Object)dzs.tf, (Object)dzs.tj).put((Object)dzs.tk, (Object)dzs.to).put((Object)dzs.tl, (Object)dzs.tp).put((Object)dzs.tm, (Object)dzs.tq).put((Object)dzs.tn, (Object)dzs.tr).put((Object)dzs.ts, (Object)dzs.tw).put((Object)dzs.tt, (Object)dzs.tx).put((Object)dzs.tu, (Object)dzs.ty).put((Object)dzs.tv, (Object)dzs.tz).put((Object)dzs.tA, (Object)dzs.tE).put((Object)dzs.tB, (Object)dzs.tF).put((Object)dzs.tC, (Object)dzs.tG).put((Object)dzs.tD, (Object)dzs.tH).put((Object)dzs.tI, (Object)dzs.tM).put((Object)dzs.tJ, (Object)dzs.tN).put((Object)dzs.tK, (Object)dzs.tO).put((Object)dzs.tL, (Object)dzs.tP).putAll(dzs.pd.b()).putAll(dzs.fF.b()).build());
    public static final Supplier<BiMap<dzq, dzq>> b = Suppliers.memoize(() -> a.get().inverse());
    private static final String d = "waxed_copper_door";
    private static final String o = "waxed_copper_trapdoor";
    private static final String p = "waxed_copper_golem_statue";
    private static final String q = "waxed_copper_chest";
    private static final String r = "waxed_lightning_rod";
    private static final String s = "waxed_copper_bar";
    private static final String t = "waxed_copper_chain";
    private static final String u = "waxed_copper_lantern";
    private static final String v = "waxed_copper_block";
    public static final ImmutableMap<dzq, Pair<ol, String>> c = ImmutableMap.builder().put((Object)dzs.to, (Object)Pair.of((Object)((Object)ol.c), (Object)"waxed_copper_bulb")).put((Object)dzs.tq, (Object)Pair.of((Object)((Object)ol.c), (Object)"waxed_weathered_copper_bulb")).put((Object)dzs.tp, (Object)Pair.of((Object)((Object)ol.c), (Object)"waxed_exposed_copper_bulb")).put((Object)dzs.tr, (Object)Pair.of((Object)((Object)ol.c), (Object)"waxed_oxidized_copper_bulb")).put((Object)dzs.sQ, (Object)Pair.of((Object)((Object)ol.c), (Object)"waxed_copper_door")).put((Object)dzs.sT, (Object)Pair.of((Object)((Object)ol.c), (Object)"waxed_copper_door")).put((Object)dzs.sR, (Object)Pair.of((Object)((Object)ol.c), (Object)"waxed_copper_door")).put((Object)dzs.sS, (Object)Pair.of((Object)((Object)ol.c), (Object)"waxed_copper_door")).put((Object)dzs.sY, (Object)Pair.of((Object)((Object)ol.c), (Object)"waxed_copper_trapdoor")).put((Object)dzs.tb, (Object)Pair.of((Object)((Object)ol.c), (Object)"waxed_copper_trapdoor")).put((Object)dzs.sZ, (Object)Pair.of((Object)((Object)ol.c), (Object)"waxed_copper_trapdoor")).put((Object)dzs.ta, (Object)Pair.of((Object)((Object)ol.c), (Object)"waxed_copper_trapdoor")).put((Object)dzs.tE, (Object)Pair.of((Object)((Object)ol.a), (Object)"waxed_copper_golem_statue")).put((Object)dzs.tG, (Object)Pair.of((Object)((Object)ol.a), (Object)"waxed_copper_golem_statue")).put((Object)dzs.tF, (Object)Pair.of((Object)((Object)ol.a), (Object)"waxed_copper_golem_statue")).put((Object)dzs.tH, (Object)Pair.of((Object)((Object)ol.a), (Object)"waxed_copper_golem_statue")).put((Object)dzs.tw, (Object)Pair.of((Object)((Object)ol.a), (Object)"waxed_copper_chest")).put((Object)dzs.ty, (Object)Pair.of((Object)((Object)ol.a), (Object)"waxed_copper_chest")).put((Object)dzs.tx, (Object)Pair.of((Object)((Object)ol.a), (Object)"waxed_copper_chest")).put((Object)dzs.tz, (Object)Pair.of((Object)((Object)ol.a), (Object)"waxed_copper_chest")).put((Object)dzs.tM, (Object)Pair.of((Object)((Object)ol.a), (Object)"waxed_lightning_rod")).put((Object)dzs.tO, (Object)Pair.of((Object)((Object)ol.a), (Object)"waxed_lightning_rod")).put((Object)dzs.tN, (Object)Pair.of((Object)((Object)ol.a), (Object)"waxed_lightning_rod")).put((Object)dzs.tP, (Object)Pair.of((Object)((Object)ol.a), (Object)"waxed_lightning_rod")).put((Object)dzs.fD.h(), (Object)Pair.of((Object)((Object)ol.a), (Object)"waxed_copper_bar")).put((Object)dzs.fD.j(), (Object)Pair.of((Object)((Object)ol.a), (Object)"waxed_copper_bar")).put((Object)dzs.fD.i(), (Object)Pair.of((Object)((Object)ol.a), (Object)"waxed_copper_bar")).put((Object)dzs.fD.k(), (Object)Pair.of((Object)((Object)ol.a), (Object)"waxed_copper_bar")).put((Object)dzs.fF.h(), (Object)Pair.of((Object)((Object)ol.a), (Object)"waxed_copper_chain")).put((Object)dzs.fF.j(), (Object)Pair.of((Object)((Object)ol.a), (Object)"waxed_copper_chain")).put((Object)dzs.fF.i(), (Object)Pair.of((Object)((Object)ol.a), (Object)"waxed_copper_chain")).put((Object)dzs.fF.k(), (Object)Pair.of((Object)((Object)ol.a), (Object)"waxed_copper_chain")).put((Object)dzs.pd.h(), (Object)Pair.of((Object)((Object)ol.a), (Object)"waxed_copper_lantern")).put((Object)dzs.pd.j(), (Object)Pair.of((Object)((Object)ol.a), (Object)"waxed_copper_lantern")).put((Object)dzs.pd.i(), (Object)Pair.of((Object)((Object)ol.a), (Object)"waxed_copper_lantern")).put((Object)dzs.pd.k(), (Object)Pair.of((Object)((Object)ol.a), (Object)"waxed_copper_lantern")).put((Object)dzs.sw, (Object)Pair.of((Object)((Object)ol.a), (Object)"waxed_copper_block")).put((Object)dzs.sx, (Object)Pair.of((Object)((Object)ol.a), (Object)"waxed_copper_block")).put((Object)dzs.sy, (Object)Pair.of((Object)((Object)ol.a), (Object)"waxed_copper_block")).put((Object)dzs.sz, (Object)Pair.of((Object)((Object)ol.a), (Object)"waxed_copper_block")).build();

    public dlk(dlp.a $$0) {
        super($$0);
    }

    @Override
    public cdc a(dpw $$0) {
        dwo $$1 = $$0.q();
        is $$2 = $$0.a();
        eoh $$3 = $$1.a_($$2);
        return dlk.a($$3).map($$4 -> {
            ddm $$5 = $$0.o();
            dlt $$6 = $$0.n();
            if ($$5 instanceof axg) {
                axg $$7 = (axg)$$5;
                aj.O.a($$7, $$2, $$6);
            }
            $$6.h(1);
            $$1.a($$2, (eoh)$$4, 11);
            $$1.a(etk.c, $$2, etk.a.a($$5, $$4));
            $$1.a((cgk)$$5, 3003, $$2, 0);
            if ($$3.b() instanceof eau && $$3.c(eau.d) != eoz.a) {
                is $$8 = eau.b($$2, $$3);
                $$1.a(etk.c, $$8, etk.a.a($$5, $$1.a_($$8)));
                $$1.a((cgk)$$5, 3003, $$8, 0);
            }
            return cdc.a;
        }).orElse(cdc.e);
    }

    public static Optional<eoh> a(eoh $$0) {
        return Optional.ofNullable((dzq)a.get().get((Object)$$0.b())).map($$1 -> $$1.m($$0));
    }

    @Override
    public boolean a(dwo $$0, ems $$1, boolean $$2, ddm $$3) {
        if ($$1.b(true)) {
            $$0.a(null, 3003, $$1.aD_(), 0);
            return true;
        }
        return false;
    }

    @Override
    public boolean a(emt $$0, ddm $$1) {
        return true;
    }
}

