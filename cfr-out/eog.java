/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public abstract class eog
implements dgw {
    protected static final iz[] E = new iz[]{iz.e, iz.f, iz.c, iz.d, iz.a, iz.b};
    protected final boolean F;
    protected final float G;
    protected final boolean H;
    protected final ehs I;
    protected final float J;
    protected final float K;
    protected final float L;
    protected final boolean M;
    protected final dgz N;
    protected final d O;
    protected final Optional<amt<fof>> P;
    protected final String Q;

    public eog(d $$0) {
        this.F = $$0.c;
        this.P = $$0.h();
        this.Q = $$0.q();
        this.G = $$0.f;
        this.H = $$0.i;
        this.I = $$0.d;
        this.J = $$0.j;
        this.K = $$0.k;
        this.L = $$0.l;
        this.M = $$0.F;
        this.N = $$0.G;
        this.O = $$0;
    }

    public d w() {
        return this.O;
    }

    protected abstract MapCodec<? extends dzq> a();

    protected static <B extends dzq> RecordCodecBuilder<B, d> x() {
        return d.a.fieldOf("properties").forGetter(eog::w);
    }

    public static <B extends dzq> MapCodec<B> b(Function<d, B> $$0) {
        return RecordCodecBuilder.mapCodec($$1 -> $$1.group(eog.x()).apply((Applicative)$$1, $$0));
    }

    protected void a(eoh $$0, dwp $$1, is $$2, @dzq.b int $$3, int $$4) {
    }

    protected boolean a(eoh $$0, flq $$1) {
        switch ($$1) {
            case a: {
                return !$$0.m(dwf.a, is.c);
            }
            case b: {
                return $$0.y().a(bdv.a);
            }
            case c: {
                return !$$0.m(dwf.a, is.c);
            }
        }
        return false;
    }

    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        return $$0;
    }

    protected boolean b(eoh $$0, eoh $$1, iz $$2) {
        return false;
    }

    protected void a(eoh $$0, dwo $$1, is $$2, dzq $$3, @Nullable fmj $$4, boolean $$5) {
    }

    protected void a(eoh $$0, dwo $$1, is $$2, eoh $$3, boolean $$4) {
    }

    protected void a(eoh $$0, axf $$1, is $$2, boolean $$3) {
    }

    protected void a(eoh $$0, axf $$1, is $$22, dwi $$3, BiConsumer<dlt, is> $$4) {
        if ($$0.l() || $$3.b() == dwi.a.d) {
            return;
        }
        dzq $$5 = $$0.b();
        boolean $$6 = $$3.c() instanceof ddm;
        if ($$5.a($$3)) {
            elb $$7 = $$0.x() ? $$1.c_($$22) : null;
            fod.a $$8 = new fod.a($$1).a(fqx.h, ftm.b($$22)).a(fqx.k, dlt.l).b(fqx.j, $$7).b(fqx.a, $$3.d());
            if ($$3.b() == dwi.a.c) {
                $$8.a(fqx.l, Float.valueOf($$3.e()));
            }
            $$0.a($$1, $$22, dlt.l, $$6);
            $$0.a($$8).forEach($$2 -> $$4.accept((dlt)$$2, $$22));
        }
        $$1.a($$22, dzs.a.m(), 3);
        $$5.a($$1, $$22, $$3);
    }

    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        return cdc.e;
    }

    protected cdc a(dlt $$0, eoh $$1, dwo $$2, is $$3, ddm $$4, cdb $$5, fti $$6) {
        return cdc.f;
    }

    protected boolean a(eoh $$0, dwo $$1, is $$2, int $$3, int $$4) {
        return false;
    }

    protected egf a_(eoh $$0) {
        return egf.b;
    }

    protected boolean g_(eoh $$0) {
        return false;
    }

    protected boolean f_(eoh $$0) {
        return false;
    }

    protected flb b_(eoh $$0) {
        return flc.a.g();
    }

    protected boolean c_(eoh $$0) {
        return false;
    }

    protected float at_() {
        return 0.25f;
    }

    protected float av_() {
        return 0.2f;
    }

    @Override
    public dgz k() {
        return this.N;
    }

    protected boolean o(eoh $$0) {
        return false;
    }

    protected eoh a(eoh $$0, egm $$1) {
        return $$0;
    }

    protected eoh a(eoh $$0, eev $$1) {
        return $$0;
    }

    protected boolean a(eoh $$0, dpu $$1) {
        return $$0.v() && ($$1.n().f() || !$$1.n().a(this.h()));
    }

    protected boolean a(eoh $$0, fla $$1) {
        return $$0.v() || !$$0.e();
    }

    protected List<dlt> a(eoh $$0, fod.a $$1) {
        if (this.P.isEmpty()) {
            return Collections.emptyList();
        }
        fod $$2 = $$1.a(fqx.i, $$0).a(fqw.r);
        axf $$3 = $$2.a();
        fof $$4 = $$3.s().be().a(this.P.get());
        return $$4.a($$2);
    }

    protected long a(eoh $$0, is $$1) {
        return bgj.a($$1);
    }

    protected fug d_(eoh $$0) {
        return $$0.f(dwf.a, is.c);
    }

    protected fug b_(eoh $$0, dvt $$1, is $$2) {
        return this.b($$0, $$1, $$2, ftr.a());
    }

    protected fug a(eoh $$0, dvt $$1, is $$2) {
        return fud.a();
    }

    protected int i_(eoh $$0) {
        if ($$0.s()) {
            return 15;
        }
        return $$0.f() ? 0 : 1;
    }

    protected @Nullable cdf a(eoh $$0, dwo $$1, is $$2) {
        return null;
    }

    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        return true;
    }

    protected float c(eoh $$0, dvt $$1, is $$2) {
        return $$0.m($$1, $$2) ? 0.2f : 1.0f;
    }

    protected int a(eoh $$0, dwo $$1, is $$2, iz $$3) {
        return 0;
    }

    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return fud.b();
    }

    protected fug b(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return this.F ? $$0.f($$1, $$2) : fud.a();
    }

    protected fug a(eoh $$0, dvt $$1, is $$2, cgk $$3) {
        return fud.b();
    }

    protected boolean a_(eoh $$0, dvt $$1, is $$2) {
        return dzq.a($$0.g($$1, $$2));
    }

    protected fug c(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return this.b($$0, $$1, $$2, $$3);
    }

    protected void b(eoh $$0, axf $$1, is $$2, bgr $$3) {
    }

    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
    }

    protected float a(eoh $$0, ddm $$1, dvt $$2, is $$3) {
        float $$4 = $$0.e($$2, $$3);
        if ($$4 == -1.0f) {
            return 0.0f;
        }
        int $$5 = $$1.d($$0) ? 30 : 100;
        return $$1.c($$0) / $$4 / (float)$$5;
    }

    protected void a(eoh $$0, axf $$1, is $$2, dlt $$3, boolean $$4) {
    }

    protected void a_(eoh $$0, dwo $$1, is $$2, ddm $$3) {
    }

    protected int a(eoh $$0, dvt $$1, is $$2, iz $$3) {
        return 0;
    }

    protected void a(eoh $$0, dwo $$1, is $$2, cgk $$3, chc $$4, boolean $$5) {
    }

    protected int b(eoh $$0, dvt $$1, is $$2, iz $$3) {
        return 0;
    }

    public final Optional<amt<fof>> y() {
        return this.P;
    }

    public final String z() {
        return this.Q;
    }

    protected void a(dwo $$0, eoh $$1, fti $$2, dec $$3) {
    }

    protected boolean e_(eoh $$0) {
        return !dzq.a($$0.f(dwf.a, is.c)) && $$0.y().c();
    }

    protected boolean f(eoh $$0) {
        return this.H;
    }

    protected ehs h_(eoh $$0) {
        return this.I;
    }

    protected dlt a(dwr $$0, is $$1, eoh $$2, boolean $$3) {
        return new dlt(this.h());
    }

    public abstract dlp h();

    protected abstract dzq o();

    public flf A() {
        return this.O.b.apply(this.o().m());
    }

    public float B() {
        return this.O.g;
    }

    public static class d {
        public static final Codec<d> a = MapCodec.unitCodec(() -> eog$d.a());
        Function<eoh, flf> b = $$0 -> flf.a;
        boolean c = true;
        ehs d = ehs.f;
        ToIntFunction<eoh> e = $$0 -> 0;
        float f;
        float g;
        boolean h;
        boolean i;
        float j = 0.6f;
        float k = 1.0f;
        float l = 1.0f;
        private @Nullable amt<dzq> m;
        private aml<dzq, Optional<amt<fof>>> n = $$0 -> Optional.of(amt.a(mj.bG, $$0.a().f("blocks/")));
        private aml<dzq, String> o = $$0 -> bhs.a("block", $$0.a());
        boolean p = true;
        boolean q;
        boolean r;
        @Deprecated
        boolean s;
        @Deprecated
        boolean t;
        boolean u;
        flg v = flg.a;
        boolean w = true;
        epi x = epi.a;
        boolean y;
        e<cgu<?>> z = ($$0, $$1, $$2, $$3) -> $$0.c($$1, $$2, iz.b) && $$0.k() < 14;
        f A = ($$0, $$1, $$2) -> $$0.m($$1, $$2);
        f B;
        f C = this.B = ($$0, $$1, $$2) -> $$0.d() && $$0.m($$1, $$2);
        f D = ($$0, $$1, $$2) -> false;
        f E = ($$0, $$1, $$2) -> false;
        boolean F;
        dgz G = dhb.g;
        @Nullable b H;

        private d() {
        }

        public static d a() {
            return new d();
        }

        public static d a(eog $$0) {
            d $$1 = eog$d.b($$0);
            d $$2 = $$0.O;
            $$1.l = $$2.l;
            $$1.A = $$2.A;
            $$1.z = $$2.z;
            $$1.D = $$2.D;
            $$1.B = $$2.B;
            $$1.C = $$2.C;
            $$1.n = $$2.n;
            $$1.o = $$2.o;
            return $$1;
        }

        @Deprecated
        public static d b(eog $$0) {
            d $$1 = new d();
            d $$2 = $$0.O;
            $$1.g = $$2.g;
            $$1.f = $$2.f;
            $$1.c = $$2.c;
            $$1.i = $$2.i;
            $$1.e = $$2.e;
            $$1.b = $$2.b;
            $$1.d = $$2.d;
            $$1.j = $$2.j;
            $$1.k = $$2.k;
            $$1.F = $$2.F;
            $$1.p = $$2.p;
            $$1.q = $$2.q;
            $$1.r = $$2.r;
            $$1.s = $$2.s;
            $$1.t = $$2.t;
            $$1.u = $$2.u;
            $$1.v = $$2.v;
            $$1.h = $$2.h;
            $$1.H = $$2.H;
            $$1.w = $$2.w;
            $$1.G = $$2.G;
            $$1.E = $$2.E;
            $$1.x = $$2.x;
            $$1.y = $$2.y;
            return $$1;
        }

        public d a(dkr $$0) {
            this.b = $$1 -> $$0.e();
            return this;
        }

        public d a(flf $$0) {
            this.b = $$1 -> $$0;
            return this;
        }

        public d a(Function<eoh, flf> $$0) {
            this.b = $$0;
            return this;
        }

        public d b() {
            this.c = false;
            this.p = false;
            return this;
        }

        public d c() {
            this.p = false;
            return this;
        }

        public d a(float $$0) {
            this.j = $$0;
            return this;
        }

        public d b(float $$0) {
            this.k = $$0;
            return this;
        }

        public d c(float $$0) {
            this.l = $$0;
            return this;
        }

        public d a(ehs $$0) {
            this.d = $$0;
            return this;
        }

        public d a(ToIntFunction<eoh> $$0) {
            this.e = $$0;
            return this;
        }

        public d a(float $$0, float $$1) {
            return this.e($$0).f($$1);
        }

        public d d() {
            return this.d(0.0f);
        }

        public d d(float $$0) {
            this.a($$0, $$0);
            return this;
        }

        public d e() {
            this.i = true;
            return this;
        }

        public d f() {
            this.F = true;
            return this;
        }

        public d g() {
            this.n = aml.fixed(Optional.empty());
            return this;
        }

        public d a(Optional<amt<fof>> $$0) {
            this.n = aml.fixed($$0);
            return this;
        }

        protected Optional<amt<fof>> h() {
            return this.n.get(Objects.requireNonNull(this.m, "Block id not set"));
        }

        public d i() {
            this.r = true;
            return this;
        }

        public d j() {
            this.s = true;
            return this;
        }

        public d k() {
            this.u = true;
            return this;
        }

        @Deprecated
        public d l() {
            this.t = true;
            return this;
        }

        public d a(flg $$0) {
            this.v = $$0;
            return this;
        }

        public d m() {
            this.q = true;
            return this;
        }

        public d a(e<cgu<?>> $$0) {
            this.z = $$0;
            return this;
        }

        public d a(f $$0) {
            this.A = $$0;
            return this;
        }

        public d b(f $$0) {
            this.B = $$0;
            return this;
        }

        public d c(f $$0) {
            this.C = $$0;
            return this;
        }

        public d d(f $$0) {
            this.D = $$0;
            return this;
        }

        public d e(f $$0) {
            this.E = $$0;
            return this;
        }

        public d n() {
            this.h = true;
            return this;
        }

        public d e(float $$0) {
            this.g = $$0;
            return this;
        }

        public d f(float $$0) {
            this.f = Math.max(0.0f, $$0);
            return this;
        }

        public d a(c $$02) {
            this.H = switch ($$02.ordinal()) {
                default -> throw new MatchException(null, null);
                case 0 -> null;
                case 2 -> ($$0, $$1) -> {
                    dzq $$2 = $$0.b();
                    long $$3 = bgj.b($$1.u(), 0, $$1.w());
                    double $$4 = ((double)((float)($$3 >> 4 & 0xFL) / 15.0f) - 1.0) * (double)$$2.av_();
                    float $$5 = $$2.at_();
                    double $$6 = bgj.a(((double)((float)($$3 & 0xFL) / 15.0f) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                    double $$7 = bgj.a(((double)((float)($$3 >> 8 & 0xFL) / 15.0f) - 0.5) * 0.5, (double)(-$$5), (double)$$5);
                    return new ftm($$6, $$4, $$7);
                };
                case 1 -> ($$0, $$1) -> {
                    dzq $$2 = $$0.b();
                    long $$3 = bgj.b($$1.u(), 0, $$1.w());
                    float $$4 = $$2.at_();
                    double $$5 = bgj.a(((double)((float)($$3 & 0xFL) / 15.0f) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
                    double $$6 = bgj.a(((double)((float)($$3 >> 8 & 0xFL) / 15.0f) - 0.5) * 0.5, (double)(-$$4), (double)$$4);
                    return new ftm($$5, 0.0, $$6);
                };
            };
            return this;
        }

        public d o() {
            this.w = false;
            return this;
        }

        public d a(dgx ... $$0) {
            this.G = dhb.e.a($$0);
            return this;
        }

        public d a(epi $$0) {
            this.x = $$0;
            return this;
        }

        public d p() {
            this.y = true;
            return this;
        }

        public d a(amt<dzq> $$0) {
            this.m = $$0;
            return this;
        }

        public d a(String $$0) {
            this.o = aml.fixed($$0);
            return this;
        }

        protected String q() {
            return this.o.get(Objects.requireNonNull(this.m, "Block id not set"));
        }
    }

    @FunctionalInterface
    public static interface e<A> {
        public boolean test(eoh var1, dvt var2, is var3, A var4);
    }

    @FunctionalInterface
    public static interface b {
        public ftm evaluate(eoh var1, is var2);
    }

    @FunctionalInterface
    public static interface f {
        public boolean test(eoh var1, dvt var2, is var3);
    }

    public static abstract class eog$a
    extends eoj<dzq, eoh> {
        private static final iz[] a = iz.values();
        private static final fug[] f = bhs.a(new fug[a.length], (? super T $$0) -> Arrays.fill($$0, fud.a()));
        private static final fug[] g = bhs.a(new fug[a.length], (? super T $$0) -> Arrays.fill($$0, fud.b()));
        private final int h;
        private final boolean i;
        private final boolean j;
        private final boolean k;
        @Deprecated
        private final boolean l;
        @Deprecated
        private boolean m;
        private final flg n;
        private final flf o;
        private final float p;
        private final boolean q;
        private final boolean r;
        private final f s;
        private final f t;
        private final f u;
        private final f v;
        private final f w;
        private final @Nullable b x;
        private final boolean y;
        private final epi z;
        private final boolean A;
        private @Nullable a B;
        private flb C = flc.a.g();
        private boolean D;
        private boolean E;
        private fug F;
        private fug[] G;
        private boolean H;
        private int I;

        protected eog$a(dzq $$0, Reference2ObjectArrayMap<epk<?>, Comparable<?>> $$1, MapCodec<eoh> $$2) {
            super($$0, $$1, $$2);
            d $$3 = $$0.O;
            this.h = $$3.e.applyAsInt(this.B());
            this.i = $$0.g_(this.B());
            this.j = $$3.q;
            this.k = $$3.r;
            this.l = $$3.s;
            this.n = $$3.v;
            this.o = $$3.b.apply(this.B());
            this.p = $$3.g;
            this.q = $$3.h;
            this.r = $$3.p;
            this.s = $$3.A;
            this.t = $$3.B;
            this.u = $$3.C;
            this.v = $$3.D;
            this.w = $$3.E;
            this.x = $$3.H;
            this.y = $$3.w;
            this.z = $$3.x;
            this.A = $$3.y;
        }

        private boolean H() {
            if (((dzq)this.d).O.u) {
                return true;
            }
            if (((dzq)this.d).O.t) {
                return false;
            }
            if (this.B == null) {
                return false;
            }
            fug $$0 = this.B.a;
            if ($$0.c()) {
                return false;
            }
            fth $$1 = $$0.a();
            if ($$1.a() >= 0.7291666666666666) {
                return true;
            }
            return $$1.c() >= 1.0;
        }

        public void a() {
            this.C = ((dzq)this.d).b_(this.B());
            this.D = ((dzq)this.d).f(this.B());
            if (!this.b().n()) {
                this.B = new a(this.B());
            }
            this.m = this.H();
            this.F = this.r ? ((dzq)this.d).d_(this.B()) : fud.a();
            this.E = dzq.a(this.F);
            if (this.F.c()) {
                this.G = f;
            } else if (this.E) {
                this.G = g;
            } else {
                this.G = new fug[a.length];
                for (iz $$0 : a) {
                    this.G[$$0.ordinal()] = this.F.a($$0);
                }
            }
            this.H = ((dzq)this.d).e_(this.B());
            this.I = ((dzq)this.d).i_(this.B());
        }

        public dzq b() {
            return (dzq)this.d;
        }

        public jd<dzq> c() {
            return ((dzq)this.d).p();
        }

        @Deprecated
        public boolean d() {
            dzq $$0 = this.b();
            return $$0 != dzs.bz && $$0 != dzs.nV && this.e();
        }

        @Deprecated
        public boolean e() {
            return this.m;
        }

        public boolean a(dvt $$0, is $$1, cgu<?> $$2) {
            return this.b().O.z.test(this.B(), $$0, $$1, $$2);
        }

        public boolean f() {
            return this.H;
        }

        public int g() {
            return this.I;
        }

        public fug a(iz $$0) {
            return this.G[$$0.ordinal()];
        }

        public fug h() {
            return this.F;
        }

        public boolean i() {
            return this.B == null || this.B.b;
        }

        public boolean j() {
            return this.i;
        }

        public int k() {
            return this.h;
        }

        public boolean l() {
            return this.j;
        }

        public boolean m() {
            return this.k;
        }

        @Deprecated
        public boolean n() {
            return this.l;
        }

        public flf a(dvt $$0, is $$1) {
            return this.o;
        }

        public eoh a(egm $$0) {
            return this.b().a(this.B(), $$0);
        }

        public eoh a(eev $$0) {
            return this.b().a(this.B(), $$0);
        }

        public egf o() {
            return this.b().a_(this.B());
        }

        public boolean b(dvt $$0, is $$1) {
            return this.w.test(this.B(), $$0, $$1);
        }

        public float c(dvt $$0, is $$1) {
            return this.b().c(this.B(), $$0, $$1);
        }

        public boolean d(dvt $$0, is $$1) {
            return this.s.test(this.B(), $$0, $$1);
        }

        public boolean p() {
            return this.b().f_(this.B());
        }

        public int a(dvt $$0, is $$1, iz $$2) {
            return this.b().a(this.B(), $$0, $$1, $$2);
        }

        public boolean q() {
            return this.b().c_(this.B());
        }

        public int a(dwo $$0, is $$1, iz $$2) {
            return this.b().a(this.B(), $$0, $$1, $$2);
        }

        public float e(dvt $$0, is $$1) {
            return this.p;
        }

        public float a(ddm $$0, dvt $$1, is $$2) {
            return this.b().a(this.B(), $$0, $$1, $$2);
        }

        public int b(dvt $$0, is $$1, iz $$2) {
            return this.b().b(this.B(), $$0, $$1, $$2);
        }

        public flg r() {
            return this.n;
        }

        public boolean s() {
            return this.E;
        }

        public boolean t() {
            return this.r;
        }

        public boolean a(eoh $$0, iz $$1) {
            return this.b().b(this.B(), $$0, $$1);
        }

        public fug f(dvt $$0, is $$1) {
            return this.a($$0, $$1, ftr.a());
        }

        public fug a(dvt $$0, is $$1, ftr $$2) {
            return this.b().a(this.B(), $$0, $$1, $$2);
        }

        public fug g(dvt $$0, is $$1) {
            if (this.B != null) {
                return this.B.a;
            }
            return this.b($$0, $$1, ftr.a());
        }

        public fug b(dvt $$0, is $$1, ftr $$2) {
            return this.b().b(this.B(), $$0, $$1, $$2);
        }

        public fug a(dvt $$0, is $$1, cgk $$2) {
            return this.b().a(this.B(), $$0, $$1, $$2);
        }

        public fug h(dvt $$0, is $$1) {
            return this.b().b_(this.B(), $$0, $$1);
        }

        public fug c(dvt $$0, is $$1, ftr $$2) {
            return this.b().c(this.B(), $$0, $$1, $$2);
        }

        public fug i(dvt $$0, is $$1) {
            return this.b().a(this.B(), $$0, $$1);
        }

        public final boolean b(dvt $$0, is $$1, cgk $$2) {
            return this.a($$0, $$1, $$2, iz.b);
        }

        public final boolean a(dvt $$0, is $$1, cgk $$2, iz $$3) {
            return dzq.a(this.b($$0, $$1, ftr.a($$2)), $$3);
        }

        public ftm a(is $$0) {
            b $$1 = this.x;
            if ($$1 != null) {
                return $$1.evaluate(this.B(), $$0);
            }
            return ftm.c;
        }

        public boolean u() {
            return this.x != null;
        }

        public boolean a(dwo $$0, is $$1, int $$2, int $$3) {
            return this.b().a(this.B(), $$0, $$1, $$2, $$3);
        }

        public void a(dwo $$0, is $$1, dzq $$2, @Nullable fmj $$3, boolean $$4) {
            this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4);
        }

        public final void a(dwp $$0, is $$1, @dzq.b int $$2) {
            this.a($$0, $$1, $$2, 512);
        }

        public final void a(dwp $$0, is $$1, @dzq.b int $$2, int $$3) {
            is.a $$4 = new is.a();
            for (iz $$5 : E) {
                $$4.a((jy)$$1, $$5);
                $$0.a($$5.g(), (is)$$4, $$1, this.B(), $$2, $$3);
            }
        }

        public final void b(dwp $$0, is $$1, @dzq.b int $$2) {
            this.b($$0, $$1, $$2, 512);
        }

        public void b(dwp $$0, is $$1, @dzq.b int $$2, int $$3) {
            this.b().a(this.B(), $$0, $$1, $$2, $$3);
        }

        public void a(dwo $$0, is $$1, eoh $$2, boolean $$3) {
            this.b().a(this.B(), $$0, $$1, $$2, $$3);
        }

        public void a(axf $$0, is $$1, boolean $$2) {
            this.b().a(this.B(), $$0, $$1, $$2);
        }

        public void a(axf $$0, is $$1, dwi $$2, BiConsumer<dlt, is> $$3) {
            this.b().a(this.B(), $$0, $$1, $$2, $$3);
        }

        public void a(axf $$0, is $$1, bgr $$2) {
            this.b().a(this.B(), $$0, $$1, $$2);
        }

        public void b(axf $$0, is $$1, bgr $$2) {
            this.b().b(this.B(), $$0, $$1, $$2);
        }

        public void a(dwo $$0, is $$1, cgk $$2, chc $$3, boolean $$4) {
            this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4);
        }

        public void a(axf $$0, is $$1, dlt $$2, boolean $$3) {
            this.b().a(this.B(), $$0, $$1, $$2, $$3);
        }

        public List<dlt> a(fod.a $$0) {
            return this.b().a(this.B(), $$0);
        }

        public cdc a(dlt $$0, dwo $$1, ddm $$2, cdb $$3, fti $$4) {
            return this.b().a($$0, this.B(), $$1, $$4.b(), $$2, $$3, $$4);
        }

        public cdc a(dwo $$0, ddm $$1, fti $$2) {
            return this.b().a(this.B(), $$0, $$2.b(), $$1, $$2);
        }

        public void a(dwo $$0, is $$1, ddm $$2) {
            this.b().a_(this.B(), $$0, $$1, $$2);
        }

        public boolean j(dvt $$0, is $$1) {
            return this.t.test(this.B(), $$0, $$1);
        }

        public boolean k(dvt $$0, is $$1) {
            return this.u.test(this.B(), $$0, $$1);
        }

        public eoh a(dwr $$0, dxd $$1, is $$2, iz $$3, is $$4, eoh $$5, bgr $$6) {
            return this.b().a(this.B(), $$0, $$1, $$2, $$3, $$4, $$5, $$6);
        }

        public boolean a(flq $$0) {
            return this.b().a(this.B(), $$0);
        }

        public boolean a(dpu $$0) {
            return this.b().a(this.B(), $$0);
        }

        public boolean a(fla $$0) {
            return this.b().a(this.B(), $$0);
        }

        public boolean v() {
            return this.A;
        }

        public boolean a(dwr $$0, is $$1) {
            return this.b().a(this.B(), $$0, $$1);
        }

        public boolean l(dvt $$0, is $$1) {
            return this.v.test(this.B(), $$0, $$1);
        }

        public @Nullable cdf a(dwo $$0, is $$1) {
            return this.b().a(this.B(), $$0, $$1);
        }

        @Override
        public boolean a(bef<dzq> $$0) {
            return this.b().p().a($$0);
        }

        @Override
        public boolean a(bef<dzq> $$0, Predicate<eog$a> $$1) {
            return this.a($$0) && $$1.test(this);
        }

        @Override
        public boolean a(jh<dzq> $$0) {
            return $$0.a(this.b().p());
        }

        @Override
        public boolean a(jd<dzq> $$0) {
            return this.a($$0.a());
        }

        public Stream<bef<dzq>> w() {
            return this.b().p().c();
        }

        public boolean x() {
            return this.b() instanceof ecn;
        }

        public boolean a(eoh $$0) {
            return this.b().o($$0);
        }

        public <T extends elb> @Nullable elc<T> a(dwo $$0, eld<T> $$1) {
            if (this.b() instanceof ecn) {
                return ((ecn)((Object)this.b())).a($$0, this.B(), $$1);
            }
            return null;
        }

        public boolean a(dzq $$0) {
            return this.b() == $$0;
        }

        @Override
        public boolean a(amt<dzq> $$0) {
            return this.b().p().a($$0);
        }

        public flb y() {
            return this.C;
        }

        public boolean z() {
            return this.D;
        }

        public long b(is $$0) {
            return this.b().a(this.B(), $$0);
        }

        public ehs A() {
            return this.b().h_(this.B());
        }

        public void a(dwo $$0, eoh $$1, fti $$2, dec $$3) {
            this.b().a($$0, $$1, $$2, $$3);
        }

        public boolean c(dvt $$0, is $$1, iz $$2) {
            return this.a($$0, $$1, $$2, eig.a);
        }

        public boolean a(dvt $$0, is $$1, iz $$2, eig $$3) {
            if (this.B != null) {
                return this.B.a($$2, $$3);
            }
            return $$3.a(this.B(), $$0, $$1, $$2);
        }

        public boolean m(dvt $$0, is $$1) {
            if (this.B != null) {
                return this.B.c;
            }
            return this.b().a_(this.B(), $$0, $$1);
        }

        public dlt a(dwr $$0, is $$1, boolean $$2) {
            return this.b().a($$0, $$1, this.B(), $$2);
        }

        protected abstract eoh B();

        public boolean C() {
            return this.q;
        }

        public boolean D() {
            return this.y;
        }

        public epi E() {
            return this.z;
        }

        static final class a {
            private static final iz[] d = iz.values();
            private static final int e = eig.values().length;
            protected final fug a;
            protected final boolean b;
            private final boolean[] f;
            protected final boolean c;

            a(eoh $$02) {
                dzq $$1 = $$02.b();
                this.a = $$1.b($$02, (dvt)dwf.a, is.c, ftr.a());
                if (!this.a.c() && $$02.u()) {
                    throw new IllegalStateException(String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", mi.e.b($$1)));
                }
                this.b = Arrays.stream(iz.a.values()).anyMatch($$0 -> this.a.b((iz.a)$$0) < 0.0 || this.a.c((iz.a)$$0) > 1.0);
                this.f = new boolean[d.length * e];
                for (iz $$2 : d) {
                    for (eig $$3 : eig.values()) {
                        this.f[eog$a$a.b((iz)$$2, (eig)$$3)] = $$3.a($$02, dwf.a, is.c, $$2);
                    }
                }
                this.c = dzq.a($$02.g(dwf.a, is.c));
            }

            public boolean a(iz $$0, eig $$1) {
                return this.f[eog$a$a.b($$0, $$1)];
            }

            private static int b(iz $$0, eig $$1) {
                return $$0.ordinal() * e + $$1.ordinal();
            }
        }
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c a = new c();
        public static final /* enum */ c b = new c();
        public static final /* enum */ c c = new c();
        private static final /* synthetic */ c[] d;

        public static c[] values() {
            return (c[])d.clone();
        }

        public static c valueOf(String $$0) {
            return Enum.valueOf(c.class, $$0);
        }

        private static /* synthetic */ c[] a() {
            return new c[]{a, b, c};
        }

        static {
            d = eog$c.a();
        }
    }
}

