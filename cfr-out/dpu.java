/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class dpu
extends dpw {
    private final is b;
    protected boolean a = true;

    public dpu(ddm $$0, cdb $$1, dlt $$2, fti $$3) {
        this($$0.ao(), $$0, $$1, $$2, $$3);
    }

    public dpu(dpw $$0) {
        this($$0.q(), $$0.o(), $$0.p(), $$0.n(), $$0.j());
    }

    protected dpu(dwo $$0, @Nullable ddm $$1, cdb $$2, dlt $$3, fti $$4) {
        super($$0, $$1, $$2, $$3, $$4);
        this.b = $$4.b().a($$4.c());
        this.a = $$0.a_($$4.b()).a(this);
    }

    public static dpu a(dpu $$0, is $$1, iz $$2) {
        return new dpu($$0.q(), $$0.o(), $$0.p(), $$0.n(), new fti(new ftm((double)$$1.u() + 0.5 + (double)$$2.j() * 0.5, (double)$$1.v() + 0.5 + (double)$$2.k() * 0.5, (double)$$1.w() + 0.5 + (double)$$2.l() * 0.5), $$2, $$1, false));
    }

    @Override
    public is a() {
        return this.a ? super.a() : this.b;
    }

    public boolean b() {
        return this.a || this.q().a_(this.a()).a(this);
    }

    public boolean c() {
        return this.a;
    }

    public iz d() {
        return iz.a(this.o())[0];
    }

    public iz e() {
        return iz.a(this.o(), iz.a.b);
    }

    public iz[] f() {
        int $$2;
        iz[] $$0 = iz.a(this.o());
        if (this.a) {
            return $$0;
        }
        iz $$1 = this.k();
        for ($$2 = 0; $$2 < $$0.length && $$0[$$2] != $$1.g(); ++$$2) {
        }
        if ($$2 > 0) {
            System.arraycopy($$0, 0, $$0, 1, $$2);
            $$0[0] = $$1.g();
        }
        return $$0;
    }
}

