/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class gmp
implements gys {
    private static final amo a = amo.b("hud/hotbar");
    private static final amo b = amo.b("hud/hotbar_selection");
    private static final long c = 5000L;
    private static final long d = 2000L;
    private final gfj e;
    private long f;
    private @Nullable gyp g;

    public gmp(gfj $$0) {
        this.e = $$0;
    }

    public void a(int $$0) {
        this.f = bhs.c();
        if (this.g != null) {
            this.g.b($$0);
        } else {
            this.g = new gyp(this);
        }
    }

    private float c() {
        long $$0 = this.f - bhs.c() + 5000L;
        return bgj.a((float)$$0 / 2000.0f, 0.0f, 1.0f);
    }

    public void a(gir $$0) {
        if (this.g == null) {
            return;
        }
        float $$1 = this.c();
        if ($$1 <= 0.0f) {
            this.g.d();
            return;
        }
        int $$2 = $$0.a() / 2;
        int $$3 = bgj.b((float)$$0.b() - 22.0f * $$1);
        gyt $$4 = this.g.f();
        this.a($$0, $$1, $$2, $$3, $$4);
    }

    protected void a(gir $$0, float $$1, int $$2, int $$3, gyt $$4) {
        int $$5 = bel.b($$1);
        $$0.a(hpa.at, a, $$2 - 91, $$3, 182, 22, $$5);
        if ($$4.a() >= 0) {
            $$0.a(hpa.at, b, $$2 - 91 - 1 + $$4.a() * 20, $$3 - 1, 24, 23, $$5);
        }
        for (int $$6 = 0; $$6 < 9; ++$$6) {
            this.a($$0, $$6, $$0.a() / 2 - 90 + $$6 * 20 + 2, $$3 + 3, $$1, $$4.a($$6));
        }
    }

    private void a(gir $$0, int $$1, int $$2, float $$3, float $$4, gyr $$5) {
        if ($$5 != gyp.a) {
            $$0.e().pushMatrix();
            $$0.e().translate((float)$$2, $$3);
            float $$6 = $$5.bi_() ? 1.0f : 0.25f;
            $$5.a($$0, $$6, $$4);
            $$0.e().popMatrix();
            if ($$4 > 0.0f && $$5.bi_()) {
                yh $$7 = this.e.k.R[$$1].n();
                $$0.b(this.e.g, $$7, $$2 + 19 - 2 - this.e.g.a($$7), (int)$$3 + 6 + 3, bel.b($$4));
            }
        }
    }

    public void b(gir $$0) {
        float $$1 = this.c();
        if ($$1 > 0.0f && this.g != null) {
            gyr $$2 = this.g.b();
            yh $$3 = $$2 == gyp.a ? this.g.c().b() : $$2.bh_();
            int $$4 = this.e.g.a($$3);
            int $$5 = ($$0.a() - $$4) / 2;
            int $$6 = $$0.b() - 35;
            $$0.a(this.e.g, $$3, $$5, $$6, $$4, bel.b($$1));
        }
    }

    @Override
    public void a(gyp $$0) {
        this.g = null;
        this.f = 0L;
    }

    public boolean a() {
        return this.g != null;
    }

    public void b(int $$0) {
        int $$1;
        for ($$1 = this.g.e() + $$0; !($$1 < 0 || $$1 > 8 || this.g.a($$1) != gyp.a && this.g.a($$1).bi_()); $$1 += $$0) {
        }
        if ($$1 >= 0 && $$1 <= 8) {
            this.g.b($$1);
            this.f = bhs.c();
        }
    }

    public void b() {
        this.f = bhs.c();
        if (this.a()) {
            int $$0 = this.g.e();
            if ($$0 != -1) {
                this.g.b($$0);
            }
        } else {
            this.g = new gyp(this);
        }
    }
}

