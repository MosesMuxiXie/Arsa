/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiFunction;

public class fpt {
    public static final BiFunction<dlt, fnz, dlt> a = ($$0, $$1) -> $$0;
    public static final Codec<fpr> b = mi.E.q().dispatch("function", fpr::a, fps::a);
    public static final Codec<fpr> c = Codec.lazyInitialized(() -> Codec.withAlternative(b, fpv.b));
    public static final Codec<jd<fpr>> d = amq.a(mj.bH, c);
    public static final fps<fqi> e = fpt.a("set_count", fqi.a);
    public static final fps<fqk> f = fpt.a("set_item", fqk.a);
    public static final fps<fph> g = fpt.a("enchant_with_levels", fph.a);
    public static final fps<fpg> h = fpt.a("enchant_randomly", fpg.a);
    public static final fps<fqe> i = fpt.a("set_enchantments", fqe.a);
    public static final fps<fqc> j = fpt.a("set_custom_data", fqc.a);
    public static final fps<fpz> k = fpt.a("set_components", fpz.a);
    public static final fps<fqs> l = fpt.a("furnace_smelt", fqs.a);
    public static final fps<fpi> m = fpt.a("enchanted_count_increase", fpi.b);
    public static final fps<fqj> n = fpt.a("set_damage", fqj.a);
    public static final fps<fpw> o = fpt.a("set_attributes", fpw.a);
    public static final fps<fqm> p = fpt.a("set_name", fqm.a);
    public static final fps<fpj> q = fpt.a("exploration_map", fpj.f);
    public static final fps<fqp> r = fpt.a("set_stew_effect", fqp.a);
    public static final fps<fpe> s = fpt.a("copy_name", fpe.a);
    public static final fps<fqa> t = fpt.a("set_contents", fqa.a);
    public static final fps<fpu> u = fpt.a("modify_contents", fpu.a);
    public static final fps<fpl> v = fpt.a("filtered", fpl.a);
    public static final fps<fpo> w = fpt.a("limit_count", fpo.a);
    public static final fps<foz> x = fpt.a("apply_bonus", foz.a);
    public static final fps<fqb> y = fpt.a("set_loot_table", fqb.a);
    public static final fps<fpa> z = fpt.a("explosion_decay", fpa.a);
    public static final fps<fql> A = fpt.a("set_lore", fql.a);
    public static final fps<fpk> B = fpt.a("fill_player_head", fpk.a);
    public static final fps<fpd> C = fpt.a("copy_custom_data", fpd.a);
    public static final fps<fpb> D = fpt.a("copy_state", fpb.a);
    public static final fps<fpx> E = fpt.a("set_banner_pattern", fpx.a);
    public static final fps<fqo> F = fpt.a("set_potion", fqo.a);
    public static final fps<fqh> G = fpt.a("set_instrument", fqh.a);
    public static final fps<fpm> H = fpt.a("reference", fpm.a);
    public static final fps<fpv> I = fpt.a("sequence", fpv.a);
    public static final fps<fpc> J = fpt.a("copy_components", fpc.a);
    public static final fps<fqg> K = fpt.a("set_fireworks", fqg.a);
    public static final fps<fqf> L = fpt.a("set_firework_explosion", fqf.a);
    public static final fps<fpy> M = fpt.a("set_book_cover", fpy.a);
    public static final fps<fqr> N = fpt.a("set_written_book_pages", fqr.a);
    public static final fps<fqq> O = fpt.a("set_writable_book_pages", fqq.a);
    public static final fps<fqt> P = fpt.a("toggle_tooltips", fqt.a);
    public static final fps<fqn> Q = fpt.a("set_ominous_bottle_amplifier", fqn.a);
    public static final fps<fqd> R = fpt.a("set_custom_model_data", fqd.a);
    public static final fps<fpf> S = fpt.a("discard", fpf.a);

    private static <T extends fpr> fps<T> a(String $$0, MapCodec<T> $$1) {
        return jq.a(mi.E, amo.b($$0), new fps<T>($$1));
    }

    public static BiFunction<dlt, fnz, dlt> a(List<? extends BiFunction<dlt, fnz, dlt>> $$0) {
        List<? extends BiFunction<dlt, fnz, dlt>> $$12 = List.copyOf($$0);
        return switch ($$12.size()) {
            case 0 -> a;
            case 1 -> $$12.get(0);
            case 2 -> {
                BiFunction<dlt, fnz, dlt> $$2 = $$12.get(0);
                BiFunction<dlt, fnz, dlt> $$3 = $$12.get(1);
                yield ($$2, $$3) -> (dlt)$$3.apply((dlt)$$2.apply((dlt)$$2, (fnz)$$3), (fnz)$$3);
            }
            default -> ($$1, $$2) -> {
                for (BiFunction $$3 : $$12) {
                    $$1 = (dlt)$$3.apply($$1, $$2);
                }
                return $$1;
            };
        };
    }
}

