/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class bna
extends DataFix {
    public bna(Schema $$0) {
        super($$0, false);
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("GameRuleRegistryFix", this.getInputSchema().getType(bqh.a), $$02 -> $$02.update(DSL.remainderFinder(), $$0 -> $$0.renameAndFixField("GameRules", "game_rules", $$02 -> {
            int $$5;
            boolean $$1 = Boolean.parseBoolean($$02.get("doFireTick").asString("true"));
            boolean $$2 = Boolean.parseBoolean($$02.get("allowFireTicksAwayFromPlayer").asString("false"));
            if (!$$1) {
                boolean $$3 = false;
            } else if (!$$2) {
                int $$4 = 128;
            } else {
                $$5 = -1;
            }
            if ($$5 != 128) {
                $$02 = $$02.set("minecraft:fire_spread_radius_around_player", $$02.createInt($$5));
            }
            return $$02.remove("spawnChunkRadius").remove("entitiesWithPassengersCanUsePortals").remove("doFireTick").remove("allowFireTicksAwayFromPlayer").renameAndFixField("allowEnteringNetherUsingPortals", "minecraft:allow_entering_nether_using_portals", bna::b).renameAndFixField("announceAdvancements", "minecraft:show_advancement_messages", bna::b).renameAndFixField("blockExplosionDropDecay", "minecraft:block_explosion_drop_decay", bna::b).renameAndFixField("commandBlockOutput", "minecraft:command_block_output", bna::b).renameAndFixField("enableCommandBlocks", "minecraft:command_blocks_work", bna::b).renameAndFixField("commandBlocksEnabled", "minecraft:command_blocks_work", bna::b).renameAndFixField("commandModificationBlockLimit", "minecraft:max_block_modifications", $$0 -> bna.a($$0, 1)).renameAndFixField("disableElytraMovementCheck", "minecraft:elytra_movement_check", bna::c).renameAndFixField("disablePlayerMovementCheck", "minecraft:player_movement_check", bna::c).renameAndFixField("disableRaids", "minecraft:raids", bna::c).renameAndFixField("doDaylightCycle", "minecraft:advance_time", bna::b).renameAndFixField("doEntityDrops", "minecraft:entity_drops", bna::b).renameAndFixField("doImmediateRespawn", "minecraft:immediate_respawn", bna::b).renameAndFixField("doInsomnia", "minecraft:spawn_phantoms", bna::b).renameAndFixField("doLimitedCrafting", "minecraft:limited_crafting", bna::b).renameAndFixField("doMobLoot", "minecraft:mob_drops", bna::b).renameAndFixField("doMobSpawning", "minecraft:spawn_mobs", bna::b).renameAndFixField("doPatrolSpawning", "minecraft:spawn_patrols", bna::b).renameAndFixField("doTileDrops", "minecraft:block_drops", bna::b).renameAndFixField("doTraderSpawning", "minecraft:spawn_wandering_traders", bna::b).renameAndFixField("doVinesSpread", "minecraft:spread_vines", bna::b).renameAndFixField("doWardenSpawning", "minecraft:spawn_wardens", bna::b).renameAndFixField("doWeatherCycle", "minecraft:advance_weather", bna::b).renameAndFixField("drowningDamage", "minecraft:drowning_damage", bna::b).renameAndFixField("enderPearlsVanishOnDeath", "minecraft:ender_pearls_vanish_on_death", bna::b).renameAndFixField("fallDamage", "minecraft:fall_damage", bna::b).renameAndFixField("fireDamage", "minecraft:fire_damage", bna::b).renameAndFixField("forgiveDeadPlayers", "minecraft:forgive_dead_players", bna::b).renameAndFixField("freezeDamage", "minecraft:freeze_damage", bna::b).renameAndFixField("globalSoundEvents", "minecraft:global_sound_events", bna::b).renameAndFixField("keepInventory", "minecraft:keep_inventory", bna::b).renameAndFixField("lavaSourceConversion", "minecraft:lava_source_conversion", bna::b).renameAndFixField("locatorBar", "minecraft:locator_bar", bna::b).renameAndFixField("logAdminCommands", "minecraft:log_admin_commands", bna::b).renameAndFixField("maxCommandChainLength", "minecraft:max_command_sequence_length", $$0 -> bna.a($$0, 0)).renameAndFixField("maxCommandForkCount", "minecraft:max_command_forks", $$0 -> bna.a($$0, 0)).renameAndFixField("maxEntityCramming", "minecraft:max_entity_cramming", $$0 -> bna.a($$0, 0)).renameAndFixField("minecartMaxSpeed", "minecraft:max_minecart_speed", bna::a).renameAndFixField("mobExplosionDropDecay", "minecraft:mob_explosion_drop_decay", bna::b).renameAndFixField("mobGriefing", "minecraft:mob_griefing", bna::b).renameAndFixField("naturalRegeneration", "minecraft:natural_health_regeneration", bna::b).renameAndFixField("playersNetherPortalCreativeDelay", "minecraft:players_nether_portal_creative_delay", $$0 -> bna.a($$0, 0)).renameAndFixField("playersNetherPortalDefaultDelay", "minecraft:players_nether_portal_default_delay", $$0 -> bna.a($$0, 0)).renameAndFixField("playersSleepingPercentage", "minecraft:players_sleeping_percentage", $$0 -> bna.a($$0, 0)).renameAndFixField("projectilesCanBreakBlocks", "minecraft:projectiles_can_break_blocks", bna::b).renameAndFixField("pvp", "minecraft:pvp", bna::b).renameAndFixField("randomTickSpeed", "minecraft:random_tick_speed", $$0 -> bna.a($$0, 0)).renameAndFixField("reducedDebugInfo", "minecraft:reduced_debug_info", bna::b).renameAndFixField("sendCommandFeedback", "minecraft:send_command_feedback", bna::b).renameAndFixField("showDeathMessages", "minecraft:show_death_messages", bna::b).renameAndFixField("snowAccumulationHeight", "minecraft:max_snow_accumulation_height", $$0 -> bna.a($$0, 0, 8)).renameAndFixField("spawnMonsters", "minecraft:spawn_monsters", bna::b).renameAndFixField("spawnRadius", "minecraft:respawn_radius", bna::a).renameAndFixField("spawnerBlocksEnabled", "minecraft:spawner_blocks_work", bna::b).renameAndFixField("spectatorsGenerateChunks", "minecraft:spectators_generate_chunks", bna::b).renameAndFixField("tntExplodes", "minecraft:tnt_explodes", bna::b).renameAndFixField("tntExplosionDropDecay", "minecraft:tnt_explosion_drop_decay", bna::b).renameAndFixField("universalAnger", "minecraft:universal_anger", bna::b).renameAndFixField("waterSourceConversion", "minecraft:water_source_conversion", bna::b);
        })));
    }

    private static Dynamic<?> a(Dynamic<?> $$0) {
        return bna.a($$0, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static Dynamic<?> a(Dynamic<?> $$0, int $$1) {
        return bna.a($$0, $$1, Integer.MAX_VALUE);
    }

    private static Dynamic<?> a(Dynamic<?> $$0, int $$1, int $$2) {
        String $$3 = $$0.asString("");
        try {
            int $$4 = Integer.parseInt($$3);
            return $$0.createInt(bgj.a($$4, $$1, $$2));
        }
        catch (NumberFormatException $$5) {
            return $$0;
        }
    }

    private static Dynamic<?> b(Dynamic<?> $$0) {
        return $$0.createBoolean(Boolean.parseBoolean($$0.asString("")));
    }

    private static Dynamic<?> c(Dynamic<?> $$0) {
        return $$0.createBoolean(!Boolean.parseBoolean($$0.asString("")));
    }
}

