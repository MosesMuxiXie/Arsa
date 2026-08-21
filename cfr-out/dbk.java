/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class dbk {
    public static final int a = 8;
    public static final int b = 4;
    public static final dlp c = dlx.qk;
    private static final int e = 16;
    private static final int f = 600;
    private static final int g = 119;
    private static final int h = 9;
    private static final int i = 200;
    private static final int j = 200;
    private static final int k = 300;
    protected static final ccn d = bhn.a(30, 120);
    private static final int l = 100;
    private static final int m = 400;
    private static final int n = 8;
    private static final ccn o = bhn.a(10, 40);
    private static final ccn p = bhn.a(10, 30);
    private static final ccn q = bhn.a(5, 20);
    private static final int r = 20;
    private static final int s = 200;
    private static final int t = 12;
    private static final int u = 8;
    private static final int v = 14;
    private static final int w = 8;
    private static final int x = 5;
    private static final float y = 0.75f;
    private static final int z = 6;
    private static final ccn A = bhn.a(5, 7);
    private static final ccn B = bhn.a(5, 7);
    private static final float C = 0.1f;
    private static final float D = 1.0f;
    private static final float E = 1.0f;
    private static final float F = 0.8f;
    private static final float G = 1.0f;
    private static final float H = 1.0f;
    private static final float I = 0.6f;
    private static final float J = 0.6f;

    protected static cim<?> a(dbj $$0, cim<dbj> $$1) {
        dbk.a($$1);
        dbk.b($$1);
        dbk.d($$1);
        dbk.b($$0, $$1);
        dbk.c($$1);
        dbk.e($$1);
        dbk.f($$1);
        $$1.a((Set<dfl>)ImmutableSet.of((Object)dfl.a));
        $$1.b(dfl.b);
        $$1.e();
        return $$1;
    }

    protected static void a(dbj $$0, bgr $$1) {
        int $$2 = d.a($$1);
        $$0.ev().a(cqw.as, true, $$2);
    }

    private static void a(cim<dbj> $$0) {
        $$0.a(dfl.a, 0, (ImmutableList<cje<dbj>>)ImmutableList.of((Object)new ckk(45, 90), (Object)new cko(), ckc.a(), dbk.e(), dbk.f(), dbt.a(), dbp.a(119), clu.a(300, dbk::a), clx.a()));
    }

    private static void b(cim<dbj> $$02) {
        $$02.a(dfl.b, 10, (ImmutableList<cje<dbj>>)ImmutableList.of(cld.a(dbk::b, 14.0f), clt.a((axf $$0, E $$1) -> $$1.gR(), dbk::b), cmv.a(dbj::k, dbq.a()), dbk.d(), dbk.g(), dbk.b(), dbk.c(), clg.a(cgu.cb, 4)));
    }

    private static void b(dbj $$0, cim<dbj> $$12) {
        $$12.a(dfl.k, 10, (ImmutableList<cje<dbj>>)ImmutableList.of(clw.a((axf $$1, chl $$2) -> !dbk.b($$1, $$0, $$2)), cmv.a(dbk::c, cjb.a(5, 0.75f)), clj.a(1.0f), (Object)new clq(1.0, 10.0f), (Object)new clr(1.0, 1.0, 10.0f, 2.0f), (Object)new cls(1.0), ckl.a(20), new cjm(), dbo.a(), cjq.a(dbk::g, cqw.p)), cqw.p);
    }

    private static void c(cim<dbj> $$02) {
        $$02.a(dfl.l, 10, (ImmutableList<cje<dbj>>)ImmutableList.of(dbk.d(), cld.a(dbk::b, 14.0f), clt.a((axf $$0, E $$1) -> $$1.gR(), dbk::b), cmv.a((E $$0) -> !$$0.gY(), cjx.a(cqw.at, 2, 1.0f)), cmv.a(dbj::gY, cjx.a(cqw.at, 4, 0.6f)), new clb(ImmutableList.of((Object)Pair.of(cld.a(cgu.aZ, 8.0f), (Object)1), (Object)Pair.of(ckw.a(0.6f, 2, 1), (Object)1), (Object)Pair.of((Object)new cjo(10, 20), (Object)1)))), cqw.at);
    }

    private static void d(cim<dbj> $$0) {
        $$0.a(dfl.m, 10, (ImmutableList<cje<dbj>>)ImmutableList.of(cjy.a(dbk::t, 1.0f, true, 9), dbr.a(9), dbs.a(200, 200)), cqw.ao);
    }

    private static void e(cim<dbj> $$0) {
        $$0.a(dfl.n, 10, (ImmutableList<cje<dbj>>)ImmutableList.of(cli.b(cqw.A, 1.0f, 12, true), dbk.b(), dbk.c(), cjq.a(dbk::j, cqw.A)), cqw.A);
    }

    private static void f(cim<dbj> $$02) {
        $$02.a(dfl.o, 10, (ImmutableList<cje<dbj>>)ImmutableList.of(ckm.a(0.8f), cld.a(dbk::b, 8.0f), cmv.a(cmv.a(cgk::cq), cme.a(ImmutableList.builder().addAll(dbk.a()).add((Object)Pair.of(cmv.a((E $$0) -> true), (Object)1)).build())), cjn.a(8, dbk::a)), cqw.t);
    }

    private static ImmutableList<Pair<ckp<chl>, Integer>> a() {
        return ImmutableList.of((Object)Pair.of(cld.a(cgu.cb, 8.0f), (Object)1), (Object)Pair.of(cld.a(cgu.aZ, 8.0f), (Object)1), (Object)Pair.of(cld.a(8.0f), (Object)1));
    }

    private static clb<chl> b() {
        return new clb<chl>((List<Pair<cje<chl>, Integer>>)ImmutableList.builder().addAll(dbk.a()).add((Object)Pair.of((Object)new cjo(30, 60), (Object)1)).build());
    }

    private static clb<dbj> c() {
        return new clb<dbj>((List<Pair<cje<dbj>, Integer>>)ImmutableList.of((Object)Pair.of(ckw.a(0.6f), (Object)2), (Object)Pair.of(ckb.a(cgu.aZ, 8, cqw.r, 0.6f, 2), (Object)2), (Object)Pair.of(cmv.a(dbk::f, cll.a(0.6f, 3)), (Object)2), (Object)Pair.of((Object)new cjo(30, 60), (Object)1)));
    }

    private static cje<cht> d() {
        return cli.a(cqw.aH, 1.0f, 8, false);
    }

    private static cje<dbj> e() {
        return cjj.a(dbj::e_, cqw.N, cqw.A, B);
    }

    private static cje<dbj> f() {
        return cjj.a(dbk::g, cqw.aC, cqw.A, A);
    }

    protected static void a(dbj $$0) {
        cim<dbj> $$1 = $$0.ev();
        dfl $$2 = $$1.f().orElse(null);
        $$1.a((List<dfl>)ImmutableList.of((Object)dfl.m, (Object)dfl.k, (Object)dfl.n, (Object)dfl.l, (Object)dfl.o, (Object)dfl.b));
        dfl $$3 = $$1.f().orElse(null);
        if ($$2 != $$3) {
            dbk.b($$0).ifPresent($$0::b);
        }
        $$0.w($$1.a(cqw.p));
        if (!$$1.a(cqw.t) && dbk.e($$0)) {
            $$0.cf();
        }
        if (!$$1.a(cqw.at)) {
            $$1.b(cqw.au);
        }
        $$0.y($$1.a(cqw.au));
    }

    private static boolean e(dbj $$0) {
        if (!$$0.e_()) {
            return false;
        }
        cgk $$1 = $$0.dz();
        return $$1 instanceof dbj && ((dbj)$$1).e_() || $$1 instanceof daw && ((daw)$$1).e_();
    }

    protected static void a(axf $$0, dbj $$1, czl $$2) {
        boolean $$5;
        dlt $$4;
        dbk.i($$1);
        if ($$2.e().a(dlx.um)) {
            $$1.a((cgk)$$2, $$2.e().N());
            dlt $$3 = $$2.e();
            $$2.aC();
        } else {
            $$1.a((cgk)$$2, 1);
            $$4 = dbk.a($$2);
        }
        if (dbk.a($$4)) {
            $$1.ev().b(cqw.ap);
            dbk.a($$0, $$1, $$4);
            dbk.d((chl)$$1);
            return;
        }
        if (dbk.c($$4) && !dbk.o($$1)) {
            dbk.m($$1);
            return;
        }
        boolean bl2 = $$5 = !$$1.b($$0, $$4).equals(dlt.l);
        if ($$5) {
            return;
        }
        dbk.c($$1, $$4);
    }

    private static void a(axf $$0, dbj $$1, dlt $$2) {
        if (dbk.s($$1)) {
            $$1.a($$0, $$1.b(cdb.b));
        }
        $$1.m($$2);
    }

    private static dlt a(czl $$0) {
        dlt $$1 = $$0.e();
        dlt $$2 = $$1.a(1);
        if ($$1.f()) {
            $$0.aC();
        } else {
            $$0.a($$1);
        }
        return $$2;
    }

    protected static void a(axf $$0, dbj $$1, boolean $$2) {
        dlt $$3 = $$1.b(cdb.b);
        $$1.a(cdb.b, dlt.l);
        if ($$1.gR()) {
            boolean $$4 = dbk.b($$3);
            if ($$2 && $$4) {
                dbk.a($$1, dbk.f($$1));
            } else if (!$$4) {
                boolean $$5;
                boolean bl2 = $$5 = !$$1.b($$0, $$3).f();
                if (!$$5) {
                    dbk.c($$1, $$3);
                }
            }
        } else {
            boolean $$6;
            boolean bl3 = $$6 = !$$1.b($$0, $$3).f();
            if (!$$6) {
                dlt $$7 = $$1.fx();
                if (dbk.a($$7)) {
                    dbk.c($$1, $$7);
                } else {
                    dbk.a($$1, Collections.singletonList($$7));
                }
                $$1.l($$3);
            }
        }
    }

    protected static void a(axf $$0, dbj $$1) {
        if (dbk.p($$1) && !$$1.fy().f()) {
            $$1.a($$0, $$1.fy());
            $$1.a(cdb.b, dlt.l);
        }
    }

    private static void c(dbj $$0, dlt $$1) {
        dlt $$2 = $$0.j($$1);
        dbk.b($$0, Collections.singletonList($$2));
    }

    private static void a(dbj $$0, List<dlt> $$1) {
        Optional<ddm> $$2 = $$0.ev().c(cqw.k);
        if ($$2.isPresent()) {
            dbk.a($$0, $$2.get(), $$1);
        } else {
            dbk.b($$0, $$1);
        }
    }

    private static void b(dbj $$0, List<dlt> $$1) {
        dbk.a($$0, $$1, dbk.n($$0));
    }

    private static void a(dbj $$0, ddm $$1, List<dlt> $$2) {
        dbk.a($$0, $$2, $$1.dI());
    }

    private static void a(dbj $$0, List<dlt> $$1, ftm $$2) {
        if (!$$1.isEmpty()) {
            $$0.a(cdb.b);
            for (dlt $$3 : $$1) {
                cjf.a((chl)$$0, $$3, $$2.b(0.0, 1.0, 0.0));
            }
        }
    }

    private static List<dlt> f(dbj $$0) {
        fof $$1 = $$0.ao().s().be().a(fnv.aP);
        ObjectArrayList<dlt> $$2 = $$1.a(new fod.a((axf)$$0.ao()).a(fqx.a, $$0).a(fqw.k));
        return $$2;
    }

    private static boolean a(chl $$0, chl $$1) {
        if ($$1.ay() != cgu.ao) {
            return false;
        }
        return bgr.a($$0.ao().au()).i() < 0.1f;
    }

    protected static boolean a(dbj $$0, dlt $$1) {
        if ($$0.e_() && $$1.a(bdy.av)) {
            return false;
        }
        if ($$1.a(bdy.at)) {
            return false;
        }
        if (dbk.r($$0) && $$0.ev().a(cqw.p)) {
            return false;
        }
        if (dbk.b($$1)) {
            return dbk.t($$0);
        }
        boolean $$2 = $$0.k($$1);
        if ($$1.a(dlx.um)) {
            return $$2;
        }
        if (dbk.c($$1)) {
            return !dbk.o($$0) && $$2;
        }
        if (dbk.a($$1)) {
            return dbk.t($$0) && $$2;
        }
        return $$0.n($$1);
    }

    protected static boolean a(dlt $$0) {
        return $$0.a(bdy.au);
    }

    private static boolean a(dbj $$0, cgk $$1) {
        if ($$1 instanceof chn) {
            chn $$2 = (chn)$$1;
            return !$$2.e_() || !$$2.cb() || dbk.g((chl)$$0) || dbk.g($$2) || $$2 instanceof dbj && $$2.dz() == null;
        }
        return false;
    }

    private static boolean b(axf $$0, dbj $$12, chl $$2) {
        return dbk.b($$0, $$12).filter($$1 -> $$1 == $$2).isPresent();
    }

    private static boolean g(dbj $$0) {
        cim<dbj> $$1 = $$0.ev();
        if ($$1.a(cqw.aC)) {
            chl $$2 = $$1.c(cqw.aC).get();
            return $$0.a((cgk)$$2, 6.0);
        }
        return false;
    }

    private static Optional<? extends chl> b(axf $$0, dbj $$1) {
        Optional<ddm> $$4;
        cim<dbj> $$2 = $$1.ev();
        if (dbk.g($$1)) {
            return Optional.empty();
        }
        Optional<chl> $$3 = cjf.a((chl)$$1, cqw.am);
        if ($$3.isPresent() && csd.d($$0, $$1, $$3.get())) {
            return $$3;
        }
        if ($$2.a(cqw.an) && ($$4 = $$2.c(cqw.l)).isPresent()) {
            return $$4;
        }
        Optional<chn> $$5 = $$2.c(cqw.N);
        if ($$5.isPresent()) {
            return $$5;
        }
        Optional<ddm> $$6 = $$2.c(cqw.ax);
        if ($$6.isPresent() && csd.c($$0, $$1, $$6.get())) {
            return $$6;
        }
        return Optional.empty();
    }

    public static void a(axf $$0, ddm $$1, boolean $$22) {
        List<dbj> $$3 = $$1.ao().a(dbj.class, $$1.dj().g(16.0));
        $$3.stream().filter(dbk::c).filter($$2 -> !$$22 || cjf.b($$2, (chl)$$1)).forEach($$2 -> {
            if ($$0.U().a(eua.af).booleanValue()) {
                dbk.d($$0, $$2, $$1);
            } else {
                dbk.c($$0, $$2, $$1);
            }
        });
    }

    public static cdc a(axf $$0, dbj $$1, ddm $$2, cdb $$3) {
        dlt $$4 = $$2.b($$3);
        if (dbk.b($$1, $$4)) {
            dlt $$5 = $$4.b(1, (chl)$$2);
            dbk.a($$0, $$1, $$5);
            dbk.d((chl)$$1);
            dbk.i($$1);
            return cdc.a;
        }
        return cdc.e;
    }

    protected static boolean b(dbj $$0, dlt $$1) {
        return !dbk.r($$0) && !dbk.p($$0) && $$0.gR() && dbk.b($$1);
    }

    protected static void a(axf $$0, dbj $$1, chl $$22) {
        if ($$22 instanceof dbj) {
            return;
        }
        if (dbk.s($$1)) {
            dbk.a($$0, $$1, false);
        }
        cim<dbj> $$3 = $$1.ev();
        $$3.b(cqw.at);
        $$3.b(cqw.au);
        $$3.b(cqw.ao);
        if ($$22 instanceof ddm) {
            $$3.a(cqw.ar, true, 400L);
        }
        dbk.d($$1).ifPresent($$2 -> {
            if ($$2.ay() != $$22.ay()) {
                $$3.b(cqw.A);
            }
        });
        if ($$1.e_()) {
            $$3.a(cqw.A, $$22, 100L);
            if (csd.d($$0, $$1, $$22)) {
                dbk.b($$0, (dbi)$$1, $$22);
            }
            return;
        }
        if ($$22.ay() == cgu.ao && dbk.l($$1)) {
            dbk.c($$1, $$22);
            dbk.a($$1, $$22);
            return;
        }
        dbk.a($$0, (dbi)$$1, $$22);
    }

    protected static void a(axf $$0, dbi $$1, chl $$2) {
        if ($$1.ev().c(dfl.n)) {
            return;
        }
        if (!csd.d($$0, $$1, $$2)) {
            return;
        }
        if (cjf.a((chl)$$1, $$2, 4.0)) {
            return;
        }
        if ($$2.ay() == cgu.cb && $$0.U().a(eua.af).booleanValue()) {
            dbk.d($$0, $$1, $$2);
            dbk.a($$0, $$1);
        } else {
            dbk.c($$0, $$1, $$2);
            dbk.b($$0, $$1, $$2);
        }
    }

    public static Optional<bcz> b(dbj $$0) {
        return $$0.ev().f().map($$1 -> dbk.a($$0, $$1));
    }

    private static bcz a(dbj $$0, dfl $$1) {
        if ($$1 == dfl.k) {
            return bda.wt;
        }
        if ($$0.gQ()) {
            return bda.wy;
        }
        if ($$1 == dfl.n && dbk.h($$0)) {
            return bda.wy;
        }
        if ($$1 == dfl.m) {
            return bda.wr;
        }
        if ($$1 == dfl.l) {
            return bda.wu;
        }
        if (dbk.e((chl)$$0)) {
            return bda.ww;
        }
        if (dbk.q($$0)) {
            return bda.wy;
        }
        return bda.ws;
    }

    private static boolean h(dbj $$0) {
        cim<dbj> $$1 = $$0.ev();
        if (!$$1.a(cqw.A)) {
            return false;
        }
        return $$1.c(cqw.A).get().a((cgk)$$0, 12.0);
    }

    protected static List<dbi> c(dbj $$0) {
        return $$0.ev().c(cqw.az).orElse((List<dbi>)ImmutableList.of());
    }

    private static List<dbi> d(dbi $$0) {
        return $$0.ev().c(cqw.ay).orElse((List<dbi>)ImmutableList.of());
    }

    public static boolean a(chl $$0) {
        for (cgv $$1 : cgw.i) {
            if (!$$0.a($$1).a(bdy.aw)) continue;
            return true;
        }
        return false;
    }

    private static void i(dbj $$0) {
        $$0.ev().b(cqw.n);
        $$0.N().n();
    }

    private static cje<chl> g() {
        cle.a $$0 = new cle.a(o);
        return cjj.a((E $$1) -> $$1.e_() && $$0.a($$1.ao().y), cqw.aw, cqw.t, p);
    }

    protected static void b(axf $$0, dbi $$1, chl $$22) {
        dbk.d($$1).forEach($$2 -> {
            if (!($$22.ay() != cgu.ao || $$2.k() && ((daw)$$22).gS())) {
                return;
            }
            dbk.e($$0, $$2, $$22);
        });
    }

    protected static void a(axf $$0, dbi $$12) {
        dbk.d($$12).forEach($$1 -> dbk.a($$1).ifPresent($$2 -> dbk.c($$0, $$1, $$2)));
    }

    protected static void c(axf $$0, dbi $$1, chl $$2) {
        if (!csd.d($$0, $$1, $$2)) {
            return;
        }
        $$1.ev().b(cqw.F);
        $$1.ev().a(cqw.am, $$2.cY(), 600L);
        if ($$2.ay() == cgu.ao && $$1.k()) {
            dbk.b($$1);
        }
        if ($$2.ay() == cgu.cb && $$0.U().a(eua.af).booleanValue()) {
            $$1.ev().a(cqw.an, true, 600L);
        }
    }

    private static void d(axf $$0, dbi $$1, chl $$2) {
        Optional<ddm> $$3 = dbk.a($$1);
        if ($$3.isPresent()) {
            dbk.c($$0, $$1, $$3.get());
        } else {
            dbk.c($$0, $$1, $$2);
        }
    }

    private static void e(axf $$0, dbi $$1, chl $$2) {
        Optional<chl> $$3 = dbk.e($$1);
        chl $$4 = cjf.a((chl)$$1, $$3, $$2);
        if ($$3.isPresent() && $$3.get() == $$4) {
            return;
        }
        dbk.c($$0, $$1, $$4);
    }

    private static Optional<chl> e(dbi $$0) {
        return cjf.a((chl)$$0, cqw.am);
    }

    public static Optional<chl> d(dbj $$0) {
        if ($$0.ev().a(cqw.A)) {
            return $$0.ev().c(cqw.A);
        }
        return Optional.empty();
    }

    public static Optional<ddm> a(dbi $$0) {
        if ($$0.ev().a(cqw.l)) {
            return $$0.ev().c(cqw.l);
        }
        return Optional.empty();
    }

    private static void a(dbj $$02, chl $$12) {
        dbk.c($$02).stream().filter($$0 -> $$0 instanceof dbj).forEach($$1 -> dbk.b((dbj)$$1, $$12));
    }

    private static void b(dbj $$0, chl $$1) {
        cim<dbj> $$2 = $$0.ev();
        chl $$3 = $$1;
        $$3 = cjf.a((chl)$$0, $$2.c(cqw.A), $$3);
        $$3 = cjf.a((chl)$$0, $$2.c(cqw.p), $$3);
        dbk.c($$0, $$3);
    }

    private static boolean j(dbj $$0) {
        cim<dbj> $$1 = $$0.ev();
        if (!$$1.a(cqw.A)) {
            return true;
        }
        chl $$2 = $$1.c(cqw.A).get();
        cgu<?> $$3 = $$2.ay();
        if ($$3 == cgu.ao) {
            return dbk.k($$0);
        }
        if (dbk.a($$3)) {
            return !$$1.b(cqw.aC, $$2);
        }
        return false;
    }

    private static boolean k(dbj $$0) {
        return !dbk.l($$0);
    }

    private static boolean l(dbj $$0) {
        int $$1 = $$0.ev().c(cqw.aD).orElse(0) + 1;
        int $$2 = $$0.ev().c(cqw.aE).orElse(0);
        return $$2 > $$1;
    }

    private static void c(dbj $$0, chl $$1) {
        $$0.ev().b(cqw.am);
        $$0.ev().b(cqw.p);
        $$0.ev().b(cqw.n);
        $$0.ev().a(cqw.A, $$1, q.a($$0.ao().y));
        dbk.b((dbi)$$0);
    }

    protected static void b(dbi $$0) {
        $$0.ev().a(cqw.as, true, d.a($$0.ao().y));
    }

    private static void m(dbj $$0) {
        $$0.ev().a(cqw.aG, true, 200L);
    }

    private static ftm n(dbj $$0) {
        ftm $$1 = csr.a($$0, 4, 2);
        return $$1 == null ? $$0.dI() : $$1;
    }

    private static boolean o(dbj $$0) {
        return $$0.ev().a(cqw.aG);
    }

    protected static boolean c(dbi $$0) {
        return $$0.ev().c(dfl.b);
    }

    private static boolean c(chl $$0) {
        return $$0.b(dlx.yz);
    }

    private static void d(chl $$0) {
        $$0.ev().a(cqw.ao, true, 119L);
    }

    private static boolean p(dbj $$0) {
        return $$0.ev().a(cqw.ao);
    }

    private static boolean b(dlt $$0) {
        return $$0.a(c);
    }

    private static boolean c(dlt $$0) {
        return $$0.a(bdy.aC);
    }

    private static boolean q(dbj $$0) {
        return $$0.ev().a(cqw.aH);
    }

    private static boolean e(chl $$0) {
        return $$0.ev().a(cqw.aF);
    }

    private static boolean f(chl $$0) {
        return !dbk.e($$0);
    }

    public static boolean b(chl $$0) {
        return $$0.ay() == cgu.cb && $$0.b(dbk::a);
    }

    private static boolean r(dbj $$0) {
        return $$0.ev().a(cqw.ar);
    }

    private static boolean g(chl $$0) {
        return $$0.ev().a(cqw.y);
    }

    private static boolean s(dbj $$0) {
        return !$$0.fy().f();
    }

    private static boolean t(dbj $$0) {
        return $$0.fy().f() || !dbk.a($$0.fy());
    }

    public static boolean a(cgu<?> $$0) {
        return $$0 == cgu.ca || $$0 == cgu.bV;
    }
}

