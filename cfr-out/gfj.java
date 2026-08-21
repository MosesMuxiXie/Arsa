/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.exceptions.AuthenticationException
 *  com.mojang.authlib.minecraft.BanDetails
 *  com.mojang.authlib.minecraft.UserApiService
 *  com.mojang.authlib.minecraft.UserApiService$UserFlag
 *  com.mojang.authlib.minecraft.UserApiService$UserProperties
 *  com.mojang.authlib.yggdrasil.ProfileActionType
 *  com.mojang.authlib.yggdrasil.ProfileResult
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.jtracy.DiscontinuousFrame
 *  com.mojang.jtracy.TracyClient
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2BooleanFunction
 *  org.apache.commons.io.FileUtils
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.util.tinyfd.TinyFileDialogs
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.minecraft.BanDetails;
import com.mojang.authlib.minecraft.UserApiService;
import com.mojang.authlib.yggdrasil.ProfileActionType;
import com.mojang.authlib.yggdrasil.ProfileResult;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.DataFixer;
import com.mojang.jtracy.DiscontinuousFrame;
import com.mojang.jtracy.TracyClient;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2BooleanFunction;
import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.invoke.MethodHandle;
import java.lang.management.ManagementFactory;
import java.lang.runtime.ObjectMethods;
import java.lang.runtime.SwitchBootstraps;
import java.net.Proxy;
import java.net.SocketAddress;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import net.minecraft.client.ClientBrandRetriever;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.io.FileUtils;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import org.slf4j.Logger;

public class gfj
extends cbv<Runnable>
implements fyl {
    static gfj A;
    private static final Logger B;
    private static final int C = 10;
    public static final amo a;
    public static final amo b;
    public static final amo c;
    private static final amo D;
    private static final CompletableFuture<bhr> E;
    private static final yh F;
    private static final yh G;
    public static final String d = "Please make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).";
    private final long H = Double.doubleToLongBits(Math.PI);
    private final Path I;
    private final CompletableFuture<@Nullable ProfileResult> J;
    private final ilr K;
    private final hph L;
    private final DataFixer M;
    private final hps N;
    private final fyk O;
    private final gez.b P = new gez.b(20.0f, 0L, this::a);
    private final hoz Q;
    public final hoh e;
    private final hwo R;
    private final ihk S;
    private final hxp T;
    private final hok U;
    public final hls f;
    private final hlw V;
    private final gfx W;
    public final gio g;
    public final gio h;
    public final hob i;
    public final giq j;
    public final gfo k;
    public final glz m;
    private final gfe X;
    public final gfk n;
    public final gfi o;
    private gfg Y = gfg.a;
    public final File p;
    private final String Z;
    private final String aa;
    private final Proxy ab;
    private final boolean ac;
    private final fni ad;
    private final boolean ae;
    private final boolean af;
    private final boolean ag;
    private final baw ah;
    private final azp ai;
    private final iom aj;
    private final bak ak;
    private final imw al;
    private final ggr am;
    private final fxt an;
    private final @Nullable fwf ao;
    private final iqr ap;
    private final iqm aq;
    private final gnp ar;
    private final imp as;
    private final hod at;
    private final gfp au = new gfp(D, (Object2BooleanFunction<String>)((Object2BooleanFunction)gfj::a));
    private final UserApiService av;
    private final CompletableFuture<UserApiService.UserProperties> aw;
    private final imo ax;
    private final inl ay;
    private final iob az;
    private final hpw aA;
    private final imn aB;
    private final imr aC;
    private final gnc aD;
    private final iru aE;
    private final gxo aF;
    private final hrh aG;
    private final iqw aH;
    private final hir aI;
    private final gch aJ;
    private final hnq aK;
    private final ano aL;
    private final hou aM;
    public @Nullable hio q;
    public @Nullable hif r;
    public @Nullable hnh s;
    private @Nullable iqa aN;
    private @Nullable wu aO;
    private boolean aP;
    private @Nullable cgk aQ;
    public @Nullable cgk t;
    public @Nullable ftk u;
    private int aR;
    protected int v;
    private volatile boolean aS;
    private long aT = bhs.d();
    private long aU;
    private int aV;
    public boolean w;
    public @Nullable gsb x;
    private @Nullable grw aW;
    private boolean aX;
    Thread aY;
    private volatile boolean aZ;
    private @Nullable Supplier<m> ba;
    private static int bb;
    private long bc;
    private final fya bd;
    public boolean y;
    public boolean z = true;
    private boolean be;
    private @Nullable CompletableFuture<Void> bf;
    private @Nullable gnd bg;
    private int bh;
    private final bzf bi;
    private cbe bj = cbd.a;
    private final gfr bk = new gfr();
    private long bl;
    private double bm;
    private @Nullable fzd.a bn;
    private final gfa bo;
    private final hiy bp;
    private hjn bq;
    private final gew br;
    private final ftc bs;
    private boolean bt;
    private final long bu;
    private long bv;
    private final xl bw;
    private final uq bx = new uq();
    private List<uq.a> by = new ArrayList<uq.a>();

    public gfj(final gzf $$02) {
        super("Client");
        A = this;
        this.bu = System.currentTimeMillis();
        this.p = $$02.c.a;
        File $$13 = $$02.c.c;
        this.I = $$02.c.b.toPath();
        this.Z = $$02.d.b;
        this.aa = $$02.d.c;
        Path $$2 = this.p.toPath();
        this.bs = fni.a($$2.resolve("allowed_symlinks.txt"));
        img $$3 = new img($$02.c.a(), this.bs);
        this.aj = new iom(this, $$2.resolve("downloads"), $$02.a);
        baf $$4 = new baf(this.I, azn.a, bal.b, this.bs);
        this.ak = new bak($$3, this.aj.a(), $$4);
        this.ai = $$3.a();
        this.ab = $$02.a.b;
        this.ac = $$02.d.h;
        YggdrasilAuthenticationService $$5 = this.ac ? YggdrasilAuthenticationService.createOffline((Proxy)this.ab) : new YggdrasilAuthenticationService(this.ab);
        this.aL = ano.a($$5, this.p);
        this.W = $$02.a.a;
        this.J = this.ac ? CompletableFuture.completedFuture(null) : CompletableFuture.supplyAsync(() -> this.aL.c().fetchProfile(this.W.b(), true), bhs.j());
        this.av = this.a($$5, $$02);
        this.aw = CompletableFuture.supplyAsync(() -> {
            try {
                return this.av.fetchProperties();
            }
            catch (AuthenticationException $$0) {
                B.error("Failed to fetch user properties", (Throwable)$$0);
                return UserApiService.OFFLINE_PROPERTIES;
            }
        }, bhs.j());
        B.info("Setting user: {}", (Object)this.W.c());
        B.debug("(Session ID is {})", (Object)this.W.a());
        this.ae = $$02.d.a;
        this.af = !$$02.d.d;
        this.ag = !$$02.d.e;
        this.aN = null;
        zk.a(gfh::a);
        this.M = bia.a();
        this.aY = Thread.currentThread();
        this.k = new gfo(this, this.p);
        this.m = new glz(this.p);
        this.aD = new gnc(this, this.k);
        boolean $$6 = this.k.aB;
        this.k.aB = false;
        this.k.aQ();
        this.aZ = true;
        this.aE = new iru(this, this.k);
        this.X = new gfe($$2, this.M);
        B.info("Backend library: {}", (Object)RenderSystem.getBackendDescription());
        fxz $$7 = $$02.b;
        if (this.k.n > 0 && this.k.m > 0) {
            $$7 = $$02.b.a(this.k.m, this.k.n);
        }
        if (!$$6) {
            $$7 = $$7.a(false);
            this.k.i = null;
            B.warn("Detected unexpected shutdown during last game startup: resetting fullscreen mode");
        }
        bhs.c = RenderSystem.initBackendSystem();
        this.N = new hps(this);
        this.O = this.N.a($$7, this.k.i, this.bn());
        this.a(true);
        this.O.a(new Runnable(){
            private boolean c;

            @Override
            public void run() {
                if (!this.c) {
                    this.c = true;
                    fxw.a($$02.c.a, gfj.this.aY.threadId());
                }
            }
        });
        irh.a.b(ird.A);
        try {
            this.O.a(this.ai, w.b().f() ? fyb.a : fyb.b);
        }
        catch (IOException $$8) {
            B.error("Couldn't set icon", (Throwable)$$8);
        }
        this.n = new gfk(this);
        this.n.a(this.O);
        this.o = new gfi(this);
        this.o.a(this.O);
        RenderSystem.initRenderer(this.O.h(), this.k.q, w.L, ($$0, $$1) -> this.ag().a($$0, $$1), $$02.d.g);
        this.k.a(this.k.i().b());
        B.info("Using optional rendering extensions: {}", (Object)String.join((CharSequence)", ", RenderSystem.getDevice().getEnabledExtensions()));
        this.an = new fxs(this.O.k(), this.O.l());
        this.ah = new baw(azn.a);
        this.ak.a();
        this.k.b(this.ak);
        this.al = new imw(this.k.ay, $$0 -> {
            if (this.s != null) {
                this.s.b.F();
            }
        });
        this.ah.a(this.al);
        this.K = new ilr(this.ah);
        this.ah.a(this.K);
        this.L = new hph(this.K, this::a);
        this.ah.a(this.L);
        ilj $$9 = new ilj(this.ab, this.K, this);
        this.ax = new imo($$13.toPath().resolve("skins"), this.aL, $$9, this);
        this.ad = new fni($$2.resolve("saves"), $$2.resolve("backups"), this.bs, this.M);
        this.br = new gew($$2);
        this.aq = new iqm(this);
        this.ap = new iqr(this.k);
        this.ah.a(this.ap);
        this.as = new imp(this.W);
        this.ah.a(this.as);
        this.ay = new inl(this.K, this.k.K().b());
        this.ah.a(this.ay);
        hni $$10 = new hni(this, this.aL.g());
        this.aM = new hou(this.K, this.ax, $$10);
        gij.a(this.aM);
        this.ar = new gnp(this.K, this.ay, this.aM);
        this.g = this.ar.a();
        this.h = this.ar.b();
        this.ah.a(this.ar);
        this.k();
        this.ah.a(new imk());
        this.ah.a(new imj());
        this.ah.a(new imi());
        this.O.a("Startup");
        RenderSystem.setupDefaultState();
        this.O.a("Post startup");
        this.am = ggr.a();
        this.az = new iob(this.am, this.ay, this.aM);
        this.ah.a(this.az);
        inq $$11 = new inq();
        this.ah.a($$11);
        this.S = new ihk(this.az);
        this.T = new hxp();
        this.aB = new imn(this.K);
        this.U = new hok(this.ay, this.aB);
        try {
            int $$122 = Runtime.getRuntime().availableProcessors();
            fzo.a();
            this.Q = new hoz($$122);
        }
        catch (OutOfMemoryError $$132) {
            TinyFileDialogs.tinyfd_messageBox((CharSequence)"Minecraft", (CharSequence)("Oh no! The game was unable to allocate memory off-heap while trying to start. You may try to free some memory by closing other applications on your computer, check that your system meets the minimum requirements, and try again. If the problem persists, please visit: " + String.valueOf(bez.k)), (CharSequence)"ok", (CharSequence)"error", (boolean)true);
            throw new gzg("Unable to allocate render buffers", $$132);
        }
        this.aF = new gxo(this, this.av);
        this.aA = new hpw(this.az.b(), this.ay, this.am);
        this.ah.a(this.aA);
        this.R = new hwo(this, this.K, this.S, this.U, this.aA, this.ay, this.g, this.k, this.az.d(), $$11, this.aM);
        this.ah.a(this.R);
        this.aG = new hrh(this.g, this.az.d(), this.aA, this.S, this.T, this.R, this.ay, this.aM);
        this.ah.a(this.aG);
        this.V = new hlw();
        this.ah.a(this.V);
        this.f = new hls(this.r, this.V);
        this.V.a(this.f::c);
        this.aC = new imr();
        this.ah.a(this.aC);
        this.i = new hob(this, this.R.b(), this.Q, this.aA);
        this.e = new hoh(this, this.R, this.aG, this.Q, this.i.d(), this.i.c());
        this.ah.a(this.e);
        this.ah.a(this.e.z());
        this.at = new hod();
        this.ah.a(this.at);
        this.ah.a(this.au);
        this.j = new giq(this);
        fzz $$14 = fzz.a(this);
        this.aJ = new gch($$14);
        RenderSystem.setErrorCallback(this::a);
        if (this.an.c != this.O.k() || this.an.d != this.O.l()) {
            StringBuilder $$15 = new StringBuilder("Recovering from unsupported resolution (" + this.O.k() + "x" + this.O.l() + ").\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).");
            try {
                GpuDevice $$16 = RenderSystem.getDevice();
                List<String> $$17 = $$16.getLastDebugMessages();
                if (!$$17.isEmpty()) {
                    $$15.append("\n\nReported GL debug messages:\n").append(String.join((CharSequence)"\n", $$17));
                }
            }
            catch (Throwable $$16) {
                // empty catch block
            }
            this.O.a(this.an.c, this.an.d);
            TinyFileDialogs.tinyfd_messageBox((CharSequence)"Minecraft", (CharSequence)$$15.toString(), (CharSequence)"ok", (CharSequence)"error", (boolean)false);
        } else if (this.k.ao().b().booleanValue() && !this.O.i()) {
            if ($$6) {
                this.O.g();
                this.k.ao().a(this.O.i());
            } else {
                this.k.ao().a(false);
            }
        }
        this.O.a(this.k.aa().b());
        this.O.b(this.k.R().b());
        this.O.c(this.k.S().b());
        this.O.d();
        this.a();
        this.i.a(this.ai.d());
        this.aH = new iqw(this, this.av, this.W);
        this.aI = this.ac ? hir.a : hir.a(this.av, this.W, $$2);
        this.bo = new gfa(this);
        this.bo.a(this.k.aK().b() != gfm.a);
        this.bp = new hiy(this);
        this.bp.a(this.k.I().b());
        this.bq = hjn.a(hjk.a(), this.av);
        gsd.a(this.K);
        grr.a(this.K);
        this.i.u().a(this.K);
        this.a(new grm(yh.c("gui.loadingMinecraft")));
        List<azl> $$18 = this.ak.h();
        this.bk.a(gfr.b.a, $$18);
        bav $$19 = this.ah.a(bhs.h().a("resourceLoad"), this, E, $$18);
        irh.a.a(ird.C);
        b $$20 = new b($$14, $$02.e);
        this.a(new grr(this, $$19, $$12 -> bhs.a($$12, (T $$1) -> this.a((Throwable)$$1, $$20), () -> {
            if (w.aX) {
                this.bq();
            }
            this.bk.a();
            this.a($$20);
        }), false));
        this.aK = hnq.a($$02.e.b());
        this.bd = new fya(this.k, this);
        this.bi = new bzf(bhs.c, () -> this.bh, this.bd::c);
        this.ao = TracyClient.isAvailable() && $$02.d.f ? new fwf() : null;
        this.bw = new xl(this.aY);
    }

    public boolean c() {
        fyk $$0 = this.aR();
        return fyc.a($$0, 340) || fyc.a($$0, 344);
    }

    public boolean d() {
        fyk $$0 = this.aR();
        return fyc.a($$0, 341) || fyc.a($$0, 345);
    }

    public boolean e() {
        fyk $$0 = this.aR();
        return fyc.a($$0, 342) || fyc.a($$0, 346);
    }

    private void a(@Nullable b $$0) {
        if (!this.bt) {
            this.bt = true;
            this.b($$0);
        }
    }

    private void b(@Nullable b $$0) {
        Runnable $$1 = this.c($$0);
        irh.a.b(ird.C);
        irh.a.b(ird.z);
        irh.a.a(this.aH.a());
        $$1.run();
        this.k.aB = true;
        this.k.aQ();
    }

    public boolean f() {
        return this.bt;
    }

    private Runnable c(@Nullable b $$0) {
        ArrayList<Function<Runnable, gsb>> $$1 = new ArrayList<Function<Runnable, gsb>>();
        boolean $$2 = this.a($$1);
        Runnable $$3 = () -> {
            if ($$0 != null && $$0.b.a()) {
                hnp.a(this, $$0.b.c(), $$0.a());
            } else {
                this.a(new gsd(true, new gjw($$2)));
            }
        };
        for (Function $$4 : Lists.reverse($$1)) {
            gsb $$5 = (gsb)$$4.apply($$3);
            $$3 = () -> this.a($$5);
        }
        return $$3;
    }

    private boolean a(List<Function<Runnable, gsb>> $$02) {
        ProfileResult $$3;
        BanDetails $$2;
        boolean $$13 = false;
        if (this.k.az || w.aj) {
            $$02.add($$0 -> new gqu(this.k, (Runnable)$$0));
            $$13 = true;
        }
        if (($$2 = this.M()) != null) {
            $$02.add($$12 -> gqx.a($$1 -> {
                if ($$1) {
                    bhs.n().a(bez.n);
                }
                $$12.run();
            }, $$2));
        }
        if (($$3 = this.J.join()) != null) {
            GameProfile $$4 = $$3.profile();
            Set $$5 = $$3.actions();
            if ($$5.contains(ProfileActionType.FORCED_NAME_CHANGE)) {
                $$02.add($$1 -> gqx.a($$4.name(), $$1));
            }
            if ($$5.contains(ProfileActionType.USING_BANNED_SKIN)) {
                $$02.add(gqx::a);
            }
        }
        return $$13;
    }

    private static boolean a(Object $$0) {
        try {
            return Locale.getDefault().getISO3Country().equals($$0);
        }
        catch (MissingResourceException $$1) {
            return false;
        }
    }

    public void g() {
        this.O.b(this.bn());
    }

    private String bn() {
        StringBuilder $$0 = new StringBuilder("Minecraft");
        if (gfj.i().a()) {
            $$0.append("*");
        }
        $$0.append(" ");
        $$0.append(w.b().c());
        hig $$1 = this.R();
        if ($$1 != null && $$1.m().i()) {
            $$0.append(" - ");
            hit $$2 = this.X();
            if (this.aN != null && !this.aN.q()) {
                $$0.append(imu.a("title.singleplayer", new Object[0]));
            } else if ($$2 != null && $$2.e()) {
                $$0.append(imu.a("title.multiplayer.realms", new Object[0]));
            } else if (this.aN != null || $$2 != null && $$2.d()) {
                $$0.append(imu.a("title.multiplayer.lan", new Object[0]));
            } else {
                $$0.append(imu.a("title.multiplayer.other", new Object[0]));
            }
        }
        return $$0.toString();
    }

    private UserApiService a(YggdrasilAuthenticationService $$0, gzf $$1) {
        if ($$1.d.h) {
            return UserApiService.OFFLINE;
        }
        return $$0.createUserApiService($$1.a.a.d());
    }

    public boolean h() {
        return this.ac;
    }

    public static bgi i() {
        return bgi.a("vanilla", ClientBrandRetriever::getClientModName, "Client", gfj.class);
    }

    private void a(Throwable $$0, @Nullable b $$1) {
        if (this.ak.e().size() > 1) {
            this.a($$0, null, $$1);
        } else {
            bhs.a($$0);
        }
    }

    public void a(Throwable $$0, @Nullable yh $$1, @Nullable b $$2) {
        B.info("Caught error loading resourcepacks, removing all selected resourcepacks", $$0);
        this.bk.a($$0);
        this.aj.b();
        this.ak.b(Collections.emptyList());
        this.k.g.clear();
        this.k.h.clear();
        this.k.aQ();
        this.a(true, $$2).thenRunAsync(() -> this.b($$1), this);
    }

    private void bo() {
        this.a((grw)null);
        if (this.r != null) {
            this.r.a(hif.a);
            this.F();
        }
        this.a(new gsd());
        this.b((yh)null);
    }

    private void b(@Nullable yh $$0) {
        gnc $$1 = this.aG();
        gna.b($$1, gna.a.c, yh.c("resourcePack.load_fail"), $$0);
    }

    public void a(Exception $$0) {
        if (!this.ak.b()) {
            if (this.ak.e().size() <= 1) {
                B.error(LogUtils.FATAL_MARKER, $$0.getMessage(), (Throwable)$$0);
                this.c(new m($$0.getMessage(), $$0));
            } else {
                this.a_(this::bo);
            }
            return;
        }
        this.a($$0, yh.c("resourcePack.runtime_failure"), null);
    }

    public void j() {
        this.aY = Thread.currentThread();
        if (Runtime.getRuntime().availableProcessors() > 4) {
            this.aY.setPriority(10);
        }
        DiscontinuousFrame $$0 = TracyClient.createDiscontinuousFrame((String)"Client Tick");
        try {
            boolean $$1 = false;
            while (this.aZ) {
                this.bp();
                try {
                    bzp $$2 = bzp.a("Renderer");
                    boolean $$3 = this.aT().c();
                    try (bzl.a $$4 = bzl.a(this.a($$3, $$2));){
                        this.bj.c();
                        $$0.start();
                        this.d(!$$1);
                        $$0.end();
                        this.bj.d();
                    }
                    this.b($$3, $$2);
                }
                catch (OutOfMemoryError $$5) {
                    if ($$1) {
                        throw $$5;
                    }
                    this.br();
                    this.a(new grv());
                    System.gc();
                    B.error(LogUtils.FATAL_MARKER, "Out of memory", (Throwable)$$5);
                    $$1 = true;
                }
            }
        }
        catch (v $$6) {
            B.error(LogUtils.FATAL_MARKER, "Reported exception thrown!", (Throwable)$$6);
            this.c($$6.a());
        }
        catch (Throwable $$7) {
            B.error(LogUtils.FATAL_MARKER, "Unreported exception thrown!", $$7);
            this.c(new m("Unexpected error", $$7));
        }
    }

    void k() {
        this.ar.a(this.k);
    }

    private void a(int $$0, long $$1) {
        this.k.aa().a(false);
        this.k.aQ();
    }

    public fxt l() {
        return this.an;
    }

    public String m() {
        return this.Z;
    }

    public String n() {
        return this.aa;
    }

    public void a(m $$0) {
        this.ba = () -> this.d($$0);
    }

    public void b(m $$0) {
        this.ba = () -> $$0;
    }

    private void bp() {
        if (this.ba != null) {
            gfj.a(this, this.p, this.ba.get());
        }
    }

    public void c(m $$0) {
        bgh.b();
        m $$1 = this.d($$0);
        this.br();
        gfj.a(this, this.p, $$1);
    }

    public static int a(File $$0, m $$1) {
        Path $$2 = $$0.toPath().resolve("crash-reports");
        Path $$3 = $$2.resolve("crash-" + bhs.f() + "-client.txt");
        amv.a($$1.a(u.a));
        if ($$1.e() != null) {
            amv.a("#@!@# Game crashed! Crash report saved to: #@!@# " + String.valueOf($$1.e().toAbsolutePath()));
            return -1;
        }
        if ($$1.a($$3, u.a)) {
            amv.a("#@!@# Game crashed! Crash report saved to: #@!@# " + String.valueOf($$3.toAbsolutePath()));
            return -1;
        }
        amv.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
        return -2;
    }

    public static void a(@Nullable gfj $$0, File $$1, m $$2) {
        int $$3 = gfj.a($$1, $$2);
        if ($$0 != null) {
            $$0.ap.f();
        }
        System.exit($$3);
    }

    public boolean o() {
        return this.k.ac().b();
    }

    public CompletableFuture<Void> p() {
        return this.a(false, (b)null);
    }

    private CompletableFuture<Void> a(boolean $$0, @Nullable b $$1) {
        if (this.bf != null) {
            return this.bf;
        }
        CompletableFuture<Void> $$2 = new CompletableFuture<Void>();
        if (!$$0 && this.aW instanceof grr) {
            this.bf = $$2;
            return $$2;
        }
        this.ak.a();
        List<azl> $$32 = this.ak.h();
        if (!$$0) {
            this.bk.a(gfr.b.b, $$32);
        }
        this.a(new grr(this, this.ah.a(bhs.h().a("resourceLoad"), this, E, $$32), $$3 -> bhs.a($$3, (T $$2) -> {
            if ($$0) {
                this.aj.c();
                this.bo();
            } else {
                this.a((Throwable)$$2, $$1);
            }
        }, () -> {
            this.e.d();
            this.bk.a();
            this.aj.d();
            $$2.complete(null);
            this.a($$1);
        }), !$$0));
        return $$2;
    }

    private void bq() {
        boolean $$02 = false;
        hpv $$1 = this.ax().a();
        hqh $$2 = $$1.a().a();
        for (dzq $$3 : mi.e) {
            for (eoh $$4 : $$3.l().a()) {
                hqh $$5;
                if ($$4.o() != egf.b || ($$5 = $$1.b($$4)) != $$2) continue;
                B.debug("Missing model for: {}", (Object)$$4);
                $$02 = true;
            }
        }
        ilp $$6 = $$2.a();
        for (dzq $$7 : mi.e) {
            for (eoh $$8 : $$7.l().a()) {
                ilp $$9 = $$1.a($$8);
                if ($$8.l() || $$9 != $$6) continue;
                B.debug("Missing particle icon for: {}", (Object)$$8);
            }
        }
        mi.h.c().forEach($$0 -> {
            dlp $$1 = (dlp)$$0.a();
            String $$2 = $$1.j();
            String $$3 = yh.c($$2).getString();
            if ($$3.toLowerCase(Locale.ROOT).equals($$1.j())) {
                B.debug("Missing translation for: {} {} {}", new Object[]{$$0.h().a(), $$2, $$1});
            }
        });
        $$02 |= grt.a();
        if ($$02 |= hwr.a()) {
            throw new IllegalStateException("Your game data is foobar, fix the errors above!");
        }
    }

    public fni q() {
        return this.ad;
    }

    public void a(gjf.c $$02) {
        a $$1 = this.O();
        if (!$$1.a(this.Y())) {
            if (this.j.c()) {
                this.j.b(false);
                this.a(new gqz($$0 -> {
                    if ($$0) {
                        bhs.n().a(bez.g);
                    }
                    this.a((gsb)null);
                }, gfj$a.e, bez.g, true));
            } else {
                yh $$2 = $$1.a();
                this.j.a($$2, false);
                this.bo.d($$2);
                this.j.b($$1 == gfj$a.d);
            }
        } else {
            this.j.e().b($$02, gqy::new);
        }
    }

    public void a(@Nullable gsb $$0) {
        if (w.aX && Thread.currentThread() != this.aY) {
            B.error("setScreen called from non-game thread");
        }
        if (this.x != null) {
            this.x.aZ_();
        } else {
            this.a(gfg.a);
        }
        if ($$0 == null) {
            if (this.aX) {
                throw new IllegalStateException("Trying to return to in-game GUI during disconnection");
            }
            if (this.r == null) {
                $$0 = new gsd();
            } else if (this.s.fa()) {
                if (this.s.A()) {
                    $$0 = new grg(null, this.r.l().k(), this.s);
                } else {
                    this.s.o();
                }
            } else {
                $$0 = this.j.e().j();
            }
        }
        this.x = $$0;
        if (this.x != null) {
            this.x.aK_();
        }
        if ($$0 != null) {
            this.n.j();
            gfh.b();
            $$0.b(this.O.o(), this.O.p());
            this.w = false;
        } else {
            if (this.r != null) {
                gfh.c();
            }
            this.ap.g();
            this.n.i();
        }
        this.g();
    }

    public void a(@Nullable grw $$0) {
        this.aW = $$0;
    }

    public void r() {
        try {
            B.info("Stopping!");
            try {
                this.bo.c();
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            try {
                if (this.r != null) {
                    this.r.a(hif.a);
                }
                this.F();
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            if (this.x != null) {
                this.x.aZ_();
            }
            this.close();
        }
        finally {
            bhs.c = System::nanoTime;
            if (this.ba == null) {
                System.exit(0);
            }
        }
    }

    @Override
    public void close() {
        if (this.bn != null) {
            this.bn.a();
        }
        try {
            this.aH.close();
            this.au.close();
            this.ay.close();
            this.ar.close();
            this.i.close();
            this.L.close();
            this.e.close();
            this.ap.e();
            this.aB.close();
            this.K.close();
            this.ah.close();
            if (this.ao != null) {
                this.ao.close();
            }
            goi.b();
            bhs.k();
            RenderSystem.getSamplerCache().b();
            RenderSystem.getDevice().close();
        }
        catch (Throwable $$0) {
            B.error("Shutdown failure!", $$0);
            throw $$0;
        }
        finally {
            this.N.close();
            this.O.close();
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    private void d(boolean $$0) {
        void $$13;
        this.O.a("Pre render");
        if (this.O.c()) {
            this.u();
        }
        if (this.bf != null && !(this.aW instanceof grr)) {
            CompletableFuture<Void> $$1 = this.bf;
            this.bf = null;
            this.p().thenRun(() -> $$1.complete(null));
        }
        int $$2 = this.P.a(bhs.c(), $$0);
        bzm $$3 = bzl.a();
        if ($$0) {
            try (um.a $$4 = this.bl();){
                $$3.a("scheduledPacketProcessing");
                this.bw.b();
                $$3.b("scheduledExecutables");
                this.bN();
                $$3.c();
            }
            $$3.a("tick");
            if ($$2 > 0 && this.bw()) {
                $$3.a("textures");
                this.K.a();
                $$3.c();
            }
            for (int $$5 = 0; $$5 < Math.min(10, $$2); ++$$5) {
                $$3.f("clientTick");
                try (um.a $$6 = this.bl();){
                    this.x();
                    continue;
                }
            }
            if ($$2 > 0 && (this.r == null || this.r.y().i())) {
                this.by = this.bx.a();
            }
            $$3.c();
        }
        this.O.a("Render");
        try (um.a $$7 = this.e.A();){
            boolean $$10;
            $$3.a("gpuAsync");
            RenderSystem.executePendingTasks();
            $$3.b("sound");
            this.ap.a(this.i.p());
            $$3.b("toasts");
            this.aD.a();
            $$3.b("mouse");
            this.n.a();
            $$3.b("render");
            long $$8 = bhs.d();
            if (this.m.b(glx.A) || this.bj.e()) {
                boolean $$9;
                boolean bl2 = $$9 = (this.bn == null || this.bn.b()) && !fzd.a().b();
                if ($$9) {
                    fzd.a().c();
                }
            } else {
                $$10 = false;
                this.bm = 0.0;
            }
            fxt $$11 = this.l();
            RenderSystem.getDevice().createCommandEncoder().clearColorAndDepthTextures($$11.c(), 0, $$11.e(), 1.0);
            $$3.a("gameRenderer");
            if (!this.w) {
                this.i.a(this.P, $$0);
            }
            $$3.b("blit");
            if (!this.O.u()) {
                $$11.b();
            }
            this.bc = bhs.d() - $$8;
            if ($$10) {
                this.bn = fzd.a().d();
            }
            $$3.b("updateDisplay");
            if (this.ao != null) {
                this.ao.a();
                this.ao.a($$11);
            }
            this.O.a(this.ao);
            int $$12 = this.bd.a();
            if ($$12 < 260) {
                RenderSystem.limitDisplayFPS($$12);
            }
            $$3.c();
            $$3.b("yield");
            Thread.yield();
            $$3.c();
        }
        this.O.a("Post render");
        ++this.aV;
        boolean $$14 = this.aS;
        boolean bl3 = this.aS = this.Z() && (this.x != null && this.x.ba_() || this.aW != null && this.aW.b()) && !this.aN.q();
        if (!$$14 && this.aS) {
            this.ap.a(bdb.b, bdb.k);
        }
        this.P.b(this.aS);
        this.P.c(!this.bw());
        long $$15 = bhs.d();
        long $$16 = $$15 - this.aT;
        if ($$13 != false) {
            this.bl = $$16;
        }
        this.aT().a($$16);
        this.aT = $$15;
        $$3.a("fpsUpdate");
        if (this.bn != null && this.bn.b()) {
            this.bm = (double)this.bn.c() * 100.0 / (double)this.bl;
        }
        while (bhs.c() >= this.aU + 1000L) {
            bb = this.aV;
            this.aU += 1000L;
            this.aV = 0;
        }
        $$3.c();
    }

    private bzm a(boolean $$0, @Nullable bzp $$1) {
        bzm $$3;
        if (!$$0) {
            this.bi.b();
            if (!this.bj.e() && $$1 == null) {
                return bzi.a;
            }
        }
        if ($$0) {
            if (!this.bi.a()) {
                this.bh = 0;
                this.bi.c();
            }
            ++this.bh;
            bzm $$2 = this.bi.d();
        } else {
            $$3 = bzi.a;
        }
        if (this.bj.e()) {
            $$3 = bzm.a($$3, this.bj.f());
        }
        return bzp.a($$3, $$1);
    }

    private void b(boolean $$0, @Nullable bzp $$1) {
        if ($$1 != null) {
            $$1.b();
        }
        gmh $$2 = this.aT().l();
        if ($$0) {
            $$2.a(this.bi.e());
        } else {
            $$2.a((bzk)null);
        }
    }

    @Override
    public void a() {
        int $$0 = this.O.a((int)this.k.aI().b(), this.o());
        this.O.a($$0);
        if (this.x != null) {
            this.x.a(this.O.o(), this.O.p());
        }
        fxt $$1 = this.l();
        $$1.a(this.O.k(), this.O.l());
        this.i.a(this.O.k(), this.O.l());
        this.n.g();
    }

    @Override
    public void b() {
        this.n.k();
    }

    public int s() {
        return bb;
    }

    public long t() {
        return this.bc;
    }

    private void br() {
        bgh.b();
        try {
            if (this.aP && this.aN != null) {
                this.aN.a(true);
            }
            this.C();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        System.gc();
    }

    public boolean b(Consumer<yh> $$02) {
        Consumer<Path> $$8;
        if (this.bj.e()) {
            this.bs();
            return false;
        }
        Consumer<bzk> $$13 = $$1 -> {
            if ($$1 == bzg.a) {
                return;
            }
            int $$2 = $$1.f();
            double $$3 = (double)$$1.g() / (double)bhn.a;
            this.execute(() -> $$02.accept(yh.a("commands.debug.stopped", new Object[]{String.format(Locale.ROOT, "%.2f", $$3), $$2, String.format(Locale.ROOT, "%.2f", (double)$$2 / $$3)})));
        };
        Consumer<Path> $$22 = $$12 -> {
            yw $$2 = yh.b($$12.toString()).a(l.t).a($$1 -> $$1.a(new yf.e($$12.getParent())));
            this.execute(() -> $$02.accept(yh.a("debug.profiling.stop", $$2)));
        };
        y $$3 = gfj.a(new y(), this, this.al, this.Z, this.k);
        Consumer<List> $$4 = $$2 -> {
            Path $$3 = this.a($$3, (List<Path>)$$2);
            $$22.accept($$3);
        };
        if (this.aN == null) {
            Consumer<Path> $$5 = $$1 -> $$4.accept((List)ImmutableList.of((Object)$$1));
        } else {
            this.aN.b($$3);
            CompletableFuture $$6 = new CompletableFuture();
            CompletableFuture $$7 = new CompletableFuture();
            CompletableFuture.allOf($$6, $$7).thenRunAsync(() -> $$4.accept((List)ImmutableList.of((Object)((Path)$$6.join()), (Object)((Path)$$7.join()))), bhs.i());
            this.aN.a((bzk $$0) -> {}, $$7::complete);
            $$8 = $$6::complete;
        }
        this.bj = cbc.a(new hnn(bhs.c, this.e), bhs.c, bhs.i(), new cbi("client"), $$1 -> {
            this.bj = cbd.a;
            $$13.accept((bzk)$$1);
        }, $$8);
        return true;
    }

    private void bs() {
        this.bj.a();
        if (this.aN != null) {
            this.aN.aX();
        }
    }

    private void bt() {
        this.bj.b();
        if (this.aN != null) {
            this.aN.aY();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private Path a(y $$0, List<Path> $$1) {
        void $$9;
        String $$4;
        if (this.Y()) {
            String $$2 = this.aa().bb().d();
        } else {
            hit $$3 = this.X();
            $$4 = $$3 != null ? $$3.a : "unknown";
        }
        try {
            String $$5 = String.format(Locale.ROOT, "%s-%s-%s", bhs.f(), $$4, w.b().b());
            String $$6 = bfp.a(cbi.a, $$5, ".zip");
            Path $$7 = cbi.a.resolve($$6);
        }
        catch (IOException $$8) {
            throw new UncheckedIOException($$8);
        }
        try (bfq $$10 = new bfq((Path)$$9);){
            $$10.a(Paths.get("system.txt", new String[0]), $$0.a());
            $$10.a(Paths.get("client", new String[0]).resolve(this.k.aW().getName()), this.k.aX());
            $$1.forEach($$10::a);
        }
        finally {
            for (Path $$11 : $$1) {
                try {
                    FileUtils.forceDelete((File)$$11.toFile());
                }
                catch (IOException $$12) {
                    B.warn("Failed to delete temporary profiling result {}", (Object)$$11, (Object)$$12);
                }
            }
        }
        return $$9;
    }

    public void u() {
        this.aZ = false;
    }

    public boolean v() {
        return this.aZ;
    }

    public void b(boolean $$0) {
        boolean $$1;
        if (this.x != null) {
            return;
        }
        boolean bl2 = $$1 = this.Z() && !this.aN.q();
        if ($$1) {
            this.a(new grx(!$$0));
        } else {
            this.a(new grx(true));
        }
    }

    private void e(boolean $$0) {
        if (!$$0) {
            this.v = 0;
        }
        if (this.v > 0 || this.s.fZ()) {
            return;
        }
        dlt $$1 = this.s.b(cdb.a);
        if ($$1.c(ki.N)) {
            return;
        }
        if ($$0 && this.u != null && this.u.d() == ftk.a.b) {
            iz $$4;
            fti $$2 = (fti)this.u;
            is $$3 = $$2.b();
            if (!this.r.a_($$3).l() && this.q.b($$3, $$4 = $$2.c())) {
                this.r.d($$3, $$4);
                this.s.a(cdb.a);
            }
            return;
        }
        this.q.b();
    }

    private boolean bu() {
        if (this.v > 0) {
            return false;
        }
        if (this.u == null) {
            B.error("Null returned as 'hitResult', this shouldn't happen!");
            if (this.q.e()) {
                this.v = 10;
            }
            return false;
        }
        if (this.s.J()) {
            return false;
        }
        dlt $$0 = this.s.b(cdb.a);
        if (!$$0.a(this.r.Q())) {
            return false;
        }
        if (this.s.c($$0, 0)) {
            return false;
        }
        boolean $$1 = false;
        dow $$2 = $$0.a(ki.N);
        if ($$2 != null && !this.q.g()) {
            this.q.a($$2);
            this.s.a(cdb.a);
            return true;
        }
        switch (this.u.d()) {
            case c: {
                dnu $$3 = $$0.a(ki.F);
                if ($$3 != null && !$$3.a(this.s, this.u.g())) break;
                this.q.a((ddm)this.s, ((ftj)this.u).a());
                break;
            }
            case b: {
                fti $$4 = (fti)this.u;
                is $$5 = $$4.b();
                if (!this.r.a_($$5).l()) {
                    this.q.a($$5, $$4.c());
                    if (!this.r.a_($$5).l()) break;
                    $$1 = true;
                    break;
                }
            }
            case a: {
                if (this.q.e()) {
                    this.v = 10;
                }
                this.s.hf();
            }
        }
        if (!this.s.au()) {
            this.s.a(cdb.a);
        }
        return $$1;
    }

    private void bv() {
        if (this.q.j()) {
            return;
        }
        this.aR = 4;
        if (this.s.J()) {
            return;
        }
        if (this.u == null) {
            B.warn("Null returned as 'hitResult', this shouldn't happen!");
        }
        for (cdb $$0 : cdb.values()) {
            cdc $$10;
            dlt $$1 = this.s.b($$0);
            if (!$$1.a(this.r.Q())) {
                return;
            }
            if (this.u != null) {
                switch (this.u.d()) {
                    case c: {
                        ftj $$2 = (ftj)this.u;
                        cgk $$3 = $$2.a();
                        if (!this.r.w().a($$3.dK())) {
                            return;
                        }
                        if (!this.s.b($$3, 0.0)) break;
                        cdc $$4 = this.q.a(this.s, $$3, $$2, $$0);
                        if (!$$4.a()) {
                            $$4 = this.q.a((ddm)this.s, $$3, $$0);
                        }
                        if (!($$4 instanceof cdc.d)) break;
                        cdc.d $$5 = (cdc.d)$$4;
                        if ($$5.e() == cdc.e.b) {
                            this.s.a($$0);
                        }
                        return;
                    }
                    case b: {
                        fti $$6 = (fti)this.u;
                        int $$7 = $$1.N();
                        cdc $$8 = this.q.a(this.s, $$0, $$6);
                        if ($$8 instanceof cdc.d) {
                            cdc.d $$9 = (cdc.d)$$8;
                            if ($$9.e() == cdc.e.b) {
                                this.s.a($$0);
                                if (!$$1.f() && ($$1.N() != $$7 || this.s.gv())) {
                                    this.i.d.a($$0);
                                }
                            }
                            return;
                        }
                        if (!($$8 instanceof cdc.a)) break;
                        return;
                    }
                }
            }
            if ($$1.f() || !(($$10 = this.q.a((ddm)this.s, $$0)) instanceof cdc.d)) continue;
            cdc.d $$11 = (cdc.d)$$10;
            if ($$11.e() == cdc.e.b) {
                this.s.a($$0);
            }
            this.i.d.a($$0);
            return;
        }
    }

    public iqm w() {
        return this.aq;
    }

    public void x() {
        ++this.bv;
        if (this.r != null && !this.aS) {
            this.r.y().m();
        }
        if (this.aR > 0) {
            --this.aR;
        }
        bzm $$0 = bzl.a();
        $$0.a("gui");
        this.bp.a();
        this.j.a(this.aS);
        $$0.c();
        this.i.a(1.0f);
        this.aE.a(this.r, this.u);
        $$0.a("gameMode");
        if (!this.aS && this.r != null) {
            this.q.c();
        }
        $$0.b("screen");
        if (this.x == null && this.s != null) {
            if (this.s.fa() && !(this.x instanceof grg)) {
                this.a((gsb)null);
            } else if (this.s.gr() && this.r != null) {
                this.j.e().b(gjf.c.a, gro::new);
            }
        } else {
            gsb gsb2 = this.x;
            if (gsb2 instanceof gro) {
                gro $$1 = (gro)gsb2;
                if (!this.s.gr()) {
                    $$1.o();
                }
            }
        }
        if (this.x != null) {
            this.v = 10000;
        }
        if (this.x != null) {
            try {
                this.x.e();
            }
            catch (Throwable $$2) {
                m $$3 = m.a($$2, "Ticking screen");
                this.x.a($$3);
                throw new v($$3);
            }
        }
        if (this.aW != null) {
            this.aW.a();
        }
        if (!this.aT().b()) {
            this.j.m();
        }
        if (this.aW == null && this.x == null) {
            $$0.b("Keybindings");
            this.by();
            if (this.v > 0) {
                --this.v;
            }
        }
        if (this.r != null) {
            if (!this.aS) {
                $$0.b("gameRenderer");
                this.i.j();
                $$0.b("entities");
                this.r.g();
                $$0.b("blockEntities");
                this.r.ai();
            }
        } else if (this.i.k() != null) {
            this.i.g();
        }
        this.aq.a();
        this.ap.a(this.aS);
        if (this.r != null) {
            hig $$9;
            if (!this.aS) {
                $$0.b("level");
                if (!this.k.p && this.bx()) {
                    yw $$4 = yh.c("tutorial.socialInteractions.title");
                    yw $$5 = yh.a("tutorial.socialInteractions.description", iru.a("socialInteractions"));
                    this.bg = new gnd(this.g, gnd.a.f, $$4, $$5, true, 8000);
                    this.aD.a(this.bg);
                    this.k.p = true;
                    this.k.aQ();
                }
                this.aE.d();
                try {
                    this.r.a(() -> true);
                }
                catch (Throwable $$6) {
                    m $$7 = m.a($$6, "Exception in world tick");
                    if (this.r == null) {
                        n $$8 = $$7.a("Affected level");
                        $$8.a("Problem", "Level is null!");
                    } else {
                        this.r.a($$7);
                    }
                    throw new v($$7);
                }
            }
            $$0.b("animateTick");
            if (!this.aS && this.bw()) {
                this.r.b(this.s.dO(), this.s.dQ(), this.s.dU());
            }
            $$0.b("particles");
            if (!this.aS && this.bw()) {
                this.f.a();
            }
            if (($$9 = this.R()) != null && !this.aS) {
                $$9.b(aio.a);
            }
        } else if (this.aO != null) {
            $$0.b("pendingConnection");
            this.aO.b();
        }
        $$0.b("keyboard");
        this.o.b();
        $$0.c();
    }

    private boolean bw() {
        return this.r == null || this.r.y().i();
    }

    private boolean bx() {
        return !this.aP || this.aN != null && this.aN.q();
    }

    private void by() {
        while (this.k.K.h()) {
            ges $$02 = this.k.aV();
            this.k.a(this.k.aV().c());
            if ($$02.a() != this.k.aV().a()) {
                this.i.a(this.k.aV().a() ? this.au() : null);
            }
            this.e.p();
        }
        while (this.k.L.h()) {
            this.k.aw = !this.k.aw;
        }
        for (int $$1 = 0; $$1 < 9; ++$$1) {
            boolean $$2 = this.k.S.f();
            boolean $$3 = this.k.T.f();
            if (!this.k.R[$$1].h()) continue;
            if (this.s.au()) {
                this.j.h().a($$1);
                continue;
            }
            if (this.s.gv() && this.x == null && ($$3 || $$2)) {
                gua.a(this, $$1, $$3, $$2);
                continue;
            }
            this.s.gK().d($$1);
        }
        while (this.k.I.h()) {
            if (!this.bx() && !w.ad) {
                this.s.a(F, true);
                this.bo.d(F);
                continue;
            }
            if (this.bg != null) {
                this.bg.c();
                this.bg = null;
            }
            this.a(new gxq());
        }
        while (this.k.z.h()) {
            if (this.q.f()) {
                this.s.w();
                continue;
            }
            this.aE.a();
            this.a(new gul(this.s));
        }
        while (this.k.N.h()) {
            this.a(new gsl(this.s.b.s()));
        }
        while (this.k.O.h()) {
            this.bz().ifPresent($$0 -> this.s.b.a((jd<asj>)$$0, this.x));
        }
        while (this.k.A.h()) {
            if (this.s.au()) continue;
            this.R().b(new aji(aji.a.g, is.c, iz.a));
        }
        while (this.k.B.h()) {
            if (this.s.au() || !this.s.b(this.d())) continue;
            this.s.a(cdb.a);
        }
        while (this.k.F.h()) {
            this.a(gjf.c.a);
        }
        if (this.x == null && this.aW == null && this.k.H.h()) {
            this.a(gjf.c.b);
        }
        boolean $$4 = false;
        if (this.s.fZ()) {
            if (!this.k.C.f()) {
                this.q.b(this.s);
            }
            while (this.k.D.h()) {
            }
            while (this.k.C.h()) {
            }
            while (this.k.E.h()) {
            }
        } else {
            while (this.k.D.h()) {
                $$4 |= this.bu();
            }
            while (this.k.C.h()) {
                this.bv();
            }
            while (this.k.E.h()) {
                this.bB();
            }
            if (this.s.au()) {
                while (this.k.V.h()) {
                    this.j.h().b();
                }
            }
        }
        if (this.k.C.f() && this.aR == 0 && !this.s.fZ()) {
            this.bv();
        }
        this.e(this.x == null && !$$4 && this.k.D.f() && this.n.h());
    }

    private Optional<jd<asj>> bz() {
        jq<asj> $$0 = this.s.b.y().f(mj.bc);
        return $$0.a(bdr.b).flatMap($$1 -> {
            if ($$1.b() == 0) {
                return Optional.empty();
            }
            if ($$1.b() == 1) {
                return Optional.of($$1.a(0));
            }
            return $$0.a(asn.c);
        });
    }

    public iqw y() {
        return this.aH;
    }

    public double z() {
        return this.bm;
    }

    public hir A() {
        return this.aI;
    }

    public gyk B() {
        return new gyk(this, this.ad);
    }

    public void a(fni.c $$02, bak $$1, ans $$2, boolean $$3) {
        this.F();
        Instant $$42 = Instant.now();
        hin $$5 = new hin($$3 ? 500L : 0L);
        grp $$6 = new grp($$5, grp.a.c);
        this.a($$6);
        int $$7 = Math.max(5, 3) + awh.a + 1;
        try {
            $$02.a($$2.c().a(), $$2.d());
            axq $$8 = axq.a($$5, axs.b());
            this.aN = MinecraftServer.a((Thread $$4) -> new iqa((Thread)$$4, this, $$02, $$1, $$2, this.aL, $$8));
            $$5.a(this.aN.a($$7));
            this.aP = true;
            this.a(hjk.a());
            this.aK.a(hnq.c.a, $$02.f(), $$2.d().d());
        }
        catch (Throwable $$9) {
            m $$10 = m.a($$9, "Starting integrated server");
            n $$11 = $$10.a("Starting integrated server");
            $$11.a("Level ID", $$02.f());
            $$11.a("Level Name", () -> $$2.d().d());
            throw new v($$10);
        }
        bzm $$12 = bzl.a();
        $$12.a("waitForServer");
        long $$13 = TimeUnit.SECONDS.toNanos(1L) / 60L;
        while (!this.aN.al() || this.aW != null) {
            long $$14 = bhs.d() + $$13;
            $$6.e();
            if (this.aW != null) {
                this.aW.a();
            }
            this.d(false);
            this.bN();
            this.b(() -> bhs.d() > $$14);
            this.bp();
        }
        $$12.c();
        Duration $$15 = Duration.between($$42, Instant.now());
        SocketAddress $$16 = this.aN.ak().a();
        wu $$17 = wu.a($$16);
        $$17.a($$16.toString(), 0, new hie($$17, this, null, null, $$3, $$15, $$0 -> {}, $$5, null));
        $$17.a(new aky(this.ac().c(), this.ac().b()));
        this.aO = $$17;
    }

    public void a(hif $$0) {
        this.r = $$0;
        this.b($$0);
    }

    public void a(yh $$0) {
        boolean $$1 = this.Y();
        hit $$2 = this.X();
        if (this.r != null) {
            this.r.a($$0);
        }
        if ($$1) {
            this.C();
        } else {
            this.F();
        }
        gsd $$3 = new gsd();
        if ($$1) {
            this.a($$3);
        } else if ($$2 != null && $$2.e()) {
            this.a(new fzu($$3));
        } else {
            this.a(new gvp($$3));
        }
    }

    public void C() {
        this.a(new grm(G), false);
    }

    public void F() {
        this.c(true);
    }

    public void c(boolean $$0) {
        this.a(new grz(true), false, $$0);
    }

    public void a(gsb $$0, boolean $$1) {
        this.a($$0, $$1, true);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(gsb $$0, boolean $$1, boolean $$2) {
        hig $$3 = this.R();
        if ($$3 != null) {
            this.bM();
            $$3.j();
            if (!$$1) {
                this.G();
            }
        }
        this.aF.b();
        if (this.bj.e()) {
            this.bt();
        }
        iqa $$4 = this.aN;
        this.aN = null;
        this.i.m();
        this.q = null;
        this.bo.b();
        this.aX = true;
        try {
            if (this.r != null) {
                this.j.j();
            }
            if ($$4 != null) {
                this.a(new grm(G));
                bzm $$5 = bzl.a();
                $$5.a("waitForServer");
                while (!$$4.M()) {
                    this.d(false);
                }
                $$5.c();
            }
            this.c($$0);
            this.aP = false;
            this.r = null;
            this.a((hif)null, $$2);
            this.s = null;
        }
        finally {
            this.aX = false;
        }
    }

    public void G() {
        this.aj.i();
        this.bN();
    }

    public void b(gsb $$0) {
        hig $$1 = this.R();
        if ($$1 != null) {
            $$1.k();
        }
        if (this.bj.e()) {
            this.bt();
        }
        this.i.m();
        this.q = null;
        this.bo.b();
        this.aX = true;
        try {
            this.c($$0);
            this.j.j();
            this.r = null;
            this.b((hif)null);
            this.s = null;
        }
        finally {
            this.aX = false;
        }
    }

    public void c(gsb $$0) {
        try (bzr $$1 = bzl.a().d("forcedTick");){
            this.a($$0);
            this.d(false);
        }
    }

    private void b(@Nullable hif $$0) {
        this.a($$0, true);
    }

    private void a(@Nullable hif $$0, boolean $$1) {
        if ($$1) {
            this.ap.d();
        }
        this.a((cgk)null);
        this.aO = null;
        this.e.a($$0);
        this.f.a($$0);
        this.i.a($$0);
        this.g();
    }

    private UserApiService.UserProperties bA() {
        return this.aw.join();
    }

    public boolean H() {
        return this.I() && this.k.aA().b() != false;
    }

    public boolean I() {
        return this.J() && this.bA().flag(UserApiService.UserFlag.OPTIONAL_TELEMETRY_AVAILABLE);
    }

    public boolean J() {
        if (w.aX && !w.aQ) {
            return false;
        }
        return this.bA().flag(UserApiService.UserFlag.TELEMETRY_ENABLED);
    }

    public boolean K() {
        return this.af && this.bA().flag(UserApiService.UserFlag.SERVERS_ALLOWED) && this.M() == null && !this.N();
    }

    public boolean L() {
        return this.bA().flag(UserApiService.UserFlag.REALMS_ALLOWED) && this.M() == null;
    }

    public @Nullable BanDetails M() {
        return (BanDetails)this.bA().bannedScopes().get("MULTIPLAYER");
    }

    public boolean N() {
        ProfileResult $$0 = this.J.getNow(null);
        return $$0 != null && $$0.actions().contains(ProfileActionType.FORCED_NAME_CHANGE);
    }

    public boolean a(UUID $$0) {
        if (!this.O().a(false)) {
            return (this.s == null || !$$0.equals(this.s.cY())) && !$$0.equals(bhs.e);
        }
        return this.aF.c($$0);
    }

    public a O() {
        if (this.k.t().b() == ddj.c) {
            return gfj$a.b;
        }
        if (!this.ag) {
            return gfj$a.c;
        }
        if (!this.bA().flag(UserApiService.UserFlag.CHAT_ALLOWED)) {
            return gfj$a.d;
        }
        return gfj$a.a;
    }

    public final boolean P() {
        return this.ae;
    }

    public final boolean Q() {
        return this.s != null && this.q != null;
    }

    public @Nullable hig R() {
        return this.s == null ? null : this.s.b;
    }

    public static boolean S() {
        return !gfj.A.k.au;
    }

    public static boolean T() {
        return !gfj.A.i.f() && gfj.A.k.p().b() != false;
    }

    public static boolean U() {
        return gfj.A.k.q().b();
    }

    private void bB() {
        if (this.u == null || this.u.d() == ftk.a.a) {
            return;
        }
        boolean $$0 = this.d();
        ftk ftk2 = this.u;
        Objects.requireNonNull(ftk2);
        ftk ftk3 = ftk2;
        int n2 = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{fti.class, ftj.class}, (Object)ftk3, n2)) {
            case 0: {
                fti $$1 = (fti)ftk3;
                this.q.a($$1.b(), $$0);
                break;
            }
            case 1: {
                ftj $$2 = (ftj)ftk3;
                this.q.a($$2.a(), $$0);
                break;
            }
        }
    }

    public m d(m $$0) {
        y $$1 = $$0.f();
        try {
            gfj.a($$1, this, this.al, this.Z, this.k);
            this.a($$0.a("Uptime"));
            if (this.r != null) {
                this.r.a($$0);
            }
            if (this.aN != null) {
                this.aN.b($$1);
            }
            this.bk.a($$0);
        }
        catch (Throwable $$2) {
            B.error("Failed to collect details", $$2);
        }
        return $$0;
    }

    public static void a(@Nullable gfj $$0, @Nullable imw $$1, String $$2, @Nullable gfo $$3, m $$4) {
        y $$5 = $$4.f();
        gfj.a($$5, $$0, $$1, $$2, $$3);
    }

    private static String a(double $$0) {
        return String.format(Locale.ROOT, "%.3fs", $$0);
    }

    private void a(n $$0) {
        $$0.a("JVM uptime", () -> gfj.a((double)ManagementFactory.getRuntimeMXBean().getUptime() / 1000.0));
        $$0.a("Wall uptime", () -> gfj.a((double)(System.currentTimeMillis() - this.bu) / 1000.0));
        $$0.a("High-res time", () -> gfj.a((double)bhs.c() / 1000.0));
        $$0.a("Client ticks", () -> String.format(Locale.ROOT, "%d ticks / %.3fs", this.bv, (double)this.bv / 20.0));
    }

    private static y a(y $$0, @Nullable gfj $$1, @Nullable imw $$2, String $$3, @Nullable gfo $$4) {
        $$0.a("Launched Version", () -> $$3);
        String $$5 = gfj.bj();
        if ($$5 != null) {
            $$0.a("Launcher name", $$5);
        }
        $$0.a("Backend library", RenderSystem::getBackendDescription);
        $$0.a("Backend API", RenderSystem::getApiDescription);
        $$0.a("Window size", () -> $$1 != null ? $$0.O.k() + "x" + $$0.O.l() : "<not initialized>");
        $$0.a("GFLW Platform", fyk::a);
        $$0.a("Render Extensions", () -> String.join((CharSequence)", ", RenderSystem.getDevice().getEnabledExtensions()));
        $$0.a("GL debug messages", () -> {
            GpuDevice $$0 = RenderSystem.tryGetDevice();
            if ($$0 == null) {
                return "<no renderer available>";
            }
            if ($$0.isDebuggingEnabled()) {
                return String.join((CharSequence)"\n", $$0.getLastDebugMessages());
            }
            return "<debugging unavailable>";
        });
        $$0.a("Is Modded", () -> gfj.i().b());
        $$0.a("Universe", () -> $$1 != null ? Long.toHexString($$0.H) : "404");
        $$0.a("Type", "Client (map_client.txt)");
        if ($$4 != null) {
            String $$6;
            if ($$1 != null && ($$6 = $$1.ao().j()) != null) {
                $$0.a("GPU Warnings", $$6);
            }
            $$0.a("Transparency", $$4.p().b() != false ? "shader" : "regular");
            $$0.a("Render Distance", $$4.aY() + "/" + String.valueOf($$4.e().b()) + " chunks");
        }
        if ($$1 != null) {
            $$0.a("Resource Packs", () -> bak.a($$1.ai().g()));
        }
        if ($$2 != null) {
            $$0.a("Current Language", () -> $$2.a());
        }
        $$0.a("Locale", String.valueOf(Locale.getDefault()));
        $$0.a("System encoding", () -> System.getProperty("sun.jnu.encoding", "<not set>"));
        $$0.a("File encoding", () -> System.getProperty("file.encoding", "<not set>"));
        $$0.a("CPU", GLX::_getCpuInfo);
        return $$0;
    }

    public static gfj V() {
        return A;
    }

    public CompletableFuture<Void> W() {
        return this.a(this::p).thenCompose($$0 -> $$0);
    }

    public void a(hjk $$0) {
        if (!this.bq.a($$0)) {
            this.bq = hjn.a($$0, this.av);
        }
    }

    public @Nullable hit X() {
        return t.a(this.R(), hig::A);
    }

    public boolean Y() {
        return this.aP;
    }

    public boolean Z() {
        return this.aP && this.aN != null;
    }

    public @Nullable iqa aa() {
        return this.aN;
    }

    public boolean ab() {
        iqa $$0 = this.aa();
        return $$0 != null && !$$0.q();
    }

    public boolean b(UUID $$0) {
        return $$0.equals(this.ac().b());
    }

    public gfx ac() {
        return this.W;
    }

    public GameProfile ad() {
        ProfileResult $$0 = this.J.join();
        if ($$0 != null) {
            return $$0.profile();
        }
        return new GameProfile(this.W.b(), this.W.c());
    }

    public Proxy ae() {
        return this.ab;
    }

    public ilr af() {
        return this.K;
    }

    public hph ag() {
        return this.L;
    }

    public baz ah() {
        return this.ah;
    }

    public bak ai() {
        return this.ak;
    }

    public azp aj() {
        return this.ai;
    }

    public iom ak() {
        return this.aj;
    }

    public Path al() {
        return this.I;
    }

    public imw am() {
        return this.al;
    }

    public boolean an() {
        return this.aS;
    }

    public hod ao() {
        return this.at;
    }

    public iqr ap() {
        return this.ap;
    }

    public @Nullable bcx aq() {
        bcx $$0 = t.a(this.x, gsb::E);
        if ($$0 != null) {
            return $$0;
        }
        ger $$1 = this.i.p();
        if (this.s != null && $$1 != null) {
            dwo $$2 = this.s.ao();
            if ($$2.aq() == dwo.j && this.j.k().b()) {
                return bcy.d;
            }
            cdy $$3 = $$1.k().a(ceg.v, 1.0f);
            boolean $$4 = this.s.gL().d && this.s.gL().c;
            boolean $$5 = this.s.bC();
            return $$3.a($$4, $$5).orElse(null);
        }
        return bcy.a;
    }

    public float ar() {
        if (this.x != null && this.x.E() != null) {
            return 1.0f;
        }
        ger $$0 = this.i.p();
        if ($$0 != null) {
            return $$0.k().a(ceg.w, 1.0f).floatValue();
        }
        return 1.0f;
    }

    public ano as() {
        return this.aL;
    }

    public imo at() {
        return this.ax;
    }

    public @Nullable cgk au() {
        return this.aQ;
    }

    public void a(@Nullable cgk $$0) {
        this.aQ = $$0;
        this.i.a($$0);
    }

    public boolean b(cgk $$0) {
        return $$0.cF() || this.s != null && this.s.au() && this.k.U.f() && $$0.ay() == cgu.cb;
    }

    @Override
    protected Thread aw() {
        return this.aY;
    }

    @Override
    public Runnable f(Runnable $$0) {
        return $$0;
    }

    @Override
    protected boolean e(Runnable $$0) {
        return true;
    }

    public hpw ax() {
        return this.aA;
    }

    public hwo ay() {
        return this.R;
    }

    public hrh az() {
        return this.aG;
    }

    public hxp aA() {
        return this.T;
    }

    public hok aB() {
        return this.U;
    }

    public DataFixer aC() {
        return this.M;
    }

    public gez aD() {
        return this.P;
    }

    public ggr aE() {
        return this.am;
    }

    public boolean aF() {
        return this.s != null && this.s.hb() || this.k.aj().b() != false;
    }

    public gnc aG() {
        return this.aD;
    }

    public iru aH() {
        return this.aE;
    }

    public boolean aI() {
        return this.be;
    }

    public gfe aJ() {
        return this.X;
    }

    public iob aK() {
        return this.az;
    }

    public inl aL() {
        return this.ay;
    }

    public imn aM() {
        return this.aB;
    }

    public imr aN() {
        return this.aC;
    }

    @Override
    public void a(boolean $$0) {
        this.be = $$0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public yh a(File $$02) {
        int $$12 = 4;
        int $$2 = 4096;
        int $$3 = 4096;
        int $$4 = this.O.k();
        int $$5 = this.O.l();
        fxt $$6 = this.l();
        float $$7 = this.s.ee();
        float $$8 = this.s.ec();
        float $$9 = this.s.ac;
        float $$10 = this.s.ab;
        this.i.a(false);
        try {
            this.i.a(new hos((Vector3fc)new Vector3f(this.i.p().n())));
            this.O.b(4096);
            this.O.c(4096);
            $$6.a(4096, 4096);
            for (int $$11 = 0; $$11 < 6; ++$$11) {
                switch ($$11) {
                    case 0: {
                        this.s.v($$8);
                        this.s.w(0.0f);
                        break;
                    }
                    case 1: {
                        this.s.v(($$8 + 90.0f) % 360.0f);
                        this.s.w(0.0f);
                        break;
                    }
                    case 2: {
                        this.s.v(($$8 + 180.0f) % 360.0f);
                        this.s.w(0.0f);
                        break;
                    }
                    case 3: {
                        this.s.v(($$8 - 90.0f) % 360.0f);
                        this.s.w(0.0f);
                        break;
                    }
                    case 4: {
                        this.s.v($$8);
                        this.s.w(-90.0f);
                        break;
                    }
                    default: {
                        this.s.v($$8);
                        this.s.w(90.0f);
                    }
                }
                this.s.ab = this.s.ec();
                this.s.ac = this.s.ee();
                this.i.a(gez.b);
                this.i.b(gez.b);
                try {
                    Thread.sleep(10L);
                }
                catch (InterruptedException interruptedException) {
                    // empty catch block
                }
                gfs.a($$02, "panorama_" + $$11 + ".png", $$6, 4, (yh $$0) -> {});
            }
            yw $$122 = yh.b($$02.getName()).a(l.t).a($$1 -> $$1.a(new yf.e($$02.getAbsoluteFile())));
            yw yw2 = yh.a("screenshot.success", $$122);
            return yw2;
        }
        catch (Exception $$13) {
            B.error("Couldn't save image", (Throwable)$$13);
            yw yw3 = yh.a("screenshot.failure", new Object[]{$$13.getMessage()});
            return yw3;
        }
        finally {
            this.s.w($$7);
            this.s.v($$8);
            this.s.ac = $$9;
            this.s.ab = $$10;
            this.i.a(true);
            this.O.b($$4);
            this.O.c($$5);
            $$6.a($$4, $$5);
            this.i.a((hos)null);
        }
    }

    public imp aO() {
        return this.as;
    }

    public @Nullable grw aP() {
        return this.aW;
    }

    public gxo aQ() {
        return this.aF;
    }

    public fyk aR() {
        return this.O;
    }

    public fya aS() {
        return this.bd;
    }

    public gjm aT() {
        return this.j.l();
    }

    public hoz aU() {
        return this.Q;
    }

    public void a(int $$0) {
        this.ay.a($$0);
    }

    public hdc aV() {
        return this.az.d().get();
    }

    public boolean aW() {
        return this.bA().flag(UserApiService.UserFlag.PROFANITY_FILTER_ENABLED);
    }

    public void aX() {
        this.aF.a();
        this.A().a();
    }

    public gfg aY() {
        return this.Y;
    }

    public void a(gfg $$0) {
        this.Y = $$0;
    }

    public gfa aZ() {
        return this.bo;
    }

    public hiy ba() {
        return this.bp;
    }

    public hjn bb() {
        return this.bq;
    }

    public gch bc() {
        return this.aJ;
    }

    public hnq bd() {
        return this.aK;
    }

    public gew be() {
        return this.br;
    }

    public ftc bf() {
        return this.bs;
    }

    public hou bg() {
        return this.aM;
    }

    private float a(float $$0) {
        cdo $$1;
        if (this.r != null && ($$1 = this.r.y()).i()) {
            return Math.max($$0, $$1.g());
        }
        return $$0;
    }

    public ihk bh() {
        return this.S;
    }

    public boolean bi() {
        return (this.x == null || this.x.aM_()) && !this.aX;
    }

    public static @Nullable String bj() {
        return System.getProperty("minecraft.launcher.brand");
    }

    public xl bk() {
        return this.bw;
    }

    public um.a bl() {
        return um.a(this.bx);
    }

    public Collection<uq.a> bm() {
        return this.by;
    }

    static {
        B = LogUtils.getLogger();
        a = amo.b("default");
        b = amo.b("uniform");
        c = amo.b("alt");
        D = amo.b("regional_compliancies.json");
        E = CompletableFuture.completedFuture(bhr.a);
        F = yh.c("multiplayer.socialInteractions.not_available");
        G = yh.c("menu.savingLevel");
    }

    static final class b
    extends Record {
        private final fzz a;
        final gzf.c b;

        b(fzz $$0, gzf.c $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "realmsClient;quickPlayData", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "realmsClient;quickPlayData", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "realmsClient;quickPlayData", "a", "b"}, this, $$0);
        }

        public fzz a() {
            return this.a;
        }

        public gzf.c b() {
            return this.b;
        }
    }

    public static abstract sealed class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(yg.a){

            @Override
            public boolean a(boolean $$0) {
                return true;
            }
        };
        public static final /* enum */ a b = new a(yh.c("chat.disabled.options").a(l.m)){

            @Override
            public boolean a(boolean $$0) {
                return false;
            }
        };
        public static final /* enum */ a c = new a(yh.c("chat.disabled.launcher").a(l.m)){

            @Override
            public boolean a(boolean $$0) {
                return $$0;
            }
        };
        public static final /* enum */ a d = new a(yh.a("chat.disabled.profile", yh.d(gfj.A.k.F.k())).a(l.m)){

            @Override
            public boolean a(boolean $$0) {
                return $$0;
            }
        };
        static final yh e;
        private final yh f;
        private static final /* synthetic */ a[] g;

        public static a[] values() {
            return (a[])g.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        a(yh $$0) {
            this.f = $$0;
        }

        public yh a() {
            return this.f;
        }

        public abstract boolean a(boolean var1);

        private static /* synthetic */ a[] b() {
            return new a[]{a, b, c, d};
        }

        static {
            g = gfj$a.b();
            e = yh.c("chat.disabled.profile.moreInfo");
        }
    }
}

