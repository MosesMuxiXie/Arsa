/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import java.util.function.Function;

public interface egz {
    public static final int d = 1;
    public static final int e = 4;
    public static final eph f = eox.V;

    default public Function<eoh, fug> a(epf<iz> $$0, eph $$1) {
        Map<iz, fug> $$2 = fud.c(dzq.a(0.0, 0.0, 0.0, 8.0, this.b(), 8.0));
        return $$3 -> {
            fug $$4 = fud.a();
            iz $$5 = (iz)$$3.c($$0);
            int $$6 = $$3.c($$1);
            for (int $$7 = 0; $$7 < $$6; ++$$7) {
                $$4 = fud.a($$4, (fug)$$2.get($$5));
                $$5 = $$5.i();
            }
            return $$4.b();
        };
    }

    default public eph c() {
        return f;
    }

    default public double b() {
        return 1.0;
    }

    default public boolean a(eoh $$0, dpu $$1, eph $$2) {
        return !$$1.h() && $$1.n().a($$0.b().h()) && $$0.c($$2) < 4;
    }

    default public eoh a(dpu $$0, dzq $$1, eph $$2, epf<iz> $$3) {
        eoh $$4 = $$0.q().a_($$0.a());
        if ($$4.a($$1)) {
            return (eoh)$$4.b($$2, Math.min(4, $$4.c($$2) + 1));
        }
        return (eoh)$$1.m().b($$3, $$0.g().g());
    }
}

