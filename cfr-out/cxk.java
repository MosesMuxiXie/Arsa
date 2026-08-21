/*
 * Decompiled with CFR 0.152.
 */
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class cxk {
    private static final b a = new b(cxk.a(cxk.a().a(cxk.b(dkr.p), 5).a(cxk.b(dkr.h), 5).a(cxk.b(dkr.i), 5).a(cxk.b(dkr.m), 3).a(cxk.a(dkr.a), 82).a()));
    private static final b b = new b(cxk.a(cxk.a().a(cxk.b(dkr.h), 5).a(cxk.b(dkr.i), 5).a(cxk.b(dkr.a), 5).a(cxk.b(dkr.p), 3).a(cxk.a(dkr.m), 82).a()));
    private static final b c = new b(cxk.a(cxk.a().a(cxk.b(dkr.i), 5).a(cxk.b(dkr.h), 5).a(cxk.b(dkr.a), 5).a(cxk.b(dkr.m), 3).a(cxk.a(dkr.p), 82).a()));

    private static a a(dkr $$0) {
        return cxk.a(cxk.a().a(cxk.b($$0), 499).a(cxk.b(dkr.g), 1).a());
    }

    public static dkr a(jd<dxo> $$0, bgr $$1) {
        b $$2 = cxk.a($$0);
        return $$2.a().get($$1);
    }

    private static b a(jd<dxo> $$0) {
        if ($$0.a(bdo.ag)) {
            return b;
        }
        if ($$0.a(bdo.af)) {
            return c;
        }
        return a;
    }

    private static a a(cbn<a> $$0) {
        if ($$0.c()) {
            throw new IllegalArgumentException("List must be non-empty");
        }
        return $$1 -> ((a)$$0.b($$1)).get($$1);
    }

    private static a b(dkr $$0) {
        return $$1 -> $$0;
    }

    private static cbn.a<a> a() {
        return cbn.b();
    }

    @FunctionalInterface
    static interface a {
        public dkr get(bgr var1);
    }

    record b(a a) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "colors", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "colors", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "colors", "a"}, this, $$0);
        }
    }
}

