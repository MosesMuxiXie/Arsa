/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public interface drc<T extends dqs<?>> {
    public static final drc<drg> a = drc.a("crafting_shaped", new drg.a());
    public static final drc<dri> b = drc.a("crafting_shapeless", new dri.a());
    public static final drc<dpz> c = drc.a("crafting_special_armordye", new dqi.a<dpz>(dpz::new));
    public static final drc<dqc> d = drc.a("crafting_special_bookcloning", new dqi.a<dqc>(dqc::new));
    public static final drc<dqp> e = drc.a("crafting_special_mapcloning", new dqi.a<dqp>(dqp::new));
    public static final drc<dqq> f = drc.a("crafting_special_mapextending", new dqi.a<dqq>(dqq::new));
    public static final drc<dql> g = drc.a("crafting_special_firework_rocket", new dqi.a<dql>(dql::new));
    public static final drc<dqn> h = drc.a("crafting_special_firework_star", new dqi.a<dqn>(dqn::new));
    public static final drc<dqm> i = drc.a("crafting_special_firework_star_fade", new dqi.a<dqm>(dqm::new));
    public static final drc<drt> j = drc.a("crafting_special_tippedarrow", new dqi.a<drt>(drt::new));
    public static final drc<dqa> k = drc.a("crafting_special_bannerduplicate", new dqi.a<dqa>(dqa::new));
    public static final drc<drj> l = drc.a("crafting_special_shielddecoration", new dqi.a<drj>(drj::new));
    public static final drc<dru> m = drc.a("crafting_transmute", new dru.a());
    public static final drc<dre> n = drc.a("crafting_special_repairitem", new dqi.a<dre>(dre::new));
    public static final drc<drm> o = drc.a("smelting", new dpy.b<drm>(drm::new, 200));
    public static final drc<dqb> p = drc.a("blasting", new dpy.b<dqb>(dqb::new, 100));
    public static final drc<drr> q = drc.a("smoking", new dpy.b<drr>(drr::new, 100));
    public static final drc<dqd> r = drc.a("campfire_cooking", new dpy.b<dqd>(dqd::new, 100));
    public static final drc<drs> s = drc.a("stonecutting", new drk.b<drs>(drs::new));
    public static final drc<drp> t = drc.a("smithing_transform", new drp.a());
    public static final drc<drq> u = drc.a("smithing_trim", new drq.a());
    public static final drc<dqj> v = drc.a("crafting_decorated_pot", new dqi.a<dqj>(dqj::new));

    public MapCodec<T> a();

    @Deprecated
    public aao<xq, T> b();

    public static <S extends drc<T>, T extends dqs<?>> S a(String $$0, S $$1) {
        return (S)jq.a(mi.s, $$0, $$1);
    }
}

