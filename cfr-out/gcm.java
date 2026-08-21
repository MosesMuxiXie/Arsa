/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import java.util.Set;
import org.jspecify.annotations.Nullable;

public class gcm
extends isc {
    private static final yh a = yh.c("mco.selectServer.popup");
    private static final yh b = yh.c("mco.selectServer.close");
    private static final amo c = amo.b("popup/background");
    private static final amo F = amo.b("icon/trial_available");
    private static final gku G = new gku(amo.b("widget/cross_button"), amo.b("widget/cross_button_highlighted"));
    private static final int H = 195;
    private static final int I = 152;
    private static final int J = 6;
    private static final int K = 4;
    private static final int L = 10;
    private static final int M = 320;
    private static final int N = 172;
    private static final int O = 100;
    private static final int P = 99;
    private static final int Q = 100;
    private static List<amo> R = List.of();
    private final gsb S;
    private final boolean T;
    private @Nullable gje U;
    private int V;
    private int W;

    public gcm(gsb $$0, boolean $$1) {
        super(a);
        this.S = $$0;
        this.T = $$1;
    }

    public static void a(baz $$02) {
        Set<amo> $$1 = $$02.b("textures/gui/images", $$0 -> $$0.a().endsWith(".png")).keySet();
        R = $$1.stream().filter($$0 -> $$0.b().equals("realms")).toList();
    }

    @Override
    protected void bg_() {
        this.S.a(this.o, this.p);
        if (this.T) {
            this.U = this.c(gje.a(yh.c("mco.selectServer.trial"), gqz.b((gsb)this, bez.q)).a(this.J() - 10 - 99, this.K() - 10 - 4 - 40, 99, 20).a());
        }
        this.c(gje.a(yh.c("mco.selectServer.buy"), gqz.b((gsb)this, bez.r)).a(this.J() - 10 - 99, this.K() - 10 - 20, 99, 20).a());
        gjq $$02 = this.c(new gjq(this.o() + 4, this.I() + 4, 14, 14, G, $$0 -> this.aX_(), b));
        $$02.a(gks.a(b));
        int $$1 = 142 - (this.T ? 40 : 20);
        gjo $$2 = new gjo(this.J() - 10 - 100, this.I() + 10, 100, $$1, a, this.q);
        if ($$2.v()) {
            $$2.c(94);
        }
        this.c($$2);
    }

    @Override
    public void e() {
        super.e();
        if (++this.W > 100) {
            this.W = 0;
            this.V = (this.V + 1) % R.size();
        }
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        if (this.U != null) {
            gcm.a($$0, this.U);
        }
    }

    public static void a(gir $$0, gje $$1) {
        int $$2 = 8;
        $$0.a(hpa.at, F, $$1.aT_() + $$1.aS_() - 8 - 4, $$1.aU_() + $$1.aR_() / 2 - 4, 8, 8);
    }

    @Override
    public void b(gir $$0, int $$1, int $$2, float $$3) {
        this.S.b($$0, -1, -1, $$3);
        $$0.c();
        this.S.a($$0, -1, -1, $$3);
        $$0.c();
        this.c($$0);
        $$0.a(hpa.at, c, this.o(), this.I(), 320, 172);
        if (!R.isEmpty()) {
            $$0.a(hpa.at, R.get(this.V), this.o() + 10, this.I() + 10, 0.0f, 0.0f, 195, 152, 195, 152);
        }
    }

    private int o() {
        return (this.o - 320) / 2;
    }

    private int I() {
        return (this.p - 172) / 2;
    }

    private int J() {
        return this.o() + 320;
    }

    private int K() {
        return this.I() + 172;
    }

    @Override
    public void aX_() {
        this.n.a(this.S);
    }
}

