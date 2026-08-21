/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public abstract class eoj<O, S> {
    public static final String b = "Name";
    public static final String c = "Properties";
    private static final Function<Map.Entry<epk<?>, Comparable<?>>, String> a = new Function<Map.Entry<epk<?>, Comparable<?>>, String>(){

        public String a(@Nullable Map.Entry<epk<?>, Comparable<?>> $$0) {
            if ($$0 == null) {
                return "<NULL>";
            }
            epk<?> $$1 = $$0.getKey();
            return $$1.f() + "=" + this.a($$1, $$0.getValue());
        }

        private <T extends Comparable<T>> String a(epk<T> $$0, Comparable<?> $$1) {
            return $$0.b($$1);
        }

        @Override
        public /* synthetic */ Object apply(@Nullable Object object) {
            return this.a((Map.Entry)object);
        }
    };
    protected final O d;
    private final Reference2ObjectArrayMap<epk<?>, Comparable<?>> f;
    private Map<epk<?>, S[]> g;
    protected final MapCodec<S> e;

    protected eoj(O $$0, Reference2ObjectArrayMap<epk<?>, Comparable<?>> $$1, MapCodec<S> $$2) {
        this.d = $$0;
        this.f = $$1;
        this.e = $$2;
    }

    public <T extends Comparable<T>> S a(epk<T> $$0) {
        return this.b($$0, (Comparable)eoj.a($$0.a(), this.c($$0)));
    }

    protected static <T> T a(List<T> $$0, T $$1) {
        int $$2 = $$0.indexOf($$1) + 1;
        return $$2 == $$0.size() ? $$0.getFirst() : $$0.get($$2);
    }

    public String toString() {
        StringBuilder $$0 = new StringBuilder();
        $$0.append(this.d);
        if (!this.G().isEmpty()) {
            $$0.append('[');
            $$0.append(this.G().entrySet().stream().map(a).collect(Collectors.joining(",")));
            $$0.append(']');
        }
        return $$0.toString();
    }

    public final boolean equals(Object $$0) {
        return super.equals($$0);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public Collection<epk<?>> F() {
        return Collections.unmodifiableCollection(this.f.keySet());
    }

    public boolean b(epk<?> $$0) {
        return this.f.containsKey($$0);
    }

    public <T extends Comparable<T>> T c(epk<T> $$0) {
        Comparable $$1 = (Comparable)this.f.get($$0);
        if ($$1 == null) {
            throw new IllegalArgumentException("Cannot get property " + String.valueOf($$0) + " as it does not exist in " + String.valueOf(this.d));
        }
        return (T)((Comparable)$$0.g().cast($$1));
    }

    public <T extends Comparable<T>> Optional<T> d(epk<T> $$0) {
        return Optional.ofNullable(this.e($$0));
    }

    public <T extends Comparable<T>> T a(epk<T> $$0, T $$1) {
        return (T)((Comparable)Objects.requireNonNullElse(this.e($$0), $$1));
    }

    private <T extends Comparable<T>> @Nullable T e(epk<T> $$0) {
        Comparable $$1 = (Comparable)this.f.get($$0);
        if ($$1 == null) {
            return null;
        }
        return (T)((Comparable)$$0.g().cast($$1));
    }

    public <T extends Comparable<T>, V extends T> S b(epk<T> $$0, V $$1) {
        Comparable $$2 = (Comparable)this.f.get($$0);
        if ($$2 == null) {
            throw new IllegalArgumentException("Cannot set property " + String.valueOf($$0) + " as it does not exist in " + String.valueOf(this.d));
        }
        return this.a($$0, $$1, $$2);
    }

    public <T extends Comparable<T>, V extends T> S c(epk<T> $$0, V $$1) {
        Comparable $$2 = (Comparable)this.f.get($$0);
        if ($$2 == null) {
            return (S)this;
        }
        return this.a($$0, $$1, $$2);
    }

    private <T extends Comparable<T>, V extends T> S a(epk<T> $$0, V $$1, Comparable<?> $$2) {
        if ($$2.equals($$1)) {
            return (S)this;
        }
        int $$3 = $$0.a($$1);
        if ($$3 < 0) {
            throw new IllegalArgumentException("Cannot set property " + String.valueOf($$0) + " to " + String.valueOf($$1) + " on " + String.valueOf(this.d) + ", it is not an allowed value");
        }
        return this.g.get($$0)[$$3];
    }

    public void a(Map<Map<epk<?>, Comparable<?>>, S> $$0) {
        if (this.g != null) {
            throw new IllegalStateException();
        }
        Reference2ObjectArrayMap $$1 = new Reference2ObjectArrayMap(this.f.size());
        for (Map.Entry $$22 : this.f.entrySet()) {
            epk $$3 = (epk)$$22.getKey();
            $$1.put($$3, $$3.a().stream().map($$2 -> $$0.get(this.d($$3, (Comparable<?>)$$2))).toArray());
        }
        this.g = $$1;
    }

    private Map<epk<?>, Comparable<?>> d(epk<?> $$0, Comparable<?> $$1) {
        Reference2ObjectArrayMap $$2 = new Reference2ObjectArrayMap(this.f);
        $$2.put($$0, $$1);
        return $$2;
    }

    public Map<epk<?>, Comparable<?>> G() {
        return this.f;
    }

    protected static <O, S extends eoj<O, S>> Codec<S> a(Codec<O> $$02, Function<O, S> $$1) {
        return $$02.dispatch(b, $$0 -> $$0.d, $$12 -> {
            eoj $$2 = (eoj)$$1.apply($$12);
            if ($$2.G().isEmpty()) {
                return MapCodec.unit((Object)$$2);
            }
            return $$2.e.codec().lenientOptionalFieldOf(c).xmap($$1 -> $$1.orElse($$2), Optional::of);
        });
    }
}

