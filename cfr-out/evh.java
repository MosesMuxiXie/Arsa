/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class evh {
    public static final f a = evh.a(0, false, fei.b);
    public static final f b = evh.a(0, true, fei.b);
    public static final f c = evh.a(0, true, 6, fei.b);
    public static final f d = evh.a(0, true, 30, fei.b);
    public static final f e = evh.a(0, false, fei.a);
    public static final f f = evh.a(0, true, fei.a);

    public static f a(int $$0, boolean $$1, fei $$2) {
        return new t($$0, $$1, 0, $$2);
    }

    public static f a(int $$0, boolean $$1, int $$2, fei $$3) {
        return new t($$0, $$1, $$2, $$3);
    }

    public static f a(f $$0) {
        return new n($$0);
    }

    public static f a(evk $$0, int $$1) {
        return new aa($$0, $$1, false);
    }

    public static f b(evk $$0, int $$1) {
        return new aa($$0, $$1, true);
    }

    public static f a(int $$0, int $$1) {
        return new z($$0, $$1, false);
    }

    public static f b(int $$0, int $$1) {
        return new z($$0, $$1, true);
    }

    @SafeVarargs
    public static f a(amt<dxo> ... $$0) {
        return evh.a(List.of($$0));
    }

    private static c a(List<amt<dxo>> $$0) {
        return new c($$0);
    }

    public static f a(amt<fke.a> $$0, double $$1) {
        return evh.a($$0, $$1, Double.MAX_VALUE);
    }

    public static f a(amt<fke.a> $$0, double $$1, double $$2) {
        return new l($$0, $$1, $$2);
    }

    public static f a(String $$0, evk $$1, evk $$2) {
        return new y(amo.a($$0), $$1, $$2);
    }

    public static f a() {
        return s.a;
    }

    public static f b() {
        return h.a;
    }

    public static f c() {
        return evh$a.a;
    }

    public static f d() {
        return v.a;
    }

    public static o a(f $$0, o $$1) {
        return new x($$0, $$1);
    }

    public static o a(o ... $$0) {
        if ($$0.length == 0) {
            throw new IllegalArgumentException("Need at least 1 rule for a sequence");
        }
        return new q(Arrays.asList($$0));
    }

    public static o a(eoh $$0) {
        return new d($$0);
    }

    public static o e() {
        return evh$b.a;
    }

    static <A> MapCodec<? extends A> a(jq<MapCodec<? extends A>> $$0, String $$1, bga<? extends A> $$2) {
        return jq.a($$0, $$1, $$2.a());
    }

    static final class t
    extends Record
    implements f {
        final int a;
        final boolean c;
        final int d;
        private final fei e;
        static final bga<t> f = bga.a(RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.INT.fieldOf("offset").forGetter(t::b), (App)Codec.BOOL.fieldOf("add_surface_depth").forGetter(t::c), (App)Codec.INT.fieldOf("secondary_depth_range").forGetter(t::d), (App)fei.c.fieldOf("surface_type").forGetter(t::e)).apply((Applicative)$$0, t::new)));

        t(int $$0, boolean $$1, int $$2, fei $$3) {
            this.a = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
        }

        @Override
        public bga<? extends f> a() {
            return f;
        }

        public e a(final g $$0) {
            final boolean $$1 = this.e == fei.a;
            class A
            extends k {
                A() {
                    super(g2);
                }

                @Override
                protected boolean a() {
                    int $$02 = $$1 ? this.c.D : this.c.E;
                    int $$12 = t.this.c ? this.c.t : 0;
                    int $$2 = t.this.d == 0 ? 0 : (int)bgj.b(this.c.a(), -1.0, 1.0, 0.0, (double)t.this.d);
                    return $$02 <= 1 + t.this.a + $$12 + $$2;
                }
            }
            return new A();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{t.class, "offset;addSurfaceDepth;secondaryDepthRange;surfaceType", "a", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{t.class, "offset;addSurfaceDepth;secondaryDepthRange;surfaceType", "a", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{t.class, "offset;addSurfaceDepth;secondaryDepthRange;surfaceType", "a", "c", "d", "e"}, this, $$0);
        }

        public int b() {
            return this.a;
        }

        public boolean c() {
            return this.c;
        }

        public int d() {
            return this.d;
        }

        public fei e() {
            return this.e;
        }

        @Override
        public /* synthetic */ Object apply(Object object) {
            return this.a((g)object);
        }
    }

    record n(f a) implements f
    {
        private final f a;
        static final bga<n> c = bga.a(evh$f.b.xmap(n::new, n::b).fieldOf("invert"));

        @Override
        public bga<? extends f> a() {
            return c;
        }

        public e a(g $$0) {
            return new m((e)this.a.apply($$0));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{n.class, "target", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{n.class, "target", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{n.class, "target", "a"}, this, $$0);
        }

        public f b() {
            return this.a;
        }

        @Override
        public /* synthetic */ Object apply(Object object) {
            return this.a((g)object);
        }
    }

    public static interface f
    extends Function<g, e> {
        public static final Codec<f> b = mi.ab.q().dispatch($$0 -> $$0.a().a(), Function.identity());

        public static MapCodec<? extends f> a(jq<MapCodec<? extends f>> $$0) {
            evh.a($$0, "biome", evh$c.a);
            evh.a($$0, "noise_threshold", l.e);
            evh.a($$0, "vertical_gradient", y.e);
            evh.a($$0, "y_above", aa.e);
            evh.a($$0, "water", z.e);
            evh.a($$0, "temperature", v.c);
            evh.a($$0, "steep", s.c);
            evh.a($$0, "not", n.c);
            evh.a($$0, "hole", h.c);
            evh.a($$0, "above_preliminary_surface", evh$a.c);
            return evh.a($$0, "stone_depth", t.f);
        }

        public bga<? extends f> a();
    }

    static final class aa
    extends Record
    implements f {
        final evk a;
        final int c;
        final boolean d;
        static final bga<aa> e = bga.a(RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)evk.a.fieldOf("anchor").forGetter(aa::b), (App)Codec.intRange((int)-20, (int)20).fieldOf("surface_depth_multiplier").forGetter(aa::c), (App)Codec.BOOL.fieldOf("add_stone_depth").forGetter(aa::d)).apply((Applicative)$$0, aa::new)));

        aa(evk $$0, int $$1, boolean $$2) {
            this.a = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        @Override
        public bga<? extends f> a() {
            return e;
        }

        public e a(final g $$0) {
            class A
            extends k {
                A() {
                    super(g2);
                }

                @Override
                protected boolean a() {
                    return this.c.B + (aa.this.d ? this.c.E : 0) >= aa.this.a.a(this.c.n) + this.c.t * aa.this.c;
                }
            }
            return new A();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{aa.class, "anchor;surfaceDepthMultiplier;addStoneDepth", "a", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{aa.class, "anchor;surfaceDepthMultiplier;addStoneDepth", "a", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{aa.class, "anchor;surfaceDepthMultiplier;addStoneDepth", "a", "c", "d"}, this, $$0);
        }

        public evk b() {
            return this.a;
        }

        public int c() {
            return this.c;
        }

        public boolean d() {
            return this.d;
        }

        @Override
        public /* synthetic */ Object apply(Object object) {
            return this.a((g)object);
        }
    }

    static final class z
    extends Record
    implements f {
        final int a;
        final int c;
        final boolean d;
        static final bga<z> e = bga.a(RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.INT.fieldOf("offset").forGetter(z::b), (App)Codec.intRange((int)-20, (int)20).fieldOf("surface_depth_multiplier").forGetter(z::c), (App)Codec.BOOL.fieldOf("add_stone_depth").forGetter(z::d)).apply((Applicative)$$0, z::new)));

        z(int $$0, int $$1, boolean $$2) {
            this.a = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        @Override
        public bga<? extends f> a() {
            return e;
        }

        public e a(final g $$0) {
            class A
            extends k {
                A() {
                    super(g2);
                }

                @Override
                protected boolean a() {
                    return this.c.C == Integer.MIN_VALUE || this.c.B + (z.this.d ? this.c.E : 0) >= this.c.C + z.this.a + this.c.t * z.this.c;
                }
            }
            return new A();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{z.class, "offset;surfaceDepthMultiplier;addStoneDepth", "a", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{z.class, "offset;surfaceDepthMultiplier;addStoneDepth", "a", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{z.class, "offset;surfaceDepthMultiplier;addStoneDepth", "a", "c", "d"}, this, $$0);
        }

        public int b() {
            return this.a;
        }

        public int c() {
            return this.c;
        }

        public boolean d() {
            return this.d;
        }

        @Override
        public /* synthetic */ Object apply(Object object) {
            return this.a((g)object);
        }
    }

    static final class c
    implements f {
        static final bga<c> a = bga.a(amt.a(mj.aS).listOf().fieldOf("biome_is").xmap(evh::a, $$0 -> $$0.c));
        private final List<amt<dxo>> c;
        final Predicate<amt<dxo>> d;

        c(List<amt<dxo>> $$0) {
            this.c = $$0;
            this.d = Set.copyOf($$0)::contains;
        }

        @Override
        public bga<? extends f> a() {
            return a;
        }

        public e a(final g $$0) {
            class A
            extends k {
                A() {
                    super(g2);
                }

                @Override
                protected boolean a() {
                    return this.c.A.get().a(c.this.d);
                }
            }
            return new A();
        }

        public boolean equals(Object $$0) {
            if (this == $$0) {
                return true;
            }
            if ($$0 instanceof c) {
                c $$1 = (c)$$0;
                return this.c.equals($$1.c);
            }
            return false;
        }

        public int hashCode() {
            return this.c.hashCode();
        }

        public String toString() {
            return "BiomeConditionSource[biomes=" + String.valueOf(this.c) + "]";
        }

        @Override
        public /* synthetic */ Object apply(Object object) {
            return this.a((g)object);
        }
    }

    static final class l
    extends Record
    implements f {
        private final amt<fke.a> a;
        final double c;
        final double d;
        static final bga<l> e = bga.a(RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)amt.a(mj.bm).fieldOf("noise").forGetter(l::b), (App)Codec.DOUBLE.fieldOf("min_threshold").forGetter(l::c), (App)Codec.DOUBLE.fieldOf("max_threshold").forGetter(l::d)).apply((Applicative)$$0, l::new)));

        l(amt<fke.a> $$0, double $$1, double $$2) {
            this.a = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        @Override
        public bga<? extends f> a() {
            return e;
        }

        public e a(final g $$0) {
            final fke $$1 = $$0.j.a(this.a);
            class A
            extends j {
                A() {
                    super(g2);
                }

                @Override
                protected boolean a() {
                    double $$02 = $$1.a(this.c.r, 0.0, this.c.s);
                    return $$02 >= l.this.c && $$02 <= l.this.d;
                }
            }
            return new A();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{l.class, "noise;minThreshold;maxThreshold", "a", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{l.class, "noise;minThreshold;maxThreshold", "a", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{l.class, "noise;minThreshold;maxThreshold", "a", "c", "d"}, this, $$0);
        }

        public amt<fke.a> b() {
            return this.a;
        }

        public double c() {
            return this.c;
        }

        public double d() {
            return this.d;
        }

        @Override
        public /* synthetic */ Object apply(Object object) {
            return this.a((g)object);
        }
    }

    record y(amo a, evk c, evk d) implements f
    {
        private final amo a;
        static final bga<y> e = bga.a(RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)amo.a.fieldOf("random_name").forGetter(y::b), (App)evk.a.fieldOf("true_at_and_below").forGetter(y::c), (App)evk.a.fieldOf("false_at_and_above").forGetter(y::d)).apply((Applicative)$$0, y::new)));

        @Override
        public bga<? extends f> a() {
            return e;
        }

        public e a(final g $$0) {
            final int $$1 = this.c().a($$0.n);
            final int $$2 = this.d().a($$0.n);
            final evd $$3 = $$0.j.a(this.b());
            class A
            extends k {
                A() {
                    super(g2);
                }

                @Override
                protected boolean a() {
                    int $$02 = this.c.B;
                    if ($$02 <= $$1) {
                        return true;
                    }
                    if ($$02 >= $$2) {
                        return false;
                    }
                    double $$12 = bgj.b((double)$$02, (double)$$1, (double)$$2, 1.0, 0.0);
                    bgr $$22 = $$3.a(this.c.r, $$02, this.c.s);
                    return (double)$$22.i() < $$12;
                }
            }
            return new A();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{y.class, "randomName;trueAtAndBelow;falseAtAndAbove", "a", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{y.class, "randomName;trueAtAndBelow;falseAtAndAbove", "a", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{y.class, "randomName;trueAtAndBelow;falseAtAndAbove", "a", "c", "d"}, this, $$0);
        }

        public amo b() {
            return this.a;
        }

        @Override
        public /* synthetic */ Object apply(Object object) {
            return this.a((g)object);
        }
    }

    static final class s
    extends Enum<s>
    implements f {
        public static final /* enum */ s a = new s();
        static final bga<s> c;
        private static final /* synthetic */ s[] d;

        public static s[] values() {
            return (s[])d.clone();
        }

        public static s valueOf(String $$0) {
            return Enum.valueOf(s.class, $$0);
        }

        @Override
        public bga<? extends f> a() {
            return c;
        }

        public e a(g $$0) {
            return $$0.g;
        }

        @Override
        public /* synthetic */ Object apply(Object object) {
            return this.a((g)object);
        }

        private static /* synthetic */ s[] b() {
            return new s[]{a};
        }

        static {
            d = s.b();
            c = bga.a(MapCodec.unit((Object)a));
        }
    }

    static final class h
    extends Enum<h>
    implements f {
        public static final /* enum */ h a = new h();
        static final bga<h> c;
        private static final /* synthetic */ h[] d;

        public static h[] values() {
            return (h[])d.clone();
        }

        public static h valueOf(String $$0) {
            return Enum.valueOf(h.class, $$0);
        }

        @Override
        public bga<? extends f> a() {
            return c;
        }

        public e a(g $$0) {
            return $$0.h;
        }

        @Override
        public /* synthetic */ Object apply(Object object) {
            return this.a((g)object);
        }

        private static /* synthetic */ h[] b() {
            return new h[]{a};
        }

        static {
            d = h.b();
            c = bga.a(MapCodec.unit((Object)a));
        }
    }

    static final class a
    extends Enum<a>
    implements f {
        public static final /* enum */ a a = new a();
        static final bga<a> c;
        private static final /* synthetic */ a[] d;

        public static a[] values() {
            return (a[])d.clone();
        }

        public static a valueOf(String $$0) {
            return Enum.valueOf(a.class, $$0);
        }

        @Override
        public bga<? extends f> a() {
            return c;
        }

        public e a(g $$0) {
            return $$0.i;
        }

        @Override
        public /* synthetic */ Object apply(Object object) {
            return this.a((g)object);
        }

        private static /* synthetic */ a[] b() {
            return new a[]{a};
        }

        static {
            d = evh$a.b();
            c = bga.a(MapCodec.unit((Object)a));
        }
    }

    static final class v
    extends Enum<v>
    implements f {
        public static final /* enum */ v a = new v();
        static final bga<v> c;
        private static final /* synthetic */ v[] d;

        public static v[] values() {
            return (v[])d.clone();
        }

        public static v valueOf(String $$0) {
            return Enum.valueOf(v.class, $$0);
        }

        @Override
        public bga<? extends f> a() {
            return c;
        }

        public e a(g $$0) {
            return $$0.f;
        }

        @Override
        public /* synthetic */ Object apply(Object object) {
            return this.a((g)object);
        }

        private static /* synthetic */ v[] b() {
            return new v[]{a};
        }

        static {
            d = v.b();
            c = bga.a(MapCodec.unit((Object)a));
        }
    }

    record x(f a, o c) implements o
    {
        private final f a;
        static final bga<x> d = bga.a(RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)evh$f.b.fieldOf("if_true").forGetter(x::b), (App)o.b.fieldOf("then_run").forGetter(x::c)).apply((Applicative)$$0, x::new)));

        @Override
        public bga<? extends o> a() {
            return d;
        }

        public u a(g $$0) {
            return new w((e)this.a.apply($$0), (u)this.c.apply($$0));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{x.class, "ifTrue;thenRun", "a", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{x.class, "ifTrue;thenRun", "a", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{x.class, "ifTrue;thenRun", "a", "c"}, this, $$0);
        }

        public f b() {
            return this.a;
        }

        @Override
        public /* synthetic */ Object apply(Object object) {
            return this.a((g)object);
        }
    }

    public static interface o
    extends Function<g, u> {
        public static final Codec<o> b = mi.ac.q().dispatch($$0 -> $$0.a().a(), Function.identity());

        public static MapCodec<? extends o> a(jq<MapCodec<? extends o>> $$0) {
            evh.a($$0, "bandlands", evh$b.c);
            evh.a($$0, "block", evh$d.d);
            evh.a($$0, "sequence", q.c);
            return evh.a($$0, "condition", x.d);
        }

        public bga<? extends o> a();
    }

    record q(List<o> a) implements o
    {
        private final List<o> a;
        static final bga<q> c = bga.a(o.b.listOf().xmap(q::new, q::b).fieldOf("sequence"));

        @Override
        public bga<? extends o> a() {
            return c;
        }

        public u a(g $$0) {
            if (this.a.size() == 1) {
                return (u)this.a.get(0).apply($$0);
            }
            ImmutableList.Builder $$1 = ImmutableList.builder();
            for (o $$2 : this.a) {
                $$1.add((Object)((u)$$2.apply($$0)));
            }
            return new p((List<u>)$$1.build());
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{q.class, "sequence", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{q.class, "sequence", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{q.class, "sequence", "a"}, this, $$0);
        }

        public List<o> b() {
            return this.a;
        }

        @Override
        public /* synthetic */ Object apply(Object object) {
            return this.a((g)object);
        }
    }

    record d(eoh a, r c) implements o
    {
        private final eoh a;
        static final bga<d> d = bga.a(eoh.a.xmap(d::new, d::b).fieldOf("result_state"));

        d(eoh $$0) {
            this($$0, new r($$0));
        }

        @Override
        public bga<? extends o> a() {
            return d;
        }

        public u a(g $$0) {
            return this.c;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "resultState;rule", "a", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "resultState;rule", "a", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "resultState;rule", "a", "c"}, this, $$0);
        }

        public eoh b() {
            return this.a;
        }

        @Override
        public /* synthetic */ Object apply(Object object) {
            return this.a((g)object);
        }
    }

    static final class b
    extends Enum<b>
    implements o {
        public static final /* enum */ b a = new b();
        static final bga<b> c;
        private static final /* synthetic */ b[] d;

        public static b[] values() {
            return (b[])d.clone();
        }

        public static b valueOf(String $$0) {
            return Enum.valueOf(b.class, $$0);
        }

        @Override
        public bga<? extends o> a() {
            return c;
        }

        public u a(g $$0) {
            return $$0.e::a;
        }

        @Override
        public /* synthetic */ Object apply(Object object) {
            return this.a((g)object);
        }

        private static /* synthetic */ b[] b() {
            return new b[]{a};
        }

        static {
            d = evh$b.b();
            c = bga.a(MapCodec.unit((Object)a));
        }
    }

    record p(List<u> a) implements u
    {
        @Override
        public @Nullable eoh tryApply(int $$0, int $$1, int $$2) {
            for (u $$3 : this.a) {
                eoh $$4 = $$3.tryApply($$0, $$1, $$2);
                if ($$4 == null) continue;
                return $$4;
            }
            return null;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{p.class, "rules", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{p.class, "rules", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{p.class, "rules", "a"}, this, $$0);
        }
    }

    record w(e a, u b) implements u
    {
        @Override
        public @Nullable eoh tryApply(int $$0, int $$1, int $$2) {
            if (!this.a.b()) {
                return null;
            }
            return this.b.tryApply($$0, $$1, $$2);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{w.class, "condition;followup", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{w.class, "condition;followup", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{w.class, "condition;followup", "a", "b"}, this, $$0);
        }
    }

    record r(eoh a) implements u
    {
        @Override
        public eoh tryApply(int $$0, int $$1, int $$2) {
            return this.a;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{r.class, "state", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{r.class, "state", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{r.class, "state", "a"}, this, $$0);
        }
    }

    protected static interface u {
        public @Nullable eoh tryApply(int var1, int var2, int var3);
    }

    record m(e a) implements e
    {
        @Override
        public boolean b() {
            return !this.a.b();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{m.class, "target", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{m.class, "target", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{m.class, "target", "a"}, this, $$0);
        }
    }

    static abstract class k
    extends i {
        protected k(g $$0) {
            super($$0);
        }

        @Override
        protected long c() {
            return this.c.y;
        }
    }

    static abstract class j
    extends i {
        protected j(g $$0) {
            super($$0);
        }

        @Override
        protected long c() {
            return this.c.q;
        }
    }

    static abstract class i
    implements e {
        protected final g c;
        private long a;
        @Nullable Boolean d;

        protected i(g $$0) {
            this.c = $$0;
            this.a = this.c() - 1L;
        }

        @Override
        public boolean b() {
            long $$0 = this.c();
            if ($$0 == this.a) {
                if (this.d == null) {
                    throw new IllegalStateException("Update triggered but the result is null");
                }
                return this.d;
            }
            this.a = $$0;
            this.d = this.a();
            return this.d;
        }

        protected abstract long c();

        protected abstract boolean a();
    }

    static interface e {
        public boolean b();
    }

    protected static final class g {
        private static final int a = 8;
        private static final int b = 4;
        private static final int c = 16;
        private static final int d = 15;
        final evi e;
        final e f = new d(this);
        final e g = new c(this);
        final e h = new b(this);
        final e i = new a();
        final eve j;
        final eqf k;
        private final euu l;
        private final Function<is, jd<dxo>> m;
        final evn n;
        private long o = Long.MAX_VALUE;
        private final int[] p = new int[4];
        long q = -9223372036854775807L;
        int r;
        int s;
        int t;
        private long u = this.q - 1L;
        private double v;
        private long w = this.q - 1L;
        private int x;
        long y = -9223372036854775807L;
        final is.a z = new is.a();
        Supplier<jd<dxo>> A;
        int B;
        int C;
        int D;
        int E;

        protected g(evi $$0, eve $$1, eqf $$2, euu $$3, Function<is, jd<dxo>> $$4, jq<dxo> $$5, evn $$6) {
            this.e = $$0;
            this.j = $$1;
            this.k = $$2;
            this.l = $$3;
            this.m = $$4;
            this.n = $$6;
        }

        protected void a(int $$0, int $$1) {
            ++this.q;
            ++this.y;
            this.r = $$0;
            this.s = $$1;
            this.t = this.e.a($$0, $$1);
        }

        protected void a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
            ++this.y;
            this.A = Suppliers.memoize(() -> this.m.apply(this.z.d($$3, $$4, $$5)));
            this.B = $$4;
            this.C = $$2;
            this.D = $$1;
            this.E = $$0;
        }

        protected double a() {
            if (this.u != this.q) {
                this.u = this.q;
                this.v = this.e.b(this.r, this.s);
            }
            return this.v;
        }

        public int b() {
            return this.e.a();
        }

        private static int a(int $$0) {
            return $$0 >> 4;
        }

        private static int b(int $$0) {
            return $$0 << 4;
        }

        protected int c() {
            if (this.w != this.q) {
                int $$1;
                this.w = this.q;
                int $$0 = evh$g.a(this.r);
                long $$2 = dvu.d($$0, $$1 = evh$g.a(this.s));
                if (this.o != $$2) {
                    this.o = $$2;
                    this.p[0] = this.l.a(evh$g.b($$0), evh$g.b($$1));
                    this.p[1] = this.l.a(evh$g.b($$0 + 1), evh$g.b($$1));
                    this.p[2] = this.l.a(evh$g.b($$0), evh$g.b($$1 + 1));
                    this.p[3] = this.l.a(evh$g.b($$0 + 1), evh$g.b($$1 + 1));
                }
                int $$3 = bgj.c(bgj.a((float)(this.r & 0xF) / 16.0f, (float)(this.s & 0xF) / 16.0f, this.p[0], this.p[1], this.p[2], this.p[3]));
                this.x = $$3 + this.t - 8;
            }
            return this.x;
        }

        static class d
        extends k {
            d(g $$0) {
                super($$0);
            }

            @Override
            protected boolean a() {
                return this.c.A.get().a().b(this.c.z.d(this.c.r, this.c.B, this.c.s), this.c.b());
            }
        }

        static class c
        extends j {
            c(g $$0) {
                super($$0);
            }

            @Override
            protected boolean a() {
                int $$10;
                int $$0 = this.c.r & 0xF;
                int $$1 = this.c.s & 0xF;
                int $$2 = Math.max($$1 - 1, 0);
                int $$3 = Math.min($$1 + 1, 15);
                eqf $$4 = this.c.k;
                int $$5 = $$4.a(euq.a.a, $$0, $$2);
                int $$6 = $$4.a(euq.a.a, $$0, $$3);
                if ($$6 >= $$5 + 4) {
                    return true;
                }
                int $$7 = Math.max($$0 - 1, 0);
                int $$8 = Math.min($$0 + 1, 15);
                int $$9 = $$4.a(euq.a.a, $$7, $$1);
                return $$9 >= ($$10 = $$4.a(euq.a.a, $$8, $$1)) + 4;
            }
        }

        static final class b
        extends j {
            b(g $$0) {
                super($$0);
            }

            @Override
            protected boolean a() {
                return this.c.t <= 0;
            }
        }

        final class a
        implements e {
            a() {
            }

            @Override
            public boolean b() {
                return g.this.B >= g.this.c();
            }
        }
    }
}

