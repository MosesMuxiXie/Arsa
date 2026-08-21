/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.mojang.serialization.Codec
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

public class cqw<U> {
    public static final cqw<Void> a = cqw.a("dummy");
    public static final cqw<jc> b = cqw.a("home", jc.b);
    public static final cqw<jc> c = cqw.a("job_site", jc.b);
    public static final cqw<jc> d = cqw.a("potential_job_site", jc.b);
    public static final cqw<jc> e = cqw.a("meeting_point", jc.b);
    public static final cqw<List<jc>> f = cqw.a("secondary_job_site");
    public static final cqw<List<chl>> g = cqw.a("mobs");
    public static final cqw<cqy> h = cqw.a("visible_mobs");
    public static final cqw<List<chl>> i = cqw.a("visible_villager_babies");
    public static final cqw<List<ddm>> j = cqw.a("nearest_players");
    public static final cqw<ddm> k = cqw.a("nearest_visible_player");
    public static final cqw<ddm> l = cqw.a("nearest_visible_targetable_player");
    public static final cqw<List<ddm>> m = cqw.a("nearest_visible_targetable_players");
    public static final cqw<cqz> n = cqw.a("walk_target");
    public static final cqw<cks> o = cqw.a("look_target");
    public static final cqw<chl> p = cqw.a("attack_target");
    public static final cqw<Boolean> q = cqw.a("attack_cooling_down");
    public static final cqw<chl> r = cqw.a("interaction_target");
    public static final cqw<cfy> s = cqw.a("breed_target");
    public static final cqw<cgk> t = cqw.a("ride_target");
    public static final cqw<flp> u = cqw.a("path");
    public static final cqw<List<jc>> v = cqw.a("interactable_doors");
    public static final cqw<Set<jc>> w = cqw.a("doors_to_close");
    public static final cqw<is> x = cqw.a("nearest_bed");
    public static final cqw<cex> y = cqw.a("hurt_by");
    public static final cqw<chl> z = cqw.a("hurt_by_entity");
    public static final cqw<chl> A = cqw.a("avoid_target");
    public static final cqw<chl> B = cqw.a("nearest_hostile");
    public static final cqw<chl> C = cqw.a("nearest_attackable");
    public static final cqw<jc> D = cqw.a("hiding_place");
    public static final cqw<Long> E = cqw.a("heard_bell_time");
    public static final cqw<Long> F = cqw.a("cant_reach_walk_target_since");
    public static final cqw<Boolean> G = cqw.a("golem_detected_recently", Codec.BOOL);
    public static final cqw<Boolean> H = cqw.a("danger_detected_recently", Codec.BOOL);
    public static final cqw<Long> I = cqw.a("last_slept", Codec.LONG);
    public static final cqw<Long> J = cqw.a("last_woken", Codec.LONG);
    public static final cqw<Long> K = cqw.a("last_worked_at_poi", Codec.LONG);
    public static final cqw<chl> L = cqw.a("nearest_visible_adult");
    public static final cqw<czl> M = cqw.a("nearest_visible_wanted_item");
    public static final cqw<chn> N = cqw.a("nearest_visible_nemesis");
    public static final cqw<Integer> O = cqw.a("play_dead_ticks", Codec.INT);
    public static final cqw<ddm> P = cqw.a("tempting_player");
    public static final cqw<Integer> Q = cqw.a("temptation_cooldown_ticks", Codec.INT);
    public static final cqw<Integer> R = cqw.a("gaze_cooldown_ticks", Codec.INT);
    public static final cqw<Boolean> S = cqw.a("is_tempted", Codec.BOOL);
    public static final cqw<Integer> T = cqw.a("long_jump_cooling_down", Codec.INT);
    public static final cqw<Boolean> U = cqw.a("long_jump_mid_jump");
    public static final cqw<Boolean> V = cqw.a("has_hunting_cooldown", Codec.BOOL);
    public static final cqw<Integer> W = cqw.a("ram_cooldown_ticks", Codec.INT);
    public static final cqw<ftm> X = cqw.a("ram_target");
    public static final cqw<bhr> Y = cqw.a("is_in_water", bhr.b);
    public static final cqw<bhr> Z = cqw.a("is_pregnant", bhr.b);
    public static final cqw<Boolean> aa = cqw.a("is_panicking", Codec.BOOL);
    public static final cqw<List<UUID>> ab = cqw.a("unreachable_tongue_targets");
    public static final cqw<Set<jc>> ac = cqw.a("visited_block_positions", jc.b.listOf().xmap(Sets::newHashSet, Lists::newArrayList));
    public static final cqw<Set<jc>> ad = cqw.a("unreachable_transport_block_positions", jc.b.listOf().xmap(Sets::newHashSet, Lists::newArrayList));
    public static final cqw<Integer> ae = cqw.a("transport_items_cooldown_ticks");
    public static final cqw<Integer> af = cqw.a("charge_cooldown_ticks", Codec.INT);
    public static final cqw<Integer> ag = cqw.a("attack_target_cooldown", Codec.INT);
    public static final cqw<Integer> ah = cqw.a("spear_fleeing_time");
    public static final cqw<ftm> ai = cqw.a("spear_fleeing_position");
    public static final cqw<ftm> aj = cqw.a("spear_charge_position");
    public static final cqw<Integer> ak = cqw.a("spear_engage_time");
    public static final cqw<clr.a> al = cqw.a("spear_status");
    public static final cqw<UUID> am = cqw.a("angry_at", jx.a);
    public static final cqw<Boolean> an = cqw.a("universal_anger", Codec.BOOL);
    public static final cqw<Boolean> ao = cqw.a("admiring_item", Codec.BOOL);
    public static final cqw<Integer> ap = cqw.a("time_trying_to_reach_admire_item");
    public static final cqw<Boolean> aq = cqw.a("disable_walk_to_admire_item");
    public static final cqw<Boolean> ar = cqw.a("admiring_disabled", Codec.BOOL);
    public static final cqw<Boolean> as = cqw.a("hunted_recently", Codec.BOOL);
    public static final cqw<is> at = cqw.a("celebrate_location");
    public static final cqw<Boolean> au = cqw.a("dancing");
    public static final cqw<daw> av = cqw.a("nearest_visible_huntable_hoglin");
    public static final cqw<daw> aw = cqw.a("nearest_visible_baby_hoglin");
    public static final cqw<ddm> ax = cqw.a("nearest_targetable_player_not_wearing_gold");
    public static final cqw<List<dbi>> ay = cqw.a("nearby_adult_piglins");
    public static final cqw<List<dbi>> az = cqw.a("nearest_visible_adult_piglins");
    public static final cqw<List<daw>> aA = cqw.a("nearest_visible_adult_hoglins");
    public static final cqw<dbi> aB = cqw.a("nearest_visible_adult_piglin");
    public static final cqw<chl> aC = cqw.a("nearest_visible_zombified");
    public static final cqw<Integer> aD = cqw.a("visible_adult_piglin_count");
    public static final cqw<Integer> aE = cqw.a("visible_adult_hoglin_count");
    public static final cqw<ddm> aF = cqw.a("nearest_player_holding_wanted_item");
    public static final cqw<Boolean> aG = cqw.a("ate_recently");
    public static final cqw<is> aH = cqw.a("nearest_repellent");
    public static final cqw<Boolean> aI = cqw.a("pacified");
    public static final cqw<chl> aJ = cqw.a("roar_target");
    public static final cqw<is> aK = cqw.a("disturbance_location");
    public static final cqw<bhr> aL = cqw.a("recent_projectile", bhr.b);
    public static final cqw<bhr> aM = cqw.a("is_sniffing", bhr.b);
    public static final cqw<bhr> aN = cqw.a("is_emerging", bhr.b);
    public static final cqw<bhr> aO = cqw.a("roar_sound_delay", bhr.b);
    public static final cqw<bhr> aP = cqw.a("dig_cooldown", bhr.b);
    public static final cqw<bhr> aQ = cqw.a("roar_sound_cooldown", bhr.b);
    public static final cqw<bhr> aR = cqw.a("sniff_cooldown", bhr.b);
    public static final cqw<bhr> aS = cqw.a("touch_cooldown", bhr.b);
    public static final cqw<bhr> aT = cqw.a("vibration_cooldown", bhr.b);
    public static final cqw<bhr> aU = cqw.a("sonic_boom_cooldown", bhr.b);
    public static final cqw<bhr> aV = cqw.a("sonic_boom_sound_cooldown", bhr.b);
    public static final cqw<bhr> aW = cqw.a("sonic_boom_sound_delay", bhr.b);
    public static final cqw<UUID> aX = cqw.a("liked_player", jx.a);
    public static final cqw<jc> aY = cqw.a("liked_noteblock", jc.b);
    public static final cqw<Integer> aZ = cqw.a("liked_noteblock_cooldown_ticks", Codec.INT);
    public static final cqw<Integer> ba = cqw.a("item_pickup_cooldown_ticks", Codec.INT);
    public static final cqw<List<jc>> bb = cqw.a("sniffer_explored_positions", Codec.list(jc.b));
    public static final cqw<is> bc = cqw.a("sniffer_sniffing_target");
    public static final cqw<Boolean> bd = cqw.a("sniffer_digging");
    public static final cqw<Boolean> be = cqw.a("sniffer_happy");
    public static final cqw<bhr> bf = cqw.a("breeze_jump_cooldown", bhr.b);
    public static final cqw<bhr> bg = cqw.a("breeze_shoot", bhr.b);
    public static final cqw<bhr> bh = cqw.a("breeze_shoot_charging", bhr.b);
    public static final cqw<bhr> bi = cqw.a("breeze_shoot_recover", bhr.b);
    public static final cqw<bhr> bj = cqw.a("breeze_shoot_cooldown", bhr.b);
    public static final cqw<bhr> bk = cqw.a("breeze_jump_inhaling", bhr.b);
    public static final cqw<is> bl = cqw.a("breeze_jump_target", is.a);
    public static final cqw<bhr> bm = cqw.a("breeze_leaving_water", bhr.b);
    private final Optional<Codec<cqv<U>>> bn;

    @VisibleForTesting
    public cqw(Optional<Codec<U>> $$0) {
        this.bn = $$0.map(cqv::a);
    }

    public String toString() {
        return mi.A.b(this).toString();
    }

    public Optional<Codec<cqv<U>>> a() {
        return this.bn;
    }

    private static <U> cqw<U> a(String $$0, Codec<U> $$1) {
        return jq.a(mi.A, amo.b($$0), new cqw<U>(Optional.of($$1)));
    }

    private static <U> cqw<U> a(String $$0) {
        return jq.a(mi.A, amo.b($$0), new cqw<U>(Optional.empty()));
    }
}

