/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;
import java.util.stream.IntStream;

public class gia {
    public static final ghz a = gia.a("cube", gic.c, gic.j, gic.k, gic.l, gic.m, gic.n, gic.o);
    public static final ghz b = gia.a("cube_directional", gic.c, gic.j, gic.k, gic.l, gic.m, gic.n, gic.o);
    public static final ghz c = gia.a("cube_all", gic.a);
    public static final ghz d = gia.a("cube_all_inner_faces", gic.a);
    public static final ghz e = gia.b("cube_mirrored_all", "_mirrored", gic.a);
    public static final ghz f = gia.b("cube_north_west_mirrored_all", "_north_west_mirrored", gic.a);
    public static final ghz g = gia.b("cube_column_uv_locked_x", "_x", gic.d, gic.i);
    public static final ghz h = gia.b("cube_column_uv_locked_y", "_y", gic.d, gic.i);
    public static final ghz i = gia.b("cube_column_uv_locked_z", "_z", gic.d, gic.i);
    public static final ghz j = gia.a("cube_column", gic.d, gic.i);
    public static final ghz k = gia.b("cube_column_horizontal", "_horizontal", gic.d, gic.i);
    public static final ghz l = gia.b("cube_column_mirrored", "_mirrored", gic.d, gic.i);
    public static final ghz m = gia.a("cube_top", gic.f, gic.i);
    public static final ghz n = gia.a("cube_bottom_top", gic.f, gic.e, gic.i);
    public static final ghz o = gia.a("cube_bottom_top_inner_faces", gic.f, gic.e, gic.i);
    public static final ghz p = gia.a("orientable", gic.f, gic.g, gic.i);
    public static final ghz q = gia.a("orientable_with_bottom", gic.f, gic.e, gic.i, gic.g);
    public static final ghz r = gia.b("orientable_vertical", "_vertical", gic.g, gic.i);
    public static final ghz s = gia.a("button", gic.b);
    public static final ghz t = gia.b("button_pressed", "_pressed", gic.b);
    public static final ghz u = gia.b("button_inventory", "_inventory", gic.b);
    public static final ghz v = gia.b("door_bottom_left", "_bottom_left", gic.f, gic.e);
    public static final ghz w = gia.b("door_bottom_left_open", "_bottom_left_open", gic.f, gic.e);
    public static final ghz x = gia.b("door_bottom_right", "_bottom_right", gic.f, gic.e);
    public static final ghz y = gia.b("door_bottom_right_open", "_bottom_right_open", gic.f, gic.e);
    public static final ghz z = gia.b("door_top_left", "_top_left", gic.f, gic.e);
    public static final ghz A = gia.b("door_top_left_open", "_top_left_open", gic.f, gic.e);
    public static final ghz B = gia.b("door_top_right", "_top_right", gic.f, gic.e);
    public static final ghz C = gia.b("door_top_right_open", "_top_right_open", gic.f, gic.e);
    public static final ghz D = gia.b("custom_fence_post", "_post", gic.b, gic.c);
    public static final ghz E = gia.b("custom_fence_side_north", "_side_north", gic.b);
    public static final ghz F = gia.b("custom_fence_side_east", "_side_east", gic.b);
    public static final ghz G = gia.b("custom_fence_side_south", "_side_south", gic.b);
    public static final ghz H = gia.b("custom_fence_side_west", "_side_west", gic.b);
    public static final ghz I = gia.b("custom_fence_inventory", "_inventory", gic.b);
    public static final ghz J = gia.b("fence_post", "_post", gic.b);
    public static final ghz K = gia.b("fence_side", "_side", gic.b);
    public static final ghz L = gia.b("fence_inventory", "_inventory", gic.b);
    public static final ghz M = gia.b("template_wall_post", "_post", gic.s);
    public static final ghz N = gia.b("template_wall_side", "_side", gic.s);
    public static final ghz O = gia.b("template_wall_side_tall", "_side_tall", gic.s);
    public static final ghz P = gia.b("wall_inventory", "_inventory", gic.s);
    public static final ghz Q = gia.a("template_custom_fence_gate", gic.b, gic.c);
    public static final ghz R = gia.b("template_custom_fence_gate_open", "_open", gic.b, gic.c);
    public static final ghz S = gia.b("template_custom_fence_gate_wall", "_wall", gic.b, gic.c);
    public static final ghz T = gia.b("template_custom_fence_gate_wall_open", "_wall_open", gic.b, gic.c);
    public static final ghz U = gia.a("template_fence_gate", gic.b);
    public static final ghz V = gia.b("template_fence_gate_open", "_open", gic.b);
    public static final ghz W = gia.b("template_fence_gate_wall", "_wall", gic.b);
    public static final ghz X = gia.b("template_fence_gate_wall_open", "_wall_open", gic.b);
    public static final ghz Y = gia.a("pressure_plate_up", gic.b);
    public static final ghz Z = gia.b("pressure_plate_down", "_down", gic.b);
    public static final ghz aa = gia.a(gic.c);
    public static final ghz ab = gia.a("slab", gic.e, gic.f, gic.i);
    public static final ghz ac = gia.b("slab_top", "_top", gic.e, gic.f, gic.i);
    public static final ghz ad = gia.a("leaves", gic.a);
    public static final ghz ae = gia.a("stairs", gic.e, gic.f, gic.i);
    public static final ghz af = gia.b("inner_stairs", "_inner", gic.e, gic.f, gic.i);
    public static final ghz ag = gia.b("outer_stairs", "_outer", gic.e, gic.f, gic.i);
    public static final ghz ah = gia.b("template_trapdoor_top", "_top", gic.b);
    public static final ghz ai = gia.b("template_trapdoor_bottom", "_bottom", gic.b);
    public static final ghz aj = gia.b("template_trapdoor_open", "_open", gic.b);
    public static final ghz ak = gia.b("template_orientable_trapdoor_top", "_top", gic.b);
    public static final ghz al = gia.b("template_orientable_trapdoor_bottom", "_bottom", gic.b);
    public static final ghz am = gia.b("template_orientable_trapdoor_open", "_open", gic.b);
    public static final ghz an = gia.a("pointed_dripstone", gic.p);
    public static final ghz ao = gia.a("cross", gic.p);
    public static final ghz ap = gia.a("tinted_cross", gic.p);
    public static final ghz aq = gia.a("cross_emissive", gic.p, gic.q);
    public static final ghz ar = gia.a("flower_pot_cross", gic.r);
    public static final ghz as = gia.a("tinted_flower_pot_cross", gic.r);
    public static final ghz at = gia.a("flower_pot_cross_emissive", gic.r, gic.q);
    public static final ghz au = gia.a("rail_flat", gic.t);
    public static final ghz av = gia.b("rail_curved", "_corner", gic.t);
    public static final ghz aw = gia.b("template_rail_raised_ne", "_raised_ne", gic.t);
    public static final ghz ax = gia.b("template_rail_raised_sw", "_raised_sw", gic.t);
    public static final ghz ay = gia.a("carpet", gic.u);
    public static final ghz az = gia.a("mossy_carpet_side", gic.i);
    public static final ghz aA = gia.b("flowerbed_1", "_1", gic.Q, gic.z);
    public static final ghz aB = gia.b("flowerbed_2", "_2", gic.Q, gic.z);
    public static final ghz aC = gia.b("flowerbed_3", "_3", gic.Q, gic.z);
    public static final ghz aD = gia.b("flowerbed_4", "_4", gic.Q, gic.z);
    public static final ghz aE = gia.b("template_leaf_litter_1", "_1", gic.b);
    public static final ghz aF = gia.b("template_leaf_litter_2", "_2", gic.b);
    public static final ghz aG = gia.b("template_leaf_litter_3", "_3", gic.b);
    public static final ghz aH = gia.b("template_leaf_litter_4", "_4", gic.b);
    public static final ghz aI = gia.a("coral_fan", gic.y);
    public static final ghz aJ = gia.a("coral_wall_fan", gic.y);
    public static final ghz aK = gia.a("template_glazed_terracotta", gic.v);
    public static final ghz aL = gia.a("template_chorus_flower", gic.b);
    public static final ghz aM = gia.a("template_daylight_detector", gic.f, gic.i);
    public static final ghz aN = gia.b("template_glass_pane_noside", "_noside", gic.w);
    public static final ghz aO = gia.b("template_glass_pane_noside_alt", "_noside_alt", gic.w);
    public static final ghz aP = gia.b("template_glass_pane_post", "_post", gic.w, gic.x);
    public static final ghz aQ = gia.b("template_glass_pane_side", "_side", gic.w, gic.x);
    public static final ghz aR = gia.b("template_glass_pane_side_alt", "_side_alt", gic.w, gic.x);
    public static final ghz aS = gia.a("template_command_block", gic.g, gic.h, gic.i);
    public static final ghz aT = gia.b("template_chiseled_bookshelf_slot_top_left", "_slot_top_left", gic.b);
    public static final ghz aU = gia.b("template_chiseled_bookshelf_slot_top_mid", "_slot_top_mid", gic.b);
    public static final ghz aV = gia.b("template_chiseled_bookshelf_slot_top_right", "_slot_top_right", gic.b);
    public static final ghz aW = gia.b("template_chiseled_bookshelf_slot_bottom_left", "_slot_bottom_left", gic.b);
    public static final ghz aX = gia.b("template_chiseled_bookshelf_slot_bottom_mid", "_slot_bottom_mid", gic.b);
    public static final ghz aY = gia.b("template_chiseled_bookshelf_slot_bottom_right", "_slot_bottom_right", gic.b);
    public static final ghz aZ = gia.a("template_shelf_body", gic.a, gic.c);
    public static final ghz ba = gia.b("template_shelf_inventory", "_inventory", gic.a, gic.c);
    public static final ghz bb = gia.b("template_shelf_unpowered", "_unpowered", gic.a, gic.c);
    public static final ghz bc = gia.b("template_shelf_unconnected", "_unconnected", gic.a, gic.c);
    public static final ghz bd = gia.b("template_shelf_left", "_left", gic.a, gic.c);
    public static final ghz be = gia.b("template_shelf_center", "_center", gic.a, gic.c);
    public static final ghz bf = gia.b("template_shelf_right", "_right", gic.a, gic.c);
    public static final ghz bg = gia.a("template_anvil", gic.f);
    public static final ghz[] bh = (ghz[])IntStream.range(0, 8).mapToObj($$0 -> gia.b("stem_growth" + $$0, "_stage" + $$0, gic.z)).toArray(ghz[]::new);
    public static final ghz bi = gia.a("stem_fruit", gic.z, gic.A);
    public static final ghz bj = gia.a("crop", gic.B);
    public static final ghz bk = gia.a("template_farmland", gic.C, gic.f);
    public static final ghz bl = gia.a("template_fire_floor", gic.D);
    public static final ghz bm = gia.a("template_fire_side", gic.D);
    public static final ghz bn = gia.a("template_fire_side_alt", gic.D);
    public static final ghz bo = gia.a("template_fire_up", gic.D);
    public static final ghz bp = gia.a("template_fire_up_alt", gic.D);
    public static final ghz bq = gia.a("template_campfire", gic.D, gic.L);
    public static final ghz br = gia.a("template_lantern", gic.E);
    public static final ghz bs = gia.b("template_hanging_lantern", "_hanging", gic.E);
    public static final ghz bt = gia.a("template_chain", gic.b);
    public static final ghz bu = gia.b("template_bars_cap", "_cap", gic.S, gic.x);
    public static final ghz bv = gia.b("template_bars_cap_alt", "_cap_alt", gic.S, gic.x);
    public static final ghz bw = gia.b("template_bars_post", "_post", gic.S, gic.x);
    public static final ghz bx = gia.b("template_bars_post_ends", "_post_ends", gic.S, gic.x);
    public static final ghz by = gia.b("template_bars_side", "_side", gic.S, gic.x);
    public static final ghz bz = gia.b("template_bars_side_alt", "_side_alt", gic.S, gic.x);
    public static final ghz bA = gia.a("template_torch", gic.H);
    public static final ghz bB = gia.a("template_torch_unlit", gic.H);
    public static final ghz bC = gia.a("template_torch_wall", gic.H);
    public static final ghz bD = gia.a("template_torch_wall_unlit", gic.H);
    public static final ghz bE = gia.a("template_redstone_torch", gic.H);
    public static final ghz bF = gia.a("template_redstone_torch_wall", gic.H);
    public static final ghz bG = gia.a("template_piston", gic.F, gic.e, gic.i);
    public static final ghz bH = gia.a("template_piston_head", gic.F, gic.i, gic.G);
    public static final ghz bI = gia.a("template_piston_head_short", gic.F, gic.i, gic.G);
    public static final ghz bJ = gia.a("template_seagrass", gic.b);
    public static final ghz bK = gia.a("template_turtle_egg", gic.a);
    public static final ghz bL = gia.a("dried_ghast", gic.c, gic.f, gic.e, gic.j, gic.k, gic.l, gic.m, gic.R);
    public static final ghz bM = gia.a("template_two_turtle_eggs", gic.a);
    public static final ghz bN = gia.a("template_three_turtle_eggs", gic.a);
    public static final ghz bO = gia.a("template_four_turtle_eggs", gic.a);
    public static final ghz bP = gia.a("template_single_face", gic.b);
    public static final ghz bQ = gia.a("template_cauldron_level1", gic.O, gic.N, gic.c, gic.f, gic.e, gic.i);
    public static final ghz bR = gia.a("template_cauldron_level2", gic.O, gic.N, gic.c, gic.f, gic.e, gic.i);
    public static final ghz bS = gia.a("template_cauldron_full", gic.O, gic.N, gic.c, gic.f, gic.e, gic.i);
    public static final ghz bT = gia.a("template_azalea", gic.f, gic.i);
    public static final ghz bU = gia.a("template_potted_azalea_bush", gic.r, gic.f, gic.i);
    public static final ghz bV = gia.a("template_potted_azalea_bush", gic.r, gic.f, gic.i);
    public static final ghz bW = gia.a("sniffer_egg", gic.f, gic.e, gic.j, gic.k, gic.l, gic.m);
    public static final ghz bX = gia.b("generated", gic.I);
    public static final ghz bY = gia.b("template_music_disc", gic.I);
    public static final ghz bZ = gia.b("handheld", gic.I);
    public static final ghz ca = gia.b("handheld_rod", gic.I);
    public static final ghz cb = gia.b("generated", gic.I, gic.J);
    public static final ghz cc = gia.b("generated", gic.I, gic.J, gic.K);
    public static final ghz cd = gia.b("template_shulker_box", gic.c);
    public static final ghz ce = gia.b("template_bed", gic.c);
    public static final ghz cf = gia.b("template_chest", gic.c);
    public static final ghz cg = gia.a("template_bundle_open_front", "_open_front", gic.I);
    public static final ghz ch = gia.a("template_bundle_open_back", "_open_back", gic.I);
    public static final ghz ci = gia.b("bow", gic.I);
    public static final ghz cj = gia.b("crossbow", gic.I);
    public static final ghz ck = gia.a("spear_in_hand", "_in_hand", gic.I);
    public static final ghz cl = gia.a("template_candle", gic.a, gic.c);
    public static final ghz cm = gia.a("template_two_candles", gic.a, gic.c);
    public static final ghz cn = gia.a("template_three_candles", gic.a, gic.c);
    public static final ghz co = gia.a("template_four_candles", gic.a, gic.c);
    public static final ghz cp = gia.a("template_cake_with_candle", gic.M, gic.e, gic.i, gic.f, gic.c);
    public static final ghz cq = gia.a("template_sculk_shrieker", gic.e, gic.i, gic.f, gic.c, gic.P);
    public static final ghz cr = gia.a("template_vault", gic.f, gic.e, gic.i, gic.g);
    public static final ghz cs = gia.b("handheld_mace", gic.I);
    public static final ghz ct = gia.a("template_lightning_rod", gic.b);

    private static ghz a(gic ... $$0) {
        return new ghz(Optional.empty(), Optional.empty(), $$0);
    }

    private static ghz a(String $$0, gic ... $$1) {
        return new ghz(Optional.of(amo.b("block/" + $$0)), Optional.empty(), $$1);
    }

    private static ghz b(String $$0, gic ... $$1) {
        return new ghz(Optional.of(amo.b("item/" + $$0)), Optional.empty(), $$1);
    }

    private static ghz a(String $$0, String $$1, gic ... $$2) {
        return new ghz(Optional.of(amo.b("item/" + $$0)), Optional.of($$1), $$2);
    }

    private static ghz b(String $$0, String $$1, gic ... $$2) {
        return new ghz(Optional.of(amo.b("block/" + $$0)), Optional.of($$1), $$2);
    }
}

