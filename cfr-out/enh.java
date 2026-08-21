/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  org.slf4j.Logger
 */
import com.google.common.annotations.VisibleForTesting;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.UUID;
import org.slf4j.Logger;

public final class enh {
    private static final Logger b = LogUtils.getLogger();
    public static final int a = 40;
    private static final int c = 36000;
    private static final int d = 14;
    private static final int e = 47;
    private static final int f = bgj.i(47);
    private static final float g = 0.02f;
    private final enl h = new enl();
    private b i;
    private final c j;
    private eng k;
    private final eng.a l;
    private boolean m;
    private boolean n;

    public enh(b $$0, c $$1, eng $$2, eng.a $$3) {
        this.i = $$0;
        this.j = $$1;
        this.k = $$2;
        this.l = $$3;
    }

    public eni a() {
        return this.n ? this.i.b().a() : this.i.c.a();
    }

    public eni b() {
        return this.i.c.a();
    }

    public eni c() {
        return this.i.d.a();
    }

    public void a(fnq $$0) {
        $$0.a(enl.a.a).ifPresent(this.h::a);
        this.i = $$0.a(enh$b.a).orElse(enh$b.b);
    }

    public void a(fns $$0) {
        $$0.a(enl.a.a, this.h.a());
        $$0.a(enh$b.a, this.i);
    }

    public void a(axf $$0, is $$1) {
        $$0.a($$1, (eoh)$$0.a_($$1).b(eiy.c, true), 3);
        $$0.c(3020, $$1, 1);
        this.n = true;
        this.h.a(this, $$0);
    }

    public void b(axf $$0, is $$1) {
        $$0.a($$1, (eoh)$$0.a_($$1).b(eiy.c, false), 3);
        this.n = false;
    }

    public boolean d() {
        return this.n;
    }

    public int e() {
        return this.i.e;
    }

    public int f() {
        return this.i.f;
    }

    public enk g() {
        return this.j.d();
    }

    public enl h() {
        return this.h;
    }

    public void a(dwo $$0, enk $$1) {
        this.j.a($$0, $$1);
    }

    public void i() {
        this.j.f();
    }

    public eng j() {
        return this.k;
    }

    public eng.a k() {
        return this.l;
    }

    public boolean a(axf $$0) {
        if (!$$0.U().a(eua.U).booleanValue()) {
            return false;
        }
        if (this.m) {
            return true;
        }
        if ($$0.av() == ccz.a) {
            return false;
        }
        return $$0.U().a(eua.V);
    }

    public Optional<UUID> c(axf $$0, is $$1) {
        bgr $$22 = $$0.G_();
        dxi $$3 = this.h.b(this, $$0.G_());
        try (bgp.j $$4 = new bgp.j(() -> "spawner@" + String.valueOf($$1), b);){
            Object $$11;
            dxi.a $$9;
            fnq $$5 = fno.a((bgp)$$4, (jf.a)$$0.J_(), $$3.d());
            Optional<cgu<?>> $$6 = cgu.a($$5);
            if ($$6.isEmpty()) {
                Optional<UUID> optional = Optional.empty();
                return optional;
            }
            ftm $$7 = $$5.a("Pos", ftm.a).orElseGet(() -> {
                eni $$2 = this.a();
                return new ftm((double)$$1.u() + ($$22.j() - $$22.j()) * (double)$$2.c() + 0.5, $$1.v() + $$22.a(3) - 1, (double)$$1.w() + ($$22.j() - $$22.j()) * (double)$$2.c() + 0.5);
            });
            if (!$$0.b($$6.get().a($$7.g, $$7.h, $$7.i))) {
                Optional<UUID> optional = Optional.empty();
                return optional;
            }
            if (!enh.a((dwo)$$0, $$1.b(), $$7)) {
                Optional<UUID> optional = Optional.empty();
                return optional;
            }
            is $$8 = is.a($$7);
            if (!cih.a($$6.get(), $$0, cgt.q, $$8, $$0.G_())) {
                Optional<UUID> optional = Optional.empty();
                return optional;
            }
            if ($$3.b().isPresent() && !($$9 = $$3.b().get()).a($$8, $$0)) {
                Optional<UUID> optional = Optional.empty();
                return optional;
            }
            cgk $$10 = cgu.a($$5, (dwo)$$0, cgt.q, (cgk $$2) -> {
                $$2.b($$0.g, $$0.h, $$0.i, $$22.i() * 360.0f, 0.0f);
                return $$2;
            });
            if ($$10 == null) {
                Optional<UUID> optional = Optional.empty();
                return optional;
            }
            if ($$10 instanceof chn) {
                boolean $$12;
                $$11 = (chn)$$10;
                if (!((chn)$$11).a((dwr)$$0)) {
                    Optional<UUID> optional = Optional.empty();
                    return optional;
                }
                boolean bl2 = $$12 = $$3.a().i() == 1 && $$3.a().i("id").isPresent();
                if ($$12) {
                    ((chn)$$11).a((dxf)$$0, $$0.c(((cgk)$$11).dK()), cgt.q, null);
                }
                ((chn)$$11).gz();
                $$3.c().ifPresent(((chn)$$11)::a);
            }
            if (!$$0.e($$10)) {
                $$11 = Optional.empty();
                return $$11;
            }
            a $$13 = this.n ? enh$a.b : enh$a.a;
            $$0.c(3011, $$1, $$13.a());
            $$0.c(3012, $$8, $$13.a());
            $$0.a($$10, etk.t, $$8);
            Optional<UUID> optional = Optional.of($$10.cY());
            return optional;
        }
    }

    public void a(axf $$0, is $$1, amt<fof> $$2) {
        fod $$4;
        fof $$3 = $$0.s().be().a($$2);
        ObjectArrayList<dlt> $$5 = $$3.a($$4 = new fod.a($$0).a(fqw.b));
        if (!$$5.isEmpty()) {
            for (dlt $$6 : $$5) {
                lf.a($$0, $$6, 2, iz.b, ftm.c($$1).a(iz.b, 1.2));
            }
            $$0.c(3014, $$1, 0);
        }
    }

    public void a(dwo $$0, is $$1, boolean $$2) {
        bgr $$5;
        enk $$3 = this.g();
        $$3.a($$0, $$1, $$2);
        if ($$3.d()) {
            double $$4 = Math.max(0L, this.h.d - $$0.au());
            this.h.i = this.h.h;
            this.h.h = (this.h.h + $$3.b() / ($$4 + 200.0)) % 360.0;
        }
        if ($$3.e() && ($$5 = $$0.G_()).i() <= 0.02f) {
            bcz $$6 = $$2 ? bda.od : bda.oc;
            $$0.a($$1, $$6, bdb.e, $$5.i() * 0.25f + 0.75f, $$5.i() + 0.5f, false);
        }
    }

    public void a(axf $$0, is $$1, boolean $$22) {
        enk $$4;
        this.n = $$22;
        enk $$3 = this.g();
        if (this.h.b.removeIf($$2 -> enh.a($$0, $$1, $$2))) {
            this.h.d = $$0.au() + (long)this.a().h();
        }
        if (($$4 = $$3.a($$1, this, $$0)) != $$3) {
            this.a((dwo)$$0, $$4);
        }
    }

    private static boolean a(axf $$0, is $$1, UUID $$2) {
        cgk $$3 = $$0.d($$2);
        return $$3 == null || !$$3.cb() || !$$3.ao().aq().equals($$0.aq()) || $$3.dK().j($$1) > (double)f;
    }

    private static boolean a(dwo $$0, ftm $$1, ftm $$2) {
        fti $$3 = $$0.a(new dvw($$2, $$1, dvw.a.c, dvw.b.a, ftr.a()));
        return $$3.b().equals(is.a($$1)) || $$3.d() == ftk.a.a;
    }

    public static void a(dwo $$0, is $$1, bgr $$2, md $$3) {
        for (int $$4 = 0; $$4 < 20; ++$$4) {
            double $$5 = (double)$$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
            double $$6 = (double)$$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
            double $$7 = (double)$$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
            $$0.a(ly.ai, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$3, $$5, $$6, $$7, 0.0, 0.0, 0.0);
        }
    }

    public static void a(dwo $$0, is $$1, bgr $$2) {
        for (int $$3 = 0; $$3 < 20; ++$$3) {
            double $$4 = (double)$$1.u() + 0.5 + ($$2.j() - 0.5) * 2.0;
            double $$5 = (double)$$1.v() + 0.5 + ($$2.j() - 0.5) * 2.0;
            double $$6 = (double)$$1.w() + 0.5 + ($$2.j() - 0.5) * 2.0;
            double $$7 = $$2.k() * 0.02;
            double $$8 = $$2.k() * 0.02;
            double $$9 = $$2.k() * 0.02;
            $$0.a(ly.bi, $$4, $$5, $$6, $$7, $$8, $$9);
            $$0.a(ly.O, $$4, $$5, $$6, $$7, $$8, $$9);
        }
    }

    public static void a(dwo $$0, is $$1, bgr $$2, int $$3, lw $$4) {
        for (int $$5 = 0; $$5 < 30 + Math.min($$3, 10) * 5; ++$$5) {
            double $$6 = (double)(2.0f * $$2.i() - 1.0f) * 0.65;
            double $$7 = (double)(2.0f * $$2.i() - 1.0f) * 0.65;
            double $$8 = (double)$$1.u() + 0.5 + $$6;
            double $$9 = (double)$$1.v() + 0.1 + (double)$$2.i() * 0.8;
            double $$10 = (double)$$1.w() + 0.5 + $$7;
            $$0.a($$4, $$8, $$9, $$10, 0.0, 0.0, 0.0);
        }
    }

    public static void b(dwo $$0, is $$1, bgr $$2) {
        for (int $$3 = 0; $$3 < 20; ++$$3) {
            double $$4 = (double)$$1.u() + 0.4 + $$2.j() * 0.2;
            double $$5 = (double)$$1.v() + 0.4 + $$2.j() * 0.2;
            double $$6 = (double)$$1.w() + 0.4 + $$2.j() * 0.2;
            double $$7 = $$2.k() * 0.02;
            double $$8 = $$2.k() * 0.02;
            double $$9 = $$2.k() * 0.02;
            $$0.a(ly.aN, $$4, $$5, $$6, $$7, $$8, $$9 * 0.25);
            $$0.a(ly.ai, $$4, $$5, $$6, $$7, $$8, $$9);
        }
    }

    public void a(cgu<?> $$0, dwo $$1) {
        this.h.b();
        this.i = this.i.a($$0);
        this.a($$1, enk.a);
    }

    @Deprecated(forRemoval=true)
    @VisibleForTesting
    public void a(eng $$0) {
        this.k = $$0;
    }

    @Deprecated(forRemoval=true)
    @VisibleForTesting
    public void l() {
        this.m = true;
    }

    public static final class b
    extends Record {
        final jd<eni> c;
        final jd<eni> d;
        final int e;
        final int f;
        public static final MapCodec<b> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)eni.c.optionalFieldOf("normal_config", jd.a(eni.a)).forGetter(b::a), (App)eni.c.optionalFieldOf("ominous_config", jd.a(eni.a)).forGetter(b::b), (App)bfm.q.optionalFieldOf("target_cooldown_length", (Object)36000).forGetter(b::c), (App)Codec.intRange((int)1, (int)128).optionalFieldOf("required_player_range", (Object)14).forGetter(b::d)).apply((Applicative)$$0, b::new));
        public static final b b = new b(jd.a(eni.a), jd.a(eni.a), 36000, 14);

        public b(jd<eni> $$0, jd<eni> $$1, int $$2, int $$3) {
            this.c = $$0;
            this.d = $$1;
            this.e = $$2;
            this.f = $$3;
        }

        public b a(cgu<?> $$0) {
            return new b(jd.a(this.c.a().a($$0)), jd.a(this.d.a().a($$0)), this.e, this.f);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "normal;ominous;targetCooldownLength;requiredPlayerRange", "c", "d", "e", "f"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "normal;ominous;targetCooldownLength;requiredPlayerRange", "c", "d", "e", "f"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "normal;ominous;targetCooldownLength;requiredPlayerRange", "c", "d", "e", "f"}, this, $$0);
        }

        public jd<eni> a() {
            return this.c;
        }

        public jd<eni> b() {
            return this.d;
        }

        public int c() {
            return this.e;
        }

        public int d() {
            return this.f;
        }
    }

    public static interface c {
        public void a(dwo var1, enk var2);

        public enk d();

        public void f();
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a a = new a(ly.G);
        public static final /* enum */ a b = new a(ly.O);
        public final md c;
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        private a(md $$0) {
            this.c = $$0;
        }

        public static a a(int $$0) {
            a[] $$1 = enh$a.values();
            if ($$0 > $$1.length || $$0 < 0) {
                return a;
            }
            return $$1[$$0];
        }

        public int a() {
            return this.ordinal();
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a, b};
        }

        static {
            d = enh$a.b();
        }
    }
}

