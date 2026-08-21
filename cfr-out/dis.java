/*
 * Decompiled with CFR 0.152.
 */
public class dis<T extends dhi>
implements dgw {
    public static final dis<dhs> a = dis.a("generic_9x1", dhs::a);
    public static final dis<dhs> b = dis.a("generic_9x2", dhs::b);
    public static final dis<dhs> c = dis.a("generic_9x3", dhs::c);
    public static final dis<dhs> d = dis.a("generic_9x4", dhs::d);
    public static final dis<dhs> e = dis.a("generic_9x5", dhs::e);
    public static final dis<dhs> f = dis.a("generic_9x6", dhs::f);
    public static final dis<die> g = dis.a("generic_3x3", die::new);
    public static final dis<dhz> h = dis.a("crafter_3x3", dhz::new);
    public static final dis<dhm> i = dis.a("anvil", dhm::new);
    public static final dis<dho> j = dis.a("beacon", dho::new);
    public static final dis<dhp> k = dis.a("blast_furnace", dhp::new);
    public static final dis<dhq> l = dis.a("brewing_stand", dhq::new);
    public static final dis<dic> m = dis.a("crafting", dic::new);
    public static final dis<dif> n = dis.a("enchantment", dif::new);
    public static final dis<dih> o = dis.a("furnace", dih::new);
    public static final dis<dij> p = dis.a("grindstone", dij::new);
    public static final dis<dik> q = dis.a("hopper", dik::new);
    public static final dis<dip> r = dis.a("lectern", ($$0, $$1) -> new dip($$0));
    public static final dis<diq> s = dis.a("loom", diq::new);
    public static final dis<diu> t = dis.a("merchant", diu::new);
    public static final dis<djf> u = dis.a("shulker_box", djf::new);
    public static final dis<djl> v = dis.a("smithing", djl::new);
    public static final dis<djm> w = dis.a("smoker", djm::new);
    public static final dis<dhr> x = dis.a("cartography_table", dhr::new);
    public static final dis<djo> y = dis.a("stonecutter", djo::new);
    private final dgz z;
    private final a<T> A;

    private static <T extends dhi> dis<T> a(String $$0, a<T> $$1) {
        return jq.a(mi.q, $$0, new dis<T>($$1, dhb.g));
    }

    private static <T extends dhi> dis<T> a(String $$0, a<T> $$1, dgx ... $$2) {
        return jq.a(mi.q, $$0, new dis<T>($$1, dhb.e.a($$2)));
    }

    private dis(a<T> $$0, dgz $$1) {
        this.A = $$0;
        this.z = $$1;
    }

    public T a(int $$0, ddl $$1) {
        return this.A.create($$0, $$1);
    }

    @Override
    public dgz k() {
        return this.z;
    }

    static interface a<T extends dhi> {
        public T create(int var1, ddl var2);
    }
}

