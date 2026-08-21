/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.authlib.GameProfile
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.net.SocketAddress;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.Predicate;
import net.minecraft.server.MinecraftServer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public abstract class bbz {
    public static final File a = new File("banned-players.json");
    public static final File b = new File("banned-ips.json");
    public static final File c = new File("ops.json");
    public static final File d = new File("whitelist.json");
    public static final yh e = yh.c("chat.filtered_full");
    public static final yh f = yh.c("multiplayer.disconnect.duplicate_login");
    private static final Logger g = LogUtils.getLogger();
    private static final int h = 600;
    private static final SimpleDateFormat i = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z", Locale.ROOT);
    private final MinecraftServer j;
    private final List<axg> k = Lists.newArrayList();
    private final Map<UUID, axg> l = Maps.newHashMap();
    private final bcg m;
    private final bbv n;
    private final bcb o;
    private final bcj p;
    private final Map<UUID, bdg> q = Maps.newHashMap();
    private final Map<UUID, anb> r = Maps.newHashMap();
    private final fnl s;
    private final jk<anc> t;
    private int u;
    private int v;
    private boolean w;
    private int x;

    public bbz(MinecraftServer $$0, jk<anc> $$1, fnl $$2, ayy $$3) {
        this.j = $$0;
        this.t = $$1;
        this.s = $$2;
        this.p = new bcj(d, $$3);
        this.o = new bcb(c, $$3);
        this.m = new bcg(a, $$3);
        this.n = new bbv(b, $$3);
    }

    public void a(wu $$0, axg $$1, axu $$2) {
        yw $$17;
        bbx $$3 = $$1.gJ();
        bci $$4 = this.j.ar().f();
        Optional<bbx> $$5 = $$4.a($$3.a());
        String $$6 = $$5.map(bbx::b).orElse($$3.b());
        $$4.a($$3);
        axf $$7 = $$1.A();
        String $$8 = $$0.a(this.j.bn());
        g.info("{}[{}] logged in with entity id {} at ({}, {}, {})", new Object[]{$$1.aq(), $$8, $$1.aA(), $$1.dP(), $$1.dR(), $$1.dV()});
        fne $$9 = $$7.D_();
        ayi $$10 = new ayi(this.j, $$0, $$1, $$2);
        $$0.a(aia.b.a(xq.a(this.j.bc()), $$10), $$10);
        $$10.f();
        eua $$11 = $$7.U();
        boolean $$12 = $$11.a(eua.r);
        boolean $$13 = $$11.a(eua.P);
        boolean $$14 = $$11.a(eua.u);
        $$10.b(new aew($$1.aA(), $$9.k(), this.j.O(), this.n(), this.p(), this.q(), $$13, !$$12, $$14, $$1.b($$7), this.j.ay()));
        $$10.b(new adn($$9.p(), $$9.q()));
        $$10.b(new afh($$1.gL()));
        $$10.b(new agv($$1.gK().g()));
        dqz $$15 = this.j.aJ();
        $$10.b(new ahw($$15.b(), $$15.c()));
        this.d($$1);
        $$1.K().c();
        $$1.L().a($$1);
        this.a($$7.i(), $$1);
        this.j.at();
        if ($$1.gI().name().equalsIgnoreCase($$6)) {
            yw $$16 = yh.a("multiplayer.player.joined", $$1.R_());
        } else {
            $$17 = yh.a("multiplayer.player.joined.renamed", $$1.R_(), $$6);
        }
        this.a($$17.a(l.o), false);
        $$10.a($$1.dP(), $$1.dR(), $$1.dV(), $$1.ec(), $$1.ee());
        alq $$18 = this.j.as();
        if ($$18 != null && !$$2.d()) {
            $$1.a($$18);
        }
        $$1.g.b(afn.a(this.k));
        this.k.add($$1);
        this.l.put($$1.cY(), $$1);
        this.a(afn.a(List.of($$1)));
        this.a($$1, $$7);
        $$7.a($$1);
        this.j.aN().a($$1);
        this.c($$1);
        $$1.c();
        this.j.C().a($$1);
        $$10.g();
    }

    protected void a(anm $$0, axg $$1) {
        HashSet $$2 = Sets.newHashSet();
        for (fum $$3 : $$0.f()) {
            $$1.g.b(agz.a($$3, true));
        }
        for (fui $$4 : fui.values()) {
            fuj $$5 = $$0.a($$4);
            if ($$5 == null || $$2.contains($$5)) continue;
            List<aay<?>> $$6 = $$0.d($$5);
            for (aay<?> $$7 : $$6) {
                $$1.g.b($$7);
            }
            $$2.add($$5);
        }
    }

    public void a(final axf $$0) {
        $$0.w().a(new epy(){

            @Override
            public void a(eqa $$02, double $$1) {
                bbz.this.a(new agg($$02), $$0.aq());
            }

            @Override
            public void a(eqa $$02, double $$1, double $$2, long $$3, long $$4) {
                bbz.this.a(new agf($$02), $$0.aq());
            }

            @Override
            public void a(eqa $$02, double $$1, double $$2) {
                bbz.this.a(new age($$02), $$0.aq());
            }

            @Override
            public void a(eqa $$02, int $$1) {
                bbz.this.a(new agh($$02), $$0.aq());
            }

            @Override
            public void b(eqa $$02, int $$1) {
                bbz.this.a(new agi($$02), $$0.aq());
            }

            @Override
            public void b(eqa $$02, double $$1) {
            }

            @Override
            public void c(eqa $$02, double $$1) {
            }
        });
    }

    public Optional<uz> c(bbx $$0) {
        uz $$1 = this.j.bb().v();
        if (this.j.a($$0) && $$1 != null) {
            g.debug("loading single player");
            return Optional.of($$1);
        }
        return this.s.a($$0);
    }

    protected void a(axg $$0) {
        anb $$2;
        this.s.a($$0);
        bdg $$1 = this.q.get($$0.cY());
        if ($$1 != null) {
            $$1.a();
        }
        if (($$2 = this.r.get($$0.cY())) != null) {
            $$2.b();
        }
    }

    public void b(axg $$02) {
        Object $$2;
        axf $$1 = $$02.A();
        $$02.a(bdk.j);
        this.a($$02);
        if ($$02.cq() && ((cgk)($$2 = $$02.du())).dt()) {
            g.debug("Removing player mount");
            $$02.cf();
            ((cgk)$$2).dq().forEach($$0 -> $$0.c(cgk.e.d));
        }
        $$02.aw();
        for (dfc $$3 : $$02.ak()) {
            $$3.c(cgk.e.d);
        }
        $$1.a($$02, cgk.e.d);
        $$02.U().a();
        this.k.remove($$02);
        this.j.aN().b($$02);
        UUID $$4 = $$02.cY();
        axg $$5 = this.l.get($$4);
        if ($$5 == $$02) {
            this.l.remove($$4);
            this.q.remove($$4);
            this.r.remove($$4);
            this.j.C().b($$02);
        }
        this.a(new afm(List.of($$02.cY())));
    }

    public @Nullable yh a(SocketAddress $$0, bbx $$1) {
        if (this.m.a($$1)) {
            bch $$2 = (bch)this.m.c($$1);
            yw $$3 = yh.a("multiplayer.disconnect.banned.reason", $$2.e());
            if ($$2.c() != null) {
                $$3.b(yh.a("multiplayer.disconnect.banned.expiration", new Object[]{i.format($$2.c())}));
            }
            return $$3;
        }
        if (!this.a($$1)) {
            return yh.c("multiplayer.disconnect.not_whitelisted");
        }
        if (this.n.a($$0)) {
            bbw $$4 = this.n.b($$0);
            yw $$5 = yh.a("multiplayer.disconnect.banned_ip.reason", $$4.e());
            if ($$4.c() != null) {
                $$5.b(yh.a("multiplayer.disconnect.banned_ip.expiration", new Object[]{i.format($$4.c())}));
            }
            return $$5;
        }
        if (this.k.size() >= this.n() && !this.b($$1)) {
            return yh.c("multiplayer.disconnect.server_full");
        }
        return null;
    }

    public boolean a(UUID $$0) {
        Set $$1 = Sets.newIdentityHashSet();
        for (axg $$2 : this.k) {
            if (!$$2.cY().equals($$0)) continue;
            $$1.add($$2);
        }
        axg $$3 = this.l.get($$0);
        if ($$3 != null) {
            $$1.add($$3);
        }
        for (axg $$4 : $$1) {
            $$4.g.a(f);
        }
        return !$$1.isEmpty();
    }

    public axg a(axg $$0, boolean $$1, cgk.e $$2) {
        is $$14;
        eoh $$15;
        fne.a $$12;
        axf $$13;
        fmb $$3 = $$0.a(!$$1, fmb.a);
        this.k.remove($$0);
        $$0.A().a($$0, $$2);
        axf $$4 = $$3.b();
        axg $$5 = new axg(this.j, $$4, $$0.gI(), $$0.E());
        $$5.g = $$0.g;
        $$5.a($$0, $$1);
        $$5.e($$0.aA());
        $$5.a($$0.at());
        if (!$$3.g()) {
            $$5.b($$0);
        }
        for (String $$6 : $$0.aB()) {
            $$5.a($$6);
        }
        ftm $$7 = $$3.c();
        $$5.b($$7.g, $$7.h, $$7.i, $$3.e(), $$3.f());
        if ($$3.g()) {
            $$5.g.b(new aem(aem.b, 0.0f));
        }
        byte $$8 = $$1 ? (byte)1 : 0;
        axf $$9 = $$5.A();
        fne $$10 = $$9.D_();
        $$5.g.b(new afy($$5.b($$9), $$8));
        $$5.g.a($$5.dP(), $$5.dR(), $$5.dV(), $$5.ec(), $$5.ee());
        $$5.g.b(new agn($$4.C()));
        $$5.g.b(new adn($$10.p(), $$10.q()));
        $$5.g.b(new agt($$5.cu, $$5.ct, $$5.cs));
        this.c($$5);
        this.a($$5, $$4);
        this.d($$5);
        $$4.b($$5);
        this.k.add($$5);
        this.l.put($$5.cY(), $$5);
        $$5.c();
        $$5.x($$5.eZ());
        axg.a $$11 = $$5.V();
        if (!$$1 && $$11 != null && ($$13 = this.j.a(($$12 = $$11.a()).a())) != null && ($$15 = $$13.a_($$14 = $$12.b())).a(dzs.ql)) {
            $$5.g.b(new ahh(bda.ys, bdb.e, $$14.u(), $$14.v(), $$14.w(), 1.0f, 1.0f, $$4.G_().g()));
        }
        return $$5;
    }

    public void c(axg $$0) {
        this.a((chl)$$0, $$0.g);
    }

    public void a(chl $$0, ayi $$1) {
        for (cfm $$2 : $$0.eW()) {
            $$1.b(new ahv($$0.aA(), $$2, false));
        }
    }

    public void d(axg $$0) {
        bbh $$1 = this.j.b($$0.gJ());
        this.a($$0, $$1);
    }

    public void d() {
        if (++this.x > 600) {
            this.a(new afn(EnumSet.of(afn.a.e), this.k));
            this.x = 0;
        }
    }

    public void a(aay<?> $$0) {
        for (axg $$1 : this.k) {
            $$1.g.b($$0);
        }
    }

    public void a(aay<?> $$0, amt<dwo> $$1) {
        for (axg $$2 : this.k) {
            if ($$2.A().aq() != $$1) continue;
            $$2.g.b($$0);
        }
    }

    public void a(ddm $$0, yh $$1) {
        fum $$2 = $$0.cI();
        if ($$2 == null) {
            return;
        }
        Collection<String> $$3 = ((fut)$$2).h();
        for (String $$4 : $$3) {
            axg $$5 = this.a($$4);
            if ($$5 == null || $$5 == $$0) continue;
            $$5.a($$1);
        }
    }

    public void b(ddm $$0, yh $$1) {
        fum $$2 = $$0.cI();
        if ($$2 == null) {
            this.a($$1, false);
            return;
        }
        for (int $$3 = 0; $$3 < this.k.size(); ++$$3) {
            axg $$4 = this.k.get($$3);
            if ($$4.cI() == $$2) continue;
            $$4.a($$1);
        }
    }

    public String[] e() {
        String[] $$0 = new String[this.k.size()];
        for (int $$1 = 0; $$1 < this.k.size(); ++$$1) {
            $$0[$$1] = this.k.get($$1).gI().name();
        }
        return $$0;
    }

    public bcg f() {
        return this.m;
    }

    public bbv g() {
        return this.n;
    }

    public void d(bbx $$0) {
        this.a($$0, Optional.empty(), Optional.empty());
    }

    public void a(bbx $$0, Optional<bbh> $$1, Optional<Boolean> $$2) {
        this.o.a(new bcc($$0, $$1.orElse(this.j.k()), $$2.orElse(this.o.b($$0))));
        axg $$3 = this.b($$0.a());
        if ($$3 != null) {
            this.d($$3);
        }
    }

    public void e(bbx $$0) {
        axg $$1;
        if (this.o.a($$0) && ($$1 = this.b($$0.a())) != null) {
            this.d($$1);
        }
    }

    private void a(axg $$0, bbh $$1) {
        if ($$0.g != null) {
            byte $$2 = switch ($$1.a()) {
                default -> throw new MatchException(null, null);
                case bbl.a -> 24;
                case bbl.b -> 25;
                case bbl.c -> 26;
                case bbl.d -> 27;
                case bbl.e -> 28;
            };
            $$0.g.b(new aei($$0, $$2));
        }
        this.j.aF().a($$0);
    }

    public boolean a(bbx $$0) {
        return !this.o() || this.o.d($$0) || this.p.d($$0);
    }

    public boolean f(bbx $$0) {
        return this.o.d($$0) || this.j.a($$0) && this.j.bb().l() || this.w;
    }

    public @Nullable axg a(String $$0) {
        int $$1 = this.k.size();
        for (int $$2 = 0; $$2 < $$1; ++$$2) {
            axg $$3 = this.k.get($$2);
            if (!$$3.gI().name().equalsIgnoreCase($$0)) continue;
            return $$3;
        }
        return null;
    }

    public void a(@Nullable ddm $$0, double $$1, double $$2, double $$3, double $$4, amt<dwo> $$5, aay<?> $$6) {
        for (int $$7 = 0; $$7 < this.k.size(); ++$$7) {
            double $$11;
            double $$10;
            double $$9;
            axg $$8 = this.k.get($$7);
            if ($$8 == $$0 || $$8.A().aq() != $$5 || !(($$9 = $$1 - $$8.dP()) * $$9 + ($$10 = $$2 - $$8.dR()) * $$10 + ($$11 = $$3 - $$8.dV()) * $$11 < $$4 * $$4)) continue;
            $$8.g.b($$6);
        }
    }

    public void h() {
        for (int $$0 = 0; $$0 < this.k.size(); ++$$0) {
            this.a(this.k.get($$0));
        }
    }

    public bcj i() {
        return this.p;
    }

    public String[] j() {
        return this.p.b();
    }

    public bcb k() {
        return this.o;
    }

    public String[] l() {
        return this.o.b();
    }

    public void a() {
    }

    public void a(axg $$0, axf $$1) {
        eqa $$2 = $$1.w();
        $$0.g.b(new aep($$2));
        $$0.g.b(new ahd($$1.au(), $$1.al(), $$1.U().a(eua.a)));
        $$0.g.b(new agn($$1.C()));
        if ($$1.ao()) {
            $$0.g.b(new aem(aem.c, 0.0f));
            $$0.g.b(new aem(aem.i, $$1.c(1.0f)));
            $$0.g.b(new aem(aem.j, $$1.a(1.0f)));
        }
        $$0.g.b(new aem(aem.o, 0.0f));
        this.j.aR().a($$0);
    }

    public void e(axg $$0) {
        $$0.cm.b();
        $$0.x();
        $$0.g.b(new agv($$0.gK().g()));
    }

    public int m() {
        return this.k.size();
    }

    public int n() {
        return this.j.r();
    }

    public boolean o() {
        return this.j.aP();
    }

    public List<axg> b(String $$0) {
        ArrayList $$1 = Lists.newArrayList();
        for (axg $$2 : this.k) {
            if (!$$2.D().equals($$0)) continue;
            $$1.add($$2);
        }
        return $$1;
    }

    public int p() {
        return this.u;
    }

    public int q() {
        return this.v;
    }

    public MinecraftServer c() {
        return this.j;
    }

    public @Nullable uz r() {
        return null;
    }

    public void a(boolean $$0) {
        this.w = $$0;
    }

    public void s() {
        for (int $$0 = 0; $$0 < this.k.size(); ++$$0) {
            this.k.get((int)$$0).g.a(yh.c("multiplayer.disconnect.server_shutdown"));
        }
    }

    public void a(yh $$0, boolean $$12) {
        this.a($$0, (axg $$1) -> $$0, $$12);
    }

    public void a(yh $$0, Function<axg, yh> $$1, boolean $$2) {
        this.j.a($$0);
        for (axg $$3 : this.k) {
            yh $$4 = $$1.apply($$3);
            if ($$4 == null) continue;
            $$3.b($$4, $$2);
        }
    }

    public void a(yy $$0, ed $$1, yd.a $$2) {
        this.a($$0, $$1::a, $$1.j(), $$2);
    }

    public void a(yy $$0, axg $$1, yd.a $$2) {
        this.a($$0, $$1::c, $$1, $$2);
    }

    private void a(yy $$0, Predicate<axg> $$1, @Nullable axg $$2, yd.a $$3) {
        boolean $$4 = this.a($$0);
        this.j.a($$0.d(), $$3, $$4 ? null : "Not Secure");
        yx $$5 = yx.a($$0);
        boolean $$6 = false;
        for (axg $$7 : this.k) {
            boolean $$8 = $$1.test($$7);
            $$7.a($$5, $$8, $$3);
            $$6 |= $$8 && $$0.j();
        }
        if ($$6 && $$2 != null) {
            $$2.a(e);
        }
    }

    private boolean a(yy $$0) {
        return $$0.i() && !$$0.a(Instant.now());
    }

    public bdg a(ddm $$0) {
        GameProfile $$12 = $$0.gI();
        return this.q.computeIfAbsent($$12.id(), $$1 -> {
            Path $$2 = this.a($$12);
            return new bdg(this.j, $$2);
        });
    }

    private Path a(GameProfile $$0) {
        Path $$4;
        Path $$1 = this.j.a(fng.b);
        Path $$2 = $$1.resolve(String.valueOf($$0.id()) + ".json");
        if (Files.exists($$2, new LinkOption[0])) {
            return $$2;
        }
        String $$3 = $$0.name() + ".json";
        if (bfp.f($$3) && Files.isRegularFile($$4 = $$1.resolve($$3), new LinkOption[0])) {
            try {
                return Files.move($$4, $$2, new CopyOption[0]);
            }
            catch (IOException $$5) {
                g.warn("Failed to copy file {} to {}", (Object)$$3, (Object)$$2);
                return $$4;
            }
        }
        return $$2;
    }

    public anb f(axg $$0) {
        UUID $$1 = $$0.cY();
        anb $$2 = this.r.get($$1);
        if ($$2 == null) {
            Path $$3 = this.j.a(fng.a).resolve(String.valueOf($$1) + ".json");
            $$2 = new anb(this.j.aA(), this, this.j.aB(), $$3, $$0);
            this.r.put($$1, $$2);
        }
        $$2.a($$0);
        return $$2;
    }

    public void a(int $$0) {
        this.u = $$0;
        this.a(new agl($$0));
        for (axf $$1 : this.j.P()) {
            $$1.p().a($$0);
        }
    }

    public void b(int $$0) {
        this.v = $$0;
        this.a(new ahb($$0));
        for (axf $$1 : this.j.P()) {
            $$1.p().b($$0);
        }
    }

    public List<axg> t() {
        return this.k;
    }

    public @Nullable axg b(UUID $$0) {
        return this.l.get($$0);
    }

    public @Nullable axg c(String $$0) {
        for (axg $$1 : this.k) {
            if (!$$1.gI().name().equalsIgnoreCase($$0)) continue;
            return $$1;
        }
        return null;
    }

    public boolean b(bbx $$0) {
        return false;
    }

    public void u() {
        for (anb $$0 : this.r.values()) {
            $$0.a(this.j.aB());
        }
        this.a(new abt(beh.a(this.t)));
        dqz $$1 = this.j.aJ();
        ahw $$2 = new ahw($$1.b(), $$1.c());
        for (axg $$3 : this.k) {
            $$3.g.b($$2);
            $$3.L().a($$3);
        }
    }

    public boolean v() {
        return this.w;
    }
}

