/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.Lists
 *  com.google.common.net.HostAndPort
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  io.netty.handler.ssl.SslContext
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.net.HostAndPort;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import io.netty.handler.ssl.SslContext;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.stream.Stream;
import net.minecraft.server.MinecraftServer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class ary
extends MinecraftServer
implements ank {
    static final Logger m = LogUtils.getLogger();
    private static final int n = 5000;
    private static final int o = 2;
    private final List<amx> p = Collections.synchronizedList(Lists.newArrayList());
    private @Nullable bcr q;
    private final bco r;
    private @Nullable bct s;
    private final asa t;
    private @Nullable atn u;
    private final @Nullable ayn v;
    private @Nullable bxp w;
    private boolean x;
    private final anl y;
    private final Map<String, String> z;
    private @Nullable aty A;
    private long B;

    public ary(Thread $$0, fni.c $$1, bak $$2, ans $$3, asa $$4, DataFixer $$5, ano $$6) {
        super($$0, $$1, $$2, $$3, Proxy.NO_PROXY, $$5, $$6, axs.a());
        this.t = $$4;
        this.r = new bco(this);
        this.v = ayn.a($$4.a());
        this.y = ary.a($$4);
        this.z = $$4.a().i ? ary.bQ() : Map.of();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static Map<String, String> bQ() {
        Path $$0 = Path.of("codeofconduct", new String[0]);
        if (!Files.isDirectory($$0, LinkOption.NOFOLLOW_LINKS)) {
            throw new IllegalArgumentException("Code of Conduct folder does not exist: " + String.valueOf($$0));
        }
        try {
            ImmutableMap.Builder $$1 = ImmutableMap.builder();
            try (Stream<Path> $$2 = Files.list($$0);){
                for (Path $$3 : $$2.toList()) {
                    String $$4 = $$3.getFileName().toString();
                    if (!$$4.endsWith(".txt")) continue;
                    String $$5 = $$4.substring(0, $$4.length() - 4).toLowerCase(Locale.ROOT);
                    if (!$$3.toRealPath(new LinkOption[0]).getParent().equals($$0.toAbsolutePath())) {
                        throw new IllegalArgumentException("Failed to read Code of Conduct file \"" + $$4 + "\" because it links to a file outside the allowed directory");
                    }
                    try {
                        String $$6 = String.join((CharSequence)"\n", Files.readAllLines($$3, StandardCharsets.UTF_8));
                        $$1.put((Object)$$5, (Object)bhi.a($$6));
                    }
                    catch (IOException $$7) {
                        throw new IllegalArgumentException("Failed to read Code of Conduct file " + $$4, $$7);
                        return $$1.build();
                    }
                }
            }
        }
        catch (IOException $$8) {
            throw new IllegalArgumentException("Failed to read Code of Conduct folder", $$8);
        }
    }

    private SslContext bR() {
        try {
            return avy.a(this.a().v, this.a().w);
        }
        catch (Exception $$0) {
            avy.a();
            throw new IllegalStateException("Failed to configure TLS for the server management protocol", $$0);
        }
    }

    @Override
    public boolean e() throws IOException {
        int $$0 = this.a().s;
        if (this.a().q) {
            String $$1 = this.t.a().t;
            if (!avz.a($$1)) {
                throw new IllegalStateException("Invalid management server secret, must be 40 alphanumeric characters");
            }
            String $$2 = this.a().r;
            HostAndPort $$3 = HostAndPort.fromParts((String)$$2, (int)$$0);
            avz $$4 = new avz($$1);
            String $$5 = this.a().x;
            avx $$6 = new avx($$4, $$5);
            m.info("Starting json RPC server on {}", (Object)$$3);
            this.A = new aty($$3, $$6);
            auo $$7 = auo.a(this);
            $$7.h().a(new atx($$7, this.A));
            if (this.a().u) {
                SslContext $$8 = this.bR();
                this.A.a($$7, $$8);
            } else {
                this.A.a($$7);
            }
        }
        Thread $$9 = new Thread("Server console handler"){

            @Override
            public void run() {
                BufferedReader $$0 = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
                try {
                    String $$1;
                    while (!ary.this.ai() && ary.this.z() && ($$1 = $$0.readLine()) != null) {
                        ary.this.a($$1, ary.this.aG());
                    }
                }
                catch (IOException $$2) {
                    m.error("Exception handling console input", (Throwable)$$2);
                }
            }
        };
        $$9.setDaemon(true);
        $$9.setUncaughtExceptionHandler(new p(m));
        $$9.start();
        m.info("Starting minecraft server version {}", (Object)w.b().c());
        if (Runtime.getRuntime().maxMemory() / 1024L / 1024L < 512L) {
            m.warn("To start the server with more ram, launch it as \"java -Xmx1024M -Xms1024M -jar minecraft_server.jar\"");
        }
        m.info("Loading properties");
        arz $$10 = this.t.a();
        if (this.X()) {
            this.a_("127.0.0.1");
        } else {
            this.e($$10.d);
            this.f($$10.e);
            this.a_($$10.f);
        }
        this.k.a($$10.n.get());
        m.info("Default game type: {}", (Object)$$10.n.get());
        InetAddress $$11 = null;
        if (!this.y().isEmpty()) {
            $$11 = InetAddress.getByName(this.y());
        }
        if (this.V() < 0) {
            this.b($$10.p);
        }
        this.Y();
        m.info("Starting Minecraft server on {}:{}", (Object)(this.y().isEmpty() ? "*" : this.y()), (Object)this.V());
        try {
            this.ak().a($$11, this.V());
        }
        catch (IOException $$12) {
            m.warn("**** FAILED TO BIND TO PORT!");
            m.warn("The exception was: {}", (Object)$$12.toString());
            m.warn("Perhaps a server is already running on that port?");
            return false;
        }
        if (!this.ae()) {
            m.warn("**** SERVER IS RUNNING IN OFFLINE/INSECURE MODE!");
            m.warn("The server will make no attempt to authenticate usernames. Beware.");
            m.warn("While this makes the game possible to play without internet access, it also opens up the ability for hackers to connect with any username they choose.");
            m.warn("To change this, set \"online-mode\" to \"true\" in the server.properties file.");
        }
        if (this.bE()) {
            this.j.f().a();
        }
        if (!bby.e(this)) {
            return false;
        }
        this.a(new arx(this, this.bd(), this.h));
        this.w = new bxp(bxs.values().length, this.bw(), bxo.a);
        long $$13 = bhs.d();
        this.j.f().a(!this.ae());
        m.info("Preparing level \"{}\"", (Object)this.j());
        this.u_();
        long $$14 = bhs.d() - $$13;
        String $$15 = String.format(Locale.ROOT, "%.3fs", (double)$$14 / 1.0E9);
        m.info("Done ({})! For help, type \"help\"", (Object)$$15);
        if ($$10.y != null) {
            this.k.n().a(eua.S, $$10.y, (MinecraftServer)this);
        }
        if ($$10.z) {
            m.info("Starting GS4 status listener");
            this.q = bcr.a(this);
        }
        if ($$10.B) {
            m.info("Starting remote control listener");
            this.s = bct.a(this);
        }
        if (this.bF() > 0L) {
            Thread $$16 = new Thread(new asb(this));
            $$16.setUncaughtExceptionHandler(new q(m));
            $$16.setName("Server Watchdog");
            $$16.setDaemon(true);
            $$16.start();
        }
        if ($$10.V) {
            bxy.a(this);
            m.info("JMX monitoring enabled");
        }
        this.C().a();
        return true;
    }

    @Override
    public boolean aO() {
        return this.t.a().l.get();
    }

    @Override
    public void g(boolean $$0) {
        this.t.a($$1 -> (arz)$$1.l.a(this.bc(), $$0));
    }

    @Override
    public boolean aP() {
        return this.t.a().af.get();
    }

    @Override
    public void h(boolean $$0) {
        this.t.a($$1 -> (arz)$$1.af.a(this.bc(), $$0));
    }

    @Override
    public void a(BooleanSupplier $$0) {
        long $$3;
        super.a($$0);
        if (this.A != null) {
            this.A.a();
        }
        long $$1 = bhs.c();
        int $$2 = this.bD();
        if ($$2 > 0 && $$1 - this.B >= ($$3 = (long)$$2 * bhn.c)) {
            this.B = $$1;
            this.C().f();
        }
    }

    @Override
    public boolean a(boolean $$0, boolean $$1, boolean $$2) {
        this.C().c();
        boolean $$3 = super.a($$0, $$1, $$2);
        this.C().d();
        return $$3;
    }

    @Override
    public boolean ag() {
        return this.t.a().g.get();
    }

    public void j(boolean $$0) {
        this.t.a($$1 -> (arz)$$1.g.a(this.bc(), $$0));
    }

    @Override
    public arz a() {
        return this.t.a();
    }

    public void a(ccz $$0) {
        this.t.a($$1 -> (arz)$$1.m.a(this.bc(), $$0));
        this.t();
    }

    @Override
    public void t() {
        this.a(this.a().m.get(), true);
    }

    public int bx() {
        return this.t.a().M.get();
    }

    public void e(int $$0) {
        this.t.a($$1 -> (arz)$$1.M.a(this.bc(), $$0));
        this.bA().a($$0);
    }

    public int by() {
        return this.t.a().N.get();
    }

    public void f(int $$0) {
        this.t.a($$1 -> (arz)$$1.N.a(this.bc(), $$0));
        this.bA().b($$0);
    }

    @Override
    public y a(y $$0) {
        $$0.a("Is Modded", () -> this.T().b());
        $$0.a("Type", () -> "Dedicated Server (map_server.txt)");
        return $$0;
    }

    @Override
    public void a(Path $$0) throws IOException {
        arz $$1 = this.a();
        try (BufferedWriter $$2 = Files.newBufferedWriter($$0, new OpenOption[0]);){
            $$2.write(String.format(Locale.ROOT, "sync-chunk-writes=%s%n", $$1.T));
            $$2.write(String.format(Locale.ROOT, "gamemode=%s%n", $$1.n.get()));
            $$2.write(String.format(Locale.ROOT, "entity-broadcast-range-percentage=%d%n", $$1.Y.get()));
            $$2.write(String.format(Locale.ROOT, "max-world-size=%d%n", $$1.S));
            $$2.write(String.format(Locale.ROOT, "view-distance=%d%n", $$1.M.get()));
            $$2.write(String.format(Locale.ROOT, "simulation-distance=%d%n", $$1.N.get()));
            $$2.write(String.format(Locale.ROOT, "generate-structures=%s%n", $$1.aj.d()));
            $$2.write(String.format(Locale.ROOT, "use-native=%s%n", $$1.F));
            $$2.write(String.format(Locale.ROOT, "rate-limit=%d%n", $$1.L));
        }
    }

    @Override
    public void i() {
        if (this.v != null) {
            this.v.close();
        }
        if (this.u != null) {
            this.u.b();
        }
        if (this.s != null) {
            this.s.b();
        }
        if (this.q != null) {
            this.q.b();
        }
        if (this.A != null) {
            try {
                this.A.a(true);
            }
            catch (InterruptedException $$0) {
                m.error("Interrupted while stopping the management server", (Throwable)$$0);
            }
        }
    }

    @Override
    public void K() {
        super.K();
        this.bz();
    }

    public void a(String $$0, ed $$1) {
        this.p.add(new amx($$0, $$1));
    }

    public void bz() {
        while (!this.p.isEmpty()) {
            amx $$0 = this.p.remove(0);
            this.aF().a($$0.b, $$0.a);
        }
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public int o() {
        return this.a().L;
    }

    @Override
    public boolean p() {
        return this.a().F;
    }

    public arx bA() {
        return (arx)super.aj();
    }

    @Override
    public int r() {
        return this.t.a().O.get();
    }

    public void g(int $$0) {
        this.t.a($$1 -> (arz)$$1.O.a(this.bc(), $$0));
    }

    @Override
    public boolean q() {
        return true;
    }

    @Override
    public String b() {
        return this.y();
    }

    @Override
    public int d() {
        return this.V();
    }

    @Override
    public String h() {
        return this.ah();
    }

    public void bB() {
        if (this.u == null) {
            this.u = atn.a(this);
        }
    }

    public int bC() {
        return this.a().G.get();
    }

    public void h(int $$0) {
        this.t.a($$1 -> (arz)$$1.G.a(this.bc(), $$0));
    }

    @Override
    public boolean a(axf $$0, is $$1, ddm $$2) {
        int $$6;
        fne.a $$3 = $$0.C();
        if ($$0.aq() != $$3.a()) {
            return false;
        }
        if (this.bA().k().d()) {
            return false;
        }
        if (this.bA().f($$2.gJ())) {
            return false;
        }
        if (this.bC() <= 0) {
            return false;
        }
        is $$4 = $$3.b();
        int $$5 = bgj.a($$1.u() - $$4.u());
        int $$7 = Math.max($$5, $$6 = bgj.a($$1.w() - $$4.w()));
        return $$7 <= this.bC();
    }

    @Override
    public boolean an() {
        return this.a().W.get();
    }

    public void k(boolean $$0) {
        this.t.a($$1 -> (arz)$$1.W.a(this.bc(), $$0));
    }

    @Override
    public boolean ao() {
        return this.a().X.get();
    }

    public void l(boolean $$0) {
        this.t.a($$1 -> (arz)$$1.X.a(this.bc(), $$0));
    }

    @Override
    public bbh k() {
        return this.a().H.get();
    }

    public void a(bbh $$0) {
        this.t.a($$1 -> (arz)$$1.H.a(this.bc(), $$0));
    }

    @Override
    public bbn l() {
        return this.a().I;
    }

    @Override
    public int aq() {
        return this.t.a().ad.get();
    }

    @Override
    public void d(int $$0) {
        this.t.a($$1 -> (arz)$$1.ad.a(this.bc(), $$0));
    }

    public int bD() {
        return this.t.a().ae.get();
    }

    public void i(int $$0) {
        this.t.a($$1 -> (arz)$$1.ae.a(this.bc(), $$0));
    }

    @Override
    public String ah() {
        return this.t.a().h.get();
    }

    @Override
    public void d(String $$0) {
        this.t.a($$1 -> (arz)$$1.h.a(this.bc(), $$0));
    }

    @Override
    public boolean m() {
        return this.a().Q;
    }

    @Override
    public boolean c() {
        return this.a().R;
    }

    @Override
    public int au() {
        return this.a().S;
    }

    @Override
    public int ax() {
        return this.a().P;
    }

    @Override
    public boolean ay() {
        arz $$0 = this.a();
        return $$0.ag && $$0.d && this.j.b();
    }

    @Override
    public boolean bn() {
        return this.a().ah;
    }

    protected boolean bE() {
        int $$1;
        boolean $$0 = false;
        for ($$1 = 0; !$$0 && $$1 <= 2; ++$$1) {
            if ($$1 > 0) {
                m.warn("Encountered a problem while converting the user banlist, retrying in a few seconds");
                this.bS();
            }
            $$0 = bby.a((MinecraftServer)this);
        }
        boolean $$2 = false;
        for ($$1 = 0; !$$2 && $$1 <= 2; ++$$1) {
            if ($$1 > 0) {
                m.warn("Encountered a problem while converting the ip banlist, retrying in a few seconds");
                this.bS();
            }
            $$2 = bby.b(this);
        }
        boolean $$3 = false;
        for ($$1 = 0; !$$3 && $$1 <= 2; ++$$1) {
            if ($$1 > 0) {
                m.warn("Encountered a problem while converting the op list, retrying in a few seconds");
                this.bS();
            }
            $$3 = bby.c(this);
        }
        boolean $$4 = false;
        for ($$1 = 0; !$$4 && $$1 <= 2; ++$$1) {
            if ($$1 > 0) {
                m.warn("Encountered a problem while converting the whitelist, retrying in a few seconds");
                this.bS();
            }
            $$4 = bby.d(this);
        }
        boolean $$5 = false;
        for ($$1 = 0; !$$5 && $$1 <= 2; ++$$1) {
            if ($$1 > 0) {
                m.warn("Encountered a problem while converting the player save files, retrying in a few seconds");
                this.bS();
            }
            $$5 = bby.a(this);
        }
        return $$0 || $$2 || $$3 || $$4 || $$5;
    }

    private void bS() {
        try {
            Thread.sleep(5000L);
        }
        catch (InterruptedException $$0) {
            return;
        }
    }

    public long bF() {
        return this.a().J;
    }

    @Override
    public int bl() {
        return this.a().K;
    }

    @Override
    public String s() {
        return "";
    }

    @Override
    public String a(String $$0) {
        this.r.e();
        this.h(() -> this.aF().a(this.r.g(), $$0));
        return this.r.f();
    }

    @Override
    public void x() {
        this.C().b();
        super.x();
        bhs.k();
    }

    @Override
    public boolean a(bbx $$0) {
        return false;
    }

    @Override
    public int c(int $$0) {
        return this.bG() * $$0 / 100;
    }

    public int bG() {
        return this.a().Y.get();
    }

    public void j(int $$0) {
        this.t.a($$1 -> (arz)$$1.Y.a(this.bc(), $$0));
    }

    @Override
    public String j() {
        return this.g.f();
    }

    @Override
    public boolean aZ() {
        return this.t.a().T;
    }

    @Override
    public ayo a(axg $$0) {
        if (this.v != null) {
            return this.v.a($$0.gI());
        }
        return ayo.e;
    }

    @Override
    public @Nullable dwl bf() {
        return this.bH() ? this.k.j() : null;
    }

    public boolean bH() {
        return this.t.a().k.get();
    }

    public void m(boolean $$0) {
        this.t.a($$1 -> (arz)$$1.k.a(this.bc(), $$0));
        this.b(this.bf());
    }

    public dwl bI() {
        return this.a().n.get();
    }

    public void c(dwl $$0) {
        this.t.a($$1 -> (arz)$$1.n.a(this.bc(), $$0));
        this.k.a(this.bI());
        this.b(this.bf());
    }

    @Override
    public Optional<MinecraftServer.b> ac() {
        return this.t.a().ab;
    }

    @Override
    public void aU() {
        super.aU();
        this.x = this.bw().a(bxf.a);
    }

    @Override
    public bxq f() {
        return this.w;
    }

    @Override
    public boolean g() {
        return this.x;
    }

    @Override
    public boolean bq() {
        return this.t.a().ak.get();
    }

    public void n(boolean $$0) {
        this.t.a($$1 -> (arz)$$1.ak.a(this.bc(), $$0));
    }

    @Override
    public anl bt() {
        return this.y;
    }

    @Override
    public int bu() {
        return this.t.a().ai.get();
    }

    public void k(int $$0) {
        this.t.a($$1 -> (arz)$$1.ai.a(this.bc(), $$0));
    }

    private static anl a(asa $$02) {
        Optional<URI> $$1 = ary.a($$02.a());
        return $$1.map($$0 -> new anl(List.of(anl.b.a.a((URI)$$0)))).orElse(anl.a);
    }

    private static Optional<URI> a(arz $$0) {
        String $$1 = $$0.j;
        if ($$1.isEmpty()) {
            return Optional.empty();
        }
        try {
            return Optional.of(bhs.a($$1));
        }
        catch (Exception $$2) {
            m.warn("Failed to parse bug link {}", (Object)$$1, (Object)$$2);
            return Optional.empty();
        }
    }

    @Override
    public Map<String, String> ab() {
        return this.z;
    }

    @Override
    public /* synthetic */ bbz aj() {
        return this.bA();
    }
}

