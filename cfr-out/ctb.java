/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class ctb {
    public static final amt<cta> a = ctb.a("armorer");
    public static final amt<cta> b = ctb.a("butcher");
    public static final amt<cta> c = ctb.a("cartographer");
    public static final amt<cta> d = ctb.a("cleric");
    public static final amt<cta> e = ctb.a("farmer");
    public static final amt<cta> f = ctb.a("fisherman");
    public static final amt<cta> g = ctb.a("fletcher");
    public static final amt<cta> h = ctb.a("leatherworker");
    public static final amt<cta> i = ctb.a("librarian");
    public static final amt<cta> j = ctb.a("mason");
    public static final amt<cta> k = ctb.a("shepherd");
    public static final amt<cta> l = ctb.a("toolsmith");
    public static final amt<cta> m = ctb.a("weaponsmith");
    public static final amt<cta> n = ctb.a("home");
    public static final amt<cta> o = ctb.a("meeting");
    public static final amt<cta> p = ctb.a("beehive");
    public static final amt<cta> q = ctb.a("bee_nest");
    public static final amt<cta> r = ctb.a("nether_portal");
    public static final amt<cta> s = ctb.a("lodestone");
    public static final amt<cta> t = ctb.a("lightning_rod");
    public static final amt<cta> u = ctb.a("test_instance");
    private static final Set<eoh> v = (Set)ImmutableList.of((Object)dzs.bu, (Object)dzs.bv, (Object)dzs.br, (Object)dzs.bs, (Object)dzs.bp, (Object)dzs.bn, (Object)dzs.bt, (Object)dzs.bj, (Object)dzs.bo, (Object)dzs.bl, (Object)dzs.bi, (Object)dzs.bh, (Object[])new dzq[]{dzs.bm, dzs.bq, dzs.bg, dzs.bk}).stream().flatMap($$0 -> $$0.l().a().stream()).filter($$0 -> $$0.c(dzj.b) == eou.a).collect(ImmutableSet.toImmutableSet());
    private static final Set<eoh> w = (Set)ImmutableList.of((Object)dzs.gi, (Object)dzs.gk, (Object)dzs.gj, (Object)dzs.gl).stream().flatMap($$0 -> $$0.l().a().stream()).collect(ImmutableSet.toImmutableSet());
    private static final Set<eoh> x = (Set)ImmutableList.of((Object)dzs.tI, (Object)dzs.tJ, (Object)dzs.tK, (Object)dzs.tL, (Object)dzs.tM, (Object)dzs.tN, (Object)dzs.tO, (Object)dzs.tP).stream().flatMap($$0 -> $$0.l().a().stream()).collect(ImmutableSet.toImmutableSet());
    private static final Map<eoh, jd<cta>> y = Maps.newHashMap();

    private static Set<eoh> a(dzq $$0) {
        return ImmutableSet.copyOf($$0.l().a());
    }

    private static amt<cta> a(String $$0) {
        return amt.a(mj.ai, amo.b($$0));
    }

    private static cta a(jq<cta> $$0, amt<cta> $$1, Set<eoh> $$2, int $$3, int $$4) {
        cta $$5 = new cta($$2, $$3, $$4);
        jq.a($$0, $$1, $$5);
        ctb.a((jd<cta>)$$0.b($$1), $$2);
        return $$5;
    }

    private static void a(jd<cta> $$0, Set<eoh> $$12) {
        $$12.forEach($$1 -> {
            jd<cta> $$2 = y.put((eoh)$$1, $$0);
            if ($$2 != null) {
                throw bhs.b(new IllegalStateException(String.format(Locale.ROOT, "%s is defined in more than one PoI type", $$1)));
            }
        });
    }

    public static Optional<jd<cta>> a(eoh $$0) {
        return Optional.ofNullable(y.get($$0));
    }

    public static boolean b(eoh $$0) {
        return y.containsKey($$0);
    }

    public static cta a(jq<cta> $$0) {
        ctb.a($$0, a, ctb.a(dzs.oT), 1, 1);
        ctb.a($$0, b, ctb.a(dzs.oS), 1, 1);
        ctb.a($$0, c, ctb.a(dzs.oU), 1, 1);
        ctb.a($$0, d, ctb.a(dzs.gh), 1, 1);
        ctb.a($$0, e, ctb.a(dzs.qc), 1, 1);
        ctb.a($$0, f, ctb.a(dzs.oR), 1, 1);
        ctb.a($$0, g, ctb.a(dzs.oV), 1, 1);
        ctb.a($$0, h, w, 1, 1);
        ctb.a($$0, i, ctb.a(dzs.oX), 1, 1);
        ctb.a($$0, j, ctb.a(dzs.oZ), 1, 1);
        ctb.a($$0, k, ctb.a(dzs.oQ), 1, 1);
        ctb.a($$0, l, ctb.a(dzs.oY), 1, 1);
        ctb.a($$0, m, ctb.a(dzs.oW), 1, 1);
        ctb.a($$0, n, v, 1, 1);
        ctb.a($$0, o, ctb.a(dzs.pa), 32, 6);
        ctb.a($$0, p, ctb.a(dzs.qf), 0, 1);
        ctb.a($$0, q, ctb.a(dzs.qe), 0, 1);
        ctb.a($$0, r, ctb.a(dzs.eI), 0, 1);
        ctb.a($$0, s, ctb.a(dzs.qq), 0, 1);
        ctb.a($$0, u, ctb.a(dzs.qb), 0, 1);
        return ctb.a($$0, t, x, 0, 1);
    }
}

