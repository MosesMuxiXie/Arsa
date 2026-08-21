/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class cex {
    private final jd<cez> a;
    private final @Nullable cgk b;
    private final @Nullable cgk c;
    private final @Nullable ftm d;

    public String toString() {
        return "DamageSource (" + this.k().a() + ")";
    }

    public float a() {
        return this.k().c();
    }

    public boolean b() {
        return this.b == this.c;
    }

    private cex(jd<cez> $$0, @Nullable cgk $$1, @Nullable cgk $$2, @Nullable ftm $$3) {
        this.a = $$0;
        this.b = $$2;
        this.c = $$1;
        this.d = $$3;
    }

    public cex(jd<cez> $$0, @Nullable cgk $$1, @Nullable cgk $$2) {
        this($$0, $$1, $$2, null);
    }

    public cex(jd<cez> $$0, ftm $$1) {
        this($$0, null, null, $$1);
    }

    public cex(jd<cez> $$0, @Nullable cgk $$1) {
        this($$0, $$1, $$1);
    }

    public cex(jd<cez> $$0) {
        this($$0, null, null, null);
    }

    public @Nullable cgk c() {
        return this.c;
    }

    public @Nullable cgk d() {
        return this.b;
    }

    public @Nullable dlt e() {
        return this.c != null ? this.c.eq() : null;
    }

    public yh a(chl $$0) {
        String $$1 = "death.attack." + this.k().a();
        if (this.b != null || this.c != null) {
            dlt $$4;
            yh $$2 = this.b == null ? this.c.R_() : this.b.R_();
            cgk cgk2 = this.b;
            if (cgk2 instanceof chl) {
                chl $$3 = (chl)cgk2;
                v0 = $$3.fx();
            } else {
                v0 = $$4 = dlt.l;
            }
            if (!$$4.f() && $$4.c(ki.h)) {
                return yh.a($$1 + ".item", $$0.R_(), $$2, $$4.K());
            }
            return yh.a($$1, $$0.R_(), $$2);
        }
        chl $$5 = $$0.fp();
        String $$6 = $$1 + ".player";
        if ($$5 != null) {
            return yh.a($$6, $$0.R_(), $$5.R_());
        }
        return yh.a($$1, $$0.R_());
    }

    public String f() {
        return this.k().a();
    }

    public boolean g() {
        return switch (this.k().b()) {
            default -> throw new MatchException(null, null);
            case cew.a -> false;
            case cew.b -> {
                if (this.b instanceof chl && !(this.b instanceof ddm)) {
                    yield true;
                }
                yield false;
            }
            case cew.c -> true;
        };
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean h() {
        cgk cgk2 = this.d();
        if (!(cgk2 instanceof ddm)) return false;
        ddm $$0 = (ddm)cgk2;
        if (!$$0.gL().d) return false;
        return true;
    }

    public @Nullable ftm i() {
        if (this.d != null) {
            return this.d;
        }
        if (this.c != null) {
            return this.c.dI();
        }
        return null;
    }

    public @Nullable ftm j() {
        return this.d;
    }

    public boolean a(bef<cez> $$0) {
        return this.a.a($$0);
    }

    public boolean a(amt<cez> $$0) {
        return this.a.a($$0);
    }

    public cez k() {
        return this.a.a();
    }

    public jd<cez> l() {
        return this.a;
    }
}

