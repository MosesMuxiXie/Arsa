/*
 * Decompiled with CFR 0.152.
 */
public class hlj
extends hlq {
    protected static final int a = 3;
    private final cgk E;
    protected int b;
    protected final idf c;
    protected double d;
    protected double e;
    protected double f;
    protected double g;
    protected double h;
    protected double i;

    public hlj(hif $$0, idf $$1, cgk $$2, ftm $$3) {
        super($$0, $$1.I, $$1.J, $$1.K, $$3.g, $$3.h, $$3.i);
        this.E = $$2;
        this.c = $$1;
        this.c.U = 0;
        this.c();
        this.d();
    }

    @Override
    public void a() {
        ++this.b;
        if (this.b == 3) {
            this.k();
        }
        this.d();
        this.c();
    }

    @Override
    public hlv bj_() {
        return hlv.b;
    }

    private void c() {
        this.d = this.E.dP();
        this.e = (this.E.dR() + this.E.dT()) / 2.0;
        this.f = this.E.dV();
    }

    private void d() {
        this.g = this.d;
        this.h = this.e;
        this.i = this.f;
    }
}

