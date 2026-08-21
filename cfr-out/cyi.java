/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class cyi
extends cyf {
    private @Nullable ftm b;
    private int c;

    public cyi(cyc $$0) {
        super($$0);
    }

    @Override
    public void b() {
        if (this.c++ % 10 == 0) {
            float $$0 = (this.a.ep().i() - 0.5f) * 8.0f;
            float $$1 = (this.a.ep().i() - 0.5f) * 4.0f;
            float $$2 = (this.a.ep().i() - 0.5f) * 8.0f;
            this.a.ao().a(ly.w, this.a.dP() + (double)$$0, this.a.dR() + 2.0 + (double)$$1, this.a.dV() + (double)$$2, 0.0, 0.0, 0.0);
        }
    }

    @Override
    public void a(axf $$0) {
        double $$2;
        ++this.c;
        if (this.b == null) {
            is $$1 = $$0.a(euq.a.e, exv.a(this.a.k()));
            this.b = ftm.c($$1);
        }
        if (($$2 = this.b.c(this.a.dP(), this.a.dR(), this.a.dV())) < 100.0 || $$2 > 22500.0 || this.a.ad || this.a.ae) {
            this.a.x(0.0f);
        } else {
            this.a.x(1.0f);
        }
    }

    @Override
    public void c() {
        this.b = null;
        this.c = 0;
    }

    @Override
    public float e() {
        return 3.0f;
    }

    @Override
    public @Nullable ftm f() {
        return this.b;
    }

    public cyt<cyi> h() {
        return cyt.j;
    }
}

