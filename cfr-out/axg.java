/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  com.google.common.hash.HashCode
 *  com.google.common.net.InetAddresses
 *  com.mojang.authlib.GameProfile
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.hash.HashCode;
import com.google.common.net.InetAddresses;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import net.minecraft.server.MinecraftServer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class axg
extends ddm {
    private static final Logger cB = LogUtils.getLogger();
    private static final int cC = 32;
    private static final int cD = 10;
    private static final int cE = 25;
    public static final double a = 1.0;
    public static final double b = 3.0;
    public static final int c = 2;
    public static final String d = "ender_pearls";
    public static final String e = "ender_pearl_dimension";
    public static final String f = "Dimension";
    private static final ciq cF = new ciq(amo.b("creative_mode_block_range"), 0.5, ciq.a.a);
    private static final ciq cG = new ciq(amo.b("creative_mode_entity_range"), 2.0, ciq.a.a);
    private static final yh cH = yh.c("block.minecraft.set_spawn");
    private static final ciq cI = new ciq(amo.b("waypoint_transmit_range_crouch"), -1.0, ciq.a.c);
    private static final boolean cJ = false;
    private static final boolean cK = false;
    public ayi g;
    private final MinecraftServer cL;
    public final axh h;
    private final anb cM;
    private final bdg cN;
    private float cO = Float.MIN_VALUE;
    private int cP = Integer.MIN_VALUE;
    private int cQ = Integer.MIN_VALUE;
    private int cR = Integer.MIN_VALUE;
    private int cU = Integer.MIN_VALUE;
    private int cV = Integer.MIN_VALUE;
    private float cW = -1.0E8f;
    private int cX = -99999999;
    private boolean cY = true;
    private int cZ = -99999999;
    private ddj da = ddj.a;
    private awx db = awx.a;
    private boolean dc = true;
    private long dd = bhs.c();
    private @Nullable cgk de;
    private boolean df;
    public boolean i = false;
    private final bdf dg;
    private @Nullable ftm dh;
    private int di;
    private boolean dj;
    private int dk = 2;
    private String dl = "en_us";
    private @Nullable ftm dm;
    private @Nullable ftm dn;
    private @Nullable ftm do;
    private jw dp = jw.a(0, 0, 0);
    private awo dq = awo.a;
    private @Nullable a dr;
    private final ayo ds;
    private boolean dt;
    private boolean du;
    private boolean dv = false;
    private dcj dw = new dcj();
    private @Nullable is dx;
    private ftm dy = ftm.c;
    private ddk dz = ddk.b;
    private final Set<dfc> dA = new HashSet<dfc>();
    private long dB;
    private uz dC = new uz();
    private uz dD = new uz();
    private final dhy dE = new dhy(){
        private final LoadingCache<kk<?>, Integer> b = CacheBuilder.newBuilder().maximumSize(256L).build(new CacheLoader<kk<?>, Integer>(){
            private final DynamicOps<HashCode> b;
            {
                this.b = axg.this.eo().a(bfw.c);
            }

            public Integer a(kk<?> $$0) {
                return ((HashCode)$$0.a(this.b).getOrThrow($$1 -> new IllegalArgumentException("Failed to hash " + String.valueOf($$0) + ": " + $$1))).asInt();
            }

            public /* synthetic */ Object load(Object object) throws Exception {
                return this.a((kk)object);
            }
        });

        @Override
        public void a(dhi $$0, List<dlt> $$1, dlt $$2, int[] $$3) {
            axg.this.g.b(new adv($$0.l, $$0.k(), $$1, $$2));
            for (int $$4 = 0; $$4 < $$3.length; ++$$4) {
                this.b($$0, $$4, $$3[$$4]);
            }
        }

        @Override
        public void a(dhi $$0, int $$1, dlt $$2) {
            axg.this.g.b(new adx($$0.l, $$0.k(), $$1, $$2));
        }

        @Override
        public void a(dhi $$0, dlt $$1) {
            axg.this.g.b(new agm($$1));
        }

        @Override
        public void a(dhi $$0, int $$1, int $$2) {
            this.b($$0, $$1, $$2);
        }

        private void b(dhi $$0, int $$1, int $$2) {
            axg.this.g.b(new adw($$0.l, $$1, $$2));
        }

        @Override
        public djc a() {
            return new djc.a(arg_0 -> this.b.getUnchecked(arg_0));
        }
    };
    private final dhx dF = new dhx(){

        @Override
        public void a(dhi $$0, int $$1, dlt $$2) {
            dji $$3 = $$0.b($$1);
            if ($$3 instanceof dje) {
                return;
            }
            if ($$3.c == axg.this.gK()) {
                aj.f.a(axg.this, axg.this.gK(), $$2);
            }
        }

        @Override
        public void a(dhi $$0, int $$1, int $$2) {
        }
    };
    private @Nullable yz dG;
    public final @Nullable Object j;
    private final ec dH = new ec(){

        @Override
        public boolean x_() {
            return axg.this.A().U().a(eua.R);
        }

        @Override
        public boolean y_() {
            return true;
        }

        @Override
        public boolean c() {
            return true;
        }

        @Override
        public void a(yh $$0) {
            axg.this.a($$0);
        }
    };
    private Set<bxe<?>> dI = Set.of();
    private int dJ;
    public boolean k;

    public axg(MinecraftServer $$0, axf $$12, GameProfile $$22, awp $$3) {
        super($$12, $$22);
        this.cL = $$0;
        this.ds = $$0.a(this);
        this.h = $$0.b(this);
        this.h.a(this.b((dwl)null), null);
        this.dg = new bdf(($$1, $$2) -> $$0.aJ().a($$1, $$2));
        this.cN = $$0.aj().a((ddm)this);
        this.cM = $$0.aj().f(this);
        this.a($$3);
        this.j = null;
    }

    @Override
    public is a(axf $$0, is $$1) {
        CompletableFuture<ftm> $$2 = awz.a($$0, $$1);
        this.cL.b($$2::isDone);
        return is.a($$2.join());
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.dw = $$0.a("warden_spawn_tracker", dcj.a).orElseGet(dcj::new);
        this.dn = $$0.a("entered_nether_pos", ftm.a).orElse(null);
        this.i = $$0.a("seenCredits", false);
        $$0.a("recipeBook", bdf.b.a).ifPresent($$02 -> this.dg.a((bdf.b)$$02, (amt<dqs<?>> $$0) -> this.cL.aJ().b((amt<dqs<?>>)$$0).isPresent()));
        if (this.gr()) {
            this.gs();
        }
        this.dr = $$0.a("respawn", axg$a.a).orElse(null);
        this.dv = $$0.a("spawn_extra_particles_on_fall", false);
        this.dx = $$0.a("raid_omen_position", is.a).orElse(null);
        this.h.a(this.b(axg.a($$0, "playerGameType")), axg.a($$0, "previousPlayerGameType"));
        this.b($$0.a("ShoulderEntityLeft", uz.a).orElseGet(uz::new));
        this.c($$0.a("ShoulderEntityRight", uz.a).orElseGet(uz::new));
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("warden_spawn_tracker", dcj.a, this.dw);
        this.g($$0);
        $$0.a("seenCredits", this.i);
        $$0.b("entered_nether_pos", ftm.a, this.dn);
        this.e($$0);
        $$0.a("recipeBook", bdf.b.a, this.dg.b());
        $$0.a(f, this.A().aq().a().toString());
        $$0.b("respawn", axg$a.a, this.dr);
        $$0.a("spawn_extra_particles_on_fall", this.dv);
        $$0.b("raid_omen_position", is.a, this.dx);
        this.f($$0);
        if (!this.al().j()) {
            $$0.a("ShoulderEntityLeft", uz.a, this.al());
        }
        if (!this.am().j()) {
            $$0.a("ShoulderEntityRight", uz.a, this.am());
        }
    }

    private void e(fns $$0) {
        cgk $$1 = this.du();
        cgk $$2 = this.dz();
        if ($$2 != null && $$1 != this && $$1.dt()) {
            fns $$3 = $$0.a("RootVehicle");
            $$3.a("Attach", jx.a, $$2.cY());
            $$1.c($$3.a("Entity"));
        }
    }

    public void b(fnq $$0) {
        Optional<fnq> $$12 = $$0.a("RootVehicle");
        if ($$12.isEmpty()) {
            return;
        }
        axf $$2 = this.A();
        cgk $$3 = cgu.a($$12.get().b("Entity"), (dwo)$$2, cgt.r, $$1 -> {
            if (!$$2.c($$1)) {
                return null;
            }
            return $$1;
        });
        if ($$3 == null) {
            return;
        }
        UUID $$4 = $$12.get().a("Attach", jx.a).orElse(null);
        if ($$3.cY().equals($$4)) {
            this.a($$3, true, false);
        } else {
            for (cgk $$5 : $$3.dr()) {
                if (!$$5.cY().equals($$4)) continue;
                this.a($$5, true, false);
                break;
            }
        }
        if (!this.cq()) {
            cB.warn("Couldn't reattach entity to player");
            $$3.aC();
            for (cgk $$6 : $$3.dr()) {
                $$6.aC();
            }
        }
    }

    private void f(fns $$0) {
        if (!this.dA.isEmpty()) {
            fns.b $$1 = $$0.b(d);
            for (dfc $$2 : this.dA) {
                if ($$2.eh()) {
                    cB.warn("Trying to save removed ender pearl, skipping");
                    continue;
                }
                fns $$3 = $$1.a();
                $$2.c($$3);
                $$3.a(e, dwo.g, $$2.ao().aq());
            }
        }
    }

    public void c(fnq $$0) {
        $$0.d(d).forEach(this::e);
    }

    private void e(fnq $$0) {
        Optional<amt<dwo>> $$12 = $$0.a(e, dwo.g);
        if ($$12.isEmpty()) {
            return;
        }
        axf $$2 = this.A().s().a($$12.get());
        if ($$2 != null) {
            cgk $$3 = cgu.a($$0, (dwo)$$2, cgt.r, $$1 -> {
                if (!$$2.c($$1)) {
                    return null;
                }
                return $$1;
            });
            if ($$3 != null) {
                axg.a($$2, $$3.dM());
            } else {
                cB.warn("Failed to spawn player ender pearl in level ({}), skipping", $$12.get());
            }
        } else {
            cB.warn("Trying to load ender pearl without level ({}) being loaded, skipping", $$12.get());
        }
    }

    public void a(int $$0) {
        float $$2;
        float $$1 = this.gU();
        float $$3 = bgj.a((float)$$0 / $$1, 0.0f, $$2 = ($$1 - 1.0f) / $$1);
        if ($$3 == this.cu) {
            return;
        }
        this.cu = $$3;
        this.cZ = -1;
    }

    public void b(int $$0) {
        if ($$0 == this.cs) {
            return;
        }
        this.cs = $$0;
        this.cZ = -1;
    }

    @Override
    public void c(int $$0) {
        if ($$0 == 0) {
            return;
        }
        super.c($$0);
        this.cZ = -1;
    }

    @Override
    public void a(dlt $$0, int $$1) {
        super.a($$0, $$1);
        this.cZ = -1;
    }

    private void a(dhi $$0) {
        $$0.a(this.dF);
        $$0.a(this.dE);
    }

    public void c() {
        this.a(this.cm);
    }

    @Override
    public void g_() {
        super.g_();
        this.g.b(afk.a);
    }

    @Override
    public void P_() {
        super.P_();
        this.g.b(new afj(this.fo()));
    }

    @Override
    public void a(eoh $$0) {
        aj.e.a(this, $$0);
    }

    @Override
    protected dlq f() {
        return new dmr(this);
    }

    @Override
    public void g() {
        cgk $$0;
        this.g.r();
        this.h.a();
        this.dw.a();
        if (this.ax > 0) {
            --this.ax;
        }
        this.cn.d();
        if (!this.cn.b(this)) {
            this.r();
            this.cn = this.cm;
        }
        if (($$0 = this.N()) != this) {
            if ($$0.cb()) {
                this.a($$0.dP(), $$0.dR(), $$0.dV(), $$0.ec(), $$0.ee());
                this.A().p().a(this);
                if (this.gB()) {
                    this.d((cgk)this);
                }
            } else {
                this.d((cgk)this);
            }
        }
        aj.x.a(this);
        if (this.dh != null) {
            aj.v.a(this, this.dh, this.at - this.di);
        }
        this.m();
        this.n();
        this.hu();
        this.cM.a(this, true);
    }

    private void hu() {
        cio $$2;
        cio $$1;
        cio $$0 = this.h(cis.h);
        if ($$0 != null) {
            if (this.ha()) {
                $$0.a(cF);
            } else {
                $$0.e(cF);
            }
        }
        if (($$1 = this.h(cis.l)) != null) {
            if (this.ha()) {
                $$1.a(cG);
            } else {
                $$1.e(cG);
            }
        }
        if (($$2 = this.h(cis.I)) != null) {
            if (this.cz()) {
                $$2.a(cI);
            } else {
                $$2.e(cI);
            }
        }
    }

    public void h() {
        try {
            if (!this.au() || !this.dD()) {
                super.g();
                if (!this.cn.b(this)) {
                    this.r();
                    this.cn = this.cm;
                }
                this.co.a(this);
                this.a(bdk.k);
                this.a(bdk.l);
                if (this.cb()) {
                    this.a(bdk.m);
                }
                if (this.cx()) {
                    this.a(bdk.o);
                }
                if (!this.gr()) {
                    this.a(bdk.n);
                }
            }
            for (int $$0 = 0; $$0 < this.gK().b(); ++$$0) {
                dlt $$1 = this.gK().a($$0);
                if ($$1.f()) continue;
                this.i($$1);
            }
            if (this.eZ() != this.cW || this.cX != this.co.a() || this.co.d() == 0.0f != this.cY) {
                this.g.b(new agu(this.eZ(), this.co.a(), this.co.d()));
                this.cW = this.eZ();
                this.cX = this.co.a();
                boolean bl2 = this.cY = this.co.d() == 0.0f;
            }
            if (this.eZ() + this.fX() != this.cO) {
                this.cO = this.eZ() + this.fX();
                this.a(fuu.h, bgj.d(this.cO));
            }
            if (this.co.a() != this.cP) {
                this.cP = this.co.a();
                this.a(fuu.i, bgj.d((float)this.cP));
            }
            if (this.cK() != this.cQ) {
                this.cQ = this.cK();
                this.a(fuu.j, bgj.d((float)this.cQ));
            }
            if (this.fn() != this.cR) {
                this.cR = this.fn();
                this.a(fuu.k, bgj.d((float)this.cR));
            }
            if (this.ct != this.cV) {
                this.cV = this.ct;
                this.a(fuu.l, bgj.d((float)this.cV));
            }
            if (this.cs != this.cU) {
                this.cU = this.cs;
                this.a(fuu.m, bgj.d((float)this.cU));
            }
            if (this.ct != this.cZ) {
                this.cZ = this.ct;
                this.g.b(new agt(this.cu, this.ct, this.cs));
            }
            if (this.at % 20 == 0) {
                aj.q.a(this);
            }
        }
        catch (Throwable $$2) {
            m $$3 = m.a($$2, "Ticking player");
            n $$4 = $$3.a("Player being ticked");
            this.a($$4);
            throw new v($$3);
        }
    }

    private void i(dlt $$0) {
        aay<?> $$3;
        fmu $$1 = $$0.a(ki.T);
        fmw $$2 = dmg.a($$1, (dwo)this.A());
        if ($$2 != null && ($$3 = $$2.a($$1, this)) != null) {
            this.g.b($$3);
        }
    }

    @Override
    protected void i() {
        if (this.A().av() == ccz.a && this.A().U().a(eua.G).booleanValue()) {
            if (this.at % 20 == 0) {
                float $$0;
                if (this.eZ() < this.fq()) {
                    this.d(1.0f);
                }
                if (($$0 = this.co.d()) < 20.0f) {
                    this.co.b($$0 + 1.0f);
                }
            }
            if (this.at % 10 == 0 && this.co.c()) {
                this.co.a(this.co.a() + 1);
            }
        }
    }

    @Override
    public void j() {
        this.e(this.al());
        this.e(this.am());
        if (this.an > 0.5 || this.by() || this.gL().b || this.gr() || this.aJ) {
            this.k();
        }
    }

    private void e(uz $$0) {
        cgu $$1;
        if ($$0.j() || $$0.b("Silent", false)) {
            return;
        }
        if (this.as.a(200) == 0 && ($$1 = (cgu)$$0.a("id", cgu.a).orElse(null)) == cgu.aW && !cwy.a((dwo)this.A(), (cgk)this)) {
            this.A().a(null, this.dP(), this.dR(), this.dV(), cwy.a((dwo)this.A(), this.as), this.dB(), 1.0f, cwy.a(this.as));
        }
    }

    public boolean a(uz $$0) {
        if (this.cq() || !this.aV() || this.by() || this.aJ) {
            return false;
        }
        if (this.al().j()) {
            this.b($$0);
            this.dB = this.A().au();
            return true;
        }
        if (this.am().j()) {
            this.c($$0);
            this.dB = this.A().au();
            return true;
        }
        return false;
    }

    @Override
    protected void k() {
        if (this.dB + 20L < this.A().au()) {
            this.f(this.al());
            this.b(new uz());
            this.f(this.am());
            this.c(new uz());
        }
    }

    private void f(uz $$0) {
        axf axf2 = this.A();
        if (axf2 instanceof axf) {
            axf $$12 = axf2;
            if (!$$0.j()) {
                try (bgp.j $$2 = new bgp.j(this.es(), cB);){
                    cgu.a(fno.a($$2.a(() -> ".shoulder"), (jf.a)$$12.J_(), $$0), (dwo)$$12, cgt.r).ifPresent($$1 -> {
                        if ($$1 instanceof cii) {
                            cii $$2 = (cii)$$1;
                            $$2.i(this);
                        }
                        $$1.a_(this.dP(), this.dR() + (double)0.7f, this.dV());
                        $$12.c((cgk)$$1);
                    });
                }
            }
        }
    }

    @Override
    public void l() {
        if (this.eZ() > 0.0f && this.dm != null) {
            aj.Z.a(this, this.dm);
        }
        this.dm = null;
        super.l();
    }

    public void m() {
        if (this.an > 0.0 && this.dm == null) {
            this.dm = this.dI();
            if (this.cz != null && this.cz.h <= this.dm.h) {
                aj.ag.a(this, this.cz, this.cA);
            }
        }
    }

    public void n() {
        if (this.dz() != null && this.dz().bN()) {
            if (this.do == null) {
                this.do = this.dI();
            } else {
                aj.aa.a(this, this.do);
            }
        }
        if (!(this.do == null || this.dz() != null && this.dz().bN())) {
            this.do = null;
        }
    }

    private void a(fuu $$0, int $$12) {
        this.A().i().a($$0, this, (fup $$1) -> $$1.a($$12));
    }

    @Override
    public void a(cex $$0) {
        this.c(etk.p);
        boolean $$1 = this.A().U().a(eua.T);
        if ($$1) {
            yh $$2 = this.fo().a();
            this.g.a(new afl(this.aA(), $$2), xm.a(() -> {
                int $$12 = 256;
                String $$2 = $$2.a(256);
                yw $$3 = yh.a("death.attack.message_too_long", yh.b($$2).a(l.o));
                yw $$4 = yh.a("death.attack.even_more_magic", this.R_()).a($$1 -> $$1.a(new yo.e($$3)));
                return new afl(this.aA(), $$4);
            }));
            fum $$3 = this.cI();
            if ($$3 == null || ((fut)$$3).l() == fut.b.a) {
                this.cL.aj().a($$2, false);
            } else if (((fut)$$3).l() == fut.b.c) {
                this.cL.aj().a((ddm)this, $$2);
            } else if (((fut)$$3).l() == fut.b.d) {
                this.cL.aj().b(this, $$2);
            }
        } else {
            this.g.b(new afl(this.aA(), yg.a));
        }
        this.k();
        if (this.A().U().a(eua.o).booleanValue()) {
            this.hv();
        }
        if (!this.au()) {
            this.b(this.A(), $$0);
        }
        this.A().i().a(fuu.e, this, fup::b);
        chl $$4 = this.fp();
        if ($$4 != null) {
            this.b(bdk.h.b($$4.ay()));
            $$4.a((cgk)this, $$0);
            this.e($$4);
        }
        this.A().a((cgk)this, (byte)3);
        this.a(bdk.P);
        this.a(bdk.i.b(bdk.m));
        this.a(bdk.i.b(bdk.n));
        this.aT();
        this.k(0);
        this.d(false);
        this.fo().c();
        this.d(Optional.of(jc.a(this.A().aq(), this.dK())));
        this.g.s();
    }

    private void hv() {
        fth $$02 = new fth(this.dK()).c(32.0, 10.0, 32.0);
        this.A().a(chn.class, $$02, cgs.f).stream().filter($$0 -> $$0 instanceof chq).forEach($$0 -> ((chq)((Object)$$0)).a_(this.A(), this));
    }

    @Override
    public void a(cgk $$0, cex $$1) {
        if ($$0 == this) {
            return;
        }
        super.a($$0, $$1);
        anm $$2 = this.A().i();
        $$2.a(fuu.g, this, fup::b);
        if ($$0 instanceof ddm) {
            this.a(bdk.S);
            $$2.a(fuu.f, this, fup::b);
        } else {
            this.a(bdk.Q);
        }
        this.a((fuq)this, (fuq)$$0, fuu.n);
        this.a((fuq)$$0, (fuq)this, fuu.o);
        aj.c.a(this, $$0, $$1);
    }

    private void a(fuq $$0, fuq $$1, fuu[] $$2) {
        int $$5;
        anm $$3 = this.A().i();
        fum $$4 = $$3.e($$1.da());
        if ($$4 != null && ($$5 = $$4.o().b()) >= 0 && $$5 < $$2.length) {
            $$3.a($$2[$$5], $$0, fup::b);
        }
    }

    @Override
    public boolean a(axf $$0, cex $$1, float $$2) {
        ddm $$7;
        deh $$5;
        cgk $$6;
        ddm $$4;
        if (this.a($$0, $$1)) {
            return false;
        }
        cgk $$3 = $$1.d();
        if ($$3 instanceof ddm && !this.a($$4 = (ddm)$$3)) {
            return false;
        }
        if ($$3 instanceof deh && ($$6 = ($$5 = (deh)$$3).p()) instanceof ddm && !this.a($$7 = (ddm)$$6)) {
            return false;
        }
        return super.a($$0, $$1, $$2);
    }

    @Override
    public boolean a(ddm $$0) {
        if (!this.hw()) {
            return false;
        }
        return super.a($$0);
    }

    private boolean hw() {
        return this.A().X();
    }

    public fmb a(boolean $$0, fmb.a $$1) {
        a $$2 = this.V();
        axf $$3 = this.cL.a(axg$a.b($$2));
        if ($$3 != null && $$2 != null) {
            Optional<b> $$4 = axg.a($$3, $$2, $$0);
            if ($$4.isPresent()) {
                b $$5 = $$4.get();
                return new fmb($$3, $$5.a(), ftm.c, $$5.b(), $$5.c(), $$1);
            }
            return fmb.b(this, $$1);
        }
        return fmb.a(this, $$1);
    }

    public boolean o() {
        return this.i(cis.J) > 0.0;
    }

    @Override
    protected void a(jd<cin> $$0) {
        if ($$0.a(cis.J)) {
            bcv $$1 = this.A().j();
            if (this.fw().c($$0) > 0.0) {
                $$1.a(this);
            } else {
                $$1.c(this);
            }
        }
        super.a($$0);
    }

    private static Optional<b> a(axf $$0, a $$12, boolean $$2) {
        fne.a $$3 = $$12.b;
        is $$4 = $$3.b();
        float $$5 = $$3.d();
        float $$6 = $$3.e();
        boolean $$7 = $$12.c;
        eoh $$8 = $$0.a_($$4);
        dzq $$9 = $$8.b();
        if ($$9 instanceof egh && ($$7 || $$8.c(egh.d) > 0) && egh.a($$0, $$4)) {
            Optional<ftm> $$10 = egh.a(cgu.cb, $$0, $$4);
            if (!$$7 && $$2 && $$10.isPresent()) {
                $$0.a($$4, (eoh)$$8.b(egh.d, $$8.c(egh.d) - 1), 3);
            }
            return $$10.map($$1 -> axg$b.a($$1, $$4, 0.0f));
        }
        if ($$9 instanceof dzj && $$0.c().a(ceg.C, $$4).b($$0)) {
            return dzj.a(cgu.cb, (dvx)$$0, $$4, (iz)$$8.c(dzj.f), $$5).map($$1 -> axg$b.a($$1, $$4, 0.0f));
        }
        if (!$$7) {
            return Optional.empty();
        }
        boolean $$11 = $$9.a($$8);
        eoh $$122 = $$0.a_($$4.d());
        boolean $$13 = $$122.b().a($$122);
        if ($$11 && $$13) {
            return Optional.of(new b(new ftm((double)$$4.u() + 0.5, (double)$$4.v() + 0.1, (double)$$4.w() + 0.5), $$5, $$6));
        }
        return Optional.empty();
    }

    public void p() {
        this.aw();
        this.A().a(this, cgk.e.e);
        if (!this.k) {
            this.k = true;
            this.g.b(new aem(aem.f, 0.0f));
            this.i = true;
        }
    }

    public @Nullable axg a(fmb $$0) {
        if (this.eh()) {
            return null;
        }
        if ($$0.g()) {
            this.g.b(new aem(aem.b, 0.0f));
        }
        axf $$1 = $$0.b();
        axf $$2 = this.A();
        amt<dwo> $$3 = $$2.aq();
        if (!$$0.h()) {
            this.ad();
        }
        if ($$1.aq() == $$3) {
            this.g.a(chy.a($$0), $$0.i());
            this.g.m();
            $$0.j().onTransition(this);
            return this;
        }
        this.df = true;
        fne $$4 = $$1.D_();
        this.g.b(new afy(this.b($$1), 3));
        this.g.b(new adn($$4.p(), $$4.q()));
        bbz $$5 = this.cL.aj();
        $$5.d(this);
        $$2.a(this, cgk.e.e);
        this.ej();
        bzm $$6 = bzl.a();
        $$6.a("moving");
        if ($$3 == dwo.h && $$1.aq() == dwo.i) {
            this.dn = this.dI();
        }
        $$6.c();
        $$6.a("placing");
        this.a($$1);
        this.g.a(chy.a($$0), $$0.i());
        this.g.m();
        $$1.d(this);
        $$6.c();
        this.h($$2);
        this.gf();
        this.g.b(new afh(this.gL()));
        $$5.a(this, $$1);
        $$5.e(this);
        $$5.c(this);
        $$0.j().onTransition(this);
        this.cZ = -1;
        this.cW = -1.0f;
        this.cX = -1;
        this.a($$0, $$2);
        return this;
    }

    @Override
    public void a(float $$0, boolean $$1, float $$2, boolean $$3) {
        super.a($$0, $$1, $$2, $$3);
        this.g.b(new afq($$0, $$1, $$2, $$3));
    }

    private void h(axf $$0) {
        amt<dwo> $$1 = $$0.aq();
        amt<dwo> $$2 = this.A().aq();
        aj.w.a(this, $$1, $$2);
        if ($$1 == dwo.i && $$2 == dwo.h && this.dn != null) {
            aj.D.a(this, this.dn);
        }
        if ($$2 != dwo.i) {
            this.dn = null;
        }
    }

    @Override
    public boolean a(axg $$0) {
        if ($$0.au()) {
            return this.N() == this;
        }
        if (this.au()) {
            return false;
        }
        return super.a($$0);
    }

    @Override
    public void a(cgk $$0, int $$1) {
        super.a($$0, $$1);
        this.cn.d();
    }

    @Override
    public Either<ddm.a, bhr> a(is $$02) {
        iz $$1 = this.A().a_($$02).c(edt.f);
        if (this.gr() || !this.cb()) {
            return Either.left((Object)ddm.a.c);
        }
        cdz $$2 = this.A().c().a(ceg.C, $$02);
        boolean $$3 = $$2.a(this.A());
        boolean $$4 = $$2.b(this.A());
        if (!$$4 && !$$3) {
            return Either.left((Object)$$2.a());
        }
        if (!this.a($$02, $$1)) {
            return Either.left((Object)ddm.a.a);
        }
        if (this.b($$02, $$1)) {
            return Either.left((Object)ddm.a.b);
        }
        if ($$4) {
            this.a(new a(fne.a.a(this.A().aq(), $$02, this.ec(), this.ee()), false), true);
        }
        if (!$$3) {
            return Either.left((Object)$$2.a());
        }
        if (!this.ha()) {
            double $$5 = 8.0;
            double $$6 = 5.0;
            ftm $$7 = ftm.c($$02);
            List<czz> $$8 = this.A().a(czz.class, new fth($$7.a() - 8.0, $$7.b() - 5.0, $$7.c() - 8.0, $$7.a() + 8.0, $$7.b() + 5.0, $$7.c() + 8.0), (? super T $$0) -> $$0.a(this.A(), this));
            if (!$$8.isEmpty()) {
                return Either.left((Object)ddm.a.d);
            }
        }
        Either $$9 = super.a($$02).ifRight($$0 -> {
            this.a(bdk.ar);
            aj.r.a(this);
        });
        if (!this.A().g()) {
            this.a(yh.c("sleep.not_possible"), true);
        }
        this.A().h();
        return $$9;
    }

    @Override
    public void b(is $$0) {
        this.a(bdk.i.b(bdk.n));
        super.b($$0);
    }

    private boolean a(is $$0, iz $$1) {
        return this.i($$0) || this.i($$0.a($$1.g()));
    }

    private boolean i(is $$0) {
        ftm $$1 = ftm.c($$0);
        return Math.abs(this.dP() - $$1.a()) <= 3.0 && Math.abs(this.dR() - $$1.b()) <= 2.0 && Math.abs(this.dV() - $$1.c()) <= 3.0;
    }

    private boolean b(is $$0, iz $$1) {
        is $$2 = $$0.d();
        return !this.h($$2) || !this.h($$2.a($$1.g()));
    }

    @Override
    public void a(boolean $$0, boolean $$1) {
        if (this.gr()) {
            this.A().p().a(this, new add(this, 2));
        }
        super.a($$0, $$1);
        if (this.g != null) {
            this.g.a(this.dP(), this.dR(), this.dV(), this.ec(), this.ee());
        }
    }

    @Override
    public boolean a(axf $$0, cex $$1) {
        return super.a($$0, $$1) || this.S() && !$$1.a(cfa.m) || !this.g.q();
    }

    @Override
    protected void b(axf $$0, is $$1) {
        if (!this.au()) {
            super.b($$0, $$1);
        }
    }

    @Override
    protected void a(double $$0, boolean $$1, eoh $$2, is $$3) {
        if (this.dv && $$1 && this.an > 0.0) {
            ftm $$4 = $$3.b().b(0.0, 0.5, 0.0);
            int $$5 = (int)bgj.a(50.0 * this.an, 0.0, 200.0);
            this.A().a(new lp(ly.b, $$2), $$4.g, $$4.h, $$4.i, $$5, (double)0.3f, (double)0.3f, (double)0.3f, (double)0.15f);
            this.dv = false;
        }
        super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public void a(@Nullable cgk $$0) {
        super.a($$0);
        this.cz = this.dI();
        this.cA = $$0;
        this.w($$0 != null && $$0.ay() == cgu.bP);
    }

    @Override
    protected void q() {
        if (this.A().y().i()) {
            super.q();
        }
    }

    @Override
    public void a(ems $$0, boolean $$1) {
        this.g.b(new adj(this.A(), $$0.aD_()));
        this.g.b(new aff($$0.aD_(), $$1));
    }

    @Override
    public void b(jd<asj> $$0) {
        this.g.b(new abq($$0));
    }

    private void hx() {
        this.dJ = this.dJ % 100 + 1;
    }

    @Override
    public OptionalInt a(@Nullable cdf $$0) {
        if ($$0 == null) {
            return OptionalInt.empty();
        }
        if (this.cn != this.cm) {
            this.r();
        }
        this.hx();
        dhi $$1 = $$0.createMenu(this.dJ, this.gK(), this);
        if ($$1 == null) {
            if (this.au()) {
                this.a(yh.c("container.spectatorCantOpen").a(l.m), true);
            }
            return OptionalInt.empty();
        }
        this.g.b(new afe($$1.l, $$1.a(), $$0.R_()));
        this.a($$1);
        this.cn = $$1;
        return OptionalInt.of(this.dJ);
    }

    @Override
    public void a(int $$0, dvm $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
        this.g.b(new aey($$0, $$1, $$2, $$3, $$4, $$5));
    }

    @Override
    public void a(cup $$0, ccv $$1) {
        if (this.cn != this.cm) {
            this.r();
        }
        this.hx();
        int $$2 = $$0.ad_();
        this.g.b(new aez(this.dJ, $$2, $$0.aA()));
        this.cn = new dil(this.dJ, this.gK(), $$1, $$0, $$2);
        this.a(this.cn);
    }

    @Override
    public void a(cwn $$0, ccv $$1) {
        if (this.cn != this.cm) {
            this.r();
        }
        this.hx();
        int $$2 = $$0.hk();
        this.g.b(new aez(this.dJ, $$2, $$0.aA()));
        this.cn = new diw(this.dJ, this.gK(), $$1, $$0, $$2);
        this.a(this.cn);
    }

    @Override
    public void a(dlt $$0, cdb $$1) {
        if ($$0.c(ki.ac)) {
            if (dpl.a($$0, this.C(), this)) {
                this.cn.d();
            }
            this.g.b(new afd($$1));
        }
    }

    @Override
    public void a(elm $$0) {
        this.g.b(adh.a($$0, elb::d));
    }

    @Override
    public void r() {
        this.g.b(new adu(this.cn.l));
        this.s();
    }

    @Override
    public void s() {
        this.cn.a(this);
        this.cm.a(this.cn);
        this.cn = this.cm;
    }

    @Override
    public void t() {
        double $$0 = this.dP();
        double $$1 = this.dR();
        double $$2 = this.dV();
        super.t();
        this.p(this.dP() - $$0, this.dR() - $$1, this.dV() - $$2);
    }

    public void a(double $$0, double $$1, double $$2) {
        if (this.cq() || axg.q($$0, $$1, $$2)) {
            return;
        }
        if (this.cB()) {
            int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0f);
            if ($$3 > 0) {
                this.a(bdk.D, $$3);
                this.a(0.01f * (float)$$3 * 0.01f);
            }
        } else if (((cgk)this).a(bdv.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0f);
            if ($$4 > 0) {
                this.a(bdk.w, $$4);
                this.a(0.01f * (float)$$4 * 0.01f);
            }
        } else if (this.by()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0f);
            if ($$5 > 0) {
                this.a(bdk.s, $$5);
                this.a(0.01f * (float)$$5 * 0.01f);
            }
        } else if (this.fl()) {
            if ($$1 > 0.0) {
                this.a(bdk.u, (int)Math.round($$1 * 100.0));
            }
        } else if (this.aV()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0f);
            if ($$6 > 0) {
                if (this.cA()) {
                    this.a(bdk.r, $$6);
                    this.a(0.1f * (float)$$6 * 0.01f);
                } else if (this.cz()) {
                    this.a(bdk.q, $$6);
                    this.a(0.0f * (float)$$6 * 0.01f);
                } else {
                    this.a(bdk.p, $$6);
                    this.a(0.0f * (float)$$6 * 0.01f);
                }
            }
        } else if (this.gj()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0f);
            this.a(bdk.C, $$7);
        } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0f);
            if ($$8 > 25) {
                this.a(bdk.v, $$8);
            }
        }
    }

    private void p(double $$0, double $$1, double $$2) {
        if (!this.cq() || axg.q($$0, $$1, $$2)) {
            return;
        }
        int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0f);
        cgk $$4 = this.dz();
        if ($$4 instanceof dgi) {
            this.a(bdk.x, $$3);
        } else if ($$4 instanceof dgb) {
            this.a(bdk.y, $$3);
        } else if ($$4 instanceof cxb) {
            this.a(bdk.z, $$3);
        } else if ($$4 instanceof cup) {
            this.a(bdk.B, $$3);
        } else if ($$4 instanceof dah) {
            this.a(bdk.E, $$3);
        } else if ($$4 instanceof cwk) {
            this.a(bdk.A, $$3);
        } else if ($$4 instanceof cwn) {
            this.a(bdk.F, $$3);
        }
    }

    private static boolean q(double $$0, double $$1, double $$2) {
        return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
    }

    @Override
    public void a(bdh<?> $$0, int $$12) {
        this.cN.b(this, $$0, $$12);
        this.A().i().a($$0, this, (fup $$1) -> $$1.b($$12));
    }

    @Override
    public void a(bdh<?> $$0) {
        this.cN.a(this, $$0, 0);
        this.A().i().a($$0, this, fup::c);
    }

    @Override
    public int a(Collection<dqx<?>> $$0) {
        return this.dg.a($$0, this);
    }

    @Override
    public void a(dqx<?> $$0, List<dlt> $$1) {
        aj.ae.a(this, $$0.a(), $$1);
    }

    @Override
    public void b(List<amt<dqs<?>>> $$02) {
        List<dqx<?>> $$1 = $$02.stream().flatMap($$0 -> this.cL.aJ().b((amt<dqs<?>>)$$0).stream()).collect(Collectors.toList());
        this.a((Collection<dqx<?>>)$$1);
    }

    @Override
    public int b(Collection<dqx<?>> $$0) {
        return this.dg.b($$0, this);
    }

    @Override
    public void u() {
        super.u();
        this.a(bdk.G);
        if (this.cA()) {
            this.a(0.2f);
        } else {
            this.a(0.05f);
        }
    }

    @Override
    public void d(int $$0) {
        if ($$0 == 0) {
            return;
        }
        super.d($$0);
        this.cZ = -1;
    }

    public void v() {
        this.dj = true;
        this.ce();
        if (this.gr()) {
            this.a(true, false);
        }
    }

    public boolean w() {
        return this.dj;
    }

    public void x() {
        this.cW = -1.0E8f;
    }

    @Override
    public void a(yh $$0, boolean $$1) {
        this.b($$0, $$1);
    }

    @Override
    protected void Q_() {
        if (!this.bT.f() && this.fZ()) {
            this.g.b(new aei(this, 9));
            super.Q_();
        }
    }

    @Override
    public void a(ep.a $$0, ftm $$1) {
        super.a($$0, $$1);
        this.g.b(new afo($$0, $$1.g, $$1.h, $$1.i));
    }

    public void a(ep.a $$0, cgk $$1, ep.a $$2) {
        ftm $$3 = $$2.a($$1);
        super.a($$0, $$3);
        this.g.b(new afo($$0, $$1, $$2));
    }

    public void a(axg $$0, boolean $$1) {
        this.dw = $$0.dw;
        this.dG = $$0.dG;
        this.h.a($$0.h.b(), $$0.h.c());
        this.z();
        this.fw().b($$0.fw());
        if ($$1) {
            this.fw().c($$0.fw());
            this.x($$0.eZ());
            this.co = $$0.co;
            for (cfm $$2 : $$0.eW()) {
                this.a(new cfm($$2));
            }
            this.g($$0);
            this.aG = $$0.aG;
        } else {
            this.x(this.fq());
            if (this.A().U().a(eua.s).booleanValue() || $$0.au()) {
                this.g($$0);
            }
        }
        this.cv = $$0.cv;
        this.cl = $$0.cl;
        this.aD().a(t, (Byte)$$0.aD().a(t));
        this.cZ = -1;
        this.cW = -1.0f;
        this.cX = -1;
        this.dg.a($$0.dg);
        this.i = $$0.i;
        this.dn = $$0.dn;
        this.dq = $$0.dq;
        this.dI = $$0.dI;
        this.b($$0.al());
        this.c($$0.am());
        this.d($$0.hk());
        this.gy().a($$0.gy());
    }

    private void g(ddm $$0) {
        this.gK().a($$0.gK());
        this.cs = $$0.cs;
        this.ct = $$0.ct;
        this.cu = $$0.cu;
        this.q($$0.gF());
    }

    @Override
    protected void a(cfm $$0, @Nullable cgk $$1) {
        super.a($$0, $$1);
        this.g.b(new ahv(this.aA(), $$0, true));
        if ($$0.a(cfo.y)) {
            this.di = this.at;
            this.dh = this.dI();
        }
        aj.B.a(this, $$1);
    }

    @Override
    protected void a(cfm $$0, boolean $$1, @Nullable cgk $$2) {
        super.a($$0, $$1, $$2);
        this.g.b(new ahv(this.aA(), $$0, false));
        aj.B.a(this, $$2);
    }

    @Override
    protected void c(Collection<cfm> $$0) {
        super.c($$0);
        for (cfm $$1 : $$0) {
            this.g.b(new afw(this.aA(), $$1.c()));
            if (!$$1.a(cfo.y)) continue;
            this.dh = null;
        }
        aj.B.a(this, (cgk)null);
    }

    @Override
    public void b(double $$0, double $$1, double $$2) {
        this.g.a(new chy(new ftm($$0, $$1, $$2), ftm.c, 0.0f, 0.0f), chz.a(chz.l, chz.k));
    }

    @Override
    public void c(double $$0, double $$1, double $$2) {
        this.g.a(new chy(new ftm($$0, $$1, $$2), ftm.c, 0.0f, 0.0f), chz.j);
    }

    @Override
    public boolean a(axf $$0, double $$1, double $$2, double $$3, Set<chz> $$4, float $$5, float $$6, boolean $$7) {
        boolean $$8;
        if (this.gr()) {
            this.a(true, true);
        }
        if ($$7) {
            this.d((cgk)this);
        }
        if ($$8 = super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7)) {
            this.r($$4.contains((Object)chz.d) ? this.cS() + $$5 : $$5);
            this.g.l();
        }
        return $$8;
    }

    @Override
    public void d(double $$0, double $$1, double $$2) {
        super.d($$0, $$1, $$2);
        this.g.m();
    }

    @Override
    public void b(cgk $$0) {
        this.A().p().a(this, new add($$0, 4));
    }

    @Override
    public void c(cgk $$0) {
        this.A().p().a(this, new add($$0, 5));
    }

    @Override
    public void z() {
        if (this.g == null) {
            return;
        }
        this.g.b(new afh(this.gL()));
        this.M();
    }

    public axf A() {
        return (axf)super.ao();
    }

    public boolean a(dwl $$0) {
        boolean $$1 = this.au();
        if (!this.h.a($$0)) {
            return false;
        }
        this.g.b(new aem(aem.e, $$0.a()));
        if ($$0 == dwl.d) {
            this.k();
            this.cf();
            this.gf();
            dsq.a(this);
        } else {
            this.d((cgk)this);
            if ($$1) {
                dsq.a(this.A(), (chl)this);
            }
        }
        this.z();
        this.fY();
        return true;
    }

    @Override
    public dwl a() {
        return this.h.b();
    }

    public ec B() {
        return this.dH;
    }

    public ed C() {
        return new ed(this.B(), this.dI(), this.cl(), this.A(), this.I(), this.aq(), this.R_(), this.cL, this);
    }

    public void a(yh $$0) {
        this.b($$0, false);
    }

    public void b(yh $$0, boolean $$1) {
        if (!this.x($$1)) {
            return;
        }
        this.g.a(new ahk($$0, $$1), xm.a(() -> {
            if (this.x(false)) {
                int $$1 = 256;
                String $$2 = $$0.a(256);
                yw $$3 = yh.b($$2).a(l.o);
                return new ahk(yh.a("multiplayer.message_not_delivered", $$3).a(l.m), false);
            }
            return null;
        }));
    }

    public void a(yx $$0, boolean $$1, yd.a $$2) {
        if (this.hy()) {
            $$0.a(this, $$1, $$2);
        }
    }

    public String D() {
        SocketAddress $$0 = this.g.n();
        if ($$0 instanceof InetSocketAddress) {
            InetSocketAddress $$1 = (InetSocketAddress)$$0;
            return InetAddresses.toAddrString((InetAddress)$$1.getAddress());
        }
        return "<unknown>";
    }

    public void a(awp $$0) {
        this.dl = $$0.b();
        this.dk = $$0.c();
        this.da = $$0.d();
        this.dc = $$0.e();
        this.dt = $$0.h();
        this.du = $$0.i();
        this.db = $$0.j();
        this.aD().a(t, (byte)$$0.f());
        this.aD().a(s, $$0.g());
    }

    public awp E() {
        byte $$0 = (Byte)this.aD().a(t);
        return new awp(this.dl, this.dk, this.da, this.dc, $$0, this.at(), this.dt, this.du, this.db);
    }

    public boolean F() {
        return this.dc;
    }

    public ddj G() {
        return this.da;
    }

    private boolean x(boolean $$0) {
        if (this.da == ddj.c) {
            return $$0;
        }
        return true;
    }

    private boolean hy() {
        return this.da == ddj.a;
    }

    public int H() {
        return this.dk;
    }

    public void a(alq $$0) {
        this.g.b(new agc($$0.a(), $$0.d().map(alq.a::a)));
    }

    @Override
    public bbn I() {
        return this.cL.b(this.gJ());
    }

    public void J() {
        this.dd = bhs.c();
    }

    public bdg K() {
        return this.cN;
    }

    public bdf L() {
        return this.dg;
    }

    @Override
    protected void M() {
        if (this.au()) {
            this.eU();
            this.l(true);
        } else {
            super.M();
        }
    }

    public cgk N() {
        return this.de == null ? this : this.de;
    }

    public void d(@Nullable cgk $$0) {
        cgk $$1 = this.N();
        cgk cgk2 = this.de = $$0 == null ? this : $$0;
        if ($$1 != this.de) {
            dwo dwo2 = this.de.ao();
            if (dwo2 instanceof axf) {
                axf $$2 = (axf)dwo2;
                this.a($$2, this.de.dP(), this.de.dR(), this.de.dV(), Set.of(), this.ec(), this.ee(), false);
            }
            if ($$0 != null) {
                this.A().p().a(this);
            }
            this.g.b(new agj(this.de));
            this.g.m();
        }
    }

    @Override
    protected void O() {
        if (!this.df) {
            super.O();
        }
    }

    @Override
    public void e(cgk $$0) {
        if (this.au()) {
            this.d($$0);
        } else {
            super.e($$0);
        }
    }

    public long P() {
        return this.dd;
    }

    public @Nullable yh Q() {
        return null;
    }

    public int R() {
        return 0;
    }

    @Override
    public void a(cdb $$0) {
        super.a($$0);
        this.hf();
    }

    public boolean S() {
        return this.df;
    }

    public void T() {
        this.df = false;
    }

    public anb U() {
        return this.cM;
    }

    public @Nullable a V() {
        return this.dr;
    }

    public void b(axg $$0) {
        this.a($$0.dr, false);
    }

    public void a(@Nullable a $$0, boolean $$1) {
        if ($$1 && $$0 != null && !$$0.a(this.dr)) {
            this.a(cH);
        }
        this.dr = $$0;
    }

    public jw W() {
        return this.dp;
    }

    public void a(jw $$0) {
        this.dp = $$0;
    }

    public awo X() {
        return this.dq;
    }

    public void a(awo $$0) {
        this.dq = $$0;
    }

    @Override
    public czl a(dlt $$0, boolean $$1, boolean $$2) {
        czl $$3 = super.a($$0, $$1, $$2);
        if ($$2) {
            dlt $$4;
            dlt dlt2 = $$4 = $$3 != null ? $$3.e() : dlt.l;
            if (!$$4.f()) {
                this.a(bdk.f.b($$4.h()), $$0.N());
                this.a(bdk.H);
            }
        }
        return $$3;
    }

    public ayo Y() {
        return this.ds;
    }

    public void a(axf $$0) {
        this.a((dwo)$$0);
        this.h.a($$0);
    }

    private static @Nullable dwl a(fnq $$0, String $$1) {
        return $$0.a($$1, dwl.h).orElse(null);
    }

    private dwl b(@Nullable dwl $$0) {
        dwl $$1 = this.cL.bf();
        if ($$1 != null) {
            return $$1;
        }
        return $$0 != null ? $$0 : this.cL.w();
    }

    private void g(fns $$0) {
        $$0.a("playerGameType", dwl.h, this.h.b());
        dwl $$1 = this.h.c();
        $$0.b("previousPlayerGameType", dwl.h, $$1);
    }

    @Override
    public boolean Z() {
        return this.dt;
    }

    public boolean c(axg $$0) {
        if ($$0 == this) {
            return false;
        }
        return this.dt || $$0.dt;
    }

    @Override
    public boolean c(axf $$0, is $$1) {
        return super.c($$0, $$1) && $$0.a((cgk)this, $$1);
    }

    @Override
    protected void a_(dlt $$0) {
        aj.Y.a(this, $$0);
        super.a_($$0);
    }

    public void a(boolean $$0) {
        ddl $$12 = this.gK();
        dlt $$2 = $$12.a($$0);
        this.cn.b($$12, $$12.g()).ifPresent($$1 -> this.cn.a($$1, $$12.h()));
        if (this.bT.f()) {
            this.gf();
        }
        this.a($$2, false, true);
    }

    @Override
    public void b(dlt $$0) {
        if (!this.gK().g($$0)) {
            this.a($$0, false);
        }
    }

    public boolean aa() {
        return this.du;
    }

    @Override
    public Optional<dcj> ab() {
        return Optional.of(this.dw);
    }

    public void b(boolean $$0) {
        this.dv = $$0;
    }

    @Override
    public void a(czl $$0) {
        super.a($$0);
        cgk $$1 = $$0.p();
        if ($$1 != null) {
            aj.T.a(this, $$0.e(), $$1);
        }
    }

    public void a(yz $$0) {
        this.dG = $$0;
    }

    public @Nullable yz ac() {
        if (this.dG != null && this.dG.b()) {
            return null;
        }
        return this.dG;
    }

    @Override
    public void a(double $$0, double $$1) {
        this.cy = (float)(bgj.d($$1, $$0) * 57.2957763671875 - (double)this.ec());
        this.g.b(new aeo(this));
    }

    @Override
    public boolean a(cgk $$0, boolean $$1, boolean $$2) {
        if (super.a($$0, $$1, $$2)) {
            $$0.k(this);
            this.g.a(new chy(this.dI(), ftm.c, 0.0f, 0.0f), chz.k);
            if ($$0 instanceof chl) {
                chl $$3 = (chl)$$0;
                this.cL.aj().a($$3, this.g);
            }
            this.g.b(new agx($$0));
            return true;
        }
        return false;
    }

    @Override
    public void ad() {
        cgk $$0 = this.dz();
        super.ad();
        if ($$0 instanceof chl) {
            chl $$1 = (chl)$$0;
            for (cfm $$2 : $$1.eW()) {
                this.g.b(new afw($$0.aA(), $$2.c()));
            }
        }
        if ($$0 != null) {
            this.g.b(new agx($$0));
        }
    }

    public ahx b(axf $$0) {
        return new ahx($$0.ap(), $$0.aq(), dxq.a($$0.J()), this.h.b(), this.h.c(), $$0.ar(), $$0.I(), this.hk(), this.aN(), $$0.V());
    }

    public void c(is $$0) {
        this.dx = $$0;
    }

    public void ae() {
        this.dx = null;
    }

    public @Nullable is af() {
        return this.dx;
    }

    @Override
    public ftm ag() {
        cgk $$0 = this.dz();
        if ($$0 != null && $$0.dl() != this) {
            return $$0.ag();
        }
        return this.dy;
    }

    @Override
    public ftm ah() {
        cgk $$0 = this.dz();
        if ($$0 != null && $$0.dl() != this) {
            return $$0.ah();
        }
        return this.dy;
    }

    public void a(ftm $$0) {
        this.dy = $$0;
    }

    @Override
    protected float a(cgk $$0, float $$1, cex $$2) {
        return dsq.a(this.A(), this.eq(), $$0, $$2, $$1);
    }

    @Override
    public void a(dlp $$0, cgv $$1) {
        super.a($$0, $$1);
        this.b(bdk.d.b($$0));
    }

    public ddk ai() {
        return this.dz;
    }

    public void a(ddk $$0) {
        this.dz = $$0;
    }

    public ftm aj() {
        float $$0;
        float f2 = this.dz.c() == this.dz.d() ? 0.0f : ($$0 = this.dz.c() ? 1.0f : -1.0f);
        float $$1 = this.dz.a() == this.dz.b() ? 0.0f : (this.dz.a() ? 1.0f : -1.0f);
        return axg.a(new ftm($$0, 0.0, $$1), 1.0f, this.ec());
    }

    public void a(dfc $$0) {
        this.dA.add($$0);
    }

    public void b(dfc $$0) {
        this.dA.remove($$0);
    }

    public Set<dfc> ak() {
        return this.dA;
    }

    public uz al() {
        return this.dC;
    }

    protected void b(uz $$0) {
        this.dC = $$0;
        this.b(axg.d($$0));
    }

    public uz am() {
        return this.dD;
    }

    protected void c(uz $$0) {
        this.dD = $$0;
        this.c(axg.d($$0));
    }

    public long c(dfc $$0) {
        dwo dwo2 = $$0.ao();
        if (dwo2 instanceof axf) {
            axf $$1 = (axf)dwo2;
            dvu $$2 = $$0.dM();
            this.a($$0);
            $$1.l();
            return axg.a($$1, $$2) - 1L;
        }
        return 0L;
    }

    public static long a(axf $$0, dvu $$1) {
        $$0.p().b(axm.n, $$1, 2);
        return axm.n.g();
    }

    public void a(Set<bxe<?>> $$0) {
        this.dI = Set.copyOf($$0);
    }

    public Set<bxe<?>> an() {
        if (!this.cL.bw().a(this)) {
            return Set.of();
        }
        return this.dI;
    }

    @Override
    public /* synthetic */ dwo ao() {
        return this.A();
    }

    @Override
    public /* synthetic */ @Nullable cgk b(fmb fmb2) {
        return this.a(fmb2);
    }

    public static final class a
    extends Record {
        final fne.a b;
        final boolean c;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)fne.a.b.forGetter(a::a), (App)Codec.BOOL.optionalFieldOf("forced", (Object)false).forGetter(a::b)).apply((Applicative)$$0, a::new));

        public a(fne.a $$0, boolean $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        static amt<dwo> b(@Nullable a $$0) {
            return $$0 != null ? $$0.a().a() : dwo.h;
        }

        public boolean a(@Nullable a $$0) {
            return $$0 != null && this.b.c().equals($$0.b.c());
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "respawnData;forced", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "respawnData;forced", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "respawnData;forced", "b", "c"}, this, $$0);
        }

        public fne.a a() {
            return this.b;
        }

        public boolean b() {
            return this.c;
        }
    }

    record b(ftm a, float b, float c) {
        public static b a(ftm $$0, is $$1, float $$2) {
            return new b($$0, axg$b.a($$0, $$1), $$2);
        }

        private static float a(ftm $$0, is $$1) {
            ftm $$2 = ftm.c($$1).d($$0).d();
            return (float)bgj.g(bgj.d($$2.i, $$2.g) * 57.2957763671875 - 90.0);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "position;yaw;pitch", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "position;yaw;pitch", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "position;yaw;pitch", "a", "b", "c"}, this, $$0);
        }
    }

    public static final class c
    extends Record {
        private final Optional<amt<dwo>> c;
        private final Optional<ftm> d;
        private final Optional<ftl> e;
        public static final MapCodec<c> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)dwo.g.optionalFieldOf(axg.f).forGetter(c::a), (App)ftm.a.optionalFieldOf("Pos").forGetter(c::b), (App)ftl.i.optionalFieldOf("Rotation").forGetter(c::c)).apply((Applicative)$$0, c::new));
        public static final c b = new c(Optional.empty(), Optional.empty(), Optional.empty());

        public c(Optional<amt<dwo>> $$0, Optional<ftm> $$1, Optional<ftl> $$2) {
            this.c = $$0;
            this.d = $$1;
            this.e = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "dimension;position;rotation", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "dimension;position;rotation", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "dimension;position;rotation", "c", "d", "e"}, this, $$0);
        }

        public Optional<amt<dwo>> a() {
            return this.c;
        }

        public Optional<ftm> b() {
            return this.d;
        }

        public Optional<ftl> c() {
            return this.e;
        }
    }
}

