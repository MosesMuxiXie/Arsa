/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  io.netty.util.ResourceLeakDetector
 *  io.netty.util.ResourceLeakDetector$Level
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import io.netty.util.ResourceLeakDetector;
import java.time.Duration;
import org.jspecify.annotations.Nullable;

@x(a="System.out needed before bootstrap")
public class w {
    @Deprecated
    public static final boolean a = false;
    @Deprecated
    public static final int b = 4671;
    @Deprecated
    public static final String c = "main";
    @Deprecated
    public static final int d = 774;
    @Deprecated
    public static final int e = 286;
    public static final int f = 4650;
    private static final int bq = 30;
    public static final boolean g = false;
    @Deprecated
    public static final int h = 75;
    @Deprecated
    public static final int i = 0;
    @Deprecated
    public static final int j = 94;
    @Deprecated
    public static final int k = 1;
    public static final String l = "2.0.0";
    @Deprecated
    public static final int m = 1;
    public static final int n = 1;
    public static final String o = "DataVersion";
    public static final String p = "MC_DEBUG_";
    public static final boolean q = w.b(w.a("ENABLED"));
    private static final boolean br = w.b(w.a("PRINT_PROPERTIES"));
    public static final boolean r = false;
    public static final boolean s = false;
    public static final boolean t = w.c("OPEN_INCOMPATIBLE_WORLDS");
    public static final boolean u = w.c("ALLOW_LOW_SIM_DISTANCE");
    public static final boolean v = w.c("HOTKEYS");
    public static final boolean w = w.c("UI_NARRATION");
    public static final boolean x = w.c("SHUFFLE_UI_RENDERING_ORDER");
    public static final boolean y = w.c("SHUFFLE_MODELS");
    public static final boolean z = w.c("RENDER_UI_LAYERING_RECTANGLES");
    public static final boolean A = w.c("PATHFINDING");
    public static final boolean B = w.c("SHOW_LOCAL_SERVER_ENTITY_HIT_BOXES");
    public static final boolean C = w.c("SHAPES");
    public static final boolean D = w.c("NEIGHBORSUPDATE");
    public static final boolean E = w.c("EXPERIMENTAL_REDSTONEWIRE_UPDATE_ORDER");
    public static final boolean F = w.c("STRUCTURES");
    public static final boolean G = w.c("GAME_EVENT_LISTENERS");
    public static final boolean H = w.c("DUMP_TEXTURE_ATLAS");
    public static final boolean I = w.c("DUMP_INTERPOLATED_TEXTURE_FRAMES");
    public static final boolean J = w.c("STRUCTURE_EDIT_MODE");
    public static final boolean K = w.c("SAVE_STRUCTURES_AS_SNBT");
    public static final boolean L = w.c("SYNCHRONOUS_GL_LOGS");
    public static final boolean M = w.c("VERBOSE_SERVER_EVENTS");
    public static final boolean N = w.c("NAMED_RUNNABLES");
    public static final boolean O = w.c("GOAL_SELECTOR");
    public static final boolean P = w.c("VILLAGE_SECTIONS");
    public static final boolean Q = w.c("BRAIN");
    public static final boolean R = w.c("POI");
    public static final boolean S = w.c("BEES");
    public static final boolean T = w.c("RAIDS");
    public static final boolean U = w.c("BLOCK_BREAK");
    public static final boolean V = w.c("MONITOR_TICK_TIMES");
    public static final boolean W = w.c("KEEP_JIGSAW_BLOCKS_DURING_STRUCTURE_GEN");
    public static final boolean X = w.c("DONT_SAVE_WORLD");
    public static final boolean Y = w.c("LARGE_DRIPSTONE");
    public static final boolean Z = w.c("CARVERS");
    public static final boolean aa = w.c("ORE_VEINS");
    public static final boolean ab = w.c("SCULK_CATALYST");
    public static final boolean ac = w.c("BYPASS_REALMS_VERSION_CHECK");
    public static final boolean ad = w.c("SOCIAL_INTERACTIONS");
    public static final boolean ae = w.c("VALIDATE_RESOURCE_PATH_CASE");
    public static final boolean af = w.c("UNLOCK_ALL_TRADES");
    public static final boolean ag = w.c("BREEZE_MOB");
    public static final boolean ah = w.c("TRIAL_SPAWNER_DETECTS_SHEEP_AS_PLAYERS");
    public static final boolean ai = w.c("VAULT_DETECTS_SHEEP_AS_PLAYERS");
    public static final boolean aj = w.c("FORCE_ONBOARDING_SCREEN");
    public static final boolean ak = w.c("CURSOR_POS");
    public static final boolean al = w.c("DEFAULT_SKIN_OVERRIDE");
    public static final boolean am = w.c("PANORAMA_SCREENSHOT");
    public static final boolean an = w.c("CHASE_COMMAND");
    public static final boolean ao = w.c("VERBOSE_COMMAND_ERRORS");
    public static final boolean ap = w.c("DEV_COMMANDS");
    public static final boolean aq = w.c("ACTIVE_TEXT_AREAS");
    public static final boolean ar = w.c("IGNORE_LOCAL_MOB_CAP");
    public static final boolean as = w.c("DISABLE_LIQUID_SPREADING");
    public static final boolean at = w.c("AQUIFERS");
    public static final boolean au = w.c("JFR_PROFILING_ENABLE_LEVEL_LOADING");
    public static final boolean av = w.c("ENTITY_BLOCK_INTERSECTION");
    public static boolean aw = w.c("GENERATE_SQUARE_TERRAIN_WITHOUT_NOISE");
    public static final boolean ax = w.c("ONLY_GENERATE_HALF_THE_WORLD");
    public static final boolean ay = w.c("DISABLE_FLUID_GENERATION");
    public static final boolean az = w.c("DISABLE_AQUIFERS");
    public static final boolean aA = w.c("DISABLE_SURFACE");
    public static final boolean aB = w.c("DISABLE_CARVERS");
    public static final boolean aC = w.c("DISABLE_STRUCTURES");
    public static final boolean aD = w.c("DISABLE_FEATURES");
    public static final boolean aE = w.c("DISABLE_ORE_VEINS");
    public static final boolean aF = w.c("DISABLE_BLENDING");
    public static final boolean aG = w.c("DISABLE_BELOW_ZERO_RETROGENERATION");
    public static final int aH = 25565;
    public static final boolean aI = w.c("SUBTITLES");
    public static final int aJ = w.d("FAKE_LATENCY_MS");
    public static final int aK = w.d("FAKE_JITTER_MS");
    public static final ResourceLeakDetector.Level aL = ResourceLeakDetector.Level.DISABLED;
    public static final boolean aM = w.c("COMMAND_STACK_TRACES");
    public static final boolean aN = w.c("WORLD_RECREATE");
    public static final boolean aO = w.c("SHOW_SERVER_DEBUG_VALUES");
    public static final boolean aP = w.c("FEATURE_COUNT");
    public static final boolean aQ = w.c("FORCE_TELEMETRY");
    public static final boolean aR = w.c("DONT_SEND_TELEMETRY_TO_BACKEND");
    public static final long aS = Duration.ofMillis(300L).toNanos();
    public static final float aT = 3600000.0f;
    public static final boolean aU = false;
    public static final boolean aV = false;
    public static boolean aW = true;
    public static boolean aX;
    public static final int aY = 16;
    public static final int aZ = 256;
    public static final int ba = 32500;
    public static final int bb = 2000000;
    public static final int bc = 16;
    public static final int bd = 1000000;
    public static final int be = 32;
    public static final int bf = 128;
    public static final char[] bg;
    public static final int bh = 20;
    public static final int bi = 50;
    public static final int bj = 1200;
    public static final int bk = 24000;
    public static final int bl = 3;
    public static final float bm = 1365.3334f;
    public static final float bn = 0.87890625f;
    public static final float bo = 17.578125f;
    public static final int bp = 64;
    private static @Nullable aa bs;

    private static String a(String $$0) {
        return p + $$0;
    }

    private static boolean b(String $$0) {
        String $$1 = System.getProperty($$0);
        return $$1 != null && ($$1.isEmpty() || Boolean.parseBoolean($$1));
    }

    private static boolean c(String $$0) {
        if (!q) {
            return false;
        }
        String $$1 = w.a($$0);
        if (br) {
            System.out.println("Debug property available: " + $$1 + ": bool");
        }
        return w.b($$1);
    }

    private static int d(String $$0) {
        if (!q) {
            return 0;
        }
        String $$1 = w.a($$0);
        if (br) {
            System.out.println("Debug property available: " + $$1 + ": int");
        }
        return Integer.parseInt(System.getProperty($$1, "0"));
    }

    public static void a(aa $$0) {
        if (bs == null) {
            bs = $$0;
        } else if ($$0 != bs) {
            throw new IllegalStateException("Cannot override the current game version!");
        }
    }

    public static void a() {
        if (bs == null) {
            bs = r.a();
        }
    }

    public static aa b() {
        if (bs == null) {
            throw new IllegalStateException("Game version not set");
        }
        return bs;
    }

    public static int c() {
        return 774;
    }

    public static boolean a(dvu $$0) {
        int $$1 = $$0.e();
        int $$2 = $$0.f();
        if (ax) {
            return $$2 < 0;
        }
        if (aw) {
            return $$1 > 8192 || $$1 < 0 || $$2 > 1024 || $$2 < 0;
        }
        return false;
    }

    static {
        bg = new char[]{'/', '\n', '\r', '\t', '\u0000', '\f', '`', '?', '*', '\\', '<', '>', '|', '\"', ':'};
        ResourceLeakDetector.setLevel((ResourceLeakDetector.Level)aL);
        CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES = aM;
        CommandSyntaxException.BUILT_IN_EXCEPTIONS = new dx();
    }
}

