/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Streams
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Streams;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class su {
    private static final int b = 50;
    public static final a a = ($$0, $$1) -> Stream.of(new ta($$0, egm.a, $$1, tq.a()));

    public static List<st> a(Collection<jd.c<tb>> $$02, a $$1, axf $$22) {
        Map<jd, List<ta>> $$3 = $$02.stream().flatMap($$2 -> $$1.decorate((jd.c<tb>)$$2, $$22)).collect(Collectors.groupingBy($$0 -> $$0.v().d()));
        return $$3.entrySet().stream().flatMap($$0 -> {
            jd $$12 = (jd)$$0.getKey();
            List $$22 = (List)$$0.getValue();
            return Streams.mapWithIndex(Lists.partition((List)$$22, (int)50).stream(), ($$1, $$2) -> su.a($$1, $$12, (int)$$2));
        }).toList();
    }

    public static tf.b a() {
        return su.a(50);
    }

    public static tf.b a(int $$0) {
        return $$1 -> {
            Map<jd, List<ta>> $$2 = $$1.stream().filter(Objects::nonNull).collect(Collectors.groupingBy($$0 -> $$0.v().d()));
            return $$2.entrySet().stream().flatMap($$12 -> {
                jd $$22 = (jd)$$12.getKey();
                List $$3 = (List)$$12.getValue();
                return Streams.mapWithIndex(Lists.partition((List)$$3, (int)$$0).stream(), ($$1, $$2) -> su.a(List.copyOf($$1), $$22, (int)$$2));
            }).toList();
        };
    }

    public static st a(Collection<ta> $$0, jd<tv> $$1, int $$2) {
        return new st($$2, $$0, $$1);
    }

    @FunctionalInterface
    public static interface a {
        public Stream<ta> decorate(jd.c<tb> var1, axf var2);
    }
}

