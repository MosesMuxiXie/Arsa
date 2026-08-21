/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.JsonOps
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.annotations.VisibleForTesting;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class dqz
extends bbe<dra>
implements dqt {
    private static final Logger a = LogUtils.getLogger();
    private static final Map<amt<drb>, c> b = Map.of(drb.d, $$0 -> {
        Optional<Object> optional;
        if ($$0 instanceof drn) {
            drn $$1 = (drn)$$0;
            optional = $$1.k();
        } else {
            optional = Optional.empty();
        }
        return optional;
    }, drb.b, $$0 -> {
        Optional<Object> optional;
        if ($$0 instanceof drn) {
            drn $$1 = (drn)$$0;
            optional = Optional.of($$1.f());
        } else {
            optional = Optional.empty();
        }
        return optional;
    }, drb.c, $$0 -> {
        Optional<Object> optional;
        if ($$0 instanceof drn) {
            drn $$1 = (drn)$$0;
            optional = $$1.c();
        } else {
            optional = Optional.empty();
        }
        return optional;
    }, drb.e, dqz.b(drd.b), drb.f, dqz.b(drd.c), drb.g, dqz.b(drd.d), drb.h, dqz.b(drd.e));
    private static final amm c = amm.a(mj.bK);
    private final jf.a d;
    private dra e = dra.a;
    private Map<amt<drb>, drb> f = Map.of();
    private drf.b<drs> g = drf.b.a();
    private List<d> h = List.of();
    private Map<amt<dqs<?>>, List<d>> i = Map.of();

    public dqz(jf.a $$0) {
        this.d = $$0;
    }

    protected dra a(baz $$0, bzm $$12) {
        TreeMap<amo, dqs> $$22 = new TreeMap<amo, dqs>();
        bbd.a($$0, c, this.d.a(JsonOps.INSTANCE), dqs.a, $$22);
        ArrayList $$3 = new ArrayList($$22.size());
        $$22.forEach(($$1, $$2) -> {
            amt<dqs<?>> $$3 = amt.a(mj.bK, $$1);
            dqx<dqs> $$4 = new dqx<dqs>($$3, (dqs)$$2);
            $$3.add($$4);
        });
        return dra.a($$3);
    }

    @Override
    protected void a(dra $$0, baz $$1, bzm $$2) {
        this.e = $$0;
        a.info("Loaded {} recipes", (Object)$$0.a().size());
    }

    public void a(dgz $$02) {
        ArrayList $$12 = new ArrayList();
        List<b> $$2 = b.entrySet().stream().map($$0 -> new b((amt)$$0.getKey(), (c)$$0.getValue())).toList();
        this.e.a().forEach($$3 -> {
            Object $$4 = $$3.b();
            if (!$$4.ar_() && $$4.aq_().c()) {
                a.warn("Recipe {} can't be placed due to empty ingredients and will be ignored", (Object)$$3.a().a());
                return;
            }
            $$2.forEach($$1 -> $$1.a((dqs<?>)$$4));
            if ($$4 instanceof drs) {
                drs $$5 = (drs)$$4;
                dqx $$6 = $$3;
                if (dqz.a($$02, $$5.k()) && $$5.c().a($$02)) {
                    $$12.add(new drf.a($$5.k(), new drf($$5.c(), Optional.of($$6))));
                }
            }
        });
        this.f = $$2.stream().collect(Collectors.toUnmodifiableMap($$0 -> $$0.a, $$1 -> $$1.a($$02)));
        this.g = new drf.b($$12);
        this.h = dqz.a(this.e.a(), $$02);
        this.i = this.h.stream().collect(Collectors.groupingBy($$0 -> $$0.b.a(), IdentityHashMap::new, Collectors.toList()));
    }

    static List<dqo> a(dgz $$0, List<dqo> $$12) {
        $$12.removeIf($$1 -> !dqz.a($$0, $$1));
        return $$12;
    }

    private static boolean a(dgz $$0, dqo $$12) {
        return $$12.a().allMatch($$1 -> ((dlp)$$1.a()).a($$0));
    }

    public <I extends dqy, T extends dqs<I>> Optional<dqx<T>> a(drd<T> $$0, I $$1, dwo $$2, @Nullable amt<dqs<?>> $$3) {
        dqx<T> $$4 = $$3 != null ? this.a($$0, $$3) : null;
        return this.a($$0, $$1, $$2, $$4);
    }

    public <I extends dqy, T extends dqs<I>> Optional<dqx<T>> a(drd<T> $$0, I $$1, dwo $$2, @Nullable dqx<T> $$3) {
        if ($$3 != null && $$3.b().a($$1, $$2)) {
            return Optional.of($$3);
        }
        return this.a($$0, $$1, $$2);
    }

    public <I extends dqy, T extends dqs<I>> Optional<dqx<T>> a(drd<T> $$0, I $$1, dwo $$2) {
        return this.e.a($$0, $$1, $$2).findFirst();
    }

    public Optional<dqx<?>> b(amt<dqs<?>> $$0) {
        return Optional.ofNullable(this.e.a($$0));
    }

    private <T extends dqs<?>> @Nullable dqx<T> a(drd<T> $$0, amt<dqs<?>> $$1) {
        dqx<?> $$2 = this.e.a($$1);
        if ($$2 != null && $$2.b().b().equals($$0)) {
            return $$2;
        }
        return null;
    }

    public Map<amt<drb>, drb> b() {
        return this.f;
    }

    public drf.b<drs> c() {
        return this.g;
    }

    @Override
    public drb a(amt<drb> $$0) {
        return this.f.getOrDefault($$0, drb.j);
    }

    @Override
    public drf.b<drs> a() {
        return this.g;
    }

    public Collection<dqx<?>> d() {
        return this.e.a();
    }

    public @Nullable d a(dsa $$0) {
        int $$1 = $$0.a();
        return $$1 >= 0 && $$1 < this.h.size() ? this.h.get($$1) : null;
    }

    public void a(amt<dqs<?>> $$0, Consumer<drz> $$12) {
        List<d> $$2 = this.i.get($$0);
        if ($$2 != null) {
            $$2.forEach($$1 -> $$12.accept($$1.a));
        }
    }

    @VisibleForTesting
    protected static dqx<?> a(amt<dqs<?>> $$0, JsonObject $$1, jf.a $$2) {
        dqs $$3 = (dqs)dqs.a.parse($$2.a(JsonOps.INSTANCE), (Object)$$1).getOrThrow(JsonParseException::new);
        return new dqx<dqs>($$0, $$3);
    }

    public static <I extends dqy, T extends dqs<I>> a<I, T> a(final drd<T> $$0) {
        return new a<I, T>(){
            private @Nullable amt<dqs<?>> b;

            @Override
            public Optional<dqx<T>> a(I $$02, axf $$1) {
                dqz $$2 = $$1.x();
                Optional $$3 = $$2.a($$0, $$02, (dwo)$$1, this.b);
                if ($$3.isPresent()) {
                    dqx $$4 = $$3.get();
                    this.b = $$4.a();
                    return Optional.of($$4);
                }
                return Optional.empty();
            }
        };
    }

    private static List<d> a(Iterable<dqx<?>> $$0, dgz $$1) {
        ArrayList<d> $$2 = new ArrayList<d>();
        Object2IntOpenHashMap $$3 = new Object2IntOpenHashMap();
        for (dqx<?> $$4 : $$0) {
            Optional<List<dqo>> $$9;
            OptionalInt $$7;
            Object $$5 = $$4.b();
            if ($$5.j().isEmpty()) {
                OptionalInt $$6 = OptionalInt.empty();
            } else {
                $$7 = OptionalInt.of($$3.computeIfAbsent((Object)$$5.j(), arg_0 -> dqz.a((Object2IntMap)$$3, arg_0)));
            }
            if ($$5.ar_()) {
                Optional $$8 = Optional.empty();
            } else {
                $$9 = Optional.of($$5.aq_().b());
            }
            for (dry $$10 : $$5.g()) {
                if (!$$10.a($$1)) continue;
                int $$11 = $$2.size();
                dsa $$12 = new dsa($$11);
                drz $$13 = new drz($$12, $$10, $$7, $$5.h(), $$9);
                $$2.add(new d($$13, $$4));
            }
        }
        return $$2;
    }

    private static c b(drd<? extends drk> $$0) {
        return $$1 -> {
            Optional<Object> optional;
            if ($$1.b() == $$0 && $$1 instanceof drk) {
                drk $$2 = (drk)$$1;
                optional = Optional.of($$2.k());
            } else {
                optional = Optional.empty();
            }
            return optional;
        };
    }

    @Override
    protected /* synthetic */ Object b(baz baz2, bzm bzm2) {
        return this.a(baz2, bzm2);
    }

    private static /* synthetic */ int a(Object2IntMap $$0, Object $$1) {
        return $$0.size();
    }

    public static final class d
    extends Record {
        final drz a;
        final dqx<?> b;

        public d(drz $$0, dqx<?> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "display;parent", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "display;parent", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "display;parent", "a", "b"}, this, $$0);
        }

        public drz a() {
            return this.a;
        }

        public dqx<?> b() {
            return this.b;
        }
    }

    @FunctionalInterface
    public static interface c {
        public Optional<dqo> apply(dqs<?> var1);
    }

    public static class b
    implements Consumer<dqs<?>> {
        final amt<drb> a;
        private final c b;
        private final List<dqo> c = new ArrayList<dqo>();

        protected b(amt<drb> $$0, c $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        public void a(dqs<?> $$0) {
            this.b.apply($$0).ifPresent(this.c::add);
        }

        public drb a(dgz $$0) {
            return drb.a(dqz.a($$0, this.c));
        }

        @Override
        public /* synthetic */ void accept(Object object) {
            this.a((dqs)object);
        }
    }

    public static interface a<I extends dqy, T extends dqs<I>> {
        public Optional<dqx<T>> a(I var1, axf var2);
    }
}

