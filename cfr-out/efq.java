/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class efq
extends dzq
implements ecq,
ehg {
    public static final MapCodec<efq> a = efq.b(efq::new);
    public static final epf<iz> b = eox.br;
    public static final epf<epe> c = eox.bs;
    public static final eoy d = eox.I;
    private static final int e = 11;
    private static final int f = 2;
    private static final float g = 0.02f;
    private static final float h = 0.12f;
    private static final int i = 11;
    private static final float D = 0.17578125f;
    private static final float R = 0.05859375f;
    private static final double S = 0.6;
    private static final float T = 1.0f;
    private static final int U = 40;
    private static final int V = 6;
    private static final float W = 2.5f;
    private static final int X = 2;
    private static final float Y = 5.0f;
    private static final float Z = 0.011377778f;
    private static final int aa = 7;
    private static final int ab = 10;
    private static final fug ac = dzq.b(6.0, 0.0, 16.0);
    private static final fug ad = dzq.b(6.0, 0.0, 11.0);
    private static final fug ae = dzq.b(6.0, 5.0, 16.0);
    private static final fug af = dzq.b(8.0, 0.0, 16.0);
    private static final fug ag = dzq.b(10.0, 0.0, 16.0);
    private static final fug ah = dzq.b(12.0, 0.0, 16.0);
    private static final double ai = ae.b(iz.a.b);
    private static final float aj = (float)ah.b(iz.a.a);
    private static final fug ak = dzq.b(4.0, 0.0, 16.0);

    public MapCodec<efq> a() {
        return a;
    }

    public efq(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)((eoh)this.C.b()).b(b, iz.b)).b(c, epe.b)).b(d, false));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(b, c, d);
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        return efq.c($$1, $$2, $$0.c(b));
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$0.c(d).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        if ($$4 != iz.b && $$4 != iz.a) {
            return $$0;
        }
        iz $$8 = $$0.c(b);
        if ($$8 == iz.a && $$2.af().a($$3, this)) {
            return $$0;
        }
        if ($$4 == $$8.g() && !this.a($$0, $$1, $$3)) {
            if ($$8 == iz.a) {
                $$2.a($$3, this, 2);
            } else {
                $$2.a($$3, this, 1);
            }
            return $$0;
        }
        boolean $$9 = $$0.c(c) == epe.a;
        epe $$10 = efq.a($$1, $$3, $$8, $$9);
        return (eoh)$$0.b(c, $$10);
    }

    @Override
    protected void a(dwo $$0, eoh $$1, fti $$2, dec $$3) {
        axf $$5;
        if ($$0.B_()) {
            return;
        }
        is $$4 = $$2.b();
        if ($$0 instanceof axf && $$3.c($$5 = (axf)$$0, $$4) && $$3.a($$5) && $$3 instanceof dek && $$3.dN().g() > 0.6) {
            $$0.b($$4, true);
        }
    }

    @Override
    public void a(dwo $$0, eoh $$1, is $$2, cgk $$3, double $$4) {
        if ($$1.c(b) == iz.b && $$1.c(c) == epe.b) {
            $$3.a($$4 + 2.5, 2.0f, $$0.as().w());
        } else {
            super.a($$0, $$1, $$2, $$3, $$4);
        }
    }

    @Override
    public void a(eoh $$0, dwo $$12, is $$2, bgr $$32) {
        if (!efq.p($$0)) {
            return;
        }
        float $$4 = $$32.i();
        if ($$4 > 0.12f) {
            return;
        }
        efq.b($$12, $$2, $$0).filter($$1 -> $$4 < 0.02f || efq.a($$1.b)).ifPresent($$3 -> efq.a($$12, $$2, $$0, $$3.b, $$3.a));
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if (efq.s($$0) && !this.a($$0, (dwr)$$1, $$2)) {
            $$1.b($$2, true);
        } else {
            efq.a($$0, $$1, $$2);
        }
    }

    @Override
    protected void b(eoh $$0, axf $$1, is $$2, bgr $$3) {
        efq.a($$0, $$1, $$2, $$3.i());
        if ($$3.i() < 0.011377778f && efq.b($$0, (dwr)$$1, $$2)) {
            efq.c($$0, $$1, $$2, $$3);
        }
    }

    /*
     * WARNING - void declaration
     */
    @VisibleForTesting
    public static void a(eoh $$0, axf $$1, is $$2, float $$3) {
        void $$8;
        if ($$3 > 0.17578125f && $$3 > 0.05859375f) {
            return;
        }
        if (!efq.b($$0, (dwr)$$1, $$2)) {
            return;
        }
        Optional<a> $$4 = efq.b($$1, $$2, $$0);
        if ($$4.isEmpty()) {
            return;
        }
        fla $$5 = $$4.get().b;
        if ($$5 == flc.c) {
            float $$6 = 0.17578125f;
        } else if ($$5 == flc.e) {
            float $$7 = 0.05859375f;
        } else {
            return;
        }
        if ($$3 >= $$8) {
            return;
        }
        is $$9 = efq.a($$0, $$1, $$2, 11, false);
        if ($$9 == null) {
            return;
        }
        if ($$4.get().c.a(dzs.uh) && $$5 == flc.c) {
            eoh $$10 = dzs.eu.m();
            $$1.c($$4.get().a, $$10);
            dzq.a($$4.get().c, $$10, $$1, $$4.get().a);
            $$1.a(etk.c, $$4.get().a, etk.a.a($$10));
            $$1.c(1504, $$9, 0);
            return;
        }
        is $$11 = efq.a((dwo)$$1, $$9, $$5);
        if ($$11 == null) {
            return;
        }
        $$1.c(1504, $$9, 0);
        int $$12 = $$9.v() - $$11.v();
        int $$13 = 50 + $$12;
        eoh $$14 = $$1.a_($$11);
        $$1.a($$11, $$14.b(), $$13);
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        iz $$3;
        is $$2;
        dwo $$1 = $$0.q();
        iz $$4 = efq.b((dwr)$$1, $$2 = $$0.a(), $$3 = $$0.e().g());
        if ($$4 == null) {
            return null;
        }
        boolean $$5 = !$$0.h();
        epe $$6 = efq.a((dwr)$$1, $$2, $$4, $$5);
        return (eoh)((eoh)((eoh)this.m().b(b, $$4)).b(c, $$6)).b(d, $$1.b_($$2).a() == flc.c);
    }

    @Override
    protected flb b_(eoh $$0) {
        if ($$0.c(d).booleanValue()) {
            return flc.c.a(false);
        }
        return super.b_($$0);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        fug $$4 = switch ($$0.c(c)) {
            default -> throw new MatchException(null, null);
            case epe.a -> ac;
            case epe.b -> {
                if ($$0.c(b) == iz.a) {
                    yield ae;
                }
                yield ad;
            }
            case epe.c -> af;
            case epe.d -> ag;
            case epe.e -> ah;
        };
        return $$4.a($$0.a($$2));
    }

    @Override
    protected boolean a_(eoh $$0, dvt $$1, is $$2) {
        return false;
    }

    @Override
    protected float at_() {
        return aj;
    }

    @Override
    public void a(dwo $$0, is $$1, czk $$2) {
        if (!$$2.bq()) {
            $$0.c(1045, $$1, 0);
        }
    }

    @Override
    public cex a(cgk $$0) {
        return $$0.en().c($$0);
    }

    private static void a(eoh $$0, axf $$1, is $$2) {
        is.a $$3 = $$2.k();
        eoh $$4 = $$0;
        while (efq.r($$4)) {
            czk $$5 = czk.a($$1, $$3, $$4);
            if (efq.a($$4, true)) {
                int $$6 = Math.max(1 + $$2.v() - $$3.v(), 6);
                float $$7 = 1.0f * (float)$$6;
                $$5.b($$7, 40);
                break;
            }
            $$3.c(iz.a);
            $$4 = $$1.a_($$3);
        }
    }

    @VisibleForTesting
    public static void c(eoh $$0, axf $$1, is $$2, bgr $$3) {
        eoh $$5;
        eoh $$4 = $$1.a_($$2.b(1));
        if (!efq.a($$4, $$5 = $$1.a_($$2.b(2)))) {
            return;
        }
        is $$6 = efq.a($$0, $$1, $$2, 7, false);
        if ($$6 == null) {
            return;
        }
        eoh $$7 = $$1.a_($$6);
        if (!efq.p($$7) || !efq.b($$7, $$1, $$6)) {
            return;
        }
        if ($$3.h()) {
            efq.a($$1, $$6, iz.a);
        } else {
            efq.b($$1, $$6);
        }
    }

    private static void b(axf $$0, is $$1) {
        is.a $$2 = $$1.k();
        for (int $$3 = 0; $$3 < 10; ++$$3) {
            $$2.c(iz.a);
            eoh $$4 = $$0.a_($$2);
            if (!$$4.y().c()) {
                return;
            }
            if (efq.a($$4, iz.b) && efq.b($$4, $$0, (is)$$2)) {
                efq.a($$0, (is)$$2, iz.b);
                return;
            }
            if (efq.c((dwr)$$0, (is)$$2, iz.b) && !$$0.F($$2.e())) {
                efq.a($$0, $$2.e(), iz.b);
                return;
            }
            if (efq.a((dvt)$$0, (is)$$2, $$4)) continue;
            return;
        }
    }

    private static void a(axf $$0, is $$1, iz $$2) {
        is $$3 = $$1.a($$2);
        eoh $$4 = $$0.a_($$3);
        if (efq.a($$4, $$2.g())) {
            efq.a($$4, (dwp)$$0, $$3);
        } else if ($$4.l() || $$4.a(dzs.J)) {
            efq.a((dwp)$$0, $$3, $$2, epe.b);
        }
    }

    private static void a(dwp $$0, is $$1, iz $$2, epe $$3) {
        eoh $$4 = (eoh)((eoh)((eoh)dzs.tQ.m().b(b, $$2)).b(c, $$3)).b(d, $$0.b_($$1).a() == flc.c);
        $$0.a($$1, $$4, 3);
    }

    private static void a(eoh $$0, dwp $$1, is $$2) {
        is $$6;
        is $$5;
        if ($$0.c(b) == iz.b) {
            is $$3 = $$2;
            is $$4 = $$2.d();
        } else {
            $$5 = $$2;
            $$6 = $$2.e();
        }
        efq.a($$1, $$5, iz.a, epe.a);
        efq.a($$1, $$6, iz.b, epe.a);
    }

    public static void a(dwo $$0, is $$1, eoh $$2) {
        efq.b($$0, $$1, $$2).ifPresent($$3 -> efq.a($$0, $$1, $$2, $$3.b, $$3.a));
    }

    private static void a(dwo $$0, is $$1, eoh $$2, fla $$3, is $$4) {
        ftm $$5 = $$2.a($$1);
        double $$6 = 0.0625;
        double $$7 = (double)$$1.u() + 0.5 + $$5.g;
        double $$8 = (double)$$1.v() + ai - 0.0625;
        double $$9 = (double)$$1.w() + 0.5 + $$5.i;
        lw $$10 = efq.a($$0, $$3, $$4);
        $$0.a($$10, $$7, $$8, $$9, 0.0, 0.0, 0.0);
    }

    private static @Nullable is a(eoh $$0, dwp $$12, is $$22, int $$3, boolean $$4) {
        if (efq.a($$0, $$4)) {
            return $$22;
        }
        iz $$5 = $$0.c(b);
        BiPredicate<is, eoh> $$6 = ($$1, $$2) -> $$2.a(dzs.tQ) && $$2.c(b) == $$5;
        return efq.a($$12, $$22, $$5.f(), $$6, (eoh $$1) -> efq.a($$1, $$4), $$3).orElse(null);
    }

    /*
     * WARNING - void declaration
     */
    private static @Nullable iz b(dwr $$0, is $$1, iz $$2) {
        void $$5;
        if (efq.c($$0, $$1, $$2)) {
            iz $$3 = $$2;
        } else if (efq.c($$0, $$1, $$2.g())) {
            iz $$4 = $$2.g();
        } else {
            return null;
        }
        return $$5;
    }

    private static epe a(dwr $$0, is $$1, iz $$2, boolean $$3) {
        iz $$4 = $$2.g();
        eoh $$5 = $$0.a_($$1.a($$2));
        if (efq.b($$5, $$4)) {
            if ($$3 || $$5.c(c) == epe.a) {
                return epe.a;
            }
            return epe.b;
        }
        if (!efq.b($$5, $$2)) {
            return epe.b;
        }
        epe $$6 = $$5.c(c);
        if ($$6 == epe.b || $$6 == epe.a) {
            return epe.c;
        }
        eoh $$7 = $$0.a_($$1.a($$4));
        if (!efq.b($$7, $$2)) {
            return epe.e;
        }
        return epe.d;
    }

    public static boolean p(eoh $$0) {
        return efq.r($$0) && $$0.c(c) == epe.b && $$0.c(d) == false;
    }

    private static boolean b(eoh $$0, axf $$1, is $$2) {
        iz $$3 = $$0.c(b);
        is $$4 = $$2.a($$3);
        eoh $$5 = $$1.a_($$4);
        if (!$$5.y().c()) {
            return false;
        }
        if ($$5.l()) {
            return true;
        }
        return efq.a($$5, $$3.g());
    }

    private static Optional<is> a(dwo $$02, is $$12, eoh $$22, int $$3) {
        iz $$4 = $$22.c(b);
        BiPredicate<is, eoh> $$5 = ($$1, $$2) -> $$2.a(dzs.tQ) && $$2.c(b) == $$4;
        return efq.a($$02, $$12, $$4.g().f(), $$5, (eoh $$0) -> !$$0.a(dzs.tQ), $$3);
    }

    private static boolean c(dwr $$0, is $$1, iz $$2) {
        is $$3 = $$1.a($$2.g());
        eoh $$4 = $$0.a_($$3);
        return $$4.c((dvt)$$0, $$3, $$2) || efq.b($$4, $$2);
    }

    private static boolean a(eoh $$0, boolean $$1) {
        if (!$$0.a(dzs.tQ)) {
            return false;
        }
        epe $$2 = $$0.c(c);
        return $$2 == epe.b || $$1 && $$2 == epe.a;
    }

    private static boolean a(eoh $$0, iz $$1) {
        return efq.a($$0, false) && $$0.c(b) == $$1;
    }

    private static boolean r(eoh $$0) {
        return efq.b($$0, iz.a);
    }

    private static boolean s(eoh $$0) {
        return efq.b($$0, iz.b);
    }

    private static boolean b(eoh $$0, dwr $$1, is $$2) {
        return efq.r($$0) && !$$1.a_($$2.d()).a(dzs.tQ);
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }

    private static boolean b(eoh $$0, iz $$1) {
        return $$0.a(dzs.tQ) && $$0.c(b) == $$1;
    }

    private static @Nullable is a(dwo $$0, is $$12, fla $$22) {
        Predicate<eoh> $$3 = $$1 -> $$1.b() instanceof dyj && ((dyj)$$1.b()).a($$22);
        BiPredicate<is, eoh> $$4 = ($$1, $$2) -> efq.a((dvt)$$0, $$1, $$2);
        return efq.a($$0, $$12, iz.a.f(), $$4, $$3, 11).orElse(null);
    }

    public static @Nullable is a(dwo $$0, is $$12) {
        BiPredicate<is, eoh> $$22 = ($$1, $$2) -> efq.a((dvt)$$0, $$1, $$2);
        return efq.a($$0, $$12, iz.b.f(), $$22, efq::p, 11).orElse(null);
    }

    public static fla a(axf $$02, is $$1) {
        return efq.b($$02, $$1, $$02.a_($$1)).map($$0 -> $$0.b).filter(efq::a).orElse(flc.a);
    }

    private static Optional<a> b(dwo $$0, is $$12, eoh $$2) {
        if (!efq.r($$2)) {
            return Optional.empty();
        }
        return efq.a($$0, $$12, $$2, 11).map($$1 -> {
            fla $$5;
            is $$2 = $$1.d();
            eoh $$3 = $$0.a_($$2);
            if ($$3.a(dzs.uh) && !$$0.c().a(ceg.B, $$2).booleanValue()) {
                fkz $$4 = flc.c;
            } else {
                $$5 = $$0.b_($$2).a();
            }
            return new a($$2, $$5, $$3);
        });
    }

    private static boolean a(fla $$0) {
        return $$0 == flc.e || $$0 == flc.c;
    }

    private static boolean a(eoh $$0, eoh $$1) {
        return $$0.a(dzs.tR) && $$1.a(dzs.J) && $$1.y().b();
    }

    private static lw a(dwo $$0, fla $$1, is $$2) {
        if ($$1.a(flc.a)) {
            return $$0.c().a(ceg.t, $$2);
        }
        return $$1.a(bdv.b) ? ly.aP : ly.aR;
    }

    private static Optional<is> a(dwp $$0, is $$1, iz.b $$2, BiPredicate<is, eoh> $$3, Predicate<eoh> $$4, int $$5) {
        iz $$6 = iz.a($$2, iz.a.b);
        is.a $$7 = $$1.k();
        for (int $$8 = 1; $$8 < $$5; ++$$8) {
            $$7.c($$6);
            eoh $$9 = $$0.a_($$7);
            if ($$4.test($$9)) {
                return Optional.of($$7.j());
            }
            if (!$$0.e($$7.v()) && $$3.test($$7, $$9)) continue;
            return Optional.empty();
        }
        return Optional.empty();
    }

    private static boolean a(dvt $$0, is $$1, eoh $$2) {
        if ($$2.l()) {
            return true;
        }
        if ($$2.s()) {
            return false;
        }
        if (!$$2.y().c()) {
            return false;
        }
        fug $$3 = $$2.g($$0, $$1);
        return !fud.c(ak, $$3, ftq.i);
    }

    static final class a
    extends Record {
        final is a;
        final fla b;
        final eoh c;

        a(is $$0, fla $$1, eoh $$2) {
            this.a = $$0;
            this.b = $$1;
            this.c = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "pos;fluid;sourceState", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "pos;fluid;sourceState", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "pos;fluid;sourceState", "a", "b", "c"}, this, $$0);
        }

        public is a() {
            return this.a;
        }

        public fla b() {
            return this.b;
        }

        public eoh c() {
            return this.c;
        }
    }
}

