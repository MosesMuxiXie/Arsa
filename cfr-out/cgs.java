/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicates
 */
import com.google.common.base.Predicates;
import java.util.function.Predicate;

public final class cgs {
    public static final Predicate<cgk> a = cgk::cb;
    public static final Predicate<cgk> b = $$0 -> $$0.cb() && $$0 instanceof chl;
    public static final Predicate<cgk> c = $$0 -> $$0.cb() && !$$0.cr() && !$$0.cq();
    public static final Predicate<cgk> d = $$0 -> $$0 instanceof ccv && $$0.cb();
    public static final Predicate<cgk> e = $$0 -> {
        if (!($$0 instanceof ddm)) return true;
        ddm $$1 = (ddm)$$0;
        if ($$0.au()) return false;
        if ($$1.ha()) return false;
        return true;
    };
    public static final Predicate<cgk> f = $$0 -> !$$0.au();
    public static final Predicate<cgk> g = f.and($$0 -> $$0.j((cgk)null));
    public static final Predicate<cgk> h = f.and(cgk::bX);

    private cgs() {
    }

    public static Predicate<cgk> a(double $$0, double $$1, double $$2, double $$3) {
        double $$42 = $$3 * $$3;
        return $$4 -> $$4.h($$0, $$1, $$2) <= $$42;
    }

    public static Predicate<cgk> a(cgk $$0) {
        fut.a $$2;
        fum $$1 = $$0.cI();
        fut.a a2 = $$2 = $$1 == null ? fut.a.a : ((fut)$$1).m();
        if ($$2 == fut.a.b) {
            return Predicates.alwaysFalse();
        }
        return f.and($$3 -> {
            boolean $$7;
            fut.a $$6;
            ddm $$4;
            if (!$$3.bY()) {
                return false;
            }
            if (!(!$$0.ao().B_() || $$3 instanceof ddm && ($$4 = (ddm)$$3).gH())) {
                return false;
            }
            fum $$5 = $$3.cI();
            fut.a a2 = $$6 = $$5 == null ? fut.a.a : ((fut)$$5).m();
            if ($$6 == fut.a.b) {
                return false;
            }
            boolean bl2 = $$7 = $$1 != null && $$1.a($$5);
            if (($$2 == fut.a.d || $$6 == fut.a.d) && $$7) {
                return false;
            }
            return $$2 != fut.a.c && $$6 != fut.a.c || $$7;
        });
    }

    public static Predicate<cgk> b(cgk $$0) {
        return $$1 -> {
            while ($$1.cq()) {
                if (($$1 = $$1.dz()) != $$0) continue;
                return false;
            }
            return true;
        };
    }
}

