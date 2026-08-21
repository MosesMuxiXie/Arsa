/*
 * Decompiled with CFR 0.152.
 */
public class hli
extends hln {
    hli(hif $$0, double $$1, double $$2, double $$3) {
        super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
        this.A = 8;
    }

    @Override
    public void a() {
        for (int $$0 = 0; $$0 < 6; ++$$0) {
            double $$1 = this.n + (this.y.j() - this.y.j()) * 4.0;
            double $$2 = this.o + (this.y.j() - this.y.j()) * 4.0;
            double $$3 = this.p + (this.y.j() - this.y.j()) * 4.0;
            this.j.a(ly.x, $$1, $$2, $$3, (double)((float)this.z / (float)this.A), 0.0, 0.0);
        }
        ++this.z;
        if (this.z == this.A) {
            this.k();
        }
    }

    public static class a
    implements hlu<md> {
        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            return new hli($$1, $$2, $$3, $$4);
        }
    }
}

