/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.BoolArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.serialization.Codec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;
import net.minecraft.server.MinecraftServer;
import org.jspecify.annotations.Nullable;

public class eua {
    public static final etv<Boolean> a = eua.a("advance_time", etw.e, !w.aN);
    public static final etv<Boolean> b = eua.a("advance_weather", etw.e, !w.aN);
    public static final etv<Boolean> c = eua.a("allow_entering_nether_using_portals", etw.g, true);
    public static final etv<Boolean> d = eua.a("block_drops", etw.d, true);
    public static final etv<Boolean> e = eua.a("block_explosion_drop_decay", etw.d, true);
    public static final etv<Boolean> f = eua.a("command_blocks_work", etw.g, true);
    public static final etv<Boolean> g = eua.a("command_block_output", etw.f, true);
    public static final etv<Boolean> h = eua.a("drowning_damage", etw.a, true);
    public static final etv<Boolean> i = eua.a("elytra_movement_check", etw.a, true);
    public static final etv<Boolean> j = eua.a("ender_pearls_vanish_on_death", etw.a, true);
    public static final etv<Boolean> k = eua.a("entity_drops", etw.d, true);
    public static final etv<Boolean> l = eua.a("fall_damage", etw.a, true);
    public static final etv<Boolean> m = eua.a("fire_damage", etw.a, true);
    public static final etv<Integer> n = eua.a("fire_spread_radius_around_player", etw.e, 128, -1);
    public static final etv<Boolean> o = eua.a("forgive_dead_players", etw.b, true);
    public static final etv<Boolean> p = eua.a("freeze_damage", etw.a, true);
    public static final etv<Boolean> q = eua.a("global_sound_events", etw.g, true);
    public static final etv<Boolean> r = eua.a("immediate_respawn", etw.a, false);
    public static final etv<Boolean> s = eua.a("keep_inventory", etw.a, false);
    public static final etv<Boolean> t = eua.a("lava_source_conversion", etw.e, false);
    public static final etv<Boolean> u = eua.a("limited_crafting", etw.a, false);
    public static final etv<Boolean> v = eua.a("locator_bar", etw.a, true);
    public static final etv<Boolean> w = eua.a("log_admin_commands", etw.f, true);
    public static final etv<Integer> x = eua.a("max_block_modifications", etw.g, 32768, 1);
    public static final etv<Integer> y = eua.a("max_command_forks", etw.g, 65536, 0);
    public static final etv<Integer> z = eua.a("max_command_sequence_length", etw.g, 65536, 0);
    public static final etv<Integer> A = eua.a("max_entity_cramming", etw.b, 24, 0);
    public static final etv<Integer> B = eua.a("max_minecart_speed", etw.g, 8, 1, 1000, dgz.a(dhb.d));
    public static final etv<Integer> C = eua.a("max_snow_accumulation_height", etw.e, 1, 0, 8);
    public static final etv<Boolean> D = eua.a("mob_drops", etw.d, true);
    public static final etv<Boolean> E = eua.a("mob_explosion_drop_decay", etw.d, true);
    public static final etv<Boolean> F = eua.a("mob_griefing", etw.b, true);
    public static final etv<Boolean> G = eua.a("natural_health_regeneration", etw.a, true);
    public static final etv<Boolean> H = eua.a("player_movement_check", etw.a, true);
    public static final etv<Integer> I = eua.a("players_nether_portal_creative_delay", etw.a, 0, 0);
    public static final etv<Integer> J = eua.a("players_nether_portal_default_delay", etw.a, 80, 0);
    public static final etv<Integer> K = eua.a("players_sleeping_percentage", etw.a, 100, 0);
    public static final etv<Boolean> L = eua.a("projectiles_can_break_blocks", etw.d, true);
    public static final etv<Boolean> M = eua.a("pvp", etw.a, true);
    public static final etv<Boolean> N = eua.a("raids", etw.b, true);
    public static final etv<Integer> O = eua.a("random_tick_speed", etw.e, 3, 0);
    public static final etv<Boolean> P = eua.a("reduced_debug_info", etw.g, false);
    public static final etv<Integer> Q = eua.a("respawn_radius", etw.a, 10, 0);
    public static final etv<Boolean> R = eua.a("send_command_feedback", etw.f, true);
    public static final etv<Boolean> S = eua.a("show_advancement_messages", etw.f, true);
    public static final etv<Boolean> T = eua.a("show_death_messages", etw.f, true);
    public static final etv<Boolean> U = eua.a("spawner_blocks_work", etw.g, true);
    public static final etv<Boolean> V = eua.a("spawn_mobs", etw.c, true);
    public static final etv<Boolean> W = eua.a("spawn_monsters", etw.c, true);
    public static final etv<Boolean> X = eua.a("spawn_patrols", etw.c, true);
    public static final etv<Boolean> Y = eua.a("spawn_phantoms", etw.c, true);
    public static final etv<Boolean> Z = eua.a("spawn_wandering_traders", etw.c, true);
    public static final etv<Boolean> aa = eua.a("spawn_wardens", etw.c, true);
    public static final etv<Boolean> ab = eua.a("spectators_generate_chunks", etw.a, true);
    public static final etv<Boolean> ac = eua.a("spread_vines", etw.e, true);
    public static final etv<Boolean> ad = eua.a("tnt_explodes", etw.g, true);
    public static final etv<Boolean> ae = eua.a("tnt_explosion_drop_decay", etw.d, false);
    public static final etv<Boolean> af = eua.a("universal_anger", etw.b, false);
    public static final etv<Boolean> ag = eua.a("water_source_conversion", etw.e, true);
    private final etx ah;

    public static Codec<eua> a(dgz $$02) {
        return etx.a.xmap($$1 -> new eua($$02, (etx)$$1), $$0 -> $$0.ah);
    }

    public eua(dgz $$0, etx $$1) {
        this($$0);
        this.ah.a($$1, this.ah::a);
    }

    public eua(dgz $$0) {
        this.ah = etx.a(mi.an.a($$0).c().map(jd::a));
    }

    public Stream<etv<?>> a() {
        return this.ah.b().stream();
    }

    public <T> T a(etv<T> $$0) {
        T $$1 = this.ah.b($$0);
        if ($$1 == null) {
            throw new IllegalArgumentException("Tried to access invalid game rule");
        }
        return $$1;
    }

    public <T> void a(etv<T> $$0, T $$1, @Nullable MinecraftServer $$2) {
        if (!this.ah.a($$0)) {
            throw new IllegalArgumentException("Tried to set invalid game rule");
        }
        this.ah.a($$0, $$1);
        if ($$2 != null) {
            $$2.a($$0, $$1);
        }
    }

    public eua b(dgz $$0) {
        return new eua($$0, this.ah);
    }

    public void a(eua $$0, @Nullable MinecraftServer $$1) {
        this.a($$0.ah, $$1);
    }

    public void a(etx $$0, @Nullable MinecraftServer $$1) {
        $$0.b().forEach($$2 -> this.a($$0, (etv)$$2, $$1));
    }

    private <T> void a(etx $$0, etv<T> $$1, @Nullable MinecraftServer $$2) {
        this.a($$1, Objects.requireNonNull($$0.b($$1)), $$2);
    }

    public void a(etz $$0) {
        this.ah.b().forEach($$1 -> {
            $$0.a($$1);
            $$1.a($$0);
        });
    }

    private static etv<Boolean> a(String $$02, etw $$1, boolean $$2) {
        return eua.a($$02, $$1, ety.b, BoolArgumentType.bool(), Codec.BOOL, $$2, dgz.a(), etz::b, $$0 -> $$0 != false ? 1 : 0);
    }

    private static etv<Integer> a(String $$0, etw $$1, int $$2, int $$3) {
        return eua.a($$0, $$1, $$2, $$3, Integer.MAX_VALUE, dgz.a());
    }

    private static etv<Integer> a(String $$0, etw $$1, int $$2, int $$3, int $$4) {
        return eua.a($$0, $$1, $$2, $$3, $$4, dgz.a());
    }

    private static etv<Integer> a(String $$02, etw $$1, int $$2, int $$3, int $$4, dgz $$5) {
        return eua.a($$02, $$1, ety.a, IntegerArgumentType.integer((int)$$3, (int)$$4), Codec.intRange((int)$$3, (int)$$4), $$2, $$5, etz::c, $$0 -> $$0);
    }

    private static <T> etv<T> a(String $$0, etw $$1, ety $$2, ArgumentType<T> $$3, Codec<T> $$4, T $$5, dgz $$6, a<T> $$7, ToIntFunction<T> $$8) {
        return jq.a(mi.an, $$0, new etv<T>($$1, $$2, $$3, $$7, $$4, $$8, $$5, $$6));
    }

    public static etv<?> a(jq<etv<?>> $$0) {
        return a;
    }

    public <T> String b(etv<T> $$0) {
        return $$0.a(this.a($$0));
    }

    public static interface a<T> {
        public void call(etz var1, etv<T> var2);
    }
}

