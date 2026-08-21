/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiPredicate;
import net.minecraft.server.MinecraftServer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class dcx
extends dcw
implements cia,
dcz {
    private static final Logger cB = LogUtils.getLogger();
    private static final alw<dcy> cC = ama.a(dcx.class, aly.t);
    public static final int cx = 12;
    public static final Map<dlp, Integer> cy = ImmutableMap.of((Object)dlx.rd, (Object)4, (Object)dlx.ws, (Object)1, (Object)dlx.wr, (Object)1, (Object)dlx.xz, (Object)1);
    private static final int cD = 2;
    private static final int cE = 10;
    private static final int cF = 1200;
    private static final int cG = 24000;
    private static final int cH = 10;
    private static final int cI = 5;
    private static final long cJ = 24000L;
    @VisibleForTesting
    public static final float cz = 0.5f;
    private static final int cK = 0;
    private static final byte cL = 0;
    private static final int cM = 0;
    private static final int cN = 0;
    private static final int cO = 0;
    private static final boolean cP = false;
    private int cQ;
    private boolean cR;
    private @Nullable ddm cU;
    private boolean cV;
    private int cW = 0;
    private final cqs cX = new cqs();
    private long cY;
    private long cZ = 0L;
    private int da = 0;
    private long db = 0L;
    private int dc = 0;
    private long dd;
    private boolean de = false;
    private static final ImmutableList<cqw<?>> df = ImmutableList.of(cqw.b, cqw.c, cqw.d, cqw.e, cqw.g, cqw.h, cqw.i, cqw.j, cqw.k, cqw.l, cqw.M, cqw.ba, (Object[])new cqw[]{cqw.n, cqw.o, cqw.r, cqw.s, cqw.u, cqw.w, cqw.x, cqw.y, cqw.z, cqw.B, cqw.f, cqw.D, cqw.E, cqw.F, cqw.I, cqw.J, cqw.K, cqw.G});
    private static final ImmutableList<cse<? extends csd<? super dcx>>> dg = ImmutableList.of(cse.c, cse.d, cse.b, cse.e, cse.f, cse.g, cse.h, cse.i, cse.j);
    public static final Map<cqw<jc>, BiPredicate<dcx, jd<cta>>> cA = ImmutableMap.of(cqw.b, ($$0, $$1) -> $$1.a(ctb.n), cqw.c, ($$0, $$1) -> $$0.gZ().b().a().b().test((jd<cta>)$$1), cqw.d, ($$0, $$1) -> dda.a.test((jd<cta>)$$1), cqw.e, ($$0, $$1) -> $$1.a(ctb.o));

    public dcx(cgu<? extends dcx> $$0, dwo $$1) {
        this($$0, $$1, ddc.c);
    }

    public dcx(cgu<? extends dcx> $$0, dwo $$1, amt<ddc> $$2) {
        this($$0, $$1, $$1.J_().d($$2));
    }

    public dcx(cgu<? extends dcx> $$0, dwo $$1, jd<ddc> $$2) {
        super((cgu<? extends dcw>)$$0, $$1);
        this.N().e(true);
        this.N().a(true);
        this.N().a(48.0f);
        this.b_(true);
        this.a(this.gZ().a($$2).b($$1.J_(), dda.b));
    }

    public cim<dcx> ev() {
        return super.ev();
    }

    protected cim.b<dcx> ew() {
        return cim.a(df, dg);
    }

    @Override
    protected cim<?> a(Dynamic<?> $$0) {
        cim<dcx> $$1 = this.ew().a($$0);
        this.a($$1);
        return $$1;
    }

    public void i(axf $$0) {
        cim<dcx> $$1 = this.ev();
        $$1.b($$0, this);
        this.ca = $$1.h();
        this.a(this.ev());
    }

    private void a(cim<dcx> $$0) {
        jd<dda> $$1 = this.gZ().b();
        if (this.e_()) {
            $$0.a(ceg.S);
            $$0.a(dfl.d, cmo.a(0.5f));
        } else {
            $$0.a(ceg.R);
            $$0.a(dfl.c, (ImmutableList<Pair<Integer, cje<dcx>>>)cmo.b($$1, 0.5f), (Set<Pair<cqw<?>, cqx>>)ImmutableSet.of((Object)Pair.of(cqw.c, (Object)((Object)cqx.a))));
        }
        $$0.a(dfl.a, cmo.a($$1, 0.5f));
        $$0.a(dfl.f, (ImmutableList<Pair<Integer, cje<dcx>>>)cmo.d($$1, 0.5f), (Set<Pair<cqw<?>, cqx>>)ImmutableSet.of((Object)Pair.of(cqw.e, (Object)((Object)cqx.a))));
        $$0.a(dfl.e, cmo.c($$1, 0.5f));
        $$0.a(dfl.b, cmo.e($$1, 0.5f));
        $$0.a(dfl.g, cmo.f($$1, 0.5f));
        $$0.a(dfl.i, cmo.g($$1, 0.5f));
        $$0.a(dfl.h, cmo.h($$1, 0.5f));
        $$0.a(dfl.j, cmo.i($$1, 0.5f));
        $$0.a((Set<dfl>)ImmutableSet.of((Object)dfl.a));
        $$0.b(dfl.b);
        $$0.a(dfl.b);
        $$0.a(this.ao().c(), this.ao().au(), this.dI());
    }

    @Override
    protected void h() {
        super.h();
        if (this.ao() instanceof axf) {
            this.i((axf)this.ao());
        }
    }

    public static cir.a gT() {
        return chn.E().a(cis.x, 0.5);
    }

    public boolean gU() {
        return this.de;
    }

    @Override
    protected void a(axf $$0) {
        dfh $$2;
        bzm $$1 = bzl.a();
        $$1.a("villagerBrain");
        this.ev().a($$0, this);
        $$1.c();
        if (this.de) {
            this.de = false;
        }
        if (!this.gQ() && this.cQ > 0) {
            --this.cQ;
            if (this.cQ <= 0) {
                if (this.cR) {
                    this.k($$0);
                    this.cR = false;
                }
                this.a(new cfm(cfo.j, 200, 0));
            }
        }
        if (this.cU != null) {
            $$0.a(csu.e, (cgk)this.cU, this);
            $$0.a((cgk)this, (byte)14);
            this.cU = null;
        }
        if (!this.gG() && this.as.a(100) == 0 && ($$2 = $$0.f(this.dK())) != null && $$2.r() && !$$2.a()) {
            $$0.a((cgk)this, (byte)42);
        }
        if (this.gZ().b().a(dda.b) && this.gQ()) {
            this.gS();
        }
        super.a($$0);
    }

    @Override
    public void g() {
        super.g();
        if (this.p() > 0) {
            this.r(this.p() - 1);
        }
        this.hr();
    }

    @Override
    public cdc b(ddm $$0, cdb $$1) {
        dlt $$2 = $$0.b($$1);
        if (!$$2.a(dlx.vm) && this.cb() && !this.gQ() && !this.gr()) {
            if (this.e_()) {
                this.hf();
                return cdc.a;
            }
            if (!this.ao().B_()) {
                boolean $$3 = this.b().isEmpty();
                if ($$1 == cdb.a) {
                    if ($$3) {
                        this.hf();
                    }
                    $$0.a(bdk.U);
                }
                if ($$3) {
                    return cdc.c;
                }
                this.h($$0);
            }
            return cdc.a;
        }
        return super.b($$0, $$1);
    }

    private void hf() {
        this.r(40);
        if (!this.ao().B_()) {
            this.b(bda.Eo);
        }
    }

    private void h(ddm $$0) {
        this.i($$0);
        this.a($$0);
        this.a($$0, this.R_(), this.gZ().c());
    }

    @Override
    public void a(@Nullable ddm $$0) {
        boolean $$1 = this.a() != null && $$0 == null;
        super.a($$0);
        if ($$1) {
            this.gS();
        }
    }

    @Override
    protected void gS() {
        super.gS();
        this.hg();
    }

    private void hg() {
        if (this.ao().B_()) {
            return;
        }
        for (dvl $$0 : this.b()) {
            $$0.n();
        }
    }

    @Override
    public boolean gV() {
        return true;
    }

    public void gW() {
        this.hl();
        for (dvl $$0 : this.b()) {
            $$0.j();
        }
        this.hh();
        this.db = this.ao().au();
        ++this.dc;
    }

    private void hh() {
        dvm $$0 = this.b();
        ddm $$1 = this.a();
        if ($$1 != null && !$$0.isEmpty()) {
            $$1.a($$1.cn.l, $$0, this.gZ().c(), this.d(), this.e(), this.gV());
        }
    }

    private boolean hi() {
        for (dvl $$0 : this.b()) {
            if (!$$0.t()) continue;
            return true;
        }
        return false;
    }

    private boolean hj() {
        return this.dc == 0 || this.dc < 2 && this.ao().au() > this.db + 2400L;
    }

    public boolean j(axf $$0) {
        long $$1 = this.db + 12000L;
        long $$2 = this.ao().au();
        boolean $$3 = $$2 > $$1;
        long $$4 = $$0.e();
        boolean bl2 = this.dd > 0L && $$4 > this.dd;
        this.dd = $$4;
        if ($$3 |= bl2) {
            this.db = $$2;
            this.hs();
        }
        return this.hj() && this.hi();
    }

    private void hk() {
        int $$0 = 2 - this.dc;
        if ($$0 > 0) {
            for (dvl $$1 : this.b()) {
                $$1.j();
            }
        }
        for (int $$2 = 0; $$2 < $$0; ++$$2) {
            this.hl();
        }
        this.hh();
    }

    private void hl() {
        for (dvl $$0 : this.b()) {
            $$0.g();
        }
    }

    private void i(ddm $$0) {
        int $$1 = this.g($$0);
        if ($$1 != 0) {
            for (dvl $$2 : this.b()) {
                $$2.a(-bgj.b((float)$$1 * $$2.p()));
            }
        }
        if ($$0.d(cfo.F)) {
            cfm $$3 = $$0.e(cfo.F);
            int $$4 = $$3.e();
            for (dvl $$5 : this.b()) {
                double $$6 = 0.3 + 0.0625 * (double)$$4;
                int $$7 = (int)Math.floor($$6 * (double)$$5.a().N());
                $$5.a(-Math.max($$7, 1));
            }
        }
    }

    @Override
    protected void a(ama.a $$0) {
        super.a($$0);
        $$0.a(cC, dcx.gX());
    }

    public static dcy gX() {
        return new dcy(mi.x.b(ddc.c), mi.y.b(dda.b), 1);
    }

    @Override
    protected void a(fns $$0) {
        super.a($$0);
        $$0.a("VillagerData", dcy.c, this.gZ());
        $$0.a("FoodLevel", (byte)this.cW);
        $$0.a("Gossips", cqs.a, this.cX);
        $$0.a("Xp", this.da);
        $$0.a("LastRestock", this.db);
        $$0.a("LastGossipDecay", this.cZ);
        $$0.a("RestocksToday", this.dc);
        if (this.de) {
            $$0.a("AssignProfessionWhenSpawned", true);
        }
    }

    @Override
    protected void a(fnq $$0) {
        super.a($$0);
        this.az.a(cC, $$0.a("VillagerData", dcy.c).orElseGet(dcx::gX));
        this.cW = $$0.a("FoodLevel", (byte)0);
        this.cX.c();
        $$0.a("Gossips", cqs.a).ifPresent(this.cX::a);
        this.da = $$0.a("Xp", 0);
        this.db = $$0.a("LastRestock", 0L);
        this.cZ = $$0.a("LastGossipDecay", 0L);
        if (this.ao() instanceof axf) {
            this.i((axf)this.ao());
        }
        this.dc = $$0.a("RestocksToday", 0);
        this.de = $$0.a("AssignProfessionWhenSpawned", false);
    }

    @Override
    public boolean i(double $$0) {
        return false;
    }

    @Override
    protected @Nullable bcz W() {
        if (this.gr()) {
            return null;
        }
        if (this.gQ()) {
            return bda.Ep;
        }
        return bda.Ek;
    }

    @Override
    protected bcz h(cex $$0) {
        return bda.En;
    }

    @Override
    protected bcz fd() {
        return bda.Em;
    }

    public void gY() {
        this.b(this.gZ().b().a().f());
    }

    @Override
    public void a(dcy $$0) {
        dcy $$1 = this.gZ();
        if (!$$1.b().equals($$0.b())) {
            this.cw = null;
        }
        this.az.a(cC, $$0);
    }

    @Override
    public dcy gZ() {
        return this.az.a(cC);
    }

    @Override
    protected void b(dvl $$0) {
        int $$1 = 3 + this.as.a(4);
        this.da += $$0.q();
        this.cU = this.a();
        if (this.hp()) {
            this.cQ = 40;
            this.cR = true;
            $$1 += 5;
        }
        if ($$0.u()) {
            this.ao().b(new cgz(this.ao(), this.dP(), this.dR() + 0.5, this.dV(), $$1));
        }
    }

    @Override
    public void a(@Nullable chl $$0) {
        if ($$0 != null && this.ao() instanceof axf) {
            ((axf)this.ao()).a(csu.c, (cgk)$$0, this);
            if (this.cb() && $$0 instanceof ddm) {
                this.ao().a((cgk)this, (byte)13);
            }
        }
        super.a($$0);
    }

    @Override
    public void a(cex $$0) {
        cB.info("Villager {} died, message: '{}'", (Object)this, (Object)$$0.a(this).getString());
        cgk $$1 = $$0.d();
        if ($$1 != null) {
            this.H($$1);
        }
        this.hm();
        super.a($$0);
    }

    private void hm() {
        this.a(cqw.b);
        this.a(cqw.c);
        this.a(cqw.d);
        this.a(cqw.e);
    }

    /*
     * WARNING - void declaration
     */
    private void H(cgk $$0) {
        void $$2;
        dwo dwo2 = this.ao();
        if (!(dwo2 instanceof axf)) {
            return;
        }
        axf $$1 = (axf)dwo2;
        Optional<cqy> $$3 = this.ca.c(cqw.h);
        if ($$3.isEmpty()) {
            return;
        }
        $$3.get().b(cia.class::isInstance).forEach(arg_0 -> dcx.a((axf)$$2, $$0, arg_0));
    }

    public void a(cqw<jc> $$0) {
        if (!(this.ao() instanceof axf)) {
            return;
        }
        MinecraftServer $$1 = ((axf)this.ao()).s();
        this.ca.c($$0).ifPresent($$2 -> {
            axf $$3 = $$1.a($$2.a());
            if ($$3 == null) {
                return;
            }
            csx $$4 = $$3.F();
            Optional<jd<cta>> $$5 = $$4.c($$2.b());
            BiPredicate<dcx, jd<cta>> $$6 = cA.get($$0);
            if ($$5.isPresent() && $$6.test(this, $$5.get())) {
                $$4.b($$2.b());
                $$3.W().b($$2.b());
            }
        });
    }

    @Override
    public boolean Y_() {
        return this.cW + this.hq() >= 12 && !this.gr() && this.Z_() == 0;
    }

    private boolean hn() {
        return this.cW < 12;
    }

    private void ho() {
        if (!this.hn() || this.hq() == 0) {
            return;
        }
        for (int $$0 = 0; $$0 < this.gP().b(); ++$$0) {
            int $$3;
            Integer $$2;
            dlt $$1 = this.gP().a($$0);
            if ($$1.f() || ($$2 = cy.get($$1.h())) == null) continue;
            for (int $$4 = $$3 = $$1.N(); $$4 > 0; --$$4) {
                this.cW += $$2.intValue();
                this.gP().a($$0, 1);
                if (this.hn()) continue;
                return;
            }
        }
    }

    public int g(ddm $$02) {
        return this.cX.a($$02.cY(), (cqt $$0) -> true);
    }

    private void t(int $$0) {
        this.cW -= $$0;
    }

    public void ha() {
        this.ho();
        this.t(12);
    }

    public void b(dvm $$0) {
        this.cw = $$0;
    }

    private boolean hp() {
        int $$0 = this.gZ().c();
        return dcy.d($$0) && this.da >= dcy.c($$0);
    }

    private void k(axf $$0) {
        this.a(this.gZ().a(this.gZ().c() + 1));
        this.h($$0);
    }

    @Override
    protected yh cR() {
        return this.gZ().b().a().a();
    }

    @Override
    public void b(byte $$0) {
        if ($$0 == 12) {
            this.a(ly.T);
        } else if ($$0 == 13) {
            this.a(ly.a);
        } else if ($$0 == 14) {
            this.a(ly.R);
        } else if ($$0 == 42) {
            this.a(ly.aq);
        } else {
            super.b($$0);
        }
    }

    @Override
    public @Nullable cie a(dxf $$0, cda $$1, cgt $$2, @Nullable cie $$3) {
        if ($$2 == cgt.e) {
            this.a(this.gZ().b($$0.J_(), dda.b));
        }
        if ($$2 == cgt.n || $$2 == cgt.m || cgt.a($$2) || $$2 == cgt.o) {
            this.a(this.gZ().a($$0.J_(), ddc.a($$0.z(this.dK()))));
        }
        if ($$2 == cgt.d) {
            this.de = true;
        }
        return super.a($$0, $$1, $$2, $$3);
    }

    public @Nullable dcx b(axf $$0, cfy $$1) {
        jd<ddc> $$5;
        double $$2 = this.as.j();
        if ($$2 < 0.5) {
            jd.c<ddc> $$3 = $$0.J_().d(ddc.a($$0.z(this.dK())));
        } else if ($$2 < 0.75) {
            jd<ddc> $$4 = this.gZ().a();
        } else {
            $$5 = ((dcx)$$1).gZ().a();
        }
        dcx $$6 = new dcx(cgu.bL, (dwo)$$0, $$5);
        $$6.a((dxf)$$0, $$0.c($$6.dK()), cgt.e, null);
        return $$6;
    }

    @Override
    public void a(axf $$0, chk $$12) {
        if ($$0.av() != ccz.a) {
            cB.info("Villager {} was struck by lightning {}.", (Object)this, (Object)$$12);
            daj $$2 = this.a(cgu.bQ, cge.a(this, false, false), (T $$1) -> {
                $$1.a((dxf)$$0, $$0.c($$1.dK()), cgt.i, null);
                $$1.gz();
                this.hm();
            });
            if ($$2 == null) {
                super.a($$0, $$12);
            }
        } else {
            super.a($$0, $$12);
        }
    }

    @Override
    protected void a(axf $$0, czl $$1) {
        dct.a($$0, this, this, $$1);
    }

    @Override
    public boolean c(axf $$0, dlt $$1) {
        dlp $$2 = $$1.h();
        return ($$1.a(bdy.ci) || this.gZ().b().a().d().contains((Object)$$2)) && this.gP().c($$1);
    }

    public boolean hb() {
        return this.hq() >= 24;
    }

    public boolean hc() {
        return this.hq() < 12;
    }

    private int hq() {
        cdk $$0 = this.gP();
        return cy.entrySet().stream().mapToInt($$1 -> $$0.a_((dlp)$$1.getKey()) * (Integer)$$1.getValue()).sum();
    }

    public boolean hd() {
        return this.gP().a_((dlt $$0) -> $$0.a(bdy.ch));
    }

    @Override
    protected void h(axf $$0) {
        Int2ObjectMap<ddb.g[]> $$5;
        dcy $$1 = this.gZ();
        amt $$2 = $$1.b().e().orElse(null);
        if ($$2 == null) {
            return;
        }
        if (this.ao().Q().b(dhb.b)) {
            Int2ObjectMap<ddb.g[]> $$3 = ddb.c.get($$2);
            Int2ObjectMap<ddb.g[]> $$4 = $$3 != null ? $$3 : ddb.a.get($$2);
        } else {
            $$5 = ddb.a.get($$2);
        }
        if ($$5 == null || $$5.isEmpty()) {
            return;
        }
        ddb.g[] $$6 = (ddb.g[])$$5.get($$1.c());
        if ($$6 == null) {
            return;
        }
        dvm $$7 = this.b();
        this.a($$0, $$7, $$6, 2);
        if (w.af && $$1.c() < $$5.size()) {
            this.k($$0);
        }
    }

    public void a(axf $$0, dcx $$1, long $$2) {
        if ($$2 >= this.cY && $$2 < this.cY + 1200L || $$2 >= $$1.cY && $$2 < $$1.cY + 1200L) {
            return;
        }
        this.cX.a($$1.cX, this.as, 10);
        this.cY = $$2;
        $$1.cY = $$2;
        this.a($$0, $$2, 5);
    }

    private void hr() {
        long $$0 = this.ao().au();
        if (this.cZ == 0L) {
            this.cZ = $$0;
            return;
        }
        if ($$0 < this.cZ + 24000L) {
            return;
        }
        this.cX.b();
        this.cZ = $$0;
    }

    public void a(axf $$0, long $$12, int $$2) {
        if (!this.a($$12)) {
            return;
        }
        fth $$3 = this.dj().c(10.0, 10.0, 10.0);
        List<dcx> $$4 = $$0.a(dcx.class, $$3);
        List<dcx> $$5 = $$4.stream().filter($$1 -> $$1.a($$12)).limit(5L).toList();
        if ($$5.size() < $$2) {
            return;
        }
        if (bhc.a(cgu.au, cgt.f, $$0, this.dK(), 10, 8, 6, bhc.a.a, false).isEmpty()) {
            return;
        }
        $$4.forEach(crp::b);
    }

    public boolean a(long $$0) {
        if (!this.b(this.ao().au())) {
            return false;
        }
        return !this.ca.a(cqw.G);
    }

    @Override
    public void a(csu $$0, cgk $$1) {
        if ($$0 == csu.a) {
            this.cX.a($$1.cY(), cqt.d, 20);
            this.cX.a($$1.cY(), cqt.c, 25);
        } else if ($$0 == csu.e) {
            this.cX.a($$1.cY(), cqt.e, 2);
        } else if ($$0 == csu.c) {
            this.cX.a($$1.cY(), cqt.b, 25);
        } else if ($$0 == csu.d) {
            this.cX.a($$1.cY(), cqt.a, 25);
        }
    }

    @Override
    public int d() {
        return this.da;
    }

    public void s(int $$0) {
        this.da = $$0;
    }

    private void hs() {
        this.hk();
        this.dc = 0;
    }

    public cqs he() {
        return this.cX;
    }

    public void a(cqs $$0) {
        this.cX.a($$0);
    }

    @Override
    public void b(is $$0) {
        super.b($$0);
        this.ca.a(cqw.I, this.ao().au());
        this.ca.b(cqw.n);
        this.ca.b(cqw.F);
    }

    @Override
    public void gs() {
        super.gs();
        this.ca.a(cqw.J, this.ao().au());
    }

    private boolean b(long $$0) {
        Optional<Long> $$12 = this.ca.c(cqw.I);
        return $$12.filter($$1 -> $$0 - $$1 < 24000L).isPresent();
    }

    @Override
    public <T> @Nullable T a(kh<? extends T> $$0) {
        if ($$0 == ki.aC) {
            return dcx.c($$0, this.gZ().a());
        }
        return super.a($$0);
    }

    @Override
    protected void a(kd $$0) {
        this.a($$0, ki.aC);
        super.a($$0);
    }

    @Override
    protected <T> boolean b(kh<T> $$0, T $$1) {
        if ($$0 == ki.aC) {
            jd<ddc> $$2 = dcx.c(ki.aC, $$1);
            this.a(this.gZ().a($$2));
            return true;
        }
        return super.b($$0, $$1);
    }

    @Override
    public /* synthetic */ @Nullable cfy a(axf axf2, cfy cfy2) {
        return this.b(axf2, cfy2);
    }

    private static /* synthetic */ void a(axf $$0, cgk $$1, chl $$2) {
        $$0.a(csu.d, $$1, (cia)((Object)$$2));
    }
}

