/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 */
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class ghp {
    private final ImmutableMap.Builder<String, hqv.b> a = ImmutableMap.builder();

    private <T extends Comparable<T>> void a(epk<T> $$0, hqv.b $$1) {
        this.a.put((Object)$$0.f(), (Object)$$1);
    }

    public final <T extends Comparable<T>> ghp a(epk<T> $$0, T $$1) {
        this.a($$0, new hqv.b(List.of(new hqv.a($$0.b($$1), false))));
        return this;
    }

    @SafeVarargs
    public final <T extends Comparable<T>> ghp a(epk<T> $$02, T $$1, T ... $$2) {
        List<hqv.a> $$3 = Stream.concat(Stream.of($$1), Stream.of($$2)).map($$02::b).sorted().distinct().map($$0 -> new hqv.a((String)$$0, false)).toList();
        this.a($$02, new hqv.b($$3));
        return this;
    }

    public final <T extends Comparable<T>> ghp b(epk<T> $$0, T $$1) {
        this.a($$0, new hqv.b(List.of(new hqv.a($$0.b($$1), true))));
        return this;
    }

    public hqu a() {
        return new hqv((Map<String, hqv.b>)this.a.buildOrThrow());
    }
}

