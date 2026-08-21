/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumSet;

public abstract class cpc
extends cop {
    private static final int g = 1200;
    private static final int h = 1200;
    private static final int i = 200;
    protected final cht a;
    public final double b;
    protected int c;
    protected int d;
    private int j;
    protected is e = is.c;
    private boolean k;
    private final int l;
    private final int m;
    protected int f;

    public cpc(cht $$0, double $$1, int $$2) {
        this($$0, $$1, $$2, 1);
    }

    public cpc(cht $$0, double $$1, int $$2, int $$3) {
        this.a = $$0;
        this.b = $$1;
        this.l = $$2;
        this.f = 0;
        this.m = $$3;
        this.a(EnumSet.of(cop.a.a, cop.a.c));
    }

    @Override
    public boolean b() {
        if (this.c > 0) {
            --this.c;
            return false;
        }
        this.c = this.a(this.a);
        return this.n();
    }

    protected int a(cht $$0) {
        return cpc.b(200 + $$0.ep().a(200));
    }

    @Override
    public boolean c() {
        return this.d >= -this.j && this.d <= 1200 && this.a(this.a.ao(), this.e);
    }

    @Override
    public void d() {
        this.h();
        this.d = 0;
        this.j = this.a.ep().a(this.a.ep().a(1200) + 1200) + 1200;
    }

    protected void h() {
        this.a.N().a((double)this.e.u() + 0.5, (double)(this.e.v() + 1), (double)this.e.w() + 0.5, this.b);
    }

    public double i() {
        return 1.0;
    }

    protected is k() {
        return this.e.d();
    }

    @Override
    public boolean X_() {
        return true;
    }

    @Override
    public void a() {
        is $$0 = this.k();
        if (!$$0.a(this.a.dI(), this.i())) {
            this.k = false;
            ++this.d;
            if (this.l()) {
                this.a.N().a((double)$$0.u() + 0.5, (double)$$0.v(), (double)$$0.w() + 0.5, this.b);
            }
        } else {
            this.k = true;
            --this.d;
        }
    }

    public boolean l() {
        return this.d % 40 == 0;
    }

    protected boolean m() {
        return this.k;
    }

    protected boolean n() {
        int $$0 = this.l;
        int $$1 = this.m;
        is $$2 = this.a.dK();
        is.a $$3 = new is.a();
        int $$4 = this.f;
        while ($$4 <= $$1) {
            for (int $$5 = 0; $$5 < $$0; ++$$5) {
                int $$6 = 0;
                while ($$6 <= $$5) {
                    int $$7;
                    int n2 = $$7 = $$6 < $$5 && $$6 > -$$5 ? $$5 : 0;
                    while ($$7 <= $$5) {
                        $$3.a($$2, $$6, $$4 - 1, $$7);
                        if (this.a.a($$3) && this.a(this.a.ao(), $$3)) {
                            this.e = $$3;
                            return true;
                        }
                        $$7 = $$7 > 0 ? -$$7 : 1 - $$7;
                    }
                    $$6 = $$6 > 0 ? -$$6 : 1 - $$6;
                }
            }
            $$4 = $$4 > 0 ? -$$4 : 1 - $$4;
        }
        return false;
    }

    protected abstract boolean a(dwr var1, is var2);
}

