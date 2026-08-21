/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public abstract class exx<FC extends fac> {
    public static final exx<faj> e = exx.a("no_op", new eyr(faj.b));
    public static final exx<fay> f = exx.a("tree", new ezj(fay.a));
    public static final exx<fab> g = exx.a("fallen_tree", new exw(fab.a));
    public static final exx<fap> h = exx.a("flower", new eyv(fap.a));
    public static final exx<fap> i = exx.a("no_bonemeal_flower", new eyv(fap.a));
    public static final exx<fap> j = exx.a("random_patch", new eyv(fap.a));
    public static final exx<ezt> k = exx.a("block_pile", new exe(ezt.a));
    public static final exx<fax> l = exx.a("spring_feature", new ezi(fax.a));
    public static final exx<faj> m = exx.a("chorus_plant", new exh(faj.b));
    public static final exx<faq> n = exx.a("replace_single_block", new eyy(faq.a));
    public static final exx<faj> o = exx.a("void_start_platform", new ezo(faj.b));
    public static final exx<faj> p = exx.a("desert_well", new exo(faj.b));
    public static final exx<eyc> q = exx.a("fossil", new eyb(eyc.a));
    public static final exx<fae> r = exx.a("huge_red_mushroom", new eyi(fae.a));
    public static final exx<fae> s = exx.a("huge_brown_mushroom", new eyf(fae.a));
    public static final exx<faj> t = exx.a("ice_spike", new eyj(faj.b));
    public static final exx<faj> u = exx.a("glowstone_blob", new eye(faj.b));
    public static final exx<faj> v = exx.a("freeze_top_layer", new ezg(faj.b));
    public static final exx<faj> w = exx.a("vines", new ezn(faj.b));
    public static final exx<ezs> x = exx.a("block_column", new exd(ezs.a));
    public static final exx<fbb> y = exx.a("vegetation_patch", new ezm(fbb.a));
    public static final exx<fbb> z = exx.a("waterlogged_vegetation_patch", new ezp(fbb.a));
    public static final exx<fas> A = exx.a("root_system", new eyz(fas.a));
    public static final exx<fah> B = exx.a("multiface_growth", new eyp(fah.a));
    public static final exx<fba> C = exx.a("underwater_magma", new ezl(fba.a));
    public static final exx<faj> D = exx.a("monster_room", new eyo(faj.b));
    public static final exx<faj> E = exx.a("blue_ice", new exf(faj.b));
    public static final exx<ezu> F = exx.a("iceberg", new eyk(ezu.a));
    public static final exx<ezu> G = exx.a("forest_rock", new exc(ezu.a));
    public static final exx<ezy> H = exx.a("disk", new exp(ezy.a));
    public static final exx<eym.a> I = exx.a("lake", new eym(eym.a.a));
    public static final exx<fak> J = exx.a("ore", new eys(fak.a));
    public static final exx<faj> K = exx.a("end_platform", new exu(faj.b));
    public static final exx<faw> L = exx.a("end_spike", new ezh(faw.a));
    public static final exx<faj> M = exx.a("end_island", new ext(faj.b));
    public static final exx<faa> N = exx.a("end_gateway", new exs(faa.a));
    public static final ezd O = exx.a("seagrass", new ezd(fam.k));
    public static final exx<faj> P = exx.a("kelp", new eyl(faj.b));
    public static final exx<faj> Q = exx.a("coral_tree", new exm(faj.b));
    public static final exx<faj> R = exx.a("coral_mushroom", new exl(faj.b));
    public static final exx<faj> S = exx.a("coral_claw", new exj(faj.b));
    public static final exx<ezw> T = exx.a("sea_pickle", new ezc(ezw.a));
    public static final exx<fau> U = exx.a("simple_block", new eze(fau.a));
    public static final exx<fam> V = exx.a("bamboo", new ewz(fam.k));
    public static final exx<eyg> W = exx.a("huge_fungus", new eyh(eyg.a));
    public static final exx<fai> X = exx.a("nether_forest_vegetation", new eyq(fai.c));
    public static final exx<faj> Y = exx.a("weeping_vines", new ezq(faj.b));
    public static final exx<faz> Z = exx.a("twisting_vines", new ezk(faz.a));
    public static final exx<ezv> aa = exx.a("basalt_columns", new exa(ezv.a));
    public static final exx<ezx> ab = exx.a("delta_feature", new exn(ezx.a));
    public static final exx<far> ac = exx.a("netherrack_replace_blobs", new eyx(far.a));
    public static final exx<fag> ad = exx.a("fill_layer", new eya(fag.a));
    public static final exg ae = exx.a("bonus_chest", new exg(faj.b));
    public static final exx<faj> af = exx.a("basalt_pillar", new exb(faj.b));
    public static final exx<fak> ag = exx.a("scattered_ore", new eza(fak.a));
    public static final exx<fao> ah = exx.a("random_selector", new eyw(fao.a));
    public static final exx<fav> ai = exx.a("simple_random_selector", new ezf(fav.a));
    public static final exx<fan> aj = exx.a("random_boolean_selector", new eyu(fan.a));
    public static final exx<fad> ak = exx.a("geode", new eyd(fad.b));
    public static final exx<ezz> al = exx.a("dripstone_cluster", new exq(ezz.a));
    public static final exx<faf> am = exx.a("large_dripstone", new eyn(faf.a));
    public static final exx<fal> an = exx.a("pointed_dripstone", new eyt(fal.a));
    public static final exx<fat> ao = exx.a("sculk_patch", new ezb(fat.a));
    private final MapCodec<exi<FC, exx<FC>>> a;

    private static <C extends fac, F extends exx<C>> F a(String $$0, F $$1) {
        return (F)jq.a(mi.O, $$0, $$1);
    }

    public exx(Codec<FC> $$02) {
        this.a = $$02.fieldOf("config").xmap($$0 -> new exi<fac, exx>(this, (fac)$$0), exi::c);
    }

    public MapCodec<exi<FC, exx<FC>>> a() {
        return this.a;
    }

    protected void a(dwv $$0, is $$1, eoh $$2) {
        $$0.a($$1, $$2, 3);
    }

    public static Predicate<eoh> a(bef<dzq> $$0) {
        return $$1 -> !$$1.a($$0);
    }

    protected void a(dxn $$0, is $$1, eoh $$2, Predicate<eoh> $$3) {
        if ($$3.test($$0.a_($$1))) {
            $$0.a($$1, $$2, 2);
        }
    }

    public abstract boolean a(exz<FC> var1);

    public boolean a(FC $$0, dxn $$1, eqg $$2, bgr $$3, is $$4) {
        if ($$1.e_($$4)) {
            return this.a(new exz<FC>(Optional.empty(), $$1, $$2, $$3, $$4, $$0));
        }
        return false;
    }

    protected static boolean a(eoh $$0) {
        return $$0.a(bdp.br);
    }

    public static boolean b(eoh $$0) {
        return $$0.a(bdp.ae);
    }

    public static boolean a(dwu $$0, is $$1) {
        return $$0.a($$1, exx::b);
    }

    public static boolean a(Function<is, eoh> $$0, is $$1, Predicate<eoh> $$2) {
        is.a $$3 = new is.a();
        for (iz $$4 : iz.values()) {
            $$3.a((jy)$$1, $$4);
            if (!$$2.test($$0.apply($$3))) continue;
            return true;
        }
        return false;
    }

    public static boolean a(Function<is, eoh> $$0, is $$1) {
        return exx.a($$0, $$1, eog.a::l);
    }

    protected void a(dxn $$0, is $$1) {
        is.a $$2 = $$1.k();
        for (int $$3 = 0; $$3 < 2; ++$$3) {
            $$2.c(iz.b);
            if ($$0.a_($$2).l()) {
                return;
            }
            $$0.E($$2).e($$2);
        }
    }
}

