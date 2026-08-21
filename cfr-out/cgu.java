/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;
import net.minecraft.server.MinecraftServer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class cgu<T extends cgk>
implements dgw,
esw<cgk, T> {
    private static final Logger ce = LogUtils.getLogger();
    private final jd.c<cgu<?>> cf = mi.g.f(this);
    public static final Codec<cgu<?>> a = mi.g.q();
    public static final aao<xq, cgu<?>> b = aam.a(mj.F);
    private static final float cg = 1.3964844f;
    private static final int ch = 10;
    public static final cgu<dgd> c = cgu.a("acacia_boat", cgu$a.a(cgu.a(() -> dlx.pz), cho.h).e().a(1.375f, 0.5625f).b(0.5625f).a(10));
    public static final cgu<dge> d = cgu.a("acacia_chest_boat", cgu$a.a(cgu.b(() -> dlx.pA), cho.h).e().a(1.375f, 0.5625f).b(0.5625f).a(10));
    public static final cgu<ctl> e = cgu.a("allay", cgu$a.a(ctl::new, cho.b).a(0.35f, 0.6f).b(0.36f).c(0.04f).a(8).b(2));
    public static final cgu<cga> f = cgu.a("area_effect_cloud", cgu$a.a(cga::new, cho.h).e().c().a(6.0f, 0.5f).a(10).b(Integer.MAX_VALUE));
    public static final cgu<cto> g = cgu.a("armadillo", cgu$a.a(cto::new, cho.b).a(0.7f, 0.65f).b(0.26f).a(10));
    public static final cgu<cyy> h = cgu.a("armor_stand", cgu$a.a(cyy::new, cho.h).a(0.5f, 1.975f).b(1.7775f).a(10));
    public static final cgu<dei> i = cgu.a("arrow", cgu$a.a(dei::new, cho.h).e().a(0.5f, 0.5f).b(0.13f).a(4).b(20));
    public static final cgu<ctr> j = cgu.a("axolotl", cgu$a.a(ctr::new, cho.d).a(0.75f, 0.42f).b(0.2751f).a(10));
    public static final cgu<dgf> k = cgu.a("bamboo_chest_raft", cgu$a.a(cgu.d(() -> dlx.pK), cho.h).e().a(1.375f, 0.5625f).b(0.5625f).a(10));
    public static final cgu<dgg> l = cgu.a("bamboo_raft", cgu$a.a(cgu.c(() -> dlx.pJ), cho.h).e().a(1.375f, 0.5625f).b(0.5625f).a(10));
    public static final cgu<cte> m = cgu.a("bat", cgu$a.a(cte::new, cho.c).a(0.5f, 0.9f).b(0.45f).a(5));
    public static final cgu<ctw> n = cgu.a("bee", cgu$a.a(ctw::new, cho.b).a(0.7f, 0.6f).b(0.3f).a(8));
    public static final cgu<dgd> o = cgu.a("birch_boat", cgu$a.a(cgu.a(() -> dlx.pv), cho.h).e().a(1.375f, 0.5625f).b(0.5625f).a(10));
    public static final cgu<dge> p = cgu.a("birch_chest_boat", cgu$a.a(cgu.b(() -> dlx.pw), cho.h).e().a(1.375f, 0.5625f).b(0.5625f).a(10));
    public static final cgu<czo> q = cgu.a("blaze", cgu$a.a(czo::new, cho.a).c().a(0.6f, 1.8f).a(8).f());
    public static final cgu<cgh.b> r = cgu.a("block_display", cgu$a.a(cgh.b::new, cho.h).e().a(0.0f, 0.0f).a(10).b(1));
    public static final cgu<dbw> s = cgu.a("bogged", cgu$a.a(dbw::new, cho.a).a(0.6f, 1.99f).b(1.74f).c(-0.7f).a(8).f());
    public static final cgu<dal> t = cgu.a("breeze", cgu$a.a(dal::new, cho.a).a(0.6f, 1.77f).b(1.3452f).a(10).f());
    public static final cgu<deu> u = cgu.a("breeze_wind_charge", cgu$a.a(deu::new, cho.h).e().a(0.3125f, 0.3125f).b(0.0f).a(4).b(10));
    public static final cgu<cty> v = cgu.a("camel", cgu$a.a(cty::new, cho.b).a(1.7f, 2.375f).b(2.275f).a(10));
    public static final cgu<cua> w = cgu.a("camel_husk", cgu$a.a(cua::new, cho.a).a(1.7f, 2.375f).b(2.275f).a(10));
    public static final cgu<cvb> x = cgu.a("cat", cgu$a.a(cvb::new, cho.b).a(0.6f, 0.7f).b(0.35f).a(new float[]{0.5125f}).a(8));
    public static final cgu<dcc> y = cgu.a("cave_spider", cgu$a.a(dcc::new, cho.a).a(0.7f, 0.5f).b(0.45f).a(8).f());
    public static final cgu<dgd> z = cgu.a("cherry_boat", cgu$a.a(cgu.a(() -> dlx.pB), cho.h).e().a(1.375f, 0.5625f).b(0.5625f).a(10));
    public static final cgu<dge> A = cgu.a("cherry_chest_boat", cgu$a.a(cgu.b(() -> dlx.pC), cho.h).e().a(1.375f, 0.5625f).b(0.5625f).a(10));
    public static final cgu<dgm> B = cgu.a("chest_minecart", cgu$a.a(dgm::new, cho.h).e().a(0.98f, 0.7f).a(new float[]{0.1875f}).a(8));
    public static final cgu<cuc> C = cgu.a("chicken", cgu$a.a(cuc::new, cho.b).a(0.4f, 0.7f).b(0.644f).a(new ftm[]{new ftm(0.0, 0.7, -0.1)}).a(10));
    public static final cgu<cvi> D = cgu.a("cod", cgu$a.a(cvi::new, cho.g).a(0.5f, 0.3f).b(0.195f).a(4));
    public static final cgu<cwc> E = cgu.a("copper_golem", cgu$a.a(cwc::new, cho.h).a(0.49f, 0.98f).b(0.8125f).a(10));
    public static final cgu<dgn> F = cgu.a("command_block_minecart", cgu$a.a(dgn::new, cho.h).e().a(0.98f, 0.7f).a(new float[]{0.1875f}).a(8));
    public static final cgu<cuh> G = cgu.a("cow", cgu$a.a(cuh::new, cho.b).a(0.9f, 1.4f).b(1.3f).a(new float[]{1.36875f}).a(10));
    public static final cgu<dat> H = cgu.a("creaking", cgu$a.a(dat::new, cho.a).a(0.9f, 2.7f).b(2.3f).a(8).f());
    public static final cgu<czp> I = cgu.a("creeper", cgu$a.a(czp::new, cho.a).a(0.6f, 1.7f).a(8).f());
    public static final cgu<dgd> J = cgu.a("dark_oak_boat", cgu$a.a(cgu.a(() -> dlx.pD), cho.h).e().a(1.375f, 0.5625f).b(0.5625f).a(10));
    public static final cgu<dge> K = cgu.a("dark_oak_chest_boat", cgu$a.a(cgu.b(() -> dlx.pE), cho.h).e().a(1.375f, 0.5625f).b(0.5625f).a(10));
    public static final cgu<cum> L = cgu.a("dolphin", cgu$a.a(cum::new, cho.f).a(0.9f, 0.6f).b(0.3f));
    public static final cgu<cuq> M = cgu.a("donkey", cgu$a.a(cuq::new, cho.b).a(1.3964844f, 1.5f).b(1.425f).a(new float[]{1.1125f}).a(10));
    public static final cgu<den> N = cgu.a("dragon_fireball", cgu$a.a(den::new, cho.h).e().a(1.0f, 1.0f).a(4).b(10));
    public static final cgu<dcl> O = cgu.a("drowned", cgu$a.a(dcl::new, cho.a).a(0.6f, 1.95f).b(1.74f).a(new float[]{2.0125f}).c(-0.7f).a(8).f());
    public static final cgu<dfb> P = cgu.a("egg", cgu$a.a(dfb::new, cho.h).e().a(0.25f, 0.25f).a(4).b(10));
    public static final cgu<czr> Q = cgu.a("elder_guardian", cgu$a.a(czr::new, cho.a).a(1.9975f, 1.9975f).b(0.99875f).a(new float[]{2.350625f}).a(10).f());
    public static final cgu<czs> R = cgu.a("enderman", cgu$a.a(czs::new, cho.a).a(0.6f, 2.9f).b(2.55f).a(new float[]{2.80625f}).a(8).f());
    public static final cgu<czt> S = cgu.a("endermite", cgu$a.a(czt::new, cho.a).a(0.4f, 0.3f).b(0.13f).a(new float[]{0.2375f}).a(8).f());
    public static final cgu<cyc> T = cgu.a("ender_dragon", cgu$a.a(cyc::new, cho.a).c().a(16.0f, 8.0f).a(new float[]{3.0f}).a(10));
    public static final cgu<dfc> U = cgu.a("ender_pearl", cgu$a.a(dfc::new, cho.h).e().a(0.25f, 0.25f).a(4).b(10));
    public static final cgu<cyb> V = cgu.a("end_crystal", cgu$a.a(cyb::new, cho.h).e().c().a(2.0f, 2.0f).a(16).b(Integer.MAX_VALUE));
    public static final cgu<dbb> W = cgu.a("evoker", cgu$a.a(dbb::new, cho.a).a(0.6f, 1.95f).a(new float[]{2.0f}).c(-0.6f).a(8).f());
    public static final cgu<ddw> X = cgu.a("evoker_fangs", cgu$a.a(ddw::new, cho.h).e().a(0.5f, 0.8f).a(6).b(2));
    public static final cgu<dfd> Y = cgu.a("experience_bottle", cgu$a.a(dfd::new, cho.h).e().a(0.25f, 0.25f).a(4).b(10));
    public static final cgu<cgz> Z = cgu.a("experience_orb", cgu$a.a(cgz::new, cho.h).e().a(0.5f, 0.5f).a(6).b(20));
    public static final cgu<ddx> aa = cgu.a("eye_of_ender", cgu$a.a(ddx::new, cho.h).e().a(0.25f, 0.25f).a(4).b(4));
    public static final cgu<czk> ab = cgu.a("falling_block", cgu$a.a(czk::new, cho.h).e().a(0.98f, 0.98f).a(10).b(20));
    public static final cgu<dep> ac = cgu.a("fireball", cgu$a.a(dep::new, cho.h).e().a(1.0f, 1.0f).a(4).b(10));
    public static final cgu<ddy> ad = cgu.a("firework_rocket", cgu$a.a(ddy::new, cho.h).e().a(0.25f, 0.25f).a(4).b(10));
    public static final cgu<cvo> ae = cgu.a("fox", cgu$a.a(cvo::new, cho.b).a(0.6f, 0.7f).b(0.4f).a(new ftm[]{new ftm(0.0, 0.6375, -0.25)}).a(8).a(dzs.pg));
    public static final cgu<cvq> af = cgu.a("frog", cgu$a.a(cvq::new, cho.b).a(0.5f, 0.5f).a(new ftm[]{new ftm(0.0, 0.375, -0.25)}).a(10));
    public static final cgu<dgo> ag = cgu.a("furnace_minecart", cgu$a.a(dgo::new, cho.h).e().a(0.98f, 0.7f).a(new float[]{0.1875f}).a(8));
    public static final cgu<czv> ah = cgu.a("ghast", cgu$a.a(czv::new, cho.a).c().a(4.0f, 4.0f).b(2.6f).a(new float[]{4.0625f}).c(0.5f).a(10).f());
    public static final cgu<cwk> ai = cgu.a("happy_ghast", cgu$a.a(cwk::new, cho.b).a(4.0f, 4.0f).b(2.6f).a(new ftm(0.0, 4.0, 1.7), new ftm(-1.7, 4.0, 0.0), new ftm(0.0, 4.0, -1.7), new ftm(1.7, 4.0, 0.0)).c(0.5f).a(10));
    public static final cgu<czw> aj = cgu.a("giant", cgu$a.a(czw::new, cho.a).a(3.6f, 12.0f).b(10.44f).c(-3.75f).a(10).f());
    public static final cgu<cza> ak = cgu.a("glow_item_frame", cgu$a.a(cza::new, cho.h).e().a(0.5f, 0.5f).b(0.0f).a(10).b(Integer.MAX_VALUE));
    public static final cgu<cxp> al = cgu.a("glow_squid", cgu$a.a(cxp::new, cho.e).a(0.8f, 0.8f).b(0.4f).a(10));
    public static final cgu<cvy> am = cgu.a("goat", cgu$a.a(cvy::new, cho.b).a(0.9f, 1.3f).a(new float[]{1.1125f}).a(10));
    public static final cgu<czx> an = cgu.a("guardian", cgu$a.a(czx::new, cho.a).a(0.85f, 0.85f).b(0.425f).a(new float[]{0.975f}).a(8).f());
    public static final cgu<daw> ao = cgu.a("hoglin", cgu$a.a(daw::new, cho.a).a(1.3964844f, 1.4f).a(new float[]{1.49375f}).a(8));
    public static final cgu<dgp> ap = cgu.a("hopper_minecart", cgu$a.a(dgp::new, cho.h).e().a(0.98f, 0.7f).a(new float[]{0.1875f}).a(8));
    public static final cgu<cur> aq = cgu.a("horse", cgu$a.a(cur::new, cho.b).a(1.3964844f, 1.6f).b(1.52f).a(new float[]{1.44375f}).a(10));
    public static final cgu<dcm> ar = cgu.a("husk", cgu$a.a(dcm::new, cho.a).a(0.6f, 1.95f).b(1.74f).a(new float[]{2.075f}).c(-0.7f).a(8).f());
    public static final cgu<dbc> as = cgu.a("illusioner", cgu$a.a(dbc::new, cho.a).a(0.6f, 1.95f).a(new float[]{2.0f}).c(-0.6f).a(8).f());
    public static final cgu<che> at = cgu.a("interaction", cgu$a.a(che::new, cho.h).e().a(0.0f, 0.0f).a(10));
    public static final cgu<cwh> au = cgu.a("iron_golem", cgu$a.a(cwh::new, cho.h).a(1.4f, 2.7f).a(10));
    public static final cgu<czl> av = cgu.a("item", cgu$a.a(czl::new, cho.h).e().a(0.25f, 0.25f).b(0.2125f).a(6).b(20));
    public static final cgu<cgh.g> aw = cgu.a("item_display", cgu$a.a(cgh.g::new, cho.h).e().a(0.0f, 0.0f).a(10).b(1));
    public static final cgu<czc> ax = cgu.a("item_frame", cgu$a.a(czc::new, cho.h).e().a(0.5f, 0.5f).b(0.0f).a(10).b(Integer.MAX_VALUE));
    public static final cgu<dgd> ay = cgu.a("jungle_boat", cgu$a.a(cgu.a(() -> dlx.px), cho.h).e().a(1.375f, 0.5625f).b(0.5625f).a(10));
    public static final cgu<dge> az = cgu.a("jungle_chest_boat", cgu$a.a(cgu.b(() -> dlx.py), cho.h).e().a(1.375f, 0.5625f).b(0.5625f).a(10));
    public static final cgu<czd> aA = cgu.a("leash_knot", cgu$a.a(czd::new, cho.h).e().b().a(0.375f, 0.5f).b(0.0625f).a(10).b(Integer.MAX_VALUE));
    public static final cgu<chk> aB = cgu.a("lightning_bolt", cgu$a.a(chk::new, cho.h).e().b().a(0.0f, 0.0f).a(16).b(Integer.MAX_VALUE));
    public static final cgu<cus> aC = cgu.a("llama", cgu$a.a(cus::new, cho.b).a(0.9f, 1.87f).b(1.7765f).a(new ftm[]{new ftm(0.0, 1.37, -0.3)}).a(10));
    public static final cgu<deb> aD = cgu.a("llama_spit", cgu$a.a(deb::new, cho.h).e().a(0.25f, 0.25f).a(4).b(10));
    public static final cgu<czy> aE = cgu.a("magma_cube", cgu$a.a(czy::new, cho.a).c().a(0.52f, 0.52f).b(0.325f).a(4.0f).a(8).f());
    public static final cgu<dgd> aF = cgu.a("mangrove_boat", cgu$a.a(cgu.a(() -> dlx.pH), cho.h).e().a(1.375f, 0.5625f).b(0.5625f).a(10));
    public static final cgu<dge> aG = cgu.a("mangrove_chest_boat", cgu$a.a(cgu.b(() -> dlx.pI), cho.h).e().a(1.375f, 0.5625f).b(0.5625f).a(10));
    public static final cgu<cze> aH = cgu.a("mannequin", cgu$a.a(cze::a, cho.h).a(0.6f, 1.8f).b(1.62f).a(cgc.o).a(32).b(2));
    public static final cgu<chm> aI = cgu.a("marker", cgu$a.a(chm::new, cho.h).e().a(0.0f, 0.0f).a(0));
    public static final cgu<dgk> aJ = cgu.a("minecart", cgu$a.a(dgk::new, cho.h).e().a(0.98f, 0.7f).a(new float[]{0.1875f}).a(8));
    public static final cgu<cuk> aK = cgu.a("mooshroom", cgu$a.a(cuk::new, cho.b).a(0.9f, 1.4f).b(1.3f).a(new float[]{1.36875f}).a(10));
    public static final cgu<cuu> aL = cgu.a("mule", cgu$a.a(cuu::new, cho.b).a(1.3964844f, 1.6f).b(1.52f).a(new float[]{1.2125f}).a(8));
    public static final cgu<cwo> aM = cgu.a("nautilus", cgu$a.a(cwo::new, cho.f).a(0.875f, 0.95f).a(new float[]{1.1375f}).b(0.2751f).a(10));
    public static final cgu<dgd> aN = cgu.a("oak_boat", cgu$a.a(cgu.a(() -> dlx.pr), cho.h).e().a(1.375f, 0.5625f).b(0.5625f).a(10));
    public static final cgu<dge> aO = cgu.a("oak_chest_boat", cgu$a.a(cgu.b(() -> dlx.ps), cho.h).e().a(1.375f, 0.5625f).b(0.5625f).a(10));
    public static final cgu<cve> aP = cgu.a("ocelot", cgu$a.a(cve::new, cho.b).a(0.6f, 0.7f).a(new float[]{0.6375f}).a(10));
    public static final cgu<chr> aQ = cgu.a("ominous_item_spawner", cgu$a.a(chr::new, cho.h).e().a(0.25f, 0.25f).a(8));
    public static final cgu<czg> aR = cgu.a("painting", cgu$a.a(czg::new, cho.h).e().a(0.5f, 0.5f).a(10).b(Integer.MAX_VALUE));
    public static final cgu<dgd> aS = cgu.a("pale_oak_boat", cgu$a.a(cgu.a(() -> dlx.pF), cho.h).e().a(1.375f, 0.5625f).b(0.5625f).a(10));
    public static final cgu<dge> aT = cgu.a("pale_oak_chest_boat", cgu$a.a(cgu.b(() -> dlx.pG), cho.h).e().a(1.375f, 0.5625f).b(0.5625f).a(10));
    public static final cgu<cww> aU = cgu.a("panda", cgu$a.a(cww::new, cho.b).a(1.3f, 1.25f).a(10));
    public static final cgu<dbx> aV = cgu.a("parched", cgu$a.a(dbx::new, cho.a).a(0.6f, 1.99f).b(1.74f).c(-0.7f).a(8).f());
    public static final cgu<cwy> aW = cgu.a("parrot", cgu$a.a(cwy::new, cho.b).a(0.5f, 0.9f).b(0.54f).a(new float[]{0.4625f}).a(8));
    public static final cgu<dab> aX = cgu.a("phantom", cgu$a.a(dab::new, cho.a).a(0.9f, 0.5f).b(0.175f).a(new float[]{0.3375f}).c(-0.125f).a(8).f());
    public static final cgu<cxb> aY = cgu.a("pig", cgu$a.a(cxb::new, cho.b).a(0.9f, 0.9f).a(new float[]{0.86875f}).a(10));
    public static final cgu<dbj> aZ = cgu.a("piglin", cgu$a.a(dbj::new, cho.a).a(0.6f, 1.95f).b(1.79f).a(new float[]{2.0125f}).c(-0.7f).a(8));
    public static final cgu<dbm> ba = cgu.a("piglin_brute", cgu$a.a(dbm::new, cho.a).a(0.6f, 1.95f).b(1.79f).a(new float[]{2.0125f}).c(-0.7f).a(8).f());
    public static final cgu<dbd> bb = cgu.a("pillager", cgu$a.a(dbd::new, cho.a).d().a(0.6f, 1.95f).a(new float[]{2.0f}).c(-0.6f).a(8).f());
    public static final cgu<cxf> bc = cgu.a("polar_bear", cgu$a.a(cxf::new, cho.b).a(dzs.rP).a(1.4f, 1.4f).a(10));
    public static final cgu<dff> bd = cgu.a("splash_potion", cgu$a.a(dff::new, cho.h).e().a(0.25f, 0.25f).a(4).b(10));
    public static final cgu<dfe> be = cgu.a("lingering_potion", cgu$a.a(dfe::new, cho.h).e().a(0.25f, 0.25f).a(4).b(10));
    public static final cgu<cvj> bf = cgu.a("pufferfish", cgu$a.a(cvj::new, cho.g).a(0.7f, 0.7f).b(0.455f).a(4));
    public static final cgu<cxh> bg = cgu.a("rabbit", cgu$a.a(cxh::new, cho.b).a(0.4f, 0.5f).a(8));
    public static final cgu<dad> bh = cgu.a("ravager", cgu$a.a(dad::new, cho.a).a(1.95f, 2.2f).a(new ftm[]{new ftm(0.0, 2.2625, -0.0625)}).a(10).f());
    public static final cgu<cvk> bi = cgu.a("salmon", cgu$a.a(cvk::new, cho.g).a(0.7f, 0.4f).b(0.26f).a(4));
    public static final cgu<cxj> bj = cgu.a("sheep", cgu$a.a(cxj::new, cho.b).a(0.9f, 1.3f).b(1.235f).a(new float[]{1.2375f}).a(10));
    public static final cgu<dae> bk = cgu.a("shulker", cgu$a.a(dae::new, cho.a).c().d().a(1.0f, 1.0f).b(0.5f).a(10));
    public static final cgu<def> bl = cgu.a("shulker_bullet", cgu$a.a(def::new, cho.h).e().a(0.3125f, 0.3125f).a(8));
    public static final cgu<daf> bm = cgu.a("silverfish", cgu$a.a(daf::new, cho.a).a(0.4f, 0.3f).b(0.13f).a(new float[]{0.2375f}).a(8).f());
    public static final cgu<dby> bn = cgu.a("skeleton", cgu$a.a(dby::new, cho.a).a(0.6f, 1.99f).b(1.74f).c(-0.7f).a(8).f());
    public static final cgu<cuv> bo = cgu.a("skeleton_horse", cgu$a.a(cuv::new, cho.b).a(1.3964844f, 1.6f).b(1.52f).a(new float[]{1.31875f}).a(10));
    public static final cgu<dag> bp = cgu.a("slime", cgu$a.a(dag::new, cho.a).a(0.52f, 0.52f).b(0.325f).a(4.0f).a(10).f());
    public static final cgu<deq> bq = cgu.a("small_fireball", cgu$a.a(deq::new, cho.h).e().a(0.3125f, 0.3125f).a(4).b(10));
    public static final cgu<cxm> br = cgu.a("sniffer", cgu$a.a(cxm::new, cho.b).a(1.9f, 1.75f).b(1.05f).a(new float[]{2.09375f}).d(2.05f).a(10));
    public static final cgu<dez> bs = cgu.a("snowball", cgu$a.a(dez::new, cho.h).e().a(0.25f, 0.25f).a(4).b(10));
    public static final cgu<cwi> bt = cgu.a("snow_golem", cgu$a.a(cwi::new, cho.h).a(dzs.rP).a(0.7f, 1.9f).b(1.7f).a(8));
    public static final cgu<dgq> bu = cgu.a("spawner_minecart", cgu$a.a(dgq::new, cho.h).e().a(0.98f, 0.7f).a(new float[]{0.1875f}).a(8));
    public static final cgu<dej> bv = cgu.a("spectral_arrow", cgu$a.a(dej::new, cho.h).e().a(0.5f, 0.5f).b(0.13f).a(4).b(20));
    public static final cgu<dcd> bw = cgu.a("spider", cgu$a.a(dcd::new, cho.a).a(1.4f, 0.9f).b(0.65f).a(new float[]{0.765f}).a(8).f());
    public static final cgu<dgd> bx = cgu.a("spruce_boat", cgu$a.a(cgu.a(() -> dlx.pt), cho.h).e().a(1.375f, 0.5625f).b(0.5625f).a(10));
    public static final cgu<dge> by = cgu.a("spruce_chest_boat", cgu$a.a(cgu.b(() -> dlx.pu), cho.h).e().a(1.375f, 0.5625f).b(0.5625f).a(10));
    public static final cgu<cxq> bz = cgu.a("squid", cgu$a.a(cxq::new, cho.f).a(0.8f, 0.8f).b(0.4f).a(8));
    public static final cgu<dbz> bA = cgu.a("stray", cgu$a.a(dbz::new, cho.a).a(0.6f, 1.99f).b(1.74f).c(-0.7f).a(dzs.rP).a(8).f());
    public static final cgu<dah> bB = cgu.a("strider", cgu$a.a(dah::new, cho.b).c().a(0.9f, 1.7f).a(10));
    public static final cgu<cvv> bC = cgu.a("tadpole", cgu$a.a(cvv::new, cho.b).a(0.4f, 0.3f).b(0.19500001f).a(10));
    public static final cgu<cgh.k> bD = cgu.a("text_display", cgu$a.a(cgh.k::new, cho.h).e().a(0.0f, 0.0f).a(10).b(1));
    public static final cgu<czm> bE = cgu.a("tnt", cgu$a.a(czm::new, cho.h).e().c().a(0.98f, 0.98f).b(0.15f).a(10).b(10));
    public static final cgu<dgr> bF = cgu.a("tnt_minecart", cgu$a.a(dgr::new, cho.h).e().a(0.98f, 0.7f).a(new float[]{0.1875f}).a(8));
    public static final cgu<cux> bG = cgu.a("trader_llama", cgu$a.a(cux::new, cho.b).a(0.9f, 1.87f).b(1.7765f).a(new ftm[]{new ftm(0.0, 1.37, -0.3)}).a(10));
    public static final cgu<dek> bH = cgu.a("trident", cgu$a.a(dek::new, cho.h).e().a(0.5f, 0.5f).b(0.13f).a(4).b(20));
    public static final cgu<cvl> bI = cgu.a("tropical_fish", cgu$a.a(cvl::new, cho.g).a(0.5f, 0.4f).b(0.26f).a(4));
    public static final cgu<cxs> bJ = cgu.a("turtle", cgu$a.a(cxs::new, cho.b).a(1.2f, 0.4f).a(new ftm[]{new ftm(0.0, 0.55625, -0.25)}).a(10));
    public static final cgu<dai> bK = cgu.a("vex", cgu$a.a(dai::new, cho.a).c().a(0.4f, 0.8f).b(0.51875f).a(new float[]{0.7375f}).c(0.04f).a(8).f());
    public static final cgu<dcx> bL = cgu.a("villager", cgu$a.a(dcx::new, cho.h).a(0.6f, 1.95f).b(1.62f).a(10));
    public static final cgu<dbf> bM = cgu.a("vindicator", cgu$a.a(dbf::new, cho.a).a(0.6f, 1.95f).a(new float[]{2.0f}).c(-0.6f).a(8).f());
    public static final cgu<dde> bN = cgu.a("wandering_trader", cgu$a.a(dde::new, cho.b).a(0.6f, 1.95f).b(1.62f).a(10));
    public static final cgu<dch> bO = cgu.a("warden", cgu$a.a(dch::new, cho.a).a(0.9f, 2.9f).a(new float[]{3.15f}).a(cgl.d, 0.0f, 1.6f, 0.0f).a(16).c().f());
    public static final cgu<dev> bP = cgu.a("wind_charge", cgu$a.a(dev::new, cho.h).e().a(0.3125f, 0.3125f).b(0.0f).a(4).b(10));
    public static final cgu<daj> bQ = cgu.a("witch", cgu$a.a(daj::new, cho.a).a(0.6f, 1.95f).b(1.62f).a(new float[]{2.2625f}).a(8).f());
    public static final cgu<cyw> bR = cgu.a("wither", cgu$a.a(cyw::new, cho.a).c().a(dzs.cn).a(0.9f, 3.5f).a(10).f());
    public static final cgu<dca> bS = cgu.a("wither_skeleton", cgu$a.a(dca::new, cho.a).c().a(dzs.cn).a(0.7f, 2.4f).b(2.1f).c(-0.875f).a(8).f());
    public static final cgu<der> bT = cgu.a("wither_skull", cgu$a.a(der::new, cho.h).e().a(0.3125f, 0.3125f).a(4).b(10));
    public static final cgu<cxu> bU = cgu.a("wolf", cgu$a.a(cxu::new, cho.b).a(0.6f, 0.85f).b(0.68f).a(new ftm[]{new ftm(0.0, 0.81875, -0.0625)}).a(10));
    public static final cgu<dak> bV = cgu.a("zoglin", cgu$a.a(dak::new, cho.a).c().a(1.3964844f, 1.4f).a(new float[]{1.49375f}).a(8).f());
    public static final cgu<dcn> bW = cgu.a("zombie", cgu$a.a(dcn::new, cho.a).a(0.6f, 1.95f).b(1.74f).a(new float[]{2.0125f}).c(-0.7f).a(8).f());
    public static final cgu<cuz> bX = cgu.a("zombie_horse", cgu$a.a(cuz::new, cho.a).a(1.3964844f, 1.6f).b(1.52f).a(new float[]{1.31875f}).a(10));
    public static final cgu<cwq> bY = cgu.a("zombie_nautilus", cgu$a.a(cwq::new, cho.a).a(0.875f, 0.95f).a(new float[]{1.1375f}).b(0.2751f).a(10));
    public static final cgu<dco> bZ = cgu.a("zombie_villager", cgu$a.a(dco::new, cho.a).a(0.6f, 1.95f).a(new float[]{2.125f}).c(-0.7f).b(1.74f).a(8).f());
    public static final cgu<dcp> ca = cgu.a("zombified_piglin", cgu$a.a(dcp::new, cho.a).c().a(0.6f, 1.95f).b(1.79f).a(new float[]{2.0f}).c(-0.7f).a(8).f());
    public static final cgu<ddm> cb = cgu.a("player", cgu$a.a(cho.h).b().a().a(0.6f, 1.8f).b(1.62f).a(cgc.o).a(32).b(2));
    public static final cgu<ddz> cc = cgu.a("fishing_bobber", cgu$a.a(ddz::new, cho.h).e().b().a().a(0.25f, 0.25f).a(4).b(5));
    private static final Set<cgu<?>> ci = Set.of(ab, F, bu);
    private final b<T> cj;
    private final cho ck;
    private final ImmutableSet<dzq> cl;
    private final boolean cm;
    private final boolean cn;
    private final boolean co;
    private final boolean cp;
    private final int cq;
    private final int cr;
    private final String cs;
    private @Nullable yh ct;
    private final Optional<amt<fof>> cu;
    private final cgn cv;
    private final float cw;
    private final dgz cx;
    private final boolean cy;

    private static <T extends cgk> cgu<T> a(amt<cgu<?>> $$0, a<T> $$1) {
        return jq.a(mi.g, $$0, $$1.a($$0));
    }

    private static amt<cgu<?>> b(String $$0) {
        return amt.a(mj.F, amo.b($$0));
    }

    private static <T extends cgk> cgu<T> a(String $$0, a<T> $$1) {
        return cgu.a(cgu.b($$0), $$1);
    }

    public static amo a(cgu<?> $$0) {
        return mi.g.b($$0);
    }

    public static Optional<cgu<?>> a(String $$0) {
        return mi.g.b(amo.c($$0));
    }

    public cgu(b<T> $$0, cho $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, ImmutableSet<dzq> $$6, cgn $$7, float $$8, int $$9, int $$10, String $$11, Optional<amt<fof>> $$12, dgz $$13, boolean $$14) {
        this.cj = $$0;
        this.ck = $$1;
        this.cp = $$5;
        this.cm = $$2;
        this.cn = $$3;
        this.co = $$4;
        this.cl = $$6;
        this.cv = $$7;
        this.cw = $$8;
        this.cq = $$9;
        this.cr = $$10;
        this.cs = $$11;
        this.cu = $$12;
        this.cx = $$13;
        this.cy = $$14;
    }

    public @Nullable T a(axf $$02, @Nullable dlt $$1, @Nullable chl $$2, is $$3, cgt $$4, boolean $$5, boolean $$6) {
        Consumer<cgk> $$8;
        if ($$1 != null) {
            Consumer<T> $$7 = cgu.a((dwo)$$02, $$1, $$2);
        } else {
            $$8 = $$0 -> {};
        }
        return (T)this.a($$02, $$8, $$3, $$4, $$5, $$6);
    }

    public static <T extends cgk> Consumer<T> a(dwo $$02, dlt $$1, @Nullable chl $$2) {
        return cgu.a((T $$0) -> {}, $$02, $$1, $$2);
    }

    public static <T extends cgk> Consumer<T> a(Consumer<T> $$0, dwo $$1, dlt $$2, @Nullable chl $$3) {
        return cgu.b(cgu.a($$0, $$2), $$1, $$2, $$3);
    }

    public static <T extends cgk> Consumer<T> a(Consumer<T> $$0, dlt $$12) {
        return $$0.andThen($$1 -> $$1.c($$12));
    }

    public static <T extends cgk> Consumer<T> b(Consumer<T> $$0, dwo $$1, dlt $$2, @Nullable chl $$32) {
        dpf<cgu<?>> $$4 = $$2.a(ki.af);
        if ($$4 != null) {
            return $$0.andThen($$3 -> cgu.a($$1, $$32, $$3, $$4));
        }
        return $$0;
    }

    public @Nullable T a(axf $$0, is $$1, cgt $$2) {
        return this.a($$0, null, $$1, $$2, false, false);
    }

    public @Nullable T a(axf $$0, @Nullable Consumer<T> $$1, is $$2, cgt $$3, boolean $$4, boolean $$5) {
        T $$6 = this.b($$0, $$1, $$2, $$3, $$4, $$5);
        if ($$6 != null) {
            $$0.a_((cgk)$$6);
            if ($$6 instanceof chn) {
                chn $$7 = (chn)$$6;
                $$7.T();
            }
        }
        return $$6;
    }

    public @Nullable T b(axf $$0, @Nullable Consumer<T> $$1, is $$2, cgt $$3, boolean $$4, boolean $$5) {
        double $$8;
        T $$6 = this.a($$0, $$3);
        if ($$6 == null) {
            return null;
        }
        if ($$4) {
            ((cgk)$$6).a_((double)$$2.u() + 0.5, $$2.v() + 1, (double)$$2.w() + 0.5);
            double $$7 = cgu.a((dwr)$$0, $$2, $$5, ((cgk)$$6).dj());
        } else {
            $$8 = 0.0;
        }
        ((cgk)$$6).b((double)$$2.u() + 0.5, (double)$$2.v() + $$8, (double)$$2.w() + 0.5, bgj.f($$0.y.i() * 360.0f), 0.0f);
        if ($$6 instanceof chn) {
            chn $$9 = (chn)$$6;
            $$9.bE = $$9.ec();
            $$9.bC = $$9.ec();
            $$9.a((dxf)$$0, $$0.c($$9.dK()), $$3, null);
        }
        if ($$1 != null) {
            $$1.accept($$6);
        }
        return $$6;
    }

    protected static double a(dwr $$0, is $$1, boolean $$2, fth $$3) {
        fth $$4 = new fth($$1);
        if ($$2) {
            $$4 = $$4.b(0.0, -1.0, 0.0);
        }
        Iterable<fug> $$5 = $$0.f(null, $$4);
        return 1.0 + fud.a(iz.a.b, $$3, $$5, $$2 ? -2.0 : -1.0);
    }

    public static void a(dwo $$0, @Nullable chl $$1, @Nullable cgk $$2, dpf<cgu<?>> $$3) {
        block5: {
            block6: {
                MinecraftServer $$4 = $$0.s();
                if ($$4 == null || $$2 == null) {
                    return;
                }
                if ($$2.ay() != $$3.a()) {
                    return;
                }
                if ($$0.B_() || !$$2.ay().t()) break block5;
                if (!($$1 instanceof ddm)) break block6;
                ddm $$5 = (ddm)$$1;
                if ($$4.aj().f($$5.gJ())) break block5;
            }
            return;
        }
        $$3.a($$2);
    }

    public boolean b() {
        return this.cm;
    }

    public boolean c() {
        return this.cn;
    }

    public boolean d() {
        return this.co;
    }

    public boolean e() {
        return this.cp;
    }

    public cho f() {
        return this.ck;
    }

    public String g() {
        return this.cs;
    }

    public yh h() {
        if (this.ct == null) {
            this.ct = yh.c(this.g());
        }
        return this.ct;
    }

    public String toString() {
        return this.g();
    }

    public String i() {
        int $$0 = this.g().lastIndexOf(46);
        return $$0 == -1 ? this.g() : this.g().substring($$0 + 1);
    }

    public Optional<amt<fof>> j() {
        return this.cu;
    }

    public float l() {
        return this.cv.a();
    }

    public float m() {
        return this.cv.b();
    }

    @Override
    public dgz k() {
        return this.cx;
    }

    public @Nullable T a(dwo $$0, cgt $$1) {
        if (!this.a($$0.Q())) {
            return null;
        }
        return this.cj.create(this, $$0);
    }

    public static Optional<cgk> a(fnq $$0, dwo $$12, cgt $$22) {
        return bhs.a(cgu.a($$0).map($$2 -> $$2.a($$12, $$22)), (T $$1) -> $$1.d($$0), () -> ce.warn("Skipping Entity with id {}", (Object)$$0.a("id", "[invalid]")));
    }

    public static Optional<cgk> a(cgu<?> $$0, fnq $$12, dwo $$2, cgt $$3) {
        Optional<cgk> $$4 = Optional.ofNullable($$0.a($$2, $$3));
        $$4.ifPresent($$1 -> $$1.d($$12));
        return $$4;
    }

    public fth a(double $$0, double $$1, double $$2) {
        float $$3 = this.cw * this.l() / 2.0f;
        float $$4 = this.cw * this.m();
        return new fth($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3);
    }

    @Override
    public boolean a(eoh $$0) {
        if (this.cl.contains((Object)$$0.b())) {
            return false;
        }
        if (!this.co && flo.a($$0)) {
            return true;
        }
        return $$0.a(dzs.cn) || $$0.a(dzs.pg) || $$0.a(dzs.es) || $$0.a(dzs.rP);
    }

    public cgn n() {
        return this.cv;
    }

    public static Optional<cgu<?>> a(fnq $$0) {
        return $$0.a("id", a);
    }

    public static @Nullable cgk a(uz $$0, dwo $$1, cgt $$2, cgq $$3) {
        try (bgp.j $$4 = new bgp.j(ce);){
            cgk cgk2 = cgu.a(fno.a((bgp)$$4, (jf.a)$$1.J_(), $$0), $$1, $$2, $$3);
            return cgk2;
        }
    }

    public static @Nullable cgk a(cgu<?> $$0, uz $$1, dwo $$2, cgt $$3, cgq $$4) {
        try (bgp.j $$5 = new bgp.j(ce);){
            cgk cgk2 = cgu.a($$0, fno.a((bgp)$$5, (jf.a)$$2.J_(), $$1), $$2, $$3, $$4);
            return cgk2;
        }
    }

    public static @Nullable cgk a(fnq $$0, dwo $$1, cgt $$2, cgq $$3) {
        return cgu.b($$0, $$1, $$2).map($$3::process).map($$4 -> cgu.a($$4, $$0, $$1, $$2, $$3)).orElse(null);
    }

    public static @Nullable cgk a(cgu<?> $$0, fnq $$1, dwo $$2, cgt $$3, cgq $$42) {
        return cgu.b($$0, $$1, $$2, $$3).map($$42::process).map($$4 -> cgu.a($$4, $$1, $$2, $$3, $$42)).orElse(null);
    }

    private static cgk a(cgk $$0, fnq $$1, dwo $$2, cgt $$3, cgq $$4) {
        for (fnq $$5 : $$1.d("Passengers")) {
            cgk $$6 = cgu.a($$5, $$2, $$3, $$4);
            if ($$6 == null) continue;
            $$6.a($$0, true, false);
        }
        return $$0;
    }

    public static Stream<cgk> a(fnq.b $$0, dwo $$1, cgt $$22) {
        return $$0.b().mapMulti(($$2, $$3) -> cgu.a($$2, $$1, $$22, (cgk $$1) -> {
            $$3.accept($$1);
            return $$1;
        }));
    }

    private static Optional<cgk> b(fnq $$0, dwo $$1, cgt $$2) {
        try {
            return cgu.a($$0, $$1, $$2);
        }
        catch (RuntimeException $$3) {
            ce.warn("Exception loading entity: ", (Throwable)$$3);
            return Optional.empty();
        }
    }

    private static Optional<cgk> b(cgu<?> $$0, fnq $$1, dwo $$2, cgt $$3) {
        try {
            return cgu.a($$0, $$1, $$2, $$3);
        }
        catch (RuntimeException $$4) {
            ce.warn("Exception loading entity: ", (Throwable)$$4);
            return Optional.empty();
        }
    }

    public int o() {
        return this.cq;
    }

    public int p() {
        return this.cr;
    }

    public boolean q() {
        return this != cb && this != aD && this != bR && this != m && this != ax && this != ak && this != aA && this != aR && this != V && this != X;
    }

    @Override
    public boolean a(bef<cgu<?>> $$0) {
        return this.cf.a($$0);
    }

    @Override
    public boolean a(jh<cgu<?>> $$0) {
        return $$0.a(this.cf);
    }

    @Override
    public @Nullable T a(cgk $$0) {
        return (T)($$0.ay() == this ? $$0 : null);
    }

    @Override
    public Class<? extends cgk> a() {
        return cgk.class;
    }

    @Deprecated
    public jd.c<cgu<?>> r() {
        return this.cf;
    }

    public boolean s() {
        return this.cy;
    }

    private static b<dgd> a(Supplier<dlp> $$0) {
        return ($$1, $$2) -> new dgd($$1, $$2, $$0);
    }

    private static b<dge> b(Supplier<dlp> $$0) {
        return ($$1, $$2) -> new dge($$1, $$2, $$0);
    }

    private static b<dgg> c(Supplier<dlp> $$0) {
        return ($$1, $$2) -> new dgg($$1, $$2, $$0);
    }

    private static b<dgf> d(Supplier<dlp> $$0) {
        return ($$1, $$2) -> new dgf($$1, $$2, $$0);
    }

    public boolean t() {
        return ci.contains(this);
    }

    public static class a<T extends cgk> {
        private final b<T> a;
        private final cho b;
        private ImmutableSet<dzq> c = ImmutableSet.of();
        private boolean d = true;
        private boolean e = true;
        private boolean f;
        private boolean g;
        private int h = 5;
        private int i = 3;
        private cgn j = cgn.b(0.6f, 1.8f);
        private float k = 1.0f;
        private cgm.a l = cgm.a();
        private dgz m = dhb.g;
        private aml<cgu<?>, Optional<amt<fof>>> n = $$0 -> Optional.of(amt.a(mj.bG, $$0.a().f("entities/")));
        private final aml<cgu<?>, String> o = $$0 -> bhs.a("entity", $$0.a());
        private boolean p = true;

        private a(b<T> $$02, cho $$1) {
            this.a = $$02;
            this.b = $$1;
            this.g = $$1 == cho.b || $$1 == cho.h;
        }

        public static <T extends cgk> a<T> a(b<T> $$0, cho $$1) {
            return new a<T>($$0, $$1);
        }

        public static <T extends cgk> a<T> a(cho $$02) {
            return new a<cgk>(($$0, $$1) -> null, $$02);
        }

        public a<T> a(float $$0, float $$1) {
            this.j = cgn.b($$0, $$1);
            return this;
        }

        public a<T> a(float $$0) {
            this.k = $$0;
            return this;
        }

        public a<T> b(float $$0) {
            this.j = this.j.b($$0);
            return this;
        }

        public a<T> a(float ... $$0) {
            for (float $$1 : $$0) {
                this.l = this.l.a(cgl.a, 0.0f, $$1, 0.0f);
            }
            return this;
        }

        public a<T> a(ftm ... $$0) {
            for (ftm $$1 : $$0) {
                this.l = this.l.a(cgl.a, $$1);
            }
            return this;
        }

        public a<T> a(ftm $$0) {
            return this.a(cgl.b, $$0);
        }

        public a<T> c(float $$0) {
            return this.a(cgl.b, 0.0f, -$$0, 0.0f);
        }

        public a<T> d(float $$0) {
            return this.a(cgl.c, 0.0f, $$0, 0.0f);
        }

        public a<T> a(cgl $$0, float $$1, float $$2, float $$3) {
            this.l = this.l.a($$0, $$1, $$2, $$3);
            return this;
        }

        public a<T> a(cgl $$0, ftm $$1) {
            this.l = this.l.a($$0, $$1);
            return this;
        }

        public a<T> a() {
            this.e = false;
            return this;
        }

        public a<T> b() {
            this.d = false;
            return this;
        }

        public a<T> c() {
            this.f = true;
            return this;
        }

        public a<T> a(dzq ... $$0) {
            this.c = ImmutableSet.copyOf((Object[])$$0);
            return this;
        }

        public a<T> d() {
            this.g = true;
            return this;
        }

        public a<T> a(int $$0) {
            this.h = $$0;
            return this;
        }

        public a<T> b(int $$0) {
            this.i = $$0;
            return this;
        }

        public a<T> a(dgx ... $$0) {
            this.m = dhb.e.a($$0);
            return this;
        }

        public a<T> e() {
            this.n = aml.fixed(Optional.empty());
            return this;
        }

        public a<T> f() {
            this.p = false;
            return this;
        }

        public cgu<T> a(amt<cgu<?>> $$0) {
            if (this.d) {
                bhs.a(bqh.G, $$0.a().toString());
            }
            return new cgu<T>(this.a, this.b, this.d, this.e, this.f, this.g, this.c, this.j.a(this.l), this.k, this.h, this.i, this.o.get($$0), this.n.get($$0), this.m, this.p);
        }
    }

    @FunctionalInterface
    public static interface b<T extends cgk> {
        public @Nullable T create(cgu<T> var1, dwo var2);
    }
}

