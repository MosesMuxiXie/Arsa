/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Stream;

@FunctionalInterface
public interface ipw<T> {
    public static <T> ipw<T> empty() {
        return $$0 -> List.of();
    }

    public static <T> ipw<T> plainText(List<T> $$0, Function<T, Stream<String>> $$1) {
        if ($$0.isEmpty()) {
            return ipw.empty();
        }
        ipx $$22 = new ipx();
        for (Object $$3 : $$0) {
            $$1.apply($$3).forEach($$2 -> $$22.a($$3, $$2.toLowerCase(Locale.ROOT)));
        }
        $$22.a();
        return $$22::a;
    }

    public List<T> search(String var1);
}

