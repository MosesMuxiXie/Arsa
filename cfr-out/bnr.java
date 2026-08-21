/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.OptionalDynamic
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.base.Splitter;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.OptionalDynamic;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class bnr
extends DataFix {
    private static final int a = 1;
    private static final int b = 2;
    private static final int c = 4;
    private static final int d = 8;
    private static final int e = 16;
    private static final int f = 32;
    private static final int g = 64;
    private static final int h = 128;
    private static final Set<String> i = Set.of("minecraft:potion", "minecraft:splash_potion", "minecraft:lingering_potion", "minecraft:tipped_arrow");
    private static final Set<String> j = Set.of("minecraft:pufferfish_bucket", "minecraft:salmon_bucket", "minecraft:cod_bucket", "minecraft:tropical_fish_bucket", "minecraft:axolotl_bucket", "minecraft:tadpole_bucket");
    private static final List<String> k = List.of("NoAI", "Silent", "NoGravity", "Glowing", "Invulnerable", "Health", "Age", "Variant", "HuntingCooldown", "BucketVariantTag");
    private static final Set<String> l = Set.of("attached", "bottom", "conditional", "disarmed", "drag", "enabled", "extended", "eye", "falling", "hanging", "has_bottle_0", "has_bottle_1", "has_bottle_2", "has_record", "has_book", "inverted", "in_wall", "lit", "locked", "occupied", "open", "persistent", "powered", "short", "signal_fire", "snowy", "triggered", "unstable", "waterlogged", "berries", "bloom", "shrieking", "can_summon", "up", "down", "north", "east", "south", "west", "slot_0_occupied", "slot_1_occupied", "slot_2_occupied", "slot_3_occupied", "slot_4_occupied", "slot_5_occupied", "cracked", "crafting");
    private static final Splitter m = Splitter.on((char)',');

    public bnr(Schema $$0) {
        super($$0, true);
    }

    private static void a(a $$02, Dynamic<?> $$12) {
        int $$22 = $$02.a("HideFlags").asInt(0);
        $$02.a("Damage", "minecraft:damage", $$12.createInt(0));
        $$02.a("RepairCost", "minecraft:repair_cost", $$12.createInt(0));
        $$02.a("CustomModelData", "minecraft:custom_model_data");
        $$02.a("BlockStateTag").result().ifPresent($$1 -> $$02.a("minecraft:block_state", bnr.b($$1)));
        $$02.a("EntityTag", "minecraft:entity_data");
        $$02.a("BlockEntityTag", false, $$1 -> {
            String $$2 = bsh.a($$1.get("id").asString(""));
            Dynamic $$3 = ($$1 = bnr.a($$02, $$1, $$2)).remove("id");
            if ($$3.equals((Object)$$1.emptyMap())) {
                return $$3;
            }
            return $$1;
        });
        $$02.a("BlockEntityTag", "minecraft:block_entity_data");
        if ($$02.a("Unbreakable").asBoolean(false)) {
            Dynamic $$3 = $$12.emptyMap();
            if (($$22 & 4) != 0) {
                $$3 = $$3.set("show_in_tooltip", $$12.createBoolean(false));
            }
            $$02.a("minecraft:unbreakable", $$3);
        }
        bnr.a($$02, $$12, "Enchantments", "minecraft:enchantments", ($$22 & 1) != 0);
        if ($$02.b("minecraft:enchanted_book")) {
            bnr.a($$02, $$12, "StoredEnchantments", "minecraft:stored_enchantments", ($$22 & 0x20) != 0);
        }
        $$02.a("display", false, $$2 -> bnr.a($$02, $$2, $$22));
        bnr.b($$02, $$12, $$22);
        bnr.c($$02, $$12, $$22);
        Optional $$4 = $$02.a("Trim").result();
        if ($$4.isPresent()) {
            Dynamic $$5 = (Dynamic)$$4.get();
            if (($$22 & 0x80) != 0) {
                $$5 = $$5.set("show_in_tooltip", $$5.createBoolean(false));
            }
            $$02.a("minecraft:trim", $$5);
        }
        if (($$22 & 0x20) != 0) {
            $$02.a("minecraft:hide_additional_tooltip", $$12.emptyMap());
        }
        if ($$02.b("minecraft:crossbow")) {
            $$02.a("Charged");
            $$02.a("ChargedProjectiles", "minecraft:charged_projectiles", $$12.createList(Stream.empty()));
        }
        if ($$02.b("minecraft:bundle")) {
            $$02.a("Items", "minecraft:bundle_contents", $$12.createList(Stream.empty()));
        }
        if ($$02.b("minecraft:filled_map")) {
            $$02.a("map", "minecraft:map_id");
            Map<Dynamic, Dynamic> $$6 = $$02.a("Decorations").asStream().map(bnr::e).collect(Collectors.toMap(Pair::getFirst, Pair::getSecond, ($$0, $$1) -> $$0));
            if (!$$6.isEmpty()) {
                $$02.a("minecraft:map_decorations", $$12.createMap($$6));
            }
        }
        if ($$02.a(i)) {
            bnr.b($$02, $$12);
        }
        if ($$02.b("minecraft:writable_book")) {
            bnr.c($$02, $$12);
        }
        if ($$02.b("minecraft:written_book")) {
            bnr.d($$02, $$12);
        }
        if ($$02.b("minecraft:suspicious_stew")) {
            $$02.a("effects", "minecraft:suspicious_stew_effects");
        }
        if ($$02.b("minecraft:debug_stick")) {
            $$02.a("DebugProperty", "minecraft:debug_stick_state");
        }
        if ($$02.a(j)) {
            bnr.f($$02, $$12);
        }
        if ($$02.b("minecraft:goat_horn")) {
            $$02.a("instrument", "minecraft:instrument");
        }
        if ($$02.b("minecraft:knowledge_book")) {
            $$02.a("Recipes", "minecraft:recipes");
        }
        if ($$02.b("minecraft:compass")) {
            bnr.g($$02, $$12);
        }
        if ($$02.b("minecraft:firework_rocket")) {
            bnr.b($$02);
        }
        if ($$02.b("minecraft:firework_star")) {
            bnr.a($$02);
        }
        if ($$02.b("minecraft:player_head")) {
            $$02.a("SkullOwner").result().ifPresent($$1 -> $$02.a("minecraft:profile", bnr.a($$1)));
        }
    }

    private static Dynamic<?> b(Dynamic<?> $$0) {
        return (Dynamic)DataFixUtils.orElse($$0.asMapOpt().result().map($$02 -> $$02.collect(Collectors.toMap(Pair::getFirst, $$0 -> {
            Optional $$3;
            String $$1 = ((Dynamic)$$0.getFirst()).asString("");
            Dynamic $$2 = (Dynamic)$$0.getSecond();
            if (l.contains($$1) && ($$3 = $$2.asBoolean().result()).isPresent()) {
                return $$2.createString(String.valueOf($$3.get()));
            }
            Optional $$4 = $$2.asNumber().result();
            if ($$4.isPresent()) {
                return $$2.createString(((Number)$$4.get()).toString());
            }
            return $$2;
        }))).map(arg_0 -> $$0.createMap(arg_0)), $$0);
    }

    private static Dynamic<?> a(a $$0, Dynamic<?> $$12, int $$2) {
        Optional $$7;
        boolean $$5;
        $$12.get("Name").result().filter(bic::a).ifPresent($$1 -> $$0.a("minecraft:custom_name", (Dynamic<?>)$$1));
        OptionalDynamic $$3 = $$12.get("Lore");
        if ($$3.result().isPresent()) {
            $$0.a("minecraft:lore", $$12.createList($$12.get("Lore").asStream().filter(bic::a)));
        }
        Optional<Integer> $$4 = $$12.get("color").asNumber().result().map(Number::intValue);
        boolean bl2 = $$5 = ($$2 & 0x40) != 0;
        if ($$4.isPresent() || $$5) {
            Dynamic $$6 = $$12.emptyMap().set("rgb", $$12.createInt($$4.orElse(10511680).intValue()));
            if ($$5) {
                $$6 = $$6.set("show_in_tooltip", $$12.createBoolean(false));
            }
            $$0.a("minecraft:dyed_color", $$6);
        }
        if (($$7 = $$12.get("LocName").asString().result()).isPresent()) {
            $$0.a("minecraft:item_name", bic.b($$12.getOps(), (String)$$7.get()));
        }
        if ($$0.b("minecraft:filled_map")) {
            $$0.a("minecraft:map_color", $$12.get("MapColor"));
            $$12 = $$12.remove("MapColor");
        }
        return $$12.remove("Name").remove("Lore").remove("color").remove("LocName");
    }

    private static <T> Dynamic<T> a(a $$02, Dynamic<T> $$1, String $$2) {
        $$02.a("minecraft:lock", $$1.get("Lock"));
        $$1 = $$1.remove("Lock");
        Optional $$3 = $$1.get("LootTable").result();
        if ($$3.isPresent()) {
            Dynamic $$4 = $$1.emptyMap().set("loot_table", (Dynamic)$$3.get());
            long $$5 = $$1.get("LootTableSeed").asLong(0L);
            if ($$5 != 0L) {
                $$4 = $$4.set("seed", $$1.createLong($$5));
            }
            $$02.a("minecraft:container_loot", $$4);
            $$1 = $$1.remove("LootTable").remove("LootTableSeed");
        }
        return switch ($$2) {
            case "minecraft:skull" -> {
                $$02.a("minecraft:note_block_sound", $$1.get("note_block_sound"));
                yield $$1.remove("note_block_sound");
            }
            case "minecraft:decorated_pot" -> {
                $$02.a("minecraft:pot_decorations", $$1.get("sherds"));
                Optional $$6 = $$1.get("item").result();
                if ($$6.isPresent()) {
                    $$02.a("minecraft:container", $$1.createList(Stream.of($$1.emptyMap().set("slot", $$1.createInt(0)).set("item", (Dynamic)$$6.get()))));
                }
                yield $$1.remove("sherds").remove("item");
            }
            case "minecraft:banner" -> {
                $$02.a("minecraft:banner_patterns", $$1.get("patterns"));
                Optional $$7 = $$1.get("Base").asNumber().result();
                if ($$7.isPresent()) {
                    $$02.a("minecraft:base_color", $$1.createString(bib.a(((Number)$$7.get()).intValue())));
                }
                yield $$1.remove("patterns").remove("Base");
            }
            case "minecraft:shulker_box", "minecraft:chest", "minecraft:trapped_chest", "minecraft:furnace", "minecraft:ender_chest", "minecraft:dispenser", "minecraft:dropper", "minecraft:brewing_stand", "minecraft:hopper", "minecraft:barrel", "minecraft:smoker", "minecraft:blast_furnace", "minecraft:campfire", "minecraft:chiseled_bookshelf", "minecraft:crafter" -> {
                List $$8 = $$1.get("Items").asList($$0 -> $$0.emptyMap().set("slot", $$0.createInt($$0.get("Slot").asByte((byte)0) & 0xFF)).set("item", $$0.remove("Slot")));
                if (!$$8.isEmpty()) {
                    $$02.a("minecraft:container", $$1.createList($$8.stream()));
                }
                yield $$1.remove("Items");
            }
            case "minecraft:beehive" -> {
                $$02.a("minecraft:bees", $$1.get("bees"));
                yield $$1.remove("bees");
            }
            default -> $$1;
        };
    }

    private static void a(a $$02, Dynamic<?> $$1, String $$2, String $$3, boolean $$4) {
        OptionalDynamic<?> $$5 = $$02.a($$2);
        List<Pair> $$6 = $$5.asList(Function.identity()).stream().flatMap($$0 -> bnr.c($$0).stream()).filter($$0 -> (Integer)$$0.getSecond() > 0).toList();
        if (!$$6.isEmpty() || $$4) {
            Dynamic $$7 = $$1.emptyMap();
            Dynamic $$8 = $$1.emptyMap();
            for (Pair $$9 : $$6) {
                $$8 = $$8.set((String)$$9.getFirst(), $$1.createInt(((Integer)$$9.getSecond()).intValue()));
            }
            $$7 = $$7.set("levels", $$8);
            if ($$4) {
                $$7 = $$7.set("show_in_tooltip", $$1.createBoolean(false));
            }
            $$02.a($$3, $$7);
        }
        if ($$5.result().isPresent() && $$6.isEmpty()) {
            $$02.a("minecraft:enchantment_glint_override", $$1.createBoolean(true));
        }
    }

    private static Optional<Pair<String, Integer>> c(Dynamic<?> $$02) {
        return $$02.get("id").asString().apply2stable(($$0, $$1) -> Pair.of((Object)$$0, (Object)bgj.a($$1.intValue(), 0, 255)), $$02.get("lvl").asNumber()).result();
    }

    private static void b(a $$0, Dynamic<?> $$1, int $$2) {
        bnr.b($$0, $$1, "CanDestroy", "minecraft:can_break", ($$2 & 8) != 0);
        bnr.b($$0, $$1, "CanPlaceOn", "minecraft:can_place_on", ($$2 & 0x10) != 0);
    }

    private static void b(a $$02, Dynamic<?> $$1, String $$2, String $$3, boolean $$4) {
        Optional $$5 = $$02.a($$2).result();
        if ($$5.isEmpty()) {
            return;
        }
        Dynamic $$6 = $$1.emptyMap().set("predicates", $$1.createList(((Dynamic)$$5.get()).asStream().map($$0 -> (Dynamic)DataFixUtils.orElse((Optional)$$0.asString().map($$1 -> bnr.a($$0, $$1)).result(), (Object)$$0))));
        if ($$4) {
            $$6 = $$6.set("show_in_tooltip", $$1.createBoolean(false));
        }
        $$02.a($$3, $$6);
    }

    private static Dynamic<?> a(Dynamic<?> $$0, String $$1) {
        int $$2 = $$1.indexOf(91);
        int $$3 = $$1.indexOf(123);
        int $$4 = $$1.length();
        if ($$2 != -1) {
            $$4 = $$2;
        }
        if ($$3 != -1) {
            $$4 = Math.min($$4, $$3);
        }
        String $$5 = $$1.substring(0, $$4);
        Dynamic $$6 = $$0.emptyMap().set("blocks", $$0.createString($$5.trim()));
        int $$7 = $$1.indexOf(93);
        if ($$2 != -1 && $$7 != -1) {
            Dynamic $$8 = $$0.emptyMap();
            Iterable $$9 = m.split((CharSequence)$$1.substring($$2 + 1, $$7));
            for (String $$10 : $$9) {
                int $$11 = $$10.indexOf(61);
                if ($$11 == -1) continue;
                String $$12 = $$10.substring(0, $$11).trim();
                String $$13 = $$10.substring($$11 + 1).trim();
                $$8 = $$8.set($$12, $$0.createString($$13));
            }
            $$6 = $$6.set("state", $$8);
        }
        int $$14 = $$1.indexOf(125);
        if ($$3 != -1 && $$14 != -1) {
            $$6 = $$6.set("nbt", $$0.createString($$1.substring($$3, $$14 + 1)));
        }
        return $$6;
    }

    private static void c(a $$0, Dynamic<?> $$1, int $$2) {
        OptionalDynamic<?> $$3 = $$0.a("AttributeModifiers");
        if ($$3.result().isEmpty()) {
            return;
        }
        boolean $$4 = ($$2 & 2) != 0;
        List $$5 = $$3.asList(bnr::d);
        Dynamic $$6 = $$1.emptyMap().set("modifiers", $$1.createList($$5.stream()));
        if ($$4) {
            $$6 = $$6.set("show_in_tooltip", $$1.createBoolean(false));
        }
        $$0.a("minecraft:attribute_modifiers", $$6);
    }

    private static Dynamic<?> d(Dynamic<?> $$02) {
        Dynamic $$1 = $$02.emptyMap().set("name", $$02.createString("")).set("amount", $$02.createDouble(0.0)).set("operation", $$02.createString("add_value"));
        $$1 = Dynamic.copyField($$02, (String)"AttributeName", (Dynamic)$$1, (String)"type");
        $$1 = Dynamic.copyField($$02, (String)"Slot", (Dynamic)$$1, (String)"slot");
        $$1 = Dynamic.copyField($$02, (String)"UUID", (Dynamic)$$1, (String)"uuid");
        $$1 = Dynamic.copyField($$02, (String)"Name", (Dynamic)$$1, (String)"name");
        $$1 = Dynamic.copyField($$02, (String)"Amount", (Dynamic)$$1, (String)"amount");
        $$1 = Dynamic.copyAndFixField($$02, (String)"Operation", (Dynamic)$$1, (String)"operation", $$0 -> $$0.createString(switch ($$0.asInt(0)) {
            default -> "add_value";
            case 1 -> "add_multiplied_base";
            case 2 -> "add_multiplied_total";
        }));
        return $$1;
    }

    private static Pair<Dynamic<?>, Dynamic<?>> e(Dynamic<?> $$0) {
        Dynamic $$1 = (Dynamic)DataFixUtils.orElseGet((Optional)$$0.get("id").result(), () -> $$0.createString(""));
        Dynamic $$2 = $$0.emptyMap().set("type", $$0.createString(bnr.a($$0.get("type").asInt(0)))).set("x", $$0.createDouble($$0.get("x").asDouble(0.0))).set("z", $$0.createDouble($$0.get("z").asDouble(0.0))).set("rotation", $$0.createFloat((float)$$0.get("rot").asDouble(0.0)));
        return Pair.of((Object)$$1, (Object)$$2);
    }

    private static String a(int $$0) {
        return switch ($$0) {
            default -> "player";
            case 1 -> "frame";
            case 2 -> "red_marker";
            case 3 -> "blue_marker";
            case 4 -> "target_x";
            case 5 -> "target_point";
            case 6 -> "player_off_map";
            case 7 -> "player_off_limits";
            case 8 -> "mansion";
            case 9 -> "monument";
            case 10 -> "banner_white";
            case 11 -> "banner_orange";
            case 12 -> "banner_magenta";
            case 13 -> "banner_light_blue";
            case 14 -> "banner_yellow";
            case 15 -> "banner_lime";
            case 16 -> "banner_pink";
            case 17 -> "banner_gray";
            case 18 -> "banner_light_gray";
            case 19 -> "banner_cyan";
            case 20 -> "banner_purple";
            case 21 -> "banner_blue";
            case 22 -> "banner_brown";
            case 23 -> "banner_green";
            case 24 -> "banner_red";
            case 25 -> "banner_black";
            case 26 -> "red_x";
            case 27 -> "village_desert";
            case 28 -> "village_plains";
            case 29 -> "village_savanna";
            case 30 -> "village_snowy";
            case 31 -> "village_taiga";
            case 32 -> "jungle_temple";
            case 33 -> "swamp_hut";
        };
    }

    private static void b(a $$02, Dynamic<?> $$1) {
        Dynamic<?> $$2 = $$1.emptyMap();
        Optional<String> $$3 = $$02.a("Potion").asString().result().filter($$0 -> !$$0.equals("minecraft:empty"));
        if ($$3.isPresent()) {
            $$2 = $$2.set("potion", $$1.createString($$3.get()));
        }
        $$2 = $$02.a("CustomPotionColor", $$2, "custom_color");
        if (!($$2 = $$02.a("custom_potion_effects", $$2, "custom_effects")).equals((Object)$$1.emptyMap())) {
            $$02.a("minecraft:potion_contents", $$2);
        }
    }

    private static void c(a $$0, Dynamic<?> $$1) {
        Dynamic<?> $$2 = bnr.e($$0, $$1);
        if ($$2 != null) {
            $$0.a("minecraft:writable_book_content", $$1.emptyMap().set("pages", $$2));
        }
    }

    private static void d(a $$0, Dynamic<?> $$1) {
        Dynamic<?> $$2 = bnr.e($$0, $$1);
        String $$3 = $$0.a("title").asString("");
        Optional $$4 = $$0.a("filtered_title").asString().result();
        Dynamic $$5 = $$1.emptyMap();
        $$5 = $$5.set("title", bnr.a($$1, $$3, $$4));
        $$5 = $$0.a("author", $$5, "author");
        $$5 = $$0.a("resolved", $$5, "resolved");
        $$5 = $$0.a("generation", $$5, "generation");
        if ($$2 != null) {
            $$5 = $$5.set("pages", $$2);
        }
        $$0.a("minecraft:written_book_content", $$5);
    }

    private static @Nullable Dynamic<?> e(a $$02, Dynamic<?> $$1) {
        List $$2 = $$02.a("pages").asList($$0 -> $$0.asString(""));
        Map $$3 = $$02.a("filtered_pages").asMap($$0 -> $$0.asString("0"), $$0 -> $$0.asString(""));
        if ($$2.isEmpty()) {
            return null;
        }
        ArrayList $$4 = new ArrayList($$2.size());
        for (int $$5 = 0; $$5 < $$2.size(); ++$$5) {
            String $$6 = (String)$$2.get($$5);
            String $$7 = (String)$$3.get(String.valueOf($$5));
            $$4.add(bnr.a($$1, $$6, Optional.ofNullable($$7)));
        }
        return $$1.createList($$4.stream());
    }

    private static Dynamic<?> a(Dynamic<?> $$0, String $$1, Optional<String> $$2) {
        Dynamic $$3 = $$0.emptyMap().set("raw", $$0.createString($$1));
        if ($$2.isPresent()) {
            $$3 = $$3.set("filtered", $$0.createString($$2.get()));
        }
        return $$3;
    }

    private static void f(a $$0, Dynamic<?> $$1) {
        Dynamic<?> $$2 = $$1.emptyMap();
        for (String $$3 : k) {
            $$2 = $$0.a($$3, $$2, $$3);
        }
        if (!$$2.equals((Object)$$1.emptyMap())) {
            $$0.a("minecraft:bucket_entity_data", $$2);
        }
    }

    private static void g(a $$0, Dynamic<?> $$1) {
        Optional $$2 = $$0.a("LodestonePos").result();
        Optional $$3 = $$0.a("LodestoneDimension").result();
        if ($$2.isEmpty() && $$3.isEmpty()) {
            return;
        }
        boolean $$4 = $$0.a("LodestoneTracked").asBoolean(true);
        Dynamic $$5 = $$1.emptyMap();
        if ($$2.isPresent() && $$3.isPresent()) {
            $$5 = $$5.set("target", $$1.emptyMap().set("pos", (Dynamic)$$2.get()).set("dimension", (Dynamic)$$3.get()));
        }
        if (!$$4) {
            $$5 = $$5.set("tracked", $$1.createBoolean(false));
        }
        $$0.a("minecraft:lodestone_tracker", $$5);
    }

    private static void a(a $$0) {
        $$0.a("Explosion", true, $$1 -> {
            $$0.a("minecraft:firework_explosion", bnr.f($$1));
            return $$1.remove("Type").remove("Colors").remove("FadeColors").remove("Trail").remove("Flicker");
        });
    }

    private static void b(a $$0) {
        $$0.a("Fireworks", true, $$1 -> {
            Stream<Dynamic> $$2 = $$1.get("Explosions").asStream().map(bnr::f);
            int $$3 = $$1.get("Flight").asInt(0);
            $$0.a("minecraft:fireworks", $$1.emptyMap().set("explosions", $$1.createList($$2)).set("flight_duration", $$1.createByte((byte)$$3)));
            return $$1.remove("Explosions").remove("Flight");
        });
    }

    private static Dynamic<?> f(Dynamic<?> $$0) {
        $$0 = $$0.set("shape", $$0.createString(switch ($$0.get("Type").asInt(0)) {
            default -> "small_ball";
            case 1 -> "large_ball";
            case 2 -> "star";
            case 3 -> "creeper";
            case 4 -> "burst";
        })).remove("Type");
        $$0 = $$0.renameField("Colors", "colors");
        $$0 = $$0.renameField("FadeColors", "fade_colors");
        $$0 = $$0.renameField("Trail", "has_trail");
        $$0 = $$0.renameField("Flicker", "has_twinkle");
        return $$0;
    }

    public static Dynamic<?> a(Dynamic<?> $$0) {
        Optional $$1 = $$0.asString().result();
        if ($$1.isPresent()) {
            if (bnr.a((String)$$1.get())) {
                return $$0.emptyMap().set("name", $$0.createString((String)$$1.get()));
            }
            return $$0.emptyMap();
        }
        String $$2 = $$0.get("Name").asString("");
        Optional $$3 = $$0.get("Id").result();
        Dynamic<?> $$4 = bnr.a($$0.get("Properties"));
        Dynamic $$5 = $$0.emptyMap();
        if (bnr.a($$2)) {
            $$5 = $$5.set("name", $$0.createString($$2));
        }
        if ($$3.isPresent()) {
            $$5 = $$5.set("id", (Dynamic)$$3.get());
        }
        if ($$4 != null) {
            $$5 = $$5.set("properties", $$4);
        }
        return $$5;
    }

    private static boolean a(String $$02) {
        if ($$02.length() > 16) {
            return false;
        }
        return $$02.chars().filter($$0 -> $$0 <= 32 || $$0 >= 127).findAny().isEmpty();
    }

    private static @Nullable Dynamic<?> a(OptionalDynamic<?> $$03) {
        Map $$12 = $$03.asMap($$0 -> $$0.asString(""), $$02 -> $$02.asList($$0 -> {
            String $$1 = $$0.get("Value").asString("");
            Optional $$2 = $$0.get("Signature").asString().result();
            return Pair.of((Object)$$1, (Object)$$2);
        }));
        if ($$12.isEmpty()) {
            return null;
        }
        return $$03.createList($$12.entrySet().stream().flatMap($$1 -> ((List)$$1.getValue()).stream().map($$2 -> {
            Dynamic $$3 = $$03.emptyMap().set("name", $$03.createString((String)$$1.getKey())).set("value", $$03.createString((String)$$2.getFirst()));
            Optional $$4 = (Optional)$$2.getSecond();
            if ($$4.isPresent()) {
                return $$3.set("signature", $$03.createString((String)$$4.get()));
            }
            return $$3;
        })));
    }

    protected TypeRewriteRule makeRule() {
        return this.writeFixAndRead("ItemStack componentization", this.getInputSchema().getType(bqh.x), this.getOutputSchema().getType(bqh.x), $$02 -> {
            Optional<Dynamic> $$1 = bnr$a.a($$02).map($$0 -> {
                bnr.a($$0, $$0.e);
                return $$0.a();
            });
            return (Dynamic)DataFixUtils.orElse($$1, (Object)$$02);
        });
    }

    static class a {
        private final String a;
        private final int b;
        private Dynamic<?> c;
        private final Dynamic<?> d;
        Dynamic<?> e;

        private a(String $$0, int $$1, Dynamic<?> $$2) {
            this.a = bsh.a($$0);
            this.b = $$1;
            this.c = $$2.emptyMap();
            this.e = $$2.get("tag").orElseEmptyMap();
            this.d = $$2.remove("tag");
        }

        public static Optional<a> a(Dynamic<?> $$0) {
            return $$0.get("id").asString().apply2stable(($$1, $$2) -> new a((String)$$1, $$2.intValue(), (Dynamic<?>)$$0.remove("id").remove("Count")), $$0.get("Count").asNumber()).result();
        }

        public OptionalDynamic<?> a(String $$0) {
            OptionalDynamic $$1 = this.e.get($$0);
            this.e = this.e.remove($$0);
            return $$1;
        }

        public void a(String $$0, Dynamic<?> $$1) {
            this.c = this.c.set($$0, $$1);
        }

        public void a(String $$0, OptionalDynamic<?> $$12) {
            $$12.result().ifPresent($$1 -> {
                this.c = this.c.set($$0, $$1);
            });
        }

        public Dynamic<?> a(String $$0, Dynamic<?> $$1, String $$2) {
            Optional $$3 = this.a($$0).result();
            if ($$3.isPresent()) {
                return $$1.set($$2, (Dynamic)$$3.get());
            }
            return $$1;
        }

        public void a(String $$0, String $$1, Dynamic<?> $$2) {
            Optional $$3 = this.a($$0).result();
            if ($$3.isPresent() && !((Dynamic)$$3.get()).equals($$2)) {
                this.a($$1, (Dynamic)$$3.get());
            }
        }

        public void a(String $$0, String $$12) {
            this.a($$0).result().ifPresent($$1 -> this.a($$12, (Dynamic<?>)$$1));
        }

        public void a(String $$0, boolean $$1, UnaryOperator<Dynamic<?>> $$2) {
            OptionalDynamic $$3 = this.e.get($$0);
            if ($$1 && $$3.result().isEmpty()) {
                return;
            }
            Dynamic $$4 = $$3.orElseEmptyMap();
            this.e = ($$4 = (Dynamic)$$2.apply($$4)).equals((Object)$$4.emptyMap()) ? this.e.remove($$0) : this.e.set($$0, $$4);
        }

        public Dynamic<?> a() {
            Dynamic $$0 = this.e.emptyMap().set("id", this.e.createString(this.a)).set("count", this.e.createInt(this.b));
            if (!this.e.equals((Object)this.e.emptyMap())) {
                this.c = this.c.set("minecraft:custom_data", this.e);
            }
            if (!this.c.equals((Object)this.e.emptyMap())) {
                $$0 = $$0.set("components", this.c);
            }
            return bnr$a.a($$0, this.d);
        }

        private static <T> Dynamic<T> a(Dynamic<T> $$0, Dynamic<?> $$12) {
            DynamicOps $$22 = $$0.getOps();
            return $$22.getMap($$0.getValue()).flatMap($$2 -> $$22.mergeToMap($$12.convert($$22).getValue(), $$2)).map($$1 -> new Dynamic($$22, $$1)).result().orElse($$0);
        }

        public boolean b(String $$0) {
            return this.a.equals($$0);
        }

        public boolean a(Set<String> $$0) {
            return $$0.contains(this.a);
        }

        public boolean c(String $$0) {
            return this.c.get($$0).result().isPresent();
        }
    }
}

