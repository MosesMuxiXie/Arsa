/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.floats.Float2FloatFunction
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class eau
extends dyk<elj>
implements ehg {
    public static final MapCodec<eau> b = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)mi.b.q().fieldOf("open_sound").forGetter(eau::r), (App)mi.b.q().fieldOf("close_sound").forGetter(eau::s), eau.x()).apply((Applicative)$$02, ($$0, $$1, $$2) -> new eau(() -> eld.b, (bcz)$$0, (bcz)$$1, (eog.d)$$2)));
    public static final epf<iz> c = edt.f;
    public static final epf<eoz> d = eox.bh;
    public static final eoy e = eox.I;
    public static final int f = 1;
    private static final fug g = dzq.b(14.0, 0.0, 14.0);
    private static final Map<iz, fug> h = fud.c(dzq.a(14.0, 0.0, 14.0, 0.0, 15.0));
    private final bcz i;
    private final bcz D;
    private static final eca.b<elj, Optional<ccv>> R = new eca.b<elj, Optional<ccv>>(){

        @Override
        public Optional<ccv> a(elj $$0, elj $$1) {
            return Optional.of(new ccu($$0, $$1));
        }

        @Override
        public Optional<ccv> a(elj $$0) {
            return Optional.of($$0);
        }

        public Optional<ccv> a() {
            return Optional.empty();
        }

        @Override
        public /* synthetic */ Object b() {
            return this.a();
        }
    };
    private static final eca.b<elj, Optional<cdf>> S = new eca.b<elj, Optional<cdf>>(){

        @Override
        public Optional<cdf> a(final elj $$0, final elj $$1) {
            final ccu $$2 = new ccu($$0, $$1);
            return Optional.of(new cdf(){

                @Override
                public @Nullable dhi createMenu(int $$02, ddl $$12, ddm $$22) {
                    if ($$0.b($$22) && $$1.b($$22)) {
                        $$0.f_($$12.j);
                        $$1.f_($$12.j);
                        return dhs.b($$02, $$12, $$2);
                    }
                    iz $$3 = eau.n($$0.o());
                    ftm $$4 = $$0.aD_().b();
                    ftm $$5 = $$4.b((double)$$3.j() / 2.0, 0.0, (double)$$3.l() / 2.0);
                    eku.a($$5, $$22, this.R_());
                    return null;
                }

                @Override
                public yh R_() {
                    if ($$0.i_()) {
                        return $$0.R_();
                    }
                    if ($$1.i_()) {
                        return $$1.R_();
                    }
                    return yh.c("container.chestDouble");
                }
            });
        }

        @Override
        public Optional<cdf> a(elj $$0) {
            return Optional.of($$0);
        }

        public Optional<cdf> a() {
            return Optional.empty();
        }

        @Override
        public /* synthetic */ Object b() {
            return this.a();
        }
    };

    @Override
    public MapCodec<? extends eau> a() {
        return b;
    }

    protected eau(Supplier<eld<? extends elj>> $$0, bcz $$1, bcz $$2, eog.d $$3) {
        super($$3, $$0);
        this.i = $$1;
        this.D = $$2;
        this.l((eoh)((eoh)((eoh)((eoh)this.C.b()).b(c, iz.c)).b(d, eoz.a)).b(e, false));
    }

    public static eca.a h(eoh $$0) {
        eoz $$1 = $$0.c(d);
        if ($$1 == eoz.a) {
            return eca.a.a;
        }
        if ($$1 == eoz.c) {
            return eca.a.b;
        }
        return eca.a.c;
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$0.c(e).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        if (this.i($$6) && $$4.o().d()) {
            eoz $$8 = $$6.c(d);
            if ($$0.c(d) == eoz.a && $$8 != eoz.a && $$0.c(c) == $$6.c(c) && eau.n($$6) == $$4.g()) {
                return (eoh)$$0.b(d, $$8.a());
            }
        } else if (eau.n($$0) == $$4) {
            return (eoh)$$0.b(d, eoz.a);
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    public boolean i(eoh $$0) {
        return $$0.a(this);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return switch ($$0.c(d)) {
            default -> throw new MatchException(null, null);
            case eoz.a -> g;
            case eoz.b, eoz.c -> h.get(eau.n($$0));
        };
    }

    public static iz n(eoh $$0) {
        iz $$1 = $$0.c(c);
        return $$0.c(d) == eoz.b ? $$1.h() : $$1.i();
    }

    public static is b(is $$0, eoh $$1) {
        iz $$2 = eau.n($$1);
        return $$0.a($$2);
    }

    @Override
    public eoh a(dpu $$0) {
        iz $$6;
        eoz $$1 = eoz.a;
        iz $$2 = $$0.g().g();
        flb $$3 = $$0.q().b_($$0.a());
        boolean $$4 = $$0.h();
        iz $$5 = $$0.k();
        if ($$5.o().d() && $$4 && ($$6 = this.b($$0.q(), $$0.a(), $$5.g())) != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            eoz eoz2 = $$1 = $$2.i() == $$5.g() ? eoz.c : eoz.b;
        }
        if ($$1 == eoz.a && !$$4) {
            $$1 = this.a($$0.q(), $$0.a(), $$2);
        }
        return (eoh)((eoh)((eoh)this.m().b(c, $$2)).b(d, $$1)).b(e, $$3.a() == flc.c);
    }

    protected eoz a(dwo $$0, is $$1, iz $$2) {
        if ($$2 == this.b($$0, $$1, $$2.h())) {
            return eoz.b;
        }
        if ($$2 == this.b($$0, $$1, $$2.i())) {
            return eoz.c;
        }
        return eoz.a;
    }

    @Override
    protected flb b_(eoh $$0) {
        if ($$0.c(e).booleanValue()) {
            return flc.c.a(false);
        }
        return super.b_($$0);
    }

    private @Nullable iz b(dwo $$0, is $$1, iz $$2) {
        eoh $$3 = $$0.a_($$1.a($$2));
        return this.i($$3) && $$3.c(d) == eoz.a ? $$3.c(c) : null;
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, boolean $$3) {
        ccy.a($$0, $$1, $$2);
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        if ($$1 instanceof axf) {
            axf $$5 = (axf)$$1;
            cdf $$6 = this.a($$0, $$1, $$2);
            if ($$6 != null) {
                $$3.a($$6);
                $$3.b(this.d());
                dbk.a($$5, $$3, true);
            }
        }
        return cdc.a;
    }

    protected bdh<amo> d() {
        return bdk.i.b(bdk.aq);
    }

    public eld<? extends elj> q() {
        return (eld)this.a.get();
    }

    public static @Nullable ccv a(eau $$0, eoh $$1, dwo $$2, is $$3, boolean $$4) {
        return $$0.a($$1, $$2, $$3, $$4).apply(R).orElse(null);
    }

    @Override
    public eca.c<? extends elj> a(eoh $$02, dwo $$12, is $$2, boolean $$3) {
        BiPredicate<dwp, is> $$5;
        if ($$3) {
            BiPredicate<dwp, is> $$4 = ($$0, $$1) -> false;
        } else {
            $$5 = eau::a;
        }
        return eca.a((eld)this.a.get(), eau::h, eau::n, c, $$02, $$12, $$2, $$5);
    }

    @Override
    protected @Nullable cdf a(eoh $$0, dwo $$1, is $$2) {
        return this.a($$0, $$1, $$2, false).apply(S).orElse(null);
    }

    public static eca.b<elj, Float2FloatFunction> a(final emj $$0) {
        return new eca.b<elj, Float2FloatFunction>(){

            @Override
            public Float2FloatFunction a(elj $$02, elj $$1) {
                return $$2 -> Math.max($$02.a($$2), $$1.a($$2));
            }

            @Override
            public Float2FloatFunction a(elj $$02) {
                return $$02::a;
            }

            public Float2FloatFunction a() {
                return $$0::a;
            }

            @Override
            public /* synthetic */ Object b() {
                return this.a();
            }
        };
    }

    @Override
    public elb a(is $$0, eoh $$1) {
        return new elj($$0, $$1);
    }

    @Override
    public <T extends elb> @Nullable elc<T> a(dwo $$0, eoh $$1, eld<T> $$2) {
        return $$0.B_() ? eau.a($$2, this.q(), elj::a) : null;
    }

    public static boolean a(dwp $$0, is $$1) {
        return eau.a((dvt)$$0, $$1) || eau.b($$0, $$1);
    }

    private static boolean a(dvt $$0, is $$1) {
        is $$2 = $$1.d();
        return $$0.a_($$2).d($$0, $$2);
    }

    private static boolean b(dwp $$0, is $$1) {
        List<cvb> $$2 = $$0.a(cvb.class, new fth($$1.u(), $$1.v() + 1, $$1.w(), $$1.u() + 1, $$1.v() + 2, $$1.w() + 1));
        if (!$$2.isEmpty()) {
            for (cvb $$3 : $$2) {
                if (!$$3.gQ()) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    protected boolean c_(eoh $$0) {
        return true;
    }

    @Override
    protected int a(eoh $$0, dwo $$1, is $$2, iz $$3) {
        return dhi.b(eau.a(this, $$0, $$1, $$2, false));
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(c, $$1.a($$0.c(c)));
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        return $$0.a($$1.a($$0.c(c)));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(c, d, e);
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        elb $$4 = $$1.c_($$2);
        if ($$4 instanceof elj) {
            ((elj)$$4).l();
        }
    }

    public bcz r() {
        return this.i;
    }

    public bcz s() {
        return this.D;
    }
}

