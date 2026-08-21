/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Queues
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.lang.runtime.SwitchBootstraps;
import java.util.Arrays;
import java.util.Collection;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.BooleanSupplier;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class hif
extends dwo
implements hhw.a<hif> {
    private static final Logger b = LogUtils.getLogger();
    public static final yh a = yh.c("multiplayer.status.quitting");
    private static final double c = 0.05;
    private static final int d = 10;
    private static final int e = 1000;
    final esv f = new esv();
    private final etb<cgk> B = new etb<cgk>(cgk.class, new b());
    private final hig C;
    private final hoh D;
    private final hog E;
    private final a F;
    private final cdo G;
    private final @Nullable hnz H;
    private final gfj I = gfj.V();
    final List<hne> J = Lists.newArrayList();
    final List<cyd> K = Lists.newArrayList();
    private final Map<fmu, fmw> L = Maps.newHashMap();
    private int M;
    private final Object2ObjectArrayMap<dvz, ggs> N = bhs.a(new Object2ObjectArrayMap(3), (? super T $$02) -> {
        $$02.put((Object)hns.a, (Object)new ggs($$0 -> this.b((is)$$0, hns.a)));
        $$02.put((Object)hns.b, (Object)new ggs($$0 -> this.b((is)$$0, hns.b)));
        $$02.put((Object)hns.c, (Object)new ggs($$0 -> this.b((is)$$0, hns.c)));
        $$02.put((Object)hns.d, (Object)new ggs($$0 -> this.b((is)$$0, hns.d)));
    });
    private final hhz O;
    private final Deque<Runnable> P = Queues.newArrayDeque();
    private int Q;
    private final hjr R = new hjr();
    private final Set<elb> S = new ReferenceOpenHashSet();
    private final hid T = new hid();
    private final eqa U = new eqa();
    private final cef V;
    private final int W;
    private boolean X;
    private static final Set<dlp> Y = Set.of(dlx.iu, dlx.iv);

    public void b(int $$0) {
        if (w.U) {
            b.debug("ACK {}", (Object)$$0);
        }
        this.R.a($$0, this);
    }

    @Override
    public void a(elb $$0) {
        hri $$1 = this.I.az().a($$0);
        if ($$1 != null && $$1.bk_()) {
            this.S.add($$0);
        }
    }

    public Set<elb> a() {
        return this.S;
    }

    public void b(is $$0, eoh $$1, @dzq.b int $$2) {
        if (!this.R.a($$0, $$1)) {
            super.a($$0, $$1, $$2, 512);
        }
    }

    public void a(is $$0, eoh $$1, ftm $$2) {
        eoh $$3 = this.a_($$0);
        if ($$3 != $$1) {
            this.a($$0, $$1, 19);
            hnh $$4 = this.I.s;
            if (this == $$4.ao() && $$4.a($$0, $$1)) {
                $$4.g($$2.g, $$2.h, $$2.i);
            }
        }
    }

    hjr b() {
        return this.R;
    }

    @Override
    public boolean a(is $$0, eoh $$1, @dzq.b int $$2, int $$3) {
        if (this.R.c()) {
            eoh $$4 = this.a_($$0);
            boolean $$5 = super.a($$0, $$1, $$2, $$3);
            if ($$5) {
                this.R.a($$0, $$4, this.I.s);
            }
            return $$5;
        }
        return super.a($$0, $$1, $$2, $$3);
    }

    public hif(hig $$0, a $$1, amt<dwo> $$2, jd<esh> $$3, int $$4, int $$5, hoh $$6, boolean $$7, long $$8, int $$9) {
        super($$1, $$2, $$0.y(), $$3, true, $$7, $$8, 1000000);
        this.C = $$0;
        this.O = new hhz(this, $$4);
        this.G = new cdo();
        this.F = $$1;
        this.D = $$6;
        this.W = $$9;
        this.E = new hog(this.I, this);
        this.H = $$3.a().c() ? new hnz() : null;
        this.a(fne.a.a($$2, new is(8, 64, 8), 0.0f, 0.0f));
        this.Q = $$5;
        this.V = this.a(cef.a()).a();
        this.aj();
        if (this.am()) {
            this.ak();
        }
    }

    private cef.a a(cef.a $$02) {
        $$02.a(this);
        int $$12 = bel.a(204, 204, 255);
        $$02.a(ceg.i, (Value $$1, int $$2) -> {
            if (this.q() > 0) {
                return bel.a(0.22f, (int)$$1, $$12);
            }
            return $$1;
        });
        $$02.a(ceg.s, (Value $$0, int $$1) -> Float.valueOf(this.q() > 0 ? 1.0f : $$0.floatValue()));
        return $$02;
    }

    public void a(Runnable $$0) {
        this.P.add($$0);
    }

    public void d() {
        Runnable $$3;
        int $$0 = this.P.size();
        int $$1 = $$0 < 1000 ? Math.max(10, $$0 / 10) : $$0;
        for (int $$2 = 0; $$2 < $$1 && ($$3 = this.P.poll()) != null; ++$$2) {
            $$3.run();
        }
    }

    public @Nullable hnz e() {
        return this.H;
    }

    public void a(BooleanSupplier $$0) {
        this.aj();
        if (this.y().i()) {
            this.w().t();
            this.o();
        }
        if (this.M > 0) {
            this.c(this.M - 1);
        }
        if (this.H != null) {
            this.H.a(this.au());
            if (this.H.c() && !(this.I.x instanceof gse)) {
                this.I.ap().a(new ipa(bda.Fv, bdb.d, this.y, this.I.i.p(), this.H.a(), this.H.b()), 30);
            }
        }
        this.T.a(this);
        try (bzr $$1 = bzl.a().d("blocks");){
            this.O.a($$0, true);
        }
        bzu.f.a(this.I.s());
        this.c().b();
    }

    private void o() {
        this.F.a(this.F.b() + 1L);
        if (this.X) {
            this.F.b(this.F.c() + 1L);
        }
    }

    public void a(long $$0, long $$1, boolean $$2) {
        this.F.a($$0);
        this.F.b($$1);
        this.X = $$2;
    }

    public Iterable<cgk> f() {
        return this.M().a();
    }

    public void g() {
        this.f.a((cgk $$0) -> {
            if ($$0.eh() || $$0.cq() || this.G.a((cgk)$$0)) {
                return;
            }
            this.a(this::c, $$0);
        });
    }

    public boolean a(cgk $$0) {
        return this.f.c($$0);
    }

    @Override
    public boolean h(cgk $$0) {
        return $$0.dM().a(this.I.s.dM()) <= this.Q;
    }

    public void c(cgk $$0) {
        $$0.bP();
        ++$$0.at;
        bzl.a().a(() -> mi.g.b($$0.ay()).toString());
        $$0.g();
        bzl.a().c();
        for (cgk $$1 : $$0.dn()) {
            this.a($$0, $$1);
        }
    }

    private void a(cgk $$0, cgk $$1) {
        if ($$1.eh() || $$1.dz() != $$0) {
            $$1.cf();
            return;
        }
        if (!($$1 instanceof ddm) && !this.f.c($$1)) {
            return;
        }
        $$1.bP();
        ++$$1.at;
        $$1.t();
        for (cgk $$2 : $$1.dn()) {
            this.a($$1, $$2);
        }
    }

    public void a(eqq $$0) {
        $$0.K();
        this.O.r().a($$0.f(), false);
        this.B.b($$0.f());
    }

    public void a(dvu $$0) {
        this.N.forEach(($$1, $$2) -> $$2.a($$0.h, $$0.i));
        this.B.a($$0);
    }

    public void b(long $$0) {
        this.D.a($$0);
    }

    public void h() {
        this.N.forEach(($$0, $$1) -> $$1.a());
    }

    @Override
    public boolean b(int $$0, int $$1) {
        return true;
    }

    public int i() {
        return this.B.b();
    }

    public void d(cgk $$0) {
        this.a($$0.aA(), cgk.e.b);
        this.B.a($$0);
    }

    public void a(int $$0, cgk.e $$1) {
        cgk $$2 = this.M().a($$0);
        if ($$2 != null) {
            $$2.c($$1);
            $$2.aE();
        }
    }

    @Override
    public List<cgk> k(cgk $$0, fth $$1) {
        hnh $$2 = this.I.s;
        if ($$2 != null && $$2 != $$0 && $$2.dj().c($$1) && cgs.a($$0).test($$2)) {
            return List.of($$2);
        }
        return List.of();
    }

    @Override
    public @Nullable cgk a(int $$0) {
        return this.M().a($$0);
    }

    public void a(yh $$0) {
        this.C.m().a($$0);
    }

    public void b(int $$0, int $$1, int $$2) {
        int $$3 = 32;
        bgr $$4 = bgr.a();
        dzq $$5 = this.p();
        is.a $$6 = new is.a();
        for (int $$7 = 0; $$7 < 667; ++$$7) {
            this.a($$0, $$1, $$2, 16, $$4, $$5, $$6);
            this.a($$0, $$1, $$2, 32, $$4, $$5, $$6);
        }
    }

    private @Nullable dzq p() {
        dlt $$0;
        dlp $$1;
        if (this.I.q.i() == dwl.b && Y.contains($$1 = ($$0 = this.I.s.fx()).h()) && $$1 instanceof dkb) {
            dkb $$2 = (dkb)$$1;
            return $$2.c();
        }
        return null;
    }

    public void a(int $$0, int $$1, int $$2, int $$3, bgr $$4, @Nullable dzq $$5, is.a $$6) {
        int $$7 = $$0 + this.y.a($$3) - this.y.a($$3);
        int $$8 = $$1 + this.y.a($$3) - this.y.a($$3);
        int $$9 = $$2 + this.y.a($$3) - this.y.a($$3);
        $$6.d($$7, $$8, $$9);
        eoh $$10 = this.a_($$6);
        $$10.b().a($$10, (dwo)this, (is)$$6, $$4);
        flb $$11 = this.b_($$6);
        if (!$$11.c()) {
            $$11.a(this, (is)$$6, $$4);
            lw $$12 = $$11.h();
            if ($$12 != null && this.y.a(10) == 0) {
                boolean $$13 = $$10.c((dvt)this, (is)$$6, iz.a);
                is $$14 = $$6.e();
                this.a($$14, this.a_($$14), $$12, $$13);
            }
        }
        if ($$5 == $$10.b()) {
            this.a(new lp(ly.c, $$10), (double)$$7 + 0.5, (double)$$8 + 0.5, (double)$$9 + 0.5, 0.0, 0.0, 0.0);
        }
        if (!$$10.m(this, $$6)) {
            for (cdt $$15 : this.c().a(ceg.u, $$6)) {
                if (!$$15.a(this.y)) continue;
                this.a($$15.a(), (double)$$6.u() + this.y.j(), (double)$$6.v() + this.y.j(), (double)$$6.w() + this.y.j(), 0.0, 0.0, 0.0);
            }
        }
    }

    private void a(is $$0, eoh $$1, lw $$2, boolean $$3) {
        if (!$$1.y().c()) {
            return;
        }
        fug $$4 = $$1.g(this, $$0);
        double $$5 = $$4.c(iz.a.b);
        if ($$5 < 1.0) {
            if ($$3) {
                this.a((double)$$0.u(), (double)($$0.u() + 1), (double)$$0.w(), (double)($$0.w() + 1), (double)($$0.v() + 1) - 0.05, $$2);
            }
        } else if (!$$1.a(bdp.aE)) {
            double $$6 = $$4.b(iz.a.b);
            if ($$6 > 0.0) {
                this.a($$0, $$2, $$4, (double)$$0.v() + $$6 - 0.05);
            } else {
                is $$7 = $$0.e();
                eoh $$8 = this.a_($$7);
                fug $$9 = $$8.g(this, $$7);
                double $$10 = $$9.c(iz.a.b);
                if ($$10 < 1.0 && $$8.y().c()) {
                    this.a($$0, $$2, $$4, (double)$$0.v() - 0.05);
                }
            }
        }
    }

    private void a(is $$0, lw $$1, fug $$2, double $$3) {
        this.a((double)$$0.u() + $$2.b(iz.a.a), (double)$$0.u() + $$2.c(iz.a.a), (double)$$0.w() + $$2.b(iz.a.c), (double)$$0.w() + $$2.c(iz.a.c), $$3, $$1);
    }

    private void a(double $$0, double $$1, double $$2, double $$3, double $$4, lw $$5) {
        this.a($$5, bgj.d(this.y.j(), $$0, $$1), $$4, bgj.d(this.y.j(), $$2, $$3), 0.0, 0.0, 0.0);
    }

    @Override
    public n a(m $$0) {
        n $$1 = super.a($$0);
        $$1.a("Server brand", () -> this.I.s.b.h());
        $$1.a("Server type", () -> this.I.aa() == null ? "Non-integrated multiplayer server" : "Integrated singleplayer server");
        $$1.a("Tracked entity count", () -> String.valueOf(this.i()));
        return $$1;
    }

    @Override
    public void a(@Nullable cgk $$0, double $$1, double $$2, double $$3, jd<bcz> $$4, bdb $$5, float $$6, float $$7, long $$8) {
        if ($$0 == this.I.s) {
            this.a($$1, $$2, $$3, $$4.a(), $$5, $$6, $$7, false, $$8);
        }
    }

    @Override
    public void a(@Nullable cgk $$0, cgk $$1, jd<bcz> $$2, bdb $$3, float $$4, float $$5, long $$6) {
        if ($$0 == this.I.s) {
            this.I.ap().a((ipm)new ipc($$2.a(), $$3, $$4, $$5, $$1, $$6));
        }
    }

    @Override
    public void a(cgk $$0, bcz $$1, bdb $$2, float $$3, float $$4) {
        this.I.ap().a((ipm)new ipc($$1, $$2, $$3, $$4, $$0, this.y.g()));
    }

    @Override
    public void a(bcz $$0, bdb $$1, float $$2, float $$3) {
        if (this.I.s != null) {
            this.I.ap().a((ipm)new ipc($$0, $$1, $$2, $$3, this.I.s, this.y.g()));
        }
    }

    @Override
    public void a(double $$0, double $$1, double $$2, bcz $$3, bdb $$4, float $$5, float $$6, boolean $$7) {
        this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.y.g());
    }

    private void a(double $$0, double $$1, double $$2, bcz $$3, bdb $$4, float $$5, float $$6, boolean $$7, long $$8) {
        double $$9 = this.I.i.p().b().c($$0, $$1, $$2);
        iph $$10 = new iph($$3, $$4, $$5, $$6, bgr.a($$8), $$0, $$1, $$2);
        if ($$7 && $$9 > 100.0) {
            double $$11 = Math.sqrt($$9) / 40.0;
            this.I.ap().a($$10, (int)($$11 * 20.0));
        } else {
            this.I.ap().a($$10);
        }
    }

    @Override
    public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<dok> $$6) {
        if ($$6.isEmpty()) {
            for (int $$7 = 0; $$7 < this.y.a(3) + 2; ++$$7) {
                this.a(ly.af, $$0, $$1, $$2, this.y.k() * 0.05, 0.005, this.y.k() * 0.05);
            }
        } else {
            this.I.f.a(new hkz.e(this, $$0, $$1, $$2, $$3, $$4, $$5, this.I.f, $$6));
        }
    }

    @Override
    public void a(aay<?> $$0) {
        this.C.b($$0);
    }

    @Override
    public eqa w() {
        return this.U;
    }

    @Override
    public dqt aa() {
        return this.C.l();
    }

    @Override
    public cdo y() {
        return this.G;
    }

    @Override
    public cef c() {
        return this.V;
    }

    @Override
    public fva<dzq> af() {
        return fux.b();
    }

    @Override
    public fva<fla> ae() {
        return fux.b();
    }

    public hhz j() {
        return this.O;
    }

    @Override
    public @Nullable fmw a(fmu $$0) {
        return this.L.get($$0);
    }

    public void a(fmu $$0, fmw $$1) {
        this.L.put($$0, $$1);
    }

    @Override
    public fur ab() {
        return this.C.C();
    }

    @Override
    public void a(is $$0, eoh $$1, eoh $$2, @dzq.b int $$3) {
        this.D.a(this, $$0, $$1, $$2, $$3);
    }

    @Override
    public void b(is $$0, eoh $$1, eoh $$2) {
        this.D.a($$0, $$1, $$2);
    }

    public void c(int $$0, int $$1, int $$2) {
        this.D.a($$0, $$1, $$2);
    }

    public void b(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
        this.D.b($$0, $$1, $$2, $$3, $$4, $$5);
    }

    @Override
    public void a(int $$0, is $$1, int $$2) {
        this.D.a($$0, $$1, $$2);
    }

    @Override
    public void b(int $$0, is $$1, int $$2) {
        this.E.a($$0, $$1, $$2);
    }

    @Override
    public void a(@Nullable cgk $$0, int $$1, is $$2, int $$3) {
        try {
            this.E.b($$1, $$2, $$3);
        }
        catch (Throwable $$4) {
            m $$5 = m.a($$4, "Playing level event");
            n $$6 = $$5.a("Level event being played");
            $$6.a("Block coordinates", n.a(this, $$2));
            $$6.a("Event source", $$0);
            $$6.a("Event type", $$1);
            $$6.a("Event data", $$3);
            throw new v($$5);
        }
    }

    @Override
    public void a(lw $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
        this.b($$0, $$0.a().b(), false, $$1, $$2, $$3, $$4, $$5, $$6);
    }

    @Override
    public void a(lw $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
        this.b($$0, $$0.a().b() || $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
    }

    @Override
    public void b(lw $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
        this.b($$0, false, true, $$1, $$2, $$3, $$4, $$5, $$6);
    }

    @Override
    public void a(lw $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
        this.b($$0, $$0.a().b() || $$1, true, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    private void b(lw $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
        try {
            ger $$9 = this.I.i.p();
            awx $$10 = this.a($$2);
            if ($$1) {
                this.I.f.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
                return;
            }
            if ($$9.b().c($$3, $$4, $$5) > 1024.0) {
                return;
            }
            if ($$10 == awx.c) {
                return;
            }
            this.I.f.a($$0, $$3, $$4, $$5, $$6, $$7, $$8);
        }
        catch (Throwable $$11) {
            m $$12 = m.a($$11, "Exception while adding particle");
            n $$13 = $$12.a("Particle being added");
            $$13.a("ID", mi.j.b($$0.a()));
            $$13.a("Parameters", () -> ly.bl.encodeStart(this.J_().a(vn.a), (Object)$$0).toString());
            $$13.a("Position", () -> n.a((dwq)this, $$3, $$4, $$5));
            throw new v($$12);
        }
    }

    private awx a(boolean $$0) {
        awx $$1 = this.I.k.aJ().b();
        if ($$0 && $$1 == awx.c && this.y.a(10) == 0) {
            $$1 = awx.b;
        }
        if ($$1 == awx.b && this.y.a(3) == 0) {
            $$1 = awx.c;
        }
        return $$1;
    }

    public List<hne> E() {
        return this.J;
    }

    public List<cyd> k() {
        return this.K;
    }

    @Override
    public jd<dxo> a(int $$0, int $$1, int $$2) {
        return this.J_().f(mj.aS).b(dxv.b);
    }

    private int q() {
        return this.I.k.b().b() != false ? 0 : this.M;
    }

    @Override
    public void c(int $$0) {
        this.M = $$0;
    }

    @Override
    public float a(iz $$0, boolean $$1) {
        esh.a $$2 = this.F_().o();
        if (!$$1) {
            return $$2 == esh.a.b ? 0.9f : 1.0f;
        }
        return switch ($$0) {
            default -> throw new MatchException(null, null);
            case iz.a -> {
                if ($$2 == esh.a.b) {
                    yield 0.9f;
                }
                yield 0.5f;
            }
            case iz.b -> {
                if ($$2 == esh.a.b) {
                    yield 0.9f;
                }
                yield 1.0f;
            }
            case iz.c, iz.d -> 0.8f;
            case iz.e, iz.f -> 0.6f;
        };
    }

    @Override
    public int a(is $$0, dvz $$1) {
        ggs $$2 = (ggs)this.N.get((Object)$$1);
        return $$2.a($$0);
    }

    public int b(is $$0, dvz $$1) {
        int $$2 = gfj.V().k.P().b();
        if ($$2 == 0) {
            return $$1.getColor(this.z($$0).a(), $$0.u(), $$0.w());
        }
        int $$3 = ($$2 * 2 + 1) * ($$2 * 2 + 1);
        int $$4 = 0;
        int $$5 = 0;
        int $$6 = 0;
        iw $$7 = new iw($$0.u() - $$2, $$0.v(), $$0.w() - $$2, $$0.u() + $$2, $$0.v(), $$0.w() + $$2);
        is.a $$8 = new is.a();
        while ($$7.a()) {
            $$8.d($$7.b(), $$7.c(), $$7.d());
            int $$9 = $$1.getColor(this.z($$8).a(), $$8.u(), $$8.w());
            $$4 += ($$9 & 0xFF0000) >> 16;
            $$5 += ($$9 & 0xFF00) >> 8;
            $$6 += $$9 & 0xFF;
        }
        return ($$4 / $$3 & 0xFF) << 16 | ($$5 / $$3 & 0xFF) << 8 | $$6 / $$3 & 0xFF;
    }

    @Override
    public void a(fne.a $$0) {
        this.z.a(this.b($$0));
    }

    @Override
    public fne.a C() {
        return this.z.a();
    }

    public String toString() {
        return "ClientLevel";
    }

    public a l() {
        return this.F;
    }

    @Override
    public void a(jd<etk> $$0, ftm $$1, etk.a $$2) {
    }

    protected Map<fmu, fmw> m() {
        return ImmutableMap.copyOf(this.L);
    }

    protected void a(Map<fmu, fmw> $$0) {
        this.L.putAll($$0);
    }

    @Override
    protected esy<cgk> M() {
        return this.B.a();
    }

    @Override
    public String P() {
        return "Chunks[C] W: " + this.O.e() + " E: " + this.B.c();
    }

    @Override
    public void b(is $$0, eoh $$1) {
        if ($$1.l() || !$$1.D()) {
            return;
        }
        fug $$22 = $$1.f(this, $$0);
        double $$32 = 0.25;
        $$22.b((double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) -> {
            double $$8 = Math.min(1.0, $$5 - $$2);
            double $$9 = Math.min(1.0, $$6 - $$3);
            double $$10 = Math.min(1.0, $$7 - $$4);
            int $$11 = Math.max(2, bgj.e($$8 / 0.25));
            int $$12 = Math.max(2, bgj.e($$9 / 0.25));
            int $$13 = Math.max(2, bgj.e($$10 / 0.25));
            for (int $$14 = 0; $$14 < $$11; ++$$14) {
                for (int $$15 = 0; $$15 < $$12; ++$$15) {
                    for (int $$16 = 0; $$16 < $$13; ++$$16) {
                        double $$17 = ((double)$$14 + 0.5) / (double)$$11;
                        double $$18 = ((double)$$15 + 0.5) / (double)$$12;
                        double $$19 = ((double)$$16 + 0.5) / (double)$$13;
                        double $$20 = $$17 * $$8 + $$2;
                        double $$21 = $$18 * $$9 + $$3;
                        double $$22 = $$19 * $$10 + $$4;
                        this.I.f.a(new hms(this, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0));
                    }
                }
            }
        });
    }

    public void d(is $$0, iz $$1) {
        eoh $$2 = this.a_($$0);
        if ($$2.o() == egf.a || !$$2.D()) {
            return;
        }
        int $$3 = $$0.u();
        int $$4 = $$0.v();
        int $$5 = $$0.w();
        float $$6 = 0.1f;
        fth $$7 = $$2.f(this, $$0).a();
        double $$8 = (double)$$3 + this.y.j() * ($$7.d - $$7.a - (double)0.2f) + (double)0.1f + $$7.a;
        double $$9 = (double)$$4 + this.y.j() * ($$7.e - $$7.b - (double)0.2f) + (double)0.1f + $$7.b;
        double $$10 = (double)$$5 + this.y.j() * ($$7.f - $$7.c - (double)0.2f) + (double)0.1f + $$7.c;
        if ($$1 == iz.a) {
            $$9 = (double)$$4 + $$7.b - (double)0.1f;
        }
        if ($$1 == iz.b) {
            $$9 = (double)$$4 + $$7.e + (double)0.1f;
        }
        if ($$1 == iz.c) {
            $$10 = (double)$$5 + $$7.c - (double)0.1f;
        }
        if ($$1 == iz.d) {
            $$10 = (double)$$5 + $$7.f + (double)0.1f;
        }
        if ($$1 == iz.e) {
            $$8 = (double)$$3 + $$7.a - (double)0.1f;
        }
        if ($$1 == iz.f) {
            $$8 = (double)$$3 + $$7.d + (double)0.1f;
        }
        this.I.f.a(new hms(this, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2f).d(0.6f));
    }

    public void i(int $$0) {
        this.Q = $$0;
    }

    public int n() {
        return this.Q;
    }

    @Override
    public dgz Q() {
        return this.C.B();
    }

    @Override
    public dnq R() {
        return this.C.D();
    }

    @Override
    public emb S() {
        return this.C.E();
    }

    @Override
    public void a(@Nullable cgk $$0, @Nullable cex $$1, @Nullable dwj $$2, double $$3, double $$4, double $$5, float $$6, boolean $$7, dwo.a $$8, lw $$9, lw $$10, cbn<lt> $$11, jd<bcz> $$12) {
    }

    @Override
    public int V() {
        return this.W;
    }

    @Override
    public int x(is $$0) {
        return gfj.V().aE().a(this.a_($$0), this, $$0, 0);
    }

    @Override
    public void registerForCleaning(hhw<hif, ?> $$0) {
        this.C.a($$0);
    }

    public void a(ftm $$0, float $$1, int $$2, cbn<lt> $$3) {
        this.T.a($$0, $$1, $$2, $$3);
    }

    @Override
    public /* synthetic */ fne D_() {
        return this.l();
    }

    public /* synthetic */ Collection v() {
        return this.k();
    }

    @Override
    public /* synthetic */ eqj ac() {
        return this.j();
    }

    @Override
    public /* synthetic */ cee ad() {
        return this.c();
    }

    final class b
    implements esx<cgk> {
        b() {
        }

        @Override
        public void a(cgk $$0) {
        }

        @Override
        public void b(cgk $$0) {
        }

        @Override
        public void c(cgk $$0) {
            hif.this.f.a($$0);
        }

        @Override
        public void d(cgk $$0) {
            hif.this.f.b($$0);
        }

        @Override
        public void e(cgk $$0) {
            cgk cgk2 = $$0;
            Objects.requireNonNull(cgk2);
            cgk cgk3 = cgk2;
            int n2 = 0;
            switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{hne.class, cyc.class}, (Object)cgk3, n2)) {
                case 0: {
                    hne $$1 = (hne)cgk3;
                    hif.this.J.add($$1);
                    break;
                }
                case 1: {
                    cyc $$2 = (cyc)cgk3;
                    hif.this.K.addAll(Arrays.asList($$2.gM()));
                    break;
                }
            }
        }

        @Override
        public void f(cgk $$0) {
            $$0.aw();
            cgk cgk2 = $$0;
            Objects.requireNonNull(cgk2);
            cgk cgk3 = cgk2;
            int n2 = 0;
            switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{hne.class, cyc.class}, (Object)cgk3, n2)) {
                case 0: {
                    hne $$1 = (hne)cgk3;
                    hif.this.J.remove($$1);
                    break;
                }
                case 1: {
                    cyc $$2 = (cyc)cgk3;
                    hif.this.K.removeAll(Arrays.asList($$2.gM()));
                    break;
                }
            }
        }

        @Override
        public void g(cgk $$0) {
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

    public static class a
    implements fnu {
        private final boolean a;
        private final boolean b;
        private fne.a c;
        private long d;
        private long e;
        private boolean f;
        private ccz g;
        private boolean h;

        public a(ccz $$0, boolean $$1, boolean $$2) {
            this.g = $$0;
            this.a = $$1;
            this.b = $$2;
        }

        @Override
        public fne.a a() {
            return this.c;
        }

        @Override
        public long b() {
            return this.d;
        }

        @Override
        public long c() {
            return this.e;
        }

        public void a(long $$0) {
            this.d = $$0;
        }

        public void b(long $$0) {
            this.e = $$0;
        }

        @Override
        public void a(fne.a $$0) {
            this.c = $$0;
        }

        @Override
        public boolean f() {
            return false;
        }

        @Override
        public boolean h() {
            return this.f;
        }

        @Override
        public void b(boolean $$0) {
            this.f = $$0;
        }

        @Override
        public boolean k() {
            return this.a;
        }

        @Override
        public ccz p() {
            return this.g;
        }

        @Override
        public boolean q() {
            return this.h;
        }

        @Override
        public void a(n $$0, dwq $$1) {
            fnu.super.a($$0, $$1);
        }

        public void a(ccz $$0) {
            this.g = $$0;
        }

        public void a(boolean $$0) {
            this.h = $$0;
        }

        public double a(dwq $$0) {
            if (this.b) {
                return $$0.K_();
            }
            return 63.0;
        }

        public float d() {
            if (this.b) {
                return 1.0f;
            }
            return 32.0f;
        }
    }
}

