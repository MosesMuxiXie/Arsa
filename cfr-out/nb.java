/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;

public class nb
implements mu {
    @Override
    public void a(jf.a $$0, Consumer<ac> $$1) {
        jf.b<cgu<?>> $$2 = $$0.e(mj.F);
        ac $$3 = ab.a.a().a(dzs.go, (yh)yh.c("advancements.end.root.title"), (yh)yh.c("advancements.end.root.description"), amo.b("gui/advancements/backgrounds/end"), ai.a, false, false, false).a("entered_end", av.a.a(dwo.j)).a($$1, "end/root");
        ac $$4 = ab.a.a().a($$3).a(dzs.hF, (yh)yh.c("advancements.end.kill_dragon.title"), (yh)yh.c("advancements.end.kill_dragon.description"), null, ai.a, true, true, false).a("killed_dragon", cj.a.a(bs.a.a().a($$2, cgu.T))).a($$1, "end/kill_dragon");
        ac $$5 = ab.a.a().a($$4).a(dlx.uj, (yh)yh.c("advancements.end.enter_end_gateway.title"), (yh)yh.c("advancements.end.enter_end_gateway.description"), null, ai.a, true, true, false).a("entered_end_gateway", bo.a.a(dzs.lB)).a($$1, "end/enter_end_gateway");
        ab.a.a().a($$4).a(dlx.xu, (yh)yh.c("advancements.end.respawn_dragon.title"), (yh)yh.c("advancements.end.respawn_dragon.description"), null, ai.c, true, true, false).a("summoned_dragon", dm.a.a(bs.a.a().a($$2, cgu.T))).a($$1, "end/respawn_dragon");
        ac $$6 = ab.a.a().a($$5).a(dzs.ls, (yh)yh.c("advancements.end.find_end_city.title"), (yh)yh.c("advancements.end.find_end_city.description"), null, ai.a, true, true, false).a("in_city", cy.a.a(co.a.b($$0.e(mj.bs).b(ffi.q)))).a($$1, "end/find_end_city");
        ab.a.a().a($$4).a(dlx.xC, (yh)yh.c("advancements.end.dragon_breath.title"), (yh)yh.c("advancements.end.dragon_breath.description"), null, ai.c, true, true, false).a("dragon_breath", ce.a.a(dlx.xC)).a($$1, "end/dragon_breath");
        ab.a.a().a($$6).a(dlx.xQ, (yh)yh.c("advancements.end.levitate.title"), (yh)yh.c("advancements.end.levitate.description"), null, ai.b, true, true, false).a(ag.a.a(50)).a("levitated", ck.a.a(bj.b(cq.b.b(50.0)))).a($$1, "end/levitate");
        ab.a.a().a($$6).a(dlx.pq, (yh)yh.c("advancements.end.elytra.title"), (yh)yh.c("advancements.end.elytra.description"), null, ai.c, true, true, false).a("elytra", ce.a.a(dlx.pq)).a($$1, "end/elytra");
        ab.a.a().a($$4).a(dzs.gp, (yh)yh.c("advancements.end.dragon_egg.title"), (yh)yh.c("advancements.end.dragon_egg.description"), null, ai.c, true, true, false).a("dragon_egg", ce.a.a(dzs.gp)).a($$1, "end/dragon_egg");
    }
}

