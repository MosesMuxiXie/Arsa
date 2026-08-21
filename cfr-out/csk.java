/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class csk {
    public static final csk a = csk.a();
    private static final double b = 2.0;
    private final boolean c;
    private double d = -1.0;
    private boolean e = true;
    private boolean f = true;
    private @Nullable a g;

    private csk(boolean $$0) {
        this.c = $$0;
    }

    public static csk a() {
        return new csk(true);
    }

    public static csk b() {
        return new csk(false);
    }

    public csk c() {
        csk $$0 = this.c ? csk.a() : csk.b();
        $$0.d = this.d;
        $$0.e = this.e;
        $$0.f = this.f;
        $$0.g = this.g;
        return $$0;
    }

    public csk a(double $$0) {
        this.d = $$0;
        return this;
    }

    public csk d() {
        this.e = false;
        return this;
    }

    public csk e() {
        this.f = false;
        return this;
    }

    public csk a(@Nullable a $$0) {
        this.g = $$0;
        return this;
    }

    public boolean a(axf $$0, @Nullable chl $$1, chl $$2) {
        if ($$1 == $$2) {
            return false;
        }
        if (!$$2.eT()) {
            return false;
        }
        if (this.g != null && !this.g.test($$2, $$0)) {
            return false;
        }
        if ($$1 == null) {
            if (this.c && (!$$2.eS() || $$0.av() == ccz.a)) {
                return false;
            }
        } else {
            chn $$6;
            if (this.c && (!$$1.c($$2) || !$$1.a($$2.ay()) || $$1.t($$2))) {
                return false;
            }
            if (this.d > 0.0) {
                double $$3 = this.f ? $$2.D($$1) : 1.0;
                double $$4 = Math.max(this.d * $$3, 2.0);
                double $$5 = $$1.h($$2.dP(), $$2.dR(), $$2.dV());
                if ($$5 > $$4 * $$4) {
                    return false;
                }
            }
            if (this.e && $$1 instanceof chn && !($$6 = (chn)$$1).P().a($$2)) {
                return false;
            }
        }
        return true;
    }

    @FunctionalInterface
    public static interface a {
        public boolean test(chl var1, axf var2);
    }
}

