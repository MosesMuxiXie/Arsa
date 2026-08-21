/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;
import java.util.function.Consumer;

public class mz
implements mu {
    @Override
    public void a(jf.a $$0, Consumer<ac> $$1) {
        jf.b<cgu<?>> $$2 = $$0.e(mj.F);
        jf.b<dlp> $$3 = $$0.e(mj.R);
        jf.b<dzq> $$4 = $$0.e(mj.i);
        ac $$5 = ab.a.a().a(dzs.lH, (yh)yh.c("advancements.nether.root.title"), (yh)yh.c("advancements.nether.root.description"), amo.b("gui/advancements/backgrounds/nether"), ai.a, false, false, false).a("entered_nether", av.a.a(dwo.i)).a($$1, "nether/root");
        ac $$6 = ab.a.a().a($$5).a(dlx.wi, (yh)yh.c("advancements.nether.return_to_sender.title"), (yh)yh.c("advancements.nether.return_to_sender.description"), null, ai.b, true, true, false).a(ag.a.a(50)).a("killed_ghast", cj.a.a(bs.a.a().a($$2, cgu.ah), bg.a.a().a(dn.a(bdq.j)).a(bs.a.a().a($$2, cgu.ac)))).a($$1, "nether/return_to_sender");
        ac $$7 = ab.a.a().a($$5).a(dzs.gc, (yh)yh.c("advancements.nether.find_fortress.title"), (yh)yh.c("advancements.nether.find_fortress.description"), null, ai.a, true, true, false).a("fortress", cy.a.a(co.a.b($$0.e(mj.bs).b(ffi.o)))).a($$1, "nether/find_fortress");
        ab.a.a().a($$5).a(dlx.wv, (yh)yh.c("advancements.nether.fast_travel.title"), (yh)yh.c("advancements.nether.fast_travel.description"), null, ai.b, true, true, false).a(ag.a.a(100)).a("travelled", bk.a.a(bj.a(cq.b.b(7000.0)))).a($$1, "nether/fast_travel");
        ab.a.a().a($$6).a(dlx.ul, (yh)yh.c("advancements.nether.uneasy_alliance.title"), (yh)yh.c("advancements.nether.uneasy_alliance.description"), null, ai.b, true, true, false).a(ag.a.a(100)).a("killed_ghast", cj.a.a(bs.a.a().a($$2, cgu.ah).a(co.a.a(dwo.h)))).a($$1, "nether/uneasy_alliance");
        ac $$8 = ab.a.a().a($$7).a(dzs.hx, (yh)yh.c("advancements.nether.get_wither_skull.title"), (yh)yh.c("advancements.nether.get_wither_skull.description"), null, ai.a, true, true, false).a("wither_skull", ce.a.a(dzs.hx)).a($$1, "nether/get_wither_skull");
        ac $$9 = ab.a.a().a($$8).a(dlx.wE, (yh)yh.c("advancements.nether.summon_wither.title"), (yh)yh.c("advancements.nether.summon_wither.description"), null, ai.a, true, true, false).a("summoned", dm.a.a(bs.a.a().a($$2, cgu.bR))).a($$1, "nether/summon_wither");
        ac $$10 = ab.a.a().a($$7).a(dlx.uk, (yh)yh.c("advancements.nether.obtain_blaze_rod.title"), (yh)yh.c("advancements.nether.obtain_blaze_rod.description"), null, ai.a, true, true, false).a("blaze_rod", ce.a.a(dlx.uk)).a($$1, "nether/obtain_blaze_rod");
        ac $$11 = ab.a.a().a($$9).a(dzs.gD, (yh)yh.c("advancements.nether.create_beacon.title"), (yh)yh.c("advancements.nether.create_beacon.description"), null, ai.a, true, true, false).a("beacon", ba.a.a(cq.d.b(1))).a($$1, "nether/create_beacon");
        ab.a.a().a($$11).a(dzs.gD, (yh)yh.c("advancements.nether.create_full_beacon.title"), (yh)yh.c("advancements.nether.create_full_beacon.description"), null, ai.c, true, true, false).a("beacon", ba.a.a(cq.d.a(4))).a($$1, "nether/create_full_beacon");
        ac $$12 = ab.a.a().a($$10).a(dlx.up, (yh)yh.c("advancements.nether.brew_potion.title"), (yh)yh.c("advancements.nether.brew_potion.description"), null, ai.a, true, true, false).a("potion", au.a.b()).a($$1, "nether/brew_potion");
        ac $$13 = ab.a.a().a($$12).a(dlx.sq, (yh)yh.c("advancements.nether.all_potions.title"), (yh)yh.c("advancements.nether.all_potions.description"), null, ai.b, true, true, false).a(ag.a.a(100)).a("all_effects", bl.a.a(cr.a.a().a(cfo.a).a(cfo.b).a(cfo.e).a(cfo.h).a(cfo.j).a(cfo.l).a(cfo.m).a(cfo.n).a(cfo.p).a(cfo.r).a(cfo.s).a(cfo.B).a(cfo.k).a(cfo.L).a(cfo.M).a(cfo.J).a(cfo.K))).a($$1, "nether/all_potions");
        ab.a.a().a($$13).a(dlx.sk, (yh)yh.c("advancements.nether.all_effects.title"), (yh)yh.c("advancements.nether.all_effects.description"), null, ai.b, true, true, true).a(ag.a.a(1000)).a("all_effects", bl.a.a(cr.a.a().a(cfo.a).a(cfo.b).a(cfo.e).a(cfo.h).a(cfo.j).a(cfo.l).a(cfo.m).a(cfo.n).a(cfo.p).a(cfo.r).a(cfo.s).a(cfo.t).a(cfo.c).a(cfo.d).a(cfo.y).a(cfo.x).a(cfo.v).a(cfo.q).a(cfo.i).a(cfo.k).a(cfo.B).a(cfo.C).a(cfo.D).a(cfo.o).a(cfo.E).a(cfo.F).a(cfo.G).a(cfo.L).a(cfo.M).a(cfo.J).a(cfo.K).a(cfo.H).a(cfo.I).a(cfo.N))).a($$1, "nether/all_effects");
        ac $$14 = ab.a.a().a($$5).a(dlx.aE, (yh)yh.c("advancements.nether.obtain_ancient_debris.title"), (yh)yh.c("advancements.nether.obtain_ancient_debris.description"), null, ai.a, true, true, false).a("ancient_debris", ce.a.a(dlx.aE)).a($$1, "nether/obtain_ancient_debris");
        ab.a.a().a($$14).a(dlx.rD, (yh)yh.c("advancements.nether.netherite_armor.title"), (yh)yh.c("advancements.nether.netherite_armor.description"), null, ai.b, true, true, false).a(ag.a.a(100)).a("netherite_armor", ce.a.a(dlx.rC, dlx.rD, dlx.rE, dlx.rF)).a($$1, "nether/netherite_armor");
        ac $$15 = ab.a.a().a($$5).a(dlx.zl, (yh)yh.c("advancements.nether.obtain_crying_obsidian.title"), (yh)yh.c("advancements.nether.obtain_crying_obsidian.description"), null, ai.a, true, true, false).a("crying_obsidian", ce.a.a(dlx.zl)).a($$1, "nether/obtain_crying_obsidian");
        ab.a.a().a($$15).a(dlx.zy, (yh)yh.c("advancements.nether.charge_respawn_anchor.title"), (yh)yh.c("advancements.nether.charge_respawn_anchor.description"), null, ai.a, true, true, false).a("charge_respawn_anchor", ch.a.a(co.a.a().a(as.a.a().a($$4, dzs.ql).a(dl.a.a().a(egh.d, 4))), cg.a.a().a($$3, dzs.eH))).a($$1, "nether/charge_respawn_anchor");
        ac $$16 = ab.a.a().a($$5).a(dlx.po, (yh)yh.c("advancements.nether.ride_strider.title"), (yh)yh.c("advancements.nether.ride_strider.description"), null, ai.a, true, true, false).a("used_warped_fungus_on_a_stick", cf.a.a(Optional.of(bs.a(bs.a.a().a(bs.a.a().a($$2, cgu.bB)))), Optional.of(cg.a.a().a($$3, dlx.po).b()), cq.d.c)).a($$1, "nether/ride_strider");
        ab.a.a().a($$16).a(dlx.po, (yh)yh.c("advancements.nether.ride_strider_in_overworld_lava.title"), (yh)yh.c("advancements.nether.ride_strider_in_overworld_lava.description"), null, ai.a, true, true, false).a("ride_entity_distance", bk.a.a(bs.a.a().a(co.a.a(dwo.h)).a(bs.a.a().a($$2, cgu.bB)), bj.a(cq.b.b(50.0)))).a($$1, "nether/ride_strider_in_overworld_lava");
        mx.a(ab.a.a(), $$0, dyc.a.a.a().toList()).a($$16).a(dlx.rF, (yh)yh.c("advancements.nether.explore_nether.title"), (yh)yh.c("advancements.nether.explore_nether.description"), null, ai.b, true, true, false).a(ag.a.a(500)).a($$1, "nether/explore_nether");
        ac $$17 = ab.a.a().a($$5).a(dlx.zu, (yh)yh.c("advancements.nether.find_bastion.title"), (yh)yh.c("advancements.nether.find_bastion.description"), null, ai.a, true, true, false).a("bastion", cy.a.a(co.a.b($$0.e(mj.bs).b(ffi.s)))).a($$1, "nether/find_bastion");
        ab.a.a().a($$17).a(dzs.cS, (yh)yh.c("advancements.nether.loot_bastion.title"), (yh)yh.c("advancements.nether.loot_bastion.description"), null, ai.a, true, true, false).a(af.a.b).a("loot_bastion_other", cp.a.a(fnv.L)).a("loot_bastion_treasure", cp.a.a(fnv.K)).a("loot_bastion_hoglin_stable", cp.a.a(fnv.N)).a("loot_bastion_bridge", cp.a.a(fnv.M)).a($$1, "nether/loot_bastion");
        bc $$18 = bc.a(frp.a(fnz.c.a, bs.a.a().a(bp.a.a().a(cg.a.a().a($$3, bdy.aw)))).invert().build(), frp.a(fnz.c.a, bs.a.a().a(bp.a.a().b(cg.a.a().a($$3, bdy.aw)))).invert().build(), frp.a(fnz.c.a, bs.a.a().a(bp.a.a().c(cg.a.a().a($$3, bdy.aw)))).invert().build(), frp.a(fnz.c.a, bs.a.a().a(bp.a.a().d(cg.a.a().a($$3, bdy.aw)))).invert().build());
        ab.a.a().a($$5).a(af.a.b).a(dlx.qk, (yh)yh.c("advancements.nether.distract_piglin.title"), (yh)yh.c("advancements.nether.distract_piglin.description"), null, ai.a, true, true, false).a("distract_piglin", cu.a.a($$18, Optional.of(cg.a.a().a($$3, bdy.au).b()), Optional.of(bs.a(bs.a.a().a($$2, cgu.aZ).a(bq.a.a().g(false)))))).a("distract_piglin_directly", cw.a.a(Optional.of($$18), cg.a.a().a($$3, dbk.c), Optional.of(bs.a(bs.a.a().a($$2, cgu.aZ).a(bq.a.a().g(false)))))).a($$1, "nether/distract_piglin");
    }
}

