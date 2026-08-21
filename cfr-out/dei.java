/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class dei
extends deh {
    private static final int e = 600;
    private static final int f = -1;
    private static final alw<Integer> g = ama.a(dei.class, aly.b);
    private static final byte h = 0;

    public dei(cgu<? extends dei> $$0, dwo $$1) {
        super((cgu<? extends deh>)$$0, $$1);
    }

    public dei(dwo $$0, double $$1, double $$2, double $$3, dlt $$4, @Nullable dlt $$5) {
        super(cgu.i, $$1, $$2, $$3, $$0, $$4, $$5);
        this.D();
    }

    public dei(dwo $$0, chl $$1, dlt $$2, @Nullable dlt $$3) {
        super(cgu.i, $$1, $$0, $$2, $$3);
        this.D();
    }

    private dnr B() {
        return this.v().a(ki.Y, dnr.a);
    }

    private float C() {
        return this.v().a(ki.Z, Float.valueOf(1.0f)).floatValue();
    }

    private void a(dnr $$0) {
        this.v().b(ki.Y, $$0);
        this.D();
    }

    @Override
    protected void a(dlt $$0) {
        super.a($$0);
        this.D();
    }

    private void D() {
        dnr $$0 = this.B();
        this.az.a(g, $$0.equals(dnr.a) ? -1 : $$0.b());
    }

    public void a(cfm $$0) {
        this.a(this.B().a($$0));
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(g, -1);
    }

    @Override
    public void g() {
        super.g();
        if (this.ao().B_()) {
            if (this.f()) {
                if (this.b % 5 == 0) {
                    this.a(1);
                }
            } else {
                this.a(2);
            }
        } else if (this.f() && this.b != 0 && !this.B().equals(dnr.a) && this.b >= 600) {
            this.ao().a((cgk)this, (byte)0);
            this.a(new dlt(dlx.pX));
        }
    }

    private void a(int $$0) {
        int $$1 = this.A();
        if ($$1 == -1 || $$0 <= 0) {
            return;
        }
        for (int $$2 = 0; $$2 < $$0; ++$$2) {
            this.ao().a(lq.a(ly.v, $$1), this.e(0.5), this.dS(), this.h(0.5), 0.0, 0.0, 0.0);
        }
    }

    public int A() {
        return this.az.a(g);
    }

    @Override
    protected void a(chl $$0) {
        super.a($$0);
        cgk $$1 = this.m();
        dnr $$22 = this.B();
        float $$3 = this.C();
        $$22.a((cfm $$2) -> $$0.b((cfm)$$2, $$1), $$3);
    }

    @Override
    protected dlt u() {
        return new dlt(dlx.pX);
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 0) {
            int $$1 = this.A();
            if ($$1 != -1) {
                float $$2 = (float)($$1 >> 16 & 0xFF) / 255.0f;
                float $$3 = (float)($$1 >> 8 & 0xFF) / 255.0f;
                float $$4 = (float)($$1 >> 0 & 0xFF) / 255.0f;
                for (int $$5 = 0; $$5 < 20; ++$$5) {
                    this.ao().a(lq.a(ly.v, $$2, $$3, $$4), this.e(0.5), this.dS(), this.h(0.5), 0.0, 0.0, 0.0);
                }
            }
        } else {
            super.b($$0);
        }
    }
}

