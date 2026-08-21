/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

public interface dum {
    public static final amt<? extends jq<dul>> a = amt.a(amo.b("equipment_asset"));
    public static final amt<dul> b = dum.a("leather");
    public static final amt<dul> c = dum.a("copper");
    public static final amt<dul> d = dum.a("chainmail");
    public static final amt<dul> e = dum.a("iron");
    public static final amt<dul> f = dum.a("gold");
    public static final amt<dul> g = dum.a("diamond");
    public static final amt<dul> h = dum.a("turtle_scute");
    public static final amt<dul> i = dum.a("netherite");
    public static final amt<dul> j = dum.a("armadillo_scute");
    public static final amt<dul> k = dum.a("elytra");
    public static final amt<dul> l = dum.a("saddle");
    public static final Map<dkr, amt<dul>> m = bhs.a(dkr.class, $$0 -> dum.a($$0.c() + "_carpet"));
    public static final amt<dul> n = dum.a("trader_llama");
    public static final Map<dkr, amt<dul>> o = bhs.a(dkr.class, $$0 -> dum.a($$0.c() + "_harness"));

    public static amt<dul> a(String $$0) {
        return amt.a(a, amo.b($$0));
    }
}

