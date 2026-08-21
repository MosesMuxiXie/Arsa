/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public interface dvt
extends dwq {
    public @Nullable elb c_(is var1);

    default public <T extends elb> Optional<T> a(is $$0, eld<T> $$1) {
        elb $$2 = this.c_($$0);
        if ($$2 == null || $$2.s() != $$1) {
            return Optional.empty();
        }
        return Optional.of($$2);
    }

    public eoh a_(is var1);

    public flb b_(is var1);

    default public int l(is $$0) {
        return this.a_($$0).k();
    }

    default public Stream<eoh> a(fth $$0) {
        return is.b($$0).map(this::a_);
    }

    default public fti a(dvv $$02) {
        return dvt.a($$02.b(), $$02.a(), $$02, ($$0, $$1) -> {
            eoh $$2 = this.a_((is)$$1);
            ftm $$3 = $$0.b().d($$0.a());
            return $$0.c().test($$2) ? new fti($$0.a(), iz.a($$3.g, $$3.h, $$3.i), is.a($$0.a()), false) : null;
        }, $$0 -> {
            ftm $$1 = $$0.b().d($$0.a());
            return fti.a($$0.a(), iz.a($$1.g, $$1.h, $$1.i), is.a($$0.a()));
        });
    }

    default public fti a(dvw $$02) {
        return dvt.a($$02.b(), $$02.a(), $$02, ($$0, $$1) -> {
            eoh $$2 = this.a_((is)$$1);
            flb $$3 = this.b_((is)$$1);
            ftm $$4 = $$0.b();
            ftm $$5 = $$0.a();
            fug $$6 = $$0.a($$2, this, (is)$$1);
            fti $$7 = this.a($$4, $$5, (is)$$1, $$6, $$2);
            fug $$8 = $$0.a($$3, this, (is)$$1);
            fti $$9 = $$8.a($$4, $$5, (is)$$1);
            double $$10 = $$7 == null ? Double.MAX_VALUE : $$0.b().g($$7.g());
            double $$11 = $$9 == null ? Double.MAX_VALUE : $$0.b().g($$9.g());
            return $$10 <= $$11 ? $$7 : $$9;
        }, $$0 -> {
            ftm $$1 = $$0.b().d($$0.a());
            return fti.a($$0.a(), iz.a($$1.g, $$1.h, $$1.i), is.a($$0.a()));
        });
    }

    default public @Nullable fti a(ftm $$0, ftm $$1, is $$2, fug $$3, eoh $$4) {
        fti $$6;
        fti $$5 = $$3.a($$0, $$1, $$2);
        if ($$5 != null && ($$6 = $$4.i(this, $$2).a($$0, $$1, $$2)) != null && $$6.g().d($$0).h() < $$5.g().d($$0).h()) {
            return $$5.a($$6.c());
        }
        return $$5;
    }

    default public double a(fug $$0, Supplier<fug> $$1) {
        if (!$$0.c()) {
            return $$0.c(iz.a.b);
        }
        double $$2 = $$1.get().c(iz.a.b);
        if ($$2 >= 1.0) {
            return $$2 - 1.0;
        }
        return Double.NEGATIVE_INFINITY;
    }

    default public double m(is $$0) {
        return this.a(this.a_($$0).g(this, $$0), () -> {
            is $$1 = $$0.e();
            return this.a_($$1).g(this, $$1);
        });
    }

    public static <T, C> T a(ftm $$0, ftm $$1, C $$2, BiFunction<C, is, @Nullable T> $$3, Function<C, T> $$4) {
        int $$13;
        int $$12;
        if ($$0.equals($$1)) {
            return $$4.apply($$2);
        }
        double $$5 = bgj.d(-1.0E-7, $$1.g, $$0.g);
        double $$6 = bgj.d(-1.0E-7, $$1.h, $$0.h);
        double $$7 = bgj.d(-1.0E-7, $$1.i, $$0.i);
        double $$8 = bgj.d(-1.0E-7, $$0.g, $$1.g);
        double $$9 = bgj.d(-1.0E-7, $$0.h, $$1.h);
        double $$10 = bgj.d(-1.0E-7, $$0.i, $$1.i);
        int $$11 = bgj.c($$8);
        is.a $$14 = new is.a($$11, $$12 = bgj.c($$9), $$13 = bgj.c($$10));
        T $$15 = $$3.apply($$2, $$14);
        if ($$15 != null) {
            return $$15;
        }
        double $$16 = $$5 - $$8;
        double $$17 = $$6 - $$9;
        double $$18 = $$7 - $$10;
        int $$19 = bgj.m($$16);
        int $$20 = bgj.m($$17);
        int $$21 = bgj.m($$18);
        double $$22 = $$19 == 0 ? Double.MAX_VALUE : (double)$$19 / $$16;
        double $$23 = $$20 == 0 ? Double.MAX_VALUE : (double)$$20 / $$17;
        double $$24 = $$21 == 0 ? Double.MAX_VALUE : (double)$$21 / $$18;
        double $$25 = $$22 * ($$19 > 0 ? 1.0 - bgj.h($$8) : bgj.h($$8));
        double $$26 = $$23 * ($$20 > 0 ? 1.0 - bgj.h($$9) : bgj.h($$9));
        double $$27 = $$24 * ($$21 > 0 ? 1.0 - bgj.h($$10) : bgj.h($$10));
        while ($$25 <= 1.0 || $$26 <= 1.0 || $$27 <= 1.0) {
            T $$28;
            if ($$25 < $$26) {
                if ($$25 < $$27) {
                    $$11 += $$19;
                    $$25 += $$22;
                } else {
                    $$13 += $$21;
                    $$27 += $$24;
                }
            } else if ($$26 < $$27) {
                $$12 += $$20;
                $$26 += $$23;
            } else {
                $$13 += $$21;
                $$27 += $$24;
            }
            if (($$28 = $$3.apply($$2, $$14.d($$11, $$12, $$13))) == null) continue;
            return $$28;
        }
        return $$4.apply($$2);
    }

    public static boolean a(ftm $$0, ftm $$1, fth $$2, a $$3) {
        ftm $$4 = $$1.d($$0);
        if ($$4.h() < (double)bgj.j(1.0E-5f)) {
            for (is $$5 : is.a($$2)) {
                if ($$3.visit($$5, 0)) continue;
                return false;
            }
            return true;
        }
        LongOpenHashSet $$6 = new LongOpenHashSet();
        for (is $$7 : is.a($$2.c($$4.c(-1.0)), $$4)) {
            if (!$$3.visit($$7, 0)) {
                return false;
            }
            $$6.add($$7.a());
        }
        int $$8 = dvt.a((LongSet)$$6, $$4, $$2, $$3);
        if ($$8 < 0) {
            return false;
        }
        for (is $$9 : is.a($$2, $$4)) {
            if (!$$6.add($$9.a()) || $$3.visit($$9, $$8 + 1)) continue;
            return false;
        }
        return true;
    }

    private static int a(LongSet $$0, ftm $$1, fth $$2, a $$3) {
        double $$4 = $$2.b();
        double $$5 = $$2.c();
        double $$6 = $$2.d();
        jy $$7 = dvt.a($$1);
        ftm $$8 = $$2.f();
        ftm $$9 = new ftm($$8.a() + $$4 * 0.5 * (double)$$7.u(), $$8.b() + $$5 * 0.5 * (double)$$7.v(), $$8.c() + $$6 * 0.5 * (double)$$7.w());
        ftm $$10 = $$9.d($$1);
        int $$11 = bgj.c($$10.g);
        int $$12 = bgj.c($$10.h);
        int $$13 = bgj.c($$10.i);
        int $$14 = bgj.m($$1.g);
        int $$15 = bgj.m($$1.h);
        int $$16 = bgj.m($$1.i);
        double $$17 = $$14 == 0 ? Double.MAX_VALUE : (double)$$14 / $$1.g;
        double $$18 = $$15 == 0 ? Double.MAX_VALUE : (double)$$15 / $$1.h;
        double $$19 = $$16 == 0 ? Double.MAX_VALUE : (double)$$16 / $$1.i;
        double $$20 = $$17 * ($$14 > 0 ? 1.0 - bgj.h($$10.g) : bgj.h($$10.g));
        double $$21 = $$18 * ($$15 > 0 ? 1.0 - bgj.h($$10.h) : bgj.h($$10.h));
        double $$22 = $$19 * ($$16 > 0 ? 1.0 - bgj.h($$10.i) : bgj.h($$10.i));
        int $$23 = 0;
        while ($$20 <= 1.0 || $$21 <= 1.0 || $$22 <= 1.0) {
            if ($$20 < $$21) {
                if ($$20 < $$22) {
                    $$11 += $$14;
                    $$20 += $$17;
                } else {
                    $$13 += $$16;
                    $$22 += $$19;
                }
            } else if ($$21 < $$22) {
                $$12 += $$15;
                $$21 += $$18;
            } else {
                $$13 += $$16;
                $$22 += $$19;
            }
            Optional<ftm> $$24 = fth.a($$11, $$12, $$13, $$11 + 1, $$12 + 1, $$13 + 1, $$10, $$9);
            if ($$24.isEmpty()) continue;
            ftm $$25 = $$24.get();
            double $$26 = bgj.a($$25.g, (double)$$11 + (double)1.0E-5f, (double)$$11 + 1.0 - (double)1.0E-5f);
            double $$27 = bgj.a($$25.h, (double)$$12 + (double)1.0E-5f, (double)$$12 + 1.0 - (double)1.0E-5f);
            double $$28 = bgj.a($$25.i, (double)$$13 + (double)1.0E-5f, (double)$$13 + 1.0 - (double)1.0E-5f);
            int $$29 = bgj.c($$26 - $$4 * (double)$$7.u());
            int $$30 = bgj.c($$27 - $$5 * (double)$$7.v());
            int $$31 = bgj.c($$28 - $$6 * (double)$$7.w());
            int $$32 = ++$$23;
            for (is $$33 : is.a($$11, $$12, $$13, $$29, $$30, $$31, $$1)) {
                if (!$$0.add($$33.a()) || $$3.visit($$33, $$32)) continue;
                return -1;
            }
        }
        return $$23;
    }

    private static jy a(ftm $$0) {
        int $$6;
        double $$1 = Math.abs(ftm.d.b($$0));
        double $$2 = Math.abs(ftm.e.b($$0));
        double $$3 = Math.abs(ftm.f.b($$0));
        int $$4 = $$0.g >= 0.0 ? 1 : -1;
        int $$5 = $$0.h >= 0.0 ? 1 : -1;
        int n2 = $$6 = $$0.i >= 0.0 ? 1 : -1;
        if ($$1 <= $$2 && $$1 <= $$3) {
            return new jy(-$$4, -$$6, $$5);
        }
        if ($$2 <= $$3) {
            return new jy($$6, -$$5, -$$4);
        }
        return new jy(-$$5, $$4, -$$6);
    }

    @FunctionalInterface
    public static interface a {
        public boolean visit(is var1, int var2);
    }
}

