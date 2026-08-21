/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class cym
extends cyf {
    private @Nullable ftm b;

    public cym(cyc $$0) {
        super($$0);
    }

    @Override
    public void b() {
        ftm $$0 = this.a.L(1.0f).d();
        $$0.b(-0.7853982f);
        double $$1 = this.a.c.dP();
        double $$2 = this.a.c.f(0.5);
        double $$3 = this.a.c.dV();
        for (int $$4 = 0; $$4 < 8; ++$$4) {
            bgr $$5 = this.a.ep();
            double $$6 = $$1 + $$5.k() / 2.0;
            double $$7 = $$2 + $$5.k() / 2.0;
            double $$8 = $$3 + $$5.k() / 2.0;
            ftm $$9 = this.a.dN();
            this.a.ao().a(lz.a(ly.i, 1.0f), $$6, $$7, $$8, -$$0.g * (double)0.08f + $$9.g, -$$0.h * (double)0.3f + $$9.h, -$$0.i * (double)0.08f + $$9.i);
            $$0.b(0.19634955f);
        }
    }

    @Override
    public void a(axf $$0) {
        if (this.b == null) {
            this.b = ftm.c($$0.a(euq.a.f, exv.a(this.a.k())));
        }
        if (this.b.c(this.a.dP(), this.a.dR(), this.a.dV()) < 1.0) {
            this.a.gN().b(cyt.f).i();
            this.a.gN().a(cyt.g);
        }
    }

    @Override
    public float e() {
        return 1.5f;
    }

    @Override
    public float g() {
        float $$0 = (float)this.a.dN().i() + 1.0f;
        float $$1 = Math.min($$0, 40.0f);
        return $$1 / $$0;
    }

    @Override
    public void c() {
        this.b = null;
    }

    @Override
    public @Nullable ftm f() {
        return this.b;
    }

    public cyt<cym> h() {
        return cyt.d;
    }
}

