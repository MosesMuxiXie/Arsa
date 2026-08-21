/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.base.Objects
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JavaOps
 *  it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair
 *  it.unimi.dsi.fastutil.objects.Object2LongMap
 *  it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectMap
 *  org.jetbrains.annotations.Contract
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JavaOps;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import it.unimi.dsi.fastutil.objects.Object2LongMap;
import it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import org.jetbrains.annotations.Contract;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public abstract class chl
extends cgk
implements cgb,
fvx {
    private static final Logger a = LogUtils.getLogger();
    private static final String b = "active_effects";
    public static final String u = "attributes";
    public static final String aN = "sleeping_pos";
    public static final String aO = "equipment";
    public static final String aP = "Brain";
    public static final String aQ = "FallFlying";
    public static final String aR = "HurtTime";
    public static final String aS = "DeathTime";
    public static final String aT = "HurtByTimestamp";
    public static final String aU = "Health";
    private static final amo c = amo.b("powder_snow");
    private static final amo d = amo.b("sprinting");
    private static final ciq e = new ciq(d, 0.3f, ciq.a.c);
    public static final int aV = 98;
    public static final int aW = 100;
    public static final int aX = 105;
    public static final int aY = 106;
    public static final int aZ = 100;
    private static final int r = 40;
    public static final double ba = 0.003;
    public static final double bb = 0.08;
    public static final int bc = 20;
    protected static final float bd = 0.98f;
    private static final int s = 10;
    private static final int t = 2;
    public static final float be = 0.42f;
    protected static final float bf = 0.4f;
    protected static final int bg = 20;
    private static final double cc = 128.0;
    protected static final int bh = 1;
    protected static final int bi = 2;
    protected static final int bj = 4;
    protected static final alw<Byte> bk = ama.a(chl.class, aly.a);
    private static final alw<Float> cd = ama.a(chl.class, aly.d);
    private static final alw<List<lw>> ce = ama.a(chl.class, aly.m);
    private static final alw<Boolean> cf = ama.a(chl.class, aly.k);
    private static final alw<Integer> cg = ama.a(chl.class, aly.b);
    private static final alw<Integer> ch = ama.a(chl.class, aly.b);
    private static final alw<Optional<is>> ci = ama.a(chl.class, aly.p);
    private static final int cj = 15;
    protected static final cgn bl = cgn.c(0.2f, 0.2f).b(0.2f);
    public static final float bm = 0.5f;
    public static final float bn = 0.5f;
    private static final float ck = 0.04f;
    public static final Predicate<chl> bo = $$0 -> {
        void $$2;
        if (!($$0 instanceof ddm)) {
            return true;
        }
        ddm $$1 = (ddm)$$0;
        dlt $$3 = $$2.a(cgv.f);
        return !$$3.a(bdy.cP);
    };
    private static final Dynamic<?> cl = new Dynamic((DynamicOps)JavaOps.INSTANCE, Map.of("memories", Map.of()));
    private final cip cm;
    private final ceu cn = new ceu(this);
    private final Map<jd<cfk>, cfm> co = Maps.newHashMap();
    private final Map<cgv, dlt> cp = bhs.a(cgv.class, (K $$0) -> dlt.l);
    public boolean bp;
    private boolean cq = false;
    public cdb bq;
    public int br;
    public int bs;
    public int bt;
    public int bu;
    public int bv;
    public int bw;
    public float bx;
    public float by;
    protected int bz;
    protected int bA;
    public final cil bB = new cil();
    public float bC;
    public float bD;
    public float bE;
    public float bF;
    public final cgj bG = new cgj(this);
    protected @Nullable cgr<ddm> bH;
    protected int bI;
    protected boolean bJ;
    protected int bK;
    protected float bL;
    protected boolean bM;
    public float bN;
    public float bO;
    public float bP;
    protected chf bQ = new chf(this);
    protected double bR;
    protected int bS;
    private boolean cr = true;
    private @Nullable cgr<chl> cs;
    private int ct;
    private @Nullable chl cu;
    private int cv;
    private float cw;
    private int cx;
    private float cy;
    protected dlt bT = dlt.l;
    protected int bU;
    protected int bV;
    private long cz = Integer.MIN_VALUE;
    private is cA;
    private Optional<is> cB = Optional.empty();
    private @Nullable cex cC;
    private long cD;
    protected int bW;
    protected float bX;
    protected @Nullable dlt bY;
    protected @Nullable Object2LongMap<cgk> bZ;
    private float cE;
    private float cF;
    protected cim<?> ca;
    private boolean cG;
    private final EnumMap<cgv, Reference2ObjectMap<dso, Set<dti>>> cH = new EnumMap(cgv.class);
    protected final cgo cb;
    private fvt.a cI = new fvt.a();

    protected chl(cgu<? extends chl> $$02, dwo $$1) {
        super($$02, $$1);
        this.cm = new cip(cit.a($$02));
        this.x(this.fq());
        this.cb = this.eu();
        this.W = true;
        this.aH();
        this.v(this.as.i() * ((float)Math.PI * 2));
        this.bE = this.ec();
        this.ca = this.a(cl);
    }

    @Override
    public @Nullable chl et() {
        return this;
    }

    @Contract(pure=true)
    protected cgo eu() {
        return new cgo();
    }

    public cim<?> ev() {
        return this.ca;
    }

    protected cim.b<?> ew() {
        return cim.a(ImmutableList.of(), ImmutableList.of());
    }

    protected cim<?> a(Dynamic<?> $$0) {
        return this.ew().a($$0);
    }

    @Override
    public void c(axf $$0) {
        this.a($$0, this.en().y(), Float.MAX_VALUE);
    }

    public boolean a(cgu<?> $$0) {
        return true;
    }

    @Override
    protected void a(ama.a $$0) {
        $$0.a(bk, (byte)0);
        $$0.a(ce, List.of());
        $$0.a(cf, false);
        $$0.a(cg, 0);
        $$0.a(ch, 0);
        $$0.a(cd, Float.valueOf(1.0f));
        $$0.a(ci, Optional.empty());
    }

    public static cir.a ex() {
        return cir.a().a(cis.u).a(cis.r).a(cis.x).a(cis.b).a(cis.c).a(cis.t).a(cis.D).a(cis.A).a(cis.p).a(cis.z).a(cis.m).a(cis.q).a(cis.y).a(cis.i).a(cis.k).a(cis.H).a(cis.w).a(cis.e).a(cis.j).a(cis.I);
    }

    @Override
    protected void a(double $$0, boolean $$1, eoh $$2, is $$3) {
        dwo dwo2;
        if (!this.by()) {
            this.bH();
        }
        if ((dwo2 = this.ao()) instanceof axf) {
            axf $$4 = (axf)dwo2;
            if ($$1 && this.an > 0.0) {
                this.b($$4, $$3);
                double $$5 = Math.max(0, bgj.c(this.i(this.an)));
                if ($$5 > 0.0 && !$$2.l()) {
                    double $$6 = this.dP();
                    double $$7 = this.dR();
                    double $$8 = this.dV();
                    is $$9 = this.dK();
                    if ($$3.u() != $$9.u() || $$3.w() != $$9.w()) {
                        double $$10 = $$6 - (double)$$3.u() - 0.5;
                        double $$11 = $$8 - (double)$$3.w() - 0.5;
                        double $$12 = Math.max(Math.abs($$10), Math.abs($$11));
                        $$6 = (double)$$3.u() + 0.5 + $$10 / $$12 * 0.5;
                        $$8 = (double)$$3.w() + 0.5 + $$11 / $$12 * 0.5;
                    }
                    double $$13 = Math.min((double)0.2f + $$5 / 15.0, 2.5);
                    int $$14 = (int)(150.0 * $$13);
                    $$4.a(new lp(ly.b, $$2), $$6, $$7, $$8, $$14, 0.0, 0.0, 0.0, (double)0.15f);
                }
            }
        }
        super.a($$0, $$1, $$2, $$3);
        if ($$1) {
            this.cB = Optional.empty();
        }
    }

    public boolean ey() {
        return this.ay().a(bdt.n);
    }

    public float b(float $$0) {
        return bgj.h($$0, this.cF, this.cE);
    }

    public boolean ez() {
        return this.dN().b() < (double)1.0E-5f && this.bB();
    }

    @Override
    public void aJ() {
        chl $$8;
        dwo dwo2;
        dwo dwo3;
        this.bx = this.by;
        if (this.ay) {
            this.gp().ifPresent(this::a);
        }
        if ((dwo3 = this.ao()) instanceof axf) {
            axf $$0 = (axf)dwo3;
            dsq.b($$0, this);
        }
        super.aJ();
        bzm $$1 = bzl.a();
        $$1.a("livingEntityBaseTick");
        if (this.cb() && (dwo2 = this.ao()) instanceof axf) {
            double $$5;
            double $$4;
            axf $$2 = (axf)dwo2;
            boolean $$3 = this instanceof ddm;
            if (this.cc()) {
                this.a($$2, this.en().g(), 1.0f);
            } else if ($$3 && !$$2.w().a(this.dj()) && ($$4 = $$2.w().a(this) + $$2.w().o()) < 0.0 && ($$5 = $$2.w().p()) > 0.0) {
                this.a($$2, this.en().x(), (float)Math.max(1, bgj.c(-$$4 * $$5)));
            }
            if (((cgk)this).a(bdv.a) && !$$2.a_(is.a(this.dP(), this.dT(), this.dV())).a(dzs.oa)) {
                boolean $$6;
                boolean bl2 = $$6 = !this.ey() && !cfn.c(this) && (!$$3 || !((ddm)this).gL().a);
                if ($$6) {
                    this.j(this.l(this.cK()));
                    if (this.eA()) {
                        this.j(0);
                        $$2.a((cgk)this, (byte)67);
                        this.a($$2, this.en().i(), 2.0f);
                    }
                } else if (this.cK() < this.cJ() && cfn.d(this)) {
                    this.j(this.m(this.cK()));
                }
                if (this.cq() && this.dz() != null && this.dz().cs()) {
                    this.cf();
                }
            } else if (this.cK() < this.cJ()) {
                this.j(this.m(this.cK()));
            }
            is $$7 = this.dK();
            if (!Objects.equal((Object)this.cA, (Object)$$7)) {
                this.cA = $$7;
                this.b($$2, $$7);
            }
        }
        if (this.bu > 0) {
            --this.bu;
        }
        if (this.ax > 0 && !(this instanceof axg)) {
            --this.ax;
        }
        if (this.fa() && this.ao().h(this)) {
            this.eH();
        }
        if (this.bI > 0) {
            --this.bI;
        } else {
            this.bH = null;
        }
        if (this.cu != null && !this.cu.cb()) {
            this.cu = null;
        }
        if (($$8 = this.eK()) != null) {
            if (!$$8.cb()) {
                this.a((chl)null);
            } else if (this.at - this.ct > 100) {
                this.a((chl)null);
            }
        }
        this.eR();
        this.bF = this.bE;
        this.bD = this.bC;
        this.ab = this.ec();
        this.ac = this.ee();
        $$1.c();
    }

    protected boolean eA() {
        return this.cK() <= -20;
    }

    @Override
    protected float bi() {
        return bgj.h((float)this.i(cis.w), super.bi(), 1.0f);
    }

    public float eB() {
        return 0.0f;
    }

    protected void eC() {
        cio $$0 = this.h(cis.x);
        if ($$0 == null) {
            return;
        }
        if ($$0.a(c) != null) {
            $$0.c(c);
        }
    }

    protected void eD() {
        int $$0;
        if (!this.bJ().l() && ($$0 = this.cM()) > 0) {
            cio $$1 = this.h(cis.x);
            if ($$1 == null) {
                return;
            }
            float $$2 = -0.05f * this.cN();
            $$1.b(new ciq(c, $$2, ciq.a.a));
        }
    }

    protected void b(axf $$0, is $$1) {
        dsq.a($$0, this);
    }

    public boolean e_() {
        return false;
    }

    public float eE() {
        return this.e_() ? 0.5f : 1.0f;
    }

    public final float eF() {
        cip $$0 = this.fw();
        if ($$0 == null) {
            return 1.0f;
        }
        return this.c((float)$$0.c(cis.A));
    }

    protected float c(float $$0) {
        return $$0;
    }

    public boolean eG() {
        return true;
    }

    protected void eH() {
        ++this.bw;
        if (this.bw >= 20 && !this.ao().B_() && !this.eh()) {
            this.ao().a((cgk)this, (byte)60);
            this.a(cgk.e.a);
        }
    }

    public boolean eI() {
        return !this.e_();
    }

    protected boolean e(axf $$0) {
        return !this.e_() && $$0.U().a(eua.D) != false;
    }

    protected int l(int $$0) {
        double $$3;
        cio $$1 = this.h(cis.y);
        if ($$1 != null) {
            double $$2 = $$1.g();
        } else {
            $$3 = 0.0;
        }
        if ($$3 > 0.0 && this.as.j() >= 1.0 / ($$3 + 1.0)) {
            return $$0;
        }
        return $$0 - 1;
    }

    protected int m(int $$0) {
        return Math.min($$0 + 4, this.cJ());
    }

    public final int a(axf $$0, @Nullable cgk $$1) {
        return dsq.a($$0, $$1, (cgk)this, this.f($$0));
    }

    protected int f(axf $$0) {
        return 0;
    }

    protected boolean eJ() {
        return false;
    }

    public @Nullable chl eK() {
        return cgr.b(this.cs, this.ao());
    }

    public @Nullable ddm eL() {
        return cgr.c(this.bH, this.ao());
    }

    @Override
    public chl f_() {
        return this.eK();
    }

    public int eM() {
        return this.ct;
    }

    public void a(ddm $$0, int $$1) {
        this.a(cgr.a($$0), $$1);
    }

    public void a(UUID $$0, int $$1) {
        this.a(cgr.a($$0), $$1);
    }

    private void a(cgr<ddm> $$0, int $$1) {
        this.bH = $$0;
        this.bI = $$1;
    }

    public void a(@Nullable chl $$0) {
        this.cs = cgr.a($$0);
        this.ct = this.at;
    }

    public @Nullable chl eN() {
        return this.cu;
    }

    public int eO() {
        return this.cv;
    }

    public void C(cgk $$0) {
        this.cu = $$0 instanceof chl ? (chl)$$0 : null;
        this.cv = this.at;
    }

    public int eP() {
        return this.bK;
    }

    public void n(int $$0) {
        this.bK = $$0;
    }

    public boolean eQ() {
        return this.cq;
    }

    public void r(boolean $$0) {
        this.cq = $$0;
    }

    protected boolean b(cgv $$0) {
        return true;
    }

    public void a(cgv $$0, dlt $$1, dlt $$2) {
        if (this.ao().B_() || this.au()) {
            return;
        }
        if (dlt.c($$1, $$2) || this.ay) {
            return;
        }
        dun $$3 = $$2.a(ki.H);
        if (!this.bq() && $$3 != null && $$0 == $$3.b()) {
            this.ao().a(null, this.dP(), this.dR(), this.dV(), this.a($$0, $$2, $$3), this.dB(), 1.0f, 1.0f, this.as.g());
        }
        if (this.b($$0)) {
            this.c($$3 != null ? etk.v : etk.S);
        }
    }

    protected jd<bcz> a(cgv $$0, dlt $$1, dun $$2) {
        return $$2.c();
    }

    @Override
    public void a(cgk.e $$0) {
        dwo dwo2;
        if (($$0 == cgk.e.a || $$0 == cgk.e.b) && (dwo2 = this.ao()) instanceof axf) {
            axf $$1 = (axf)dwo2;
            this.a($$1, $$0);
        }
        super.a($$0);
        this.ca.a();
    }

    @Override
    public void b(cgk.e $$0) {
        super.b($$0);
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$1 = (axf)dwo2;
            $$1.j().c(this);
        }
    }

    protected void a(axf $$0, cgk.e $$1) {
        for (cfm $$2 : this.eW()) {
            $$2.a($$0, this, $$1);
        }
        this.co.clear();
    }

    @Override
    protected void a(fns $$02) {
        $$02.a(aU, this.eZ());
        $$02.a(aR, (short)this.bu);
        $$02.a(aT, this.ct);
        $$02.a(aS, (short)this.bw);
        $$02.a("AbsorptionAmount", this.fX());
        $$02.a(u, cio.a.b, this.fw().d());
        if (!this.co.isEmpty()) {
            $$02.a(b, cfm.d.listOf(), List.copyOf(this.co.values()));
        }
        $$02.a(aQ, this.gj());
        this.gp().ifPresent($$1 -> $$02.a(aN, is.a, $$1));
        DataResult $$12 = this.ca.a(vn.a).map($$0 -> new Dynamic((DynamicOps)vn.a, $$0));
        $$12.resultOrPartial(arg_0 -> ((Logger)a).error(arg_0)).ifPresent($$1 -> $$02.a(aP, Codec.PASSTHROUGH, $$1));
        if (this.bH != null) {
            this.bH.a($$02, "last_hurt_by_player");
            $$02.a("last_hurt_by_player_memory_time", this.bI);
        }
        if (this.cs != null) {
            this.cs.a($$02, "last_hurt_by_mob");
            $$02.a("ticks_since_last_hurt_by_mob", this.at - this.ct);
        }
        if (!this.cb.a()) {
            $$02.a(aO, cgo.a, this.cb);
        }
        if (this.cI.a()) {
            $$02.a("locator_bar_icon", fvt.a.a, this.cI);
        }
    }

    public @Nullable czl a(dlt $$0, boolean $$1, boolean $$2) {
        if ($$0.f()) {
            return null;
        }
        if (this.ao().B_()) {
            this.a(cdb.a);
            return null;
        }
        czl $$3 = this.b($$0, $$1, $$2);
        if ($$3 != null) {
            this.ao().b($$3);
        }
        return $$3;
    }

    @Override
    protected void a(fnq $$02) {
        this.G($$02.a("AbsorptionAmount", 0.0f));
        if (this.ao() != null && !this.ao().B_()) {
            $$02.a(u, cio.a.b).ifPresent(this.fw()::a);
        }
        List $$1 = $$02.a(b, cfm.d.listOf()).orElse(List.of());
        this.co.clear();
        for (cfm $$2 : $$1) {
            this.co.put($$2.c(), $$2);
            this.cr = true;
        }
        this.x($$02.a(aU, this.fq()));
        this.bu = $$02.a(aR, (short)0);
        this.bw = $$02.a(aS, (short)0);
        this.ct = $$02.a(aT, 0);
        $$02.g("Team").ifPresent($$0 -> {
            boolean $$3;
            fur $$1 = this.ao().ab();
            fum $$2 = $$1.b((String)$$0);
            boolean bl2 = $$3 = $$2 != null && $$1.a(this.cZ(), $$2);
            if (!$$3) {
                a.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", $$0);
            }
        });
        this.b(7, $$02.a(aQ, false));
        $$02.a(aN, is.a).ifPresentOrElse($$0 -> {
            this.g((is)$$0);
            this.az.a(aE, chx.c);
            if (!this.ay) {
                this.a((is)$$0);
            }
        }, this::gq);
        $$02.a(aP, Codec.PASSTHROUGH).ifPresent($$0 -> {
            this.ca = this.a((Dynamic<?>)$$0);
        });
        this.bH = cgr.a($$02, "last_hurt_by_player");
        this.bI = $$02.a("last_hurt_by_player_memory_time", 0);
        this.cs = cgr.a($$02, "last_hurt_by_mob");
        this.ct = $$02.a("ticks_since_last_hurt_by_mob", 0) + this.at;
        this.cb.a($$02.a(aO, cgo.a).orElseGet(cgo::new));
        this.cI = $$02.a("locator_bar_icon", fvt.a.a).orElseGet(fvt.a::new);
    }

    @Override
    public void aI() {
        super.aI();
        this.k();
    }

    protected void eR() {
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$0 = (axf)dwo2;
            Iterator<Object> $$1 = this.co.keySet().iterator();
            try {
                while ($$1.hasNext()) {
                    jd $$2 = (jd)$$1.next();
                    cfm $$3 = this.co.get($$2);
                    if (!$$3.a($$0, this, () -> this.a($$3, true, null))) {
                        $$1.remove();
                        this.c(List.of($$3));
                        continue;
                    }
                    if ($$3.d() % 600 != 0) continue;
                    this.a($$3, false, null);
                }
            }
            catch (ConcurrentModificationException $$2) {}
        } else {
            for (cfm $$4 : this.co.values()) {
                $$4.i();
            }
            List<lw> $$5 = this.az.a(ce);
            if (!$$5.isEmpty()) {
                int $$8;
                boolean $$6 = this.az.a(cf);
                int $$7 = this.cG() ? 15 : 4;
                int n2 = $$8 = $$6 ? 5 : 1;
                if (this.as.a($$7 * $$8) == 0) {
                    this.ao().a(bhs.a($$5, this.as), this.e(0.5), this.dS(), this.h(0.5), 1.0, 1.0, 1.0);
                }
            }
        }
    }

    private void k() {
        if (this.cr) {
            this.M();
            this.D();
            this.cr = false;
        }
    }

    protected void M() {
        if (this.co.isEmpty()) {
            this.eU();
            this.l(false);
            return;
        }
        this.l(this.d(cfo.n));
        this.p();
    }

    private void p() {
        List<lw> $$0 = this.co.values().stream().filter(cfm::g).map(cfm::a).toList();
        this.az.a(ce, $$0);
        this.az.a(cf, chl.d(this.co.values()));
    }

    private void D() {
        boolean $$0 = this.cF();
        if (this.i(6) != $$0) {
            this.b(6, $$0);
        }
    }

    public double D(@Nullable cgk $$0) {
        double $$1 = 1.0;
        if (this.cx()) {
            $$1 *= 0.8;
        }
        if (this.cG()) {
            float $$2 = this.fB();
            if ($$2 < 0.1f) {
                $$2 = 0.1f;
            }
            $$1 *= 0.7 * (double)$$2;
        }
        if ($$0 != null) {
            dlt $$3 = this.a(cgv.f);
            cgu<?> $$4 = $$0.ay();
            if ($$4 == cgu.bn && $$3.a(dlx.wx) || $$4 == cgu.bW && $$3.a(dlx.wA) || $$4 == cgu.aZ && $$3.a(dlx.wD) || $$4 == cgu.ba && $$3.a(dlx.wD) || $$4 == cgu.I && $$3.a(dlx.wB)) {
                $$1 *= 0.5;
            }
        }
        return $$1;
    }

    public boolean c(chl $$0) {
        if ($$0 instanceof ddm && this.ao().av() == ccz.a) {
            return false;
        }
        return $$0.eS();
    }

    public boolean eS() {
        return !this.cU() && this.eT();
    }

    public boolean eT() {
        return !this.au() && this.cb();
    }

    public static boolean d(Collection<cfm> $$0) {
        for (cfm $$1 : $$0) {
            if (!$$1.g() || $$1.f()) continue;
            return false;
        }
        return true;
    }

    protected void eU() {
        this.az.a(ce, List.of());
    }

    public boolean eV() {
        if (this.ao().B_()) {
            return false;
        }
        if (this.co.isEmpty()) {
            return false;
        }
        HashMap $$0 = Maps.newHashMap(this.co);
        this.co.clear();
        this.c($$0.values());
        return true;
    }

    public Collection<cfm> eW() {
        return this.co.values();
    }

    public Map<jd<cfk>, cfm> eX() {
        return this.co;
    }

    public boolean d(jd<cfk> $$0) {
        return this.co.containsKey($$0);
    }

    public @Nullable cfm e(jd<cfk> $$0) {
        return this.co.get($$0);
    }

    public float a(jd<cfk> $$0, float $$1) {
        cfm $$2 = this.e($$0);
        if ($$2 != null) {
            return $$2.a(this, $$1);
        }
        return 0.0f;
    }

    public final boolean a(cfm $$0) {
        return this.b($$0, null);
    }

    public boolean b(cfm $$0, @Nullable cgk $$1) {
        if (!this.b($$0)) {
            return false;
        }
        cfm $$2 = this.co.get($$0.c());
        boolean $$3 = false;
        if ($$2 == null) {
            this.co.put($$0.c(), $$0);
            this.a($$0, $$1);
            $$3 = true;
            $$0.b(this);
        } else if ($$2.b($$0)) {
            this.a($$2, true, $$1);
            $$3 = true;
        }
        $$0.a(this);
        return $$3;
    }

    public boolean b(cfm $$0) {
        if (this.ay().a(bdt.H)) {
            return !$$0.a(cfo.M);
        }
        if (this.ay().a(bdt.G)) {
            return !$$0.a(cfo.L);
        }
        if (this.ay().a(bdt.x)) {
            return !$$0.a(cfo.j) && !$$0.a(cfo.s);
        }
        return true;
    }

    public void c(cfm $$0, @Nullable cgk $$1) {
        if (!this.b($$0)) {
            return;
        }
        cfm $$2 = this.co.put($$0.c(), $$0);
        if ($$2 == null) {
            this.a($$0, $$1);
        } else {
            $$0.d($$2);
            this.a($$0, true, $$1);
        }
    }

    public boolean eY() {
        return this.ay().a(bdt.y);
    }

    public final @Nullable cfm f(jd<cfk> $$0) {
        return this.co.remove($$0);
    }

    public boolean g(jd<cfk> $$0) {
        cfm $$1 = this.f($$0);
        if ($$1 != null) {
            this.c(List.of($$1));
            return true;
        }
        return false;
    }

    protected void a(cfm $$0, @Nullable cgk $$1) {
        if (!this.ao().B_()) {
            this.cr = true;
            $$0.c().a().a(this.fw(), $$0.e());
            this.c($$0);
        }
    }

    public void c(cfm $$0) {
        for (cgk $$1 : this.dn()) {
            if (!($$1 instanceof axg)) continue;
            axg $$2 = (axg)$$1;
            $$2.g.b(new ahv(this.aA(), $$0, false));
        }
    }

    protected void a(cfm $$0, boolean $$1, @Nullable cgk $$2) {
        if (this.ao().B_()) {
            return;
        }
        this.cr = true;
        if ($$1) {
            cfk $$3 = $$0.c().a();
            $$3.a(this.fw());
            $$3.a(this.fw(), $$0.e());
            this.E();
        }
        this.c($$0);
    }

    protected void c(Collection<cfm> $$0) {
        if (this.ao().B_()) {
            return;
        }
        this.cr = true;
        for (cfm $$1 : $$0) {
            $$1.c().a().a(this.fw());
            for (cgk $$2 : this.dn()) {
                if (!($$2 instanceof axg)) continue;
                axg $$3 = (axg)$$2;
                $$3.g.b(new afw(this.aA(), $$1.c()));
            }
        }
        this.E();
    }

    private void E() {
        Set<cio> $$0 = this.fw().b();
        for (cio $$1 : $$0) {
            this.a($$1.a());
        }
        $$0.clear();
    }

    protected void a(jd<cin> $$0) {
        dwo dwo2;
        if ($$0.a(cis.u)) {
            float $$1 = this.fq();
            if (this.eZ() > $$1) {
                this.x($$1);
            }
        } else if ($$0.a(cis.t)) {
            float $$2 = this.fr();
            if (this.fX() > $$2) {
                this.F($$2);
            }
        } else if ($$0.a(cis.A)) {
            this.j_();
        } else if ($$0.a(cis.I) && (dwo2 = this.ao()) instanceof axf) {
            axf $$3 = (axf)dwo2;
            bcv $$4 = $$3.j();
            if (this.cm.c($$0) > 0.0) {
                $$4.a(this);
            } else {
                $$4.c(this);
            }
        }
    }

    public void d(float $$0) {
        float $$1 = this.eZ();
        if ($$1 > 0.0f) {
            this.x($$1 + $$0);
        }
    }

    public float eZ() {
        return this.az.a(cd).floatValue();
    }

    public void x(float $$0) {
        this.az.a(cd, Float.valueOf(bgj.a($$0, 0.0f, this.fq())));
    }

    public boolean fa() {
        return this.eZ() <= 0.0f;
    }

    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        cgk cgk2;
        boolean $$13;
        boolean $$6;
        if (this.a($$0, $$1)) {
            return false;
        }
        if (this.fa()) {
            return false;
        }
        if ($$1.a(bdq.i) && this.d(cfo.l)) {
            return false;
        }
        if (this.gr()) {
            this.gs();
        }
        this.bK = 0;
        if ($$2 < 0.0f) {
            $$2 = 0.0f;
        }
        float $$3 = $$2;
        dlt $$4 = this.gb();
        float $$5 = this.b($$0, $$1, $$2);
        $$2 -= $$5;
        boolean bl2 = $$6 = $$5 > 0.0f;
        if ($$1.a(bdq.o) && this.ay().a(bdt.m)) {
            $$2 *= 5.0f;
        }
        if ($$1.a(bdq.a) && !this.a(cgv.f).f()) {
            this.d($$1, $$2);
            $$2 *= 0.75f;
        }
        if (Float.isNaN($$2) || Float.isInfinite($$2)) {
            $$2 = Float.MAX_VALUE;
        }
        boolean $$7 = true;
        if ((float)this.ax > 10.0f && !$$1.a(bdq.e)) {
            if ($$2 <= this.bL) {
                return false;
            }
            this.c($$0, $$1, $$2 - this.bL);
            this.bL = $$2;
            $$7 = false;
        } else {
            this.bL = $$2;
            this.ax = 20;
            this.c($$0, $$1, $$2);
            this.bu = this.bv = 10;
        }
        this.e($$1);
        this.f($$1);
        if ($$7) {
            dnx $$8 = $$4.a(ki.M);
            if ($$6 && $$8 != null) {
                $$8.a($$0, this);
            } else {
                $$0.a((cgk)this, $$1);
            }
            if (!($$1.a(bdq.r) || $$6 && !($$2 > 0.0f))) {
                this.bT();
            }
            if (!$$1.a(bdq.z)) {
                double $$9 = 0.0;
                double $$10 = 0.0;
                cgk cgk3 = $$1.c();
                if (cgk3 instanceof dec) {
                    dec $$11 = (dec)cgk3;
                    DoubleDoubleImmutablePair $$12 = $$11.a(this, $$1);
                    $$9 = -$$12.leftDouble();
                    $$10 = -$$12.rightDouble();
                } else if ($$1.i() != null) {
                    $$9 = $$1.i().a() - this.dP();
                    $$10 = $$1.i().c() - this.dV();
                }
                this.o(0.4f, $$9, $$10);
                if (!$$6) {
                    this.a($$9, $$10);
                }
            }
        }
        if (this.fa()) {
            if (!this.j($$1)) {
                if ($$7) {
                    this.b(this.fd());
                    this.i($$1);
                }
                this.a($$1);
            }
        } else if ($$7) {
            this.g($$1);
            this.i($$1);
        }
        boolean bl3 = $$13 = !$$6 || $$2 > 0.0f;
        if ($$13) {
            this.cC = $$1;
            this.cD = this.ao().au();
            for (cfm $$14 : this.eW()) {
                $$14.a($$0, this, $$1, $$2);
            }
        }
        if ((cgk2 = this) instanceof axg) {
            axg $$15 = (axg)cgk2;
            aj.i.a($$15, $$1, $$3, $$2, $$6);
            if ($$5 > 0.0f && $$5 < 3.4028235E37f) {
                $$15.a(bdk.M, Math.round($$5 * 10.0f));
            }
        }
        if ((cgk2 = $$1.d()) instanceof axg) {
            axg $$16 = (axg)cgk2;
            aj.h.a($$16, this, $$1, $$3, $$2, $$6);
        }
        return $$13;
    }

    public float b(axf $$0, cex $$1, float $$2) {
        cgk $$12;
        double $$10;
        deh $$5;
        dnx $$4;
        dlt $$3;
        block10: {
            block9: {
                if ($$2 <= 0.0f) {
                    return 0.0f;
                }
                $$3 = this.gh();
                if ($$3 == null) {
                    return 0.0f;
                }
                $$4 = $$3.a(ki.M);
                if ($$4 == null) break block9;
                if (!$$4.f().map($$1::a).orElse(false).booleanValue()) break block10;
            }
            return 0.0f;
        }
        cgk cgk2 = $$1.c();
        if (cgk2 instanceof deh && ($$5 = (deh)cgk2).x() > 0) {
            return 0.0f;
        }
        ftm $$6 = $$1.i();
        if ($$6 != null) {
            ftm $$7 = this.c(0.0f, this.cS());
            ftm $$8 = $$6.d(this.dI());
            $$8 = new ftm($$8.g, 0.0, $$8.i).d();
            double $$9 = Math.acos($$8.b($$7));
        } else {
            $$10 = 3.1415927410125732;
        }
        float $$11 = $$4.a($$1, $$2, $$10);
        $$4.a(this.ao(), $$3, this, this.ga(), $$11);
        if ($$11 > 0.0f && !$$1.a(bdq.j) && ($$12 = $$1.c()) instanceof chl) {
            chl $$13 = (chl)$$12;
            this.a($$0, $$13);
        }
        return $$11;
    }

    private void i(cex $$0) {
        if ($$0.a(cfa.Q)) {
            bdb $$1 = this instanceof ddm ? bdb.h : bdb.f;
            this.ao().a(null, this.dI().g, this.dI().h, this.dI().i, bda.CP, $$1);
        }
    }

    protected void e(cex $$0) {
        cgk cgk2 = $$0.d();
        if (cgk2 instanceof chl) {
            chl $$1 = (chl)cgk2;
            if (!($$0.a(bdq.q) || $$0.a(cfa.J) && this.ay().a(bdt.F))) {
                this.a($$1);
            }
        }
    }

    protected @Nullable ddm f(cex $$0) {
        cxu $$3;
        cgk $$1 = $$0.d();
        if ($$1 instanceof ddm) {
            ddm $$2 = (ddm)$$1;
            this.a($$2, 100);
        } else if ($$1 instanceof cxu && ($$3 = (cxu)$$1).p()) {
            if ($$3.ae_() != null) {
                this.a($$3.ae_().c(), 100);
            } else {
                this.bH = null;
                this.bI = 0;
            }
        }
        return cgr.c(this.bH, this.ao());
    }

    protected void a(axf $$0, chl $$1) {
        $$1.d(this);
    }

    protected void d(chl $$0) {
        $$0.o(0.5, $$0.dP() - this.dP(), $$0.dV() - this.dV());
    }

    private boolean j(cex $$0) {
        if ($$0.a(bdq.d)) {
            return false;
        }
        dlt $$1 = null;
        doh $$2 = null;
        for (cdb $$3 : cdb.values()) {
            dlt $$4 = this.b($$3);
            $$2 = $$4.a(ki.L);
            if ($$2 == null) continue;
            $$1 = $$4.v();
            $$4.h(1);
            break;
        }
        if ($$1 != null) {
            chl chl2 = this;
            if (chl2 instanceof axg) {
                axg $$5 = (axg)chl2;
                $$5.b(bdk.c.b($$1.h()));
                aj.C.a($$5, $$1);
                $$1.a((cgk)this, etk.C);
            }
            this.x(1.0f);
            $$2.a($$1, this);
            this.ao().a((cgk)this, (byte)35);
        }
        return $$2 != null;
    }

    public @Nullable cex fb() {
        if (this.ao().au() - this.cD > 40L) {
            this.cC = null;
        }
        return this.cC;
    }

    protected void g(cex $$0) {
        this.b(this.h($$0));
    }

    public void b(@Nullable bcz $$0) {
        if ($$0 != null) {
            this.a($$0, this.fC(), this.fD());
        }
    }

    private void g(dlt $$0) {
        if (!$$0.f()) {
            jd<bcz> $$1 = $$0.a(ki.aB);
            if ($$1 != null && !this.bq()) {
                this.ao().a(this.dP(), this.dR(), this.dV(), $$1.a(), this.dB(), 0.8f, 0.8f + this.ao().y.i() * 0.4f, false);
            }
            this.b($$0, 5);
        }
    }

    public void a(cex $$0) {
        if (this.eh() || this.bJ) {
            return;
        }
        cgk $$1 = $$0.d();
        chl $$2 = this.fp();
        if ($$2 != null) {
            $$2.a((cgk)this, $$0);
        }
        if (this.gr()) {
            this.gs();
        }
        this.gf();
        if (!this.ao().B_() && this.i_()) {
            a.info("Named entity {} died: {}", (Object)this, (Object)this.fo().a().getString());
        }
        this.bJ = true;
        this.fo().c();
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$3 = (axf)dwo2;
            if ($$1 == null || $$1.a($$3, this, $$0)) {
                this.c(etk.p);
                this.b($$3, $$0);
                this.e($$2);
            }
            this.ao().a((cgk)this, (byte)3);
        }
        this.c(chx.h);
    }

    /*
     * WARNING - void declaration
     */
    protected void e(@Nullable chl $$0) {
        dwo dwo2 = this.ao();
        if (!(dwo2 instanceof axf)) {
            return;
        }
        axf $$1 = (axf)dwo2;
        boolean $$3 = false;
        if ($$0 instanceof cyw) {
            void $$2;
            if ($$2.U().a(eua.F).booleanValue()) {
                is $$4 = this.dK();
                eoh $$5 = dzs.cn.m();
                if (this.ao().a_($$4).l() && $$5.a((dwr)this.ao(), $$4)) {
                    this.ao().a($$4, $$5, 3);
                    $$3 = true;
                }
            }
            if (!$$3) {
                czl $$6 = new czl(this.ao(), this.dP(), this.dR(), this.dV(), new dlt(dlx.dJ));
                this.ao().b($$6);
            }
        }
    }

    protected void b(axf $$0, cex $$1) {
        boolean $$2;
        boolean bl2 = $$2 = this.bI > 0;
        if (this.e($$0)) {
            this.b($$0, $$1, $$2);
            this.a($$0, $$1, $$2);
        }
        this.g($$0);
        this.b($$0, $$1.d());
    }

    protected void g(axf $$0) {
    }

    protected void b(axf $$0, @Nullable cgk $$1) {
        if (!this.ff() && (this.eJ() || this.bI > 0 && this.eI() && $$0.U().a(eua.D).booleanValue())) {
            cgz.a($$0, this.dI(), this.a($$0, $$1));
        }
    }

    protected void a(axf $$0, cex $$1, boolean $$2) {
    }

    public long fc() {
        return 0L;
    }

    protected float b(cgk $$0, cex $$1) {
        float $$2 = (float)this.i(cis.e);
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$3 = (axf)dwo2;
            return dsq.d($$3, this.eq(), $$0, $$1, $$2) / 2.0f;
        }
        return $$2 / 2.0f;
    }

    protected void b(axf $$0, cex $$1, boolean $$2) {
        Optional<amt<fof>> $$3 = this.er();
        if ($$3.isEmpty()) {
            return;
        }
        this.a($$0, $$1, $$2, $$3.get());
    }

    public void a(axf $$0, cex $$12, boolean $$2, amt<fof> $$3) {
        this.a($$0, $$12, $$2, $$3, (dlt $$1) -> this.a($$0, (dlt)$$1));
    }

    public void a(axf $$0, cex $$1, boolean $$2, amt<fof> $$3, Consumer<dlt> $$4) {
        fof $$5 = $$0.s().be().a($$3);
        fod.a $$6 = new fod.a($$0).a(fqx.a, this).a(fqx.h, this.dI()).a(fqx.e, $$1).b(fqx.f, $$1.d()).b(fqx.g, $$1.c());
        ddm $$7 = this.eL();
        if ($$2 && $$7 != null) {
            $$6 = $$6.a(fqx.d, $$7).a($$7.eB());
        }
        fod $$8 = $$6.a(fqw.g);
        $$5.a($$8, this.fc(), $$4);
    }

    public boolean a(axf $$0, amt<fof> $$1, @Nullable cgk $$22, dlt $$3, BiConsumer<axf, dlt> $$4) {
        return this.a($$0, $$1, (fod.a $$2) -> $$2.a(fqx.c, this).b(fqx.b, $$22).a(fqx.k, $$3).a(fqw.t), $$4);
    }

    public boolean a(axf $$02, amt<fof> $$1, BiConsumer<axf, dlt> $$2) {
        return this.a($$02, $$1, (fod.a $$0) -> $$0.a(fqx.h, this.dI()).a(fqx.a, this).a(fqw.j), $$2);
    }

    protected void a(axf $$0, amt<fof> $$12, dlt $$2, BiConsumer<axf, dlt> $$3) {
        this.a($$0, $$12, (fod.a $$1) -> $$1.a(fqx.h, this.dI()).a(fqx.a, this).a(fqx.k, $$2).a(fqw.s), $$3);
    }

    protected boolean a(axf $$0, amt<fof> $$1, Function<fod.a, fod> $$22, BiConsumer<axf, dlt> $$3) {
        fod $$5;
        fof $$4 = $$0.s().be().a($$1);
        ObjectArrayList<dlt> $$6 = $$4.a($$5 = $$22.apply(new fod.a($$0)));
        if (!$$6.isEmpty()) {
            $$6.forEach($$2 -> $$3.accept($$0, (dlt)$$2));
            return true;
        }
        return false;
    }

    public void o(double $$0, double $$1, double $$2) {
        if (($$0 *= 1.0 - this.i(cis.r)) <= 0.0) {
            return;
        }
        this.aF = true;
        ftm $$3 = this.dN();
        while ($$1 * $$1 + $$2 * $$2 < (double)1.0E-5f) {
            $$1 = (this.as.j() - this.as.j()) * 0.01;
            $$2 = (this.as.j() - this.as.j()) * 0.01;
        }
        ftm $$4 = new ftm($$1, 0.0, $$2).d().c($$0);
        this.m($$3.g / 2.0 - $$4.g, this.aV() ? Math.min(0.4, $$3.h / 2.0 + $$0) : $$3.h, $$3.i / 2.0 - $$4.i);
    }

    public void a(double $$0, double $$1) {
    }

    protected @Nullable bcz h(cex $$0) {
        return bda.lU;
    }

    protected @Nullable bcz fd() {
        return bda.lP;
    }

    private bcz q(int $$0) {
        return $$0 > 4 ? this.fj().b() : this.fj().a();
    }

    public void fe() {
        this.cG = true;
    }

    public boolean ff() {
        return this.cG;
    }

    public float fg() {
        return 0.0f;
    }

    protected fth fh() {
        fth $$0 = this.dj();
        cgk $$1 = this.dz();
        if ($$1 != null) {
            ftm $$2 = $$1.n(this);
            return $$0.b(Math.max($$2.h, $$0.b));
        }
        return $$0;
    }

    public Map<dso, Set<dti>> c(cgv $$02) {
        return (Map)this.cH.computeIfAbsent($$02, $$0 -> new Reference2ObjectArrayMap());
    }

    public void fi() {
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$0 = (axf)dwo2;
            dsq.a($$0, (cgk)this);
        }
    }

    public a fj() {
        return new a(bda.lV, bda.lN);
    }

    public Optional<is> fk() {
        return this.cB;
    }

    public boolean fl() {
        if (this.au()) {
            return false;
        }
        is $$0 = this.dK();
        eoh $$1 = this.dL();
        if (this.gj() && $$1.a(bdp.bn)) {
            return false;
        }
        if ($$1.a(bdp.bd)) {
            this.cB = Optional.of($$0);
            return true;
        }
        if ($$1.b() instanceof eiw && this.c($$0, $$1)) {
            this.cB = Optional.of($$0);
            return true;
        }
        return false;
    }

    private boolean c(is $$0, eoh $$1) {
        if ($$1.c(eiw.b).booleanValue()) {
            eoh $$2 = this.ao().a_($$0.e());
            return $$2.a(dzs.dm) && $$2.c(eed.b) == $$1.c(eiw.f);
        }
        return false;
    }

    @Override
    public boolean cb() {
        return !this.eh() && this.eZ() > 0.0f;
    }

    public boolean a(chl $$0, double $$1, boolean $$2, boolean $$3, double ... $$4) {
        ftm $$5 = $$0.h(1.0f).d();
        for (double $$6 : $$4) {
            ftm $$7 = new ftm(this.dP() - $$0.dP(), $$6 - $$0.dT(), this.dV() - $$0.dV());
            double $$8 = $$7.g();
            $$7 = $$7.d();
            double $$9 = $$5.b($$7);
            double d2 = $$2 ? $$8 : 1.0;
            if (!($$9 > 1.0 - $$1 / d2) || !$$0.a(this, $$3 ? dvw.a.c : dvw.a.a, dvw.b.a, $$6)) continue;
            return true;
        }
        return false;
    }

    @Override
    public int cW() {
        return this.y(0.0f);
    }

    protected final int y(float $$0) {
        return bgj.b($$0 + 3.0f);
    }

    @Override
    public boolean a(double $$0, float $$1, cex $$2) {
        boolean $$3 = super.a($$0, $$1, $$2);
        int $$4 = this.a($$0, $$1);
        if ($$4 > 0) {
            this.a(this.q($$4), 1.0f, 1.0f);
            this.fm();
            this.a($$2, (float)$$4);
            return true;
        }
        return $$3;
    }

    protected int a(double $$0, float $$1) {
        if (this.ay().a(bdt.p)) {
            return 0;
        }
        double $$2 = this.i($$0);
        return bgj.c($$2 * (double)$$1 * this.i(cis.m));
    }

    private double i(double $$0) {
        return $$0 + 1.0E-6 - this.i(cis.z);
    }

    protected void fm() {
        if (this.bq()) {
            return;
        }
        int $$0 = bgj.c(this.dP());
        int $$1 = bgj.c(this.dR() - (double)0.2f);
        int $$2 = bgj.c(this.dV());
        eoh $$3 = this.ao().a_(new is($$0, $$1, $$2));
        if (!$$3.l()) {
            ehs $$4 = $$3.A();
            this.a($$4.g(), $$4.a() * 0.5f, $$4.b() * 0.75f);
        }
    }

    @Override
    public void q(float $$0) {
        this.bu = this.bv = 10;
    }

    public int fn() {
        return bgj.c(this.i(cis.b));
    }

    protected void c(cex $$0, float $$1) {
    }

    protected void d(cex $$0, float $$1) {
    }

    protected void a(cex $$0, float $$1, cgv ... $$2) {
        if ($$1 <= 0.0f) {
            return;
        }
        int $$3 = (int)Math.max(1.0f, $$1 / 4.0f);
        for (cgv $$4 : $$2) {
            dlt $$5 = this.a($$4);
            dun $$6 = $$5.a(ki.H);
            if ($$6 == null || !$$6.i() || !$$5.m() || !$$5.a($$0)) continue;
            $$5.a($$3, this, $$4);
        }
    }

    protected float e(cex $$0, float $$1) {
        if (!$$0.a(bdq.b)) {
            this.c($$0, $$1);
            $$1 = cet.a(this, $$1, $$0, this.fn(), (float)this.i(cis.c));
        }
        return $$1;
    }

    protected float f(cex $$0, float $$1) {
        float $$9;
        int $$2;
        int $$3;
        float $$4;
        float $$5;
        float $$6;
        if ($$0.a(bdq.f)) {
            return $$1;
        }
        if (this.d(cfo.k) && !$$0.a(bdq.g) && ($$6 = ($$5 = $$1) - ($$1 = Math.max(($$4 = $$1 * (float)($$3 = 25 - ($$2 = (this.e(cfo.k).e() + 1) * 5))) / 25.0f, 0.0f))) > 0.0f && $$6 < 3.4028235E37f) {
            if (this instanceof axg) {
                ((axg)this).a(bdk.O, Math.round($$6 * 10.0f));
            } else if ($$0.d() instanceof axg) {
                ((axg)$$0.d()).a(bdk.K, Math.round($$6 * 10.0f));
            }
        }
        if ($$1 <= 0.0f) {
            return 0.0f;
        }
        if ($$0.a(bdq.h)) {
            return $$1;
        }
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf) {
            axf $$7 = (axf)dwo2;
            float $$8 = dsq.b($$7, this, $$0);
        } else {
            $$9 = 0.0f;
        }
        if ($$9 > 0.0f) {
            $$1 = cet.a($$1, $$9);
        }
        return $$1;
    }

    protected void c(axf $$0, cex $$1, float $$2) {
        cgk cgk2;
        if (this.a($$0, $$1)) {
            return;
        }
        $$2 = this.e($$1, $$2);
        float $$3 = $$2 = this.f($$1, $$2);
        $$2 = Math.max($$2 - this.fX(), 0.0f);
        this.F(this.fX() - ($$3 - $$2));
        float $$4 = $$3 - $$2;
        if ($$4 > 0.0f && $$4 < 3.4028235E37f && (cgk2 = $$1.d()) instanceof axg) {
            axg $$5 = (axg)cgk2;
            $$5.a(bdk.J, Math.round($$4 * 10.0f));
        }
        if ($$2 == 0.0f) {
            return;
        }
        this.fo().a($$1, $$2);
        this.x(this.eZ() - $$2);
        this.F(this.fX() - $$2);
        this.c(etk.o);
    }

    public ceu fo() {
        return this.cn;
    }

    public @Nullable chl fp() {
        if (this.bH != null) {
            return this.bH.a(this.ao(), ddm.class);
        }
        if (this.cs != null) {
            return this.cs.a(this.ao(), chl.class);
        }
        return null;
    }

    public final float fq() {
        return (float)this.i(cis.u);
    }

    public final float fr() {
        return (float)this.i(cis.t);
    }

    public final int fs() {
        return this.az.a(cg);
    }

    public final void o(int $$0) {
        this.az.a(cg, $$0);
    }

    public final int ft() {
        return this.az.a(ch);
    }

    public final void p(int $$0) {
        this.az.a(ch, $$0);
    }

    private int F() {
        dlt $$0 = this.b(cdb.a);
        int $$1 = $$0.L().b();
        if (cfn.a(this)) {
            return $$1 - (1 + cfn.b(this));
        }
        if (this.d(cfo.d)) {
            return $$1 + (1 + this.e(cfo.d).e()) * 2;
        }
        return $$1;
    }

    public void a(cdb $$0) {
        this.a($$0, false);
    }

    public void a(cdb $$0, boolean $$1) {
        if (!this.bp || this.br >= this.F() / 2 || this.br < 0) {
            this.br = -1;
            this.bp = true;
            this.bq = $$0;
            if (this.ao() instanceof axf) {
                add $$2 = new add(this, $$0 == cdb.a ? 0 : 3);
                axc $$3 = ((axf)this.ao()).p();
                if ($$1) {
                    $$3.a(this, $$2);
                } else {
                    $$3.b(this, $$2);
                }
            }
        }
    }

    @Override
    public void c(cex $$0) {
        this.bB.a(1.5f);
        this.ax = 20;
        this.bu = this.bv = 10;
        bcz $$1 = this.h($$0);
        if ($$1 != null) {
            this.a($$1, this.fC(), (this.as.i() - this.as.i()) * 0.2f + 1.0f);
        }
        this.cC = $$0;
        this.cD = this.ao().au();
    }

    @Override
    public void b(byte $$0) {
        switch ($$0) {
            case 3: {
                bcz $$1 = this.fd();
                if ($$1 != null) {
                    this.a($$1, this.fC(), (this.as.i() - this.as.i()) * 0.2f + 1.0f);
                }
                if (this instanceof ddm) break;
                this.x(0.0f);
                this.a(this.en().p());
                break;
            }
            case 46: {
                int $$2 = 128;
                for (int $$3 = 0; $$3 < 128; ++$$3) {
                    double $$4 = (double)$$3 / 127.0;
                    float $$5 = (this.as.i() - 0.5f) * 0.2f;
                    float $$6 = (this.as.i() - 0.5f) * 0.2f;
                    float $$7 = (this.as.i() - 0.5f) * 0.2f;
                    double $$8 = bgj.d($$4, this.Y, this.dP()) + (this.as.j() - 0.5) * (double)this.dF() * 2.0;
                    double $$9 = bgj.d($$4, this.Z, this.dR()) + this.as.j() * (double)this.dG();
                    double $$10 = bgj.d($$4, this.aa, this.dV()) + (this.as.j() - 0.5) * (double)this.dF() * 2.0;
                    this.ao().a(ly.ag, $$8, $$9, $$10, (double)$$5, (double)$$6, $$7);
                }
                break;
            }
            case 47: {
                this.g(this.a(cgv.a));
                break;
            }
            case 48: {
                this.g(this.a(cgv.b));
                break;
            }
            case 49: {
                this.g(this.a(cgv.f));
                break;
            }
            case 50: {
                this.g(this.a(cgv.e));
                break;
            }
            case 51: {
                this.g(this.a(cgv.d));
                break;
            }
            case 52: {
                this.g(this.a(cgv.c));
                break;
            }
            case 65: {
                this.g(this.a(cgv.g));
                break;
            }
            case 68: {
                this.g(this.a(cgv.h));
                break;
            }
            case 54: {
                edr.b(this);
                break;
            }
            case 55: {
                this.I();
                break;
            }
            case 60: {
                this.fu();
                break;
            }
            case 67: {
                this.G();
                break;
            }
            case 2: {
                this.H();
                break;
            }
            default: {
                super.b($$0);
            }
        }
    }

    public float z(float $$0) {
        if (this.cz < 0L) {
            return 0.0f;
        }
        return (float)(this.ao().au() - this.cz) + $$0;
    }

    public void fu() {
        for (int $$0 = 0; $$0 < 20; ++$$0) {
            double $$1 = this.as.k() * 0.02;
            double $$2 = this.as.k() * 0.02;
            double $$3 = this.as.k() * 0.02;
            double $$4 = 10.0;
            this.ao().a(ly.af, this.e(1.0) - $$1 * 10.0, this.dS() - $$2 * 10.0, this.h(1.0) - $$3 * 10.0, $$1, $$2, $$3);
        }
    }

    private void G() {
        ftm $$0 = this.dN();
        for (int $$1 = 0; $$1 < 8; ++$$1) {
            double $$2 = this.as.a(0.0, 1.0);
            double $$3 = this.as.a(0.0, 1.0);
            double $$4 = this.as.a(0.0, 1.0);
            this.ao().a(ly.d, this.dP() + $$2, this.dR() + $$3, this.dV() + $$4, $$0.g, $$0.h, $$0.i);
        }
    }

    private void H() {
        if (this.ao().au() - this.cz <= 10L) {
            return;
        }
        this.cz = this.ao().au();
        doq $$0 = this.bT.a(ki.O);
        if ($$0 == null) {
            return;
        }
        $$0.c(this);
    }

    private void I() {
        dlt $$0 = this.a(cgv.b);
        this.a(cgv.b, this.a(cgv.a));
        this.a(cgv.a, $$0);
    }

    @Override
    protected void aU() {
        this.a(this.en().o(), 4.0f);
    }

    protected void fv() {
        int $$0 = this.F();
        if (this.bp) {
            ++this.br;
            if (this.br >= $$0) {
                this.br = 0;
                this.bp = false;
            }
        } else {
            this.br = 0;
        }
        this.by = (float)this.br / (float)$$0;
    }

    public @Nullable cio h(jd<cin> $$0) {
        return this.fw().a($$0);
    }

    public double i(jd<cin> $$0) {
        return this.fw().c($$0);
    }

    public double j(jd<cin> $$0) {
        return this.fw().d($$0);
    }

    public cip fw() {
        return this.cm;
    }

    public dlt fx() {
        return this.a(cgv.a);
    }

    public dlt fy() {
        return this.a(cgv.b);
    }

    public dlt b(chb $$0) {
        return this.at() == $$0 ? this.fx() : this.fy();
    }

    @Override
    public dlt eq() {
        return this.fx();
    }

    public dnu fz() {
        dnu $$0 = this.fA().a(ki.F);
        return $$0 != null ? $$0 : dnu.a(this);
    }

    public dlt fA() {
        if (this.fZ()) {
            return this.gb();
        }
        return this.fx();
    }

    public boolean b(dlp $$0) {
        return this.b((dlt $$1) -> $$1.a($$0));
    }

    public boolean b(Predicate<dlt> $$0) {
        return $$0.test(this.fx()) || $$0.test(this.fy());
    }

    public dlt b(cdb $$0) {
        if ($$0 == cdb.a) {
            return this.a(cgv.a);
        }
        if ($$0 == cdb.b) {
            return this.a(cgv.b);
        }
        throw new IllegalArgumentException("Invalid hand " + String.valueOf((Object)$$0));
    }

    public void a(cdb $$0, dlt $$1) {
        if ($$0 == cdb.a) {
            this.a(cgv.a, $$1);
        } else if ($$0 == cdb.b) {
            this.a(cgv.b, $$1);
        } else {
            throw new IllegalArgumentException("Invalid hand " + String.valueOf((Object)$$0));
        }
    }

    public boolean d(cgv $$0) {
        return !this.a($$0).f();
    }

    public boolean e(cgv $$0) {
        return true;
    }

    public dlt a(cgv $$0) {
        return this.cb.a($$0);
    }

    public void a(cgv $$0, dlt $$1) {
        this.a($$0, this.cb.a($$0, $$1), $$1);
    }

    public float fB() {
        int $$0 = 0;
        int $$1 = 0;
        for (cgv $$2 : cgw.i) {
            if ($$2.a() != cgv.a.b) continue;
            dlt $$3 = this.a($$2);
            if (!$$3.f()) {
                ++$$1;
            }
            ++$$0;
        }
        return $$0 > 0 ? (float)$$1 / (float)$$0 : 0.0f;
    }

    @Override
    public void i(boolean $$0) {
        super.i($$0);
        cio $$1 = this.h(cis.x);
        $$1.c(e.a());
        if ($$0) {
            $$1.b(e);
        }
    }

    protected float fC() {
        return 1.0f;
    }

    public float fD() {
        if (this.e_()) {
            return (this.as.i() - this.as.i()) * 0.2f + 1.5f;
        }
        return (this.as.i() - this.as.i()) * 0.2f + 1.0f;
    }

    protected boolean fE() {
        return this.fa();
    }

    @Override
    public void h(cgk $$0) {
        if (!this.gr()) {
            super.h($$0);
        }
    }

    private void H(cgk $$0) {
        ftm $$8;
        if (this.eh()) {
            ftm $$12 = this.dI();
        } else if ($$0.eh() || this.ao().a_($$0.dK()).a(bdp.aX)) {
            boolean $$4;
            double $$2 = Math.max(this.dR(), $$0.dR());
            ftm $$3 = new ftm(this.dP(), $$2, this.dV());
            boolean bl2 = $$4 = this.dF() <= 4.0f && this.dG() <= 4.0f;
            if ($$4) {
                double $$5 = (double)this.dG() / 2.0;
                ftm $$6 = $$3.b(0.0, $$5, 0.0);
                fug $$7 = fud.a(fth.a($$6, this.dF(), this.dG(), this.dF()));
                $$3 = this.ao().a((cgk)this, $$7, $$6, (double)this.dF(), (double)this.dG(), (double)this.dF()).map($$1 -> $$1.b(0.0, -$$5, 0.0)).orElse($$3);
            }
        } else {
            $$8 = $$0.b(this);
        }
        this.l($$8.g, $$8.h, $$8.i);
    }

    @Override
    public boolean de() {
        return this.dd();
    }

    protected float fF() {
        return this.A(1.0f);
    }

    protected float A(float $$0) {
        return (float)this.i(cis.q) * $$0 * this.bh() + this.fG();
    }

    public float fG() {
        return this.d(cfo.h) ? 0.1f * ((float)this.e(cfo.h).e() + 1.0f) : 0.0f;
    }

    @VisibleForTesting
    public void u() {
        float $$0 = this.fF();
        if ($$0 <= 1.0E-5f) {
            return;
        }
        ftm $$1 = this.dN();
        this.m($$1.g, Math.max((double)$$0, $$1.h), $$1.i);
        if (this.cA()) {
            float $$2 = this.ec() * ((float)Math.PI / 180);
            this.l(new ftm((double)(-bgj.a((double)$$2)) * 0.2, 0.0, (double)bgj.b((double)$$2) * 0.2));
        }
        this.aF = true;
    }

    protected void fH() {
        this.k(this.dN().b(0.0, -0.04f, 0.0));
    }

    protected void c(bef<fla> $$0) {
        this.k(this.dN().b(0.0, 0.04f, 0.0));
    }

    protected float fI() {
        return 0.8f;
    }

    public boolean a(flb $$0) {
        return false;
    }

    @Override
    protected double bs() {
        return this.i(cis.p);
    }

    protected double fJ() {
        boolean $$0;
        boolean bl2 = $$0 = this.dN().h <= 0.0;
        if ($$0 && this.d(cfo.B)) {
            return Math.min(this.bt(), 0.01);
        }
        return this.bt();
    }

    public void m(ftm $$0) {
        if (this.b(this.ao().b_(this.dK()))) {
            this.o($$0);
        } else if (this.gj()) {
            this.p($$0);
        } else {
            this.a($$0);
        }
    }

    protected boolean b(flb $$0) {
        return (this.by() || this.bN()) && this.eG() && !this.a($$0);
    }

    protected void a(ftm $$0, float $$1) {
        this.a($$0, 0.02f, 0.02f, $$1);
    }

    protected void a(ftm $$0, float $$1, float $$2, float $$3) {
        if (this.by()) {
            this.a($$1, $$0);
            this.a(chp.a, this.dN());
            this.k(this.dN().c((double)0.8f));
        } else if (this.bN()) {
            this.a($$2, $$0);
            this.a(chp.a, this.dN());
            this.k(this.dN().c(0.5));
        } else {
            this.a($$3, $$0);
            this.a(chp.a, this.dN());
            this.k(this.dN().c((double)0.91f));
        }
    }

    private void a(ftm $$0) {
        is $$1 = this.bf();
        float $$2 = this.aV() ? this.ao().a_($$1).b().g() : 1.0f;
        float $$3 = $$2 * 0.91f;
        ftm $$4 = this.b($$0, $$2);
        double $$5 = $$4.h;
        cfm $$6 = this.e(cfo.y);
        $$5 = $$6 != null ? ($$5 += (0.05 * (double)($$6.e() + 1) - $$4.h) * 0.2) : (!this.ao().B_() || this.ao().H($$1) ? ($$5 -= this.fJ()) : (this.dR() > (double)this.ao().K_() ? -0.1 : 0.0));
        if (this.eQ()) {
            this.m($$4.g, $$5, $$4.i);
        } else {
            float $$7 = this instanceof ctj ? $$3 : 0.98f;
            this.m($$4.g * (double)$$3, $$5 * (double)$$7, $$4.i * (double)$$3);
        }
    }

    private void o(ftm $$0) {
        boolean $$1 = this.dN().h <= 0.0;
        double $$2 = this.dR();
        double $$3 = this.fJ();
        if (this.by()) {
            this.a($$0, $$3, $$1, $$2);
            this.J();
        } else {
            this.b($$0, $$3, $$1, $$2);
        }
    }

    protected void a(ftm $$0, double $$1, boolean $$2, double $$3) {
        float $$4 = this.cA() ? 0.9f : this.fI();
        float $$5 = 0.02f;
        float $$6 = (float)this.i(cis.H);
        if (!this.aV()) {
            $$6 *= 0.5f;
        }
        if ($$6 > 0.0f) {
            $$4 += (0.54600006f - $$4) * $$6;
            $$5 += (this.fM() - $$5) * $$6;
        }
        if (this.d(cfo.D)) {
            $$4 = 0.96f;
        }
        this.a($$5, $$0);
        this.a(chp.a, this.dN());
        ftm $$7 = this.dN();
        if (this.ad && this.fl()) {
            $$7 = new ftm($$7.g, 0.2, $$7.i);
        }
        $$7 = $$7.d($$4, 0.8f, $$4);
        this.k(this.a($$1, $$2, $$7));
        this.j($$3);
    }

    private void b(ftm $$0, double $$1, boolean $$2, double $$3) {
        this.a(0.02f, $$0);
        this.a(chp.a, this.dN());
        if (this.b(bdv.b) <= this.dE()) {
            this.k(this.dN().d(0.5, 0.8f, 0.5));
            ftm $$4 = this.a($$1, $$2, this.dN());
            this.k($$4);
        } else {
            this.k(this.dN().c(0.5));
        }
        if ($$1 != 0.0) {
            this.k(this.dN().b(0.0, -$$1 / 4.0, 0.0));
        }
        this.j($$3);
    }

    private void j(double $$0) {
        ftm $$1 = this.dN();
        if (this.ad && this.f($$1.g, $$1.h + (double)0.6f - this.dR() + $$0, $$1.i)) {
            this.m($$1.g, 0.3f, $$1.i);
        }
    }

    private void J() {
        boolean $$0 = this.ay().a(bdt.T);
        if ($$0 && this.cr() && this.b(bdv.a) > this.dE()) {
            this.k(this.dN().b(0.0, 0.04f, 0.0));
        }
    }

    private void p(ftm $$0) {
        if (this.fl()) {
            this.a($$0);
            this.fK();
            return;
        }
        ftm $$1 = this.dN();
        double $$2 = $$1.i();
        this.k(this.q($$1));
        this.a(chp.a, this.dN());
        if (!this.ao().B_()) {
            double $$3 = this.dN().i();
            this.c($$2, $$3);
        }
    }

    public void fK() {
        this.b(7, true);
        this.b(7, false);
    }

    private ftm q(ftm $$0) {
        ftm $$1 = this.cj();
        float $$2 = this.ee() * ((float)Math.PI / 180);
        double $$3 = Math.sqrt($$1.g * $$1.g + $$1.i * $$1.i);
        double $$4 = $$0.i();
        double $$5 = this.fJ();
        double $$6 = bgj.n(Math.cos($$2));
        $$0 = $$0.b(0.0, $$5 * (-1.0 + $$6 * 0.75), 0.0);
        if ($$0.h < 0.0 && $$3 > 0.0) {
            double $$7 = $$0.h * -0.1 * $$6;
            $$0 = $$0.b($$1.g * $$7 / $$3, $$7, $$1.i * $$7 / $$3);
        }
        if ($$2 < 0.0f && $$3 > 0.0) {
            double $$8 = $$4 * (double)(-bgj.a((double)$$2)) * 0.04;
            $$0 = $$0.b(-$$1.g * $$8 / $$3, $$8 * 3.2, -$$1.i * $$8 / $$3);
        }
        if ($$3 > 0.0) {
            $$0 = $$0.b(($$1.g / $$3 * $$4 - $$0.g) * 0.1, 0.0, ($$1.i / $$3 * $$4 - $$0.i) * 0.1);
        }
        return $$0.d(0.99f, 0.98f, 0.99f);
    }

    private void c(double $$0, double $$1) {
        double $$2;
        float $$3;
        if (this.ad && ($$3 = (float)(($$2 = $$0 - $$1) * 10.0 - 3.0)) > 0.0f) {
            this.a(this.q((int)$$3), 1.0f, 1.0f);
            this.a(this.en().n(), $$3);
        }
    }

    private void c(ddm $$0, ftm $$1) {
        ftm $$2 = this.b($$0, $$1);
        this.a($$0, $$2);
        if (this.dx()) {
            this.C(this.f($$0));
            this.m($$2);
        } else {
            this.k(ftm.c);
        }
    }

    protected void a(ddm $$0, ftm $$1) {
    }

    protected ftm b(ddm $$0, ftm $$1) {
        return $$1;
    }

    protected float f(ddm $$0) {
        return this.fM();
    }

    public void s(boolean $$0) {
        float $$1 = (float)bgj.g(this.dP() - this.Y, $$0 ? this.dR() - this.Z : 0.0, this.dV() - this.aa);
        if (this.cq() || !this.cb()) {
            this.bB.a();
        } else {
            this.B($$1);
        }
    }

    protected void B(float $$0) {
        float $$1 = Math.min($$0 * 4.0f, 1.0f);
        this.bB.a($$1, 0.4f, this.e_() ? 3.0f : 1.0f);
    }

    private ftm b(ftm $$0, float $$1) {
        this.a(this.I($$1), $$0);
        this.k(this.r(this.dN()));
        this.a(chp.a, this.dN());
        ftm $$2 = this.dN();
        if ((this.ad || this.bM) && (this.fl() || this.aK && eft.a(this))) {
            $$2 = new ftm($$2.g, 0.2, $$2.i);
        }
        return $$2;
    }

    public ftm a(double $$0, boolean $$1, ftm $$2) {
        if ($$0 != 0.0 && !this.cA()) {
            double $$4;
            if ($$1 && Math.abs($$2.h - 0.005) >= 0.003 && Math.abs($$2.h - $$0 / 16.0) < 0.003) {
                double $$3 = -0.003;
            } else {
                $$4 = $$2.h - $$0 / 16.0;
            }
            return new ftm($$2.g, $$4, $$2.i);
        }
        return $$2;
    }

    private ftm r(ftm $$0) {
        if (this.fl()) {
            this.l();
            float $$1 = 0.15f;
            double $$2 = bgj.a($$0.g, (double)-0.15f, (double)0.15f);
            double $$3 = bgj.a($$0.i, (double)-0.15f, (double)0.15f);
            double $$4 = Math.max($$0.h, (double)-0.15f);
            if ($$4 < 0.0 && !this.dL().a(dzs.oP) && this.gi() && this instanceof ddm) {
                $$4 = 0.0;
            }
            $$0 = new ftm($$2, $$4, $$3);
        }
        return $$0;
    }

    private float I(float $$0) {
        if (this.aV()) {
            return this.fM() * (0.21600002f / ($$0 * $$0 * $$0));
        }
        return this.fL();
    }

    protected float fL() {
        return this.dl() instanceof ddm ? this.fM() * 0.1f : 0.02f;
    }

    public float fM() {
        return this.cw;
    }

    public void C(float $$0) {
        this.cw = $$0;
    }

    public boolean c(axf $$0, cgk $$1) {
        this.C($$1);
        return false;
    }

    public void a(cgk $$0, float $$1, ftm $$2) {
        if ($$1 > 0.0f && $$0 instanceof chl) {
            chl $$3 = (chl)$$0;
            $$3.o($$1, bgj.a((double)(this.ec() * ((float)Math.PI / 180))), -bgj.b((double)(this.ec() * ((float)Math.PI / 180))));
            this.k(this.dN().d(0.6, 1.0, 0.6));
        }
    }

    protected void fN() {
    }

    @Override
    public void g() {
        super.g();
        this.N();
        this.P();
        if (!this.ao().B_()) {
            int $$1;
            int $$0 = this.fs();
            if ($$0 > 0) {
                if (this.bs <= 0) {
                    this.bs = 20 * (30 - $$0);
                }
                --this.bs;
                if (this.bs <= 0) {
                    this.o($$0 - 1);
                }
            }
            if (($$1 = this.ft()) > 0) {
                if (this.bt <= 0) {
                    this.bt = 20 * (30 - $$1);
                }
                --this.bt;
                if (this.bt <= 0) {
                    this.p($$1 - 1);
                }
            }
            this.K();
            if (this.at % 20 == 0) {
                this.fo().c();
            }
            if (!(!this.gr() || this.av() && this.Q())) {
                this.gs();
            }
        }
        if (!this.eh()) {
            this.d_();
        }
        double $$2 = this.dP() - this.Y;
        double $$3 = this.dV() - this.aa;
        float $$4 = (float)($$2 * $$2 + $$3 * $$3);
        float $$5 = this.bC;
        if ($$4 > 0.0025000002f) {
            float $$6 = (float)bgj.d($$3, $$2) * 57.295776f - 90.0f;
            float $$7 = bgj.c(bgj.f(this.ec()) - $$6);
            $$5 = 95.0f < $$7 && $$7 < 265.0f ? $$6 - 180.0f : $$6;
        }
        if (this.by > 0.0f) {
            $$5 = this.ec();
        }
        bzm $$8 = bzl.a();
        $$8.a("headTurn");
        this.D($$5);
        $$8.c();
        $$8.a("rangeChecks");
        while (this.ec() - this.ab < -180.0f) {
            this.ab -= 360.0f;
        }
        while (this.ec() - this.ab >= 180.0f) {
            this.ab += 360.0f;
        }
        while (this.bC - this.bD < -180.0f) {
            this.bD -= 360.0f;
        }
        while (this.bC - this.bD >= 180.0f) {
            this.bD += 360.0f;
        }
        while (this.ee() - this.ac < -180.0f) {
            this.ac -= 360.0f;
        }
        while (this.ee() - this.ac >= 180.0f) {
            this.ac += 360.0f;
        }
        while (this.bE - this.bF < -180.0f) {
            this.bF -= 360.0f;
        }
        while (this.bE - this.bF >= 180.0f) {
            this.bF += 360.0f;
        }
        $$8.c();
        this.bV = this.gj() ? ++this.bV : 0;
        if (this.gr()) {
            this.w(0.0f);
        }
        this.E();
        this.bG.a();
    }

    public boolean b(cgk $$0, int $$1) {
        if (this.bZ == null) {
            return false;
        }
        if (this.bZ.containsKey((Object)$$0)) {
            return this.ao().au() - this.bZ.getLong((Object)$$0) < (long)$$1;
        }
        return false;
    }

    public void E(cgk $$0) {
        if (this.bZ != null) {
            this.bZ.put((Object)$$0, this.ao().au());
        }
    }

    public int c(Predicate<cgk> $$0) {
        if (this.bZ == null) {
            return 0;
        }
        return (int)this.bZ.keySet().stream().filter($$0).count();
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(cgv $$0, cgk $$1, float $$2, boolean $$3, boolean $$4, boolean $$5) {
        void $$7;
        dwo dwo2 = this.ao();
        if (!(dwo2 instanceof axf)) {
            return false;
        }
        axf $$6 = (axf)dwo2;
        dlt $$8 = this.a($$0);
        cex $$9 = $$8.a(this, () -> this.en().b(this));
        float $$10 = dsq.a((axf)$$7, $$8, $$1, $$9, $$2);
        ftm $$11 = $$1.dN();
        boolean $$12 = $$4;
        boolean $$13 = $$3 && $$1.a((axf)$$7, $$9, $$10);
        $$12 |= $$13;
        if ($$4) {
            this.a($$1, 0.4f + this.b($$1, $$9), $$11);
        }
        if ($$5 && $$1.cq()) {
            $$12 = true;
            $$1.cf();
        }
        if ($$1 instanceof chl) {
            chl $$14 = (chl)$$1;
            $$8.a($$14, this);
        }
        if ($$13) {
            dsq.a((axf)$$7, $$1, $$9);
        }
        if (!$$12) {
            return false;
        }
        this.C($$1);
        this.fN();
        return true;
    }

    public void fO() {
    }

    private void K() {
        Map<cgv, dlt> $$0 = this.L();
        if ($$0 != null) {
            this.a($$0);
            if (!$$0.isEmpty()) {
                this.b($$0);
            }
        }
    }

    private @Nullable Map<cgv, dlt> L() {
        Map $$02 = null;
        for (cgv cgv2 : cgv.j) {
            dlt $$3;
            dlt $$2 = this.cp.get(cgv2);
            if (!this.a($$2, $$3 = this.a(cgv2))) continue;
            if ($$02 == null) {
                $$02 = Maps.newEnumMap(cgv.class);
            }
            $$02.put(cgv2, $$3);
            cip $$4 = this.fw();
            if ($$2.f()) continue;
            this.a($$2, cgv2, $$4);
        }
        if ($$02 != null) {
            for (Map.Entry entry : $$02.entrySet()) {
                cgv $$6 = (cgv)entry.getKey();
                dlt $$7 = (dlt)entry.getValue();
                if ($$7.f() || $$7.q()) continue;
                $$7.a($$6, (jd<cin> $$0, ciq $$1) -> {
                    cio $$2 = this.cm.a((jd<cin>)$$0);
                    if ($$2 != null) {
                        $$2.c($$1.a());
                        $$2.b((ciq)$$1);
                    }
                });
                dwo dwo2 = this.ao();
                if (!(dwo2 instanceof axf)) continue;
                axf $$8 = (axf)dwo2;
                dsq.a($$8, $$7, this, $$6);
            }
        }
        return $$02;
    }

    public boolean a(dlt $$0, dlt $$1) {
        return !dlt.a($$1, $$0);
    }

    private void a(Map<cgv, dlt> $$0) {
        dlt $$1 = $$0.get(cgv.a);
        dlt $$2 = $$0.get(cgv.b);
        if ($$1 != null && $$2 != null && dlt.a($$1, this.cp.get(cgv.b)) && dlt.a($$2, this.cp.get(cgv.a))) {
            ((axf)this.ao()).p().b(this, new aei(this, 55));
            $$0.remove(cgv.a);
            $$0.remove(cgv.b);
            this.cp.put(cgv.a, $$1.v());
            this.cp.put(cgv.b, $$2.v());
        }
    }

    private void b(Map<cgv, dlt> $$0) {
        ArrayList $$12 = Lists.newArrayListWithCapacity((int)$$0.size());
        $$0.forEach(($$1, $$2) -> {
            dlt $$3 = $$2.v();
            $$12.add(Pair.of((Object)$$1, (Object)$$3));
            this.cp.put((cgv)$$1, $$3);
        });
        ((axf)this.ao()).p().b(this, new ags(this.aA(), $$12));
    }

    protected void D(float $$0) {
        float $$1 = bgj.f($$0 - this.bC);
        this.bC += $$1 * 0.3f;
        float $$2 = bgj.f(this.ec() - this.bC);
        float $$3 = this.fP();
        if (Math.abs($$2) > $$3) {
            this.bC += $$2 - (float)bgj.m($$2) * $$3;
        }
    }

    protected float fP() {
        return 50.0f;
    }

    /*
     * Unable to fully structure code
     */
    public void d_() {
        if (this.cx > 0) {
            --this.cx;
        }
        if (this.ch()) {
            this.l_().e();
        } else if (!this.dx()) {
            this.k(this.dN().c(0.98));
        }
        if (this.bS > 0) {
            this.a(this.bS, this.bR);
            --this.bS;
        }
        this.cb.a((cgk)this);
        $$0 = this.dN();
        $$1 = $$0.g;
        $$2 = $$0.h;
        $$3 = $$0.i;
        if (this.ay().equals(cgu.cb)) {
            if ($$0.j() < 9.0E-6) {
                $$1 = 0.0;
                $$3 = 0.0;
            }
        } else {
            if (Math.abs($$0.g) < 0.003) {
                $$1 = 0.0;
            }
            if (Math.abs($$0.i) < 0.003) {
                $$3 = 0.0;
            }
        }
        if (Math.abs($$0.h) < 0.003) {
            $$2 = 0.0;
        }
        this.m($$1, $$2, $$3);
        $$4 = bzl.a();
        $$4.a("ai");
        this.fQ();
        if (this.fE()) {
            this.bM = false;
            this.bN = 0.0f;
            this.bP = 0.0f;
        } else if (this.dy() && !this.ao().B_()) {
            $$4.a("newAi");
            this.fV();
            $$4.c();
        }
        $$4.c();
        $$4.a("jump");
        if (this.bM && this.eG()) {
            if (this.bN()) {
                $$5 = this.b(bdv.b);
            } else {
                $$6 = this.b(bdv.a);
            }
            $$7 = this.by() != false && $$6 > 0.0;
            $$8 = this.dE();
            if ($$7 && (!this.aV() || $$6 > $$8)) {
                this.c(bdv.a);
            } else if (this.bN() && (!this.aV() || $$6 > $$8)) {
                this.c(bdv.b);
            } else if ((this.aV() || $$7 && $$6 <= $$8) && this.cx == 0) {
                this.u();
                this.cx = 10;
            }
        } else {
            this.cx = 0;
        }
        $$4.c();
        $$4.a("travel");
        if (this.gj()) {
            this.fT();
        }
        $$9 = this.dj();
        $$10 = new ftm(this.bN, this.bO, this.bP);
        if (this.d(cfo.B) || this.d(cfo.y)) {
            this.l();
        }
        if (!((var12_13 = this.dl()) instanceof ddm)) ** GOTO lbl-1000
        $$11 = (ddm)var12_13;
        if (this.cb()) {
            this.c($$11, $$10);
        } else if (this.dx() && this.dy()) {
            this.m($$10);
        }
        if (!this.ao().B_() || this.dv()) {
            this.aW();
        }
        if (this.ao().B_()) {
            this.s(this instanceof ctj);
        }
        $$4.c();
        var12_13 = this.ao();
        if (var12_13 instanceof axf) {
            $$12 = (axf)var12_13;
            $$4.a("freezing");
            if (!this.aJ || !this.ea()) {
                this.k(Math.max(0, this.cM() - 2));
            }
            this.eC();
            this.eD();
            if (this.at % 40 == 0 && this.cO() && this.ea()) {
                this.a($$12, this.en().v(), 1.0f);
            }
            $$4.c();
        }
        $$4.a("push");
        if (this.bW > 0) {
            --this.bW;
            this.a($$9, this.dj());
        }
        this.q();
        $$4.c();
        var12_13 = this.ao();
        if (var12_13 instanceof axf) {
            $$13 = (axf)var12_13;
            if (this.fR() && this.bA()) {
                this.a($$13, this.en().i(), 1.0f);
            }
        }
    }

    protected void fQ() {
        this.bN *= 0.98f;
        this.bP *= 0.98f;
    }

    public boolean fR() {
        return false;
    }

    public boolean fS() {
        return this.bM;
    }

    protected void fT() {
        this.cQ();
        if (!this.ao().B_()) {
            if (!this.fU()) {
                this.b(7, false);
                return;
            }
            int $$02 = this.bV + 1;
            if ($$02 % 10 == 0) {
                int $$1 = $$02 / 10;
                if ($$1 % 2 == 0) {
                    List<cgv> $$2 = cgv.j.stream().filter($$0 -> chl.b(this.a((cgv)$$0), $$0)).toList();
                    cgv $$3 = bhs.a($$2, this.as);
                    this.a($$3).a(1, this, $$3);
                }
                this.c(etk.n);
            }
        }
    }

    protected boolean fU() {
        if (this.aV() || this.cq() || this.d(cfo.y)) {
            return false;
        }
        for (cgv $$0 : cgv.j) {
            if (!chl.b(this.a($$0), $$0)) continue;
            return true;
        }
        return false;
    }

    protected void fV() {
    }

    protected void q() {
        axf $$1;
        int $$2;
        List<cgk> $$0 = this.ao().k(this, this.dj());
        if ($$0.isEmpty()) {
            return;
        }
        dwo dwo2 = this.ao();
        if (dwo2 instanceof axf && ($$2 = ($$1 = (axf)dwo2).U().a(eua.A).intValue()) > 0 && $$0.size() > $$2 - 1 && this.as.a(4) == 0) {
            int $$3 = 0;
            for (cgk $$4 : $$0) {
                if ($$4.cq()) continue;
                ++$$3;
            }
            if ($$3 > $$2 - 1) {
                this.a($$1, this.en().h(), 6.0f);
            }
        }
        for (cgk $$5 : $$0) {
            this.F($$5);
        }
    }

    protected void a(fth $$0, fth $$1) {
        fth $$2 = $$0.b($$1);
        List<cgk> $$3 = this.ao().a_(this, $$2);
        if (!$$3.isEmpty()) {
            for (cgk $$4 : $$3) {
                if (!($$4 instanceof chl)) continue;
                this.f((chl)$$4);
                this.bW = 0;
                this.k(this.dN().c(-0.2));
                break;
            }
        } else if (this.ad) {
            this.bW = 0;
        }
        if (!this.ao().B_() && this.bW <= 0) {
            this.c(4, false);
            this.bX = 0.0f;
            this.bY = null;
        }
    }

    protected void F(cgk $$0) {
        $$0.h(this);
    }

    protected void f(chl $$0) {
    }

    public boolean fW() {
        return (this.az.a(bk) & 4) != 0;
    }

    @Override
    public void cf() {
        cgk $$0 = this.dz();
        super.cf();
        if ($$0 != null && $$0 != this.dz() && !this.ao().B_()) {
            this.H($$0);
        }
    }

    @Override
    public void t() {
        super.t();
        this.l();
    }

    @Override
    public chf l_() {
        return this.bQ;
    }

    @Override
    public void a(float $$0, int $$1) {
        this.bR = $$0;
        this.bS = $$1;
    }

    public void t(boolean $$0) {
        this.bM = $$0;
    }

    public void a(czl $$0) {
        cgk $$1 = $$0.p();
        if ($$1 instanceof axg) {
            aj.S.a((axg)$$1, $$0.e(), this);
        }
    }

    public void a(cgk $$0, int $$1) {
        if (!$$0.eh() && !this.ao().B_() && ($$0 instanceof czl || $$0 instanceof deh || $$0 instanceof cgz)) {
            ((axf)this.ao()).p().b($$0, new ahn($$0.aA(), this.aA(), $$1));
        }
    }

    public boolean G(cgk $$0) {
        return this.a($$0, dvw.a.a, dvw.b.a, $$0.dT());
    }

    public boolean a(cgk $$0, dvw.a $$1, dvw.b $$2, double $$3) {
        if ($$0.ao() != this.ao()) {
            return false;
        }
        ftm $$4 = new ftm(this.dP(), this.dT(), this.dV());
        ftm $$5 = new ftm($$0.dP(), $$3, $$0.dV());
        if ($$5.f($$4) > 128.0) {
            return false;
        }
        return this.ao().a(new dvw($$4, $$5, $$1, $$2, this)).d() == ftk.a.a;
    }

    @Override
    public float j(float $$0) {
        if ($$0 == 1.0f) {
            return this.bE;
        }
        return bgj.i($$0, this.bF, this.bE);
    }

    public float E(float $$0) {
        float $$1 = this.by - this.bx;
        if ($$1 < 0.0f) {
            $$1 += 1.0f;
        }
        return this.bx + $$1 * $$0;
    }

    @Override
    public boolean bX() {
        return !this.eh();
    }

    @Override
    public boolean bY() {
        return this.cb() && !this.au() && !this.fl();
    }

    @Override
    public float cS() {
        return this.bE;
    }

    @Override
    public void r(float $$0) {
        this.bE = $$0;
    }

    @Override
    public void s(float $$0) {
        this.bC = $$0;
    }

    @Override
    public ftm a(iz.a $$0, ber.a $$1) {
        return chl.n(super.a($$0, $$1));
    }

    public static ftm n(ftm $$0) {
        return new ftm($$0.g, $$0.h, 0.0);
    }

    public float fX() {
        return this.cy;
    }

    public final void F(float $$0) {
        this.G(bgj.a($$0, 0.0f, this.fr()));
    }

    protected void G(float $$0) {
        this.cy = $$0;
    }

    public void g_() {
    }

    public void P_() {
    }

    protected void fY() {
        this.cr = true;
    }

    public abstract chb at();

    public boolean fZ() {
        return (this.az.a(bk) & 1) > 0;
    }

    public cdb ga() {
        return (this.az.a(bk) & 2) > 0 ? cdb.b : cdb.a;
    }

    private void N() {
        if (this.fZ()) {
            if (dlt.b(this.b(this.ga()), this.bT)) {
                this.bT = this.b(this.ga());
                this.a_(this.bT);
            } else {
                this.gf();
            }
        }
    }

    private @Nullable czl b(dlt $$0, boolean $$1, boolean $$2) {
        if ($$0.f()) {
            return null;
        }
        double $$3 = this.dT() - (double)0.3f;
        czl $$4 = new czl(this.ao(), this.dP(), $$3, this.dV(), $$0);
        $$4.a(40);
        if ($$2) {
            $$4.b((cgk)this);
        }
        if ($$1) {
            float $$5 = this.as.i() * 0.5f;
            float $$6 = this.as.i() * ((float)Math.PI * 2);
            $$4.m(-bgj.a((double)$$6) * $$5, 0.2f, bgj.b((double)$$6) * $$5);
        } else {
            float $$7 = 0.3f;
            float $$8 = bgj.a((double)(this.ee() * ((float)Math.PI / 180)));
            float $$9 = bgj.b((double)(this.ee() * ((float)Math.PI / 180)));
            float $$10 = bgj.a((double)(this.ec() * ((float)Math.PI / 180)));
            float $$11 = bgj.b((double)(this.ec() * ((float)Math.PI / 180)));
            float $$12 = this.as.i() * ((float)Math.PI * 2);
            float $$13 = 0.02f * this.as.i();
            $$4.m((double)(-$$10 * $$9 * 0.3f) + Math.cos($$12) * (double)$$13, -$$8 * 0.3f + 0.1f + (this.as.i() - this.as.i()) * 0.1f, (double)($$11 * $$9 * 0.3f) + Math.sin($$12) * (double)$$13);
        }
        return $$4;
    }

    protected void a_(dlt $$0) {
        $$0.b(this.ao(), this, this.gc());
        if (--this.bU == 0 && !this.ao().B_() && !$$0.x()) {
            this.Q_();
        }
    }

    private void P() {
        this.cF = this.cE;
        this.cE = this.cC() ? Math.min(1.0f, this.cE + 0.09f) : Math.max(0.0f, this.cE - 0.09f);
    }

    protected void c(int $$0, boolean $$1) {
        int $$2 = this.az.a(bk).byteValue();
        $$2 = $$1 ? ($$2 |= $$0) : ($$2 &= ~$$0);
        this.az.a(bk, (byte)$$2);
    }

    public void c(cdb $$0) {
        dlt $$1 = this.b($$0);
        if ($$1.f() || this.fZ()) {
            return;
        }
        this.bT = $$1;
        this.bU = $$1.a(this);
        if (!this.ao().B_()) {
            this.c(1, true);
            this.c(2, $$0 == cdb.b);
            this.bT.a((cgk)this, etk.D);
            if (this.bT.c(ki.O)) {
                this.bZ = new Object2LongOpenHashMap();
            }
        }
    }

    @Override
    public void a(alw<?> $$0) {
        super.a($$0);
        if (ci.equals($$0)) {
            if (this.ao().B_()) {
                this.gp().ifPresent(this::a);
            }
        } else if (bk.equals($$0) && this.ao().B_()) {
            if (this.fZ() && this.bT.f()) {
                this.bT = this.b(this.ga());
                if (!this.bT.f()) {
                    this.bU = this.bT.a(this);
                }
            } else if (!this.fZ() && !this.bT.f()) {
                this.bT = dlt.l;
                this.bU = 0;
            }
        }
    }

    @Override
    public void a(ep.a $$0, ftm $$1) {
        super.a($$0, $$1);
        this.bF = this.bE;
        this.bD = this.bC = this.bE;
    }

    @Override
    public float t(float $$0) {
        return bgj.h($$0, this.bD, this.bC);
    }

    public void b(dlt $$0, int $$1) {
        for (int $$2 = 0; $$2 < $$1; ++$$2) {
            ftm $$3 = new ftm(((double)this.as.i() - 0.5) * 0.1, (double)this.as.i() * 0.1 + 0.1, 0.0);
            $$3 = $$3.a(-this.ee() * ((float)Math.PI / 180));
            $$3 = $$3.b(-this.ec() * ((float)Math.PI / 180));
            double $$4 = (double)(-this.as.i()) * 0.6 - 0.3;
            ftm $$5 = new ftm(((double)this.as.i() - 0.5) * 0.3, $$4, 0.6);
            $$5 = $$5.a(-this.ee() * ((float)Math.PI / 180));
            $$5 = $$5.b(-this.ec() * ((float)Math.PI / 180));
            $$5 = $$5.b(this.dP(), this.dT(), this.dV());
            this.ao().a(new lu(ly.V, $$0), $$5.g, $$5.h, $$5.i, $$3.g, $$3.h + 0.05, $$3.i);
        }
    }

    protected void Q_() {
        if (this.ao().B_() && !this.fZ()) {
            return;
        }
        cdb $$0 = this.ga();
        if (!this.bT.equals(this.b($$0))) {
            this.ge();
            return;
        }
        if (!this.bT.f() && this.fZ()) {
            dlt $$1 = this.bT.a(this.ao(), this);
            if ($$1 != this.bT) {
                this.a($$0, $$1);
            }
            this.gf();
        }
    }

    public void b(dlt $$0) {
    }

    public dlt gb() {
        return this.bT;
    }

    public int gc() {
        return this.bU;
    }

    public int gd() {
        if (this.fZ()) {
            return this.bT.a(this) - this.gc();
        }
        return 0;
    }

    public float H(float $$0) {
        if (!this.fZ()) {
            return 0.0f;
        }
        return (float)this.gd() + $$0;
    }

    public void ge() {
        dlt $$0 = this.b(this.ga());
        if (!this.bT.f() && dlt.b($$0, this.bT)) {
            this.bT = $$0;
            this.bT.a(this.ao(), this, this.gc());
            if (this.bT.x()) {
                this.N();
            }
        }
        this.gf();
    }

    public void gf() {
        if (!this.ao().B_()) {
            boolean $$0 = this.fZ();
            this.bZ = null;
            this.c(1, false);
            if ($$0) {
                this.bT.a((cgk)this, etk.C);
            }
        }
        this.bT = dlt.l;
        this.bU = 0;
    }

    public boolean gg() {
        return this.gh() != null;
    }

    public @Nullable dlt gh() {
        int $$1;
        if (!this.fZ()) {
            return null;
        }
        dnx $$0 = this.bT.a(ki.M);
        if ($$0 != null && ($$1 = this.bT.h().a(this.bT, this) - this.bU) >= $$0.a()) {
            return this.bT;
        }
        return null;
    }

    public boolean gi() {
        return this.cu();
    }

    public boolean gj() {
        return this.i(7);
    }

    @Override
    public boolean cC() {
        return super.cC() || !this.gj() && this.d(chx.b);
    }

    public int gk() {
        return this.bV;
    }

    public boolean b(double $$0, double $$1, double $$2, boolean $$3) {
        chl chl2;
        double $$4 = this.dP();
        double $$5 = this.dR();
        double $$6 = this.dV();
        double $$7 = $$1;
        boolean $$8 = false;
        is $$9 = is.a($$0, $$7, $$2);
        dwo $$10 = this.ao();
        if ($$10.H($$9)) {
            boolean $$11 = false;
            while (!$$11 && $$9.v() > $$10.K_()) {
                is $$12 = $$9.e();
                eoh $$13 = $$10.a_($$12);
                if ($$13.d()) {
                    $$11 = true;
                    continue;
                }
                $$7 -= 1.0;
                $$9 = $$12;
            }
            if ($$11) {
                this.b($$0, $$7, $$2);
                if ($$10.g(this) && !$$10.d(this.dj())) {
                    $$8 = true;
                }
            }
        }
        if (!$$8) {
            this.b($$4, $$5, $$6);
            return false;
        }
        if ($$3) {
            $$10.a((cgk)this, (byte)46);
        }
        if ((chl2 = this) instanceof cht) {
            cht $$14 = (cht)chl2;
            $$14.N().n();
        }
        return true;
    }

    public boolean gl() {
        return !this.fa();
    }

    public boolean gm() {
        return true;
    }

    public void a(is $$0, boolean $$1) {
    }

    public boolean gn() {
        return false;
    }

    @Override
    public final cgn a(chx $$0) {
        return $$0 == chx.c ? bl : this.b($$0).a(this.eF());
    }

    protected cgn b(chx $$0) {
        return this.ay().n().a(this.eE());
    }

    public ImmutableList<chx> go() {
        return ImmutableList.of((Object)chx.a);
    }

    public fth f(chx $$0) {
        cgn $$1 = this.a($$0);
        return new fth(-$$1.a() / 2.0f, 0.0, -$$1.a() / 2.0f, $$1.a() / 2.0f, $$1.b(), $$1.a() / 2.0f);
    }

    protected boolean g(chx $$0) {
        fth $$1 = this.a($$0).a(this.dI());
        return this.ao().b(this, $$1);
    }

    @Override
    public boolean o(boolean $$0) {
        return super.o($$0) && !this.gr();
    }

    public Optional<is> gp() {
        return this.az.a(ci);
    }

    public void g(is $$0) {
        this.az.a(ci, Optional.of($$0));
    }

    public void gq() {
        this.az.a(ci, Optional.empty());
    }

    public boolean gr() {
        return this.gp().isPresent();
    }

    public void b(is $$0) {
        eoh $$1;
        if (this.cq()) {
            this.cf();
        }
        if (($$1 = this.ao().a_($$0)).b() instanceof dzj) {
            this.ao().a($$0, (eoh)$$1.b(dzj.c, true), 3);
        }
        this.c(chx.c);
        this.a($$0);
        this.g($$0);
        this.k(ftm.c);
        this.aF = true;
    }

    private void a(is $$0) {
        this.a_((double)$$0.u() + 0.5, (double)$$0.v() + 0.6875, (double)$$0.w() + 0.5);
    }

    private boolean Q() {
        return this.gp().map($$0 -> this.ao().a_((is)$$0).b() instanceof dzj).orElse(false);
    }

    public void gs() {
        this.gp().filter(this.ao()::H).ifPresent($$0 -> {
            eoh $$1 = this.ao().a_((is)$$0);
            if ($$1.b() instanceof dzj) {
                iz $$2 = (iz)$$1.c(dzj.f);
                this.ao().a((is)$$0, (eoh)$$1.b(dzj.c, false), 3);
                ftm $$3 = dzj.a(this.ay(), (dvx)this.ao(), $$0, $$2, this.ec()).orElseGet(() -> {
                    is $$1 = $$0.d();
                    return new ftm((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5);
                });
                ftm $$4 = ftm.c($$0).d($$3).d();
                float $$5 = (float)bgj.g(bgj.d($$4.i, $$4.g) * 57.2957763671875 - 90.0);
                this.a_($$3.g, $$3.h, $$3.i);
                this.v($$5);
                this.w(0.0f);
            }
        });
        ftm $$02 = this.dI();
        this.c(chx.a);
        this.a_($$02.g, $$02.h, $$02.i);
        this.gq();
    }

    public @Nullable iz gt() {
        is $$0 = this.gp().orElse(null);
        return $$0 != null ? dzj.a(this.ao(), $$0) : null;
    }

    @Override
    public boolean cc() {
        return !this.gr() && super.cc();
    }

    public dlt d(dlt $$0) {
        return dlt.l;
    }

    private static byte g(cgv $$0) {
        return switch ($$0) {
            default -> throw new MatchException(null, null);
            case cgv.a -> 47;
            case cgv.b -> 48;
            case cgv.f -> 49;
            case cgv.e -> 50;
            case cgv.c -> 52;
            case cgv.d -> 51;
            case cgv.g -> 65;
            case cgv.h -> 68;
        };
    }

    public void a(dlp $$0, cgv $$1) {
        this.ao().a((cgk)this, chl.g($$1));
        this.a(this.a($$1), $$1, this.cm);
    }

    private void a(dlt $$0, cgv $$12, cip $$22) {
        $$0.a($$12, (jd<cin> $$1, ciq $$2) -> {
            cio $$3 = $$22.a((jd<cin>)$$1);
            if ($$3 != null) {
                $$3.e((ciq)$$2);
            }
        });
        dsq.a($$0, this, $$12);
    }

    public final boolean e(dlt $$0) {
        if (!this.cb() || this.au()) {
            return false;
        }
        dun $$1 = $$0.a(ki.H);
        if ($$1 == null || !$$1.g()) {
            return false;
        }
        cgv $$2 = $$1.b();
        if (!this.e($$2) || !$$1.a(this.ay())) {
            return false;
        }
        return this.a($$2).f() && this.f($$2);
    }

    protected boolean f(cgv $$0) {
        return true;
    }

    public final cgv f(dlt $$0) {
        dun $$1 = $$0.a(ki.H);
        if ($$1 != null && this.e($$1.b())) {
            return $$1.b();
        }
        return cgv.a;
    }

    public final boolean a(dlt $$0, cgv $$1) {
        dun $$2 = $$0.a(ki.H);
        if ($$2 == null) {
            return $$1 == cgv.a && this.e(cgv.a);
        }
        return $$1 == $$2.b() && this.e($$2.b()) && $$2.a(this.ay());
    }

    private static cic a(chl $$0, cgv $$1) {
        if ($$1 == cgv.f || $$1 == cgv.a || $$1 == cgv.b) {
            return cic.a($$0, $$1);
        }
        return cic.a($$0, $$1, (dlt $$2) -> $$2.f() || $$0.f((dlt)$$2) == $$1);
    }

    private static @Nullable cgv r(int $$0) {
        if ($$0 == 100 + cgv.f.b()) {
            return cgv.f;
        }
        if ($$0 == 100 + cgv.e.b()) {
            return cgv.e;
        }
        if ($$0 == 100 + cgv.d.b()) {
            return cgv.d;
        }
        if ($$0 == 100 + cgv.c.b()) {
            return cgv.c;
        }
        if ($$0 == 98) {
            return cgv.a;
        }
        if ($$0 == 99) {
            return cgv.b;
        }
        if ($$0 == 105) {
            return cgv.g;
        }
        if ($$0 == 106) {
            return cgv.h;
        }
        return null;
    }

    @Override
    public @Nullable cic a_(int $$0) {
        cgv $$1 = chl.r($$0);
        if ($$1 != null) {
            return chl.a(this, $$1);
        }
        return super.a_($$0);
    }

    @Override
    public boolean ea() {
        if (this.au()) {
            return false;
        }
        for (cgv $$0 : cgw.i) {
            if (!this.a($$0).a(bdy.bM)) continue;
            return false;
        }
        return super.ea();
    }

    @Override
    public boolean cF() {
        return !this.ao().B_() && this.d(cfo.x) || super.cF();
    }

    @Override
    public float ed() {
        return this.bC;
    }

    @Override
    public void a(adc $$0) {
        double $$1 = $$0.g();
        double $$2 = $$0.h();
        double $$3 = $$0.i();
        float $$4 = $$0.l();
        float $$5 = $$0.k();
        this.e($$1, $$2, $$3);
        this.bC = $$0.m();
        this.bE = $$0.m();
        this.bD = this.bC;
        this.bF = this.bE;
        this.e($$0.b());
        this.a($$0.e());
        this.a($$1, $$2, $$3, $$4, $$5);
        this.k($$0.j());
    }

    public float gu() {
        dlt $$0 = this.eq();
        dpj $$1 = $$0.a(ki.E);
        return $$1 != null && $$0 == this.fA() ? $$1.b() : 0.0f;
    }

    @Override
    public float eg() {
        float $$0 = (float)this.i(cis.D);
        return this.dl() instanceof ddm ? Math.max($$0, 1.0f) : $$0;
    }

    @Override
    public ftm n(cgk $$0) {
        return this.dI().e(this.a($$0, this.a(this.aF()), this.eF() * this.eE()));
    }

    protected void a(int $$0, double $$1) {
        this.bE = (float)bgj.e(1.0 / (double)$$0, (double)this.bE, $$1);
    }

    @Override
    public void g(int $$0) {
        super.g(bgj.e((double)$$0 * this.i(cis.i)));
    }

    public boolean gv() {
        return false;
    }

    public boolean a(axf $$0, cex $$1) {
        return this.d($$1) || dsq.a($$0, this, $$1);
    }

    public static boolean b(dlt $$0, cgv $$1) {
        if (!$$0.c(ki.J)) {
            return false;
        }
        dun $$2 = $$0.a(ki.H);
        return $$2 != null && $$1 == $$2.b() && !$$0.r();
    }

    @VisibleForTesting
    public int gw() {
        return this.bI;
    }

    @Override
    public boolean gx() {
        return this.i(cis.I) > 0.0;
    }

    @Override
    public Optional<fvx.c> f(axg $$0) {
        if (this.ay || $$0 == this) {
            return Optional.empty();
        }
        if (fvx.a(this, $$0)) {
            return Optional.empty();
        }
        fvt.a $$1 = this.cI.a(this);
        if (fvx.b(this, $$0)) {
            return Optional.of(new fvx.d(this, $$1, $$0));
        }
        if (!fvx.a(this.dM(), $$0)) {
            return Optional.of(new fvx.f(this, $$1, $$0));
        }
        return Optional.of(new fvx.e(this, $$1, $$0));
    }

    @Override
    public fvt.a gy() {
        return this.cI;
    }

    public record a(bcz a, bcz b) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "small;big", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "small;big", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "small;big", "a", "b"}, this, $$0);
        }
    }
}

