/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class fro {
    public static final frn a = fro.a("inverted", frj.a);
    public static final frn b = fro.a("any_of", fra.a);
    public static final frn c = fro.a("all_of", fqz.a);
    public static final frn d = fro.a("random_chance", frr.a);
    public static final frn e = fro.a("random_chance_with_enchanted_bonus", frs.a);
    public static final frn f = fro.a("entity_properties", frp.a);
    public static final frn g = fro.a("killed_by_player", frq.a);
    public static final frn h = fro.a("entity_scores", frh.a);
    public static final frn i = fro.a("block_state_property", frl.a);
    public static final frn j = fro.a("match_tool", frt.a);
    public static final frn k = fro.a("table_bonus", frb.a);
    public static final frn l = fro.a("survives_explosion", fri.a);
    public static final frn m = fro.a("damage_source_properties", frf.a);
    public static final frn n = fro.a("location_check", frk.a);
    public static final frn o = fro.a("weather_check", frw.a);
    public static final frn p = fro.a("reference", frd.a);
    public static final frn q = fro.a("time_check", fru.a);
    public static final frn r = fro.a("value_check", frv.a);
    public static final frn s = fro.a("enchantment_active_check", frg.a);

    private static frn a(String $$0, MapCodec<? extends frm> $$1) {
        return jq.a(mi.F, amo.b($$0), new frn($$1));
    }
}

