/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class cyp
extends cyg {
    private static final int b = 200;
    private static final int c = 4;
    private static final int d = 10;
    private int e;
    private int f;
    private @Nullable cga g;

    public cyp(cyc $$0) {
        super($$0);
    }

    @Override
    public void b() {
        ++this.e;
        if (this.e % 2 == 0 && this.e < 10) {
            ftm $$0 = this.a.L(1.0f).d();
            $$0.b(-0.7853982f);
            double $$1 = this.a.c.dP();
            double $$2 = this.a.c.f(0.5);
            double $$3 = this.a.c.dV();
            for (int $$4 = 0; $$4 < 8; ++$$4) {
                double $$5 = $$1 + this.a.ep().k() / 2.0;
                double $$6 = $$2 + this.a.ep().k() / 2.0;
                double $$7 = $$3 + this.a.ep().k() / 2.0;
                for (int $$8 = 0; $$8 < 6; ++$$8) {
                    this.a.ao().a(lz.a(ly.i, 1.0f), $$5, $$6, $$7, -$$0.g * (double)0.08f * (double)$$8, -$$0.h * (double)0.6f, -$$0.i * (double)0.08f * (double)$$8);
                }
                $$0.b(0.19634955f);
            }
        }
    }

    @Override
    public void a(axf $$0) {
        ++this.e;
        if (this.e >= 200) {
            if (this.f >= 4) {
                this.a.gN().a(cyt.e);
            } else {
                this.a.gN().a(cyt.g);
            }
        } else if (this.e == 10) {
            double $$5;
            ftm $$1 = new ftm(this.a.c.dP() - this.a.dP(), 0.0, this.a.c.dV() - this.a.dV()).d();
            float $$2 = 5.0f;
            double $$3 = this.a.c.dP() + $$1.g * 5.0 / 2.0;
            double $$4 = this.a.c.dV() + $$1.i * 5.0 / 2.0;
            double $$6 = $$5 = this.a.c.f(0.5);
            is.a $$7 = new is.a($$3, $$6, $$4);
            while ($$0.A($$7)) {
                if (($$6 -= 1.0) < 0.0) {
                    $$6 = $$5;
                    break;
                }
                $$7.b($$3, $$6, $$4);
            }
            $$6 = bgj.c($$6) + 1;
            this.g = new cga($$0, $$3, $$6, $$4);
            this.g.a(this.a);
            this.g.a(5.0f);
            this.g.a(200);
            this.g.a(lz.a(ly.i, 1.0f));
            this.g.b(0.25f);
            this.g.a(new cfm(cfo.g));
            $$0.b(this.g);
        }
    }

    @Override
    public void c() {
        this.e = 0;
        ++this.f;
    }

    @Override
    public void d() {
        if (this.g != null) {
            this.g.aC();
            this.g = null;
        }
    }

    public cyt<cyp> h() {
        return cyt.f;
    }

    public void i() {
        this.f = 0;
    }
}

