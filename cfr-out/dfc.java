/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public class dfc
extends dfa {
    private long b = 0L;

    public dfc(cgu<? extends dfc> $$0, dwo $$1) {
        super((cgu<? extends dfa>)$$0, $$1);
    }

    public dfc(dwo $$0, chl $$1, dlt $$2) {
        super(cgu.U, $$1, $$0, $$2);
    }

    @Override
    protected dlp f() {
        return dlx.uj;
    }

    @Override
    protected void a(@Nullable cgr<cgk> $$0) {
        this.i();
        super.a($$0);
        this.k();
    }

    private void i() {
        cgk cgk2 = this.p();
        if (cgk2 instanceof axg) {
            axg $$0 = (axg)cgk2;
            $$0.b(this);
        }
    }

    private void k() {
        cgk cgk2 = this.p();
        if (cgk2 instanceof axg) {
            axg $$0 = (axg)cgk2;
            $$0.a(this);
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public @Nullable cgk p() {
        void $$1;
        dwo dwo2;
        if (this.a == null || !((dwo2 = this.ao()) instanceof axf)) {
            return super.p();
        }
        axf $$0 = (axf)dwo2;
        return this.a.a((dwo)$$1, cgk.class);
    }

    private static @Nullable cgk a(axf $$0, UUID $$1) {
        cgk $$2 = $$0.a($$1);
        if ($$2 != null) {
            return $$2;
        }
        return $$0.s().aj().b($$1);
    }

    @Override
    protected void a(ftj $$0) {
        super.a($$0);
        $$0.a().a(this.en().b((cgk)this, this.p()), 0.0f);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected void b(ftk $$0) {
        void $$3;
        block14: {
            block13: {
                super.b($$0);
                for (int $$1 = 0; $$1 < 32; ++$$1) {
                    this.ao().a(ly.ag, this.dP(), this.dR() + this.as.j() * 2.0, this.dV(), this.as.k(), 0.0, this.as.k());
                }
                dwo dwo2 = this.ao();
                if (!(dwo2 instanceof axf)) break block13;
                axf $$2 = (axf)dwo2;
                if (!this.eh()) break block14;
            }
            return;
        }
        cgk $$4 = this.p();
        if ($$4 == null || !dfc.a($$4, (dwo)$$3)) {
            this.aC();
            return;
        }
        ftm $$5 = this.bS();
        if ($$4 instanceof axg) {
            axg $$6 = (axg)$$4;
            if ($$6.g.c()) {
                axg $$8;
                czt $$7;
                if (this.as.i() < 0.05f && $$3.O() && ($$7 = cgu.S.a((dwo)$$3, cgt.k)) != null) {
                    $$7.b($$4.dP(), $$4.dR(), $$4.dV(), $$4.ec(), $$4.ee());
                    $$3.b($$7);
                }
                if (this.aO()) {
                    $$4.aM();
                }
                if (($$8 = $$6.a(new fmb((axf)$$3, $$5, ftm.c, 0.0f, 0.0f, chz.a(chz.k, chz.l), fmb.a))) != null) {
                    $$8.l();
                    $$8.hr();
                    $$8.a($$6.A(), this.en().m(), 5.0f);
                }
                this.a((dwo)$$3, $$5);
            }
        } else {
            cgk $$9 = $$4.b(new fmb((axf)$$3, $$5, $$4.dN(), $$4.ec(), $$4.ee(), fmb.a));
            if ($$9 != null) {
                $$9.l();
            }
            this.a((dwo)$$3, $$5);
        }
        this.aC();
    }

    private static boolean a(cgk $$0, dwo $$1) {
        if ($$0.ao().aq() == $$1.aq()) {
            if ($$0 instanceof chl) {
                chl $$2 = (chl)$$0;
                return $$2.cb() && !$$2.gr();
            }
            return $$0.cb();
        }
        return $$0.o(true);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void g() {
        var2_1 = this.ao();
        if (!(var2_1 instanceof axf)) {
            super.g();
            return;
        }
        $$0 = (axf)var2_1;
        $$2 = jw.b(this.dI().a());
        $$3 = jw.b(this.dI().c());
        v0 = $$4 = this.a != null ? dfc.a((axf)$$1, this.a.c()) : null;
        if (!($$4 instanceof axg)) ** GOTO lbl-1000
        $$5 = (axg)$$4;
        if (!$$4.cb() && !$$5.k && $$5.A().U().a(eua.j).booleanValue()) {
            this.aC();
        } else lbl-1000:
        // 2 sources

        {
            super.g();
        }
        if (!this.cb()) {
            return;
        }
        $$6 = is.a(this.dI());
        if ((--this.b <= 0L || $$2 != jw.a($$6.u()) || $$3 != jw.a($$6.w())) && $$4 instanceof axg) {
            $$7 = (axg)$$4;
            this.b = $$7.c(this);
        }
    }

    private void a(dwo $$0, ftm $$1) {
        $$0.a(null, $$1.g, $$1.h, $$1.i, bda.xh, bdb.h);
    }

    @Override
    public @Nullable cgk b(fmb $$0) {
        cgk $$1 = super.b($$0);
        if ($$1 != null) {
            $$1.f(is.a($$1.dI()));
        }
        return $$1;
    }

    @Override
    public boolean a(dwo $$0, dwo $$1) {
        cgk cgk2;
        if ($$0.aq() == dwo.j && $$1.aq() == dwo.h && (cgk2 = this.p()) instanceof axg) {
            axg $$2 = (axg)cgk2;
            return super.a($$0, $$1) && $$2.i;
        }
        return super.a($$0, $$1);
    }

    @Override
    protected void a(eoh $$0) {
        cgk cgk2;
        super.a($$0);
        if ($$0.a(dzs.lB) && (cgk2 = this.p()) instanceof axg) {
            axg $$1 = (axg)cgk2;
            $$1.a($$0);
        }
    }

    @Override
    public void b(cgk.e $$0) {
        if ($$0 != cgk.e.d) {
            this.i();
        }
        super.b($$0);
    }

    @Override
    public void a(boolean $$0, is $$1) {
        cgk.a((cgk)this, $$0, $$1);
    }

    @Override
    public void m(boolean $$0) {
        cgk.a((cgk)this, $$0);
    }
}

