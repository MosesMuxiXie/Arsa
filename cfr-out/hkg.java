/*
 * Decompiled with CFR 0.152.
 */
public class hkg
extends hmg {
    private final float a;
    private final float b;
    private final hmg.b F;

    hkg(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, ilp $$7) {
        this($$0, $$1, $$2, $$3, $$7);
        this.q *= (double)0.1f;
        this.r *= (double)0.1f;
        this.s *= (double)0.1f;
        this.q += $$4;
        this.r += $$5;
        this.s += $$6;
    }

    protected hkg(hif $$0, double $$1, double $$2, double $$3, ilp $$4) {
        super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0, $$4);
        this.B = 1.0f;
        this.c /= 2.0f;
        this.a = this.y.i() * 3.0f;
        this.b = this.y.i() * 3.0f;
        this.F = $$4.h().equals(ilo.d) ? hmg.b.a : hmg.b.b;
    }

    @Override
    protected float c() {
        return this.E.a((this.a + 1.0f) / 4.0f);
    }

    @Override
    protected float d() {
        return this.E.a(this.a / 4.0f);
    }

    @Override
    protected float e() {
        return this.E.b(this.b / 4.0f);
    }

    @Override
    protected float f() {
        return this.E.b((this.b + 1.0f) / 4.0f);
    }

    @Override
    public hmg.b b() {
        return this.F;
    }

    public static class e
    extends b<md> {
        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            return new hkg($$1, $$2, $$3, $$4, this.a(new dlt(dlx.so), $$1, $$8));
        }
    }

    public static class a
    extends b<md> {
        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            return new hkg($$1, $$2, $$3, $$4, this.a(new dlt(dlx.cT), $$1, $$8));
        }
    }

    public static class d
    extends b<md> {
        @Override
        public hlq a(md $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            return new hkg($$1, $$2, $$3, $$4, this.a(new dlt(dlx.sC), $$1, $$8));
        }
    }

    public static class c
    extends b<lu> {
        @Override
        public hlq a(lu $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            return new hkg($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a($$0.b(), $$1, $$8));
        }
    }

    public static abstract class b<T extends lw>
    implements hlu<T> {
        private final ihm a = new ihm();

        protected ilp a(dlt $$0, hif $$1, bgr $$2) {
            gfj.V().bh().a(this.a, $$0, dlr.h, $$1, null, 0);
            ilp $$3 = this.a.a($$2);
            return $$3 != null ? $$3 : gfj.V().aL().a(ml.e).f();
        }
    }
}

