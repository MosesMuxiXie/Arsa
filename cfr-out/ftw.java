/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class ftw
implements ftr {
    private final boolean a;
    private final double b;
    private final boolean c;
    private final dlt d;
    private final boolean e;
    private final @Nullable cgk f;

    protected ftw(boolean $$0, boolean $$1, double $$2, dlt $$3, boolean $$4, @Nullable cgk $$5) {
        this.a = $$0;
        this.c = $$1;
        this.b = $$2;
        this.d = $$3;
        this.e = $$4;
        this.f = $$5;
    }

    @Deprecated
    protected ftw(cgk $$0, boolean $$1, boolean $$2) {
        dlt dlt2;
        boolean bl2 = $$0.cy();
        double d2 = $$0.dR();
        if ($$0 instanceof chl) {
            chl $$3 = (chl)$$0;
            dlt2 = $$3.fx();
        } else {
            dlt2 = dlt.l;
        }
        this(bl2, $$2, d2, dlt2, $$1, $$0);
    }

    @Override
    public boolean a(dlp $$0) {
        return this.d.a($$0);
    }

    @Override
    public boolean d() {
        return this.e;
    }

    @Override
    public boolean a(flb $$0, flb $$1) {
        cgk cgk2 = this.f;
        if (cgk2 instanceof chl) {
            chl $$2 = (chl)cgk2;
            return $$2.a($$1) && !$$0.a().a($$1.a());
        }
        return false;
    }

    @Override
    public fug a(eoh $$0, dvx $$1, is $$2) {
        return $$0.b((dvt)$$1, $$2, this);
    }

    @Override
    public boolean c() {
        return this.a;
    }

    @Override
    public boolean a(fug $$0, is $$1, boolean $$2) {
        return this.b > (double)$$1.v() + $$0.c(iz.a.b) - (double)1.0E-5f;
    }

    public @Nullable cgk f() {
        return this.f;
    }

    @Override
    public boolean e() {
        return this.c;
    }

    protected static class a
    extends ftw {
        protected static final ftr a = new a(false);
        protected static final ftr b = new a(true);

        public a(boolean $$0) {
            super(false, false, -1.7976931348623157E308, dlt.l, $$0, null);
        }

        @Override
        public boolean a(fug $$0, is $$1, boolean $$2) {
            return $$2;
        }
    }
}

