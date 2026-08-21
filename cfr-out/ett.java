/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;
import org.jspecify.annotations.Nullable;

public interface ett {
    public static final List<amt<etk>> d_ = List.of(etk.T.h(), etk.U.h(), etk.V.h(), etk.W.h(), etk.X.h(), etk.Y.h(), etk.Z.h(), etk.aa.h(), etk.ab.h(), etk.ac.h(), etk.ad.h(), etk.ae.h(), etk.af.h(), etk.ag.h(), etk.ah.h());
    public static final int e_ = 0;
    public static final ToIntFunction<amt<etk>> f_ = (ToIntFunction)bhs.a(new Reference2IntOpenHashMap(), $$0 -> {
        $$0.defaultReturnValue(0);
        $$0.put(etk.P.h(), 1);
        $$0.put(etk.Q.h(), 1);
        $$0.put(etk.x.h(), 1);
        $$0.put(etk.J.h(), 2);
        $$0.put(etk.A.h(), 2);
        $$0.put(etk.O.h(), 2);
        $$0.put(etk.C.h(), 3);
        $$0.put(etk.K.h(), 3);
        $$0.put(etk.B.h(), 3);
        $$0.put(etk.u.h(), 4);
        $$0.put(etk.n.h(), 4);
        $$0.put(etk.S.h(), 4);
        $$0.put(etk.q.h(), 5);
        $$0.put(etk.v.h(), 5);
        $$0.put(etk.r.h(), 6);
        $$0.put(etk.M.h(), 6);
        $$0.put(etk.s.h(), 6);
        $$0.put(etk.o.h(), 7);
        $$0.put(etk.l.h(), 8);
        $$0.put(etk.m.h(), 8);
        $$0.put(etk.j.h(), 9);
        $$0.put(etk.d.h(), 9);
        $$0.put(etk.e.h(), 9);
        $$0.put(etk.g.h(), 9);
        $$0.put(etk.k.h(), 10);
        $$0.put(etk.h.h(), 10);
        $$0.put(etk.a.h(), 10);
        $$0.put(etk.b.h(), 10);
        $$0.put(etk.I.h(), 10);
        $$0.put(etk.H.h(), 10);
        $$0.put(etk.c.h(), 11);
        $$0.put(etk.f.h(), 12);
        $$0.put(etk.y.h(), 12);
        $$0.put(etk.i.h(), 13);
        $$0.put(etk.z.h(), 13);
        $$0.put(etk.t.h(), 14);
        $$0.put(etk.G.h(), 14);
        $$0.put(etk.R.h(), 14);
        $$0.put(etk.p.h(), 15);
        $$0.put(etk.w.h(), 15);
        for (int $$1 = 1; $$1 <= 15; ++$$1) {
            $$0.put(ett.b($$1), $$1);
        }
    });

    public a gS();

    public d gT();

    public static int a_(jd<etk> $$0) {
        return $$0.e().map(ett::a).orElse(0);
    }

    public static int a(amt<etk> $$0) {
        return f_.applyAsInt($$0);
    }

    public static amt<etk> b(int $$0) {
        return d_.get($$0 - 1);
    }

    public static int a_(float $$0, int $$1) {
        double $$2 = 15.0 / (double)$$1;
        return Math.max(1, 15 - bgj.c($$2 * (double)$$0));
    }

    public static interface d {
        public int a();

        public eto b();

        public boolean a(axf var1, is var2, jd<etk> var3, etk.a var4);

        public void a(axf var1, is var2, jd<etk> var3, @Nullable cgk var4, @Nullable cgk var5, float var6);

        default public bef<etk> c() {
            return bdw.a;
        }

        default public boolean d() {
            return false;
        }

        default public boolean f() {
            return false;
        }

        default public int a(float $$0) {
            return bgj.b($$0);
        }

        default public boolean a(jd<etk> $$0, etk.a $$1) {
            if (!$$0.a(this.c())) {
                return false;
            }
            cgk $$2 = $$1.a();
            if ($$2 != null) {
                if ($$2.au()) {
                    return false;
                }
                if ($$2.cv() && $$0.a(bdw.d)) {
                    if (this.d() && $$2 instanceof axg) {
                        axg $$3 = (axg)$$2;
                        aj.ad.a($$3);
                    }
                    return false;
                }
                if ($$2.bw()) {
                    return false;
                }
            }
            if ($$1.b() != null) {
                return !$$1.b().a(bdp.V);
            }
            return true;
        }

        default public void e() {
        }
    }

    public static interface c {
        /*
         * WARNING - void declaration
         */
        public static void a(dwo $$0, a $$1, d $$2) {
            void $$4;
            if (!($$0 instanceof axf)) {
                return;
            }
            axf $$3 = (axf)$$0;
            if ($$1.c == null) {
                c.a((axf)$$4, $$1, $$2);
            }
            if ($$1.c == null) {
                return;
            }
            boolean $$5 = $$1.c() > 0;
            c.b((axf)$$4, $$1, $$2);
            $$1.d();
            if ($$1.c() <= 0) {
                $$5 = c.a((axf)$$4, $$1, $$2, $$1.c);
            }
            if ($$5) {
                $$2.e();
            }
        }

        private static void a(axf $$0, a $$1, d $$2) {
            $$1.a().a($$0.au()).ifPresent($$3 -> {
                $$1.a((etr)$$3);
                ftm $$4 = $$3.c();
                $$1.a($$2.a($$3.b()));
                $$0.a(new mg($$2.b(), $$1.c()), $$4.g, $$4.h, $$4.i, 1, 0.0, 0.0, 0.0, 0.0);
                $$2.e();
                $$1.a().a();
            });
        }

        private static void b(axf $$0, a $$1, d $$2) {
            double $$11;
            double $$10;
            int $$7;
            double $$8;
            double $$9;
            boolean $$12;
            if (!$$1.e()) {
                return;
            }
            if ($$1.c == null) {
                $$1.a(false);
                return;
            }
            ftm $$3 = $$1.c.c();
            eto $$4 = $$2.b();
            ftm $$5 = $$4.a($$0).orElse($$3);
            int $$6 = $$1.c();
            boolean bl2 = $$12 = $$0.a(new mg($$4, $$6), $$9 = bgj.d($$8 = 1.0 - (double)$$6 / (double)($$7 = $$2.a($$1.c.b())), $$3.g, $$5.g), $$10 = bgj.d($$8, $$3.h, $$5.h), $$11 = bgj.d($$8, $$3.i, $$5.i), 1, 0.0, 0.0, 0.0, 0.0) > 0;
            if ($$12) {
                $$1.a(false);
            }
        }

        private static boolean a(axf $$0, a $$1, d $$2, etr $$3) {
            is $$4 = is.a($$3.c());
            is $$5 = $$2.b().a($$0).map(is::a).orElse($$4);
            if ($$2.f() && !c.a($$0, $$5)) {
                return false;
            }
            $$2.a($$0, $$4, $$3.a(), $$3.a($$0).orElse(null), $$3.b($$0).orElse(null), b.a($$4, $$5));
            $$1.a(null);
            return true;
        }

        private static boolean a(dwo $$0, is $$1) {
            dvu $$2 = new dvu($$1);
            for (int $$3 = $$2.h - 1; $$3 <= $$2.h + 1; ++$$3) {
                for (int $$4 = $$2.i - 1; $$4 <= $$2.i + 1; ++$$4) {
                    if ($$0.a(dvu.d($$3, $$4)) && $$0.ac().a($$3, $$4) != null) continue;
                    return false;
                }
            }
            return true;
        }
    }

    public static class b
    implements etm {
        private final ett a;

        public b(ett $$0) {
            this.a = $$0;
        }

        @Override
        public eto a() {
            return this.a.gT().b();
        }

        @Override
        public int b() {
            return this.a.gT().a();
        }

        @Override
        public boolean a(axf $$0, jd<etk> $$1, etk.a $$2, ftm $$3) {
            a $$4 = this.a.gS();
            d $$5 = this.a.gT();
            if ($$4.b() != null) {
                return false;
            }
            if (!$$5.a($$1, $$2)) {
                return false;
            }
            Optional<ftm> $$6 = $$5.b().a($$0);
            if ($$6.isEmpty()) {
                return false;
            }
            ftm $$7 = $$6.get();
            if (!$$5.a($$0, is.a($$3), $$1, $$2)) {
                return false;
            }
            if (b.a($$0, $$3, $$7)) {
                return false;
            }
            this.a($$0, $$4, $$1, $$2, $$3, $$7);
            return true;
        }

        public void b(axf $$0, jd<etk> $$1, etk.a $$2, ftm $$3) {
            this.a.gT().b().a($$0).ifPresent($$4 -> this.a($$0, this.a.gS(), $$1, $$2, $$3, (ftm)$$4));
        }

        private void a(axf $$0, a $$1, jd<etk> $$2, etk.a $$3, ftm $$4, ftm $$5) {
            $$1.e.a(new etr($$2, (float)$$4.f($$5), $$4, $$3.a()), $$0.au());
        }

        public static float a(is $$0, is $$1) {
            return (float)Math.sqrt($$0.j($$1));
        }

        private static boolean a(dwo $$02, ftm $$1, ftm $$2) {
            ftm $$3 = new ftm((double)bgj.c($$1.g) + 0.5, (double)bgj.c($$1.h) + 0.5, (double)bgj.c($$1.i) + 0.5);
            ftm $$4 = new ftm((double)bgj.c($$2.g) + 0.5, (double)bgj.c($$2.h) + 0.5, (double)bgj.c($$2.i) + 0.5);
            for (iz $$5 : iz.values()) {
                ftm $$6 = $$3.a($$5, (double)1.0E-5f);
                if ($$02.a(new dvv($$6, $$4, $$0 -> $$0.a(bdp.bE))).d() == ftk.a.b) continue;
                return false;
            }
            return true;
        }
    }

    public static final class a {
        public static Codec<a> a = RecordCodecBuilder.create($$02 -> $$02.group((App)etr.a.lenientOptionalFieldOf("event").forGetter($$0 -> Optional.ofNullable($$0.c)), (App)ets.a.fieldOf("selector").forGetter(a::a), (App)bfm.q.fieldOf("event_delay").orElse((Object)0).forGetter(a::c)).apply((Applicative)$$02, ($$0, $$1, $$2) -> new a($$0.orElse(null), (ets)$$1, (int)$$2, true)));
        public static final String b = "listener";
        @Nullable etr c;
        private int d;
        final ets e;
        private boolean f;

        private a(@Nullable etr $$0, ets $$1, int $$2, boolean $$3) {
            this.c = $$0;
            this.d = $$2;
            this.e = $$1;
            this.f = $$3;
        }

        public a() {
            this(null, new ets(), 0, false);
        }

        public ets a() {
            return this.e;
        }

        public @Nullable etr b() {
            return this.c;
        }

        public void a(@Nullable etr $$0) {
            this.c = $$0;
        }

        public int c() {
            return this.d;
        }

        public void a(int $$0) {
            this.d = $$0;
        }

        public void d() {
            this.d = Math.max(0, this.d - 1);
        }

        public boolean e() {
            return this.f;
        }

        public void a(boolean $$0) {
            this.f = $$0;
        }
    }
}

