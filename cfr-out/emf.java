/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import java.util.function.BooleanSupplier;
import org.jspecify.annotations.Nullable;

public class emf
extends emm
implements eme {
    public static final int d = 8;
    public static final int e = 5;
    private static final int[][] f = new int[54][];
    private static final int g = -1;
    private static final yh h = yh.c("container.hopper");
    private jm<dlt> i = jm.a(5, dlt.l);
    private int j = -1;
    private long k;
    private iz q;

    public emf(is $$0, eoh $$1) {
        super(eld.s, $$0, $$1);
        this.q = $$1.c(eds.b);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.i = jm.a(this.b(), dlt.l);
        if (!this.c_($$0)) {
            ccw.a($$0, this.i);
        }
        this.j = $$0.a("TransferCooldown", -1);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        if (!this.d_($$0)) {
            ccw.a($$0, this.i);
        }
        $$0.a("TransferCooldown", this.j);
    }

    @Override
    public int b() {
        return this.i.size();
    }

    @Override
    public dlt a(int $$0, int $$1) {
        this.f_((ddm)null);
        return ccw.a(this.g(), $$0, $$1);
    }

    @Override
    public void a(int $$0, dlt $$1) {
        this.f_((ddm)null);
        this.g().set($$0, $$1);
        $$1.f(this.f_($$1));
    }

    @Override
    public void c(eoh $$0) {
        super.c($$0);
        this.q = $$0.c(eds.b);
    }

    @Override
    protected yh k() {
        return h;
    }

    public static void a(dwo $$0, is $$1, eoh $$2, emf $$3) {
        --$$3.j;
        $$3.k = $$0.au();
        if (!$$3.w()) {
            $$3.e(0);
            emf.a($$0, $$1, $$2, $$3, () -> emf.a($$0, (eme)$$3));
        }
    }

    private static boolean a(dwo $$0, is $$1, eoh $$2, emf $$3, BooleanSupplier $$4) {
        if ($$0.B_()) {
            return false;
        }
        if (!$$3.w() && $$2.c(eds.c).booleanValue()) {
            boolean $$5 = false;
            if (!$$3.c()) {
                $$5 = emf.a($$0, $$1, $$3);
            }
            if (!$$3.l()) {
                $$5 |= $$4.getAsBoolean();
            }
            if ($$5) {
                $$3.e(8);
                emf.a($$0, $$1, $$2);
                return true;
            }
        }
        return false;
    }

    private boolean l() {
        for (dlt $$0 : this.i) {
            if (!$$0.f() && $$0.N() == $$0.k()) continue;
            return false;
        }
        return true;
    }

    private static boolean a(dwo $$0, is $$1, emf $$2) {
        ccv $$3 = emf.b($$0, $$1, $$2);
        if ($$3 == null) {
            return false;
        }
        iz $$4 = $$2.q.g();
        if (emf.b($$3, $$4)) {
            return false;
        }
        for (int $$5 = 0; $$5 < $$2.b(); ++$$5) {
            dlt $$6 = $$2.a($$5);
            if ($$6.f()) continue;
            int $$7 = $$6.N();
            dlt $$8 = emf.a((ccv)$$2, $$3, $$2.a($$5, 1), $$4);
            if ($$8.f()) {
                $$3.e();
                return true;
            }
            $$6.e($$7);
            if ($$7 != 1) continue;
            $$2.a($$5, $$6);
        }
        return false;
    }

    private static int[] a(ccv $$0, iz $$1) {
        if ($$0 instanceof cdp) {
            cdp $$2 = (cdp)$$0;
            return $$2.a($$1);
        }
        int $$3 = $$0.b();
        if ($$3 < f.length) {
            int[] $$4 = f[$$3];
            if ($$4 != null) {
                return $$4;
            }
            int[] $$5 = emf.d($$3);
            emf.f[$$3] = $$5;
            return $$5;
        }
        return emf.d($$3);
    }

    private static int[] d(int $$0) {
        int[] $$1 = new int[$$0];
        for (int $$2 = 0; $$2 < $$1.length; ++$$2) {
            $$1[$$2] = $$2;
        }
        return $$1;
    }

    private static boolean b(ccv $$0, iz $$1) {
        int[] $$2;
        for (int $$3 : $$2 = emf.a($$0, $$1)) {
            dlt $$4 = $$0.a($$3);
            if ($$4.N() >= $$4.k()) continue;
            return false;
        }
        return true;
    }

    public static boolean a(dwo $$0, eme $$1) {
        boolean $$7;
        eoh $$3;
        is $$2 = is.a($$1.C(), $$1.D() + 1.0, $$1.E());
        ccv $$4 = emf.a($$0, $$1, $$2, $$3 = $$0.a_($$2));
        if ($$4 != null) {
            iz $$5 = iz.a;
            for (int $$6 : emf.a($$4, $$5)) {
                if (!emf.a($$1, $$4, $$6, $$5)) continue;
                return true;
            }
            return false;
        }
        boolean bl2 = $$7 = $$1.F() && $$3.m($$0, $$2) && !$$3.a(bdp.cR);
        if (!$$7) {
            for (czl $$8 : emf.b($$0, $$1)) {
                if (!emf.a((ccv)$$1, $$8)) continue;
                return true;
            }
        }
        return false;
    }

    private static boolean a(eme $$0, ccv $$1, int $$2, iz $$3) {
        dlt $$4 = $$1.a($$2);
        if (!$$4.f() && emf.a($$0, $$1, $$4, $$2, $$3)) {
            int $$5 = $$4.N();
            dlt $$6 = emf.a($$1, (ccv)$$0, $$1.a($$2, 1), null);
            if ($$6.f()) {
                $$1.e();
                return true;
            }
            $$4.e($$5);
            if ($$5 == 1) {
                $$1.a($$2, $$4);
            }
        }
        return false;
    }

    public static boolean a(ccv $$0, czl $$1) {
        boolean $$2 = false;
        dlt $$3 = $$1.e().v();
        dlt $$4 = emf.a(null, $$0, $$3, null);
        if ($$4.f()) {
            $$2 = true;
            $$1.a(dlt.l);
            $$1.aC();
        } else {
            $$1.a($$4);
        }
        return $$2;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static dlt a(@Nullable ccv $$0, ccv $$1, dlt $$2, @Nullable iz $$3) {
        if ($$1 instanceof cdp) {
            cdp $$4 = (cdp)$$1;
            if ($$3 != null) {
                int[] $$5 = $$4.a($$3);
                int $$6 = 0;
                while ($$6 < $$5.length) {
                    if ($$2.f()) return $$2;
                    $$2 = emf.b($$0, $$1, $$2, $$5[$$6], $$3);
                    ++$$6;
                }
                return $$2;
            }
        }
        int $$7 = $$1.b();
        int $$8 = 0;
        while ($$8 < $$7) {
            if ($$2.f()) return $$2;
            $$2 = emf.b($$0, $$1, $$2, $$8, $$3);
            ++$$8;
        }
        return $$2;
    }

    private static boolean a(ccv $$0, dlt $$1, int $$2, @Nullable iz $$3) {
        cdp $$4;
        if (!$$0.b($$2, $$1)) {
            return false;
        }
        return !($$0 instanceof cdp) || ($$4 = (cdp)$$0).a($$2, $$1, $$3);
    }

    private static boolean a(ccv $$0, ccv $$1, dlt $$2, int $$3, iz $$4) {
        cdp $$5;
        if (!$$1.a($$0, $$3, $$2)) {
            return false;
        }
        return !($$1 instanceof cdp) || ($$5 = (cdp)$$1).b($$3, $$2, $$4);
    }

    private static dlt b(@Nullable ccv $$0, ccv $$1, dlt $$2, int $$3, @Nullable iz $$4) {
        dlt $$5 = $$1.a($$3);
        if (emf.a($$1, $$2, $$3, $$4)) {
            boolean $$6 = false;
            boolean $$7 = $$1.c();
            if ($$5.f()) {
                $$1.a($$3, $$2);
                $$2 = dlt.l;
                $$6 = true;
            } else if (emf.a($$5, $$2)) {
                int $$8 = $$2.k() - $$5.N();
                int $$9 = Math.min($$2.N(), $$8);
                $$2.h($$9);
                $$5.g($$9);
                boolean bl2 = $$6 = $$9 > 0;
            }
            if ($$6) {
                emf $$10;
                if ($$7 && $$1 instanceof emf && !($$10 = (emf)$$1).x()) {
                    int $$11 = 0;
                    if ($$0 instanceof emf) {
                        emf $$12 = (emf)$$0;
                        if ($$10.k >= $$12.k) {
                            $$11 = 1;
                        }
                    }
                    $$10.e(8 - $$11);
                }
                $$1.e();
            }
        }
        return $$2;
    }

    private static @Nullable ccv b(dwo $$0, is $$1, emf $$2) {
        return emf.a($$0, $$1.a($$2.q));
    }

    private static @Nullable ccv a(dwo $$0, eme $$1, is $$2, eoh $$3) {
        return emf.a($$0, $$2, $$3, $$1.C(), $$1.D() + 1.0, $$1.E());
    }

    public static List<czl> b(dwo $$0, eme $$1) {
        fth $$2 = $$1.an_().d($$1.C() - 0.5, $$1.D() - 0.5, $$1.E() - 0.5);
        return $$0.a(czl.class, $$2, cgs.a);
    }

    public static @Nullable ccv a(dwo $$0, is $$1) {
        return emf.a($$0, $$1, $$0.a_($$1), (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5);
    }

    private static @Nullable ccv a(dwo $$0, is $$1, eoh $$2, double $$3, double $$4, double $$5) {
        ccv $$6 = emf.b($$0, $$1, $$2);
        if ($$6 == null) {
            $$6 = emf.a($$0, $$3, $$4, $$5);
        }
        return $$6;
    }

    private static @Nullable ccv b(dwo $$0, is $$1, eoh $$2) {
        elb $$4;
        dzq $$3 = $$2.b();
        if ($$3 instanceof cdq) {
            return ((cdq)((Object)$$3)).a($$2, $$0, $$1);
        }
        if ($$2.x() && ($$4 = $$0.c_($$1)) instanceof ccv) {
            ccv $$5 = (ccv)((Object)$$4);
            if ($$5 instanceof elj && $$3 instanceof eau) {
                $$5 = eau.a((eau)$$3, $$2, $$0, $$1, true);
            }
            return $$5;
        }
        return null;
    }

    private static @Nullable ccv a(dwo $$0, double $$1, double $$2, double $$3) {
        List<cgk> $$4 = $$0.a((cgk)null, new fth($$1 - 0.5, $$2 - 0.5, $$3 - 0.5, $$1 + 0.5, $$2 + 0.5, $$3 + 0.5), cgs.d);
        if (!$$4.isEmpty()) {
            return (ccv)((Object)$$4.get($$0.y.a($$4.size())));
        }
        return null;
    }

    private static boolean a(dlt $$0, dlt $$1) {
        return $$0.N() <= $$0.k() && dlt.c($$0, $$1);
    }

    @Override
    public double C() {
        return (double)this.o.u() + 0.5;
    }

    @Override
    public double D() {
        return (double)this.o.v() + 0.5;
    }

    @Override
    public double E() {
        return (double)this.o.w() + 0.5;
    }

    @Override
    public boolean F() {
        return true;
    }

    private void e(int $$0) {
        this.j = $$0;
    }

    private boolean w() {
        return this.j > 0;
    }

    private boolean x() {
        return this.j > 8;
    }

    @Override
    protected jm<dlt> g() {
        return this.i;
    }

    @Override
    protected void a(jm<dlt> $$0) {
        this.i = $$0;
    }

    public static void a(dwo $$0, is $$1, eoh $$2, cgk $$3, emf $$4) {
        czl $$5;
        if ($$3 instanceof czl && !($$5 = (czl)$$3).e().f() && $$3.dj().d(-$$1.u(), -$$1.v(), -$$1.w()).c($$4.an_())) {
            emf.a($$0, $$1, $$2, $$4, () -> emf.a((ccv)$$4, $$5));
        }
    }

    @Override
    protected dhi a(int $$0, ddl $$1) {
        return new dik($$0, $$1, this);
    }
}

