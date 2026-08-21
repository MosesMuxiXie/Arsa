/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class my
implements mu {
    public static final List<cgu<?>> a = List.of(cgu.aq, cgu.M, cgu.aL, cgu.bj, cgu.G, cgu.aK, cgu.aY, cgu.C, cgu.bU, cgu.aP, cgu.bg, cgu.aC, cgu.x, cgu.aU, cgu.ae, cgu.n, cgu.ao, cgu.bB, cgu.am, cgu.j, cgu.v, cgu.g, cgu.aM);
    public static final List<cgu<?>> b = List.of(cgu.bJ, cgu.af, cgu.br);
    private static final dlp[] d = new dlp[]{dlx.td, dlx.tf, dlx.tg, dlx.te};
    private static final dlp[] e = new dlp[]{dlx.st, dlx.su, dlx.sr, dlx.ss};
    private static final dlp[] f = new dlp[]{dlx.pV, dlx.qX, dlx.rd, dlx.rH, dlx.rI, dlx.rK, dlx.rL, dlx.td, dlx.te, dlx.tf, dlx.tg, dlx.th, dlx.ti, dlx.tW, dlx.ua, dlx.ue, dlx.uf, dlx.ug, dlx.uh, dlx.ui, dlx.uq, dlx.wr, dlx.ws, dlx.wt, dlx.wu, dlx.ww, dlx.wF, dlx.wN, dlx.wO, dlx.wP, dlx.xc, dlx.xd, dlx.xv, dlx.xz, dlx.xB, dlx.ub, dlx.yA, dlx.za, dlx.zi, dlx.zb};
    public static final dlp[] c = new dlp[]{dlx.qq, dlx.qF, dlx.qA, dlx.qv, dlx.qK, dlx.qP, dlx.qU};
    private static final Comparator<jd.c<?>> g = Comparator.comparing($$0 -> $$0.h().a());

    @Override
    public void a(jf.a $$0, Consumer<ac> $$1) {
        jf.b<cgu<?>> $$2 = $$0.e(mj.F);
        jf.b<dlp> $$3 = $$0.e(mj.R);
        jf.b<dzq> $$4 = $$0.e(mj.i);
        jf.b<cvs> $$5 = $$0.e(mj.bh);
        jf.b<cvc> $$6 = $$0.e(mj.aT);
        jf.b<cxx> $$7 = $$0.e(mj.bB);
        jf.b<dso> $$8 = $$0.e(mj.bf);
        ac $$9 = ab.a.a().a(dzs.jb, (yh)yh.c("advancements.husbandry.root.title"), (yh)yh.c("advancements.husbandry.root.description"), amo.b("gui/advancements/backgrounds/husbandry"), ai.a, false, false, false).a("consumed_item", bb.a.b()).a($$1, "husbandry/root");
        ac $$10 = ab.a.a().a($$9).a(dlx.rc, (yh)yh.c("advancements.husbandry.plant_seed.title"), (yh)yh.c("advancements.husbandry.plant_seed.description"), null, ai.a, true, true, false).a(af.a.b).a("wheat", ch.a.a(dzs.cY)).a("pumpkin_stem", ch.a.a(dzs.fL)).a("melon_stem", ch.a.a(dzs.fM)).a("beetroots", ch.a.a(dzs.lz)).a("nether_wart", ch.a.a(dzs.gf)).a("torchflower", ch.a.a(dzs.lw)).a("pitcher_pod", ch.a.a(dzs.lx)).a($$1, "husbandry/plant_seed");
        ac $$11 = ab.a.a().a($$9).a(dlx.rc, (yh)yh.c("advancements.husbandry.breed_an_animal.title"), (yh)yh.c("advancements.husbandry.breed_an_animal.description"), null, ai.a, true, true, false).a(af.a.b).a("bred", at.a.b()).a($$1, "husbandry/breed_an_animal");
        my.a($$11, $$1, $$2, a.stream(), b.stream());
        my.a(ab.a.a(), $$3).a($$10).a(dlx.pV, (yh)yh.c("advancements.husbandry.balanced_diet.title"), (yh)yh.c("advancements.husbandry.balanced_diet.description"), null, ai.b, true, true, false).a(ag.a.a(100)).a($$1, "husbandry/balanced_diet");
        ab.a.a().a($$10).a(dlx.qV, (yh)yh.c("advancements.husbandry.netherite_hoe.title"), (yh)yh.c("advancements.husbandry.netherite_hoe.description"), null, ai.b, true, true, false).a(ag.a.a(100)).a("netherite_hoe", ce.a.a(dlx.qV)).a($$1, "husbandry/obtain_netherite_hoe");
        ac $$12 = ab.a.a().a($$9).a(dlx.wZ, (yh)yh.c("advancements.husbandry.tame_an_animal.title"), (yh)yh.c("advancements.husbandry.tame_an_animal.description"), null, ai.a, true, true, false).a("tamed_animal", dp.a.b()).a($$1, "husbandry/tame_an_animal");
        ac $$13 = my.c(ab.a.a(), $$3).a($$9).a(af.a.b).a(dlx.sZ, (yh)yh.c("advancements.husbandry.fishy_business.title"), (yh)yh.c("advancements.husbandry.fishy_business.description"), null, ai.a, true, true, false).a($$1, "husbandry/fishy_business");
        ac $$14 = my.b(ab.a.a(), $$3).a($$13).a(af.a.b).a(dlx.sr, (yh)yh.c("advancements.husbandry.tactical_fishing.title"), (yh)yh.c("advancements.husbandry.tactical_fishing.description"), null, ai.a, true, true, false).a($$1, "husbandry/tactical_fishing");
        ac $$15 = ab.a.a().a($$14).a(af.a.b).a(mi.h.b(dlx.sv).a(), bx.a.a(cg.a.a().a($$3, dlx.sv))).a(dlx.sv, (yh)yh.c("advancements.husbandry.axolotl_in_a_bucket.title"), (yh)yh.c("advancements.husbandry.axolotl_in_a_bucket.description"), null, ai.a, true, true, false).a($$1, "husbandry/axolotl_in_a_bucket");
        ab.a.a().a($$15).a("kill_axolotl_target", bl.a.a(bs.a.a().a($$2, cgu.j))).a(dlx.su, (yh)yh.c("advancements.husbandry.kill_axolotl_target.title"), (yh)yh.c("advancements.husbandry.kill_axolotl_target.description"), null, ai.a, true, true, false).a($$1, "husbandry/kill_axolotl_target");
        my.a(ab.a.a(), $$6).a($$12).a(dlx.td, (yh)yh.c("advancements.husbandry.complete_catalogue.title"), (yh)yh.c("advancements.husbandry.complete_catalogue.description"), null, ai.b, true, true, false).a(ag.a.a(50)).a($$1, "husbandry/complete_catalogue");
        my.b(ab.a.a(), $$7).a($$12).a(dlx.tD, (yh)yh.c("advancements.husbandry.whole_pack.title"), (yh)yh.c("advancements.husbandry.whole_pack.description"), null, ai.b, true, true, false).a(ag.a.a(50)).a($$1, "husbandry/whole_pack");
        ac $$16 = ab.a.a().a($$9).a("safely_harvest_honey", ch.a.a(co.a.a().a(as.a.a().a($$4, bdp.aU)).a(true), cg.a.a().a($$3, dlx.uo))).a(dlx.zi, (yh)yh.c("advancements.husbandry.safely_harvest_honey.title"), (yh)yh.c("advancements.husbandry.safely_harvest_honey.description"), null, ai.a, true, true, false).a($$1, "husbandry/safely_harvest_honey");
        ac $$17 = ab.a.a().a($$16).a(dlx.zf, (yh)yh.c("advancements.husbandry.wax_on.title"), (yh)yh.c("advancements.husbandry.wax_on.description"), null, ai.a, true, true, false).a("wax_on", ch.a.a(co.a.a().a(as.a.a().a($$4, dlk.a.get().keySet())), cg.a.a().a($$3, dlx.zf))).a($$1, "husbandry/wax_on");
        ab.a.a().a($$17).a(dlx.qA, (yh)yh.c("advancements.husbandry.wax_off.title"), (yh)yh.c("advancements.husbandry.wax_off.description"), null, ai.a, true, true, false).a("wax_off", ch.a.a(co.a.a().a(as.a.a().a($$4, dlk.b.get().keySet())), cg.a.a().a($$3, c))).a($$1, "husbandry/wax_off");
        ac $$18 = ab.a.a().a($$9).a(mi.h.b(dlx.sw).a(), bx.a.a(cg.a.a().a($$3, dlx.sw))).a(dlx.sw, (yh)yh.c("advancements.husbandry.tadpole_in_a_bucket.title"), (yh)yh.c("advancements.husbandry.tadpole_in_a_bucket.description"), null, ai.a, true, true, false).a($$1, "husbandry/tadpole_in_a_bucket");
        ac $$19 = my.a($$2, $$3, $$5, ab.a.a()).a($$18).a(dlx.wZ, (yh)yh.c("advancements.husbandry.leash_all_frog_variants.title"), (yh)yh.c("advancements.husbandry.leash_all_frog_variants.description"), null, ai.a, true, true, false).a($$1, "husbandry/leash_all_frog_variants");
        ab.a.a().a($$19).a(dlx.zW, (yh)yh.c("advancements.husbandry.froglights.title"), (yh)yh.c("advancements.husbandry.froglights.description"), null, ai.b, true, true, false).a("froglights", ce.a.a(dlx.zV, dlx.zX, dlx.zW)).a($$1, "husbandry/froglights");
        ab.a.a().a($$9).a("silk_touch_nest", ar.a.a(dzs.qe, cg.a.a().a(bh.a.a().a(kt.b, ku.a(List.of(new bn($$8.b(dst.v), cq.d.b(1))))).b()), cq.d.a(3))).a(dzs.qe, (yh)yh.c("advancements.husbandry.silk_touch_nest.title"), (yh)yh.c("advancements.husbandry.silk_touch_nest.description"), null, ai.a, true, true, false).a($$1, "husbandry/silk_touch_nest");
        ab.a.a().a($$9).a(dlx.pr, (yh)yh.c("advancements.husbandry.ride_a_boat_with_a_goat.title"), (yh)yh.c("advancements.husbandry.ride_a_boat_with_a_goat.description"), null, ai.a, true, true, false).a("ride_a_boat_with_a_goat", dk.a.a(bs.a.a().a(bs.a.a().a($$2, bdt.J).b(bs.a.a().a($$2, cgu.am))))).a($$1, "husbandry/ride_a_boat_with_a_goat");
        ab.a.a().a($$9).a(dlx.tk, (yh)yh.c("advancements.husbandry.make_a_sign_glow.title"), (yh)yh.c("advancements.husbandry.make_a_sign_glow.description"), null, ai.a, true, true, false).a("make_a_sign_glow", ch.a.a(co.a.a().a(as.a.a().a($$4, bdp.aP)), cg.a.a().a($$3, dlx.tk))).a($$1, "husbandry/make_a_sign_glow");
        ac $$20 = ab.a.a().a($$9).a(dlx.tW, (yh)yh.c("advancements.husbandry.allay_deliver_item_to_player.title"), (yh)yh.c("advancements.husbandry.allay_deliver_item_to_player.description"), null, ai.a, true, true, true).a("allay_deliver_item_to_player", cu.a.a(Optional.empty(), Optional.empty(), Optional.of(bs.a(bs.a.a().a($$2, cgu.e))))).a($$1, "husbandry/allay_deliver_item_to_player");
        ab.a.a().a($$20).a(dlx.ng, (yh)yh.c("advancements.husbandry.allay_deliver_cake_to_note_block.title"), (yh)yh.c("advancements.husbandry.allay_deliver_cake_to_note_block.description"), null, ai.a, true, true, true).a("allay_deliver_cake_to_note_block", ch.a.b(co.a.a().a(as.a.a().a($$4, dzs.bf)), cg.a.a().a($$3, dlx.tF))).a($$1, "husbandry/allay_deliver_cake_to_note_block");
        ac $$21 = ab.a.a().a($$9).a(dlx.lj, (yh)yh.c("advancements.husbandry.obtain_sniffer_egg.title"), (yh)yh.c("advancements.husbandry.obtain_sniffer_egg.description"), null, ai.a, true, true, true).a("obtain_sniffer_egg", ce.a.a(dlx.lj)).a($$1, "husbandry/obtain_sniffer_egg");
        ac $$22 = ab.a.a().a($$21).a(dlx.xx, (yh)yh.c("advancements.husbandry.feed_snifflet.title"), (yh)yh.c("advancements.husbandry.feed_snifflet.description"), null, ai.a, true, true, true).a("feed_snifflet", cw.a.b(cg.a.a().a($$3, bdy.aB), Optional.of(bs.a(bs.a.a().a($$2, cgu.br).a(bq.a.a().g(true)))))).a($$1, "husbandry/feed_snifflet");
        ab.a.a().a($$22).a(dlx.xy, (yh)yh.c("advancements.husbandry.plant_any_sniffer_seed.title"), (yh)yh.c("advancements.husbandry.plant_any_sniffer_seed.description"), null, ai.a, true, true, true).a(af.a.b).a("torchflower", ch.a.a(dzs.lw)).a("pitcher_pod", ch.a.a(dzs.lx)).a($$1, "husbandry/plant_any_sniffer_seed");
        ab.a.a().a($$12).a(dlx.tZ, (yh)yh.c("advancements.husbandry.remove_wolf_armor.title"), (yh)yh.c("advancements.husbandry.remove_wolf_armor.description"), null, ai.a, true, true, false).a("remove_wolf_armor", cw.a.a(cg.a.a().a($$3, dlx.pS), Optional.of(bs.a(bs.a.a().a($$2, cgu.bU))))).a($$1, "husbandry/remove_wolf_armor");
        ab.a.a().a($$12).a(dlx.pS, (yh)yh.c("advancements.husbandry.repair_wolf_armor.title"), (yh)yh.c("advancements.husbandry.repair_wolf_armor.description"), null, ai.a, true, true, false).a("repair_wolf_armor", cw.a.b(cg.a.a().a($$3, dlx.pR), Optional.of(bs.a(bs.a.a().a($$2, cgu.bU).a(bp.a.a().e(cg.a.a().a($$3, dlx.pS).a(bh.a.a().a(kc.a(ki.e, 0)).b()))))))).a($$1, "husbandry/repair_wolf_armor");
        ab.a.a().a($$9).a(dlx.lk, (yh)yh.c("advancements.husbandry.place_dried_ghast_in_water.title"), (yh)yh.c("advancements.husbandry.place_dried_ghast_in_water.description"), null, ai.a, true, true, false).a("place_dried_ghast_in_water", ch.a.a(dzs.nd, eox.I, true)).a($$1, "husbandry/place_dried_ghast_in_water");
    }

    public static ac a(ac $$0, Consumer<ac> $$1, je<cgu<?>> $$2, Stream<cgu<?>> $$3, Stream<cgu<?>> $$4) {
        return my.a(ab.a.a(), $$3, $$2, $$4).a($$0).a(dlx.ww, (yh)yh.c("advancements.husbandry.breed_all_animals.title"), (yh)yh.c("advancements.husbandry.breed_all_animals.description"), null, ai.b, true, true, false).a(ag.a.a(100)).a($$1, "husbandry/bred_all_animals");
    }

    private static ab.a a(je<cgu<?>> $$0, je<dlp> $$1, jf<cvs> $$2, ab.a $$32) {
        my.a($$2).forEach($$3 -> $$32.a($$3.h().a().toString(), cw.a.b(cg.a.a().a($$1, dlx.wZ), Optional.of(bs.a(bs.a.a().a($$0, cgu.af).a(bh.a.a().a(kc.a(ki.aS, $$3)).b()))))));
        return $$32;
    }

    private static <T> Stream<jd.c<T>> a(jf<T> $$0) {
        return $$0.c().sorted(g);
    }

    private static ab.a a(ab.a $$0, je<dlp> $$1) {
        for (dlp $$2 : f) {
            $$0.a(mi.h.b($$2).a(), bb.a.a($$1, $$2));
        }
        return $$0;
    }

    private static ab.a a(ab.a $$0, Stream<cgu<?>> $$1, je<cgu<?>> $$22, Stream<cgu<?>> $$3) {
        $$1.forEach($$2 -> $$0.a(cgu.a($$2).toString(), at.a.a(bs.a.a().a($$22, (cgu<?>)$$2))));
        $$3.forEach($$2 -> $$0.a(cgu.a($$2).toString(), at.a.a(Optional.of(bs.a.a().a($$22, (cgu<?>)$$2).b()), Optional.of(bs.a.a().a($$22, (cgu<?>)$$2).b()), Optional.empty())));
        return $$0;
    }

    private static ab.a b(ab.a $$0, je<dlp> $$1) {
        for (dlp $$2 : e) {
            $$0.a(mi.h.b($$2).a(), bx.a.a(cg.a.a().a($$1, $$2)));
        }
        return $$0;
    }

    private static ab.a c(ab.a $$0, je<dlp> $$1) {
        for (dlp $$2 : d) {
            $$0.a(mi.h.b($$2).a(), bz.a.a(Optional.empty(), Optional.empty(), Optional.of(cg.a.a().a($$1, $$2).b())));
        }
        return $$0;
    }

    private static ab.a a(ab.a $$0, jf<cvc> $$12) {
        my.a($$12).forEach($$1 -> $$0.a($$1.h().a().toString(), dp.a.a(bs.a.a().a(bh.a.a().a(kc.a(ki.aX, $$1)).b()))));
        return $$0;
    }

    private static ab.a b(ab.a $$0, jf<cxx> $$12) {
        my.a($$12).forEach($$1 -> $$0.a($$1.h().a().toString(), dp.a.a(bs.a.a().a(bh.a.a().a(kc.a(ki.aD, $$1)).b()))));
        return $$0;
    }
}

