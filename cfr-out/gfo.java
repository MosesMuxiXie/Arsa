/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.google.common.base.Splitter
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.google.common.io.Files
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 *  com.google.gson.reflect.TypeToken
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.base.MoreObjects;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class gfo {
    static final Logger aC = LogUtils.getLogger();
    static final Gson aD = new Gson();
    private static final TypeToken<List<String>> aE = new TypeToken<List<String>>(){};
    public static final int a = 4;
    public static final int b = 12;
    public static final int c = 16;
    public static final int d = 32;
    private static final Splitter aF = Splitter.on((char)':').limit(2);
    public static final String e = "";
    private static final yh aG = yh.c("options.darkMojangStudiosBackgroundColor.tooltip");
    private final gfn<Boolean> aH = gfn.a("options.darkMojangStudiosBackgroundColor", gfn.a(aG), false);
    private static final yh aI = yh.c("options.hideLightningFlashes.tooltip");
    private final gfn<Boolean> aJ = gfn.a("options.hideLightningFlashes", gfn.a(aI), false);
    private static final yh aK = yh.c("options.hideSplashTexts.tooltip");
    private final gfn<Boolean> aL = gfn.a("options.hideSplashTexts", gfn.a(aK), false);
    private final gfn<Double> aM = new gfn<Double>("options.sensitivity", gfn.a(), ($$0, $$1) -> {
        if ($$1 == 0.0) {
            return gfo.a($$0, yh.c("options.sensitivity.min"));
        }
        if ($$1 == 1.0) {
            return gfo.a($$0, yh.c("options.sensitivity.max"));
        }
        return gfo.a($$0, 2.0 * $$1);
    }, gfn.n.a, 0.5, $$0 -> {});
    private final gfn<Integer> aN;
    private final gfn<Integer> aO;
    private int aP = 0;
    private final gfn<Double> aQ = new gfn<Double>("options.entityDistanceScaling", gfn.a(), gfo::a, new gfn.f(2, 20).a($$0 -> (double)$$0 / 4.0, $$0 -> (int)($$0 * 4.0), true), Codec.doubleRange((double)0.5, (double)5.0), 1.0, $$0 -> this.bb());
    public static final int f = 260;
    private final gfn<Integer> aR = new gfn<Integer>("options.framerateLimit", gfn.a(), ($$0, $$1) -> {
        if ($$1 == 260) {
            return gfo.a($$0, yh.c("options.framerateLimit.max"));
        }
        return gfo.a($$0, yh.a("options.framerate", $$1));
    }, new gfn.f(1, 26).a($$0 -> $$0 * 10, $$0 -> $$0 / 10, true), Codec.intRange((int)10, (int)260), 120, $$0 -> gfj.V().aS().a((int)$$0));
    private boolean aS;
    private final gfn<gfb> aT = new gfn<gfb>("options.graphics.preset", gfn.a(yh.c("options.graphics.preset.tooltip")), ($$0, $$1) -> gfo.a($$0, yh.c($$1.a())), new gfn.j<gfb>(List.of(gfb.values()), gfb.e), gfb.e, gfb.b, this::a);
    private static final yh aU = yh.c("options.inactivityFpsLimit.minimized.tooltip");
    private static final yh aV = yh.c("options.inactivityFpsLimit.afk.tooltip");
    private final gfn<gff> aW = new gfn<gff>("options.inactivityFpsLimit", $$0 -> switch ($$0) {
        default -> throw new MatchException(null, null);
        case gff.a -> gks.a(aU);
        case gff.b -> gks.a(aV);
    }, ($$0, $$1) -> $$1.a(), new gfn.e<gff>(Arrays.asList(gff.values()), gff.c), gff.b, $$0 -> {});
    private final gfn<gev> aX = new gfn<gev>("options.renderClouds", gfn.a(), ($$0, $$1) -> $$1.a(), new gfn.e<gev>(Arrays.asList(gev.values()), Codec.withAlternative(gev.d, (Codec)Codec.BOOL, $$0 -> $$0 != false ? gev.c : gev.a)), gev.c, $$0 -> this.bb());
    private final gfn<Integer> aY = new gfn<Integer>("options.renderCloudsDistance", gfn.a(), ($$0, $$1) -> gfo.a($$0, yh.a("options.chunks", $$1)), new gfn.f(2, 128, true), 128, $$02 -> {
        gfo.a((hoh $$0) -> $$0.z().a());
        this.bb();
    });
    private static final yh aZ = yh.c("options.weatherRadius.tooltip");
    private final gfn<Integer> ba = new gfn<Integer>("options.weatherRadius", gfn.a(aZ), ($$0, $$1) -> gfo.a($$0, yh.a("options.blocks", $$1)), new gfn.f(3, 10, true), 10, $$0 -> this.bb());
    private static final yh bb = yh.c("options.cutoutLeaves.tooltip");
    private final gfn<Boolean> bc = gfn.a("options.cutoutLeaves", gfn.a(bb), true, $$0 -> {
        gfo.a(hoh::d);
        this.bb();
    });
    private static final yh bd = yh.c("options.vignette.tooltip");
    private final gfn<Boolean> be = gfn.a("options.vignette", gfn.a(bd), true);
    private static final yh bf = yh.c("options.improvedTransparency.tooltip");
    private final gfn<Boolean> bg = gfn.a("options.improvedTransparency", gfn.a(bf), false, $$0 -> {
        gfj $$1 = gfj.V();
        hod $$2 = $$1.ao();
        if ($$0.booleanValue() && $$2.b()) {
            $$2.c();
            return;
        }
        gfo.a(hoh::d);
        this.bb();
    });
    private final gfn<Boolean> bh = gfn.a("options.ao", true, $$0 -> {
        gfo.a(hoh::d);
        this.bb();
    });
    private static final yh bi = yh.c("options.chunkFade.tooltip");
    private final gfn<Double> bj = new gfn<Double>("options.chunkFade", gfn.a(bi), ($$0, $$1) -> {
        if ($$1 <= 0.0) {
            return yh.c("options.chunkFade.none");
        }
        return yh.a("options.chunkFade.seconds", new Object[]{String.format(Locale.ROOT, "%.2f", $$1)});
    }, new gfn.f(0, 40).a($$0 -> (double)$$0 / 20.0, $$0 -> (int)($$0 * 20.0), true), Codec.doubleRange((double)0.0, (double)2.0), 0.75, $$0 -> {});
    private static final yh bk = yh.c("options.prioritizeChunkUpdates.none.tooltip");
    private static final yh bl = yh.c("options.prioritizeChunkUpdates.byPlayer.tooltip");
    private static final yh bm = yh.c("options.prioritizeChunkUpdates.nearby.tooltip");
    private final gfn<gfq> bn = new gfn<gfq>("options.prioritizeChunkUpdates", $$0 -> switch ($$0) {
        default -> throw new MatchException(null, null);
        case gfq.a -> gks.a(bk);
        case gfq.b -> gks.a(bl);
        case gfq.c -> gks.a(bm);
    }, ($$0, $$1) -> $$1.a(), new gfn.e<gfq>(Arrays.asList(gfq.values()), gfq.d), gfq.a, $$0 -> this.bb());
    public List<String> g = Lists.newArrayList();
    public List<String> h = Lists.newArrayList();
    private final gfn<ddj> bo = new gfn<ddj>("options.chat.visibility", gfn.a(), ($$0, $$1) -> $$1.a(), new gfn.e<ddj>(Arrays.asList(ddj.values()), ddj.d), ddj.a, $$0 -> {});
    private final gfn<Double> bp = new gfn<Double>("options.chat.opacity", gfn.a(), ($$0, $$1) -> gfo.a($$0, $$1 * 0.9 + 0.1), gfn.n.a, 1.0, $$0 -> gfj.V().j.e().b());
    private final gfn<Double> bq = new gfn<Double>("options.chat.line_spacing", gfn.a(), gfo::a, gfn.n.a, 0.0, $$0 -> {});
    private static final yh br = yh.c("options.accessibility.menu_background_blurriness.tooltip");
    private static final int bs = 5;
    private final gfn<Integer> bt = new gfn<Integer>("options.accessibility.menu_background_blurriness", gfn.a(br), gfo::b, new gfn.f(0, 10), 5, $$0 -> this.bb());
    private final gfn<Double> bu = new gfn<Double>("options.accessibility.text_background_opacity", gfn.a(), gfo::a, gfn.n.a, 0.5, $$0 -> gfj.V().j.e().b());
    private final gfn<Double> bv = new gfn<Double>("options.accessibility.panorama_speed", gfn.a(), gfo::a, gfn.n.a, 1.0, $$0 -> {});
    private static final yh bw = yh.c("options.accessibility.high_contrast.tooltip");
    private final gfn<Boolean> bx = gfn.a("options.accessibility.high_contrast", gfn.a(bw), false, $$0 -> {
        bak $$1 = gfj.V().ai();
        boolean $$2 = $$1.e().contains("high_contrast");
        if (!$$2 && $$0.booleanValue()) {
            if ($$1.a("high_contrast")) {
                this.a($$1);
            }
        } else if ($$2 && !$$0.booleanValue() && $$1.b("high_contrast")) {
            this.a($$1);
        }
    });
    private static final yh by = yh.c("options.accessibility.high_contrast_block_outline.tooltip");
    private final gfn<Boolean> bz = gfn.a("options.accessibility.high_contrast_block_outline", gfn.a(by), false);
    private final gfn<Boolean> bA = gfn.a("options.accessibility.narrator_hotkey", gfn.a(gyz.a ? yh.c("options.accessibility.narrator_hotkey.mac.tooltip") : yh.c("options.accessibility.narrator_hotkey.tooltip")), true);
    public @Nullable String i;
    public boolean j;
    public boolean k;
    public boolean l = true;
    private final Set<ddo> bB = EnumSet.allOf(ddo.class);
    private final gfn<chb> bC = new gfn<chb>("options.mainHand", gfn.a(), ($$0, $$1) -> $$1.b(), new gfn.e<chb>(Arrays.asList(chb.values()), chb.c), chb.b, $$0 -> {});
    public int m;
    public int n;
    private final gfn<Double> bD = new gfn<Double>("options.chat.scale", gfn.a(), ($$0, $$1) -> {
        if ($$1 == 0.0) {
            return yg.a($$0, false);
        }
        return gfo.a($$0, (double)$$1);
    }, gfn.n.a, 1.0, $$0 -> gfj.V().j.e().b());
    private final gfn<Double> bE = new gfn<Double>("options.chat.width", gfn.a(), ($$0, $$1) -> gfo.c($$0, gjf.a($$1)), gfn.n.a, 1.0, $$0 -> gfj.V().j.e().b());
    private final gfn<Double> bF = new gfn<Double>("options.chat.height.unfocused", gfn.a(), ($$0, $$1) -> gfo.c($$0, gjf.b($$1)), gfn.n.a, gjf.f(), $$0 -> gfj.V().j.e().b());
    private final gfn<Double> bG = new gfn<Double>("options.chat.height.focused", gfn.a(), ($$0, $$1) -> gfo.c($$0, gjf.b($$1)), gfn.n.a, 1.0, $$0 -> gfj.V().j.e().b());
    private final gfn<Double> bH = new gfn<Double>("options.chat.delay_instant", gfn.a(), ($$0, $$1) -> {
        if ($$1 <= 0.0) {
            return yh.c("options.chat.delay_none");
        }
        return yh.a("options.chat.delay", new Object[]{String.format(Locale.ROOT, "%.1f", $$1)});
    }, new gfn.f(0, 60).a($$0 -> (double)$$0 / 10.0, $$0 -> (int)($$0 * 10.0), true), Codec.doubleRange((double)0.0, (double)6.0), 0.0, $$0 -> gfj.V().ba().a((double)$$0));
    private static final yh bI = yh.c("options.notifications.display_time.tooltip");
    private final gfn<Double> bJ = new gfn<Double>("options.notifications.display_time", gfn.a(bI), ($$0, $$1) -> gfo.a($$0, yh.a("options.multiplier", $$1)), new gfn.f(5, 100).a($$0 -> (double)$$0 / 10.0, $$0 -> (int)($$0 * 10.0), true), Codec.doubleRange((double)0.5, (double)10.0), 1.0, $$0 -> {});
    private final gfn<Integer> bK = new gfn<Integer>("options.mipmapLevels", gfn.a(), ($$0, $$1) -> {
        if ($$1 == 0) {
            return yg.a($$0, false);
        }
        return gfo.a($$0, (int)$$1);
    }, new gfn.f(0, 4), 4, $$0 -> this.bb());
    private static final yh bL = yh.c("options.maxAnisotropy.tooltip");
    private final gfn<Integer> bM = new gfn<Integer>("options.maxAnisotropy", gfn.a(bL), ($$0, $$1) -> {
        if ($$1 == 0) {
            return yg.a($$0, false);
        }
        return gfo.a($$0, yh.a("options.multiplier", new Object[]{Integer.toString(1 << $$1)}));
    }, new gfn.f(1, 3), 2, $$0 -> {
        this.bb();
        gfo.a(hoh::j);
    });
    private static final yh bN = yh.c("options.textureFiltering.none.tooltip");
    private static final yh bO = yh.c("options.textureFiltering.rgss.tooltip");
    private static final yh bP = yh.c("options.textureFiltering.anisotropic.tooltip");
    private final gfn<gfv> bQ = new gfn<gfv>("options.textureFiltering", $$0 -> switch ($$0) {
        default -> throw new MatchException(null, null);
        case gfv.a -> gks.a(bN);
        case gfv.b -> gks.a(bO);
        case gfv.c -> gks.a(bP);
    }, ($$0, $$1) -> $$1.a(), new gfn.e<gfv>(Arrays.asList(gfv.values()), gfv.d), gfv.a, $$0 -> {
        this.bb();
        gfo.a(hoh::j);
    });
    private boolean bR = true;
    private final gfn<geq> bS = new gfn<geq>("options.attackIndicator", gfn.a(), ($$0, $$1) -> $$1.a(), new gfn.e<geq>(Arrays.asList(geq.values()), geq.d), geq.b, $$0 -> {});
    public irw o = irw.a;
    public boolean p = false;
    private final gfn<Integer> bT = new gfn<Integer>("options.biomeBlendRadius", gfn.a(), ($$0, $$1) -> {
        int $$2 = $$1 * 2 + 1;
        return gfo.a($$0, yh.c("options.biomeBlendRadius." + $$2));
    }, new gfn.f(0, 7, false), 2, $$0 -> {
        gfo.a(hoh::d);
        this.bb();
    });
    private final gfn<Double> bU = new gfn<Double>("options.mouseWheelSensitivity", gfn.a(), ($$0, $$1) -> gfo.a($$0, yh.b(String.format(Locale.ROOT, "%.2f", $$1))), new gfn.f(-200, 100).a(gfo::c, gfo::a, false), Codec.doubleRange((double)gfo.c(-200), (double)gfo.c(100)), gfo.c(0), $$0 -> {});
    private final gfn<Boolean> bV = gfn.a("options.rawMouseInput", true, $$0 -> {
        fyk $$1 = gfj.V().aR();
        if ($$1 != null) {
            $$1.b((boolean)$$0);
        }
    });
    private static final yh bW = yh.c("options.allowCursorChanges.tooltip");
    private final gfn<Boolean> bX = gfn.a("options.allowCursorChanges", gfn.a(bW), true, $$0 -> {
        fyk $$1 = gfj.V().aR();
        if ($$1 != null) {
            $$1.c((boolean)$$0);
        }
    });
    public int q = 1;
    private final gfn<Boolean> bY = gfn.a("options.autoJump", false);
    private static final yh bZ = yh.c("options.rotateWithMinecart.tooltip");
    private final gfn<Boolean> ca = gfn.a("options.rotateWithMinecart", gfn.a(bZ), false);
    private final gfn<Boolean> cb = gfn.a("options.operatorItemsTab", false);
    private final gfn<Boolean> cc = gfn.a("options.autoSuggestCommands", true);
    private final gfn<Boolean> cd = gfn.a("options.chat.color", true);
    private final gfn<Boolean> ce = gfn.a("options.chat.links", true);
    private final gfn<Boolean> cf = gfn.a("options.chat.links.prompt", true);
    private final gfn<Boolean> cg = gfn.a("options.vsync", true, $$0 -> {
        if (gfj.V().aR() != null) {
            gfj.V().aR().a((boolean)$$0);
        }
    });
    private final gfn<Boolean> ch = gfn.a("options.entityShadows", gfn.a(), true, $$0 -> this.bb());
    private final gfn<Boolean> ci = gfn.a("options.forceUnicodeFont", false, $$0 -> gfo.aZ());
    private final gfn<Boolean> cj = gfn.a("options.japaneseGlyphVariants", gfn.a(yh.c("options.japaneseGlyphVariants.tooltip")), gfo.ba(), $$0 -> gfo.aZ());
    private final gfn<Boolean> ck = gfn.a("options.invertMouseX", false);
    private final gfn<Boolean> cl = gfn.a("options.invertMouseY", false);
    private final gfn<Boolean> cm = gfn.a("options.discrete_mouse_scroll", false);
    private static final yh cn = yh.c("options.realmsNotifications.tooltip");
    private final gfn<Boolean> co = gfn.a("options.realmsNotifications", gfn.a(cn), true);
    private static final yh cp = yh.c("options.allowServerListing.tooltip");
    private final gfn<Boolean> cq = gfn.a("options.allowServerListing", gfn.a(cp), true, $$0 -> {});
    private final gfn<Boolean> cr = gfn.a("options.reducedDebugInfo", gfn.a(), false, $$0 -> gfj.V().m.e());
    private final Map<bdb, gfn<Double>> cs = bhs.a(bdb.class, (K $$0) -> this.a("soundCategory." + $$0.a(), (bdb)((Object)$$0)));
    private static final yh ct = yh.c("options.showSubtitles.tooltip");
    private final gfn<Boolean> cu = gfn.a("options.showSubtitles", gfn.a(ct), false);
    private static final yh cv = yh.c("options.directionalAudio.on.tooltip");
    private static final yh cw = yh.c("options.directionalAudio.off.tooltip");
    private final gfn<Boolean> cx = gfn.a("options.directionalAudio", $$0 -> $$0 != false ? gks.a(cv) : gks.a(cw), false, $$0 -> {
        iqr $$1 = gfj.V().ap();
        $$1.i();
        $$1.a(iph.a(bda.DJ, 1.0f));
    });
    private final gfn<Boolean> cy = new gfn<Boolean>("options.accessibility.text_background", gfn.a(), ($$0, $$1) -> $$1 != false ? yh.c("options.accessibility.text_background.chat") : yh.c("options.accessibility.text_background.everywhere"), gfn.a, true, $$0 -> {});
    private final gfn<Boolean> cz = gfn.a("options.touchscreen", false);
    private final gfn<Boolean> cA = gfn.a("options.fullscreen", false, $$0 -> {
        gfj $$1 = gfj.V();
        if ($$1.aR() != null && $$1.aR().i() != $$0.booleanValue()) {
            $$1.aR().g();
            this.ao().a($$1.aR().i());
        }
    });
    private final gfn<Boolean> cB = gfn.a("options.viewBobbing", true);
    private static final yh cC = yh.c("options.key.toggle");
    private static final yh cD = yh.c("options.key.hold");
    private final gfn<Boolean> cE = new gfn<Boolean>("key.sneak", gfn.a(), ($$0, $$1) -> $$1 != false ? cC : cD, gfn.a, false, $$0 -> {});
    private final gfn<Boolean> cF = new gfn<Boolean>("key.sprint", gfn.a(), ($$0, $$1) -> $$1 != false ? cC : cD, gfn.a, false, $$0 -> {});
    private final gfn<Boolean> cG = new gfn<Boolean>("key.attack", gfn.a(), ($$0, $$1) -> $$1 != false ? cC : cD, gfn.a, false, $$0 -> {});
    private final gfn<Boolean> cH = new gfn<Boolean>("key.use", gfn.a(), ($$0, $$1) -> $$1 != false ? cC : cD, gfn.a, false, $$0 -> {});
    private static final yh cI = yh.c("options.sprintWindow.tooltip");
    private final gfn<Integer> cJ = new gfn<Integer>("options.sprintWindow", gfn.a(cI), ($$0, $$1) -> {
        if ($$1 == 0) {
            return gfo.a($$0, yh.c("options.off"));
        }
        return gfo.a($$0, yh.a("options.value", $$1));
    }, new gfn.f(0, 10), 7, $$0 -> {});
    public boolean r;
    private static final yh cK = yh.c("options.hideMatchedNames.tooltip");
    private final gfn<Boolean> cL = gfn.a("options.hideMatchedNames", gfn.a(cK), true);
    private final gfn<Boolean> cM = gfn.a("options.autosaveIndicator", true);
    private static final yh cN = yh.c("options.onlyShowSecureChat.tooltip");
    private final gfn<Boolean> cO = gfn.a("options.onlyShowSecureChat", gfn.a(cN), false);
    private static final yh cP = yh.c("options.chat.drafts.tooltip");
    private final gfn<Boolean> cQ = gfn.a("options.chat.drafts", gfn.a(cP), false);
    public final gfh s = new gfh("key.forward", 87, gfh.a.a);
    public final gfh t = new gfh("key.left", 65, gfh.a.a);
    public final gfh u = new gfh("key.back", 83, gfh.a.a);
    public final gfh v = new gfh("key.right", 68, gfh.a.a);
    public final gfh w = new gfh("key.jump", 32, gfh.a.a);
    public final gfh x = new gfw("key.sneak", 340, gfh.a.a, this.cE::b, true);
    public final gfh y = new gfw("key.sprint", 341, gfh.a.a, this.cF::b, true);
    public final gfh z = new gfh("key.inventory", 69, gfh.a.e);
    public final gfh A = new gfh("key.swapOffhand", 70, gfh.a.e);
    public final gfh B = new gfh("key.drop", 81, gfh.a.e);
    public final gfh C = new gfw("key.use", fyc.b.c, 1, gfh.a.d, this.cH::b, false);
    public final gfh D = new gfw("key.attack", fyc.b.c, 0, gfh.a.d, this.cG::b, true);
    public final gfh E = new gfh("key.pickItem", fyc.b.c, 2, gfh.a.d);
    public final gfh F = new gfh("key.chat", 84, gfh.a.c);
    public final gfh G = new gfh("key.playerlist", 258, gfh.a.c);
    public final gfh H = new gfh("key.command", 47, gfh.a.c);
    public final gfh I = new gfh("key.socialInteractions", 80, gfh.a.c);
    public final gfh J = new gfh("key.screenshot", 291, gfh.a.b);
    public final gfh K = new gfh("key.togglePerspective", 294, gfh.a.b);
    public final gfh L = new gfh("key.smoothCamera", fyc.bF.b(), gfh.a.b);
    public final gfh M = new gfh("key.fullscreen", 300, gfh.a.b);
    public final gfh N = new gfh("key.advancements", 76, gfh.a.b);
    public final gfh O = new gfh("key.quickActions", 71, gfh.a.b);
    public final gfh P = new gfh("key.toggleGui", 290, gfh.a.b);
    public final gfh Q = new gfh("key.toggleSpectatorShaderEffects", 293, gfh.a.b);
    public final gfh[] R = new gfh[]{new gfh("key.hotbar.1", 49, gfh.a.e), new gfh("key.hotbar.2", 50, gfh.a.e), new gfh("key.hotbar.3", 51, gfh.a.e), new gfh("key.hotbar.4", 52, gfh.a.e), new gfh("key.hotbar.5", 53, gfh.a.e), new gfh("key.hotbar.6", 54, gfh.a.e), new gfh("key.hotbar.7", 55, gfh.a.e), new gfh("key.hotbar.8", 56, gfh.a.e), new gfh("key.hotbar.9", 57, gfh.a.e)};
    public final gfh S = new gfh("key.saveToolbarActivator", 67, gfh.a.f);
    public final gfh T = new gfh("key.loadToolbarActivator", 88, gfh.a.f);
    public final gfh U = new gfh("key.spectatorOutlines", fyc.bF.b(), gfh.a.g);
    public final gfh V = new gfh("key.spectatorHotbar", fyc.b.c, 2, gfh.a.g);
    public final gfh W = new gfh("key.debug.overlay", fyc.b.a, 292, gfh.a.h, -2);
    public final gfh X = new gfh("key.debug.modifier", fyc.b.a, 292, gfh.a.h, -1);
    public final gfh Y = new gfh("key.debug.crash", fyc.b.a, 67, gfh.a.h);
    public final gfh Z = new gfh("key.debug.reloadChunk", fyc.b.a, 65, gfh.a.h);
    public final gfh aa = new gfh("key.debug.showHitboxes", fyc.b.a, 66, gfh.a.h);
    public final gfh ab = new gfh("key.debug.clearChat", fyc.b.a, 68, gfh.a.h);
    public final gfh ac = new gfh("key.debug.showChunkBorders", fyc.b.a, 71, gfh.a.h);
    public final gfh ad = new gfh("key.debug.showAdvancedTooltips", fyc.b.a, 72, gfh.a.h);
    public final gfh ae = new gfh("key.debug.copyRecreateCommand", fyc.b.a, 73, gfh.a.h);
    public final gfh af = new gfh("key.debug.spectate", fyc.b.a, 78, gfh.a.h);
    public final gfh ag = new gfh("key.debug.switchGameMode", fyc.b.a, 293, gfh.a.h);
    public final gfh ah = new gfh("key.debug.debugOptions", fyc.b.a, 295, gfh.a.h);
    public final gfh ai = new gfh("key.debug.focusPause", fyc.b.a, 80, gfh.a.h);
    public final gfh aj = new gfh("key.debug.dumpDynamicTextures", fyc.b.a, 83, gfh.a.h);
    public final gfh ak = new gfh("key.debug.reloadResourcePacks", fyc.b.a, 84, gfh.a.h);
    public final gfh al = new gfh("key.debug.profiling", fyc.b.a, 76, gfh.a.h);
    public final gfh am = new gfh("key.debug.copyLocation", fyc.b.a, 67, gfh.a.h);
    public final gfh an = new gfh("key.debug.dumpVersion", fyc.b.a, 86, gfh.a.h);
    public final gfh ao = new gfh("key.debug.profilingChart", fyc.b.a, 49, gfh.a.h, 1);
    public final gfh ap = new gfh("key.debug.fpsCharts", fyc.b.a, 50, gfh.a.h, 2);
    public final gfh aq = new gfh("key.debug.networkCharts", fyc.b.a, 51, gfh.a.h, 3);
    public final gfh[] ar = new gfh[]{this.Z, this.aa, this.ab, this.Y, this.ac, this.ad, this.ae, this.af, this.ag, this.ah, this.ai, this.aj, this.ak, this.al, this.am, this.an, this.ao, this.ap, this.aq};
    public final gfh[] as = (gfh[])Stream.of({this.D, this.C, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.B, this.z, this.F, this.G, this.E, this.H, this.I, this.P, this.Q, this.J, this.K, this.L, this.M, this.U, this.V, this.A, this.S, this.T, this.N, this.O, this.W, this.X}, this.R, this.ar).flatMap(Stream::of).toArray(gfh[]::new);
    protected gfj at;
    private final File cR;
    public boolean au;
    private ges cS = ges.a;
    public String av = "";
    public boolean aw;
    private final gfn<Integer> cT = new gfn<Integer>("options.fov", gfn.a(), ($$0, $$1) -> switch ($$1) {
        case 70 -> gfo.a($$0, yh.c("options.fov.min"));
        case 110 -> gfo.a($$0, yh.c("options.fov.max"));
        default -> gfo.a($$0, (int)$$1);
    }, new gfn.f(30, 110), Codec.DOUBLE.xmap($$0 -> (int)($$0 * 40.0 + 70.0), $$0 -> ((double)$$0.intValue() - 70.0) / 40.0), 70, $$0 -> gfo.a(hoh::p));
    private static final yh cU = yh.a("options.telemetry.button.tooltip", yh.c("options.telemetry.state.minimal"), yh.c("options.telemetry.state.all"));
    private final gfn<Boolean> cV = gfn.a("options.telemetry.button", gfn.a(cU), ($$0, $$1) -> {
        gfj $$2 = gfj.V();
        if (!$$2.J()) {
            return yh.c("options.telemetry.state.none");
        }
        if ($$1.booleanValue() && $$2.I()) {
            return yh.c("options.telemetry.state.all");
        }
        return yh.c("options.telemetry.state.minimal");
    }, false, $$0 -> {});
    private static final yh cW = yh.c("options.screenEffectScale.tooltip");
    private final gfn<Double> cX = new gfn<Double>("options.screenEffectScale", gfn.a(cW), gfo::b, gfn.n.a, 1.0, $$0 -> {});
    private static final yh cY = yh.c("options.fovEffectScale.tooltip");
    private final gfn<Double> cZ = new gfn<Double>("options.fovEffectScale", gfn.a(cY), gfo::b, gfn.n.a.a(bgj::n, Math::sqrt), Codec.doubleRange((double)0.0, (double)1.0), 1.0, $$0 -> {});
    private static final yh da = yh.c("options.darknessEffectScale.tooltip");
    private final gfn<Double> db = new gfn<Double>("options.darknessEffectScale", gfn.a(da), gfo::b, gfn.n.a.a(bgj::n, Math::sqrt), 1.0, $$0 -> {});
    private static final yh dc = yh.c("options.glintSpeed.tooltip");
    private final gfn<Double> dd = new gfn<Double>("options.glintSpeed", gfn.a(dc), gfo::b, gfn.n.a, 0.5, $$0 -> {});
    private static final yh de = yh.c("options.glintStrength.tooltip");
    private final gfn<Double> df = new gfn<Double>("options.glintStrength", gfn.a(de), gfo::b, gfn.n.a, 0.75, $$0 -> {});
    private static final yh dg = yh.c("options.damageTiltStrength.tooltip");
    private final gfn<Double> dh = new gfn<Double>("options.damageTiltStrength", gfn.a(dg), gfo::b, gfn.n.a, 1.0, $$0 -> {});
    private final gfn<Double> di = new gfn<Double>("options.gamma", gfn.a(), ($$0, $$1) -> {
        int $$2 = (int)($$1 * 100.0);
        if ($$2 == 0) {
            return gfo.a($$0, yh.c("options.gamma.min"));
        }
        if ($$2 == 50) {
            return gfo.a($$0, yh.c("options.gamma.default"));
        }
        if ($$2 == 100) {
            return gfo.a($$0, yh.c("options.gamma.max"));
        }
        return gfo.a($$0, $$2);
    }, gfn.n.a, 0.5, $$0 -> {});
    public static final int ax = 0;
    private static final int dj = 0x7FFFFFFE;
    private final gfn<Integer> dk = new gfn<Integer>("options.guiScale", gfn.a(), ($$0, $$1) -> $$1 == 0 ? yh.c("options.guiScale.auto") : yh.b(Integer.toString($$1)), new gfn.c(0, () -> {
        gfj $$0 = gfj.V();
        if (!$$0.v()) {
            return 0x7FFFFFFE;
        }
        return $$0.aR().a(0, $$0.o());
    }, 0x7FFFFFFE), 0, $$0 -> this.at.a());
    private final gfn<awx> dl = new gfn<awx>("options.particles", gfn.a(), ($$0, $$1) -> $$1.a(), new gfn.e<awx>(Arrays.asList(awx.values()), awx.d), awx.a, $$0 -> this.bb());
    private final gfn<gfm> dm = new gfn<gfm>("options.narrator", gfn.a(), ($$0, $$1) -> {
        if (this.at.aZ().a()) {
            return $$1.b();
        }
        return yh.c("options.narrator.notavailable");
    }, new gfn.e<gfm>(Arrays.asList(gfm.values()), gfm.e), gfm.a, $$0 -> this.at.aZ().a((gfm)((Object)$$0)));
    public String ay = "en_us";
    private final gfn<String> dn = new gfn<String>("options.audioDevice", gfn.a(), ($$0, $$1) -> {
        if (e.equals($$1)) {
            return yh.c("options.audioDevice.default");
        }
        if ($$1.startsWith("OpenAL Soft on ")) {
            return yh.b($$1.substring(iqo.c));
        }
        return yh.b($$1);
    }, new gfn.h<String>(() -> Stream.concat(Stream.of(e), gfj.V().ap().a().stream()).toList(), (Function<String, Optional<String>>)((Function<String, Optional>)$$0 -> {
        if (!gfj.V().v() || $$0 == e || gfj.V().ap().a().contains($$0)) {
            return Optional.of($$0);
        }
        return Optional.empty();
    }), (Codec<String>)Codec.STRING), "", $$0 -> {
        iqr $$1 = gfj.V().ap();
        $$1.i();
        $$1.a(iph.a(bda.DJ, 1.0f));
    });
    public boolean az = true;
    private static final yh do = yh.c("options.music_frequency.tooltip");
    private final gfn<iqm.a> dp = new gfn<iqm.a>("options.music_frequency", gfn.a(do), ($$0, $$1) -> $$1.a(), new gfn.e<iqm.a>(Arrays.asList(iqm.a.values()), iqm.a.d), iqm.a.a, $$0 -> gfj.V().w().a((iqm.a)$$0));
    private final gfn<gfl> dq = new gfn<gfl>("options.musicToast", $$0 -> gks.a($$0.b()), ($$0, $$1) -> $$1.a(), new gfn.e<gfl>(Arrays.asList(gfl.values()), gfl.d), gfl.a, $$0 -> this.at.aG().a((gfl)$$0));
    public boolean aA;
    public boolean aB = true;

    private static void a(Consumer<hoh> $$0) {
        hoh $$1 = gfj.V().e;
        if ($$1 != null) {
            $$0.accept($$1);
        }
    }

    public gfn<Boolean> a() {
        return this.aH;
    }

    public gfn<Boolean> b() {
        return this.aJ;
    }

    public gfn<Boolean> c() {
        return this.aL;
    }

    public gfn<Double> d() {
        return this.aM;
    }

    public gfn<Integer> e() {
        return this.aN;
    }

    public gfn<Integer> f() {
        return this.aO;
    }

    public gfn<Double> g() {
        return this.aQ;
    }

    public gfn<Integer> h() {
        return this.aR;
    }

    public void a(gfb $$0) {
        this.aS = true;
        $$0.a(this.at);
        this.aS = false;
    }

    public gfn<gfb> i() {
        return this.aT;
    }

    public gfn<gff> j() {
        return this.aW;
    }

    public gfn<gev> k() {
        return this.aX;
    }

    public gfn<Integer> l() {
        return this.aY;
    }

    public gfn<Integer> m() {
        return this.ba;
    }

    public gfn<Boolean> n() {
        return this.bc;
    }

    public gfn<Boolean> o() {
        return this.be;
    }

    public gfn<Boolean> p() {
        return this.bg;
    }

    public gfn<Boolean> q() {
        return this.bh;
    }

    public gfn<Double> r() {
        return this.bj;
    }

    public gfn<gfq> s() {
        return this.bn;
    }

    public void a(bak $$0) {
        ImmutableList $$1 = ImmutableList.copyOf(this.g);
        this.g.clear();
        this.h.clear();
        for (bah $$2 : $$0.g()) {
            if ($$2.j()) continue;
            this.g.add($$2.g());
            if ($$2.d().a()) continue;
            this.h.add($$2.g());
        }
        this.aQ();
        ImmutableList $$3 = ImmutableList.copyOf(this.g);
        if (!$$3.equals($$1)) {
            this.at.p();
        }
    }

    public gfn<ddj> t() {
        return this.bo;
    }

    public gfn<Double> u() {
        return this.bp;
    }

    public gfn<Double> v() {
        return this.bq;
    }

    public gfn<Integer> w() {
        return this.bt;
    }

    public int x() {
        return this.w().b();
    }

    public gfn<Double> y() {
        return this.bu;
    }

    public gfn<Double> z() {
        return this.bv;
    }

    public gfn<Boolean> A() {
        return this.bx;
    }

    public gfn<Boolean> B() {
        return this.bz;
    }

    public gfn<Boolean> C() {
        return this.bA;
    }

    public gfn<chb> D() {
        return this.bC;
    }

    public gfn<Double> E() {
        return this.bD;
    }

    public gfn<Double> F() {
        return this.bE;
    }

    public gfn<Double> G() {
        return this.bF;
    }

    public gfn<Double> H() {
        return this.bG;
    }

    public gfn<Double> I() {
        return this.bH;
    }

    public gfn<Double> J() {
        return this.bJ;
    }

    public gfn<Integer> K() {
        return this.bK;
    }

    public gfn<Integer> L() {
        return this.bM;
    }

    public int M() {
        return Math.min(1 << this.bM.b(), RenderSystem.getDevice().getMaxSupportedAnisotropy());
    }

    public gfn<gfv> N() {
        return this.bQ;
    }

    public gfn<geq> O() {
        return this.bS;
    }

    public gfn<Integer> P() {
        return this.bT;
    }

    private static double c(int $$0) {
        return Math.pow(10.0, (double)$$0 / 100.0);
    }

    private static int a(double $$0) {
        return bgj.c(Math.log10($$0) * 100.0);
    }

    public gfn<Double> Q() {
        return this.bU;
    }

    public gfn<Boolean> R() {
        return this.bV;
    }

    public gfn<Boolean> S() {
        return this.bX;
    }

    public gfn<Boolean> T() {
        return this.bY;
    }

    public gfn<Boolean> U() {
        return this.ca;
    }

    public gfn<Boolean> V() {
        return this.cb;
    }

    public gfn<Boolean> W() {
        return this.cc;
    }

    public gfn<Boolean> X() {
        return this.cd;
    }

    public gfn<Boolean> Y() {
        return this.ce;
    }

    public gfn<Boolean> Z() {
        return this.cf;
    }

    public gfn<Boolean> aa() {
        return this.cg;
    }

    public gfn<Boolean> ab() {
        return this.ch;
    }

    private static void aZ() {
        gfj $$0 = gfj.V();
        if ($$0.aR() != null) {
            $$0.k();
            $$0.a();
        }
    }

    public gfn<Boolean> ac() {
        return this.ci;
    }

    private static boolean ba() {
        return Locale.getDefault().getLanguage().equalsIgnoreCase("ja");
    }

    public gfn<Boolean> ad() {
        return this.cj;
    }

    public gfn<Boolean> ae() {
        return this.ck;
    }

    public gfn<Boolean> af() {
        return this.cl;
    }

    public gfn<Boolean> ag() {
        return this.cm;
    }

    public gfn<Boolean> ah() {
        return this.co;
    }

    public gfn<Boolean> ai() {
        return this.cq;
    }

    public gfn<Boolean> aj() {
        return this.cr;
    }

    public final float a(bdb $$0) {
        if ($$0 == bdb.a) {
            return this.b($$0);
        }
        return this.b($$0) * this.b(bdb.a);
    }

    public final float b(bdb $$0) {
        return this.c($$0).b().floatValue();
    }

    public final gfn<Double> c(bdb $$0) {
        return Objects.requireNonNull(this.cs.get((Object)$$0));
    }

    private gfn<Double> a(String $$0, bdb $$12) {
        return new gfn<Double>($$0, gfn.a(), gfo::b, gfn.n.a, 1.0, $$1 -> {
            gfj $$2 = gfj.V();
            iqr $$3 = $$2.ap();
            if (($$12 == bdb.a || $$12 == bdb.b) && this.a(bdb.b) > 0.0f) {
                $$2.w().b();
            }
            $$3.a($$12);
            if ($$2.r == null) {
                iqs.a($$3, $$12, $$1.floatValue());
            }
        });
    }

    public gfn<Boolean> ak() {
        return this.cu;
    }

    public gfn<Boolean> al() {
        return this.cx;
    }

    public gfn<Boolean> am() {
        return this.cy;
    }

    public gfn<Boolean> an() {
        return this.cz;
    }

    public gfn<Boolean> ao() {
        return this.cA;
    }

    public gfn<Boolean> ap() {
        return this.cB;
    }

    public gfn<Boolean> aq() {
        return this.cE;
    }

    public gfn<Boolean> ar() {
        return this.cF;
    }

    public gfn<Boolean> as() {
        return this.cG;
    }

    public gfn<Boolean> at() {
        return this.cH;
    }

    public gfn<Integer> au() {
        return this.cJ;
    }

    public gfn<Boolean> av() {
        return this.cL;
    }

    public gfn<Boolean> aw() {
        return this.cM;
    }

    public gfn<Boolean> ax() {
        return this.cO;
    }

    public gfn<Boolean> ay() {
        return this.cQ;
    }

    private void bb() {
        if (this.aS) {
            return;
        }
        this.aT.a(gfb.d);
        gsb gsb2 = this.at.x;
        if (gsb2 instanceof gwc) {
            gwc $$0 = (gwc)gsb2;
            $$0.a(this.aT);
        }
    }

    public gfn<Integer> az() {
        return this.cT;
    }

    public gfn<Boolean> aA() {
        return this.cV;
    }

    public gfn<Double> aB() {
        return this.cX;
    }

    public gfn<Double> aC() {
        return this.cZ;
    }

    public gfn<Double> aD() {
        return this.db;
    }

    public gfn<Double> aE() {
        return this.dd;
    }

    public gfn<Double> aF() {
        return this.df;
    }

    public gfn<Double> aG() {
        return this.dh;
    }

    public gfn<Double> aH() {
        return this.di;
    }

    public gfn<Integer> aI() {
        return this.dk;
    }

    public gfn<awx> aJ() {
        return this.dl;
    }

    public gfn<gfm> aK() {
        return this.dm;
    }

    public gfn<String> aL() {
        return this.dn;
    }

    public void aM() {
        this.az = false;
        this.aQ();
    }

    public gfn<iqm.a> aN() {
        return this.dp;
    }

    public gfn<gfl> aO() {
        return this.dq;
    }

    public gfo(gfj $$03, File $$12) {
        this.at = $$03;
        this.cR = new File($$12, "options.txt");
        boolean $$2 = Runtime.getRuntime().maxMemory() >= 1000000000L;
        this.aN = new gfn<Integer>("options.renderDistance", gfn.a(), ($$0, $$1) -> gfo.a($$0, yh.a("options.chunks", $$1)), new gfn.f(2, $$2 ? 32 : 16, false), 12, $$0 -> {
            gfo.a(hoh::p);
            this.bb();
        });
        this.aO = new gfn<Integer>("options.simulationDistance", gfn.a(), ($$0, $$1) -> gfo.a($$0, yh.a("options.chunks", $$1)), new gfn.f(w.u ? 2 : 5, $$2 ? 32 : 16, false), 12, $$0 -> this.bb());
        this.aA = bhs.n() == bhs.a.c;
        this.aP();
    }

    public float a(float $$0) {
        return this.cy.b() != false ? $$0 : this.y().b().floatValue();
    }

    public int b(float $$0) {
        return bel.a(this.a($$0), 0.0f, 0.0f, 0.0f);
    }

    public int a(int $$0) {
        return this.cy.b() != false ? $$0 : bel.a(this.bu.b().floatValue(), 0.0f, 0.0f, 0.0f);
    }

    private void a(b $$0) {
        $$0.a("ao", this.bh);
        $$0.a("biomeBlendRadius", this.bT);
        $$0.a("chunkSectionFadeInTime", this.bj);
        $$0.a("cutoutLeaves", this.bc);
        $$0.a("enableVsync", this.cg);
        $$0.a("entityDistanceScaling", this.aQ);
        $$0.a("entityShadows", this.ch);
        $$0.a("forceUnicodeFont", this.ci);
        $$0.a("japaneseGlyphVariants", this.cj);
        $$0.a("fov", this.cT);
        $$0.a("fovEffectScale", this.cZ);
        $$0.a("darknessEffectScale", this.db);
        $$0.a("glintSpeed", this.dd);
        $$0.a("glintStrength", this.df);
        $$0.a("graphicsPreset", this.aT);
        $$0.a("prioritizeChunkUpdates", this.bn);
        $$0.a("fullscreen", this.cA);
        $$0.a("gamma", this.di);
        $$0.a("guiScale", this.dk);
        $$0.a("maxAnisotropyBit", this.bM);
        $$0.a("textureFiltering", this.bQ);
        $$0.a("maxFps", this.aR);
        $$0.a("improvedTransparency", this.bg);
        $$0.a("inactivityFpsLimit", this.aW);
        $$0.a("mipmapLevels", this.bK);
        $$0.a("narrator", this.dm);
        $$0.a("particles", this.dl);
        $$0.a("reducedDebugInfo", this.cr);
        $$0.a("renderClouds", this.aX);
        $$0.a("cloudRange", this.aY);
        $$0.a("renderDistance", this.aN);
        $$0.a("simulationDistance", this.aO);
        $$0.a("screenEffectScale", this.cX);
        $$0.a("soundDevice", this.dn);
        $$0.a("vignette", this.be);
        $$0.a("weatherRadius", this.ba);
    }

    private void a(a $$0) {
        this.a((b)$$0);
        $$0.a("autoJump", this.bY);
        $$0.a("rotateWithMinecart", this.ca);
        $$0.a("operatorItemsTab", this.cb);
        $$0.a("autoSuggestions", this.cc);
        $$0.a("chatColors", this.cd);
        $$0.a("chatLinks", this.ce);
        $$0.a("chatLinksPrompt", this.cf);
        $$0.a("discrete_mouse_scroll", this.cm);
        $$0.a("invertXMouse", this.ck);
        $$0.a("invertYMouse", this.cl);
        $$0.a("realmsNotifications", this.co);
        $$0.a("showSubtitles", this.cu);
        $$0.a("directionalAudio", this.cx);
        $$0.a("touchscreen", this.cz);
        $$0.a("bobView", this.cB);
        $$0.a("toggleCrouch", this.cE);
        $$0.a("toggleSprint", this.cF);
        $$0.a("toggleAttack", this.cG);
        $$0.a("toggleUse", this.cH);
        $$0.a("sprintWindow", this.cJ);
        $$0.a("darkMojangStudiosBackground", this.aH);
        $$0.a("hideLightningFlashes", this.aJ);
        $$0.a("hideSplashTexts", this.aL);
        $$0.a("mouseSensitivity", this.aM);
        $$0.a("damageTiltStrength", this.dh);
        $$0.a("highContrast", this.bx);
        $$0.a("highContrastBlockOutline", this.bz);
        $$0.a("narratorHotkey", this.bA);
        this.g = $$0.a("resourcePacks", this.g, gfo::c, arg_0 -> ((Gson)aD).toJson(arg_0));
        this.h = $$0.a("incompatibleResourcePacks", this.h, gfo::c, arg_0 -> ((Gson)aD).toJson(arg_0));
        this.av = $$0.a("lastServer", this.av);
        this.ay = $$0.a("lang", this.ay);
        $$0.a("chatVisibility", this.bo);
        $$0.a("chatOpacity", this.bp);
        $$0.a("chatLineSpacing", this.bq);
        $$0.a("textBackgroundOpacity", this.bu);
        $$0.a("backgroundForChatOnly", this.cy);
        this.j = $$0.a("hideServerAddress", this.j);
        this.k = $$0.a("advancedItemTooltips", this.k);
        this.l = $$0.a("pauseOnLostFocus", this.l);
        this.m = $$0.a("overrideWidth", this.m);
        this.n = $$0.a("overrideHeight", this.n);
        $$0.a("chatHeightFocused", this.bG);
        $$0.a("chatDelay", this.bH);
        $$0.a("chatHeightUnfocused", this.bF);
        $$0.a("chatScale", this.bD);
        $$0.a("chatWidth", this.bE);
        $$0.a("notificationDisplayTime", this.bJ);
        this.bR = $$0.a("useNativeTransport", this.bR);
        $$0.a("mainHand", this.bC);
        $$0.a("attackIndicator", this.bS);
        this.o = $$0.a("tutorialStep", this.o, irw::a, irw::a);
        $$0.a("mouseWheelSensitivity", this.bU);
        $$0.a("rawMouseInput", this.bV);
        $$0.a("allowCursorChanges", this.bX);
        this.q = $$0.a("glDebugVerbosity", this.q);
        this.r = $$0.a("skipMultiplayerWarning", this.r);
        $$0.a("hideMatchedNames", this.cL);
        this.p = $$0.a("joinedFirstServer", this.p);
        this.aA = $$0.a("syncChunkWrites", this.aA);
        $$0.a("showAutosaveIndicator", this.cM);
        $$0.a("allowServerListing", this.cq);
        $$0.a("onlyShowSecureChat", this.cO);
        $$0.a("saveChatDrafts", this.cQ);
        $$0.a("panoramaScrollSpeed", this.bv);
        $$0.a("telemetryOptInExtra", this.cV);
        this.az = $$0.a("onboardAccessibility", this.az);
        $$0.a("menuBackgroundBlurriness", this.bt);
        this.aB = $$0.a("startedCleanly", this.aB);
        $$0.a("musicToast", this.dq);
        $$0.a("musicFrequency", this.dp);
        for (gfh gfh2 : this.as) {
            String $$3;
            String $$2 = gfh2.p();
            if ($$2.equals($$3 = $$0.a("key_" + gfh2.k(), $$2))) continue;
            gfh2.b(fyc.a($$3));
        }
        for (bdb bdb2 : bdb.values()) {
            $$0.a("soundCategory_" + bdb2.a(), this.cs.get((Object)bdb2));
        }
        for (ddo ddo2 : ddo.values()) {
            boolean $$6 = this.bB.contains(ddo2);
            boolean $$7 = $$0.a("modelPart_" + ddo2.d(), $$6);
            if ($$7 == $$6) continue;
            this.a(ddo2, $$7);
        }
    }

    public void aP() {
        try {
            if (!this.cR.exists()) {
                return;
            }
            uz $$02 = new uz();
            try (BufferedReader $$12 = Files.newReader((File)this.cR, (Charset)StandardCharsets.UTF_8);){
                $$12.lines().forEach($$1 -> {
                    try {
                        Iterator $$2 = aF.split((CharSequence)$$1).iterator();
                        $$02.a((String)$$2.next(), (String)$$2.next());
                    }
                    catch (Exception $$3) {
                        aC.warn("Skipping bad option: {}", $$1);
                    }
                });
            }
            final uz $$2 = this.a($$02);
            this.a(new a(){

                /*
                 * Enabled force condition propagation
                 * Lifted jumps to return sites
                 */
                private @Nullable String a(String $$0) {
                    vz $$1 = $$2.a($$0);
                    if ($$1 == null) {
                        return null;
                    }
                    if (!($$1 instanceof vx)) throw new IllegalStateException("Cannot read field of wrong type, expected string: " + String.valueOf($$1));
                    vx vx2 = (vx)$$1;
                    try {
                        String string = vx2.k();
                        return string;
                    }
                    catch (Throwable throwable) {
                        throw new MatchException(throwable.toString(), throwable);
                    }
                }

                @Override
                public <T> void a(String $$0, gfn<T> $$1) {
                    String $$22 = this.a($$0);
                    if ($$22 != null) {
                        JsonElement $$3 = bge.a($$22.isEmpty() ? "\"\"" : $$22);
                        $$1.c().parse((DynamicOps)JsonOps.INSTANCE, (Object)$$3).ifError($$2 -> aC.error("Error parsing option value {} for option {}: {}", new Object[]{$$22, $$1, $$2.message()})).ifSuccess($$1::a);
                    }
                }

                @Override
                public int a(String $$0, int $$1) {
                    String $$22 = this.a($$0);
                    if ($$22 != null) {
                        try {
                            return Integer.parseInt($$22);
                        }
                        catch (NumberFormatException $$3) {
                            aC.warn("Invalid integer value for option {} = {}", new Object[]{$$0, $$22, $$3});
                        }
                    }
                    return $$1;
                }

                @Override
                public boolean a(String $$0, boolean $$1) {
                    String $$22 = this.a($$0);
                    return $$22 != null ? gfo.a($$22) : $$1;
                }

                @Override
                public String a(String $$0, String $$1) {
                    return (String)MoreObjects.firstNonNull((Object)this.a($$0), (Object)$$1);
                }

                @Override
                public float a(String $$0, float $$1) {
                    String $$22 = this.a($$0);
                    if ($$22 != null) {
                        if (gfo.a($$22)) {
                            return 1.0f;
                        }
                        if (gfo.b($$22)) {
                            return 0.0f;
                        }
                        try {
                            return Float.parseFloat($$22);
                        }
                        catch (NumberFormatException $$3) {
                            aC.warn("Invalid floating point value for option {} = {}", new Object[]{$$0, $$22, $$3});
                        }
                    }
                    return $$1;
                }

                @Override
                public <T> T a(String $$0, T $$1, Function<String, T> $$22, Function<T, String> $$3) {
                    String $$4 = this.a($$0);
                    return $$4 == null ? $$1 : $$22.apply($$4);
                }
            });
            $$2.i("fullscreenResolution").ifPresent($$0 -> {
                this.i = $$0;
            });
            gfh.e();
        }
        catch (Exception $$3) {
            aC.error("Failed to load options", (Throwable)$$3);
        }
    }

    static boolean a(String $$0) {
        return "true".equals($$0);
    }

    static boolean b(String $$0) {
        return "false".equals($$0);
    }

    private uz a(uz $$0) {
        int $$1 = 0;
        try {
            $$1 = $$0.i("version").map(Integer::parseInt).orElse(0);
        }
        catch (RuntimeException runtimeException) {
            // empty catch block
        }
        return bhz.f.a(this.at.aC(), $$0, $$1);
    }

    public void aQ() {
        try (final PrintWriter $$0 = new PrintWriter(new OutputStreamWriter((OutputStream)new FileOutputStream(this.cR), StandardCharsets.UTF_8));){
            $$0.println("version:" + w.b().a().b());
            this.a(new a(){

                public void a(String $$02) {
                    $$0.print($$02);
                    $$0.print(':');
                }

                @Override
                public <T> void a(String $$02, gfn<T> $$12) {
                    $$12.c().encodeStart((DynamicOps)JsonOps.INSTANCE, $$12.b()).ifError($$1 -> aC.error("Error saving option {}: {}", (Object)$$12, (Object)$$1.message())).ifSuccess($$2 -> {
                        this.a($$02);
                        $$0.println(aD.toJson($$2));
                    });
                }

                @Override
                public int a(String $$02, int $$1) {
                    this.a($$02);
                    $$0.println($$1);
                    return $$1;
                }

                @Override
                public boolean a(String $$02, boolean $$1) {
                    this.a($$02);
                    $$0.println($$1);
                    return $$1;
                }

                @Override
                public String a(String $$02, String $$1) {
                    this.a($$02);
                    $$0.println($$1);
                    return $$1;
                }

                @Override
                public float a(String $$02, float $$1) {
                    this.a($$02);
                    $$0.println($$1);
                    return $$1;
                }

                @Override
                public <T> T a(String $$02, T $$1, Function<String, T> $$2, Function<T, String> $$3) {
                    this.a($$02);
                    $$0.println($$3.apply($$1));
                    return $$1;
                }
            });
            String $$1 = this.bc();
            if ($$1 != null) {
                $$0.println("fullscreenResolution:" + $$1);
            }
        }
        catch (Exception $$2) {
            aC.error("Failed to save options", (Throwable)$$2);
        }
        this.aS();
    }

    private @Nullable String bc() {
        fyk $$0 = this.at.aR();
        if ($$0 == null) {
            return this.i;
        }
        if ($$0.e().isPresent()) {
            return $$0.e().get().g();
        }
        return null;
    }

    public awp aR() {
        int $$0 = 0;
        for (ddo $$1 : this.bB) {
            $$0 |= $$1.a();
        }
        return new awp(this.ay, this.aN.b(), this.bo.b(), this.cd.b(), $$0, this.bC.b(), this.at.aW(), this.cq.b(), this.dl.b());
    }

    public void aS() {
        if (this.at.s != null) {
            this.at.s.b.a(this.aR());
        }
    }

    public void a(ddo $$0, boolean $$1) {
        if ($$1) {
            this.bB.add($$0);
        } else {
            this.bB.remove($$0);
        }
    }

    public boolean a(ddo $$0) {
        return this.bB.contains($$0);
    }

    public gev aT() {
        return this.aX.b();
    }

    public boolean aU() {
        return this.bR;
    }

    public void b(bak $$0) {
        LinkedHashSet $$1 = Sets.newLinkedHashSet();
        Iterator<String> $$2 = this.g.iterator();
        while ($$2.hasNext()) {
            String $$3 = $$2.next();
            bah $$4 = $$0.c($$3);
            if ($$4 == null && !$$3.startsWith("file/")) {
                $$4 = $$0.c("file/" + $$3);
            }
            if ($$4 == null) {
                aC.warn("Removed resource pack {} from options because it doesn't seem to exist anymore", (Object)$$3);
                $$2.remove();
                continue;
            }
            if (!$$4.d().a() && !this.h.contains($$3)) {
                aC.warn("Removed resource pack {} from options because it is no longer compatible", (Object)$$3);
                $$2.remove();
                continue;
            }
            if ($$4.d().a() && this.h.contains($$3)) {
                aC.info("Removed resource pack {} from incompatibility list because it's now compatible", (Object)$$3);
                this.h.remove($$3);
                continue;
            }
            $$1.add($$4.g());
        }
        $$0.b($$1);
    }

    public ges aV() {
        return this.cS;
    }

    public void a(ges $$0) {
        this.cS = $$0;
    }

    private static List<String> c(String $$0) {
        ArrayList $$1 = bfv.a(aD, $$0, aE);
        return $$1 != null ? $$1 : Lists.newArrayList();
    }

    public File aW() {
        return this.cR;
    }

    public String aX() {
        final ArrayList<Pair> $$02 = new ArrayList<Pair>();
        this.a(new b(){

            @Override
            public <T> void a(String $$0, gfn<T> $$1) {
                $$02.add(Pair.of((Object)$$0, $$1.b()));
            }
        });
        $$02.add(Pair.of((Object)"fullscreenResolution", (Object)String.valueOf(this.i)));
        $$02.add(Pair.of((Object)"glDebugVerbosity", (Object)this.q));
        $$02.add(Pair.of((Object)"overrideHeight", (Object)this.n));
        $$02.add(Pair.of((Object)"overrideWidth", (Object)this.m));
        $$02.add(Pair.of((Object)"syncChunkWrites", (Object)this.aA));
        $$02.add(Pair.of((Object)"useNativeTransport", (Object)this.bR));
        $$02.add(Pair.of((Object)"resourcePacks", this.g));
        return $$02.stream().sorted(Comparator.comparing(Pair::getFirst)).map($$0 -> (String)$$0.getFirst() + ": " + String.valueOf($$0.getSecond())).collect(Collectors.joining(System.lineSeparator()));
    }

    public void b(int $$0) {
        this.aP = $$0;
    }

    public int aY() {
        return this.aP > 0 ? Math.min(this.aN.b(), this.aP) : this.aN.b();
    }

    private static yh c(yh $$0, int $$1) {
        return yh.a("options.pixel_value", $$0, $$1);
    }

    private static yh a(yh $$0, double $$1) {
        return yh.a("options.percent_value", $$0, (int)($$1 * 100.0));
    }

    public static yh a(yh $$0, yh $$1) {
        return yh.a("options.generic_value", $$0, $$1);
    }

    public static yh a(yh $$0, int $$1) {
        return gfo.a($$0, yh.b(Integer.toString($$1)));
    }

    public static yh b(yh $$0, int $$1) {
        if ($$1 == 0) {
            return gfo.a($$0, yg.c);
        }
        return gfo.a($$0, $$1);
    }

    private static yh b(yh $$0, double $$1) {
        if ($$1 == 0.0) {
            return gfo.a($$0, yg.c);
        }
        return gfo.a($$0, $$1);
    }

    static interface b {
        public <T> void a(String var1, gfn<T> var2);
    }

    static interface a
    extends b {
        public int a(String var1, int var2);

        public boolean a(String var1, boolean var2);

        public String a(String var1, String var2);

        public float a(String var1, float var2);

        public <T> T a(String var1, T var2, Function<String, T> var3, Function<T, String> var4);
    }
}

