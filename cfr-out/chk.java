/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class chk
extends cgk {
    private static final int b = 2;
    private static final double c = 3.0;
    private static final double d = 15.0;
    private int e = 2;
    public long a;
    private int f;
    private boolean g;
    private @Nullable axg h;
    private final Set<cgk> i = Sets.newHashSet();
    private int j;

    public chk(cgu<? extends chk> $$0, dwo $$1) {
        super($$0, $$1);
        this.a = this.as.g();
        this.f = this.as.a(3) + 1;
    }

    public void a(boolean $$0) {
        this.g = $$0;
    }

    @Override
    public bdb dB() {
        return bdb.d;
    }

    public @Nullable axg e() {
        return this.h;
    }

    public void b(@Nullable axg $$0) {
        this.h = $$0;
    }

    private void k() {
        is $$0 = this.m();
        eoh $$1 = this.ao().a_($$0);
        dzq dzq2 = $$1.b();
        if (dzq2 instanceof een) {
            een $$2 = (een)dzq2;
            $$2.c($$1, this.ao(), $$0);
        }
    }

    @Override
    public void g() {
        super.g();
        if (this.e == 2) {
            if (this.ao().B_()) {
                this.ao().a(this.dP(), this.dR(), this.dV(), bda.qg, bdb.d, 10000.0f, 0.8f + this.as.i() * 0.2f, false);
                this.ao().a(this.dP(), this.dR(), this.dV(), bda.qf, bdb.d, 2.0f, 0.5f + this.as.i() * 0.2f, false);
            } else {
                ccz $$02 = this.ao().av();
                if ($$02 == ccz.c || $$02 == ccz.d) {
                    this.a(4);
                }
                this.k();
                chk.b(this.ao(), this.m());
                this.c(etk.G);
            }
        }
        --this.e;
        if (this.e < 0) {
            if (this.f == 0) {
                if (this.ao() instanceof axf) {
                    List<cgk> $$1 = this.ao().a((cgk)this, new fth(this.dP() - 15.0, this.dR() - 15.0, this.dV() - 15.0, this.dP() + 15.0, this.dR() + 6.0 + 15.0, this.dV() + 15.0), (? super cgk $$0) -> $$0.cb() && !this.i.contains($$0));
                    for (axg $$2 : ((axf)this.ao()).a((? super axg $$0) -> $$0.f(this) < 256.0f)) {
                        aj.X.a($$2, this, $$1);
                    }
                }
                this.aC();
            } else if (this.e < -this.as.a(10)) {
                --this.f;
                this.e = 1;
                this.a = this.as.g();
                this.a(0);
            }
        }
        if (this.e >= 0) {
            if (!(this.ao() instanceof axf)) {
                this.ao().c(2);
            } else if (!this.g) {
                List<cgk> $$3 = this.ao().a((cgk)this, new fth(this.dP() - 3.0, this.dR() - 3.0, this.dV() - 3.0, this.dP() + 3.0, this.dR() + 6.0 + 3.0, this.dV() + 3.0), cgk::cb);
                for (cgk $$4 : $$3) {
                    $$4.a((axf)this.ao(), this);
                }
                this.i.addAll($$3);
                if (this.h != null) {
                    aj.F.a(this.h, $$3);
                }
            }
        }
    }

    private is m() {
        ftm $$0 = this.dI();
        return is.a($$0.g, $$0.h - 1.0E-6, $$0.i);
    }

    /*
     * WARNING - void declaration
     */
    private void a(int $$0) {
        void $$2;
        dwo dwo2;
        if (this.g || !((dwo2 = this.ao()) instanceof axf)) {
            return;
        }
        axf $$1 = (axf)dwo2;
        is $$3 = this.dK();
        if (!$$2.j($$3)) {
            return;
        }
        eoh $$4 = dzd.a((dvt)$$2, $$3);
        if ($$2.a_($$3).l() && $$4.a((dwr)$$2, $$3)) {
            $$2.c($$3, $$4);
            ++this.j;
        }
        for (int $$5 = 0; $$5 < $$0; ++$$5) {
            is $$6 = $$3.b(this.as.a(3) - 1, this.as.a(3) - 1, this.as.a(3) - 1);
            $$4 = dzd.a((dvt)$$2, $$6);
            if (!$$2.a_($$6).l() || !$$4.a((dwr)$$2, $$6)) continue;
            $$2.c($$6, $$4);
            ++this.j;
        }
    }

    private static void b(dwo $$0, is $$1) {
        eoh $$2 = $$0.a_($$1);
        boolean $$3 = dlk.b.get().get((Object)$$2.b()) != null;
        boolean $$4 = $$2.b() instanceof ejq;
        if (!$$4 && !$$3) {
            return;
        }
        if ($$4) {
            $$0.c($$1, ejq.c($$0.a_($$1)));
        }
        is.a $$5 = $$1.k();
        int $$6 = $$0.y.a(3) + 3;
        for (int $$7 = 0; $$7 < $$6; ++$$7) {
            int $$8 = $$0.y.a(8) + 1;
            chk.a($$0, $$1, $$5, $$8);
        }
    }

    private static void a(dwo $$0, is $$1, is.a $$2, int $$3) {
        Optional<is> $$5;
        $$2.g($$1);
        for (int $$4 = 0; $$4 < $$3 && !($$5 = chk.c($$0, $$2)).isEmpty(); ++$$4) {
            $$2.g($$5.get());
        }
    }

    private static Optional<is> c(dwo $$0, is $$1) {
        for (is $$22 : is.a($$0.y, 10, $$1, 1)) {
            eoh $$3 = $$0.a_($$22);
            if (!($$3.b() instanceof ejq)) continue;
            ejq.b($$3).ifPresent($$2 -> $$0.c($$22, (eoh)$$2));
            $$0.c(3002, $$22, -1);
            return Optional.of($$22);
        }
        return Optional.empty();
    }

    @Override
    public boolean a(double $$0) {
        double $$1 = 64.0 * chk.dc();
        return $$0 < $$1 * $$1;
    }

    @Override
    protected void a(ama.a $$0) {
    }

    @Override
    protected void a(fnq $$0) {
    }

    @Override
    protected void a(fns $$0) {
    }

    public int f() {
        return this.j;
    }

    public Stream<cgk> i() {
        return this.i.stream().filter(cgk::cb);
    }

    @Override
    public final boolean a(axf $$0, cex $$1, float $$2) {
        return false;
    }
}

