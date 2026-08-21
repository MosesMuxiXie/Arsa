/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class grg
extends gsb {
    private static final int a = 2;
    private static final amo b = amo.b("icon/draft_report");
    private int c;
    private final @Nullable yh d;
    private final boolean e;
    private final hnh f;
    private final yh t;
    private final List<gje> u = Lists.newArrayList();
    private @Nullable gje v;

    public grg(@Nullable yh $$0, boolean $$1, hnh $$2) {
        super(yh.c($$1 ? "deathScreen.title.hardcore" : "deathScreen.title"));
        this.d = $$0;
        this.e = $$1;
        this.f = $$2;
        yw $$3 = yh.b(Integer.toString($$2.gF())).a(l.o);
        this.t = yh.a("deathScreen.score.value", $$3);
    }

    @Override
    protected void bg_() {
        this.c = 0;
        this.u.clear();
        yw $$02 = this.e ? yh.c("deathScreen.spectate") : yh.c("deathScreen.respawn");
        this.u.add(this.c(gje.a($$02, (gje $$0) -> {
            this.f.o();
            $$0.k = false;
        }).a(this.o / 2 - 100, this.p / 4 + 72, 200, 20).a()));
        this.v = this.c(gje.a(yh.c("deathScreen.titleScreen"), (gje $$0) -> this.n.bb().a(this.n, this, this::o, true)).a(this.o / 2 - 100, this.p / 4 + 96, 200, 20).a());
        this.u.add(this.v);
        this.c(false);
    }

    @Override
    public boolean aY_() {
        return false;
    }

    private void o() {
        if (this.e) {
            this.p();
            return;
        }
        a $$02 = new a($$0 -> {
            if ($$0) {
                this.p();
            } else {
                this.f.o();
                this.n.a((gsb)null);
            }
        }, yh.c("deathScreen.quit.confirm"), yg.a, yh.c("deathScreen.titleScreen"), yh.c("deathScreen.respawn"));
        this.n.a($$02);
        $$02.a(20);
    }

    private void p() {
        if (this.n.r != null) {
            this.n.r.a(hif.a);
        }
        this.n.C();
        this.n.a(new gsd());
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        this.a($$0.a(gir.a.c));
        if (this.v != null && this.n.bb().c()) {
            $$0.a(hpa.at, b, this.v.aT_() + this.v.aS_() - 17, this.v.aU_() + 3, 15, 15);
        }
    }

    private void a(gil $$0) {
        gil.b $$1 = $$0.a();
        int $$2 = this.o / 2;
        $$0.a($$1.a(2.0f));
        $$0.a(git.b, $$2 / 2, 30, this.m);
        $$0.a($$1);
        if (this.d != null) {
            $$0.a(git.b, $$2, 85, this.d);
        }
        $$0.a(git.b, $$2, 100, this.t);
    }

    @Override
    public void b(gir $$0, int $$1, int $$2, float $$3) {
        grg.a($$0, this.o, this.p);
    }

    static void a(gir $$0, int $$1, int $$2) {
        $$0.a(0, 0, $$1, $$2, 0x60500000, -1602211792);
    }

    @Override
    public boolean a(gzc $$0, boolean $$1) {
        yf yf2;
        gil.a $$2 = new gil.a(this.C(), (int)$$0.u(), (int)$$0.v());
        this.a($$2);
        zf $$3 = $$2.b();
        if ($$3 != null && (yf2 = $$3.i()) instanceof yf.f) {
            yf.f $$4 = (yf.f)yf2;
            return grg.a(this.n, this, $$4.b());
        }
        return super.a($$0, $$1);
    }

    @Override
    public boolean ba_() {
        return false;
    }

    @Override
    public boolean bb_() {
        return true;
    }

    @Override
    public void e() {
        super.e();
        ++this.c;
        if (this.c == 20) {
            this.c(true);
        }
    }

    private void c(boolean $$0) {
        for (gje $$1 : this.u) {
            $$1.k = $$0;
        }
    }

    public static class a
    extends gra {
        public a(BooleanConsumer $$0, yh $$1, yh $$2, yh $$3, yh $$4) {
            super($$0, $$1, $$2, $$3, $$4);
        }

        @Override
        public void b(gir $$0, int $$1, int $$2, float $$3) {
            grg.a($$0, this.o, this.p);
        }
    }
}

