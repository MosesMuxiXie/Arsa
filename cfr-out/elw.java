/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class elw {
    public static final amt<elv> a = elw.a("blank");
    public static final amt<elv> b = elw.a("angler");
    public static final amt<elv> c = elw.a("archer");
    public static final amt<elv> d = elw.a("arms_up");
    public static final amt<elv> e = elw.a("blade");
    public static final amt<elv> f = elw.a("brewer");
    public static final amt<elv> g = elw.a("burn");
    public static final amt<elv> h = elw.a("danger");
    public static final amt<elv> i = elw.a("explorer");
    public static final amt<elv> j = elw.a("flow");
    public static final amt<elv> k = elw.a("friend");
    public static final amt<elv> l = elw.a("guster");
    public static final amt<elv> m = elw.a("heart");
    public static final amt<elv> n = elw.a("heartbreak");
    public static final amt<elv> o = elw.a("howl");
    public static final amt<elv> p = elw.a("miner");
    public static final amt<elv> q = elw.a("mourner");
    public static final amt<elv> r = elw.a("plenty");
    public static final amt<elv> s = elw.a("prize");
    public static final amt<elv> t = elw.a("scrape");
    public static final amt<elv> u = elw.a("sheaf");
    public static final amt<elv> v = elw.a("shelter");
    public static final amt<elv> w = elw.a("skull");
    public static final amt<elv> x = elw.a("snort");
    private static final Map<dlp, amt<elv>> y = Map.ofEntries(Map.entry(dlx.sx, a), Map.entry(dlx.Au, b), Map.entry(dlx.Av, c), Map.entry(dlx.Aw, d), Map.entry(dlx.Ax, e), Map.entry(dlx.Ay, f), Map.entry(dlx.Az, g), Map.entry(dlx.AA, h), Map.entry(dlx.AB, i), Map.entry(dlx.AC, j), Map.entry(dlx.AD, k), Map.entry(dlx.AE, l), Map.entry(dlx.AF, m), Map.entry(dlx.AG, n), Map.entry(dlx.AH, o), Map.entry(dlx.AI, p), Map.entry(dlx.AJ, q), Map.entry(dlx.AK, r), Map.entry(dlx.AL, s), Map.entry(dlx.AM, t), Map.entry(dlx.AN, u), Map.entry(dlx.AO, v), Map.entry(dlx.AP, w), Map.entry(dlx.AQ, x));

    public static @Nullable amt<elv> a(dlp $$0) {
        return y.get($$0);
    }

    private static amt<elv> a(String $$0) {
        return amt.a(mj.u, amo.b($$0));
    }

    public static elv a(jq<elv> $$0) {
        elw.a($$0, b, "angler_pottery_pattern");
        elw.a($$0, c, "archer_pottery_pattern");
        elw.a($$0, d, "arms_up_pottery_pattern");
        elw.a($$0, e, "blade_pottery_pattern");
        elw.a($$0, f, "brewer_pottery_pattern");
        elw.a($$0, g, "burn_pottery_pattern");
        elw.a($$0, h, "danger_pottery_pattern");
        elw.a($$0, i, "explorer_pottery_pattern");
        elw.a($$0, j, "flow_pottery_pattern");
        elw.a($$0, k, "friend_pottery_pattern");
        elw.a($$0, l, "guster_pottery_pattern");
        elw.a($$0, m, "heart_pottery_pattern");
        elw.a($$0, n, "heartbreak_pottery_pattern");
        elw.a($$0, o, "howl_pottery_pattern");
        elw.a($$0, p, "miner_pottery_pattern");
        elw.a($$0, q, "mourner_pottery_pattern");
        elw.a($$0, r, "plenty_pottery_pattern");
        elw.a($$0, s, "prize_pottery_pattern");
        elw.a($$0, t, "scrape_pottery_pattern");
        elw.a($$0, u, "sheaf_pottery_pattern");
        elw.a($$0, v, "shelter_pottery_pattern");
        elw.a($$0, w, "skull_pottery_pattern");
        elw.a($$0, x, "snort_pottery_pattern");
        return elw.a($$0, a, "decorated_pot_side");
    }

    private static elv a(jq<elv> $$0, amt<elv> $$1, String $$2) {
        return jq.a($$0, $$1, new elv(amo.b($$2)));
    }
}

