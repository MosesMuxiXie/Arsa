/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;

public class ki {
    static final bfk a = new bfk(512);
    public static final kh<doe> b = ki.a("custom_data", $$0 -> $$0.a(doe.c));
    public static final kh<Integer> c = ki.a("max_stack_size", $$0 -> $$0.a(bfm.a(1, 99)).a(aam.h));
    public static final kh<Integer> d = ki.a("max_damage", $$0 -> $$0.a(bfm.r).a(aam.h));
    public static final kh<Integer> e = ki.a("damage", $$0 -> $$0.a(bfm.q).c().a(aam.h));
    public static final kh<bhr> f = ki.a("unbreakable", $$0 -> $$0.a(bhr.b).a(bhr.c));
    public static final kh<dph> g = ki.a("use_effects", $$0 -> $$0.a(dph.b).a(dph.c));
    public static final kh<yh> h = ki.a("custom_name", $$0 -> $$0.a(yj.a).a(yj.b).a());
    public static final kh<Float> i = ki.a("minimum_attack_charge", $$0 -> $$0.a(bfm.a(0.0f, 1.0f)).a(aam.l));
    public static final kh<dku<cez>> j = ki.a("damage_type", $$0 -> $$0.a(dku.a(mj.ba, cez.b)).a(dku.a(mj.ba, cez.c)));
    public static final kh<yh> k = ki.a("item_name", $$0 -> $$0.a(yj.a).a(yj.b).a());
    public static final kh<amo> l = ki.a("item_model", $$0 -> $$0.a(amo.a).a(amo.b).a());
    public static final kh<dop> m = ki.a("lore", $$0 -> $$0.a(dop.c).a(dop.d).a());
    public static final kh<dmp> n = ki.a("rarity", $$0 -> $$0.a(dmp.e).a(dmp.g));
    public static final kh<dsu> o = ki.a("enchantments", $$0 -> $$0.a(dsu.b).a(dsu.c).a());
    public static final kh<dju> p = ki.a("can_place_on", $$0 -> $$0.a(dju.a).a(dju.b).a());
    public static final kh<dju> q = ki.a("can_break", $$0 -> $$0.a(dju.a).a(dju.b).a());
    public static final kh<don> r = ki.a("attribute_modifiers", $$0 -> $$0.a(don.b).a(don.c).a());
    public static final kh<dof> s = ki.a("custom_model_data", $$0 -> $$0.a(dof.b).a(dof.c));
    public static final kh<dpd> t = ki.a("tooltip_display", $$0 -> $$0.a(dpd.a).a(dpd.b).a());
    public static final kh<Integer> u = ki.a("repair_cost", $$0 -> $$0.a(bfm.q).a(aam.h));
    public static final kh<bhr> v = ki.a("creative_slot_lock", $$0 -> $$0.a(bhr.c));
    public static final kh<Boolean> w = ki.a("enchantment_glint_override", $$0 -> $$0.a(Codec.BOOL).a(aam.b));
    public static final kh<bhr> x = ki.a("intangible_projectile", $$0 -> $$0.a(bhr.b));
    public static final kh<dhf> y = ki.a("food", $$0 -> $$0.a(dhf.a).a(dhf.b).a());
    public static final kh<dob> z = ki.a("consumable", $$0 -> $$0.a(dob.b).a(dob.c).a());
    public static final kh<dpi> A = ki.a("use_remainder", $$0 -> $$0.a(dpi.a).a(dpi.b).a());
    public static final kh<dpg> B = ki.a("use_cooldown", $$0 -> $$0.a(dpg.a).a(dpg.b).a());
    public static final kh<dog> C = ki.a("damage_resistant", $$0 -> $$0.a(dog.a).a(dog.b).a());
    public static final kh<dpc> D = ki.a("tool", $$0 -> $$0.a(dpc.a).a(dpc.b).a());
    public static final kh<dpj> E = ki.a("weapon", $$0 -> $$0.a(dpj.b).a(dpj.c).a());
    public static final kh<dnu> F = ki.a("attack_range", $$0 -> $$0.a(dnu.a).a(dnu.b).a());
    public static final kh<dsm> G = ki.a("enchantable", $$0 -> $$0.a(dsm.a).a(dsm.b).a());
    public static final kh<dun> H = ki.a("equippable", $$0 -> $$0.a(dun.a).a(dun.b).a());
    public static final kh<dsw> I = ki.a("repairable", $$0 -> $$0.a(dsw.a).a(dsw.b).a());
    public static final kh<bhr> J = ki.a("glider", $$0 -> $$0.a(bhr.b).a(bhr.c));
    public static final kh<amo> K = ki.a("tooltip_style", $$0 -> $$0.a(amo.a).a(amo.b).a());
    public static final kh<doh> L = ki.a("death_protection", $$0 -> $$0.a(doh.a).a(doh.b).a());
    public static final kh<dnx> M = ki.a("blocks_attacks", $$0 -> $$0.a(dnx.a).a(dnx.b).a());
    public static final kh<dow> N = ki.a("piercing_weapon", $$0 -> $$0.a(dow.a).a(dow.b).a());
    public static final kh<doq> O = ki.a("kinetic_weapon", $$0 -> $$0.a(doq.b).a(doq.c).a());
    public static final kh<dpb> P = ki.a("swing_animation", $$0 -> $$0.a(dpb.b).a(dpb.c));
    public static final kh<dsu> Q = ki.a("stored_enchantments", $$0 -> $$0.a(dsu.b).a(dsu.c).a());
    public static final kh<doj> R = ki.a("dyed_color", $$0 -> $$0.a(doj.a).a(doj.b));
    public static final kh<dot> S = ki.a("map_color", $$0 -> $$0.a(dot.a).a(dot.b));
    public static final kh<fmu> T = ki.a("map_id", $$0 -> $$0.a(fmu.a).a(fmu.b));
    public static final kh<dos> U = ki.a("map_decorations", $$0 -> $$0.a(dos.b).a());
    public static final kh<dou> V = ki.a("map_post_processing", $$0 -> $$0.a(dou.d));
    public static final kh<doa> W = ki.a("charged_projectiles", $$0 -> $$0.a(doa.b).a(doa.c).a());
    public static final kh<dnz> X = ki.a("bundle_contents", $$0 -> $$0.a(dnz.b).a(dnz.c).a());
    public static final kh<dnr> Y = ki.a("potion_contents", $$0 -> $$0.a(dnr.c).a(dnr.d).a());
    public static final kh<Float> Z = ki.a("potion_duration_scale", $$0 -> $$0.a(bfm.u).a(aam.l).a());
    public static final kh<dpa> aa = ki.a("suspicious_stew_effects", $$0 -> $$0.a(dpa.c).a(dpa.d).a());
    public static final kh<dpk> ab = ki.a("writable_book_content", $$0 -> $$0.a(dpk.e).a(dpk.f).a());
    public static final kh<dpl> ac = ki.a("written_book_content", $$0 -> $$0.a(dpl.i).a(dpl.j).a());
    public static final kh<dup> ad = ki.a("trim", $$0 -> $$0.a(dup.a).a(dup.b).a());
    public static final kh<doi> ae = ki.a("debug_stick_state", $$0 -> $$0.a(doi.b).a());
    public static final kh<dpf<cgu<?>>> af = ki.a("entity_data", $$0 -> $$0.a(dpf.a(cgu.a)).a(dpf.a(cgu.b)));
    public static final kh<doe> ag = ki.a("bucket_entity_data", $$0 -> $$0.a(doe.c).a(doe.d));
    public static final kh<dpf<eld<?>>> ah = ki.a("block_entity_data", $$0 -> $$0.a(dpf.a(mi.k.q())).a(dpf.a(aam.a(mj.e))));
    public static final kh<dom> ai = ki.a("instrument", $$0 -> $$0.a(dom.a).a(dom.b).a());
    public static final kh<dox> aj = ki.a("provides_trim_material", $$0 -> $$0.a(dox.a).a(dox.b).a());
    public static final kh<dov> ak = ki.a("ominous_bottle_amplifier", $$0 -> $$0.a(dov.d).a(dov.e));
    public static final kh<dly> al = ki.a("jukebox_playable", $$0 -> $$0.a(dly.a).a(dly.b));
    public static final kh<bef<ekq>> am = ki.a("provides_banner_patterns", $$0 -> $$0.a(bef.b(mj.aR)).a(bef.c(mj.aR)).a());
    public static final kh<List<amt<dqs<?>>>> an = ki.a("recipes", $$0 -> $$0.a(dqs.b.listOf()).a());
    public static final kh<dor> ao = ki.a("lodestone_tracker", $$0 -> $$0.a(dor.a).a(dor.b).a());
    public static final kh<dok> ap = ki.a("firework_explosion", $$0 -> $$0.a(dok.c).a(dok.d).a());
    public static final kh<dol> aq = ki.a("fireworks", $$0 -> $$0.a(dol.b).a(dol.c).a());
    public static final kh<doy> ar = ki.a("profile", $$0 -> $$0.a(doy.a).a(doy.b).a());
    public static final kh<amo> as = ki.a("note_block_sound", $$0 -> $$0.a(amo.a).a(amo.b));
    public static final kh<ekr> at = ki.a("banner_patterns", $$0 -> $$0.a(ekr.b).a(ekr.c).a());
    public static final kh<dkr> au = ki.a("base_color", $$0 -> $$0.a(dkr.q).a(dkr.r));
    public static final kh<eml> av = ki.a("pot_decorations", $$0 -> $$0.a(eml.b).a(eml.c).a());
    public static final kh<doo> aw = ki.a("container", $$0 -> $$0.a(doo.b).a(doo.c).a());
    public static final kh<dnw> ax = ki.a("block_state", $$0 -> $$0.a(dnw.b).a(dnw.c).a());
    public static final kh<dnv> ay = ki.a("bees", $$0 -> $$0.a(dnv.a).a(dnv.b).a());
    public static final kh<cde> az = ki.a("lock", $$0 -> $$0.a(cde.b));
    public static final kh<doz> aA = ki.a("container_loot", $$0 -> $$0.a(doz.a));
    public static final kh<jd<bcz>> aB = ki.a("break_sound", $$0 -> $$0.a(bcz.b).a(bcz.d).a());
    public static final kh<jd<ddc>> aC = ki.a("villager/variant", $$0 -> $$0.a(ddc.h).a(ddc.i));
    public static final kh<jd<cxx>> aD = ki.a("wolf/variant", $$0 -> $$0.a(cxx.c).a(cxx.d));
    public static final kh<jd<cxv>> aE = ki.a("wolf/sound_variant", $$0 -> $$0.a(cxv.c).a(cxv.d));
    public static final kh<dkr> aF = ki.a("wolf/collar", $$0 -> $$0.a(dkr.q).a(dkr.r));
    public static final kh<cvo.v> aG = ki.a("fox/variant", $$0 -> $$0.a(cvo.v.d).a(cvo.v.e));
    public static final kh<cvk.a> aH = ki.a("salmon/size", $$0 -> $$0.a(cvk.a.e).a(cvk.a.f));
    public static final kh<cwy.b> aI = ki.a("parrot/variant", $$0 -> $$0.a(cwy.b.g).a(cwy.b.i));
    public static final kh<cvl.b> aJ = ki.a("tropical_fish/pattern", $$0 -> $$0.a(cvl.b.m).a(cvl.b.n));
    public static final kh<dkr> aK = ki.a("tropical_fish/base_color", $$0 -> $$0.a(dkr.q).a(dkr.r));
    public static final kh<dkr> aL = ki.a("tropical_fish/pattern_color", $$0 -> $$0.a(dkr.q).a(dkr.r));
    public static final kh<cuk.a> aM = ki.a("mooshroom/variant", $$0 -> $$0.a(cuk.a.d).a(cuk.a.e));
    public static final kh<cxh.g> aN = ki.a("rabbit/variant", $$0 -> $$0.a(cxh.g.i).a(cxh.g.k));
    public static final kh<jd<cxc>> aO = ki.a("pig/variant", $$0 -> $$0.a(cxc.c).a(cxc.d));
    public static final kh<jd<cui>> aP = ki.a("cow/variant", $$0 -> $$0.a(cui.c).a(cui.d));
    public static final kh<dku<cud>> aQ = ki.a("chicken/variant", $$0 -> $$0.a(dku.a(mj.aV, cud.c)).a(dku.a(mj.aV, cud.d)));
    public static final kh<dku<cws>> aR = ki.a("zombie_nautilus/variant", $$0 -> $$0.a(dku.a(mj.aW, cws.c)).a(dku.a(mj.aW, cws.d)));
    public static final kh<jd<cvs>> aS = ki.a("frog/variant", $$0 -> $$0.a(cvs.c).a(cvs.d));
    public static final kh<cuy> aT = ki.a("horse/variant", $$0 -> $$0.a(cuy.h).a(cuy.i));
    public static final kh<jd<czh>> aU = ki.a("painting/variant", $$0 -> $$0.a(czh.c).a(czh.d));
    public static final kh<cus.d> aV = ki.a("llama/variant", $$0 -> $$0.a(cus.d.f).a(cus.d.h));
    public static final kh<ctr.e> aW = ki.a("axolotl/variant", $$0 -> $$0.a(ctr.e.h).a(ctr.e.g));
    public static final kh<jd<cvc>> aX = ki.a("cat/variant", $$0 -> $$0.a(cvc.c).a(cvc.d));
    public static final kh<dkr> aY = ki.a("cat/collar", $$0 -> $$0.a(dkr.q).a(dkr.r));
    public static final kh<dkr> aZ = ki.a("sheep/color", $$0 -> $$0.a(dkr.q).a(dkr.r));
    public static final kh<dkr> ba = ki.a("shulker/color", $$0 -> $$0.a(dkr.q).a(dkr.r));
    public static final kf bb = kf.a().a(c, 64).a(m, dop.a).a(o, dsu.a).a(u, 0).a(g, dph.a).a(r, don.a).a(n, dmp.a).a(aB, bda.pF).a(t, dpd.c).a(P, dpb.a).a();

    public static kh<?> a(jq<kh<?>> $$0) {
        return b;
    }

    private static <T> kh<T> a(String $$0, UnaryOperator<kh.a<T>> $$1) {
        return jq.a(mi.am, $$0, ((kh.a)$$1.apply(kh.a())).b());
    }
}
