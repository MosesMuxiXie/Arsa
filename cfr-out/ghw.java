/*
 * Decompiled with CFR 0.152.
 */
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;

public class ghw {
    public static ihj.b a(amo $$0) {
        return new ihd.a($$0, List.of());
    }

    public static ihj.b a(amo $$0, ggz ... $$1) {
        return new ihd.a($$0, List.of($$1));
    }

    public static ggz a(int $$0) {
        return new ggu($$0);
    }

    public static ihj.b a(ihj.b ... $$0) {
        return new ihg.a(List.of($$0));
    }

    public static ihj.b a(amo $$0, iki.b $$1) {
        return new ihr.a($$0, $$1);
    }

    public static ihp.a a(ihj.b $$0, float $$1) {
        return new ihp.a($$1, $$0);
    }

    public static ihj.b a(iiv $$0, ihj.b $$1, ihp.a ... $$2) {
        return new ihp.b($$0, 1.0f, List.of($$2), Optional.of($$1));
    }

    public static ihj.b a(iiv $$0, float $$1, ihj.b $$2, ihp.a ... $$3) {
        return new ihp.b($$0, $$1, List.of($$3), Optional.of($$2));
    }

    public static ihj.b a(iiv $$0, ihj.b $$1, List<ihp.a> $$2) {
        return new ihp.b($$0, 1.0f, $$2, Optional.of($$1));
    }

    public static ihj.b a(iiv $$0, List<ihp.a> $$1) {
        return new ihp.b($$0, 1.0f, $$1, Optional.empty());
    }

    public static ihj.b a(iiv $$0, float $$1, List<ihp.a> $$2) {
        return new ihp.b($$0, $$1, $$2, Optional.empty());
    }

    public static ihj.b a(ihy $$0, ihj.b $$1, ihj.b $$2) {
        return new ihh.a($$0, $$1, $$2);
    }

    public static <T> ihq.b<T> a(T $$0, ihj.b $$1) {
        return new ihq.b<T>(List.of($$0), $$1);
    }

    public static <T> ihq.b<T> a(List<T> $$0, ihj.b $$1) {
        return new ihq.b<T>($$0, $$1);
    }

    @SafeVarargs
    public static <T> ihj.b a(ijl<T> $$0, ihj.b $$1, ihq.b<T> ... $$2) {
        return ghw.a($$0, $$1, List.of($$2));
    }

    public static <T> ihj.b a(ijl<T> $$0, ihj.b $$1, List<ihq.b<T>> $$2) {
        return new ihq.c(new ihq.d<ijl<T>, T>($$0, $$2), Optional.of($$1));
    }

    @SafeVarargs
    public static <T> ihj.b a(ijl<T> $$0, ihq.b<T> ... $$1) {
        return ghw.a($$0, List.of($$1));
    }

    public static <T> ihj.b a(ijl<T> $$0, List<ihq.b<T>> $$1) {
        return new ihq.c(new ihq.d<ijl<T>, T>($$0, $$1), Optional.empty());
    }

    public static ihy a() {
        return new iih();
    }

    public static ihy a(kh<?> $$0) {
        return new iid($$0, false);
    }

    public static ihj.b a(ihj.b $$0, ihj.b $$1) {
        return ghw.a(new ijd(), $$1, ghw.a(dwo.h, $$0));
    }

    public static <T extends Comparable<T>> ihj.b a(epk<T> $$0, ihj.b $$12, Map<T, ihj.b> $$2) {
        List<ihq.b<T>> $$3 = $$2.entrySet().stream().sorted(Map.Entry.comparingByKey()).map($$1 -> {
            String $$2 = $$0.b((Comparable)$$1.getKey());
            return new ihq.b<String>(List.of($$2), (ihj.b)$$1.getValue());
        }).toList();
        return ghw.a(new ijh($$0.f()), $$12, $$3);
    }

    public static ihj.b b(ihj.b $$0, ihj.b $$1) {
        DateTimeFormatter $$2 = DateTimeFormatter.ofPattern("MM-dd", Locale.ROOT);
        List<String> $$3 = bhd.b.stream().map($$2::format).toList();
        return ghw.a(iji.a("MM-dd", "", Optional.empty()), $$1, List.of(ghw.a($$3, $$0)));
    }
}

