/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.common.hash.HashCode
 *  com.mojang.authlib.GameProfile
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.ParseResults
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.hash.HashCode;
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.lang.ref.WeakReference;
import java.time.Instant;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class hig
extends hia
implements adb,
xv {
    private static final Logger m = LogUtils.getLogger();
    private static final yh n = yh.c("multiplayer.unsecureserver.toast.title");
    private static final yh o = yh.c("multiplayer.unsecureserver.toast");
    private static final yh p = yh.c("multiplayer.disconnect.invalid_packet");
    private static final yh q = yh.c("connect.reconfiguring");
    private static final yh r = yh.c("multiplayer.disconnect.bad_chat_index");
    private static final yh s = yh.c("multiplayer.confirm_command.title");
    private static final yh t = yh.c("multiplayer.confirm_command.run_command");
    private static final yh u = yh.c("multiplayer.confirm_command.suggest_command");
    private static final int v = 64;
    public static final int l = 64;
    private static final bbi w = bbi.a.a("client/commands/restricted");
    static final bbj x = new bbj.b(w);
    private static final bbn y = $$0 -> $$0.equals(w);
    private static final adt.d<hij> z = new adt.d<hij>(){

        @Override
        public ArgumentBuilder<hij, ?> a(String $$0) {
            return LiteralArgumentBuilder.literal((String)$$0);
        }

        @Override
        public ArgumentBuilder<hij, ?> a(String $$0, ArgumentType<?> $$1, @Nullable amo $$2) {
            RequiredArgumentBuilder $$3 = RequiredArgumentBuilder.argument((String)$$0, $$1);
            if ($$2 != null) {
                $$3.suggests(ig.a($$2));
            }
            return $$3;
        }

        @Override
        public ArgumentBuilder<hij, ?> a(ArgumentBuilder<hij, ?> $$02, boolean $$1, boolean $$2) {
            if ($$1) {
                $$02.executes($$0 -> 0);
            }
            if ($$2) {
                $$02.requires(ee.a(x));
            }
            return $$02;
        }
    };
    private final GameProfile A;
    private hif B;
    private hif.a C;
    private final Map<UUID, hiq> D = Maps.newHashMap();
    private final Set<hiq> E = new ReferenceOpenHashSet();
    private final hhy F;
    private final hij G;
    private final hij H;
    private final gey I = new gey(this);
    private int J = 3;
    private int K = 3;
    private final bgr L = bgr.b();
    private CommandDispatcher<hij> M = new CommandDispatcher();
    private hih N = new hih(Map.of(), drf.b.a());
    private final UUID O = UUID.randomUUID();
    private Set<amt<dwo>> P;
    private final jr.b Q;
    private final dgz R;
    private final dnq S;
    private emb T;
    private final wz.a U;
    private OptionalInt V = OptionalInt.empty();
    private @Nullable yt W;
    private zc.c X = zc.c.a;
    private int Y;
    private yq Z = new yq(20);
    private yv aa = yv.a();
    private @Nullable CompletableFuture<Optional<ddr>> ab;
    private @Nullable awp ac;
    private final hhx ad = new hhx();
    private final hip ae;
    private final hic af;
    private @Nullable hin ag;
    private boolean ah;
    private volatile boolean ai;
    private final fur aj = new fur();
    private final iry ak = new iry();
    private final hiw al = new hiw();
    private final List<WeakReference<hhw<?, ?>>> am = new ArrayList();
    private boolean an;

    public hig(gfj $$0, wu $$13, hik $$2) {
        super($$0, $$13, $$2);
        this.A = $$2.b();
        this.Q = $$2.d();
        ams<HashCode> $$3 = this.Q.a(bfw.c);
        this.U = $$12 -> ((HashCode)$$12.a($$3).getOrThrow($$1 -> new IllegalArgumentException("Failed to hash " + String.valueOf($$12) + ": " + $$1))).asInt();
        this.R = $$2.e();
        this.F = new hhy($$0, this.e);
        bbn $$4 = $$1 -> {
            hnh $$2 = $$0.s;
            return $$2 != null && $$2.I().hasPermission($$1);
        };
        this.G = new hij(this, $$0, $$4.a(y));
        this.H = new hij(this, $$0, bbn.g);
        this.ae = new hip(this, $$0.aT().j());
        this.af = new hic(this, $$0.aT());
        if ($$2.j() != null) {
            $$0.j.e().a($$2.j());
        }
        this.S = dnq.a(this.R);
        this.T = emb.a($$2.d(), this.R);
        this.ag = $$2.a();
    }

    public hij i() {
        return this.G;
    }

    public void j() {
        this.ai = true;
        this.k();
        this.e.c();
    }

    public void k() {
        this.L();
        this.B = null;
        this.ag = null;
    }

    private void L() {
        for (WeakReference<hhw<?, ?>> $$0 : this.am) {
            hhw $$1 = (hhw)$$0.get();
            if ($$1 == null) continue;
            $$1.a();
        }
        this.am.clear();
    }

    public dqt l() {
        return this.N;
    }

    @Override
    public void a(aew $$0) {
        hif.a $$8;
        abb.a($$0, this, this.a.bk());
        this.a.q = new hio(this.a, this);
        ahx $$1 = $$0.m();
        ArrayList $$2 = Lists.newArrayList($$0.f());
        Collections.shuffle($$2);
        this.P = Sets.newLinkedHashSet((Iterable)$$2);
        amt<dwo> $$3 = $$1.b();
        jd<esh> $$4 = $$1.a();
        this.J = $$0.h();
        this.K = $$0.i();
        boolean $$5 = $$1.f();
        boolean $$6 = $$1.g();
        int $$7 = $$1.j();
        this.C = $$8 = new hif.a(ccz.c, $$0.e(), $$6);
        this.B = new hif(this, $$8, $$3, $$4, this.J, this.K, this.a.e, $$5, $$1.c(), $$7);
        this.a.a(this.B);
        if (this.a.s == null) {
            this.a.s = this.a.q.a(this.B, new bdl(), new geu());
            this.a.s.v(-180.0f);
            if (this.a.aa() != null) {
                this.a.aa().a(this.a.s.cY());
            }
        }
        this.a(false);
        this.af.a();
        this.a.e.d.a();
        this.a.s.G();
        this.a.s.e($$0.b());
        this.B.d(this.a.s);
        this.a.s.c = new hng(this.a.k);
        this.a.q.a(this.a.s);
        this.a.a(this.a.s);
        this.a(this.a.s, this.B, grp.a.c);
        this.a.s.v($$0.j());
        this.a.s.x($$0.k());
        this.a.s.y($$0.l());
        this.a.s.d($$1.h());
        this.a.s.f($$1.i());
        this.a.q.a($$1.d(), $$1.e());
        this.a.k.b($$0.h());
        this.W = null;
        this.X = zc.c.a;
        this.Y = 0;
        this.Z = new yq(20);
        this.aa = yv.a();
        if (this.b.h()) {
            this.z();
        }
        this.e.a($$1.d(), $$0.e());
        this.a.bd().a(this.a);
        this.ah = $$0.n();
        if (this.c != null && !this.k && !this.M()) {
            gna $$9 = gna.a(this.a, gna.a.k, n, o);
            this.a.aG().a($$9);
            this.k = true;
        }
    }

    @Override
    public void a(adc $$0) {
        ddm $$2;
        UUID $$3;
        hiq $$4;
        cgk $$1;
        abb.a($$0, this, this.a.bk());
        if (this.V.isPresent() && this.V.getAsInt() == $$0.b()) {
            this.V = OptionalInt.empty();
        }
        if (($$1 = this.b($$0)) != null) {
            $$1.a($$0);
            this.B.d($$1);
            this.a($$1);
        } else {
            m.warn("Skipping Entity with id {}", $$0.f());
        }
        if ($$1 instanceof ddm && ($$4 = this.D.get($$3 = ($$2 = (ddm)$$1).cY())) != null) {
            this.j.put($$3, $$4);
        }
    }

    private @Nullable cgk b(adc $$0) {
        cgu<?> $$1 = $$0.f();
        if ($$1 == cgu.cb) {
            hiq $$2 = this.a($$0.e());
            if ($$2 == null) {
                m.warn("Server attempted to add player prior to sending player info (Player id {})", (Object)$$0.e());
                return null;
            }
            return new hnj(this.B, $$2.a());
        }
        return $$1.a(this.B, cgt.r);
    }

    private void a(cgk $$0) {
        if ($$0 instanceof dgi) {
            dgi $$1 = (dgi)$$0;
            this.a.ap().a((ipm)new ipe($$1));
        } else if ($$0 instanceof ctw) {
            iow $$5;
            ctw $$2 = (ctw)$$0;
            boolean $$3 = $$2.ab_();
            if ($$3) {
                iov $$4 = new iov($$2);
            } else {
                $$5 = new iow($$2);
            }
            this.a.ap().a($$5);
        }
    }

    @Override
    public void a(agr $$0) {
        abb.a($$0, this, this.a.bk());
        cgk $$1 = this.B.a($$0.b());
        if ($$1 == null) {
            return;
        }
        $$1.j($$0.e());
    }

    @Override
    public void a(agp $$0) {
        abb.a($$0, this, this.a.bk());
        cgk $$1 = this.B.a($$0.b());
        if ($$1 != null) {
            $$1.aD().a($$0.e());
        }
    }

    @Override
    public void a(aej $$0) {
        boolean $$5;
        abb.a($$0, this, this.a.bk());
        cgk $$1 = this.B.a($$0.b());
        if ($$1 == null) {
            return;
        }
        ftm $$2 = $$0.e().a();
        $$1.ax().e($$2);
        if ($$1.dv()) {
            return;
        }
        float $$3 = $$0.e().c();
        float $$4 = $$0.e().d();
        boolean bl2 = $$5 = $$1.dI().g($$2) > 4096.0;
        if (this.B.a($$1) && !$$5) {
            $$1.d($$2, $$3, $$4);
        } else {
            $$1.b($$2, $$3, $$4);
        }
        if (!$$1.ch() && $$1.B(this.a.s)) {
            $$1.k(this.a.s);
            this.a.s.bP();
        }
        $$1.e($$0.f());
    }

    @Override
    public void a(aho $$0) {
        abb.a($$0, this, this.a.bk());
        cgk $$1 = this.B.a($$0.b());
        if ($$1 == null) {
            if (this.V.isPresent() && this.V.getAsInt() == $$0.b()) {
                m.debug("Trying to teleport entity with id {}, that was formerly player vehicle, applying teleport to player instead", (Object)$$0.b());
                hig.a($$0.e(), $$0.f(), this.a.s, false);
                this.b.a(new ajb.b(this.a.s.dP(), this.a.s.dR(), this.a.s.dV(), this.a.s.ec(), this.a.s.ee(), false, false));
            }
            return;
        }
        boolean $$2 = $$0.f().contains((Object)chz.a) || $$0.f().contains((Object)chz.b) || $$0.f().contains((Object)chz.c);
        boolean $$3 = this.B.a($$1) || !$$1.dv() || $$2;
        boolean $$4 = hig.a($$0.e(), $$0.f(), $$1, $$3);
        $$1.e($$0.g());
        if (!$$4 && $$1.B(this.a.s)) {
            $$1.k(this.a.s);
            this.a.s.bP();
            if ($$1.dv()) {
                this.b.a(ajc.a($$1));
            }
        }
    }

    @Override
    public void a(ahq $$0) {
        abb.a($$0, this, this.a.bk());
        if (this.a.r == null) {
            return;
        }
        cdo $$1 = this.a.r.y();
        $$1.a($$0.b());
        $$1.a($$0.e());
    }

    @Override
    public void a(ahr $$0) {
        abb.a($$0, this, this.a.bk());
        if (this.a.r == null) {
            return;
        }
        cdo $$1 = this.a.r.y();
        $$1.c($$0.b());
    }

    @Override
    public void a(agv $$0) {
        abb.a($$0, this, this.a.bk());
        if (ddl.f($$0.b())) {
            this.a.s.gK().d($$0.b());
        }
    }

    @Override
    public void a(afa $$0) {
        abb.a($$0, this, this.a.bk());
        cgk $$1 = $$0.a(this.B);
        if ($$1 == null) {
            return;
        }
        if ($$1.dv()) {
            akg $$2 = $$1.ax();
            ftm $$3 = $$2.a($$0.b(), $$0.e(), $$0.f());
            $$2.e($$3);
            return;
        }
        if ($$0.j()) {
            akg $$4 = $$1.ax();
            ftm $$5 = $$4.a($$0.b(), $$0.e(), $$0.f());
            $$4.e($$5);
            if ($$0.i()) {
                $$1.d($$5, $$0.g(), $$0.h());
            } else {
                $$1.i($$5);
            }
        } else if ($$0.i()) {
            $$1.e($$0.g(), $$0.h());
        }
        $$1.e($$0.k());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void a(afb $$0) {
        void $$3;
        abb.a($$0, this, this.a.bk());
        cgk $$1 = $$0.a(this.B);
        if (!($$1 instanceof dgi)) {
            return;
        }
        dgi $$2 = (dgi)$$1;
        dgl dgl2 = $$3.q();
        if (dgl2 instanceof dgs) {
            dgs $$4 = (dgs)dgl2;
            $$4.e.addAll($$0.e());
        }
    }

    @Override
    public void a(afz $$0) {
        abb.a($$0, this, this.a.bk());
        cgk $$1 = $$0.a(this.B);
        if ($$1 == null) {
            return;
        }
        $$1.a($$0.b(), 3);
    }

    @Override
    public void a(afv $$02) {
        abb.a($$02, this, this.a.bk());
        $$02.b().forEach($$0 -> {
            cgk $$1 = this.B.a($$0);
            if ($$1 == null) {
                return;
            }
            if ($$1.B(this.a.s)) {
                m.debug("Remove entity {}:{} that has player as passenger", $$1.ay(), (Object)$$0);
                this.V = OptionalInt.of($$0);
            }
            this.B.a($$0, cgk.e.b);
            this.af.a($$1);
        });
    }

    @Override
    public void a(afp $$0) {
        abb.a($$0, this, this.a.bk());
        hnh $$1 = this.a.s;
        if (!$$1.cq()) {
            hig.a($$0.e(), $$0.f(), $$1, false);
        }
        this.b.a(new aid($$0.b()));
        this.b.a(new ajb.b($$1.dP(), $$1.dR(), $$1.dV(), $$1.ec(), $$1.ee(), false, false));
    }

    private static boolean a(chy $$0, Set<chz> $$1, cgk $$2, boolean $$3) {
        boolean $$6;
        chy $$4 = chy.a($$2);
        chy $$5 = chy.a($$4, $$0, $$1);
        boolean bl2 = $$6 = $$4.a().g($$5.a()) > 4096.0;
        if ($$3 && !$$6) {
            $$2.d($$5.a(), $$5.c(), $$5.d());
            $$2.k($$5.b());
            return true;
        }
        $$2.b($$5.a());
        $$2.k($$5.b());
        $$2.v($$5.c());
        $$2.w($$5.d());
        chy $$7 = new chy($$2.bS(), ftm.c, $$2.ab, $$2.ac);
        chy $$8 = chy.a($$7, $$0, $$1);
        $$2.c($$8.a(), $$8.c(), $$8.d());
        return false;
    }

    @Override
    public void a(afq $$0) {
        abb.a($$0, this, this.a.bk());
        hnh $$1 = this.a.s;
        Set<chz> $$2 = chz.a($$0.e(), $$0.g());
        chy $$3 = chy.a($$1);
        chy $$4 = chy.a($$3, $$3.a($$0.b(), $$0.f()), $$2);
        $$1.v($$4.c());
        $$1.w($$4.d());
        $$1.bR();
        this.b.a(new ajb.c($$1.ec(), $$1.ee(), false, false));
    }

    @Override
    public void a(aga $$02) {
        abb.a($$02, this, this.a.bk());
        $$02.a((is $$0, eoh $$1) -> this.B.b((is)$$0, (eoh)$$1, 19));
    }

    @Override
    public void a(aer $$0) {
        abb.a($$0, this, this.a.bk());
        int $$1 = $$0.b();
        int $$2 = $$0.e();
        this.a($$1, $$2, $$0.f());
        aev $$3 = $$0.g();
        this.B.a(() -> {
            this.a($$1, $$2, $$3, false);
            eqq $$3 = this.B.j().a($$1, $$2, false);
            if ($$3 != null) {
                this.a($$3, $$1, $$2);
                this.a.e.a($$3.f());
            }
        });
    }

    @Override
    public void a(adq $$0) {
        abb.a($$0, this, this.a.bk());
        for (adq.a $$1 : $$0.b()) {
            this.B.j().a($$1.b().h, $$1.b().i, $$1.a());
        }
        for (adq.a $$2 : $$0.b()) {
            this.B.a(new dvu($$2.b().h, $$2.b().i));
        }
        for (adq.a $$3 : $$0.b()) {
            for (int $$4 = -1; $$4 <= 1; ++$$4) {
                for (int $$5 = -1; $$5 <= 1; ++$$5) {
                    for (int $$6 = this.B.ay(); $$6 <= this.B.az(); ++$$6) {
                        this.a.e.b($$3.b().h + $$4, $$6, $$3.b().i + $$5);
                    }
                }
            }
        }
    }

    private void a(int $$0, int $$1, aeq $$2) {
        this.B.j().a($$0, $$1, $$2.a(), $$2.b(), $$2.a($$0, $$1));
    }

    private void a(eqq $$0, int $$1, int $$2) {
        fkq $$3 = this.B.j().r();
        eqr[] $$4 = $$0.d();
        dvu $$5 = $$0.f();
        for (int $$6 = 0; $$6 < $$4.length; ++$$6) {
            eqr $$7 = $$4[$$6];
            int $$8 = this.B.h($$6);
            $$3.a(jw.a($$5, $$8), $$7.c());
        }
        this.B.b($$1 - 1, this.B.ay(), $$2 - 1, $$1 + 1, this.B.az(), $$2 + 1);
    }

    @Override
    public void a(ael $$0) {
        abb.a($$0, this, this.a.bk());
        this.B.j().a($$0.b());
        this.af.a($$0.b());
        this.b($$0);
    }

    private void b(ael $$0) {
        dvu $$1 = $$0.b();
        this.B.a(() -> {
            fkq $$1 = this.B.C_();
            $$1.a($$1, false);
            for (int $$2 = $$1.d(); $$2 < $$1.e(); ++$$2) {
                jw $$3 = jw.a($$1, $$2);
                $$1.a(dww.b, $$3, null);
                $$1.a(dww.a, $$3, null);
            }
            for (int $$4 = this.B.ay(); $$4 <= this.B.az(); ++$$4) {
                $$1.a(jw.a($$1, $$4), true);
            }
        });
    }

    @Override
    public void a(adj $$0) {
        abb.a($$0, this, this.a.bk());
        this.B.b($$0.e(), $$0.b(), 19);
    }

    @Override
    public void a(ahi $$0) {
        abb.a($$0, this, this.a.bk());
        this.a.ba().d();
        this.N();
        gjf.j $$1 = this.a.j.e().k();
        this.a.b(new gvr(q, this.b));
        this.b.a(acp.d, new hib(this.a, this.b, new hik(new hin(), this.A, this.e, this.Q, this.R, this.d, this.c, this.f, this.h, $$1, this.i, this.a(), this.j, this.k)));
        this.b(aiq.a);
        this.b.a(acp.b);
    }

    @Override
    public void a(ahn $$0) {
        abb.a($$0, this, this.a.bk());
        cgk $$1 = this.B.a($$0.b());
        chl $$2 = (chl)this.B.a($$0.e());
        if ($$2 == null) {
            $$2 = this.a.s;
        }
        if ($$1 != null) {
            if ($$1 instanceof cgz) {
                this.B.a($$1.dP(), $$1.dR(), $$1.dV(), bda.kp, bdb.h, 0.1f, (this.L.i() - this.L.i()) * 0.35f + 0.9f, false);
            } else {
                this.B.a($$1.dP(), $$1.dR(), $$1.dV(), bda.pG, bdb.h, 0.2f, (this.L.i() - this.L.i()) * 1.4f + 2.0f, false);
            }
            idf $$3 = this.a.ay().b($$1, 1.0f);
            this.a.f.a(new hlj(this.B, $$3, $$2, $$1.dN()));
            if ($$1 instanceof czl) {
                czl $$4 = (czl)$$1;
                dlt $$5 = $$4.e();
                if (!$$5.f()) {
                    $$5.h($$0.f());
                }
                if ($$5.f()) {
                    this.B.a($$0.b(), cgk.e.b);
                }
            } else if (!($$1 instanceof cgz)) {
                this.B.a($$0.b(), cgk.e.b);
            }
        }
    }

    @Override
    public void a(ahk $$0) {
        abb.a($$0, this, this.a.bk());
        this.a.ba().a($$0.b(), $$0.e());
    }

    @Override
    public void a(afi $$0) {
        zd $$7;
        abb.a($$0, this, this.a.bk());
        int $$1 = this.Y++;
        if ($$0.b() != $$1) {
            m.error("Missing or out-of-order chat message from server, expected index {} but got {}", (Object)$$1, (Object)$$0.b());
            this.b.a(r);
            return;
        }
        Optional<zb> $$2 = $$0.h().a(this.aa);
        if ($$2.isEmpty()) {
            m.error("Message from player with ID {} referenced unrecognized signature id", (Object)$$0.e());
            this.b.a(p);
            return;
        }
        this.aa.a($$2.get(), $$0.g());
        UUID $$3 = $$0.e();
        hiq $$4 = this.a($$3);
        if ($$4 == null) {
            m.error("Received player chat packet for unknown player with ID: {}", (Object)$$3);
            this.a.ba().a($$3, $$0.g(), $$0.k());
            return;
        }
        yz $$5 = $$4.b();
        if ($$5 != null) {
            zd $$6 = new zd($$0.f(), $$3, $$5.c());
        } else {
            $$7 = zd.a($$3);
        }
        yy $$8 = new yy($$7, $$0.g(), $$2.get(), $$0.i(), $$0.j());
        $$8 = $$4.c().updateAndValidate($$8);
        if ($$8 != null) {
            this.a.ba().a($$8, $$4.a(), $$0.k());
        } else {
            this.a.ba().a($$3, $$0.g(), $$0.k());
        }
    }

    @Override
    public void a(aeh $$0) {
        abb.a($$0, this, this.a.bk());
        this.a.ba().a($$0.b(), $$0.e());
    }

    @Override
    public void a(aeg $$0) {
        abb.a($$0, this, this.a.bk());
        Optional<yu> $$1 = $$0.b().a(this.aa);
        if ($$1.isEmpty()) {
            this.b.a(p);
            return;
        }
        this.Z.a($$1.get());
        if (!this.a.ba().a($$1.get())) {
            this.a.j.e().a($$1.get());
        }
    }

    @Override
    public void a(add $$0) {
        abb.a($$0, this, this.a.bk());
        cgk $$1 = this.B.a($$0.b());
        if ($$1 == null) {
            return;
        }
        if ($$0.e() == 0) {
            chl $$2 = (chl)$$1;
            $$2.a(cdb.a);
        } else if ($$0.e() == 3) {
            chl $$3 = (chl)$$1;
            $$3.a(cdb.b);
        } else if ($$0.e() == 2) {
            ddm $$4 = (ddm)$$1;
            $$4.a(false, false);
        } else if ($$0.e() == 4) {
            this.a.f.a($$1, ly.g);
        } else if ($$0.e() == 5) {
            this.a.f.a($$1, ly.s);
        }
    }

    @Override
    public void a(aeo $$0) {
        abb.a($$0, this, this.a.bk());
        cgk $$1 = this.B.a($$0.b());
        if ($$1 == null) {
            return;
        }
        $$1.q($$0.e());
    }

    @Override
    public void a(ahd $$0) {
        abb.a($$0, this, this.a.bk());
        this.B.a($$0.b(), $$0.e(), $$0.f());
        this.e.a($$0.b());
    }

    @Override
    public void a(agn $$0) {
        abb.a($$0, this, this.a.bk());
        this.a.r.a($$0.b());
    }

    @Override
    public void a(agx $$0) {
        abb.a($$0, this, this.a.bk());
        cgk $$1 = this.B.a($$0.e());
        if ($$1 == null) {
            m.warn("Received passengers for unknown entity");
            return;
        }
        boolean $$2 = $$1.B(this.a.s);
        $$1.ce();
        for (int $$3 : $$0.b()) {
            cgk $$4 = this.B.a($$3);
            if ($$4 == null) continue;
            $$4.a($$1, true, false);
            if ($$4 != this.a.s) continue;
            this.V = OptionalInt.empty();
            if ($$2) continue;
            if ($$1 instanceof dgb) {
                this.a.s.ab = $$1.ec();
                this.a.s.v($$1.ec());
                this.a.s.r($$1.ec());
            }
            yw $$5 = yh.a("mount.onboard", this.a.k.x.n());
            this.a.j.a($$5, false);
            this.a.aZ().d($$5);
        }
    }

    @Override
    public void a(agq $$0) {
        abb.a($$0, this, this.a.bk());
        cgk $$1 = this.B.a($$0.b());
        if ($$1 instanceof chj) {
            chj $$2 = (chj)((Object)$$1);
            $$2.b_($$0.e());
        }
    }

    private static dlt a(ddm $$0) {
        for (cdb $$1 : cdb.values()) {
            dlt $$2 = $$0.b($$1);
            if (!$$2.c(ki.L)) continue;
            return $$2;
        }
        return new dlt(dlx.xP);
    }

    @Override
    public void a(aei $$0) {
        abb.a($$0, this, this.a.bk());
        cgk $$1 = $$0.a(this.B);
        if ($$1 != null) {
            switch ($$0.b()) {
                case 63: {
                    this.a.ap().a((ipm)new ipi((cxm)$$1));
                    break;
                }
                case 21: {
                    this.a.ap().a((ipm)new ipd((czx)$$1));
                    break;
                }
                case 35: {
                    int $$2 = 40;
                    this.a.f.a($$1, ly.ao, 30);
                    this.B.a($$1.dP(), $$1.dR(), $$1.dV(), bda.CR, $$1.dB(), 1.0f, 1.0f, false);
                    if ($$1 != this.a.s) break;
                    this.a.i.a(hig.a(this.a.s));
                    break;
                }
                default: {
                    $$1.b($$0.b());
                }
            }
        }
    }

    @Override
    public void a(aea $$0) {
        abb.a($$0, this, this.a.bk());
        cgk $$1 = this.B.a($$0.b());
        if ($$1 == null) {
            return;
        }
        $$1.c($$0.a(this.B));
    }

    @Override
    public void a(agu $$0) {
        abb.a($$0, this, this.a.bk());
        this.a.s.L($$0.b());
        this.a.s.gW().a($$0.e());
        this.a.s.gW().b($$0.f());
    }

    @Override
    public void a(agt $$0) {
        abb.a($$0, this, this.a.bk());
        this.a.s.a($$0.b(), $$0.e(), $$0.f());
    }

    @Override
    public void a(afy $$0) {
        hnh $$14;
        abb.a($$0, this, this.a.bk());
        ahx $$1 = $$0.b();
        amt<dwo> $$2 = $$1.b();
        jd<esh> $$3 = $$1.a();
        hnh $$4 = this.a.s;
        amt<dwo> $$5 = $$4.ao().aq();
        boolean $$6 = $$2 != $$5;
        grp.a $$7 = this.a($$4.fa(), $$2, $$5);
        if ($$6) {
            hif.a $$12;
            Map<fmu, fmw> $$8 = this.B.m();
            boolean $$9 = $$1.f();
            boolean $$10 = $$1.g();
            int $$11 = $$1.j();
            this.C = $$12 = new hif.a(this.C.p(), this.C.k(), $$10);
            this.B = new hif(this, $$12, $$2, $$3, this.J, this.K, this.a.e, $$9, $$1.c(), $$11);
            this.B.a($$8);
            this.a.a(this.B);
            this.af.b();
        }
        this.a.a((cgk)null);
        if ($$4.gN()) {
            $$4.r();
        }
        if ($$0.a((byte)2)) {
            hnh $$13 = this.a.q.a(this.B, $$4.x(), $$4.y(), $$4.P(), $$4.cA());
        } else {
            $$14 = this.a.q.a(this.B, $$4.x(), $$4.y());
        }
        this.a(false);
        this.a($$14, this.B, $$7);
        $$14.e($$4.aA());
        this.a.s = $$14;
        if ($$6) {
            this.a.w().c();
        }
        this.a.a($$14);
        if ($$0.a((byte)2)) {
            List<ama.c<?>> $$15 = $$4.aD().c();
            if ($$15 != null) {
                $$14.aD().a($$15);
            }
            $$14.k($$4.dN());
            $$14.v($$4.ec());
            $$14.w($$4.ee());
        } else {
            $$14.G();
            $$14.v(-180.0f);
        }
        if ($$0.a((byte)1)) {
            $$14.fw().a($$4.fw());
        } else {
            $$14.fw().b($$4.fw());
        }
        this.B.d($$14);
        $$14.c = new hng(this.a.k);
        this.a.q.a($$14);
        $$14.v($$4.hb());
        $$14.x($$4.A());
        $$14.d($$1.h());
        $$14.f($$1.i());
        $$14.k = $$4.k;
        $$14.cB = $$4.cB;
        if (this.a.x instanceof grg || this.a.x instanceof grg.a) {
            this.a.a((gsb)null);
        }
        this.a.q.a($$1.d(), $$1.e());
    }

    private grp.a a(boolean $$0, amt<dwo> $$1, amt<dwo> $$2) {
        grp.a $$3 = grp.a.c;
        if (!$$0) {
            if ($$1 == dwo.i || $$2 == dwo.i) {
                $$3 = grp.a.a;
            } else if ($$1 == dwo.j || $$2 == dwo.j) {
                $$3 = grp.a.b;
            }
        }
        return $$3;
    }

    @Override
    public void a(aek $$0) {
        abb.a($$0, this, this.a.bk());
        ftm $$1 = $$0.b();
        this.a.r.a($$1.a(), $$1.b(), $$1.c(), $$0.i().a(), bdb.e, 4.0f, (1.0f + (this.a.r.y.i() - this.a.r.y.i()) * 0.2f) * 0.7f, false);
        this.a.r.a($$0.h(), $$1.a(), $$1.b(), $$1.c(), 1.0, 0.0, 0.0);
        this.a.r.a($$1, $$0.e(), $$0.f(), $$0.j());
        $$0.g().ifPresent(this.a.s::l);
    }

    @Override
    public void a(aez $$0) {
        abb.a($$0, this, this.a.bk());
        cgk $$1 = this.B.a($$0.f());
        hnh $$2 = this.a.s;
        int $$3 = $$0.e();
        cdk $$4 = new cdk(dhl.e($$3));
        if ($$1 instanceof cup) {
            cup $$5 = (cup)$$1;
            dil $$6 = new dil($$0.b(), $$2.gK(), $$4, $$5, $$3);
            $$2.cn = $$6;
            this.a.a(new guk($$6, $$2.gK(), $$5, $$3));
        } else if ($$1 instanceof cwn) {
            cwn $$7 = (cwn)$$1;
            diw $$8 = new diw($$0.b(), $$2.gK(), $$4, $$7, $$3);
            $$2.cn = $$8;
            this.a.a(new gut($$8, $$2.gK(), $$7, $$3));
        }
    }

    @Override
    public void a(afe $$0) {
        abb.a($$0, this, this.a.bk());
        grt.a($$0.e(), this.a, $$0.b(), $$0.f());
    }

    @Override
    public void a(adx $$0) {
        boolean $$6;
        abb.a($$0, this, this.a.bk());
        hnh $$1 = this.a.s;
        dlt $$2 = $$0.f();
        int $$3 = $$0.e();
        this.a.aH().a($$2);
        gsb gsb2 = this.a.x;
        if (gsb2 instanceof gua) {
            gua $$4 = (gua)gsb2;
            boolean $$5 = !$$4.I();
        } else {
            $$6 = false;
        }
        if ($$0.b() == 0) {
            dlt $$7;
            if (dim.e($$3) && !$$2.f() && (($$7 = $$1.cm.b($$3).g()).f() || $$7.N() < $$2.N())) {
                $$2.d(5);
            }
            $$1.cm.a($$3, $$0.g(), $$2);
        } else if (!($$0.b() != $$1.cn.l || $$0.b() == 0 && $$6)) {
            $$1.cn.a($$3, $$0.g(), $$2);
        }
        if (this.a.x instanceof gua) {
            $$1.cm.a($$3, $$2);
            $$1.cm.d();
        }
    }

    @Override
    public void a(agm $$0) {
        abb.a($$0, this, this.a.bk());
        this.a.aH().a($$0.b());
        if (!(this.a.x instanceof gua)) {
            this.a.s.cn.a($$0.b());
        }
    }

    @Override
    public void a(agy $$0) {
        abb.a($$0, this, this.a.bk());
        this.a.aH().a($$0.e());
        this.a.s.gK().a($$0.b(), $$0.e());
    }

    @Override
    public void a(adv $$0) {
        abb.a($$0, this, this.a.bk());
        hnh $$1 = this.a.s;
        if ($$0.b() == 0) {
            $$1.cm.a($$0.e(), $$0.f(), $$0.g());
        } else if ($$0.b() == $$1.cn.l) {
            $$1.cn.a($$0.e(), $$0.f(), $$0.g());
        }
    }

    @Override
    public void a(aff $$0) {
        abb.a($$0, this, this.a.bk());
        is $$1 = $$0.b();
        elb elb2 = this.B.c_($$1);
        if (elb2 instanceof ems) {
            ems $$2 = (ems)elb2;
            this.a.s.a($$2, $$0.e());
        } else {
            m.warn("Ignoring openTextEdit on an invalid entity: {} at pos {}", (Object)this.B.c_($$1), (Object)$$1);
        }
    }

    @Override
    public void a(adh $$0) {
        abb.a($$0, this, this.a.bk());
        is $$12 = $$0.b();
        this.a.r.a($$12, $$0.e()).ifPresent($$1 -> {
            try (bgp.j $$2 = new bgp.j($$1.v(), m);){
                $$1.b(fno.a((bgp)$$2, (jf.a)this.Q, $$0.f()));
            }
            if ($$1 instanceof elm && this.a.x instanceof gtv) {
                ((gtv)this.a.x).K();
            }
        });
    }

    @Override
    public void a(adw $$0) {
        abb.a($$0, this, this.a.bk());
        hnh $$1 = this.a.s;
        if ($$1.cn.l == $$0.b()) {
            $$1.cn.b($$0.e(), $$0.f());
        }
    }

    @Override
    public void a(ags $$0) {
        abb.a($$0, this, this.a.bk());
        cgk $$12 = this.B.a($$0.b());
        if ($$12 instanceof chl) {
            chl $$2 = (chl)$$12;
            $$0.e().forEach($$1 -> $$2.a((cgv)$$1.getFirst(), (dlt)$$1.getSecond()));
        }
    }

    @Override
    public void a(adu $$0) {
        abb.a($$0, this, this.a.bk());
        this.a.s.p();
    }

    @Override
    public void a(adi $$0) {
        abb.a($$0, this, this.a.bk());
        this.a.r.a($$0.b(), $$0.g(), $$0.e(), $$0.f());
    }

    @Override
    public void a(adg $$0) {
        abb.a($$0, this, this.a.bk());
        this.a.r.a($$0.b(), $$0.e(), $$0.f());
    }

    @Override
    public void a(aem $$0) {
        abb.a($$0, this, this.a.bk());
        hnh $$1 = this.a.s;
        aem.a $$2 = $$0.b();
        float $$3 = $$0.e();
        int $$4 = bgj.b($$3 + 0.5f);
        if ($$2 == aem.b) {
            ((ddm)$$1).a(yh.c("block.minecraft.spawn.not_valid"), false);
        } else if ($$2 == aem.c) {
            this.B.l().b(true);
            this.B.d(0.0f);
        } else if ($$2 == aem.d) {
            this.B.l().b(false);
            this.B.d(1.0f);
        } else if ($$2 == aem.e) {
            this.a.q.a(dwl.a($$4));
        } else if ($$2 == aem.f) {
            this.a.a(new gse(true, () -> {
                this.a.s.b.b(new ain(ain.a.a));
                this.a.a((gsb)null);
            }));
        } else if ($$2 == aem.g) {
            gfo $$5 = this.a.k;
            yw $$6 = null;
            if ($$3 == 0.0f) {
                this.a.a(new grh());
            } else if ($$3 == 101.0f) {
                $$6 = yh.a("demo.help.movement", $$5.s.n(), $$5.t.n(), $$5.u.n(), $$5.v.n());
            } else if ($$3 == 102.0f) {
                $$6 = yh.a("demo.help.jump", $$5.w.n());
            } else if ($$3 == 103.0f) {
                $$6 = yh.a("demo.help.inventory", $$5.z.n());
            } else if ($$3 == 104.0f) {
                $$6 = yh.a("demo.day.6", $$5.J.n());
            }
            if ($$6 != null) {
                this.a.j.e().a($$6);
                this.a.aZ().c($$6);
            }
        } else if ($$2 == aem.h) {
            this.B.a((cgk)$$1, $$1.dP(), $$1.dT(), $$1.dV(), bda.aI, bdb.h, 0.18f, 0.45f);
        } else if ($$2 == aem.i) {
            this.B.d($$3);
        } else if ($$2 == aem.j) {
            this.B.b($$3);
        } else if ($$2 == aem.k) {
            this.B.a((cgk)$$1, $$1.dP(), $$1.dR(), $$1.dV(), bda.xG, bdb.g, 1.0f, 1.0f);
        } else if ($$2 == aem.l) {
            this.B.a(ly.r, $$1.dP(), $$1.dR(), $$1.dV(), 0.0, 0.0, 0.0);
            if ($$4 == 1) {
                this.B.a((cgk)$$1, $$1.dP(), $$1.dR(), $$1.dV(), bda.jy, bdb.f, 1.0f, 1.0f);
            }
        } else if ($$2 == aem.m) {
            this.a.s.x($$3 == 0.0f);
        } else if ($$2 == aem.n) {
            this.a.s.y($$3 == 1.0f);
        } else if ($$2 == aem.o && this.ag != null) {
            this.ag.c();
        }
    }

    private void a(hnh $$0, hif $$1, grp.a $$2) {
        if (this.ag == null) {
            this.ag = new hin();
        }
        this.ag.a($$0, $$1, this.a.e);
        gsb gsb2 = this.a.x;
        if (gsb2 instanceof grp) {
            grp $$3 = (grp)gsb2;
            $$3.a(this.ag, $$2);
        } else {
            this.a.j.e().i();
            this.a.c(new grp(this.ag, $$2));
        }
    }

    @Override
    public void a(aex $$0) {
        abb.a($$0, this, this.a.bk());
        fmu $$1 = $$0.b();
        fmw $$2 = this.a.r.a($$1);
        if ($$2 == null) {
            $$2 = fmw.a($$0.e(), $$0.f(), this.a.r.aq());
            this.a.r.a($$1, $$2);
        }
        $$0.a($$2);
        this.a.aM().a($$1, $$2);
    }

    @Override
    public void a(aes $$0) {
        abb.a($$0, this, this.a.bk());
        if ($$0.b()) {
            this.a.r.b($$0.e(), $$0.g(), $$0.f());
        } else {
            this.a.r.c($$0.e(), $$0.g(), $$0.f());
        }
    }

    @Override
    public void a(aht $$0) {
        abb.a($$0, this, this.a.bk());
        this.F.a($$0);
    }

    @Override
    public void a(agb $$0) {
        abb.a($$0, this, this.a.bk());
        amo $$1 = $$0.b();
        if ($$1 == null) {
            this.F.a(null, false);
        } else {
            ac $$2 = this.F.a($$1);
            this.F.a($$2, false);
        }
    }

    @Override
    public void a(adt $$0) {
        abb.a($$0, this, this.a.bk());
        this.M = new CommandDispatcher($$0.a(dz.a(this.Q, this.R), z));
    }

    @Override
    public void a(ahj $$0) {
        abb.a($$0, this, this.a.bk());
        this.a.ap().a($$0.b(), $$0.e());
    }

    @Override
    public void a(ads $$0) {
        abb.a($$0, this, this.a.bk());
        this.G.a($$0.e(), $$0.b());
    }

    @Override
    public void a(ahw $$0) {
        abb.a($$0, this, this.a.bk());
        this.N = new hih($$0.b(), $$0.e());
    }

    @Override
    public void a(afo $$0) {
        abb.a($$0, this, this.a.bk());
        ftm $$1 = $$0.a(this.B);
        if ($$1 != null) {
            this.a.s.a($$0.b(), $$1);
        }
    }

    @Override
    public void a(ahm $$0) {
        abb.a($$0, this, this.a.bk());
        if (!this.I.a($$0.b(), $$0.e())) {
            m.debug("Got unhandled response to tag query {}", (Object)$$0.b());
        }
    }

    @Override
    public void a(ade $$0) {
        abb.a($$0, this, this.a.bk());
        for (Object2IntMap.Entry $$1 : $$0.b().object2IntEntrySet()) {
            bdh $$2 = (bdh)$$1.getKey();
            int $$3 = $$1.getIntValue();
            this.a.s.x().a(this.a.s, $$2, $$3);
        }
        gsb gsb2 = this.a.x;
        if (gsb2 instanceof gsf) {
            gsf $$4 = (gsf)gsb2;
            $$4.o();
        }
    }

    @Override
    public void a(afs $$0) {
        abb.a($$0, this, this.a.bk());
        geu $$1 = this.a.s.y();
        if ($$0.e()) {
            $$1.b();
        }
        for (afs.a $$2 : $$0.b()) {
            $$1.a($$2.c());
            if ($$2.b()) {
                $$1.d($$2.c().a());
            }
            if (!$$2.a()) continue;
            gmz.a(this.a.aG(), $$2.c().b());
        }
        this.a($$1);
    }

    @Override
    public void a(aft $$0) {
        abb.a($$0, this, this.a.bk());
        geu $$1 = this.a.s.y();
        for (dsa $$2 : $$0.b()) {
            $$1.a($$2);
        }
        this.a($$1);
    }

    @Override
    public void a(afu $$0) {
        abb.a($$0, this, this.a.bk());
        geu $$1 = this.a.s.y();
        $$1.a($$0.b());
        this.a($$1);
    }

    private void a(geu $$0) {
        $$0.c();
        this.al.a($$0, this.B);
        gsb gsb2 = this.a.x;
        if (gsb2 instanceof gxa) {
            gxa $$1 = (gxa)((Object)gsb2);
            $$1.L();
        }
    }

    @Override
    public void a(ahv $$0) {
        abb.a($$0, this, this.a.bk());
        cgk $$1 = this.B.a($$0.b());
        if (!($$1 instanceof chl)) {
            return;
        }
        jd<cfk> $$2 = $$0.e();
        cfm $$3 = new cfm($$2, $$0.g(), $$0.f(), $$0.i(), $$0.h(), $$0.j(), null);
        if (!$$0.k()) {
            $$3.k();
        }
        ((chl)$$1).c($$3, null);
    }

    private <T> jq.a<T> a(amt<? extends jq<? extends T>> $$0, beh.a $$1) {
        jq $$2 = this.Q.f($$0);
        return $$2.a($$1.a($$2));
    }

    @Override
    public void a(abt $$0) {
        abb.a($$0, this, this.a.bk());
        ArrayList $$1 = new ArrayList($$0.b().size());
        boolean $$22 = this.b.e();
        $$0.b().forEach(($$2, $$3) -> {
            if (!$$22 || ju.a($$2)) {
                $$1.add(this.a((amt)$$2, (beh.a)$$3));
            }
        });
        $$1.forEach(jq.a::d);
        this.T = emb.a(this.Q, this.R);
        List<dlt> $$32 = List.copyOf(dkl.e().l());
        this.al.a($$32);
    }

    @Override
    public void a(afj $$0) {
    }

    @Override
    public void a(afk $$0) {
    }

    @Override
    public void a(afl $$0) {
        abb.a($$0, this, this.a.bk());
        cgk $$1 = this.B.a($$0.b());
        if ($$1 == this.a.s) {
            if (this.a.s.A()) {
                this.a.a(new grg($$0.e(), this.B.l().k(), this.a.s));
            } else {
                this.a.s.o();
            }
        }
    }

    @Override
    public void a(adn $$0) {
        abb.a($$0, this, this.a.bk());
        this.C.a($$0.b());
        this.C.a($$0.e());
    }

    @Override
    public void a(agj $$0) {
        abb.a($$0, this, this.a.bk());
        cgk $$1 = $$0.a(this.B);
        if ($$1 != null) {
            this.a.a($$1);
        }
    }

    @Override
    public void a(aep $$0) {
        abb.a($$0, this, this.a.bk());
        eqa $$1 = this.B.w();
        $$1.c($$0.b(), $$0.e());
        long $$2 = $$0.h();
        if ($$2 > 0L) {
            $$1.a($$0.g(), $$0.f(), $$2, this.B.au());
        } else {
            $$1.a($$0.f());
        }
        $$1.a($$0.i());
        $$1.c($$0.k());
        $$1.b($$0.j());
    }

    @Override
    public void a(age $$0) {
        abb.a($$0, this, this.a.bk());
        this.B.w().c($$0.e(), $$0.b());
    }

    @Override
    public void a(agf $$0) {
        abb.a($$0, this, this.a.bk());
        this.B.w().a($$0.b(), $$0.e(), $$0.f(), this.B.au());
    }

    @Override
    public void a(agg $$0) {
        abb.a($$0, this, this.a.bk());
        this.B.w().a($$0.b());
    }

    @Override
    public void a(agi $$0) {
        abb.a($$0, this, this.a.bk());
        this.B.w().c($$0.b());
    }

    @Override
    public void a(agh $$0) {
        abb.a($$0, this, this.a.bk());
        this.B.w().b($$0.b());
    }

    @Override
    public void a(adr $$0) {
        abb.a($$0, this, this.a.bk());
        this.a.j.d();
        if ($$0.b()) {
            this.a.j.a();
        }
    }

    @Override
    public void a(agc $$0) {
        abb.a($$0, this, this.a.bk());
        if (this.c == null) {
            return;
        }
        this.c.d = $$0.b();
        $$0.e().map(hit::b).ifPresent(this.c::a);
        hiu.b(this.c);
    }

    @Override
    public void a(adz $$0) {
        abb.a($$0, this, this.a.bk());
        this.G.a($$0.b(), $$0.e());
    }

    @Override
    public void a(agd $$0) {
        abb.a($$0, this, this.a.bk());
        this.a.j.a($$0.b(), false);
    }

    @Override
    public void a(ahe $$0) {
        abb.a($$0, this, this.a.bk());
        this.a.j.c($$0.b());
    }

    @Override
    public void a(ahc $$0) {
        abb.a($$0, this, this.a.bk());
        this.a.j.b($$0.b());
    }

    @Override
    public void a(ahf $$0) {
        abb.a($$0, this, this.a.bk());
        this.a.j.a($$0.b(), $$0.e(), $$0.f());
    }

    @Override
    public void a(ahl $$0) {
        abb.a($$0, this, this.a.bk());
        this.a.j.i().b($$0.b().getString().isEmpty() ? null : $$0.b());
        this.a.j.i().a($$0.e().getString().isEmpty() ? null : $$0.e());
    }

    @Override
    public void a(afw $$0) {
        abb.a($$0, this, this.a.bk());
        cgk cgk2 = $$0.a(this.B);
        if (cgk2 instanceof chl) {
            chl $$1 = (chl)cgk2;
            $$1.f($$0.e());
        }
    }

    @Override
    public void a(afm $$0) {
        abb.a($$0, this, this.a.bk());
        for (UUID $$1 : $$0.b()) {
            this.a.aQ().f($$1);
            hiq $$2 = this.D.remove($$1);
            if ($$2 == null) continue;
            this.E.remove($$2);
        }
    }

    @Override
    public void a(afn $$0) {
        abb.a($$0, this, this.a.bk());
        for (afn.b $$1 : $$0.f()) {
            hiq $$2 = new hiq(Objects.requireNonNull($$1.b()), this.M());
            if (this.D.putIfAbsent($$1.a(), $$2) != null) continue;
            this.a.aQ().a($$2);
        }
        for (afn.b $$3 : $$0.e()) {
            hiq $$4 = this.D.get($$3.a());
            if ($$4 == null) {
                m.warn("Ignoring player info update for unknown player {} ({})", (Object)$$3.a(), $$0.b());
                continue;
            }
            for (afn.a $$5 : $$0.b()) {
                this.a($$5, $$3, $$4);
            }
        }
    }

    private void a(afn.a $$0, afn.b $$1, hiq $$2) {
        switch ($$0) {
            case b: {
                this.a($$1, $$2);
                break;
            }
            case c: {
                if ($$2.e() != $$1.e() && this.a.s != null && this.a.s.cY().equals($$1.a())) {
                    this.a.s.a($$1.e());
                }
                $$2.a($$1.e());
                break;
            }
            case d: {
                if ($$1.c()) {
                    this.E.add($$2);
                    break;
                }
                this.E.remove($$2);
                break;
            }
            case e: {
                $$2.a($$1.d());
                break;
            }
            case f: {
                $$2.a($$1.f());
                break;
            }
            case h: {
                $$2.b($$1.g());
                break;
            }
            case g: {
                $$2.b($$1.h());
            }
        }
    }

    private void a(afn.b $$0, hiq $$1) {
        GameProfile $$2 = $$1.a();
        bgw $$3 = this.a.as().a();
        if ($$3 == null) {
            m.warn("Ignoring chat session from {} due to missing Services public key", (Object)$$2.name());
            $$1.a(this.M());
            return;
        }
        yz.a $$4 = $$0.i();
        if ($$4 != null) {
            try {
                yz $$5 = $$4.a($$2, $$3);
                $$1.a($$5);
            }
            catch (dds.b $$6) {
                m.error("Failed to validate profile key for player: '{}'", (Object)$$2.name(), (Object)$$6);
                $$1.a(this.M());
            }
        } else {
            $$1.a(this.M());
        }
    }

    private boolean M() {
        return this.a.as().b() && this.ah;
    }

    @Override
    public void a(afh $$0) {
        abb.a($$0, this, this.a.bk());
        hnh $$1 = this.a.s;
        $$1.gL().b = $$0.e();
        $$1.gL().d = $$0.g();
        $$1.gL().a = $$0.b();
        $$1.gL().c = $$0.f();
        $$1.gL().a($$0.h());
        $$1.gL().b($$0.i());
    }

    @Override
    public void a(ahh $$0) {
        abb.a($$0, this, this.a.bk());
        this.a.r.a((cgk)this.a.s, $$0.f(), $$0.g(), $$0.h(), $$0.b(), $$0.e(), $$0.i(), $$0.j(), $$0.k());
    }

    @Override
    public void a(ahg $$0) {
        abb.a($$0, this, this.a.bk());
        cgk $$1 = this.B.a($$0.f());
        if ($$1 == null) {
            return;
        }
        this.a.r.a((cgk)this.a.s, $$1, $$0.b(), $$0.e(), $$0.g(), $$0.h(), $$0.i());
    }

    @Override
    public void a(adk $$0) {
        abb.a($$0, this, this.a.bk());
        this.a.j.k().a($$0);
    }

    @Override
    public void a(ady $$0) {
        abb.a($$0, this, this.a.bk());
        if ($$0.e() == 0) {
            this.a.s.hh().a($$0.b());
        } else {
            this.a.s.hh().a($$0.b(), $$0.e());
        }
    }

    @Override
    public void a(afc $$0) {
        abb.a($$0, this, this.a.bk());
        cgk $$1 = this.a.s.du();
        if ($$1 != this.a.s && $$1.dv()) {
            ftm $$4;
            ftm $$2 = $$0.b();
            if ($$1.ch()) {
                ftm $$3 = $$1.l_().a();
            } else {
                $$4 = $$1.dI();
            }
            if ($$2.f($$4) > (double)1.0E-5f) {
                if ($$1.ch()) {
                    $$1.l_().f();
                }
                $$1.a($$2.a(), $$2.b(), $$2.c(), $$0.e(), $$0.f());
            }
            this.b.a(ajc.a($$1));
        }
    }

    @Override
    public void a(afd $$0) {
        abb.a($$0, this, this.a.bk());
        dlt $$1 = this.a.s.b($$0.b());
        gts.a $$2 = gts.a.a($$1);
        if ($$2 != null) {
            this.a.a(new gts($$2));
        }
    }

    @Override
    public void a(acd $$0) {
        this.b($$0);
    }

    private void b(acd $$0) {
        m.warn("Unknown custom packet payload: {}", (Object)$$0.a().a());
    }

    @Override
    public void a(agw $$0) {
        abb.a($$0, this, this.a.bk());
        String $$1 = $$0.b();
        if ($$0.f() == 0) {
            this.aj.a($$1, fuu.c, $$0.e(), $$0.g(), false, $$0.h().orElse(null));
        } else {
            fuj $$2 = this.aj.a($$1);
            if ($$2 != null) {
                if ($$0.f() == 1) {
                    this.aj.j($$2);
                } else if ($$0.f() == 2) {
                    $$2.a($$0.g());
                    $$2.a($$0.e());
                    $$2.b($$0.h().orElse(null));
                }
            }
        }
    }

    @Override
    public void a(aha $$0) {
        abb.a($$0, this, this.a.bk());
        String $$1 = $$0.e();
        fuq $$2 = fuq.c($$0.b());
        fuj $$3 = this.aj.a($$1);
        if ($$3 != null) {
            fup $$4 = this.aj.a($$2, $$3, true);
            $$4.a($$0.f());
            $$4.a((yh)$$0.g().orElse(null));
            $$4.a((aag)$$0.h().orElse(null));
        } else {
            m.warn("Received packet for unknown scoreboard objective: {}", (Object)$$1);
        }
    }

    @Override
    public void a(afx $$0) {
        abb.a($$0, this, this.a.bk());
        String $$1 = $$0.e();
        fuq $$2 = fuq.c($$0.b());
        if ($$1 == null) {
            this.aj.b($$2);
        } else {
            fuj $$3 = this.aj.a($$1);
            if ($$3 != null) {
                this.aj.e($$2, $$3);
            } else {
                m.warn("Received packet for unknown scoreboard objective: {}", (Object)$$1);
            }
        }
    }

    @Override
    public void a(ago $$0) {
        abb.a($$0, this, this.a.bk());
        String $$1 = $$0.e();
        fuj $$2 = $$1 == null ? null : this.aj.a($$1);
        this.aj.a($$0.b(), $$2);
    }

    @Override
    public void a(agz $$0) {
        fum $$3;
        abb.a($$0, this, this.a.bk());
        agz.a $$12 = $$0.e();
        if ($$12 == agz.a.a) {
            fum $$2 = this.aj.c($$0.f());
        } else {
            $$3 = this.aj.b($$0.f());
            if ($$3 == null) {
                m.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{$$0.f(), $$0.e(), $$0.b()});
                return;
            }
        }
        Optional<agz.b> $$4 = $$0.h();
        $$4.ifPresent($$1 -> {
            $$3.a($$1.a());
            $$3.a($$1.c());
            $$3.a($$1.b());
            $$3.a($$1.d());
            $$3.a($$1.e());
            $$3.b($$1.f());
            $$3.c($$1.g());
        });
        agz.a $$5 = $$0.b();
        if ($$5 == agz.a.a) {
            for (String $$6 : $$0.g()) {
                this.aj.a($$6, $$3);
            }
        } else if ($$5 == agz.a.b) {
            for (String $$7 : $$0.g()) {
                this.aj.b($$7, $$3);
            }
        }
        if ($$12 == agz.a.b) {
            this.aj.d($$3);
        }
    }

    @Override
    public void a(aet $$0) {
        abb.a($$0, this, this.a.bk());
        if ($$0.m() == 0) {
            double $$1 = $$0.l() * $$0.i();
            double $$2 = $$0.l() * $$0.j();
            double $$3 = $$0.l() * $$0.k();
            try {
                this.B.a($$0.n(), $$0.b(), $$0.e(), $$0.f(), $$0.g(), $$0.h(), $$1, $$2, $$3);
            }
            catch (Throwable $$4) {
                m.warn("Could not spawn particle effect {}", (Object)$$0.n());
            }
        } else {
            for (int $$5 = 0; $$5 < $$0.m(); ++$$5) {
                double $$6 = this.L.k() * (double)$$0.i();
                double $$7 = this.L.k() * (double)$$0.j();
                double $$8 = this.L.k() * (double)$$0.k();
                double $$9 = this.L.k() * (double)$$0.l();
                double $$10 = this.L.k() * (double)$$0.l();
                double $$11 = this.L.k() * (double)$$0.l();
                try {
                    this.B.a($$0.n(), $$0.b(), $$0.e(), $$0.f() + $$6, $$0.g() + $$7, $$0.h() + $$8, $$9, $$10, $$11);
                    continue;
                }
                catch (Throwable $$12) {
                    m.warn("Could not spawn particle effect {}", (Object)$$0.n());
                    return;
                }
            }
        }
    }

    @Override
    public void a(ahu $$0) {
        abb.a($$0, this, this.a.bk());
        cgk $$1 = this.B.a($$0.b());
        if ($$1 == null) {
            return;
        }
        if (!($$1 instanceof chl)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + String.valueOf($$1) + ")");
        }
        cip $$2 = ((chl)$$1).fw();
        for (ahu.a $$3 : $$0.e()) {
            cio $$4 = $$2.a($$3.a());
            if ($$4 == null) {
                m.warn("Entity {} does not have attribute {}", (Object)$$1, (Object)$$3.a().g());
                continue;
            }
            $$4.a($$3.b());
            $$4.f();
            for (ciq $$5 : $$3.c()) {
                $$4.b($$5);
            }
        }
    }

    @Override
    public void a(afg $$0) {
        abb.a($$0, this, this.a.bk());
        dhi $$1 = this.a.s.cn;
        if ($$1.l != $$0.b()) {
            return;
        }
        gsb gsb2 = this.a.x;
        if (gsb2 instanceof gxa) {
            gxa $$2 = (gxa)((Object)gsb2);
            $$2.a($$0.e());
        }
    }

    @Override
    public void a(aeu $$0) {
        abb.a($$0, this, this.a.bk());
        int $$1 = $$0.b();
        int $$2 = $$0.e();
        aev $$3 = $$0.f();
        this.B.a(() -> this.a($$1, $$2, $$3, true));
    }

    private void a(int $$0, int $$1, aev $$2, boolean $$3) {
        fkq $$4 = this.B.j().r();
        BitSet $$5 = $$2.a();
        BitSet $$6 = $$2.b();
        Iterator<byte[]> $$7 = $$2.c().iterator();
        this.a($$0, $$1, $$4, dww.a, $$5, $$6, $$7, $$3);
        BitSet $$8 = $$2.d();
        BitSet $$9 = $$2.e();
        Iterator<byte[]> $$10 = $$2.f().iterator();
        this.a($$0, $$1, $$4, dww.b, $$8, $$9, $$10, $$3);
        $$4.a(new dvu($$0, $$1), true);
    }

    @Override
    public void a(aey $$0) {
        abb.a($$0, this, this.a.bk());
        dhi $$1 = this.a.s.cn;
        if ($$0.b() == $$1.l && $$1 instanceof diu) {
            diu $$2 = (diu)$$1;
            $$2.a($$0.e());
            $$2.f($$0.g());
            $$2.g($$0.f());
            $$2.a($$0.h());
            $$2.b($$0.i());
        }
    }

    @Override
    public void a(agl $$0) {
        abb.a($$0, this, this.a.bk());
        this.J = $$0.b();
        this.a.k.b(this.J);
        this.B.j().a($$0.b());
    }

    @Override
    public void a(ahb $$0) {
        abb.a($$0, this, this.a.bk());
        this.K = $$0.b();
        this.B.i(this.K);
    }

    @Override
    public void a(agk $$0) {
        abb.a($$0, this, this.a.bk());
        this.B.j().d($$0.b(), $$0.e());
    }

    @Override
    public void a(adf $$0) {
        abb.a($$0, this, this.a.bk());
        this.B.b($$0.b());
    }

    @Override
    public void a(adm $$0) {
        abb.a($$0, this, this.a.bk());
        for (aay<hig> aay2 : $$0.b()) {
            aay2.a(this);
        }
    }

    @Override
    public void a(afr $$0) {
        abb.a($$0, this, this.a.bk());
        cgk $$1 = this.B.a($$0.b());
        if ($$1 instanceof dem) {
            dem $$2 = (dem)$$1;
            $$2.d = $$0.e();
        }
    }

    @Override
    public void a(adp $$0) {
        this.ad.a();
    }

    @Override
    public void a(ado $$0) {
        this.ad.a($$0.b());
        this.b(new aim(this.ad.b()));
    }

    @Override
    public void a(aef $$0) {
        this.a.aT().a($$0.b(), $$0.e());
    }

    @Override
    public void a(alj $$0) {
        this.ae.a($$0);
    }

    @Override
    public void a(ahp $$0) {
        abb.a($$0, this, this.a.bk());
        gsb gsb2 = this.a.x;
        if (gsb2 instanceof gvc) {
            gvc $$1 = (gvc)gsb2;
            $$1.a($$0.b(), $$0.e());
        }
    }

    @Override
    public void a(ahs $$0) {
        abb.a($$0, this, this.a.bk());
        $$0.a(this.ak);
    }

    @Override
    public void a(aec $$0) {
        abb.a($$0, this, this.a.bk());
        this.af.a(this.B.au(), $$0.b(), $$0.e());
    }

    @Override
    public void a(aeb $$0) {
        abb.a($$0, this, this.a.bk());
        this.af.a(this.B.au(), $$0.b(), $$0.e());
    }

    @Override
    public void a(aed $$0) {
        abb.a($$0, this, this.a.bk());
        cgk $$1 = this.B.a($$0.b());
        if ($$1 != null) {
            this.af.a(this.B.au(), $$1, $$0.e());
        }
    }

    @Override
    public void a(aee $$0) {
        abb.a($$0, this, this.a.bk());
        this.af.a(this.B.au(), $$0.b());
    }

    @Override
    public void a(aen $$0) {
        abb.a($$0, this, this.a.bk());
        this.a.e.e.a($$0.b(), $$0.e());
    }

    private void a(int $$0, int $$1, fkq $$2, dww $$3, BitSet $$4, BitSet $$5, Iterator<byte[]> $$6, boolean $$7) {
        for (int $$8 = 0; $$8 < $$2.c(); ++$$8) {
            int $$9 = $$2.d() + $$8;
            boolean $$10 = $$4.get($$8);
            boolean $$11 = $$5.get($$8);
            if (!$$10 && !$$11) continue;
            $$2.a($$3, jw.a($$0, $$9, $$1), $$10 ? new eql((byte[])$$6.next().clone()) : new eql());
            if (!$$7) continue;
            this.B.c($$0, $$9, $$1);
        }
    }

    public wu m() {
        return this.b;
    }

    @Override
    public boolean c() {
        return this.b.i() && !this.ai;
    }

    public Collection<hiq> n() {
        return this.E;
    }

    public Collection<hiq> o() {
        return this.D.values();
    }

    public Collection<UUID> p() {
        return this.D.keySet();
    }

    public @Nullable hiq a(UUID $$0) {
        return this.D.get($$0);
    }

    public @Nullable hiq a(String $$0) {
        for (hiq $$1 : this.D.values()) {
            if (!$$1.a().name().equals($$0)) continue;
            return $$1;
        }
        return null;
    }

    public Map<UUID, hiq> q() {
        return this.j;
    }

    public @Nullable hiq b(String $$0) {
        for (hiq $$1 : this.D.values()) {
            if (!$$1.a().name().equalsIgnoreCase($$0)) continue;
            return $$1;
        }
        return null;
    }

    public GameProfile r() {
        return this.A;
    }

    public hhy s() {
        return this.F;
    }

    public CommandDispatcher<hij> t() {
        return this.M;
    }

    public hif u() {
        return this.B;
    }

    public gey v() {
        return this.I;
    }

    public UUID w() {
        return this.O;
    }

    public Set<amt<dwo>> x() {
        return this.P;
    }

    public jr.b y() {
        return this.Q;
    }

    public void a(yu $$0, boolean $$1) {
        if (this.Z.a($$0, $$1) && this.Z.c() > 64) {
            this.N();
        }
    }

    private void N() {
        int $$0 = this.Z.a();
        if ($$0 > 0) {
            this.b(new aih($$0));
        }
    }

    public void c(String $$0) {
        Instant $$1 = Instant.now();
        long $$2 = bfb.c.a();
        yq.a $$3 = this.Z.b();
        yu $$4 = this.X.pack(new zb($$0, $$1, $$2, $$3.a()));
        this.b(new aik($$0, $$1, $$2, $$4, $$3.b()));
    }

    public void d(String $$0) {
        za $$1 = za.b(this.M.parse($$0, (Object)this.G));
        if ($$1.a().isEmpty()) {
            this.b(new aii($$0));
            return;
        }
        Instant $$2 = Instant.now();
        long $$32 = bfb.c.a();
        yq.a $$4 = this.Z.b();
        ek $$5 = ek.a($$1, (String $$3) -> {
            zb $$4 = new zb($$3, $$2, $$32, $$4.a());
            return this.X.pack($$4);
        });
        this.b(new aij($$0, $$2, $$32, $$5, $$4.b()));
    }

    public void a(String $$0, @Nullable gsb $$1) {
        switch (this.e($$0).ordinal()) {
            case 0: {
                this.b(new aii($$0));
                this.a.a($$1);
                break;
            }
            case 1: {
                this.a($$0, "multiplayer.confirm_command.parse_errors", $$1);
                break;
            }
            case 3: {
                this.a($$0, "multiplayer.confirm_command.permissions_required", $$1);
                break;
            }
            case 2: {
                this.b($$0, "multiplayer.confirm_command.signature_required", $$1);
            }
        }
    }

    private a e(String $$0) {
        ParseResults $$1 = this.M.parse($$0, (Object)this.G);
        if (!hig.a($$1)) {
            return hig$a.b;
        }
        if (za.a($$1)) {
            return hig$a.c;
        }
        ParseResults $$2 = this.M.parse($$0, (Object)this.H);
        if (!hig.a($$2)) {
            return hig$a.d;
        }
        return hig$a.a;
    }

    private static boolean a(ParseResults<?> $$0) {
        return !$$0.getReader().canRead() && $$0.getExceptions().isEmpty() && $$0.getContext().getLastChild().getCommand() != null;
    }

    private void a(String $$0, String $$1, yh $$22, Runnable $$3) {
        gsb $$4 = this.a.x;
        this.a.a(new gra($$2 -> {
            if ($$2) {
                $$3.run();
            } else {
                this.a.a($$4);
            }
        }, s, yh.a($$1, yh.b($$0).a(l.o)), $$22, $$4 != null ? yg.k : yg.e));
    }

    private void a(String $$0, String $$1, @Nullable gsb $$2) {
        this.a($$0, $$1, t, () -> {
            this.b(new aii($$0));
            this.a.a($$2);
        });
    }

    private void b(String $$0, String $$1, @Nullable gsb $$2) {
        boolean $$3 = $$2 == null && this.a.O().a(this.a.Y());
        this.a($$0, $$1, $$3 ? u : yg.o, () -> {
            if ($$3) {
                this.a.a(gjf.c.b);
                gsb $$3 = this.a.x;
                if ($$3 instanceof gqy) {
                    gqy $$4 = (gqy)$$3;
                    $$4.a_($$0, false);
                }
            } else {
                this.a.o.a("/" + $$0);
                this.a.a($$2);
            }
        });
    }

    public void a(awp $$0) {
        if (!$$0.equals(this.ac)) {
            this.b(new abw($$0));
            this.ac = $$0;
        }
    }

    @Override
    public void d() {
        if (this.W != null && this.a.A().b()) {
            this.z();
        }
        if (this.ab != null && this.ab.isDone()) {
            this.ab.join().ifPresent(this::a);
            this.ab = null;
        }
        this.g();
        if (this.a.aT().d()) {
            this.ae.a();
        }
        if (this.B != null) {
            this.af.a(this.B.au());
        }
        this.e.a();
        if (this.ag != null) {
            this.ag.a();
            if (this.ag.b()) {
                this.O();
                this.ag = null;
            }
        }
    }

    private void O() {
        if (!this.K()) {
            this.b.a(new ajl());
            this.a(true);
        }
    }

    public void z() {
        this.ab = this.a.A().a();
    }

    private void a(ddr $$0) {
        if (!this.a.b(this.A.id())) {
            return;
        }
        if (this.W != null && this.W.c().equals($$0)) {
            return;
        }
        this.W = yt.a($$0);
        this.X = this.W.a(this.A.id());
        this.b(new ail(this.W.a().a()));
    }

    @Override
    protected gsr e() {
        return new hia.a(){

            @Override
            public void a(String $$0, @Nullable gsb $$1) {
                hig.this.a($$0, $$1);
            }
        };
    }

    public @Nullable hit A() {
        return this.c;
    }

    public dgz B() {
        return this.R;
    }

    public boolean a(dgz $$0) {
        return $$0.a(this.B());
    }

    public fur C() {
        return this.aj;
    }

    public dnq D() {
        return this.S;
    }

    public emb E() {
        return this.T;
    }

    public void F() {
        this.al.a();
    }

    public hiw G() {
        return this.al;
    }

    public void a(hhw<?, ?> $$0) {
        this.am.add(new WeakReference($$0));
    }

    public wz.a H() {
        return this.U;
    }

    public iry I() {
        return this.ak;
    }

    public bxg J() {
        return this.af.a(this.B);
    }

    public boolean K() {
        return this.an;
    }

    private void a(boolean $$0) {
        this.an = $$0;
    }

    static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a();
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        private static final /* synthetic */ a[] e;

        public static a[] values() {
            return (a[])e.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d};
        }

        static {
            e = hig$a.a();
        }
    }
}

