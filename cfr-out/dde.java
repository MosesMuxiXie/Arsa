/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 *  org.jspecify.annotations.Nullable
 */
import java.util.EnumSet;
import org.apache.commons.lang3.tuple.Pair;
import org.jspecify.annotations.Nullable;

public class dde
extends dcw
implements dob.b {
    private static final int cx = 0;
    private @Nullable is cy;
    private int cz = 0;

    public dde(cgu<? extends dde> $$0, dwo $$1) {
        super((cgu<? extends dcw>)$$0, $$1);
    }

    @Override
    protected void D() {
        this.cs.a(0, new coh(this));
        this.cs.a(0, new cqb<dde>(this, dnr.a(dlx.up, dns.g), bda.EQ, $$0 -> this.ao().ah() && !$$0.cG()));
        this.cs.a(0, new cqb<dde>(this, new dlt(dlx.sq), bda.EV, $$0 -> this.ao().ag() && $$0.cG()));
        this.cs.a(1, new cpz(this));
        this.cs.a(1, new cnu<dcn>(this, dcn.class, 8.0f, 0.5, 0.5));
        this.cs.a(1, new cnu<dbb>(this, dbb.class, 12.0f, 0.5, 0.5));
        this.cs.a(1, new cnu<dbf>(this, dbf.class, 8.0f, 0.5, 0.5));
        this.cs.a(1, new cnu<dai>(this, dai.class, 8.0f, 0.5, 0.5));
        this.cs.a(1, new cnu<dbd>(this, dbd.class, 15.0f, 0.5, 0.5));
        this.cs.a(1, new cnu<dbc>(this, dbc.class, 12.0f, 0.5, 0.5));
        this.cs.a(1, new cnu<dak>(this, dak.class, 10.0f, 0.5, 0.5));
        this.cs.a(1, new cpi(this, 0.5));
        this.cs.a(1, new coy(this));
        this.cs.a(2, new a(this, 2.0, 0.35));
        this.cs.a(4, new cpd(this, 0.35));
        this.cs.a(8, new cqd(this, 0.35));
        this.cs.a(9, new cos(this, ddm.class, 3.0f, 1.0f));
        this.cs.a(10, new cox(this, chn.class, 8.0f));
    }

    @Override
    public @Nullable cfy a(axf $$0, cfy $$1) {
        return null;
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public cdc b(ddm $$0, cdb $$1) {
        dlt $$2 = $$0.b($$1);
        if (!$$2.a(dlx.vm) && this.cb() && !this.gQ() && !this.e_()) {
            if ($$1 == cdb.a) {
                $$0.a(bdk.U);
            }
            if (!this.ao().B_()) {
                if (this.b().isEmpty()) {
                    return cdc.c;
                }
                this.a($$0);
                this.a($$0, this.R_(), 1);
            }
            return cdc.a;
        }
        return super.b($$0, $$1);
    }

    @Override
    protected void h(axf $$0) {
        dvm $$1 = this.b();
        for (Pair<ddb.g[], Integer> $$2 : ddb.b) {
            ddb.g[] $$3 = (ddb.g[])$$2.getLeft();
            this.a($$0, $$1, $$3, (Integer)$$2.getRight());
        }
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("DespawnDelay", this.cz);
        $$0.b("wander_target", is.a, this.cy);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.cz = $$0.a("DespawnDelay", 0);
        this.cy = $$0.a("wander_target", is.a).orElse(null);
        this.d_(Math.max(0, this.Z_()));
    }

    @Override
    public boolean i(double $$0) {
        return false;
    }

    @Override
    protected void b(dvl $$0) {
        if ($$0.u()) {
            int $$1 = 3 + this.as.a(4);
            this.ao().b(new cgz(this.ao(), this.dP(), this.dR() + 0.5, this.dV(), $$1));
        }
    }

    @Override
    protected bcz W() {
        if (this.gQ()) {
            return bda.EW;
        }
        return bda.EO;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.ET;
    }

    @Override
    protected bcz fd() {
        return bda.EP;
    }

    @Override
    public bcz j(dlt $$0) {
        if ($$0.a(dlx.sq)) {
            return bda.ER;
        }
        return bda.ES;
    }

    @Override
    protected bcz x(boolean $$0) {
        return $$0 ? bda.EX : bda.EU;
    }

    @Override
    public bcz f() {
        return bda.EX;
    }

    public void s(int $$0) {
        this.cz = $$0;
    }

    public int gT() {
        return this.cz;
    }

    @Override
    public void d_() {
        super.d_();
        if (!this.ao().B_()) {
            this.gU();
        }
    }

    private void gU() {
        if (this.cz > 0 && !this.gQ() && --this.cz == 0) {
            this.aC();
        }
    }

    public void h(@Nullable is $$0) {
        this.cy = $$0;
    }

    @Nullable is gW() {
        return this.cy;
    }

    class a
    extends cop {
        final dde a;
        final double b;
        final double c;

        a(dde $$0, double $$1, double $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
            this.a(EnumSet.of(cop.a.a));
        }

        @Override
        public void e() {
            this.a.h((is)null);
            dde.this.cr.n();
        }

        @Override
        public boolean b() {
            is $$0 = this.a.gW();
            return $$0 != null && this.a($$0, this.b);
        }

        @Override
        public void a() {
            is $$0 = this.a.gW();
            if ($$0 != null && dde.this.cr.l()) {
                if (this.a($$0, 10.0)) {
                    ftm $$1 = new ftm((double)$$0.u() - this.a.dP(), (double)$$0.v() - this.a.dR(), (double)$$0.w() - this.a.dV()).d();
                    ftm $$2 = $$1.c(10.0).b(this.a.dP(), this.a.dR(), this.a.dV());
                    dde.this.cr.a($$2.g, $$2.h, $$2.i, this.c);
                } else {
                    dde.this.cr.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
                }
            }
        }

        private boolean a(is $$0, double $$1) {
            return !$$0.a(this.a.dI(), $$1);
        }
    }
}

