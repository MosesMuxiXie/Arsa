/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class czk
extends cgk {
    private static final Logger f = LogUtils.getLogger();
    private static final eoh g = dzs.L.m();
    private static final int h = 0;
    private static final float i = 0.0f;
    private static final int j = 40;
    private static final boolean k = true;
    private static final boolean l = false;
    private eoh m = g;
    public int a = 0;
    public boolean b = true;
    private boolean n = false;
    private boolean o;
    private int p = 40;
    private float q = 0.0f;
    public @Nullable uz c;
    public boolean d;
    protected static final alw<is> e = ama.a(czk.class, aly.o);

    public czk(cgu<? extends czk> $$0, dwo $$1) {
        super($$0, $$1);
    }

    private czk(dwo $$0, double $$1, double $$2, double $$3, eoh $$4) {
        this((cgu<? extends czk>)cgu.ab, $$0);
        this.m = $$4;
        this.W = true;
        this.a_($$1, $$2, $$3);
        this.k(ftm.c);
        this.Y = $$1;
        this.Z = $$2;
        this.aa = $$3;
        this.a(this.dK());
    }

    public static czk a(dwo $$0, is $$1, eoh $$2) {
        czk $$3 = new czk($$0, (double)$$1.u() + 0.5, $$1.v(), (double)$$1.w() + 0.5, $$2.b(eox.I) ? (eoh)$$2.b(eox.I, false) : $$2);
        $$0.a($$1, $$2.y().g(), 3);
        $$0.b($$3);
        return $$3;
    }

    @Override
    public boolean cT() {
        return false;
    }

    @Override
    public final boolean a(axf $$0, cex $$1, float $$2) {
        if (!this.d($$1)) {
            this.bT();
        }
        return false;
    }

    public void a(is $$0) {
        this.az.a(e, $$0);
    }

    public is e() {
        return this.az.a(e);
    }

    @Override
    protected cgk.d bv() {
        return cgk.d.a;
    }

    @Override
    protected void a(ama.a $$0) {
        $$0.a(e, is.c);
    }

    @Override
    public boolean bX() {
        return !this.eh();
    }

    @Override
    protected double bs() {
        return 0.04;
    }

    @Override
    public void g() {
        if (this.m.l()) {
            this.aC();
            return;
        }
        dzq $$0 = this.m.b();
        ++this.a;
        this.bu();
        this.a(chp.a, this.dN());
        this.aW();
        this.cn();
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$12 = (axf)dwo2;
            if (this.cb() || this.d) {
                fti $$6;
                is $$22 = this.dK();
                boolean $$3 = this.m.b() instanceof ebd;
                boolean $$4 = $$3 && this.ao().b_($$22).a(bdv.a);
                double $$5 = this.dN().h();
                if ($$3 && $$5 > 1.0 && ($$6 = this.ao().a(new dvw(new ftm(this.Y, this.Z, this.aa), this.dI(), dvw.a.a, dvw.b.b, this))).d() != ftk.a.a && this.ao().b_($$6.b()).a(bdv.a)) {
                    $$22 = $$6.b();
                    $$4 = true;
                }
                if (this.aV() || $$4) {
                    eoh $$7 = this.ao().a_($$22);
                    this.k(this.dN().d(0.7, -0.5, 0.7));
                    if (!$$7.a(dzs.ca)) {
                        if (!this.n) {
                            boolean $$10;
                            boolean $$8 = $$7.a(new dpv(this.ao(), $$22, iz.a, dlt.l, iz.b));
                            boolean $$9 = ecr.n(this.ao().a_($$22.e())) && (!$$3 || !$$4);
                            boolean bl2 = $$10 = this.m.a((dwr)this.ao(), $$22) && !$$9;
                            if ($$8 && $$10) {
                                if (this.m.b(eox.I) && this.ao().b_($$22).a() == flc.c) {
                                    this.m = (eoh)this.m.b(eox.I, true);
                                }
                                if (this.ao().a($$22, this.m, 3)) {
                                    elb $$122;
                                    $$12.p().a.a(this, new adj($$22, this.ao().a_($$22)));
                                    this.aC();
                                    if ($$0 instanceof ecq) {
                                        ecq $$11 = (ecq)((Object)$$0);
                                        $$11.a(this.ao(), $$22, this.m, $$7, this);
                                    }
                                    if (this.c != null && this.m.x() && ($$122 = this.ao().c_($$22)) != null) {
                                        try (bgp.j $$13 = new bgp.j($$122.v(), f);){
                                            jr $$14 = this.ao().J_();
                                            fnp $$15 = fnp.a($$13, $$14);
                                            $$122.e($$15);
                                            uz $$16 = $$15.b();
                                            this.c.a((String $$1, vz $$2) -> $$16.a((String)$$1, $$2.d()));
                                            $$122.b(fno.a((bgp)$$13, (jf.a)$$14, $$16));
                                        }
                                        catch (Exception $$17) {
                                            f.error("Failed to load block entity from falling block", (Throwable)$$17);
                                        }
                                        $$122.e();
                                    }
                                } else if (this.b && $$12.U().a(eua.k).booleanValue()) {
                                    this.aC();
                                    this.a($$0, $$22);
                                    this.a($$12, $$0);
                                }
                            } else {
                                this.aC();
                                if (this.b && $$12.U().a(eua.k).booleanValue()) {
                                    this.a($$0, $$22);
                                    this.a($$12, $$0);
                                }
                            }
                        } else {
                            this.aC();
                            this.a($$0, $$22);
                        }
                    }
                } else if (this.a > 100 && ($$22.v() <= this.ao().K_() || $$22.v() > this.ao().aw()) || this.a > 600) {
                    if (this.b && $$12.U().a(eua.k).booleanValue()) {
                        this.a($$12, $$0);
                    }
                    this.aC();
                }
            }
        }
        this.k(this.dN().c(0.98));
    }

    public void a(dzq $$0, is $$1) {
        if ($$0 instanceof ecq) {
            ((ecq)((Object)$$0)).a(this.ao(), $$1, this);
        }
    }

    @Override
    public boolean a(double $$0, float $$1, cex $$22) {
        cex cex2;
        if (!this.o) {
            return false;
        }
        int $$3 = bgj.e($$0 - 1.0);
        if ($$3 < 0) {
            return false;
        }
        Predicate<cgk> $$4 = cgs.e.and(cgs.b);
        dzq dzq2 = this.m.b();
        if (dzq2 instanceof ecq) {
            ecq $$5 = (ecq)((Object)dzq2);
            cex2 = $$5.a(this);
        } else {
            cex2 = this.en().a(this);
        }
        cex $$6 = cex2;
        float $$7 = Math.min(bgj.b((float)$$3 * this.q), this.p);
        this.ao().a((cgk)this, this.dj(), $$4).forEach($$2 -> $$2.a($$6, $$7));
        boolean $$8 = this.m.a(bdp.K);
        if ($$8 && $$7 > 0.0f && this.as.i() < 0.05f + (float)$$3 * 0.05f) {
            eoh $$9 = dyq.e(this.m);
            if ($$9 == null) {
                this.n = true;
            } else {
                this.m = $$9;
            }
        }
        return false;
    }

    @Override
    protected void a(fns $$0) {
        $$0.a("BlockState", eoh.a, this.m);
        $$0.a("Time", this.a);
        $$0.a("DropItem", this.b);
        $$0.a("HurtEntities", this.o);
        $$0.a("FallHurtAmount", this.q);
        $$0.a("FallHurtMax", this.p);
        if (this.c != null) {
            $$0.a("TileEntityData", uz.a, this.c);
        }
        $$0.a("CancelDrop", this.n);
    }

    @Override
    protected void a(fnq $$0) {
        this.m = $$0.a("BlockState", eoh.a).orElse(g);
        this.a = $$0.a("Time", 0);
        boolean $$1 = this.m.a(bdp.K);
        this.o = $$0.a("HurtEntities", $$1);
        this.q = $$0.a("FallHurtAmount", 0.0f);
        this.p = $$0.a("FallHurtMax", 40);
        this.b = $$0.a("DropItem", true);
        this.c = $$0.a("TileEntityData", uz.a).orElse(null);
        this.n = $$0.a("CancelDrop", false);
    }

    public void b(float $$0, int $$1) {
        this.o = true;
        this.q = $$0;
        this.p = $$1;
    }

    public void f() {
        this.n = true;
    }

    @Override
    public boolean cX() {
        return false;
    }

    @Override
    public void a(n $$0) {
        super.a($$0);
        $$0.a("Immitating BlockState", this.m.toString());
    }

    public eoh i() {
        return this.m;
    }

    @Override
    protected yh cR() {
        return yh.a("entity.minecraft.falling_block_type", this.m.b().f());
    }

    @Override
    public aay<adb> a(axd $$0) {
        return new adc((cgk)this, $$0, dzq.j(this.i()));
    }

    @Override
    public void a(adc $$0) {
        super.a($$0);
        this.m = dzq.a($$0.n());
        this.W = true;
        double $$1 = $$0.g();
        double $$2 = $$0.h();
        double $$3 = $$0.i();
        this.a_($$1, $$2, $$3);
        this.a(this.dK());
    }

    @Override
    public @Nullable cgk b(fmb $$0) {
        amt<dwo> $$1 = $$0.b().aq();
        amt<dwo> $$2 = this.ao().aq();
        boolean $$3 = ($$2 == dwo.j || $$1 == dwo.j) && $$2 != $$1;
        cgk $$4 = super.b($$0);
        this.d = $$4 != null && $$3;
        return $$4;
    }
}

