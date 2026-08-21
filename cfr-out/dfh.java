/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class dfh {
    public static final cif a = cih.a(cgu.bh);
    public static final MapCodec<dfh> b = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)Codec.BOOL.fieldOf("started").forGetter($$0 -> $$0.D), (App)Codec.BOOL.fieldOf("active").forGetter($$0 -> $$0.G), (App)Codec.LONG.fieldOf("ticks_active").forGetter($$0 -> $$0.B), (App)Codec.INT.fieldOf("raid_omen_level").forGetter($$0 -> $$0.F), (App)Codec.INT.fieldOf("groups_spawned").forGetter($$0 -> $$0.H), (App)Codec.INT.fieldOf("cooldown_ticks").forGetter($$0 -> $$0.K), (App)Codec.INT.fieldOf("post_raid_ticks").forGetter($$0 -> $$0.J), (App)Codec.FLOAT.fieldOf("total_health").forGetter($$0 -> Float.valueOf($$0.E)), (App)Codec.INT.fieldOf("group_count").forGetter($$0 -> $$0.M), (App)dfh$a.e.fieldOf("status").forGetter($$0 -> $$0.N), (App)is.a.fieldOf("center").forGetter($$0 -> $$0.C), (App)jx.b.fieldOf("heroes_of_the_village").forGetter($$0 -> $$0.A)).apply((Applicative)$$02, dfh::new));
    private static final int i = 7;
    private static final int j = 2;
    private static final int k = 32;
    private static final int l = 48000;
    private static final int m = 5;
    private static final yh n = yh.c("block.minecraft.ominous_banner");
    private static final String o = "event.minecraft.raid.raiders_remaining";
    public static final int c = 16;
    private static final int p = 40;
    private static final int q = 300;
    public static final int d = 2400;
    public static final int e = 600;
    private static final int r = 30;
    public static final int f = 5;
    private static final int s = 2;
    private static final yh t = yh.c("event.minecraft.raid");
    private static final yh u = yh.c("event.minecraft.raid.victory.full");
    private static final yh v = yh.c("event.minecraft.raid.defeat.full");
    private static final int w = 48000;
    private static final int x = 96;
    public static final int g = 9216;
    public static final int h = 12544;
    private final Map<Integer, dfi> y = Maps.newHashMap();
    private final Map<Integer, Set<dfi>> z = Maps.newHashMap();
    private final Set<UUID> A = Sets.newHashSet();
    private long B;
    private is C;
    private boolean D;
    private float E;
    private int F;
    private boolean G;
    private int H;
    private final axb I = new axb(t, ccs.a.c, ccs.b.c);
    private int J;
    private int K;
    private final bgr L = bgr.a();
    private final int M;
    private a N;
    private int O;
    private Optional<is> P = Optional.empty();

    public dfh(is $$0, ccz $$1) {
        this.G = true;
        this.K = 300;
        this.I.a(0.0f);
        this.C = $$0;
        this.M = this.a($$1);
        this.N = dfh$a.a;
    }

    private dfh(boolean $$0, boolean $$1, long $$2, int $$3, int $$4, int $$5, int $$6, float $$7, int $$8, a $$9, is $$10, Set<UUID> $$11) {
        this.D = $$0;
        this.G = $$1;
        this.B = $$2;
        this.F = $$3;
        this.H = $$4;
        this.K = $$5;
        this.J = $$6;
        this.E = $$7;
        this.C = $$10;
        this.M = $$8;
        this.N = $$9;
        this.A.addAll($$11);
    }

    public boolean a() {
        return this.e() || this.f();
    }

    public boolean b() {
        return this.c() && this.p() == 0 && this.K > 0;
    }

    public boolean c() {
        return this.H > 0;
    }

    public boolean d() {
        return this.N == dfh$a.d;
    }

    public boolean e() {
        return this.N == dfh$a.b;
    }

    public boolean f() {
        return this.N == dfh$a.c;
    }

    public float g() {
        return this.E;
    }

    public Set<dfi> h() {
        HashSet $$0 = Sets.newHashSet();
        for (Set<dfi> $$1 : this.z.values()) {
            $$0.addAll($$1);
        }
        return $$0;
    }

    public boolean i() {
        return this.D;
    }

    public int j() {
        return this.H;
    }

    private Predicate<axg> t() {
        return $$0 -> {
            is $$1 = $$0.dK();
            return $$0.cb() && $$0.A().f($$1) == this;
        };
    }

    private void b(axf $$0) {
        HashSet $$1 = Sets.newHashSet(this.I.h());
        List<axg> $$2 = $$0.a(this.t());
        for (axg $$3 : $$2) {
            if ($$1.contains($$3)) continue;
            this.I.a($$3);
        }
        for (axg $$4 : $$1) {
            if ($$2.contains($$4)) continue;
            this.I.b($$4);
        }
    }

    public int k() {
        return 5;
    }

    public int l() {
        return this.F;
    }

    public void a(int $$0) {
        this.F = $$0;
    }

    public boolean a(axg $$0) {
        cfm $$1 = $$0.e(cfo.I);
        if ($$1 == null) {
            return false;
        }
        this.F += $$1.e() + 1;
        this.F = bgj.a(this.F, 0, this.k());
        if (!this.c()) {
            $$0.a(bdk.aC);
            aj.K.a($$0);
        }
        return true;
    }

    public void m() {
        this.G = false;
        this.I.b();
        this.N = dfh$a.d;
    }

    public void a(axf $$0) {
        if (this.d()) {
            return;
        }
        if (this.N == dfh$a.a) {
            boolean $$1 = this.G;
            this.G = $$0.H(this.C);
            if ($$0.av() == ccz.a) {
                this.m();
                return;
            }
            if ($$1 != this.G) {
                this.I.d(this.G);
            }
            if (!this.G) {
                return;
            }
            if (!$$0.e(this.C)) {
                this.c($$0);
            }
            if (!$$0.e(this.C)) {
                if (this.H > 0) {
                    this.N = dfh$a.c;
                } else {
                    this.m();
                }
            }
            ++this.B;
            if (this.B >= 48000L) {
                this.m();
                return;
            }
            int $$2 = this.p();
            if ($$2 == 0 && this.u()) {
                if (this.K > 0) {
                    boolean $$4;
                    boolean $$3 = this.P.isPresent();
                    boolean bl2 = $$4 = !$$3 && this.K % 5 == 0;
                    if ($$3 && !$$0.h(this.P.get())) {
                        $$4 = true;
                    }
                    if ($$4) {
                        this.P = this.d($$0);
                    }
                    if (this.K == 300 || this.K % 20 == 0) {
                        this.b($$0);
                    }
                    --this.K;
                    this.I.a(bgj.a((float)(300 - this.K) / 300.0f, 0.0f, 1.0f));
                } else if (this.K == 0 && this.H > 0) {
                    this.K = 300;
                    this.I.a(t);
                    return;
                }
            }
            if (this.B % 20L == 0L) {
                this.b($$0);
                this.e($$0);
                if ($$2 > 0) {
                    if ($$2 <= 2) {
                        this.I.a(t.f().f(" - ").b(yh.a(o, $$2)));
                    } else {
                        this.I.a(t);
                    }
                } else {
                    this.I.a(t);
                }
            }
            if (w.T) {
                this.I.a(t.f().f(" wave: ").f("" + this.H).b(yg.x).f("Raiders alive: ").f("" + this.p()).b(yg.x).f("" + this.o()).f(" / ").f("" + this.E).f(" Is bonus? ").f("" + (this.w() && this.x())).f(" Status: ").f(this.N.c()));
            }
            boolean $$5 = false;
            int $$6 = 0;
            while (this.z()) {
                is $$7 = this.P.orElseGet(() -> this.a($$0, 20));
                if ($$7 != null) {
                    this.D = true;
                    this.b($$0, $$7);
                    if (!$$5) {
                        this.a($$0, $$7);
                        $$5 = true;
                    }
                } else {
                    ++$$6;
                }
                if ($$6 <= 5) continue;
                this.m();
                break;
            }
            if (this.i() && !this.u() && $$2 == 0) {
                if (this.J < 40) {
                    ++this.J;
                } else {
                    this.N = dfh$a.b;
                    for (UUID $$8 : this.A) {
                        cgk $$9 = $$0.d($$8);
                        if (!($$9 instanceof chl)) continue;
                        chl $$10 = (chl)$$9;
                        if ($$9.au()) continue;
                        $$10.a(new cfm(cfo.F, 48000, this.F - 1, false, false, true));
                        if (!($$10 instanceof axg)) continue;
                        axg $$11 = (axg)$$10;
                        $$11.a(bdk.aD);
                        aj.J.a($$11);
                    }
                }
            }
            this.f($$0);
        } else if (this.a()) {
            ++this.O;
            if (this.O >= 600) {
                this.m();
                return;
            }
            if (this.O % 20 == 0) {
                this.b($$0);
                this.I.d(true);
                if (this.e()) {
                    this.I.a(0.0f);
                    this.I.a(u);
                } else {
                    this.I.a(v);
                }
            }
        }
    }

    private void c(axf $$02) {
        Stream<jw> $$1 = jw.a(jw.a(this.C), 2);
        $$1.filter($$02::a).map(jw::k).min(Comparator.comparingDouble($$0 -> $$0.j(this.C))).ifPresent(this::a);
    }

    private Optional<is> d(axf $$0) {
        is $$1 = this.a($$0, 8);
        if ($$1 != null) {
            return Optional.of($$1);
        }
        return Optional.empty();
    }

    private boolean u() {
        if (this.w()) {
            return !this.x();
        }
        return !this.v();
    }

    private boolean v() {
        return this.j() == this.M;
    }

    private boolean w() {
        return this.F > 1;
    }

    private boolean x() {
        return this.j() > this.M;
    }

    private boolean y() {
        return this.v() && this.p() == 0 && this.w();
    }

    private void e(axf $$0) {
        Iterator<Set<dfi>> $$1 = this.z.values().iterator();
        HashSet $$2 = Sets.newHashSet();
        while ($$1.hasNext()) {
            Set<dfi> $$3 = $$1.next();
            for (dfi $$4 : $$3) {
                is $$5 = $$4.dK();
                if ($$4.eh() || $$4.ao().aq() != $$0.aq() || this.C.j($$5) >= 12544.0) {
                    $$2.add($$4);
                    continue;
                }
                if ($$4.at <= 600) continue;
                if ($$0.d($$4.cY()) == null) {
                    $$2.add($$4);
                }
                if (!$$0.e($$5) && $$4.eP() > 2400) {
                    $$4.b($$4.hk() + 1);
                }
                if ($$4.hk() < 30) continue;
                $$2.add($$4);
            }
        }
        for (dfi $$6 : $$2) {
            this.a($$0, $$6, true);
            if (!$$6.gR()) continue;
            this.c($$6.hi());
        }
    }

    private void a(axf $$0, is $$1) {
        float $$2 = 13.0f;
        int $$3 = 64;
        Collection<axg> $$4 = this.I.h();
        long $$5 = this.L.g();
        for (axg $$6 : $$0.E()) {
            ftm $$7 = $$6.dI();
            ftm $$8 = ftm.b($$1);
            double $$9 = Math.sqrt(($$8.g - $$7.g) * ($$8.g - $$7.g) + ($$8.i - $$7.i) * ($$8.i - $$7.i));
            double $$10 = $$7.g + 13.0 / $$9 * ($$8.g - $$7.g);
            double $$11 = $$7.i + 13.0 / $$9 * ($$8.i - $$7.i);
            if (!($$9 <= 64.0) && !$$4.contains($$6)) continue;
            $$6.g.b(new ahh(bda.xN, bdb.g, $$10, $$6.dR(), $$11, 64.0f, 1.0f, $$5));
        }
    }

    private void b(axf $$0, is $$1) {
        boolean $$2 = false;
        int $$3 = this.H + 1;
        this.E = 0.0f;
        cda $$4 = $$0.c($$1);
        boolean $$5 = this.y();
        for (b $$6 : dfh$b.f) {
            dfi $$10;
            int $$7 = this.a($$6, $$3, $$5) + this.a($$6, this.L, $$3, $$4, $$5);
            int $$8 = 0;
            for (int $$9 = 0; $$9 < $$7 && ($$10 = $$6.g.a($$0, cgt.h)) != null; ++$$9) {
                if (!$$2 && $$10.k()) {
                    $$10.x(true);
                    this.a($$3, $$10);
                    $$2 = true;
                }
                this.a($$0, $$3, $$10, $$1, false);
                if ($$6.g != cgu.bh) continue;
                dfi $$11 = null;
                if ($$3 == this.a(ccz.c)) {
                    $$11 = cgu.bb.a($$0, cgt.h);
                } else if ($$3 >= this.a(ccz.d)) {
                    $$11 = $$8 == 0 ? (dfi)cgu.W.a($$0, cgt.h) : (dfi)cgu.bM.a($$0, cgt.h);
                }
                ++$$8;
                if ($$11 == null) continue;
                this.a($$0, $$3, $$11, $$1, false);
                $$11.a($$1, 0.0f, 0.0f);
                $$11.a((cgk)$$10, false, false);
            }
        }
        this.P = Optional.empty();
        ++this.H;
        this.n();
        this.f($$0);
    }

    public void a(axf $$0, int $$1, dfi $$2, @Nullable is $$3, boolean $$4) {
        boolean $$5 = this.a($$0, $$1, $$2);
        if ($$5) {
            $$2.a(this);
            $$2.a($$1);
            $$2.A(true);
            $$2.b(0);
            if (!$$4 && $$3 != null) {
                $$2.a_((double)$$3.u() + 0.5, (double)$$3.v() + 1.0, (double)$$3.w() + 0.5);
                $$2.a((dxf)$$0, $$0.c($$3), cgt.h, null);
                $$2.a($$0, $$1, false);
                $$2.e(true);
                $$0.a_($$2);
            }
        }
    }

    public void n() {
        this.I.a(bgj.a(this.o() / this.E, 0.0f, 1.0f));
    }

    public float o() {
        float $$0 = 0.0f;
        for (Set<dfi> $$1 : this.z.values()) {
            for (dfi $$2 : $$1) {
                $$0 += $$2.eZ();
            }
        }
        return $$0;
    }

    private boolean z() {
        return this.K == 0 && (this.H < this.M || this.y()) && this.p() == 0;
    }

    public int p() {
        return this.z.values().stream().mapToInt(Set::size).sum();
    }

    public void a(axf $$0, dfi $$1, boolean $$2) {
        boolean $$4;
        Set<dfi> $$3 = this.z.get($$1.hi());
        if ($$3 != null && ($$4 = $$3.remove($$1))) {
            if ($$2) {
                this.E -= $$1.eZ();
            }
            $$1.a((dfh)null);
            this.n();
            this.f($$0);
        }
    }

    private void f(axf $$0) {
        $$0.G().u();
    }

    public static dlt a(je<ekq> $$0) {
        dlt $$1 = new dlt(dlx.xe);
        ekr $$2 = new ekr.a().a($$0, eks.z, dkr.j).a($$0, eks.f, dkr.i).a($$0, eks.j, dkr.h).a($$0, eks.E, dkr.i).a($$0, eks.k, dkr.p).a($$0, eks.B, dkr.i).a($$0, eks.y, dkr.i).a($$0, eks.E, dkr.p).a();
        $$1.b(ki.at, $$2);
        $$1.b(ki.t, dpd.c.a(ki.at, true));
        $$1.b(ki.k, n);
        $$1.b(ki.n, dmp.b);
        return $$1;
    }

    public @Nullable dfi b(int $$0) {
        return this.y.get($$0);
    }

    private @Nullable is a(axf $$0, int $$1) {
        int $$2 = this.K / 20;
        float $$3 = 0.22f * (float)$$2 - 0.24f;
        is.a $$4 = new is.a();
        float $$5 = $$0.y.i() * ((float)Math.PI * 2);
        for (int $$6 = 0; $$6 < $$1; ++$$6) {
            int $$9;
            float $$7 = $$5 + (float)Math.PI * (float)$$6 / 8.0f;
            int $$8 = this.C.u() + bgj.b(bgj.b((double)$$7) * 32.0f * $$3) + $$0.y.a(3) * bgj.b($$3);
            int $$10 = $$0.a(euq.a.b, $$8, $$9 = this.C.w() + bgj.b(bgj.a((double)$$7) * 32.0f * $$3) + $$0.y.a(3) * bgj.b($$3));
            if (bgj.a($$10 - this.C.v()) > 96) continue;
            $$4.d($$8, $$10, $$9);
            if ($$0.e($$4) && $$2 > 7) continue;
            int $$11 = 10;
            if (!$$0.b($$4.u() - 10, $$4.w() - 10, $$4.u() + 10, $$4.w() + 10) || !$$0.h($$4) || !a.isSpawnPositionOk($$0, $$4, cgu.bh) && (!$$0.a_($$4.e()).a(dzs.ep) || !$$0.a_($$4).l())) continue;
            return $$4;
        }
        return null;
    }

    private boolean a(axf $$0, int $$1, dfi $$2) {
        return this.a($$0, $$1, $$2, true);
    }

    public boolean a(axf $$02, int $$1, dfi $$2, boolean $$3) {
        this.z.computeIfAbsent($$1, $$0 -> Sets.newHashSet());
        Set<dfi> $$4 = this.z.get($$1);
        dfi $$5 = null;
        for (dfi $$6 : $$4) {
            if (!$$6.cY().equals($$2.cY())) continue;
            $$5 = $$6;
            break;
        }
        if ($$5 != null) {
            $$4.remove($$5);
            $$4.add($$2);
        }
        $$4.add($$2);
        if ($$3) {
            this.E += $$2.eZ();
        }
        this.n();
        this.f($$02);
        return true;
    }

    public void a(int $$0, dfi $$1) {
        this.y.put($$0, $$1);
        $$1.a(cgv.f, dfh.a($$1.eo().f(mj.aR)));
        $$1.a(cgv.f, 2.0f);
    }

    public void c(int $$0) {
        this.y.remove($$0);
    }

    public is q() {
        return this.C;
    }

    private void a(is $$0) {
        this.C = $$0;
    }

    private int a(b $$0, int $$1, boolean $$2) {
        return $$2 ? $$0.h[this.M] : $$0.h[$$1];
    }

    /*
     * WARNING - void declaration
     */
    private int a(b $$0, bgr $$1, int $$2, cda $$3, boolean $$4) {
        void $$13;
        ccz $$5 = $$3.a();
        boolean $$6 = $$5 == ccz.b;
        boolean $$7 = $$5 == ccz.c;
        switch ($$0.ordinal()) {
            case 3: {
                if (!$$6 && $$2 > 2 && $$2 != 4) {
                    boolean $$8 = true;
                    break;
                }
                return 0;
            }
            case 0: 
            case 2: {
                if ($$6) {
                    int $$9 = $$1.a(2);
                    break;
                }
                if ($$7) {
                    boolean $$10 = true;
                    break;
                }
                int $$11 = 2;
                break;
            }
            case 4: {
                boolean $$12 = !$$6 && $$4;
                break;
            }
            default: {
                return 0;
            }
        }
        return $$13 > 0 ? $$1.a((int)($$13 + true)) : 0;
    }

    public boolean r() {
        return this.G;
    }

    public int a(ccz $$0) {
        return switch ($$0) {
            default -> throw new MatchException(null, null);
            case ccz.a -> 0;
            case ccz.b -> 3;
            case ccz.c -> 5;
            case ccz.d -> 7;
        };
    }

    public float s() {
        int $$0 = this.l();
        if ($$0 == 2) {
            return 0.1f;
        }
        if ($$0 == 3) {
            return 0.25f;
        }
        if ($$0 == 4) {
            return 0.5f;
        }
        if ($$0 == 5) {
            return 0.75f;
        }
        return 0.0f;
    }

    public void a(cgk $$0) {
        this.A.add($$0.cY());
    }

    static final class a
    extends Enum<a>
    implements bhh {
        public static final /* enum */ a a = new a("ongoing");
        public static final /* enum */ a b = new a("victory");
        public static final /* enum */ a c = new a("loss");
        public static final /* enum */ a d = new a("stopped");
        public static final Codec<a> e;
        private final String f;
        private static final /* synthetic */ a[] g;

        public static a[] values() {
            return (a[])g.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(String $$0) {
            this.f = $$0;
        }

        @Override
        public String c() {
            return this.f;
        }

        private static /* synthetic */ a[] a() {
            return new a[]{a, b, c, d};
        }

        static {
            g = dfh$a.a();
            e = bhh.a(a::values);
        }
    }

    static final class b
    extends Enum<b> {
        public static final /* enum */ b a = new b(cgu.bM, new int[]{0, 0, 2, 0, 1, 4, 2, 5});
        public static final /* enum */ b b = new b(cgu.W, new int[]{0, 0, 0, 0, 0, 1, 1, 2});
        public static final /* enum */ b c = new b(cgu.bb, new int[]{0, 4, 3, 3, 4, 4, 4, 2});
        public static final /* enum */ b d = new b(cgu.bQ, new int[]{0, 0, 0, 0, 3, 0, 0, 1});
        public static final /* enum */ b e = new b(cgu.bh, new int[]{0, 0, 0, 1, 0, 1, 0, 2});
        static final b[] f;
        final cgu<? extends dfi> g;
        final int[] h;
        private static final /* synthetic */ b[] i;

        public static b[] values() {
            return (b[])i.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        private b(cgu<? extends dfi> $$0, int[] $$1) {
            this.g = $$0;
            this.h = $$1;
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c, d, e};
        }

        static {
            i = dfh$b.a();
            f = dfh$b.values();
        }
    }
}

