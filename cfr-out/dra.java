/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.ImmutableMultimap
 *  com.google.common.collect.ImmutableMultimap$Builder
 *  com.google.common.collect.Multimap
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class dra {
    public static final dra a = new dra((Multimap<drd<?>, dqx<?>>)ImmutableMultimap.of(), Map.of());
    private final Multimap<drd<?>, dqx<?>> b;
    private final Map<amt<dqs<?>>, dqx<?>> c;

    private dra(Multimap<drd<?>, dqx<?>> $$0, Map<amt<dqs<?>>, dqx<?>> $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public static dra a(Iterable<dqx<?>> $$0) {
        ImmutableMultimap.Builder $$1 = ImmutableMultimap.builder();
        ImmutableMap.Builder $$2 = ImmutableMap.builder();
        for (dqx<?> $$3 : $$0) {
            $$1.put($$3.b().b(), $$3);
            $$2.put($$3.a(), $$3);
        }
        return new dra((Multimap<drd<?>, dqx<?>>)$$1.build(), (Map<amt<dqs<?>>, dqx<?>>)$$2.build());
    }

    public <I extends dqy, T extends dqs<I>> Collection<dqx<T>> a(drd<T> $$0) {
        return this.b.get($$0);
    }

    public Collection<dqx<?>> a() {
        return this.c.values();
    }

    public @Nullable dqx<?> a(amt<dqs<?>> $$0) {
        return this.c.get($$0);
    }

    public <I extends dqy, T extends dqs<I>> Stream<dqx<T>> a(drd<T> $$0, I $$1, dwo $$22) {
        if ($$1.b()) {
            return Stream.empty();
        }
        return this.a($$0).stream().filter($$2 -> $$2.b().a((dqy)$$1, $$22));
    }
}

