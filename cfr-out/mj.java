/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.util.function.Consumer;

public class mj {
    public static final amo a = amo.b("root");
    public static final amt<jq<dfl>> b = mj.a("activity");
    public static final amt<jq<cin>> c = mj.a("attribute");
    public static final amt<jq<MapCodec<? extends dxs>>> d = mj.a("worldgen/biome_source");
    public static final amt<jq<eld<?>>> e = mj.a("block_entity_type");
    public static final amt<jq<evy<?>>> f = mj.a("block_predicate_type");
    public static final amt<jq<fce<?>>> g = mj.a("worldgen/block_state_provider_type");
    public static final amt<jq<MapCodec<? extends dzq>>> h = mj.a("block_type");
    public static final amt<jq<dzq>> i = mj.a("block");
    public static final amt<jq<eww<?>>> j = mj.a("worldgen/carver");
    public static final amt<jq<MapCodec<? extends eqg>>> k = mj.a("worldgen/chunk_generator");
    public static final amt<jq<erj>> l = mj.a("chunk_status");
    public static final amt<jq<ib<?, ?>>> m = mj.a("command_argument_type");
    public static final amt<jq<dpp.a<?>>> n = mj.a("consume_effect_type");
    public static final amt<jq<dkk>> o = mj.a("creative_mode_tab");
    public static final amt<jq<amo>> p = mj.a("custom_stat");
    public static final amt<jq<ks.d<?>>> q = mj.a("data_component_predicate_type");
    public static final amt<jq<kh<?>>> r = mj.a("data_component_type");
    public static final amt<jq<etv<?>>> s = mj.a("game_rule");
    public static final amt<jq<bxe<?>>> t = mj.a("debug_subscription");
    public static final amt<jq<elv>> u = mj.a("decorated_pot_pattern");
    public static final amt<jq<MapCodec<? extends euj>>> v = mj.a("worldgen/density_function_type");
    public static final amt<jq<MapCodec<? extends ata>>> w = mj.a("dialog_body_type");
    public static final amt<jq<MapCodec<? extends asj>>> x = mj.a("dialog_type");
    public static final amt<jq<kh<?>>> y = mj.a("enchantment_effect_component_type");
    public static final amt<jq<MapCodec<? extends dth>>> z = mj.a("enchantment_entity_effect_type");
    public static final amt<jq<MapCodec<? extends dsv>>> A = mj.a("enchantment_level_based_value_type");
    public static final amt<jq<MapCodec<? extends dti>>> B = mj.a("enchantment_location_based_effect_type");
    public static final amt<jq<MapCodec<? extends dtz>>> C = mj.a("enchantment_provider_type");
    public static final amt<jq<MapCodec<? extends dtj>>> D = mj.a("enchantment_value_effect_type");
    public static final amt<jq<MapCodec<? extends bt>>> E = mj.a("entity_sub_predicate_type");
    public static final amt<jq<cgu<?>>> F = mj.a("entity_type");
    public static final amt<jq<cea<?>>> G = mj.a("environment_attribute");
    public static final amt<jq<cdw<?>>> H = mj.a("attribute_type");
    public static final amt<jq<fbe<?>>> I = mj.a("worldgen/feature_size_type");
    public static final amt<jq<exx<?>>> J = mj.a("worldgen/feature");
    public static final amt<jq<ccg<?>>> K = mj.a("float_provider_type");
    public static final amt<jq<fla>> L = mj.a("fluid");
    public static final amt<jq<fbp<?>>> M = mj.a("worldgen/foliage_placer_type");
    public static final amt<jq<etk>> N = mj.a("game_event");
    public static final amt<jq<fdw<?>>> O = mj.a("height_provider_type");
    public static final amt<jq<MapCodec<? extends atg>>> P = mj.a("input_control_type");
    public static final amt<jq<cci<?>>> Q = mj.a("int_provider_type");
    public static final amt<jq<dlp>> R = mj.a("item");
    public static final amt<jq<MapCodec<? extends dvf>>> S = mj.a("slot_source_type");
    public static final amt<jq<frn>> T = mj.a("loot_condition_type");
    public static final amt<jq<fps<?>>> U = mj.a("loot_function_type");
    public static final amt<jq<frz>> V = mj.a("loot_nbt_provider_type");
    public static final amt<jq<fsh>> W = mj.a("loot_number_provider_type");
    public static final amt<jq<fos>> X = mj.a("loot_pool_entry_type");
    public static final amt<jq<fsq>> Y = mj.a("loot_score_provider_type");
    public static final amt<jq<fmr>> Z = mj.a("map_decoration_type");
    public static final amt<jq<MapCodec<? extends evh.f>>> aa = mj.a("worldgen/material_condition");
    public static final amt<jq<MapCodec<? extends evh.o>>> ab = mj.a("worldgen/material_rule");
    public static final amt<jq<cqw<?>>> ac = mj.a("memory_module_type");
    public static final amt<jq<dis<?>>> ad = mj.a("menu");
    public static final amt<jq<cfk>> ae = mj.a("mob_effect");
    public static final amt<jq<aah<?>>> af = mj.a("number_format_type");
    public static final amt<jq<lx<?>>> ag = mj.a("particle_type");
    public static final amt<jq<few<?>>> ah = mj.a("worldgen/placement_modifier_type");
    public static final amt<jq<cta>> ai = mj.a("point_of_interest_type");
    public static final amt<jq<MapCodec<? extends fha>>> aj = mj.a("worldgen/pool_alias_binding");
    public static final amt<jq<etp<?>>> ak = mj.a("position_source_type");
    public static final amt<jq<fje<?>>> al = mj.a("pos_rule_test");
    public static final amt<jq<dnp>> am = mj.a("potion");
    public static final amt<jq<dqv>> an = mj.a("recipe_book_category");
    public static final amt<jq<dry.a<?>>> ao = mj.a("recipe_display");
    public static final amt<jq<drc<?>>> ap = mj.a("recipe_serializer");
    public static final amt<jq<drd<?>>> aq = mj.a("recipe_type");
    public static final amt<jq<fcb<?>>> ar = mj.a("worldgen/root_placer_type");
    public static final amt<jq<fjz<?>>> as = mj.a("rule_block_entity_modifier");
    public static final amt<jq<fjl<?>>> at = mj.a("rule_test");
    public static final amt<jq<cse<?>>> au = mj.a("sensor_type");
    public static final amt<jq<dse.i<?>>> av = mj.a("slot_display");
    public static final amt<jq<bcz>> aw = mj.a("sound_event");
    public static final amt<jq<MapCodec<? extends dfr>>> ax = mj.a("spawn_condition_type");
    public static final amt<jq<bdj<?>>> ay = mj.a("stat_type");
    public static final amt<jq<fgf>> az = mj.a("worldgen/structure_piece");
    public static final amt<jq<fgm<?>>> aA = mj.a("worldgen/structure_placement");
    public static final amt<jq<fgx<?>>> aB = mj.a("worldgen/structure_pool_element");
    public static final amt<jq<fjp<?>>> aC = mj.a("worldgen/structure_processor");
    public static final amt<jq<ffx<?>>> aD = mj.a("worldgen/structure_type");
    public static final amt<jq<MapCodec<? extends ast>>> aE = mj.a("dialog_action_type");
    public static final amt<jq<MapCodec<? extends tv>>> aF = mj.a("test_environment_definition_type");
    public static final amt<jq<Consumer<sz>>> aG = mj.a("test_function");
    public static final amt<jq<MapCodec<? extends tb>>> aH = mj.a("test_instance_type");
    public static final amt<jq<axm>> aI = mj.a("ticket_type");
    public static final amt<jq<fcz<?>>> aJ = mj.a("worldgen/tree_decorator_type");
    public static final amt<jq<fdl<?>>> aK = mj.a("worldgen/trunk_placer_type");
    public static final amt<jq<dda>> aL = mj.a("villager_profession");
    public static final amt<jq<ddc>> aM = mj.a("villager_type");
    public static final amt<jq<ats<?, ?>>> aN = mj.a("incoming_rpc_methods");
    public static final amt<jq<atz<?, ?>>> aO = mj.a("outgoing_rpc_methods");
    public static final amt<jq<MapCodec<? extends bbi>>> aP = mj.a("permission_type");
    public static final amt<jq<MapCodec<? extends bbj>>> aQ = mj.a("permission_check_type");
    public static final amt<jq<ekq>> aR = mj.a("banner_pattern");
    public static final amt<jq<dxo>> aS = mj.a("worldgen/biome");
    public static final amt<jq<cvc>> aT = mj.a("cat_variant");
    public static final amt<jq<yd>> aU = mj.a("chat_type");
    public static final amt<jq<cud>> aV = mj.a("chicken_variant");
    public static final amt<jq<cws>> aW = mj.a("zombie_nautilus_variant");
    public static final amt<jq<ewu<?>>> aX = mj.a("worldgen/configured_carver");
    public static final amt<jq<exi<?, ?>>> aY = mj.a("worldgen/configured_feature");
    public static final amt<jq<cui>> aZ = mj.a("cow_variant");
    public static final amt<jq<cez>> ba = mj.a("damage_type");
    public static final amt<jq<euj>> bb = mj.a("worldgen/density_function");
    public static final amt<jq<asj>> bc = mj.a("dialog");
    public static final amt<jq<esh>> bd = mj.a("dimension_type");
    public static final amt<jq<dtz>> be = mj.a("enchantment_provider");
    public static final amt<jq<dso>> bf = mj.a("enchantment");
    public static final amt<jq<fdp>> bg = mj.a("worldgen/flat_level_generator_preset");
    public static final amt<jq<cvs>> bh = mj.a("frog_variant");
    public static final amt<jq<dlm>> bi = mj.a("instrument");
    public static final amt<jq<dlz>> bj = mj.a("jukebox_song");
    public static final amt<jq<dyc>> bk = mj.a("worldgen/multi_noise_biome_source_parameter_list");
    public static final amt<jq<euv>> bl = mj.a("worldgen/noise_settings");
    public static final amt<jq<fke.a>> bm = mj.a("worldgen/noise");
    public static final amt<jq<czh>> bn = mj.a("painting_variant");
    public static final amt<jq<cxc>> bo = mj.a("pig_variant");
    public static final amt<jq<fes>> bp = mj.a("worldgen/placed_feature");
    public static final amt<jq<fjo>> bq = mj.a("worldgen/processor_list");
    public static final amt<jq<ffu>> br = mj.a("worldgen/structure_set");
    public static final amt<jq<ffo>> bs = mj.a("worldgen/structure");
    public static final amt<jq<fgy>> bt = mj.a("worldgen/template_pool");
    public static final amt<jq<tv>> bu = mj.a("test_environment");
    public static final amt<jq<tb>> bv = mj.a("test_instance");
    public static final amt<jq<fvn>> bw = mj.a("timeline");
    public static final amt<jq<eni>> bx = mj.a("trial_spawner");
    public static final amt<jq<am<?>>> by = mj.a("trigger_type");
    public static final amt<jq<dur>> bz = mj.a("trim_material");
    public static final amt<jq<dut>> bA = mj.a("trim_pattern");
    public static final amt<jq<cxx>> bB = mj.a("wolf_variant");
    public static final amt<jq<cxv>> bC = mj.a("wolf_sound_variant");
    public static final amt<jq<ffd>> bD = mj.a("worldgen/world_preset");
    public static final amt<jq<dwo>> bE = mj.a("dimension");
    public static final amt<jq<esi>> bF = mj.a("dimension");
    public static final amt<jq<fof>> bG = mj.a("loot_table");
    public static final amt<jq<fpr>> bH = mj.a("item_modifier");
    public static final amt<jq<frm>> bI = mj.a("predicate");
    public static final amt<jq<ab>> bJ = mj.a("advancement");
    public static final amt<jq<dqs<?>>> bK = mj.a("recipe");

    public static amt<dwo> a(amt<esi> $$0) {
        return amt.a(bE, $$0.a());
    }

    public static amt<esi> b(amt<dwo> $$0) {
        return amt.a(bF, $$0.a());
    }

    private static <T> amt<jq<T>> a(String $$0) {
        return amt.a(amo.b($$0));
    }

    public static String c(amt<? extends jq<?>> $$0) {
        return $$0.a().a();
    }

    public static String d(amt<? extends jq<?>> $$0) {
        return "tags/" + $$0.a().a();
    }
}

