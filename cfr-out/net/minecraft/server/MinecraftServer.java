/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.authlib.GameProfile
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.jtracy.DiscontinuousFrame
 *  com.mojang.jtracy.TracyClient
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  it.unimi.dsi.fastutil.objects.ObjectArraySet
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package net.minecraft.server;

import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.DataFixer;
import com.mojang.jtracy.DiscontinuousFrame;
import com.mojang.jtracy.TracyClient;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.lang.invoke.MethodHandle;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.lang.runtime.ObjectMethods;
import java.net.Proxy;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.security.KeyPair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import net.minecraft.obfuscate.DontObfuscate;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public abstract class MinecraftServer
extends cbv<anq>
implements anj,
ec,
erq {
    private static final Logger m = LogUtils.getLogger();
    public static final String b = "vanilla";
    private static final float n = 0.8f;
    private static final int o = 100;
    private static final long p = 20L * bhn.a / 20L;
    private static final int q = 20;
    private static final long r = 10L * bhn.a;
    private static final int s = 100;
    private static final long t = 5L * bhn.a;
    private static final long u = 10L * bhn.b;
    private static final int v = 12;
    public static final int c = 5;
    private static final int w = 30;
    private static final int x = 6000;
    private static final int y = 100;
    private static final int z = 3;
    public static final int d = 29999984;
    public static final dws e = new dws("Demo World", dwl.a, false, ccz.c, false, new eua(dhb.h), dxm.d);
    public static final bbx f = new bbx(bhs.e, "Anonymous Player");
    protected final fni.c g;
    protected final fnl h;
    private final List<Runnable> A = Lists.newArrayList();
    private cbe B = cbd.a;
    private Consumer<bzk> C = $$0 -> this.aW();
    private Consumer<Path> D = $$0 -> {};
    private boolean E;
    private @Nullable c F;
    private boolean G;
    private final ayh H;
    private final axq I;
    private @Nullable alq J;
    private @Nullable alq.a K;
    private final bgr L = bgr.a();
    private final DataFixer M;
    private String N;
    private int O = -1;
    private final jk<anc> P;
    private final Map<amt<dwo>, axf> Q = Maps.newLinkedHashMap();
    private bbz R;
    private volatile boolean S = true;
    private boolean T;
    private int U;
    private int V = 6000;
    protected final Proxy i;
    private boolean W;
    private boolean X;
    private @Nullable String Y;
    private int Z;
    private final long[] aa = new long[100];
    private long ab = 0L;
    private @Nullable KeyPair ac;
    private @Nullable GameProfile ad;
    private boolean ae;
    private volatile boolean af;
    private long ag;
    protected final ano j;
    private final ayx ah;
    private final ayz ai;
    private long aj;
    private final Thread ak;
    private long al = bhs.d();
    private long am = bhs.d();
    private long an;
    private long ao = bhs.d();
    private boolean ap = false;
    private long aq;
    private boolean ar;
    private final bak as;
    private final anm at = new anm(this);
    private @Nullable cdn au;
    private @Nullable fmz av;
    private final anw aw = new anw();
    private final ani ax;
    private boolean ay;
    private boolean az;
    private float aA;
    private final Executor aB;
    private @Nullable String aC;
    private a aD;
    private final fjr aE;
    private final ann aF;
    private final bxj aG = new bxj(this);
    protected final fnt k;
    private fne.a aH = fne.a.a;
    private final dnq aI;
    private emb aJ;
    private int aK;
    private volatile boolean aL;
    private static final AtomicReference<@Nullable RuntimeException> aM = new AtomicReference();
    private final anp aN = new anp();
    private final DiscontinuousFrame aO;
    private final xl aP;

    public static <S extends MinecraftServer> S a(Function<Thread, S> $$02) {
        AtomicReference<MinecraftServer> $$12 = new AtomicReference<MinecraftServer>();
        Thread $$2 = new Thread(() -> ((MinecraftServer)$$12.get()).A(), "Server thread");
        $$2.setUncaughtExceptionHandler(($$0, $$1) -> m.error("Uncaught exception in server thread", $$1));
        if (Runtime.getRuntime().availableProcessors() > 4) {
            $$2.setPriority(8);
        }
        MinecraftServer $$3 = (MinecraftServer)$$02.apply($$2);
        $$12.set($$3);
        $$2.start();
        return (S)$$3;
    }

    public MinecraftServer(Thread $$02, fni.c $$1, bak $$2, ans $$3, Proxy $$4, DataFixer $$5, ano $$6, axq $$7) {
        super("Server");
        this.P = $$3.c();
        this.k = $$3.d();
        if (!this.P.a().f(mj.bF).e(esi.b)) {
            throw new IllegalStateException("Missing Overworld dimension data");
        }
        this.i = $$4;
        this.as = $$2;
        this.aD = new a($$3.a(), $$3.b());
        this.j = $$6;
        this.H = new ayh(this);
        this.aF = new ann(this);
        this.I = $$7;
        this.g = $$1;
        this.h = $$1.g();
        this.M = $$5;
        this.ax = new ani(this, this.aD.b.a());
        jf.b $$8 = this.P.a().f(mj.i).a(this.k.J());
        this.aE = new fjr($$3.a(), $$1, $$5, $$8);
        this.ak = $$02;
        this.aB = bhs.h();
        this.aI = dnq.a(this.k.J());
        this.aD.b.c().a(this.k.J());
        this.aJ = emb.a(this.P.a(), this.k.J());
        this.aO = TracyClient.createDiscontinuousFrame((String)"Server Tick");
        this.ah = new ayx();
        this.ai = new ayz(this.ah, 30);
        this.aP = new xl($$02);
    }

    protected abstract boolean e() throws IOException;

    public axp a(final int $$0) {
        return new axp(){
            private @Nullable awj c;
            private int d;
            private int e;

            @Override
            public void a(amt<dwo> $$02, dvu $$1) {
                axf $$2 = MinecraftServer.this.a($$02);
                this.c = $$2 != null ? $$2.p().a : null;
                this.d = $$1.h;
                this.e = $$1.i;
            }

            @Override
            public @Nullable erj a(int $$02, int $$1) {
                if (this.c == null) {
                    return null;
                }
                return this.c.c(dvu.d($$02 + this.d - $$0, $$1 + this.e - $$0));
            }

            @Override
            public int a() {
                return $$0;
            }
        };
    }

    protected void u_() {
        boolean $$0 = !bzu.f.c() && w.au && bzu.f.a(bzs.a(this));
        bzx $$1 = bzu.f.e();
        this.k.a(this.getServerModName(), this.T().a());
        this.u();
        this.t();
        this.bx();
        if ($$1 != null) {
            $$1.finish(true);
        }
        if ($$0) {
            try {
                bzu.f.b();
            }
            catch (Throwable $$2) {
                m.warn("Failed to stop JFR profiling", $$2);
            }
        }
    }

    protected void t() {
    }

    protected void u() {
        fnn $$0 = this.k.H();
        boolean $$1 = this.k.z();
        jq<esi> $$2 = this.P.a().f(mj.bF);
        evo $$3 = this.k.x();
        long $$4 = $$3.c();
        long $$5 = dxq.a($$4);
        ImmutableList $$6 = ImmutableList.of((Object)new evc(), (Object)new evb(), (Object)new dcr(), (Object)new csv(), (Object)new ddf($$0));
        esi $$7 = $$2.c(esi.b);
        axf $$8 = new axf(this, this.aB, this.g, $$0, dwo.h, $$7, $$1, $$5, (List<dwb>)$$6, true, null);
        this.Q.put(dwo.h, $$8);
        fnc $$9 = $$8.A();
        this.at.a($$9.a(fus.a).b());
        this.av = new fmz($$9);
        this.au = $$9.a(cdn.a);
        if (!$$0.m()) {
            try {
                MinecraftServer.a($$8, $$0, $$3.e(), $$1, this.I);
                $$0.c(true);
                if ($$1) {
                    this.a(this.k);
                }
            }
            catch (Throwable $$10) {
                m $$11 = m.a($$10, "Exception initializing level");
                try {
                    $$8.a($$11);
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
                throw new v($$11);
            }
            $$0.c(true);
        }
        jc $$12 = this.v();
        this.I.a($$12.a(), new dvu($$12.b()));
        if (this.k.D() != null) {
            this.aN().a(this.k.D(), this.bc());
        }
        cdi $$13 = $$8.T();
        boolean $$14 = false;
        for (Map.Entry<amt<esi>, esi> $$15 : $$2.k()) {
            axf $$20;
            amt<esi> $$16 = $$15.getKey();
            if ($$16 != esi.b) {
                amt<dwo> $$17 = amt.a(mj.bE, $$16.a());
                fnb $$18 = new fnb(this.k, $$0);
                axf $$19 = new axf(this, this.aB, this.g, $$18, $$17, $$15.getValue(), $$1, $$5, (List<dwb>)ImmutableList.of(), false, $$13);
                this.Q.put($$17, $$19);
            } else {
                $$20 = $$8;
            }
            Optional<eqa.c> $$21 = $$0.o();
            if ($$21.isPresent()) {
                eqa.c $$22 = $$21.get();
                fnc $$23 = $$20.A();
                if ($$23.b(eqa.d) == null) {
                    double $$24 = $$20.F_().g();
                    eqa.c $$25 = new eqa.c($$22.a() / $$24, $$22.b() / $$24, $$22.c(), $$22.d(), $$22.e(), $$22.f(), $$22.g(), $$22.h(), $$22.i());
                    eqa $$26 = new eqa($$25);
                    $$26.a($$20.au());
                    $$23.a(eqa.d, $$26);
                }
                $$14 = true;
            }
            $$20.w().a(this.au());
            this.aj().a($$20);
        }
        if ($$14) {
            $$0.a(Optional.empty());
        }
    }

    private static void a(axf $$02, fnn $$1, boolean $$2, boolean $$32, axq $$4) {
        if (w.ax && w.aN) {
            $$1.a(fne.a.a($$02.aq(), new is(0, 64, -100), 0.0f, 0.0f));
            return;
        }
        if ($$32) {
            $$1.a(fne.a.a($$02.aq(), is.c.b(80), 0.0f, 0.0f));
            return;
        }
        axc $$5 = $$02.p();
        dvu $$6 = new dvu($$5.i().b().a());
        $$4.a(axq.a.b, 0);
        $$4.a($$02.aq(), $$6);
        int $$7 = $$5.g().a($$02);
        if ($$7 < $$02.K_()) {
            is $$8 = $$6.m();
            $$7 = $$02.a(euq.a.b, $$8.u() + 8, $$8.w() + 8);
        }
        $$1.a(fne.a.a($$02.aq(), $$6.m().b(8, $$7, 8), 0.0f, 0.0f));
        int $$9 = 0;
        int $$10 = 0;
        int $$11 = 0;
        int $$12 = -1;
        for (int $$13 = 0; $$13 < bgj.i(11); ++$$13) {
            is $$14;
            if ($$9 >= -5 && $$9 <= 5 && $$10 >= -5 && $$10 <= 5 && ($$14 = awz.a($$02, new dvu($$6.h + $$9, $$6.i + $$10))) != null) {
                $$1.a(fne.a.a($$02.aq(), $$14, 0.0f, 0.0f));
                break;
            }
            if ($$9 == $$10 || $$9 < 0 && $$9 == -$$10 || $$9 > 0 && $$9 == 1 - $$10) {
                int $$15 = $$11;
                $$11 = -$$12;
                $$12 = $$15;
            }
            $$9 += $$11;
            $$10 += $$12;
        }
        if ($$2) {
            $$02.J_().a(mj.aY).flatMap($$0 -> $$0.a(rt.m)).ifPresent($$3 -> ((exi)$$3.a()).a($$02, $$5.g(), $$0.y, $$1.a().b()));
        }
        $$4.a(axq.a.b);
    }

    private void a(fnt $$0) {
        $$0.a(ccz.a);
        $$0.d(true);
        fnn $$1 = $$0.H();
        $$1.b(false);
        $$1.a(false);
        $$1.a(1000000000);
        $$1.b(6000L);
        $$1.a(dwl.d);
    }

    private void bx() {
        awi $$0 = new awi();
        for (axf $$1 : this.Q.values()) {
            $$0.a($$1, () -> {
                dxl $$1 = $$1.A().b(dxl.b);
                if ($$1 != null) {
                    $$1.b();
                }
            });
        }
        this.I.a(axq.a.c, $$0.c());
        do {
            this.I.a(axq.a.c, $$0.a(), $$0.c());
            this.ao = bhs.d() + u;
            this.w_();
        } while ($$0.b() > 0);
        this.I.a(axq.a.c);
        this.Z();
        this.bI();
    }

    public jc v() {
        return this.k.H().a().c();
    }

    public dwl w() {
        return this.k.j();
    }

    public boolean v_() {
        return this.k.k();
    }

    public abstract bbh k();

    public abstract bbn l();

    public abstract boolean m();

    public boolean a(boolean $$0, boolean $$1, boolean $$2) {
        this.at.a(this.N().A().a(fus.a));
        boolean $$3 = false;
        for (axf $$4 : this.P()) {
            if (!$$0) {
                m.info("Saving chunks for level '{}'/{}", (Object)$$4, (Object)$$4.aq().a());
            }
            $$4.a(null, $$1, w.X || $$4.e && !$$2);
            $$3 = true;
        }
        this.k.a(this.aN().a(this.bc()));
        this.g.a(this.bc(), this.k, this.aj().r());
        if ($$1) {
            for (axf $$5 : this.P()) {
                m.info("ThreadedAnvilChunkStorage ({}): All chunks are saved", (Object)$$5.p().a.l());
            }
            m.info("ThreadedAnvilChunkStorage: All dimensions are saved");
        }
        return $$3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean b(boolean $$0, boolean $$1, boolean $$2) {
        try {
            this.aL = true;
            this.aj().h();
            boolean bl2 = this.a($$0, $$1, $$2);
            return bl2;
        }
        finally {
            this.aL = false;
        }
    }

    @Override
    public void close() {
        this.x();
    }

    public void x() {
        this.aP.close();
        if (this.B.e()) {
            this.aY();
        }
        m.info("Stopping server");
        this.ak().b();
        this.aL = true;
        if (this.R != null) {
            m.info("Saving players");
            this.R.h();
            this.R.s();
        }
        m.info("Saving worlds");
        for (axf $$02 : this.P()) {
            if ($$02 == null) continue;
            $$02.e = false;
        }
        while (this.Q.values().stream().anyMatch($$0 -> $$0.p().a.e())) {
            this.ao = bhs.d() + bhn.b;
            for (axf $$1 : this.P()) {
                $$1.p().q();
                $$1.p().a(() -> true, false);
            }
            this.w_();
        }
        this.a(false, true, false);
        for (axf $$2 : this.P()) {
            if ($$2 == null) continue;
            try {
                $$2.close();
            }
            catch (IOException $$3) {
                m.error("Exception closing the level", (Throwable)$$3);
            }
        }
        this.aL = false;
        this.aD.close();
        try {
            this.g.close();
        }
        catch (IOException $$4) {
            m.error("Failed to unlock level {}", (Object)this.g.f(), (Object)$$4);
        }
    }

    public String y() {
        return this.N;
    }

    @Override
    public void a_(String $$0) {
        this.N = $$0;
    }

    public boolean z() {
        return this.S;
    }

    public void a(boolean $$0) {
        this.S = false;
        if ($$0) {
            try {
                this.ak.join();
            }
            catch (InterruptedException $$1) {
                m.error("Error while shutting down", (Throwable)$$1);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void A() {
        try {
            if (!this.e()) throw new IllegalStateException("Failed to initialize server");
            this.ao = bhs.d();
            this.K = this.bD().orElse(null);
            this.J = this.bG();
            while (this.S) {
                boolean $$4;
                long $$1;
                if (!this.I() && this.aF.a() && this.aF.d()) {
                    long $$0 = 0L;
                    this.ag = this.ao = bhs.d();
                } else {
                    $$1 = this.aF.h();
                    long $$2 = bhs.d() - this.ao;
                    if ($$2 > p + 20L * $$1 && this.ao - this.ag >= r + 100L * $$1) {
                        long $$3 = $$2 / $$1;
                        m.warn("Can't keep up! Is the server overloaded? Running {}ms or {} ticks behind", (Object)($$2 / bhn.b), (Object)$$3);
                        this.ao += $$3 * $$1;
                        this.ag = this.ao;
                    }
                }
                boolean bl2 = $$4 = $$1 == 0L;
                if (this.G) {
                    this.G = false;
                    this.F = new c(bhs.d(), this.U);
                }
                this.ao += $$1;
                try (bzl.a $$5 = bzl.a(this.bQ());){
                    this.b($$4);
                    bzm $$6 = bzl.a();
                    $$6.a("nextTickWait");
                    this.ar = true;
                    this.aq = Math.max(bhs.d() + $$1, this.ao);
                    this.bz();
                    this.w_();
                    this.bA();
                    if ($$4) {
                        this.aF.e();
                    }
                    $$6.c();
                    this.by();
                }
                finally {
                    this.aU();
                }
                this.af = true;
                bzu.f.a(this.aA);
            }
            return;
        }
        catch (Throwable $$8) {
            m.error("Encountered an unexpected exception", $$8);
            m $$9 = MinecraftServer.b($$8);
            this.b($$9.f());
            Path $$10 = this.G().resolve("crash-reports").resolve("crash-" + bhs.f() + "-server.txt");
            if ($$9.a($$10, u.a)) {
                m.error("This crash report has been saved to: {}", (Object)$$10.toAbsolutePath());
            } else {
                m.error("We were unable to save this crash report to disk.");
            }
            this.a($$9);
            return;
        }
        finally {
            try {
                this.T = true;
                this.x();
            }
            catch (Throwable $$7) {
                m.error("Exception stopping the server", $$7);
            }
            finally {
                this.i();
            }
        }
    }

    private void by() {
        long $$0 = bhs.d();
        if (this.g()) {
            this.f().a($$0 - this.al);
        }
        this.al = $$0;
    }

    private void bz() {
        if (this.g()) {
            this.am = bhs.d();
            this.an = 0L;
        }
    }

    private void bA() {
        if (this.g()) {
            bxq $$0 = this.f();
            $$0.a(bhs.d() - this.am - this.an, bxs.c.ordinal());
            $$0.a(this.an, bxs.d.ordinal());
        }
    }

    private static m b(Throwable $$0) {
        m $$5;
        v $$1 = null;
        for (Throwable $$2 = $$0; $$2 != null; $$2 = $$2.getCause()) {
            v $$3;
            if (!($$2 instanceof v)) continue;
            $$1 = $$3 = (v)$$2;
        }
        if ($$1 != null) {
            m $$4 = $$1.a();
            if ($$1 != $$0) {
                $$4.a("Wrapped in").a("Wrapping exception", $$0);
            }
        } else {
            $$5 = new m("Exception in server tick loop", $$0);
        }
        return $$5;
    }

    private boolean bB() {
        return this.bP() || bhs.d() < (this.ar ? this.aq : this.ao);
    }

    public static boolean B() {
        RuntimeException $$0 = aM.get();
        if ($$0 != null) {
            throw $$0;
        }
        return true;
    }

    public static void a(RuntimeException $$0) {
        aM.compareAndSet(null, $$0);
    }

    @Override
    public void b(BooleanSupplier $$0) {
        super.b(() -> MinecraftServer.B() && $$0.getAsBoolean());
    }

    public ayx C() {
        return this.ah;
    }

    protected void w_() {
        this.bN();
        this.ap = true;
        try {
            this.b(() -> !this.bB());
        }
        finally {
            this.ap = false;
        }
    }

    @Override
    public void D() {
        boolean $$0 = this.g();
        long $$1 = $$0 ? bhs.d() : 0L;
        long $$2 = this.ap ? this.ao - bhs.d() : 100000L;
        LockSupport.parkNanos("waiting for tasks", $$2);
        if ($$0) {
            this.an += bhs.d() - $$1;
        }
    }

    public anq a(Runnable $$0) {
        return new anq(this.U, $$0);
    }

    protected boolean a(anq $$0) {
        return $$0.a() + 3 < this.U || this.bB();
    }

    @Override
    public boolean E() {
        boolean $$0;
        this.ar = $$0 = this.bC();
        return $$0;
    }

    private boolean bC() {
        if (super.E()) {
            return true;
        }
        if (this.aF.a() || this.bO() || this.bB()) {
            for (axf $$0 : this.P()) {
                if (!$$0.p().c()) continue;
                return true;
            }
        }
        return false;
    }

    protected void b(anq $$0) {
        bzl.a().f("runTask");
        super.d($$0);
    }

    private Optional<alq.a> bD() {
        Optional<Path> $$02 = Optional.of(this.c("server-icon.png")).filter($$0 -> Files.isRegularFile($$0, new LinkOption[0])).or(() -> this.g.j().filter($$0 -> Files.isRegularFile($$0, new LinkOption[0])));
        return $$02.flatMap($$0 -> {
            try {
                byte[] $$1 = Files.readAllBytes($$0);
                bgo $$2 = bgo.a($$1);
                if ($$2.a() != 64 || $$2.b() != 64) {
                    throw new IllegalArgumentException("Invalid world icon size [" + $$2.a() + ", " + $$2.b() + "], but expected [64, 64]");
                }
                return Optional.of(new alq.a($$1));
            }
            catch (Exception $$3) {
                m.error("Couldn't load server icon", (Throwable)$$3);
                return Optional.empty();
            }
        });
    }

    public Optional<Path> F() {
        return this.g.j();
    }

    public Path G() {
        return Path.of("", new String[0]);
    }

    public ayz H() {
        return this.ai;
    }

    public void a(m $$0) {
    }

    public void i() {
    }

    public boolean I() {
        return false;
    }

    public void a(BooleanSupplier $$0) {
        long $$1 = bhs.d();
        int $$2 = this.bu() * 20;
        if ($$2 > 0) {
            this.aK = this.R.m() == 0 && !this.aF.a() ? ++this.aK : 0;
            if (this.aK >= $$2) {
                if (this.aK == $$2) {
                    m.info("Server empty for {} seconds, pausing", (Object)this.bu());
                    this.bE();
                }
                this.K();
                return;
            }
        }
        ++this.U;
        this.aF.m();
        this.c($$0);
        if ($$1 - this.aj >= t) {
            this.aj = $$1;
            this.J = this.bG();
        }
        --this.V;
        if (this.V <= 0) {
            this.bE();
        }
        bzm $$3 = bzl.a();
        $$3.a("tallying");
        long $$4 = bhs.d() - $$1;
        int $$5 = this.U % 100;
        this.ab -= this.aa[$$5];
        this.ab += $$4;
        this.aa[$$5] = $$4;
        this.aA = this.aA * 0.8f + (float)$$4 / (float)bhn.b * 0.19999999f;
        this.a($$1);
        $$3.c();
    }

    public void b(boolean $$0) {
        bzm $$1 = bzl.a();
        $$1.a("tick");
        this.aO.start();
        $$1.a("scheduledPacketProcessing");
        this.aP.b();
        $$1.c();
        this.a($$0 ? () -> false : this::bB);
        this.aO.end();
        $$1.c();
    }

    private void bE() {
        this.V = this.bF();
        m.debug("Autosave started");
        bzm $$0 = bzl.a();
        $$0.a("save");
        this.b(true, false, false);
        $$0.c();
        m.debug("Autosave finished");
    }

    private void a(long $$0) {
        if (this.g()) {
            this.f().a(bhs.d() - $$0, bxs.b.ordinal());
        }
    }

    private int bF() {
        float $$2;
        if (this.aF.a()) {
            long $$0 = this.aS() + 1L;
            float $$1 = (float)bhn.a / (float)$$0;
        } else {
            $$2 = this.aF.f();
        }
        int $$3 = 300;
        return Math.max(100, (int)($$2 * 300.0f));
    }

    public void J() {
        int $$0 = this.bF();
        if ($$0 < this.V) {
            this.V = $$0;
        }
    }

    protected abstract bxq f();

    public abstract boolean g();

    private alq bG() {
        alq.b $$0 = this.bH();
        return new alq(yh.a(this.ah()), Optional.of($$0), Optional.of(alq.c.a()), Optional.ofNullable(this.K), this.ay());
    }

    private alq.b bH() {
        List<axg> $$0 = this.R.t();
        int $$1 = this.r();
        if (this.ao()) {
            return new alq.b($$1, $$0.size(), List.of());
        }
        int $$2 = Math.min($$0.size(), 12);
        ObjectArrayList $$3 = new ObjectArrayList($$2);
        int $$4 = bgj.a(this.L, 0, $$0.size() - $$2);
        for (int $$5 = 0; $$5 < $$2; ++$$5) {
            axg $$6 = $$0.get($$4 + $$5);
            $$3.add((Object)($$6.aa() ? $$6.gJ() : f));
        }
        bhs.c($$3, this.L);
        return new alq.b($$1, $$0.size(), (List<bbx>)$$3);
    }

    protected void c(BooleanSupplier $$02) {
        bzm $$1 = bzl.a();
        this.aj().t().forEach($$0 -> $$0.g.f());
        $$1.a("commandFunctions");
        this.aC().b();
        $$1.b("levels");
        this.bI();
        for (axf $$2 : this.P()) {
            $$1.a(() -> String.valueOf($$2) + " " + String.valueOf($$2.aq().a()));
            if (this.U % 20 == 0) {
                $$1.a("timeSync");
                this.a($$2);
                $$1.c();
            }
            $$1.a("tick");
            try {
                $$2.a($$02);
            }
            catch (Throwable $$3) {
                m $$4 = m.a($$3, "Exception ticking world");
                $$2.a($$4);
                throw new v($$4);
            }
            $$1.c();
            $$1.c();
        }
        $$1.b("connection");
        this.K();
        $$1.b("players");
        this.R.d();
        $$1.b("debugSubscribers");
        this.aG.a();
        if (this.aF.i()) {
            $$1.b("gameTests");
            ti.a.b();
        }
        $$1.b("server gui refresh");
        for (Runnable $$5 : this.A) {
            $$5.run();
        }
        $$1.b("send chunks");
        for (axg $$6 : this.R.t()) {
            $$6.g.h.a($$6);
            $$6.g.g();
        }
        $$1.c();
        this.ai.a();
    }

    private void bI() {
        fne.a $$0 = this.k.H().a();
        axf $$1 = this.aH();
        this.aH = $$1.b($$0);
    }

    public void K() {
        this.ak().c();
    }

    private void a(axf $$0) {
        this.R.a(new ahd($$0.au(), $$0.al(), $$0.U().a(eua.a)), $$0.aq());
    }

    public void L() {
        bzm $$0 = bzl.a();
        $$0.a("timeSync");
        for (axf $$1 : this.P()) {
            this.a($$1);
        }
        $$0.c();
    }

    public void b(Runnable $$0) {
        this.A.add($$0);
    }

    protected void b(String $$0) {
        this.aC = $$0;
    }

    public boolean M() {
        return !this.ak.isAlive();
    }

    public Path c(String $$0) {
        return this.G().resolve($$0);
    }

    public final axf N() {
        return this.Q.get(dwo.h);
    }

    public @Nullable axf a(amt<dwo> $$0) {
        return this.Q.get($$0);
    }

    public Set<amt<dwo>> O() {
        return this.Q.keySet();
    }

    public Iterable<axf> P() {
        return this.Q.values();
    }

    @Override
    public String Q() {
        return w.b().c();
    }

    @Override
    public int R() {
        return this.R.m();
    }

    public String[] S() {
        return this.R.e();
    }

    @DontObfuscate
    public String getServerModName() {
        return b;
    }

    public y b(y $$0) {
        $$0.a("Server Running", () -> Boolean.toString(this.S));
        if (this.R != null) {
            $$0.a("Player Count", () -> this.R.m() + " / " + this.R.n() + "; " + String.valueOf(this.R.t()));
        }
        $$0.a("Active Data Packs", () -> bak.a(this.as.g()));
        $$0.a("Available Data Packs", () -> bak.a(this.as.d()));
        $$0.a("Enabled Feature Flags", () -> dhb.e.b(this.k.J()).stream().map(amo::toString).collect(Collectors.joining(", ")));
        $$0.a("World Generation", () -> this.k.A().toString());
        $$0.a("World Seed", () -> String.valueOf(this.k.x().c()));
        $$0.a("Suppressed Exceptions", this.aN::a);
        if (this.aC != null) {
            $$0.a("Server Id", () -> this.aC);
        }
        return this.a($$0);
    }

    public abstract y a(y var1);

    public bgi T() {
        return bgi.a(b, this::getServerModName, "Server", MinecraftServer.class);
    }

    @Override
    public void a(yh $$0) {
        m.info($$0.getString());
    }

    public KeyPair U() {
        return Objects.requireNonNull(this.ac);
    }

    public int V() {
        return this.O;
    }

    public void b(int $$0) {
        this.O = $$0;
    }

    public @Nullable GameProfile W() {
        return this.ad;
    }

    public void a(@Nullable GameProfile $$0) {
        this.ad = $$0;
    }

    public boolean X() {
        return this.ad != null;
    }

    protected void Y() {
        m.info("Generating keypair");
        try {
            this.ac = bfb.b();
        }
        catch (bfc $$0) {
            throw new IllegalStateException("Failed to generate key pair", $$0);
        }
    }

    public void a(ccz $$0, boolean $$1) {
        if (!$$1 && this.k.q()) {
            return;
        }
        this.k.a(this.k.k() ? ccz.d : $$0);
        this.Z();
        this.aj().t().forEach(this::c);
    }

    public int c(int $$0) {
        return $$0;
    }

    public void Z() {
        for (axf $$0 : this.P()) {
            $$0.b($$0.O());
        }
    }

    public void c(boolean $$0) {
        this.k.d($$0);
        this.aj().t().forEach(this::c);
    }

    private void c(axg $$0) {
        fne $$1 = $$0.A().D_();
        $$0.g.b(new adn($$1.p(), $$1.q()));
    }

    public boolean aa() {
        return this.ae;
    }

    @Override
    public void d(boolean $$0) {
        this.ae = $$0;
    }

    public Map<String, String> ab() {
        return Map.of();
    }

    public Optional<b> ac() {
        return Optional.empty();
    }

    public boolean ad() {
        return this.ac().filter(b::d).isPresent();
    }

    public abstract boolean n();

    public abstract int o();

    public boolean ae() {
        return this.W;
    }

    public void e(boolean $$0) {
        this.W = $$0;
    }

    public boolean af() {
        return this.X;
    }

    public void f(boolean $$0) {
        this.X = $$0;
    }

    public abstract boolean p();

    public boolean ag() {
        return true;
    }

    @Override
    public String ah() {
        return this.Y;
    }

    @Override
    public void d(String $$0) {
        this.Y = $$0;
    }

    public boolean ai() {
        return this.T;
    }

    public bbz aj() {
        return this.R;
    }

    public void a(bbz $$0) {
        this.R = $$0;
    }

    public abstract boolean q();

    public void a(dwl $$0) {
        this.k.a($$0);
    }

    public int b(@Nullable dwl $$0) {
        if ($$0 == null) {
            return 0;
        }
        int $$1 = 0;
        for (axg $$2 : this.aj().t()) {
            if (!$$2.a($$0)) continue;
            ++$$1;
        }
        return $$1;
    }

    public ayh ak() {
        return this.H;
    }

    public boolean al() {
        return this.af;
    }

    public boolean a(@Nullable dwl $$0, boolean $$1, int $$2) {
        return false;
    }

    public int am() {
        return this.U;
    }

    public boolean a(axf $$0, is $$1, ddm $$2) {
        return false;
    }

    public boolean an() {
        return true;
    }

    public boolean ao() {
        return false;
    }

    public Proxy ap() {
        return this.i;
    }

    public int aq() {
        return this.Z;
    }

    @Override
    public void d(int $$0) {
        this.Z = $$0;
    }

    public ano ar() {
        return this.j;
    }

    public @Nullable alq as() {
        return this.J;
    }

    public void at() {
        this.aj = 0L;
    }

    public int au() {
        return 29999984;
    }

    @Override
    public boolean av() {
        return super.av() && !this.ai();
    }

    @Override
    public void c(Runnable $$0) {
        if (this.ai()) {
            throw new RejectedExecutionException("Server already shutting down");
        }
        super.c($$0);
    }

    @Override
    public Thread aw() {
        return this.ak;
    }

    public int ax() {
        return 256;
    }

    public boolean ay() {
        return false;
    }

    public long az() {
        return this.ao;
    }

    public DataFixer aA() {
        return this.M;
    }

    public ang aB() {
        return this.aD.b.e();
    }

    public ani aC() {
        return this.ax;
    }

    @Override
    public CompletableFuture<Void> a(Collection<String> $$02) {
        CompletionStage $$12 = ((CompletableFuture)CompletableFuture.supplyAsync(() -> (ImmutableList)$$02.stream().map(this.as::c).filter(Objects::nonNull).map(bah::f).collect(ImmutableList.toImmutableList()), this).thenCompose($$0 -> {
            bas $$12 = new bas(azn.b, (List<azl>)$$0);
            List<jq.a<?>> $$22 = beg.a((baz)$$12, this.P.a());
            return ((CompletableFuture)ane.a($$12, this.P, $$22, this.k.J(), this.n() ? ee.a.b : ee.a.c, this.l(), this.aB, this).whenComplete(($$1, $$2) -> {
                if ($$2 != null) {
                    $$12.close();
                }
            })).thenApply($$1 -> new a($$12, (ane)$$1));
        })).thenAcceptAsync($$1 -> {
            this.aD.close();
            this.aD = $$1;
            this.as.b($$02);
            dxm $$2 = new dxm(MinecraftServer.a(this.as, true), this.k.J());
            this.k.a($$2);
            this.aD.b.g();
            this.aD.b.c().a(this.k.J());
            this.aj().h();
            this.aj().u();
            this.ax.a(this.aD.b.a());
            this.aE.a(this.aD.a);
            this.aJ = emb.a(this.P.a(), this.k.J());
        }, (Executor)this);
        if (this.bK()) {
            this.b(((CompletableFuture)$$12)::isDone);
        }
        return $$12;
    }

    public static dxm a(bak $$0, dxm $$1, boolean $$2, boolean $$3) {
        dwc $$4 = $$1.a();
        dgz $$5 = $$2 ? dgz.a() : $$1.b();
        dgz $$6 = $$2 ? dhb.e.a() : $$1.b();
        $$0.a();
        if ($$3) {
            return MinecraftServer.a($$0, List.of(b), $$5, false);
        }
        LinkedHashSet $$7 = Sets.newLinkedHashSet();
        for (String $$8 : $$4.a()) {
            if ($$0.d($$8)) {
                $$7.add($$8);
                continue;
            }
            m.warn("Missing data pack {}", (Object)$$8);
        }
        for (bah $$9 : $$0.d()) {
            String $$10 = $$9.g();
            if ($$4.b().contains($$10)) continue;
            dgz $$11 = $$9.e();
            boolean $$12 = $$7.contains($$10);
            if (!$$12 && $$9.l().a()) {
                if ($$11.a($$6)) {
                    m.info("Found new data pack {}, loading it automatically", (Object)$$10);
                    $$7.add($$10);
                } else {
                    m.info("Found new data pack {}, but can't load it due to missing features {}", (Object)$$10, (Object)dhb.a($$6, $$11));
                }
            }
            if (!$$12 || $$11.a($$6)) continue;
            m.warn("Pack {} requires features {} that are not enabled for this world, disabling pack.", (Object)$$10, (Object)dhb.a($$6, $$11));
            $$7.remove($$10);
        }
        if ($$7.isEmpty()) {
            m.info("No datapacks selected, forcing vanilla");
            $$7.add(b);
        }
        return MinecraftServer.a($$0, $$7, $$5, true);
    }

    private static dxm a(bak $$0, Collection<String> $$1, dgz $$2, boolean $$3) {
        $$0.b($$1);
        MinecraftServer.a($$0, $$2);
        dwc $$4 = MinecraftServer.a($$0, $$3);
        dgz $$5 = $$0.f().c($$2);
        return new dxm($$4, $$5);
    }

    private static void a(bak $$0, dgz $$1) {
        dgz $$2 = $$0.f();
        dgz $$3 = $$1.d($$2);
        if ($$3.b()) {
            return;
        }
        ObjectArraySet $$4 = new ObjectArraySet($$0.e());
        for (bah $$5 : $$0.d()) {
            if ($$3.b()) break;
            if ($$5.l() != bal.d) continue;
            String $$6 = $$5.g();
            dgz $$7 = $$5.e();
            if ($$7.b() || !$$7.b($$3) || !$$7.a($$1)) continue;
            if (!$$4.add($$6)) {
                throw new IllegalStateException("Tried to force '" + $$6 + "', but it was already enabled");
            }
            m.info("Found feature pack ('{}') for requested feature, forcing to enabled", (Object)$$6);
            $$3 = $$3.d($$7);
        }
        $$0.b((Collection<String>)$$4);
    }

    private static dwc a(bak $$0, boolean $$12) {
        Collection<String> $$2 = $$0.e();
        ImmutableList $$3 = ImmutableList.copyOf($$2);
        List<String> $$4 = $$12 ? $$0.c().stream().filter($$1 -> !$$2.contains($$1)).toList() : List.of();
        return new dwc((List<String>)$$3, $$4);
    }

    public void aD() {
        if (!this.aO() || !this.aP()) {
            return;
        }
        bbz $$0 = this.aj();
        bcj $$1 = $$0.i();
        ArrayList $$2 = Lists.newArrayList($$0.t());
        for (axg $$3 : $$2) {
            if ($$1.a($$3.gJ())) continue;
            $$3.g.a(yh.c("multiplayer.disconnect.not_whitelisted"));
        }
    }

    public bak aE() {
        return this.as;
    }

    public ee aF() {
        return this.aD.b.d();
    }

    public ed aG() {
        axf $$0 = this.aH();
        return new ed(this, ftm.a(this.aI().b()), ftl.a, $$0, bbh.e, "Server", yh.b("Server"), this, null);
    }

    public axf aH() {
        fne.a $$0 = this.bb().H().a();
        amt<dwo> $$1 = $$0.a();
        axf $$2 = this.a($$1);
        return $$2 != null ? $$2 : this.N();
    }

    public void a(fne.a $$0) {
        fnn $$1 = this.k.H();
        fne.a $$2 = $$1.a();
        if (!$$2.equals($$0)) {
            $$1.a($$0);
            this.aj().a(new agn($$0));
            this.bI();
        }
    }

    public fne.a aI() {
        return this.aH;
    }

    @Override
    public boolean x_() {
        return true;
    }

    @Override
    public boolean y_() {
        return true;
    }

    @Override
    public abstract boolean c();

    public dqz aJ() {
        return this.aD.b.c();
    }

    public anm aK() {
        return this.at;
    }

    public fmz aL() {
        if (this.av == null) {
            throw new NullPointerException("Called before server init");
        }
        return this.av;
    }

    public cdn aM() {
        if (this.au == null) {
            throw new NullPointerException("Called before server init");
        }
        return this.au;
    }

    public anw aN() {
        return this.aw;
    }

    public boolean aO() {
        return this.ay;
    }

    public void g(boolean $$0) {
        this.ay = $$0;
    }

    public boolean aP() {
        return this.az;
    }

    public void h(boolean $$0) {
        this.az = $$0;
    }

    public float aQ() {
        return this.aA;
    }

    public ann aR() {
        return this.aF;
    }

    public long aS() {
        return this.ab / (long)Math.min(100, Math.max(this.U, 1));
    }

    public long[] aT() {
        return this.aa;
    }

    public bbh b(bbx $$0) {
        if (this.aj().f($$0)) {
            bcc $$1 = (bcc)this.aj().k().c($$0);
            if ($$1 != null) {
                return $$1.a();
            }
            if (this.a($$0)) {
                return bbh.e;
            }
            if (this.X()) {
                return this.aj().v() ? bbh.e : bbh.a;
            }
            return this.k();
        }
        return bbh.a;
    }

    public abstract boolean a(bbx var1);

    public void a(Path $$0) throws IOException {
    }

    private void b(Path $$0) {
        Path $$1 = $$0.resolve("levels");
        try {
            for (Map.Entry<amt<dwo>, axf> $$2 : this.Q.entrySet()) {
                amo $$3 = $$2.getKey().a();
                Path $$4 = $$1.resolve($$3.b()).resolve($$3.a());
                Files.createDirectories($$4, new FileAttribute[0]);
                $$2.getValue().a($$4);
            }
            this.d($$0.resolve("gamerules.txt"));
            this.e($$0.resolve("classpath.txt"));
            this.c($$0.resolve("stats.txt"));
            this.f($$0.resolve("threads.txt"));
            this.a($$0.resolve("server.properties.txt"));
            this.g($$0.resolve("modules.txt"));
        }
        catch (IOException $$5) {
            m.warn("Failed to save debug report", (Throwable)$$5);
        }
    }

    private void c(Path $$0) throws IOException {
        try (BufferedWriter $$1 = Files.newBufferedWriter($$0, new OpenOption[0]);){
            $$1.write(String.format(Locale.ROOT, "pending_tasks: %d\n", this.bL()));
            $$1.write(String.format(Locale.ROOT, "average_tick_time: %f\n", Float.valueOf(this.aQ())));
            $$1.write(String.format(Locale.ROOT, "tick_times: %s\n", Arrays.toString(this.aa)));
            $$1.write(String.format(Locale.ROOT, "queue: %s\n", bhs.h()));
        }
    }

    @Override
    private void d(Path $$0) throws IOException {
        try (BufferedWriter $$1 = Files.newBufferedWriter($$0, new OpenOption[0]);){
            final ArrayList $$2 = Lists.newArrayList();
            final eua $$3 = this.k.n();
            $$3.a(new etz(){

                @Override
                public <T> void a(etv<T> $$0) {
                    $$2.add(String.format(Locale.ROOT, "%s=%s\n", $$0.b(), $$3.b($$0)));
                }
            });
            for (String $$4 : $$2) {
                $$1.write($$4);
            }
        }
    }

    private void e(Path $$0) throws IOException {
        try (BufferedWriter $$1 = Files.newBufferedWriter($$0, new OpenOption[0]);){
            String $$2 = System.getProperty("java.class.path");
            String $$3 = File.pathSeparator;
            for (String $$4 : Splitter.on((String)$$3).split((CharSequence)$$2)) {
                $$1.write($$4);
                $$1.write("\n");
            }
        }
    }

    private void f(Path $$0) throws IOException {
        ThreadMXBean $$1 = ManagementFactory.getThreadMXBean();
        ThreadInfo[] $$2 = $$1.dumpAllThreads(true, true);
        Arrays.sort($$2, Comparator.comparing(ThreadInfo::getThreadName));
        try (BufferedWriter $$3 = Files.newBufferedWriter($$0, new OpenOption[0]);){
            for (ThreadInfo $$4 : $$2) {
                $$3.write($$4.toString());
                ((Writer)$$3).write(10);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private void g(Path $$02) throws IOException {
        BufferedWriter $$1 = Files.newBufferedWriter($$02, new OpenOption[0]);
        try {
            void $$4;
            try {
                ArrayList $$2 = Lists.newArrayList(bgk.a());
            }
            catch (Throwable $$3) {
                m.warn("Failed to list native modules", $$3);
                if ($$1 != null) {
                    ((Writer)$$1).close();
                }
                return;
            }
            $$4.sort(Comparator.comparing($$0 -> $$0.a));
            for (bgk.a $$5 : $$4) {
                $$1.write($$5.toString());
                ((Writer)$$1).write(10);
            }
        }
        finally {
            if ($$1 != null) {
                try {
                    ((Writer)$$1).close();
                }
                catch (Throwable throwable) {
                    Throwable throwable2;
                    throwable2.addSuppressed(throwable);
                }
            }
        }
    }

    private bzm bQ() {
        if (this.E) {
            this.B = cbc.a(new cbg(bhs.c, this.n()), bhs.c, bhs.i(), new cbi("server"), this.C, $$0 -> {
                this.h(() -> this.b($$0.resolve("server")));
                this.D.accept((Path)$$0);
            });
            this.E = false;
        }
        this.B.c();
        return bzp.a(this.B.f(), bzp.a("Server"));
    }

    public void aU() {
        this.B.d();
    }

    public boolean aV() {
        return this.B.e();
    }

    public void a(Consumer<bzk> $$0, Consumer<Path> $$12) {
        this.C = $$1 -> {
            this.aW();
            $$0.accept((bzk)$$1);
        };
        this.D = $$12;
        this.E = true;
    }

    public void aW() {
        this.B = cbd.a;
    }

    public void aX() {
        this.B.a();
    }

    public void aY() {
        this.B.b();
    }

    public Path a(fng $$0) {
        return this.g.a($$0);
    }

    public boolean aZ() {
        return true;
    }

    public fjr ba() {
        return this.aE;
    }

    public fnt bb() {
        return this.k;
    }

    public jr.b bc() {
        return this.P.a();
    }

    public jk<anc> bd() {
        return this.P;
    }

    public and.a be() {
        return this.aD.b.b();
    }

    public ayo a(axg $$0) {
        return ayo.e;
    }

    public axh b(axg $$0) {
        return this.aa() ? new awr($$0) : new axh($$0);
    }

    public @Nullable dwl bf() {
        return null;
    }

    public baz bg() {
        return this.aD.a;
    }

    public boolean bh() {
        return this.aL;
    }

    public boolean bi() {
        return this.G || this.F != null;
    }

    public void bj() {
        this.G = true;
    }

    public bzk bk() {
        if (this.F == null) {
            return bzg.a;
        }
        bzk $$0 = this.F.a(bhs.d(), this.U);
        this.F = null;
        return $$0;
    }

    public int bl() {
        return 1000000;
    }

    public void a(yh $$0, yd.a $$1, @Nullable String $$2) {
        String $$3 = $$1.a($$0).getString();
        if ($$2 != null) {
            m.info("[{}] {}", (Object)$$2, (Object)$$3);
        } else {
            m.info("{}", (Object)$$3);
        }
    }

    public yc bm() {
        return yc.a;
    }

    public boolean bn() {
        return true;
    }

    public void a(amo $$0, Optional<vz> $$1) {
        m.debug("Received custom click action {} with payload {}", (Object)$$0, $$1.orElse(null));
    }

    public axq bo() {
        return this.I;
    }

    public boolean i(boolean $$0) {
        boolean $$1 = false;
        for (axf $$2 : this.P()) {
            if ($$2 == null || $$2.e != $$0) continue;
            $$2.e = !$$0;
            $$1 = true;
        }
        return $$1;
    }

    public boolean bp() {
        for (axf $$0 : this.P()) {
            if ($$0 == null || $$0.e) continue;
            return true;
        }
        return false;
    }

    public <T> void a(etv<T> $$0, T $$12) {
        this.C().a($$0, $$12);
        if ($$0 == eua.P) {
            byte $$2 = (Boolean)$$12 != false ? (byte)22 : 23;
            for (axg $$3 : this.aj().t()) {
                $$3.g.b(new aei($$3, $$2));
            }
        } else if ($$0 == eua.u || $$0 == eua.r) {
            aem.a $$4 = $$0 == eua.u ? aem.n : aem.m;
            aem $$5 = new aem($$4, (Boolean)$$12 != false ? 1.0f : 0.0f);
            this.aj().t().forEach($$1 -> $$1.g.b($$5));
        } else if ($$0 == eua.v) {
            this.P().forEach($$1 -> {
                bcv $$2 = $$1.j();
                if (((Boolean)$$12).booleanValue()) {
                    $$1.E().forEach($$2::b);
                } else {
                    $$2.a();
                }
            });
        } else if ($$0 == eua.W) {
            this.Z();
        }
    }

    public boolean bq() {
        return false;
    }

    private void a(m $$0, dvu $$1, esa $$2) {
        bhs.i().execute(() -> {
            try {
                Path $$3 = this.c("debug");
                bfp.c($$3);
                String $$4 = bfp.a($$2.a());
                Path $$5 = $$3.resolve("chunk-" + $$4 + "-" + bhs.f() + "-server.txt");
                FileStore $$6 = Files.getFileStore($$3);
                long $$7 = $$6.getUsableSpace();
                if ($$7 < 8192L) {
                    m.warn("Not storing chunk IO report due to low space on drive {}", (Object)$$6.name());
                    return;
                }
                n $$8 = $$0.a("Chunk Info");
                $$8.a("Level", $$2::a);
                $$8.a("Dimension", () -> $$2.b().a().toString());
                $$8.a("Storage", $$2::c);
                $$8.a("Position", $$1::toString);
                $$0.a($$5, u.e);
                m.info("Saved details to {}", (Object)$$0.e());
            }
            catch (Exception $$9) {
                m.warn("Failed to store chunk IO exception", (Throwable)$$9);
            }
        });
    }

    @Override
    public void a(Throwable $$0, esa $$1, dvu $$2) {
        m.error("Failed to load chunk {},{}", new Object[]{$$2.h, $$2.i, $$0});
        this.aN.a("chunk/load", $$0);
        this.a(m.a($$0, "Chunk load failure"), $$2, $$1);
    }

    @Override
    public void b(Throwable $$0, esa $$1, dvu $$2) {
        m.error("Failed to save chunk {},{}", new Object[]{$$2.h, $$2.i, $$0});
        this.aN.a("chunk/save", $$0);
        this.a(m.a($$0, "Chunk save failure"), $$2, $$1);
    }

    public void a(Throwable $$0, aba<?> $$1) {
        this.aN.a("packet/" + String.valueOf($$1), $$0);
    }

    public dnq br() {
        return this.aI;
    }

    public emb bs() {
        return this.aJ;
    }

    public anl bt() {
        return anl.a;
    }

    protected int bu() {
        return 0;
    }

    public xl bv() {
        return this.aP;
    }

    public bxj bw() {
        return this.aG;
    }

    @Override
    public /* synthetic */ void d(Runnable runnable) {
        this.b((anq)runnable);
    }

    @Override
    public /* synthetic */ boolean e(Runnable runnable) {
        return this.a((anq)runnable);
    }

    @Override
    public /* synthetic */ Runnable f(Runnable runnable) {
        return this.a(runnable);
    }

    static final class a
    extends Record
    implements AutoCloseable {
        final bap a;
        final ane b;

        a(bap $$0, ane $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public void close() {
            this.a.close();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "resourceManager;managers", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "resourceManager;managers", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "resourceManager;managers", "a", "b"}, this, $$0);
        }

        public bap a() {
            return this.a;
        }

        public ane b() {
            return this.b;
        }
    }

    static class c {
        final long a;
        final int b;

        c(long $$0, int $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        bzk a(final long $$0, final int $$1) {
            return new bzk(){

                @Override
                public List<bzo> a(String $$02) {
                    return Collections.emptyList();
                }

                @Override
                public boolean a(Path $$02) {
                    return false;
                }

                @Override
                public long a() {
                    return a;
                }

                @Override
                public int b() {
                    return b;
                }

                @Override
                public long c() {
                    return $$0;
                }

                @Override
                public int d() {
                    return $$1;
                }

                @Override
                public String e() {
                    return "";
                }
            };
        }
    }

    public record b(UUID a, String b, String c, boolean d, @Nullable yh e) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "id;url;hash;isRequired;prompt", "a", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "id;url;hash;isRequired;prompt", "a", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "id;url;hash;isRequired;prompt", "a", "b", "c", "d", "e"}, this, $$0);
        }
    }
}

