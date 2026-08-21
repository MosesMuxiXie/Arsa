/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class cyr
extends cyf {
    private static final Logger b = LogUtils.getLogger();
    private static final int c = 5;
    private int d;
    private @Nullable flp e;
    private @Nullable ftm f;
    private @Nullable chl g;
    private boolean h;

    public cyr(cyc $$0) {
        super($$0);
    }

    @Override
    public void a(axf $$0) {
        double $$7;
        if (this.g == null) {
            b.warn("Skipping player strafe phase because no player was found");
            this.a.gN().a(cyt.a);
            return;
        }
        if (this.e != null && this.e.c()) {
            double $$1 = this.g.dP();
            double $$2 = this.g.dV();
            double $$3 = $$1 - this.a.dP();
            double $$4 = $$2 - this.a.dV();
            double $$5 = Math.sqrt($$3 * $$3 + $$4 * $$4);
            double $$6 = Math.min((double)0.4f + $$5 / 80.0 - 1.0, 10.0);
            this.f = new ftm($$1, this.g.dR() + $$6, $$2);
        }
        double d2 = $$7 = this.f == null ? 0.0 : this.f.c(this.a.dP(), this.a.dR(), this.a.dV());
        if ($$7 < 100.0 || $$7 > 22500.0) {
            this.i();
        }
        double $$8 = 64.0;
        if (this.g.g(this.a) < 4096.0) {
            if (this.a.G(this.g)) {
                ++this.d;
                ftm $$9 = new ftm(this.g.dP() - this.a.dP(), 0.0, this.g.dV() - this.a.dV()).d();
                ftm $$10 = new ftm(bgj.a((double)(this.a.ec() * ((float)Math.PI / 180))), 0.0, -bgj.b((double)(this.a.ec() * ((float)Math.PI / 180)))).d();
                float $$11 = (float)$$10.b($$9);
                float $$12 = (float)(Math.acos($$11) * 57.2957763671875);
                $$12 += 0.5f;
                if (this.d >= 5 && $$12 >= 0.0f && $$12 < 10.0f) {
                    double $$13 = 1.0;
                    ftm $$14 = this.a.h(1.0f);
                    double $$15 = this.a.c.dP() - $$14.g * 1.0;
                    double $$16 = this.a.c.f(0.5) + 0.5;
                    double $$17 = this.a.c.dV() - $$14.i * 1.0;
                    double $$18 = this.g.dP() - $$15;
                    double $$19 = this.g.f(0.5) - $$16;
                    double $$20 = this.g.dV() - $$17;
                    ftm $$21 = new ftm($$18, $$19, $$20);
                    if (!this.a.bq()) {
                        $$0.a(null, 1017, this.a.dK(), 0);
                    }
                    den $$22 = new den($$0, this.a, $$21.d());
                    $$22.b($$15, $$16, $$17, 0.0f, 0.0f);
                    $$0.b($$22);
                    this.d = 0;
                    if (this.e != null) {
                        while (!this.e.c()) {
                            this.e.a();
                        }
                    }
                    this.a.gN().a(cyt.a);
                }
            } else if (this.d > 0) {
                --this.d;
            }
        } else if (this.d > 0) {
            --this.d;
        }
    }

    private void i() {
        if (this.e == null || this.e.c()) {
            int $$0;
            int $$1 = $$0 = this.a.gL();
            if (this.a.ep().a(8) == 0) {
                this.h = !this.h;
                $$1 += 6;
            }
            $$1 = this.h ? ++$$1 : --$$1;
            if (this.a.gO() == null || this.a.gO().e() <= 0) {
                $$1 -= 12;
                $$1 &= 7;
                $$1 += 12;
            } else if (($$1 %= 12) < 0) {
                $$1 += 12;
            }
            this.e = this.a.a($$0, $$1, (fln)null);
            if (this.e != null) {
                this.e.a();
            }
        }
        this.j();
    }

    private void j() {
        if (this.e != null && !this.e.c()) {
            double $$3;
            is $$0 = this.e.g();
            this.e.a();
            double $$1 = $$0.u();
            double $$2 = $$0.w();
            while (($$3 = (double)((float)$$0.v() + this.a.ep().i() * 20.0f)) < (double)$$0.v()) {
            }
            this.f = new ftm($$1, $$3, $$2);
        }
    }

    @Override
    public void c() {
        this.d = 0;
        this.f = null;
        this.e = null;
        this.g = null;
    }

    public void a(chl $$0) {
        this.g = $$0;
        int $$1 = this.a.gL();
        int $$2 = this.a.p(this.g.dP(), this.g.dR(), this.g.dV());
        int $$3 = this.g.dO();
        int $$4 = this.g.dU();
        double $$5 = (double)$$3 - this.a.dP();
        double $$6 = (double)$$4 - this.a.dV();
        double $$7 = Math.sqrt($$5 * $$5 + $$6 * $$6);
        double $$8 = Math.min((double)0.4f + $$7 / 80.0 - 1.0, 10.0);
        int $$9 = bgj.c(this.g.dR() + $$8);
        fln $$10 = new fln($$3, $$9, $$4);
        this.e = this.a.a($$1, $$2, $$10);
        if (this.e != null) {
            this.e.a();
            this.j();
        }
    }

    @Override
    public @Nullable ftm f() {
        return this.f;
    }

    public cyt<cyr> h() {
        return cyt.b;
    }
}

