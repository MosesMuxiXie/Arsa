/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.shorts.ShortList
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class eqq
extends eqf
implements bxh {
    static final Logger m = LogUtils.getLogger();
    private static final enc n = new enc(){

        @Override
        public void a() {
        }

        @Override
        public boolean b() {
            return true;
        }

        @Override
        public is c() {
            return is.c;
        }

        @Override
        public String d() {
            return "<null>";
        }
    };
    private final Map<is, d> o = Maps.newHashMap();
    private boolean p;
    final dwo q;
    private @Nullable Supplier<awt> r;
    private @Nullable c s;
    private final Int2ObjectMap<etn> t;
    private final fuz<dzq> u;
    private final fuz<fla> v;
    private e w = $$0 -> {};

    public eqq(dwo $$0, dvu $$1) {
        this($$0, $$1, erf.a, new fuz<dzq>(), new fuz<fla>(), 0L, null, null, null);
    }

    public eqq(dwo $$02, dvu $$1, erf $$2, fuz<dzq> $$3, fuz<fla> $$4, long $$5, eqr @Nullable [] $$6, @Nullable c $$7, @Nullable evt $$8) {
        super($$1, $$2, $$02, $$02.at(), $$5, $$6, $$8);
        this.q = $$02;
        this.t = new Int2ObjectOpenHashMap();
        for (euq.a $$9 : euq.a.values()) {
            if (!erj.n.e().contains($$9)) continue;
            this.g.put($$9, new euq(this, $$9));
        }
        this.s = $$7;
        this.u = $$3;
        this.v = $$4;
    }

    public eqq(axf $$0, erb $$1, @Nullable c $$2) {
        this($$0, $$1.f(), $$1.t(), $$1.L(), $$1.M(), $$1.w(), $$1.d(), $$2, $$1.v());
        if (!Collections.disjoint($$1.i.keySet(), $$1.j.keySet())) {
            m.error("Chunk at {} contains duplicated block entities", (Object)$$1.f());
        }
        for (elb $$3 : $$1.I().values()) {
            this.a($$3);
        }
        this.i.putAll($$1.K());
        for (int $$4 = 0; $$4 < $$1.p().length; ++$$4) {
            this.b[$$4] = $$1.p()[$$4];
        }
        this.a($$1.g());
        this.b($$1.h());
        for (Map.Entry<euq.a, euq> $$5 : $$1.e()) {
            if (!erj.n.e().contains($$5.getKey())) continue;
            this.a($$5.getKey(), $$5.getValue().a());
        }
        this.h = $$1.h;
        this.a($$1.x());
        this.i();
    }

    public void a(e $$0) {
        this.w = $$0;
        if (this.m()) {
            $$0.setUnsaved(this.c);
        }
    }

    @Override
    public void i() {
        boolean $$0 = this.m();
        super.i();
        if (!$$0) {
            this.w.setUnsaved(this.c);
        }
    }

    @Override
    public fvh<dzq> q() {
        return this.u;
    }

    @Override
    public fvh<fla> r() {
        return this.v;
    }

    @Override
    public eqf.b a(long $$0) {
        return new eqf.b(this.u.a($$0), this.v.a($$0));
    }

    @Override
    public etn a(int $$0) {
        dwo dwo2 = this.q;
        if (dwo2 instanceof axf) {
            axf $$1 = (axf)dwo2;
            return (etn)this.t.computeIfAbsent($$0, $$2 -> new etj($$1, $$0, this::c));
        }
        return super.a($$0);
    }

    @Override
    public eoh a_(is $$0) {
        int $$1 = $$0.u();
        int $$2 = $$0.v();
        int $$3 = $$0.w();
        if (this.q.ar()) {
            eoh $$4 = null;
            if ($$2 == 60) {
                $$4 = dzs.iO.m();
            }
            if ($$2 == 70) {
                $$4 = euh.a($$1, $$3);
            }
            return $$4 == null ? dzs.a.m() : $$4;
        }
        try {
            eqr $$6;
            int $$5 = this.f($$2);
            if ($$5 >= 0 && $$5 < this.l.length && !($$6 = this.l[$$5]).c()) {
                return $$6.a($$1 & 0xF, $$2 & 0xF, $$3 & 0xF);
            }
            return dzs.a.m();
        }
        catch (Throwable $$7) {
            m $$8 = m.a($$7, "Getting block state");
            n $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> n.a((dwq)this, $$1, $$2, $$3));
            throw new v($$8);
        }
    }

    @Override
    public flb b_(is $$0) {
        return this.a($$0.u(), $$0.v(), $$0.w());
    }

    public flb a(int $$0, int $$1, int $$2) {
        try {
            eqr $$4;
            int $$3 = this.f($$1);
            if ($$3 >= 0 && $$3 < this.l.length && !($$4 = this.l[$$3]).c()) {
                return $$4.b($$0 & 0xF, $$1 & 0xF, $$2 & 0xF);
            }
            return flc.a.g();
        }
        catch (Throwable $$5) {
            m $$6 = m.a($$5, "Getting fluid state");
            n $$7 = $$6.a("Block being got");
            $$7.a("Location", () -> n.a((dwq)this, $$0, $$1, $$2));
            throw new v($$6);
        }
    }

    @Override
    public @Nullable eoh a(is $$0, eoh $$1, @dzq.b int $$2) {
        dwo dwo2;
        boolean $$15;
        int $$8;
        int $$7;
        int $$3 = $$0.v();
        eqr $$4 = this.b(this.f($$3));
        boolean $$5 = $$4.c();
        if ($$5 && $$1.l()) {
            return null;
        }
        int $$6 = $$0.u() & 0xF;
        eoh $$9 = $$4.a($$6, $$7 = $$3 & 0xF, $$8 = $$0.w() & 0xF, $$1);
        if ($$9 == $$1) {
            return null;
        }
        dzq $$10 = $$1.b();
        ((euq)this.g.get(euq.a.e)).a($$6, $$3, $$8, $$1);
        ((euq)this.g.get(euq.a.f)).a($$6, $$3, $$8, $$1);
        ((euq)this.g.get(euq.a.d)).a($$6, $$3, $$8, $$1);
        ((euq)this.g.get(euq.a.b)).a($$6, $$3, $$8, $$1);
        boolean $$11 = $$4.c();
        if ($$5 != $$11) {
            this.q.ac().r().a($$0, $$11);
            this.q.ac().a(this.c.h, jw.a($$3), this.c.i, $$11);
        }
        if (fks.a($$9, $$1)) {
            bzm $$12 = bzl.a();
            $$12.a("updateSkyLightSources");
            this.h.a((dvt)this, $$6, $$3, $$8);
            $$12.b("queueCheckLight");
            this.q.ac().r().a($$0);
            $$12.c();
        }
        boolean $$13 = !$$9.a($$10);
        boolean $$14 = ($$2 & 0x40) != 0;
        boolean bl2 = $$15 = ($$2 & 0x100) == 0;
        if ($$13 && $$9.x() && !$$1.a($$9)) {
            elb $$16;
            if (!this.q.B_() && $$15 && ($$16 = this.q.c_($$0)) != null) {
                $$16.a($$0, $$9);
            }
            this.c($$0);
        }
        if (($$13 || $$10 instanceof dzf) && (dwo2 = this.q) instanceof axf) {
            axf $$17 = (axf)dwo2;
            if (($$2 & 1) != 0 || $$14) {
                $$9.a($$17, $$0, $$14);
            }
        }
        if (!$$4.a($$6, $$7, $$8).a($$10)) {
            return null;
        }
        if (!this.q.B_() && ($$2 & 0x200) == 0) {
            $$1.a(this.q, $$0, $$9, $$14);
        }
        if ($$1.x()) {
            elb $$18 = this.a($$0, eqq$b.c);
            if ($$18 != null && !$$18.b($$1)) {
                m.warn("Found mismatched block entity @ {}: type = {}, state = {}", new Object[]{$$0, $$18.s().a().h().a(), $$1});
                this.c($$0);
                $$18 = null;
            }
            if ($$18 == null) {
                $$18 = ((ecn)((Object)$$10)).a($$0, $$1);
                if ($$18 != null) {
                    this.b($$18);
                }
            } else {
                $$18.c($$1);
                this.c($$18);
            }
        }
        this.i();
        return $$9;
    }

    @Override
    @Deprecated
    public void a(cgk $$0) {
    }

    private @Nullable elb g(is $$0) {
        eoh $$1 = this.a_($$0);
        if (!$$1.x()) {
            return null;
        }
        return ((ecn)((Object)$$1.b())).a($$0, $$1);
    }

    @Override
    public @Nullable elb c_(is $$0) {
        return this.a($$0, eqq$b.c);
    }

    public @Nullable elb a(is $$0, b $$1) {
        elb $$4;
        uz $$3;
        elb $$2 = (elb)this.j.get($$0);
        if ($$2 == null && ($$3 = (uz)this.i.remove($$0)) != null && ($$4 = this.a($$0, $$3)) != null) {
            return $$4;
        }
        if ($$2 == null) {
            if ($$1 == eqq$b.a && ($$2 = this.g($$0)) != null) {
                this.b($$2);
            }
        } else if ($$2.p()) {
            this.j.remove($$0);
            return null;
        }
        return $$2;
    }

    public void b(elb $$0) {
        this.a($$0);
        if (this.M()) {
            dwo dwo2 = this.q;
            if (dwo2 instanceof axf) {
                axf $$1 = (axf)dwo2;
                this.b($$0, $$1);
            }
            this.q.a($$0);
            this.c($$0);
        }
    }

    private boolean M() {
        return this.p || this.q.B_();
    }

    boolean h(is $$0) {
        if (!this.q.w().a($$0)) {
            return false;
        }
        dwo dwo2 = this.q;
        if (dwo2 instanceof axf) {
            axf $$1 = (axf)dwo2;
            return this.G().a(awt.c) && $$1.c(dvu.a($$0));
        }
        return true;
    }

    @Override
    public void a(elb $$0) {
        is $$1 = $$0.aD_();
        eoh $$2 = this.a_($$1);
        if (!$$2.x()) {
            m.warn("Trying to set block entity {} at position {}, but state {} does not allow it", new Object[]{$$0, $$1, $$2});
            return;
        }
        eoh $$3 = $$0.o();
        if ($$2 != $$3) {
            if (!$$0.s().a($$2)) {
                m.warn("Trying to set block entity {} at position {}, but state {} does not allow it", new Object[]{$$0, $$1, $$2});
                return;
            }
            if ($$2.b() != $$3.b()) {
                m.warn("Block state mismatch on block entity {} in position {}, {} != {}, updating", new Object[]{$$0, $$1, $$2, $$3});
            }
            $$0.c($$2);
        }
        $$0.a(this.q);
        $$0.q();
        elb $$4 = this.j.put($$1.j(), $$0);
        if ($$4 != null && $$4 != $$0) {
            $$4.ay_();
        }
    }

    @Override
    public @Nullable uz a(is $$0, jf.a $$1) {
        elb $$2 = this.c_($$0);
        if ($$2 != null && !$$2.p()) {
            uz $$3 = $$2.b(this.q.J_());
            $$3.a("keepPacked", false);
            return $$3;
        }
        uz $$4 = (uz)this.i.get($$0);
        if ($$4 != null) {
            $$4 = $$4.l();
            $$4.a("keepPacked", true);
        }
        return $$4;
    }

    @Override
    public void c(is $$0) {
        elb $$1;
        if (this.M() && ($$1 = (elb)this.j.remove($$0)) != null) {
            dwo dwo2 = this.q;
            if (dwo2 instanceof axf) {
                axf $$2 = (axf)dwo2;
                this.a($$1, $$2);
                $$2.W().a($$0);
            }
            $$1.ay_();
        }
        this.i($$0);
    }

    private <T extends elb> void a(T $$0, axf $$1) {
        etm $$3;
        dzq $$2 = $$0.o().b();
        if ($$2 instanceof ecn && ($$3 = ((ecn)((Object)$$2)).a($$1, $$0)) != null) {
            int $$4 = jw.a($$0.aD_().v());
            etn $$5 = this.a($$4);
            $$5.b($$3);
        }
    }

    private void c(int $$0) {
        this.t.remove($$0);
    }

    private void i(is $$0) {
        d $$1 = this.o.remove($$0);
        if ($$1 != null) {
            $$1.a(n);
        }
    }

    public void H() {
        if (this.s != null) {
            this.s.run(this);
            this.s = null;
        }
    }

    public boolean F() {
        return false;
    }

    public void a(wx $$0, Map<euq.a, long[]> $$12, Consumer<aeq.b> $$22) {
        this.K();
        for (eqr $$32 : this.l) {
            $$32.a($$0);
        }
        $$12.forEach(this::a);
        this.C();
        try (bgp.j $$4 = new bgp.j(this.E(), m);){
            $$22.accept(($$1, $$2, $$3) -> {
                elb $$4 = this.a($$1, eqq$b.a);
                if ($$4 != null && $$3 != null && $$4.s() == $$2) {
                    $$4.b(fno.a($$4.a($$4.v()), (jf.a)this.q.J_(), $$3));
                }
            });
        }
    }

    public void a(wx $$0) {
        for (eqr $$1 : this.l) {
            $$1.b($$0);
        }
    }

    public void b(boolean $$0) {
        this.p = $$0;
    }

    public dwo I() {
        return this.q;
    }

    public Map<is, elb> J() {
        return this.j;
    }

    public void a(axf $$0) {
        dvu $$1 = this.f();
        for (int $$2 = 0; $$2 < this.b.length; ++$$2) {
            ShortList $$3 = this.b[$$2];
            if ($$3 == null) continue;
            for (Short $$4 : $$3) {
                eoh $$8;
                is $$5 = erb.a($$4, this.h($$2), $$1);
                eoh $$6 = this.a_($$5);
                flb $$7 = $$6.y();
                if (!$$7.c()) {
                    $$7.a($$0, $$5, $$6);
                }
                if ($$6.b() instanceof eeo || ($$8 = dzq.b($$6, (dwp)$$0, $$5)) == $$6) continue;
                $$0.a($$5, $$8, 276);
            }
            $$3.clear();
        }
        for (is $$9 : ImmutableList.copyOf(this.i.keySet())) {
            this.c_($$9);
        }
        this.i.clear();
        this.e.a(this);
    }

    private @Nullable elb a(is $$0, uz $$1) {
        elb $$5;
        eoh $$2 = this.a_($$0);
        if ("DUMMY".equals($$1.b("id", ""))) {
            if ($$2.x()) {
                elb $$3 = ((ecn)((Object)$$2.b())).a($$0, $$2);
            } else {
                Object $$4 = null;
                m.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", (Object)$$0, (Object)$$2);
            }
        } else {
            $$5 = elb.a($$0, $$2, $$1, this.q.J_());
        }
        if ($$5 != null) {
            $$5.a(this.q);
            this.b($$5);
        } else {
            m.warn("Tried to load a block entity for block {} but failed at location {}", (Object)$$2, (Object)$$0);
        }
        return $$5;
    }

    public void d(long $$0) {
        this.u.b($$0);
        this.v.b($$0);
    }

    public void b(axf $$0) {
        $$0.q().a(this.c, this.u);
        $$0.r().a(this.c, this.v);
    }

    public void c(axf $$0) {
        $$0.q().a(this.c);
        $$0.r().a(this.c);
    }

    @Override
    public void a(axf $$0, bxh.a $$1) {
        if (!this.g().isEmpty()) {
            $$1.a(bxf.m, () -> {
                ArrayList<bxd> $$0 = new ArrayList<bxd>();
                for (ffw $$1 : this.g().values()) {
                    ffg $$2 = $$1.a();
                    List<ffs> $$3 = $$1.i();
                    ArrayList<bxd.a> $$4 = new ArrayList<bxd.a>($$3.size());
                    for (int $$5 = 0; $$5 < $$3.size(); ++$$5) {
                        boolean $$6 = $$5 == 0;
                        $$4.add(new bxd.a($$3.get($$5).f(), $$6));
                    }
                    $$0.add(new bxd($$2, $$4));
                }
                return $$0;
            });
        }
        $$1.a(bxf.l, () -> $$0.G().a(this.c));
    }

    @Override
    public erj n() {
        return erj.n;
    }

    public awt G() {
        if (this.r == null) {
            return awt.b;
        }
        return this.r.get();
    }

    public void b(Supplier<awt> $$0) {
        this.r = $$0;
    }

    public void K() {
        this.j.values().forEach(elb::ay_);
        this.j.clear();
        this.o.values().forEach($$0 -> $$0.a(n));
        this.o.clear();
    }

    public void L() {
        this.j.values().forEach($$0 -> {
            dwo $$1 = this.q;
            if ($$1 instanceof axf) {
                axf $$2 = (axf)$$1;
                this.b($$0, $$2);
            }
            this.q.a((elb)$$0);
            this.c($$0);
        });
    }

    private <T extends elb> void b(T $$0, axf $$1) {
        etm $$3;
        dzq $$2 = $$0.o().b();
        if ($$2 instanceof ecn && ($$3 = ((ecn)((Object)$$2)).a($$1, $$0)) != null) {
            this.a(jw.a($$0.aD_().v())).a($$3);
        }
    }

    private <T extends elb> void c(T $$0) {
        eoh $$1 = $$0.o();
        elc<?> $$22 = $$1.a(this.q, $$0.s());
        if ($$22 == null) {
            this.i($$0.aD_());
        } else {
            this.o.compute($$0.aD_(), ($$2, $$3) -> {
                enc $$4 = this.a($$0, $$22);
                if ($$3 != null) {
                    $$3.a($$4);
                    return $$3;
                }
                if (this.M()) {
                    d $$5 = new d($$4);
                    this.q.a($$5);
                    return $$5;
                }
                return null;
            });
        }
    }

    private <T extends elb> enc a(T $$0, elc<T> $$1) {
        return new a(this, $$0, $$1);
    }

    @FunctionalInterface
    public static interface c {
        public void run(eqq var1);
    }

    @FunctionalInterface
    public static interface e {
        public void setUnsaved(dvu var1);
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b();
        public static final /* enum */ b b = new b();
        public static final /* enum */ b c = new b();
        private static final /* synthetic */ b[] d;

        public static b[] values() {
            return (b[])d.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c};
        }

        static {
            d = eqq$b.a();
        }
    }

    static class d
    implements enc {
        private enc a;

        d(enc $$0) {
            this.a = $$0;
        }

        void a(enc $$0) {
            this.a = $$0;
        }

        @Override
        public void a() {
            this.a.a();
        }

        @Override
        public boolean b() {
            return this.a.b();
        }

        @Override
        public is c() {
            return this.a.c();
        }

        @Override
        public String d() {
            return this.a.d();
        }

        public String toString() {
            return String.valueOf(this.a) + " <wrapped>";
        }
    }

    static class a<T extends elb>
    implements enc {
        private final T b;
        private final elc<T> c;
        private boolean d;
        final /* synthetic */ eqq a;

        a(T $$0, elc<T> $$1) {
            this.a = var1_1;
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public void a() {
            is $$0;
            if (!((elb)this.b).p() && ((elb)this.b).n() && this.a.h($$0 = ((elb)this.b).aD_())) {
                try {
                    bzm $$1 = bzl.a();
                    $$1.a(this::d);
                    eoh $$2 = this.a.a_($$0);
                    if (((elb)this.b).s().a($$2)) {
                        this.c.tick(this.a.q, ((elb)this.b).aD_(), $$2, this.b);
                        this.d = false;
                    } else if (!this.d) {
                        this.d = true;
                        m.warn("Block entity {} @ {} state {} invalid for ticking:", new Object[]{LogUtils.defer(this::d), LogUtils.defer(this::c), $$2});
                    }
                    $$1.c();
                }
                catch (Throwable $$3) {
                    m $$4 = m.a($$3, "Ticking block entity");
                    n $$5 = $$4.a("Block entity being ticked");
                    ((elb)this.b).a($$5);
                    throw new v($$4);
                }
            }
        }

        @Override
        public boolean b() {
            return ((elb)this.b).p();
        }

        @Override
        public is c() {
            return ((elb)this.b).aD_();
        }

        @Override
        public String d() {
            return eld.a(((elb)this.b).s()).toString();
        }

        public String toString() {
            return "Level ticker for " + this.d() + "@" + String.valueOf(this.c());
        }
    }
}

