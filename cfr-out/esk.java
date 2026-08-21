/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.ContiguousSet
 *  com.google.common.collect.DiscreteDomain
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Range
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Lists;
import com.google.common.collect.Range;
import com.google.common.collect.Sets;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class esk {
    private static final Logger d = LogUtils.getLogger();
    private static final int e = 1200;
    private static final int f = 100;
    public static final int a = 20;
    private static final int g = 8;
    public static final int b = 9;
    private static final int h = 20;
    private static final int i = 96;
    public static final int c = 128;
    private final Predicate<cgk> j;
    private final axb k = (axb)new axb(yh.c("entity.minecraft.ender_dragon"), ccs.a.a, ccs.b.a).b(true).c(true);
    private final axf l;
    private final is m;
    private final ObjectArrayList<Integer> n = new ObjectArrayList();
    private final eom o;
    private int p;
    private int q;
    private int r;
    private int s = 21;
    private boolean t;
    private boolean u;
    private boolean v = false;
    private @Nullable UUID w;
    private boolean x = true;
    private @Nullable is y;
    private @Nullable esj z;
    private int A;
    private @Nullable List<cyb> B;

    public esk(axf $$0, long $$1, a $$2) {
        this($$0, $$1, $$2, is.c);
    }

    public esk(axf $$0, long $$1, a $$2, is $$3) {
        this.l = $$0;
        this.m = $$3;
        this.j = cgs.a.and(cgs.a($$3.u(), 128 + $$3.v(), $$3.w(), 192.0));
        this.x = $$2.c;
        this.w = $$2.g.orElse(null);
        this.t = $$2.d;
        this.u = $$2.e;
        if ($$2.f) {
            this.z = esj.a;
        }
        this.y = $$2.h.orElse(null);
        this.n.addAll((Collection)$$2.i.orElseGet(() -> {
            ObjectArrayList $$1 = new ObjectArrayList((Collection)ContiguousSet.create((Range)Range.closedOpen((Comparable)Integer.valueOf(0), (Comparable)Integer.valueOf(20)), (DiscreteDomain)DiscreteDomain.integers()));
            bhs.c($$1, bgr.a($$1));
            return $$1;
        }));
        this.o = eon.a().a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ").a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ").a("       ", "       ", "       ", "   #   ", "       ", "       ", "       ").a("  ###  ", " #   # ", "#     #", "#  #  #", "#     #", " #   # ", "  ###  ").a("       ", "  ###  ", " ##### ", " ##### ", " ##### ", "  ###  ", "       ").a('#', eol.a(eop.a(dzs.I))).b();
    }

    @Deprecated
    @VisibleForTesting
    public void a() {
        this.v = true;
    }

    public a b() {
        return new a(this.x, this.t, this.u, false, Optional.ofNullable(this.w), Optional.ofNullable(this.y), Optional.of(this.n));
    }

    public void c() {
        this.k.d(!this.t);
        if (++this.s >= 20) {
            this.o();
            this.s = 0;
        }
        if (!this.k.h().isEmpty()) {
            this.l.p().b(axm.i, new dvu(0, 0), 9);
            boolean $$0 = this.n();
            if (this.x && $$0) {
                this.j();
                this.x = false;
            }
            if (this.z != null) {
                if (this.B == null && $$0) {
                    this.z = null;
                    this.g();
                }
                this.z.a(this.l, this, this.B, this.A++, this.y);
            }
            if (!this.t) {
                if ((this.w == null || ++this.p >= 1200) && $$0) {
                    this.k();
                    this.p = 0;
                }
                if (++this.r >= 100 && $$0) {
                    this.p();
                    this.r = 0;
                }
            }
        } else {
            this.l.p().c(axm.i, new dvu(0, 0), 9);
        }
    }

    private void j() {
        d.info("Scanning for legacy world dragon fight...");
        boolean $$0 = this.l();
        if ($$0) {
            d.info("Found that the dragon has been killed in this world already.");
            this.u = true;
        } else {
            d.info("Found that the dragon has not yet been killed in this world.");
            this.u = false;
            if (this.m() == null) {
                this.a(false);
            }
        }
        List<? extends cyc> $$1 = this.l.m();
        if ($$1.isEmpty()) {
            this.t = true;
        } else {
            cyc $$2 = $$1.get(0);
            this.w = $$2.cY();
            d.info("Found that there's a dragon still alive ({})", (Object)$$2);
            this.t = false;
            if (!$$0) {
                d.info("But we didn't have a portal, let's remove it.");
                $$2.aC();
                this.w = null;
            }
        }
        if (!this.u && this.t) {
            this.t = false;
        }
    }

    private void k() {
        List<? extends cyc> $$0 = this.l.m();
        if ($$0.isEmpty()) {
            d.debug("Haven't seen the dragon, respawning it");
            this.r();
        } else {
            d.debug("Haven't seen our dragon, but found another one to use.");
            this.w = $$0.get(0).cY();
        }
    }

    protected void a(esj $$0) {
        if (this.z == null) {
            throw new IllegalStateException("Dragon respawn isn't in progress, can't skip ahead in the animation.");
        }
        this.A = 0;
        if ($$0 == esj.e) {
            this.z = null;
            this.t = false;
            cyc $$1 = this.r();
            if ($$1 != null) {
                for (axg $$2 : this.k.h()) {
                    aj.o.a($$2, $$1);
                }
            }
        } else {
            this.z = $$0;
        }
    }

    private boolean l() {
        for (int $$0 = -8; $$0 <= 8; ++$$0) {
            for (int $$1 = -8; $$1 <= 8; ++$$1) {
                eqq $$2 = this.l.d($$0, $$1);
                for (elb $$3 : $$2.J().values()) {
                    if (!($$3 instanceof enb)) continue;
                    return true;
                }
            }
        }
        return false;
    }

    private @Nullable eom.b m() {
        int $$8;
        dvu $$0 = new dvu(this.m);
        for (int $$1 = -8 + $$0.h; $$1 <= 8 + $$0.h; ++$$1) {
            for (int $$2 = -8 + $$0.i; $$2 <= 8 + $$0.i; ++$$2) {
                eqq $$3 = this.l.d($$1, $$2);
                for (elb $$4 : $$3.J().values()) {
                    eom.b $$5;
                    if (!($$4 instanceof enb) || ($$5 = this.o.a(this.l, $$4.aD_())) == null) continue;
                    is $$6 = $$5.a(3, 3, 3).d();
                    if (this.y == null) {
                        this.y = $$6;
                    }
                    return $$5;
                }
            }
        }
        is $$7 = exv.a(this.m);
        for (int $$9 = $$8 = this.l.a(euq.a.e, $$7).v(); $$9 >= this.l.K_(); --$$9) {
            eom.b $$10 = this.o.a(this.l, new is($$7.u(), $$9, $$7.w()));
            if ($$10 == null) continue;
            if (this.y == null) {
                this.y = $$10.a(3, 3, 3).d();
            }
            return $$10;
        }
        return null;
    }

    private boolean n() {
        if (this.v) {
            return true;
        }
        dvu $$0 = new dvu(this.m);
        for (int $$1 = -8 + $$0.h; $$1 <= 8 + $$0.h; ++$$1) {
            for (int $$2 = 8 + $$0.i; $$2 <= 8 + $$0.i; ++$$2) {
                eqf $$3 = this.l.a($$1, $$2, erj.n, false);
                if (!($$3 instanceof eqq)) {
                    return false;
                }
                awt $$4 = ((eqq)$$3).G();
                if ($$4.a(awt.c)) continue;
                return false;
            }
        }
        return true;
    }

    private void o() {
        HashSet $$0 = Sets.newHashSet();
        for (axg $$1 : this.l.a(this.j)) {
            this.k.a($$1);
            $$0.add($$1);
        }
        HashSet $$2 = Sets.newHashSet(this.k.h());
        $$2.removeAll($$0);
        for (axg $$3 : $$2) {
            this.k.b($$3);
        }
    }

    private void p() {
        this.r = 0;
        this.q = 0;
        for (ezh.a $$0 : ezh.a(this.l)) {
            this.q += this.l.a(cyb.class, $$0.f()).size();
        }
        d.debug("Found {} end crystals still alive", (Object)this.q);
    }

    public void a(cyc $$0) {
        if ($$0.cY().equals(this.w)) {
            this.k.a(0.0f);
            this.k.d(false);
            this.a(true);
            this.q();
            if (!this.u) {
                this.l.c(this.l.a(euq.a.e, exv.a(this.m)), dzs.gp.m());
            }
            this.u = true;
            this.t = true;
        }
    }

    @Deprecated
    @VisibleForTesting
    public void d() {
        this.n.clear();
    }

    private void q() {
        if (this.n.isEmpty()) {
            return;
        }
        int $$0 = (Integer)this.n.remove(this.n.size() - 1);
        int $$1 = bgj.c(96.0 * Math.cos(2.0 * (-Math.PI + 0.15707963267948966 * (double)$$0)));
        int $$2 = bgj.c(96.0 * Math.sin(2.0 * (-Math.PI + 0.15707963267948966 * (double)$$0)));
        this.a(new is($$1, 75, $$2));
    }

    private void a(is $$02) {
        this.l.c(3000, $$02, 0);
        this.l.J_().a(mj.aY).flatMap($$0 -> $$0.a(rr.d)).ifPresent($$1 -> ((exi)$$1.a()).a(this.l, this.l.p().g(), bgr.a(), $$02));
    }

    private void a(boolean $$0) {
        exv $$1 = new exv($$0);
        if (this.y == null) {
            this.y = this.l.a(euq.a.f, exv.a(this.m)).e();
            while (this.l.a_(this.y).a(dzs.I) && this.y.v() > 63) {
                this.y = this.y.e();
            }
            this.y = this.y.h(Math.max(this.l.K_() + 1, this.y.v()));
        }
        if ($$1.a(fac.m, this.l, this.l.p().g(), bgr.a(), this.y)) {
            int $$2 = bgj.f(4, 16);
            this.l.p().a.a(new dvu(this.y), $$2);
        }
    }

    private @Nullable cyc r() {
        this.l.q(new is(this.m.u(), 128 + this.m.v(), this.m.w()));
        cyc $$0 = cgu.T.a(this.l, cgt.h);
        if ($$0 != null) {
            $$0.a(this);
            $$0.c(this.m);
            $$0.gN().a(cyt.a);
            $$0.b(this.m.u(), 128 + this.m.v(), this.m.w(), this.l.y.i() * 360.0f, 0.0f);
            this.l.b($$0);
            this.w = $$0.cY();
        }
        return $$0;
    }

    public void b(cyc $$0) {
        if ($$0.cY().equals(this.w)) {
            this.k.a($$0.eZ() / $$0.fq());
            this.p = 0;
            if ($$0.i_()) {
                this.k.a($$0.R_());
            }
        }
    }

    public int e() {
        return this.q;
    }

    public void a(cyb $$0, cex $$1) {
        if (this.z != null && this.B.contains($$0)) {
            d.debug("Aborting respawn sequence");
            this.z = null;
            this.A = 0;
            this.h();
            this.a(true);
        } else {
            this.p();
            cgk $$2 = this.l.d(this.w);
            if ($$2 instanceof cyc) {
                cyc $$3 = (cyc)$$2;
                $$3.a(this.l, $$0, $$0.dK(), $$1);
            }
        }
    }

    public boolean f() {
        return this.u;
    }

    public void g() {
        if (this.t && this.z == null) {
            is $$0 = this.y;
            if ($$0 == null) {
                d.debug("Tried to respawn, but need to find the portal first.");
                eom.b $$1 = this.m();
                if ($$1 == null) {
                    d.debug("Couldn't find a portal, so we made one.");
                    this.a(true);
                } else {
                    d.debug("Found the exit portal & saved its location for next time.");
                }
                $$0 = this.y;
            }
            ArrayList $$2 = Lists.newArrayList();
            is $$3 = $$0.b(1);
            for (iz $$4 : iz.c.a) {
                List<cyb> $$5 = this.l.a(cyb.class, new fth($$3.a($$4, 2)));
                if ($$5.isEmpty()) {
                    return;
                }
                $$2.addAll($$5);
            }
            d.debug("Found all crystals, respawning dragon.");
            this.a($$2);
        }
    }

    private void a(List<cyb> $$0) {
        if (this.t && this.z == null) {
            eom.b $$1 = this.m();
            while ($$1 != null) {
                for (int $$2 = 0; $$2 < this.o.c(); ++$$2) {
                    for (int $$3 = 0; $$3 < this.o.b(); ++$$3) {
                        for (int $$4 = 0; $$4 < this.o.a(); ++$$4) {
                            eol $$5 = $$1.a($$2, $$3, $$4);
                            if (!$$5.a().a(dzs.I) && !$$5.a().a(dzs.gm)) continue;
                            this.l.c($$5.d(), dzs.go.m());
                        }
                    }
                }
                $$1 = this.m();
            }
            this.z = esj.a;
            this.A = 0;
            this.a(false);
            this.B = $$0;
        }
    }

    public void h() {
        for (ezh.a $$0 : ezh.a(this.l)) {
            List<cyb> $$1 = this.l.a(cyb.class, $$0.f());
            for (cyb $$2 : $$1) {
                $$2.n(false);
                $$2.a((is)null);
            }
        }
    }

    public @Nullable UUID i() {
        return this.w;
    }

    public static final class a
    extends Record {
        final boolean c;
        final boolean d;
        final boolean e;
        final boolean f;
        final Optional<UUID> g;
        final Optional<is> h;
        final Optional<List<Integer>> i;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.BOOL.fieldOf("NeedsStateScanning").orElse((Object)true).forGetter(a::a), (App)Codec.BOOL.fieldOf("DragonKilled").orElse((Object)false).forGetter(a::b), (App)Codec.BOOL.fieldOf("PreviouslyKilled").orElse((Object)false).forGetter(a::c), (App)Codec.BOOL.lenientOptionalFieldOf("IsRespawning", (Object)false).forGetter(a::d), (App)jx.a.lenientOptionalFieldOf("Dragon").forGetter(a::e), (App)is.a.lenientOptionalFieldOf("ExitPortalLocation").forGetter(a::f), (App)Codec.list((Codec)Codec.INT).lenientOptionalFieldOf("Gateways").forGetter(a::g)).apply((Applicative)$$0, a::new));
        public static final a b = new a(true, false, false, false, Optional.empty(), Optional.empty(), Optional.empty());

        public a(boolean $$0, boolean $$1, boolean $$2, boolean $$3, Optional<UUID> $$4, Optional<is> $$5, Optional<List<Integer>> $$6) {
            this.c = $$0;
            this.d = $$1;
            this.e = $$2;
            this.f = $$3;
            this.g = $$4;
            this.h = $$5;
            this.i = $$6;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "needsStateScanning;dragonKilled;previouslyKilled;isRespawning;dragonUUID;exitPortalLocation;gateways", "c", "d", "e", "f", "g", "h", "i"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "needsStateScanning;dragonKilled;previouslyKilled;isRespawning;dragonUUID;exitPortalLocation;gateways", "c", "d", "e", "f", "g", "h", "i"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "needsStateScanning;dragonKilled;previouslyKilled;isRespawning;dragonUUID;exitPortalLocation;gateways", "c", "d", "e", "f", "g", "h", "i"}, this, $$0);
        }

        public boolean a() {
            return this.c;
        }

        public boolean b() {
            return this.d;
        }

        public boolean c() {
            return this.e;
        }

        public boolean d() {
            return this.f;
        }

        public Optional<UUID> e() {
            return this.g;
        }

        public Optional<is> f() {
            return this.h;
        }

        public Optional<List<Integer>> g() {
            return this.i;
        }
    }
}

