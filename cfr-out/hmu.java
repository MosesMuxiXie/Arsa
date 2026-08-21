/*
 * Decompiled with CFR 0.152.
 */
public class hmu
extends hln {
    private final cgk a;
    private int b;
    private final int c;
    private final lw d;

    public hmu(hif $$0, cgk $$1, lw $$2) {
        this($$0, $$1, $$2, 3);
    }

    public hmu(hif $$0, cgk $$1, lw $$2, int $$3) {
        this($$0, $$1, $$2, $$3, $$1.dN());
    }

    private hmu(hif $$0, cgk $$1, lw $$2, int $$3, ftm $$4) {
        super($$0, $$1.dP(), $$1.f(0.5), $$1.dV(), $$4.g, $$4.h, $$4.i);
        this.a = $$1;
        this.c = $$3;
        this.d = $$2;
        this.a();
    }

    @Override
    public void a() {
        for (int $$0 = 0; $$0 < 16; ++$$0) {
            double $$3;
            double $$2;
            double $$1 = this.y.i() * 2.0f - 1.0f;
            if ($$1 * $$1 + ($$2 = (double)(this.y.i() * 2.0f - 1.0f)) * $$2 + ($$3 = (double)(this.y.i() * 2.0f - 1.0f)) * $$3 > 1.0) continue;
            double $$4 = this.a.d($$1 / 4.0);
            double $$5 = this.a.f(0.5 + $$2 / 4.0);
            double $$6 = this.a.g($$3 / 4.0);
            this.j.a(this.d, $$4, $$5, $$6, $$1, $$2 + 0.2, $$3);
        }
        ++this.b;
        if (this.b >= this.c) {
            this.k();
        }
    }
}

