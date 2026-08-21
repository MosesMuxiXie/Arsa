/*
 * Decompiled with CFR 0.152.
 */
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ts {
    public static final int a = 10;
    public static final String b = "Minecraft.Server/src/test/convertables/data";
    public static Path c = Paths.get("Minecraft.Server/src/test/convertables/data", new String[0]);

    public static egm a(int $$0) {
        switch ($$0) {
            case 0: {
                return egm.a;
            }
            case 1: {
                return egm.b;
            }
            case 2: {
                return egm.c;
            }
            case 3: {
                return egm.d;
            }
        }
        throw new IllegalArgumentException("rotationSteps must be a value from 0-3. Got value " + $$0);
    }

    public static int a(egm $$0) {
        switch ($$0) {
            case a: {
                return 0;
            }
            case b: {
                return 1;
            }
            case c: {
                return 2;
            }
            case d: {
                return 3;
            }
        }
        throw new IllegalArgumentException("Unknown rotation value, don't know how many steps it represents: " + String.valueOf($$0));
    }

    public static emz a(amo $$0, is $$1, jy $$2, egm $$3, axf $$4) {
        ffg $$5 = ts.b(emz.a($$1), $$2, $$3);
        ts.a($$5, $$4);
        $$4.c($$1, dzs.qb.m());
        emz $$6 = (emz)$$4.c_($$1);
        amt<tb> $$7 = amt.a(mj.bv, $$0);
        $$6.a(new emz.a(Optional.of($$7), $$2, $$3, false, emz.c.a, Optional.empty()));
        return $$6;
    }

    public static void a(ffg $$02, axf $$1) {
        int $$22 = $$02.i() - 1;
        is.a($$02).forEach($$2 -> ts.a($$22, $$2, $$1));
        $$1.q().a($$02);
        $$1.a($$02);
        fth $$3 = fth.a($$02);
        List<cgk> $$4 = $$1.a(cgk.class, $$3, $$0 -> !($$0 instanceof ddm));
        $$4.forEach(cgk::aC);
    }

    public static is a(is $$0, jy $$1, egm $$2) {
        is $$3 = $$0.a($$1).b(-1, -1, -1);
        return fjq.a($$3, eev.a, $$2, $$0);
    }

    public static ffg b(is $$0, jy $$1, egm $$2) {
        is $$3 = ts.a($$0, $$1, $$2);
        ffg $$4 = ffg.a((jy)$$0, (jy)$$3);
        int $$5 = Math.min($$4.h(), $$4.k());
        int $$6 = Math.min($$4.j(), $$4.m());
        return $$4.a($$0.u() - $$5, 0, $$0.w() - $$6);
    }

    public static Optional<is> a(is $$0, int $$1, axf $$22) {
        return ts.c($$0, $$1, $$22).filter($$2 -> ts.a($$2, $$0, $$22)).findFirst();
    }

    public static Optional<is> b(is $$0, int $$12, axf $$2) {
        Comparator<is> $$3 = Comparator.comparingInt($$1 -> $$1.k($$0));
        return ts.c($$0, $$12, $$2).min($$3);
    }

    public static Stream<is> c(is $$02, int $$1, axf $$2) {
        return $$2.F().a($$0 -> $$0.a(ctb.u), $$0 -> true, $$02, $$1, csx.b.c).map(is::j);
    }

    public static Stream<is> a(is $$0, cgk $$12, axf $$22) {
        int $$3 = 250;
        ftm $$4 = $$12.bV();
        ftm $$5 = $$4.e($$12.cj().c(250.0));
        return ts.c($$0, 250, $$22).map($$1 -> $$22.a((is)$$1, eld.V)).flatMap(Optional::stream).filter($$2 -> $$2.f().b($$4, $$5).isPresent()).map(elb::aD_).sorted(Comparator.comparing($$0::j)).limit(1L);
    }

    private static void a(int $$0, is $$1, axf $$2) {
        eoh $$4;
        if ($$1.v() < $$0) {
            eoh $$3 = dzs.b.m();
        } else {
            $$4 = dzs.a.m();
        }
        fx $$5 = new fx($$4, Collections.emptySet(), null);
        $$5.a($$2, $$1, 818);
        $$2.a($$1, $$4.b());
    }

    private static boolean a(is $$0, is $$1, axf $$2) {
        elb elb2 = $$2.c_($$0);
        if (elb2 instanceof emz) {
            emz $$3 = (emz)elb2;
            return $$3.d().b($$1);
        }
        return false;
    }
}

