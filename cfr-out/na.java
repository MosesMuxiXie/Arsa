/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;

public class na
implements mu {
    @Override
    public void a(jf.a $$0, Consumer<ac> $$1) {
        jf.b<dlp> $$2 = $$0.e(mj.R);
        ac $$3 = ab.a.a().a(dzs.i, (yh)yh.c("advancements.story.root.title"), (yh)yh.c("advancements.story.root.description"), amo.b("gui/advancements/backgrounds/stone"), ai.a, false, false, false).a("crafting_table", ce.a.a(dzs.cX)).a($$1, "story/root");
        ac $$4 = ab.a.a().a($$3).a(dlx.qp, (yh)yh.c("advancements.story.mine_stone.title"), (yh)yh.c("advancements.story.mine_stone.description"), null, ai.a, true, true, false).a("get_stone", ce.a.a(cg.a.a().a($$2, bdy.bw))).a($$1, "story/mine_stone");
        ac $$5 = ab.a.a().a($$4).a(dlx.qz, (yh)yh.c("advancements.story.upgrade_tools.title"), (yh)yh.c("advancements.story.upgrade_tools.description"), null, ai.a, true, true, false).a("stone_pickaxe", ce.a.a(dlx.qz)).a($$1, "story/upgrade_tools");
        ac $$6 = ab.a.a().a($$5).a(dlx.qg, (yh)yh.c("advancements.story.smelt_iron.title"), (yh)yh.c("advancements.story.smelt_iron.description"), null, ai.a, true, true, false).a("iron", ce.a.a(dlx.qg)).a($$1, "story/smelt_iron");
        ac $$7 = ab.a.a().a($$6).a(dlx.qJ, (yh)yh.c("advancements.story.iron_tools.title"), (yh)yh.c("advancements.story.iron_tools.description"), null, ai.a, true, true, false).a("iron_pickaxe", ce.a.a(dlx.qJ)).a($$1, "story/iron_tools");
        ac $$8 = ab.a.a().a($$7).a(dlx.qa, (yh)yh.c("advancements.story.mine_diamond.title"), (yh)yh.c("advancements.story.mine_diamond.description"), null, ai.a, true, true, false).a("diamond", ce.a.a(dlx.qa)).a($$1, "story/mine_diamond");
        ac $$9 = ab.a.a().a($$6).a(dlx.sm, (yh)yh.c("advancements.story.lava_bucket.title"), (yh)yh.c("advancements.story.lava_bucket.description"), null, ai.a, true, true, false).a("lava_bucket", ce.a.a(dlx.sm)).a($$1, "story/lava_bucket");
        ac $$10 = ab.a.a().a($$6).a(dlx.rr, (yh)yh.c("advancements.story.obtain_armor.title"), (yh)yh.c("advancements.story.obtain_armor.description"), null, ai.a, true, true, false).a(af.a.b).a("iron_helmet", ce.a.a(dlx.rq)).a("iron_chestplate", ce.a.a(dlx.rr)).a("iron_leggings", ce.a.a(dlx.rs)).a("iron_boots", ce.a.a(dlx.rt)).a($$1, "story/obtain_armor");
        ab.a.a().a($$8).a(dlx.wI, (yh)yh.c("advancements.story.enchant_item.title"), (yh)yh.c("advancements.story.enchant_item.description"), null, ai.a, true, true, false).a("enchanted_item", bm.a.b()).a($$1, "story/enchant_item");
        ac $$11 = ab.a.a().a($$9).a(dzs.cK, (yh)yh.c("advancements.story.form_obsidian.title"), (yh)yh.c("advancements.story.form_obsidian.description"), null, ai.a, true, true, false).a("obsidian", ce.a.a(dzs.cK)).a($$1, "story/form_obsidian");
        ab.a.a().a($$10).a(dlx.xH, (yh)yh.c("advancements.story.deflect_arrow.title"), (yh)yh.c("advancements.story.deflect_arrow.description"), null, ai.a, true, true, false).a("deflected_projectile", br.a.a(bf.a.a().a(bg.a.a().a(dn.a(bdq.j))).a(true))).a($$1, "story/deflect_arrow");
        ab.a.a().a($$8).a(dlx.rv, (yh)yh.c("advancements.story.shiny_gear.title"), (yh)yh.c("advancements.story.shiny_gear.description"), null, ai.a, true, true, false).a(af.a.b).a("diamond_helmet", ce.a.a(dlx.ru)).a("diamond_chestplate", ce.a.a(dlx.rv)).a("diamond_leggings", ce.a.a(dlx.rw)).a("diamond_boots", ce.a.a(dlx.rx)).a($$1, "story/shiny_gear");
        ac $$12 = ab.a.a().a($$11).a(dlx.pT, (yh)yh.c("advancements.story.enter_the_nether.title"), (yh)yh.c("advancements.story.enter_the_nether.description"), null, ai.a, true, true, false).a("entered_nether", av.a.a(dwo.i)).a($$1, "story/enter_the_nether");
        ab.a.a().a($$12).a(dlx.rK, (yh)yh.c("advancements.story.cure_zombie_villager.title"), (yh)yh.c("advancements.story.cure_zombie_villager.description"), null, ai.c, true, true, false).a("cured_zombie", be.a.b()).a($$1, "story/cure_zombie_villager");
        ac $$13 = ab.a.a().a($$12).a(dlx.uw, (yh)yh.c("advancements.story.follow_ender_eye.title"), (yh)yh.c("advancements.story.follow_ender_eye.description"), null, ai.a, true, true, false).a("in_stronghold", cy.a.a(co.a.b($$0.e(mj.bs).b(ffi.k)))).a($$1, "story/follow_ender_eye");
        ab.a.a().a($$13).a(dzs.go, (yh)yh.c("advancements.story.enter_the_end.title"), (yh)yh.c("advancements.story.enter_the_end.description"), null, ai.a, true, true, false).a("entered_end", av.a.a(dwo.j)).a($$1, "story/enter_the_end");
    }
}

