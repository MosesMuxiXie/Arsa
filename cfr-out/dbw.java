/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class dbw
extends dbv
implements cib {
    private static final alw<Boolean> c = ama.a(dbw.class, aly.k);
    private static final String d = "sheared";
    private static final boolean e = false;

    public static cir.a gT() {
        return dbv.k().a(cis.u, 16.0);
    }

    public dbw(cgu<? extends dbw> $$0, dwo $$1) {
        super((cgu<? extends dbv>)$$0, $$1);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(c, false);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a(d, this.gU());
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.x($$0.a(d, false));
    }

    public boolean gU() {
        return this.az.a(c);
    }

    public void x(boolean $$0) {
        this.az.a(c, $$0);
    }

    @Override
    protected cdc b(ddm $$0, cdb $$1) {
        dlt $$2 = $$0.b($$1);
        if ($$2.a(dlx.tZ) && this.a()) {
            dwo dwo2 = this.ao();
            if (dwo2 instanceof axf) {
                axf $$3 = (axf)dwo2;
                this.a($$3, bdb.h, $$2);
                this.a(etk.M, (cgk)$$0);
                $$2.a(1, (chl)$$0, $$1.a());
            }
            return cdc.a;
        }
        return super.b($$0, $$1);
    }

    @Override
    protected bcz W() {
        return bda.cz;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.cB;
    }

    @Override
    protected bcz fd() {
        return bda.cA;
    }

    @Override
    protected bcz p() {
        return bda.cD;
    }

    @Override
    protected deh a(dlt $$0, float $$1, @Nullable dlt $$2) {
        deh $$3 = super.a($$0, $$1, $$2);
        if ($$3 instanceof dei) {
            dei $$4 = (dei)$$3;
            $$4.a(new cfm(cfo.s, 100));
        }
        return $$3;
    }

    @Override
    protected int gQ() {
        return 50;
    }

    @Override
    protected int gR() {
        return 70;
    }

    @Override
    public void a(axf $$0, bdb $$1, dlt $$2) {
        $$0.a(null, this, bda.cC, $$1, 1.0f, 1.0f);
        this.d($$0, $$2);
        this.x(true);
    }

    private void d(axf $$02, dlt $$12) {
        this.a($$02, fnv.aW, $$12, (axf $$0, dlt $$1) -> this.a((axf)$$0, (dlt)$$1, this.dG()));
    }

    @Override
    public boolean a() {
        return !this.gU() && this.cb();
    }
}

