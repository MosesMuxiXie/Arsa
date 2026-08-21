/*
 * Decompiled with CFR 0.152.
 */
import java.util.Locale;

public class gdf
extends isc {
    private static final yh a = yh.c("mco.backup.info.title");
    private static final yh b = yh.c("mco.backup.unknown");
    private final gsb c;
    final gap F;
    final gou G = new gou(this);
    private a H;

    public gdf(gsb $$0, gap $$1) {
        super(a);
        this.c = $$0;
        this.F = $$1;
    }

    @Override
    public void bg_() {
        this.G.a(a, this.q);
        this.H = this.G.c(new a(this.n));
        this.G.b(gje.a(yg.k, (gje $$0) -> this.aX_()).a());
        this.c();
        this.G.a($$1 -> {
            gjc cfr_ignored_0 = (gjc)this.c($$1);
        });
    }

    @Override
    protected void c() {
        this.H.a(this.o, this.G);
        this.G.a();
    }

    @Override
    public void aX_() {
        this.n.a(this.c);
    }

    yh a(String $$0, String $$1) {
        String $$2 = $$0.toLowerCase(Locale.ROOT);
        if ($$2.contains("game") && $$2.contains("mode")) {
            return this.b($$1);
        }
        if ($$2.contains("game") && $$2.contains("difficulty")) {
            return this.a($$1);
        }
        if ($$0.equals("world_type")) {
            return this.c($$1);
        }
        return yh.b($$1);
    }

    private yh a(String $$0) {
        try {
            return gdn.a.get(Integer.parseInt($$0)).b();
        }
        catch (Exception $$1) {
            return b;
        }
    }

    private yh b(String $$0) {
        try {
            return gdn.b.get(Integer.parseInt($$0)).e();
        }
        catch (Exception $$1) {
            return b;
        }
    }

    private yh c(String $$0) {
        try {
            return gbg.d.valueOf($$0.toUpperCase(Locale.ROOT)).a();
        }
        catch (Exception $$1) {
            return gbg.d.f.a();
        }
    }

    class a
    extends gkb<b> {
        public a(gfj $$02) {
            super($$02, gdf.this.o, gdf.this.G.d(), gdf.this.G.c(), 36);
            if (gdf.this.F.f != null) {
                gdf.this.F.f.forEach(($$0, $$1) -> this.c(new b((String)$$0, (String)$$1)));
            }
        }
    }

    class b
    extends gkb.a<b> {
        private static final yh b = yh.c("mco.backup.entry.templateName");
        private static final yh c = yh.c("mco.backup.entry.gameDifficulty");
        private static final yh d = yh.c("mco.backup.entry.name");
        private static final yh e = yh.c("mco.backup.entry.gameServerVersion");
        private static final yh f = yh.c("mco.backup.entry.uploaded");
        private static final yh g = yh.c("mco.backup.entry.enabledPack");
        private static final yh i = yh.c("mco.backup.entry.description");
        private static final yh j = yh.c("mco.backup.entry.gameMode");
        private static final yh k = yh.c("mco.backup.entry.seed");
        private static final yh l = yh.c("mco.backup.entry.worldType");
        private static final yh m = yh.c("mco.backup.entry.undefined");
        private final String n;
        private final String o;
        private final yh p;
        private final yh q;

        public b(String $$0, String $$1) {
            this.n = $$0;
            this.o = $$1;
            this.p = this.a($$0);
            this.q = gdf.this.a($$0, $$1);
        }

        @Override
        public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
            $$0.b(gdf.this.q, this.p, this.d(), this.h(), -6250336);
            $$0.b(gdf.this.q, this.q, this.d(), this.h() + 12, -1);
        }

        private yh a(String $$0) {
            return switch ($$0) {
                case "template_name" -> b;
                case "game_difficulty" -> c;
                case "name" -> d;
                case "game_server_version" -> e;
                case "uploaded" -> f;
                case "enabled_packs" -> g;
                case "description" -> i;
                case "game_mode" -> j;
                case "seed" -> k;
                case "world_type" -> l;
                default -> m;
            };
        }

        @Override
        public yh a() {
            return yh.a("narrator.select", new Object[]{this.n + " " + this.o});
        }
    }
}

