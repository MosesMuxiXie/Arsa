/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.ObjectArraySet
 *  org.apache.commons.lang3.mutable.MutableFloat
 */
import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableFloat;

public record dso(yh e, c f, jh<dso> g, kf h) {
    private final yh e;
    private final c f;
    private final jh<dso> g;
    private final kf h;
    public static final int a = 255;
    public static final Codec<dso> b = RecordCodecBuilder.create($$0 -> $$0.group((App)yj.a.fieldOf("description").forGetter(dso::f), (App)dso$c.a.forGetter(dso::g), (App)js.a(mj.bf).optionalFieldOf("exclusive_set", jh.a(new jd[0])).forGetter(dso::h), (App)dsp.b.optionalFieldOf("effects", (Object)kf.a).forGetter(dso::i)).apply((Applicative)$$0, dso::new));
    public static final Codec<jd<dso>> c = amr.a(mj.bf);
    public static final aao<xq, jd<dso>> d = aam.b(mj.bf);

    public static b a(int $$0) {
        return new b($$0, 0);
    }

    public static b a(int $$0, int $$1) {
        return new b($$0, $$1);
    }

    public static c a(jh<dlp> $$0, jh<dlp> $$1, int $$2, int $$3, b $$4, b $$5, int $$6, cgw ... $$7) {
        return new c($$0, Optional.of($$1), $$2, $$3, $$4, $$5, $$6, List.of($$7));
    }

    public static c a(jh<dlp> $$0, int $$1, int $$2, b $$3, b $$4, int $$5, cgw ... $$6) {
        return new c($$0, Optional.empty(), $$1, $$2, $$3, $$4, $$5, List.of($$6));
    }

    public Map<cgv, dlt> a(chl $$0) {
        EnumMap $$1 = Maps.newEnumMap(cgv.class);
        for (cgv $$2 : cgv.j) {
            dlt $$3;
            if (!this.a($$2) || ($$3 = $$0.a($$2)).f()) continue;
            $$1.put($$2, $$3);
        }
        return $$1;
    }

    public jh<dlp> a() {
        return this.f.a();
    }

    public boolean a(cgv $$0) {
        return this.f.h().stream().anyMatch($$1 -> $$1.b($$0));
    }

    public boolean a(dlt $$0) {
        return this.b($$0) && (this.f.c.isEmpty() || $$0.a(this.f.c.get()));
    }

    public boolean b(dlt $$0) {
        return $$0.a(this.f.b);
    }

    public int b() {
        return this.f.c();
    }

    public int c() {
        return this.f.g();
    }

    public int d() {
        return 1;
    }

    public int e() {
        return this.f.d();
    }

    public int b(int $$0) {
        return this.f.e().a($$0);
    }

    public int c(int $$0) {
        return this.f.f().a($$0);
    }

    @Override
    public String toString() {
        return "Enchantment " + this.e.getString();
    }

    public static boolean a(jd<dso> $$0, jd<dso> $$1) {
        return !$$0.equals($$1) && !$$0.a().g.a($$1) && !$$1.a().g.a($$0);
    }

    public static yh a(jd<dso> $$0, int $$1) {
        yw $$2 = $$0.a().e.f();
        $$2 = $$0.a(bds.o) ? yk.a($$2, zf.a.a(l.m)) : yk.a($$2, zf.a.a(l.h));
        if ($$1 != 1 || $$0.a().e() != 1) {
            $$2.b(yg.x).b(yh.c("enchantment.level." + $$1));
        }
        return $$2;
    }

    public boolean c(dlt $$0) {
        return this.f.a().a($$0.i());
    }

    public <T> List<T> a(kh<List<T>> $$0) {
        return this.h.a($$0, List.of());
    }

    public boolean a(axf $$0, int $$1, cgk $$2, cex $$3) {
        fnz $$4 = dso.b($$0, $$1, $$2, $$3);
        for (dsl $$5 : this.a(dsp.d)) {
            if (!$$5.a($$4)) continue;
            return true;
        }
        return false;
    }

    public void a(axf $$0, int $$1, dlt $$2, cgk $$3, cex $$4, MutableFloat $$5) {
        fnz $$6 = dso.b($$0, $$1, $$3, $$4);
        for (dsl $$7 : this.a(dsp.c)) {
            if (!$$7.a($$6)) continue;
            $$5.setValue(((dtj)$$7.a()).a($$1, $$3.ep(), $$5.floatValue()));
        }
    }

    public void a(axf $$0, int $$1, dlt $$2, MutableFloat $$3) {
        this.a(dsp.l, $$0, $$1, $$2, $$3);
    }

    public void b(axf $$0, int $$1, dlt $$2, MutableFloat $$3) {
        this.a(dsp.q, $$0, $$1, $$2, $$3);
    }

    public void c(axf $$0, int $$1, dlt $$2, MutableFloat $$3) {
        this.a(dsp.r, $$0, $$1, $$2, $$3);
    }

    public void d(axf $$0, int $$1, dlt $$2, MutableFloat $$3) {
        this.a(dsp.y, $$0, $$1, $$2, $$3);
    }

    public void a(axf $$0, int $$1, dlt $$2, cgk $$3, MutableFloat $$4) {
        this.a(dsp.z, $$0, $$1, $$2, $$3, $$4);
    }

    public void e(axf $$0, int $$1, dlt $$2, MutableFloat $$3) {
        this.a(dsp.A, $$0, $$1, $$2, $$3);
    }

    public void b(axf $$0, int $$1, dlt $$2, cgk $$3, MutableFloat $$4) {
        this.a(dsp.v, $$0, $$1, $$2, $$3, $$4);
    }

    public void a(bgr $$0, int $$1, MutableFloat $$2) {
        this.a(dsp.G, $$0, $$1, $$2);
    }

    public void c(axf $$0, int $$1, dlt $$2, cgk $$3, MutableFloat $$4) {
        this.a(dsp.w, $$0, $$1, $$2, $$3, $$4);
    }

    public void d(axf $$0, int $$1, dlt $$2, cgk $$3, MutableFloat $$4) {
        this.a(dsp.x, $$0, $$1, $$2, $$3, $$4);
    }

    public void b(axf $$0, int $$1, dlt $$2, cgk $$3, cex $$4, MutableFloat $$5) {
        this.a(dsp.e, $$0, $$1, $$2, $$3, $$4, $$5);
    }

    public void c(axf $$0, int $$1, dlt $$2, cgk $$3, cex $$4, MutableFloat $$5) {
        this.a(dsp.f, $$0, $$1, $$2, $$3, $$4, $$5);
    }

    public void d(axf $$0, int $$1, dlt $$2, cgk $$3, cex $$4, MutableFloat $$5) {
        this.a(dsp.g, $$0, $$1, $$2, $$3, $$4, $$5);
    }

    public void e(axf $$0, int $$1, dlt $$2, cgk $$3, cex $$4, MutableFloat $$5) {
        this.a(dsp.h, $$0, $$1, $$2, $$3, $$4, $$5);
    }

    public void a(axf $$0, int $$1, dsn $$2, dss $$3, cgk $$4, cex $$5) {
        for (dsx $$6 : this.a(dsp.i)) {
            if ($$3 != $$6.a()) continue;
            dso.a($$6, $$0, $$1, $$2, $$4, $$5);
        }
    }

    public static void a(dsx<dth> $$0, axf $$1, int $$2, dsn $$3, cgk $$4, cex $$5) {
        if ($$0.a(dso.b($$1, $$2, $$4, $$5))) {
            cgk $$6;
            switch ($$0.b()) {
                default: {
                    throw new MatchException(null, null);
                }
                case a: {
                    cgk cgk2 = $$5.d();
                    break;
                }
                case b: {
                    cgk cgk2 = $$5.c();
                    break;
                }
                case c: {
                    cgk cgk2 = $$6 = $$4;
                }
            }
            if ($$6 != null) {
                $$0.c().a($$1, $$2, $$3, $$6, $$6.dI());
            }
        }
    }

    public void a(axf $$0, int $$1, dsn $$2, cgk $$3) {
        dso.a(this.a(dsp.j), dso.a($$0, $$1, $$3, $$3.dI()), (T $$4) -> $$4.a($$0, $$1, $$2, $$3, $$3.dI()));
    }

    public void e(axf $$0, int $$1, dlt $$2, cgk $$3, MutableFloat $$4) {
        this.a(dsp.u, $$0, $$1, $$2, $$3, $$4);
    }

    public void f(axf $$0, int $$1, dlt $$2, cgk $$3, MutableFloat $$4) {
        this.a(dsp.t, $$0, $$1, $$2, $$3, $$4);
    }

    public void b(bgr $$0, int $$1, MutableFloat $$2) {
        this.a(dsp.B, $$0, $$1, $$2);
    }

    public void a(kh<dtj> $$0, bgr $$1, int $$2, MutableFloat $$3) {
        dtj $$4 = this.h.a($$0);
        if ($$4 != null) {
            $$3.setValue($$4.a($$2, $$1, $$3.floatValue()));
        }
    }

    public void b(axf $$0, int $$1, dsn $$2, cgk $$3) {
        dso.a(this.a(dsp.p), dso.a($$0, $$1, $$3, $$3.dI()), (T $$4) -> $$4.a($$0, $$1, $$2, $$3, $$3.dI()));
    }

    public void c(axf $$0, int $$1, dsn $$2, cgk $$3) {
        dso.a(this.a(dsp.s), dso.a($$0, $$1, $$3, $$3.dI()), (T $$4) -> $$4.a($$0, $$1, $$2, $$3, $$3.dI()));
    }

    public void a(axf $$0, int $$1, dsn $$2, cgk $$3, ftm $$4, eoh $$52) {
        dso.a(this.a(dsp.k), dso.a($$0, $$1, $$3, $$4, $$52), (T $$5) -> $$5.a($$0, $$1, $$2, $$3, $$4));
    }

    private void a(kh<List<dsl<dtj>>> $$0, axf $$1, int $$2, dlt $$32, MutableFloat $$4) {
        dso.a(this.a($$0), dso.a($$1, $$2, $$32), (T $$3) -> $$4.setValue($$3.a($$2, $$1.G_(), $$4.floatValue())));
    }

    private void a(kh<List<dsl<dtj>>> $$0, axf $$1, int $$2, dlt $$32, cgk $$4, MutableFloat $$5) {
        dso.a(this.a($$0), dso.a($$1, $$2, $$4, $$4.dI()), (T $$3) -> $$5.setValue($$3.a($$2, $$4.ep(), $$5.floatValue())));
    }

    private void a(kh<List<dsl<dtj>>> $$0, axf $$1, int $$2, dlt $$32, cgk $$4, cex $$5, MutableFloat $$6) {
        dso.a(this.a($$0), dso.b($$1, $$2, $$4, $$5), (T $$3) -> $$6.setValue($$3.a($$2, $$4.ep(), $$6.floatValue())));
    }

    public static fnz b(axf $$0, int $$1, cgk $$2, cex $$3) {
        fod $$4 = new fod.a($$0).a(fqx.a, $$2).a(fqx.m, $$1).a(fqx.h, $$2.dI()).a(fqx.e, $$3).b(fqx.f, $$3.d()).b(fqx.g, $$3.c()).a(fqw.v);
        return new fnz.b($$4).a(Optional.empty());
    }

    private static fnz a(axf $$0, int $$1, dlt $$2) {
        fod $$3 = new fod.a($$0).a(fqx.k, $$2).a(fqx.m, $$1).a(fqw.w);
        return new fnz.b($$3).a(Optional.empty());
    }

    private static fnz a(axf $$0, int $$1, cgk $$2, boolean $$3) {
        fod $$4 = new fod.a($$0).a(fqx.a, $$2).a(fqx.m, $$1).a(fqx.h, $$2.dI()).a(fqx.n, $$3).a(fqw.x);
        return new fnz.b($$4).a(Optional.empty());
    }

    private static fnz a(axf $$0, int $$1, cgk $$2, ftm $$3) {
        fod $$4 = new fod.a($$0).a(fqx.a, $$2).a(fqx.m, $$1).a(fqx.h, $$3).a(fqw.y);
        return new fnz.b($$4).a(Optional.empty());
    }

    private static fnz a(axf $$0, int $$1, cgk $$2, ftm $$3, eoh $$4) {
        fod $$5 = new fod.a($$0).a(fqx.a, $$2).a(fqx.m, $$1).a(fqx.h, $$3).a(fqx.i, $$4).a(fqw.z);
        return new fnz.b($$5).a(Optional.empty());
    }

    private static <T> void a(List<dsl<T>> $$0, fnz $$1, Consumer<T> $$2) {
        for (dsl<T> $$3 : $$0) {
            if (!$$3.a($$1)) continue;
            $$2.accept($$3.a());
        }
    }

    public void a(axf $$0, int $$1, dsn $$2, chl $$32) {
        cgv $$4 = $$2.b();
        if ($$4 == null) {
            return;
        }
        Map<dso, Set<dti>> $$5 = $$32.c($$4);
        if (!this.a($$4)) {
            Set<dti> $$6 = $$5.remove(this);
            if ($$6 != null) {
                $$6.forEach($$3 -> $$3.a($$2, $$32, $$32.dI(), $$1));
            }
            return;
        }
        ObjectArraySet $$7 = $$5.get(this);
        for (dsl $$8 : this.a(dsp.o)) {
            boolean $$10;
            dti $$9 = (dti)$$8.a();
            boolean bl = $$10 = $$7 != null && $$7.contains($$9);
            if ($$8.a(dso.a($$0, $$1, (cgk)$$32, $$10))) {
                if (!$$10) {
                    if ($$7 == null) {
                        $$7 = new ObjectArraySet();
                        $$5.put(this, (Set<dti>)$$7);
                    }
                    $$7.add((dti)$$9);
                }
                $$9.a($$0, $$1, $$2, $$32, $$32.dI(), !$$10);
                continue;
            }
            if ($$7 == null || !$$7.remove($$9)) continue;
            $$9.a($$2, $$32, $$32.dI(), $$1);
        }
        if ($$7 != null && $$7.isEmpty()) {
            $$5.remove(this);
        }
    }

    public void a(int $$0, dsn $$1, chl $$2) {
        cgv $$3 = $$1.b();
        if ($$3 == null) {
            return;
        }
        Set<dti> $$4 = $$2.c($$3).remove(this);
        if ($$4 == null) {
            return;
        }
        for (dti $$5 : $$4) {
            $$5.a($$1, $$2, $$2.dI(), $$0);
        }
    }

    public static a a(c $$0) {
        return new a($$0);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{dso.class, "description;definition;exclusiveSet;effects", "e", "f", "g", "h"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{dso.class, "description;definition;exclusiveSet;effects", "e", "f", "g", "h"}, this, $$0);
    }

    public yh f() {
        return this.e;
    }

    public c g() {
        return this.f;
    }

    public jh<dso> h() {
        return this.g;
    }

    public kf i() {
        return this.h;
    }

    public static final class c
    extends Record {
        final jh<dlp> b;
        final Optional<jh<dlp>> c;
        private final int d;
        private final int e;
        private final b f;
        private final b g;
        private final int h;
        private final List<cgw> i;
        public static final MapCodec<c> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)js.a(mj.R).fieldOf("supported_items").forGetter(c::a), (App)js.a(mj.R).optionalFieldOf("primary_items").forGetter(c::b), (App)bfm.a(1, 1024).fieldOf("weight").forGetter(c::c), (App)bfm.a(1, 255).fieldOf("max_level").forGetter(c::d), (App)dso$b.a.fieldOf("min_cost").forGetter(c::e), (App)dso$b.a.fieldOf("max_cost").forGetter(c::f), (App)bfm.q.fieldOf("anvil_cost").forGetter(c::g), (App)cgw.m.listOf().fieldOf("slots").forGetter(c::h)).apply((Applicative)$$0, c::new));

        public c(jh<dlp> $$0, Optional<jh<dlp>> $$1, int $$2, int $$3, b $$4, b $$5, int $$6, List<cgw> $$7) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
            this.f = $$4;
            this.g = $$5;
            this.h = $$6;
            this.i = $$7;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "supportedItems;primaryItems;weight;maxLevel;minCost;maxCost;anvilCost;slots", "b", "c", "d", "e", "f", "g", "h", "i"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "supportedItems;primaryItems;weight;maxLevel;minCost;maxCost;anvilCost;slots", "b", "c", "d", "e", "f", "g", "h", "i"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "supportedItems;primaryItems;weight;maxLevel;minCost;maxCost;anvilCost;slots", "b", "c", "d", "e", "f", "g", "h", "i"}, this, $$0);
        }

        public jh<dlp> a() {
            return this.b;
        }

        public Optional<jh<dlp>> b() {
            return this.c;
        }

        public int c() {
            return this.d;
        }

        public int d() {
            return this.e;
        }

        public b e() {
            return this.f;
        }

        public b f() {
            return this.g;
        }

        public int g() {
            return this.h;
        }

        public List<cgw> h() {
            return this.i;
        }
    }

    public static final class b
    extends Record {
        private final int b;
        private final int c;
        public static final Codec<b> a = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.INT.fieldOf("base").forGetter(b::a), (App)Codec.INT.fieldOf("per_level_above_first").forGetter(b::b)).apply((Applicative)$$0, b::new));

        public b(int $$0, int $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        public int a(int $$0) {
            return this.b + this.c * ($$0 - 1);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "base;perLevelAboveFirst", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "base;perLevelAboveFirst", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "base;perLevelAboveFirst", "b", "c"}, this, $$0);
        }

        public int a() {
            return this.b;
        }

        public int b() {
            return this.c;
        }
    }

    public static class a {
        private final c a;
        private jh<dso> b = jh.a(new jd[0]);
        private final Map<kh<?>, List<?>> c = new HashMap();
        private final kf.a d = kf.a();

        public a(c $$0) {
            this.a = $$0;
        }

        public a a(jh<dso> $$0) {
            this.b = $$0;
            return this;
        }

        public <E> a a(kh<List<dsl<E>>> $$0, E $$1, frm.a $$2) {
            this.b($$0).add(new dsl<E>($$1, Optional.of($$2.build())));
            return this;
        }

        public <E> a a(kh<List<dsl<E>>> $$0, E $$1) {
            this.b($$0).add(new dsl<E>($$1, Optional.empty()));
            return this;
        }

        public <E> a a(kh<List<dsx<E>>> $$0, dss $$1, dss $$2, E $$3, frm.a $$4) {
            this.b($$0).add(new dsx<E>($$1, $$2, $$3, Optional.of($$4.build())));
            return this;
        }

        public <E> a a(kh<List<dsx<E>>> $$0, dss $$1, dss $$2, E $$3) {
            this.b($$0).add(new dsx<E>($$1, $$2, $$3, Optional.empty()));
            return this;
        }

        public a a(kh<List<dtg>> $$0, dtg $$1) {
            this.b($$0).add($$1);
            return this;
        }

        public <E> a b(kh<E> $$0, E $$1) {
            this.d.a($$0, $$1);
            return this;
        }

        public a a(kh<bhr> $$0) {
            this.d.a($$0, bhr.a);
            return this;
        }

        private <E> List<E> b(kh<List<E>> $$0) {
            return this.c.computeIfAbsent($$0, $$1 -> {
                ArrayList $$2 = new ArrayList();
                this.d.a($$0, $$2);
                return $$2;
            });
        }

        public dso a(amo $$0) {
            return new dso(yh.c(bhs.a("enchantment", $$0)), this.a, this.b, this.d.a());
        }
    }
}
