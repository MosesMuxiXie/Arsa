/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.util.Either;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public final class dee {
    public static final float a = 0.3f;

    public static ftk a(cgk $$0, Predicate<cgk> $$1) {
        ftm $$2 = $$0.dN();
        dwo $$3 = $$0.ao();
        ftm $$4 = $$0.dI();
        return dee.a($$4, $$0, $$1, $$2, $$3, dee.a($$0), dvw.a.a);
    }

    public static Either<fti, Collection<ftj>> a(cgk $$0, dnu $$1, Predicate<cgk> $$2, dvw.a $$3) {
        ftm $$4 = $$0.ck();
        ftm $$5 = $$0.bV();
        ftm $$6 = $$5.e($$4.c((double)$$1.a($$0)));
        double $$7 = $$0.ag().b($$4);
        ftm $$8 = $$5.e($$4.c((double)$$1.b($$0) + Math.max(0.0, $$7)));
        return dee.a($$0, $$5, $$6, $$2, $$8, $$1.e(), $$3);
    }

    public static ftk a(cgk $$0, Predicate<cgk> $$1, dvw.a $$2) {
        ftm $$3 = $$0.dN();
        dwo $$4 = $$0.ao();
        ftm $$5 = $$0.dI();
        return dee.a($$5, $$0, $$1, $$3, $$4, dee.a($$0), $$2);
    }

    public static ftk a(cgk $$0, Predicate<cgk> $$1, double $$2) {
        ftm $$3 = $$0.h(0.0f).c($$2);
        dwo $$4 = $$0.ao();
        ftm $$5 = $$0.bV();
        return dee.a($$5, $$0, $$1, $$3, $$4, 0.0f, dvw.a.a);
    }

    private static ftk a(ftm $$0, cgk $$1, Predicate<cgk> $$2, ftm $$3, dwo $$4, float $$5, dvw.a $$6) {
        ftj $$9;
        ftm $$7 = $$0.e($$3);
        ftk $$8 = $$4.b(new dvw($$0, $$7, $$6, dvw.b.a, $$1));
        if (((ftk)$$8).d() != ftk.a.a) {
            $$7 = $$8.g();
        }
        if (($$9 = dee.a($$4, $$1, $$0, $$7, $$1.dj().b($$3).g(1.0), $$2, $$5)) != null) {
            $$8 = $$9;
        }
        return $$8;
    }

    private static Either<fti, Collection<ftj>> a(cgk $$0, ftm $$1, ftm $$2, Predicate<cgk> $$3, ftm $$4, float $$5, dvw.a $$6) {
        dwo $$7 = $$0.ao();
        fti $$8 = $$7.b(new dvw($$1, $$4, $$6, dvw.b.a, $$0));
        if ($$8.d() != ftk.a.a && $$1.g($$4 = $$8.g()) < $$1.g($$2)) {
            return Either.left((Object)$$8);
        }
        fth $$9 = fth.a($$2, $$5, $$5, $$5).b($$4.d($$2)).g(1.0);
        Collection<ftj> $$10 = dee.a($$7, $$0, $$2, $$4, $$9, $$3, $$5, $$6, true);
        if (!$$10.isEmpty()) {
            return Either.right($$10);
        }
        return Either.left((Object)$$8);
    }

    public static @Nullable ftj a(cgk $$0, ftm $$1, ftm $$2, fth $$3, Predicate<cgk> $$4, double $$5) {
        dwo $$6 = $$0.ao();
        double $$7 = $$5;
        cgk $$8 = null;
        ftm $$9 = null;
        for (cgk $$10 : $$6.a($$0, $$3, $$4)) {
            ftm $$13;
            double $$14;
            fth $$11 = $$10.dj().g($$10.ci());
            Optional<ftm> $$12 = $$11.b($$1, $$2);
            if ($$11.d($$1)) {
                if (!($$7 >= 0.0)) continue;
                $$8 = $$10;
                $$9 = $$12.orElse($$1);
                $$7 = 0.0;
                continue;
            }
            if (!$$12.isPresent() || !(($$14 = $$1.g($$13 = $$12.get())) < $$7) && $$7 != 0.0) continue;
            if ($$10.du() == $$0.du()) {
                if ($$7 != 0.0) continue;
                $$8 = $$10;
                $$9 = $$13;
                continue;
            }
            $$8 = $$10;
            $$9 = $$13;
            $$7 = $$14;
        }
        if ($$8 == null) {
            return null;
        }
        return new ftj($$8, $$9);
    }

    public static @Nullable ftj a(dwo $$0, dec $$1, ftm $$2, ftm $$3, fth $$4, Predicate<cgk> $$5) {
        return dee.a($$0, (cgk)$$1, $$2, $$3, $$4, $$5, dee.a($$1));
    }

    public static float a(cgk $$0) {
        return Math.max(0.0f, Math.min(0.3f, (float)($$0.at - 2) / 20.0f));
    }

    public static @Nullable ftj a(dwo $$0, cgk $$1, ftm $$2, ftm $$3, fth $$4, Predicate<cgk> $$5, float $$6) {
        double $$7 = Double.MAX_VALUE;
        Optional<Object> $$8 = Optional.empty();
        cgk $$9 = null;
        for (cgk $$10 : $$0.a($$1, $$4, $$5)) {
            double $$13;
            fth $$11 = $$10.dj().g($$6);
            Optional<ftm> $$12 = $$11.b($$2, $$3);
            if (!$$12.isPresent() || !(($$13 = $$2.g($$12.get())) < $$7)) continue;
            $$9 = $$10;
            $$7 = $$13;
            $$8 = $$12;
        }
        if ($$9 == null) {
            return null;
        }
        return new ftj($$9, (ftm)$$8.get());
    }

    public static Collection<ftj> a(dwo $$0, cgk $$1, ftm $$2, ftm $$3, fth $$4, Predicate<cgk> $$5, boolean $$6) {
        return dee.a($$0, $$1, $$2, $$3, $$4, $$5, dee.a($$1), dvw.a.a, $$6);
    }

    public static Collection<ftj> a(dwo $$0, cgk $$1, ftm $$2, ftm $$3, fth $$4, Predicate<cgk> $$5, float $$6, dvw.a $$7, boolean $$8) {
        ArrayList<ftj> $$9 = new ArrayList<ftj>();
        for (cgk $$10 : $$0.a($$1, $$4, $$5)) {
            Optional<ftm> $$17;
            ftm $$15;
            Optional<ftm> $$13;
            fth $$11 = $$10.dj();
            if ($$8 && $$11.d($$2)) {
                $$9.add(new ftj($$10, $$2));
                continue;
            }
            Optional<ftm> $$12 = $$11.b($$2, $$3);
            if ($$12.isPresent()) {
                $$9.add(new ftj($$10, $$12.get()));
                continue;
            }
            if ((double)$$6 <= 0.0 || ($$13 = $$11.g($$6).b($$2, $$3)).isEmpty()) continue;
            ftm $$14 = $$13.get();
            fti $$16 = $$0.b(new dvw($$14, $$15 = $$11.f(), $$7, dvw.b.a, $$1));
            if ($$16.d() != ftk.a.a) {
                $$15 = $$16.g();
            }
            if (!($$17 = $$10.dj().b($$14, $$15)).isPresent()) continue;
            $$9.add(new ftj($$10, $$17.get()));
        }
        return $$9;
    }

    public static void a(cgk $$0, float $$1) {
        ftm $$2 = $$0.dN();
        if ($$2.h() == 0.0) {
            return;
        }
        double $$3 = $$2.i();
        $$0.v((float)(bgj.d($$2.i, $$2.g) * 57.2957763671875) + 90.0f);
        $$0.w((float)(bgj.d($$3, $$2.h) * 57.2957763671875) - 90.0f);
        while ($$0.ee() - $$0.ac < -180.0f) {
            $$0.ac -= 360.0f;
        }
        while ($$0.ee() - $$0.ac >= 180.0f) {
            $$0.ac += 360.0f;
        }
        while ($$0.ec() - $$0.ab < -180.0f) {
            $$0.ab -= 360.0f;
        }
        while ($$0.ec() - $$0.ab >= 180.0f) {
            $$0.ab += 360.0f;
        }
        $$0.w(bgj.h($$1, $$0.ac, $$0.ee()));
        $$0.v(bgj.h($$1, $$0.ab, $$0.ec()));
    }

    public static cdb a(chl $$0, dlp $$1) {
        return $$0.fx().a($$1) ? cdb.a : cdb.b;
    }

    public static deh a(chl $$0, dlt $$1, float $$2, @Nullable dlt $$3) {
        djx $$4 = (djx)($$1.h() instanceof djx ? $$1.h() : dlx.pX);
        deh $$5 = $$4.a($$0.ao(), $$1, $$0, $$3);
        $$5.a($$2);
        return $$5;
    }
}

