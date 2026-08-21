/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class dho
extends dhi {
    private static final int m = 0;
    private static final int n = 1;
    private static final int o = 3;
    private static final int p = 1;
    private static final int q = 28;
    private static final int r = 28;
    private static final int s = 37;
    private static final int t = 0;
    private final ccv u = new cdk(this, 1){

        @Override
        public boolean b(int $$0, dlt $$1) {
            return $$1.a(bdy.bu);
        }

        @Override
        public int ap_() {
            return 1;
        }
    };
    private final a v;
    private final dhw w;
    private final dhv x;

    public dho(int $$0, ccv $$1) {
        this($$0, $$1, new djh(3), dhw.a);
    }

    public dho(int $$0, ccv $$1, dhv $$2, dhw $$3) {
        super(dis.j, $$0);
        dho.a($$2, 3);
        this.x = $$2;
        this.w = $$3;
        this.v = new a(this.u, 0, 136, 110);
        this.a(this.v);
        this.a($$2);
        this.c($$1, 36, 137);
    }

    @Override
    public void a(ddm $$0) {
        super.a($$0);
        if ($$0.ao().B_()) {
            return;
        }
        dlt $$1 = this.v.a(this.v.a());
        if (!$$1.f()) {
            $$0.a($$1, false);
        }
    }

    @Override
    public boolean b(ddm $$0) {
        return dho.a(this.w, $$0, dzs.gD);
    }

    @Override
    public void b(int $$0, int $$1) {
        super.b($$0, $$1);
        this.d();
    }

    @Override
    public dlt b(ddm $$0, int $$1) {
        dlt $$2 = dlt.l;
        dji $$3 = (dji)this.k.get($$1);
        if ($$3 != null && $$3.h()) {
            dlt $$4 = $$3.g();
            $$2 = $$4.v();
            if ($$1 == 0) {
                if (!this.a($$4, 1, 37, true)) {
                    return dlt.l;
                }
                $$3.b($$4, $$2);
            } else if (!this.v.h() && this.v.a($$4) && $$4.N() == 1 ? !this.a($$4, 0, 1, false) : ($$1 >= 1 && $$1 < 28 ? !this.a($$4, 28, 37, false) : ($$1 >= 28 && $$1 < 37 ? !this.a($$4, 1, 28, false) : !this.a($$4, 1, 37, false)))) {
                return dlt.l;
            }
            if ($$4.f()) {
                $$3.e(dlt.l);
            } else {
                $$3.d();
            }
            if ($$4.N() == $$2.N()) {
                return dlt.l;
            }
            $$3.a($$0, $$4);
        }
        return $$2;
    }

    public int l() {
        return this.x.a(0);
    }

    public static int a(@Nullable jd<cfk> $$0) {
        return $$0 == null ? 0 : mi.d.t().a($$0) + 1;
    }

    public static @Nullable jd<cfk> e(int $$0) {
        return $$0 == 0 ? null : mi.d.t().a($$0 - 1);
    }

    public @Nullable jd<cfk> m() {
        return dho.e(this.x.a(1));
    }

    public @Nullable jd<cfk> n() {
        return dho.e(this.x.a(2));
    }

    public void a(Optional<jd<cfk>> $$0, Optional<jd<cfk>> $$1) {
        if (this.v.h()) {
            this.x.a(1, dho.a($$0.orElse(null)));
            this.x.a(2, dho.a($$1.orElse(null)));
            this.v.a(1);
            this.w.a(dwo::u);
        }
    }

    public boolean o() {
        return !this.u.a(0).f();
    }

    static class a
    extends dji {
        public a(ccv $$0, int $$1, int $$2, int $$3) {
            super($$0, $$1, $$2, $$3);
        }

        @Override
        public boolean a(dlt $$0) {
            return $$0.a(bdy.bu);
        }

        @Override
        public int a() {
            return 1;
        }
    }
}

