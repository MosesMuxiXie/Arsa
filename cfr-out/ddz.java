/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Collection;
import java.util.Collections;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class ddz
extends dec {
    private static final Logger b = LogUtils.getLogger();
    private final bgr c = bgr.a();
    private boolean d;
    private int e;
    private static final int f = 10;
    private static final alw<Integer> g = ama.a(ddz.class, aly.b);
    private static final alw<Boolean> h = ama.a(ddz.class, aly.k);
    private int i;
    private int j;
    private int k;
    private int l;
    private float m;
    private boolean n = true;
    private @Nullable cgk o;
    private a p = ddz$a.a;
    private final int q;
    private final int r;
    private final chf s = new chf(this);

    private ddz(cgu<? extends ddz> $$0, dwo $$1, int $$2, int $$3) {
        super((cgu<? extends dec>)$$0, $$1);
        this.q = Math.max(0, $$2);
        this.r = Math.max(0, $$3);
    }

    public ddz(cgu<? extends ddz> $$0, dwo $$1) {
        this($$0, $$1, 0, 0);
    }

    public ddz(ddm $$0, dwo $$1, int $$2, int $$3) {
        this(cgu.cc, $$1, $$2, $$3);
        this.d((cgk)$$0);
        float $$4 = $$0.ee();
        float $$5 = $$0.ec();
        float $$6 = bgj.b((double)(-$$5 * ((float)Math.PI / 180) - (float)Math.PI));
        float $$7 = bgj.a((double)(-$$5 * ((float)Math.PI / 180) - (float)Math.PI));
        float $$8 = -bgj.b((double)(-$$4 * ((float)Math.PI / 180)));
        float $$9 = bgj.a((double)(-$$4 * ((float)Math.PI / 180)));
        double $$10 = $$0.dP() - (double)$$7 * 0.3;
        double $$11 = $$0.dT();
        double $$12 = $$0.dV() - (double)$$6 * 0.3;
        this.b($$10, $$11, $$12, $$5, $$4);
        ftm $$13 = new ftm(-$$7, bgj.a(-($$9 / $$8), -5.0f, 5.0f), -$$6);
        double $$14 = $$13.g();
        $$13 = $$13.d(0.6 / $$14 + this.as.a(0.5, 0.0103365), 0.6 / $$14 + this.as.a(0.5, 0.0103365), 0.6 / $$14 + this.as.a(0.5, 0.0103365));
        this.k($$13);
        this.v((float)(bgj.d($$13.g, $$13.i) * 57.2957763671875));
        this.w((float)(bgj.d($$13.h, $$13.i()) * 57.2957763671875));
        this.ab = this.ec();
        this.ac = this.ee();
    }

    @Override
    public chf l_() {
        return this.s;
    }

    @Override
    protected void a(ama.a $$0) {
        $$0.a(g, 0);
        $$0.a(h, false);
    }

    @Override
    protected boolean ah_() {
        return true;
    }

    @Override
    public void a(alw<?> $$0) {
        if (g.equals($$0)) {
            int $$1 = this.aD().a(g);
            cgk cgk2 = this.o = $$1 > 0 ? this.ao().a($$1 - 1) : null;
        }
        if (h.equals($$0)) {
            this.d = this.aD().a(h);
            if (this.d) {
                this.m(this.dN().g, -0.4f * bgj.a(this.c, 0.6f, 1.0f), this.dN().i);
            }
        }
        super.a($$0);
    }

    @Override
    public boolean a(double $$0) {
        double $$1 = 64.0;
        return $$0 < 4096.0;
    }

    @Override
    public void g() {
        boolean $$4;
        this.c.b(this.cY().getLeastSignificantBits() ^ this.ao().au());
        this.l_().e();
        super.g();
        ddm $$0 = this.i();
        if ($$0 == null) {
            this.aC();
            return;
        }
        if (!this.ao().B_() && this.a($$0)) {
            return;
        }
        if (this.aV()) {
            ++this.i;
            if (this.i >= 1200) {
                this.aC();
                return;
            }
        } else {
            this.i = 0;
        }
        float $$1 = 0.0f;
        is $$2 = this.dK();
        flb $$3 = this.ao().b_($$2);
        if ($$3.a(bdv.a)) {
            $$1 = $$3.a(this.ao(), $$2);
        }
        boolean bl2 = $$4 = $$1 > 0.0f;
        if (this.p == ddz$a.a) {
            if (this.o != null) {
                this.k(ftm.c);
                this.p = ddz$a.b;
                return;
            }
            if ($$4) {
                this.k(this.dN().d(0.3, 0.2, 0.3));
                this.p = ddz$a.c;
                return;
            }
            this.r();
        } else {
            if (this.p == ddz$a.b) {
                if (this.o != null) {
                    if (this.o.eh() || !this.o.av() || this.o.ao().aq() != this.ao().aq()) {
                        this.C(null);
                        this.p = ddz$a.a;
                    } else {
                        this.a_(this.o.dP(), this.o.f(0.8), this.o.dV());
                    }
                }
                return;
            }
            if (this.p == ddz$a.c) {
                ftm $$5 = this.dN();
                double $$6 = this.dR() + $$5.h - (double)$$2.v() - (double)$$1;
                if (Math.abs($$6) < 0.01) {
                    $$6 += Math.signum($$6) * 0.1;
                }
                this.m($$5.g * 0.9, $$5.h - $$6 * (double)this.as.i() * 0.2, $$5.i * 0.9);
                this.n = this.j > 0 || this.l > 0 ? this.n && this.e < 10 && this.b($$2) : true;
                if ($$4) {
                    this.e = Math.max(0, this.e - 1);
                    if (this.d) {
                        this.k(this.dN().b(0.0, -0.1 * (double)this.c.i() * (double)this.c.i(), 0.0));
                    }
                    if (!this.ao().B_()) {
                        this.a($$2);
                    }
                } else {
                    this.e = Math.min(10, this.e + 1);
                }
            }
        }
        if (!$$3.a(bdv.a) && !this.aV() && this.o == null) {
            this.k(this.dN().b(0.0, -0.03, 0.0));
        }
        this.a(chp.a, this.dN());
        this.aW();
        this.q();
        if (this.p == ddz$a.a && (this.aV() || this.ad)) {
            this.k(ftm.c);
        }
        double $$7 = 0.92;
        this.k(this.dN().c(0.92));
        this.aH();
    }

    private boolean a(ddm $$0) {
        if ($$0.av()) {
            dlt $$1 = $$0.fx();
            dlt $$2 = $$0.fy();
            boolean $$3 = $$1.a(dlx.sZ);
            boolean $$4 = $$2.a(dlx.sZ);
            if (($$3 || $$4) && this.g($$0) <= 1024.0) {
                return false;
            }
        }
        this.aC();
        return true;
    }

    private void r() {
        ftk $$0 = dee.a((cgk)this, this::b);
        this.a($$0);
    }

    @Override
    protected boolean b(cgk $$0) {
        return super.b($$0) || $$0.cb() && $$0 instanceof czl;
    }

    @Override
    protected void a(ftj $$0) {
        super.a($$0);
        if (!this.ao().B_()) {
            this.C($$0.a());
        }
    }

    @Override
    protected void a(fti $$0) {
        super.a($$0);
        this.k(this.dN().d().c($$0.a(this)));
    }

    private void C(@Nullable cgk $$0) {
        this.o = $$0;
        this.aD().a(g, $$0 == null ? 0 : $$0.aA() + 1);
    }

    private void a(is $$0) {
        axf $$1 = (axf)this.ao();
        int $$2 = 1;
        is $$3 = $$0.d();
        if (this.as.i() < 0.25f && this.ao().v($$3)) {
            ++$$2;
        }
        if (this.as.i() < 0.5f && !this.ao().k($$3)) {
            --$$2;
        }
        if (this.j > 0) {
            --this.j;
            if (this.j <= 0) {
                this.k = 0;
                this.l = 0;
                this.aD().a(h, false);
            }
        } else if (this.l > 0) {
            this.l -= $$2;
            if (this.l > 0) {
                double $$9;
                double $$8;
                this.m += (float)this.as.a(0.0, 9.188);
                float $$4 = this.m * ((float)Math.PI / 180);
                float $$5 = bgj.a((double)$$4);
                float $$6 = bgj.b((double)$$4);
                double $$7 = this.dP() + (double)($$5 * (float)this.l * 0.1f);
                eoh $$10 = $$1.a_(is.a($$7, ($$8 = (double)((float)bgj.c(this.dR()) + 1.0f)) - 1.0, $$9 = this.dV() + (double)($$6 * (float)this.l * 0.1f)));
                if ($$10.a(dzs.J)) {
                    if (this.as.i() < 0.15f) {
                        $$1.a(ly.d, $$7, $$8 - (double)0.1f, $$9, 1, (double)$$5, 0.1, (double)$$6, 0.0);
                    }
                    float $$11 = $$5 * 0.04f;
                    float $$12 = $$6 * 0.04f;
                    $$1.a(ly.F, $$7, $$8, $$9, 0, (double)$$12, 0.01, (double)(-$$11), 1.0);
                    $$1.a(ly.F, $$7, $$8, $$9, 0, (double)(-$$12), 0.01, (double)$$11, 1.0);
                }
            } else {
                this.a(bda.kL, 0.25f, 1.0f + (this.as.i() - this.as.i()) * 0.4f);
                double $$13 = this.dR() + 0.5;
                $$1.a(ly.d, this.dP(), $$13, this.dV(), (int)(1.0f + this.dF() * 20.0f), (double)this.dF(), 0.0, (double)this.dF(), (double)0.2f);
                $$1.a(ly.F, this.dP(), $$13, this.dV(), (int)(1.0f + this.dF() * 20.0f), (double)this.dF(), 0.0, (double)this.dF(), (double)0.2f);
                this.j = bgj.a(this.as, 20, 40);
                this.aD().a(h, true);
            }
        } else if (this.k > 0) {
            this.k -= $$2;
            float $$14 = 0.15f;
            if (this.k < 20) {
                $$14 += (float)(20 - this.k) * 0.05f;
            } else if (this.k < 40) {
                $$14 += (float)(40 - this.k) * 0.02f;
            } else if (this.k < 60) {
                $$14 += (float)(60 - this.k) * 0.01f;
            }
            if (this.as.i() < $$14) {
                double $$19;
                double $$18;
                float $$15 = bgj.a(this.as, 0.0f, 360.0f) * ((float)Math.PI / 180);
                float $$16 = bgj.a(this.as, 25.0f, 60.0f);
                double $$17 = this.dP() + (double)(bgj.a((double)$$15) * $$16) * 0.1;
                eoh $$20 = $$1.a_(is.a($$17, ($$18 = (double)((float)bgj.c(this.dR()) + 1.0f)) - 1.0, $$19 = this.dV() + (double)(bgj.b((double)$$15) * $$16) * 0.1));
                if ($$20.a(dzs.J)) {
                    $$1.a(ly.aq, $$17, $$18, $$19, 2 + this.as.a(2), (double)0.1f, 0.0, (double)0.1f, 0.0);
                }
            }
            if (this.k <= 0) {
                this.m = bgj.a(this.as, 0.0f, 360.0f);
                this.l = bgj.a(this.as, 20, 80);
            }
        } else {
            this.k = bgj.a(this.as, 100, 600);
            this.k -= this.r;
        }
    }

    private boolean b(is $$0) {
        b $$1 = ddz$b.c;
        for (int $$2 = -1; $$2 <= 2; ++$$2) {
            b $$3 = this.a($$0.b(-2, $$2, -2), $$0.b(2, $$2, 2));
            switch ($$3.ordinal()) {
                case 2: {
                    return false;
                }
                case 0: {
                    if ($$1 != ddz$b.c) break;
                    return false;
                }
                case 1: {
                    if ($$1 != ddz$b.a) break;
                    return false;
                }
            }
            $$1 = $$3;
        }
        return true;
    }

    private b a(is $$02, is $$12) {
        return is.d($$02, $$12).map(this::c).reduce(($$0, $$1) -> $$0 == $$1 ? $$0 : ddz$b.c).orElse(ddz$b.c);
    }

    private b c(is $$0) {
        eoh $$1 = this.ao().a_($$0);
        if ($$1.l() || $$1.a(dzs.fV)) {
            return ddz$b.a;
        }
        flb $$2 = $$1.y();
        if ($$2.a(bdv.a) && $$2.b() && $$1.g(this.ao(), $$0).c()) {
            return ddz$b.b;
        }
        return ddz$b.c;
    }

    public boolean f() {
        return this.n;
    }

    @Override
    protected void a(fns $$0) {
    }

    @Override
    protected void a(fnq $$0) {
    }

    public int a(dlt $$0) {
        ddm $$1 = this.i();
        if (this.ao().B_() || $$1 == null || this.a($$1)) {
            return 0;
        }
        int $$2 = 0;
        if (this.o != null) {
            this.c(this.o);
            aj.E.a((axg)$$1, $$0, this, Collections.emptyList());
            this.ao().a((cgk)this, (byte)31);
            $$2 = this.o instanceof czl ? 3 : 5;
        } else if (this.j > 0) {
            fod $$3 = new fod.a((axf)this.ao()).a(fqx.h, this.dI()).a(fqx.k, $$0).a(fqx.a, this).a((float)this.q + $$1.eB()).a(fqw.f);
            fof $$4 = this.ao().s().be().a(fnv.am);
            ObjectArrayList<dlt> $$5 = $$4.a($$3);
            aj.E.a((axg)$$1, $$0, this, (Collection<dlt>)$$5);
            for (dlt $$6 : $$5) {
                czl $$7 = new czl(this.ao(), this.dP(), this.dR(), this.dV(), $$6);
                double $$8 = $$1.dP() - this.dP();
                double $$9 = $$1.dR() - this.dR();
                double $$10 = $$1.dV() - this.dV();
                double $$11 = 0.1;
                $$7.m($$8 * 0.1, $$9 * 0.1 + Math.sqrt(Math.sqrt($$8 * $$8 + $$9 * $$9 + $$10 * $$10)) * 0.08, $$10 * 0.1);
                this.ao().b($$7);
                $$1.ao().b(new cgz($$1.ao(), $$1.dP(), $$1.dR() + 0.5, $$1.dV() + 0.5, this.as.a(6) + 1));
                if (!$$6.a(bdy.bo)) continue;
                $$1.a(bdk.T, 1);
            }
            $$2 = 1;
        }
        if (this.aV()) {
            $$2 = 2;
        }
        this.aC();
        return $$2;
    }

    @Override
    public void b(byte $$0) {
        ddm $$1;
        cgk cgk2;
        if ($$0 == 31 && this.ao().B_() && (cgk2 = this.o) instanceof ddm && ($$1 = (ddm)cgk2).gH()) {
            this.c(this.o);
        }
        super.b($$0);
    }

    protected void c(cgk $$0) {
        cgk $$1 = this.p();
        if ($$1 == null) {
            return;
        }
        ftm $$2 = new ftm($$1.dP() - this.dP(), $$1.dR() - this.dR(), $$1.dV() - this.dV()).c(0.1);
        $$0.k($$0.dN().e($$2));
    }

    @Override
    protected cgk.d bv() {
        return cgk.d.a;
    }

    @Override
    public void a(cgk.e $$0) {
        this.a((ddz)null);
        super.a($$0);
    }

    @Override
    public void aE() {
        this.a((ddz)null);
    }

    @Override
    public void d(@Nullable cgk $$0) {
        super.d($$0);
        this.a(this);
    }

    private void a(@Nullable ddz $$0) {
        ddm $$1 = this.i();
        if ($$1 != null) {
            $$1.cx = $$0;
        }
    }

    public @Nullable ddm i() {
        ddm $$1;
        cgk $$0 = this.p();
        return $$0 instanceof ddm ? ($$1 = (ddm)$$0) : null;
    }

    public @Nullable cgk k() {
        return this.o;
    }

    @Override
    public boolean o(boolean $$0) {
        return false;
    }

    @Override
    public aay<adb> a(axd $$0) {
        cgk $$1 = this.p();
        return new adc((cgk)this, $$0, $$1 == null ? this.aA() : $$1.aA());
    }

    @Override
    public void a(adc $$0) {
        super.a($$0);
        if (this.i() == null) {
            int $$1 = $$0.n();
            b.error("Failed to recreate fishing hook on client. {} (id: {}) is not a valid owner.", (Object)this.ao().a($$1), (Object)$$1);
            this.aC();
        }
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            d = ddz$a.a();
        }
    }

    static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b();
        public static final /* enum */ b b = new b();
        public static final /* enum */ b c = new b();
        private static final /* synthetic */ b[] d;

        public static b[] values() {
            return (b[])d.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c};
        }

        static {
            d = ddz$b.a();
        }
    }
}

