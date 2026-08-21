/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.mojang.datafixers.util.Function3
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Function3;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class ghh {
    final Consumer<gho> i;
    final ghk j;
    final BiConsumer<amo, ghx> k;
    static final List<dzq> l = List.of(dzs.fd, dzs.fj, dzs.iQ);
    public static final hqr a = $$0 -> $$0;
    public static final hqr b = hqr.e.withValue(true);
    public static final hqr c = hqr.a.withValue(g.b);
    public static final hqr d = hqr.a.withValue(g.c);
    public static final hqr e = hqr.a.withValue(g.d);
    public static final hqr f = hqr.b.withValue(g.b);
    public static final hqr g = hqr.b.withValue(g.c);
    public static final hqr h = hqr.b.withValue(g.d);
    private static final Function<ghp, ghp> m = $$0 -> $$0;
    private static final Function<ghp, ghp> n = $$0 -> $$0.a(eox.U, Integer.valueOf(2), new Integer[]{3, 4});
    private static final Function<ghp, ghp> o = $$0 -> $$0.a(eox.U, Integer.valueOf(3), new Integer[]{4});
    private static final Function<ghp, ghp> p = $$0 -> $$0.a(eox.U, 4);
    private static final Function<ghp, ghp> q = $$0 -> $$0.a(eox.V, 1);
    private static final Function<ghp, ghp> r = $$0 -> $$0.a(eox.V, Integer.valueOf(2), new Integer[]{3});
    private static final Function<ghp, ghp> s = $$0 -> $$0.a(eox.V, 3);
    private static final Function<ghp, ghp> t = $$0 -> $$0.a(eox.V, 4);
    static final Map<dzq, b> u = Map.of(dzs.b, ghh::a, dzs.ui, ghh::c, dzs.fs, ghh::b);
    private static final ghs<hqr> v = ghs.b(eox.R).a(iz.a, c).a(iz.b, e).a(iz.c, a).a(iz.d, g).a(iz.e, h).a(iz.f, f);
    private static final ghs<hqr> w = ghs.b(eox.R).a(iz.a, d).a(iz.b, a).a(iz.c, c).a(iz.d, c.then(g)).a(iz.e, c.then(h)).a(iz.f, c.then(f));
    private static final ghs<hqr> x = ghs.b(eox.T).a(iz.f, a).a(iz.d, f).a(iz.e, g).a(iz.c, h);
    private static final ghs<hqr> y = ghs.b(eox.T).a(iz.d, a).a(iz.e, f).a(iz.c, g).a(iz.f, h);
    private static final ghs<hqr> z = ghs.b(eox.T).a(iz.f, f).a(iz.d, g).a(iz.e, h).a(iz.c, a);
    static final Map<dzq, gid> A = ImmutableMap.builder().put((Object)dzs.bc, (Object)gid.D.get(dzs.bc)).put((Object)dzs.kh, (Object)gid.D.get(dzs.kh)).put((Object)dzs.kL, (Object)gid.a(gib.a(dzs.bc, "_top"))).put((Object)dzs.kN, (Object)gid.a(gib.a(dzs.kh, "_top"))).put((Object)dzs.be, (Object)gid.d.get(dzs.bc).a((gib $$0) -> $$0.a(gic.i, gib.K(dzs.be)))).put((Object)dzs.kj, (Object)gid.d.get(dzs.kh).a((gib $$0) -> $$0.a(gic.i, gib.K(dzs.kj)))).put((Object)dzs.hU, (Object)gid.d.get(dzs.hU)).put((Object)dzs.kM, (Object)gid.a(gib.a(dzs.hU, "_bottom"))).put((Object)dzs.qr, (Object)gid.E.get(dzs.qr)).put((Object)dzs.ui, (Object)gid.E.get(dzs.ui)).put((Object)dzs.hV, (Object)gid.d.get(dzs.hV).a((gib $$0) -> $$0.a(gic.i, gib.K(dzs.hV)))).put((Object)dzs.bd, (Object)gid.d.get(dzs.bd).a((gib $$0) -> {
        $$0.a(gic.d, gib.a(dzs.bc, "_top"));
        $$0.a(gic.i, gib.K(dzs.bd));
    })).put((Object)dzs.ki, (Object)gid.d.get(dzs.ki).a((gib $$0) -> {
        $$0.a(gic.d, gib.a(dzs.kh, "_top"));
        $$0.a(gic.i, gib.K(dzs.ki));
    })).put((Object)dzs.rM, (Object)gid.E.get(dzs.rM)).put((Object)dzs.rH, (Object)gid.E.get(dzs.rH)).build();
    static final Map<mn.b, BiConsumer<a, dzq>> B = ImmutableMap.builder().put((Object)mn.b.a, a::a).put((Object)mn.b.e, a::l).put((Object)mn.b.b, a::k).put((Object)mn.b.c, a::k).put((Object)mn.b.f, a::c).put((Object)mn.b.g, a::d).put((Object)mn.b.h, a::e).put((Object)mn.b.i, a::f).put((Object)mn.b.k, a::h).put((Object)mn.b.l, a::i).put((Object)mn.b.m, a::j).put((Object)mn.b.n, a::g).put((Object)mn.b.p, a::m).put((Object)mn.b.q, a::b).build();
    private static final Map<iz, hqr> C = ImmutableMap.of((Object)iz.c, (Object)a, (Object)iz.f, (Object)f.then(b), (Object)iz.d, (Object)g.then(b), (Object)iz.e, (Object)h.then(b), (Object)iz.b, (Object)e.then(b), (Object)iz.a, (Object)c.then(b));
    private static final Map<c, amo> D = new HashMap<c, amo>();

    static hqq a(amo $$0) {
        return new hqq($$0);
    }

    static ghm a(hqq $$0) {
        return new ghm(cbn.a($$0));
    }

    private static ghm a(hqq ... $$02) {
        return new ghm(cbn.a(Arrays.stream($$02).map($$0 -> new cbm<hqq>((hqq)$$0, 1)).toList()));
    }

    static ghm b(amo $$0) {
        return ghh.a(ghh.a($$0));
    }

    private static ghp b() {
        return new ghp();
    }

    @SafeVarargs
    private static <T extends Enum<T>> ghp a(epf<T> $$0, T $$1, T ... $$2) {
        return ghh.b().a($$0, (Comparable)((Object)$$1), (Comparable[])$$2);
    }

    private static ghp a(eoy $$0, boolean $$1) {
        return ghh.b().a($$0, $$1);
    }

    private static hqu a(ghp ... $$0) {
        return new hqt(hqt.a.b, Stream.of($$0).map(ghp::a).toList());
    }

    private static hqu b(ghp ... $$0) {
        return new hqt(hqt.a.a, Stream.of($$0).map(ghp::a).toList());
    }

    private static gho a(dzq $$0, hqq $$1, gib $$2, BiConsumer<amo, ghx> $$3) {
        hqq $$4 = ghh.a(gia.e.a($$0, $$2, $$3));
        return ghr.a($$0, ghh.a($$1, $$4));
    }

    private static gho b(dzq $$0, hqq $$1, gib $$2, BiConsumer<amo, ghx> $$3) {
        ghm $$4 = ghh.b(gia.f.a($$0, $$2, $$3));
        return ghh.a($$0, $$4);
    }

    private static gho c(dzq $$0, hqq $$1, gib $$2, BiConsumer<amo, ghx> $$3) {
        hqq $$4 = ghh.a(gia.l.a($$0, $$2, $$3));
        return ghr.a($$0, ghh.a($$1, $$4)).a(ghh.c());
    }

    public ghh(Consumer<gho> $$0, ghk $$1, BiConsumer<amo, ghx> $$2) {
        this.i = $$0;
        this.j = $$1;
        this.k = $$2;
    }

    private void a(dlp $$0, amo $$1) {
        this.j.a($$0, ghw.a($$1));
    }

    void a(dzq $$0, amo $$1) {
        this.j.a($$0.h(), ghw.a($$1));
    }

    private void a(dzq $$0, amo $$1, ggz $$2) {
        this.j.a($$0.h(), ghw.a($$1, $$2));
    }

    private amo a(dlp $$0) {
        return gia.bX.a(ghy.a($$0), gib.b($$0), this.k);
    }

    amo a(dlp $$0, dzq $$1) {
        return gia.bX.a(ghy.a($$0), gib.J($$1), this.k);
    }

    private amo a(dlp $$0, dzq $$1, String $$2) {
        return gia.bX.a(ghy.a($$0), gib.k(gib.a($$1, $$2)), this.k);
    }

    amo b(dlp $$0, dzq $$1, String $$2) {
        amo $$3 = gib.K($$1);
        amo $$4 = gib.a($$1, $$2);
        return gia.cb.a(ghy.a($$0), gib.c($$3, $$4), this.k);
    }

    void b(dlp $$0) {
        this.a($$0, this.a($$0));
    }

    private void c(dzq $$0) {
        dlp $$1 = $$0.h();
        if ($$1 != dlx.a) {
            this.a($$1, this.a($$1, $$0));
        }
    }

    private void a(dzq $$0, String $$1) {
        dlp $$2 = $$0.h();
        if ($$2 != dlx.a) {
            this.a($$2, this.a($$2, $$0, $$1));
        }
    }

    private void b(dzq $$0, String $$1) {
        dlp $$2 = $$0.h();
        if ($$2 != dlx.a) {
            amo $$3 = this.b($$2, $$0, $$1);
            this.a($$2, $$3);
        }
    }

    private static ghm b(hqq $$0) {
        return ghh.a($$0, $$0.a(f), $$0.a(g), $$0.a(h));
    }

    private static ghm a(hqq $$0, hqq $$1) {
        return ghh.a($$0, $$1, $$0.a(g), $$1.a(g));
    }

    private static ghs<ghm> a(eoy $$0, ghm $$1, ghm $$2) {
        return ghs.a($$0).a(true, $$1).a(false, $$2);
    }

    private void d(dzq $$0) {
        hqq $$1 = ghh.a(gid.a.create($$0, this.k));
        hqq $$2 = ghh.a(gid.c.create($$0, this.k));
        this.i.accept(ghr.a($$0, ghh.a($$1, $$2)));
    }

    private void e(dzq $$0) {
        hqq $$1 = ghh.a(gid.a.create($$0, this.k));
        this.i.accept(ghr.a($$0, ghh.b($$1)));
    }

    private void f(dzq $$0) {
        this.i.accept(ghr.a($$0).a(ghs.a(eox.bA).a((T1 $$1) -> {
            String $$2 = "_" + $$1;
            amo $$3 = gib.a($$0, $$2);
            amo $$4 = gia.c.a($$0, $$2, new gib().a(gic.a, $$3), this.k);
            return ghh.b($$4);
        })));
        this.a($$0, ghy.a($$0, "_0"));
    }

    static gho a(dzq $$0, ghm $$1, ghm $$2) {
        return ghr.a($$0).a(ghs.a(eox.A).a(false, $$1).a(true, $$2)).a(ghs.b(eox.X, eox.T).a(eos.a, iz.f, f).a(eos.a, iz.e, h).a(eos.a, iz.d, g).a(eos.a, iz.c, a).a(eos.b, iz.f, f.then(c).then(b)).a(eos.b, iz.e, h.then(c).then(b)).a(eos.b, iz.d, g.then(c).then(b)).a(eos.b, iz.c, c.then(b)).a(eos.c, iz.f, h.then(d)).a(eos.c, iz.e, f.then(d)).a(eos.c, iz.d, d).a(eos.c, iz.c, g.then(d)));
    }

    private static gho a(dzq $$0, ghm $$1, ghm $$2, ghm $$3, ghm $$4, ghm $$5, ghm $$6, ghm $$7, ghm $$8) {
        return ghr.a($$0).a(ghs.a(eox.T, eox.ah, eox.bj, eox.y).a(iz.f, epd.b, epc.a, false, $$1).a(iz.d, epd.b, epc.a, false, $$1.a(f)).a(iz.e, epd.b, epc.a, false, $$1.a(g)).a(iz.c, epd.b, epc.a, false, $$1.a(h)).a(iz.f, epd.b, epc.b, false, $$3).a(iz.d, epd.b, epc.b, false, $$3.a(f)).a(iz.e, epd.b, epc.b, false, $$3.a(g)).a(iz.c, epd.b, epc.b, false, $$3.a(h)).a(iz.f, epd.b, epc.a, true, $$2.a(f)).a(iz.d, epd.b, epc.a, true, $$2.a(g)).a(iz.e, epd.b, epc.a, true, $$2.a(h)).a(iz.c, epd.b, epc.a, true, $$2).a(iz.f, epd.b, epc.b, true, $$4.a(h)).a(iz.d, epd.b, epc.b, true, $$4).a(iz.e, epd.b, epc.b, true, $$4.a(f)).a(iz.c, epd.b, epc.b, true, $$4.a(g)).a(iz.f, epd.a, epc.a, false, $$5).a(iz.d, epd.a, epc.a, false, $$5.a(f)).a(iz.e, epd.a, epc.a, false, $$5.a(g)).a(iz.c, epd.a, epc.a, false, $$5.a(h)).a(iz.f, epd.a, epc.b, false, $$7).a(iz.d, epd.a, epc.b, false, $$7.a(f)).a(iz.e, epd.a, epc.b, false, $$7.a(g)).a(iz.c, epd.a, epc.b, false, $$7.a(h)).a(iz.f, epd.a, epc.a, true, $$6.a(f)).a(iz.d, epd.a, epc.a, true, $$6.a(g)).a(iz.e, epd.a, epc.a, true, $$6.a(h)).a(iz.c, epd.a, epc.a, true, $$6).a(iz.f, epd.a, epc.b, true, $$8.a(h)).a(iz.d, epd.a, epc.b, true, $$8).a(iz.e, epd.a, epc.b, true, $$8.a(f)).a(iz.c, epd.a, epc.b, true, $$8.a(g)));
    }

    static gho a(dzq $$0, ghm $$1, ghm $$2, ghm $$3, ghm $$4, ghm $$5) {
        return ghq.a($$0).a($$1).a(ghh.b().a(eox.N, true), $$2).a(ghh.b().a(eox.O, true), $$3).a(ghh.b().a(eox.P, true), $$4).a(ghh.b().a(eox.Q, true), $$5);
    }

    static gho b(dzq $$0, ghm $$1, ghm $$2) {
        return ghq.a($$0).a($$1).a(ghh.b().a(eox.N, true), $$2.a(b)).a(ghh.b().a(eox.O, true), $$2.a(f).a(b)).a(ghh.b().a(eox.P, true), $$2.a(g).a(b)).a(ghh.b().a(eox.Q, true), $$2.a(h).a(b));
    }

    static gho a(dzq $$0, ghm $$1, ghm $$2, ghm $$3) {
        return ghq.a($$0).a(ghh.b().a(eox.L, true), $$1).a(ghh.b().a(eox.aa, epv.b), $$2.a(b)).a(ghh.b().a(eox.Z, epv.b), $$2.a(f).a(b)).a(ghh.b().a(eox.ab, epv.b), $$2.a(g).a(b)).a(ghh.b().a(eox.ac, epv.b), $$2.a(h).a(b)).a(ghh.b().a(eox.aa, epv.c), $$3.a(b)).a(ghh.b().a(eox.Z, epv.c), $$3.a(f).a(b)).a(ghh.b().a(eox.ab, epv.c), $$3.a(g).a(b)).a(ghh.b().a(eox.ac, epv.c), $$3.a(h).a(b));
    }

    static gho a(dzq $$0, ghm $$1, ghm $$2, ghm $$3, ghm $$4, boolean $$5) {
        return ghr.a($$0).a(ghs.a(eox.t, eox.y).a(false, false, $$2).a(true, false, $$4).a(false, true, $$1).a(true, true, $$3)).a($$5 ? b : a).a(y);
    }

    static gho b(dzq $$0, ghm $$1, ghm $$2, ghm $$3) {
        return ghr.a($$0).a(ghs.a(eox.T, eox.ai, eox.bn).a(iz.f, epg.b, epr.a, $$2).a(iz.e, epg.b, epr.a, $$2.a(g).a(b)).a(iz.d, epg.b, epr.a, $$2.a(f).a(b)).a(iz.c, epg.b, epr.a, $$2.a(h).a(b)).a(iz.f, epg.b, epr.e, $$3).a(iz.e, epg.b, epr.e, $$3.a(g).a(b)).a(iz.d, epg.b, epr.e, $$3.a(f).a(b)).a(iz.c, epg.b, epr.e, $$3.a(h).a(b)).a(iz.f, epg.b, epr.d, $$3.a(h).a(b)).a(iz.e, epg.b, epr.d, $$3.a(f).a(b)).a(iz.d, epg.b, epr.d, $$3).a(iz.c, epg.b, epr.d, $$3.a(g).a(b)).a(iz.f, epg.b, epr.c, $$1).a(iz.e, epg.b, epr.c, $$1.a(g).a(b)).a(iz.d, epg.b, epr.c, $$1.a(f).a(b)).a(iz.c, epg.b, epr.c, $$1.a(h).a(b)).a(iz.f, epg.b, epr.b, $$1.a(h).a(b)).a(iz.e, epg.b, epr.b, $$1.a(f).a(b)).a(iz.d, epg.b, epr.b, $$1).a(iz.c, epg.b, epr.b, $$1.a(g).a(b)).a(iz.f, epg.a, epr.a, $$2.a(d).a(b)).a(iz.e, epg.a, epr.a, $$2.a(d).a(g).a(b)).a(iz.d, epg.a, epr.a, $$2.a(d).a(f).a(b)).a(iz.c, epg.a, epr.a, $$2.a(d).a(h).a(b)).a(iz.f, epg.a, epr.e, $$3.a(d).a(f).a(b)).a(iz.e, epg.a, epr.e, $$3.a(d).a(h).a(b)).a(iz.d, epg.a, epr.e, $$3.a(d).a(g).a(b)).a(iz.c, epg.a, epr.e, $$3.a(d).a(b)).a(iz.f, epg.a, epr.d, $$3.a(d).a(b)).a(iz.e, epg.a, epr.d, $$3.a(d).a(g).a(b)).a(iz.d, epg.a, epr.d, $$3.a(d).a(f).a(b)).a(iz.c, epg.a, epr.d, $$3.a(d).a(h).a(b)).a(iz.f, epg.a, epr.c, $$1.a(d).a(f).a(b)).a(iz.e, epg.a, epr.c, $$1.a(d).a(h).a(b)).a(iz.d, epg.a, epr.c, $$1.a(d).a(g).a(b)).a(iz.c, epg.a, epr.c, $$1.a(d).a(b)).a(iz.f, epg.a, epr.b, $$1.a(d).a(b)).a(iz.e, epg.a, epr.b, $$1.a(d).a(g).a(b)).a(iz.d, epg.a, epr.b, $$1.a(d).a(f).a(b)).a(iz.c, epg.a, epr.b, $$1.a(d).a(h).a(b)));
    }

    private static gho c(dzq $$0, ghm $$1, ghm $$2, ghm $$3) {
        return ghr.a($$0).a(ghs.a(eox.T, eox.ai, eox.y).a(iz.c, epg.b, false, $$2).a(iz.d, epg.b, false, $$2.a(g)).a(iz.f, epg.b, false, $$2.a(f)).a(iz.e, epg.b, false, $$2.a(h)).a(iz.c, epg.a, false, $$1).a(iz.d, epg.a, false, $$1.a(g)).a(iz.f, epg.a, false, $$1.a(f)).a(iz.e, epg.a, false, $$1.a(h)).a(iz.c, epg.b, true, $$3).a(iz.d, epg.b, true, $$3.a(g)).a(iz.f, epg.b, true, $$3.a(f)).a(iz.e, epg.b, true, $$3.a(h)).a(iz.c, epg.a, true, $$3.a(d).a(g)).a(iz.d, epg.a, true, $$3.a(d)).a(iz.f, epg.a, true, $$3.a(d).a(h)).a(iz.e, epg.a, true, $$3.a(d).a(f)));
    }

    private static gho d(dzq $$0, ghm $$1, ghm $$2, ghm $$3) {
        return ghr.a($$0).a(ghs.a(eox.T, eox.ai, eox.y).a(iz.c, epg.b, false, $$2).a(iz.d, epg.b, false, $$2).a(iz.f, epg.b, false, $$2).a(iz.e, epg.b, false, $$2).a(iz.c, epg.a, false, $$1).a(iz.d, epg.a, false, $$1).a(iz.f, epg.a, false, $$1).a(iz.e, epg.a, false, $$1).a(iz.c, epg.b, true, $$3).a(iz.d, epg.b, true, $$3.a(g)).a(iz.f, epg.b, true, $$3.a(f)).a(iz.e, epg.b, true, $$3.a(h)).a(iz.c, epg.a, true, $$3).a(iz.d, epg.a, true, $$3.a(g)).a(iz.f, epg.a, true, $$3.a(f)).a(iz.e, epg.a, true, $$3.a(h)));
    }

    static ghr a(dzq $$0, ghm $$1) {
        return ghr.a($$0, $$1);
    }

    private static ghs<hqr> c() {
        return ghs.b(eox.K).a(iz.a.b, a).a(iz.a.c, c).a(iz.a.a, c.then(f));
    }

    static gho a(dzq $$0, gib $$1, BiConsumer<amo, ghx> $$2) {
        ghm $$3 = ghh.b(gia.g.a($$0, $$1, $$2));
        ghm $$4 = ghh.b(gia.h.a($$0, $$1, $$2));
        ghm $$5 = ghh.b(gia.i.a($$0, $$1, $$2));
        return ghr.a($$0).a(ghs.a(eox.K).a(iz.a.a, $$3).a(iz.a.b, $$4).a(iz.a.c, $$5));
    }

    static gho b(dzq $$0, ghm $$1) {
        return ghr.a($$0, $$1).a(ghh.c());
    }

    private void c(dzq $$0, ghm $$1) {
        this.i.accept(ghh.b($$0, $$1));
    }

    public void a(dzq $$0, gid.a $$1) {
        ghm $$2 = ghh.b($$1.create($$0, this.k));
        this.i.accept(ghh.b($$0, $$2));
    }

    private void c(dzq $$0, gid.a $$1) {
        ghm $$2 = ghh.b($$1.create($$0, this.k));
        this.i.accept(ghr.a($$0, $$2).a(z));
    }

    static gho c(dzq $$0, ghm $$1, ghm $$2) {
        return ghr.a($$0).a(ghs.a(eox.K).a(iz.a.b, $$1).a(iz.a.c, $$2.a(c)).a(iz.a.a, $$2.a(c).a(f)));
    }

    private void a(dzq $$0, gid.a $$1, gid.a $$2) {
        ghm $$3 = ghh.b($$1.create($$0, this.k));
        ghm $$4 = ghh.b($$2.create($$0, this.k));
        this.i.accept(ghh.c($$0, $$3, $$4));
    }

    private void g(dzq $$0) {
        ghm $$1 = ghh.b(gid.B.create($$0, this.k));
        ghm $$2 = ghh.b(gid.C.create($$0, this.k));
        ghm $$3 = ghh.b(this.a(gid.B, $$0, "_awake"));
        ghm $$4 = ghh.b(this.a(gid.C, $$0, "_awake"));
        ghm $$5 = ghh.b(this.a(gid.B, $$0, "_dormant"));
        ghm $$6 = ghh.b(this.a(gid.C, $$0, "_dormant"));
        this.i.accept(ghr.a($$0).a(ghs.a(eox.K, ebo.c).a(iz.a.b, epb.a, $$1).a(iz.a.c, epb.a, $$2.a(c)).a(iz.a.a, epb.a, $$2.a(c).a(f)).a(iz.a.b, epb.b, $$5).a(iz.a.c, epb.b, $$6.a(c)).a(iz.a.a, epb.b, $$6.a(c).a(f)).a(iz.a.b, epb.c, $$3).a(iz.a.c, epb.c, $$4.a(c)).a(iz.a.a, epb.c, $$4.a(c).a(f))));
    }

    private amo a(gid.a $$0, dzq $$1, String $$22) {
        return $$0.updateTexture($$2 -> $$2.a(gic.i, gib.a($$1, $$22)).a(gic.d, gib.a($$1, "_top" + $$22))).createWithSuffix($$1, $$22, this.k);
    }

    private amo a(dzq $$0, String $$1, ghz $$2, Function<amo, gib> $$3) {
        return $$2.a($$0, $$1, $$3.apply(gib.a($$0, $$1)), this.k);
    }

    static gho d(dzq $$0, ghm $$1, ghm $$2) {
        return ghr.a($$0).a(ghh.a(eox.A, $$2, $$1));
    }

    static gho e(dzq $$0, ghm $$1, ghm $$2, ghm $$3) {
        return ghr.a($$0).a(ghs.a(eox.bm).a(epq.b, $$1).a(epq.a, $$2).a(epq.c, $$3));
    }

    public void a(dzq $$0) {
        this.b($$0, gid.a);
    }

    public void b(dzq $$0, gid.a $$1) {
        this.i.accept(ghh.a($$0, ghh.b($$1.create($$0, this.k))));
    }

    public void a(dzq $$0, gid.a $$1, int $$2) {
        amo $$3 = $$1.create($$0, this.k);
        this.i.accept(ghh.a($$0, ghh.b($$3)));
        this.a($$0, $$3, ghw.a($$2));
    }

    private void d() {
        this.L(dzs.fN);
        amo $$0 = this.a(dlx.gG, dzs.fN);
        this.a(dzs.fN, $$0, ghw.a(-12012264));
    }

    private void h(dzq $$0) {
        amo $$1 = this.a($$0.h(), $$0);
        this.a($$0, $$1, new ggy());
    }

    private a i(dzq $$0) {
        gid $$1 = A.getOrDefault($$0, gid.a.get($$0));
        return new a($$1.b()).a($$0, $$1.a());
    }

    public void a(dzq $$0, dzq $$1, dzq $$2) {
        ghm $$3 = this.g($$1, $$0);
        this.i.accept(ghh.a($$1, $$3));
        this.i.accept(ghh.a($$2, $$3));
        this.b($$1.h());
    }

    void j(dzq $$0) {
        gib $$1 = gib.w($$0);
        ghm $$2 = ghh.b(gia.v.a($$0, $$1, this.k));
        ghm $$3 = ghh.b(gia.w.a($$0, $$1, this.k));
        ghm $$4 = ghh.b(gia.x.a($$0, $$1, this.k));
        ghm $$5 = ghh.b(gia.y.a($$0, $$1, this.k));
        ghm $$6 = ghh.b(gia.z.a($$0, $$1, this.k));
        ghm $$7 = ghh.b(gia.A.a($$0, $$1, this.k));
        ghm $$8 = ghh.b(gia.B.a($$0, $$1, this.k));
        ghm $$9 = ghh.b(gia.C.a($$0, $$1, this.k));
        this.b($$0.h());
        this.i.accept(ghh.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
    }

    private void b(dzq $$0, dzq $$1) {
        ghm $$2 = ghh.b(gia.v.a($$0));
        ghm $$3 = ghh.b(gia.w.a($$0));
        ghm $$4 = ghh.b(gia.x.a($$0));
        ghm $$5 = ghh.b(gia.y.a($$0));
        ghm $$6 = ghh.b(gia.z.a($$0));
        ghm $$7 = ghh.b(gia.A.a($$0));
        ghm $$8 = ghh.b(gia.B.a($$0));
        ghm $$9 = ghh.b(gia.C.a($$0));
        this.j.a($$0.h(), $$1.h());
        this.i.accept(ghh.a($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
    }

    void k(dzq $$0) {
        gib $$1 = gib.b($$0);
        ghm $$2 = ghh.b(gia.ak.a($$0, $$1, this.k));
        amo $$3 = gia.al.a($$0, $$1, this.k);
        ghm $$4 = ghh.b(gia.am.a($$0, $$1, this.k));
        this.i.accept(ghh.c($$0, $$2, ghh.b($$3), $$4));
        this.a($$0, $$3);
    }

    void l(dzq $$0) {
        gib $$1 = gib.b($$0);
        ghm $$2 = ghh.b(gia.ah.a($$0, $$1, this.k));
        amo $$3 = gia.ai.a($$0, $$1, this.k);
        ghm $$4 = ghh.b(gia.aj.a($$0, $$1, this.k));
        this.i.accept(ghh.d($$0, $$2, ghh.b($$3), $$4));
        this.a($$0, $$3);
    }

    private void c(dzq $$0, dzq $$1) {
        ghm $$2 = ghh.b(gia.ah.a($$0));
        ghm $$3 = ghh.b(gia.ai.a($$0));
        ghm $$4 = ghh.b(gia.aj.a($$0));
        this.j.a($$0.h(), $$1.h());
        this.i.accept(ghh.d($$1, $$2, $$3, $$4));
    }

    private void e() {
        ghm $$0 = ghh.b(ghy.a(dzs.uc));
        ghm $$1 = ghh.b(ghy.a(dzs.uc, "_partial_tilt"));
        ghm $$2 = ghh.b(ghy.a(dzs.uc, "_full_tilt"));
        this.i.accept(ghr.a(dzs.uc).a(ghs.a(eox.bq).a(epu.a, $$0).a(epu.b, $$0).a(epu.c, $$1).a(epu.d, $$2)).a(z));
    }

    private e m(dzq $$0) {
        return new e(gib.q($$0));
    }

    private void n(dzq $$0) {
        this.d($$0, $$0);
    }

    private void d(dzq $$0, dzq $$1) {
        this.i.accept(ghh.a($$0, ghh.b(ghy.a($$1))));
    }

    private void a(dzq $$0, d $$1) {
        this.a($$0.h(), $$1.a(this, $$0));
        this.b($$0, $$1);
    }

    private void a(dzq $$0, d $$1, gib $$2) {
        this.c($$0);
        this.b($$0, $$1, $$2);
    }

    private void b(dzq $$0, d $$1) {
        gib $$2 = $$1.a($$0);
        this.b($$0, $$1, $$2);
    }

    private void b(dzq $$0, d $$1, gib $$2) {
        ghm $$3 = ghh.b($$1.a().a($$0, $$2, this.k));
        this.i.accept(ghh.a($$0, $$3));
    }

    private void a(dzq $$0, d $$1, epk<Integer> $$2, int ... $$32) {
        if ($$2.a().size() != $$32.length) {
            throw new IllegalArgumentException("missing values for property: " + String.valueOf($$2));
        }
        this.b($$0.h());
        this.i.accept(ghr.a($$0).a(ghs.a($$2).a((T1 $$3) -> {
            String $$4 = "_stage" + $$32[$$3];
            gib $$5 = gib.c(gib.a($$0, $$4));
            return ghh.b($$1.a().a($$0, $$4, $$5, this.k));
        })));
    }

    private void a(dzq $$0, dzq $$1, d $$2) {
        this.a($$0.h(), $$2.a(this, $$0));
        this.b($$0, $$1, $$2);
    }

    private void b(dzq $$0, dzq $$1, d $$2) {
        this.b($$0, $$2);
        gib $$3 = $$2.b($$0);
        ghm $$4 = ghh.b($$2.b().a($$1, $$3, this.k));
        this.i.accept(ghh.a($$1, $$4));
    }

    private void e(dzq $$0, dzq $$1) {
        gid $$2 = gid.u.get($$0);
        ghm $$3 = ghh.b($$2.a($$0, this.k));
        this.i.accept(ghh.a($$0, $$3));
        ghm $$4 = ghh.b(gia.aJ.a($$1, $$2.b(), this.k));
        this.i.accept(ghr.a($$1, $$4).a(z));
        this.c($$0);
    }

    private void f(dzq $$0, dzq $$1) {
        this.b($$0.h());
        gib $$22 = gib.k($$0);
        gib $$3 = gib.a($$0, $$1);
        ghm $$4 = ghh.b(gia.bi.a($$1, $$3, this.k));
        this.i.accept(ghr.a($$1, $$4).a(ghs.b(eox.T).a(iz.e, a).a(iz.d, h).a(iz.c, f).a(iz.f, g)));
        this.i.accept(ghr.a($$0).a(ghs.a(eox.az).a((T1 $$2) -> ghh.b(gia.bh[$$2].a($$0, $$22, this.k)))));
    }

    private void f() {
        dzq $$0 = dzs.ly;
        this.b($$0.h());
        ghm $$1 = ghh.b(ghy.a($$0, "_top"));
        ghm $$2 = ghh.b(ghy.a($$0, "_bottom"));
        this.e($$0, $$1, $$2);
    }

    private void g() {
        dzq $$0 = dzs.lx;
        this.b($$0.h());
        this.i.accept(ghr.a($$0).a(ghs.a(efn.e, eox.ah).a((T1 $$1, T2 $$2) -> switch ($$2) {
            default -> throw new MatchException(null, null);
            case epd.a -> ghh.b(ghy.a($$0, "_top_stage_" + $$1));
            case epd.b -> ghh.b(ghy.a($$0, "_bottom_stage_" + $$1));
        })));
    }

    private void a(dzq $$0, dzq $$1, dzq $$2, dzq $$3, dzq $$4, dzq $$5, dzq $$6, dzq $$7) {
        this.a($$0, ghh$d.b);
        this.a($$1, ghh$d.b);
        this.a($$2);
        this.a($$3);
        this.e($$4, $$6);
        this.e($$5, $$7);
    }

    private void c(dzq $$0, d $$1) {
        ghm $$2 = ghh.b(this.a($$0, "_top", $$1.a(), gib::c));
        ghm $$3 = ghh.b(this.a($$0, "_bottom", $$1.a(), gib::c));
        this.e($$0, $$2, $$3);
    }

    private void d(dzq $$0, d $$1) {
        this.a($$0, "_top");
        this.c($$0, $$1);
    }

    private void o(dzq $$0) {
        amo $$1 = this.a($$0.h(), $$0, "_top");
        this.a($$0, $$1, new ggy());
        this.c($$0, ghh$d.a);
    }

    private void h() {
        this.a(dzs.jv, "_front");
        ghm $$0 = ghh.b(ghy.a(dzs.jv, "_top"));
        ghm $$1 = ghh.b(this.a(dzs.jv, "_bottom", ghh$d.b.a(), gib::c));
        this.e(dzs.jv, $$0, $$1);
    }

    private void i() {
        ghm $$0 = ghh.b(this.a(dzs.bH, "_top", gia.bJ, gib::a));
        ghm $$1 = ghh.b(this.a(dzs.bH, "_bottom", gia.bJ, gib::a));
        this.e(dzs.bH, $$0, $$1);
    }

    private void j() {
        ghm $$0 = ghh.b(ghy.a(dzs.ue, "_top"));
        ghm $$1 = ghh.b(ghy.a(dzs.ue, "_bottom"));
        this.i.accept(ghr.a(dzs.ue).a(ghs.a(eox.ah).a(epd.b, $$1).a(epd.a, $$0)).a(z));
    }

    private void e(dzq $$0, ghm $$1, ghm $$2) {
        this.i.accept(ghr.a($$0).a(ghs.a(eox.ah).a(epd.b, $$2).a(epd.a, $$1)));
    }

    private void p(dzq $$0) {
        gib $$1 = gib.h($$0);
        gib $$2 = gib.e(gib.a($$0, "_corner"));
        ghm $$3 = ghh.b(gia.au.a($$0, $$1, this.k));
        ghm $$4 = ghh.b(gia.av.a($$0, $$2, this.k));
        ghm $$5 = ghh.b(gia.aw.a($$0, $$1, this.k));
        ghm $$6 = ghh.b(gia.ax.a($$0, $$1, this.k));
        this.c($$0);
        this.i.accept(ghr.a($$0).a(ghs.a(eox.ak).a(epl.a, $$3).a(epl.b, $$3.a(f)).a(epl.c, $$5.a(f)).a(epl.d, $$6.a(f)).a(epl.e, $$5).a(epl.f, $$6).a(epl.g, $$4).a(epl.h, $$4.a(f)).a(epl.i, $$4.a(g)).a(epl.j, $$4.a(h))));
    }

    private void q(dzq $$0) {
        ghm $$1 = ghh.b(this.a($$0, "", gia.au, gib::e));
        ghm $$2 = ghh.b(this.a($$0, "", gia.aw, gib::e));
        ghm $$3 = ghh.b(this.a($$0, "", gia.ax, gib::e));
        ghm $$4 = ghh.b(this.a($$0, "_on", gia.au, gib::e));
        ghm $$5 = ghh.b(this.a($$0, "_on", gia.aw, gib::e));
        ghm $$62 = ghh.b(this.a($$0, "_on", gia.ax, gib::e));
        this.c($$0);
        this.i.accept(ghr.a($$0).a(ghs.a(eox.A, eox.al).a((T1 $$6, T2 $$7) -> switch ($$7) {
            case epl.a -> {
                if ($$6.booleanValue()) {
                    yield $$4;
                }
                yield $$1;
            }
            case epl.b -> ($$6 != false ? $$4 : $$1).a(f);
            case epl.c -> ($$6 != false ? $$5 : $$2).a(f);
            case epl.d -> ($$6 != false ? $$62 : $$3).a(f);
            case epl.e -> {
                if ($$6.booleanValue()) {
                    yield $$5;
                }
                yield $$2;
            }
            case epl.f -> {
                if ($$6.booleanValue()) {
                    yield $$62;
                }
                yield $$3;
            }
            default -> throw new UnsupportedOperationException("Fix you generator!");
        })));
    }

    private void a(dzq $$0, dlp $$1) {
        ghm $$2 = ghh.b(gia.aa.a($$0, gib.a($$1), this.k));
        this.i.accept(ghh.a($$0, $$2));
    }

    private void b(dzq $$0, amo $$1) {
        ghm $$2 = ghh.b(gia.aa.a($$0, gib.h($$1), this.k));
        this.i.accept(ghh.a($$0, $$2));
    }

    private ghm g(dzq $$0, dzq $$1) {
        return ghh.b(gia.aa.a($$0, gib.x($$1), this.k));
    }

    public void a(dzq $$0, dzq $$1) {
        this.i.accept(ghh.a($$0, this.g($$0, $$1)));
    }

    private void r(dzq $$0) {
        this.a($$0, $$0);
    }

    private void h(dzq $$0, dzq $$1) {
        this.a($$0);
        ghm $$2 = ghh.b(gid.j.get($$0).a($$1, this.k));
        this.i.accept(ghh.a($$1, $$2));
    }

    private void s(dzq $$0) {
        ghm $$1 = ghh.b(gid.p.create($$0, this.k));
        ghm $$2 = ghh.b(gid.q.create($$0, this.k));
        ghm $$3 = ghh.b(gid.r.create($$0, this.k));
        ghm $$4 = ghh.b(gid.s.create($$0, this.k));
        this.b($$0.h());
        this.a($$0, $$1, q, $$2, r, $$3, s, $$4, t);
    }

    private void t(dzq $$0) {
        ghm $$1 = ghh.b(gid.l.create($$0, this.k));
        ghm $$2 = ghh.b(gid.m.create($$0, this.k));
        ghm $$3 = ghh.b(gid.n.create($$0, this.k));
        ghm $$4 = ghh.b(gid.o.create($$0, this.k));
        this.b($$0.h());
        this.a($$0, $$1, m, $$2, n, $$3, o, $$4, p);
    }

    private void a(dzq $$0, ghm $$1, Function<ghp, ghp> $$2, ghm $$3, Function<ghp, ghp> $$4, ghm $$5, Function<ghp, ghp> $$6, ghm $$7, Function<ghp, ghp> $$8) {
        this.i.accept(ghq.a($$0).a($$2.apply(ghh.b().a(eox.T, iz.c)), $$1).a($$2.apply(ghh.b().a(eox.T, iz.f)), $$1.a(f)).a($$2.apply(ghh.b().a(eox.T, iz.d)), $$1.a(g)).a($$2.apply(ghh.b().a(eox.T, iz.e)), $$1.a(h)).a($$4.apply(ghh.b().a(eox.T, iz.c)), $$3).a($$4.apply(ghh.b().a(eox.T, iz.f)), $$3.a(f)).a($$4.apply(ghh.b().a(eox.T, iz.d)), $$3.a(g)).a($$4.apply(ghh.b().a(eox.T, iz.e)), $$3.a(h)).a($$6.apply(ghh.b().a(eox.T, iz.c)), $$5).a($$6.apply(ghh.b().a(eox.T, iz.f)), $$5.a(f)).a($$6.apply(ghh.b().a(eox.T, iz.d)), $$5.a(g)).a($$6.apply(ghh.b().a(eox.T, iz.e)), $$5.a(h)).a($$8.apply(ghh.b().a(eox.T, iz.c)), $$7).a($$8.apply(ghh.b().a(eox.T, iz.f)), $$7.a(f)).a($$8.apply(ghh.b().a(eox.T, iz.d)), $$7.a(g)).a($$8.apply(ghh.b().a(eox.T, iz.e)), $$7.a(h)));
    }

    private void a(gid.a $$0, dzq ... $$1) {
        for (dzq $$2 : $$1) {
            hqq $$3 = ghh.a($$0.create($$2, this.k));
            this.i.accept(ghr.a($$2, ghh.b($$3)));
        }
    }

    private void b(gid.a $$0, dzq ... $$1) {
        for (dzq $$2 : $$1) {
            ghm $$3 = ghh.b($$0.create($$2, this.k));
            this.i.accept(ghr.a($$2, $$3).a(y));
        }
    }

    private void i(dzq $$0, dzq $$1) {
        this.a($$0);
        gib $$2 = gib.b($$0, $$1);
        ghm $$3 = ghh.b(gia.aP.a($$1, $$2, this.k));
        ghm $$4 = ghh.b(gia.aQ.a($$1, $$2, this.k));
        ghm $$5 = ghh.b(gia.aR.a($$1, $$2, this.k));
        ghm $$6 = ghh.b(gia.aN.a($$1, $$2, this.k));
        ghm $$7 = ghh.b(gia.aO.a($$1, $$2, this.k));
        dlp $$8 = $$1.h();
        this.a($$8, this.a($$8, $$0));
        this.i.accept(ghq.a($$1).a($$3).a(ghh.b().a(eox.N, true), $$4).a(ghh.b().a(eox.O, true), $$4.a(f)).a(ghh.b().a(eox.P, true), $$5).a(ghh.b().a(eox.Q, true), $$5.a(f)).a(ghh.b().a(eox.N, false), $$6).a(ghh.b().a(eox.O, false), $$7).a(ghh.b().a(eox.P, false), $$7.a(f)).a(ghh.b().a(eox.Q, false), $$6.a(h)));
    }

    private void u(dzq $$0) {
        gib $$12 = gib.C($$0);
        ghm $$2 = ghh.b(gia.aS.a($$0, $$12, this.k));
        ghm $$3 = ghh.b(this.a($$0, "_conditional", gia.aS, (amo $$1) -> $$12.c(gic.i, (amo)$$1)));
        this.i.accept(ghr.a($$0).a(ghh.a(eox.f, $$3, $$2)).a(v));
    }

    private void v(dzq $$0) {
        ghm $$1 = ghh.b(gid.v.create($$0, this.k));
        this.i.accept(ghh.a($$0, $$1).a(y));
    }

    private static ghm a(int $$0) {
        String $$12 = "_age" + $$0;
        return new ghm(cbn.a(IntStream.range(1, 5).mapToObj($$1 -> new cbm<hqq>(ghh.a(ghy.a(dzs.nW, $$1 + $$12)), 1)).collect(Collectors.toList())));
    }

    private void k() {
        this.i.accept(ghq.a(dzs.nW).a(ghh.b().a(eox.au, 0), ghh.a(0)).a(ghh.b().a(eox.au, 1), ghh.a(1)).a(ghh.b().a(eox.bp, eot.b), ghh.b(ghy.a(dzs.nW, "_small_leaves"))).a(ghh.b().a(eox.bp, eot.c), ghh.b(ghy.a(dzs.nW, "_large_leaves"))));
    }

    private void l() {
        amo $$0 = gib.a(dzs.oR, "_top_open");
        ghm $$12 = ghh.b(gid.f.create(dzs.oR, this.k));
        ghm $$2 = ghh.b(gid.f.get(dzs.oR).a((gib $$1) -> $$1.a(gic.f, $$0)).a(dzs.oR, "_open", this.k));
        this.i.accept(ghr.a(dzs.oR).a(ghs.a(eox.y).a(false, $$12).a(true, $$2)).a(w));
    }

    private static <T extends Comparable<T>> ghs<ghm> a(epk<T> $$0, T $$1, ghm $$2, ghm $$32) {
        return ghs.a($$0).a((T1 $$3) -> {
            boolean $$4 = $$3.compareTo($$1) >= 0;
            return $$4 ? $$2 : $$32;
        });
    }

    private void a(dzq $$0, Function<dzq, gib> $$1) {
        gib $$2 = $$1.apply($$0).b(gic.i, gic.c);
        gib $$3 = $$2.c(gic.g, gib.a($$0, "_front_honey"));
        amo $$4 = gia.q.a($$0, "_empty", $$2, this.k);
        amo $$5 = gia.q.a($$0, "_honey", $$3, this.k);
        this.j.a($$0.h(), ghw.a(dzk.c, ghw.a($$4), Map.of(5, ghw.a($$5))));
        this.i.accept(ghr.a($$0).a(ghh.a(dzk.c, Integer.valueOf(5), ghh.b($$5), ghh.b($$4))).a(z));
    }

    private void a(dzq $$0, epk<Integer> $$1, int ... $$2) {
        this.b($$0.h());
        if ($$1.a().size() != $$2.length) {
            throw new IllegalArgumentException();
        }
        Int2ObjectOpenHashMap $$3 = new Int2ObjectOpenHashMap();
        this.i.accept(ghr.a($$0).a(ghs.a($$1).a(arg_0 -> this.a($$2, (Int2ObjectMap)$$3, $$0, arg_0))));
    }

    private void m() {
        ghm $$0 = ghh.b(ghy.a(dzs.pa, "_floor"));
        ghm $$1 = ghh.b(ghy.a(dzs.pa, "_ceiling"));
        ghm $$2 = ghh.b(ghy.a(dzs.pa, "_wall"));
        ghm $$3 = ghh.b(ghy.a(dzs.pa, "_between_walls"));
        this.b(dlx.yW);
        this.i.accept(ghr.a(dzs.pa).a(ghs.a(eox.T, eox.Y).a(iz.c, eov.a, $$0).a(iz.d, eov.a, $$0.a(g)).a(iz.f, eov.a, $$0.a(f)).a(iz.e, eov.a, $$0.a(h)).a(iz.c, eov.b, $$1).a(iz.d, eov.b, $$1.a(g)).a(iz.f, eov.b, $$1.a(f)).a(iz.e, eov.b, $$1.a(h)).a(iz.c, eov.c, $$2.a(h)).a(iz.d, eov.c, $$2.a(f)).a(iz.f, eov.c, $$2).a(iz.e, eov.c, $$2.a(g)).a(iz.d, eov.d, $$3.a(f)).a(iz.c, eov.d, $$3.a(h)).a(iz.f, eov.d, $$3).a(iz.e, eov.d, $$3.a(g))));
    }

    private void n() {
        this.i.accept(ghr.a(dzs.oW, ghh.b(ghy.a(dzs.oW))).a(ghs.b(eox.X, eox.T).a(eos.a, iz.c, a).a(eos.a, iz.f, f).a(eos.a, iz.d, g).a(eos.a, iz.e, h).a(eos.b, iz.c, c).a(eos.b, iz.f, c.then(f)).a(eos.b, iz.d, c.then(g)).a(eos.b, iz.e, c.then(h)).a(eos.c, iz.d, d).a(eos.c, iz.e, d.then(f)).a(eos.c, iz.c, d.then(g)).a(eos.c, iz.f, d.then(h))));
    }

    private void d(dzq $$0, gid.a $$12) {
        ghm $$2 = ghh.b($$12.create($$0, this.k));
        amo $$3 = gib.a($$0, "_front_on");
        ghm $$4 = ghh.b($$12.get($$0).a((gib $$1) -> $$1.a(gic.g, $$3)).a($$0, "_on", this.k));
        this.i.accept(ghr.a($$0).a(ghh.a(eox.u, $$4, $$2)).a(z));
    }

    private void a(dzq ... $$0) {
        ghm $$1 = ghh.b(ghy.a("campfire_off"));
        for (dzq $$2 : $$0) {
            ghm $$3 = ghh.b(gia.bq.a($$2, gib.H($$2), this.k));
            this.b($$2.h());
            this.i.accept(ghr.a($$2).a(ghh.a(eox.u, $$3, $$1)).a(y));
        }
    }

    private void w(dzq $$0) {
        ghm $$1 = ghh.b(gia.bT.a($$0, gib.o($$0), this.k));
        this.i.accept(ghh.a($$0, $$1));
    }

    private void x(dzq $$0) {
        ghm $$2;
        if ($$0 == dzs.uI) {
            ghm $$1 = ghh.b(gia.bV.a($$0, gib.p($$0), this.k));
        } else {
            $$2 = ghh.b(gia.bU.a($$0, gib.p($$0), this.k));
        }
        this.i.accept(ghh.a($$0, $$2));
    }

    private void o() {
        gib $$0 = gib.a(gib.K(dzs.cv), gib.K(dzs.n));
        ghm $$1 = ghh.b(gia.j.a(dzs.cv, $$0, this.k));
        this.i.accept(ghh.a(dzs.cv, $$1));
    }

    private void p() {
        this.b(dlx.mB);
        this.i.accept(ghq.a(dzs.cT).a(ghh.a(ghh.b().a(eox.ae, epm.c).a(eox.ad, epm.c).a(eox.af, epm.c).a(eox.ag, epm.c), ghh.b().a(eox.ae, (Comparable)((Object)epm.b), (Comparable[])new epm[]{epm.a}).a(eox.ad, (Comparable)((Object)epm.b), (Comparable[])new epm[]{epm.a}), ghh.b().a(eox.ad, (Comparable)((Object)epm.b), (Comparable[])new epm[]{epm.a}).a(eox.af, (Comparable)((Object)epm.b), (Comparable[])new epm[]{epm.a}), ghh.b().a(eox.af, (Comparable)((Object)epm.b), (Comparable[])new epm[]{epm.a}).a(eox.ag, (Comparable)((Object)epm.b), (Comparable[])new epm[]{epm.a}), ghh.b().a(eox.ag, (Comparable)((Object)epm.b), (Comparable[])new epm[]{epm.a}).a(eox.ae, (Comparable)((Object)epm.b), (Comparable[])new epm[]{epm.a})), ghh.b(ghy.a("redstone_dust_dot"))).a(ghh.b().a(eox.ae, (Comparable)((Object)epm.b), (Comparable[])new epm[]{epm.a}), ghh.b(ghy.a("redstone_dust_side0"))).a(ghh.b().a(eox.af, (Comparable)((Object)epm.b), (Comparable[])new epm[]{epm.a}), ghh.b(ghy.a("redstone_dust_side_alt0"))).a(ghh.b().a(eox.ad, (Comparable)((Object)epm.b), (Comparable[])new epm[]{epm.a}), ghh.b(ghy.a("redstone_dust_side_alt1")).a(h)).a(ghh.b().a(eox.ag, (Comparable)((Object)epm.b), (Comparable[])new epm[]{epm.a}), ghh.b(ghy.a("redstone_dust_side1")).a(h)).a(ghh.b().a(eox.ae, epm.a), ghh.b(ghy.a("redstone_dust_up"))).a(ghh.b().a(eox.ad, epm.a), ghh.b(ghy.a("redstone_dust_up")).a(f)).a(ghh.b().a(eox.af, epm.a), ghh.b(ghy.a("redstone_dust_up")).a(g)).a(ghh.b().a(eox.ag, epm.a), ghh.b(ghy.a("redstone_dust_up")).a(h)));
    }

    private void q() {
        this.b(dlx.mF);
        this.i.accept(ghr.a(dzs.hP).a(ghs.a(eox.bi, eox.A).a(epa.a, false, ghh.b(ghy.a(dzs.hP))).a(epa.a, true, ghh.b(ghy.a(dzs.hP, "_on"))).a(epa.b, false, ghh.b(ghy.a(dzs.hP, "_subtract"))).a(epa.b, true, ghh.b(ghy.a(dzs.hP, "_on_subtract")))).a(y));
    }

    private void r() {
        gib $$0 = gib.a(dzs.kK);
        gib $$1 = gib.a(gib.a(dzs.kx, "_side"), $$0.a(gic.f));
        ghm $$2 = ghh.b(gia.ab.a(dzs.kx, $$1, this.k));
        ghm $$3 = ghh.b(gia.ac.a(dzs.kx, $$1, this.k));
        ghm $$4 = ghh.b(gia.j.b(dzs.kx, "_double", $$1, this.k));
        this.i.accept(ghh.e(dzs.kx, $$2, $$3, $$4));
        this.i.accept(ghh.a(dzs.kK, ghh.b(gia.c.a(dzs.kK, $$0, this.k))));
    }

    private void s() {
        this.b(dlx.uu);
        this.i.accept(ghq.a(dzs.gh).a(ghh.b(gib.K(dzs.gh))).a(ghh.b().a(eox.n, true), ghh.b(gib.a(dzs.gh, "_bottle0"))).a(ghh.b().a(eox.o, true), ghh.b(gib.a(dzs.gh, "_bottle1"))).a(ghh.b().a(eox.p, true), ghh.b(gib.a(dzs.gh, "_bottle2"))).a(ghh.b().a(eox.n, false), ghh.b(gib.a(dzs.gh, "_empty0"))).a(ghh.b().a(eox.o, false), ghh.b(gib.a(dzs.gh, "_empty1"))).a(ghh.b().a(eox.p, false), ghh.b(gib.a(dzs.gh, "_empty2"))));
    }

    private void y(dzq $$0) {
        ghm $$1 = ghh.b(gia.bP.a($$0, gib.b($$0), this.k));
        ghm $$2 = ghh.b(ghy.a("mushroom_block_inside"));
        this.i.accept(ghq.a($$0).a(ghh.b().a(eox.N, true), $$1).a(ghh.b().a(eox.O, true), $$1.a(f).a(b)).a(ghh.b().a(eox.P, true), $$1.a(g).a(b)).a(ghh.b().a(eox.Q, true), $$1.a(h).a(b)).a(ghh.b().a(eox.L, true), $$1.a(e).a(b)).a(ghh.b().a(eox.M, true), $$1.a(c).a(b)).a(ghh.b().a(eox.N, false), $$2).a(ghh.b().a(eox.O, false), $$2.a(f)).a(ghh.b().a(eox.P, false), $$2.a(g)).a(ghh.b().a(eox.Q, false), $$2.a(h)).a(ghh.b().a(eox.L, false), $$2.a(e)).a(ghh.b().a(eox.M, false), $$2.a(c)));
        this.a($$0, gid.a.createWithSuffix($$0, "_inventory", this.k));
    }

    private void t() {
        this.b(dlx.tF);
        this.i.accept(ghr.a(dzs.eL).a(ghs.a(eox.aC).a(0, ghh.b(ghy.a(dzs.eL))).a(1, ghh.b(ghy.a(dzs.eL, "_slice1"))).a(2, ghh.b(ghy.a(dzs.eL, "_slice2"))).a(3, ghh.b(ghy.a(dzs.eL, "_slice3"))).a(4, ghh.b(ghy.a(dzs.eL, "_slice4"))).a(5, ghh.b(ghy.a(dzs.eL, "_slice5"))).a(6, ghh.b(ghy.a(dzs.eL, "_slice6")))));
    }

    private void u() {
        gib $$0 = new gib().a(gic.c, gib.a(dzs.oU, "_side3")).a(gic.o, gib.K(dzs.t)).a(gic.n, gib.a(dzs.oU, "_top")).a(gic.j, gib.a(dzs.oU, "_side3")).a(gic.l, gib.a(dzs.oU, "_side3")).a(gic.k, gib.a(dzs.oU, "_side1")).a(gic.m, gib.a(dzs.oU, "_side2"));
        this.i.accept(ghh.a(dzs.oU, ghh.b(gia.a.a(dzs.oU, $$0, this.k))));
    }

    private void v() {
        gib $$0 = new gib().a(gic.c, gib.a(dzs.oY, "_front")).a(gic.o, gib.a(dzs.oY, "_bottom")).a(gic.n, gib.a(dzs.oY, "_top")).a(gic.j, gib.a(dzs.oY, "_front")).a(gic.k, gib.a(dzs.oY, "_front")).a(gic.l, gib.a(dzs.oY, "_side")).a(gic.m, gib.a(dzs.oY, "_side"));
        this.i.accept(ghh.a(dzs.oY, ghh.b(gia.a.a(dzs.oY, $$0, this.k))));
    }

    private void a(dzq $$0, dzq $$1, BiFunction<dzq, dzq, gib> $$2) {
        gib $$3 = $$2.apply($$0, $$1);
        this.i.accept(ghh.a($$0, ghh.b(gia.a.a($$0, $$3, this.k))));
    }

    public void b(dzq $$0) {
        gib $$1 = new gib().a(gic.c, gib.a($$0, "_particle")).a(gic.o, gib.a($$0, "_down")).a(gic.n, gib.a($$0, "_up")).a(gic.j, gib.a($$0, "_north")).a(gic.k, gib.a($$0, "_south")).a(gic.l, gib.a($$0, "_east")).a(gic.m, gib.a($$0, "_west"));
        this.i.accept(ghh.a($$0, ghh.b(gia.a.a($$0, $$1, this.k))));
    }

    private void w() {
        gib $$0 = gib.n(dzs.fH);
        this.i.accept(ghh.a(dzs.fH, ghh.b(ghy.a(dzs.fH))));
        this.a(dzs.eJ, $$0);
        this.a(dzs.eK, $$0);
    }

    private void a(dzq $$0, gib $$1) {
        ghm $$2 = ghh.b(gia.p.a($$0, $$1.c(gic.g, gib.K($$0)), this.k));
        this.i.accept(ghr.a($$0, $$2).a(z));
    }

    private void x() {
        this.b(dlx.uv);
        this.n(dzs.gi);
        this.i.accept(ghh.a(dzs.gk, ghh.b(gia.bS.a(dzs.gk, gib.j(gib.a(dzs.K, "_still")), this.k))));
        this.i.accept(ghr.a(dzs.gj).a(ghs.a(eeg.g).a(1, ghh.b(gia.bQ.a(dzs.gj, "_level1", gib.j(gib.a(dzs.J, "_still")), this.k))).a(2, ghh.b(gia.bR.a(dzs.gj, "_level2", gib.j(gib.a(dzs.J, "_still")), this.k))).a(3, ghh.b(gia.bS.a(dzs.gj, "_full", gib.j(gib.a(dzs.J, "_still")), this.k)))));
        this.i.accept(ghr.a(dzs.gl).a(ghs.a(eeg.g).a(1, ghh.b(gia.bQ.a(dzs.gl, "_level1", gib.j(gib.K(dzs.rP)), this.k))).a(2, ghh.b(gia.bR.a(dzs.gl, "_level2", gib.j(gib.K(dzs.rP)), this.k))).a(3, ghh.b(gia.bS.a(dzs.gl, "_full", gib.j(gib.K(dzs.rP)), this.k)))));
    }

    private void y() {
        gib $$0 = gib.b(dzs.lr);
        ghm $$12 = ghh.b(gia.aL.a(dzs.lr, $$0, this.k));
        ghm $$2 = ghh.b(this.a(dzs.lr, "_dead", gia.aL, (amo $$1) -> $$0.c(gic.b, (amo)$$1)));
        this.i.accept(ghr.a(dzs.lr).a(ghh.a(eox.ay, Integer.valueOf(5), $$2, $$12)));
    }

    private void z() {
        ghm $$0 = ghh.b(ghy.a(dzs.uP));
        ghm $$1 = ghh.b(ghy.a(dzs.uP, "_triggered"));
        ghm $$2 = ghh.b(ghy.a(dzs.uP, "_crafting"));
        ghm $$3 = ghh.b(ghy.a(dzs.uP, "_crafting_triggered"));
        this.i.accept(ghr.a(dzs.uP).a(ghs.a(eox.G, ebm.b).a(false, false, $$0).a(true, true, $$3).a(true, false, $$1).a(false, true, $$2)).a(ghs.b(eox.W).a(ghh::a)));
    }

    private void z(dzq $$0) {
        gib $$1 = new gib().a(gic.f, gib.a(dzs.da, "_top")).a(gic.i, gib.a(dzs.da, "_side")).a(gic.g, gib.a($$0, "_front"));
        gib $$2 = new gib().a(gic.i, gib.a(dzs.da, "_top")).a(gic.g, gib.a($$0, "_front_vertical"));
        ghm $$3 = ghh.b(gia.p.a($$0, $$1, this.k));
        ghm $$4 = ghh.b(gia.r.a($$0, $$2, this.k));
        this.i.accept(ghr.a($$0).a(ghs.a(eox.R).a(iz.a, $$4.a(d)).a(iz.b, $$4).a(iz.c, $$3).a(iz.f, $$3.a(f)).a(iz.d, $$3.a(g)).a(iz.e, $$3.a(h))));
    }

    private void A() {
        ghm $$0 = ghh.b(ghy.a(dzs.gn));
        ghm $$1 = ghh.b(ghy.a(dzs.gn, "_filled"));
        this.i.accept(ghr.a(dzs.gn).a(ghs.a(eox.k).a(false, $$0).a(true, $$1)).a(y));
    }

    private void B() {
        ghm $$0 = ghh.b(ghy.a(dzs.lq, "_side"));
        hqq $$1 = ghh.a(ghy.a(dzs.lq, "_noside"));
        hqq $$2 = ghh.a(ghy.a(dzs.lq, "_noside1"));
        hqq $$3 = ghh.a(ghy.a(dzs.lq, "_noside2"));
        hqq $$4 = ghh.a(ghy.a(dzs.lq, "_noside3"));
        hqq $$5 = $$1.a(b);
        hqq $$6 = $$2.a(b);
        hqq $$7 = $$3.a(b);
        hqq $$8 = $$4.a(b);
        this.i.accept(ghq.a(dzs.lq).a(ghh.b().a(eox.N, true), $$0).a(ghh.b().a(eox.O, true), $$0.a(f).a(b)).a(ghh.b().a(eox.P, true), $$0.a(g).a(b)).a(ghh.b().a(eox.Q, true), $$0.a(h).a(b)).a(ghh.b().a(eox.L, true), $$0.a(e).a(b)).a(ghh.b().a(eox.M, true), $$0.a(c).a(b)).a(ghh.b().a(eox.N, false), new ghm(cbn.a(new cbm<hqq>($$1, 2), new cbm<hqq>($$2, 1), new cbm<hqq>($$3, 1), new cbm<hqq>($$4, 1)))).a(ghh.b().a(eox.O, false), new ghm(cbn.a(new cbm<hqq>($$6.a(f), 1), new cbm<hqq>($$7.a(f), 1), new cbm<hqq>($$8.a(f), 1), new cbm<hqq>($$5.a(f), 2)))).a(ghh.b().a(eox.P, false), new ghm(cbn.a(new cbm<hqq>($$7.a(g), 1), new cbm<hqq>($$8.a(g), 1), new cbm<hqq>($$5.a(g), 2), new cbm<hqq>($$6.a(g), 1)))).a(ghh.b().a(eox.Q, false), new ghm(cbn.a(new cbm<hqq>($$8.a(h), 1), new cbm<hqq>($$5.a(h), 2), new cbm<hqq>($$6.a(h), 1), new cbm<hqq>($$7.a(h), 1)))).a(ghh.b().a(eox.L, false), new ghm(cbn.a(new cbm<hqq>($$5.a(e), 2), new cbm<hqq>($$8.a(e), 1), new cbm<hqq>($$6.a(e), 1), new cbm<hqq>($$7.a(e), 1)))).a(ghh.b().a(eox.M, false), new ghm(cbn.a(new cbm<hqq>($$8.a(c), 1), new cbm<hqq>($$7.a(c), 1), new cbm<hqq>($$6.a(c), 1), new cbm<hqq>($$5.a(c), 2)))));
    }

    private void C() {
        this.i.accept(ghq.a(dzs.qc).a(ghh.b(gib.K(dzs.qc))).a(ghh.b().a(eox.aP, 1), ghh.b(gib.a(dzs.qc, "_contents1"))).a(ghh.b().a(eox.aP, 2), ghh.b(gib.a(dzs.qc, "_contents2"))).a(ghh.b().a(eox.aP, 3), ghh.b(gib.a(dzs.qc, "_contents3"))).a(ghh.b().a(eox.aP, 4), ghh.b(gib.a(dzs.qc, "_contents4"))).a(ghh.b().a(eox.aP, 5), ghh.b(gib.a(dzs.qc, "_contents5"))).a(ghh.b().a(eox.aP, 6), ghh.b(gib.a(dzs.qc, "_contents6"))).a(ghh.b().a(eox.aP, 7), ghh.b(gib.a(dzs.qc, "_contents7"))).a(ghh.b().a(eox.aP, 8), ghh.b(gib.a(dzs.qc, "_contents_ready"))));
    }

    private void A(dzq $$0) {
        ghm $$1 = ghh.b(gia.c.a($$0, gib.a($$0), this.k));
        ghm $$2 = ghh.b(this.a($$0, "_powered", gia.c, gib::b));
        ghm $$3 = ghh.b(this.a($$0, "_lit", gia.c, gib::b));
        ghm $$4 = ghh.b(this.a($$0, "_lit_powered", gia.c, gib::b));
        this.i.accept(ghh.a($$0, $$1, $$3, $$2, $$4));
    }

    private static gho a(dzq $$0, ghm $$1, ghm $$2, ghm $$3, ghm $$42) {
        return ghr.a($$0).a(ghs.a(eox.u, eox.A).a((T1 $$4, T2 $$5) -> {
            if ($$4.booleanValue()) {
                return $$5 != false ? $$42 : $$2;
            }
            return $$5 != false ? $$3 : $$1;
        }));
    }

    private void j(dzq $$0, dzq $$1) {
        ghm $$2 = ghh.b(ghy.a($$0));
        ghm $$3 = ghh.b(ghy.a($$0, "_powered"));
        ghm $$4 = ghh.b(ghy.a($$0, "_lit"));
        ghm $$5 = ghh.b(ghy.a($$0, "_lit_powered"));
        this.j.a($$0.h(), $$1.h());
        this.i.accept(ghh.a($$1, $$2, $$4, $$3, $$5));
    }

    private void B(dzq $$0) {
        ghm $$1 = ghh.b(gia.ao.a($$0, gib.c($$0), this.k));
        this.i.accept(ghr.a($$0, $$1).a(w));
    }

    private void D() {
        this.B(dzs.ry);
        this.B(dzs.rx);
        this.B(dzs.rw);
        this.B(dzs.rv);
    }

    private void E() {
        ghs.b<ghm, iz, epe> $$0 = ghs.a(eox.br, eox.bs);
        for (epe $$1 : epe.values()) {
            $$0.a(iz.b, $$1, this.a(iz.b, $$1));
        }
        for (epe $$2 : epe.values()) {
            $$0.a(iz.a, $$2, this.a(iz.a, $$2));
        }
        this.i.accept(ghr.a(dzs.tQ).a($$0));
    }

    private ghm a(iz $$0, epe $$1) {
        String $$2 = "_" + $$0.c() + "_" + $$1.c();
        gib $$3 = gib.c(gib.a(dzs.tQ, $$2));
        return ghh.b(gia.an.a(dzs.tQ, $$2, $$3, this.k));
    }

    private void C(dzq $$0) {
        gib $$1 = new gib().a(gic.e, gib.K(dzs.ey)).a(gic.f, gib.K($$0)).a(gic.i, gib.a($$0, "_side"));
        this.i.accept(ghh.a($$0, ghh.b(gia.n.a($$0, $$1, this.k))));
    }

    private void F() {
        amo $$0 = gib.a(dzs.hQ, "_side");
        gib $$1 = new gib().a(gic.f, gib.a(dzs.hQ, "_top")).a(gic.i, $$0);
        gib $$2 = new gib().a(gic.f, gib.a(dzs.hQ, "_inverted_top")).a(gic.i, $$0);
        this.i.accept(ghr.a(dzs.hQ).a(ghs.a(eox.s).a(false, ghh.b(gia.aM.a(dzs.hQ, $$1, this.k))).a(true, ghh.b(gia.aM.a(ghy.a(dzs.hQ, "_inverted"), $$2, this.k)))));
    }

    private void D(dzq $$0) {
        this.i.accept(ghr.a($$0, ghh.b(ghy.a($$0))).a(w));
    }

    private void k(dzq $$0, dzq $$1) {
        ghm $$2 = ghh.b(ghy.a(dzs.tI, "_on"));
        ghm $$3 = ghh.b(gia.ct.a($$0, gib.b($$0), this.k));
        this.i.accept(ghr.a($$0).a(ghh.a(eox.A, $$2, $$3)).a(w));
        this.i.accept(ghr.a($$1).a(ghh.a(eox.A, $$2, $$3)).a(w));
        this.j.a($$0.h(), $$1.h());
    }

    private void G() {
        gib $$0 = new gib().a(gic.C, gib.K(dzs.j)).a(gic.f, gib.K(dzs.cZ));
        gib $$1 = new gib().a(gic.C, gib.K(dzs.j)).a(gic.f, gib.a(dzs.cZ, "_moist"));
        ghm $$2 = ghh.b(gia.bk.a(dzs.cZ, $$0, this.k));
        ghm $$3 = ghh.b(gia.bk.a(gib.a(dzs.cZ, "_moist"), $$1, this.k));
        this.i.accept(ghr.a(dzs.cZ).a(ghh.a(eox.aU, Integer.valueOf(7), $$3, $$2)));
    }

    private ghm E(dzq $$0) {
        return ghh.a(new hqq[]{ghh.a(gia.bl.a(ghy.a($$0, "_floor0"), gib.y($$0), this.k)), ghh.a(gia.bl.a(ghy.a($$0, "_floor1"), gib.z($$0), this.k))});
    }

    private ghm F(dzq $$0) {
        return ghh.a(ghh.a(gia.bm.a(ghy.a($$0, "_side0"), gib.y($$0), this.k)), ghh.a(gia.bm.a(ghy.a($$0, "_side1"), gib.z($$0), this.k)), ghh.a(gia.bn.a(ghy.a($$0, "_side_alt0"), gib.y($$0), this.k)), ghh.a(gia.bn.a(ghy.a($$0, "_side_alt1"), gib.z($$0), this.k)));
    }

    private ghm G(dzq $$0) {
        return ghh.a(ghh.a(gia.bo.a(ghy.a($$0, "_up0"), gib.y($$0), this.k)), ghh.a(gia.bo.a(ghy.a($$0, "_up1"), gib.z($$0), this.k)), ghh.a(gia.bp.a(ghy.a($$0, "_up_alt0"), gib.y($$0), this.k)), ghh.a(gia.bp.a(ghy.a($$0, "_up_alt1"), gib.z($$0), this.k)));
    }

    private void H() {
        ghp $$0 = ghh.b().a(eox.N, false).a(eox.O, false).a(eox.P, false).a(eox.Q, false).a(eox.L, false);
        ghm $$1 = this.E(dzs.cN);
        ghm $$2 = this.F(dzs.cN);
        ghm $$3 = this.G(dzs.cN);
        this.i.accept(ghq.a(dzs.cN).a($$0, $$1).a(ghh.a(ghh.b().a(eox.N, true), $$0), $$2).a(ghh.a(ghh.b().a(eox.O, true), $$0), $$2.a(f)).a(ghh.a(ghh.b().a(eox.P, true), $$0), $$2.a(g)).a(ghh.a(ghh.b().a(eox.Q, true), $$0), $$2.a(h)).a(ghh.b().a(eox.L, true), $$3));
    }

    private void I() {
        ghm $$0 = this.E(dzs.cO);
        ghm $$1 = this.F(dzs.cO);
        this.i.accept(ghq.a(dzs.cO).a($$0).a($$1).a($$1.a(f)).a($$1.a(g)).a($$1.a(h)));
    }

    private void H(dzq $$0) {
        ghm $$1 = ghh.b(gid.x.create($$0, this.k));
        ghm $$2 = ghh.b(gid.y.create($$0, this.k));
        this.b($$0.h());
        this.i.accept(ghr.a($$0).a(ghh.a(eox.m, $$2, $$1)));
    }

    private void l(dzq $$0, dzq $$1) {
        amo $$2 = gid.x.create($$0, this.k);
        amo $$3 = gid.y.create($$0, this.k);
        this.b($$0.h());
        this.j.a($$0.h(), $$1.h());
        this.i.accept(ghr.a($$0).a(ghh.a(eox.m, ghh.b($$3), ghh.b($$2))));
        this.i.accept(ghr.a($$1).a(ghh.a(eox.m, ghh.b($$3), ghh.b($$2))));
    }

    private void m(dzq $$0, dzq $$1) {
        ghm $$2 = ghh.b(gid.z.create($$0, this.k));
        this.c($$0, $$2);
        this.c($$1, $$2);
    }

    private void J() {
        gib $$0 = gib.a(gib.a(dzs.ah, "_side"), gib.a(dzs.ah, "_top"));
        ghm $$1 = ghh.b(gia.j.a(dzs.ah, $$0, this.k));
        this.i.accept(ghh.b(dzs.ah, $$1));
    }

    private void K() {
        this.b(dlx.af);
        dzq $$0 = dzs.H;
        ghm $$1 = ghh.b(ghy.a($$0));
        this.i.accept(ghr.a(dzs.H).a(ghs.a(eet.d, eet.b).a((T1 $$2, T2 $$3) -> $$2 != false ? ghh.b(ghy.a($$0, "_hanging_" + $$3)) : $$1)));
    }

    private void L() {
        this.i.accept(ghr.a(dzs.lE).a(ghs.a(eox.aw).a(0, ghh.b(this.a(dzs.lE, "_0", gia.c, gib::b))).a(1, ghh.b(this.a(dzs.lE, "_1", gia.c, gib::b))).a(2, ghh.b(this.a(dzs.lE, "_2", gia.c, gib::b))).a(3, ghh.b(this.a(dzs.lE, "_3", gia.c, gib::b)))));
    }

    private void M() {
        amo $$0 = gib.K(dzs.j);
        gib $$12 = new gib().a(gic.e, $$0).b(gic.e, gic.c).a(gic.f, gib.a(dzs.i, "_top")).a(gic.i, gib.a(dzs.i, "_snow"));
        ghm $$2 = ghh.b(gia.n.a(dzs.i, "_snow", $$12, this.k));
        amo $$3 = ghy.a(dzs.i);
        this.f(dzs.i, ghh.b(ghh.a($$3)), $$2);
        this.a(dzs.i, $$3, new ggy());
        ghm $$4 = ghh.b(ghh.a(gid.f.get(dzs.fU).a((gib $$1) -> $$1.a(gic.e, $$0)).a(dzs.fU, this.k)));
        this.f(dzs.fU, $$4, $$2);
        ghm $$5 = ghh.b(ghh.a(gid.f.get(dzs.l).a((gib $$1) -> $$1.a(gic.e, $$0)).a(dzs.l, this.k)));
        this.f(dzs.l, $$5, $$2);
    }

    private void f(dzq $$0, ghm $$1, ghm $$2) {
        this.i.accept(ghr.a($$0).a(ghs.a(eox.E).a(true, $$2).a(false, $$1)));
    }

    private void N() {
        this.b(dlx.tl);
        this.i.accept(ghr.a(dzs.gr).a(ghs.a(eox.av).a(0, ghh.b(ghy.a(dzs.gr, "_stage0"))).a(1, ghh.b(ghy.a(dzs.gr, "_stage1"))).a(2, ghh.b(ghy.a(dzs.gr, "_stage2")))).a(y));
    }

    private void O() {
        hqq $$0 = ghh.a(ghy.a(dzs.lA));
        this.i.accept(ghr.a(dzs.lA, ghh.b($$0)));
    }

    private void n(dzq $$0, dzq $$1) {
        gib $$2 = gib.b($$1);
        ghm $$3 = ghh.b(gia.Y.a($$0, $$2, this.k));
        ghm $$4 = ghh.b(gia.Z.a($$0, $$2, this.k));
        this.i.accept(ghr.a($$0).a(ghh.a(eox.aX, Integer.valueOf(1), $$4, $$3)));
    }

    private void P() {
        ghm $$0 = ghh.b(ghy.a(dzs.hT));
        ghm $$1 = ghh.b(ghy.a(dzs.hT, "_side"));
        this.b(dlx.mL);
        this.i.accept(ghr.a(dzs.hT).a(ghs.a(eox.S).a(iz.a, $$0).a(iz.c, $$1).a(iz.f, $$1.a(f)).a(iz.d, $$1.a(g)).a(iz.e, $$1.a(h))));
    }

    private void o(dzq $$0, dzq $$1) {
        ghm $$2 = ghh.b(ghy.a($$0));
        this.i.accept(ghr.a($$1, $$2));
        this.j.a($$0.h(), $$1.h());
    }

    private void I(dzq $$0) {
        gib $$1 = gib.I($$0);
        this.a($$0, gia.bx.a($$0, $$1, this.k), gia.bw.a($$0, $$1, this.k), gia.bu.a($$0, $$1, this.k), gia.bv.a($$0, $$1, this.k), gia.by.a($$0, $$1, this.k), gia.bz.a($$0, $$1, this.k));
        this.c($$0);
    }

    private void p(dzq $$0, dzq $$1) {
        gib $$2 = gib.I($$0);
        amo $$3 = gia.bx.a($$0, $$2, this.k);
        amo $$4 = gia.bw.a($$0, $$2, this.k);
        amo $$5 = gia.bu.a($$0, $$2, this.k);
        amo $$6 = gia.bv.a($$0, $$2, this.k);
        amo $$7 = gia.by.a($$0, $$2, this.k);
        amo $$8 = gia.bz.a($$0, $$2, this.k);
        this.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
        this.a($$1, $$3, $$4, $$5, $$6, $$7, $$8);
        this.c($$0);
        this.j.a($$0.h(), $$1.h());
    }

    private void a(dzq $$0, amo $$1, amo $$2, amo $$3, amo $$4, amo $$5, amo $$6) {
        ghm $$7 = ghh.b($$1);
        ghm $$8 = ghh.b($$2);
        ghm $$9 = ghh.b($$3);
        ghm $$10 = ghh.b($$4);
        ghm $$11 = ghh.b($$5);
        ghm $$12 = ghh.b($$6);
        this.i.accept(ghq.a($$0).a($$7).a(ghh.b().a(eox.N, false).a(eox.O, false).a(eox.P, false).a(eox.Q, false), $$8).a(ghh.b().a(eox.N, true).a(eox.O, false).a(eox.P, false).a(eox.Q, false), $$9).a(ghh.b().a(eox.N, false).a(eox.O, true).a(eox.P, false).a(eox.Q, false), $$9.a(f)).a(ghh.b().a(eox.N, false).a(eox.O, false).a(eox.P, true).a(eox.Q, false), $$10).a(ghh.b().a(eox.N, false).a(eox.O, false).a(eox.P, false).a(eox.Q, true), $$10.a(f)).a(ghh.b().a(eox.N, true), $$11).a(ghh.b().a(eox.O, true), $$11.a(f)).a(ghh.b().a(eox.P, true), $$12).a(ghh.b().a(eox.Q, true), $$12.a(f)));
    }

    private void J(dzq $$0) {
        this.i.accept(ghr.a($$0, ghh.b(ghy.a($$0))).a(z));
    }

    private void Q() {
        ghm $$0 = ghh.b(ghy.a(dzs.dX));
        ghm $$1 = ghh.b(ghy.a(dzs.dX, "_on"));
        this.c(dzs.dX);
        this.i.accept(ghr.a(dzs.dX).a(ghh.a(eox.A, $$0, $$1)).a(ghs.b(eox.X, eox.T).a(eos.c, iz.c, d.then(g)).a(eos.c, iz.f, d.then(h)).a(eos.c, iz.d, d).a(eos.c, iz.e, d.then(f)).a(eos.a, iz.c, a).a(eos.a, iz.f, f).a(eos.a, iz.d, g).a(eos.a, iz.e, h).a(eos.b, iz.c, c).a(eos.b, iz.f, c.then(f)).a(eos.b, iz.d, c.then(g)).a(eos.b, iz.e, c.then(h))));
    }

    private void R() {
        amo $$0 = this.a(dlx.gT, dzs.fV);
        this.a(dzs.fV, $$0, ghw.a(-9321636));
        hqq $$1 = ghh.a(ghy.a(dzs.fV));
        this.i.accept(ghr.a(dzs.fV, ghh.b($$1)));
    }

    private void S() {
        this.c(dzs.uM);
        this.i.accept(ghh.a(dzs.uM, ghh.b(ghy.a(dzs.uM))));
    }

    private void T() {
        this.i.accept(ghr.a(dzs.eI).a(ghs.a(eox.J).a(iz.a.a, ghh.b(ghy.a(dzs.eI, "_ns"))).a(iz.a.c, ghh.b(ghy.a(dzs.eI, "_ew")))));
    }

    private void U() {
        hqq $$0 = ghh.a(gid.a.create(dzs.ey, this.k));
        this.i.accept(ghr.a(dzs.ey, ghh.a($$0, $$0.a(c), $$0.a(d), $$0.a(e), $$0.a(f), $$0.a(f.then(c)), $$0.a(f.then(d)), $$0.a(f.then(e)), $$0.a(g), $$0.a(g.then(c)), $$0.a(g.then(d)), $$0.a(g.then(e)), $$0.a(h), $$0.a(h.then(c)), $$0.a(h.then(d)), $$0.a(h.then(e)))));
    }

    private void V() {
        ghm $$0 = ghh.b(ghy.a(dzs.lK));
        ghm $$1 = ghh.b(ghy.a(dzs.lK, "_on"));
        this.i.accept(ghr.a(dzs.lK).a(ghh.a(eox.A, $$1, $$0)).a(v));
    }

    private void W() {
        gib $$0 = new gib().a(gic.e, gib.a(dzs.bI, "_bottom")).a(gic.i, gib.a(dzs.bI, "_side"));
        amo $$1 = gib.a(dzs.bI, "_top_sticky");
        amo $$2 = gib.a(dzs.bI, "_top");
        gib $$3 = $$0.c(gic.F, $$1);
        gib $$4 = $$0.c(gic.F, $$2);
        ghm $$5 = ghh.b(ghy.a(dzs.bI, "_base"));
        this.a(dzs.bI, $$5, $$4);
        this.a(dzs.by, $$5, $$3);
        amo $$6 = gia.n.a(dzs.bI, "_inventory", $$0.c(gic.f, $$2), this.k);
        amo $$7 = gia.n.a(dzs.by, "_inventory", $$0.c(gic.f, $$1), this.k);
        this.a(dzs.bI, $$6);
        this.a(dzs.by, $$7);
    }

    private void a(dzq $$0, ghm $$1, gib $$2) {
        ghm $$3 = ghh.b(gia.bG.a($$0, $$2, this.k));
        this.i.accept(ghr.a($$0).a(ghh.a(eox.j, $$1, $$3)).a(v));
    }

    private void X() {
        gib $$0 = new gib().a(gic.G, gib.a(dzs.bI, "_top")).a(gic.i, gib.a(dzs.bI, "_side"));
        gib $$1 = $$0.c(gic.F, gib.a(dzs.bI, "_top_sticky"));
        gib $$2 = $$0.c(gic.F, gib.a(dzs.bI, "_top"));
        this.i.accept(ghr.a(dzs.bJ).a(ghs.a(eox.B, eox.bl).a(false, epj.a, ghh.b(gia.bH.a(dzs.bI, "_head", $$2, this.k))).a(false, epj.b, ghh.b(gia.bH.a(dzs.bI, "_head_sticky", $$1, this.k))).a(true, epj.a, ghh.b(gia.bI.a(dzs.bI, "_head_short", $$2, this.k))).a(true, epj.b, ghh.b(gia.bI.a(dzs.bI, "_head_short_sticky", $$1, this.k)))).a(v));
    }

    private void Y() {
        dzq $$0 = dzs.uQ;
        gib $$1 = gib.a($$0, "_side_inactive", "_top_inactive");
        gib $$2 = gib.a($$0, "_side_active", "_top_active");
        gib $$3 = gib.a($$0, "_side_active", "_top_ejecting_reward");
        gib $$4 = gib.a($$0, "_side_inactive_ominous", "_top_inactive_ominous");
        gib $$5 = gib.a($$0, "_side_active_ominous", "_top_active_ominous");
        gib $$62 = gib.a($$0, "_side_active_ominous", "_top_ejecting_reward_ominous");
        amo $$72 = gia.o.a($$0, $$1, this.k);
        ghm $$8 = ghh.b($$72);
        ghm $$9 = ghh.b(gia.o.a($$0, "_active", $$2, this.k));
        ghm $$10 = ghh.b(gia.o.a($$0, "_ejecting_reward", $$3, this.k));
        ghm $$11 = ghh.b(gia.o.a($$0, "_inactive_ominous", $$4, this.k));
        ghm $$12 = ghh.b(gia.o.a($$0, "_active_ominous", $$5, this.k));
        ghm $$13 = ghh.b(gia.o.a($$0, "_ejecting_reward_ominous", $$62, this.k));
        this.a($$0, $$72);
        this.i.accept(ghr.a($$0).a(ghs.a(eox.bD, eox.bG).a((T1 $$6, T2 $$7) -> switch ($$6) {
            default -> throw new MatchException(null, null);
            case enk.a, enk.f -> {
                if ($$7.booleanValue()) {
                    yield $$11;
                }
                yield $$8;
            }
            case enk.b, enk.c, enk.d -> {
                if ($$7.booleanValue()) {
                    yield $$12;
                }
                yield $$9;
            }
            case enk.e -> $$7 != false ? $$13 : $$10;
        })));
    }

    private void Z() {
        dzq $$0 = dzs.uR;
        gib $$1 = gib.a($$0, "_front_off", "_side_off", "_top", "_bottom");
        gib $$2 = gib.a($$0, "_front_on", "_side_on", "_top", "_bottom");
        gib $$3 = gib.a($$0, "_front_ejecting", "_side_on", "_top", "_bottom");
        gib $$4 = gib.a($$0, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
        amo $$5 = gia.cr.a($$0, $$1, this.k);
        ghm $$6 = ghh.b($$5);
        ghm $$7 = ghh.b(gia.cr.a($$0, "_active", $$2, this.k));
        ghm $$82 = ghh.b(gia.cr.a($$0, "_unlocking", $$3, this.k));
        ghm $$92 = ghh.b(gia.cr.a($$0, "_ejecting_reward", $$4, this.k));
        gib $$10 = gib.a($$0, "_front_off_ominous", "_side_off_ominous", "_top_ominous", "_bottom_ominous");
        gib $$11 = gib.a($$0, "_front_on_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
        gib $$12 = gib.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
        gib $$13 = gib.a($$0, "_front_ejecting_ominous", "_side_on_ominous", "_top_ejecting_ominous", "_bottom_ominous");
        ghm $$14 = ghh.b(gia.cr.a($$0, "_ominous", $$10, this.k));
        ghm $$15 = ghh.b(gia.cr.a($$0, "_active_ominous", $$11, this.k));
        ghm $$16 = ghh.b(gia.cr.a($$0, "_unlocking_ominous", $$12, this.k));
        ghm $$17 = ghh.b(gia.cr.a($$0, "_ejecting_reward_ominous", $$13, this.k));
        this.a($$0, $$5);
        this.i.accept(ghr.a($$0).a(ghs.a(ejf.b, ejf.d).a((T1 $$8, T2 $$9) -> switch ($$8) {
            default -> throw new MatchException(null, null);
            case ens.a -> {
                if ($$9.booleanValue()) {
                    yield $$14;
                }
                yield $$6;
            }
            case ens.b -> {
                if ($$9.booleanValue()) {
                    yield $$15;
                }
                yield $$7;
            }
            case ens.c -> {
                if ($$9.booleanValue()) {
                    yield $$16;
                }
                yield $$82;
            }
            case ens.d -> $$9 != false ? $$17 : $$92;
        })).a(z));
    }

    private void aa() {
        amo $$0 = ghy.a(dzs.rQ, "_inactive");
        ghm $$1 = ghh.b($$0);
        ghm $$22 = ghh.b(ghy.a(dzs.rQ, "_active"));
        this.a(dzs.rQ, $$0);
        this.i.accept(ghr.a(dzs.rQ).a(ghs.a(eox.bt).a((T1 $$2) -> $$2 == epo.b || $$2 == epo.c ? $$22 : $$1)));
    }

    private void ab() {
        amo $$0 = ghy.a(dzs.rR, "_inactive");
        ghm $$1 = ghh.b($$0);
        ghm $$22 = ghh.b(ghy.a(dzs.rR, "_active"));
        this.a(dzs.rR, $$0);
        this.i.accept(ghr.a(dzs.rR).a(ghs.a(eox.bt).a((T1 $$2) -> $$2 == epo.b || $$2 == epo.c ? $$22 : $$1)).a(z));
    }

    private void ac() {
        amo $$0 = gia.cq.a(dzs.rV, gib.a(false), this.k);
        ghm $$1 = ghh.b($$0);
        ghm $$2 = ghh.b(gia.cq.a(dzs.rV, "_can_summon", gib.a(true), this.k));
        this.a(dzs.rV, $$0);
        this.i.accept(ghr.a(dzs.rV).a(ghh.a(eox.e, $$2, $$1)));
    }

    private void ad() {
        amo $$0 = ghy.a(dzs.oP, "_stable");
        ghm $$1 = ghh.b($$0);
        ghm $$2 = ghh.b(ghy.a(dzs.oP, "_unstable"));
        this.a(dzs.oP, $$0);
        this.i.accept(ghr.a(dzs.oP).a(ghh.a(eox.d, $$2, $$1)));
    }

    private void ae() {
        ghm $$0 = ghh.b(this.a(dzs.tS, "", gia.ao, gib::c));
        ghm $$1 = ghh.b(this.a(dzs.tS, "_lit", gia.ao, gib::c));
        this.i.accept(ghr.a(dzs.tS).a(ghh.a(eox.b, $$1, $$0)));
        ghm $$2 = ghh.b(this.a(dzs.tT, "", gia.ao, gib::c));
        ghm $$3 = ghh.b(this.a(dzs.tT, "_lit", gia.ao, gib::c));
        this.i.accept(ghr.a(dzs.tT).a(ghh.a(eox.b, $$3, $$2)));
    }

    private void af() {
        ghm $$0 = ghh.b(gid.a.create(dzs.gq, this.k));
        ghm $$1 = ghh.b(this.a(dzs.gq, "_on", gia.c, gib::b));
        this.i.accept(ghr.a(dzs.gq).a(ghh.a(eox.u, $$1, $$0)));
    }

    private void q(dzq $$0, dzq $$1) {
        gib $$2 = gib.B($$0);
        this.i.accept(ghh.a($$0, ghh.b(gia.bA.a($$0, $$2, this.k))));
        this.i.accept(ghr.a($$1, ghh.b(gia.bC.a($$1, $$2, this.k))).a(x));
        this.c($$0);
    }

    private void ag() {
        gib $$0 = gib.B(dzs.em);
        gib $$1 = gib.i(gib.a(dzs.em, "_off"));
        ghm $$2 = ghh.b(gia.bE.a(dzs.em, $$0, this.k));
        ghm $$3 = ghh.b(gia.bB.a(dzs.em, "_off", $$1, this.k));
        this.i.accept(ghr.a(dzs.em).a(ghh.a(eox.u, $$2, $$3)));
        ghm $$4 = ghh.b(gia.bF.a(dzs.en, $$0, this.k));
        ghm $$5 = ghh.b(gia.bD.a(dzs.en, "_off", $$1, this.k));
        this.i.accept(ghr.a(dzs.en).a(ghh.a(eox.u, $$4, $$5)).a(x));
        this.c(dzs.em);
    }

    private void ah() {
        this.b(dlx.mE);
        this.i.accept(ghr.a(dzs.eM).a(ghs.a(eox.aE, eox.v, eox.A).a((Function3<Integer, Boolean, Boolean, ghm>)((Function3)($$0, $$1, $$2) -> {
            StringBuilder $$3 = new StringBuilder();
            $$3.append('_').append($$0).append("tick");
            if ($$2.booleanValue()) {
                $$3.append("_on");
            }
            if ($$1.booleanValue()) {
                $$3.append("_locked");
            }
            return ghh.b(gib.a(dzs.eM, $$3.toString()));
        }))).a(y));
    }

    private void ai() {
        this.b(dlx.de);
        this.i.accept(ghr.a(dzs.nS).a(ghs.a(eox.aW, eox.I).a(1, false, ghh.b(ghh.a(ghy.a("dead_sea_pickle")))).a(2, false, ghh.b(ghh.a(ghy.a("two_dead_sea_pickles")))).a(3, false, ghh.b(ghh.a(ghy.a("three_dead_sea_pickles")))).a(4, false, ghh.b(ghh.a(ghy.a("four_dead_sea_pickles")))).a(1, true, ghh.b(ghh.a(ghy.a("sea_pickle")))).a(2, true, ghh.b(ghh.a(ghy.a("two_sea_pickles")))).a(3, true, ghh.b(ghh.a(ghy.a("three_sea_pickles")))).a(4, true, ghh.b(ghh.a(ghy.a("four_sea_pickles"))))));
    }

    private void aj() {
        gib $$0 = gib.a(dzs.ep);
        ghm $$12 = ghh.b(gia.c.a(dzs.er, $$0, this.k));
        this.i.accept(ghr.a(dzs.ep).a(ghs.a(eox.aJ).a((T1 $$1) -> $$1 < 8 ? ghh.b(ghy.a(dzs.ep, "_height" + $$1 * 2)) : $$12)));
        this.a(dzs.ep, ghy.a(dzs.ep, "_height2"));
        this.i.accept(ghh.a(dzs.er, $$12));
    }

    private void ak() {
        this.i.accept(ghr.a(dzs.oZ, ghh.b(ghy.a(dzs.oZ))).a(z));
    }

    private void al() {
        amo $$02 = gid.a.create(dzs.pY, this.k);
        this.a(dzs.pY, $$02);
        this.i.accept(ghr.a(dzs.pY).a(ghs.a(eox.bo).a((T1 $$0) -> ghh.b(this.a(dzs.pY, "_" + $$0.c(), gia.c, gib::b)))));
    }

    private void am() {
        HashMap<ept, amo> $$0 = new HashMap<ept, amo>();
        for (ept $$12 : ept.values()) {
            $$0.put($$12, this.a(dzs.qa, "_" + $$12.c(), gia.c, gib::b));
        }
        this.i.accept(ghr.a(dzs.qa).a(ghs.a(eox.bH).a((T1 $$1) -> ghh.b((amo)$$0.get($$1)))));
        this.j.a(dlx.pN, ghw.a(eio.b, ghw.a((amo)$$0.get(ept.a)), Map.of(ept.c, ghw.a((amo)$$0.get(ept.c)), ept.b, ghw.a((amo)$$0.get(ept.b)), ept.d, ghw.a((amo)$$0.get(ept.d)))));
    }

    private void an() {
        this.b(dlx.za);
        this.i.accept(ghr.a(dzs.pg).a(ghs.a(eox.aw).a((T1 $$0) -> ghh.b(this.a(dzs.pg, "_stage" + $$0, gia.ao, gib::c)))));
    }

    private void ao() {
        this.b(dlx.qY);
        this.i.accept(ghr.a(dzs.gx).a(ghs.a(eox.a, eox.O, eox.N, eox.P, eox.Q).a(false, false, false, false, false, ghh.b(ghy.a(dzs.gx, "_ns"))).a(false, true, false, false, false, ghh.b(ghy.a(dzs.gx, "_n")).a(f)).a(false, false, true, false, false, ghh.b(ghy.a(dzs.gx, "_n"))).a(false, false, false, true, false, ghh.b(ghy.a(dzs.gx, "_n")).a(g)).a(false, false, false, false, true, ghh.b(ghy.a(dzs.gx, "_n")).a(h)).a(false, true, true, false, false, ghh.b(ghy.a(dzs.gx, "_ne"))).a(false, true, false, true, false, ghh.b(ghy.a(dzs.gx, "_ne")).a(f)).a(false, false, false, true, true, ghh.b(ghy.a(dzs.gx, "_ne")).a(g)).a(false, false, true, false, true, ghh.b(ghy.a(dzs.gx, "_ne")).a(h)).a(false, false, true, true, false, ghh.b(ghy.a(dzs.gx, "_ns"))).a(false, true, false, false, true, ghh.b(ghy.a(dzs.gx, "_ns")).a(f)).a(false, true, true, true, false, ghh.b(ghy.a(dzs.gx, "_nse"))).a(false, true, false, true, true, ghh.b(ghy.a(dzs.gx, "_nse")).a(f)).a(false, false, true, true, true, ghh.b(ghy.a(dzs.gx, "_nse")).a(g)).a(false, true, true, false, true, ghh.b(ghy.a(dzs.gx, "_nse")).a(h)).a(false, true, true, true, true, ghh.b(ghy.a(dzs.gx, "_nsew"))).a(true, false, false, false, false, ghh.b(ghy.a(dzs.gx, "_attached_ns"))).a(true, false, true, false, false, ghh.b(ghy.a(dzs.gx, "_attached_n"))).a(true, false, false, true, false, ghh.b(ghy.a(dzs.gx, "_attached_n")).a(g)).a(true, true, false, false, false, ghh.b(ghy.a(dzs.gx, "_attached_n")).a(f)).a(true, false, false, false, true, ghh.b(ghy.a(dzs.gx, "_attached_n")).a(h)).a(true, true, true, false, false, ghh.b(ghy.a(dzs.gx, "_attached_ne"))).a(true, true, false, true, false, ghh.b(ghy.a(dzs.gx, "_attached_ne")).a(f)).a(true, false, false, true, true, ghh.b(ghy.a(dzs.gx, "_attached_ne")).a(g)).a(true, false, true, false, true, ghh.b(ghy.a(dzs.gx, "_attached_ne")).a(h)).a(true, false, true, true, false, ghh.b(ghy.a(dzs.gx, "_attached_ns"))).a(true, true, false, false, true, ghh.b(ghy.a(dzs.gx, "_attached_ns")).a(f)).a(true, true, true, true, false, ghh.b(ghy.a(dzs.gx, "_attached_nse"))).a(true, true, false, true, true, ghh.b(ghy.a(dzs.gx, "_attached_nse")).a(f)).a(true, false, true, true, true, ghh.b(ghy.a(dzs.gx, "_attached_nse")).a(g)).a(true, true, true, false, true, ghh.b(ghy.a(dzs.gx, "_attached_nse")).a(h)).a(true, true, true, true, true, ghh.b(ghy.a(dzs.gx, "_attached_nsew")))));
    }

    private void ap() {
        this.c(dzs.gw);
        this.i.accept(ghr.a(dzs.gw).a(ghs.a(eox.a, eox.A).a((T1 $$0, T2 $$1) -> ghh.b(ghy.a(dzs.gw, ($$0 != false ? "_attached" : "") + ($$1 != false ? "_on" : ""))))).a(z));
    }

    private hqq a(int $$0, String $$1, gib $$2) {
        return switch ($$0) {
            case 1 -> ghh.a(gia.bK.a(ghy.a($$1 + "turtle_egg"), $$2, this.k));
            case 2 -> ghh.a(gia.bM.a(ghy.a("two_" + $$1 + "turtle_eggs"), $$2, this.k));
            case 3 -> ghh.a(gia.bN.a(ghy.a("three_" + $$1 + "turtle_eggs"), $$2, this.k));
            case 4 -> ghh.a(gia.bO.a(ghy.a("four_" + $$1 + "turtle_eggs"), $$2, this.k));
            default -> throw new UnsupportedOperationException();
        };
    }

    private hqq a(int $$0, int $$1) {
        return switch ($$1) {
            case 0 -> this.a($$0, "", gib.b(gib.K(dzs.nb)));
            case 1 -> this.a($$0, "slightly_cracked_", gib.b(gib.a(dzs.nb, "_slightly_cracked")));
            case 2 -> this.a($$0, "very_cracked_", gib.b(gib.a(dzs.nb, "_very_cracked")));
            default -> throw new UnsupportedOperationException();
        };
    }

    private void aq() {
        this.b(dlx.li);
        this.i.accept(ghr.a(dzs.nb).a(ghs.a(eox.aH, eox.aI).a((T1 $$0, T2 $$1) -> ghh.b(this.a((int)$$0, (int)$$1)))));
    }

    private void ar() {
        amo $$02 = ghy.a(dzs.nd, "_hydration_0");
        this.a(dzs.nd, $$02);
        Function<Integer, amo> $$12 = $$0 -> {
            String $$1 = switch ($$0) {
                case 1 -> "_hydration_1";
                case 2 -> "_hydration_2";
                case 3 -> "_hydration_3";
                default -> "_hydration_0";
            };
            gib $$2 = gib.b($$1);
            return gia.bL.a(dzs.nd, $$1, $$2, this.k);
        };
        this.i.accept(ghr.a(dzs.nd).a(ghs.a(ecd.c).a((T1 $$1) -> ghh.b((amo)$$12.apply((Integer)$$1)))).a(z));
    }

    private void as() {
        this.b(dlx.lj);
        this.i.accept(ghr.a(dzs.nc).a(ghs.a(ehn.c).a((T1 $$0) -> {
            String $$1 = switch ($$0) {
                case 1 -> "_slightly_cracked";
                case 2 -> "_very_cracked";
                default -> "_not_cracked";
            };
            gib $$2 = gib.a($$1);
            return ghh.b(gia.bW.a(dzs.nc, $$1, $$2, this.k));
        })));
    }

    private void K(dzq $$0) {
        this.c($$0);
        this.L($$0);
    }

    private void b(dzq $$0, dlp $$1) {
        this.b($$1);
        this.L($$0);
    }

    private static <T extends epk<?>> Map<T, hqr> a(eoj<?, ?> $$0, Function<iz, T> $$1) {
        ImmutableMap.Builder $$2 = ImmutableMap.builderWithExpectedSize((int)C.size());
        C.forEach(($$3, $$4) -> {
            epk $$5 = (epk)$$1.apply((iz)$$3);
            if ($$0.b($$5)) {
                $$2.put((Object)$$5, $$4);
            }
        });
        return $$2.build();
    }

    private void L(dzq $$0) {
        Map<epk, hqr> $$12 = ghh.a($$0.m(), eey::b);
        ghp $$22 = ghh.b();
        $$12.forEach(($$1, $$2) -> $$22.a($$1, false));
        ghm $$32 = ghh.b(ghy.a($$0));
        ghq $$42 = ghq.a($$0);
        $$12.forEach(($$3, $$4) -> {
            $$42.a(ghh.b().a($$3, true), $$32.a((hqr)$$4));
            $$42.a($$22, $$32.a((hqr)$$4));
        });
        this.i.accept($$42);
    }

    private void M(dzq $$0) {
        Map<epk, hqr> $$12 = ghh.a($$0.m(), eew::a);
        ghp $$22 = ghh.b().a(eew.b, false);
        $$12.forEach(($$1, $$2) -> $$22.a($$1, epv.a));
        ghm $$3 = ghh.b(gid.j.create($$0, this.k));
        ghm $$42 = ghh.b(gid.k.get($$0).a((gib $$1) -> $$1.a(gic.i, gib.a($$0, "_side_tall"))).a($$0, "_side_tall", this.k));
        ghm $$52 = ghh.b(gid.k.get($$0).a((gib $$1) -> $$1.a(gic.i, gib.a($$0, "_side_small"))).a($$0, "_side_small", this.k));
        ghq $$6 = ghq.a($$0);
        $$6.a(ghh.b().a(eew.b, true), $$3);
        $$6.a($$22, $$3);
        $$12.forEach(($$4, $$5) -> {
            $$6.a(ghh.b().a($$4, epv.c), $$42.a((hqr)$$5));
            $$6.a(ghh.b().a($$4, epv.b), $$52.a((hqr)$$5));
            $$6.a($$22, $$42.a((hqr)$$5));
        });
        this.i.accept($$6);
    }

    private void N(dzq $$0) {
        this.c($$0);
        this.i.accept(ghr.a($$0).a(ghs.a(edn.b).a((T1 $$1) -> {
            String $$2 = $$1 != false ? "_tip" : "";
            gib $$3 = gib.c(gib.a($$0, $$2));
            return ghh.b(ghh$d.b.a().a($$0, $$2, $$3, this.k));
        })));
    }

    private void at() {
        amo $$0 = gib.a(dzs.rU, "_bottom");
        gib $$1 = new gib().a(gic.e, $$0).a(gic.f, gib.a(dzs.rU, "_top")).a(gic.i, gib.a(dzs.rU, "_side"));
        gib $$22 = new gib().a(gic.e, $$0).a(gic.f, gib.a(dzs.rU, "_top_bloom")).a(gic.i, gib.a(dzs.rU, "_side_bloom"));
        amo $$3 = gia.n.a(dzs.rU, $$1, this.k);
        ghm $$4 = ghh.b($$3);
        ghm $$5 = ghh.b(gia.n.a(dzs.rU, "_bloom", $$22, this.k));
        this.i.accept(ghr.a(dzs.rU).a(ghs.a(eox.c).a((T1 $$2) -> $$2 != false ? $$5 : $$4)));
        this.a(dzs.rU, $$3);
    }

    private void r(dzq $$0, dzq $$1) {
        gib $$2 = new gib().a(gic.a, gib.K($$0)).a(gic.c, gib.K($$1));
        ghq $$3 = ghq.a($$0);
        this.a($$0, $$2, $$3, gia.aZ, null, null);
        this.a($$0, $$2, $$3, gia.bb, false, null);
        this.a($$0, $$2, $$3, gia.bc, true, epp.a);
        this.a($$0, $$2, $$3, gia.bd, true, epp.d);
        this.a($$0, $$2, $$3, gia.be, true, epp.c);
        this.a($$0, $$2, $$3, gia.bf, true, epp.b);
        this.i.accept($$3);
        this.a($$0, gia.ba.a($$0, $$2, this.k));
    }

    private void a(dzq $$0, gib $$1, ghq $$2, ghz $$3, @Nullable Boolean $$42, @Nullable epp $$52) {
        ghm $$6 = ghh.b($$3.a($$0, $$1, this.k));
        ghh.a((iz $$4, hqr $$5) -> $$2.a(ghh.a($$4, $$42, $$52), $$6.a((hqr)$$5)));
    }

    private static void a(BiConsumer<iz, hqr> $$0) {
        List.of(Pair.of((Object)iz.c, (Object)a), Pair.of((Object)iz.f, (Object)f), Pair.of((Object)iz.d, (Object)g), Pair.of((Object)iz.e, (Object)h)).forEach($$1 -> {
            iz $$2 = (iz)$$1.getFirst();
            hqr $$3 = (hqr)$$1.getSecond();
            $$0.accept($$2, $$3);
        });
    }

    private static hqu a(iz $$0, @Nullable Boolean $$1, @Nullable epp $$2) {
        ghp $$3 = ghh.a(eox.T, (Enum)$$0, (Enum[])new iz[0]);
        if ($$1 == null) {
            return $$3.a();
        }
        ghp $$4 = ghh.a(eox.A, (boolean)$$1);
        return $$2 != null ? ghh.b($$3, $$4, ghh.a(eox.aj, (Enum)$$2, (Enum[])new epp[0])) : ghh.b($$3, $$4);
    }

    private void au() {
        dzq $$0 = dzs.cw;
        ghm $$1 = ghh.b(ghy.a($$0));
        ghq $$22 = ghq.a($$0);
        ghh.a((iz $$2, hqr $$3) -> {
            hqu $$4 = ghh.b().a(eox.T, $$2).a();
            $$22.a($$4, $$1.a((hqr)$$3).a(b));
            this.a($$22, $$4, (hqr)$$3);
        });
        this.i.accept($$22);
        this.a($$0, ghy.a($$0, "_inventory"));
        D.clear();
    }

    private void a(ghq $$0, hqu $$1, hqr $$2) {
        List.of(Pair.of((Object)eav.c, (Object)gia.aT), Pair.of((Object)eav.d, (Object)gia.aU), Pair.of((Object)eav.e, (Object)gia.aV), Pair.of((Object)eav.f, (Object)gia.aW), Pair.of((Object)eav.g, (Object)gia.aX), Pair.of((Object)eav.h, (Object)gia.aY)).forEach($$3 -> {
            eoy $$4 = (eoy)$$3.getFirst();
            ghz $$5 = (ghz)$$3.getSecond();
            this.a($$0, $$1, $$2, $$4, $$5, true);
            this.a($$0, $$1, $$2, $$4, $$5, false);
        });
    }

    private void a(ghq $$0, hqu $$1, hqr $$2, eoy $$32, ghz $$4, boolean $$5) {
        String $$6 = $$5 ? "_occupied" : "_empty";
        gib $$7 = new gib().a(gic.b, gib.a(dzs.cw, $$6));
        c $$8 = new c($$4, $$6);
        ghm $$9 = ghh.b(D.computeIfAbsent($$8, $$3 -> $$4.a(dzs.cw, $$6, $$7, this.k)));
        $$0.a(new hqt(hqt.a.a, List.of($$1, ghh.b().a($$32, $$5).a())), $$9.a($$2));
    }

    private void av() {
        ghm $$0 = ghh.b(gia.c.a(dzs.lF, gib.b(ghy.a("magma")), this.k));
        this.i.accept(ghh.a(dzs.lF, $$0));
    }

    private void a(dzq $$0, @Nullable dkr $$1) {
        this.r($$0);
        dlp $$2 = $$0.h();
        amo $$3 = gia.cd.a($$2, gib.x($$0), this.k);
        ihj.b $$4 = $$1 != null ? ghw.a($$3, new ikg.a($$1)) : ghw.a($$3, new ikg.a());
        this.j.a($$2, $$4);
    }

    private void c(dzq $$0, dzq $$1, d $$2) {
        this.b($$0, $$2);
        this.b($$1, $$2);
    }

    private void aw() {
        amo $$0 = ghy.a(dzs.b);
        hqq $$1 = ghh.a($$0);
        hqq $$2 = ghh.a(ghy.a(dzs.b, "_mirrored"));
        this.i.accept(ghr.a(dzs.ft, ghh.a($$1, $$2)));
        this.a(dzs.ft, $$0);
    }

    private void ax() {
        amo $$0 = ghy.a(dzs.ui);
        hqq $$1 = ghh.a($$0);
        hqq $$2 = ghh.a(ghy.a(dzs.ui, "_mirrored"));
        this.i.accept(ghr.a(dzs.uC, ghh.a($$1, $$2)).a(ghh.c()));
        this.a(dzs.uC, $$0);
    }

    private void s(dzq $$0, dzq $$1) {
        this.a($$0, ghh$d.b);
        gib $$2 = gib.d(gib.a($$0, "_pot"));
        ghm $$3 = ghh.b(ghh$d.b.b().a($$1, $$2, this.k));
        this.i.accept(ghh.a($$1, $$3));
    }

    private void ay() {
        amo $$0 = gib.a(dzs.ql, "_bottom");
        amo $$12 = gib.a(dzs.ql, "_top_off");
        amo $$2 = gib.a(dzs.ql, "_top");
        amo[] $$3 = new amo[5];
        for (int $$4 = 0; $$4 < 5; ++$$4) {
            gib $$5 = new gib().a(gic.e, $$0).a(gic.f, $$4 == 0 ? $$12 : $$2).a(gic.i, gib.a(dzs.ql, "_side" + $$4));
            $$3[$$4] = gia.n.a(dzs.ql, "_" + $$4, $$5, this.k);
        }
        this.i.accept(ghr.a(dzs.ql).a(ghs.a(eox.bd).a((T1 $$1) -> ghh.b($$3[$$1]))));
        this.a(dzs.ql, $$3[0]);
    }

    private static hqr a(jb $$0) {
        return switch ($$0) {
            default -> throw new MatchException(null, null);
            case jb.b -> c;
            case jb.c -> c.then(g);
            case jb.d -> c.then(h);
            case jb.a -> c.then(f);
            case jb.f -> e.then(g);
            case jb.g -> e;
            case jb.h -> e.then(f);
            case jb.e -> e.then(h);
            case jb.k -> a;
            case jb.l -> g;
            case jb.i -> h;
            case jb.j -> f;
        };
    }

    private void az() {
        amo $$0 = gib.a(dzs.pZ, "_top");
        amo $$1 = gib.a(dzs.pZ, "_bottom");
        amo $$2 = gib.a(dzs.pZ, "_side");
        amo $$3 = gib.a(dzs.pZ, "_lock");
        gib $$4 = new gib().a(gic.o, $$2).a(gic.m, $$2).a(gic.l, $$2).a(gic.c, $$0).a(gic.j, $$0).a(gic.k, $$1).a(gic.n, $$3);
        this.i.accept(ghr.a(dzs.pZ, ghh.b(gia.b.a(dzs.pZ, $$4, this.k))).a(ghs.b(eox.W).a(ghh::a)));
    }

    private void aA() {
        dzq $$0 = dzs.n;
        ghm $$1 = ghh.b(ghy.a($$0));
        gib $$2 = gib.a($$0);
        dzq $$3 = dzs.kA;
        ghm $$4 = ghh.b(gia.ab.a($$3, $$2, this.k));
        ghm $$5 = ghh.b(gia.ac.a($$3, $$2, this.k));
        this.i.accept(ghh.e($$3, $$4, $$5, $$1));
    }

    private void a(dzq $$0, dzq $$1, ehh.a $$2, amo $$3) {
        ghm $$4 = ghh.b(ghy.a("skull"));
        this.i.accept(ghh.a($$0, $$4));
        this.i.accept(ghh.a($$1, $$4));
        if ($$2 == ehh.b.e) {
            this.j.a($$0.h(), ghw.a($$3, new ike.a()));
        } else {
            this.j.a($$0.h(), ghw.a($$3, new ikh.a($$2)));
        }
    }

    private void aB() {
        amo $$0 = ghy.b("template_skull");
        this.a(dzs.hD, dzs.hE, ehh.b.g, $$0);
        this.a(dzs.hB, dzs.hC, ehh.b.e, $$0);
        this.a(dzs.hz, dzs.hA, ehh.b.f, $$0);
        this.a(dzs.hv, dzs.hw, ehh.b.c, $$0);
        this.a(dzs.hx, dzs.hy, ehh.b.d, $$0);
        this.a(dzs.hH, dzs.hI, ehh.b.h, $$0);
        this.a(dzs.hF, dzs.hG, ehh.b.i, ghy.a(dlx.wC));
    }

    private void aC() {
        this.a(dzs.tA, dzs.rW, ejq.a.a);
        this.a(dzs.tB, dzs.rX, ejq.a.b);
        this.a(dzs.tC, dzs.rY, ejq.a.c);
        this.a(dzs.tD, dzs.rZ, ejq.a.d);
        this.o(dzs.tA, dzs.tE);
        this.o(dzs.tB, dzs.tF);
        this.o(dzs.tC, dzs.tG);
        this.o(dzs.tD, dzs.tH);
    }

    private void a(dzq $$0, dzq $$1, ejq.a $$2) {
        ghm $$3 = ghh.b(gia.aa.a($$0, gib.h(gib.K($$1)), this.k));
        amo $$4 = ghy.b("template_copper_golem_statue");
        this.i.accept(ghh.a($$0, $$3));
        this.j.a($$0.h(), ghw.a(ebh.c, ghw.a($$4, new ika.a($$2, ebh.a.a)), Map.of(ebh.a.b, ghw.a($$4, new ika.a($$2, ebh.a.b)), ebh.a.d, ghw.a($$4, new ika.a($$2, ebh.a.d)), ebh.a.c, ghw.a($$4, new ika.a($$2, ebh.a.c)))));
    }

    private void a(dzq $$0, dzq $$1, dkr $$2) {
        ghm $$3 = ghh.b(ghy.a("banner"));
        amo $$4 = ghy.b("template_banner");
        this.i.accept(ghh.a($$0, $$3));
        this.i.accept(ghh.a($$1, $$3));
        dlp $$5 = $$0.h();
        this.j.a($$5, ghw.a($$4, new ijw.a($$2)));
    }

    private void aD() {
        this.a(dzs.jB, dzs.jR, dkr.a);
        this.a(dzs.jC, dzs.jS, dkr.b);
        this.a(dzs.jD, dzs.jT, dkr.c);
        this.a(dzs.jE, dzs.jU, dkr.d);
        this.a(dzs.jF, dzs.jV, dkr.e);
        this.a(dzs.jG, dzs.jW, dkr.f);
        this.a(dzs.jH, dzs.jX, dkr.g);
        this.a(dzs.jI, dzs.jY, dkr.h);
        this.a(dzs.jJ, dzs.jZ, dkr.i);
        this.a(dzs.jK, dzs.ka, dkr.j);
        this.a(dzs.jL, dzs.kb, dkr.k);
        this.a(dzs.jM, dzs.kc, dkr.l);
        this.a(dzs.jN, dzs.kd, dkr.m);
        this.a(dzs.jO, dzs.ke, dkr.n);
        this.a(dzs.jP, dzs.kf, dkr.o);
        this.a(dzs.jQ, dzs.kg, dkr.p);
    }

    private void a(dzq $$0, dzq $$1, amo $$2, boolean $$3) {
        this.a($$0, $$1);
        dlp $$4 = $$0.h();
        amo $$5 = gia.cf.a($$4, gib.x($$1), this.k);
        ihj.b $$6 = ghw.a($$5, new ijy.a($$2));
        if ($$3) {
            ihj.b $$7 = ghw.a($$5, new ijy.a(ijy.a));
            this.j.a($$4, ghw.b($$7, $$6));
        } else {
            this.j.a($$4, $$6);
        }
    }

    private void aE() {
        this.a(dzs.cS, dzs.n, ijy.b, true);
        this.a(dzs.hM, dzs.n, ijy.c, true);
        this.a(dzs.gv, dzs.cK, ijy.d, false);
    }

    private void aF() {
        this.a(dzs.ts, dzs.rW, ijy.e, false);
        this.a(dzs.tt, dzs.rX, ijy.f, false);
        this.a(dzs.tu, dzs.rY, ijy.g, false);
        this.a(dzs.tv, dzs.rZ, ijy.h, false);
        this.o(dzs.ts, dzs.tw);
        this.o(dzs.tt, dzs.tx);
        this.o(dzs.tu, dzs.ty);
        this.o(dzs.tv, dzs.tz);
    }

    private void b(dzq $$0, dzq $$1, dkr $$2) {
        ghm $$3 = ghh.b(ghy.a("bed"));
        this.i.accept(ghh.a($$0, $$3));
        dlp $$4 = $$0.h();
        amo $$5 = gia.ce.a(ghy.a($$4), gib.x($$1), this.k);
        this.j.a($$4, ghw.a($$5, new ijx.a($$2)));
    }

    private void aG() {
        this.b(dzs.bg, dzs.bK, dkr.a);
        this.b(dzs.bh, dzs.bL, dkr.b);
        this.b(dzs.bi, dzs.bM, dkr.c);
        this.b(dzs.bj, dzs.bN, dkr.d);
        this.b(dzs.bk, dzs.bO, dkr.e);
        this.b(dzs.bl, dzs.bP, dkr.f);
        this.b(dzs.bm, dzs.bQ, dkr.g);
        this.b(dzs.bn, dzs.bR, dkr.h);
        this.b(dzs.bo, dzs.bS, dkr.i);
        this.b(dzs.bp, dzs.bT, dkr.j);
        this.b(dzs.bq, dzs.bU, dkr.k);
        this.b(dzs.br, dzs.bV, dkr.l);
        this.b(dzs.bs, dzs.bW, dkr.m);
        this.b(dzs.bt, dzs.bX, dkr.n);
        this.b(dzs.bu, dzs.bY, dkr.o);
        this.b(dzs.bv, dzs.bZ, dkr.p);
    }

    private void a(dzq $$0, iki.b $$1) {
        dlp $$2 = $$0.h();
        amo $$3 = ghy.a($$2);
        this.j.a($$2, ghw.a($$3, $$1));
    }

    public void a() {
        mm.a().filter(mn::c).forEach($$0 -> this.i($$0.a()).a((mn)$$0));
        this.i(dzs.sf).a(mm.x).a(dzs.sf, dzs.sD).a(dzs.sj, dzs.sn).a(mm.z);
        this.i(dzs.se).a(mm.B).a(dzs.se, dzs.sC).a(dzs.si, dzs.sm).a(mm.D);
        this.i(dzs.sd).a(mm.F).a(dzs.sd, dzs.sB).a(dzs.sh, dzs.sl).a(mm.H);
        this.i(dzs.sc).a(mm.J).a(dzs.sc, dzs.sA).a(dzs.sg, dzs.sk).a(mm.L);
        this.A(dzs.tk);
        this.A(dzs.tl);
        this.A(dzs.tm);
        this.A(dzs.tn);
        this.j(dzs.tk, dzs.to);
        this.j(dzs.tl, dzs.tp);
        this.j(dzs.tm, dzs.tq);
        this.j(dzs.tn, dzs.tr);
        this.n(dzs.a);
        this.d(dzs.nZ, dzs.a);
        this.d(dzs.nY, dzs.a);
        this.n(dzs.gD);
        this.n(dzs.es);
        this.d(dzs.oa, dzs.J);
        this.n(dzs.gp);
        this.n(dzs.na);
        this.n(dzs.gg);
        this.n(dzs.gG);
        this.b(dlx.wq);
        this.n(dzs.qg);
        this.n(dzs.J);
        this.n(dzs.K);
        this.n(dzs.iN);
        this.b(dlx.gC);
        dlx.gD.a().forEach(this::a);
        this.t(dzs.qM, dzs.rd);
        this.t(dzs.qN, dzs.re);
        this.t(dzs.qO, dzs.rf);
        this.t(dzs.qP, dzs.rg);
        this.t(dzs.qQ, dzs.rh);
        this.t(dzs.qR, dzs.ri);
        this.t(dzs.qS, dzs.rj);
        this.t(dzs.qT, dzs.rk);
        this.t(dzs.qU, dzs.rl);
        this.t(dzs.qV, dzs.rm);
        this.t(dzs.qW, dzs.rn);
        this.t(dzs.qX, dzs.ro);
        this.t(dzs.qY, dzs.rp);
        this.t(dzs.qZ, dzs.rq);
        this.t(dzs.ra, dzs.rr);
        this.t(dzs.rb, dzs.rs);
        this.t(dzs.qL, dzs.rc);
        this.n(dzs.nX);
        this.n(dzs.hi);
        this.n(dzs.rP);
        this.n(dzs.tU);
        this.w(dzs.tV);
        this.w(dzs.tW);
        this.x(dzs.uH);
        this.x(dzs.uI);
        this.ae();
        this.h(dzs.ub, dzs.tX);
        this.M(dzs.uU);
        this.N(dzs.uV);
        this.a(dzs.uT);
        this.t(dzs.tY);
        this.t(dzs.tZ);
        this.s(dzs.ua);
        this.b(dzs.va, ghh$d.c);
        this.b(dlx.da);
        this.a(dzs.iO, dlx.iu);
        this.b(dlx.iu);
        this.aH();
        this.a(dzs.lJ, dlx.jU);
        this.b(dlx.jU);
        this.b(dzs.ca, gib.a(dzs.bI, "_side"));
        this.a(dzs.U);
        this.a(dzs.V);
        this.a(dzs.jt);
        this.a(dzs.cU);
        this.a(dzs.cV);
        this.a(dzs.cW);
        this.a(dzs.gt);
        this.a(dzs.gu);
        this.a(dzs.gy);
        this.a(dzs.Q);
        this.a(dzs.W);
        this.a(dzs.R);
        this.a(dzs.cr);
        this.a(dzs.S);
        this.a(dzs.T);
        this.a(dzs.cs);
        this.b(dzs.qj, gid.d);
        this.a(dzs.qi);
        this.a(dzs.aY);
        this.a(dzs.aZ);
        this.a(dzs.ba);
        this.a(dzs.fW);
        this.a(dzs.hS);
        this.a(dzs.ek);
        this.a(dzs.el);
        this.a(dzs.hR);
        this.a(dzs.qC);
        this.a(dzs.nT);
        this.a(dzs.eu);
        this.a(dzs.k);
        this.a(dzs.qk);
        this.a(dzs.go);
        this.a(dzs.eH);
        this.a(dzs.O);
        this.a(dzs.qh);
        this.a(dzs.eq);
        this.b(dzs.ew, gid.g);
        this.b(dzs.qq, gid.d);
        this.b(dzs.fI, gid.d);
        this.n(dzs.ag);
        this.n(dzs.gQ);
        this.a(dzs.lG);
        this.a(dzs.bf);
        this.a(dzs.ju);
        this.a(dzs.cK);
        this.a(dzs.qK);
        this.a(dzs.ja);
        this.a(dzs.pw);
        this.a(dzs.ez);
        this.a(dzs.eA);
        this.b(dzs.cP, gid.b);
        this.g(dzs.cQ);
        this.a(dzs.aV);
        this.b(dzs.bG, gid.A);
        this.b(dlx.dd);
        this.b(dzs.cu, gid.f);
        this.b(dzs.qd, gid.d);
        this.a(dzs.pn);
        this.a(dzs.aW);
        this.a(dzs.rt);
        this.a(dzs.ru);
        this.a(dzs.rN);
        this.a(dzs.tR);
        this.a(dzs.uE);
        this.a(dzs.uF);
        this.a(dzs.uG);
        this.d(dzs.rS);
        this.n(dzs.uS);
        this.aA();
        this.a(dzs.sa);
        this.a(dzs.sb);
        this.a(dzs.rW);
        this.a(dzs.rX);
        this.a(dzs.rY);
        this.a(dzs.rZ);
        this.o(dzs.rW, dzs.sw);
        this.o(dzs.rX, dzs.sy);
        this.o(dzs.rY, dzs.sx);
        this.o(dzs.rZ, dzs.sz);
        this.j(dzs.sM);
        this.j(dzs.sN);
        this.j(dzs.sP);
        this.j(dzs.sO);
        this.b(dzs.sM, dzs.sQ);
        this.b(dzs.sN, dzs.sR);
        this.b(dzs.sP, dzs.sT);
        this.b(dzs.sO, dzs.sS);
        this.l(dzs.sU);
        this.l(dzs.sV);
        this.l(dzs.sX);
        this.l(dzs.sW);
        this.c(dzs.sU, dzs.sY);
        this.c(dzs.sV, dzs.sZ);
        this.c(dzs.sX, dzs.tb);
        this.c(dzs.sW, dzs.ta);
        this.a(dzs.tc);
        this.a(dzs.td);
        this.a(dzs.te);
        this.a(dzs.tf);
        this.o(dzs.tc, dzs.tg);
        this.o(dzs.td, dzs.th);
        this.o(dzs.te, dzs.ti);
        this.o(dzs.tf, dzs.tj);
        this.k(dzs.tI, dzs.tM);
        this.k(dzs.tJ, dzs.tN);
        this.k(dzs.tK, dzs.tO);
        this.k(dzs.tL, dzs.tP);
        this.n(dzs.hN, dzs.cr);
        this.n(dzs.hO, dzs.cs);
        this.r(dzs.cx, dzs.am);
        this.r(dzs.cy, dzs.as);
        this.r(dzs.cz, dzs.ak);
        this.r(dzs.cA, dzs.an);
        this.r(dzs.cB, dzs.pr);
        this.r(dzs.cC, dzs.ao);
        this.r(dzs.cD, dzs.al);
        this.r(dzs.cE, dzs.ar);
        this.r(dzs.cF, dzs.aq);
        this.r(dzs.cG, dzs.ap);
        this.r(dzs.cH, dzs.aj);
        this.r(dzs.cI, dzs.pi);
        this.D();
        this.o();
        this.au();
        this.s();
        this.t();
        this.a(new dzq[]{dzs.pe, dzs.pf});
        this.u();
        this.x();
        this.y();
        this.B();
        this.C();
        this.F();
        this.A();
        this.D(dzs.lp);
        this.G();
        this.H();
        this.I();
        this.L();
        this.M();
        this.N();
        this.O();
        this.n();
        this.P();
        this.I(dzs.fC);
        dzs.fD.b().forEach(this::p);
        this.Q();
        this.R();
        this.T();
        this.U();
        this.V();
        this.W();
        this.X();
        this.ad();
        this.ag();
        this.af();
        this.ah();
        this.ai();
        this.v();
        this.aj();
        this.ak();
        this.al();
        this.an();
        this.am();
        this.a(dzs.qb);
        this.ao();
        this.ap();
        this.aq();
        this.as();
        this.ar();
        this.d();
        this.K(dzs.fO);
        this.K(dzs.rT);
        this.b(dzs.fP, dlx.gI);
        this.av();
        this.az();
        this.aa();
        this.ab();
        this.ac();
        this.S();
        this.K();
        this.J();
        this.Y();
        this.Z();
        this.J(dzs.dm);
        this.c(dzs.dm);
        this.J(dzs.oX);
        this.e();
        this.J(dzs.ud);
        this.q(dzs.cL, dzs.cM);
        this.q(dzs.eD, dzs.eE);
        this.q(dzs.eF, dzs.eG);
        this.a(dzs.cX, dzs.n, gib::c);
        this.a(dzs.oV, dzs.p, gib::d);
        this.C(dzs.pu);
        this.C(dzs.pl);
        this.z(dzs.bb);
        this.z(dzs.hZ);
        this.z();
        this.H(dzs.pb);
        this.H(dzs.pc);
        dzs.pd.b().forEach(this::l);
        this.c(dzs.fE, ghh.b(gid.z.create(dzs.fE, this.k)));
        dzs.fF.b().forEach(this::m);
        this.a(dzs.eB, gid.d);
        this.a(dzs.eC, gid.d);
        this.a(dzs.uD);
        this.a(dzs.lI, gid.d);
        this.e(dzs.j);
        this.e(dzs.ug);
        this.e(dzs.L);
        this.f(dzs.M);
        this.f(dzs.P);
        this.e(dzs.N);
        this.d(dzs.I);
        this.b(dzs.uN, gid.f);
        this.a(dzs.jb, gid.d, gid.e);
        this.a(dzs.lt, gid.B, gid.C);
        this.a(dzs.hW, gid.B, gid.C);
        this.a(dzs.uJ, gid.d, gid.e);
        this.a(dzs.uK, gid.d, gid.e);
        this.a(dzs.uL, gid.d, gid.e);
        this.c(dzs.oQ, gid.i);
        this.w();
        this.a(dzs.qe, gib::D);
        this.a(dzs.qf, gib::F);
        this.a(dzs.lz, eox.aw, 0, 1, 2, 3);
        this.a(dzs.hj, eox.az, 0, 0, 1, 1, 2, 2, 2, 3);
        this.a(dzs.gf, eox.aw, 0, 1, 1, 2);
        this.a(dzs.hk, eox.az, 0, 0, 1, 1, 2, 2, 2, 3);
        this.a(dzs.cY, eox.az, 0, 1, 2, 3, 4, 5, 6, 7);
        this.a(dzs.lw, ghh$d.b, eox.au, 0, 1);
        this.g();
        this.f();
        this.aD();
        this.aG();
        this.aB();
        this.aE();
        this.aF();
        this.a(dzs.lL, (dkr)null);
        this.a(dzs.lM, dkr.a);
        this.a(dzs.lN, dkr.b);
        this.a(dzs.lO, dkr.c);
        this.a(dzs.lP, dkr.d);
        this.a(dzs.lQ, dkr.e);
        this.a(dzs.lR, dkr.f);
        this.a(dzs.lS, dkr.g);
        this.a(dzs.lT, dkr.h);
        this.a(dzs.lU, dkr.i);
        this.a(dzs.lV, dkr.j);
        this.a(dzs.lW, dkr.k);
        this.a(dzs.lX, dkr.l);
        this.a(dzs.lY, dkr.m);
        this.a(dzs.lZ, dkr.n);
        this.a(dzs.ma, dkr.o);
        this.a(dzs.mb, dkr.p);
        this.aC();
        this.r(dzs.nU);
        this.a(dzs.nU, new ijz.a());
        this.a(dzs.uO, dzs.js);
        this.a(dzs.uO, new ikb.a());
        this.a(dzs.gm, dzs.cK);
        this.a(dzs.lB, dzs.cK);
        this.a(dzs.aT);
        this.a(dzs.aU);
        this.a(dzs.ms);
        this.a(dzs.mt);
        this.a(dzs.mu);
        this.a(dzs.mv);
        this.a(dzs.mw);
        this.a(dzs.mx);
        this.a(dzs.my);
        this.a(dzs.mz);
        this.a(dzs.mA);
        this.a(dzs.mB);
        this.a(dzs.mC);
        this.a(dzs.mD);
        this.a(dzs.mE);
        this.a(dzs.mF);
        this.a(dzs.mG);
        this.a(dzs.mH);
        this.a(gid.a, dzs.mI, dzs.mJ, dzs.mK, dzs.mL, dzs.mM, dzs.mN, dzs.mO, dzs.mP, dzs.mQ, dzs.mR, dzs.mS, dzs.mT, dzs.mU, dzs.mV, dzs.mW, dzs.mX);
        this.a(dzs.js);
        this.a(dzs.ia);
        this.a(dzs.ib);
        this.a(dzs.ic);
        this.a(dzs.id);
        this.a(dzs.ie);
        this.a(dzs.if);
        this.a(dzs.ig);
        this.a(dzs.ih);
        this.a(dzs.ii);
        this.a(dzs.ij);
        this.a(dzs.ik);
        this.a(dzs.il);
        this.a(dzs.im);
        this.a(dzs.in);
        this.a(dzs.io);
        this.a(dzs.ip);
        this.a(dzs.rO);
        this.i(dzs.aX, dzs.fG);
        this.i(dzs.eN, dzs.iq);
        this.i(dzs.eO, dzs.ir);
        this.i(dzs.eP, dzs.is);
        this.i(dzs.eQ, dzs.it);
        this.i(dzs.eR, dzs.iu);
        this.i(dzs.eS, dzs.iv);
        this.i(dzs.eT, dzs.iw);
        this.i(dzs.eU, dzs.ix);
        this.i(dzs.eV, dzs.iy);
        this.i(dzs.eW, dzs.iz);
        this.i(dzs.eX, dzs.iA);
        this.i(dzs.eY, dzs.iB);
        this.i(dzs.eZ, dzs.iC);
        this.i(dzs.fa, dzs.iD);
        this.i(dzs.fb, dzs.iE);
        this.i(dzs.fc, dzs.iF);
        this.b(gid.t, dzs.mc, dzs.md, dzs.me, dzs.mf, dzs.mg, dzs.mh, dzs.mi, dzs.mj, dzs.mk, dzs.ml, dzs.mm, dzs.mn, dzs.mo, dzs.mp, dzs.mq, dzs.mr);
        this.h(dzs.bK, dzs.jc);
        this.h(dzs.bL, dzs.jd);
        this.h(dzs.bM, dzs.je);
        this.h(dzs.bN, dzs.jf);
        this.h(dzs.bO, dzs.jg);
        this.h(dzs.bP, dzs.jh);
        this.h(dzs.bQ, dzs.ji);
        this.h(dzs.bR, dzs.jj);
        this.h(dzs.bS, dzs.jk);
        this.h(dzs.bT, dzs.jl);
        this.h(dzs.bU, dzs.jm);
        this.h(dzs.bV, dzs.jn);
        this.h(dzs.bW, dzs.jo);
        this.h(dzs.bX, dzs.jp);
        this.h(dzs.bY, dzs.jq);
        this.h(dzs.bZ, dzs.jr);
        this.a(dzs.uh);
        this.a(dzs.fr);
        this.b(dzs.bB, dzs.gR, ghh$d.a);
        this.h(dzs.bB);
        this.a(dzs.cb, dzs.gS, ghh$d.b);
        this.a(dzs.cd, dzs.gT, ghh$d.b);
        this.a(dzs.uW, dzs.uY, ghh$d.c);
        this.a(dzs.uX, dzs.uZ, ghh$d.b);
        this.a(dzs.ce, dzs.gU, ghh$d.b);
        this.a(dzs.cf, dzs.gV, ghh$d.b);
        this.a(dzs.cg, dzs.gW, ghh$d.b);
        this.a(dzs.ch, dzs.gX, ghh$d.b);
        this.a(dzs.ci, dzs.gY, ghh$d.b);
        this.a(dzs.cj, dzs.gZ, ghh$d.b);
        this.a(dzs.ck, dzs.ha, ghh$d.b);
        this.a(dzs.cl, dzs.hb, ghh$d.b);
        this.a(dzs.cm, dzs.hc, ghh$d.b);
        this.a(dzs.co, dzs.hd, ghh$d.b);
        this.a(dzs.cn, dzs.he, ghh$d.b);
        this.a(dzs.cq, dzs.hf, ghh$d.b);
        this.a(dzs.cp, dzs.hg, ghh$d.b);
        this.a(dzs.bC, dzs.hh, ghh$d.b);
        this.a(dzs.cc, dzs.gH, ghh$d.b);
        this.E();
        this.y(dzs.fz);
        this.y(dzs.fA);
        this.y(dzs.fB);
        this.b(dzs.bA, ghh$d.a);
        this.h(dzs.bA);
        this.a(dzs.bE, ghh$d.b);
        this.a(dzs.bF, ghh$d.b);
        this.b(dzs.bD, ghh$d.a);
        this.h(dzs.bD);
        this.b(dzs.ev, ghh$d.a);
        this.b(dlx.dW);
        this.c(dzs.mY, dzs.mZ, ghh$d.b);
        this.b(dlx.dX);
        this.b(dzs.uf, ghh$d.b);
        this.c(dzs.px, dzs.py, ghh$d.b);
        this.c(dzs.pz, dzs.pA, ghh$d.b);
        this.a(dzs.px, "_plant");
        this.a(dzs.pz, "_plant");
        this.a(dzs.nV, ghh$d.a, gib.c(gib.a(dzs.nW, "_stage0")));
        this.k();
        this.a(dzs.et, ghh$d.b);
        this.a(dzs.bz, ghh$d.b);
        this.d(dzs.jw, ghh$d.b);
        this.d(dzs.jx, ghh$d.b);
        this.d(dzs.jy, ghh$d.b);
        this.o(dzs.jz);
        this.o(dzs.jA);
        this.h();
        this.i();
        this.j();
        this.a(dzs.nt, dzs.no, dzs.nj, dzs.ne, dzs.nD, dzs.ny, dzs.nN, dzs.nI);
        this.a(dzs.nu, dzs.np, dzs.nk, dzs.nf, dzs.nE, dzs.nz, dzs.nO, dzs.nJ);
        this.a(dzs.nv, dzs.nq, dzs.nl, dzs.ng, dzs.nF, dzs.nA, dzs.nP, dzs.nK);
        this.a(dzs.nw, dzs.nr, dzs.nm, dzs.nh, dzs.nG, dzs.nB, dzs.nQ, dzs.nL);
        this.a(dzs.nx, dzs.ns, dzs.nn, dzs.ni, dzs.nH, dzs.nC, dzs.nR, dzs.nM);
        this.f(dzs.fM, dzs.fK);
        this.f(dzs.fL, dzs.fJ);
        this.m(dzs.af).c(dzs.af).a(dzs.aA);
        this.m(dzs.ar).c(dzs.ar).a(dzs.aJ);
        this.a(dzs.ar, dzs.dJ, dzs.dT);
        this.a(dzs.aS, gid.w, -7158200);
        this.m(dzs.ab).c(dzs.ab).a(dzs.ax);
        this.m(dzs.am).c(dzs.am).a(dzs.aF);
        this.a(dzs.am, dzs.dC, dzs.dO);
        this.a(dzs.D, dzs.gM, ghh$d.b);
        this.a(dzs.aO, gid.w, -12012264);
        this.m(dzs.ac).d(dzs.ac).a(dzs.ay);
        this.m(dzs.an).d(dzs.an).a(dzs.aG);
        this.a(dzs.an, dzs.dD, dzs.dP);
        this.a(dzs.E, dzs.gN, ghh$d.b);
        this.b(dzs.aP, gid.w);
        this.m(dzs.Z).c(dzs.Z).a(dzs.av);
        this.m(dzs.ak).c(dzs.ak).a(dzs.aD);
        this.a(dzs.ak, dzs.dB, dzs.dN);
        this.a(dzs.B, dzs.gK, ghh$d.b);
        this.a(dzs.aM, gid.w, -8345771);
        this.m(dzs.X).c(dzs.X).a(dzs.at);
        this.m(dzs.aq).c(dzs.aq).a(dzs.aB);
        this.a(dzs.aq, dzs.dz, dzs.dL);
        this.a(dzs.z, dzs.gI, ghh$d.b);
        this.a(dzs.aK, gid.w, -12012264);
        this.m(dzs.Y).c(dzs.Y).a(dzs.au);
        this.m(dzs.aj).c(dzs.aj).a(dzs.aC);
        this.a(dzs.aj, dzs.dA, dzs.dM);
        this.a(dzs.A, dzs.gJ, ghh$d.b);
        this.a(dzs.aL, gid.w, -10380959);
        this.m(dzs.ad).c(dzs.ad).a(dzs.az);
        this.m(dzs.ao).c(dzs.ao).a(dzs.aH);
        this.a(dzs.ao, dzs.dF, dzs.dR);
        this.a(dzs.F, dzs.gO, ghh$d.b);
        this.a(dzs.aQ, gid.w, -12012264);
        this.m(dzs.ae).c(dzs.ae).a(dzs.u);
        this.m(dzs.ap).c(dzs.ap).a(dzs.aI);
        this.a(dzs.ap, dzs.dG, dzs.dS);
        this.a(dzs.G, dzs.gP, ghh$d.b);
        this.b(dzs.aR, gid.w);
        this.m(dzs.aa).c(dzs.aa).a(dzs.aw);
        this.m(dzs.al).c(dzs.al).a(dzs.aE);
        this.a(dzs.al, dzs.dE, dzs.dQ);
        this.a(dzs.C, dzs.gL, ghh$d.b);
        this.a(dzs.aN, gid.w, -12012264);
        this.m(dzs.pq).b(dzs.pq).a(dzs.ps);
        this.m(dzs.pr).b(dzs.pr).a(dzs.pt);
        this.a(dzs.pr, dzs.dH, dzs.dU);
        this.a(dzs.pv, dzs.qm, ghh$d.b);
        this.s(dzs.pB, dzs.qo);
        this.m(dzs.ph).b(dzs.ph).a(dzs.pj);
        this.m(dzs.pi).b(dzs.pi).a(dzs.pk);
        this.a(dzs.pi, dzs.dI, dzs.dV);
        this.a(dzs.pm, dzs.qn, ghh$d.b);
        this.s(dzs.po, dzs.qp);
        this.m(dzs.ai).d(dzs.ai);
        this.m(dzs.as).d(dzs.as);
        this.a(dzs.x, dzs.dK, dzs.dW);
        this.b(dzs.pp, ghh$d.b);
        this.b(dlx.dT);
        this.j(dzs.dZ);
        this.l(dzs.iQ);
        this.r();
        this.p(dzs.dn);
        this.q(dzs.bw);
        this.q(dzs.bx);
        this.q(dzs.hY);
        this.q();
        this.u(dzs.gC);
        this.u(dzs.lC);
        this.u(dzs.lD);
        this.v(dzs.hJ);
        this.v(dzs.hK);
        this.v(dzs.hL);
        this.l();
        this.m();
        this.d(dzs.da, gid.h);
        this.d(dzs.oT, gid.h);
        this.d(dzs.oS, gid.i);
        this.p();
        this.ay();
        this.at();
        this.o(dzs.fq, dzs.fy);
        this.o(dzs.m, dzs.fu);
        this.o(dzs.fp, dzs.fx);
        this.o(dzs.fo, dzs.fw);
        this.aw();
        this.o(dzs.fn, dzs.fv);
        this.ax();
    }

    private void aH() {
        ihj.b $$0 = ghw.a(this.a(dlx.iv));
        HashMap<Integer, ihj.b> $$1 = new HashMap<Integer, ihj.b>(16);
        ghs.a<ghm, Integer> $$2 = ghs.a(eox.aT);
        for (int $$3 = 0; $$3 <= 15; ++$$3) {
            String $$4 = String.format(Locale.ROOT, "_%02d", $$3);
            amo $$5 = gib.a(dlx.iv, $$4);
            $$2.a($$3, ghh.b(gia.aa.a(dzs.iP, $$4, gib.h($$5), this.k)));
            ihj.b $$6 = ghw.a(gia.bX.a(ghy.a(dlx.iv, $$4), gib.k($$5), this.k));
            $$1.put($$3, $$6);
        }
        this.j.a(dlx.iv, ghw.a(eem.c, $$0, $$1));
        this.i.accept(ghr.a(dzs.iP).a($$2));
    }

    private void a(dlp $$0, dlp $$1) {
        amo $$2 = this.a($$0);
        this.a($$0, $$2);
        this.a($$1, $$2);
    }

    private void t(dzq $$0, dzq $$1) {
        this.b($$0.h());
        gib $$2 = gib.b(gib.K($$0));
        gib $$3 = gib.b(gib.a($$0, "_lit"));
        ghm $$4 = ghh.b(gia.cl.a($$0, "_one_candle", $$2, this.k));
        ghm $$5 = ghh.b(gia.cm.a($$0, "_two_candles", $$2, this.k));
        ghm $$6 = ghh.b(gia.cn.a($$0, "_three_candles", $$2, this.k));
        ghm $$7 = ghh.b(gia.co.a($$0, "_four_candles", $$2, this.k));
        ghm $$8 = ghh.b(gia.cl.a($$0, "_one_candle_lit", $$3, this.k));
        ghm $$9 = ghh.b(gia.cm.a($$0, "_two_candles_lit", $$3, this.k));
        ghm $$10 = ghh.b(gia.cn.a($$0, "_three_candles_lit", $$3, this.k));
        ghm $$11 = ghh.b(gia.co.a($$0, "_four_candles_lit", $$3, this.k));
        this.i.accept(ghr.a($$0).a(ghs.a(eox.aD, eox.u).a(1, false, $$4).a(2, false, $$5).a(3, false, $$6).a(4, false, $$7).a(1, true, $$8).a(2, true, $$9).a(3, true, $$10).a(4, true, $$11)));
        ghm $$12 = ghh.b(gia.cp.a($$1, gib.a($$0, false), this.k));
        ghm $$13 = ghh.b(gia.cp.a($$1, "_lit", gib.a($$0, true), this.k));
        this.i.accept(ghr.a($$1).a(ghh.a(eox.u, $$13, $$12)));
    }

    private /* synthetic */ ghm a(int[] $$0, Int2ObjectMap $$12, dzq $$2, Integer $$3) {
        int $$4 = $$0[$$3];
        return ghh.b((amo)$$12.computeIfAbsent($$4, $$1 -> this.a($$2, "_stage" + $$1, gia.bj, gib::g)));
    }

    class a {
        private final gib b;
        private final Map<ghz, amo> c = new HashMap<ghz, amo>();
        private @Nullable mn d;
        private @Nullable hqq e;
        private final Set<dzq> f = new HashSet<dzq>();

        public a(gib $$0) {
            this.b = $$0;
        }

        public a a(dzq $$0, ghz $$1) {
            this.e = ghh.a($$1.a($$0, this.b, ghh.this.k));
            if (u.containsKey($$0)) {
                ghh.this.i.accept(u.get($$0).create($$0, this.e, this.b, ghh.this.k));
            } else {
                ghh.this.i.accept(ghh.a($$0, ghh.a(this.e)));
            }
            return this;
        }

        public a a(dzq $$0, dzq $$1) {
            amo $$2 = ghy.a($$0);
            ghh.this.i.accept(ghh.a($$1, ghh.b($$2)));
            ghh.this.j.a($$0.h(), $$1.h());
            this.f.add($$1);
            return this;
        }

        public a a(dzq $$0) {
            ghm $$1 = ghh.b(gia.s.a($$0, this.b, ghh.this.k));
            ghm $$2 = ghh.b(gia.t.a($$0, this.b, ghh.this.k));
            ghh.this.i.accept(ghh.a($$0, $$1, $$2));
            amo $$3 = gia.u.a($$0, this.b, ghh.this.k);
            ghh.this.a($$0, $$3);
            return this;
        }

        public a b(dzq $$0) {
            ghm $$1 = ghh.b(gia.M.a($$0, this.b, ghh.this.k));
            ghm $$2 = ghh.b(gia.N.a($$0, this.b, ghh.this.k));
            ghm $$3 = ghh.b(gia.O.a($$0, this.b, ghh.this.k));
            ghh.this.i.accept(ghh.a($$0, $$1, $$2, $$3));
            amo $$4 = gia.P.a($$0, this.b, ghh.this.k);
            ghh.this.a($$0, $$4);
            return this;
        }

        public a c(dzq $$0) {
            gib $$1 = gib.s($$0);
            ghm $$2 = ghh.b(gia.D.a($$0, $$1, ghh.this.k));
            ghm $$3 = ghh.b(gia.E.a($$0, $$1, ghh.this.k));
            ghm $$4 = ghh.b(gia.F.a($$0, $$1, ghh.this.k));
            ghm $$5 = ghh.b(gia.G.a($$0, $$1, ghh.this.k));
            ghm $$6 = ghh.b(gia.H.a($$0, $$1, ghh.this.k));
            ghh.this.i.accept(ghh.a($$0, $$2, $$3, $$4, $$5, $$6));
            amo $$7 = gia.I.a($$0, $$1, ghh.this.k);
            ghh.this.a($$0, $$7);
            return this;
        }

        public a d(dzq $$0) {
            ghm $$1 = ghh.b(gia.J.a($$0, this.b, ghh.this.k));
            ghm $$2 = ghh.b(gia.K.a($$0, this.b, ghh.this.k));
            ghh.this.i.accept(ghh.b($$0, $$1, $$2));
            amo $$3 = gia.L.a($$0, this.b, ghh.this.k);
            ghh.this.a($$0, $$3);
            return this;
        }

        public a e(dzq $$0) {
            gib $$1 = gib.s($$0);
            ghm $$2 = ghh.b(gia.R.a($$0, $$1, ghh.this.k));
            ghm $$3 = ghh.b(gia.Q.a($$0, $$1, ghh.this.k));
            ghm $$4 = ghh.b(gia.T.a($$0, $$1, ghh.this.k));
            ghm $$5 = ghh.b(gia.S.a($$0, $$1, ghh.this.k));
            ghh.this.i.accept(ghh.a($$0, $$2, $$3, $$4, $$5, false));
            return this;
        }

        public a f(dzq $$0) {
            ghm $$1 = ghh.b(gia.V.a($$0, this.b, ghh.this.k));
            ghm $$2 = ghh.b(gia.U.a($$0, this.b, ghh.this.k));
            ghm $$3 = ghh.b(gia.X.a($$0, this.b, ghh.this.k));
            ghm $$4 = ghh.b(gia.W.a($$0, this.b, ghh.this.k));
            ghh.this.i.accept(ghh.a($$0, $$1, $$2, $$3, $$4, true));
            return this;
        }

        public a g(dzq $$0) {
            ghm $$1 = ghh.b(gia.Y.a($$0, this.b, ghh.this.k));
            ghm $$2 = ghh.b(gia.Z.a($$0, this.b, ghh.this.k));
            ghh.this.i.accept(ghh.d($$0, $$1, $$2));
            return this;
        }

        public a h(dzq $$0) {
            if (this.d == null) {
                throw new IllegalStateException("Family not defined");
            }
            dzq $$1 = this.d.b().get((Object)mn.b.r);
            ghm $$2 = ghh.b(gia.aa.a($$0, this.b, ghh.this.k));
            ghh.this.i.accept(ghh.a($$0, $$2));
            ghh.this.i.accept(ghh.a($$1, $$2));
            ghh.this.b($$0.h());
            return this;
        }

        public a i(dzq $$0) {
            if (this.e == null) {
                throw new IllegalStateException("Full block not generated yet");
            }
            amo $$1 = this.a(gia.ab, $$0);
            ghm $$2 = ghh.b(this.a(gia.ac, $$0));
            ghh.this.i.accept(ghh.e($$0, ghh.b($$1), $$2, ghh.a(this.e)));
            ghh.this.a($$0, $$1);
            return this;
        }

        public a j(dzq $$0) {
            ghm $$1 = ghh.b(this.a(gia.af, $$0));
            amo $$2 = this.a(gia.ae, $$0);
            ghm $$3 = ghh.b(this.a(gia.ag, $$0));
            ghh.this.i.accept(ghh.b($$0, $$1, ghh.b($$2), $$3));
            ghh.this.a($$0, $$2);
            return this;
        }

        private a k(dzq $$0) {
            gid $$1 = A.getOrDefault($$0, gid.a.get($$0));
            ghm $$2 = ghh.b($$1.a($$0, ghh.this.k));
            ghh.this.i.accept(ghh.a($$0, $$2));
            return this;
        }

        private a l(dzq $$0) {
            ghh.this.j($$0);
            return this;
        }

        private void m(dzq $$0) {
            if (l.contains($$0)) {
                ghh.this.l($$0);
            } else {
                ghh.this.k($$0);
            }
        }

        private amo a(ghz $$0, dzq $$12) {
            return this.c.computeIfAbsent($$0, $$1 -> $$1.a($$12, this.b, ghh.this.k));
        }

        public a a(mn $$02) {
            this.d = $$02;
            $$02.b().forEach(($$0, $$1) -> {
                if (this.f.contains($$1)) {
                    return;
                }
                BiConsumer<a, dzq> $$2 = B.get($$0);
                if ($$2 != null) {
                    $$2.accept(this, (dzq)$$1);
                }
            });
            return this;
        }
    }

    class e {
        private final gib b;

        public e(gib $$0) {
            this.b = $$0;
        }

        public e a(dzq $$0) {
            gib $$1 = this.b.c(gic.d, this.b.a(gic.i));
            amo $$2 = gia.j.a($$0, $$1, ghh.this.k);
            ghh.this.i.accept(ghh.b($$0, ghh.b($$2)));
            ghh.this.a($$0, $$2);
            return this;
        }

        public e b(dzq $$0) {
            amo $$1 = gia.j.a($$0, this.b, ghh.this.k);
            ghh.this.i.accept(ghh.b($$0, ghh.b($$1)));
            ghh.this.a($$0, $$1);
            return this;
        }

        public e c(dzq $$0) {
            amo $$1 = gia.j.a($$0, this.b, ghh.this.k);
            ghm $$2 = ghh.b(gia.k.a($$0, this.b, ghh.this.k));
            ghh.this.i.accept(ghh.c($$0, ghh.b($$1), $$2));
            ghh.this.a($$0, $$1);
            return this;
        }

        public e d(dzq $$0) {
            ghh.this.i.accept(ghh.a($$0, this.b, ghh.this.k));
            ghh.this.a($$0, gia.j.a($$0, this.b, ghh.this.k));
            return this;
        }
    }

    static final class d
    extends Enum<d> {
        public static final /* enum */ d a = new d(gia.ap, gia.as, false);
        public static final /* enum */ d b = new d(gia.ao, gia.ar, false);
        public static final /* enum */ d c = new d(gia.aq, gia.at, true);
        private final ghz d;
        private final ghz e;
        private final boolean f;
        private static final /* synthetic */ d[] g;

        public static d[] values() {
            return (d[])g.clone();
        }

        public static d valueOf(String $$0) {
            return Enum.valueOf(d.class, $$0);
        }

        private d(ghz $$0, ghz $$1, boolean $$2) {
            this.d = $$0;
            this.e = $$1;
            this.f = $$2;
        }

        public ghz a() {
            return this.d;
        }

        public ghz b() {
            return this.e;
        }

        public amo a(ghh $$0, dzq $$1) {
            dlp $$2 = $$1.h();
            if (this.f) {
                return $$0.b($$2, $$1, "_emissive");
            }
            return $$0.a($$2, $$1);
        }

        public gib a(dzq $$0) {
            return this.f ? gib.e($$0) : gib.c($$0);
        }

        public gib b(dzq $$0) {
            return this.f ? gib.g($$0) : gib.f($$0);
        }

        private static /* synthetic */ d[] c() {
            return new d[]{a, b, c};
        }

        static {
            g = ghh$d.c();
        }
    }

    record c(ghz a, String b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "template;modelSuffix", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "template;modelSuffix", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "template;modelSuffix", "a", "b"}, this, $$0);
        }
    }

    @FunctionalInterface
    static interface b {
        public gho create(dzq var1, hqq var2, gib var3, BiConsumer<amo, ghx> var4);
    }
}

