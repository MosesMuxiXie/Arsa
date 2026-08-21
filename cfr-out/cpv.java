/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.EnumSet;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class cpv<T extends czz>
extends cop {
    static final int a = 6;
    static final int b = 7;
    static final int c = 9;
    static final int d = 11;
    static final double i = cpv.b(100);
    private final T j;
    private @Nullable a k;
    double e;
    double f;
    float g;
    float h;

    public cpv(T $$0, double $$1, double $$2, float $$3, float $$4) {
        this.j = $$0;
        this.e = $$1;
        this.f = $$2;
        this.g = $$3 * $$3;
        this.h = $$4 * $$4;
        this.a(EnumSet.of(cop.a.a, cop.a.b));
    }

    @Override
    public boolean b() {
        return this.h() && !((chl)this.j).fZ();
    }

    private boolean h() {
        return ((chn)this.j).ag_() != null && ((chl)this.j).fx().c(ki.O);
    }

    private int i() {
        int $$0 = Optional.ofNullable(((chl)this.j).fx().a(ki.O)).map(doq::a).orElse(0);
        return cpv.b($$0);
    }

    @Override
    public boolean c() {
        return this.k != null && !this.k.d && this.h();
    }

    @Override
    public void d() {
        super.d();
        ((chn)this.j).w(true);
        this.k = new a();
    }

    @Override
    public void e() {
        super.e();
        ((chn)this.j).N().n();
        ((chn)this.j).w(false);
        this.k = null;
        ((chl)this.j).gf();
    }

    @Override
    public void a() {
        if (this.k == null) {
            return;
        }
        chl $$0 = ((chn)this.j).ag_();
        double $$1 = ((cgk)this.j).h($$0.dP(), $$0.dR(), $$0.dV());
        cgk $$2 = ((cgk)this.j).du();
        float $$3 = 1.0f;
        if ($$2 instanceof chn) {
            chn $$4 = (chn)$$2;
            $$3 = $$4.gK();
        }
        int $$5 = ((cgk)this.j).cq() ? 2 : 0;
        ((chn)this.j).a((cgk)$$0, 30.0f, 30.0f);
        ((chn)this.j).J().a($$0, 30.0f, 30.0f);
        if (this.k.a()) {
            if ($$1 > (double)this.g) {
                ((chn)this.j).N().a((cgk)$$0, (double)$$3 * this.f);
                return;
            }
            this.k.a(this.i());
            ((chl)this.j).c(cdb.a);
        }
        if (this.k.b()) {
            ((chl)this.j).gf();
            double $$6 = Math.sqrt($$1);
            this.k.c = csr.a(this.j, Math.max(0.0, (double)(9 + $$5) - $$6), Math.max(1.0, (double)(11 + $$5) - $$6), 7, $$0.dI());
            this.k.b = 1;
        }
        if (this.k.c()) {
            return;
        }
        if (this.k.c != null) {
            ((chn)this.j).N().a(this.k.c.g, this.k.c.h, this.k.c.i, (double)$$3 * this.f);
            if (((chn)this.j).N().l()) {
                if (this.k.b > 0) {
                    this.k.d = true;
                    return;
                }
                this.k.c = null;
            }
        } else {
            ((chn)this.j).N().a((cgk)$$0, (double)$$3 * this.e);
            if ($$1 < (double)this.h || ((chn)this.j).N().l()) {
                double $$7 = Math.sqrt($$1);
                this.k.c = csr.a(this.j, (double)(6 + $$5) - $$7, (double)(7 + $$5) - $$7, 7, $$0.dI());
            }
        }
    }

    public static class a {
        private int a = -1;
        int b = -1;
        @Nullable ftm c;
        boolean d = false;

        public boolean a() {
            return this.a < 0;
        }

        public void a(int $$0) {
            this.a = $$0;
        }

        public boolean b() {
            if (this.a > 0) {
                --this.a;
                if (this.a == 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean c() {
            if (this.b > 0) {
                ++this.b;
                if ((double)this.b > i) {
                    this.d = true;
                    return true;
                }
            }
            return false;
        }
    }
}

