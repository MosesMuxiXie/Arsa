/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class cjf {
    private cjf() {
    }

    public static void a(chl $$0, chl $$1, float $$2, int $$3) {
        cjf.c($$0, $$1);
        cjf.b($$0, $$1, $$2, $$3);
    }

    public static boolean a(cim<?> $$0, chl $$1) {
        Optional<cqy> $$2 = $$0.c(cqw.h);
        return $$2.isPresent() && $$2.get().a($$1);
    }

    public static boolean a(cim<?> $$0, cqw<? extends chl> $$12, cgu<?> $$2) {
        return cjf.a($$0, $$12, (chl $$1) -> $$1.ay() == $$2);
    }

    private static boolean a(cim<?> $$0, cqw<? extends chl> $$12, Predicate<chl> $$2) {
        return $$0.c($$12).filter($$2).filter(chl::cb).filter($$1 -> cjf.a($$0, $$1)).isPresent();
    }

    private static void c(chl $$0, chl $$1) {
        cjf.a($$0, $$1);
        cjf.a($$1, $$0);
    }

    public static void a(chl $$0, chl $$1) {
        $$0.ev().a(cqw.o, new cjp($$1, true));
    }

    private static void b(chl $$0, chl $$1, float $$2, int $$3) {
        cjf.a($$0, (cgk)$$1, $$2, $$3);
        cjf.a($$1, (cgk)$$0, $$2, $$3);
    }

    public static void a(chl $$0, cgk $$1, float $$2, int $$3) {
        cjf.a($$0, new cjp($$1, true), $$2, $$3);
    }

    public static void a(chl $$0, is $$1, float $$2, int $$3) {
        cjf.a($$0, new cjg($$1), $$2, $$3);
    }

    public static void a(chl $$0, cks $$1, float $$2, int $$3) {
        cqz $$4 = new cqz($$1, $$2, $$3);
        $$0.ev().a(cqw.o, $$1);
        $$0.ev().a(cqw.n, $$4);
    }

    public static void a(chl $$0, dlt $$1, ftm $$2) {
        ftm $$3 = new ftm(0.3f, 0.3f, 0.3f);
        cjf.a($$0, $$1, $$2, $$3, 0.3f);
    }

    public static void a(chl $$0, dlt $$1, ftm $$2, ftm $$3, float $$4) {
        double $$5 = $$0.dT() - (double)$$4;
        czl $$6 = new czl($$0.ao(), $$0.dP(), $$5, $$0.dV(), $$1);
        $$6.b((cgk)$$0);
        ftm $$7 = $$2.d($$0.dI());
        $$7 = $$7.d().d($$3.g, $$3.h, $$3.i);
        $$6.k($$7);
        $$6.i();
        $$0.ao().b($$6);
    }

    public static jw a(axf $$0, jw $$1, int $$22) {
        int $$3 = $$0.b($$1);
        return jw.a($$1, $$22).filter($$2 -> $$0.b((jw)$$2) < $$3).min(Comparator.comparingInt($$0::b)).orElse($$1);
    }

    public static boolean a(chn $$0, chl $$1, int $$2) {
        dlp dlp2 = $$0.fx().h();
        if (dlp2 instanceof dmo) {
            dmo $$3 = (dmo)dlp2;
            if ($$0.g($$0.fx())) {
                int $$4 = $$3.b() - $$2;
                return $$0.a((cgk)$$1, (double)$$4);
            }
        }
        return $$0.h($$1);
    }

    public static boolean a(chl $$0, chl $$1, double $$2) {
        Optional<chl> $$3 = $$0.ev().c(cqw.p);
        if ($$3.isEmpty()) {
            return false;
        }
        double $$4 = $$0.g($$3.get().dI());
        double $$5 = $$0.g($$1.dI());
        return $$5 > $$4 + $$2 * $$2;
    }

    public static boolean b(chl $$0, chl $$1) {
        cim<cqy> $$2 = $$0.ev();
        if (!$$2.a(cqw.h)) {
            return false;
        }
        return $$2.c(cqw.h).get().a($$1);
    }

    public static chl a(chl $$0, Optional<chl> $$1, chl $$2) {
        if ($$1.isEmpty()) {
            return $$2;
        }
        return cjf.a($$0, $$1.get(), $$2);
    }

    public static chl a(chl $$0, chl $$1, chl $$2) {
        ftm $$3 = $$1.dI();
        ftm $$4 = $$2.dI();
        return $$0.g($$3) < $$0.g($$4) ? $$1 : $$2;
    }

    public static Optional<chl> a(chl $$02, cqw<UUID> $$12) {
        Optional<UUID> $$2 = $$02.ev().c($$12);
        return $$2.map($$1 -> $$02.ao().d((UUID)$$1)).map($$0 -> {
            chl $$1;
            return $$0 instanceof chl ? ($$1 = (chl)$$0) : null;
        });
    }

    public static @Nullable ftm a(cht $$0, int $$1, int $$2) {
        ftm $$3 = cso.a($$0, $$1, $$2);
        int $$4 = 0;
        while ($$3 != null && !$$0.ao().a_(is.a($$3)).a(flq.b) && $$4++ < 10) {
            $$3 = cso.a($$0, $$1, $$2);
        }
        return $$3;
    }

    public static boolean a(chl $$0) {
        return $$0.ev().a(cqw.s);
    }
}

