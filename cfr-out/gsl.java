/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Maps;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class gsl
extends gsb
implements hhy.a {
    private static final amo v = amo.b("textures/gui/advancements/window.png");
    public static final int a = 252;
    public static final int b = 140;
    private static final int w = 9;
    private static final int x = 18;
    public static final int c = 234;
    public static final int d = 113;
    private static final int y = 8;
    private static final int z = 6;
    private static final int A = 256;
    private static final int B = 256;
    public static final int e = 16;
    public static final int f = 16;
    public static final int t = 14;
    public static final int u = 7;
    private static final double C = 16.0;
    private static final yh D = yh.c("advancements.sad_label");
    private static final yh E = yh.c("advancements.empty");
    private static final yh F = yh.c("gui.advancements");
    private final gou G = new gou(this);
    private final @Nullable gsb H;
    private final hhy I;
    private final Map<ac, gsh> J = Maps.newLinkedHashMap();
    private @Nullable gsh K;
    private boolean L;

    public gsl(hhy $$0) {
        this($$0, null);
    }

    public gsl(hhy $$0, @Nullable gsb $$1) {
        super(F);
        this.I = $$0;
        this.H = $$1;
    }

    @Override
    protected void bg_() {
        this.G.a(F, this.q);
        this.J.clear();
        this.K = null;
        this.I.a(this);
        if (this.K == null && !this.J.isEmpty()) {
            gsh $$02 = this.J.values().iterator().next();
            this.I.a($$02.c().b(), true);
        } else {
            this.I.a(this.K == null ? null : this.K.c().b(), true);
        }
        this.G.b(gje.a(yg.d, (gje $$0) -> this.aX_()).a(200).a());
        this.G.a($$1 -> {
            gjc cfr_ignored_0 = (gjc)this.c($$1);
        });
        this.c();
    }

    @Override
    protected void c() {
        this.G.a();
    }

    @Override
    public void aX_() {
        this.n.a(this.H);
    }

    @Override
    public void aZ_() {
        this.I.a((hhy.a)null);
        hig $$0 = this.n.R();
        if ($$0 != null) {
            $$0.b(ajp.b());
        }
    }

    @Override
    public boolean a(gzc $$0, boolean $$1) {
        if ($$0.t() == 0) {
            int $$2 = (this.o - 252) / 2;
            int $$3 = (this.p - 140) / 2;
            for (gsh $$4 : this.J.values()) {
                if (!$$4.a($$2, $$3, $$0.u(), $$0.v())) continue;
                this.I.a($$4.c().b(), true);
                break;
            }
        }
        return super.a($$0, $$1);
    }

    @Override
    public boolean a(gzb $$0) {
        if (this.n.k.N.a($$0)) {
            this.n.a((gsb)null);
            this.n.n.i();
            return true;
        }
        return super.a($$0);
    }

    @Override
    public void a(gir $$0, int $$1, int $$2, float $$3) {
        super.a($$0, $$1, $$2, $$3);
        int $$4 = (this.o - 252) / 2;
        int $$5 = (this.p - 140) / 2;
        $$0.c();
        this.a($$0, $$4, $$5);
        $$0.c();
        this.b($$0, $$4, $$5, $$1, $$2);
        if (this.L && this.K != null) {
            if (this.K.f() && this.K.g()) {
                $$0.a(fyn.g);
            } else if (this.K.f()) {
                $$0.a(fyn.f);
            } else if (this.K.g()) {
                $$0.a(fyn.e);
            }
        }
        this.c($$0, $$1, $$2, $$4, $$5);
    }

    @Override
    public boolean a(gzc $$0, double $$1, double $$2) {
        if ($$0.t() != 0) {
            this.L = false;
            return false;
        }
        if (!this.L) {
            this.L = true;
        } else if (this.K != null) {
            this.K.a($$1, $$2);
        }
        return true;
    }

    @Override
    public boolean b(gzc $$0) {
        this.L = false;
        return super.b($$0);
    }

    @Override
    public boolean a(double $$0, double $$1, double $$2, double $$3) {
        if (this.K != null) {
            this.K.a($$2 * 16.0, $$3 * 16.0);
            return true;
        }
        return false;
    }

    private void a(gir $$0, int $$1, int $$2) {
        gsh $$3 = this.K;
        if ($$3 == null) {
            $$0.a($$1 + 9, $$2 + 18, $$1 + 9 + 234, $$2 + 18 + 113, -16777216);
            int $$4 = $$1 + 9 + 117;
            $$0.a(this.q, E, $$4, $$2 + 18 + 56 - this.q.b / 2, -1);
            $$0.a(this.q, D, $$4, $$2 + 18 + 113 - this.q.b, -1);
            return;
        }
        $$3.b($$0, $$1 + 9, $$2 + 18);
    }

    public void b(gir $$0, int $$1, int $$2, int $$3, int $$4) {
        $$0.a(hpa.at, v, $$1, $$2, 0.0f, 0.0f, 252, 140, 256, 256);
        if (this.J.size() > 1) {
            for (gsh $$5 : this.J.values()) {
                $$5.a($$0, $$1, $$2, $$3, $$4, $$5 == this.K);
            }
            for (gsh $$6 : this.J.values()) {
                $$6.a($$0, $$1, $$2);
            }
        }
        $$0.a(this.q, this.K != null ? this.K.d() : F, $$1 + 8, $$2 + 6, -12566464, false);
    }

    private void c(gir $$0, int $$1, int $$2, int $$3, int $$4) {
        if (this.K != null) {
            $$0.e().pushMatrix();
            $$0.e().translate((float)($$3 + 9), (float)($$4 + 18));
            $$0.c();
            this.K.a($$0, $$1 - $$3 - 9, $$2 - $$4 - 18, $$3, $$4);
            $$0.e().popMatrix();
        }
        if (this.J.size() > 1) {
            for (gsh $$5 : this.J.values()) {
                if (!$$5.a($$3, $$4, $$1, $$2)) continue;
                $$0.a(this.q, $$5.d(), $$1, $$2);
            }
        }
    }

    @Override
    public void a(ad $$0) {
        gsh $$1 = gsh.a(this.n, this, this.J.size(), $$0);
        if ($$1 == null) {
            return;
        }
        this.J.put($$0.b(), $$1);
    }

    @Override
    public void b(ad $$0) {
    }

    @Override
    public void c(ad $$0) {
        gsh $$1 = this.f($$0);
        if ($$1 != null) {
            $$1.a($$0);
        }
    }

    @Override
    public void d(ad $$0) {
    }

    @Override
    public void a(ad $$0, ae $$1) {
        gsj $$2 = this.e($$0);
        if ($$2 != null) {
            $$2.a($$1);
        }
    }

    @Override
    public void a(@Nullable ac $$0) {
        this.K = this.J.get($$0);
    }

    @Override
    public void a() {
        this.J.clear();
        this.K = null;
    }

    public @Nullable gsj e(ad $$0) {
        gsh $$1 = this.f($$0);
        return $$1 == null ? null : $$1.a($$0.b());
    }

    private @Nullable gsh f(ad $$0) {
        ad $$1 = $$0.d();
        return this.J.get($$1.b());
    }
}

