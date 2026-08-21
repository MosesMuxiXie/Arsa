/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class dcd
extends czz {
    private static final alw<Byte> a = ama.a(dcd.class, aly.a);
    private static final float b = 0.1f;

    public dcd(cgu<? extends dcd> $$0, dwo $$1) {
        super((cgu<? extends czz>)$$0, $$1);
    }

    @Override
    protected void D() {
        this.cs.a(1, new coh(this));
        this.cs.a(2, new cnu<cto>(this, cto.class, 6.0f, 1.0, 1.2, $$0 -> !((cto)$$0).gP()));
        this.cs.a(3, new cov(this, 0.4f));
        this.cs.a(4, new a(this));
        this.cs.a(5, new cqd(this, 0.8));
        this.cs.a(6, new cox(this, ddm.class, 8.0f));
        this.cs.a(6, new cpk(this));
        this.ct.a(1, new cqi(this, new Class[0]));
        this.ct.a(2, new c<ddm>(this, ddm.class));
        this.ct.a(3, new c<cwh>(this, cwh.class));
    }

    @Override
    protected cre b(dwo $$0) {
        return new crf(this, $$0);
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(a, (byte)0);
    }

    @Override
    public void g() {
        super.g();
        if (!this.ao().B_()) {
            this.x(this.ad);
        }
    }

    public static cir.a p() {
        return czz.gW().a(cis.u, 16.0).a(cis.x, 0.3f);
    }

    @Override
    protected bcz W() {
        return bda.Cd;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.Cf;
    }

    @Override
    protected bcz fd() {
        return bda.Ce;
    }

    @Override
    protected void b(is $$0, eoh $$1) {
        this.a(bda.Cg, 0.15f, 1.0f);
    }

    @Override
    public boolean fl() {
        return this.gP();
    }

    @Override
    public void a(eoh $$0, ftm $$1) {
        if (!$$0.a(dzs.bz)) {
            super.a($$0, $$1);
        }
    }

    @Override
    public boolean b(cfm $$0) {
        if ($$0.a(cfo.s)) {
            return false;
        }
        return super.b($$0);
    }

    public boolean gP() {
        return (this.az.a(a) & 1) != 0;
    }

    public void x(boolean $$0) {
        byte $$1 = this.az.a(a);
        $$1 = $$0 ? (byte)($$1 | 1) : (byte)($$1 & 0xFFFFFFFE);
        this.az.a(a, $$1);
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        dby $$5;
        $$3 = super.a($$0, $$1, $$2, $$3);
        bgr $$4 = $$0.G_();
        if ($$4.a(100) == 0 && ($$5 = cgu.bn.a(this.ao(), cgt.g)) != null) {
            $$5.b(this.dP(), this.dR(), this.dV(), this.ec(), 0.0f);
            $$5.a($$0, $$1, $$2, null);
            $$5.a((cgk)this, false, false);
        }
        if ($$3 == null) {
            $$3 = new b();
            if ($$0.av() == ccz.d && $$4.i() < 0.1f * $$1.d()) {
                ((b)$$3).a($$4);
            }
        }
        if ($$3 instanceof b) {
            b $$6 = (b)$$3;
            jd<cfk> $$7 = $$6.a;
            if ($$7 != null) {
                this.a(new cfm($$7, -1));
            }
        }
        return $$3;
    }

    @Override
    public ftm m(cgk $$0) {
        if ($$0.dF() <= this.dF()) {
            return new ftm(0.0, 0.3125 * (double)this.eF(), 0.0);
        }
        return super.m($$0);
    }

    static class a
    extends coz {
        public a(dcd $$0) {
            super($$0, 1.0, true);
        }

        @Override
        public boolean b() {
            return super.b() && !this.a.cr();
        }

        @Override
        public boolean c() {
            float $$0 = this.a.bO();
            if ($$0 >= 0.5f && this.a.ep().a(100) == 0) {
                this.a.g((chl)null);
                return false;
            }
            return super.c();
        }
    }

    static class c<T extends chl>
    extends cqj<T> {
        public c(dcd $$0, Class<T> $$1) {
            super((chn)$$0, $$1, true);
        }

        @Override
        public boolean b() {
            float $$0 = this.e.bO();
            if ($$0 >= 0.5f) {
                return false;
            }
            return super.b();
        }
    }

    public static class b
    implements cie {
        public @Nullable jd<cfk> a;

        public void a(bgr $$0) {
            int $$1 = $$0.a(5);
            if ($$1 <= 1) {
                this.a = cfo.a;
            } else if ($$1 <= 2) {
                this.a = cfo.e;
            } else if ($$1 <= 3) {
                this.a = cfo.j;
            } else if ($$1 <= 4) {
                this.a = cfo.n;
            }
        }
    }
}

