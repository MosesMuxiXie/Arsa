/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.minecraft.server.MinecraftServer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class axf
extends dwo
implements axe,
dxn {
    public static final is a = new is(100, 50, 0);
    public static final cch b = ccn.a(12000, 180000);
    public static final cch c = ccn.a(12000, 24000);
    private static final cch B = ccn.a(12000, 180000);
    public static final cch d = ccn.a(3600, 15600);
    private static final Logger C = LogUtils.getLogger();
    private static final int D = 300;
    private static final int E = 65536;
    final List<axg> F = Lists.newArrayList();
    private final axc G;
    private final MinecraftServer H;
    private final fnn I;
    final esv J = new esv();
    private final bcv K;
    private final cef L;
    private final eta<cgk> M;
    private final etl N;
    public boolean e;
    private final bcd O;
    private int P;
    private final flz Q;
    private final fvb<dzq> R = new fvb(this::d);
    private final fvb<fla> S = new fvb(this::d);
    private final flt T = new flt();
    final Set<chn> U = new ObjectOpenHashSet();
    volatile boolean V;
    protected final dfj f;
    private final ObjectLinkedOpenHashSet<dvs> W = new ObjectLinkedOpenHashSet();
    private final List<dvs> X = new ArrayList<dvs>(64);
    private boolean Y;
    private final List<dwb> Z;
    private @Nullable esk aa;
    final Int2ObjectMap<cyd> ab = new Int2ObjectOpenHashMap();
    private final dxk ac;
    private final ffp ad;
    private final boolean ae;
    private final cdi af;
    final bxi ag = new bxi(this);

    public axf(MinecraftServer $$0, Executor $$1, fni.c $$2, fnn $$3, amt<dwo> $$4, esi $$5, boolean $$6, long $$7, List<dwb> $$8, boolean $$9, @Nullable cdi $$10) {
        super($$3, $$4, $$0.bc(), $$5.a(), false, $$6, $$7, $$0.bl());
        this.ae = $$9;
        this.H = $$0;
        this.Z = $$8;
        this.I = $$3;
        eqg $$11 = $$5.b();
        boolean $$12 = $$0.aZ();
        DataFixer $$13 = $$0.aA();
        ers $$14 = new ers(new esd(new esa($$2.f(), $$4, "entities"), $$2.a($$4).resolve("entities"), $$13, $$12, bhz.v), this, $$0);
        this.M = new eta<cgk>(cgk.class, new a(), $$14);
        this.G = new axc(this, $$2, $$13, $$0.ba(), $$1, $$11, $$0.aj().p(), $$0.aj().q(), $$12, this.M::a, () -> $$0.N().A());
        this.G.h().b();
        this.Q = new flz(this);
        if (this.am()) {
            this.ak();
        }
        this.f = this.A().a(dfj.a(this.ap()));
        if (!$$0.X()) {
            $$3.a($$0.w());
        }
        long $$15 = $$0.bb().x().c();
        this.ad = new ffp(this.G.o(), this.J_(), $$0.ba(), $$4, $$11, this.G.i(), this, $$11.d(), $$15, $$13);
        this.ac = new dxk(this, $$0.bb().x(), this.ad);
        this.aa = this.aq() == dwo.j && this.ap().a(esf.c) ? new esk(this, $$15, $$0.bb().B()) : null;
        this.O = new bcd();
        this.N = new etl(this);
        this.af = Objects.requireNonNullElseGet($$10, () -> this.A().a(cdi.b));
        this.K = new bcv();
        this.L = cef.a().a(this).a();
        this.aj();
    }

    @Deprecated
    @VisibleForTesting
    public void a(@Nullable esk $$0) {
        this.aa = $$0;
    }

    public void a(int $$0, int $$1, boolean $$2, boolean $$3) {
        this.I.a($$0);
        this.I.c($$1);
        this.I.b($$1);
        this.I.b($$2);
        this.I.a($$3);
    }

    @Override
    public jd<dxo> a(int $$0, int $$1, int $$2) {
        return this.p().g().d().getNoiseBiome($$0, $$1, $$2, this.p().i().b());
    }

    public dxk b() {
        return this.ac;
    }

    @Override
    public cef c() {
        return this.L;
    }

    public void a(BooleanSupplier $$02) {
        int $$4;
        bzm $$1 = bzl.a();
        this.Y = true;
        cdo $$22 = this.y();
        boolean $$3 = $$22.i();
        if ($$3) {
            $$1.a("world border");
            this.w().t();
            $$1.b("weather");
            this.aC();
            $$1.c();
        }
        if (this.O.a($$4 = this.U().a(eua.K).intValue()) && this.O.a($$4, this.F)) {
            if (this.U().a(eua.a).booleanValue()) {
                long $$5 = this.z.c() + 24000L;
                this.b($$5 - $$5 % 24000L);
            }
            this.aA();
            if (this.U().a(eua.b).booleanValue() && this.ao()) {
                this.k();
            }
        }
        this.aj();
        if ($$3) {
            this.d();
        }
        $$1.a("tickPending");
        if (!this.ar() && $$3) {
            long $$6 = this.au();
            $$1.a("blockTicks");
            this.R.a($$6, 65536, this::c);
            $$1.b("fluidTicks");
            this.S.a($$6, 65536, this::a);
            $$1.c();
        }
        $$1.b("raid");
        if ($$3) {
            this.f.a(this);
        }
        $$1.b("chunkSource");
        this.p().a($$02, true);
        $$1.b("blockEvents");
        if ($$3) {
            this.aD();
        }
        this.Y = false;
        $$1.c();
        boolean $$7 = this.G.k();
        if ($$7) {
            this.l();
        }
        if ($$3) {
            ++this.P;
        }
        if (this.P < 300) {
            $$1.a("entities");
            if (this.aa != null && $$3) {
                $$1.a("dragonFight");
                this.aa.c();
                $$1.c();
            }
            this.J.a((cgk $$2) -> {
                if ($$2.eh()) {
                    return;
                }
                if ($$22.a((cgk)$$2)) {
                    return;
                }
                $$1.a("checkDespawn");
                $$2.dW();
                $$1.c();
                if (!($$2 instanceof axg) && !this.G.a.i().c($$2.dM().b())) {
                    return;
                }
                cgk $$3 = $$2.dz();
                if ($$3 != null) {
                    if ($$3.eh() || !$$3.z((cgk)$$2)) {
                        $$2.cf();
                    } else {
                        return;
                    }
                }
                $$1.a("tick");
                this.a(this::a, $$2);
                $$1.c();
            });
            $$1.b("blockEntities");
            this.ai();
            $$1.c();
        }
        $$1.a("entityManagement");
        this.M.b();
        $$1.c();
        $$1.a("debugSynchronizers");
        if (this.ag.a(bxf.o)) {
            this.r.a((is $$0) -> this.ag.b((is)$$0, bxf.o, $$0));
        } else {
            this.r.a(null);
        }
        this.ag.a(this.H.bw());
        $$1.c();
        this.c().b();
    }

    @Override
    public boolean a(long $$0) {
        return this.G.a.i().d($$0);
    }

    protected void d() {
        if (!this.ae) {
            return;
        }
        long $$0 = this.z.b() + 1L;
        this.I.a($$0);
        bzl.a().a("scheduledFunctions");
        this.I.r().a(this.H, $$0);
        bzl.a().c();
        if (this.U().a(eua.a).booleanValue()) {
            this.b(this.z.c() + 1L);
        }
    }

    public void b(long $$0) {
        this.I.b($$0);
    }

    public long e() {
        return this.al() / 24000L;
    }

    public void a(boolean $$0) {
        for (dwb $$1 : this.Z) {
            $$1.a(this, $$0);
        }
    }

    private void aA() {
        this.O.a();
        this.F.stream().filter(chl::gr).collect(Collectors.toList()).forEach($$0 -> $$0.a(false, false));
    }

    public void a(eqq $$0, int $$1) {
        dvu $$2 = $$0.f();
        int $$3 = $$2.e();
        int $$4 = $$2.f();
        bzm $$5 = bzl.a();
        $$5.a("iceandsnow");
        for (int $$6 = 0; $$6 < $$1; ++$$6) {
            if (this.y.a(48) != 0) continue;
            this.a(this.a($$3, 0, $$4, 15));
        }
        $$5.b("tickBlocks");
        if ($$1 > 0) {
            eqr[] $$7 = $$0.d();
            for (int $$8 = 0; $$8 < $$7.length; ++$$8) {
                eqr $$9 = $$7[$$8];
                if (!$$9.d()) continue;
                int $$10 = $$0.h($$8);
                int $$11 = jw.c($$10);
                for (int $$12 = 0; $$12 < $$1; ++$$12) {
                    flb $$15;
                    is $$13 = this.a($$3, $$11, $$4, 15);
                    $$5.a("randomTick");
                    eoh $$14 = $$9.a($$13.u() - $$3, $$13.v() - $$11, $$13.w() - $$4);
                    if ($$14.z()) {
                        $$14.b(this, $$13, this.y);
                    }
                    if (($$15 = $$14.y()).f()) {
                        $$15.a(this, $$13, this.y);
                    }
                    $$5.c();
                }
            }
        }
        $$5.c();
    }

    public void a(eqq $$0) {
        is $$6;
        dvu $$1 = $$0.f();
        boolean $$2 = this.ao();
        int $$3 = $$1.e();
        int $$4 = $$1.f();
        bzm $$5 = bzl.a();
        $$5.a("thunder");
        if ($$2 && this.an() && this.y.a(100000) == 0 && this.v($$6 = this.b(this.a($$3, 0, $$4, 15)))) {
            chk $$10;
            cuv $$9;
            boolean $$8;
            cda $$7 = this.c($$6);
            boolean bl2 = $$8 = this.U().a(eua.V) != false && this.y.j() < (double)$$7.b() * 0.01 && !this.a_($$6.e()).a(bdp.aj);
            if ($$8 && ($$9 = cgu.bo.a(this, cgt.h)) != null) {
                $$9.x(true);
                $$9.d_(0);
                $$9.a_($$6.u(), $$6.v(), $$6.w());
                this.b($$9);
            }
            if (($$10 = cgu.aB.a(this, cgt.h)) != null) {
                $$10.f(ftm.c($$6));
                $$10.a($$8);
                this.b($$10);
            }
        }
        $$5.c();
    }

    @VisibleForTesting
    public void a(is $$0) {
        is $$1 = this.a(euq.a.e, $$0);
        is $$2 = $$1.e();
        dxo $$3 = this.z($$1).a();
        if ($$3.a(this, $$2)) {
            this.c($$2, dzs.eq.m());
        }
        if (this.ao()) {
            dxo.c $$8;
            int $$4 = this.U().a(eua.C);
            if ($$4 > 0 && $$3.b(this, $$1)) {
                eoh $$5 = this.a_($$1);
                if ($$5.a(dzs.ep)) {
                    int $$6 = $$5.c(eho.c);
                    if ($$6 < Math.min($$4, 8)) {
                        eoh $$7 = (eoh)$$5.b(eho.c, $$6 + 1);
                        dzq.a($$5, $$7, this, $$1);
                        this.c($$1, $$7);
                    }
                } else {
                    this.c($$1, dzs.ep.m());
                }
            }
            if (($$8 = $$3.a($$2, this.V())) != dxo.c.a) {
                eoh $$9 = this.a_($$2);
                $$9.b().a($$9, (dwo)this, $$2, $$8);
            }
        }
    }

    private Optional<is> K(is $$02) {
        Optional<is> $$1 = this.F().e($$0 -> $$0.a(ctb.t), $$0 -> $$0.v() == this.a(euq.a.b, $$0.u(), $$0.w()) - 1, $$02, 128, csx.b.c);
        return $$1.map($$0 -> $$0.b(1));
    }

    protected is b(is $$02) {
        is $$1 = this.a(euq.a.e, $$02);
        Optional<is> $$2 = this.K($$1);
        if ($$2.isPresent()) {
            return $$2.get();
        }
        fth $$3 = fth.a($$1, $$1.h(this.aw() + 1)).g(3.0);
        List<chl> $$4 = this.a(chl.class, $$3, (? super T $$0) -> $$0.cb() && this.k($$0.dK()));
        if (!$$4.isEmpty()) {
            return $$4.get(this.y.a($$4.size())).dK();
        }
        if ($$1.v() == this.K_() - 1) {
            $$1 = $$1.b(2);
        }
        return $$1;
    }

    public boolean f() {
        return this.Y;
    }

    public boolean g() {
        return this.U().a(eua.K) <= 100;
    }

    private void aB() {
        yw $$2;
        if (!this.g()) {
            return;
        }
        if (this.s().X() && !this.s().q()) {
            return;
        }
        int $$0 = this.U().a(eua.K);
        if (this.O.a($$0)) {
            yw $$1 = yh.c("sleep.skipping_night");
        } else {
            $$2 = yh.a("sleep.players_sleeping", this.O.b(), this.O.b($$0));
        }
        for (axg $$3 : this.F) {
            $$3.a($$2, true);
        }
    }

    public void h() {
        if (!this.F.isEmpty() && this.O.a(this.F)) {
            this.aB();
        }
    }

    public anm i() {
        return this.H.aK();
    }

    public bcv j() {
        return this.K;
    }

    @Override
    public cda c(is $$0) {
        long $$1 = 0L;
        float $$2 = 0.0f;
        eqf $$3 = this.a(jw.a($$0.u()), jw.a($$0.w()), erj.n, false);
        if ($$3 != null) {
            $$1 = $$3.w();
            $$2 = this.d($$0);
        }
        return new cda(this.av(), this.al(), $$1, $$2);
    }

    public float d(is $$0) {
        dwy $$1 = this.L.a(ceg.p, $$0);
        return esh.k[$$1.a()];
    }

    private void aC() {
        boolean $$0 = this.ao();
        if (this.am()) {
            if (this.U().a(eua.b).booleanValue()) {
                int $$1 = this.I.e();
                int $$2 = this.I.g();
                int $$3 = this.I.i();
                boolean $$4 = this.z.f();
                boolean $$5 = this.z.h();
                if ($$1 > 0) {
                    --$$1;
                    $$2 = $$4 ? 0 : 1;
                    $$3 = $$5 ? 0 : 1;
                    $$4 = false;
                    $$5 = false;
                } else {
                    if ($$2 > 0) {
                        if (--$$2 == 0) {
                            $$4 = !$$4;
                        }
                    } else {
                        $$2 = $$4 ? d.a(this.y) : B.a(this.y);
                    }
                    if ($$3 > 0) {
                        if (--$$3 == 0) {
                            $$5 = !$$5;
                        }
                    } else {
                        $$3 = $$5 ? c.a(this.y) : b.a(this.y);
                    }
                }
                this.I.b($$2);
                this.I.c($$3);
                this.I.a($$1);
                this.I.a($$4);
                this.I.b($$5);
            }
            this.w = this.x;
            this.x = this.z.f() ? (this.x += 0.01f) : (this.x -= 0.01f);
            this.x = bgj.a(this.x, 0.0f, 1.0f);
            this.u = this.v;
            this.v = this.z.h() ? (this.v += 0.01f) : (this.v -= 0.01f);
            this.v = bgj.a(this.v, 0.0f, 1.0f);
        }
        if (this.u != this.v) {
            this.H.aj().a(new aem(aem.i, this.v), this.aq());
        }
        if (this.w != this.x) {
            this.H.aj().a(new aem(aem.j, this.x), this.aq());
        }
        if ($$0 != this.ao()) {
            if ($$0) {
                this.H.aj().a(new aem(aem.d, 0.0f));
            } else {
                this.H.aj().a(new aem(aem.c, 0.0f));
            }
            this.H.aj().a(new aem(aem.i, this.v));
            this.H.aj().a(new aem(aem.j, this.x));
        }
    }

    @VisibleForTesting
    public void k() {
        this.I.c(0);
        this.I.b(false);
        this.I.b(0);
        this.I.a(false);
    }

    public void l() {
        this.P = 0;
    }

    private void a(is $$0, fla $$1) {
        eoh $$2 = this.a_($$0);
        flb $$3 = $$2.y();
        if ($$3.b($$1)) {
            $$3.a(this, $$0, $$2);
        }
    }

    private void c(is $$0, dzq $$1) {
        eoh $$2 = this.a_($$0);
        if ($$2.a($$1)) {
            $$2.a(this, $$0, this.y);
        }
    }

    public void a(cgk $$0) {
        $$0.bP();
        bzm $$1 = bzl.a();
        ++$$0.at;
        $$1.a(() -> mi.g.b($$0.ay()).toString());
        $$1.f("tickNonPassenger");
        $$0.g();
        $$1.c();
        for (cgk $$2 : $$0.dn()) {
            this.a($$0, $$2);
        }
    }

    private void a(cgk $$0, cgk $$1) {
        if ($$1.eh() || $$1.dz() != $$0) {
            $$1.cf();
            return;
        }
        if (!($$1 instanceof ddm) && !this.J.c($$1)) {
            return;
        }
        $$1.bP();
        ++$$1.at;
        bzm $$2 = bzl.a();
        $$2.a(() -> mi.g.b($$1.ay()).toString());
        $$2.f("tickPassenger");
        $$1.t();
        $$2.c();
        for (cgk $$3 : $$1.dn()) {
            this.a($$1, $$3);
        }
    }

    public void a(is $$0, eoh $$1) {
        boolean $$4;
        eoh $$2 = this.a_($$0);
        dzq $$3 = $$2.b();
        boolean bl2 = $$4 = !$$1.a($$3);
        if ($$4) {
            $$1.a(this, $$0, false);
        }
        this.a($$0, $$2.b());
        if ($$2.q()) {
            this.b($$0, $$3);
        }
    }

    @Override
    public boolean a(cgk $$0, is $$1) {
        ddm $$2;
        return !($$0 instanceof ddm) || !this.H.a(this, $$1, $$2 = (ddm)$$0) && this.w().a($$1);
    }

    public void a(@Nullable bgq $$0, boolean $$1, boolean $$2) {
        axc $$3 = this.p();
        if ($$2) {
            return;
        }
        if ($$0 != null) {
            $$0.a(yh.c("menu.savingLevel"));
        }
        this.c($$1);
        if ($$0 != null) {
            $$0.c(yh.c("menu.savingChunks"));
        }
        $$3.a($$1);
        if ($$1) {
            this.M.d();
        } else {
            this.M.c();
        }
    }

    private void c(boolean $$0) {
        if (this.aa != null) {
            this.H.bb().a(this.aa.b());
        }
        fnc $$1 = this.p().m();
        if ($$0) {
            $$1.b();
        } else {
            $$1.a();
        }
    }

    public <T extends cgk> List<? extends T> a(esw<cgk, T> $$0, Predicate<? super T> $$1) {
        ArrayList $$2 = Lists.newArrayList();
        this.a($$0, $$1, $$2);
        return $$2;
    }

    public <T extends cgk> void a(esw<cgk, T> $$0, Predicate<? super T> $$1, List<? super T> $$2) {
        this.a($$0, $$1, $$2, Integer.MAX_VALUE);
    }

    public <T extends cgk> void a(esw<cgk, T> $$0, Predicate<? super T> $$1, List<? super T> $$2, int $$32) {
        this.M().a($$0, (U $$3) -> {
            if ($$1.test($$3)) {
                $$2.add((Object)$$3);
                if ($$2.size() >= $$32) {
                    return bem.a.b;
                }
            }
            return bem.a.a;
        });
    }

    public List<? extends cyc> m() {
        return this.a(cgu.T, chl::cb);
    }

    public List<axg> a(Predicate<? super axg> $$0) {
        return this.a($$0, Integer.MAX_VALUE);
    }

    public List<axg> a(Predicate<? super axg> $$0, int $$1) {
        ArrayList $$2 = Lists.newArrayList();
        for (axg $$3 : this.F) {
            if (!$$0.test($$3)) continue;
            $$2.add($$3);
            if ($$2.size() < $$1) continue;
            return $$2;
        }
        return $$2;
    }

    public @Nullable axg n() {
        List<axg> $$0 = this.a(chl::cb);
        if ($$0.isEmpty()) {
            return null;
        }
        return $$0.get(this.y.a($$0.size()));
    }

    @Override
    public boolean b(cgk $$0) {
        return this.i($$0);
    }

    public boolean c(cgk $$0) {
        return this.i($$0);
    }

    public void d(cgk $$0) {
        if ($$0 instanceof axg) {
            axg $$1 = (axg)$$0;
            this.c($$1);
        } else {
            this.i($$0);
        }
    }

    public void a(axg $$0) {
        this.c($$0);
    }

    public void b(axg $$0) {
        this.c($$0);
    }

    private void c(axg $$0) {
        cgk $$1 = this.d($$0.cY());
        if ($$1 != null) {
            C.warn("Force-added player with duplicate UUID {}", (Object)$$0.cY());
            $$1.aw();
            this.a((axg)$$1, cgk.e.b);
        }
        this.M.a($$0);
    }

    private boolean i(cgk $$0) {
        if ($$0.eh()) {
            C.warn("Tried to add entity {} but it was marked as removed already", (Object)cgu.a($$0.ay()));
            return false;
        }
        return this.M.a($$0);
    }

    public boolean e(cgk $$0) {
        if ($$0.dp().map(cgk::cY).anyMatch(this.M::a)) {
            return false;
        }
        this.a_($$0);
        return true;
    }

    public void b(eqq $$0) {
        $$0.K();
        $$0.c(this);
        this.ag.a($$0.f());
    }

    public void a(axg $$0, cgk.e $$1) {
        $$0.a($$1);
    }

    @Override
    public void a(int $$0, is $$1, int $$2) {
        for (axg $$3 : this.H.aj().t()) {
            double $$6;
            double $$5;
            double $$4;
            if ($$3.A() != this || $$3.aA() == $$0 || !(($$4 = (double)$$1.u() - $$3.dP()) * $$4 + ($$5 = (double)$$1.v() - $$3.dR()) * $$5 + ($$6 = (double)$$1.w() - $$3.dV()) * $$6 < 1024.0)) continue;
            $$3.g.b(new adg($$0, $$1, $$2));
        }
    }

    @Override
    public void a(@Nullable cgk $$0, double $$1, double $$2, double $$3, jd<bcz> $$4, bdb $$5, float $$6, float $$7, long $$8) {
        ddm $$9;
        this.H.aj().a($$0 instanceof ddm ? ($$9 = (ddm)$$0) : null, $$1, $$2, $$3, $$4.a().a($$6), this.aq(), new ahh($$4, $$5, $$1, $$2, $$3, $$6, $$7, $$8));
    }

    @Override
    public void a(@Nullable cgk $$0, cgk $$1, jd<bcz> $$2, bdb $$3, float $$4, float $$5, long $$6) {
        ddm $$7;
        this.H.aj().a($$0 instanceof ddm ? ($$7 = (ddm)$$0) : null, $$1.dP(), $$1.dR(), $$1.dV(), $$2.a().a($$4), this.aq(), new ahg($$2, $$3, $$1, $$4, $$5, $$6));
    }

    @Override
    public void b(int $$0, is $$1, int $$2) {
        if (this.U().a(eua.q).booleanValue()) {
            this.H.aj().t().forEach($$3 -> {
                ftm $$8;
                if ($$3.A() == this) {
                    ftm $$4 = ftm.b($$1);
                    if ($$3.g($$4) < (double)bgj.i(32)) {
                        ftm $$5 = $$4;
                    } else {
                        ftm $$6 = $$4.d($$3.dI()).d();
                        ftm $$7 = $$3.dI().e($$6.c(32.0));
                    }
                } else {
                    $$8 = $$3.dI();
                }
                $$3.g.b(new aes($$0, is.a($$8), $$2, true));
            });
        } else {
            this.a(null, $$0, $$1, $$2);
        }
    }

    @Override
    public void a(@Nullable cgk $$0, int $$1, is $$2, int $$3) {
        ddm $$4;
        this.H.aj().a($$0 instanceof ddm ? ($$4 = (ddm)$$0) : null, $$2.u(), $$2.v(), $$2.w(), 64.0, this.aq(), new aes($$1, $$2, $$3, false));
    }

    public int o() {
        return this.F_().j();
    }

    @Override
    public void a(jd<etk> $$0, ftm $$1, etk.a $$2) {
        this.N.a($$0, $$1, $$2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(is $$0, eoh $$1, eoh $$2, int $$3) {
        if (this.V) {
            String $$4 = "recursive call to sendBlockUpdated";
            bhs.a("recursive call to sendBlockUpdated", (Throwable)new IllegalStateException("recursive call to sendBlockUpdated"));
        }
        this.p().a($$0);
        this.T.a($$0);
        fug $$5 = $$1.g(this, $$0);
        fug $$6 = $$2.g(this, $$0);
        if (!fud.c($$5, $$6, ftq.g)) {
            return;
        }
        ObjectArrayList $$7 = new ObjectArrayList();
        for (chn $$8 : this.U) {
            cre $$9 = $$8.N();
            if (!$$9.b($$0)) continue;
            $$7.add($$9);
        }
        try {
            this.V = true;
            for (cre $$10 : $$7) {
                $$10.i();
            }
        }
        finally {
            this.V = false;
        }
    }

    @Override
    public void a(is $$0, dzq $$1) {
        this.a($$0, $$1, fmf.a(this, null, null));
    }

    @Override
    public void a(is $$0, dzq $$1, @Nullable fmj $$2) {
        this.r.a($$0, $$1, null, $$2);
    }

    @Override
    public void a(is $$0, dzq $$1, iz $$2, @Nullable fmj $$3) {
        this.r.a($$0, $$1, $$2, $$3);
    }

    @Override
    public void b(is $$0, dzq $$1, @Nullable fmj $$2) {
        this.r.a($$0, $$1, $$2);
    }

    @Override
    public void a(eoh $$0, is $$1, dzq $$2, @Nullable fmj $$3, boolean $$4) {
        this.r.a($$0, $$1, $$2, $$3, $$4);
    }

    @Override
    public void a(cgk $$0, byte $$1) {
        this.p().a($$0, new aei($$0, $$1));
    }

    @Override
    public void a(cgk $$0, cex $$1) {
        this.p().a($$0, new aea($$0, $$1));
    }

    public axc p() {
        return this.G;
    }

    @Override
    public void a(@Nullable cgk $$0, @Nullable cex $$1, @Nullable dwj $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, dwo.a $$8, lw $$9, lw $$10, cbn<lt> $$11, jd<bcz> $$12) {
        dwi.a $$13 = switch ($$8) {
            default -> throw new MatchException(null, null);
            case dwo.a.a -> dwi.a.a;
            case dwo.a.b -> this.a(eua.e);
            case dwo.a.c -> {
                if (this.U().a(eua.F).booleanValue()) {
                    yield this.a(eua.E);
                }
                yield dwi.a.a;
            }
            case dwo.a.d -> this.a(eua.ae);
            case dwo.a.e -> dwi.a.d;
        };
        ftm $$14 = new ftm($$3, $$4, $$5);
        dxe $$15 = new dxe(this, $$0, $$1, $$2, $$14, $$6, $$7, $$13);
        int $$16 = $$15.i();
        lw $$17 = $$15.l() ? $$9 : $$10;
        for (axg $$18 : this.F) {
            if (!($$18.g($$14) < 4096.0)) continue;
            Optional<ftm> $$19 = Optional.ofNullable($$15.j().get($$18));
            $$18.g.b(new aek($$14, $$6, $$16, $$19, $$17, $$12, $$11));
        }
    }

    private dwi.a a(etv<Boolean> $$0) {
        return this.U().a($$0) != false ? dwi.a.c : dwi.a.b;
    }

    @Override
    public void a(is $$0, dzq $$1, int $$2, int $$3) {
        this.W.add((Object)new dvs($$0, $$1, $$2, $$3));
    }

    private void aD() {
        this.X.clear();
        while (!this.W.isEmpty()) {
            dvs $$0 = (dvs)this.W.removeFirst();
            if (this.r($$0.a())) {
                if (!this.a($$0)) continue;
                this.H.aj().a(null, $$0.a().u(), $$0.a().v(), $$0.a().w(), 64.0, this.aq(), new adi($$0.a(), $$0.b(), $$0.c(), $$0.d()));
                continue;
            }
            this.X.add($$0);
        }
        this.W.addAll(this.X);
    }

    private boolean a(dvs $$0) {
        eoh $$1 = this.a_($$0.a());
        if ($$1.a($$0.b())) {
            return $$1.a((dwo)this, $$0.a(), $$0.c(), $$0.d());
        }
        return false;
    }

    public fvb<dzq> q() {
        return this.R;
    }

    public fvb<fla> r() {
        return this.S;
    }

    @Override
    public MinecraftServer s() {
        return this.H;
    }

    public flz t() {
        return this.Q;
    }

    public fjr u() {
        return this.H.ba();
    }

    public <T extends lw> int a(T $$0, double $$1, double $$2, double $$3, int $$4, double $$5, double $$6, double $$7, double $$8) {
        return this.a($$0, false, false, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
    }

    public <T extends lw> int a(T $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, int $$6, double $$7, double $$8, double $$9, double $$10) {
        aet $$11 = new aet($$0, $$1, $$2, $$3, $$4, $$5, (float)$$7, (float)$$8, (float)$$9, (float)$$10, $$6);
        int $$12 = 0;
        for (int $$13 = 0; $$13 < this.F.size(); ++$$13) {
            axg $$14 = this.F.get($$13);
            if (!this.a($$14, $$1, $$3, $$4, $$5, $$11)) continue;
            ++$$12;
        }
        return $$12;
    }

    public <T extends lw> boolean a(axg $$0, T $$1, boolean $$2, boolean $$3, double $$4, double $$5, double $$6, int $$7, double $$8, double $$9, double $$10, double $$11) {
        aet $$12 = new aet($$1, $$2, $$3, $$4, $$5, $$6, (float)$$8, (float)$$9, (float)$$10, (float)$$11, $$7);
        return this.a($$0, $$2, $$4, $$5, $$6, $$12);
    }

    private boolean a(axg $$0, boolean $$1, double $$2, double $$3, double $$4, aay<?> $$5) {
        if ($$0.A() != this) {
            return false;
        }
        is $$6 = $$0.dK();
        if ($$6.a(new ftm($$2, $$3, $$4), $$1 ? 512.0 : 32.0)) {
            $$0.g.b($$5);
            return true;
        }
        return false;
    }

    @Override
    public @Nullable cgk a(int $$0) {
        return this.M().a($$0);
    }

    @Override
    public @Nullable cgk a(UUID $$0) {
        cgk $$1 = this.d($$0);
        if ($$1 != null) {
            return $$1;
        }
        for (axf $$2 : this.s().P()) {
            cgk $$3;
            if ($$2 == this || ($$3 = $$2.d($$0)) == null) continue;
            return $$3;
        }
        return null;
    }

    @Override
    public @Nullable ddm b(UUID $$0) {
        return this.s().aj().b($$0);
    }

    @Deprecated
    public @Nullable cgk b(int $$0) {
        cgk $$1 = this.M().a($$0);
        if ($$1 != null) {
            return $$1;
        }
        return (cgk)this.ab.get($$0);
    }

    @Override
    public Collection<cyd> v() {
        return this.ab.values();
    }

    public @Nullable is a(bef<ffo> $$0, is $$1, int $$2, boolean $$3) {
        if (!this.H.bb().x().d()) {
            return null;
        }
        Optional $$4 = this.J_().f(mj.bs).a($$0);
        if ($$4.isEmpty()) {
            return null;
        }
        Pair<is, jd<ffo>> $$5 = this.p().g().a(this, (jh)$$4.get(), $$1, $$2, $$3);
        return $$5 != null ? (is)$$5.getFirst() : null;
    }

    public @Nullable Pair<is, jd<dxo>> a(Predicate<jd<dxo>> $$0, is $$1, int $$2, int $$3, int $$4) {
        return this.p().g().d().a($$1, $$2, $$3, $$4, $$0, this.p().i().b(), this);
    }

    @Override
    public eqa w() {
        eqa $$0 = this.A().a(eqa.d);
        $$0.a(this.z.b());
        return $$0;
    }

    public dqz x() {
        return this.H.aJ();
    }

    @Override
    public cdo y() {
        return this.H.aR();
    }

    @Override
    public boolean z() {
        return this.e;
    }

    public fnc A() {
        return this.p().m();
    }

    @Override
    public @Nullable fmw a(fmu $$0) {
        return this.s().N().A().b(fmw.a($$0));
    }

    public void a(fmu $$0, fmw $$1) {
        this.s().N().A().a(fmw.a($$0), $$1);
    }

    public fmu B() {
        return this.s().N().A().a(fmv.b).b();
    }

    @Override
    public void a(fne.a $$0) {
        this.s().a($$0);
    }

    @Override
    public fne.a C() {
        return this.s().aI();
    }

    public LongSet D() {
        return this.G.l();
    }

    public boolean a(int $$0, int $$1, boolean $$2) {
        boolean $$3 = this.G.a(new dvu($$0, $$1), $$2);
        if ($$2 && $$3) {
            this.d($$0, $$1);
        }
        return $$3;
    }

    public List<axg> E() {
        return this.F;
    }

    @Override
    public void a(is $$0, eoh $$12, eoh $$2) {
        Optional<jd<cta>> $$4;
        Optional<jd<cta>> $$3 = ctb.a($$12);
        if (Objects.equals($$3, $$4 = ctb.a($$2))) {
            return;
        }
        is $$5 = $$0.j();
        $$3.ifPresent($$1 -> this.s().execute(() -> {
            this.F().a($$5);
            this.ag.c($$5);
        }));
        $$4.ifPresent($$1 -> this.s().execute(() -> {
            csy $$2 = this.F().a($$5, (jd<cta>)$$1);
            if ($$2 != null) {
                this.ag.a($$2);
            }
        }));
    }

    public csx F() {
        return this.p().n();
    }

    public boolean e(is $$0) {
        return this.a($$0, 1);
    }

    public boolean a(jw $$0) {
        return this.e($$0.k());
    }

    public boolean a(is $$0, int $$1) {
        if ($$1 > 6) {
            return false;
        }
        return this.b(jw.a($$0)) <= $$1;
    }

    public int b(jw $$0) {
        return this.F().a($$0);
    }

    public dfj G() {
        return this.f;
    }

    public @Nullable dfh f(is $$0) {
        return this.f.a($$0, 9216);
    }

    public boolean g(is $$0) {
        return this.f($$0) != null;
    }

    public void a(csu $$0, cgk $$1, cia $$2) {
        $$2.a($$0, $$1);
    }

    public void a(Path $$0) throws IOException {
        awj $$1 = this.p().a;
        try (BufferedWriter $$2 = Files.newBufferedWriter($$0.resolve("stats.txt"), new OpenOption[0]);){
            $$2.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", $$1.i().a()));
            dwz.d $$3 = this.p().p();
            if ($$3 != null) {
                for (Object2IntMap.Entry $$4 : $$3.b().object2IntEntrySet()) {
                    $$2.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((cho)$$4.getKey()).a(), $$4.getIntValue()));
                }
            }
            $$2.write(String.format(Locale.ROOT, "entities: %s\n", this.M.f()));
            $$2.write(String.format(Locale.ROOT, "block_entity_tickers: %d\n", this.q.size()));
            $$2.write(String.format(Locale.ROOT, "block_ticks: %d\n", this.q().a()));
            $$2.write(String.format(Locale.ROOT, "fluid_ticks: %d\n", this.r().a()));
            $$2.write("distance_manager: " + $$1.i().c() + "\n");
            $$2.write(String.format(Locale.ROOT, "pending_tasks: %d\n", this.p().f()));
        }
        m $$5 = new m("Level dump", new Exception("dummy"));
        this.a($$5);
        try (BufferedWriter $$6 = Files.newBufferedWriter($$0.resolve("example_crash.txt"), new OpenOption[0]);){
            $$6.write($$5.a(u.c));
        }
        Path $$7 = $$0.resolve("chunks.csv");
        try (BufferedWriter $$8 = Files.newBufferedWriter($$7, new OpenOption[0]);){
            $$1.a($$8);
        }
        Path $$9 = $$0.resolve("entity_chunks.csv");
        try (BufferedWriter $$10 = Files.newBufferedWriter($$9, new OpenOption[0]);){
            this.M.a($$10);
        }
        Path $$11 = $$0.resolve("entities.csv");
        try (BufferedWriter $$12 = Files.newBufferedWriter($$11, new OpenOption[0]);){
            axf.a($$12, this.M().a());
        }
        Path $$13 = $$0.resolve("block_entities.csv");
        try (BufferedWriter $$14 = Files.newBufferedWriter($$13, new OpenOption[0]);){
            this.a($$14);
        }
    }

    private static void a(Writer $$0, Iterable<cgk> $$1) throws IOException {
        bfd $$2 = bfd.a().a("x").a("y").a("z").a("uuid").a("type").a("alive").a("display_name").a("custom_name").a($$0);
        for (cgk $$3 : $$1) {
            yh $$4 = $$3.as();
            yh $$5 = $$3.R_();
            $$2.a($$3.dP(), $$3.dR(), $$3.dV(), $$3.cY(), mi.g.b($$3.ay()), $$3.cb(), $$5.getString(), $$4 != null ? $$4.getString() : null);
        }
    }

    private void a(Writer $$0) throws IOException {
        bfd $$1 = bfd.a().a("x").a("y").a("z").a("type").a($$0);
        for (enc $$2 : this.q) {
            is $$3 = $$2.c();
            $$1.a($$3.u(), $$3.v(), $$3.w(), $$2.d());
        }
    }

    @VisibleForTesting
    public void a(ffg $$0) {
        this.W.removeIf($$1 -> $$0.b($$1.a()));
    }

    @Override
    public float a(iz $$0, boolean $$1) {
        return 1.0f;
    }

    public Iterable<cgk> H() {
        return this.M().a();
    }

    public String toString() {
        return "ServerLevel[" + this.I.d() + "]";
    }

    public boolean I() {
        return this.H.bb().y();
    }

    @Override
    public long J() {
        return this.H.bb().x().c();
    }

    public @Nullable esk K() {
        return this.aa;
    }

    @Override
    public axf a() {
        return this;
    }

    @VisibleForTesting
    public String L() {
        return String.format(Locale.ROOT, "players: %s, entities: %s [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s", this.F.size(), this.M.f(), axf.a(this.M.e().a(), (T $$0) -> mi.g.b($$0.ay()).toString()), this.q.size(), axf.a(this.q, enc::d), this.q().a(), this.r().a(), this.P());
    }

    private static <T> String a(Iterable<T> $$02, Function<T, String> $$1) {
        try {
            Object2IntOpenHashMap $$2 = new Object2IntOpenHashMap();
            for (T $$3 : $$02) {
                String $$4 = $$1.apply($$3);
                $$2.addTo((Object)$$4, 1);
            }
            return $$2.object2IntEntrySet().stream().sorted(Comparator.comparing(Object2IntMap.Entry::getIntValue).reversed()).limit(5L).map($$0 -> (String)$$0.getKey() + ":" + $$0.getIntValue()).collect(Collectors.joining(","));
        }
        catch (Exception $$5) {
            return "";
        }
    }

    @Override
    protected esy<cgk> M() {
        return this.M.e();
    }

    public void a(Stream<cgk> $$0) {
        this.M.a($$0);
    }

    public void b(Stream<cgk> $$0) {
        this.M.b($$0);
    }

    public void c(eqq $$0) {
        $$0.d(this.au());
    }

    public void a(eqf $$0) {
        this.H.execute(() -> this.ad.a($$0.f(), $$0.g()));
    }

    public flt N() {
        return this.T;
    }

    public void a(dvu $$0, int $$1) {
        List<dvu> $$2 = dvu.a($$0, $$1).toList();
        this.H.b(() -> {
            this.M.a();
            for (dvu $$1 : $$2) {
                if (this.c($$1.b())) continue;
                return false;
            }
            return true;
        });
    }

    public boolean O() {
        return this.D_().p() != ccz.a && this.U().a(eua.V) != false && this.U().a(eua.W) != false;
    }

    @Override
    public void close() throws IOException {
        super.close();
        this.M.close();
    }

    @Override
    public String P() {
        return "Chunks[S] W: " + this.G.e() + " E: " + this.M.f();
    }

    public boolean c(long $$0) {
        return this.M.a($$0);
    }

    public boolean d(long $$0) {
        return this.c($$0) && this.G.a($$0);
    }

    public boolean h(is $$0) {
        return this.M.a($$0) && this.G.a.i().c(dvu.a($$0));
    }

    public boolean a(dvu $$0) {
        return this.M.a($$0) && this.M.a($$0.b());
    }

    public boolean i(is $$0) {
        return this.b(new dvu($$0));
    }

    public boolean b(dvu $$0) {
        return this.G.a.b($$0);
    }

    public boolean j(is $$0) {
        int $$1 = this.U().a(eua.n);
        return $$1 == -1 || this.G.a.a($$0, $$1);
    }

    public boolean c(dvu $$0) {
        return this.M.b($$0) && this.w().a($$0);
    }

    @Override
    public dgz Q() {
        return this.H.bb().J();
    }

    @Override
    public dnq R() {
        return this.H.br();
    }

    @Override
    public emb S() {
        return this.H.bs();
    }

    public bgr a(amo $$0) {
        return this.af.a($$0, this.J());
    }

    public cdi T() {
        return this.af;
    }

    public eua U() {
        return this.I.n();
    }

    @Override
    public n a(m $$0) {
        n $$1 = super.a($$0);
        $$1.a("Loaded entity count", () -> String.valueOf(this.M.g()));
        return $$1;
    }

    @Override
    public int V() {
        return this.G.g().f();
    }

    @Override
    public void a(elb $$0) {
        super.a($$0);
        this.ag.a($$0);
    }

    public bxi W() {
        return this.ag;
    }

    public boolean a(dwo $$0) {
        if ($$0.aq() == dwo.i) {
            return this.U().a(eua.c);
        }
        return true;
    }

    public boolean X() {
        return this.U().a(eua.M);
    }

    public boolean Y() {
        return this.U().a(eua.f);
    }

    public boolean Z() {
        return this.U().a(eua.U);
    }

    @Override
    public /* synthetic */ dqt aa() {
        return this.x();
    }

    @Override
    public /* synthetic */ fur ab() {
        return this.i();
    }

    @Override
    public /* synthetic */ eqj ac() {
        return this.p();
    }

    @Override
    public /* synthetic */ cee ad() {
        return this.c();
    }

    public /* synthetic */ fva ae() {
        return this.r();
    }

    public /* synthetic */ fva af() {
        return this.q();
    }

    final class a
    implements esx<cgk> {
        a() {
        }

        @Override
        public void a(cgk $$0) {
            fvx $$1;
            if ($$0 instanceof fvx && ($$1 = (fvx)((Object)$$0)).gx()) {
                axf.this.j().a($$1);
            }
        }

        @Override
        public void b(cgk $$0) {
            if ($$0 instanceof fvx) {
                fvx $$1 = (fvx)((Object)$$0);
                axf.this.j().c($$1);
            }
            axf.this.i().a($$0);
        }

        @Override
        public void c(cgk $$0) {
            axf.this.J.a($$0);
        }

        @Override
        public void d(cgk $$0) {
            axf.this.J.b($$0);
        }

        @Override
        public void e(cgk $$0) {
            fvx $$2;
            axf.this.p().b($$0);
            if ($$0 instanceof axg) {
                axg $$1 = (axg)$$0;
                axf.this.F.add($$1);
                if ($$1.o()) {
                    axf.this.j().a($$1);
                }
                axf.this.h();
            }
            if ($$0 instanceof fvx && ($$2 = (fvx)((Object)$$0)).gx()) {
                axf.this.j().a($$2);
            }
            if ($$0 instanceof chn) {
                chn $$3 = (chn)$$0;
                if (axf.this.V) {
                    String $$4 = "onTrackingStart called during navigation iteration";
                    bhs.a("onTrackingStart called during navigation iteration", (Throwable)new IllegalStateException("onTrackingStart called during navigation iteration"));
                }
                axf.this.U.add($$3);
            }
            if ($$0 instanceof cyc) {
                cyc $$5 = (cyc)$$0;
                for (cyd $$6 : $$5.gM()) {
                    axf.this.ab.put($$6.aA(), (Object)$$6);
                }
            }
            $$0.a(eth::a);
        }

        @Override
        public void f(cgk $$0) {
            axf.this.p().a($$0);
            if ($$0 instanceof axg) {
                axg $$1 = (axg)$$0;
                axf.this.F.remove($$1);
                axf.this.j().c($$1);
                axf.this.h();
            }
            if ($$0 instanceof chn) {
                chn $$2 = (chn)$$0;
                if (axf.this.V) {
                    String $$3 = "onTrackingStart called during navigation iteration";
                    bhs.a("onTrackingStart called during navigation iteration", (Throwable)new IllegalStateException("onTrackingStart called during navigation iteration"));
                }
                axf.this.U.remove($$2);
            }
            if ($$0 instanceof cyc) {
                cyc $$4 = (cyc)$$0;
                for (cyd $$5 : $$4.gM()) {
                    axf.this.ab.remove($$5.aA());
                }
            }
            $$0.a(eth::b);
            axf.this.ag.b($$0);
        }

        @Override
        public void g(cgk $$0) {
            $$0.a(eth::c);
        }

        @Override
        public /* synthetic */ void a(Object object) {
            this.g((cgk)object);
        }

        @Override
        public /* synthetic */ void b(Object object) {
            this.f((cgk)object);
        }

        @Override
        public /* synthetic */ void c(Object object) {
            this.e((cgk)object);
        }

        @Override
        public /* synthetic */ void e(Object object) {
            this.c((cgk)object);
        }

        @Override
        public /* synthetic */ void f(Object object) {
            this.b((cgk)object);
        }

        @Override
        public /* synthetic */ void g(Object object) {
            this.a((cgk)object);
        }
    }
}

