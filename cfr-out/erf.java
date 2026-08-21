/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.ints.IntArrays
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 *  it.unimi.dsi.fastutil.objects.ObjectSet
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntArrays;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.util.EnumSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.slf4j.Logger;

public class erf {
    private static final Logger b = LogUtils.getLogger();
    public static final erf a = new erf(dwf.a);
    private static final String c = "Indices";
    private static final ja[] d = ja.values();
    private static final Codec<List<fvd<dzq>>> e = fvd.a(mi.e.q().orElse((Object)dzs.a)).listOf();
    private static final Codec<List<fvd<fla>>> f = fvd.a(mi.c.q().orElse((Object)flc.a)).listOf();
    private final EnumSet<ja> g = EnumSet.noneOf(ja.class);
    private final List<fvd<dzq>> h = Lists.newArrayList();
    private final List<fvd<fla>> i = Lists.newArrayList();
    private final int[][] j;
    static final Map<dzq, a> k = new IdentityHashMap<dzq, a>();
    static final Set<a> l = Sets.newHashSet();

    private erf(dwq $$0) {
        this.j = new int[$$0.ax()][];
    }

    public erf(uz $$02, dwq $$1) {
        this($$1);
        $$02.m(c).ifPresent($$0 -> {
            for (int $$1 = 0; $$1 < this.j.length; ++$$1) {
                this.j[$$1] = $$0.k(String.valueOf($$1)).orElse(null);
            }
        });
        int $$2 = $$02.b("Sides", 0);
        for (ja $$3 : ja.values()) {
            if (($$2 & 1 << $$3.ordinal()) == 0) continue;
            this.g.add($$3);
        }
        $$02.a("neighbor_block_ticks", e).ifPresent(this.h::addAll);
        $$02.a("neighbor_fluid_ticks", f).ifPresent(this.i::addAll);
    }

    private erf(erf $$0) {
        this.g.addAll($$0.g);
        this.h.addAll($$0.h);
        this.i.addAll($$0.i);
        this.j = new int[$$0.j.length][];
        for (int $$1 = 0; $$1 < $$0.j.length; ++$$1) {
            int[] $$2 = $$0.j[$$1];
            this.j[$$1] = $$2 != null ? IntArrays.copy((int[])$$2) : null;
        }
    }

    public void a(eqq $$0) {
        this.b($$0);
        for (ja $$12 : d) {
            erf.a($$0, $$12);
        }
        dwo $$2 = $$0.I();
        this.h.forEach($$1 -> {
            dzq $$2 = $$1.a() == dzs.a ? $$2.a_($$1.b()).b() : (dzq)$$1.a();
            $$2.a($$1.b(), $$2, $$1.c(), $$1.d());
        });
        this.i.forEach($$1 -> {
            fla $$2 = $$1.a() == flc.a ? $$2.b_($$1.b()).a() : (fla)$$1.a();
            $$2.a($$1.b(), $$2, $$1.c(), $$1.d());
        });
        l.forEach($$1 -> $$1.a($$2));
    }

    private static void a(eqq $$0, ja $$1) {
        dwo $$2 = $$0.I();
        if (!$$0.t().g.remove((Object)$$1)) {
            return;
        }
        Set<iz> $$3 = $$1.a();
        boolean $$4 = false;
        int $$5 = 15;
        boolean $$6 = $$3.contains(iz.f);
        boolean $$7 = $$3.contains(iz.e);
        boolean $$8 = $$3.contains(iz.d);
        boolean $$9 = $$3.contains(iz.c);
        boolean $$10 = $$3.size() == 1;
        dvu $$11 = $$0.f();
        int $$12 = $$11.e() + ($$10 && ($$9 || $$8) ? 1 : ($$7 ? 0 : 15));
        int $$13 = $$11.e() + ($$10 && ($$9 || $$8) ? 14 : ($$7 ? 0 : 15));
        int $$14 = $$11.f() + ($$10 && ($$6 || $$7) ? 1 : ($$9 ? 0 : 15));
        int $$15 = $$11.f() + ($$10 && ($$6 || $$7) ? 14 : ($$9 ? 0 : 15));
        iz[] $$16 = iz.values();
        is.a $$17 = new is.a();
        for (is $$18 : is.b($$12, $$2.K_(), $$14, $$13, $$2.aw(), $$15)) {
            eoh $$19;
            eoh $$20 = $$19 = $$2.a_($$18);
            for (iz $$21 : $$16) {
                $$17.a((jy)$$18, $$21);
                $$20 = erf.a($$20, $$21, $$2, $$18, $$17);
            }
            dzq.a($$19, $$20, $$2, $$18, 18);
        }
    }

    private static eoh a(eoh $$0, iz $$1, dwp $$2, is $$3, is $$4) {
        return k.getOrDefault($$0.b(), erf$b.b).a($$0, $$1, $$2.a_($$4), $$2, $$3, $$4);
    }

    private void b(eqq $$0) {
        is.a $$1 = new is.a();
        is.a $$2 = new is.a();
        dvu $$3 = $$0.f();
        dwo $$4 = $$0.I();
        for (int $$5 = 0; $$5 < this.j.length; ++$$5) {
            eqr $$6 = $$0.b($$5);
            int[] $$7 = this.j[$$5];
            this.j[$$5] = null;
            if ($$7 == null || $$7.length <= 0) continue;
            iz[] $$8 = iz.values();
            eqy<eoh> $$9 = $$6.h();
            int $$10 = $$0.h($$5);
            int $$11 = jw.c($$10);
            for (int $$12 : $$7) {
                eoh $$16;
                int $$13 = $$12 & 0xF;
                int $$14 = $$12 >> 8 & 0xF;
                int $$15 = $$12 >> 4 & 0xF;
                $$1.d($$3.e() + $$13, $$11 + $$14, $$3.f() + $$15);
                eoh $$17 = $$16 = $$9.a($$12);
                for (iz $$18 : $$8) {
                    $$2.a((jy)$$1, $$18);
                    if (jw.a($$1.u()) != $$3.h || jw.a($$1.w()) != $$3.i) continue;
                    $$17 = erf.a($$17, $$18, $$4, $$1, $$2);
                }
                dzq.a($$16, $$17, $$4, $$1, 18);
            }
        }
        for (int $$19 = 0; $$19 < this.j.length; ++$$19) {
            if (this.j[$$19] != null) {
                b.warn("Discarding update data for section {} for chunk ({} {})", new Object[]{$$4.h($$19), $$3.h, $$3.i});
            }
            this.j[$$19] = null;
        }
    }

    public boolean a() {
        for (int[] $$0 : this.j) {
            if ($$0 == null) continue;
            return false;
        }
        return this.g.isEmpty();
    }

    public uz b() {
        uz $$0 = new uz();
        uz $$1 = new uz();
        for (int $$2 = 0; $$2 < this.j.length; ++$$2) {
            String $$3 = String.valueOf($$2);
            if (this.j[$$2] == null || this.j[$$2].length == 0) continue;
            $$1.a($$3, this.j[$$2]);
        }
        if (!$$1.j()) {
            $$0.a(c, $$1);
        }
        int $$4 = 0;
        for (ja $$5 : this.g) {
            $$4 |= 1 << $$5.ordinal();
        }
        $$0.a("Sides", (byte)$$4);
        if (!this.h.isEmpty()) {
            $$0.a("neighbor_block_ticks", e, this.h);
        }
        if (!this.i.isEmpty()) {
            $$0.a("neighbor_fluid_ticks", f, this.i);
        }
        return $$0;
    }

    public erf c() {
        if (this == a) {
            return a;
        }
        return new erf(this);
    }

    static abstract sealed class b
    extends Enum<b>
    implements a {
        public static final /* enum */ b a = new b(new dzq[]{dzs.lK, dzs.eI, dzs.mI, dzs.mJ, dzs.mK, dzs.mL, dzs.mM, dzs.mN, dzs.mO, dzs.mP, dzs.mQ, dzs.mR, dzs.mS, dzs.mT, dzs.mU, dzs.mV, dzs.mW, dzs.mX, dzs.hJ, dzs.hK, dzs.hL, dzs.gp, dzs.O, dzs.L, dzs.N, dzs.db, dzs.dc, dzs.dd, dzs.de, dzs.df, dzs.dg, dzs.dh, dzs.di, dzs.dp, dzs.dq, dzs.dr, dzs.ds, dzs.du, dzs.dv, dzs.dw, dzs.dz, dzs.dA, dzs.dB, dzs.dC, dzs.dE, dzs.dF, dzs.dG, dzs.dL, dzs.dM, dzs.dN, dzs.dO, dzs.dQ, dzs.dR, dzs.dS}){

            @Override
            public eoh a(eoh $$0, iz $$1, eoh $$2, dwp $$3, is $$4, is $$5) {
                return $$0;
            }
        };
        public static final /* enum */ b b = new b(new dzq[0]){

            @Override
            public eoh a(eoh $$0, iz $$1, eoh $$2, dwp $$3, is $$4, is $$5) {
                return $$0.a($$3, $$3, $$4, $$1, $$5, $$3.a_($$5), $$3.G_());
            }
        };
        public static final /* enum */ b c = new b(new dzq[]{dzs.cS, dzs.hM}){

            @Override
            public eoh a(eoh $$0, iz $$1, eoh $$2, dwp $$3, is $$4, is $$5) {
                if ($$2.a($$0.b()) && $$1.o().d() && $$0.c(eau.d) == eoz.a && $$2.c(eau.d) == eoz.a) {
                    iz $$6 = $$0.c(eau.c);
                    if ($$1.o() != $$6.o() && $$6 == $$2.c(eau.c)) {
                        eoz $$7 = $$1 == $$6.h() ? eoz.b : eoz.c;
                        $$3.a($$5, (eoh)$$2.b(eau.d, $$7.a()), 18);
                        if ($$6 == iz.c || $$6 == iz.f) {
                            elb $$8 = $$3.c_($$4);
                            elb $$9 = $$3.c_($$5);
                            if ($$8 instanceof elj && $$9 instanceof elj) {
                                elj.a((elj)$$8, (elj)$$9);
                            }
                        }
                        return (eoh)$$0.b(eau.d, $$7);
                    }
                }
                return $$0;
            }
        };
        public static final /* enum */ b d = new b(true, new dzq[]{dzs.aO, dzs.aP, dzs.aM, dzs.aR, dzs.aQ, dzs.aN, dzs.aK, dzs.aL}){
            private final ThreadLocal<List<ObjectSet<is>>> g = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity((int)7));

            @Override
            public eoh a(eoh $$0, iz $$1, eoh $$2, dwp $$3, is $$4, is $$5) {
                eoh $$6 = $$0.a($$3, $$3, $$4, $$1, $$5, $$3.a_($$5), $$3.G_());
                if ($$0 != $$6) {
                    int $$7 = $$6.c(eox.aG);
                    List<ObjectSet<is>> $$8 = this.g.get();
                    if ($$8.isEmpty()) {
                        for (int $$9 = 0; $$9 < 7; ++$$9) {
                            $$8.add((ObjectSet<is>)new ObjectOpenHashSet());
                        }
                    }
                    $$8.get($$7).add((Object)$$4.j());
                }
                return $$0;
            }

            @Override
            public void a(dwp $$0) {
                is.a $$1 = new is.a();
                List<ObjectSet<is>> $$2 = this.g.get();
                for (int $$3 = 2; $$3 < $$2.size(); ++$$3) {
                    int $$4 = $$3 - 1;
                    ObjectSet<is> $$5 = $$2.get($$4);
                    ObjectSet<is> $$6 = $$2.get($$3);
                    for (is $$7 : $$5) {
                        eoh $$8 = $$0.a_($$7);
                        if ($$8.c(eox.aG) < $$4) continue;
                        $$0.a($$7, (eoh)$$8.b(eox.aG, $$4), 18);
                        if ($$3 == 7) continue;
                        for (iz $$9 : f) {
                            $$1.a((jy)$$7, $$9);
                            eoh $$10 = $$0.a_($$1);
                            if (!$$10.b(eox.aG) || $$8.c(eox.aG) <= $$3) continue;
                            $$6.add((Object)$$1.j());
                        }
                    }
                }
                $$2.clear();
            }
        };
        public static final /* enum */ b e = new b(new dzq[]{dzs.fM, dzs.fL}){

            @Override
            public eoh a(eoh $$0, iz $$1, eoh $$2, dwp $$3, is $$4, is $$5) {
                if ($$0.c(eib.c) == 7) {
                    dzq $$6;
                    dzq dzq2 = $$6 = $$0.a(dzs.fL) ? dzs.fH : dzs.fI;
                    if ($$2.a($$6)) {
                        return (eoh)($$0.a(dzs.fL) ? dzs.fJ : dzs.fK).m().b(edt.f, $$1);
                    }
                }
                return $$0;
            }
        };
        public static final iz[] f;
        private static final /* synthetic */ b[] g;

        public static b[] values() {
            return (b[])g.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        b(dzq ... $$0) {
            this(false, $$0);
        }

        b(boolean $$0, dzq ... $$1) {
            for (dzq $$2 : $$1) {
                k.put($$2, this);
            }
            if ($$0) {
                l.add(this);
            }
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b, c, d, e};
        }

        static {
            g = erf$b.a();
            f = iz.values();
        }
    }

    public static interface a {
        public eoh a(eoh var1, iz var2, eoh var3, dwp var4, is var5, is var6);

        default public void a(dwp $$0) {
        }
    }
}

