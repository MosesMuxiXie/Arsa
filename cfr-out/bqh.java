/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL$TypeReference
 */
import com.mojang.datafixers.DSL;

public class bqh {
    public static final DSL.TypeReference a = bqh.a("level");
    public static final DSL.TypeReference b = bqh.a("lightweight_level");
    public static final DSL.TypeReference c = bqh.a("player");
    public static final DSL.TypeReference d = bqh.a("chunk");
    public static final DSL.TypeReference e = bqh.a("hotbar");
    public static final DSL.TypeReference f = bqh.a("options");
    public static final DSL.TypeReference g = bqh.a("structure");
    public static final DSL.TypeReference h = bqh.a("stats");
    public static final DSL.TypeReference i = bqh.a("saved_data/command_storage");
    public static final DSL.TypeReference j = bqh.a("saved_data/tickets");
    public static final DSL.TypeReference k = bqh.a("saved_data/map_data");
    public static final DSL.TypeReference l = bqh.a("saved_data/idcounts");
    public static final DSL.TypeReference m = bqh.a("saved_data/raids");
    public static final DSL.TypeReference n = bqh.a("saved_data/random_sequences");
    public static final DSL.TypeReference o = bqh.a("saved_data/scoreboard");
    public static final DSL.TypeReference p = bqh.a("saved_data/stopwatches");
    public static final DSL.TypeReference q = bqh.a("saved_data/structure_feature_indices");
    public static final DSL.TypeReference r = bqh.a("saved_data/world_border");
    public static final DSL.TypeReference s = bqh.a("advancements");
    public static final DSL.TypeReference t = bqh.a("poi_chunk");
    public static final DSL.TypeReference u = bqh.a("entity_chunk");
    public static final DSL.TypeReference v = bqh.a("debug_profile");
    public static final DSL.TypeReference w = bqh.a("block_entity");
    public static final DSL.TypeReference x = bqh.a("item_stack");
    public static final DSL.TypeReference y = bqh.a("block_state");
    public static final DSL.TypeReference z = bqh.a("flat_block_state");
    public static final DSL.TypeReference A = bqh.a("data_components");
    public static final DSL.TypeReference B = bqh.a("villager_trade");
    public static final DSL.TypeReference C = bqh.a("particle");
    public static final DSL.TypeReference D = bqh.a("text_component");
    public static final DSL.TypeReference E = bqh.a("entity_equipment");
    public static final DSL.TypeReference F = bqh.a("entity_name");
    public static final DSL.TypeReference G = bqh.a("entity_tree");
    public static final DSL.TypeReference H = bqh.a("entity");
    public static final DSL.TypeReference I = bqh.a("block_name");
    public static final DSL.TypeReference J = bqh.a("item_name");
    public static final DSL.TypeReference K = bqh.a("game_event_name");
    public static final DSL.TypeReference L = bqh.a("untagged_spawner");
    public static final DSL.TypeReference M = bqh.a("structure_feature");
    public static final DSL.TypeReference N = bqh.a("objective");
    public static final DSL.TypeReference O = bqh.a("team");
    public static final DSL.TypeReference P = bqh.a("recipe");
    public static final DSL.TypeReference Q = bqh.a("biome");
    public static final DSL.TypeReference R = bqh.a("multi_noise_biome_source_parameter_list");
    public static final DSL.TypeReference S = bqh.a("world_gen_settings");

    public static DSL.TypeReference a(final String $$0) {
        return new DSL.TypeReference(){

            public String typeName() {
                return $$0;
            }

            public String toString() {
                return "@" + $$0;
            }
        };
    }
}

