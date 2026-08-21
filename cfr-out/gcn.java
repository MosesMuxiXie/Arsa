/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class gcn
extends isc {
    private static final amo a = amo.b("widget/slot_frame");
    private static final Logger b = LogUtils.getLogger();
    private static final int c = 80;
    private final gsb F;
    private @Nullable gbg G;
    private final long H;
    private final yh[] I = new yh[]{yh.c("mco.brokenworld.message.line1"), yh.c("mco.brokenworld.message.line2")};
    private int J;
    private final List<Integer> K = Lists.newArrayList();
    private int L;

    public gcn(gsb $$0, long $$1, boolean $$2) {
        super($$2 ? yh.c("mco.brokenworld.minigame.title") : yh.c("mco.brokenworld.title"));
        this.F = $$0;
        this.H = $$1;
    }

    @Override
    public void bg_() {
        this.J = this.o / 2 - 150;
        this.c(gje.a(yg.k, (gje $$0) -> this.aX_()).a((this.o - 150) / 2, gcn.a(13) - 5, 150, 20).a());
        if (this.G == null) {
            this.a(this.H);
        } else {
            this.o();
        }
    }

    @Override
    public yh i() {
        return yk.a(Stream.concat(Stream.of(this.m), Stream.of(this.I)).collect(Collectors.toList()), yg.x);
    }

    private void o() {
        for (Map.Entry<Integer, gbk> $$0 : this.G.j.entrySet()) {
            gje $$4;
            boolean $$2;
            int $$13 = $$0.getKey();
            boolean bl2 = $$2 = $$13 != this.G.q || this.G.j();
            if ($$2) {
                gje $$3 = gje.a(yh.c("mco.brokenworld.play"), (gje $$1) -> this.n.a(new gcu(this.F, new geo(this.G.b, $$13, this::b)))).a(this.b($$13), gcn.a(8), 80, 20).a();
                $$3.k = !this.G.j.get((Object)Integer.valueOf((int)$$13)).b.i;
            } else {
                $$4 = gje.a(yh.c("mco.brokenworld.download"), (gje $$12) -> this.n.a(gcy.a(this, yh.c("mco.configure.world.restore.download.question.line1"), (gkh $$1) -> this.c($$13)))).a(this.b($$13), gcn.a(8), 80, 20).a();
            }
            if (this.K.contains($$13)) {
                $$4.k = false;
                $$4.a_(yh.c("mco.brokenworld.downloaded"));
            }
            this.c($$4);
        }
    }

    @Override
    public void e() {
        ++this.L;
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        $$0.a(this.q, this.m, this.o / 2, 17, -1);
        for (int $$4 = 0; $$4 < this.I.length; ++$$4) {
            $$0.a(this.q, this.I[$$4], this.o / 2, gcn.a(-1) + 3 + $$4 * 12, -6250336);
        }
        if (this.G == null) {
            return;
        }
        for (Map.Entry<Integer, gbk> $$5 : this.G.j.entrySet()) {
            if ($$5.getValue().b.h != null && $$5.getValue().b.g != -1L) {
                this.a($$0, this.b($$5.getKey()), gcn.a(1) + 5, $$1, $$2, this.G.q == $$5.getKey() && !this.I(), $$5.getValue().b.a($$5.getKey()), $$5.getKey(), $$5.getValue().b.g, $$5.getValue().b.h, $$5.getValue().b.i);
                continue;
            }
            this.a($$0, this.b($$5.getKey()), gcn.a(1) + 5, $$1, $$2, this.G.q == $$5.getKey() && !this.I(), $$5.getValue().b.a($$5.getKey()), $$5.getKey(), -1L, null, $$5.getValue().b.i);
        }
    }

    private int b(int $$0) {
        return this.J + ($$0 - 1) * 110;
    }

    public gsb a(gce $$0) {
        return new gcs($$0, this.F);
    }

    private void a(long $$02) {
        gdz.a((fzz $$1) -> $$1.a($$02), gdz.a(this::a, "Couldn't get own world")).thenAcceptAsync($$0 -> {
            this.G = $$0;
            this.o();
        }, (Executor)this.n);
    }

    public void b() {
        new Thread(() -> {
            fzz $$0 = fzz.a();
            if (this.G.f == gbg.c.a) {
                this.n.execute(() -> this.n.a(new gcu(this, new gei(this.G, this, true, this.n))));
            } else {
                try {
                    gbg $$1 = $$0.a(this.H);
                    this.n.execute(() -> fzu.a($$1, this));
                }
                catch (gce $$2) {
                    b.error("Couldn't get own world", (Throwable)$$2);
                    this.n.execute(() -> this.n.a(this.a($$2)));
                }
            }
        }).start();
    }

    private void c(int $$0) {
        fzz $$12 = fzz.a();
        try {
            gby $$2 = $$12.b(this.G.b, $$0);
            gcr $$3 = new gcr(this, $$2, this.G.a($$0), $$1 -> {
                if ($$1) {
                    this.K.add($$0);
                    this.t();
                    this.o();
                } else {
                    this.n.a(this);
                }
            });
            this.n.a($$3);
        }
        catch (gce $$4) {
            b.error("Couldn't download world data", (Throwable)$$4);
            this.n.a(new gcs($$4, (gsb)this));
        }
    }

    @Override
    public void aX_() {
        this.n.a(this.F);
    }

    private boolean I() {
        return this.G != null && this.G.j();
    }

    private void a(gir $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5, String $$6, int $$7, long $$8, @Nullable String $$9, boolean $$10) {
        amo $$16;
        if ($$10) {
            amo $$11 = gck.a;
        } else if ($$9 != null && $$8 != -1L) {
            amo $$12 = gdy.a(String.valueOf($$8), $$9);
        } else if ($$7 == 1) {
            amo $$13 = gck.b;
        } else if ($$7 == 2) {
            amo $$14 = gck.c;
        } else if ($$7 == 3) {
            amo $$15 = gck.d;
        } else {
            $$16 = gdy.a(String.valueOf(this.G.s), this.G.t);
        }
        if ($$5) {
            float $$17 = 0.9f + 0.1f * bgj.b((double)((float)this.L * 0.2f));
            $$0.a(hpa.at, $$16, $$1 + 3, $$2 + 3, 0.0f, 0.0f, 74, 74, 74, 74, 74, 74, bel.a(1.0f, $$17, $$17, $$17));
            $$0.a(hpa.at, a, $$1, $$2, 80, 80);
        } else {
            int $$18 = bel.a(1.0f, 0.56f, 0.56f, 0.56f);
            $$0.a(hpa.at, $$16, $$1 + 3, $$2 + 3, 0.0f, 0.0f, 74, 74, 74, 74, 74, 74, $$18);
            $$0.a(hpa.at, a, $$1, $$2, 80, 80, $$18);
        }
        $$0.a(this.q, $$6, $$1 + 40, $$2 + 66, -1);
    }
}

