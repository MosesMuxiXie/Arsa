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

public class bqc
extends DataFix {
    public bqc(Schema $$0) {
        super($$0, false);
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("RaidRenamesDataFix", this.getInputSchema().getType(bqh.m), $$02 -> $$02.update(DSL.remainderFinder(), $$0 -> $$0.update("data", bqc::a)));
    }

    private static Dynamic<?> a(Dynamic<?> $$02) {
        return $$02.renameAndFixField("Raids", "raids", $$0 -> $$0.createList($$0.asStream().map(bqc::b))).renameField("Tick", "tick").renameField("NextAvailableID", "next_id");
    }

    private static Dynamic<?> b(Dynamic<?> $$0) {
        return bib.a($$0, "CX", "CY", "CZ", "center").renameField("Id", "id").renameField("Started", "started").renameField("Active", "active").renameField("TicksActive", "ticks_active").renameField("BadOmenLevel", "raid_omen_level").renameField("GroupsSpawned", "groups_spawned").renameField("PreRaidTicks", "cooldown_ticks").renameField("PostRaidTicks", "post_raid_ticks").renameField("TotalHealth", "total_health").renameField("NumGroups", "group_count").renameField("Status", "status").renameField("HeroesOfTheVillage", "heroes_of_the_village");
    }
}

