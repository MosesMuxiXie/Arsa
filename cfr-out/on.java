/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.util.Pair
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public abstract class on {
    protected final jf.a a;
    private final je<dlp> c;
    protected final om b;
    private static final Map<mn.b, a> d = ImmutableMap.builder().put((Object)mn.b.a, ($$0, $$1, $$2) -> $$0.e($$1, dqo.a($$2))).put((Object)mn.b.b, ($$0, $$1, $$2) -> $$0.b(ol.a, $$1, dqo.a($$2))).put((Object)mn.b.d, ($$0, $$1, $$2) -> $$0.f(ol.a, $$1, dqo.a($$2))).put((Object)mn.b.e, ($$0, $$1, $$2) -> $$0.a($$1, dqo.a($$2))).put((Object)mn.b.f, ($$0, $$1, $$2) -> $$0.f($$1, dqo.a($$2))).put((Object)mn.b.g, ($$0, $$1, $$2) -> $$0.f($$1, dqo.a($$2))).put((Object)mn.b.h, ($$0, $$1, $$2) -> $$0.g($$1, dqo.a($$2))).put((Object)mn.b.i, ($$0, $$1, $$2) -> $$0.g($$1, dqo.a($$2))).put((Object)mn.b.k, ($$0, $$1, $$2) -> $$0.h($$1, dqo.a($$2))).put((Object)mn.b.l, ($$0, $$1, $$2) -> $$0.a(ol.a, $$1, dqo.a($$2))).put((Object)mn.b.m, ($$0, $$1, $$2) -> $$0.b($$1, dqo.a($$2))).put((Object)mn.b.n, ($$0, $$1, $$2) -> $$0.c(ol.c, $$1, dqo.a($$2))).put((Object)mn.b.o, ($$0, $$1, $$2) -> $$0.e(ol.a, $$1, dqo.a($$2))).put((Object)mn.b.p, ($$0, $$1, $$2) -> $$0.c($$1, dqo.a($$2))).put((Object)mn.b.q, ($$0, $$1, $$2) -> $$0.d(ol.b, $$1, dqo.a($$2))).build();

    protected on(jf.a $$0, om $$1) {
        this.a = $$0;
        this.c = $$0.e(mj.R);
        this.b = $$1;
    }

    protected abstract void a();

    protected void a(dgz $$0) {
        mm.a().filter(mn::d).forEach($$1 -> this.a((mn)$$1, $$0));
    }

    protected void a(dwn $$0, dwn $$1, @Nullable String $$2) {
        this.a($$0, $$1, $$2, 1);
    }

    protected void a(dwn $$0, dwn $$1, @Nullable String $$2, int $$3) {
        this.b(ol.i, $$0, $$3).b($$1).b($$2).b(on.c($$1), this.b($$1)).a(this.b, on.r($$0, $$1));
    }

    protected void a(List<dwn> $$0, ol $$1, dwn $$2, float $$3, int $$4, String $$5) {
        this.a(drc.o, drm::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_smelting");
    }

    protected void b(List<dwn> $$0, ol $$1, dwn $$2, float $$3, int $$4, String $$5) {
        this.a(drc.p, dqb::new, $$0, $$1, $$2, $$3, $$4, $$5, "_from_blasting");
    }

    private <T extends dpy> void a(drc<T> $$0, dpy.a<T> $$1, List<dwn> $$2, ol $$3, dwn $$4, float $$5, int $$6, String $$7, String $$8) {
        for (dwn $$9 : $$2) {
            oq.a(dqo.a($$9), $$3, $$4, $$5, $$6, $$0, $$1).b($$7).b(on.c($$9), this.b($$9)).a(this.b, on.d($$4) + $$8 + "_" + on.d($$9));
        }
    }

    protected void a(dlp $$0, ol $$1, dlp $$2) {
        os.a(dqo.a((dwn)dlx.Ab), dqo.a((dwn)$$0), this.b(bdy.bB), $$1, $$2).a("has_netherite_ingot", this.a(bdy.bB)).a(this.b, on.d($$2) + "_smithing");
    }

    protected void a(dlp $$0, amt<dut> $$1, amt<dqs<?>> $$2) {
        jd.c<dut> $$3 = this.a.e(mj.bA).b($$1);
        ot.a(dqo.a((dwn)$$0), this.b(bdy.bW), this.b(bdy.bX), $$3, ol.i).a("has_smithing_trim_template", this.b($$0)).a(this.b, $$2);
    }

    protected void a(ol $$0, dwn $$1, dwn $$2) {
        this.a($$0, $$1, 1).a(Character.valueOf('#'), $$2).b("##").b("##").b(on.c($$2), this.b($$2)).a(this.b);
    }

    protected void a(ol $$0, dwn $$1, dwn $$2, String $$3) {
        this.b($$0, $$1).a($$2, 9).b($$3, this.b($$2)).a(this.b);
    }

    protected void b(ol $$0, dwn $$1, dwn $$2) {
        this.a($$0, $$1, $$2, on.c($$2));
    }

    protected void a(dwn $$0, bef<dlp> $$1, int $$2) {
        this.b(ol.a, $$0, $$2).a($$1).b("planks").b("has_log", this.a($$1)).a(this.b);
    }

    protected void b(dwn $$0, bef<dlp> $$1, int $$2) {
        this.b(ol.a, $$0, $$2).a($$1).b("planks").b("has_logs", this.a($$1)).a(this.b);
    }

    protected void a(dwn $$0, dwn $$1) {
        this.a(ol.a, $$0, 3).a(Character.valueOf('#'), $$1).b("##").b("##").c("bark").b("has_log", this.b($$1)).a(this.b);
    }

    protected void b(dwn $$0, dwn $$1) {
        this.a(ol.d, $$0).a(Character.valueOf('#'), $$1).b("# #").b("###").c("boat").b("in_water", on.a(dzs.J)).a(this.b);
    }

    protected void c(dwn $$0, dwn $$1) {
        this.b(ol.d, $$0).b(dzs.cS).b($$1).b("chest_boat").b("has_boat", this.a(bdy.bm)).a(this.b);
    }

    private ok e(dwn $$0, dqo $$1) {
        return this.b(ol.c, $$0).a($$1);
    }

    protected ok a(dwn $$0, dqo $$1) {
        return this.a(ol.c, $$0, 3).a(Character.valueOf('#'), $$1).b("##").b("##").b("##");
    }

    private ok f(dwn $$0, dqo $$1) {
        int $$2 = $$0 == dzs.gd ? 6 : 3;
        dlp $$3 = $$0 == dzs.gd ? dlx.wJ : dlx.qW;
        return this.a(ol.b, $$0, $$2).a(Character.valueOf('W'), $$1).a(Character.valueOf('#'), $$3).b("W#W").b("W#W");
    }

    private ok g(dwn $$0, dqo $$1) {
        return this.a(ol.c, $$0).a(Character.valueOf('#'), dlx.qW).a(Character.valueOf('W'), $$1).b("#W#").b("#W#");
    }

    protected void d(dwn $$0, dwn $$1) {
        this.c(ol.c, $$0, dqo.a($$1)).a(on.c($$1), this.b($$1)).a(this.b);
    }

    private ok c(ol $$0, dwn $$1, dqo $$2) {
        return this.a($$0, $$1).a(Character.valueOf('#'), $$2).b("##");
    }

    protected void c(ol $$0, dwn $$1, dwn $$2) {
        this.a($$0, $$1, dqo.a($$2)).a(on.c($$2), this.b($$2)).a(this.b);
    }

    protected void e(dwn $$0, dwn $$1) {
        this.a(ol.b, $$0, 6).a(Character.valueOf('#'), $$1).b("###").b("   ").b("###").c("shelf").b(on.c($$1), this.b($$1)).a(this.b);
    }

    protected ok a(ol $$0, dwn $$1, dqo $$2) {
        return this.a($$0, $$1, 6).a(Character.valueOf('#'), $$2).b("###");
    }

    protected ok b(dwn $$0, dqo $$1) {
        return this.a(ol.a, $$0, 4).a(Character.valueOf('#'), $$1).b("#  ").b("## ").b("###");
    }

    protected ok c(dwn $$0, dqo $$1) {
        return this.a(ol.c, $$0, 2).a(Character.valueOf('#'), $$1).b("###").b("###");
    }

    private ok h(dwn $$0, dqo $$1) {
        return this.a(ol.b, $$0, 3).c("sign").a(Character.valueOf('#'), $$1).a(Character.valueOf('X'), dlx.qW).b("###").b("###").b(" X ");
    }

    protected void f(dwn $$0, dwn $$1) {
        this.a(ol.b, $$0, 6).c("hanging_sign").a(Character.valueOf('#'), $$1).a(Character.valueOf('X'), dlx.gC).b("X X").b("###").b("###").b("has_stripped_logs", this.b($$1)).a(this.b);
    }

    protected void a(List<dlp> $$0, List<dlp> $$1, String $$2, ol $$3) {
        this.a($$0, $$1, null, $$2, $$3);
    }

    protected void a(List<dlp> $$0, List<dlp> $$12, @Nullable dlp $$2, String $$3, ol $$4) {
        for (int $$5 = 0; $$5 < $$0.size(); ++$$5) {
            dlp $$6 = $$0.get($$5);
            dlp $$7 = $$12.get($$5);
            Stream<dlp> $$8 = $$12.stream().filter($$1 -> !$$1.equals($$7));
            if ($$2 != null) {
                $$8 = Stream.concat($$8, Stream.of($$2));
            }
            this.b($$4, (dwn)$$7).b($$6).a(dqo.a($$8)).b($$3).b("has_needed_dye", this.b($$6)).a(this.b, "dye_" + on.d($$7));
        }
    }

    protected void g(dwn $$0, dwn $$1) {
        this.a(ol.b, $$0, 3).a(Character.valueOf('#'), $$1).b("##").c("carpet").b(on.c($$1), this.b($$1)).a(this.b);
    }

    protected void h(dwn $$0, dwn $$1) {
        this.a(ol.b, $$0).a(Character.valueOf('#'), $$1).a(Character.valueOf('X'), bdy.b).b("###").b("XXX").c("bed").b(on.c($$1), this.b($$1)).a(this.b);
    }

    protected void i(dwn $$0, dwn $$1) {
        this.a(ol.b, $$0).a(Character.valueOf('#'), $$1).a(Character.valueOf('|'), dlx.qW).b("###").b("###").b(" | ").c("banner").b(on.c($$1), this.b($$1)).a(this.b);
    }

    protected void j(dwn $$0, dwn $$1) {
        this.a(ol.a, $$0, 8).a(Character.valueOf('#'), dzs.aX).a(Character.valueOf('X'), $$1).b("###").b("#X#").b("###").c("stained_glass").b("has_glass", this.b(dzs.aX)).a(this.b);
    }

    protected void a(dwn $$0) {
        this.a(ol.a, $$0, 1).a(Character.valueOf('#'), dlx.ul).a(Character.valueOf('X'), dlx.fW).b("###").b("#X#").b("###").c("dry_ghast").b(on.c(dlx.ul), this.b(dlx.ul)).a(this.b);
    }

    protected void k(dwn $$0, dwn $$1) {
        this.a(ol.f, $$0).a(Character.valueOf('#'), $$1).a(Character.valueOf('G'), dlx.cN).a(Character.valueOf('L'), dlx.sp).b("LLL").b("G#G").c("harness").b("has_dried_ghast", this.b(dzs.nd)).a(this.b);
    }

    protected void l(dwn $$0, dwn $$1) {
        this.a(ol.b, $$0, 16).a(Character.valueOf('#'), $$1).b("###").b("###").c("stained_glass_pane").b("has_glass", this.b($$1)).a(this.b);
    }

    protected void m(dwn $$0, dwn $$1) {
        this.a(ol.b, $$0, 8).a(Character.valueOf('#'), dzs.fG).a(Character.valueOf('$'), $$1).b("###").b("#$#").b("###").c("stained_glass_pane").b("has_glass_pane", this.b(dzs.fG)).b(on.c($$1), this.b($$1)).a(this.b, on.r($$0, dzs.fG));
    }

    protected void n(dwn $$0, dwn $$1) {
        this.a(ol.a, $$0, 8).a(Character.valueOf('#'), dzs.js).a(Character.valueOf('X'), $$1).b("###").b("#X#").b("###").c("stained_terracotta").b("has_terracotta", this.b(dzs.js)).a(this.b);
    }

    protected void o(dwn $$0, dwn $$1) {
        this.b(ol.a, $$0, 8).b($$1).a(dzs.L, 4).a(dzs.O, 4).b("concrete_powder").b("has_sand", this.b(dzs.L)).b("has_gravel", this.b(dzs.O)).a(this.b);
    }

    protected void p(dwn $$0, dwn $$1) {
        this.b(ol.b, $$0).b(dzs.qL).b($$1).b("dyed_candle").b(on.c($$1), this.b($$1)).a(this.b);
    }

    protected void d(ol $$0, dwn $$1, dwn $$2) {
        this.d($$0, $$1, dqo.a($$2)).a(on.c($$2), this.b($$2)).a(this.b);
    }

    private ok d(ol $$0, dwn $$1, dqo $$2) {
        return this.a($$0, $$1, 6).a(Character.valueOf('#'), $$2).b("###").b("###");
    }

    protected void e(ol $$0, dwn $$1, dwn $$2) {
        this.e($$0, $$1, dqo.a($$2)).a(on.c($$2), this.b($$2)).a(this.b);
    }

    private ok e(ol $$0, dwn $$1, dqo $$2) {
        return this.a($$0, $$1, 4).a(Character.valueOf('S'), $$2).b("SS").b("SS");
    }

    protected void f(ol $$0, dwn $$1, dwn $$2) {
        this.f($$0, $$1, dqo.a($$2)).b(on.c($$2), this.b($$2)).a(this.b);
    }

    private oo f(ol $$0, dwn $$1, dqo $$2) {
        return this.a($$0, $$1, 4).a(Character.valueOf('#'), $$2).b("##").b("##");
    }

    protected void g(ol $$0, dwn $$1, dwn $$2) {
        this.b($$0, $$1, dqo.a($$2)).b(on.c($$2), this.b($$2)).a(this.b);
    }

    protected void h(ol $$0, dwn $$1, dwn $$2) {
        this.a($$0, $$1).a(Character.valueOf('#'), $$2).b("#").b("#").b(on.c($$2), this.b($$2)).a(this.b);
    }

    protected oo b(ol $$0, dwn $$1, dqo $$2) {
        return this.a($$0, $$1).a(Character.valueOf('#'), $$2).b("#").b("#");
    }

    protected void i(ol $$0, dwn $$1, dwn $$2) {
        this.a($$0, $$1, $$2, 1);
    }

    protected void a(ol $$0, dwn $$1, dwn $$2, int $$3) {
        or.a(dqo.a($$2), $$0, $$1, $$3).b(on.c($$2), this.b($$2)).a(this.b, on.r($$1, $$2) + "_stonecutting");
    }

    private void s(dwn $$0, dwn $$1) {
        oq.c(dqo.a($$1), ol.a, $$0, 0.1f, 200).b(on.c($$1), this.b($$1)).a(this.b);
    }

    protected void a(ol $$0, dwn $$1, ol $$2, dwn $$3) {
        this.a($$0, $$1, $$2, $$3, on.e($$3), null, on.e($$1), null);
    }

    protected void a(ol $$0, dwn $$1, ol $$2, dwn $$3, String $$4, String $$5) {
        this.a($$0, $$1, $$2, $$3, $$4, $$5, on.e($$1), null);
    }

    protected void b(ol $$0, dwn $$1, ol $$2, dwn $$3, String $$4, String $$5) {
        this.a($$0, $$1, $$2, $$3, on.e($$3), null, $$4, $$5);
    }

    private void a(ol $$0, dwn $$1, ol $$2, dwn $$3, String $$4, @Nullable String $$5, String $$6, @Nullable String $$7) {
        this.b($$0, $$1, 9).b($$3).b($$7).b(on.c($$3), this.b($$3)).a(this.b, amt.a(mj.bK, amo.a($$6)));
        this.a($$2, $$3).a(Character.valueOf('#'), $$1).b("###").b("###").b("###").c($$5).b(on.c($$1), this.b($$1)).a(this.b, amt.a(mj.bK, amo.a($$4)));
    }

    protected void q(dwn $$0, dwn $$1) {
        this.a(ol.i, $$0, 2).a(Character.valueOf('#'), dlx.qa).a(Character.valueOf('C'), $$1).a(Character.valueOf('S'), $$0).b("#S#").b("#C#").b("###").b(on.c($$0), this.b($$0)).a(this.b);
    }

    protected void d(dwn $$0, dqo $$1) {
        this.a(ol.i, $$0, 2).a(Character.valueOf('#'), dlx.qa).a(Character.valueOf('C'), $$1).a(Character.valueOf('S'), $$0).b("#S#").b("#C#").b("###").b(on.c($$0), this.b($$0)).a(this.b);
    }

    protected <T extends dpy> void a(String $$0, drc<T> $$1, dpy.a<T> $$2, int $$3) {
        this.a($$0, $$1, $$2, $$3, dlx.ue, dlx.uf, 0.35f);
        this.a($$0, $$1, $$2, $$3, dlx.ug, dlx.uh, 0.35f);
        this.a($$0, $$1, $$2, $$3, dlx.td, dlx.th, 0.35f);
        this.a($$0, $$1, $$2, $$3, dlx.dX, dlx.ub, 0.1f);
        this.a($$0, $$1, $$2, $$3, dlx.te, dlx.ti, 0.35f);
        this.a($$0, $$1, $$2, $$3, dlx.xc, dlx.xd, 0.35f);
        this.a($$0, $$1, $$2, $$3, dlx.rH, dlx.rI, 0.35f);
        this.a($$0, $$1, $$2, $$3, dlx.ws, dlx.wt, 0.35f);
        this.a($$0, $$1, $$2, $$3, dlx.wN, dlx.wO, 0.35f);
    }

    private <T extends dpy> void a(String $$0, drc<T> $$1, dpy.a<T> $$2, int $$3, dwn $$4, dwn $$5, float $$6) {
        oq.a(dqo.a($$4), ol.g, $$5, $$6, $$3, $$1, $$2).b(on.c($$4), this.b($$4)).a(this.b, on.d($$5) + "_from_" + $$0);
    }

    protected void b(dgz $$0) {
        dlk.a.get().forEach(($$1, $$2) -> {
            if (!$$2.k().a($$0)) {
                return;
            }
            Pair $$3 = (Pair)dlk.c.getOrDefault($$2, (Object)Pair.of((Object)((Object)ol.a), (Object)on.d($$2)));
            ol $$4 = (ol)((Object)((Object)$$3.getFirst()));
            String $$5 = (String)$$3.getSecond();
            this.b($$4, (dwn)$$2).b((dwn)$$1).b(dlx.zf).b($$5).b(on.c($$1), this.b((dwn)$$1)).a(this.b, on.r($$2, dlx.zf));
        });
    }

    protected void a(dzq $$0, dzq $$1) {
        this.a(ol.a, (dwn)$$0, 4).a(Character.valueOf('M'), $$1).b(" M ").b("M M").b(" M ").c(on.d($$0)).b(on.c($$1), this.b($$1)).a(this.b);
    }

    protected void b(dzq $$0, dzq $$1) {
        this.a(ol.c, (dwn)$$0, 4).a(Character.valueOf('C'), $$1).a(Character.valueOf('R'), dlx.mB).a(Character.valueOf('B'), dlx.uk).b(" C ").b("CBC").b(" R ").b(on.c($$1), this.b($$1)).c(on.d($$0)).a(this.b);
    }

    protected void c(dzq $$0, dzq $$1) {
        this.a(ol.a, (dwn)$$0).a(Character.valueOf('M'), $$1).b(" M ").b(" M ").c(on.d($$0)).b(on.c($$1), this.b($$1)).a(this.b);
    }

    protected void a(dlp $$0, eih $$1) {
        dlt $$2 = new dlt(dlx.yA.e(), 1, kg.a().a(ki.aa, $$1.c()).a());
        this.a(ol.g, $$2).b(dlx.pU).b(dlx.dN).b(dlx.dO).b($$0).b("suspicious_stew").b(on.c($$0), this.b($$0)).a(this.b, on.d($$2.h()) + "_from_" + on.d($$0));
    }

    protected void a(mn $$0, dgz $$1) {
        $$0.b().forEach(($$22, $$3) -> {
            if (!$$3.k().a($$1)) {
                return;
            }
            a $$4 = d.get($$22);
            dzq $$5 = this.a($$0, (mn.b)((Object)$$22));
            if ($$4 != null) {
                ok $$6 = $$4.create(this, (dwn)$$3, $$5);
                $$0.e().ifPresent($$2 -> $$6.a($$2 + (String)($$22 == mn.b.d ? "" : "_" + $$22.a())));
                $$6.a($$0.f().orElseGet(() -> on.c($$5)), this.b($$5));
                $$6.a(this.b);
            }
            if ($$22 == mn.b.c) {
                this.s((dwn)$$3, $$5);
            }
        });
    }

    private dzq a(mn $$0, mn.b $$1) {
        if ($$1 == mn.b.b) {
            if (!$$0.b().containsKey((Object)mn.b.l)) {
                throw new IllegalStateException("Slab is not defined for the family.");
            }
            return $$0.a(mn.b.l);
        }
        return $$0.a();
    }

    private static ak<bo.a> a(dzq $$0) {
        return aj.e.a(new bo.a(Optional.empty(), Optional.of($$0.p()), Optional.empty()));
    }

    private ak<ce.a> a(cq.d $$0, dwn $$1) {
        return on.a(cg.a.a().a(this.c, $$1).a($$0));
    }

    protected ak<ce.a> b(dwn $$0) {
        return on.a(cg.a.a().a(this.c, $$0));
    }

    protected ak<ce.a> a(bef<dlp> $$0) {
        return on.a(cg.a.a().a(this.c, $$0));
    }

    private static ak<ce.a> a(cg.a ... $$0) {
        return on.a((cg[])Arrays.stream($$0).map(cg.a::b).toArray(cg[]::new));
    }

    private static ak<ce.a> a(cg ... $$0) {
        return aj.f.a(new ce.a(Optional.empty(), ce.a.a.b, List.of($$0)));
    }

    protected static String c(dwn $$0) {
        return "has_" + on.d($$0);
    }

    protected static String d(dwn $$0) {
        return mi.h.b($$0.h()).a();
    }

    protected static String e(dwn $$0) {
        return on.d($$0);
    }

    protected static String r(dwn $$0, dwn $$1) {
        return on.d($$0) + "_from_" + on.d($$1);
    }

    protected static String f(dwn $$0) {
        return on.d($$0) + "_from_smelting";
    }

    protected static String g(dwn $$0) {
        return on.d($$0) + "_from_blasting";
    }

    protected dqo b(bef<dlp> $$0) {
        return dqo.a(this.c.b($$0));
    }

    protected oo a(ol $$0, dwn $$1) {
        return oo.a(this.c, $$0, $$1);
    }

    protected oo a(ol $$0, dwn $$1, int $$2) {
        return oo.a(this.c, $$0, $$1, $$2);
    }

    protected op a(ol $$0, dlt $$1) {
        return op.a(this.c, $$0, $$1);
    }

    protected op b(ol $$0, dwn $$1) {
        return op.a(this.c, $$0, $$1);
    }

    protected op b(ol $$0, dwn $$1, int $$2) {
        return op.a(this.c, $$0, $$1, $$2);
    }

    @FunctionalInterface
    static interface a {
        public ok create(on var1, dwn var2, dwn var3);
    }

    protected static abstract class b
    implements mq {
        private final ms d;
        private final CompletableFuture<jf.a> e;

        protected b(ms $$0, CompletableFuture<jf.a> $$1) {
            this.d = $$0;
            this.e = $$1;
        }

        @Override
        public final CompletableFuture<?> a(final mo $$0) {
            return this.e.thenCompose($$1 -> {
                ms.a $$2 = this.d.a(mj.bK);
                ms.a $$3 = this.d.a(mj.bJ);
                final HashSet $$4 = Sets.newHashSet();
                final ArrayList $$5 = new ArrayList();
                om $$6 = new om(){
                    final /* synthetic */ jf.a d;
                    final /* synthetic */ ms.a e;
                    final /* synthetic */ ms.a f;
                    {
                        this.d = a2;
                        this.e = a3;
                        this.f = a4;
                    }

                    @Override
                    public void a(amt<dqs<?>> $$02, dqs<?> $$1, @Nullable ac $$2) {
                        if (!$$4.add($$02)) {
                            throw new IllegalStateException("Duplicate recipe " + String.valueOf($$02.a()));
                        }
                        this.a($$02, $$1);
                        if ($$2 != null) {
                            this.a($$2);
                        }
                    }

                    @Override
                    public ab.a a() {
                        return ab.a.b().a(ok.a);
                    }

                    @Override
                    public void b() {
                        ac $$02 = ab.a.b().a("impossible", aj.b.a(new cc.a())).b(ok.a);
                        this.a($$02);
                    }

                    private void a(amt<dqs<?>> $$02, dqs<?> $$1) {
                        $$5.add(mq.a($$0, this.d, dqs.a, $$1, this.e.a($$02.a())));
                    }

                    private void a(ac $$02) {
                        $$5.add(mq.a($$0, this.d, ab.a, $$02.b(), this.f.a($$02.a())));
                    }
                };
                this.a((jf.a)$$1, $$6).a();
                return CompletableFuture.allOf((CompletableFuture[])$$5.toArray(CompletableFuture[]::new));
            });
        }

        protected abstract on a(jf.a var1, om var2);
    }
}

