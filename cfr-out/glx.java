/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.HashMap;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class glx {
    private static final Map<amo, gly> O = new HashMap<amo, gly>();
    public static final amo a = glx.a("game_version", (gly)new glv());
    public static final amo b = glx.a("fps", (gly)new glc());
    public static final amo c = glx.a("tps", (gly)new glu());
    public static final amo d = glx.a("memory", (gly)new glk());
    public static final amo e = glx.a("system_specs", (gly)new glt());
    public static final amo f = glx.a("looking_at_block", (gly)new glh());
    public static final amo g = glx.a("looking_at_fluid", (gly)new glj());
    public static final amo h = glx.a("looking_at_entity", (gly)new gli());
    public static final amo i = glx.a("chunk_render_stats", (gly)new gkz());
    public static final amo j = glx.a("chunk_generation_stats", (gly)new gky());
    public static final amo k = glx.a("entity_render_stats", (gly)new glb());
    public static final amo l = glx.a("particle_render_stats", (gly)new glm());
    public static final amo m = glx.a("chunk_source_stats", (gly)new gla());
    public static final amo n = glx.a("player_position", (gly)new gln());
    public static final amo o = glx.a("player_section_position", (gly)new glp());
    public static final amo p = glx.a("light_levels", (gly)new glf());
    public static final amo q = glx.a("heightmap", (gly)new gle());
    public static final amo r = glx.a("biome", (gly)new gkw());
    public static final amo s = glx.a("local_difficulty", (gly)new glg());
    public static final amo t = glx.a("entity_spawn_counts", (gly)new gls());
    public static final amo u = glx.a("sound_mood", (gly)new glr());
    public static final amo v = glx.a("post_effect", (gly)new glo());
    public static final amo w = glx.a("entity_hitboxes", (gly)new gll());
    public static final amo x = glx.a("chunk_borders", (gly)new gll());
    public static final amo y = glx.a("3d_crosshair", (gly)new gll());
    public static final amo z = glx.a("chunk_section_paths", (gly)new gll());
    public static final amo A = glx.a("gpu_utilization", (gly)new gld());
    public static final amo B = glx.a("simple_performance_impactors", (gly)new glq());
    public static final amo C = glx.a("chunk_section_octree", (gly)new gll());
    public static final amo D = glx.a("visualize_water_levels", (gly)new gll());
    public static final amo E = glx.a("visualize_heightmap", (gly)new gll());
    public static final amo F = glx.a("visualize_collision_boxes", (gly)new gll());
    public static final amo G = glx.a("visualize_entity_supporting_blocks", (gly)new gll());
    public static final amo H = glx.a("visualize_block_light_levels", (gly)new gll());
    public static final amo I = glx.a("visualize_sky_light_levels", (gly)new gll());
    public static final amo J = glx.a("visualize_solid_faces", (gly)new gll());
    public static final amo K = glx.a("visualize_chunks_on_server", (gly)new gll());
    public static final amo L = glx.a("visualize_sky_light_sections", (gly)new gll());
    public static final amo M = glx.a("chunk_section_visibility", (gly)new gll());
    public static final Map<gmb, Map<amo, gma>> N;

    private static amo a(String $$0, gly $$1) {
        return glx.a(amo.b($$0), $$1);
    }

    private static amo a(amo $$0, gly $$1) {
        O.put($$0, $$1);
        return $$0;
    }

    public static Map<amo, gly> a() {
        return Map.copyOf(O);
    }

    public static @Nullable gly a(amo $$0) {
        return O.get($$0);
    }

    static {
        Map<amo, gma> $$0 = Map.of(y, gma.b, a, gma.b, c, gma.b, b, gma.b, d, gma.b, e, gma.b, n, gma.b, o, gma.b, B, gma.b);
        Map<amo, gma> $$1 = Map.of(c, gma.b, b, gma.a, A, gma.b, d, gma.b, B, gma.b);
        N = Map.of(gmb.a, $$0, gmb.b, $$1);
    }
}

