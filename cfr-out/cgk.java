/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 *  it.unimi.dsi.fastutil.doubles.DoubleListIterator
 *  it.unimi.dsi.fastutil.floats.FloatArraySet
 *  it.unimi.dsi.fastutil.floats.FloatArrays
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  it.unimi.dsi.fastutil.objects.Object2DoubleArrayMap
 *  it.unimi.dsi.fastutil.objects.Object2DoubleMap
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  org.jetbrains.annotations.Contract
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import it.unimi.dsi.fastutil.doubles.DoubleListIterator;
import it.unimi.dsi.fastutil.floats.FloatArraySet;
import it.unimi.dsi.fastutil.floats.FloatArrays;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.Object2DoubleArrayMap;
import it.unimi.dsi.fastutil.objects.Object2DoubleMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class cgk
implements alz,
bxh,
cdg,
chh,
cid,
esp,
fuq,
kd {
    private static final Logger b = LogUtils.getLogger();
    public static final String v = "id";
    public static final String w = "UUID";
    public static final String x = "Passengers";
    public static final String y = "data";
    public static final String z = "Pos";
    public static final String A = "Motion";
    public static final String B = "Rotation";
    public static final String C = "PortalCooldown";
    public static final String D = "NoGravity";
    public static final String E = "Air";
    public static final String F = "OnGround";
    public static final String G = "fall_distance";
    public static final String H = "Fire";
    public static final String I = "Silent";
    public static final String J = "Glowing";
    public static final String K = "Invulnerable";
    public static final String L = "CustomName";
    private static final AtomicInteger c = new AtomicInteger();
    public static final int M = 0;
    public static final int N = 60;
    public static final int O = 300;
    public static final int P = 1024;
    private static final Codec<List<String>> d = Codec.STRING.sizeLimitedListOf(1024);
    public static final float Q = 0.2f;
    public static final double R = 0.500001;
    public static final double S = 0.999999;
    public static final int T = 140;
    public static final int U = 40;
    public static final int V = 3;
    private static final fth e = new fth(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
    private static final double r = 0.014;
    private static final double s = 0.007;
    private static final double t = 0.0023333333333333335;
    private static final int u = 16;
    private static final double aN = 8.0;
    private static double aO = 1.0;
    private final cgu<?> aP;
    private boolean aQ;
    private int aR = c.incrementAndGet();
    public boolean W;
    private ImmutableList<cgk> aS = ImmutableList.of();
    protected int X;
    private @Nullable cgk aT;
    private dwo aU;
    public double Y;
    public double Z;
    public double aa;
    private ftm aV;
    private is aW;
    private dvu aX;
    private ftm aY = ftm.c;
    private float aZ;
    private float ba;
    public float ab;
    public float ac;
    private fth bb = e;
    private boolean bc;
    public boolean ad;
    public boolean ae;
    public boolean af;
    public boolean ag;
    public boolean ah;
    protected ftm ai = ftm.c;
    private @Nullable e bd;
    public static final float aj = 0.6f;
    public static final float ak = 1.8f;
    public float al;
    public float am;
    public double an;
    private float be = 1.0f;
    public double ao;
    public double ap;
    public double aq;
    public boolean ar;
    protected final bgr as = bgr.a();
    public int at;
    private int bf;
    protected boolean au;
    protected Object2DoubleMap<bef<fla>> av = new Object2DoubleArrayMap(2);
    protected boolean aw;
    private final Set<bef<fla>> bg = new HashSet<bef<fla>>();
    public int ax;
    protected boolean ay = true;
    protected final ama az;
    protected static final alw<Byte> aA = ama.a(cgk.class, aly.a);
    protected static final int aB = 0;
    private static final int bh = 1;
    private static final int bi = 3;
    private static final int bj = 4;
    private static final int bk = 5;
    protected static final int aC = 6;
    protected static final int aD = 7;
    private static final alw<Integer> bl = ama.a(cgk.class, aly.b);
    private static final alw<Optional<yh>> bm = ama.a(cgk.class, aly.g);
    private static final alw<Boolean> bn = ama.a(cgk.class, aly.k);
    private static final alw<Boolean> bo = ama.a(cgk.class, aly.k);
    private static final alw<Boolean> bp = ama.a(cgk.class, aly.k);
    protected static final alw<chx> aE = ama.a(cgk.class, aly.v);
    private static final alw<Integer> bq = ama.a(cgk.class, aly.b);
    private esq br = esq.a;
    private final akg bs = new akg();
    public boolean aF;
    public @Nullable chw aG;
    private int bt;
    private boolean bu;
    protected UUID aH = bgj.a(this.as);
    protected String aI = this.aH.toString();
    private boolean bv;
    private final Set<String> bw = Sets.newHashSet();
    private final double[] bx = new double[]{0.0, 0.0, 0.0};
    private long by;
    private cgn bz;
    private float bA;
    public boolean aJ;
    public boolean aK;
    public Optional<is> aL = Optional.empty();
    private boolean bB = false;
    private float bC;
    private int bD;
    private boolean bE;
    private ftm bF = ftm.c;
    private @Nullable ftm bG;
    private @Nullable eoh bH = null;
    public static final int aM = 100;
    private final ArrayDeque<c> bI = new ArrayDeque(100);
    private final List<c> bJ = new ObjectArrayList();
    private final LongSet bK = new LongOpenHashSet();
    private final chc.a bL = new chc.a();
    private doe bM = doe.a;

    public cgk(cgu<?> $$0, dwo $$1) {
        this.aP = $$0;
        this.aU = $$1;
        this.bz = $$0.n();
        this.aV = ftm.c;
        this.aW = is.c;
        this.aX = dvu.e;
        ama.a $$2 = new ama.a(this);
        $$2.a(aA, (byte)0);
        $$2.a(bl, this.cJ());
        $$2.a(bn, false);
        $$2.a(bm, Optional.empty());
        $$2.a(bo, false);
        $$2.a(bp, false);
        $$2.a(aE, chx.a);
        $$2.a(bq, 0);
        this.a($$2);
        this.az = $$2.a();
        this.a_(0.0, 0.0, 0.0);
        this.bA = this.bz.c();
    }

    public boolean a(is $$0, eoh $$1) {
        fug $$2 = $$1.b((dvt)this.ao(), $$0, ftr.a(this)).a($$0);
        return fud.c($$2, fud.a(this.dj()), ftq.i);
    }

    public int h_() {
        fum $$0 = this.cI();
        if ($$0 != null && ((fut)$$0).o().f() != null) {
            return ((fut)$$0).o().f();
        }
        return 0xFFFFFF;
    }

    public boolean au() {
        return false;
    }

    public boolean av() {
        return this.cb() && !this.eh() && !this.au();
    }

    public final void aw() {
        if (this.cr()) {
            this.ce();
        }
        if (this.cq()) {
            this.cf();
        }
    }

    public void e(double $$0, double $$1, double $$2) {
        this.bs.e(new ftm($$0, $$1, $$2));
    }

    public akg ax() {
        return this.bs;
    }

    public cgu<?> ay() {
        return this.aP;
    }

    public boolean az() {
        return this.aQ;
    }

    public void c(boolean $$0) {
        this.aQ = $$0;
    }

    @Override
    public int aA() {
        return this.aR;
    }

    public void e(int $$0) {
        this.aR = $$0;
    }

    public Set<String> aB() {
        return this.bw;
    }

    public boolean a(String $$0) {
        if (this.bw.size() >= 1024) {
            return false;
        }
        return this.bw.add($$0);
    }

    public boolean b(String $$0) {
        return this.bw.remove($$0);
    }

    public void c(axf $$0) {
        this.a(cgk$e.a);
        this.c(etk.p);
    }

    public final void aC() {
        this.a(cgk$e.b);
    }

    protected abstract void a(ama.a var1);

    public ama aD() {
        return this.az;
    }

    public boolean equals(Object $$0) {
        if ($$0 instanceof cgk) {
            return ((cgk)$$0).aR == this.aR;
        }
        return false;
    }

    public int hashCode() {
        return this.aR;
    }

    public void a(e $$0) {
        this.c($$0);
    }

    public void aE() {
    }

    public void b(e $$0) {
    }

    public void c(chx $$0) {
        this.az.a(aE, $$0);
    }

    public chx aF() {
        return this.az.a(aE);
    }

    public boolean d(chx $$0) {
        return this.aF() == $$0;
    }

    public boolean a(cgk $$0, double $$1) {
        return this.dI().a((jn)$$0.dI(), $$1);
    }

    public boolean a(cgk $$0, double $$1, double $$2) {
        double $$3 = $$0.dP() - this.dP();
        double $$4 = $$0.dR() - this.dR();
        double $$5 = $$0.dV() - this.dV();
        return bgj.e($$3, $$5) < bgj.n($$1) && bgj.n($$4) < bgj.n($$2);
    }

    protected void a(float $$0, float $$1) {
        this.v($$0 % 360.0f);
        this.w($$1 % 360.0f);
    }

    public final void b(ftm $$0) {
        this.a_($$0.a(), $$0.b(), $$0.c());
    }

    public void a_(double $$0, double $$1, double $$2) {
        this.n($$0, $$1, $$2);
        this.a(this.aG());
    }

    protected final fth aG() {
        return this.c(this.aV);
    }

    protected fth c(ftm $$0) {
        return this.bz.a($$0);
    }

    protected void aH() {
        this.bG = null;
        this.a_(this.aV.g, this.aV.h, this.aV.i);
    }

    public void b(double $$0, double $$1) {
        float $$2 = (float)$$1 * 0.15f;
        float $$3 = (float)$$0 * 0.15f;
        this.w(this.ee() + $$2);
        this.v(this.ec() + $$3);
        this.w(bgj.a(this.ee(), -90.0f, 90.0f));
        this.ac += $$2;
        this.ab += $$3;
        this.ac = bgj.a(this.ac, -90.0f, 90.0f);
        if (this.aT != null) {
            this.aT.l(this);
        }
    }

    public void aI() {
    }

    public void g() {
        this.aJ();
    }

    public void aJ() {
        bzm $$0 = bzl.a();
        $$0.a("entityBaseTick");
        this.aK();
        this.bH = null;
        if (this.cq() && this.dz().eh()) {
            this.cf();
        }
        if (this.X > 0) {
            --this.X;
        }
        this.cn();
        if (this.bL()) {
            this.bM();
        }
        this.aK = this.aJ;
        this.aJ = false;
        this.bG();
        this.u();
        this.bF();
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$1 = (axf)dwo2;
            if (this.bf > 0) {
                if (this.bx()) {
                    this.aT();
                } else {
                    if (this.bf % 20 == 0 && !this.bN()) {
                        this.a($$1, this.en().d(), 1.0f);
                    }
                    this.h(this.bf - 1);
                }
            }
        } else {
            this.aT();
        }
        if (this.bN()) {
            this.an *= 0.5;
        }
        this.aL();
        if (!this.ao().B_()) {
            this.d(this.bf > 0);
        }
        this.ay = false;
        dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$2 = (axf)dwo2;
            if (this instanceof chj) {
                chj.a_($$2, (cgk)((Object)((chj)((Object)this))));
            }
        }
        $$0.c();
    }

    protected void aK() {
        if (this.bG == null) {
            this.bG = this.dI();
        }
        this.bF = this.dI().d(this.bG);
        this.bG = this.dI();
    }

    public void d(boolean $$0) {
        this.b(0, $$0 || this.bE);
    }

    public void aL() {
        if (this.dR() < (double)(this.ao().K_() - 64)) {
            this.aU();
        }
    }

    public void aM() {
        this.bt = this.co();
    }

    public void f(int $$0) {
        this.bt = $$0;
    }

    public int aN() {
        return this.bt;
    }

    public boolean aO() {
        return this.bt > 0;
    }

    protected void O() {
        if (this.aO()) {
            --this.bt;
        }
    }

    public void aP() {
        if (this.bx()) {
            return;
        }
        this.e(15.0f);
    }

    public void aQ() {
        axf $$0;
        if (this.bx()) {
            return;
        }
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf && this.a($$0 = (axf)dwo2, this.en().e(), 4.0f) && this.aR() && !this.bq()) {
            $$0.a(null, this.dP(), this.dR(), this.dV(), bda.lO, this.dB(), 0.4f, 2.0f + this.as.i() * 0.4f);
        }
    }

    protected boolean aR() {
        return true;
    }

    public final void e(float $$0) {
        this.g(bgj.b($$0 * 20.0f));
    }

    public void g(int $$0) {
        if (this.bf < $$0) {
            this.h($$0);
        }
        this.cL();
    }

    public void h(int $$0) {
        this.bf = $$0;
    }

    public int aS() {
        return this.bf;
    }

    public void aT() {
        this.h(Math.min(0, this.aS()));
    }

    protected void aU() {
        this.aC();
    }

    public boolean f(double $$0, double $$1, double $$2) {
        return this.b(this.dj().d($$0, $$1, $$2));
    }

    private boolean b(fth $$0) {
        return this.ao().a(this, $$0) && !this.ao().d($$0);
    }

    public void e(boolean $$0) {
        this.bc = $$0;
        this.b($$0, null);
    }

    public void a(boolean $$0, ftm $$1) {
        this.a($$0, this.ad, $$1);
    }

    public void a(boolean $$0, boolean $$1, ftm $$2) {
        this.bc = $$0;
        this.ad = $$1;
        this.b($$0, $$2);
    }

    public boolean d(is $$0) {
        return this.aL.isPresent() && this.aL.get().equals($$0);
    }

    protected void b(boolean $$0, @Nullable ftm $$1) {
        if ($$0) {
            fth $$2 = this.dj();
            fth $$3 = new fth($$2.a, $$2.b - 1.0E-6, $$2.c, $$2.d, $$2.b, $$2.f);
            Optional<is> $$4 = this.aU.j(this, $$3);
            if ($$4.isPresent() || this.bB) {
                this.aL = $$4;
            } else if ($$1 != null) {
                fth $$5 = $$3.d(-$$1.g, 0.0, -$$1.i);
                $$4 = this.aU.j(this, $$5);
                this.aL = $$4;
            }
            this.bB = $$4.isEmpty();
        } else {
            this.bB = false;
            if (this.aL.isPresent()) {
                this.aL = Optional.empty();
            }
        }
    }

    public boolean aV() {
        return this.bc;
    }

    public void a(chp $$0, ftm $$1) {
        d $$16;
        ftm $$3;
        double $$4;
        if (this.ar) {
            this.a_(this.dP() + $$1.g, this.dR() + $$1.h, this.dV() + $$1.i);
            this.ad = false;
            this.ae = false;
            this.af = false;
            this.ag = false;
            return;
        }
        if ($$0 == chp.c && ($$1 = this.e($$1)).equals(ftm.c)) {
            return;
        }
        bzm $$2 = bzl.a();
        $$2.a("move");
        if (this.ai.h() > 1.0E-7) {
            if ($$0 != chp.c) {
                $$1 = $$1.h(this.ai);
            }
            this.ai = ftm.c;
            this.k(ftm.c);
        }
        if (($$4 = ($$3 = this.a($$1 = this.a($$1, $$0))).h()) > 1.0E-7 || $$1.h() - $$4 < 1.0E-7) {
            if (this.an != 0.0 && $$4 >= 1.0) {
                double $$5 = Math.min($$3.g(), 8.0);
                ftm $$6 = this.dI().e($$3.d().c($$5));
                fti $$7 = this.ao().a(new dvw(this.dI(), $$6, dvw.a.d, dvw.b.d, this));
                if ($$7.d() != ftk.a.a) {
                    this.l();
                }
            }
            ftm $$8 = this.dI();
            ftm $$9 = $$8.e($$3);
            this.a(new c($$8, $$9, $$1));
            this.b($$9);
        }
        $$2.c();
        $$2.a("rest");
        boolean $$10 = !bgj.b($$1.g, $$3.g);
        boolean $$11 = !bgj.b($$1.i, $$3.i);
        boolean bl2 = this.ad = $$10 || $$11;
        if (Math.abs($$1.h) > 0.0 || this.dv()) {
            this.ae = $$1.h != $$3.h;
            this.af = this.ae && $$1.h < 0.0;
            this.a(this.af, this.ad, $$3);
        }
        this.ag = this.ad ? this.d($$3) : false;
        is $$12 = this.be();
        eoh $$13 = this.ao().a_($$12);
        if (this.dv()) {
            this.a($$3.h, this.aV(), $$13, $$12);
        }
        if (this.eh()) {
            $$2.c();
            return;
        }
        if (this.ad) {
            ftm $$14 = this.dN();
            this.m($$10 ? 0.0 : $$14.g, $$14.h, $$11 ? 0.0 : $$14.i);
        }
        if (this.dx()) {
            dzq $$15 = $$13.b();
            if ($$1.h != $$3.h) {
                $$15.a(this.ao(), this);
            }
        }
        if ((!this.ao().B_() || this.dv()) && ($$16 = this.bv()).a() && !this.cq()) {
            this.a($$16, $$3, $$12, $$13);
        }
        float $$17 = this.bi();
        this.k(this.dN().d($$17, 1.0, $$17));
        $$2.c();
    }

    private void a(d $$0, ftm $$1, is $$2, eoh $$3) {
        float $$4 = 0.6f;
        float $$5 = (float)($$1.g() * (double)0.6f);
        float $$6 = (float)($$1.i() * (double)0.6f);
        is $$7 = this.bg();
        eoh $$8 = this.ao().a_($$7);
        boolean $$9 = this.c($$8);
        this.al += $$9 ? $$5 : $$6;
        this.am += $$5;
        if (this.al > this.be && !$$8.l()) {
            boolean $$10 = $$7.equals($$2);
            boolean $$11 = this.a($$2, $$3, $$0.c(), $$10, $$1);
            if (!$$10) {
                $$11 |= this.a($$7, $$8, false, $$0.b(), $$1);
            }
            if ($$11) {
                this.be = this.bj();
            } else if (this.by()) {
                this.be = this.bj();
                if ($$0.c()) {
                    this.bn();
                }
                if ($$0.b()) {
                    this.c(etk.Q);
                }
            }
        } else if ($$8.l()) {
            this.bd();
        }
    }

    protected void aW() {
        this.bJ.clear();
        this.bJ.addAll(this.bI);
        this.bI.clear();
        if (this.bJ.isEmpty()) {
            this.bJ.add(new c(this.bS(), this.dI()));
        } else if (this.bJ.getLast().b.g(this.dI()) > 9.999999439624929E-11) {
            this.bJ.add(new c(this.bJ.getLast().b, this.dI()));
        }
        this.b(this.bJ);
    }

    private void a(c $$0) {
        if (this.bI.size() >= 100) {
            c $$1 = this.bI.removeFirst();
            c $$2 = this.bI.removeFirst();
            c $$3 = new c($$1.a(), $$2.b());
            this.bI.addFirst($$3);
        }
        this.bI.add($$0);
    }

    public void aX() {
        if (!this.bI.isEmpty()) {
            this.bI.removeLast();
        }
    }

    protected void aY() {
        this.bI.clear();
    }

    public boolean aZ() {
        return Math.abs(this.bF.i()) > (double)1.0E-5f;
    }

    public void a(ftm $$0, ftm $$1) {
        this.b(List.of(new c($$0, $$1)));
    }

    private void b(List<c> $$0) {
        boolean $$6;
        if (!this.ba()) {
            return;
        }
        if (this.aV()) {
            is $$1 = this.be();
            eoh $$2 = this.ao().a_($$1);
            $$2.b().a(this.ao(), $$1, $$2, this);
        }
        boolean $$3 = this.cp();
        boolean $$4 = this.eb();
        int $$5 = this.aS();
        this.a($$0, this.bL);
        this.bL.a(this);
        if (this.bz()) {
            this.aT();
        }
        if ($$3 && !this.cp() || $$4 && !this.eb()) {
            this.bb();
        }
        boolean bl2 = $$6 = this.aS() > $$5;
        if (!(this.ao().B_() || this.cp() || $$6)) {
            this.h(-this.dC());
        }
    }

    protected boolean ba() {
        return !this.eh() && !this.ar;
    }

    private boolean c(eoh $$0) {
        return $$0.a(bdp.bd) || $$0.a(dzs.rP);
    }

    private boolean a(is $$0, eoh $$1, boolean $$2, boolean $$3, ftm $$4) {
        if ($$1.l()) {
            return false;
        }
        boolean $$5 = this.c($$1);
        if ((this.aV() || $$5 || this.cz() && $$4.h == 0.0 || this.cH()) && !this.cB()) {
            if ($$2) {
                this.c($$0, $$1);
            }
            if ($$3) {
                this.ao().a(etk.P, this.dI(), etk.a.a(this, $$1));
            }
            return true;
        }
        return false;
    }

    protected boolean d(ftm $$0) {
        return false;
    }

    protected void bb() {
        if (!this.aU.B_()) {
            this.ao().a(null, this.dP(), this.dR(), this.dV(), bda.lT, this.dB(), 0.7f, 1.6f + (this.as.i() - this.as.i()) * 0.4f);
        }
    }

    public void bc() {
        if (this.cp()) {
            this.bb();
        }
        this.aT();
    }

    protected void bd() {
        if (this.bp()) {
            this.bo();
            if (this.bv().b()) {
                this.c(etk.x);
            }
        }
    }

    @Deprecated
    public is be() {
        return this.f(0.2f);
    }

    public is bf() {
        return this.f(0.500001f);
    }

    public is bg() {
        return this.f(1.0E-5f);
    }

    protected is f(float $$0) {
        if (this.aL.isPresent()) {
            is $$1 = this.aL.get();
            if ($$0 > 1.0E-5f) {
                eoh $$2 = this.ao().a_($$1);
                if ((double)$$0 <= 0.5 && $$2.a(bdp.S) || $$2.a(bdp.I) || $$2.b() instanceof ecu) {
                    return $$1;
                }
                return $$1.h(bgj.c(this.aV.h - (double)$$0));
            }
            return $$1;
        }
        int $$3 = bgj.c(this.aV.g);
        int $$4 = bgj.c(this.aV.h - (double)$$0);
        int $$5 = bgj.c(this.aV.i);
        return new is($$3, $$4, $$5);
    }

    protected float bh() {
        float $$0 = this.ao().a_(this.dK()).b().j();
        float $$1 = this.ao().a_(this.bf()).b().j();
        return (double)$$0 == 1.0 ? $$1 : $$0;
    }

    protected float bi() {
        eoh $$0 = this.ao().a_(this.dK());
        float $$1 = $$0.b().i();
        if ($$0.a(dzs.J) || $$0.a(dzs.oa)) {
            return $$1;
        }
        return (double)$$1 == 1.0 ? this.ao().a_(this.bf()).b().i() : $$1;
    }

    protected ftm a(ftm $$0, chp $$1) {
        return $$0;
    }

    protected ftm e(ftm $$0) {
        if ($$0.h() <= 1.0E-7) {
            return $$0;
        }
        long $$1 = this.ao().au();
        if ($$1 != this.by) {
            Arrays.fill(this.bx, 0.0);
            this.by = $$1;
        }
        if ($$0.g != 0.0) {
            double $$2 = this.a(iz.a.a, $$0.g);
            return Math.abs($$2) <= (double)1.0E-5f ? ftm.c : new ftm($$2, 0.0, 0.0);
        }
        if ($$0.h != 0.0) {
            double $$3 = this.a(iz.a.b, $$0.h);
            return Math.abs($$3) <= (double)1.0E-5f ? ftm.c : new ftm(0.0, $$3, 0.0);
        }
        if ($$0.i != 0.0) {
            double $$4 = this.a(iz.a.c, $$0.i);
            return Math.abs($$4) <= (double)1.0E-5f ? ftm.c : new ftm(0.0, 0.0, $$4);
        }
        return ftm.c;
    }

    private double a(iz.a $$0, double $$1) {
        int $$2 = $$0.ordinal();
        double $$3 = bgj.a($$1 + this.bx[$$2], -0.51, 0.51);
        $$1 = $$3 - this.bx[$$2];
        this.bx[$$2] = $$3;
        return $$1;
    }

    public double b(double $$0) {
        fth $$1 = this.dj();
        fth $$2 = $$1.b($$1.b - $$0).e($$1.b);
        List<fug> $$3 = cgk.a(this, this.aU, $$2);
        if ($$3.isEmpty()) {
            return $$0;
        }
        return -fud.a(iz.a.b, $$1, $$3, -$$0);
    }

    private ftm a(ftm $$0) {
        boolean $$7;
        fth $$1 = this.dj();
        List<fug> $$2 = this.ao().e(this, $$1.b($$0));
        ftm $$3 = $$0.h() == 0.0 ? $$0 : cgk.a(this, $$0, $$1, this.ao(), $$2);
        boolean $$4 = $$0.g != $$3.g;
        boolean $$5 = $$0.h != $$3.h;
        boolean $$6 = $$0.i != $$3.i;
        boolean bl2 = $$7 = $$5 && $$0.h < 0.0;
        if (this.eg() > 0.0f && ($$7 || this.aV()) && ($$4 || $$6)) {
            float[] $$12;
            fth $$8 = $$7 ? $$1.d(0.0, $$3.h, 0.0) : $$1;
            fth $$9 = $$8.b($$0.g, this.eg(), $$0.i);
            if (!$$7) {
                $$9 = $$9.b(0.0, -1.0E-5f, 0.0);
            }
            List<fug> $$10 = cgk.a(this, this.aU, $$2, $$9);
            float $$11 = (float)$$3.h;
            for (float $$13 : $$12 = cgk.a($$8, $$10, this.eg(), $$11)) {
                ftm $$14 = cgk.a(new ftm($$0.g, $$13, $$0.i), $$8, $$10);
                if (!($$14.j() > $$3.j())) continue;
                double $$15 = $$1.b - $$8.b;
                return $$14.a(0.0, $$15, 0.0);
            }
        }
        return $$3;
    }

    private static float[] a(fth $$0, List<fug> $$1, float $$2, float $$3) {
        FloatArraySet $$4 = new FloatArraySet(4);
        block0: for (fug $$5 : $$1) {
            DoubleList $$6 = $$5.a(iz.a.b);
            DoubleListIterator doubleListIterator = $$6.iterator();
            while (doubleListIterator.hasNext()) {
                double $$7 = (Double)doubleListIterator.next();
                float $$8 = (float)($$7 - $$0.b);
                if ($$8 < 0.0f || $$8 == $$3) continue;
                if ($$8 > $$2) continue block0;
                $$4.add($$8);
            }
        }
        float[] $$9 = $$4.toFloatArray();
        FloatArrays.unstableSort((float[])$$9);
        return $$9;
    }

    public static ftm a(@Nullable cgk $$0, ftm $$1, fth $$2, dwo $$3, List<fug> $$4) {
        List<fug> $$5 = cgk.a($$0, $$3, $$4, $$2.b($$1));
        return cgk.a($$1, $$2, $$5);
    }

    public static List<fug> a(@Nullable cgk $$0, dwo $$1, fth $$2) {
        List<fug> $$3 = $$1.e($$0, $$2);
        return cgk.a($$0, $$1, $$3, $$2);
    }

    private static List<fug> a(@Nullable cgk $$0, dwo $$1, List<fug> $$2, fth $$3) {
        boolean $$6;
        ImmutableList.Builder $$4 = ImmutableList.builderWithExpectedSize((int)($$2.size() + 1));
        if (!$$2.isEmpty()) {
            $$4.addAll($$2);
        }
        eqa $$5 = $$1.w();
        boolean bl2 = $$6 = $$0 != null && $$5.a($$0, $$3);
        if ($$6) {
            $$4.add((Object)$$5.b());
        }
        $$4.addAll($$1.g($$0, $$3));
        return $$4.build();
    }

    private static ftm a(ftm $$0, fth $$1, List<fug> $$2) {
        if ($$2.isEmpty()) {
            return $$0;
        }
        ftm $$3 = ftm.c;
        for (iz.a $$4 : iz.b($$0)) {
            double $$5 = $$0.a($$4);
            if ($$5 == 0.0) continue;
            double $$6 = fud.a($$4, $$1.c($$3), $$2, $$5);
            $$3 = $$3.a($$4, $$6);
        }
        return $$3;
    }

    protected float bj() {
        return (int)this.al + 1;
    }

    protected bcz bk() {
        return bda.lX;
    }

    protected bcz bl() {
        return bda.lW;
    }

    protected bcz bm() {
        return bda.lW;
    }

    private void a(List<c> $$0, chc.a $$1) {
        if (!this.ba()) {
            return;
        }
        LongSet $$2 = this.bK;
        for (c $$3 : $$0) {
            ftm $$4 = $$3.a;
            ftm $$5 = $$3.b().d($$3.a());
            int $$6 = 16;
            if ($$3.c().isPresent() && $$5.h() > 0.0) {
                for (iz.a $$7 : iz.b($$3.c().get())) {
                    double $$8 = $$5.a($$7);
                    if ($$8 == 0.0) continue;
                    ftm $$9 = $$4.a($$7.e(), $$8);
                    $$6 -= this.a($$4, $$9, $$1, $$2, $$6);
                    $$4 = $$9;
                }
            } else {
                $$6 -= this.a($$3.a(), $$3.b(), $$1, $$2, 16);
            }
            if ($$6 > 0) continue;
            this.a($$3.b(), $$3.b(), $$1, $$2, 1);
        }
        $$2.clear();
    }

    private int a(ftm $$0, ftm $$1, chc.a $$2, LongSet $$3, int $$4) {
        axf $$7;
        fth $$5 = this.c($$1).h(1.0E-5f);
        boolean $$6 = $$0.g($$1) > bgj.n(0.9999900000002526);
        dwo dwo2 = this.aU;
        boolean $$8 = dwo2 instanceof axf && ($$7 = (axf)dwo2).s().bw().a(bxf.g);
        AtomicInteger $$92 = new AtomicInteger();
        dvt.a($$0, $$1, $$5, (is $$9, int $$10) -> {
            if (!this.cb()) {
                return false;
            }
            if ($$10 >= $$4) {
                return false;
            }
            $$92.set($$10);
            eoh $$11 = this.ao().a_($$9);
            if ($$11.l()) {
                if ($$8) {
                    this.a((axf)this.ao(), $$9.j(), false, false);
                }
                return true;
            }
            fug $$12 = $$11.a((dvt)this.ao(), $$9, this);
            boolean $$13 = $$12 == fud.b() || this.a($$0, $$1, $$12.a(new ftm($$9)).e());
            boolean $$14 = this.a($$11.y(), $$9, $$0, $$1);
            if (!$$13 && !$$14 || !$$3.add($$9.a())) {
                return true;
            }
            if ($$13) {
                try {
                    boolean $$15 = $$6 || $$5.b($$9);
                    $$2.a($$10);
                    $$11.a(this.ao(), $$9, this, $$2, $$15);
                    this.a($$11);
                }
                catch (Throwable $$16) {
                    m $$17 = m.a($$16, "Colliding entity with block");
                    n $$18 = $$17.a("Block being collided with");
                    n.a($$18, this.ao(), $$9, $$11);
                    n $$19 = $$17.a("Entity being checked for collision");
                    this.a($$19);
                    throw new v($$17);
                }
            }
            if ($$14) {
                $$2.a($$10);
                $$11.y().a(this.ao(), $$9, this, $$2);
            }
            if ($$8) {
                this.a((axf)this.ao(), $$9.j(), $$13, $$14);
            }
            return true;
        });
        return $$92.get() + 1;
    }

    private void a(axf $$0, is $$1, boolean $$2, boolean $$3) {
        bww $$6;
        if ($$3) {
            bww $$4 = bww.b;
        } else if ($$2) {
            bww $$5 = bww.a;
        } else {
            $$6 = bww.c;
        }
        $$0.W().a($$1, bxf.g, $$6);
    }

    public boolean a(flb $$0, is $$1, ftm $$2, ftm $$3) {
        fth $$4 = $$0.e(this.ao(), $$1);
        return $$4 != null && this.a($$2, $$3, List.of($$4));
    }

    public boolean a(ftm $$0, ftm $$1, List<fth> $$2) {
        fth $$3 = this.c($$0);
        ftm $$4 = $$1.d($$0);
        return $$3.a($$4, $$2);
    }

    protected void a(eoh $$0) {
    }

    public is a(axf $$0, is $$1) {
        is $$2 = $$0.C().b();
        ftm $$3 = $$2.b();
        int $$4 = $$0.q($$2).a(euq.a.f, $$2.u(), $$2.w()) + 1;
        return is.a($$3.g, (double)$$4, $$3.i);
    }

    public void a(jd<etk> $$0, @Nullable cgk $$1) {
        this.ao().a($$1, $$0, this.aV);
    }

    public void c(jd<etk> $$0) {
        this.a($$0, this);
    }

    private void c(is $$0, eoh $$1) {
        this.b($$0, $$1);
        if (this.d($$1)) {
            this.q();
        }
    }

    protected void bn() {
        cgk $$0 = Objects.requireNonNullElse(this.dl(), this);
        float $$1 = $$0 == this ? 0.35f : 0.4f;
        ftm $$2 = $$0.dN();
        float $$3 = Math.min(1.0f, (float)Math.sqrt($$2.g * $$2.g * (double)0.2f + $$2.h * $$2.h + $$2.i * $$2.i * (double)0.2f) * $$1);
        this.g($$3);
    }

    protected is e(is $$0) {
        is $$1 = $$0.d();
        eoh $$2 = this.ao().a_($$1);
        if ($$2.a(bdp.bA) || $$2.a(bdp.bB)) {
            return $$1;
        }
        return $$0;
    }

    protected void a(eoh $$0, eoh $$1) {
        ehs $$2 = $$0.A();
        this.a($$2.d(), $$2.a() * 0.15f, $$2.b());
        this.b($$1);
    }

    protected void b(eoh $$0) {
        ehs $$1 = $$0.A();
        this.a($$1.d(), $$1.a() * 0.05f, $$1.b() * 0.8f);
    }

    protected void b(is $$0, eoh $$1) {
        ehs $$2 = $$1.A();
        this.a($$2.d(), $$2.a() * 0.15f, $$2.b());
    }

    private boolean d(eoh $$0) {
        return $$0.a(bdp.bz) && this.at >= this.bD + 20;
    }

    private void q() {
        this.bC *= (float)Math.pow(0.997, this.at - this.bD);
        this.bC = Math.min(1.0f, this.bC + 0.07f);
        float $$0 = 0.5f + this.bC * this.as.i() * 1.2f;
        float $$1 = 0.1f + this.bC * 1.2f;
        this.a(bda.E, $$1, $$0);
        this.bD = this.at;
    }

    protected void g(float $$0) {
        this.a(this.bk(), $$0, 1.0f + (this.as.i() - this.as.i()) * 0.4f);
    }

    protected void bo() {
    }

    protected boolean bp() {
        return false;
    }

    public void a(bcz $$0, float $$1, float $$2) {
        if (!this.bq()) {
            this.ao().a(null, this.dP(), this.dR(), this.dV(), $$0, this.dB(), $$1, $$2);
        }
    }

    public void a(bcz $$0) {
        if (!this.bq()) {
            this.a($$0, 1.0f, 1.0f);
        }
    }

    public boolean bq() {
        return this.az.a(bo);
    }

    public void f(boolean $$0) {
        this.az.a(bo, $$0);
    }

    public boolean br() {
        return this.az.a(bp);
    }

    public void g(boolean $$0) {
        this.az.a(bp, $$0);
    }

    protected double bs() {
        return 0.0;
    }

    public final double bt() {
        return this.br() ? 0.0 : this.bs();
    }

    protected void bu() {
        double $$0 = this.bt();
        if ($$0 != 0.0) {
            this.k(this.dN().b(0.0, -$$0, 0.0));
        }
    }

    protected d bv() {
        return cgk$d.d;
    }

    public boolean bw() {
        return false;
    }

    public final void a(double $$0, double $$1, double $$2, boolean $$3) {
        if (this.dD()) {
            return;
        }
        this.b($$3, new ftm($$0, $$1, $$2));
        is $$4 = this.be();
        eoh $$5 = this.ao().a_($$4);
        this.a($$1, $$3, $$5, $$4);
    }

    protected void a(double $$02, boolean $$1, eoh $$2, is $$3) {
        if (!this.by() && $$02 < 0.0) {
            this.an -= (double)((float)$$02);
        }
        if ($$1) {
            if (this.an > 0.0) {
                $$2.b().a(this.ao(), $$2, $$3, this, this.an);
                this.ao().a(etk.A, this.aV, etk.a.a(this, this.aL.map($$0 -> this.ao().a_((is)$$0)).orElse($$2)));
            }
            this.l();
        }
    }

    public boolean bx() {
        return this.ay().d();
    }

    public boolean a(double $$0, float $$1, cex $$2) {
        if (this.aP.a(bdt.p)) {
            return false;
        }
        this.b($$0, $$1, $$2);
        return false;
    }

    protected void b(double $$0, float $$1, cex $$2) {
        if (this.cr()) {
            for (cgk $$3 : this.dn()) {
                $$3.a($$0, $$1, $$2);
            }
        }
    }

    public boolean by() {
        return this.au;
    }

    boolean bz() {
        is $$0 = this.dK();
        return this.ao().v($$0) || this.ao().v(is.a((double)$$0.u(), this.dj().e, (double)$$0.w()));
    }

    public boolean bA() {
        return this.by() || this.bz();
    }

    public boolean bB() {
        return this.by() || this.bN();
    }

    public boolean bC() {
        return this.aw && this.by();
    }

    public boolean bD() {
        return this.by() && !this.bC();
    }

    public boolean bE() {
        if (bel.b(this.aU.c().a(ceg.k, this.dI())) == 0) {
            return false;
        }
        float $$0 = this.aU.c().a(ceg.l, this.dI()).floatValue();
        if (this.dR() + (double)this.dG() < (double)$$0) {
            return false;
        }
        float $$1 = $$0 + 4.0f;
        return this.dR() <= (double)$$1;
    }

    public void bF() {
        if (this.cB()) {
            this.j(this.cA() && this.by() && !this.cq());
        } else {
            this.j(this.cA() && this.bC() && !this.cq() && this.ao().b_(this.aW).a(bdv.a));
        }
    }

    protected boolean bG() {
        this.av.clear();
        this.bH();
        double $$0 = this.aU.c().a(ceg.F) != false ? 0.007 : 0.0023333333333333335;
        boolean $$1 = this.a(bdv.b, $$0);
        return this.by() || $$1;
    }

    void bH() {
        dgb $$0;
        cgk cgk2 = this.dz();
        if (cgk2 instanceof dgb && !($$0 = (dgb)cgk2).bC()) {
            this.au = false;
        } else if (this.a(bdv.a, 0.014)) {
            if (!this.au && !this.ay) {
                this.bI();
            }
            this.l();
            this.au = true;
        } else {
            this.au = false;
        }
    }

    private void u() {
        dgb $$2;
        this.aw = this.a(bdv.a);
        this.bg.clear();
        double $$0 = this.dT();
        cgk $$1 = this.dz();
        if ($$1 instanceof dgb && !($$2 = (dgb)$$1).bC() && $$2.dj().e >= $$0 && $$2.dj().b <= $$0) {
            return;
        }
        is $$3 = is.a(this.dP(), $$0, this.dV());
        flb $$4 = this.ao().b_($$3);
        double $$5 = (float)$$3.v() + $$4.a(this.ao(), $$3);
        if ($$5 > $$0) {
            $$4.k().forEach(this.bg::add);
        }
    }

    protected void bI() {
        cgk $$0 = Objects.requireNonNullElse(this.dl(), this);
        float $$1 = $$0 == this ? 0.2f : 0.9f;
        ftm $$2 = $$0.dN();
        float $$3 = Math.min(1.0f, (float)Math.sqrt($$2.g * $$2.g * (double)0.2f + $$2.h * $$2.h + $$2.i * $$2.i * (double)0.2f) * $$1);
        if ($$3 < 0.25f) {
            this.a(this.bl(), $$3, 1.0f + (this.as.i() - this.as.i()) * 0.4f);
        } else {
            this.a(this.bm(), $$3, 1.0f + (this.as.i() - this.as.i()) * 0.4f);
        }
        float $$4 = bgj.c(this.dR());
        int $$5 = 0;
        while ((float)$$5 < 1.0f + this.bz.a() * 20.0f) {
            double $$6 = (this.as.j() * 2.0 - 1.0) * (double)this.bz.a();
            double $$7 = (this.as.j() * 2.0 - 1.0) * (double)this.bz.a();
            this.ao().a(ly.d, this.dP() + $$6, (double)($$4 + 1.0f), this.dV() + $$7, $$2.g, $$2.h - this.as.j() * (double)0.2f, $$2.i);
            ++$$5;
        }
        int $$8 = 0;
        while ((float)$$8 < 1.0f + this.bz.a() * 20.0f) {
            double $$9 = (this.as.j() * 2.0 - 1.0) * (double)this.bz.a();
            double $$10 = (this.as.j() * 2.0 - 1.0) * (double)this.bz.a();
            this.ao().a(ly.aq, this.dP() + $$9, (double)($$4 + 1.0f), this.dV() + $$10, $$2.g, $$2.h, $$2.i);
            ++$$8;
        }
        this.c(etk.O);
    }

    @Deprecated
    protected eoh bJ() {
        return this.ao().a_(this.be());
    }

    public eoh bK() {
        return this.ao().a_(this.bg());
    }

    public boolean bL() {
        return this.cA() && !this.by() && !this.au() && !this.cz() && !this.bN() && this.cb();
    }

    protected void bM() {
        is $$0 = this.be();
        eoh $$1 = this.ao().a_($$0);
        if ($$1.o() != egf.a) {
            ftm $$2 = this.dN();
            is $$3 = this.dK();
            double $$4 = this.dP() + (this.as.j() - 0.5) * (double)this.bz.a();
            double $$5 = this.dV() + (this.as.j() - 0.5) * (double)this.bz.a();
            if ($$3.u() != $$0.u()) {
                $$4 = bgj.a($$4, (double)$$0.u(), (double)$$0.u() + 1.0);
            }
            if ($$3.w() != $$0.w()) {
                $$5 = bgj.a($$5, (double)$$0.w(), (double)$$0.w() + 1.0);
            }
            this.ao().a(new lp(ly.b, $$1), $$4, this.dR() + 0.1, $$5, $$2.g * -4.0, 1.5, $$2.i * -4.0);
        }
    }

    public boolean a(bef<fla> $$0) {
        return this.bg.contains($$0);
    }

    public boolean bN() {
        return !this.ay && this.av.getDouble(bdv.b) > 0.0;
    }

    public void a(float $$0, ftm $$1) {
        ftm $$2 = cgk.a($$1, $$0, this.ec());
        this.k(this.dN().e($$2));
    }

    protected static ftm a(ftm $$0, float $$1, float $$2) {
        double $$3 = $$0.h();
        if ($$3 < 1.0E-7) {
            return ftm.c;
        }
        ftm $$4 = ($$3 > 1.0 ? $$0.d() : $$0).c((double)$$1);
        float $$5 = bgj.a((double)($$2 * ((float)Math.PI / 180)));
        float $$6 = bgj.b((double)($$2 * ((float)Math.PI / 180)));
        return new ftm($$4.g * (double)$$6 - $$4.i * (double)$$5, $$4.h, $$4.i * (double)$$6 + $$4.g * (double)$$5);
    }

    @Deprecated
    public float bO() {
        if (this.ao().f(this.dO(), this.dU())) {
            return this.ao().D(is.a(this.dP(), this.dT(), this.dV()));
        }
        return 0.0f;
    }

    public void a(double $$0, double $$1, double $$2, float $$3, float $$4) {
        this.g($$0, $$1, $$2);
        this.b($$3, $$4);
    }

    public void b(float $$0, float $$1) {
        this.v($$0 % 360.0f);
        this.w(bgj.a($$1, -90.0f, 90.0f) % 360.0f);
        this.ab = this.ec();
        this.ac = this.ee();
    }

    public void g(double $$0, double $$1, double $$2) {
        double $$3 = bgj.a($$0, -3.0E7, 3.0E7);
        double $$4 = bgj.a($$2, -3.0E7, 3.0E7);
        this.Y = $$3;
        this.Z = $$1;
        this.aa = $$4;
        this.a_($$3, $$1, $$4);
    }

    public void f(ftm $$0) {
        this.d($$0.g, $$0.h, $$0.i);
    }

    public void d(double $$0, double $$1, double $$2) {
        this.b($$0, $$1, $$2, this.ec(), this.ee());
    }

    public void a(is $$0, float $$1, float $$2) {
        this.b($$0.c(), $$1, $$2);
    }

    public void b(ftm $$0, float $$1, float $$2) {
        this.b($$0.g, $$0.h, $$0.i, $$1, $$2);
    }

    public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
        this.n($$0, $$1, $$2);
        this.v($$3);
        this.w($$4);
        this.bP();
        this.aH();
    }

    public final void bP() {
        this.bQ();
        this.bR();
    }

    public final void c(ftm $$0, float $$1, float $$2) {
        this.m($$0);
        this.f($$1, $$2);
    }

    protected void bQ() {
        this.m(this.aV);
    }

    public void bR() {
        this.f(this.ec(), this.ee());
    }

    private void m(ftm $$0) {
        this.Y = this.ao = $$0.g;
        this.Z = this.ap = $$0.h;
        this.aa = this.aq = $$0.i;
    }

    private void f(float $$0, float $$1) {
        this.ab = $$0;
        this.ac = $$1;
    }

    public final ftm bS() {
        return new ftm(this.ao, this.ap, this.aq);
    }

    public float f(cgk $$0) {
        float $$1 = (float)(this.dP() - $$0.dP());
        float $$2 = (float)(this.dR() - $$0.dR());
        float $$3 = (float)(this.dV() - $$0.dV());
        return bgj.a($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
    }

    public double h(double $$0, double $$1, double $$2) {
        double $$3 = this.dP() - $$0;
        double $$4 = this.dR() - $$1;
        double $$5 = this.dV() - $$2;
        return $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
    }

    public double g(cgk $$0) {
        return this.g($$0.dI());
    }

    public double g(ftm $$0) {
        double $$1 = this.dP() - $$0.g;
        double $$2 = this.dR() - $$0.h;
        double $$3 = this.dV() - $$0.i;
        return $$1 * $$1 + $$2 * $$2 + $$3 * $$3;
    }

    public void a_(ddm $$0) {
    }

    public void h(cgk $$0) {
        double $$2;
        if (this.A($$0)) {
            return;
        }
        if ($$0.ar || this.ar) {
            return;
        }
        double $$1 = $$0.dP() - this.dP();
        double $$3 = bgj.a($$1, $$2 = $$0.dV() - this.dV());
        if ($$3 >= (double)0.01f) {
            $$3 = Math.sqrt($$3);
            $$1 /= $$3;
            $$2 /= $$3;
            double $$4 = 1.0 / $$3;
            if ($$4 > 1.0) {
                $$4 = 1.0;
            }
            $$1 *= $$4;
            $$2 *= $$4;
            $$1 *= (double)0.05f;
            $$2 *= (double)0.05f;
            if (!this.cr() && this.bY()) {
                this.i(-$$1, 0.0, -$$2);
            }
            if (!$$0.cr() && $$0.bY()) {
                $$0.i($$1, 0.0, $$2);
            }
        }
    }

    public void h(ftm $$0) {
        if ($$0.n()) {
            this.i($$0.g, $$0.h, $$0.i);
        }
    }

    public void i(double $$0, double $$1, double $$2) {
        if (Double.isFinite($$0) && Double.isFinite($$1) && Double.isFinite($$2)) {
            this.k(this.dN().b($$0, $$1, $$2));
            this.aF = true;
        }
    }

    protected void bT() {
        this.ah = true;
    }

    @Deprecated
    public final void a(cex $$0, float $$1) {
        dwo dwo2 = this.aU;
        if (dwo2 instanceof axf) {
            axf $$2 = (axf)dwo2;
            this.a($$2, $$0, $$1);
        }
    }

    @Deprecated
    public final boolean b(cex $$0, float $$1) {
        dwo dwo2 = this.aU;
        if (dwo2 instanceof axf) {
            axf $$2 = (axf)dwo2;
            return this.a($$2, $$0, $$1);
        }
        return this.b($$0);
    }

    public abstract boolean a(axf var1, cex var2, float var3);

    public boolean b(cex $$0) {
        return false;
    }

    public final ftm h(float $$0) {
        return this.c(this.i($$0), this.j($$0));
    }

    public iz bU() {
        return iz.a(this.h(1.0f));
    }

    public float i(float $$0) {
        return this.k($$0);
    }

    public float j(float $$0) {
        return this.l($$0);
    }

    public float k(float $$0) {
        if ($$0 == 1.0f) {
            return this.ee();
        }
        return bgj.h($$0, this.ac, this.ee());
    }

    public float l(float $$0) {
        if ($$0 == 1.0f) {
            return this.ec();
        }
        return bgj.i($$0, this.ab, this.ec());
    }

    public final ftm c(float $$0, float $$1) {
        float $$2 = $$0 * ((float)Math.PI / 180);
        float $$3 = -$$1 * ((float)Math.PI / 180);
        float $$4 = bgj.b((double)$$3);
        float $$5 = bgj.a((double)$$3);
        float $$6 = bgj.b((double)$$2);
        float $$7 = bgj.a((double)$$2);
        return new ftm($$5 * $$6, -$$7, $$4 * $$6);
    }

    public final ftm m(float $$0) {
        return this.d(this.i($$0), this.j($$0));
    }

    protected final ftm d(float $$0, float $$1) {
        return this.c($$0 - 90.0f, $$1);
    }

    public final ftm bV() {
        return new ftm(this.dP(), this.dT(), this.dV());
    }

    public final ftm n(float $$0) {
        double $$1 = bgj.d((double)$$0, this.Y, this.dP());
        double $$2 = bgj.d((double)$$0, this.Z, this.dR()) + (double)this.dk();
        double $$3 = bgj.d((double)$$0, this.aa, this.dV());
        return new ftm($$1, $$2, $$3);
    }

    public ftm o(float $$0) {
        return this.n($$0);
    }

    public final ftm p(float $$0) {
        double $$1 = bgj.d((double)$$0, this.Y, this.dP());
        double $$2 = bgj.d((double)$$0, this.Z, this.dR());
        double $$3 = bgj.d((double)$$0, this.aa, this.dV());
        return new ftm($$1, $$2, $$3);
    }

    public ftk a(double $$0, float $$1, boolean $$2) {
        ftm $$3 = this.n($$1);
        ftm $$4 = this.h($$1);
        ftm $$5 = $$3.b($$4.g * $$0, $$4.h * $$0, $$4.i * $$0);
        return this.ao().a(new dvw($$3, $$5, dvw.a.b, $$2 ? dvw.b.c : dvw.b.a, this));
    }

    public boolean bW() {
        return this.cb() && this.bX();
    }

    public boolean bX() {
        return false;
    }

    public boolean bY() {
        return false;
    }

    public void a(cgk $$0, cex $$1) {
        if ($$0 instanceof axg) {
            aj.d.a((axg)$$0, this, $$1);
        }
    }

    public boolean j(double $$0, double $$1, double $$2) {
        double $$3 = this.dP() - $$0;
        double $$4 = this.dR() - $$1;
        double $$5 = this.dV() - $$2;
        double $$6 = $$3 * $$3 + $$4 * $$4 + $$5 * $$5;
        return this.a($$6);
    }

    public boolean a(double $$0) {
        double $$1 = this.dj().a();
        if (Double.isNaN($$1)) {
            $$1 = 1.0;
        }
        return $$0 < ($$1 *= 64.0 * aO) * $$1;
    }

    public boolean b(fns $$0) {
        if (this.bd != null && !this.bd.b()) {
            return false;
        }
        String $$1 = this.ca();
        if ($$1 == null) {
            return false;
        }
        $$0.a(v, $$1);
        this.d($$0);
        return true;
    }

    public boolean c(fns $$0) {
        if (this.cq()) {
            return false;
        }
        return this.b($$0);
    }

    public void d(fns $$0) {
        try {
            int $$1;
            if (this.aT != null) {
                $$0.a(z, ftm.a, new ftm(this.aT.dP(), this.dR(), this.aT.dV()));
            } else {
                $$0.a(z, ftm.a, this.dI());
            }
            $$0.a(A, ftm.a, this.dN());
            $$0.a(B, ftl.i, new ftl(this.ec(), this.ee()));
            $$0.a(G, this.an);
            $$0.a(H, (short)this.bf);
            $$0.a(E, (short)this.cK());
            $$0.a(F, this.aV());
            $$0.a(K, this.bu);
            $$0.a(C, this.bt);
            $$0.a(w, jx.a, this.cY());
            $$0.b(L, yj.a, this.as());
            if (this.dd()) {
                $$0.a("CustomNameVisible", this.dd());
            }
            if (this.bq()) {
                $$0.a(I, this.bq());
            }
            if (this.br()) {
                $$0.a(D, this.br());
            }
            if (this.bv) {
                $$0.a(J, true);
            }
            if (($$1 = this.cM()) > 0) {
                $$0.a("TicksFrozen", this.cM());
            }
            if (this.bE) {
                $$0.a("HasVisualFire", this.bE);
            }
            if (!this.bw.isEmpty()) {
                $$0.a("Tags", d, List.copyOf(this.bw));
            }
            if (!this.bM.a()) {
                $$0.a(y, doe.c, this.bM);
            }
            this.a($$0);
            if (this.cr()) {
                fns.b $$2 = $$0.b(x);
                for (cgk $$3 : this.dn()) {
                    fns $$4;
                    if ($$3.b($$4 = $$2.a())) continue;
                    $$2.b();
                }
                if ($$2.c()) {
                    $$0.c(x);
                }
            }
        }
        catch (Throwable $$5) {
            m $$6 = m.a($$5, "Saving entity NBT");
            n $$7 = $$6.a("Entity being saved");
            this.a($$7);
            throw new v($$6);
        }
    }

    public void d(fnq $$02) {
        try {
            ftm $$1 = $$02.a(z, ftm.a).orElse(ftm.c);
            ftm $$2 = $$02.a(A, ftm.a).orElse(ftm.c);
            ftl $$3 = $$02.a(B, ftl.i).orElse(ftl.a);
            this.m(Math.abs($$2.g) > 10.0 ? 0.0 : $$2.g, Math.abs($$2.h) > 10.0 ? 0.0 : $$2.h, Math.abs($$2.i) > 10.0 ? 0.0 : $$2.i);
            this.aF = true;
            double $$4 = 3.0000512E7;
            this.n(bgj.a($$1.g, -3.0000512E7, 3.0000512E7), bgj.a($$1.h, -2.0E7, 2.0E7), bgj.a($$1.i, -3.0000512E7, 3.0000512E7));
            this.v($$3.j);
            this.w($$3.k);
            this.bP();
            this.r(this.ec());
            this.s(this.ec());
            this.an = $$02.a(G, 0.0);
            this.bf = $$02.a(H, (short)0);
            this.j($$02.a(E, this.cJ()));
            this.bc = $$02.a(F, false);
            this.bu = $$02.a(K, false);
            this.bt = $$02.a(C, 0);
            $$02.a(w, jx.a).ifPresent($$0 -> {
                this.aH = $$0;
                this.aI = this.aH.toString();
            });
            if (!(Double.isFinite(this.dP()) && Double.isFinite(this.dR()) && Double.isFinite(this.dV()))) {
                throw new IllegalStateException("Entity has invalid position");
            }
            if (!Double.isFinite(this.ec()) || !Double.isFinite(this.ee())) {
                throw new IllegalStateException("Entity has invalid rotation");
            }
            this.aH();
            this.a(this.ec(), this.ee());
            this.b((yh)$$02.a(L, yj.a).orElse(null));
            this.p($$02.a("CustomNameVisible", false));
            this.f($$02.a(I, false));
            this.g($$02.a(D, false));
            this.k($$02.a(J, false));
            this.k($$02.a("TicksFrozen", 0));
            this.bE = $$02.a("HasVisualFire", false);
            this.bM = $$02.a(y, doe.c).orElse(doe.a);
            this.bw.clear();
            $$02.a("Tags", d).ifPresent(this.bw::addAll);
            this.a($$02);
            if (this.bZ()) {
                this.aH();
            }
        }
        catch (Throwable $$5) {
            m $$6 = m.a($$5, "Loading entity NBT");
            n $$7 = $$6.a("Entity being loaded");
            this.a($$7);
            throw new v($$6);
        }
    }

    protected boolean bZ() {
        return true;
    }

    protected final @Nullable String ca() {
        cgu<?> $$0 = this.ay();
        amo $$1 = cgu.a($$0);
        return !$$0.b() ? null : $$1.toString();
    }

    protected abstract void a(fnq var1);

    protected abstract void a(fns var1);

    public @Nullable czl a(axf $$0, dwn $$1) {
        return this.a($$0, new dlt($$1), 0.0f);
    }

    public @Nullable czl a(axf $$0, dlt $$1) {
        return this.a($$0, $$1, 0.0f);
    }

    public @Nullable czl a(axf $$0, dlt $$1, ftm $$2) {
        if ($$1.f()) {
            return null;
        }
        czl $$3 = new czl($$0, this.dP() + $$2.g, this.dR() + $$2.h, this.dV() + $$2.i, $$1);
        $$3.i();
        $$0.b($$3);
        return $$3;
    }

    public @Nullable czl a(axf $$0, dlt $$1, float $$2) {
        return this.a($$0, $$1, new ftm(0.0, $$2, 0.0));
    }

    public boolean cb() {
        return !this.eh();
    }

    public boolean cc() {
        if (this.ar) {
            return false;
        }
        float $$0 = this.bz.a() * 0.8f;
        fth $$12 = fth.a(this.bV(), $$0, 1.0E-6, $$0);
        return is.b($$12).anyMatch($$1 -> {
            eoh $$2 = this.ao().a_((is)$$1);
            return !$$2.l() && $$2.j(this.ao(), (is)$$1) && fud.c($$2.g(this.ao(), (is)$$1).a((jy)$$1), fud.a($$12), ftq.i);
        });
    }

    public cdc a(ddm $$0, cdb $$12) {
        dlt $$7;
        Object $$4;
        chl $$3;
        cgk cgk2;
        chj $$2;
        cgk cgk3;
        if (!this.ao().B_() && $$0.gA() && (cgk3 = this) instanceof chj && ($$2 = (chj)((Object)cgk3)).aj_() && this.cb() && (!((cgk2 = this) instanceof chl) || !($$3 = (chl)cgk2).e_()) && !($$4 = chj.a(this, (chj $$1) -> $$1.C() == $$0)).isEmpty()) {
            boolean $$5 = false;
            Iterator iterator = $$4.iterator();
            while (iterator.hasNext()) {
                chj $$6 = (chj)iterator.next();
                if (!$$6.b_(this)) continue;
                $$6.a_(this, true);
                $$5 = true;
            }
            if ($$5) {
                this.ao().a(etk.u, this.dK(), etk.a.a($$0));
                this.a(bda.qc);
                return cdc.b.b();
            }
        }
        if (($$7 = $$0.b($$12)).a(dlx.tZ) && this.c($$0)) {
            $$7.a(1, (chl)$$0, $$12);
            return cdc.a;
        }
        $$4 = this;
        if ($$4 instanceof chn) {
            chn $$8 = (chn)$$4;
            if ($$7.a(dlx.tZ) && $$8.b_($$0) && !$$0.gA() && this.a($$0, $$12, $$7, $$8)) {
                return cdc.a;
            }
        }
        if (this.cb() && ($$4 = this) instanceof chj) {
            chj $$9 = (chj)$$4;
            if ($$9.C() == $$0) {
                if (!this.ao().B_()) {
                    if ($$0.gv()) {
                        $$9.r();
                    } else {
                        $$9.o();
                    }
                    this.a(etk.r, (cgk)$$0);
                    this.a(bda.qb);
                }
                return cdc.a.b();
            }
            dlt $$10 = $$0.b($$12);
            if ($$10.a(dlx.wZ) && !($$9.C() instanceof ddm)) {
                if (this.ao().B_()) {
                    return cdc.c;
                }
                if ($$9.b_($$0)) {
                    if ($$9.S_()) {
                        $$9.o();
                    }
                    $$9.a_($$0, true);
                    this.a(bda.qc);
                    $$10.h(1);
                    return cdc.b;
                }
            }
        }
        return cdc.e;
    }

    public boolean c(@Nullable ddm $$0) {
        dwo dwo2;
        boolean $$1 = this.d($$0);
        if ($$1 && (dwo2 = this.ao()) instanceof axf) {
            axf $$2 = (axf)dwo2;
            $$2.a(null, this.dK(), bda.zy, $$0 != null ? $$0.dB() : this.dB());
        }
        return $$1;
    }

    public boolean d(@Nullable ddm $$0) {
        chj $$3;
        List<chj> $$1 = chj.c_(this);
        boolean $$2 = !$$1.isEmpty();
        cgk cgk2 = this;
        if (cgk2 instanceof chj && ($$3 = (chj)((Object)cgk2)).S_()) {
            $$3.o();
            $$2 = true;
        }
        for (chj $$4 : $$1) {
            $$4.o();
        }
        if ($$2) {
            this.a(etk.M, (cgk)$$0);
            return true;
        }
        return false;
    }

    private boolean a(ddm $$0, cdb $$1, dlt $$2, chn $$3) {
        for (cgv $$4 : cgv.j) {
            dlt $$5 = $$3.a($$4);
            dun $$6 = $$5.a(ki.H);
            if ($$6 == null || !$$6.k() || dsq.a($$5, dsp.F) && !$$0.ha()) continue;
            $$2.a(1, (chl)$$0, $$1.a());
            ftm $$7 = this.bz.d().a(cgl.a);
            $$3.b($$4, dlt.l);
            this.a(etk.M, (cgk)$$0);
            this.a($$6.l().a());
            dwo dwo2 = this.ao();
            if (dwo2 instanceof axf) {
                axf $$8 = (axf)dwo2;
                this.a($$8, $$5, $$7);
                aj.V.a((axg)$$0, $$5, $$3);
            }
            return true;
        }
        return false;
    }

    public boolean i(cgk $$0) {
        return $$0.j(this) && !this.A($$0);
    }

    public boolean j(@Nullable cgk $$0) {
        return false;
    }

    public void t() {
        this.k(ftm.c);
        this.g();
        if (!this.cq()) {
            return;
        }
        this.dz().k(this);
    }

    public final void k(cgk $$0) {
        if (!this.z($$0)) {
            return;
        }
        this.a($$0, cgk::a_);
    }

    protected void a(cgk $$0, b $$1) {
        ftm $$2 = this.n($$0);
        ftm $$3 = $$0.m(this);
        $$1.accept($$0, $$2.g - $$3.g, $$2.h - $$3.h, $$2.i - $$3.i);
    }

    public void l(cgk $$0) {
    }

    public ftm m(cgk $$0) {
        return this.dH().b(cgl.b, 0, this.aZ);
    }

    public ftm n(cgk $$0) {
        return this.dI().e(this.a($$0, this.bz, 1.0f));
    }

    protected ftm a(cgk $$0, cgn $$1, float $$2) {
        return cgk.a(this, $$0, $$1.d());
    }

    protected static ftm a(cgk $$0, cgk $$1, cgm $$2) {
        int $$3 = $$0.dn().indexOf($$1);
        return $$2.c(cgl.a, $$3, $$0.aZ);
    }

    public final boolean o(cgk $$0) {
        return this.a($$0, false, true);
    }

    public boolean cd() {
        return this instanceof chl;
    }

    public boolean a(cgk $$02, boolean $$1, boolean $$2) {
        if ($$02 == this.aT) {
            return false;
        }
        if (!$$02.cg()) {
            return false;
        }
        if (!this.ao().B_() && !$$02.aP.b()) {
            return false;
        }
        cgk $$3 = $$02;
        while ($$3.aT != null) {
            if ($$3.aT == this) {
                return false;
            }
            $$3 = $$3.aT;
        }
        if (!($$1 || this.p($$02) && $$02.s(this))) {
            return false;
        }
        if (this.cq()) {
            this.cf();
        }
        this.c(chx.a);
        this.aT = $$02;
        this.aT.q(this);
        if ($$2) {
            this.ao().a(this, etk.s, this.aT.aV);
            $$02.E().filter($$0 -> $$0 instanceof axg).forEach($$0 -> aj.W.a((axg)$$0));
        }
        return true;
    }

    protected boolean p(cgk $$0) {
        return !this.cu() && this.X <= 0;
    }

    public void ce() {
        for (int $$0 = this.aS.size() - 1; $$0 >= 0; --$$0) {
            ((cgk)this.aS.get($$0)).cf();
        }
    }

    public void ad() {
        if (this.aT != null) {
            cgk $$0 = this.aT;
            this.aT = null;
            $$0.r(this);
            e $$1 = this.ei();
            if ($$1 == null || $$1.a()) {
                this.ao().a(this, etk.q, $$0.aV);
            }
        }
    }

    public void cf() {
        this.ad();
    }

    protected void q(cgk $$0) {
        if ($$0.dz() != this) {
            throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
        }
        if (this.aS.isEmpty()) {
            this.aS = ImmutableList.of((Object)$$0);
        } else {
            ArrayList $$1 = Lists.newArrayList(this.aS);
            if (!this.ao().B_() && $$0 instanceof ddm && !(this.do() instanceof ddm)) {
                $$1.add(0, $$0);
            } else {
                $$1.add($$0);
            }
            this.aS = ImmutableList.copyOf((Collection)$$1);
        }
    }

    protected void r(cgk $$0) {
        if ($$0.dz() == this) {
            throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
        }
        this.aS = this.aS.size() == 1 && this.aS.get(0) == $$0 ? ImmutableList.of() : (ImmutableList)this.aS.stream().filter($$1 -> $$1 != $$0).collect(ImmutableList.toImmutableList());
        $$0.X = 60;
    }

    protected boolean s(cgk $$0) {
        return this.aS.isEmpty();
    }

    protected boolean cg() {
        return true;
    }

    public final boolean ch() {
        return this.l_() != null && this.l_().d();
    }

    public final void d(ftm $$0, float $$1, float $$2) {
        this.a(Optional.of($$0), Optional.of(Float.valueOf($$1)), Optional.of(Float.valueOf($$2)));
    }

    public final void e(float $$0, float $$1) {
        this.a(Optional.empty(), Optional.of(Float.valueOf($$0)), Optional.of(Float.valueOf($$1)));
    }

    public final void i(ftm $$0) {
        this.a(Optional.of($$0), Optional.empty(), Optional.empty());
    }

    public final void a(Optional<ftm> $$02, Optional<Float> $$1, Optional<Float> $$2) {
        chf $$3 = this.l_();
        if ($$3 != null) {
            $$3.a($$02.orElse($$3.a()), $$1.orElse(Float.valueOf($$3.b())).floatValue(), $$2.orElse(Float.valueOf($$3.c())).floatValue());
        } else {
            $$02.ifPresent(this::b);
            $$1.ifPresent($$0 -> this.v($$0.floatValue() % 360.0f));
            $$2.ifPresent($$0 -> this.w($$0.floatValue() % 360.0f));
        }
    }

    public @Nullable chf l_() {
        return null;
    }

    public void a(float $$0, int $$1) {
        this.r($$0);
    }

    public float ci() {
        return 0.0f;
    }

    public ftm cj() {
        return this.c(this.ee(), this.ec());
    }

    public ftm ck() {
        return this.c(this.ee(), this.cS());
    }

    public ftm a(dlp $$0) {
        cgk cgk2 = this;
        if (cgk2 instanceof ddm) {
            ddm $$1 = (ddm)cgk2;
            boolean $$2 = $$1.fy().a($$0) && !$$1.fx().a($$0);
            chb $$3 = $$2 ? $$1.at().a() : $$1.at();
            return this.c(0.0f, this.ec() + (float)($$3 == chb.b ? 80 : -80)).c(0.5);
        }
        return ftm.c;
    }

    public ftl cl() {
        return new ftl(this.ee(), this.ec());
    }

    public ftm cm() {
        return ftm.a(this.cl());
    }

    public void a(efr $$0, is $$1) {
        if (this.aO()) {
            this.aM();
            return;
        }
        if (this.aG == null || !this.aG.a($$0)) {
            this.aG = new chw($$0, $$1.j());
        } else if (!this.aG.e()) {
            this.aG.a($$1.j());
            this.aG.a(true);
        }
    }

    /*
     * WARNING - void declaration
     */
    protected void cn() {
        void $$1;
        dwo dwo2 = this.ao();
        if (!(dwo2 instanceof axf)) {
            return;
        }
        axf $$0 = (axf)dwo2;
        this.O();
        if (this.aG == null) {
            return;
        }
        if (this.aG.a((axf)$$1, this, this.o(false))) {
            axf $$4;
            bzm $$2 = bzl.a();
            $$2.a("portal");
            this.aM();
            fmb $$3 = this.aG.a((axf)$$1, this);
            if ($$3 != null && $$1.a($$4 = $$3.b()) && ($$4.aq() == $$1.aq() || this.a((dwo)$$1, (dwo)$$4))) {
                this.b($$3);
            }
            $$2.c();
        } else if (this.aG.b()) {
            this.aG = null;
        }
    }

    public int co() {
        cgk $$0 = this.do();
        return $$0 instanceof axg ? $$0.co() : 300;
    }

    public void j(ftm $$0) {
        this.k($$0);
    }

    public void c(cex $$0) {
    }

    public void b(byte $$0) {
        switch ($$0) {
            case 53: {
                edr.a(this);
            }
        }
    }

    public void q(float $$0) {
    }

    public boolean cp() {
        boolean $$0 = this.ao() != null && this.ao().B_();
        return !this.bx() && (this.bf > 0 || $$0 && this.i(0));
    }

    public boolean cq() {
        return this.dz() != null;
    }

    public boolean cr() {
        return !this.aS.isEmpty();
    }

    public boolean cs() {
        return this.ay().a(bdt.q);
    }

    public boolean ct() {
        return !this.ay().a(bdt.r);
    }

    public void h(boolean $$0) {
        this.b(1, $$0);
    }

    public boolean cu() {
        return this.i(1);
    }

    public boolean cv() {
        return this.cu();
    }

    public boolean cw() {
        return this.cu();
    }

    public boolean cx() {
        return this.cu();
    }

    public boolean cy() {
        return this.cu();
    }

    public boolean cz() {
        return this.d(chx.f);
    }

    public boolean cA() {
        return this.i(3);
    }

    public void i(boolean $$0) {
        this.b(3, $$0);
    }

    public boolean cB() {
        return this.i(4);
    }

    public boolean cC() {
        return this.d(chx.d);
    }

    public boolean cD() {
        return this.cC() && !this.by();
    }

    public void j(boolean $$0) {
        this.b(4, $$0);
    }

    public final boolean cE() {
        return this.bv;
    }

    public final void k(boolean $$0) {
        this.bv = $$0;
        this.b(6, this.cF());
    }

    public boolean cF() {
        if (this.ao().B_()) {
            return this.i(6);
        }
        return this.bv;
    }

    public boolean cG() {
        return this.i(5);
    }

    public boolean e(ddm $$0) {
        if ($$0.au()) {
            return false;
        }
        fum $$1 = this.cI();
        if ($$1 != null && $$0 != null && $$0.cI() == $$1 && ((fut)$$1).j()) {
            return false;
        }
        return this.cG();
    }

    public boolean cH() {
        return false;
    }

    public void a(BiConsumer<eth<?>, axf> $$0) {
    }

    public @Nullable fum cI() {
        return this.ao().ab().e(this.da());
    }

    public final boolean t(@Nullable cgk $$0) {
        if ($$0 == null) {
            return false;
        }
        return this == $$0 || this.u($$0) || $$0.u(this);
    }

    protected boolean u(cgk $$0) {
        return this.a($$0.cI());
    }

    public boolean a(@Nullable fut $$0) {
        if (this.cI() != null) {
            return this.cI().a($$0);
        }
        return false;
    }

    public void l(boolean $$0) {
        this.b(5, $$0);
    }

    protected boolean i(int $$0) {
        return (this.az.a(aA) & 1 << $$0) != 0;
    }

    protected void b(int $$0, boolean $$1) {
        byte $$2 = this.az.a(aA);
        if ($$1) {
            this.az.a(aA, (byte)($$2 | 1 << $$0));
        } else {
            this.az.a(aA, (byte)($$2 & ~(1 << $$0)));
        }
    }

    public int cJ() {
        return 300;
    }

    public int cK() {
        return this.az.a(bl);
    }

    public void j(int $$0) {
        this.az.a(bl, $$0);
    }

    public void cL() {
        this.k(0);
    }

    public int cM() {
        return this.az.a(bq);
    }

    public void k(int $$0) {
        this.az.a(bq, $$0);
    }

    public float cN() {
        int $$0 = this.cP();
        return (float)Math.min(this.cM(), $$0) / (float)$$0;
    }

    public boolean cO() {
        return this.cM() >= this.cP();
    }

    public int cP() {
        return 140;
    }

    public void a(axf $$0, chk $$1) {
        this.h(this.bf + 1);
        if (this.bf == 0) {
            this.e(8.0f);
        }
        this.a($$0, this.en().c(), 5.0f);
    }

    public void a(boolean $$0, is $$1) {
        cgk.a(this, $$0, $$1);
    }

    protected static void a(cgk $$0, boolean $$1, is $$2) {
        double $$5;
        ftm $$3 = $$0.dN();
        if ($$1) {
            double $$4 = Math.max(-0.9, $$3.h - 0.03);
        } else {
            $$5 = Math.min(1.8, $$3.h + 0.1);
        }
        $$0.m($$3.g, $$5, $$3.i);
        cgk.a($$0.aU, $$2);
    }

    protected static void a(dwo $$0, is $$1) {
        if ($$0 instanceof axf) {
            axf $$2 = (axf)$$0;
            for (int $$3 = 0; $$3 < 2; ++$$3) {
                $$2.a(ly.aq, (double)$$1.u() + $$0.y.j(), (double)($$1.v() + 1), (double)$$1.w() + $$0.y.j(), 1, 0.0, 0.0, 0.0, 1.0);
                $$2.a(ly.d, (double)$$1.u() + $$0.y.j(), (double)($$1.v() + 1), (double)$$1.w() + $$0.y.j(), 1, 0.0, 0.01, 0.0, 0.2);
            }
        }
    }

    public void m(boolean $$0) {
        cgk.a(this, $$0);
    }

    protected static void a(cgk $$0, boolean $$1) {
        double $$4;
        ftm $$2 = $$0.dN();
        if ($$1) {
            double $$3 = Math.max(-0.3, $$2.h - 0.03);
        } else {
            $$4 = Math.min(0.7, $$2.h + 0.06);
        }
        $$0.m($$2.g, $$4, $$2.i);
        $$0.l();
    }

    public boolean a(axf $$0, chl $$1, cex $$2) {
        return true;
    }

    public void cQ() {
        if (this.dN().b() > -0.5 && this.an > 1.0) {
            this.an = 1.0;
        }
    }

    public void l() {
        this.an = 0.0;
    }

    protected void k(double $$0, double $$1, double $$2) {
        is $$3 = is.a($$0, $$1, $$2);
        ftm $$4 = new ftm($$0 - (double)$$3.u(), $$1 - (double)$$3.v(), $$2 - (double)$$3.w());
        is.a $$5 = new is.a();
        iz $$6 = iz.b;
        double $$7 = Double.MAX_VALUE;
        for (iz $$8 : new iz[]{iz.c, iz.d, iz.e, iz.f, iz.b}) {
            double $$10;
            $$5.a((jy)$$3, $$8);
            if (this.ao().a_($$5).m(this.ao(), $$5)) continue;
            double $$9 = $$4.a($$8.o());
            double d2 = $$10 = $$8.f() == iz.b.a ? 1.0 - $$9 : $$9;
            if (!($$10 < $$7)) continue;
            $$7 = $$10;
            $$6 = $$8;
        }
        float $$11 = this.as.i() * 0.2f + 0.1f;
        float $$12 = $$6.f().a();
        ftm $$13 = this.dN().c(0.75);
        if ($$6.o() == iz.a.a) {
            this.m($$12 * $$11, $$13.h, $$13.i);
        } else if ($$6.o() == iz.a.b) {
            this.m($$13.g, $$12 * $$11, $$13.i);
        } else if ($$6.o() == iz.a.c) {
            this.m($$13.g, $$13.h, $$12 * $$11);
        }
    }

    public void a(eoh $$0, ftm $$1) {
        this.l();
        this.ai = $$1;
    }

    private static yh a(yh $$0) {
        yw $$1 = $$0.e().b($$0.a().a((yf)null));
        for (yh $$2 : $$0.c()) {
            $$1.b(cgk.a($$2));
        }
        return $$1;
    }

    @Override
    public yh ap() {
        yh $$0 = this.as();
        if ($$0 != null) {
            return cgk.a($$0);
        }
        return this.cR();
    }

    protected yh cR() {
        return this.aP.h();
    }

    public boolean v(cgk $$0) {
        return this == $$0;
    }

    public float cS() {
        return 0.0f;
    }

    public void r(float $$0) {
    }

    public void s(float $$0) {
    }

    public boolean cT() {
        return true;
    }

    public boolean w(cgk $$0) {
        return false;
    }

    public String toString() {
        String $$0;
        String string = $$0 = this.ao() == null ? "~NULL~" : this.ao().toString();
        if (this.bd != null) {
            return String.format(Locale.ROOT, "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f, removed=%s]", new Object[]{this.getClass().getSimpleName(), this.aq(), this.aR, $$0, this.dP(), this.dR(), this.dV(), this.bd});
        }
        return String.format(Locale.ROOT, "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]", this.getClass().getSimpleName(), this.aq(), this.aR, $$0, this.dP(), this.dR(), this.dV());
    }

    protected final boolean d(cex $$0) {
        return this.eh() || this.bu && !$$0.a(bdq.d) && !$$0.h() || $$0.a(bdq.i) && this.bx() || $$0.a(bdq.m) && this.ay().a(bdt.p);
    }

    public boolean cU() {
        return this.bu;
    }

    public void n(boolean $$0) {
        this.bu = $$0;
    }

    public void x(cgk $$0) {
        this.b($$0.dP(), $$0.dR(), $$0.dV(), $$0.ec(), $$0.ee());
    }

    public void y(cgk $$0) {
        try (bgp.j $$1 = new bgp.j(this.es(), b);){
            fnp $$2 = fnp.a($$1, $$0.eo());
            $$0.d($$2);
            this.d(fno.a((bgp)$$1, (jf.a)this.eo(), $$2.b()));
        }
        this.bt = $$0.bt;
        this.aG = $$0.aG;
    }

    /*
     * WARNING - void declaration
     */
    public @Nullable cgk b(fmb $$0) {
        void $$2;
        boolean $$4;
        block6: {
            block5: {
                dwo dwo2 = this.ao();
                if (!(dwo2 instanceof axf)) break block5;
                axf $$1 = (axf)dwo2;
                if (!this.eh()) break block6;
            }
            return null;
        }
        axf $$3 = $$0.b();
        boolean bl2 = $$4 = $$3.aq() != $$2.aq();
        if (!$$0.h()) {
            this.cf();
        }
        if ($$4) {
            return this.a((axf)$$2, $$3, $$0);
        }
        return this.a((axf)$$2, $$0);
    }

    private cgk a(axf $$0, fmb $$1) {
        for (cgk $$2 : this.dn()) {
            $$2.b(this.a($$1, $$2));
        }
        bzm $$3 = bzl.a();
        $$3.a("teleportSameDimension");
        this.a(chy.a($$1), $$1.i());
        if (!$$1.h()) {
            this.a($$1);
        }
        $$1.j().onTransition(this);
        $$3.c();
        return this;
    }

    private @Nullable cgk a(axf $$0, axf $$1, fmb $$2) {
        List<cgk> $$3 = this.dn();
        ArrayList<cgk> $$4 = new ArrayList<cgk>($$3.size());
        this.ce();
        for (cgk $$5 : $$3) {
            cgk $$6 = $$5.b(this.a($$2, $$5));
            if ($$6 == null) continue;
            $$4.add($$6);
        }
        bzm $$7 = bzl.a();
        $$7.a("teleportCrossDimension");
        Object $$8 = this.ay().a($$1, cgt.s);
        if ($$8 == null) {
            $$7.c();
            return null;
        }
        ((cgk)$$8).y(this);
        this.cV();
        ((cgk)$$8).a(chy.a(this), chy.a($$2), $$2.i());
        $$1.d((cgk)$$8);
        for (cgk $$9 : $$4) {
            $$9.a((cgk)$$8, true, false);
        }
        $$1.l();
        $$2.j().onTransition((cgk)$$8);
        this.a($$2, $$0);
        $$7.c();
        return $$8;
    }

    protected void a(fmb $$0, axf $$1) {
        List<axg> $$2 = List.copyOf($$1.E());
        for (axg $$3 : $$2) {
            if ($$3.N() != this) continue;
            $$3.a($$0);
            $$3.d((cgk)null);
        }
    }

    private fmb a(fmb $$0, cgk $$1) {
        float $$2 = $$0.e() + ($$0.i().contains((Object)chz.d) ? 0.0f : $$1.ec() - this.ec());
        float $$3 = $$0.f() + ($$0.i().contains((Object)chz.e) ? 0.0f : $$1.ee() - this.ee());
        ftm $$4 = $$1.dI().d(this.dI());
        ftm $$5 = $$0.c().b($$0.i().contains((Object)chz.a) ? 0.0 : $$4.a(), $$0.i().contains((Object)chz.b) ? 0.0 : $$4.b(), $$0.i().contains((Object)chz.c) ? 0.0 : $$4.c());
        return $$0.a($$5).a($$2, $$3).a();
    }

    private void a(fmb $$0) {
        chl $$1 = this.dl();
        for (cgk $$2 : this.dr()) {
            if (!($$2 instanceof axg)) continue;
            axg $$3 = (axg)$$2;
            if ($$1 != null && $$3.aA() == $$1.aA()) {
                $$3.g.b(aho.a(this.aA(), chy.a($$0), $$0.i(), this.bc));
                continue;
            }
            $$3.g.b(aho.a(this.aA(), chy.a(this), Set.of(), this.bc));
        }
    }

    public void a(chy $$0, Set<chz> $$1) {
        this.a(chy.a(this), $$0, $$1);
    }

    public void a(chy $$0, chy $$1, Set<chz> $$2) {
        chy $$3 = chy.a($$0, $$1, $$2);
        this.n($$3.a().g, $$3.a().h, $$3.a().i);
        this.v($$3.c());
        this.r($$3.c());
        this.w($$3.d());
        this.aH();
        this.bP();
        this.k($$3.b());
        this.aY();
    }

    public void a(float $$0, boolean $$1, float $$2, boolean $$3) {
        Set<chz> $$4 = chz.a($$1, $$3);
        chy $$5 = chy.a(this);
        chy $$6 = $$5.a($$0, $$2);
        chy $$7 = chy.a($$5, $$6, $$4);
        this.v($$7.c());
        this.r($$7.c());
        this.w($$7.d());
        this.bR();
    }

    public void f(is $$0) {
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$1 = (axf)dwo2;
            $$1.p().b(axm.m, new dvu($$0), 3);
        }
    }

    protected void cV() {
        Object object;
        this.c(cgk$e.e);
        cgk cgk2 = this;
        if (cgk2 instanceof chj) {
            chj $$0 = (chj)((Object)cgk2);
            $$0.r();
        }
        if ((object = this) instanceof fvx) {
            fvx $$1 = (fvx)object;
            object = this.aU;
            if (object instanceof axf) {
                axf $$2 = (axf)object;
                $$2.j().c($$1);
            }
        }
    }

    public ftm a(iz.a $$0, ber.a $$1) {
        return fma.a($$1, $$0, this.dI(), this.a(this.aF()));
    }

    public boolean o(boolean $$0) {
        return ($$0 || !this.cq()) && this.cb();
    }

    public boolean a(dwo $$0, dwo $$1) {
        if ($$0.aq() == dwo.j && $$1.aq() == dwo.h) {
            for (cgk $$2 : this.dn()) {
                if (!($$2 instanceof axg)) continue;
                axg $$3 = (axg)$$2;
                if ($$3.i) continue;
                return false;
            }
        }
        return true;
    }

    public float a(dwi $$0, dvt $$1, is $$2, eoh $$3, flb $$4, float $$5) {
        return $$5;
    }

    public boolean a(dwi $$0, dvt $$1, is $$2, eoh $$3, float $$4) {
        return true;
    }

    public int cW() {
        return 3;
    }

    public boolean m_() {
        return false;
    }

    public void a(n $$0) {
        $$0.a("Entity Type", () -> String.valueOf(cgu.a(this.ay())) + " (" + this.getClass().getCanonicalName() + ")");
        $$0.a("Entity ID", this.aR);
        $$0.a("Entity Name", () -> this.aq());
        $$0.a("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.dP(), this.dR(), this.dV()));
        $$0.a("Entity's Block location", n.a((dwq)this.ao(), bgj.c(this.dP()), bgj.c(this.dR()), bgj.c(this.dV())));
        ftm $$1 = this.dN();
        $$0.a("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", $$1.g, $$1.h, $$1.i));
        $$0.a("Entity's Passengers", () -> this.dn().toString());
        $$0.a("Entity's Vehicle", () -> String.valueOf(this.dz()));
    }

    public boolean cX() {
        return this.cp() && !this.au();
    }

    public void a(UUID $$0) {
        this.aH = $$0;
        this.aI = this.aH.toString();
    }

    @Override
    public UUID cY() {
        return this.aH;
    }

    public String cZ() {
        return this.aI;
    }

    @Override
    public String da() {
        return this.aI;
    }

    public boolean db() {
        return true;
    }

    public static double dc() {
        return aO;
    }

    public static void c(double $$0) {
        aO = $$0;
    }

    @Override
    public yh R_() {
        return fum.a(this.cI(), this.ap()).a($$0 -> $$0.a(this.di()).a(this.cZ()));
    }

    public void b(@Nullable yh $$0) {
        this.az.a(bm, Optional.ofNullable($$0));
    }

    @Override
    public @Nullable yh as() {
        return this.az.a(bm).orElse(null);
    }

    @Override
    public boolean i_() {
        return this.az.a(bm).isPresent();
    }

    public void p(boolean $$0) {
        this.az.a(bn, $$0);
    }

    public boolean dd() {
        return this.az.a(bn);
    }

    public boolean a(axf $$0, double $$1, double $$2, double $$3, Set<chz> $$4, float $$5, float $$6, boolean $$7) {
        cgk $$8 = this.b(new fmb($$0, new ftm($$1, $$2, $$3), ftm.c, $$5, $$6, $$4, fmb.a));
        return $$8 != null;
    }

    public void l(double $$0, double $$1, double $$2) {
        this.b($$0, $$1, $$2);
    }

    public void b(double $$0, double $$1, double $$2) {
        if (!(this.ao() instanceof axf)) {
            return;
        }
        this.b($$0, $$1, $$2, this.ec(), this.ee());
        this.D();
    }

    private void D() {
        this.dp().forEach($$0 -> {
            for (cgk $$1 : $$0.aS) {
                $$0.a($$1, cgk::d);
            }
        });
    }

    public void c(double $$0, double $$1, double $$2) {
        this.b(this.dP() + $$0, this.dR() + $$1, this.dV() + $$2);
    }

    public boolean de() {
        return this.dd();
    }

    @Override
    public void a(List<ama.c<?>> $$0) {
    }

    @Override
    public void a(alw<?> $$0) {
        if (aE.equals($$0)) {
            this.j_();
        }
    }

    @Deprecated
    protected void df() {
        cgn $$1;
        chx $$0 = this.aF();
        this.bz = $$1 = this.a($$0);
        this.bA = $$1.c();
    }

    public void j_() {
        boolean $$3;
        cgn $$2;
        cgn $$0 = this.bz;
        chx $$1 = this.aF();
        this.bz = $$2 = this.a($$1);
        this.bA = $$2.c();
        this.aH();
        boolean bl2 = $$3 = $$2.a() <= 4.0f && $$2.b() <= 4.0f;
        if (!(this.aU.B_() || this.ay || this.ar || !$$3 || !($$2.a() > $$0.a()) && !($$2.b() > $$0.b()) || this instanceof ddm)) {
            this.a($$0);
        }
    }

    public boolean a(cgn $$0) {
        fug $$7;
        Optional<ftm> $$8;
        double $$4;
        double $$3;
        cgn $$1 = this.a(this.aF());
        ftm $$2 = this.dI().b(0.0, (double)$$0.b() / 2.0, 0.0);
        fug $$5 = fud.a(fth.a($$2, $$3 = (double)Math.max(0.0f, $$1.a() - $$0.a()) + 1.0E-6, $$4 = (double)Math.max(0.0f, $$1.b() - $$0.b()) + 1.0E-6, $$3));
        Optional<ftm> $$6 = this.aU.a(this, $$5, $$2, (double)$$1.a(), (double)$$1.b(), (double)$$1.a());
        if ($$6.isPresent()) {
            this.b($$6.get().b(0.0, (double)(-$$1.b()) / 2.0, 0.0));
            return true;
        }
        if ($$1.a() > $$0.a() && $$1.b() > $$0.b() && ($$8 = this.aU.a(this, $$7 = fud.a(fth.a($$2, $$3, 1.0E-6, $$3)), $$2, (double)$$1.a(), (double)$$0.b(), (double)$$1.a())).isPresent()) {
            this.b($$8.get().b(0.0, (double)(-$$0.b()) / 2.0 + 1.0E-6, 0.0));
            return true;
        }
        return false;
    }

    public iz dg() {
        return iz.a(this.ec());
    }

    public iz dh() {
        return this.dg();
    }

    protected yo di() {
        return new yo.c(new yo.b(this.ay(), this.cY(), this.ap()));
    }

    public boolean a(axg $$0) {
        return true;
    }

    @Override
    public final fth dj() {
        return this.bb;
    }

    public final void a(fth $$0) {
        this.bb = $$0;
    }

    public final float e(chx $$0) {
        return this.a($$0).c();
    }

    public final float dk() {
        return this.bA;
    }

    @Override
    public @Nullable cic a_(int $$0) {
        return null;
    }

    public cdc a(ddm $$0, ftm $$1, cdb $$2) {
        return cdc.e;
    }

    public boolean a(dwi $$0) {
        return false;
    }

    public void d(axg $$0) {
    }

    public void e(axg $$0) {
    }

    public float a(egm $$0) {
        float $$1 = bgj.f(this.ec());
        return switch ($$0) {
            case egm.c -> $$1 + 180.0f;
            case egm.d -> $$1 + 270.0f;
            case egm.b -> $$1 + 90.0f;
            default -> $$1;
        };
    }

    public float a(eev $$0) {
        float $$1 = bgj.f(this.ec());
        return switch ($$0) {
            case eev.c -> -$$1;
            case eev.b -> 180.0f - $$1;
            default -> $$1;
        };
    }

    public ded a(dec $$0) {
        return this.ay().a(bdt.s) ? ded.b : ded.a;
    }

    public @Nullable chl dl() {
        return null;
    }

    public final boolean dm() {
        return this.dl() != null;
    }

    public final List<cgk> dn() {
        return this.aS;
    }

    public @Nullable cgk do() {
        return this.aS.isEmpty() ? null : (cgk)this.aS.get(0);
    }

    public boolean z(cgk $$0) {
        return this.aS.contains((Object)$$0);
    }

    public boolean a(Predicate<cgk> $$0) {
        for (cgk $$1 : this.aS) {
            if (!$$0.test($$1)) continue;
            return true;
        }
        return false;
    }

    private Stream<cgk> E() {
        return this.aS.stream().flatMap(cgk::dp);
    }

    public Stream<cgk> dp() {
        return Stream.concat(Stream.of(this), this.E());
    }

    public Stream<cgk> dq() {
        return Stream.concat(this.aS.stream().flatMap(cgk::dq), Stream.of(this));
    }

    public Iterable<cgk> dr() {
        return () -> this.E().iterator();
    }

    public int ds() {
        return (int)this.E().filter($$0 -> $$0 instanceof ddm).count();
    }

    public boolean dt() {
        return this.ds() == 1;
    }

    public cgk du() {
        cgk $$0 = this;
        while ($$0.cq()) {
            $$0 = $$0.dz();
        }
        return $$0;
    }

    public boolean A(cgk $$0) {
        return this.du() == $$0.du();
    }

    public boolean B(cgk $$0) {
        if (!$$0.cq()) {
            return false;
        }
        cgk $$1 = $$0.dz();
        if ($$1 == this) {
            return true;
        }
        return this.B($$1);
    }

    public final boolean dv() {
        if (this.aU.B_()) {
            return this.dw();
        }
        return !this.aa_();
    }

    protected boolean dw() {
        chl $$0 = this.dl();
        return $$0 != null && $$0.dw();
    }

    public boolean aa_() {
        chl $$0 = this.dl();
        return $$0 != null && $$0.aa_();
    }

    public boolean dx() {
        return this.dv();
    }

    public boolean dy() {
        return this.dv();
    }

    protected static ftm a(double $$0, double $$1, float $$2) {
        double $$3 = ($$0 + $$1 + (double)1.0E-5f) / 2.0;
        float $$4 = -bgj.a((double)($$2 * ((float)Math.PI / 180)));
        float $$5 = bgj.b((double)($$2 * ((float)Math.PI / 180)));
        float $$6 = Math.max(Math.abs($$4), Math.abs($$5));
        return new ftm((double)$$4 * $$3 / (double)$$6, 0.0, (double)$$5 * $$3 / (double)$$6);
    }

    public ftm b(chl $$0) {
        return new ftm(this.dP(), this.dj().e, this.dV());
    }

    public @Nullable cgk dz() {
        return this.aT;
    }

    public @Nullable cgk dA() {
        return this.aT != null && this.aT.dl() == this ? this.aT : null;
    }

    public flg n_() {
        return flg.a;
    }

    public bdb dB() {
        return bdb.g;
    }

    protected int dC() {
        return 0;
    }

    public ed d(axf $$0) {
        return new ed(ec.a, this.dI(), this.cl(), $$0, bbn.g, this.aq(), this.R_(), $$0.s(), this);
    }

    public void a(ep.a $$0, ftm $$1) {
        ftm $$2 = $$0.a(this);
        double $$3 = $$1.g - $$2.g;
        double $$4 = $$1.h - $$2.h;
        double $$5 = $$1.i - $$2.i;
        double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
        this.w(bgj.f((float)(-(bgj.d($$4, $$6) * 57.2957763671875))));
        this.v(bgj.f((float)(bgj.d($$5, $$3) * 57.2957763671875) - 90.0f));
        this.r(this.ec());
        this.ac = this.ee();
        this.ab = this.ec();
    }

    public float t(float $$0) {
        return bgj.h($$0, this.ab, this.aZ);
    }

    public boolean a(bef<fla> $$0, double $$1) {
        if (this.dD()) {
            return false;
        }
        fth $$2 = this.dj().h(0.001);
        int $$3 = bgj.c($$2.a);
        int $$4 = bgj.e($$2.d);
        int $$5 = bgj.c($$2.b);
        int $$6 = bgj.e($$2.e);
        int $$7 = bgj.c($$2.c);
        int $$8 = bgj.e($$2.f);
        double $$9 = 0.0;
        boolean $$10 = this.db();
        boolean $$11 = false;
        ftm $$12 = ftm.c;
        int $$13 = 0;
        is.a $$14 = new is.a();
        for (int $$15 = $$3; $$15 < $$4; ++$$15) {
            for (int $$16 = $$5; $$16 < $$6; ++$$16) {
                for (int $$17 = $$7; $$17 < $$8; ++$$17) {
                    double $$19;
                    $$14.d($$15, $$16, $$17);
                    flb $$18 = this.ao().b_($$14);
                    if (!$$18.a($$0) || !(($$19 = (double)((float)$$16 + $$18.a(this.ao(), $$14))) >= $$2.b)) continue;
                    $$11 = true;
                    $$9 = Math.max($$19 - $$2.b, $$9);
                    if (!$$10) continue;
                    ftm $$20 = $$18.c(this.ao(), $$14);
                    if ($$9 < 0.4) {
                        $$20 = $$20.c($$9);
                    }
                    $$12 = $$12.e($$20);
                    ++$$13;
                }
            }
        }
        if ($$12.g() > 0.0) {
            if ($$13 > 0) {
                $$12 = $$12.c(1.0 / (double)$$13);
            }
            if (!(this instanceof ddm)) {
                $$12 = $$12.d();
            }
            ftm $$21 = this.dN();
            $$12 = $$12.c($$1);
            double $$22 = 0.003;
            if (Math.abs($$21.g) < 0.003 && Math.abs($$21.i) < 0.003 && $$12.g() < 0.0045000000000000005) {
                $$12 = $$12.d().c(0.0045000000000000005);
            }
            this.k(this.dN().e($$12));
        }
        this.av.put($$0, $$9);
        return $$11;
    }

    public boolean dD() {
        fth $$0 = this.dj().g(1.0);
        int $$1 = bgj.c($$0.a);
        int $$2 = bgj.e($$0.d);
        int $$3 = bgj.c($$0.c);
        int $$4 = bgj.e($$0.f);
        return !this.ao().b($$1, $$3, $$2, $$4);
    }

    public double b(bef<fla> $$0) {
        return this.av.getDouble($$0);
    }

    public double dE() {
        return (double)this.dk() < 0.4 ? 0.0 : 0.4;
    }

    public final float dF() {
        return this.bz.a();
    }

    public final float dG() {
        return this.bz.b();
    }

    public aay<adb> a(axd $$0) {
        return new adc(this, $$0);
    }

    public cgn a(chx $$0) {
        return this.aP.n();
    }

    public final cgm dH() {
        return this.bz.d();
    }

    @Override
    public ftm dI() {
        return this.aV;
    }

    public ftm dJ() {
        return this.dI();
    }

    @Override
    public is dK() {
        return this.aW;
    }

    public eoh dL() {
        if (this.bH == null) {
            this.bH = this.ao().a_(this.dK());
        }
        return this.bH;
    }

    public dvu dM() {
        return this.aX;
    }

    public ftm dN() {
        return this.aY;
    }

    public void k(ftm $$0) {
        if ($$0.n()) {
            this.aY = $$0;
        }
    }

    public void l(ftm $$0) {
        if ($$0.n()) {
            this.k(this.dN().e($$0));
        }
    }

    public void m(double $$0, double $$1, double $$2) {
        this.k(new ftm($$0, $$1, $$2));
    }

    public final int dO() {
        return this.aW.u();
    }

    public final double dP() {
        return this.aV.g;
    }

    public double d(double $$0) {
        return this.aV.g + (double)this.dF() * $$0;
    }

    public double e(double $$0) {
        return this.d((2.0 * this.as.j() - 1.0) * $$0);
    }

    public final int dQ() {
        return this.aW.v();
    }

    public final double dR() {
        return this.aV.h;
    }

    public double f(double $$0) {
        return this.aV.h + (double)this.dG() * $$0;
    }

    public double dS() {
        return this.f(this.as.j());
    }

    public double dT() {
        return this.aV.h + (double)this.bA;
    }

    public final int dU() {
        return this.aW.w();
    }

    public final double dV() {
        return this.aV.i;
    }

    public double g(double $$0) {
        return this.aV.i + (double)this.dF() * $$0;
    }

    public double h(double $$0) {
        return this.g((2.0 * this.as.j() - 1.0) * $$0);
    }

    public final void n(double $$0, double $$1, double $$2) {
        if (this.aV.g != $$0 || this.aV.h != $$1 || this.aV.i != $$2) {
            dwo dwo2;
            this.aV = new ftm($$0, $$1, $$2);
            int $$3 = bgj.c($$0);
            int $$4 = bgj.c($$1);
            int $$5 = bgj.c($$2);
            if ($$3 != this.aW.u() || $$4 != this.aW.v() || $$5 != this.aW.w()) {
                this.aW = new is($$3, $$4, $$5);
                this.bH = null;
                if (jw.a($$3) != this.aX.h || jw.a($$5) != this.aX.i) {
                    this.aX = new dvu(this.aW);
                }
            }
            this.br.a();
            if (!this.ay && (dwo2 = this.aU) instanceof axf) {
                axf $$6 = (axf)dwo2;
                if (!this.eh()) {
                    axg $$8;
                    fvx $$7;
                    cgk cgk2 = this;
                    if (cgk2 instanceof fvx && ($$7 = (fvx)((Object)cgk2)).gx()) {
                        $$6.j().b($$7);
                    }
                    if ((cgk2 = this) instanceof axg && ($$8 = (axg)cgk2).o() && $$8.g != null) {
                        $$6.j().b($$8);
                    }
                }
            }
        }
    }

    public void dW() {
    }

    public ftm[] dX() {
        return chj.a(this, 0.0, 0.5, 0.5, 0.0);
    }

    public boolean dY() {
        return false;
    }

    public void a(chj $$0) {
    }

    public void b(chj $$0) {
    }

    public ftm u(float $$0) {
        return this.p($$0).b(0.0, (double)this.bA * 0.7, 0.0);
    }

    public void a(adc $$0) {
        int $$1 = $$0.b();
        double $$2 = $$0.g();
        double $$3 = $$0.h();
        double $$4 = $$0.i();
        this.e($$2, $$3, $$4);
        this.b($$2, $$3, $$4, $$0.l(), $$0.k());
        this.e($$1);
        this.a($$0.e());
        this.k($$0.j());
    }

    public @Nullable dlt dZ() {
        return null;
    }

    public void q(boolean $$0) {
        this.aJ = $$0;
    }

    public boolean ea() {
        return !this.ay().a(bdt.l);
    }

    public boolean eb() {
        return this.cM() > 0;
    }

    public float ec() {
        return this.aZ;
    }

    @Override
    public float ed() {
        return this.ec();
    }

    public void v(float $$0) {
        if (!Float.isFinite($$0)) {
            bhs.b("Invalid entity rotation: " + $$0 + ", discarding.");
            return;
        }
        this.aZ = $$0;
    }

    public float ee() {
        return this.ba;
    }

    public void w(float $$0) {
        if (!Float.isFinite($$0)) {
            bhs.b("Invalid entity rotation: " + $$0 + ", discarding.");
            return;
        }
        this.ba = Math.clamp($$0 % 360.0f, -90.0f, 90.0f);
    }

    public boolean ef() {
        return false;
    }

    public float eg() {
        return 0.0f;
    }

    public void a(@Nullable cgk $$0) {
    }

    @Override
    public final boolean eh() {
        return this.bd != null;
    }

    public @Nullable e ei() {
        return this.bd;
    }

    @Override
    public final void c(e $$0) {
        if (this.bd == null) {
            this.bd = $$0;
        }
        if (this.bd.a()) {
            this.cf();
        }
        this.dn().forEach(cgk::cf);
        this.br.a($$0);
        this.b($$0);
    }

    protected void ej() {
        this.bd = null;
    }

    @Override
    public void a(esq $$0) {
        this.br = $$0;
    }

    @Override
    public boolean ek() {
        if (this.bd != null && !this.bd.b()) {
            return false;
        }
        if (this.cq()) {
            return false;
        }
        return !this.cr() || !this.dt();
    }

    @Override
    public boolean el() {
        return false;
    }

    public boolean c(axf $$0, is $$1) {
        return true;
    }

    public boolean em() {
        return false;
    }

    @Override
    public dwo ao() {
        return this.aU;
    }

    protected void a(dwo $$0) {
        this.aU = $$0;
    }

    public cey en() {
        return this.ao().as();
    }

    public jr eo() {
        return this.ao().J_();
    }

    protected void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
        double $$6 = 1.0 / (double)$$0;
        double $$7 = bgj.d($$6, this.dP(), $$1);
        double $$8 = bgj.d($$6, this.dR(), $$2);
        double $$9 = bgj.d($$6, this.dV(), $$3);
        float $$10 = (float)bgj.e($$6, (double)this.ec(), $$4);
        float $$11 = (float)bgj.d($$6, (double)this.ee(), $$5);
        this.a_($$7, $$8, $$9);
        this.a($$10, $$11);
    }

    public bgr ep() {
        return this.as;
    }

    public ftm ag() {
        chl chl2 = this.dl();
        if (chl2 instanceof ddm) {
            ddm $$0 = (ddm)chl2;
            if (this.cb()) {
                return $$0.ag();
            }
        }
        return this.dN();
    }

    public ftm ah() {
        chl chl2 = this.dl();
        if (chl2 instanceof ddm) {
            ddm $$0 = (ddm)chl2;
            if (this.cb()) {
                return $$0.ah();
            }
        }
        return this.bF;
    }

    public @Nullable dlt eq() {
        return null;
    }

    public Optional<amt<fof>> er() {
        return this.aP.j();
    }

    protected void a(kd $$0) {
        this.a($$0, ki.h);
        this.a($$0, ki.b);
    }

    public final void c(dlt $$0) {
        this.a($$0.a());
    }

    @Override
    public <T> @Nullable T a(kh<? extends T> $$0) {
        if ($$0 == ki.h) {
            return cgk.c($$0, this.as());
        }
        if ($$0 == ki.b) {
            return cgk.c($$0, this.bM);
        }
        return null;
    }

    @Contract(value="_,!null->!null;_,_->_")
    protected static <T> @Nullable T c(kh<T> $$0, @Nullable Object $$1) {
        return (T)$$1;
    }

    public <T> void d(kh<T> $$0, T $$1) {
        this.b($$0, $$1);
    }

    protected <T> boolean b(kh<T> $$0, T $$1) {
        if ($$0 == ki.h) {
            this.b(cgk.c(ki.h, $$1));
            return true;
        }
        if ($$0 == ki.b) {
            this.bM = cgk.c(ki.b, $$1);
            return true;
        }
        return false;
    }

    protected <T> boolean a(kd $$0, kh<T> $$1) {
        T $$2 = $$0.a($$1);
        if ($$2 != null) {
            return this.b($$1, $$2);
        }
        return false;
    }

    public bgp.f es() {
        return new a(this);
    }

    @Override
    public void a(axf $$0, bxh.a $$1) {
    }

    public static final class e
    extends Enum<e> {
        public static final /* enum */ e a = new e(true, false);
        public static final /* enum */ e b = new e(true, false);
        public static final /* enum */ e c = new e(false, true);
        public static final /* enum */ e d = new e(false, false);
        public static final /* enum */ e e = new e(false, false);
        private final boolean f;
        private final boolean g;
        private static final /* synthetic */ e[] h;

        public static e[] values() {
            return (e[])h.clone();
        }

        public static e valueOf(String $$0) {
            return Enum.valueOf(e.class, $$0);
        }

        private e(boolean $$0, boolean $$1) {
            this.f = $$0;
            this.g = $$1;
        }

        public boolean a() {
            return this.f;
        }

        public boolean b() {
            return this.g;
        }

        private static /* synthetic */ e[] c() {
            return new e[]{a, b, c, d, e};
        }

        static {
            h = cgk$e.c();
        }
    }

    static final class c
    extends Record {
        final ftm a;
        final ftm b;
        private final Optional<ftm> c;

        public c(ftm $$0, ftm $$1, ftm $$2) {
            this($$0, $$1, Optional.of($$2));
        }

        public c(ftm $$0, ftm $$1) {
            this($$0, $$1, Optional.empty());
        }

        private c(ftm $$0, ftm $$1, Optional<ftm> $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "from;to;axisDependentOriginalMovement", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "from;to;axisDependentOriginalMovement", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "from;to;axisDependentOriginalMovement", "a", "b", "c"}, this, $$0);
        }

        public ftm a() {
            return this.a;
        }

        public ftm b() {
            return this.b;
        }

        public Optional<ftm> c() {
            return this.c;
        }
    }

    public static final class d
    extends Enum<d> {
        public static final /* enum */ d a = new d(false, false);
        public static final /* enum */ d b = new d(true, false);
        public static final /* enum */ d c = new d(false, true);
        public static final /* enum */ d d = new d(true, true);
        final boolean e;
        final boolean f;
        private static final /* synthetic */ d[] g;

        public static d[] values() {
            return (d[])g.clone();
        }

        public static d valueOf(String $$0) {
            return Enum.valueOf(d.class, $$0);
        }

        private d(boolean $$0, boolean $$1) {
            this.e = $$0;
            this.f = $$1;
        }

        public boolean a() {
            return this.f || this.e;
        }

        public boolean b() {
            return this.f;
        }

        public boolean c() {
            return this.e;
        }

        private static /* synthetic */ d[] d() {
            return new d[]{a, b, c, d};
        }

        static {
            g = cgk$d.d();
        }
    }

    @FunctionalInterface
    public static interface b {
        public void accept(cgk var1, double var2, double var4, double var6);
    }

    record a(cgk a) implements bgp.f
    {
        @Override
        public String get() {
            return this.a.toString();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "entity", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "entity", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "entity", "a"}, this, $$0);
        }
    }
}

