/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.jspecify.annotations.Nullable;

public class egv {
    public static final int a = 24;
    public static final int b = 1000;
    public static final float c = 0.5f;
    private static final int f = 32;
    public static final int d = 11;
    public static final int e = 1024;
    final boolean g;
    private final bef<dzq> h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private List<a> m = new ArrayList<a>();

    public egv(boolean $$0, bef<dzq> $$1, int $$2, int $$3, int $$4, int $$5) {
        this.g = $$0;
        this.h = $$1;
        this.i = $$2;
        this.j = $$3;
        this.k = $$4;
        this.l = $$5;
    }

    public static egv a() {
        return new egv(false, bdp.ch, 10, 4, 10, 5);
    }

    public static egv b() {
        return new egv(true, bdp.ci, 50, 1, 5, 10);
    }

    public bef<dzq> c() {
        return this.h;
    }

    public int d() {
        return this.i;
    }

    public int e() {
        return this.j;
    }

    public int f() {
        return this.k;
    }

    public int g() {
        return this.l;
    }

    public boolean h() {
        return this.g;
    }

    @VisibleForTesting
    public List<a> i() {
        return this.m;
    }

    public void j() {
        this.m.clear();
    }

    public void a(fnq $$0) {
        this.m.clear();
        $$0.a("cursors", egv$a.b.sizeLimitedListOf(32)).orElse(List.of()).forEach(this::a);
    }

    public void a(fns $$02) {
        $$02.a("cursors", egv$a.b.listOf(), this.m);
        if (w.ab) {
            int $$1 = this.i().stream().map(a::b).reduce(0, Integer::sum);
            int $$2 = this.i().stream().map($$0 -> 1).reduce(0, Integer::sum);
            int $$3 = this.i().stream().map(a::b).reduce(0, Math::max);
            $$02.a("stats.total", $$1);
            $$02.a("stats.count", $$2);
            $$02.a("stats.max", $$3);
            $$02.a("stats.avg", $$1 / ($$2 + 1));
        }
    }

    public void a(is $$0, int $$1) {
        while ($$1 > 0) {
            int $$2 = Math.min($$1, 1000);
            this.a(new a($$0, $$2));
            $$1 -= $$2;
        }
    }

    private void a(a $$0) {
        if (this.m.size() >= 32) {
            return;
        }
        this.m.add($$0);
    }

    public void a(dwp $$0, is $$12, bgr $$22, boolean $$3) {
        if (this.m.isEmpty()) {
            return;
        }
        ArrayList<a> $$4 = new ArrayList<a>();
        HashMap<is, a> $$5 = new HashMap<is, a>();
        Object2IntOpenHashMap $$6 = new Object2IntOpenHashMap();
        for (a $$7 : this.m) {
            if ($$7.a($$12)) continue;
            $$7.a($$0, $$12, $$22, this, $$3);
            if ($$7.e <= 0) {
                $$0.c(3006, $$7.a(), 0);
                continue;
            }
            is $$8 = $$7.a();
            $$6.computeInt((Object)$$8, ($$1, $$2) -> ($$2 == null ? 0 : $$2) + $$0.e);
            a $$9 = (a)$$5.get($$8);
            if ($$9 == null) {
                $$5.put($$8, $$7);
                $$4.add($$7);
                continue;
            }
            if (!this.h() && $$7.e + $$9.e <= 1000) {
                $$9.a($$7);
                continue;
            }
            $$4.add($$7);
            if ($$7.e >= $$9.e) continue;
            $$5.put($$8, $$7);
        }
        for (Object2IntMap.Entry $$10 : $$6.object2IntEntrySet()) {
            Set<iz> $$14;
            is $$11 = (is)$$10.getKey();
            int $$122 = $$10.getIntValue();
            a $$13 = (a)$$5.get($$11);
            Set<iz> set = $$14 = $$13 == null ? null : $$13.d();
            if ($$122 <= 0 || $$14 == null) continue;
            int $$15 = (int)(Math.log1p($$122) / (double)2.3f) + 1;
            int $$16 = ($$15 << 6) + eey.a($$14);
            $$0.c(3006, $$11, $$16);
        }
        this.m = $$4;
    }

    public static class a {
        private static final ObjectArrayList<jy> c = bhs.a(new ObjectArrayList(18), $$02 -> is.d(new is(-1, -1, -1), new is(1, 1, 1)).filter($$0 -> ($$0.u() == 0 || $$0.v() == 0 || $$0.w() == 0) && !$$0.equals(is.c)).map(is::j).forEach(arg_0 -> ((ObjectArrayList)$$02).add(arg_0)));
        public static final int a = 1;
        private is d;
        int e;
        private int f;
        private int g;
        private @Nullable Set<iz> h;
        private static final Codec<Set<iz>> i = iz.g.listOf().xmap($$0 -> Sets.newEnumSet((Iterable)$$0, iz.class), Lists::newArrayList);
        public static final Codec<a> b = RecordCodecBuilder.create($$02 -> $$02.group((App)is.a.fieldOf("pos").forGetter(a::a), (App)Codec.intRange((int)0, (int)1000).fieldOf("charge").orElse((Object)0).forGetter(a::b), (App)Codec.intRange((int)0, (int)1).fieldOf("decay_delay").orElse((Object)1).forGetter(a::c), (App)Codec.intRange((int)0, (int)Integer.MAX_VALUE).fieldOf("update_delay").orElse((Object)0).forGetter($$0 -> $$0.f), (App)i.lenientOptionalFieldOf("facings").forGetter($$0 -> Optional.ofNullable($$0.d()))).apply((Applicative)$$02, a::new));

        private a(is $$0, int $$1, int $$2, int $$3, Optional<Set<iz>> $$4) {
            this.d = $$0;
            this.e = $$1;
            this.g = $$2;
            this.f = $$3;
            this.h = $$4.orElse(null);
        }

        public a(is $$0, int $$1) {
            this($$0, $$1, 1, 0, Optional.empty());
        }

        public is a() {
            return this.d;
        }

        boolean a(is $$0) {
            return this.d.l($$0) > 1024;
        }

        public int b() {
            return this.e;
        }

        public int c() {
            return this.g;
        }

        public @Nullable Set<iz> d() {
            return this.h;
        }

        private boolean a(dwp $$0, is $$1, boolean $$2) {
            if (this.e <= 0) {
                return false;
            }
            if ($$2) {
                return true;
            }
            if ($$0 instanceof axf) {
                axf $$3 = (axf)$$0;
                return $$3.r($$1);
            }
            return false;
        }

        public void a(dwp $$0, is $$1, bgr $$2, egv $$3, boolean $$4) {
            if (!this.a($$0, $$1, $$3.g)) {
                return;
            }
            if (this.f > 0) {
                --this.f;
                return;
            }
            eoh $$5 = $$0.a_(this.d);
            egq $$6 = egv$a.a($$5);
            if ($$4 && $$6.a($$0, this.d, $$5, this.h, $$3.h())) {
                if ($$6.d()) {
                    $$5 = $$0.a_(this.d);
                    $$6 = egv$a.a($$5);
                }
                $$0.a(null, this.d, bda.yO, bdb.e, 1.0f, 1.0f);
            }
            this.e = $$6.a(this, $$0, $$1, $$2, $$3, $$4);
            if (this.e <= 0) {
                $$6.a($$0, $$5, this.d, $$2);
                return;
            }
            is $$7 = egv$a.a($$0, this.d, $$2);
            if ($$7 != null) {
                $$6.a($$0, $$5, this.d, $$2);
                this.d = $$7.j();
                if ($$3.h() && !this.d.a(new jy($$1.u(), this.d.v(), $$1.w()), 15.0)) {
                    this.e = 0;
                    return;
                }
                $$5 = $$0.a_($$7);
            }
            if ($$5.b() instanceof egq) {
                this.h = eey.p($$5);
            }
            this.g = $$6.j_(this.g);
            this.f = $$6.b();
        }

        void a(a $$0) {
            this.e += $$0.e;
            $$0.e = 0;
            this.f = Math.min(this.f, $$0.f);
        }

        private static egq a(eoh $$0) {
            egq $$1;
            dzq dzq2 = $$0.b();
            return dzq2 instanceof egq ? ($$1 = (egq)((Object)dzq2)) : egq.w_;
        }

        private static List<jy> a(bgr $$0) {
            return bhs.a(c, $$0);
        }

        private static @Nullable is a(dwp $$0, is $$1, bgr $$2) {
            is.a $$3 = $$1.k();
            is.a $$4 = $$1.k();
            for (jy $$5 : egv$a.a($$2)) {
                $$4.a((jy)$$1, $$5);
                eoh $$6 = $$0.a_($$4);
                if (!($$6.b() instanceof egq) || !egv$a.a($$0, $$1, $$4)) continue;
                $$3.g($$4);
                if (!egw.a($$0, $$6, $$4)) continue;
                break;
            }
            return $$3.equals($$1) ? null : $$3;
        }

        private static boolean a(dwp $$0, is $$1, is $$2) {
            if ($$1.k($$2) == 1) {
                return true;
            }
            is $$3 = $$2.b($$1);
            iz $$4 = iz.a(iz.a.a, $$3.u() < 0 ? iz.b.b : iz.b.a);
            iz $$5 = iz.a(iz.a.b, $$3.v() < 0 ? iz.b.b : iz.b.a);
            iz $$6 = iz.a(iz.a.c, $$3.w() < 0 ? iz.b.b : iz.b.a);
            if ($$3.u() == 0) {
                return egv$a.a($$0, $$1, $$5) || egv$a.a($$0, $$1, $$6);
            }
            if ($$3.v() == 0) {
                return egv$a.a($$0, $$1, $$4) || egv$a.a($$0, $$1, $$6);
            }
            return egv$a.a($$0, $$1, $$4) || egv$a.a($$0, $$1, $$5);
        }

        private static boolean a(dwp $$0, is $$1, iz $$2) {
            is $$3 = $$1.a($$2);
            return !$$0.a_($$3).c((dvt)$$0, $$3, $$2.g());
        }
    }
}

