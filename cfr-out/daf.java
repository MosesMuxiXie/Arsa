/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.EnumSet;
import org.jspecify.annotations.Nullable;

public class daf
extends czz {
    private @Nullable b a;

    public daf(cgu<? extends daf> $$0, dwo $$1) {
        super((cgu<? extends czz>)$$0, $$1);
    }

    @Override
    protected void D() {
        this.a = new b(this);
        this.cs.a(1, new coh(this));
        this.cs.a(1, new coc(this, this.ao()));
        this.cs.a(3, this.a);
        this.cs.a(4, new coz(this, 1.0, false));
        this.cs.a(5, new a(this));
        this.ct.a(1, new cqi(this, new Class[0]).a(new Class[0]));
        this.ct.a(2, new cqj<ddm>((chn)this, ddm.class, true));
    }

    public static cir.a k() {
        return czz.gW().a(cis.u, 8.0).a(cis.x, 0.25).a(cis.d, 1.0);
    }

    @Override
    protected cgk.d bv() {
        return cgk.d.c;
    }

    @Override
    protected bcz W() {
        return bda.Ae;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.Ag;
    }

    @Override
    protected bcz fd() {
        return bda.Af;
    }

    @Override
    protected void b(is $$0, eoh $$1) {
        this.a(bda.Ah, 0.15f, 1.0f);
    }

    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        if (this.a($$0, $$1)) {
            return false;
        }
        if (($$1.d() != null || $$1.a(bdq.x)) && this.a != null) {
            this.a.h();
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    public void g() {
        this.bC = this.ec();
        super.g();
    }

    @Override
    public void s(float $$0) {
        this.v($$0);
        super.s($$0);
    }

    @Override
    public float a(is $$0, dwr $$1) {
        if (edw.p($$1.a_($$0.e()))) {
            return 10.0f;
        }
        return super.a($$0, $$1);
    }

    public static boolean b(cgu<daf> $$0, dwp $$1, cgt $$2, is $$3, bgr $$4) {
        if (!daf.c($$0, $$1, $$2, $$3, $$4)) {
            return false;
        }
        if (cgt.a($$2)) {
            return true;
        }
        ddm $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
        return $$5 == null;
    }

    static class b
    extends cop {
        private final daf a;
        private int b;

        public b(daf $$0) {
            this.a = $$0;
        }

        public void h() {
            if (this.b == 0) {
                this.b = this.a(20);
            }
        }

        @Override
        public boolean b() {
            return this.b > 0;
        }

        @Override
        public void a() {
            --this.b;
            if (this.b <= 0) {
                dwo $$0 = this.a.ao();
                bgr $$1 = this.a.ep();
                is $$2 = this.a.dK();
                int $$3 = 0;
                block0: while ($$3 <= 5 && $$3 >= -5) {
                    int $$4 = 0;
                    while ($$4 <= 10 && $$4 >= -10) {
                        int $$5 = 0;
                        while ($$5 <= 10 && $$5 >= -10) {
                            is $$6 = $$2.b($$4, $$3, $$5);
                            eoh $$7 = $$0.a_($$6);
                            dzq $$8 = $$7.b();
                            if ($$8 instanceof edw) {
                                if (daf$b.a($$0).U().a(eua.F).booleanValue()) {
                                    $$0.a($$6, true, this.a);
                                } else {
                                    $$0.a($$6, ((edw)$$8).r($$0.a_($$6)), 3);
                                }
                                if ($$1.h()) break block0;
                            }
                            $$5 = ($$5 <= 0 ? 1 : 0) - $$5;
                        }
                        $$4 = ($$4 <= 0 ? 1 : 0) - $$4;
                    }
                    $$3 = ($$3 <= 0 ? 1 : 0) - $$3;
                }
            }
        }
    }

    static class a
    extends cpm {
        private @Nullable iz i;
        private boolean j;

        public a(daf $$0) {
            super($$0, 1.0, 10);
            this.a(EnumSet.of(cop.a.a));
        }

        @Override
        public boolean b() {
            if (this.b.ag_() != null) {
                return false;
            }
            if (!this.b.N().l()) {
                return false;
            }
            bgr $$0 = this.b.ep();
            if (daf$a.a(this.b).U().a(eua.F).booleanValue() && $$0.a(daf$a.b(10)) == 0) {
                this.i = iz.b($$0);
                is $$1 = is.a(this.b.dP(), this.b.dR() + 0.5, this.b.dV()).a(this.i);
                eoh $$2 = this.b.ao().a_($$1);
                if (edw.p($$2)) {
                    this.j = true;
                    return true;
                }
            }
            this.j = false;
            return super.b();
        }

        @Override
        public boolean c() {
            if (this.j) {
                return false;
            }
            return super.c();
        }

        @Override
        public void d() {
            is $$1;
            if (!this.j) {
                super.d();
                return;
            }
            dwo $$0 = this.b.ao();
            eoh $$2 = $$0.a_($$1 = is.a(this.b.dP(), this.b.dR() + 0.5, this.b.dV()).a(this.i));
            if (edw.p($$2)) {
                $$0.a($$1, edw.q($$2), 3);
                this.b.U();
                this.b.aC();
            }
        }
    }
}

