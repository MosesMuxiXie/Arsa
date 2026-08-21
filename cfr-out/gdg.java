/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class gdg
extends isc {
    static final Logger b = LogUtils.getLogger();
    private static final yh c = yh.c("mco.configure.world.backup");
    static final yh F = yh.c("mco.backup.button.restore");
    static final yh G = yh.c("mco.backup.changes.tooltip");
    private static final yh H = yh.c("mco.backup.nobackups");
    private static final yh I = yh.c("mco.backup.button.download");
    private static final String J = "uploaded";
    private static final int K = 8;
    public static final DateTimeFormatter a = bhs.a(FormatStyle.SHORT);
    final gdi L;
    List<gap> M = Collections.emptyList();
    @Nullable a N;
    final gou O = new gou(this);
    private final int P;
    @Nullable gje Q;
    final gbg R;
    boolean S = false;

    public gdg(gdi $$0, gbg $$1, int $$2) {
        super(c);
        this.L = $$0;
        this.R = $$1;
        this.P = $$2;
    }

    @Override
    public void bg_() {
        this.O.a(c, this.q);
        this.N = this.O.c(new a(this));
        goy $$02 = this.O.b(goy.e().a(8));
        this.Q = $$02.a(gje.a(I, (gje $$0) -> this.I()).a());
        this.Q.k = false;
        $$02.a(gje.a(yg.k, (gje $$0) -> this.aX_()).a());
        this.O.a($$1 -> {
            gjc cfr_ignored_0 = (gjc)this.c($$1);
        });
        this.c();
        this.o();
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        if (this.S && this.N != null) {
            $$0.b(this.q, H, this.o / 2 - this.q.a(H) / 2, this.N.aU_() + this.N.aR_() / 2 - this.q.b / 2, -1);
        }
    }

    @Override
    protected void c() {
        this.O.a();
        if (this.N != null) {
            this.N.a(this.o, this.O);
        }
    }

    private void o() {
        new Thread("Realms-fetch-backups"){

            @Override
            public void run() {
                fzz $$0 = fzz.a();
                try {
                    List<gap> $$1 = $$0.d(gdg.this.R.b).a();
                    gdg.this.n.execute(() -> {
                        gdg.this.M = $$1;
                        gdg.this.S = gdg.this.M.isEmpty();
                        if (!gdg.this.S && gdg.this.Q != null) {
                            gdg.this.Q.k = true;
                        }
                        if (gdg.this.N != null) {
                            gdg.this.N.a(gdg.this.M.stream().map($$0 -> new b((gap)$$0)).toList());
                        }
                    });
                }
                catch (gce $$2) {
                    b.error("Couldn't request backups", (Throwable)$$2);
                }
            }
        }.start();
    }

    @Override
    public void aX_() {
        this.n.a(this.L);
    }

    private void I() {
        this.n.a(gcy.a(this, yh.c("mco.configure.world.restore.download.question.line1"), (gkh $$0) -> this.n.a(new gcu(this.L.o(), new gef(this.R.b, this.P, Objects.requireNonNullElse(this.R.d, "") + " (" + this.R.j.get((Object)Integer.valueOf((int)this.R.q)).b.a(this.R.q) + ")", this)))));
    }

    class a
    extends gjk<b> {
        private static final int a = 36;

        public a(gdg gdg2) {
            super(gfj.V(), gdg2.o, gdg2.O.d(), gdg2.O.c(), 36);
        }

        @Override
        public int a() {
            return 300;
        }
    }

    class b
    extends gjk.a<b> {
        private static final int b = 2;
        private final gap c;
        private @Nullable gje d;
        private @Nullable gje e;
        private final List<gjc> f = new ArrayList<gjc>();

        public b(gap $$02) {
            this.c = $$02;
            this.a($$02);
            if (!$$02.f.isEmpty()) {
                this.e = gje.a(G, $$0 -> gdg.this.n.a(new gdf(gdg.this, this.c))).a(8 + gdg.this.q.a(G)).a(this::a).a();
                this.f.add(this.e);
            }
            if (!gdg.this.R.k) {
                this.d = gje.a(F, $$0 -> this.c()).a(8 + gdg.this.q.a(G)).a(this::a).a();
                this.f.add(this.d);
            }
        }

        private yw a(Supplier<yw> $$0) {
            return yg.a(new yh[]{yh.a("mco.backup.narration", new Object[]{a.format(this.c.a())}), $$0.get()});
        }

        private void a(gap $$0) {
            int $$1 = gdg.this.M.indexOf($$0);
            if ($$1 == gdg.this.M.size() - 1) {
                return;
            }
            gap $$2 = gdg.this.M.get($$1 + 1);
            for (String $$3 : $$0.e.keySet()) {
                if (!$$3.contains(gdg.J) && $$2.e.containsKey($$3)) {
                    if ($$0.e.get($$3).equals($$2.e.get($$3))) continue;
                    this.a($$3);
                    continue;
                }
                this.a($$3);
            }
        }

        private void a(String $$0) {
            if ($$0.contains(gdg.J)) {
                String $$1 = a.format(this.c.a());
                this.c.f.put($$0, $$1);
                this.c.d = true;
            } else {
                this.c.f.put($$0, this.c.e.get($$0));
            }
        }

        private void c() {
            yh $$02 = gdz.a(this.c.b);
            String $$1 = a.format(this.c.a());
            yw $$2 = yh.a("mco.configure.world.restore.question.line1", new Object[]{$$1, $$02});
            gdg.this.n.a(gcy.b(gdg.this, $$2, $$0 -> {
                gdi $$1 = gdg.this.L.o();
                gdg.this.n.a(new gcu($$1, new gem(this.c, gdg.this.R.b, $$1)));
            }));
        }

        @Override
        public List<? extends gmm> aJ_() {
            return this.f;
        }

        @Override
        public List<? extends gpb> b() {
            return this.f;
        }

        @Override
        public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
            int $$5 = this.j();
            int $$6 = $$5 - ((gdg)gdg.this).q.b - 2;
            int $$7 = $$5 + 2;
            int $$8 = this.c.d ? -8388737 : -1;
            $$0.b(gdg.this.q, yh.a("mco.backup.entry", gdz.a(this.c.b)), this.d(), $$6, $$8);
            $$0.b(gdg.this.q, a.format(this.c.a()), this.d(), $$7, -11776948);
            int $$9 = 0;
            int $$10 = this.j() - 10;
            if (this.d != null) {
                this.d.f(this.n() - ($$9 += this.d.aS_() + 8));
                this.d.g($$10);
                this.d.a($$0, $$1, $$2, $$4);
            }
            if (this.e != null) {
                this.e.f(this.n() - ($$9 += this.e.aS_() + 8));
                this.e.g($$10);
                this.e.a($$0, $$1, $$2, $$4);
            }
        }
    }
}

