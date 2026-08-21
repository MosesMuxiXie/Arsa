/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.google.common.collect.Sets$SetView
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class mx
implements mu {
    private static final Logger a = LogUtils.getLogger();
    private static final int b = 384;
    private static final int c = 320;
    private static final int d = -64;
    private static final int e = 5;
    private static final Map<cho, Set<cgu<?>>> f = Map.of(cho.a, Set.of(cgu.aj, cgu.as, cgu.bO));
    private static final List<cgu<?>> g = Arrays.asList(cgu.q, cgu.s, cgu.t, cgu.w, cgu.y, cgu.H, cgu.I, cgu.O, cgu.Q, cgu.T, cgu.R, cgu.S, cgu.W, cgu.ah, cgu.an, cgu.ao, cgu.ar, cgu.aE, cgu.aV, cgu.aX, cgu.aZ, cgu.ba, cgu.bb, cgu.bh, cgu.bk, cgu.bm, cgu.bn, cgu.bp, cgu.bw, cgu.bA, cgu.bK, cgu.bM, cgu.bQ, cgu.bS, cgu.bR, cgu.bV, cgu.bZ, cgu.bW, cgu.bX, cgu.ca, cgu.bY);

    private static ak<cn.a> a(cq.d $$0, Optional<bs> $$1) {
        return cn.a.a(Optional.of(bs.a.a().a(bj.c(cq.b.c(30.0))).a(cm.a($$0)).b()), $$1);
    }

    private static ak<du.a> a(bs.a $$0, cg.a $$1) {
        return du.a.a(bs.a.a().a(cx.d.a().a($$0).b()), $$1);
    }

    @Override
    public void a(jf.a $$0, Consumer<ac> $$1) {
        jf.b<cgu<?>> $$2 = $$0.e(mj.F);
        jf.b<dlp> $$3 = $$0.e(mj.R);
        jf.b<dzq> $$4 = $$0.e(mj.i);
        ac $$5 = ab.a.a().a(dlx.wv, (yh)yh.c("advancements.adventure.root.title"), (yh)yh.c("advancements.adventure.root.description"), amo.b("gui/advancements/backgrounds/adventure"), ai.a, false, false, false).a(af.a.b).a("killed_something", cj.a.b()).a("killed_by_something", cj.a.d()).a($$1, "adventure/root");
        ac $$6 = ab.a.a().a($$5).a(dzs.bu, (yh)yh.c("advancements.adventure.sleep_in_bed.title"), (yh)yh.c("advancements.adventure.sleep_in_bed.description"), null, ai.a, true, true, false).a("slept_in_bed", cy.a.b()).a($$1, "adventure/sleep_in_bed");
        mx.a($$0, $$1, $$6, dyc.a.b);
        ac $$7 = ab.a.a().a($$5).a(dlx.qb, (yh)yh.c("advancements.adventure.trade.title"), (yh)yh.c("advancements.adventure.trade.description"), null, ai.a, true, true, false).a("traded", dr.a.b()).a($$1, "adventure/trade");
        ab.a.a().a($$7).a(dlx.qb, (yh)yh.c("advancements.adventure.trade_at_world_height.title"), (yh)yh.c("advancements.adventure.trade_at_world_height.description"), null, ai.a, true, true, false).a("trade_at_world_height", dr.a.a(bs.a.a().a(co.a.a(cq.b.b(319.0))))).a($$1, "adventure/trade_at_world_height");
        ac $$8 = mx.a($$5, $$1, $$2, mx.a(g, $$2));
        ac $$9 = ab.a.a().a($$8).a(dlx.pW, (yh)yh.c("advancements.adventure.shoot_arrow.title"), (yh)yh.c("advancements.adventure.shoot_arrow.description"), null, ai.a, true, true, false).a("shot_arrow", cv.a.a(bf.a.a().a(bg.a.a().a(dn.a(bdq.j)).a(bs.a.a().a($$2, bdt.g))))).a($$1, "adventure/shoot_arrow");
        ac $$10 = ab.a.a().a($$8).a(dlx.yr, (yh)yh.c("advancements.adventure.throw_trident.title"), (yh)yh.c("advancements.adventure.throw_trident.description"), null, ai.a, true, true, false).a("shot_trident", cv.a.a(bf.a.a().a(bg.a.a().a(dn.a(bdq.j)).a(bs.a.a().a($$2, cgu.bH))))).a($$1, "adventure/throw_trident");
        ab.a.a().a($$10).a(dlx.yr, (yh)yh.c("advancements.adventure.very_very_frightening.title"), (yh)yh.c("advancements.adventure.very_very_frightening.description"), null, ai.a, true, true, false).a("struck_villager", aw.a.a(bs.a.a().a($$2, cgu.bL))).a($$1, "adventure/very_very_frightening");
        ab.a.a().a($$7).a(dzs.eJ, (yh)yh.c("advancements.adventure.summon_iron_golem.title"), (yh)yh.c("advancements.adventure.summon_iron_golem.description"), null, ai.c, true, true, false).a("summoned_golem", dm.a.a(bs.a.a().a($$2, cgu.au))).a($$1, "adventure/summon_iron_golem");
        ab.a.a().a($$9).a(dlx.pX, (yh)yh.c("advancements.adventure.sniper_duel.title"), (yh)yh.c("advancements.adventure.sniper_duel.description"), null, ai.b, true, true, false).a(ag.a.a(50)).a("killed_skeleton", cj.a.a(bs.a.a().a($$2, cgu.bn).a(bj.a(cq.b.b(50.0))), bg.a.a().a(dn.a(bdq.j)))).a($$1, "adventure/sniper_duel");
        ab.a.a().a($$8).a(dlx.xP, (yh)yh.c("advancements.adventure.totem_of_undying.title"), (yh)yh.c("advancements.adventure.totem_of_undying.description"), null, ai.c, true, true, false).a("used_totem", dt.a.a($$3, dlx.xP)).a($$1, "adventure/totem_of_undying");
        ab.a.a().a($$8).a(dlx.xL, (yh)yh.c("advancements.adventure.spear_many_mobs.title"), (yh)yh.c("advancements.adventure.spear_many_mobs.description"), null, ai.c, true, true, false).a("spear_many_mobs", dj.a.a(5)).a($$1, "adventure/spear_many_mobs");
        ac $$11 = ab.a.a().a($$5).a(dlx.yz, (yh)yh.c("advancements.adventure.ol_betsy.title"), (yh)yh.c("advancements.adventure.ol_betsy.description"), null, ai.a, true, true, false).a("shot_crossbow", dd.a.a($$3, dlx.yz)).a($$1, "adventure/ol_betsy");
        ab.a.a().a($$11).a(dlx.yz, (yh)yh.c("advancements.adventure.whos_the_pillager_now.title"), (yh)yh.c("advancements.adventure.whos_the_pillager_now.description"), null, ai.a, true, true, false).a("kill_pillager", ci.a.a($$3, bs.a.a().a($$2, cgu.bb))).a($$1, "adventure/whos_the_pillager_now");
        ab.a.a().a($$11).a(dlx.yz, (yh)yh.c("advancements.adventure.two_birds_one_arrow.title"), (yh)yh.c("advancements.adventure.two_birds_one_arrow.description"), null, ai.b, true, true, false).a(ag.a.a(65)).a("two_birds", ci.a.a($$3, bs.a.a().a($$2, cgu.aX), bs.a.a().a($$2, cgu.aX))).a($$1, "adventure/two_birds_one_arrow");
        ab.a.a().a($$11).a(dlx.yz, (yh)yh.c("advancements.adventure.arbalistic.title"), (yh)yh.c("advancements.adventure.arbalistic.description"), null, ai.b, true, true, true).a(ag.a.a(85)).a("arbalistic", ci.a.a($$3, cq.d.a(5))).a($$1, "adventure/arbalistic");
        jf.b<ekq> $$12 = $$0.e(mj.aR);
        ac $$13 = ab.a.a().a($$5).a(dfh.a($$12), (yh)yh.c("advancements.adventure.voluntary_exile.title"), (yh)yh.c("advancements.adventure.voluntary_exile.description"), null, ai.a, true, true, true).a("voluntary_exile", cj.a.a(bs.a.a().a($$2, bdt.c).a(bp.a($$3, $$12)))).a($$1, "adventure/voluntary_exile");
        ab.a.a().a($$13).a(dfh.a($$12), (yh)yh.c("advancements.adventure.hero_of_the_village.title"), (yh)yh.c("advancements.adventure.hero_of_the_village.description"), null, ai.b, true, true, true).a(ag.a.a(100)).a("hero_of_the_village", cy.a.c()).a($$1, "adventure/hero_of_the_village");
        ab.a.a().a($$5).a(dzs.qg.h(), (yh)yh.c("advancements.adventure.honey_block_slide.title"), (yh)yh.c("advancements.adventure.honey_block_slide.description"), null, ai.a, true, true, false).a("honey_block_slide", dg.a.a(dzs.qg)).a($$1, "adventure/honey_block_slide");
        ab.a.a().a($$9).a(dzs.qd.h(), (yh)yh.c("advancements.adventure.bullseye.title"), (yh)yh.c("advancements.adventure.bullseye.description"), null, ai.b, true, true, false).a(ag.a.a(50)).a("bullseye", dq.a.a(cq.d.a(15), Optional.of(bs.a(bs.a.a().a(bj.a(cq.b.b(30.0))))))).a($$1, "adventure/bullseye");
        ab.a.a().a($$6).a(dlx.rh, (yh)yh.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.title"), (yh)yh.c("advancements.adventure.walk_on_powder_snow_with_leather_boots.description"), null, ai.a, true, true, false).a("walk_on_powder_snow_with_leather_boots", cy.a.a($$4, $$3, dzs.rP, dlx.rh)).a($$1, "adventure/walk_on_powder_snow_with_leather_boots");
        ab.a.a().a($$5).a(dlx.mR, (yh)yh.c("advancements.adventure.lightning_rod_with_villager_no_fire.title"), (yh)yh.c("advancements.adventure.lightning_rod_with_villager_no_fire.description"), null, ai.a, true, true, false).a("lightning_rod_with_villager_no_fire", mx.a(cq.d.a(0), Optional.of(bs.a.a().a($$2, cgu.bL).b()))).a($$1, "adventure/lightning_rod_with_villager_no_fire");
        ac $$14 = ab.a.a().a($$5).a(dlx.tb, (yh)yh.c("advancements.adventure.spyglass_at_parrot.title"), (yh)yh.c("advancements.adventure.spyglass_at_parrot.description"), null, ai.a, true, true, false).a("spyglass_at_parrot", mx.a(bs.a.a().a($$2, cgu.aW), cg.a.a().a($$3, dlx.tb))).a($$1, "adventure/spyglass_at_parrot");
        ac $$15 = ab.a.a().a($$14).a(dlx.tb, (yh)yh.c("advancements.adventure.spyglass_at_ghast.title"), (yh)yh.c("advancements.adventure.spyglass_at_ghast.description"), null, ai.a, true, true, false).a("spyglass_at_ghast", mx.a(bs.a.a().a($$2, cgu.ah), cg.a.a().a($$3, dlx.tb))).a($$1, "adventure/spyglass_at_ghast");
        ab.a.a().a($$6).a(dlx.fF, (yh)yh.c("advancements.adventure.play_jukebox_in_meadows.title"), (yh)yh.c("advancements.adventure.play_jukebox_in_meadows.description"), null, ai.a, true, true, false).a("play_jukebox_in_meadows", ch.a.a(co.a.a().a(jh.a($$0.e(mj.aS).b(dxv.E))).a(as.a.a().a($$4, dzs.ew)), cg.a.a().a(bh.a.a().a(kt.n, kx.b()).b()))).a($$1, "adventure/play_jukebox_in_meadows");
        ab.a.a().a($$15).a(dlx.tb, (yh)yh.c("advancements.adventure.spyglass_at_dragon.title"), (yh)yh.c("advancements.adventure.spyglass_at_dragon.description"), null, ai.a, true, true, false).a("spyglass_at_dragon", mx.a(bs.a.a().a($$2, cgu.T), cg.a.a().a($$3, dlx.tb))).a($$1, "adventure/spyglass_at_dragon");
        ab.a.a().a($$5).a(dlx.sl, (yh)yh.c("advancements.adventure.fall_from_world_height.title"), (yh)yh.c("advancements.adventure.fall_from_world_height.description"), null, ai.a, true, true, false).a("fall_from_world_height", bk.a.a(bs.a.a().a(co.a.a(cq.b.c(-59.0))), bj.b(cq.b.b(379.0)), co.a.a(cq.b.b(319.0)))).a($$1, "adventure/fall_from_world_height");
        ab.a.a().a($$8).a(dzs.rU, (yh)yh.c("advancements.adventure.kill_mob_near_sculk_catalyst.title"), (yh)yh.c("advancements.adventure.kill_mob_near_sculk_catalyst.description"), null, ai.b, true, true, false).a("kill_mob_near_sculk_catalyst", cj.a.c()).a($$1, "adventure/kill_mob_near_sculk_catalyst");
        ab.a.a().a($$5).a(dzs.rQ, (yh)yh.c("advancements.adventure.avoid_vibration.title"), (yh)yh.c("advancements.adventure.avoid_vibration.description"), null, ai.a, true, true, false).a("avoid_vibration", cy.a.d()).a($$1, "adventure/avoid_vibration");
        ac $$16 = mx.a($$3, ab.a.a()).a($$5).a(dlx.Aa, (yh)yh.c("advancements.adventure.salvage_sherd.title"), (yh)yh.c("advancements.adventure.salvage_sherd.description"), null, ai.a, true, true, false).a($$1, "adventure/salvage_sherd");
        ab.a.a().a($$16).a(elu.a(new eml(Optional.empty(), Optional.of(dlx.AF), Optional.empty(), Optional.of(dlx.AB))), (yh)yh.c("advancements.adventure.craft_decorated_pot_using_only_sherds.title"), (yh)yh.c("advancements.adventure.craft_decorated_pot_using_only_sherds.description"), null, ai.a, true, true, false).a("pot_crafted_using_only_sherds", da.a.a(amt.a(mj.bK, amo.b("decorated_pot")), List.of(cg.a.a().a($$3, bdy.bY), cg.a.a().a($$3, bdy.bY), cg.a.a().a($$3, bdy.bY), cg.a.a().a($$3, bdy.bY)))).a($$1, "adventure/craft_decorated_pot_using_only_sherds");
        ac $$17 = mx.b(ab.a.a()).a($$5).a(new dlt(dlx.Ad), (yh)yh.c("advancements.adventure.trim_with_any_armor_pattern.title"), (yh)yh.c("advancements.adventure.trim_with_any_armor_pattern.description"), null, ai.a, true, true, false).a($$1, "adventure/trim_with_any_armor_pattern");
        mx.a(ab.a.a()).a($$17).a(new dlt(dlx.Ap), (yh)yh.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.title"), (yh)yh.c("advancements.adventure.trim_with_all_exclusive_armor_patterns.description"), null, ai.b, true, true, false).a(ag.a.a(150)).a($$1, "adventure/trim_with_all_exclusive_armor_patterns");
        ab.a.a().a($$5).a(dlx.fg, (yh)yh.c("advancements.adventure.read_power_from_chiseled_bookshelf.title"), (yh)yh.c("advancements.adventure.read_power_from_chiseled_bookshelf.description"), null, ai.a, true, true, false).a(af.a.b).a("chiseled_bookshelf", mx.a($$4, dzs.cw)).a("comparator", mx.b($$4, dzs.cw)).a($$1, "adventure/read_power_of_chiseled_bookshelf");
        ab.a.a().a($$5).a(dlx.pR, (yh)yh.c("advancements.adventure.brush_armadillo.title"), (yh)yh.c("advancements.adventure.brush_armadillo.description"), null, ai.a, true, true, false).a("brush_armadillo", cw.a.b(cg.a.a().a($$3, dlx.Aa), Optional.of(bs.a(bs.a.a().a($$2, cgu.g))))).a($$1, "adventure/brush_armadillo");
        ac $$18 = ab.a.a().a($$5).a(dzs.rH, (yh)yh.c("advancements.adventure.minecraft_trials_edition.title"), (yh)yh.c("advancements.adventure.minecraft_trials_edition.description"), null, ai.a, true, true, false).a("minecraft_trials_edition", cy.a.a(co.a.b($$0.e(mj.bs).b(ffi.H)))).a($$1, "adventure/minecraft_trials_edition");
        ab.a.a().a($$18).a(dlx.AZ, (yh)yh.c("advancements.adventure.lighten_up.title"), (yh)yh.c("advancements.adventure.lighten_up.description"), null, ai.a, true, true, false).a("lighten_up", ch.a.a(co.a.a().a(as.a.a().a($$4, dzs.tn, dzs.tm, dzs.tl, dzs.tr, dzs.tq, dzs.tp).a(dl.a.a().a(ebf.c, true))), cg.a.a().a($$3, my.c))).a($$1, "adventure/lighten_up");
        ac $$19 = ab.a.a().a($$18).a(dlx.By, (yh)yh.c("advancements.adventure.under_lock_and_key.title"), (yh)yh.c("advancements.adventure.under_lock_and_key.description"), null, ai.a, true, true, false).a("under_lock_and_key", ch.a.a(co.a.a().a(as.a.a().a($$4, dzs.uR).a(dl.a.a().a(ejf.d, false))), cg.a.a().a($$3, dlx.By))).a($$1, "adventure/under_lock_and_key");
        ab.a.a().a($$19).a(dlx.Bz, (yh)yh.c("advancements.adventure.revaulting.title"), (yh)yh.c("advancements.adventure.revaulting.description"), null, ai.c, true, true, false).a("revaulting", ch.a.a(co.a.a().a(as.a.a().a($$4, dzs.uR).a(dl.a.a().a(ejf.d, true))), cg.a.a().a($$3, dlx.Bz))).a($$1, "adventure/revaulting");
        ab.a.a().a($$18).a(dlx.wj, (yh)yh.c("advancements.adventure.blowback.title"), (yh)yh.c("advancements.adventure.blowback.description"), null, ai.b, true, true, false).a(ag.a.a(40)).a("blowback", cj.a.a(bs.a.a().a($$2, cgu.t), bg.a.a().a(dn.a(bdq.j)).a(bs.a.a().a($$2, cgu.u)))).a($$1, "adventure/blowback");
        ab.a.a().a($$5).a(dlx.tX, (yh)yh.c("advancements.adventure.crafters_crafting_crafters.title"), (yh)yh.c("advancements.adventure.crafters_crafting_crafters.description"), null, ai.a, true, true, false).a("crafter_crafted_crafter", da.a.b(amt.a(mj.bK, amo.b("crafter")))).a($$1, "adventure/crafters_crafting_crafters");
        ab.a.a().a($$5).a(dlx.zk, (yh)yh.c("advancements.adventure.use_lodestone.title"), (yh)yh.c("advancements.adventure.use_lodestone.description"), null, ai.a, true, true, false).a("use_lodestone", ch.a.a(co.a.a().a(as.a.a().a($$4, dzs.qq)), cg.a.a().a($$3, dlx.sG))).a($$1, "adventure/use_lodestone");
        ab.a.a().a($$18).a(dlx.wj, (yh)yh.c("advancements.adventure.who_needs_rockets.title"), (yh)yh.c("advancements.adventure.who_needs_rockets.description"), null, ai.a, true, true, false).a("who_needs_rockets", bw.a.a(bj.b(cq.b.b(7.0)), bs.a.a().a($$2, cgu.bP))).a($$1, "adventure/who_needs_rockets");
        ab.a.a().a($$18).a(dlx.wn, (yh)yh.c("advancements.adventure.overoverkill.title"), (yh)yh.c("advancements.adventure.overoverkill.description"), null, ai.b, true, true, false).a(ag.a.a(50)).a("overoverkill", cv.a.a(bf.a.a().a(cq.b.b(100.0)).a(bg.a.a().a(dn.a(bdq.H)).a(bs.a.a().a($$2, cgu.cb).a(bp.a.a().f(cg.a.a().a($$3, dlx.wn))))))).a($$1, "adventure/overoverkill");
        ab.a.a().a($$5).a(dzs.cQ, (yh)yh.c("advancements.adventure.heart_transplanter.title"), (yh)yh.c("advancements.adventure.heart_transplanter.description"), null, ai.a, true, true, false).a(af.a.b).a("place_creaking_heart_dormant", ch.a.a(dzs.cQ, eox.bF, epb.b)).a("place_creaking_heart_awake", ch.a.a(dzs.cQ, eox.bF, epb.c)).a("place_pale_oak_log", mx.a($$4, bdp.t)).a($$1, "adventure/heart_transplanter");
    }

    public static ac a(ac $$0, Consumer<ac> $$1, je<cgu<?>> $$2, List<cgu<?>> $$3) {
        ac $$4 = mx.a(ab.a.a(), $$2, $$3).a($$0).a(dlx.qH, (yh)yh.c("advancements.adventure.kill_a_mob.title"), (yh)yh.c("advancements.adventure.kill_a_mob.description"), null, ai.a, true, true, false).a(af.a.b).a($$1, "adventure/kill_a_mob");
        mx.a(ab.a.a(), $$2, $$3).a($$4).a(dlx.qM, (yh)yh.c("advancements.adventure.kill_all_mobs.title"), (yh)yh.c("advancements.adventure.kill_all_mobs.description"), null, ai.b, true, true, false).a(ag.a.a(100)).a($$1, "adventure/kill_all_mobs");
        return $$4;
    }

    private static ak<ch.a> a(je<dzq> $$0, dzq $$12) {
        frm.a[] $$2 = (frm.a[])ebb.f.a().stream().map($$1 -> {
            dl.a $$2 = dl.a.a().a(ebb.f, $$1);
            as.a $$3 = as.a.a().a($$0, dzs.hP).a($$2);
            return frk.a(co.a.a().a($$3), new is($$1.g().q()));
        }).toArray(frm.a[]::new);
        return ch.a.a(frl.a($$12), fra.a($$2));
    }

    private static ak<ch.a> b(je<dzq> $$0, dzq $$1) {
        frm.a[] $$22 = (frm.a[])ebb.f.a().stream().map($$2 -> {
            dl.a $$3 = dl.a.a().a(ebb.f, $$2);
            frl.a $$4 = new frl.a(dzs.hP).a($$3);
            frm.a $$5 = frk.a(co.a.a().a(as.a.a().a($$0, $$1)), new is($$2.q()));
            return fqz.a($$4, $$5);
        }).toArray(frm.a[]::new);
        return ch.a.a(fra.a($$22));
    }

    private static ak<ch.a> a(je<dzq> $$0, bef<dzq> $$1) {
        frm.a[] $$22 = (frm.a[])Stream.of(iz.values()).map($$2 -> {
            dl.a $$3 = dl.a.a().a(ebo.b, $$2.o());
            as.a $$4 = as.a.a().a($$0, $$1).a($$3);
            jy $$5 = $$2.q();
            frm.a $$6 = frk.a(co.a.a().a($$4));
            frm.a $$7 = frk.a(co.a.a().a(as.a.a().a($$0, dzs.cQ).a($$3)), new is($$5));
            frm.a $$8 = frk.a(co.a.a().a($$4), new is($$5.o(2)));
            return fqz.a($$6, $$7, $$8);
        }).toArray(frm.a[]::new);
        return ch.a.a(fra.a($$22));
    }

    private static ab.a a(ab.a $$0) {
        $$0.a(af.a.a);
        Set<dlp> $$12 = Set.of(dlx.Am, dlx.Ak, dlx.Al, dlx.Ag, dlx.Ap, dlx.Ai, dlx.Aj, dlx.An);
        ox.b().filter($$1 -> $$12.contains($$1.a())).forEach($$1 -> $$0.a("armor_trimmed_" + String.valueOf($$1.c().a()), da.a.a($$1.c())));
        return $$0;
    }

    private static ab.a b(ab.a $$0) {
        $$0.a(af.a.b);
        ox.b().map(ox.b::c).forEach($$1 -> $$0.a("armor_trimmed_" + String.valueOf($$1.a()), da.a.a($$1)));
        return $$0;
    }

    private static ab.a a(je<dlp> $$0, ab.a $$12) {
        List<Pair> $$2 = List.of(Pair.of((Object)"desert_pyramid", cp.a.a(fnv.bk)), Pair.of((Object)"desert_well", cp.a.a(fnv.bj)), Pair.of((Object)"ocean_ruin_cold", cp.a.a(fnv.bo)), Pair.of((Object)"ocean_ruin_warm", cp.a.a(fnv.bn)), Pair.of((Object)"trail_ruins_rare", cp.a.a(fnv.bm)), Pair.of((Object)"trail_ruins_common", cp.a.a(fnv.bl)));
        $$2.forEach($$1 -> $$12.a((String)$$1.getFirst(), (ak)$$1.getSecond()));
        String $$3 = "has_sherd";
        $$12.a("has_sherd", ce.a.a(cg.a.a().a($$0, bdy.bY)));
        $$12.a(new af(List.of($$2.stream().map(Pair::getFirst).toList(), List.of("has_sherd"))));
        return $$12;
    }

    protected static void a(jf.a $$0, Consumer<ac> $$1, ac $$2, dyc.a $$3) {
        mx.a(ab.a.a(), $$0, $$3.a().toList()).a($$2).a(dlx.rx, (yh)yh.c("advancements.adventure.adventuring_time.title"), (yh)yh.c("advancements.adventure.adventuring_time.description"), null, ai.b, true, true, false).a(ag.a.a(500)).a($$1, "adventure/adventuring_time");
    }

    private static ab.a a(ab.a $$0, je<cgu<?>> $$1, List<cgu<?>> $$22) {
        $$22.forEach($$2 -> $$0.a(mi.g.b((cgu<?>)$$2).toString(), cj.a.a(bs.a.a().a($$1, (cgu<?>)$$2))));
        return $$0;
    }

    protected static ab.a a(ab.a $$0, jf.a $$1, List<amt<dxo>> $$2) {
        jf.b<dxo> $$3 = $$1.e(mj.aS);
        for (amt<dxo> $$4 : $$2) {
            $$0.a($$4.a().toString(), cy.a.a(co.a.a($$3.b($$4))));
        }
        return $$0;
    }

    private static List<cgu<?>> a(List<cgu<?>> $$0, jf<cgu<?>> $$1) {
        Sets.SetView $$6;
        ArrayList<CallSite> $$22 = new ArrayList<CallSite>();
        Set<cgu<?>> $$32 = Set.copyOf($$0);
        Set $$4 = $$32.stream().map(cgu::f).collect(Collectors.toSet());
        Sets.SetView $$5 = Sets.symmetricDifference(f.keySet(), $$4);
        if (!$$5.isEmpty()) {
            $$22.add((CallSite)((Object)("Found EntityType with MobCategory only in either expected exceptions or kill_all_mobs advancement: " + $$5.stream().map(Object::toString).sorted().collect(Collectors.joining(", ")))));
        }
        if (!($$6 = Sets.intersection(f.values().stream().flatMap(Collection::stream).collect(Collectors.toSet()), $$32)).isEmpty()) {
            $$22.add((CallSite)((Object)("Found EntityType in both expected exceptions and kill_all_mobs advancement: " + $$6.stream().map(Object::toString).sorted().collect(Collectors.joining(", ")))));
        }
        Map $$7 = $$1.c().map(jd.c::a).filter(Predicate.not($$32::contains)).collect(Collectors.groupingBy(cgu::f, Collectors.toSet()));
        f.forEach(($$2, $$3) -> {
            Sets.SetView $$4 = Sets.difference($$7.getOrDefault($$2, Set.of()), (Set)$$3);
            if (!$$4.isEmpty()) {
                $$22.add((CallSite)((Object)String.format(Locale.ROOT, "Found (new?) EntityType with MobCategory %s which are in neither expected exceptions nor kill_all_mobs advancement: %s", $$2, $$4.stream().map(Object::toString).sorted().collect(Collectors.joining(", ")))));
            }
        });
        if (!$$22.isEmpty()) {
            $$22.forEach(arg_0 -> ((Logger)a).error(arg_0));
            throw new IllegalStateException("Found inconsistencies with kill_all_mobs advancement");
        }
        return $$0;
    }
}

