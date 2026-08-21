/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSortedMap
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Decoder
 *  com.mojang.serialization.Encoder
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.MapDecoder
 *  com.mojang.serialization.MapEncoder
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapDecoder;
import com.mojang.serialization.MapEncoder;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class eoi<O, S extends eoj<O, S>> {
    static final Pattern a = Pattern.compile("^[a-z0-9_]+$");
    private final O b;
    private final ImmutableSortedMap<String, epk<?>> c;
    private final ImmutableList<S> d;

    protected eoi(Function<O, S> $$0, O $$12, b<O, S> $$2, Map<String, epk<?>> $$3) {
        this.b = $$12;
        this.c = ImmutableSortedMap.copyOf($$3);
        Supplier<eoj> $$4 = () -> (eoj)$$0.apply($$12);
        MapCodec<eoj> $$52 = MapCodec.of((MapEncoder)Encoder.empty(), (MapDecoder)Decoder.unit($$4));
        for (Map.Entry $$6 : this.c.entrySet()) {
            $$52 = eoi.a($$52, $$4, (String)$$6.getKey(), (epk)$$6.getValue());
        }
        MapCodec<eoj> $$7 = $$52;
        LinkedHashMap $$8 = Maps.newLinkedHashMap();
        ArrayList $$9 = Lists.newArrayList();
        Stream<List<List<Object>>> $$10 = Stream.of(Collections.emptyList());
        for (epk $$11 : this.c.values()) {
            $$10 = $$10.flatMap($$1 -> $$11.a().stream().map($$2 -> {
                ArrayList $$3 = Lists.newArrayList((Iterable)$$1);
                $$3.add(Pair.of((Object)$$11, (Object)$$2));
                return $$3;
            }));
        }
        $$10.forEach($$5 -> {
            Reference2ObjectArrayMap $$6 = new Reference2ObjectArrayMap($$5.size());
            for (Pair $$7 : $$5) {
                $$6.put((Object)((epk)$$7.getFirst()), (Object)((Comparable)$$7.getSecond()));
            }
            eoj $$8 = (eoj)$$2.create($$12, $$6, $$7);
            $$8.put($$6, $$8);
            $$9.add($$8);
        });
        for (eoj $$122 : $$9) {
            $$122.a($$8);
        }
        this.d = ImmutableList.copyOf((Collection)$$9);
    }

    private static <S extends eoj<?, S>, T extends Comparable<T>> MapCodec<S> a(MapCodec<S> $$02, Supplier<S> $$12, String $$2, epk<T> $$3) {
        return Codec.mapPair($$02, (MapCodec)$$3.e().fieldOf($$2).orElseGet($$0 -> {}, () -> $$3.a((eoj)$$12.get()))).xmap($$1 -> (eoj)((eoj)$$1.getFirst()).b($$3, ((epk.a)$$1.getSecond()).b()), $$1 -> Pair.of((Object)$$1, $$3.a((eoj<?, ?>)$$1)));
    }

    public ImmutableList<S> a() {
        return this.d;
    }

    public S b() {
        return (S)((eoj)this.d.get(0));
    }

    public O c() {
        return this.b;
    }

    public Collection<epk<?>> d() {
        return this.c.values();
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("block", this.b).add("properties", this.c.values().stream().map(epk::f).collect(Collectors.toList())).toString();
    }

    public @Nullable epk<?> a(String $$0) {
        return (epk)this.c.get((Object)$$0);
    }

    public static interface b<O, S> {
        public S create(O var1, Reference2ObjectArrayMap<epk<?>, Comparable<?>> var2, MapCodec<S> var3);
    }

    public static class a<O, S extends eoj<O, S>> {
        private final O a;
        private final Map<String, epk<?>> b = Maps.newHashMap();

        public a(O $$0) {
            this.a = $$0;
        }

        public a<O, S> a(epk<?> ... $$0) {
            for (epk<?> $$1 : $$0) {
                this.a((epk<T>)$$1);
                this.b.put($$1.f(), $$1);
            }
            return this;
        }

        private <T extends Comparable<T>> void a(epk<T> $$0) {
            String $$1 = $$0.f();
            if (!a.matcher($$1).matches()) {
                throw new IllegalArgumentException(String.valueOf(this.a) + " has invalidly named property: " + $$1);
            }
            List<T> $$2 = $$0.a();
            if ($$2.size() <= 1) {
                throw new IllegalArgumentException(String.valueOf(this.a) + " attempted use property " + $$1 + " with <= 1 possible values");
            }
            for (Comparable $$3 : $$2) {
                String $$4 = $$0.b($$3);
                if (a.matcher($$4).matches()) continue;
                throw new IllegalArgumentException(String.valueOf(this.a) + " has property: " + $$1 + " with invalidly named value: " + $$4);
            }
            if (this.b.containsKey($$1)) {
                throw new IllegalArgumentException(String.valueOf(this.a) + " has duplicate property: " + $$1);
            }
        }

        public eoi<O, S> a(Function<O, S> $$0, b<O, S> $$1) {
            return new eoi<O, S>($$0, this.a, $$1, this.b);
        }
    }
}

