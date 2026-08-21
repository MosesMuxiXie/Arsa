/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public class hpj {
    public static final amo a = amo.b("textures/atlas/shulker_boxes.png");
    public static final amo b = amo.b("textures/atlas/beds.png");
    public static final amo c = amo.b("textures/atlas/banner_patterns.png");
    public static final amo d = amo.b("textures/atlas/shield_patterns.png");
    public static final amo e = amo.b("textures/atlas/signs.png");
    public static final amo f = amo.b("textures/atlas/chest.png");
    public static final amo g = amo.b("textures/atlas/armor_trims.png");
    public static final amo h = amo.b("textures/atlas/decorated_pot.png");
    public static final amo i = amo.b("textures/atlas/gui.png");
    public static final amo j = amo.b("textures/atlas/map_decorations.png");
    public static final amo k = amo.b("textures/atlas/paintings.png");
    public static final amo l = amo.b("textures/atlas/celestials.png");
    private static final ijs ac = ijt.g(a);
    private static final ijs ad = ijt.d(b);
    private static final ijs ae = ijt.n(c);
    private static final ijs af = ijt.n(d);
    private static final ijs ag = ijt.g(e);
    private static final ijs ah = ijt.f(f);
    private static final ijs ai = ijt.a(g);
    private static final ijs aj = ijt.b(g);
    private static final ijs ak = ijt.d(ilo.d);
    private static final ijs al = ijt.f(ilo.d);
    private static final ijs am = ijt.i(ilo.d);
    private static final ijs an = ijt.i(ilo.e);
    public static final hom m = new hom(ilo.e, "item");
    public static final hom n = new hom(ilo.d, "block");
    public static final hom o = new hom(ilo.d, "entity");
    public static final hom p = new hom(c, "entity/banner");
    public static final hom q = new hom(d, "entity/shield");
    public static final hom r = new hom(f, "entity/chest");
    public static final hom s = new hom(h, "entity/decorated_pot");
    public static final hom t = new hom(b, "entity/bed");
    public static final hom u = new hom(a, "entity/shulker");
    public static final hom v = new hom(e, "entity/signs");
    public static final hom w = new hom(e, "entity/signs/hanging");
    public static final ins x = u.a("shulker");
    public static final List<ins> y = (List)Arrays.stream(dkr.values()).sorted(Comparator.comparingInt(dkr::a)).map(hpj::f).collect(ImmutableList.toImmutableList());
    public static final Map<epw, ins> z = epw.a().collect(Collectors.toMap(Function.identity(), hpj::c));
    public static final Map<epw, ins> A = epw.a().collect(Collectors.toMap(Function.identity(), hpj::d));
    public static final ins B = p.a("base");
    public static final ins C = q.a("base");
    private static final Map<amo, ins> ao = new HashMap<amo, ins>();
    private static final Map<amo, ins> ap = new HashMap<amo, ins>();
    public static final Map<amt<elv>, ins> D = mi.ai.c().collect(Collectors.toMap(jd.c::h, $$0 -> s.a(((elv)$$0.a()).a())));
    public static final ins E = s.a("decorated_pot_base");
    public static final ins F = s.a("decorated_pot_side");
    private static final ins[] aq = (ins[])Arrays.stream(dkr.values()).sorted(Comparator.comparingInt(dkr::a)).map(hpj::c).toArray(ins[]::new);
    public static final ins G = r.a("trapped");
    public static final ins H = r.a("trapped_left");
    public static final ins I = r.a("trapped_right");
    public static final ins J = r.a("christmas");
    public static final ins K = r.a("christmas_left");
    public static final ins L = r.a("christmas_right");
    public static final ins M = r.a("normal");
    public static final ins N = r.a("normal_left");
    public static final ins O = r.a("normal_right");
    public static final ins P = r.a("ender");
    public static final ins Q = r.a("copper");
    public static final ins R = r.a("copper_left");
    public static final ins S = r.a("copper_right");
    public static final ins T = r.a("copper_exposed");
    public static final ins U = r.a("copper_exposed_left");
    public static final ins V = r.a("copper_exposed_right");
    public static final ins W = r.a("copper_weathered");
    public static final ins X = r.a("copper_weathered_left");
    public static final ins Y = r.a("copper_weathered_right");
    public static final ins Z = r.a("copper_oxidized");
    public static final ins aa = r.a("copper_oxidized_left");
    public static final ins ab = r.a("copper_oxidized_right");

    public static ijs a() {
        return ae;
    }

    public static ijs b() {
        return af;
    }

    public static ijs c() {
        return ad;
    }

    public static ijs d() {
        return ac;
    }

    public static ijs e() {
        return ag;
    }

    public static ijs f() {
        return ag;
    }

    public static ijs g() {
        return ah;
    }

    public static ijs a(boolean $$0) {
        return $$0 ? aj : ai;
    }

    public static ijs h() {
        return ak;
    }

    public static ijs i() {
        return al;
    }

    public static ijs j() {
        return an;
    }

    public static ijs k() {
        return am;
    }

    public static ins a(dkr $$0) {
        return aq[$$0.a()];
    }

    public static amo b(dkr $$0) {
        return amo.b($$0.b());
    }

    public static ins c(dkr $$0) {
        return t.a(hpj.b($$0));
    }

    public static ins d(dkr $$0) {
        return y.get($$0.a());
    }

    public static amo e(dkr $$0) {
        return amo.b("shulker_" + $$0.b());
    }

    public static ins f(dkr $$0) {
        return u.a(hpj.e($$0));
    }

    private static ins c(epw $$0) {
        return v.a($$0.b());
    }

    private static ins d(epw $$0) {
        return w.a($$0.b());
    }

    public static ins a(epw $$0) {
        return z.get($$0);
    }

    public static ins b(epw $$0) {
        return A.get($$0);
    }

    public static ins a(jd<ekq> $$0) {
        return ao.computeIfAbsent($$0.a().a(), p::a);
    }

    public static ins b(jd<ekq> $$0) {
        return ap.computeIfAbsent($$0.a().a(), q::a);
    }

    public static @Nullable ins a(@Nullable amt<elv> $$0) {
        if ($$0 == null) {
            return null;
        }
        return D.get($$0);
    }

    public static ins a(hsq.a $$0, eoz $$1) {
        return switch ($$0) {
            default -> throw new MatchException(null, null);
            case hsq.a.a -> P;
            case hsq.a.b -> hpj.a($$1, J, K, L);
            case hsq.a.c -> hpj.a($$1, G, H, I);
            case hsq.a.d -> hpj.a($$1, Q, R, S);
            case hsq.a.e -> hpj.a($$1, T, U, V);
            case hsq.a.f -> hpj.a($$1, W, X, Y);
            case hsq.a.g -> hpj.a($$1, Z, aa, ab);
            case hsq.a.h -> hpj.a($$1, M, N, O);
        };
    }

    private static ins a(eoz $$0, ins $$1, ins $$2, ins $$3) {
        switch ($$0) {
            case b: {
                return $$2;
            }
            case c: {
                return $$3;
            }
        }
        return $$1;
    }
}

