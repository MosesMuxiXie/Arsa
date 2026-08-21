/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class gwb
extends gsb {
    private static final yh b = yh.c("options.title");
    private static final yh c = yh.c("options.skinCustomisation");
    private static final yh d = yh.c("options.sounds");
    private static final yh e = yh.c("options.video");
    public static final yh a = yh.c("options.controls");
    private static final yh f = yh.c("options.language");
    private static final yh t = yh.c("options.chat");
    private static final yh u = yh.c("options.resourcepack");
    private static final yh v = yh.c("options.accessibility");
    private static final yh w = yh.c("options.telemetry");
    private static final gks x = gks.a(yh.c("options.telemetry.disabled"));
    private static final yh y = yh.c("options.credits_and_attribution");
    private static final int z = 2;
    private final gou A = new gou(this, 61, 33);
    private final gsb B;
    private final gfo C;
    private @Nullable gjl<ccz> D;
    private @Nullable gjv E;

    public gwb(gsb $$0, gfo $$1) {
        super(b);
        this.B = $$0;
        this.C = $$1;
    }

    @Override
    protected void bg_() {
        goy $$02 = this.A.a(goy.d().a(8));
        $$02.a(new gko(b, this.q), gox::b);
        goy $$12 = $$02.a(goy.e()).a(8);
        $$12.a(this.C.az().a(this.n.k));
        $$12.a(this.o());
        got $$2 = new got();
        $$2.c().f(4).e(4).b();
        got.b $$3 = $$2.d(2);
        $$3.a(this.a(c, () -> new gwd(this, this.C)));
        $$3.a(this.a(d, () -> new gwe(this, this.C)));
        $$3.a(this.a(e, () -> new gwg((gsb)this, this.n, this.C)));
        $$3.a(this.a(a, () -> new gwh(this, this.C)));
        $$3.a(this.a(f, () -> new gvy((gsb)this, this.C, this.n.am())));
        $$3.a(this.a(t, () -> new gvw(this, this.C)));
        $$3.a(this.a(u, () -> new gwo(this.n.ai(), this::a, this.n.al(), yh.c("resourcePack.title"))));
        $$3.a(this.a(v, () -> new gvv(this, this.C)));
        gje $$4 = $$3.a(this.a(w, () -> new gxt(this, this.C)));
        if (!this.n.J()) {
            $$4.k = false;
            $$4.a(x);
        }
        $$3.a(this.a(y, () -> new gre(this)));
        this.A.c($$2);
        this.A.b(gje.a(yg.d, (gje $$0) -> this.aX_()).a(200).a());
        this.A.a($$1 -> {
            gjc cfr_ignored_0 = (gjc)this.c($$1);
        });
        this.c();
    }

    @Override
    protected void c() {
        this.A.a();
    }

    @Override
    public void aX_() {
        this.n.a(this.B);
    }

    private void a(bak $$0) {
        this.C.a($$0);
        this.n.a(this);
    }

    private gow o() {
        if (this.n.r != null && this.n.Z()) {
            this.D = gwb.a(0, 0, "options.difficulty", this.n);
            if (!this.n.r.l().k()) {
                this.E = new gjv(0, 0, $$0 -> this.n.a(new gra(this::c, yh.c("difficulty.lock.title"), (yh)yh.a("difficulty.lock.question", this.n.r.l().p().b()))));
                this.D.c(this.D.aS_() - this.E.aS_());
                this.E.a(this.n.r.l().q());
                this.E.k = !this.E.a();
                this.D.k = !this.E.a();
                gor $$02 = new gor(150, 0, gor.b.a);
                $$02.a(this.D);
                $$02.a(this.E);
                return $$02;
            }
            this.D.k = false;
            return this.D;
        }
        return gje.a(yh.c("options.online"), (gje $$0) -> this.n.a(new gwa(this, this.C))).a(this.o / 2 + 5, this.p / 6 - 12 + 24, 150, 20).a();
    }

    public static gjl<ccz> a(int $$0, int $$12, String $$22, gfj $$3) {
        return gjl.a(ccz::b, $$3.r.av()).a((ccz[])ccz.values()).a($$0, $$12, 150, 20, yh.c($$22), ($$1, $$2) -> $$3.R().b(new aif((ccz)$$2)));
    }

    private void c(boolean $$0) {
        this.n.a(this);
        if ($$0 && this.n.r != null && this.E != null && this.D != null) {
            this.n.R().b(new aja(true));
            this.E.a(true);
            this.E.k = false;
            this.D.k = false;
        }
    }

    @Override
    public void aZ_() {
        this.C.aQ();
    }

    private gje a(yh $$0, Supplier<gsb> $$12) {
        return gje.a($$0, (gje $$1) -> this.n.a((gsb)$$12.get())).a();
    }
}

