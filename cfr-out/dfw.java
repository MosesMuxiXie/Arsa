/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;
import java.util.stream.Stream;

public class dfw {
    public static final String a = "variant";

    public static <T> jd<T> a(jr $$0, amt<T> $$1) {
        jq<T> $$2 = $$0.f($$1.c());
        return (jd)$$2.a($$1).or($$2::a).orElseThrow();
    }

    public static <T> jd<T> b(jr $$0, amt<? extends jq<T>> $$1) {
        return $$0.f($$1).a().orElseThrow();
    }

    public static <T> void a(fns $$0, jd<T> $$12) {
        $$12.e().ifPresent($$1 -> $$0.a(a, amo.a, $$1.a()));
    }

    public static <T> Optional<jd<T>> a(fnq $$0, amt<? extends jq<T>> $$12) {
        return $$0.a(a, amo.a).map($$1 -> amt.a($$12, $$1)).flatMap($$0.a()::c);
    }

    public static <T extends dfq<dft, ?>> Optional<jd.c<T>> a(dft $$0, amt<jq<T>> $$1) {
        dxf $$2 = $$0.b();
        Stream $$3 = $$2.J_().f($$1).c();
        return dfq.a($$3, jd::a, $$2.G_(), $$0);
    }
}

