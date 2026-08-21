/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  org.apache.commons.lang3.tuple.Pair
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.apache.commons.lang3.tuple.Pair;
import org.jspecify.annotations.Nullable;

public class ddb {
    private static final int d = 12;
    private static final int e = 16;
    private static final int f = 3;
    private static final int g = 1;
    private static final int h = 2;
    private static final int i = 5;
    private static final int j = 10;
    private static final int k = 10;
    private static final int l = 20;
    private static final int m = 15;
    private static final int n = 30;
    private static final int o = 30;
    private static final float p = 0.05f;
    private static final float q = 0.2f;
    public static final Map<amt<dda>, Int2ObjectMap<g[]>> a = bhs.a(Maps.newHashMap(), (? super T $$0) -> {
        $$0.put(dda.g, ddb.a((ImmutableMap<Integer, g[]>)ImmutableMap.of((Object)1, (Object)new g[]{new b(dlx.rc, 20, 16, 2), new b(dlx.ws, 26, 16, 2), new b(dlx.wr, 22, 16, 2), new b(dlx.xz, 15, 16, 2), new i(dlx.rd, 1, 6, 16, 1)}, (Object)2, (Object)new g[]{new b(dzs.fH, 6, 12, 10), new i(dlx.wF, 1, 4, 5), new i(dlx.pV, 1, 4, 16, 5)}, (Object)3, (Object)new g[]{new i(dlx.tW, 3, 18, 10), new b(dzs.fI, 4, 12, 20)}, (Object)4, (Object)new g[]{new i(dzs.eL, 1, 1, 12, 15), new j(cfo.p, 100, 15), new j(cfo.h, 160, 15), new j(cfo.r, 140, 15), new j(cfo.o, 120, 15), new j(cfo.s, 280, 15), new j(cfo.w, 7, 15)}, (Object)5, (Object)new g[]{new i(dlx.ww, 3, 3, 30), new i(dlx.ux, 4, 3, 30)})));
        $$0.put(dda.h, ddb.a((ImmutableMap<Integer, g[]>)ImmutableMap.of((Object)1, (Object)new g[]{new b(dlx.qY, 20, 16, 2), new b(dlx.pY, 10, 16, 2), new h((dwn)dlx.td, 6, 1, dlx.th, 6, 16, 1, 0.05f), new i(dlx.st, 3, 1, 16, 1)}, (Object)2, (Object)new g[]{new b(dlx.td, 15, 16, 10), new h((dwn)dlx.te, 6, 1, dlx.ti, 6, 16, 5, 0.05f), new i(dlx.zc, 2, 1, 5)}, (Object)3, (Object)new g[]{new b(dlx.te, 13, 16, 20), new e(dlx.sZ, 3, 3, 10, 0.2f)}, (Object)4, (Object)new g[]{new b(dlx.tf, 6, 12, 30)}, (Object)5, (Object)new g[]{new b(dlx.tg, 4, 12, 30), new c(1, 12, 30, (Map<amt<ddc>, dlp>)ImmutableMap.builder().put(ddc.c, (Object)dlx.pr).put(ddc.g, (Object)dlx.pt).put(ddc.e, (Object)dlx.pt).put(ddc.a, (Object)dlx.px).put(ddc.b, (Object)dlx.px).put(ddc.d, (Object)dlx.pz).put(ddc.f, (Object)dlx.pD).build())})));
        $$0.put(dda.n, ddb.a((ImmutableMap<Integer, g[]>)ImmutableMap.of((Object)1, (Object)new g[]{new b(dzs.bK, 18, 16, 2), new b(dzs.bW, 18, 16, 2), new b(dzs.bZ, 18, 16, 2), new b(dzs.bR, 18, 16, 2), new i(dlx.tZ, 2, 1, 1)}, (Object)2, (Object)new g[]{new b(dlx.tm, 12, 16, 10), new b(dlx.tt, 12, 16, 10), new b(dlx.tB, 12, 16, 10), new b(dlx.tp, 12, 16, 10), new b(dlx.tr, 12, 16, 10), new i(dzs.bK, 1, 1, 16, 5), new i(dzs.bL, 1, 1, 16, 5), new i(dzs.bM, 1, 1, 16, 5), new i(dzs.bN, 1, 1, 16, 5), new i(dzs.bO, 1, 1, 16, 5), new i(dzs.bP, 1, 1, 16, 5), new i(dzs.bQ, 1, 1, 16, 5), new i(dzs.bR, 1, 1, 16, 5), new i(dzs.bS, 1, 1, 16, 5), new i(dzs.bT, 1, 1, 16, 5), new i(dzs.bU, 1, 1, 16, 5), new i(dzs.bV, 1, 1, 16, 5), new i(dzs.bW, 1, 1, 16, 5), new i(dzs.bX, 1, 1, 16, 5), new i(dzs.bY, 1, 1, 16, 5), new i(dzs.bZ, 1, 1, 16, 5), new i(dzs.jc, 1, 4, 16, 5), new i(dzs.jd, 1, 4, 16, 5), new i(dzs.je, 1, 4, 16, 5), new i(dzs.jf, 1, 4, 16, 5), new i(dzs.jg, 1, 4, 16, 5), new i(dzs.jh, 1, 4, 16, 5), new i(dzs.ji, 1, 4, 16, 5), new i(dzs.jj, 1, 4, 16, 5), new i(dzs.jk, 1, 4, 16, 5), new i(dzs.jl, 1, 4, 16, 5), new i(dzs.jm, 1, 4, 16, 5), new i(dzs.jn, 1, 4, 16, 5), new i(dzs.jo, 1, 4, 16, 5), new i(dzs.jp, 1, 4, 16, 5), new i(dzs.jq, 1, 4, 16, 5), new i(dzs.jr, 1, 4, 16, 5)}, (Object)3, (Object)new g[]{new b(dlx.tq, 12, 16, 20), new b(dlx.tu, 12, 16, 20), new b(dlx.tn, 12, 16, 20), new b(dlx.tA, 12, 16, 20), new b(dlx.ts, 12, 16, 20), new i(dzs.bg, 3, 1, 12, 10), new i(dzs.bk, 3, 1, 12, 10), new i(dzs.bu, 3, 1, 12, 10), new i(dzs.bv, 3, 1, 12, 10), new i(dzs.br, 3, 1, 12, 10), new i(dzs.bs, 3, 1, 12, 10), new i(dzs.bp, 3, 1, 12, 10), new i(dzs.bn, 3, 1, 12, 10), new i(dzs.bt, 3, 1, 12, 10), new i(dzs.bj, 3, 1, 12, 10), new i(dzs.bo, 3, 1, 12, 10), new i(dzs.bl, 3, 1, 12, 10), new i(dzs.bi, 3, 1, 12, 10), new i(dzs.bh, 3, 1, 12, 10), new i(dzs.bm, 3, 1, 12, 10), new i(dzs.bq, 3, 1, 12, 10)}, (Object)4, (Object)new g[]{new b(dlx.ty, 12, 16, 30), new b(dlx.tw, 12, 16, 30), new b(dlx.tx, 12, 16, 30), new b(dlx.tz, 12, 16, 30), new b(dlx.to, 12, 16, 30), new b(dlx.tv, 12, 16, 30), new i(dlx.xe, 3, 1, 12, 15), new i(dlx.xp, 3, 1, 12, 15), new i(dlx.xh, 3, 1, 12, 15), new i(dlx.xs, 3, 1, 12, 15), new i(dlx.xk, 3, 1, 12, 15), new i(dlx.xr, 3, 1, 12, 15), new i(dlx.xj, 3, 1, 12, 15), new i(dlx.xl, 3, 1, 12, 15), new i(dlx.xt, 3, 1, 12, 15), new i(dlx.xo, 3, 1, 12, 15), new i(dlx.xg, 3, 1, 12, 15), new i(dlx.xn, 3, 1, 12, 15), new i(dlx.xq, 3, 1, 12, 15), new i(dlx.xi, 3, 1, 12, 15), new i(dlx.xf, 3, 1, 12, 15), new i(dlx.xm, 3, 1, 12, 15)}, (Object)5, (Object)new g[]{new i(dlx.rJ, 2, 3, 30)})));
        $$0.put(dda.i, ddb.a((ImmutableMap<Integer, g[]>)ImmutableMap.of((Object)1, (Object)new g[]{new b(dlx.qW, 32, 16, 2), new i(dlx.pX, 1, 16, 1), new h((dwn)dzs.O, 10, 1, dlx.rG, 10, 12, 1, 0.05f)}, (Object)2, (Object)new g[]{new b(dlx.rG, 26, 12, 10), new i(dlx.pW, 2, 1, 5)}, (Object)3, (Object)new g[]{new b(dlx.qY, 14, 16, 20), new i(dlx.yz, 3, 1, 10)}, (Object)4, (Object)new g[]{new b(dlx.qZ, 24, 16, 30), new e(dlx.pW, 2, 3, 15)}, (Object)5, (Object)new g[]{new b(dlx.nc, 8, 12, 30), new e(dlx.yz, 3, 3, 15), new k(dlx.pX, 5, dlx.xF, 5, 2, 12, 30)})));
        $$0.put(dda.k, ddb.a((ImmutableMap<Integer, g[]>)ImmutableMap.builder().put((Object)1, (Object)new g[]{new b(dlx.sA, 24, 16, 2), new d(1, bds.i), new i(dzs.cv, 9, 1, 12, 1)}).put((Object)2, (Object)new g[]{new b(dlx.sB, 4, 12, 10), new d(5, bds.i), new i(dlx.yX, 1, 1, 5)}).put((Object)3, (Object)new g[]{new b(dlx.tj, 5, 12, 20), new d(10, bds.i), new i(dlx.cN, 1, 4, 10)}).put((Object)4, (Object)new g[]{new b(dlx.wk, 2, 12, 30), new d(15, bds.i), new i(dlx.ta, 5, 1, 15), new i(dlx.sG, 4, 1, 15)}).put((Object)5, (Object)new g[]{new i(dlx.xa, 20, 1, 30)}).build()));
        $$0.put(dda.e, ddb.a((ImmutableMap<Integer, g[]>)ImmutableMap.of((Object)1, (Object)new g[]{new b(dlx.sA, 24, 12, 2), new i(dlx.wv, 7, 1, 12, 1, 0.05f)}, (Object)2, (Object)new g[]{new b(dlx.gE, 11, 12, 10), ddb$m.a((g)new l(8, beb.h, "filled_map.village_taiga", fms.F, 12, 5), ddc.f, ddc.e, ddc.c), ddb$m.a((g)new l(8, beb.k, "filled_map.explorer_swamp", fms.H, 12, 5), ddc.g, ddc.e, ddc.b), ddb$m.a((g)new l(8, beb.i, "filled_map.village_snowy", fms.E, 12, 5), ddc.g, ddc.f), ddb$m.a((g)new l(8, beb.e, "filled_map.village_savanna", fms.D, 12, 5), ddc.c, ddc.b, ddc.a), ddb$m.a((g)new l(8, beb.g, "filled_map.village_plains", fms.C, 12, 5), ddc.g, ddc.e, ddc.d, ddc.a), ddb$m.a((g)new l(8, beb.j, "filled_map.explorer_jungle", fms.G, 12, 5), ddc.f, ddc.d, ddc.a), ddb$m.a((g)new l(8, beb.f, "filled_map.village_desert", fms.B, 12, 5), ddc.d, ddc.b)}, (Object)3, (Object)new g[]{new b(dlx.sG, 1, 12, 20), new l(13, beb.d, "filled_map.monument", fms.j, 12, 10), new l(12, beb.m, "filled_map.trial_chambers", fms.I, 12, 10)}, (Object)4, (Object)new g[]{new i(dlx.wo, 7, 1, 12, 15, 0.05f), ddb$m.a((g)new i(dlx.xp, 2, 1, 12, 15, 0.05f), ddc.e, ddc.g), ddb$m.a((g)new i(dlx.xe, 2, 1, 12, 15, 0.05f), ddc.e, ddc.c), ddb$m.a((g)new i(dlx.xs, 2, 1, 12, 15, 0.05f), ddc.e, ddc.d), ddb$m.a((g)new i(dlx.xr, 2, 1, 12, 15, 0.05f), ddc.a, ddc.d, ddc.b), ddb$m.a((g)new i(dlx.xj, 2, 1, 12, 15, 0.05f), ddc.a, ddc.g), ddb$m.a((g)new i(dlx.xo, 2, 1, 12, 15, 0.05f), ddc.g, ddc.f), ddb$m.a((g)new i(dlx.xn, 2, 1, 12, 15, 0.05f), ddc.a, ddc.e), ddb$m.a((g)new i(dlx.xi, 2, 1, 12, 15, 0.05f), ddc.c, ddc.b), ddb$m.a((g)new i(dlx.xf, 2, 1, 12, 15, 0.05f), ddc.d, ddc.a), ddb$m.a((g)new i(dlx.xq, 2, 1, 12, 15, 0.05f), ddc.c, ddc.b), ddb$m.a((g)new i(dlx.xg, 2, 1, 12, 15, 0.05f), ddc.d), ddb$m.a((g)new i(dlx.xh, 2, 1, 12, 15, 0.05f), ddc.e, ddc.f), ddb$m.a((g)new i(dlx.xk, 2, 1, 12, 15, 0.05f), ddc.g, ddc.c), ddb$m.a((g)new i(dlx.xl, 2, 1, 12, 15, 0.05f), ddc.a), ddb$m.a((g)new i(dlx.xt, 2, 1, 12, 15, 0.05f), ddc.f)}, (Object)5, (Object)new g[]{new i(dlx.yG, 8, 1, 12, 30, 0.05f), new l(14, beb.c, "filled_map.mansion", fms.i, 12, 30)})));
        $$0.put(dda.f, ddb.a((ImmutableMap<Integer, g[]>)ImmutableMap.of((Object)1, (Object)new g[]{new b(dlx.ui, 32, 16, 2), new i(dlx.mB, 1, 2, 1)}, (Object)2, (Object)new g[]{new b(dlx.qk, 3, 12, 10), new i(dlx.qc, 1, 1, 5)}, (Object)3, (Object)new g[]{new b(dlx.wQ, 2, 12, 20), new i(dzs.eH, 4, 1, 12, 10)}, (Object)4, (Object)new g[]{new b(dlx.pQ, 4, 12, 30), new b(dlx.uo, 9, 12, 30), new i(dlx.uj, 5, 1, 15)}, (Object)5, (Object)new g[]{new b(dlx.un, 22, 12, 30), new i(dlx.wh, 3, 1, 30)})));
        $$0.put(dda.c, ddb.a((ImmutableMap<Integer, g[]>)ImmutableMap.of((Object)1, (Object)new g[]{new b(dlx.pY, 15, 16, 2), new i(new dlt(dlx.rs), 7, 1, 12, 1, 0.2f), new i(new dlt(dlx.rt), 4, 1, 12, 1, 0.2f), new i(new dlt(dlx.rq), 5, 1, 12, 1, 0.2f), new i(new dlt(dlx.rr), 9, 1, 12, 1, 0.2f)}, (Object)2, (Object)new g[]{new b(dlx.qg, 4, 12, 10), new i(new dlt(dlx.yW), 36, 1, 12, 5, 0.2f), new i(new dlt(dlx.rp), 1, 1, 12, 5, 0.2f), new i(new dlt(dlx.ro), 3, 1, 12, 5, 0.2f)}, (Object)3, (Object)new g[]{new b(dlx.sm, 1, 12, 20), new b(dlx.qa, 1, 12, 20), new i(new dlt(dlx.rm), 1, 1, 12, 10, 0.2f), new i(new dlt(dlx.rn), 4, 1, 12, 10, 0.2f), new i(new dlt(dlx.xH), 5, 1, 12, 10, 0.2f)}, (Object)4, (Object)new g[]{new e(dlx.rw, 14, 3, 15, 0.2f), new e(dlx.rx, 8, 3, 15, 0.2f)}, (Object)5, (Object)new g[]{new e(dlx.ru, 8, 3, 30, 0.2f), new e(dlx.rv, 16, 3, 30, 0.2f)})));
        $$0.put(dda.p, ddb.a((ImmutableMap<Integer, g[]>)ImmutableMap.of((Object)1, (Object)new g[]{new b(dlx.pY, 15, 16, 2), new i(new dlt(dlx.qK), 3, 1, 12, 1, 0.2f), new e(dlx.qH, 2, 3, 1)}, (Object)2, (Object)new g[]{new b(dlx.qg, 4, 12, 10), new i(new dlt(dlx.yW), 36, 1, 12, 5, 0.2f)}, (Object)3, (Object)new g[]{new b(dlx.rG, 24, 12, 20)}, (Object)4, (Object)new g[]{new b(dlx.qa, 1, 12, 30), new e(dlx.qP, 12, 3, 15, 0.2f)}, (Object)5, (Object)new g[]{new e(dlx.qM, 8, 3, 30, 0.2f)})));
        $$0.put(dda.o, ddb.a((ImmutableMap<Integer, g[]>)ImmutableMap.of((Object)1, (Object)new g[]{new b(dlx.pY, 15, 16, 2), new i(new dlt(dlx.qA), 1, 1, 12, 1, 0.2f), new i(new dlt(dlx.qy), 1, 1, 12, 1, 0.2f), new i(new dlt(dlx.qz), 1, 1, 12, 1, 0.2f), new i(new dlt(dlx.qB), 1, 1, 12, 1, 0.2f)}, (Object)2, (Object)new g[]{new b(dlx.qg, 4, 12, 10), new i(new dlt(dlx.yW), 36, 1, 12, 5, 0.2f)}, (Object)3, (Object)new g[]{new b(dlx.rG, 30, 12, 20), new e(dlx.qK, 1, 3, 10, 0.2f), new e(dlx.qI, 2, 3, 10, 0.2f), new e(dlx.qJ, 3, 3, 10, 0.2f), new i(new dlt(dlx.qQ), 4, 1, 3, 10, 0.2f)}, (Object)4, (Object)new g[]{new b(dlx.qa, 1, 12, 30), new e(dlx.qP, 12, 3, 15, 0.2f), new e(dlx.qN, 5, 3, 15, 0.2f)}, (Object)5, (Object)new g[]{new e(dlx.qO, 13, 3, 30, 0.2f)})));
        $$0.put(dda.d, ddb.a((ImmutableMap<Integer, g[]>)ImmutableMap.of((Object)1, (Object)new g[]{new b(dlx.ug, 14, 16, 2), new b(dlx.rH, 7, 16, 2), new b(dlx.wN, 4, 16, 2), new i(dlx.wP, 1, 1, 1)}, (Object)2, (Object)new g[]{new b(dlx.pY, 15, 16, 2), new i(dlx.rI, 1, 5, 16, 5), new i(dlx.uh, 1, 8, 16, 5)}, (Object)3, (Object)new g[]{new b(dlx.xc, 7, 16, 20), new b(dlx.ue, 10, 16, 20)}, (Object)4, (Object)new g[]{new b(dlx.sz, 10, 12, 30)}, (Object)5, (Object)new g[]{new b(dlx.za, 10, 12, 30)})));
        $$0.put(dda.j, ddb.a((ImmutableMap<Integer, g[]>)ImmutableMap.of((Object)1, (Object)new g[]{new b(dlx.sp, 6, 16, 2), new a(dlx.rg, 3), new a(dlx.rf, 7)}, (Object)2, (Object)new g[]{new b(dlx.rG, 26, 12, 10), new a(dlx.re, 5, 12, 5), new a(dlx.rh, 4, 12, 5)}, (Object)3, (Object)new g[]{new b(dlx.wR, 9, 12, 20), new a(dlx.rf, 7)}, (Object)4, (Object)new g[]{new b(dlx.pQ, 4, 12, 30), new a(dlx.wY, 6, 12, 15)}, (Object)5, (Object)new g[]{new i(new dlt(dlx.oR), 6, 1, 12, 30, 0.2f), new a(dlx.re, 5, 12, 30)})));
        $$0.put(dda.l, ddb.a((ImmutableMap<Integer, g[]>)ImmutableMap.of((Object)1, (Object)new g[]{new b(dlx.sy, 10, 16, 2), new i(dlx.sx, 1, 10, 16, 1)}, (Object)2, (Object)new g[]{new b(dzs.b, 20, 16, 10), new i(dzs.fq, 1, 4, 16, 5)}, (Object)3, (Object)new g[]{new b(dzs.c, 16, 16, 20), new b(dzs.g, 16, 16, 20), new b(dzs.e, 16, 16, 20), new i(dzs.tR, 1, 4, 16, 10), new i(dzs.h, 1, 4, 16, 10), new i(dzs.f, 1, 4, 16, 10), new i(dzs.d, 1, 4, 16, 10)}, (Object)4, (Object)new g[]{new b(dlx.qd, 12, 12, 30), new i(dzs.ib, 1, 1, 12, 15), new i(dzs.ia, 1, 1, 12, 15), new i(dzs.il, 1, 1, 12, 15), new i(dzs.id, 1, 1, 12, 15), new i(dzs.ih, 1, 1, 12, 15), new i(dzs.ii, 1, 1, 12, 15), new i(dzs.ip, 1, 1, 12, 15), new i(dzs.io, 1, 1, 12, 15), new i(dzs.ig, 1, 1, 12, 15), new i(dzs.ic, 1, 1, 12, 15), new i(dzs.if, 1, 1, 12, 15), new i(dzs.in, 1, 1, 12, 15), new i(dzs.ij, 1, 1, 12, 15), new i(dzs.ik, 1, 1, 12, 15), new i(dzs.ie, 1, 1, 12, 15), new i(dzs.im, 1, 1, 12, 15), new i(dzs.md, 1, 1, 12, 15), new i(dzs.mc, 1, 1, 12, 15), new i(dzs.mn, 1, 1, 12, 15), new i(dzs.mf, 1, 1, 12, 15), new i(dzs.mj, 1, 1, 12, 15), new i(dzs.mk, 1, 1, 12, 15), new i(dzs.mr, 1, 1, 12, 15), new i(dzs.mq, 1, 1, 12, 15), new i(dzs.mi, 1, 1, 12, 15), new i(dzs.me, 1, 1, 12, 15), new i(dzs.mh, 1, 1, 12, 15), new i(dzs.mp, 1, 1, 12, 15), new i(dzs.ml, 1, 1, 12, 15), new i(dzs.mm, 1, 1, 12, 15), new i(dzs.mg, 1, 1, 12, 15), new i(dzs.mo, 1, 1, 12, 15)}, (Object)5, (Object)new g[]{new i(dzs.hW, 1, 1, 12, 30), new i(dzs.hU, 1, 1, 12, 30)})));
    });
    public static final List<Pair<g[], Integer>> b = ImmutableList.builder().add((Object)Pair.of((Object)new g[]{new b(ddb.a(dns.a), 2, 1, 1), new b(dlx.sl, 1, 2, 1, 2), new b(dlx.sq, 1, 2, 1, 2), new b(dlx.ur, 1, 2, 1, 3), new b(dlx.wt, 4, 2, 1), new b(dlx.iw, 1, 2, 1)}, (Object)2)).add((Object)Pair.of((Object)new g[]{new i(dlx.iO, 1, 1, 6, 1), new i(dlx.lP, 6, 1, 6, 1), new i(dlx.ra, 1, 4, 2, 1), new i(dlx.E, 3, 3, 6, 1), new i(dzs.ab, 1, 8, 4, 1), new i(dzs.Z, 1, 8, 4, 1), new i(dzs.ad, 1, 8, 4, 1), new i(dzs.aa, 1, 8, 4, 1), new i(dzs.X, 1, 8, 4, 1), new i(dzs.Y, 1, 8, 4, 1), new i(dzs.ac, 1, 8, 4, 1), new i(dzs.af, 1, 8, 4, 1), new i(dzs.ae, 1, 8, 4, 1), new e(dlx.qJ, 1, 1, 1, 0.2f), new i(ddb.b(dns.h), 5, 1, 1, 1)}, (Object)2)).add((Object)Pair.of((Object)new g[]{new i(dlx.su, 3, 1, 4, 1), new i(dlx.sr, 3, 1, 4, 1), new i(dlx.de, 2, 1, 5, 1), new i(dlx.sC, 4, 1, 5, 1), new i(dlx.gd, 2, 1, 5, 1), new i(dlx.ys, 5, 1, 5, 1), new i(dlx.cV, 1, 1, 12, 1), new i(dlx.dW, 1, 1, 8, 1), new i(dlx.fS, 1, 1, 4, 1), new i(dlx.dX, 3, 1, 12, 1), new i(dlx.fC, 3, 1, 8, 1), new i(dlx.dv, 1, 1, 12, 1), new i(dlx.dy, 1, 1, 12, 1), new i(dlx.dz, 1, 1, 8, 1), new i(dlx.dA, 1, 1, 12, 1), new i(dlx.dB, 1, 1, 12, 1), new i(dlx.dC, 1, 1, 12, 1), new i(dlx.dD, 1, 1, 12, 1), new i(dlx.dE, 1, 1, 12, 1), new i(dlx.dF, 1, 1, 12, 1), new i(dlx.dG, 1, 1, 12, 1), new i(dlx.dH, 1, 1, 12, 1), new i(dlx.dI, 1, 1, 7, 1), new i(dlx.dw, 1, 1, 7, 1), new i(dlx.rb, 1, 1, 12, 1), new i(dlx.xA, 1, 1, 12, 1), new i(dlx.uc, 1, 1, 12, 1), new i(dlx.ud, 1, 1, 12, 1), new i(dlx.ab, 5, 1, 8, 1), new i(dlx.Z, 5, 1, 8, 1), new i(dlx.ad, 5, 1, 8, 1), new i(dlx.aa, 5, 1, 8, 1), new i(dlx.X, 5, 1, 8, 1), new i(dlx.Y, 5, 1, 8, 1), new i(dlx.ac, 5, 1, 8, 1), new i(dlx.ae, 5, 1, 8, 1), new i(dlx.af, 5, 1, 8, 1), new i(dlx.tA, 1, 3, 12, 1), new i(dlx.tm, 1, 3, 12, 1), new i(dlx.tx, 1, 3, 12, 1), new i(dlx.ts, 1, 3, 12, 1), new i(dlx.tB, 1, 3, 12, 1), new i(dlx.tz, 1, 3, 12, 1), new i(dlx.tu, 1, 3, 12, 1), new i(dlx.to, 1, 3, 12, 1), new i(dlx.tq, 1, 3, 12, 1), new i(dlx.tt, 1, 3, 12, 1), new i(dlx.tw, 1, 3, 12, 1), new i(dlx.tp, 1, 3, 12, 1), new i(dlx.tr, 1, 3, 12, 1), new i(dlx.tn, 1, 3, 12, 1), new i(dlx.ty, 1, 3, 12, 1), new i(dlx.tv, 1, 3, 12, 1), new i(dlx.lr, 3, 1, 8, 1), new i(dlx.ls, 3, 1, 8, 1), new i(dlx.lt, 3, 1, 8, 1), new i(dlx.lu, 3, 1, 8, 1), new i(dlx.lq, 3, 1, 8, 1), new i(dlx.gG, 1, 3, 4, 1), new i(dlx.ee, 1, 3, 4, 1), new i(dlx.dN, 1, 3, 4, 1), new i(dlx.dO, 1, 3, 4, 1), new i(dlx.gT, 1, 5, 2, 1), new i(dlx.ei, 1, 2, 5, 1), new i(dlx.ah, 1, 8, 8, 1), new i(dlx.ak, 1, 4, 6, 1), new i(dlx.zU, 1, 2, 5, 1), new i(dlx.F, 1, 2, 5, 1), new i(dlx.ec, 1, 2, 5, 1), new i(dlx.ef, 1, 2, 5, 1), new i(dlx.dZ, 1, 1, 12, 1), new i(dlx.dc, 1, 1, 12, 1), new i(dlx.da, 3, 1, 12, 1)}, (Object)5)).build();
    public static final Map<amt<dda>, Int2ObjectMap<g[]>> c = Map.of(dda.k, ddb.a((ImmutableMap<Integer, g[]>)ImmutableMap.builder().put((Object)1, (Object)new g[]{new b(dlx.sA, 24, 16, 2), ddb.a(1), new i(dzs.cv, 9, 1, 12, 1)}).put((Object)2, (Object)new g[]{new b(dlx.sB, 4, 12, 10), ddb.a(5), new i(dlx.yX, 1, 1, 5)}).put((Object)3, (Object)new g[]{new b(dlx.tj, 5, 12, 20), ddb.a(10), new i(dlx.cN, 1, 4, 10)}).put((Object)4, (Object)new g[]{new b(dlx.wk, 2, 12, 30), new i(dlx.ta, 5, 1, 15), new i(dlx.sG, 4, 1, 15)}).put((Object)5, (Object)new g[]{ddb.a(), new i(dlx.xa, 20, 1, 30)}).build()), dda.c, ddb.a((ImmutableMap<Integer, g[]>)ImmutableMap.builder().put((Object)1, (Object)new g[]{new b(dlx.pY, 15, 12, 2), new b(dlx.qg, 5, 12, 2)}).put((Object)2, (Object)new g[]{ddb$m.a((g)new i(dlx.rt, 4, 1, 12, 5, 0.05f), ddc.a, ddc.c, ddc.d, ddc.e, ddc.g), ddb$m.a((g)new i(dlx.rp, 4, 1, 12, 5, 0.05f), ddc.b, ddc.f), ddb$m.a((g)new i(dlx.rq, 5, 1, 12, 5, 0.05f), ddc.a, ddc.c, ddc.d, ddc.e, ddc.g), ddb$m.a((g)new i(dlx.rm, 5, 1, 12, 5, 0.05f), ddc.b, ddc.f), ddb$m.a((g)new i(dlx.rs, 7, 1, 12, 5, 0.05f), ddc.a, ddc.c, ddc.d, ddc.e, ddc.g), ddb$m.a((g)new i(dlx.ro, 7, 1, 12, 5, 0.05f), ddc.b, ddc.f), ddb$m.a((g)new i(dlx.rr, 9, 1, 12, 5, 0.05f), ddc.a, ddc.c, ddc.d, ddc.e, ddc.g), ddb$m.a((g)new i(dlx.rn, 9, 1, 12, 5, 0.05f), ddc.b, ddc.f)}).put((Object)3, (Object)new g[]{new b(dlx.sm, 1, 12, 20), new i(dlx.xH, 5, 1, 12, 10, 0.05f), new i(dlx.yW, 36, 1, 12, 10, 0.2f)}).put((Object)4, (Object)new g[]{ddb$m.a((g)new i(dlx.rt, 8, 1, 3, 15, 0.05f, due.a), ddc.a), ddb$m.a((g)new i(dlx.rq, 9, 1, 3, 15, 0.05f, due.d), ddc.a), ddb$m.a((g)new i(dlx.rs, 11, 1, 3, 15, 0.05f, due.b), ddc.a), ddb$m.a((g)new i(dlx.rr, 13, 1, 3, 15, 0.05f, due.c), ddc.a), ddb$m.a((g)new i(dlx.rt, 8, 1, 3, 15, 0.05f, due.g), ddc.c), ddb$m.a((g)new i(dlx.rq, 9, 1, 3, 15, 0.05f, due.j), ddc.c), ddb$m.a((g)new i(dlx.rs, 11, 1, 3, 15, 0.05f, due.h), ddc.c), ddb$m.a((g)new i(dlx.rr, 13, 1, 3, 15, 0.05f, due.i), ddc.c), ddb$m.a((g)new i(dlx.rt, 2, 1, 3, 15, 0.05f, due.m), ddc.d), ddb$m.a((g)new i(dlx.rq, 3, 1, 3, 15, 0.05f, due.p), ddc.d), ddb$m.a((g)new i(dlx.rs, 5, 1, 3, 15, 0.05f, due.n), ddc.d), ddb$m.a((g)new i(dlx.rr, 7, 1, 3, 15, 0.05f, due.o), ddc.d), ddb$m.a((g)new i(dlx.rt, 8, 1, 3, 15, 0.05f, due.s), ddc.e), ddb$m.a((g)new i(dlx.rq, 9, 1, 3, 15, 0.05f, due.t), ddc.e), ddb$m.a((g)new i(dlx.rp, 8, 1, 3, 15, 0.05f, due.w), ddc.b), ddb$m.a((g)new i(dlx.rm, 9, 1, 3, 15, 0.05f, due.z), ddc.b), ddb$m.a((g)new i(dlx.ro, 11, 1, 3, 15, 0.05f, due.x), ddc.b), ddb$m.a((g)new i(dlx.rn, 13, 1, 3, 15, 0.05f, due.y), ddc.b), ddb$m.a((g)new i(dlx.rp, 8, 1, 3, 15, 0.05f, due.C), ddc.f), ddb$m.a((g)new i(dlx.rm, 9, 1, 3, 15, 0.05f, due.F), ddc.f), ddb$m.a((g)new i(dlx.ro, 11, 1, 3, 15, 0.05f, due.D), ddc.f), ddb$m.a((g)new i(dlx.rn, 13, 1, 3, 15, 0.05f, due.E), ddc.f), ddb$m.a((g)new h((dwn)dlx.rx, 1, 4, dlx.rw, 1, 3, 15, 0.05f), ddc.g), ddb$m.a((g)new h((dwn)dlx.rw, 1, 4, dlx.rv, 1, 3, 15, 0.05f), ddc.g), ddb$m.a((g)new h((dwn)dlx.ru, 1, 4, dlx.rx, 1, 3, 15, 0.05f), ddc.g), ddb$m.a((g)new h((dwn)dlx.rv, 1, 2, dlx.ru, 1, 3, 15, 0.05f), ddc.g)}).put((Object)5, (Object)new g[]{ddb$m.a((g)new h(dlx.qa, 4, 16, dlx.rv, 1, 3, 30, 0.05f, due.f), ddc.a), ddb$m.a((g)new h(dlx.qa, 3, 16, dlx.rw, 1, 3, 30, 0.05f, due.e), ddc.a), ddb$m.a((g)new h(dlx.qa, 3, 16, dlx.rw, 1, 3, 30, 0.05f, due.l), ddc.c), ddb$m.a((g)new h(dlx.qa, 2, 12, dlx.rx, 1, 3, 30, 0.05f, due.k), ddc.c), ddb$m.a((g)new h(dlx.qa, 2, 6, dlx.ru, 1, 3, 30, 0.05f, due.r), ddc.d), ddb$m.a((g)new h(dlx.qa, 3, 8, dlx.rv, 1, 3, 30, 0.05f, due.q), ddc.d), ddb$m.a((g)new h(dlx.qa, 2, 12, dlx.rx, 1, 3, 30, 0.05f, due.u), ddc.e), ddb$m.a((g)new h(dlx.qa, 3, 12, dlx.ru, 1, 3, 30, 0.05f, due.v), ddc.e), ddb$m.a((g)new i(dlx.rm, 9, 1, 3, 30, 0.05f, due.B), ddc.b), ddb$m.a((g)new i(dlx.rp, 8, 1, 3, 30, 0.05f, due.A), ddc.b), ddb$m.a((g)new i(dlx.rm, 9, 1, 3, 30, 0.05f, due.H), ddc.f), ddb$m.a((g)new i(dlx.rp, 8, 1, 3, 30, 0.05f, due.G), ddc.f), ddb$m.a((g)new h(dlx.qa, 4, 18, dlx.rv, 1, 3, 30, 0.05f, due.J), ddc.g), ddb$m.a((g)new h(dlx.qa, 3, 18, dlx.rw, 1, 3, 30, 0.05f, due.I), ddc.g), ddb$m.a((g)new b(dlx.aP, 1, 12, 30, 42), ddc.g), ddb$m.a((g)new b(dlx.aM, 1, 12, 30, 4), ddc.a, ddc.b, ddc.c, ddc.d, ddc.e, ddc.f)}).build()));

    private static g a(int $$0) {
        return new m((Map<amt<ddc>, g>)ImmutableMap.builder().put(ddc.a, (Object)new d($$0, bds.w)).put(ddc.b, (Object)new d($$0, bds.x)).put(ddc.c, (Object)new d($$0, bds.y)).put(ddc.d, (Object)new d($$0, bds.z)).put(ddc.e, (Object)new d($$0, bds.A)).put(ddc.f, (Object)new d($$0, bds.B)).put(ddc.g, (Object)new d($$0, bds.C)).build());
    }

    private static g a() {
        return new m((Map<amt<ddc>, g>)ImmutableMap.builder().put(ddc.a, (Object)new d(30, 3, 3, bds.D)).put(ddc.b, (Object)new d(30, 2, 2, bds.E)).put(ddc.c, (Object)new d(30, 3, 3, bds.F)).put(ddc.d, (Object)new d(30, 3, 3, bds.G)).put(ddc.e, (Object)new d(30, bds.H)).put(ddc.f, (Object)new d(30, bds.I)).put(ddc.g, (Object)new d(30, 2, 2, bds.J)).build());
    }

    private static Int2ObjectMap<g[]> a(ImmutableMap<Integer, g[]> $$0) {
        return new Int2ObjectOpenHashMap($$0);
    }

    private static dvj a(jd<dnp> $$0) {
        return new dvj(dlx.up).a($$1 -> $$1.a(ki.Y, new dnr($$0)));
    }

    private static dlt b(jd<dnp> $$0) {
        return dnr.a(dlx.up, $$0);
    }

    record m(Map<amt<ddc>, g> a) implements g
    {
        @SafeVarargs
        public static m a(g $$02, amt<ddc> ... $$12) {
            return new m(Arrays.stream($$12).collect(Collectors.toMap($$0 -> $$0, $$1 -> $$02)));
        }

        @Override
        public @Nullable dvl a(axf $$0, cgk $$1, bgr $$2) {
            if ($$1 instanceof dcz) {
                dcz $$3 = (dcz)((Object)$$1);
                amt $$4 = $$3.gZ().a().e().orElse(null);
                if ($$4 == null) {
                    return null;
                }
                g $$5 = this.a.get($$4);
                if ($$5 == null) {
                    return null;
                }
                return $$5.a($$0, $$1, $$2);
            }
            return null;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{m.class, "trades", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{m.class, "trades", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{m.class, "trades", "a"}, this, $$0);
        }
    }

    static class d
    implements g {
        private final int a;
        private final bef<dso> b;
        private final int c;
        private final int d;

        public d(int $$0, bef<dso> $$1) {
            this($$0, 0, Integer.MAX_VALUE, $$1);
        }

        public d(int $$0, int $$1, int $$2, bef<dso> $$3) {
            this.c = $$1;
            this.d = $$2;
            this.a = $$0;
            this.b = $$3;
        }

        @Override
        public dvl a(axf $$0, cgk $$1, bgr $$2) {
            dlt $$12;
            int $$11;
            Optional $$3 = $$0.J_().f(mj.bf).a(this.b, $$2);
            if (!$$3.isEmpty()) {
                jd $$4 = (jd)$$3.get();
                dso $$5 = (dso)$$4.a();
                int $$6 = Math.max($$5.d(), this.c);
                int $$7 = Math.min($$5.e(), this.d);
                int $$8 = bgj.a($$2, $$6, $$7);
                dlt $$9 = dsq.a(new dsr($$4, $$8));
                int $$10 = 2 + $$2.a(5 + $$8 * 10) + 3 * $$8;
                if ($$4.a(bds.j)) {
                    $$10 *= 2;
                }
                if ($$10 > 64) {
                    $$10 = 64;
                }
            } else {
                $$11 = 1;
                $$12 = new dlt(dlx.sB);
            }
            return new dvl(new dvj(dlx.qb, $$11), Optional.of(new dvj(dlx.sB)), $$12, 12, this.a, 0.2f);
        }
    }

    public static interface g {
        public @Nullable dvl a(axf var1, cgk var2, bgr var3);
    }

    static class b
    implements g {
        private final dvj a;
        private final int b;
        private final int c;
        private final int d;
        private final float e;

        public b(dwn $$0, int $$1, int $$2, int $$3) {
            this($$0, $$1, $$2, $$3, 1);
        }

        public b(dwn $$0, int $$1, int $$2, int $$3, int $$4) {
            this(new dvj($$0.h(), $$1), $$2, $$3, $$4);
        }

        public b(dvj $$0, int $$1, int $$2, int $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = 0.05f;
        }

        @Override
        public dvl a(axf $$0, cgk $$1, bgr $$2) {
            return new dvl(this.a, new dlt(dlx.qb, this.d), this.b, this.c, this.e);
        }
    }

    static class i
    implements g {
        private final dlt a;
        private final int b;
        private final int c;
        private final int d;
        private final float e;
        private final Optional<amt<dtz>> f;

        public i(dzq $$0, int $$1, int $$2, int $$3, int $$4) {
            this(new dlt($$0), $$1, $$2, $$3, $$4);
        }

        public i(dlp $$0, int $$1, int $$2, int $$3) {
            this(new dlt($$0), $$1, $$2, 12, $$3);
        }

        public i(dlp $$0, int $$1, int $$2, int $$3, int $$4) {
            this(new dlt($$0), $$1, $$2, $$3, $$4);
        }

        public i(dlt $$0, int $$1, int $$2, int $$3, int $$4) {
            this($$0, $$1, $$2, $$3, $$4, 0.05f);
        }

        public i(dlp $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
            this(new dlt($$0), $$1, $$2, $$3, $$4, $$5);
        }

        public i(dlp $$0, int $$1, int $$2, int $$3, int $$4, float $$5, amt<dtz> $$6) {
            this(new dlt($$0), $$1, $$2, $$3, $$4, $$5, Optional.of($$6));
        }

        public i(dlt $$0, int $$1, int $$2, int $$3, int $$4, float $$5) {
            this($$0, $$1, $$2, $$3, $$4, $$5, Optional.empty());
        }

        public i(dlt $$0, int $$1, int $$2, int $$3, int $$4, float $$5, Optional<amt<dtz>> $$6) {
            this.a = $$0;
            this.b = $$1;
            this.a.e($$2);
            this.c = $$3;
            this.d = $$4;
            this.e = $$5;
            this.f = $$6;
        }

        @Override
        public dvl a(axf $$0, cgk $$1, bgr $$2) {
            dlt $$3 = this.a.v();
            this.f.ifPresent($$4 -> dsq.a($$3, $$0.J_(), $$4, $$0.c($$1.dK()), $$2));
            return new dvl(new dvj(dlx.qb, this.b), $$3, this.c, this.d, this.e);
        }
    }

    static class j
    implements g {
        private final dpa a;
        private final int b;
        private final float c;

        public j(jd<cfk> $$0, int $$1, int $$2) {
            this(new dpa(List.of(new dpa.a($$0, $$1))), $$2, 0.05f);
        }

        public j(dpa $$0, int $$1, float $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public @Nullable dvl a(axf $$0, cgk $$1, bgr $$2) {
            dlt $$3 = new dlt(dlx.yA, 1);
            $$3.b(ki.aa, this.a);
            return new dvl(new dvj(dlx.qb), $$3, 12, this.b, this.c);
        }
    }

    static class h
    implements g {
        private final dvj a;
        private final int b;
        private final dlt c;
        private final int d;
        private final int e;
        private final float f;
        private final Optional<amt<dtz>> g;

        public h(dwn $$0, int $$1, int $$2, dlp $$3, int $$4, int $$5, int $$6, float $$7) {
            this($$0, $$1, $$2, new dlt($$3), $$4, $$5, $$6, $$7);
        }

        private h(dwn $$0, int $$1, int $$2, dlt $$3, int $$4, int $$5, int $$6, float $$7) {
            this(new dvj($$0, $$1), $$2, $$3.c($$4), $$5, $$6, $$7, Optional.empty());
        }

        h(dwn $$0, int $$1, int $$2, dwn $$3, int $$4, int $$5, int $$6, float $$7, amt<dtz> $$8) {
            this(new dvj($$0, $$1), $$2, new dlt($$3, $$4), $$5, $$6, $$7, Optional.of($$8));
        }

        public h(dvj $$0, int $$1, dlt $$2, int $$3, int $$4, float $$5, Optional<amt<dtz>> $$6) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
            this.f = $$5;
            this.g = $$6;
        }

        @Override
        public @Nullable dvl a(axf $$0, cgk $$1, bgr $$2) {
            dlt $$3 = this.c.v();
            this.g.ifPresent($$4 -> dsq.a($$3, $$0.J_(), $$4, $$0.c($$1.dK()), $$2));
            return new dvl(new dvj(dlx.qb, this.b), Optional.of(this.a), $$3, 0, this.d, this.e, this.f);
        }
    }

    static class e
    implements g {
        private final dlt a;
        private final int b;
        private final int c;
        private final int d;
        private final float e;

        public e(dlp $$0, int $$1, int $$2, int $$3) {
            this($$0, $$1, $$2, $$3, 0.05f);
        }

        public e(dlp $$0, int $$1, int $$2, int $$3, float $$4) {
            this.a = new dlt($$0);
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
        }

        @Override
        public dvl a(axf $$0, cgk $$1, bgr $$2) {
            int $$3 = 5 + $$2.a(15);
            jr $$4 = $$0.J_();
            Optional $$5 = $$4.f(mj.bf).a(bds.m);
            dlt $$6 = dsq.a($$2, new dlt(this.a.h()), $$3, $$4, $$5);
            int $$7 = Math.min(this.b + $$3, 64);
            dvj $$8 = new dvj(dlx.qb, $$7);
            return new dvl($$8, $$6, this.c, this.d, this.e);
        }
    }

    static class c
    implements g {
        private final Map<amt<ddc>, dlp> a;
        private final int b;
        private final int c;
        private final int d;

        public c(int $$02, int $$12, int $$2, Map<amt<ddc>, dlp> $$3) {
            mi.x.j().stream().filter($$1 -> !$$3.containsKey($$1)).findAny().ifPresent($$0 -> {
                throw new IllegalStateException("Missing trade for villager type: " + String.valueOf($$0));
            });
            this.a = $$3;
            this.b = $$02;
            this.c = $$12;
            this.d = $$2;
        }

        @Override
        public @Nullable dvl a(axf $$0, cgk $$1, bgr $$2) {
            if ($$1 instanceof dcz) {
                dcz $$3 = (dcz)((Object)$$1);
                amt $$4 = $$3.gZ().a().e().orElse(null);
                if ($$4 == null) {
                    return null;
                }
                dvj $$5 = new dvj(this.a.get($$4), this.b);
                return new dvl($$5, new dlt(dlx.qb), this.c, this.d, 0.05f);
            }
            return null;
        }
    }

    static class k
    implements g {
        private final dlt a;
        private final int b;
        private final int c;
        private final int d;
        private final int e;
        private final dlp f;
        private final int g;
        private final float h;

        public k(dlp $$0, int $$1, dlp $$2, int $$3, int $$4, int $$5, int $$6) {
            this.a = new dlt($$2);
            this.c = $$4;
            this.d = $$5;
            this.e = $$6;
            this.f = $$0;
            this.g = $$1;
            this.b = $$3;
            this.h = 0.05f;
        }

        @Override
        public dvl a(axf $$0, cgk $$12, bgr $$2) {
            dvj $$3 = new dvj(dlx.qb, this.c);
            List $$4 = mi.i.c().filter($$1 -> !((dnp)$$1.a()).a().isEmpty() && $$0.R().a((jd<dnp>)$$1)).collect(Collectors.toList());
            jd $$5 = (jd)bhs.a($$4, $$2);
            dlt $$6 = new dlt(this.a.h(), this.b);
            $$6.b(ki.Y, new dnr($$5));
            return new dvl($$3, Optional.of(new dvj(this.f, this.g)), $$6, this.d, this.e, this.h);
        }
    }

    static class l
    implements g {
        private final int a;
        private final bef<ffo> b;
        private final String c;
        private final jd<fmr> d;
        private final int e;
        private final int f;

        public l(int $$0, bef<ffo> $$1, String $$2, jd<fmr> $$3, int $$4, int $$5) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
            this.e = $$4;
            this.f = $$5;
        }

        @Override
        public @Nullable dvl a(axf $$0, cgk $$1, bgr $$2) {
            is $$3 = $$0.a(this.b, $$1.dK(), 100, true);
            if ($$3 != null) {
                dlt $$4 = dmg.a($$0, $$3.u(), $$3.w(), (byte)2, true, true);
                dmg.a($$0, $$4);
                fmw.a($$4, $$3, "+", this.d);
                $$4.b(ki.k, yh.c(this.c));
                return new dvl(new dvj(dlx.qb, this.a), Optional.of(new dvj(dlx.sG)), $$4, this.e, this.f, 0.2f);
            }
            return null;
        }
    }

    static class a
    implements g {
        private final dlp a;
        private final int b;
        private final int c;
        private final int d;

        public a(dlp $$0, int $$1) {
            this($$0, $$1, 12, 1);
        }

        public a(dlp $$0, int $$1, int $$2, int $$3) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.d = $$3;
        }

        @Override
        public dvl a(axf $$0, cgk $$1, bgr $$2) {
            dvj $$3 = new dvj(dlx.qb, this.b);
            dlt $$4 = new dlt(this.a);
            if ($$4.a(bdy.cj)) {
                ArrayList $$5 = Lists.newArrayList();
                $$5.add(ddb$a.a($$2));
                if ($$2.i() > 0.7f) {
                    $$5.add(ddb$a.a($$2));
                }
                if ($$2.i() > 0.8f) {
                    $$5.add(ddb$a.a($$2));
                }
                $$4 = doj.a($$4, $$5);
            }
            return new dvl($$3, $$4, this.c, this.d, 0.2f);
        }

        private static dks a(bgr $$0) {
            return dks.a(dkr.a($$0.a(16)));
        }
    }

    static class f
    implements g {
        private f() {
        }

        @Override
        public dvl a(axf $$0, cgk $$1, bgr $$2) {
            return null;
        }
    }
}

