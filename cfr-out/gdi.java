/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class gdi
extends isc {
    private static final Logger b = LogUtils.getLogger();
    private static final yh c = yh.c("mco.selectServer.play");
    private final fzu F;
    private @Nullable gbg G;
    private @Nullable gaz H;
    private final Map<gbf, gbu> I = new LinkedHashMap<gbf, gbu>();
    private final long J;
    private boolean K;
    private final gmu L = new gmu($$1 -> {
        gjc cfr_ignored_0 = (gjc)this.c($$1);
    }, $$1 -> this.e((gmm)$$1), this::a, this::b);
    private @Nullable gje M;
    private @Nullable gmv N;
    final gou a = new gou(this);

    public gdi(fzu $$0, long $$12, @Nullable gbg $$2, @Nullable gaz $$3) {
        super(yh.i());
        this.F = $$0;
        this.J = $$12;
        this.G = $$2;
        this.H = $$3;
    }

    public gdi(fzu $$0, long $$1) {
        this($$0, $$1, null, null);
    }

    @Override
    public void bg_() {
        if (this.G == null) {
            this.a(this.J);
        }
        if (this.H == null) {
            this.l();
        }
        yw $$02 = yh.c("mco.configure.world.loading");
        this.N = gmv.a(this.L, this.o).a(new gms(this.C(), gdp.a, $$02), new gms(this.C(), gdk.a, $$02), new gms(this.C(), gdo.a, $$02), new gms(this.C(), gdm.a, $$02)).a();
        this.N.b(3, false);
        this.c(this.N);
        goy $$1 = this.a.b(goy.e().a(8));
        this.M = $$1.a(gje.a(c, (gje $$0) -> {
            this.aX_();
            fzu.a(this.G, this);
        }).a(150).a());
        this.M.k = false;
        $$1.a(gje.a(yg.k, (gje $$0) -> this.aX_()).a());
        this.a.a($$0 -> {
            $$0.e(1);
            this.c($$0);
        });
        this.N.a(0, false);
        this.c();
        if (this.G != null && this.H != null) {
            this.J();
        }
    }

    private void a(gmt $$0) {
        if (this.G != null && $$0 instanceof gdh) {
            gdh $$1 = (gdh)((Object)$$0);
            $$1.b(this.G);
        }
    }

    private void b(gmt $$0) {
        if (this.G != null && $$0 instanceof gdh) {
            gdh $$1 = (gdh)((Object)$$0);
            $$1.c(this.G);
        }
    }

    public int h() {
        return this.a.d();
    }

    public int j() {
        return this.a.c();
    }

    public gsb k() {
        return this.F;
    }

    public gsb a(gce $$0) {
        return new gcs($$0, (gsb)this.F);
    }

    @Override
    public void c() {
        if (this.N == null) {
            return;
        }
        this.N.a(this.o);
        this.N.h();
        int $$0 = this.N.aV_().c();
        gpm $$1 = new gpm(0, $$0, this.o, this.p - this.a.b() - $$0);
        this.L.a($$1);
        this.a.b($$0);
        this.a.a();
    }

    private void I() {
        if (this.G != null && this.M != null) {
            this.M.k = this.G.g();
            if (!this.M.k && this.G.f == gbg.c.a) {
                this.M.a(gks.a(gbg.a));
            }
        }
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        $$0.a(hpa.at, gsb.i, 0, this.p - this.a.b() - 2, 0.0f, 0.0f, this.o, 2, 32, 2);
    }

    @Override
    public boolean a(gzb $$0) {
        if (this.N.a($$0)) {
            return true;
        }
        return super.a($$0);
    }

    @Override
    protected void a(gir $$0) {
        $$0.a(hpa.at, gxx.a, 0, 0, 0.0f, 0.0f, this.o, this.a.c(), 16, 16);
        this.a($$0, 0, this.a.c(), this.o, this.p);
    }

    @Override
    public void aX_() {
        gmt gmt2;
        if (this.G != null && (gmt2 = this.L.a()) instanceof gdh) {
            gdh $$0 = (gdh)((Object)gmt2);
            $$0.c(this.G);
        }
        this.n.a(this.F);
        if (this.K) {
            this.F.h();
        }
    }

    public void l() {
        gdz.a(fzz::f, gdz.a(this::a, "Couldn't get realms region data")).thenAcceptAsync($$0 -> {
            this.H = $$0;
            this.J();
        }, (Executor)this.n);
    }

    public void a(long $$02) {
        gdz.a((fzz $$1) -> $$1.a($$02), gdz.a(this::a, "Couldn't get own world")).thenAcceptAsync($$0 -> {
            this.G = $$0;
            this.J();
        }, (Executor)this.n);
    }

    private void J() {
        if (this.G == null || this.H == null) {
            return;
        }
        this.I.clear();
        for (gbq $$0 : this.H.b()) {
            if ($$0.a() == gbf.x) continue;
            this.I.put($$0.a(), $$0.b());
        }
        int $$1 = -1;
        if (this.N != null) {
            $$1 = this.N.d().indexOf(this.L.a());
        }
        if (this.N != null) {
            this.e(this.N);
        }
        this.N = this.c(gmv.a(this.L, this.o).a(new gdp(this, Objects.requireNonNull(this.n), this.G), new gdk(this, this.n, this.G), new gdo(this, this.n, this.G), new gdm(this, this.n, this.G, this.I)).a());
        this.a(this.N);
        if ($$1 != -1) {
            this.N.a($$1, false);
        }
        this.N.b(3, !this.G.k);
        if (this.G.k) {
            this.N.a(3, gks.a(yh.c("mco.configure.world.settings.expired")));
        } else {
            this.N.a(3, (gks)null);
        }
        this.I();
        this.c();
    }

    public void a(gbk $$0) {
        gbk $$1 = this.G.j.get(this.G.q);
        $$0.b.g = $$1.b.g;
        $$0.b.h = $$1.b.h;
        fzz $$2 = fzz.a();
        try {
            if (this.G.q != $$0.a) {
                throw new gce(gab.b.d());
            }
            $$2.a(this.G.b, $$0.a, $$0.b, $$0.c);
            this.G.j.put(this.G.q, $$0);
            if ($$0.b.d != $$1.b.d || $$0.b() != $$1.b()) {
                fzu.g();
            }
            this.n();
        }
        catch (gce $$3) {
            b.error("Couldn't save slot settings", (Throwable)$$3);
            this.n.a(new gcs($$3, (gsb)this));
            return;
        }
        this.n.a(this);
    }

    public void a(String $$0, String $$1, gbs $$2, @Nullable gbf $$3) {
        String $$4 = bhi.h($$1) ? "" : $$1;
        String $$5 = bhi.h($$0) ? "" : $$0;
        fzz $$6 = fzz.a();
        try {
            gbk $$7 = this.G.j.get(this.G.q);
            gbf $$8 = $$2 == gbs.c ? $$3 : null;
            gbt $$9 = new gbt($$2, $$8);
            $$6.a(this.G.b, $$5, $$4, $$9, $$7.a, $$7.b, $$7.c);
            this.G.y = $$9;
            this.G.d = $$0;
            this.G.e = $$4;
            this.n();
        }
        catch (gce $$10) {
            b.error("Couldn't save settings", (Throwable)$$10);
            this.n.a(new gcs($$10, (gsb)this));
            return;
        }
        this.n.a(this);
    }

    public void a(boolean $$0) {
        gdi $$1 = this.a(this.G);
        this.n.a(new gcu(this.o(), new gei(this.G, $$1, $$0, this.n)));
    }

    public void m() {
        gdi $$0 = this.a(this.G);
        this.n.a(new gcu(this.o(), new ged(this.G, $$0)));
    }

    public void n() {
        this.K = true;
        if (this.N != null) {
            for (gmt $$0 : this.N.d()) {
                if (!($$0 instanceof gdh)) continue;
                gdh $$1 = (gdh)((Object)$$0);
                $$1.a(this.G);
            }
        }
    }

    public boolean a(long $$0, String $$1) {
        fzz $$2 = fzz.a();
        try {
            List<gay> $$3 = $$2.a($$0, $$1);
            if (this.G != null) {
                this.G.i = $$3;
            } else {
                this.G = $$2.a($$0);
            }
            this.n();
        }
        catch (gce $$4) {
            b.error("Couldn't invite user", (Throwable)$$4);
            return false;
        }
        return true;
    }

    public gdi o() {
        gdi $$0 = new gdi(this.F, this.J);
        $$0.K = this.K;
        return $$0;
    }

    public gdi a(gbg $$0) {
        gdi $$1 = new gdi(this.F, this.J, $$0, this.H);
        $$1.K = this.K;
        return $$1;
    }
}

