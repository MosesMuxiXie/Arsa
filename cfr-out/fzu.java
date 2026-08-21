/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.util.concurrent.RateLimiter
 *  com.mojang.logging.LogUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class fzu
extends isc {
    static final amo b = amo.b("icon/info");
    static final amo c = amo.b("icon/new_realm");
    static final amo F = amo.b("realm_status/expired");
    static final amo G = amo.b("realm_status/expires_soon");
    static final amo H = amo.b("realm_status/open");
    static final amo I = amo.b("realm_status/closed");
    private static final amo J = amo.b("icon/invite");
    private static final amo K = amo.b("icon/news");
    public static final amo a = amo.b("hud/heart/hardcore_full");
    static final Logger L = LogUtils.getLogger();
    private static final amo M = amo.b("textures/gui/realms/no_realms.png");
    private static final yh N = yh.c("menu.online");
    private static final yh O = yh.c("mco.selectServer.loading");
    static final yh P = yh.c("mco.selectServer.uninitialized");
    static final yh Q = yh.c("mco.selectServer.expiredList");
    private static final yh R = yh.c("mco.selectServer.expiredRenew");
    static final yh S = yh.c("mco.selectServer.expiredTrial");
    private static final yh T = yh.c("mco.selectServer.play");
    private static final yh U = yh.c("mco.selectServer.leave");
    private static final yh V = yh.c("mco.selectServer.configure");
    static final yh W = yh.c("mco.selectServer.expired");
    static final yh X = yh.c("mco.selectServer.expires.soon");
    static final yh Y = yh.c("mco.selectServer.expires.day");
    static final yh Z = yh.c("mco.selectServer.open");
    static final yh aa = yh.c("mco.selectServer.closed");
    static final yh ab = yh.a("gui.narrate.button", P);
    private static final yh ac = yh.c("mco.selectServer.noRealms");
    private static final yh ad = yh.c("mco.invites.nopending");
    private static final yh ae = yh.c("mco.invites.pending");
    private static final yh af = yh.c("mco.compatibility.incompatible.popup.title");
    private static final yh ag = yh.c("mco.compatibility.incompatible.releaseType.popup.message");
    private static final int ah = 100;
    private static final int ai = 3;
    private static final int aj = 4;
    private static final int ak = 308;
    private static final int al = 5;
    private static final int am = 44;
    private static final int an = 11;
    private static final int ao = 40;
    private static final int ap = 20;
    private static final boolean aq;
    private static boolean ar;
    private final CompletableFuture<fzt.a> as = fzt.a();
    private @Nullable gds.c at;
    private final Set<UUID> au = new HashSet<UUID>();
    private static boolean av;
    private final RateLimiter aw;
    private final gsb ax;
    private gje ay;
    private gje az;
    private gje aA;
    private gje aB;
    private gje aC;
    h aD;
    gcj aE;
    List<gbg> aF = List.of();
    gbi aG = new gbi(Map.of());
    private volatile boolean aH;
    private volatile @Nullable String aI;
    final List<gbe> aJ = new ArrayList<gbe>();
    private gje aK;
    private e aL;
    private e aM;
    private d aN;
    private @Nullable gou aO;

    public fzu(gsb $$0) {
        super(N);
        this.ax = $$0;
        this.aw = RateLimiter.create((double)0.01666666753590107);
    }

    @Override
    public void bg_() {
        this.aE = new gcj(this.n);
        this.aD = new h();
        yw $$02 = yh.c("mco.invites.title");
        this.aL = new e($$02, J, $$1 -> this.n.a(new gcx(this, $$02)), null);
        yw $$12 = yh.c("mco.news");
        this.aM = new e($$12, K, $$0 -> {
            String $$1 = this.aI;
            if ($$1 == null) {
                return;
            }
            gqz.a((gsb)this, $$1);
            if (this.aM.a() != 0) {
                gdx.a $$2 = gdx.b();
                $$2.b = false;
                gdx.b($$2);
                this.aM.a(0);
            }
        }, $$12);
        this.ay = gje.a(T, (gje $$0) -> fzu.a(this.P(), this)).a(100).a();
        this.aB = gje.a(V, (gje $$0) -> this.e(this.P())).a(100).a();
        this.aA = gje.a(R, (gje $$0) -> this.d(this.P())).a(100).a();
        this.aC = gje.a(U, (gje $$0) -> this.f(this.P())).a(100).a();
        this.aK = gje.a(yh.c("mco.selectServer.purchase"), (gje $$0) -> this.Q()).b(100, 20).a();
        this.az = gje.a(yg.k, (gje $$0) -> this.aX_()).a(100).a();
        if (fzz.a == fzz.b.b) {
            this.c(gjl.a((yh)yh.b("Snapshot"), (yh)yh.b("Release"), ar).a(5, 5, 100, 20, yh.b("Realm"), ($$0, $$1) -> {
                ar = $$1;
                this.aF = List.of();
                this.L();
            }));
        }
        this.a(fzu$d.a);
        this.K();
        this.as.thenAcceptAsync($$0 -> {
            gsb $$1 = $$0.a(this.ax);
            if ($$1 == null) {
                this.at = this.a(this.n.bc());
            } else {
                this.n.a($$1);
            }
        }, this.s);
    }

    public static boolean b() {
        return aq && ar;
    }

    @Override
    protected void c() {
        if (this.aO != null) {
            this.aD.a(this.o, this.aO);
            this.aO.a();
        }
    }

    @Override
    public void aX_() {
        this.n.a(this.ax);
    }

    private void o() {
        if (this.aE.a() && this.aF.isEmpty() && this.aJ.isEmpty()) {
            this.a(fzu$d.b);
        } else {
            this.a(fzu$d.c);
        }
    }

    private void a(d $$0) {
        if (this.aN == $$0) {
            return;
        }
        if (this.aO != null) {
            this.aO.a($$1 -> this.e((gmm)$$1));
        }
        this.aO = this.b($$0);
        this.aN = $$0;
        this.aO.a($$1 -> {
            gjc cfr_ignored_0 = (gjc)this.c($$1);
        });
        this.c();
    }

    private gou b(d $$0) {
        gou $$1 = new gou(this);
        $$1.b(44);
        $$1.a(this.I());
        gov $$2 = this.c($$0);
        $$2.a();
        $$1.a($$2.aR_() + 22);
        $$1.b($$2);
        switch ($$0.ordinal()) {
            case 0: {
                $$1.c(new gju(this.q, O));
                break;
            }
            case 1: {
                $$1.c(this.J());
                break;
            }
            case 2: {
                $$1.c(this.aD);
            }
        }
        return $$1;
    }

    private gov I() {
        int $$0 = 90;
        goy $$1 = goy.e().a(4);
        $$1.c().e();
        $$1.a(this.aL);
        $$1.a(this.aM);
        goy $$2 = goy.e();
        $$2.c().e();
        $$2.a(goz.a(90));
        $$2.a(fzu.F(), gox::b);
        $$2.a(new gos(90, 44)).a($$1, gox::c);
        return $$2;
    }

    private gov c(d $$0) {
        got $$1 = new got().c(4);
        got.b $$2 = $$1.d(3);
        if ($$0 == fzu$d.c) {
            $$2.a(this.ay);
            $$2.a(this.aB);
            $$2.a(this.aA);
            $$2.a(this.aC);
        }
        $$2.a(this.aK);
        $$2.a(this.az);
        return $$1;
    }

    private goy J() {
        goy $$0 = goy.d().a(8);
        $$0.c().b();
        $$0.a(gjr.a(130, 64, M, 130, 64));
        $$0.a(gjp.a(ac, this.q).a(308).a(false).a(gjp.a.b).a());
        return $$0;
    }

    void K() {
        gbg $$0 = this.P();
        boolean $$1 = $$0 != null;
        this.aK.k = this.aN != fzu$d.a;
        boolean bl2 = this.ay.k = $$1 && $$0.g();
        if (!this.ay.k && $$1 && $$0.f == gbg.c.a) {
            this.ay.a(gks.a(gbg.a));
        }
        this.aA.k = $$1 && this.a($$0);
        this.aC.k = $$1 && this.c($$0);
        this.aB.k = $$1 && this.b($$0);
    }

    private boolean a(gbg $$0) {
        return $$0.k && fzu.h($$0);
    }

    private boolean b(gbg $$0) {
        return fzu.h($$0) && $$0.f != gbg.c.c;
    }

    private boolean c(gbg $$0) {
        return !fzu.h($$0);
    }

    @Override
    public void e() {
        super.e();
        if (this.at != null) {
            this.at.b();
        }
    }

    public static void f() {
        gfj.V().bc().d.a();
    }

    public static void g() {
        gfj.V().bc().c.a();
    }

    private void L() {
        for (gds.e<?> $$0 : this.n.bc().a()) {
            $$0.a();
        }
    }

    private gds.c a(gch $$02) {
        gds.c $$12 = $$02.a.a();
        $$12.a($$02.c, (T $$0) -> {
            this.aE.a($$0.a());
            this.aF = $$0.b();
            this.M();
            boolean $$1 = false;
            for (gbg $$2 : this.aE) {
                if (!this.i($$2)) continue;
                $$1 = true;
            }
            if (!av && $$1) {
                av = true;
                this.N();
            }
        });
        fzu.a(fzz::e, (T $$0) -> {
            this.aJ.clear();
            this.aJ.addAll((Collection<gbe>)$$0);
            for (gbe $$1 : $$0) {
                gbe.a $$2;
                gkh $$3;
                if (!($$1 instanceof gbe.a) || ($$3 = ($$2 = (gbe.a)$$1).a(this, this::a)) == null) continue;
                this.n.a($$3);
                this.a((Collection<gbe>)List.of($$1));
                break;
            }
            if (!this.aJ.isEmpty() && this.aN != fzu$d.a) {
                this.M();
            }
        });
        $$12.a($$02.d, (T $$0) -> {
            this.aL.a((int)$$0);
            this.aL.a($$0 == 0 ? gks.a(ad) : gks.a(ae));
            if ($$0 > 0 && this.aw.tryAcquire(1)) {
                this.n.aZ().d(yh.a("mco.configure.world.invite.narration", $$0));
            }
        });
        $$12.a($$02.e, (T $$0) -> {
            this.aH = $$0;
        });
        $$12.a($$02.g, (T $$0) -> {
            this.aG = $$0;
        });
        $$12.a($$02.f, (T $$1) -> {
            $$0.h.a((gbd)$$1);
            this.aI = $$0.h.b();
            this.aM.a($$0.h.a() ? Integer.MAX_VALUE : 0);
        });
        return $$12;
    }

    void a(Collection<gbe> $$0) {
        ArrayList<UUID> $$12 = new ArrayList<UUID>($$0.size());
        for (gbe $$2 : $$0) {
            if ($$2.a() || this.au.contains($$2.c())) continue;
            $$12.add($$2.c());
        }
        if (!$$12.isEmpty()) {
            fzu.a((fzz $$1) -> {
                $$1.a($$12);
                return null;
            }, (T $$1) -> this.au.addAll($$12));
        }
    }

    private static <T> void a(i<T> $$02, Consumer<T> $$1) {
        gfj $$2 = gfj.V();
        ((CompletableFuture)CompletableFuture.supplyAsync(() -> {
            try {
                return $$02.request(fzz.a($$2));
            }
            catch (gce $$2) {
                throw new RuntimeException($$2);
            }
        }).thenAcceptAsync($$1, (Executor)$$2)).exceptionally($$0 -> {
            L.error("Failed to execute call to Realms Service", $$0);
            return null;
        });
    }

    private void M() {
        this.aD.a(this);
        this.o();
        this.K();
    }

    private void N() {
        new Thread(() -> {
            List<gbr> $$0 = fzy.a();
            fzz $$1 = fzz.a();
            gax $$2 = new gax($$0, this.O());
            try {
                $$1.a($$2);
            }
            catch (Throwable $$3) {
                L.warn("Could not send ping result to Realms: ", $$3);
            }
        }).start();
    }

    private List<Long> O() {
        ArrayList $$0 = Lists.newArrayList();
        for (gbg $$1 : this.aE) {
            if (!this.i($$1)) continue;
            $$0.add($$1.b);
        }
        return $$0;
    }

    private void d(@Nullable gbg $$0) {
        if ($$0 != null) {
            String $$12 = bez.a($$0.c, this.n.ac().b(), $$0.l);
            this.n.a(new gqz($$1 -> {
                if ($$1) {
                    bhs.n().a($$12);
                } else {
                    this.n.a(this);
                }
            }, $$12, true));
        }
    }

    private void e(@Nullable gbg $$0) {
        if ($$0 != null && this.n.b($$0.h)) {
            this.n.a(new gdi(this, $$0.b));
        }
    }

    private void f(@Nullable gbg $$0) {
        if ($$0 != null && !this.n.b($$0.h)) {
            yw $$12 = yh.c("mco.configure.world.leave.question.line1");
            this.n.a(gcy.a(this, $$12, (gkh $$1) -> this.g($$0)));
        }
    }

    private @Nullable gbg P() {
        Object e2 = this.aD.q();
        if (e2 instanceof j) {
            j $$0 = (j)e2;
            return $$0.c();
        }
        return null;
    }

    private void g(final gbg $$0) {
        new Thread("Realms-leave-server"){

            @Override
            public void run() {
                try {
                    fzz $$02 = fzz.a();
                    $$02.c($$0.b);
                    fzu.this.n.execute(fzu::g);
                }
                catch (gce $$1) {
                    L.error("Couldn't configure world", (Throwable)$$1);
                    fzu.this.n.execute(() -> fzu.this.n.a(new gcs($$1, (gsb)fzu.this)));
                }
            }
        }.start();
        this.n.a(this);
    }

    void a(UUID $$0) {
        fzu.a((fzz $$1) -> {
            $$1.b(List.of($$0));
            return null;
        }, (T $$12) -> {
            this.aJ.removeIf($$1 -> $$1.b() && $$0.equals($$1.c()));
            this.M();
        });
    }

    public void h() {
        this.aD.a((c)null);
        fzu.g();
    }

    @Override
    public yh i() {
        return switch (this.aN.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> yg.a(new yh[]{super.i(), O});
            case 1 -> yg.a(new yh[]{super.i(), ac});
            case 2 -> super.i();
        };
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        if (fzu.b()) {
            $$0.b(this.q, "Minecraft " + w.b().c(), 2, this.p - 10, -1);
        }
        if (this.aH && this.aK.k) {
            gcm.a($$0, this.aK);
        }
        switch (fzz.a) {
            case b: {
                this.a($$0, "STAGE!", -256);
                break;
            }
            case c: {
                this.a($$0, "LOCAL!", -8388737);
            }
        }
    }

    private void Q() {
        this.n.a(new gcm(this, this.aH));
    }

    public static void a(@Nullable gbg $$0, gsb $$1) {
        fzu.a($$0, $$1, false);
    }

    public static void a(@Nullable gbg $$0, gsb $$1, boolean $$2) {
        if ($$0 != null) {
            if (!fzu.b() || $$2 || $$0.j()) {
                gfj.V().a(new gcu($$1, new geg($$1, $$0)));
                return;
            }
            switch ($$0.x) {
                case f: {
                    gfj.V().a(new gcu($$1, new geg($$1, $$0)));
                    break;
                }
                case a: {
                    fzu.a($$0, $$1, yh.c("mco.compatibility.unverifiable.title").b(-171), yh.c("mco.compatibility.unverifiable.message"), yg.j);
                    break;
                }
                case d: {
                    fzu.a($$0, $$1, yh.c("selectWorld.backupQuestion.downgrade").b(-2142128), yh.a("mco.compatibility.downgrade.description", yh.b($$0.w).b(-171), yh.b(w.b().c()).b(-171)), yh.c("mco.compatibility.downgrade"));
                    break;
                }
                case e: {
                    fzu.b($$0, $$1);
                    break;
                }
                case b: {
                    gfj.V().a(new gkh.a($$1, af).a(yh.a("mco.compatibility.incompatible.series.popup.message", yh.b($$0.w).b(-171), yh.b(w.b().c()).b(-171))).a(yg.k, gkh::aX_).a());
                    break;
                }
                case c: {
                    gfj.V().a(new gkh.a($$1, af).a(ag).a(yg.k, gkh::aX_).a());
                }
            }
        }
    }

    private static void a(gbg $$0, gsb $$1, yh $$22, yh $$3, yh $$4) {
        gfj.V().a(new gkh.a($$1, $$22).a($$3).a($$4, (gkh $$2) -> {
            gfj.V().a(new gcu($$1, new geg($$1, $$0)));
            fzu.g();
        }).a(yg.e, gkh::aX_).a());
    }

    private static void b(gbg $$0, gsb $$1) {
        yw $$2 = yh.c("mco.compatibility.upgrade.title").b(-171);
        yw $$3 = yh.c("mco.compatibility.upgrade");
        yw $$4 = yh.b($$0.w).b(-171);
        yw $$5 = yh.b(w.b().c()).b(-171);
        yw $$6 = fzu.h($$0) ? yh.a("mco.compatibility.upgrade.description", $$4, $$5) : yh.a("mco.compatibility.upgrade.friend.description", $$4, $$5);
        fzu.a($$0, $$1, $$2, $$6, $$3);
    }

    public static yh a(String $$0, boolean $$1) {
        return fzu.a($$0, $$1 ? -8355712 : -2142128);
    }

    public static yh a(String $$0, int $$1) {
        if (StringUtils.isBlank((CharSequence)$$0)) {
            return yg.a;
        }
        return yh.b($$0).b($$1);
    }

    public static yh a(int $$0, boolean $$1) {
        if ($$1) {
            return yh.c("gameMode.hardcore").b(-65536);
        }
        return dwl.a($$0).d();
    }

    static boolean h(gbg $$0) {
        return gfj.V().b($$0.h);
    }

    private boolean i(gbg $$0) {
        return fzu.h($$0) && !$$0.k;
    }

    private void a(gir $$0, String $$1, int $$2) {
        $$0.e().pushMatrix();
        $$0.e().translate((float)(this.o / 2 - 25), 20.0f);
        $$0.e().rotate(-0.34906584f);
        $$0.e().scale(1.5f, 1.5f);
        $$0.b(this.q, $$1, 0, 0, $$2);
        $$0.e().popMatrix();
    }

    static {
        ar = aq = !w.b().f();
    }

    class h
    extends gkb<c> {
        public h() {
            super(gfj.V(), fzu.this.o, fzu.this.p, 0, 36);
        }

        @Override
        public void a(@Nullable c $$0) {
            super.a($$0);
            fzu.this.K();
        }

        @Override
        public int a() {
            return 300;
        }

        @Override
        void a(fzu $$0) {
            c $$1 = (c)this.q();
            this.s();
            for (gbe $$2 : fzu.this.aJ) {
                if (!($$2 instanceof gbe.c)) continue;
                gbe.c $$3 = (gbe.c)$$2;
                this.a($$3, $$0, $$1);
                fzu.this.a((Collection<gbe>)List.of($$2));
                break;
            }
            this.b($$1);
        }

        private void a(gbe.c $$0, fzu $$1, @Nullable c $$2) {
            f $$6;
            yh $$3 = $$0.d();
            int $$4 = fzu.this.q.b($$3, fzu$f.e(this.a()));
            f $$5 = new f($$1, $$4, $$3, $$0);
            this.a($$5, 38 + $$4);
            if ($$2 instanceof f && ($$6 = (f)$$2).c().equals($$3)) {
                this.a($$5);
            }
        }

        @Override
        private void b(@Nullable c $$0) {
            for (gbg $$1 : fzu.this.aF) {
                this.c(new a($$1));
            }
            for (gbg $$2 : fzu.this.aE) {
                j $$4;
                if (fzu.b() && !$$2.i()) {
                    if ($$2.f == gbg.c.c) continue;
                    g $$3 = new g(fzu.this, $$2);
                } else {
                    $$4 = new j($$2);
                }
                this.c($$4);
                if (!($$0 instanceof j)) continue;
                j $$5 = (j)$$0;
                if ($$5.k.b != $$2.b) continue;
                this.a($$4);
            }
        }
    }

    static class e
    extends gkn.b {
        private static final amo[] d = new amo[]{amo.b("notification/1"), amo.b("notification/2"), amo.b("notification/3"), amo.b("notification/4"), amo.b("notification/5"), amo.b("notification/more")};
        private static final int u = Integer.MAX_VALUE;
        private static final int v = 20;
        private static final int w = 14;
        private int x;

        public e(yh $$0, amo $$1, gje.c $$2, @Nullable yh $$3) {
            super(20, 20, $$0, 14, 14, new gku($$1), $$2, $$3, null);
        }

        int a() {
            return this.x;
        }

        public void a(int $$0) {
            this.x = $$0;
        }

        @Override
        public void b(gir $$0, int $$1, int $$2, float $$3) {
            super.b($$0, $$1, $$2, $$3);
            if (this.k && this.x != 0) {
                this.b($$0);
            }
        }

        private void b(gir $$0) {
            $$0.a(hpa.at, d[Math.min(this.x, 6) - 1], this.aT_() + this.aS_() - 5, this.aU_() - 3, 8, 8);
        }
    }

    static final class d
    extends Enum<d> {
        public static final /* enum */ d a = new d();
        public static final /* enum */ d b = new d();
        public static final /* enum */ d c = new d();
        private static final /* synthetic */ d[] d;

        public static d[] values() {
            return (d[])d.clone();
        }

        public static d valueOf(String $$0) {
            return Enum.valueOf(d.class, $$0);
        }

        private static /* synthetic */ d[] a() {
            return new d[]{a, b, c};
        }

        static {
            d = fzu$d.a();
        }
    }

    static interface i<T> {
        public T request(fzz var1) throws gce;
    }

    class j
    extends c {
        private static final yh f = yh.c("mco.onlinePlayers");
        private static final int g = 9;
        private static final int i = 3;
        private static final int j = 36;
        final gbg k;
        private final gkv l;

        public j(gbg $$0) {
            this.l = new gkv();
            this.k = $$0;
            boolean $$1 = fzu.h($$0);
            if (fzu.b() && $$1 && $$0.i()) {
                this.l.a(gks.a(yh.a("mco.snapshot.paired", new Object[]{$$0.v})));
            } else if (!$$1 && $$0.f()) {
                this.l.a(gks.a(yh.a("mco.snapshot.friendsRealm.downgrade", new Object[]{$$0.w})));
            }
        }

        @Override
        public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
            if (this.k.f == gbg.c.c) {
                $$0.a(hpa.at, c, this.d() - 5, this.j() - 10, 40, 20);
                int $$5 = this.j() - ((fzu)fzu.this).q.b / 2;
                $$0.b(fzu.this.q, P, this.d() + 40 - 2, $$5, -8388737);
                return;
            }
            gdz.a($$0, this.d(), this.h(), 32, this.k.h);
            this.a($$0, this.h(), this.d(), this.l(), -1, this.k);
            this.a($$0, this.h(), this.d(), this.l(), this.k);
            this.a($$0, this.h(), this.d(), this.k);
            this.a(this.k, $$0, this.n(), this.h(), $$1, $$2);
            boolean $$6 = this.a($$0, this.h(), this.d(), this.l(), this.i(), $$1, $$2, $$4);
            if (!$$6) {
                this.l.a($$0, $$1, $$2, $$3, this.aP_(), new gpm(this.d(), this.h(), this.l(), this.i()));
            }
        }

        private boolean a(gir $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, float $$7) {
            List<doy> $$8 = fzu.this.aG.a(this.k.b);
            int $$9 = $$8.size();
            if ($$9 > 0) {
                List $$15;
                int $$10 = $$2 + $$3 - 21;
                int $$11 = $$1 + $$4 - 9 - 2;
                int $$12 = 9 * $$9 + 3 * ($$9 - 1);
                int $$13 = $$10 - $$12;
                if ($$5 >= $$13 && $$5 <= $$10 && $$6 >= $$11 && $$6 <= $$11 + 9) {
                    ArrayList $$14 = new ArrayList($$9);
                } else {
                    $$15 = null;
                }
                hou $$16 = fzu.this.n.bg();
                for (int $$17 = 0; $$17 < $$8.size(); ++$$17) {
                    doy $$18 = $$8.get($$17);
                    hou.a $$19 = $$16.a($$18);
                    int $$20 = $$13 + 12 * $$17;
                    gke.a($$0, $$19.b(), $$20, $$11, 9);
                    if ($$15 == null) continue;
                    $$15.add($$19);
                }
                if ($$15 != null) {
                    $$0.a(fzu.this.q, List.of(f), Optional.of(new gvf.a($$15)), $$5, $$6);
                    return true;
                }
            }
            return false;
        }

        private void e() {
            fzu.this.n.ap().a(iph.a(bda.DJ, 1.0f));
            fzu.a(this.k, fzu.this);
        }

        private void f() {
            fzu.this.n.ap().a(iph.a(bda.DJ, 1.0f));
            gcq $$0 = new gcq(fzu.this, this.k, this.k.i());
            fzu.this.n.a($$0);
        }

        @Override
        public boolean a(gzc $$0, boolean $$1) {
            if (this.k.f == gbg.c.c) {
                this.f();
            } else if (this.k.g() && $$1 && this.aP_()) {
                this.e();
            }
            return true;
        }

        @Override
        public boolean a(gzb $$0) {
            if ($$0.c()) {
                if (this.k.f == gbg.c.c) {
                    this.f();
                    return true;
                }
                if (this.k.g()) {
                    this.e();
                    return true;
                }
            }
            return super.a($$0);
        }

        @Override
        public yh a() {
            if (this.k.f == gbg.c.c) {
                return ab;
            }
            return yh.a("narrator.select", new Object[]{Objects.requireNonNullElse(this.k.d, "unknown server")});
        }

        public gbg c() {
            return this.k;
        }
    }

    abstract class c
    extends gkb.a<c> {
        protected static final int b = 10;
        private static final int a = 28;
        protected static final int c = 7;
        protected static final int d = 2;

        c() {
        }

        protected void a(gbg $$0, gir $$1, int $$2, int $$3, int $$4, int $$5) {
            int $$6 = $$2 - 10 - 7;
            int $$7 = $$3 + 2;
            if ($$0.k) {
                this.a($$1, $$6, $$7, $$4, $$5, F, () -> W);
            } else if ($$0.f == gbg.c.a) {
                this.a($$1, $$6, $$7, $$4, $$5, I, () -> aa);
            } else if (fzu.h($$0) && $$0.m < 7) {
                this.a($$1, $$6, $$7, $$4, $$5, G, () -> {
                    if ($$0.m <= 0) {
                        return X;
                    }
                    if ($$0.m == 1) {
                        return Y;
                    }
                    return yh.a("mco.selectServer.expires.days", $$0.m);
                });
            } else if ($$0.f == gbg.c.b) {
                this.a($$1, $$6, $$7, $$4, $$5, H, () -> Z);
            }
        }

        private void a(gir $$0, int $$1, int $$2, int $$3, int $$4, amo $$5, Supplier<yh> $$6) {
            $$0.a(hpa.at, $$5, $$1, $$2, 10, 28);
            if (fzu.this.aD.a_($$3, $$4) && $$3 >= $$1 && $$3 <= $$1 + 10 && $$4 >= $$2 && $$4 <= $$2 + 28) {
                $$0.a($$6.get(), $$3, $$4);
            }
        }

        protected void a(gir $$0, int $$1, int $$2, int $$3, int $$4, gbg $$5) {
            int $$6 = this.b($$2);
            int $$7 = this.a($$1);
            yh $$8 = fzu.a($$5.w, $$5.d());
            int $$9 = this.a($$2, $$3, $$8);
            this.a($$0, $$5.b(), $$6, $$7, $$9, $$4);
            if ($$8 != yg.a && !$$5.j()) {
                $$0.b(fzu.this.q, $$8, $$9, $$7, -8355712);
            }
        }

        protected void a(gir $$0, int $$1, int $$2, int $$3, gbg $$4) {
            int $$5 = this.b($$2);
            int $$6 = this.a($$1);
            int $$7 = this.c($$6);
            String $$8 = $$4.c();
            boolean $$9 = $$4.j();
            if ($$9 && $$8 != null) {
                yw $$10 = yh.b($$8).a(l.h);
                $$0.b(fzu.this.q, yh.a("mco.selectServer.minigameName", $$10).b(-171), $$5, $$7, -1);
            } else {
                int $$11 = this.a($$4, $$0, $$2, $$3, $$6);
                this.a($$0, $$4.a(), $$5, this.c($$6), $$11, -8355712);
            }
        }

        protected void a(gir $$0, int $$1, int $$2, gbg $$3) {
            int $$4 = this.b($$2);
            int $$5 = this.a($$1);
            int $$6 = this.d($$5);
            if (!fzu.h($$3)) {
                $$0.b(fzu.this.q, $$3.g, $$4, this.d($$5), -8355712);
            } else if ($$3.k) {
                yh $$7 = $$3.l ? S : Q;
                $$0.b(fzu.this.q, $$7, $$4, $$6, -2142128);
            }
        }

        protected void a(gir $$0, @Nullable String $$1, int $$2, int $$3, int $$4, int $$5) {
            if ($$1 == null) {
                return;
            }
            int $$6 = $$4 - $$2;
            if (fzu.this.q.b($$1) > $$6) {
                String $$7 = fzu.this.q.a($$1, $$6 - fzu.this.q.b("... "));
                $$0.b(fzu.this.q, $$7 + "...", $$2, $$3, $$5);
            } else {
                $$0.b(fzu.this.q, $$1, $$2, $$3, $$5);
            }
        }

        protected int a(int $$0, int $$1, yh $$2) {
            return $$0 + $$1 - fzu.this.q.a($$2) - 20;
        }

        protected int b(int $$0, int $$1, yh $$2) {
            return $$0 + $$1 - fzu.this.q.a($$2) - 20;
        }

        protected int a(gbg $$0, gir $$1, int $$2, int $$3, int $$4) {
            boolean $$5 = $$0.o;
            int $$6 = $$0.p;
            int $$7 = $$2;
            if (dwl.c($$6)) {
                yh $$8 = fzu.a($$6, $$5);
                $$7 = this.b($$2, $$3, $$8);
                $$1.b(fzu.this.q, $$8, $$7, this.c($$4), -8355712);
            }
            if ($$5) {
                $$1.a(hpa.at, a, $$7 -= 10, this.c($$4), 8, 8);
            }
            return $$7;
        }

        protected int a(int $$0) {
            return $$0 + 1;
        }

        protected int b() {
            return 2 + ((fzu)fzu.this).q.b;
        }

        protected int b(int $$0) {
            return $$0 + 36 + 2;
        }

        protected int c(int $$0) {
            return $$0 + this.b();
        }

        protected int d(int $$0) {
            return $$0 + this.b() * 2;
        }
    }

    static class b
    extends gjq {
        private static final gku b = new gku(amo.b("widget/cross_button"), amo.b("widget/cross_button_highlighted"));

        protected b(gje.c $$0, yh $$1) {
            super(0, 0, 14, 14, b, $$0);
            this.a(gks.a($$1));
        }
    }

    class g
    extends c {
        private final gbg a;
        private final gkv f = new gkv();

        public g(fzu fzu2, gbg $$0) {
            this.a = $$0;
            if (!$$0.k) {
                this.f.a(gks.a(yh.c("mco.snapshot.parent.tooltip")));
            }
        }

        @Override
        public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
            this.a(this.a, $$0, this.n(), this.h(), $$1, $$2);
            gdz.a($$0, this.d(), this.h(), 32, this.a.h);
            this.a($$0, this.h(), this.d(), this.l(), -8355712, this.a);
            this.a($$0, this.h(), this.d(), this.l(), this.a);
            this.a($$0, this.h(), this.d(), this.a);
            this.f.a($$0, $$1, $$2, $$3, this.aP_(), new gpm(this.d(), this.h(), this.l(), this.i()));
        }

        @Override
        public yh a() {
            return yh.b(Objects.requireNonNullElse(this.a.d, "unknown server"));
        }
    }

    class a
    extends c {
        private static final yh f = yh.c("mco.snapshot.start");
        private static final int g = 5;
        private final gkv i = new gkv();
        private final gbg j;

        public a(gbg $$0) {
            this.j = $$0;
            this.i.a(gks.a(yh.c("mco.snapshot.tooltip")));
        }

        @Override
        public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$4) {
            $$0.a(hpa.at, c, this.d() - 5, this.j() - 10, 40, 20);
            int $$5 = this.j() - ((fzu)fzu.this).q.b / 2;
            $$0.b(fzu.this.q, f, this.d() + 40 - 2, $$5 - 5, -8388737);
            $$0.b(fzu.this.q, yh.a("mco.snapshot.description", new Object[]{Objects.requireNonNullElse(this.j.d, "unknown server")}), this.d() + 40 - 2, $$5 + 5, -8355712);
            this.i.a($$0, $$1, $$2, $$3, this.aP_(), new gpm(this.d(), this.h(), this.l(), this.i()));
        }

        @Override
        public boolean a(gzc $$0, boolean $$1) {
            this.c();
            return true;
        }

        @Override
        public boolean a(gzb $$0) {
            if ($$0.c()) {
                this.c();
                return false;
            }
            return super.a($$0);
        }

        private void c() {
            fzu.this.n.ap().a(iph.a(bda.DJ, 1.0f));
            fzu.this.n.a(new gkh.a(fzu.this, yh.c("mco.snapshot.createSnapshotPopup.title")).a(yh.c("mco.snapshot.createSnapshotPopup.text")).a(yh.c("mco.selectServer.create"), $$0 -> fzu.this.n.a(new gcq(fzu.this, this.j, true))).a(yg.e, gkh::aX_).a());
        }

        @Override
        public yh a() {
            return yh.a("gui.narrate.button", yg.a(new yh[]{f, yh.a("mco.snapshot.description", new Object[]{Objects.requireNonNullElse(this.j.d, "unknown server")})}));
        }
    }

    class f
    extends c {
        private static final int i = 40;
        public static final int a = 7;
        public static final int f = 38;
        private final yh j;
        private final List<gjc> k = new ArrayList<gjc>();
        private final @Nullable b l;
        private final gjz m;
        private final got n;
        private final gos o;
        private final gje p;
        private int q = -1;

        public f(fzu $$0, int $$12, yh $$2, gbe.c $$3) {
            this.j = $$2;
            this.n = new got();
            this.n.a(gjr.a(20, 20, b), 0, 0, this.n.b().a(7, 7, 0, 0));
            this.n.a(goz.a(40), 0, 0);
            this.o = this.n.a(new gos(0, $$12), 0, 1, this.n.b().c(7));
            this.m = this.o.a(new gjz($$2, fzu.this.q).a(true), this.o.b().b().d());
            this.n.a(goz.a(40), 0, 2);
            this.l = $$3.b() ? this.n.a(new b($$1 -> fzu.this.a($$3.c()), yh.c("mco.notification.dismiss")), 0, 2, this.n.b().c().a(0, 7, 7, 0)) : null;
            this.p = this.n.a($$3.a($$0), 1, 1, this.n.b().b().a(4));
            this.p.a(() -> this.aP_());
            this.n.a(this.k::add);
        }

        @Override
        public boolean a(gzb $$0) {
            if (this.p.a($$0)) {
                return true;
            }
            if (this.l != null && this.l.a($$0)) {
                return true;
            }
            return super.a($$0);
        }

        private void e() {
            int $$0 = this.aS_();
            if (this.q != $$0) {
                this.j($$0);
                this.q = $$0;
            }
        }

        private void j(int $$0) {
            int $$1 = fzu$f.e($$0);
            this.o.b($$1);
            this.m.a($$1);
            this.n.a();
        }

        public static int e(int $$0) {
            return $$0 - 80;
        }

        @Override
        public void a(gir $$0, int $$1, int $$2, boolean $$3, float $$42) {
            this.n.c(this.d(), this.h());
            this.e();
            this.k.forEach($$4 -> $$4.a($$0, $$1, $$2, $$42));
        }

        @Override
        public boolean a(gzc $$0, boolean $$1) {
            if (this.l != null && this.l.a($$0, $$1)) {
                return true;
            }
            if (this.p.a($$0, $$1)) {
                return true;
            }
            return super.a($$0, $$1);
        }

        public yh c() {
            return this.j;
        }

        @Override
        public yh a() {
            return this.c();
        }
    }
}

