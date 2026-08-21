/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Supplier;

public class cse<U extends csd<?>> {
    public static final cse<crn> a = cse.a("dummy", crn::new);
    public static final cse<crv> b = cse.a("nearest_items", crv::new);
    public static final cse<crw<chl>> c = cse.a("nearest_living_entities", crw::new);
    public static final cse<csa> d = cse.a("nearest_players", csa::new);
    public static final cse<cru> e = cse.a("nearest_bed", cru::new);
    public static final cse<crr> f = cse.a("hurt_by", crr::new);
    public static final cse<csh> g = cse.a("villager_hostiles", csh::new);
    public static final cse<csg> h = cse.a("villager_babies", csg::new);
    public static final cse<csb> i = cse.a("secondary_pois", csb::new);
    public static final cse<crp> j = cse.a("golem_detected", crp::new);
    public static final cse<crt<cto>> k = cse.a("armadillo_scare_detected", () -> new crt<cto>(5, cto::i, cto::gV, cqw.H, 80));
    public static final cse<crz> l = cse.a("piglin_specific_sensor", crz::new);
    public static final cse<cry> m = cse.a("piglin_brute_specific_sensor", cry::new);
    public static final cse<crq> n = cse.a("hoglin_specific_sensor", crq::new);
    public static final cse<crj> o = cse.a("nearest_adult", crj::new);
    public static final cse<crj> p = cse.a("nearest_adult_any_type", crk::new);
    public static final cse<crl> q = cse.a("axolotl_attackables", crl::new);
    public static final cse<csf> r = cse.a("food_temptations", csf::b);
    public static final cse<csf> s = cse.a("frog_temptations", () -> new csf(cvr.a()));
    public static final cse<csf> t = cse.a("nautilus_temptations", () -> new csf(cwp.b()));
    public static final cse<cro> u = cse.a("frog_attackables", cro::new);
    public static final cse<crs> v = cse.a("is_in_water", crs::new);
    public static final cse<csi> w = cse.a("warden_entity_sensor", csi::new);
    public static final cse<crm> x = cse.a("breeze_attack_entity_sensor", crm::new);
    private final Supplier<U> y;

    private cse(Supplier<U> $$0) {
        this.y = $$0;
    }

    public U a() {
        return (U)((csd)this.y.get());
    }

    private static <U extends csd<?>> cse<U> a(String $$0, Supplier<U> $$1) {
        return jq.a(mi.B, amo.b($$0), new cse<U>($$1));
    }
}

