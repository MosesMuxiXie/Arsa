/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class hms
extends hmg {
    private final hmg.b a;
    private final is b;
    private final float F;
    private final float G;

    public hms(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, eoh $$7) {
        this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, is.a($$1, $$2, $$3));
    }

    public hms(hif $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, eoh $$7, is $$8) {
        super($$0, $$1, $$2, $$3, $$4, $$5, $$6, gfj.V().ax().a().a($$7));
        this.b = $$8;
        this.B = 1.0f;
        this.d = 0.6f;
        this.e = 0.6f;
        this.f = 0.6f;
        if (!$$7.a(dzs.i)) {
            int $$9 = gfj.V().aE().a($$7, $$0, $$8, 0);
            this.d *= (float)($$9 >> 16 & 0xFF) / 255.0f;
            this.e *= (float)($$9 >> 8 & 0xFF) / 255.0f;
            this.f *= (float)($$9 & 0xFF) / 255.0f;
        }
        this.c /= 2.0f;
        this.F = this.y.i() * 3.0f;
        this.G = this.y.i() * 3.0f;
        this.a = this.E.h().equals(ilo.d) ? hmg.b.a : hmg.b.b;
    }

    @Override
    public hmg.b b() {
        return this.a;
    }

    @Override
    protected float c() {
        return this.E.a((this.F + 1.0f) / 4.0f);
    }

    @Override
    protected float d() {
        return this.E.a(this.F / 4.0f);
    }

    @Override
    protected float e() {
        return this.E.b(this.G / 4.0f);
    }

    @Override
    protected float f() {
        return this.E.b((this.G + 1.0f) / 4.0f);
    }

    @Override
    public int a(float $$0) {
        int $$1 = super.a($$0);
        if ($$1 == 0 && this.j.H(this.b)) {
            return hoh.a(this.j, this.b);
        }
        return $$1;
    }

    static @Nullable hms a(lp $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
        eoh $$8 = $$0.b();
        if ($$8.l() || $$8.a(dzs.ca) || !$$8.D()) {
            return null;
        }
        return new hms($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
    }

    public static class a
    implements hlu<lp> {
        @Override
        public @Nullable hlq a(lp $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            hms $$9 = hms.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            if ($$9 != null) {
                $$9.b(0.0, 0.0, 0.0);
                $$9.a($$8.a(10) + 1);
            }
            return $$9;
        }
    }

    public static class b
    implements hlu<lp> {
        @Override
        public @Nullable hlq a(lp $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            hms $$9 = hms.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            if ($$9 != null) {
                $$9.b($$8.k() / 30.0, $$6 + $$8.k() / 2.0, $$8.k() / 30.0);
                $$9.a($$8.a(20) + 20);
            }
            return $$9;
        }
    }

    public static class c
    implements hlu<lp> {
        @Override
        public @Nullable hlq a(lp $$0, hif $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, bgr $$8) {
            return hms.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
        }
    }
}

