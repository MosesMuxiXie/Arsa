/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public abstract class deh
extends dec {
    private static final double e = 2.0;
    private static final int f = 7;
    private static final float g = 0.6f;
    private static final float h = 0.99f;
    private static final short i = 0;
    private static final byte j = 0;
    private static final boolean k = false;
    private static final boolean l = false;
    private static final byte m = 0;
    private static final alw<Byte> n = ama.a(deh.class, aly.a);
    private static final alw<Byte> o = ama.a(deh.class, aly.a);
    private static final alw<Boolean> p = ama.a(deh.class, aly.k);
    private static final int q = 1;
    private static final int r = 2;
    private @Nullable eoh s;
    protected int b;
    public a c = deh$a.a;
    public int d = 0;
    private int t = 0;
    private double u = 2.0;
    private bcz aN = this.k();
    private @Nullable IntOpenHashSet aO;
    private @Nullable List<cgk> aP;
    private dlt aQ = this.u();
    private @Nullable dlt aR = null;

    protected deh(cgu<? extends deh> $$0, dwo $$1) {
        super((cgu<? extends dec>)$$0, $$1);
    }

    protected deh(cgu<? extends deh> $$0, double $$1, double $$2, double $$3, dwo $$4, dlt $$5, @Nullable dlt $$6) {
        this($$0, $$4);
        this.aQ = $$5.v();
        this.c($$5);
        bhr $$7 = $$5.e(ki.x);
        if ($$7 != null) {
            this.c = deh$a.c;
        }
        this.a_($$1, $$2, $$3);
        if ($$6 != null && $$4 instanceof axf) {
            axf $$8 = (axf)$$4;
            if ($$6.f()) {
                throw new IllegalArgumentException("Invalid weapon firing an arrow");
            }
            this.aR = $$6.v();
            int $$9 = dsq.a($$8, $$6, this.aQ);
            if ($$9 > 0) {
                this.a((byte)$$9);
            }
        }
    }

    protected deh(cgu<? extends deh> $$0, chl $$1, dwo $$2, dlt $$3, @Nullable dlt $$4) {
        this($$0, $$1.dP(), $$1.dT() - (double)0.1f, $$1.dV(), $$2, $$3, $$4);
        this.d($$1);
    }

    public void b(bcz $$0) {
        this.aN = $$0;
    }

    @Override
    public boolean a(double $$0) {
        double $$1 = this.dj().a() * 10.0;
        if (Double.isNaN($$1)) {
            $$1 = 1.0;
        }
        return $$0 < ($$1 *= 64.0 * deh.dc()) * $$1;
    }

    @Override
    protected void a(ama.a $$0) {
        $$0.a(n, (byte)0);
        $$0.a(o, (byte)0);
        $$0.a(p, false);
    }

    @Override
    public void d(double $$0, double $$1, double $$2, float $$3, float $$4) {
        super.d($$0, $$1, $$2, $$3, $$4);
        this.t = 0;
    }

    @Override
    public void j(ftm $$0) {
        super.j($$0);
        this.t = 0;
        if (this.f() && $$0.h() > 0.0) {
            this.b(false);
        }
    }

    @Override
    public void a(alw<?> $$0) {
        super.a($$0);
        if (!this.ay && this.d <= 0 && $$0.equals(p) && this.f()) {
            this.d = 7;
        }
    }

    @Override
    public void g() {
        float $$10;
        fug $$4;
        boolean $$0 = !this.z();
        ftm $$1 = this.dN();
        is $$2 = this.dK();
        eoh $$3 = this.ao().a_($$2);
        if (!$$3.l() && $$0 && !($$4 = $$3.g(this.ao(), $$2)).c()) {
            ftm $$5 = this.dI();
            for (fth $$6 : $$4.e()) {
                if (!$$6.a($$2).d($$5)) continue;
                this.k(ftm.c);
                this.b(true);
                break;
            }
        }
        if (this.d > 0) {
            --this.d;
        }
        if (this.bA()) {
            this.aT();
        }
        if (this.f() && $$0) {
            if (!this.ao().B_()) {
                if (this.s != $$3 && this.A()) {
                    this.B();
                } else {
                    this.i();
                }
            }
            ++this.b;
            if (this.cb()) {
                this.aW();
            }
            if (!this.ao().B_()) {
                this.d(this.aS() > 0);
            }
            return;
        }
        this.b = 0;
        ftm $$7 = this.dI();
        if (this.by()) {
            this.b(this.y());
            this.a($$7);
        }
        if (this.w()) {
            for (int $$8 = 0; $$8 < 4; ++$$8) {
                this.ao().a(ly.g, $$7.g + $$1.g * (double)$$8 / 4.0, $$7.h + $$1.h * (double)$$8 / 4.0, $$7.i + $$1.i * (double)$$8 / 4.0, -$$1.g, -$$1.h + 0.2, -$$1.i);
            }
        }
        if (!$$0) {
            float $$9 = (float)(bgj.d(-$$1.g, -$$1.i) * 57.2957763671875);
        } else {
            $$10 = (float)(bgj.d($$1.g, $$1.i) * 57.2957763671875);
        }
        float $$11 = (float)(bgj.d($$1.h, $$1.i()) * 57.2957763671875);
        this.w(deh.f(this.ee(), $$11));
        this.v(deh.f(this.ec(), $$10));
        this.n();
        if ($$0) {
            fti $$12 = this.ao().b(new dvw($$7, $$7.e($$1), dvw.a.a, dvw.b.a, this));
            this.b($$12);
        } else {
            this.b($$7.e($$1));
            this.aW();
        }
        if (!this.by()) {
            this.b(0.99f);
        }
        if ($$0 && !this.f()) {
            this.bu();
        }
        super.g();
    }

    private void b(fti $$0) {
        while (this.cb()) {
            ftm $$12 = this.dI();
            ArrayList<ftj> $$2 = new ArrayList<ftj>(this.c($$12, $$0.g()));
            $$2.sort(Comparator.comparingDouble($$1 -> $$12.g($$1.a().dI())));
            ftj $$3 = $$2.isEmpty() ? null : $$2.getFirst();
            ftm $$4 = ((ftk)Objects.requireNonNullElse($$3, $$0)).g();
            this.b($$4);
            this.a($$12, $$4);
            if (this.aG != null && this.aG.e()) {
                this.cn();
            }
            if ($$2.isEmpty()) {
                if (!this.cb() || $$0.d() == ftk.a.a) break;
                this.a((ftk)$$0);
                this.aF = true;
                break;
            }
            if (!this.cb() || this.ar) continue;
            ded $$5 = this.a((Collection<ftj>)$$2);
            this.aF = true;
            if (this.x() > 0 && $$5 == ded.a) continue;
            break;
        }
    }

    private ded a(Collection<ftj> $$0) {
        for (ftj $$1 : $$0) {
            ded $$2 = this.a((ftk)$$1);
            if (this.cb() && $$2 == ded.a) continue;
            return $$2;
        }
        return ded.a;
    }

    private void b(float $$0) {
        ftm $$1 = this.dN();
        this.k($$1.c((double)$$0));
    }

    private void a(ftm $$0) {
        ftm $$1 = this.dN();
        for (int $$2 = 0; $$2 < 4; ++$$2) {
            float $$3 = 0.25f;
            this.ao().a(ly.d, $$0.g - $$1.g * 0.25, $$0.h - $$1.h * 0.25, $$0.i - $$1.i * 0.25, $$1.g, $$1.h, $$1.i);
        }
    }

    @Override
    protected double bs() {
        return 0.05;
    }

    private boolean A() {
        return this.f() && this.ao().b(new fth(this.dI(), this.dI()).g(0.06));
    }

    private void B() {
        this.b(false);
        ftm $$0 = this.dN();
        this.k($$0.d(this.as.i() * 0.2f, this.as.i() * 0.2f, this.as.i() * 0.2f));
        this.t = 0;
    }

    protected boolean f() {
        return this.az.a(p);
    }

    protected void b(boolean $$0) {
        this.az.a(p, $$0);
    }

    @Override
    public boolean db() {
        return !this.f();
    }

    @Override
    public void a(chp $$0, ftm $$1) {
        super.a($$0, $$1);
        if ($$0 != chp.a && this.A()) {
            this.B();
        }
    }

    protected void i() {
        ++this.t;
        if (this.t >= 1200) {
            this.aC();
        }
    }

    private void C() {
        if (this.aP != null) {
            this.aP.clear();
        }
        if (this.aO != null) {
            this.aO.clear();
        }
    }

    @Override
    public void b(dlp $$0) {
        this.aR = null;
    }

    @Override
    public void a(boolean $$0, is $$1) {
        if (this.f()) {
            return;
        }
        super.a($$0, $$1);
    }

    @Override
    public void m(boolean $$0) {
        if (this.f()) {
            return;
        }
        super.m($$0);
    }

    @Override
    public void i(double $$0, double $$1, double $$2) {
        if (this.f()) {
            return;
        }
        super.i($$0, $$1, $$2);
    }

    @Override
    protected void a(ftj $$0) {
        dwo dwo2;
        super.a($$0);
        cgk $$1 = $$0.a();
        float $$2 = (float)this.dN().g();
        double $$3 = this.u;
        cgk $$4 = this.p();
        cex $$5 = this.en().a(this, $$4 != null ? $$4 : this);
        if (this.eq() != null && (dwo2 = this.ao()) instanceof axf) {
            axf $$6 = (axf)dwo2;
            $$3 = dsq.a($$6, this.eq(), $$1, $$5, (float)$$3);
        }
        int $$7 = bgj.e(bgj.a((double)$$2 * $$3, 0.0, 2.147483647E9));
        if (this.x() > 0) {
            if (this.aO == null) {
                this.aO = new IntOpenHashSet(5);
            }
            if (this.aP == null) {
                this.aP = Lists.newArrayListWithCapacity((int)5);
            }
            if (this.aO.size() < this.x() + 1) {
                this.aO.add($$1.aA());
            } else {
                this.aC();
                return;
            }
        }
        if (this.w()) {
            long $$8 = this.as.a($$7 / 2 + 2);
            $$7 = (int)Math.min($$8 + (long)$$7, Integer.MAX_VALUE);
        }
        if ($$4 instanceof chl) {
            chl $$9 = (chl)$$4;
            $$9.C($$1);
        }
        boolean $$10 = $$1.ay() == cgu.R;
        int $$11 = $$1.aS();
        if (this.cp() && !$$10) {
            $$1.e(5.0f);
        }
        if ($$1.b($$5, (float)$$7)) {
            if ($$10) {
                return;
            }
            if ($$1 instanceof chl) {
                chl $$12 = (chl)$$1;
                if (!this.ao().B_() && this.x() <= 0) {
                    $$12.o($$12.fs() + 1);
                }
                this.b($$12, $$5);
                dwo dwo3 = this.ao();
                if (dwo3 instanceof axf) {
                    axf $$13 = (axf)dwo3;
                    dsq.a($$13, (cgk)$$12, $$5, this.eq());
                }
                this.a($$12);
                if ($$12 instanceof ddm && $$4 instanceof axg) {
                    axg $$14 = (axg)$$4;
                    if (!this.bq() && $$12 != $$14) {
                        $$14.g.b(new aem(aem.h, 0.0f));
                    }
                }
                if (!$$1.cb() && this.aP != null) {
                    this.aP.add($$12);
                }
                if (!this.ao().B_() && $$4 instanceof axg) {
                    axg $$15 = (axg)$$4;
                    if (this.aP != null) {
                        aj.I.a($$15, this.aP, this.aR);
                    } else if (!$$1.cb()) {
                        aj.I.a($$15, List.of($$1), this.aR);
                    }
                }
            }
            this.a(this.aN, 1.0f, 1.2f / (this.as.i() * 0.2f + 0.9f));
            if (this.x() <= 0) {
                this.aC();
            }
        } else {
            $$1.h($$11);
            this.a(ded.b, $$1, this.a, false);
            this.k(this.dN().c(0.2));
            dwo dwo4 = this.ao();
            if (dwo4 instanceof axf) {
                axf $$16 = (axf)dwo4;
                if (this.dN().h() < 1.0E-7) {
                    if (this.c == deh$a.b) {
                        this.a($$16, this.s(), 0.1f);
                    }
                    this.aC();
                }
            }
        }
    }

    protected void b(chl $$0, cex $$1) {
        float f2;
        dwo dwo2;
        if (this.aR != null && (dwo2 = this.ao()) instanceof axf) {
            axf $$2 = (axf)dwo2;
            f2 = dsq.d($$2, this.aR, $$0, $$1, 0.0f);
        } else {
            f2 = 0.0f;
        }
        double $$3 = f2;
        if ($$3 > 0.0) {
            double $$4 = Math.max(0.0, 1.0 - $$0.i(cis.r));
            ftm $$5 = this.dN().d(1.0, 0.0, 1.0).d().c($$3 * 0.6 * $$4);
            if ($$5.h() > 0.0) {
                $$0.i($$5.g, 0.1, $$5.i);
            }
        }
    }

    @Override
    protected void a(fti $$0) {
        this.s = this.ao().a_($$0.b());
        super.a($$0);
        dlt $$1 = this.eq();
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$2 = (axf)dwo2;
            if ($$1 != null) {
                this.a($$2, $$0, $$1);
            }
        }
        ftm $$3 = this.dN();
        ftm $$4 = new ftm(Math.signum($$3.g), Math.signum($$3.h), Math.signum($$3.i));
        ftm $$5 = $$4.c((double)0.05f);
        this.b(this.dI().d($$5));
        this.k(ftm.c);
        this.a(this.r(), 1.0f, 1.2f / (this.as.i() * 0.2f + 0.9f));
        this.b(true);
        this.d = 7;
        this.r(false);
        this.a((byte)0);
        this.b(bda.aH);
        this.C();
    }

    protected void a(axf $$02, fti $$1, dlt $$2) {
        chl $$4;
        ftm $$3 = $$1.b().a($$1.g());
        cgk cgk2 = this.p();
        dsq.a($$02, $$2, cgk2 instanceof chl ? ($$4 = (chl)cgk2) : null, this, null, $$3, $$02.a_($$1.b()), $$0 -> {
            this.aR = null;
        });
    }

    @Override
    public @Nullable dlt eq() {
        return this.aR;
    }

    protected bcz k() {
        return bda.aH;
    }

    protected final bcz r() {
        return this.aN;
    }

    protected void a(chl $$0) {
    }

    protected @Nullable ftj b(ftm $$0, ftm $$1) {
        return dee.a(this.ao(), this, $$0, $$1, this.dj().b(this.dN()).g(1.0), this::b);
    }

    protected Collection<ftj> c(ftm $$0, ftm $$1) {
        return dee.a(this.ao(), (cgk)this, $$0, $$1, this.dj().b(this.dN()).g(1.0), this::b, false);
    }

    @Override
    protected boolean b(cgk $$0) {
        ddm $$1;
        cgk cgk2;
        if ($$0 instanceof ddm && (cgk2 = this.p()) instanceof ddm && !($$1 = (ddm)cgk2).a((ddm)$$0)) {
            return false;
        }
        return super.b($$0) && (this.aO == null || !this.aO.contains($$0.aA()));
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("life", (short)this.t);
        $$0.b("inBlockState", eoh.a, this.s);
        $$0.a("shake", (byte)this.d);
        $$0.a("inGround", this.f());
        $$0.a("pickup", deh$a.d, this.c);
        $$0.a("damage", this.u);
        $$0.a("crit", this.w());
        $$0.a("PierceLevel", this.x());
        $$0.a("SoundEvent", mi.b.q(), this.aN);
        $$0.a("item", dlt.b, this.aQ);
        $$0.b("weapon", dlt.b, this.aR);
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.t = $$0.a("life", (short)0);
        this.s = $$0.a("inBlockState", eoh.a).orElse(null);
        this.d = $$0.a("shake", (byte)0) & 0xFF;
        this.b($$0.a("inGround", false));
        this.u = $$0.a("damage", 2.0);
        this.c = $$0.a("pickup", deh$a.d).orElse(deh$a.a);
        this.r($$0.a("crit", false));
        this.a($$0.a("PierceLevel", (byte)0));
        this.aN = $$0.a("SoundEvent", mi.b.q()).orElse(this.k());
        this.a($$0.a("item", dlt.b).orElse(this.u()));
        this.aR = $$0.a("weapon", dlt.b).orElse(null);
    }

    @Override
    public void d(@Nullable cgk $$0) {
        a a2;
        super.d($$0);
        cgk cgk2 = $$0;
        int n2 = 0;
        block4: while (true) {
            switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{ddm.class, chr.class}, (Object)cgk2, n2)) {
                case 0: {
                    ddm $$1 = (ddm)cgk2;
                    if (this.c != deh$a.a) {
                        n2 = 1;
                        continue block4;
                    }
                    a2 = deh$a.b;
                    break block4;
                }
                case 1: {
                    chr $$2 = (chr)cgk2;
                    a2 = deh$a.a;
                    break block4;
                }
                default: {
                    a2 = this.c;
                    break block4;
                }
            }
            break;
        }
        this.c = a2;
    }

    @Override
    public void a_(ddm $$0) {
        if (this.ao().B_() || !this.f() && !this.z() || this.d > 0) {
            return;
        }
        if (this.a($$0)) {
            $$0.a((cgk)this, 1);
            this.aC();
        }
    }

    protected boolean a(ddm $$0) {
        return switch (this.c.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> false;
            case 1 -> $$0.gK().g(this.s());
            case 2 -> $$0.gv();
        };
    }

    protected dlt s() {
        return this.aQ.v();
    }

    protected abstract dlt u();

    @Override
    protected cgk.d bv() {
        return cgk.d.a;
    }

    public dlt v() {
        return this.aQ;
    }

    public void i(double $$0) {
        this.u = $$0;
    }

    @Override
    public boolean cT() {
        return this.ay().a(bdt.I);
    }

    public void r(boolean $$0) {
        this.a(1, $$0);
    }

    private void a(byte $$0) {
        this.az.a(o, $$0);
    }

    private void a(int $$0, boolean $$1) {
        byte $$2 = this.az.a(n);
        if ($$1) {
            this.az.a(n, (byte)($$2 | $$0));
        } else {
            this.az.a(n, (byte)($$2 & ~$$0));
        }
    }

    protected void a(dlt $$0) {
        this.aQ = !$$0.f() ? $$0 : this.u();
    }

    public boolean w() {
        byte $$0 = this.az.a(n);
        return ($$0 & 1) != 0;
    }

    public byte x() {
        return this.az.a(o);
    }

    public void a(float $$0) {
        this.i((double)($$0 * 2.0f) + this.as.a((double)this.ao().av().a() * 0.11, 0.57425));
    }

    protected float y() {
        return 0.6f;
    }

    public void s(boolean $$0) {
        this.ar = $$0;
        this.a(2, $$0);
    }

    public boolean z() {
        if (!this.ao().B_()) {
            return this.ar;
        }
        return (this.az.a(n) & 2) != 0;
    }

    @Override
    public boolean bX() {
        return super.bX() && !this.f();
    }

    @Override
    public @Nullable cic a_(int $$0) {
        if ($$0 == 0) {
            return cic.a(this::v, this::a);
        }
        return super.a_($$0);
    }

    @Override
    protected boolean ah_() {
        return true;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final Codec<a> d;
        private static final /* synthetic */ a[] e;

        public static a[] values() {
            return (a[])e.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        public static a a(int $$0) {
            if ($$0 < 0 || $$0 > deh$a.values().length) {
                $$0 = 0;
            }
            return deh$a.values()[$$0];
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c};
        }

        static {
            e = deh$a.a();
            d = Codec.BYTE.xmap(a::a, $$0 -> (byte)$$0.ordinal());
        }
    }
}

