/*
 * Decompiled with CFR 0.152.
 */
public class hlf
extends hln {
    private final double a;
    private final int b;

    hlf(hif $$0, double $$1, double $$2, double $$3, double $$4, int $$5, int $$6) {
        super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
        this.a = $$4;
        this.A = $$5;
        this.b = $$6;
    }

    @Override
    public void a() {
        if (this.z % (this.b + 1) == 0) {
            for (int $$0 = 0; $$0 < 3; ++$$0) {
                double $$1 = this.n + (this.y.j() - this.y.j()) * this.a;
                double $$2 = this.o + (this.y.j() - this.y.j()) * this.a;
                double $$3 = this.p + (this.y.j() - this.y.j()) * this.a;
                this.j.a(ly.y, $$1, $$2, $$3, (double)((float)this.z / (float)this.A), 0.0, 0.0);
            }
        }
        if (this.z++ == this.A) {
            this.k();
        }
    }

    public static class a
    implements hlu<md> {
        private final double a;
        private final int b;
        private final int c;

        public a(double $$0, int $$1, int $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            return new hlf($$1, $$2, $$3, $$4, this.a, this.b, this.c);
        }
    }
}

