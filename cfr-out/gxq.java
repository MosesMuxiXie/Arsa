/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public class gxq
extends gsb {
    private static final yh c = yh.c("gui.socialInteractions.title");
    private static final amo d = amo.b("social_interactions/background");
    private static final amo e = amo.b("icon/search");
    private static final yh f = yh.c("gui.socialInteractions.tab_all");
    private static final yh t = yh.c("gui.socialInteractions.tab_hidden");
    private static final yh u = yh.c("gui.socialInteractions.tab_blocked");
    private static final yh v = f.e().a(l.t);
    private static final yh w = t.e().a(l.t);
    private static final yh x = u.e().a(l.t);
    private static final yh y = yh.c("gui.socialInteractions.search_hint").c(gjn.e);
    static final yh z = yh.c("gui.socialInteractions.search_empty").a(l.h);
    private static final yh A = yh.c("gui.socialInteractions.empty_hidden").a(l.h);
    private static final yh B = yh.c("gui.socialInteractions.empty_blocked").a(l.h);
    private static final yh C = yh.c("gui.socialInteractions.blocking_hint");
    private static final int D = 8;
    private static final int E = 236;
    private static final int F = 16;
    private static final int G = 64;
    public static final int a = 72;
    public static final int b = 88;
    private static final int H = 238;
    private static final int I = 20;
    private static final int J = 36;
    private final gou K = new gou(this);
    private final @Nullable gsb L;
    @Nullable gxp M;
    gjn N;
    private String O = "";
    private a P = gxq$a.a;
    private gje Q;
    private gje R;
    private gje S;
    private gje T;
    private @Nullable yh U;
    private int V;

    public gxq() {
        this((gsb)null);
    }

    public gxq(@Nullable gsb $$0) {
        super(c);
        this.L = $$0;
        this.a(gfj.V());
    }

    private int o() {
        return Math.max(52, this.p - 128 - 16);
    }

    private int p() {
        return 80 + this.o() - 8;
    }

    private int F() {
        return (this.o - 238) / 2;
    }

    @Override
    public yh i() {
        if (this.U != null) {
            return yg.a(new yh[]{super.i(), this.U});
        }
        return super.i();
    }

    @Override
    protected void bg_() {
        this.K.a(c, this.q);
        this.M = new gxp(this, this.n, this.o, this.p() - 88, 88, 36);
        int $$02 = this.M.a() / 3;
        int $$12 = this.M.w();
        int $$2 = this.M.x();
        this.Q = this.c(gje.a(f, (gje $$0) -> this.a(gxq$a.a)).a($$12, 45, $$02, 20).a());
        this.R = this.c(gje.a(t, (gje $$0) -> this.a(gxq$a.b)).a(($$12 + $$2 - $$02) / 2 + 1, 45, $$02, 20).a());
        this.S = this.c(gje.a(u, (gje $$0) -> this.a(gxq$a.c)).a($$2 - $$02 + 1, 45, $$02, 20).a());
        String $$3 = this.N != null ? this.N.a() : "";
        this.N = this.c(new gjn(this.q, this.F() + 28, 74, 200, 15, y){

            @Override
            protected yw f() {
                if (!gxq.this.N.a().isEmpty() && gxq.this.M.d()) {
                    return super.f().f(", ").b(z);
                }
                return super.f();
            }
        });
        this.N.k(16);
        this.N.j(true);
        this.N.l(-1);
        this.N.a($$3);
        this.N.c(y);
        this.N.b(this::a);
        this.T = this.c(gje.a(C, gqz.b((gsb)this, bez.o)).a(this.o / 2 - 100, 64 + this.o(), 200, 20).a());
        this.d(this.M);
        this.a(this.P);
        this.K.b(gje.a(yg.d, (gje $$0) -> this.aX_()).a(200).a());
        this.K.a($$1 -> {
            gjc cfr_ignored_0 = (gjc)this.c($$1);
        });
        this.c();
    }

    @Override
    public void aK_() {
        if (this.M != null) {
            this.M.I();
        }
    }

    @Override
    protected void c() {
        this.K.a();
        this.M.a(this.o, this.p() - 88, 88);
        this.N.c(this.F() + 28, 74);
        int $$0 = this.M.w();
        int $$1 = this.M.x();
        int $$2 = this.M.a() / 3;
        this.Q.c($$0, 45);
        this.R.c(($$0 + $$1 - $$2) / 2 + 1, 45);
        this.S.c($$1 - $$2 + 1, 45);
        this.T.c(this.o / 2 - 100, 64 + this.o());
    }

    @Override
    protected void aI_() {
        this.b(this.N);
    }

    @Override
    public void aX_() {
        this.n.a(this.L);
    }

    private void a(a $$0) {
        this.P = $$0;
        this.Q.a_(f);
        this.R.a_(t);
        this.S.a_(u);
        boolean $$1 = false;
        switch ($$0.ordinal()) {
            case 0: {
                this.Q.a_(v);
                Collection<UUID> $$2 = this.n.s.b.p();
                this.M.a($$2, this.M.h(), true);
                break;
            }
            case 1: {
                this.R.a_(w);
                Set<UUID> $$3 = this.n.aQ().c();
                $$1 = $$3.isEmpty();
                this.M.a($$3, this.M.h(), false);
                break;
            }
            case 2: {
                this.S.a_(x);
                gxo $$4 = this.n.aQ();
                Set<UUID> $$5 = this.n.s.b.p().stream().filter($$4::e).collect(Collectors.toSet());
                $$1 = $$5.isEmpty();
                this.M.a($$5, this.M.h(), false);
            }
        }
        gfa $$6 = this.n.aZ();
        if (!this.N.a().isEmpty() && this.M.d() && !this.N.aP_()) {
            $$6.d(z);
        } else if ($$1) {
            if ($$0 == gxq$a.b) {
                $$6.d(A);
            } else if ($$0 == gxq$a.c) {
                $$6.d(B);
            }
        }
    }

    @Override
    public void b(gir $$0, int $$1, int $$2, float $$3) {
        super.b($$0, $$1, $$2, $$3);
        int $$4 = this.F() + 3;
        $$0.a(hpa.at, d, $$4, 64, 236, this.o() + 16);
        $$0.a(hpa.at, e, $$4 + 10, 76, 12, 12);
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        this.a(this.n);
        if (this.U != null) {
            $$0.b(this.n.g, this.U, this.F() + 8, 35, -1);
        }
        if (!this.M.d()) {
            this.M.a($$0, $$1, $$2, $$3);
        } else if (!this.N.a().isEmpty()) {
            $$0.a(this.n.g, z, this.o / 2, (72 + this.p()) / 2, -1);
        } else if (this.P == gxq$a.b) {
            $$0.a(this.n.g, A, this.o / 2, (72 + this.p()) / 2, -1);
        } else if (this.P == gxq$a.c) {
            $$0.a(this.n.g, B, this.o / 2, (72 + this.p()) / 2, -1);
        }
        this.T.l = this.P == gxq$a.c;
    }

    @Override
    public boolean a(gzb $$0) {
        if (!this.N.aP_() && this.n.k.I.a($$0)) {
            this.aX_();
            return true;
        }
        return super.a($$0);
    }

    @Override
    public boolean ba_() {
        return false;
    }

    private void a(String $$0) {
        if (!($$0 = $$0.toLowerCase(Locale.ROOT)).equals(this.O)) {
            this.M.a($$0);
            this.O = $$0;
            this.a(this.P);
        }
    }

    private void a(gfj $$0) {
        int $$1 = $$0.R().o().size();
        if (this.V != $$1) {
            String $$2 = "";
            hit $$3 = $$0.X();
            if ($$0.Y()) {
                $$2 = $$0.aa().ah();
            } else if ($$3 != null) {
                $$2 = $$3.a;
            }
            this.U = $$1 > 1 ? yh.a("gui.socialInteractions.server_label.multiple", new Object[]{$$2, $$1}) : yh.a("gui.socialInteractions.server_label.single", new Object[]{$$2, $$1});
            this.V = $$1;
        }
    }

    public void a(hiq $$0) {
        this.M.a($$0, this.P);
    }

    public void a(UUID $$0) {
        this.M.a($$0);
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
            d = gxq$a.a();
        }
    }
}

