/*
 * Decompiled with CFR 0.152.
 */
public abstract class gmd {
    protected static final int a = 60;
    protected static final int b = 1;
    protected final gio c;
    protected final bxr d;

    protected gmd(gio $$0, bxr $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    public int a(int $$0) {
        return Math.min(this.d.c() + 2, $$0);
    }

    public int a() {
        return 60 + this.c.b;
    }

    public void a(gir $$0, int $$1, int $$2) {
        int $$3 = $$0.b();
        $$0.a($$1, $$3 - 60, $$1 + $$2, $$3, -1873784752);
        long $$4 = 0L;
        long $$5 = Integer.MAX_VALUE;
        long $$6 = Integer.MIN_VALUE;
        int $$7 = Math.max(0, this.d.c() - ($$2 - 2));
        int $$8 = this.d.d() - $$7;
        for (int $$9 = 0; $$9 < $$8; ++$$9) {
            int $$10 = $$1 + $$9 + 1;
            int $$11 = $$7 + $$9;
            long $$12 = this.b($$11);
            $$5 = Math.min($$5, $$12);
            $$6 = Math.max($$6, $$12);
            $$4 += $$12;
            this.a($$0, $$3, $$10, $$11);
        }
        $$0.a($$1, $$1 + $$2 - 1, $$3 - 60, -1);
        $$0.a($$1, $$1 + $$2 - 1, $$3 - 1, -1);
        $$0.b($$1, $$3 - 60, $$3, -1);
        $$0.b($$1 + $$2 - 1, $$3 - 60, $$3, -1);
        if ($$8 > 0) {
            String $$13 = this.a((double)$$5) + " min";
            String $$14 = this.a((double)$$4 / (double)$$8) + " avg";
            String $$15 = this.a((double)$$6) + " max";
            $$0.b(this.c, $$13, $$1 + 2, $$3 - 60 - this.c.b, -2039584);
            $$0.a(this.c, $$14, $$1 + $$2 / 2, $$3 - 60 - this.c.b, -2039584);
            $$0.b(this.c, $$15, $$1 + $$2 - this.c.b($$15) - 2, $$3 - 60 - this.c.b, -2039584);
        }
        this.d($$0, $$1, $$2, $$3);
    }

    protected void a(gir $$0, int $$1, int $$2, int $$3) {
        this.b($$0, $$1, $$2, $$3);
        this.c($$0, $$1, $$2, $$3);
    }

    protected void b(gir $$0, int $$1, int $$2, int $$3) {
        long $$4 = this.d.a($$3);
        int $$5 = this.b($$4);
        int $$6 = this.a($$4);
        $$0.a($$2, $$1 - $$5, $$2 + 1, $$1, $$6);
    }

    protected void c(gir $$0, int $$1, int $$2, int $$3) {
    }

    protected long b(int $$0) {
        return this.d.a($$0);
    }

    protected void d(gir $$0, int $$1, int $$2, int $$3) {
    }

    protected void a(gir $$0, String $$1, int $$2, int $$3) {
        $$0.a($$2, $$3, $$2 + this.c.b($$1) + 1, $$3 + this.c.b, -1873784752);
        $$0.a(this.c, $$1, $$2 + 1, $$3 + 1, -2039584, false);
    }

    protected abstract String a(double var1);

    protected abstract int b(double var1);

    protected abstract int a(long var1);

    protected int a(double $$0, double $$1, int $$2, double $$3, int $$4, double $$5, int $$6) {
        if (($$0 = bgj.a($$0, $$1, $$5)) < $$3) {
            return bel.a((float)(($$0 - $$1) / ($$3 - $$1)), $$2, $$4);
        }
        return bel.a((float)(($$0 - $$3) / ($$5 - $$3)), $$4, $$6);
    }
}

