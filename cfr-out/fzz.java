/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.mojang.logging.LogUtils
 *  com.mojang.util.UndashedUuid
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import com.mojang.util.UndashedUuid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class fzz {
    public static final b a = Optional.ofNullable(System.getenv("realms.environment")).or(() -> Optional.ofNullable(System.getProperty("realms.environment"))).flatMap(b::a).orElse(fzz$b.a);
    private static final Logger b = LogUtils.getLogger();
    private static volatile @Nullable fzz c = null;
    private final CompletableFuture<Set<String>> d;
    private final String e;
    private final String f;
    private final gfj g;
    private static final String h = "worlds";
    private static final String i = "invites";
    private static final String j = "mco";
    private static final String k = "subscriptions";
    private static final String l = "activities";
    private static final String m = "ops";
    private static final String n = "regions/ping/stat";
    private static final String o = "regions/preferredRegions";
    private static final String p = "trial";
    private static final String q = "notifications";
    private static final String r = "feature/v1";
    private static final String s = "/listUserWorldsOfType/any";
    private static final String t = "/$PARENT_WORLD_ID/createPrereleaseRealm";
    private static final String u = "/listPrereleaseEligibleWorlds";
    private static final String v = "/$WORLD_ID/initialize";
    private static final String w = "/liveplayerlist";
    private static final String x = "/$WORLD_ID";
    private static final String y = "/$WORLD_ID/$PROFILE_UUID";
    private static final String z = "/minigames/$MINIGAME_ID/$WORLD_ID";
    private static final String A = "/available";
    private static final String B = "/templates/$WORLD_TYPE";
    private static final String C = "/v1/$ID/join/pc";
    private static final String D = "/$ID";
    private static final String E = "/$WORLD_ID";
    private static final String F = "/$WORLD_ID/invite/$UUID";
    private static final String G = "/pending";
    private static final String H = "/accept/$INVITATION_ID";
    private static final String I = "/reject/$INVITATION_ID";
    private static final String J = "/$WORLD_ID";
    private static final String K = "/$WORLD_ID/configuration";
    private static final String L = "/$WORLD_ID/slot/$SLOT_ID";
    private static final String M = "/$WORLD_ID/open";
    private static final String N = "/$WORLD_ID/close";
    private static final String O = "/$WORLD_ID/reset";
    private static final String P = "/$WORLD_ID";
    private static final String Q = "/$WORLD_ID/backups";
    private static final String R = "/$WORLD_ID/slot/$SLOT_ID/download";
    private static final String S = "/$WORLD_ID/backups/upload";
    private static final String T = "/client/compatible";
    private static final String U = "/tos/agreed";
    private static final String V = "/v1/news";
    private static final String W = "/seen";
    private static final String X = "/dismiss";
    private static final gas Y = new gas();

    public static fzz a() {
        gfj $$0 = gfj.V();
        return fzz.a($$0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static fzz a(gfj $$0) {
        String $$1 = $$0.ac().c();
        String $$2 = $$0.ac().a();
        fzz $$3 = c;
        if ($$3 != null) {
            return $$3;
        }
        Class<fzz> clazz = fzz.class;
        synchronized (fzz.class) {
            fzz $$4 = c;
            if ($$4 != null) {
                // ** MonitorExit[var4_4] (shouldn't be in output)
                return $$4;
            }
            c = $$4 = new fzz($$2, $$1, $$0);
            // ** MonitorExit[var4_4] (shouldn't be in output)
            return $$4;
        }
    }

    private fzz(String $$0, String $$1, gfj $$2) {
        this.e = $$0;
        this.f = $$1;
        this.g = $$2;
        gaa.a($$2.ae());
        this.d = CompletableFuture.supplyAsync(this::o, bhs.j());
    }

    public Set<String> b() {
        return this.d.join();
    }

    private Set<String> o() {
        if (gfj.V().h()) {
            return Set.of();
        }
        String $$0 = fzz.a(r, null, false);
        try {
            String $$1 = this.a(gac.a($$0, 5000, 10000));
            JsonArray $$2 = bge.a($$1).getAsJsonArray();
            Set<String> $$3 = $$2.asList().stream().map(JsonElement::getAsString).collect(Collectors.toSet());
            b.debug("Fetched Realms feature flags: {}", $$3);
            return $$3;
        }
        catch (gce $$4) {
            b.error("Failed to fetch Realms feature flags", (Throwable)$$4);
        }
        catch (Exception $$5) {
            b.error("Could not parse Realms feature flags", (Throwable)$$5);
        }
        return Set.of();
    }

    public gbh c() throws gce {
        Object $$0 = this.c(h);
        if (fzu.b()) {
            $$0 = (String)$$0 + s;
        }
        String $$1 = this.a(gac.a((String)$$0));
        return gbh.a(Y, $$1);
    }

    public List<gbg> d() throws gce {
        String $$0 = this.c("worlds/listPrereleaseEligibleWorlds");
        String $$1 = this.a(gac.a($$0));
        return gbh.a(Y, $$1).a();
    }

    public gbg a(Long $$0) throws gce {
        String $$1 = String.valueOf($$0);
        String $$2 = this.c(h + t.replace("$PARENT_WORLD_ID", $$1));
        return gbg.a(Y, this.a(gac.b($$2, $$1)));
    }

    public List<gbe> e() throws gce {
        String $$0 = this.c(q);
        String $$1 = this.a(gac.a($$0));
        return gbe.a($$1);
    }

    private static JsonArray c(List<UUID> $$0) {
        JsonArray $$1 = new JsonArray();
        for (UUID $$2 : $$0) {
            if ($$2 == null) continue;
            $$1.add($$2.toString());
        }
        return $$1;
    }

    public void a(List<UUID> $$0) throws gce {
        String $$1 = this.c("notifications/seen");
        this.a(gac.b($$1, Y.a((JsonElement)fzz.c($$0))));
    }

    public void b(List<UUID> $$0) throws gce {
        String $$1 = this.c("notifications/dismiss");
        this.a(gac.b($$1, Y.a((JsonElement)fzz.c($$0))));
    }

    public gbg a(long $$0) throws gce {
        String $$1 = this.c(h + D.replace("$ID", String.valueOf($$0)));
        String $$2 = this.a(gac.a($$1));
        return gbg.a(Y, $$2);
    }

    public gaz f() throws gce {
        String $$0 = this.c(o);
        String $$1 = this.a(gac.a($$0));
        try {
            gaz $$2 = Y.a($$1, gaz.class);
            if ($$2 == null) {
                return gaz.a();
            }
            Set $$3 = $$2.b().stream().map(gbq::a).collect(Collectors.toSet());
            for (gbf $$4 : gbf.values()) {
                if ($$4 == gbf.x || $$3.contains((Object)$$4)) continue;
                b.debug("No realms region matching {} in server response", (Object)$$4);
            }
            return $$2;
        }
        catch (Exception $$5) {
            b.error("Could not parse PreferredRegionSelections", (Throwable)$$5);
            return gaz.a();
        }
    }

    public gbi g() throws gce {
        String $$0 = this.c("activities/liveplayerlist");
        String $$1 = this.a(gac.a($$0));
        return gbi.a($$1);
    }

    public gbc b(long $$0) throws gce {
        String $$1 = this.c(h + C.replace("$ID", "" + $$0));
        String $$2 = this.a(gac.a($$1, 5000, 30000));
        return gbc.a(Y, $$2);
    }

    public void a(long $$0, String $$1, String $$2) throws gce {
        gbb $$3 = new gbb($$1, $$2);
        String $$4 = this.c(h + v.replace("$WORLD_ID", String.valueOf($$0)));
        String $$5 = Y.a($$3);
        this.a(gac.a($$4, $$5, 5000, 10000));
    }

    public boolean h() throws gce {
        String $$0 = this.c("mco/available");
        String $$1 = this.a(gac.a($$0));
        return Boolean.parseBoolean($$1);
    }

    /*
     * WARNING - void declaration
     */
    public a i() throws gce {
        void $$4;
        String $$0 = this.c("mco/client/compatible");
        String $$1 = this.a(gac.a($$0));
        try {
            a $$2 = fzz$a.valueOf($$1);
        }
        catch (IllegalArgumentException $$3) {
            throw new gce(gab.b.a($$1));
        }
        return $$4;
    }

    public void a(long $$0, UUID $$1) throws gce {
        String $$2 = this.c(i + F.replace("$WORLD_ID", String.valueOf($$0)).replace("$UUID", UndashedUuid.toString((UUID)$$1)));
        this.a(gac.b($$2));
    }

    public void c(long $$0) throws gce {
        String $$1 = this.c(i + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
        this.a(gac.b($$1));
    }

    public List<gay> a(long $$0, String $$1) throws gce {
        gau $$2 = new gau();
        $$2.a = $$1;
        String $$3 = this.c(i + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
        String $$4 = this.a(gac.b($$3, Y.a($$2)));
        return gbg.a((gas)fzz.Y, (String)$$4).i;
    }

    public gaq d(long $$0) throws gce {
        String $$1 = this.c(h + Q.replace("$WORLD_ID", String.valueOf($$0)));
        String $$2 = this.a(gac.a($$1));
        return gaq.a($$2);
    }

    public void a(long $$0, String $$1, String $$2, @Nullable gbt $$3, int $$4, gbn $$5, List<gbj> $$6) throws gce {
        gbt $$7 = $$3 != null ? $$3 : new gbt(gbs.d, null);
        gbb $$8 = new gbb($$1, $$2);
        gbl $$9 = new gbl($$4, $$5, gbj.a($$6));
        gba $$10 = new gba($$9, $$6, $$7, $$8);
        String $$11 = this.c(h + K.replace("$WORLD_ID", String.valueOf($$0)));
        this.a(gac.b($$11, Y.a($$10)));
    }

    public void a(long $$0, int $$1, gbn $$2, List<gbj> $$3) throws gce {
        String $$4 = this.c(h + L.replace("$WORLD_ID", String.valueOf($$0)).replace("$SLOT_ID", String.valueOf($$1)));
        String $$5 = Y.a(new gbl($$1, $$2, gbj.a($$3)));
        this.a(gac.b($$4, $$5));
    }

    public boolean a(long $$0, int $$1) throws gce {
        String $$2 = this.c(h + L.replace("$WORLD_ID", String.valueOf($$0)).replace("$SLOT_ID", String.valueOf($$1)));
        String $$3 = this.a(gac.c($$2, ""));
        return Boolean.valueOf($$3);
    }

    public void b(long $$0, String $$1) throws gce {
        String $$2 = this.a(h + Q.replace("$WORLD_ID", String.valueOf($$0)), "backupId=" + $$1);
        this.a(gac.b($$2, "", 40000, 600000));
    }

    public gca a(int $$0, int $$1, gbg.d $$2) throws gce {
        String $$3 = this.a(h + B.replace("$WORLD_TYPE", $$2.toString()), String.format(Locale.ROOT, "page=%d&pageSize=%d", $$0, $$1));
        String $$4 = this.a(gac.a($$3));
        return gca.a($$4);
    }

    public Boolean c(long $$0, String $$1) throws gce {
        String $$2 = z.replace("$MINIGAME_ID", $$1).replace("$WORLD_ID", String.valueOf($$0));
        String $$3 = this.c(h + $$2);
        return Boolean.valueOf(this.a(gac.c($$3, "")));
    }

    public gat b(long $$0, UUID $$1) throws gce {
        String $$2 = y.replace("$WORLD_ID", String.valueOf($$0)).replace("$PROFILE_UUID", UndashedUuid.toString((UUID)$$1));
        String $$3 = this.c(m + $$2);
        return gat.a(this.a(gac.b($$3, "")));
    }

    public gat c(long $$0, UUID $$1) throws gce {
        String $$2 = y.replace("$WORLD_ID", String.valueOf($$0)).replace("$PROFILE_UUID", UndashedUuid.toString((UUID)$$1));
        String $$3 = this.c(m + $$2);
        return gat.a(this.a(gac.b($$3)));
    }

    public Boolean e(long $$0) throws gce {
        String $$1 = this.c(h + M.replace("$WORLD_ID", String.valueOf($$0)));
        String $$2 = this.a(gac.c($$1, ""));
        return Boolean.valueOf($$2);
    }

    public Boolean f(long $$0) throws gce {
        String $$1 = this.c(h + N.replace("$WORLD_ID", String.valueOf($$0)));
        String $$2 = this.a(gac.c($$1, ""));
        return Boolean.valueOf($$2);
    }

    public Boolean d(long $$0, String $$1) throws gce {
        gbo $$2 = new gbo(null, Long.valueOf($$1), -1, false, Set.of());
        String $$3 = this.c(h + O.replace("$WORLD_ID", String.valueOf($$0)));
        String $$4 = this.a(gac.a($$3, Y.a($$2), 30000, 80000));
        return Boolean.valueOf($$4);
    }

    public gbv g(long $$0) throws gce {
        String $$1 = this.c(k + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
        String $$2 = this.a(gac.a($$1));
        return gbv.a($$2);
    }

    public int j() throws gce {
        return this.k().a().size();
    }

    public gaw k() throws gce {
        String $$0 = this.c("invites/pending");
        String $$1 = this.a(gac.a($$0));
        gaw $$2 = gaw.a($$1);
        $$2.a().removeIf(this::a);
        return $$2;
    }

    private boolean a(gav $$0) {
        return this.g.aQ().e($$0.d());
    }

    public void a(String $$0) throws gce {
        String $$1 = this.c(i + H.replace("$INVITATION_ID", $$0));
        this.a(gac.c($$1, ""));
    }

    public gby b(long $$0, int $$1) throws gce {
        String $$2 = this.c(h + R.replace("$WORLD_ID", String.valueOf($$0)).replace("$SLOT_ID", String.valueOf($$1)));
        String $$3 = this.a(gac.a($$2));
        return gby.a($$3);
    }

    public @Nullable gbw h(long $$0) throws gce {
        String $$2;
        String $$1 = this.c(h + S.replace("$WORLD_ID", String.valueOf($$0)));
        gbw $$3 = gbw.a(this.a(gac.c($$1, gbw.b($$2 = geb.a($$0)))));
        if ($$3 != null) {
            geb.a($$0, $$3.b());
        }
        return $$3;
    }

    public void b(String $$0) throws gce {
        String $$1 = this.c(i + I.replace("$INVITATION_ID", $$0));
        this.a(gac.c($$1, ""));
    }

    public void l() throws gce {
        String $$0 = this.c("mco/tos/agreed");
        this.a(gac.b($$0, ""));
    }

    public gbd m() throws gce {
        String $$0 = this.c("mco/v1/news");
        String $$1 = this.a(gac.a($$0, 5000, 10000));
        return gbd.a($$1);
    }

    public void a(gax $$0) throws gce {
        String $$1 = this.c(n);
        this.a(gac.b($$1, Y.a($$0)));
    }

    public Boolean n() throws gce {
        String $$0 = this.c(p);
        String $$1 = this.a(gac.a($$0));
        return Boolean.valueOf($$1);
    }

    public void i(long $$0) throws gce {
        String $$1 = this.c(h + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf($$0)));
        this.a(gac.b($$1));
    }

    private String c(String $$0) throws gce {
        return this.a($$0, null);
    }

    private String a(String $$0, @Nullable String $$1) {
        return fzz.a($$0, $$1, this.b().contains("realms_in_aks"));
    }

    private static String a(String $$0, @Nullable String $$1, boolean $$2) {
        try {
            return new URI(fzz.a.f, $$2 ? fzz.a.e : fzz.a.d, "/" + $$0, $$1, null).toASCIIString();
        }
        catch (URISyntaxException $$3) {
            throw new IllegalArgumentException($$0, $$3);
        }
    }

    private String a(gac<?> $$0) throws gce {
        $$0.a("sid", this.e);
        $$0.a("user", this.f);
        $$0.a("version", w.b().c());
        $$0.a(fzu.b());
        try {
            int $$1 = $$0.b();
            if ($$1 == 503 || $$1 == 277) {
                int $$2 = $$0.a();
                throw new gcf($$2, $$1);
            }
            String $$3 = $$0.c();
            if ($$1 < 200 || $$1 >= 300) {
                if ($$1 == 401) {
                    String $$4 = $$0.c("WWW-Authenticate");
                    b.info("Could not authorize you against Realms server: {}", (Object)$$4);
                    throw new gce(new gab.a($$4));
                }
                String $$5 = $$0.a.getContentType();
                if ($$5 != null && $$5.startsWith("text/html")) {
                    throw new gce(gab.b.b($$1, $$3));
                }
                gab $$6 = gab.a($$1, $$3);
                throw new gce($$6);
            }
            return $$3;
        }
        catch (gcd $$7) {
            throw new gce(gab.b.a($$7));
        }
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = fzz$a.a();
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b("pc.realms.minecraft.net", "java.frontendlegacy.realms.minecraft-services.net", "https");
        public static final /* enum */ b b = new b("pc-stage.realms.minecraft.net", "java.frontendlegacy.stage-c2a40e62.realms.minecraft-services.net", "https");
        public static final /* enum */ b c = new b("localhost:8080", "localhost:8080", "http");
        public final String d;
        public final String e;
        public final String f;
        private static final /* synthetic */ b[] g;

        public static b[] values() {
            return (b[])g.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private b(String $$0, String $$1, String $$2) {
            this.d = $$0;
            this.e = $$1;
            this.f = $$2;
        }

        public static Optional<b> a(String $$0) {
            return switch ($$0.toLowerCase(Locale.ROOT)) {
                case "production" -> Optional.of(a);
                case "local" -> Optional.of(c);
                case "stage", "staging" -> Optional.of(b);
                default -> Optional.empty();
            };
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c};
        }

        static {
            g = fzz$b.a();
        }
    }
}

