/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.mojang.datafixers.util.Either
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.gson.JsonElement;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.io.BufferedReader;
import java.io.Reader;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class beg<T> {
    private static final Logger a = LogUtils.getLogger();
    final a<T> b;
    private final String c;

    public beg(a<T> $$0, String $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public Map<amo, List<b>> a(baz $$02) {
        HashMap<amo, List<b>> $$1 = new HashMap<amo, List<b>>();
        amm $$22 = amm.a(this.c);
        for (Map.Entry<amo, List<bax>> $$3 : $$22.b($$02).entrySet()) {
            amo $$4 = $$3.getKey();
            amo $$5 = $$22.b($$4);
            for (bax $$6 : $$3.getValue()) {
                try {
                    BufferedReader $$7 = $$6.e();
                    try {
                        JsonElement $$8 = bhf.a($$7);
                        List $$9 = $$1.computeIfAbsent($$5, $$0 -> new ArrayList());
                        bee $$10 = (bee)bee.a.parse(new Dynamic((DynamicOps)JsonOps.INSTANCE, (Object)$$8)).getOrThrow();
                        if ($$10.b()) {
                            $$9.clear();
                        }
                        String $$11 = $$6.b();
                        $$10.a().forEach($$2 -> $$9.add(new b((bed)$$2, $$11)));
                    }
                    finally {
                        if ($$7 == null) continue;
                        ((Reader)$$7).close();
                    }
                }
                catch (Exception $$12) {
                    a.error("Couldn't read tag list {} from {} in data pack {}", new Object[]{$$5, $$4, $$6.b(), $$12});
                }
            }
        }
        return $$1;
    }

    private Either<List<b>, List<T>> a(bed.a<T> $$0, List<b> $$1) {
        LinkedHashSet $$2 = new LinkedHashSet();
        ArrayList<b> $$3 = new ArrayList<b>();
        for (b $$4 : $$1) {
            if ($$4.a().a($$0, $$2::add)) continue;
            $$3.add($$4);
        }
        return $$3.isEmpty() ? Either.right(List.copyOf($$2)) : Either.left($$3);
    }

    public Map<amo, List<T>> a(Map<amo, List<b>> $$0) {
        final HashMap $$12 = new HashMap();
        bed.a $$23 = new bed.a<T>(){

            @Override
            public @Nullable T a(amo $$0, boolean $$1) {
                return beg.this.b.get($$0, $$1).orElse(null);
            }

            @Override
            public @Nullable Collection<T> a(amo $$0) {
                return (Collection)$$12.get($$0);
            }
        };
        bfg<amo, d> $$32 = new bfg<amo, d>();
        $$0.forEach(($$1, $$2) -> $$32.a((amo)$$1, new d((List<b>)$$2)));
        $$32.a((K $$22, V $$3) -> this.a($$23, $$3.a).ifLeft($$1 -> a.error("Couldn't load tag {} as it is missing following references: {}", $$22, (Object)$$1.stream().map(Objects::toString).collect(Collectors.joining(", ")))).ifRight($$2 -> $$12.put((amo)$$22, (List)$$2)));
        return $$12;
    }

    public static <T> void a(beh.a $$0, jz<T> $$1) {
        $$0.a($$1).b.forEach($$1::a);
    }

    public static List<jq.a<?>> a(baz $$0, jr $$12) {
        return $$12.a().map($$1 -> beg.a($$0, $$1.b())).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
    }

    public static <T> void a(baz $$0, jz<T> $$1) {
        amt $$22 = $$1.g();
        beg<jd<T>> $$32 = new beg<jd<T>>(beg$a.a($$1), mj.d($$22));
        $$32.a($$32.a($$0)).forEach(($$2, $$3) -> $$1.a(bef.a($$22, $$2), (List)$$3));
    }

    private static <T> Map<bef<T>, List<jd<T>>> a(amt<? extends jq<T>> $$0, Map<amo, List<jd<T>>> $$12) {
        return $$12.entrySet().stream().collect(Collectors.toUnmodifiableMap($$1 -> bef.a($$0, (amo)$$1.getKey()), Map.Entry::getValue));
    }

    private static <T> Optional<jq.a<T>> a(baz $$0, jq<T> $$1) {
        amt<jq<T>> $$2 = $$1.g();
        beg<jd<T>> $$3 = new beg<jd<T>>(beg$a.a($$1), mj.d($$2));
        c<T> $$4 = new c<T>($$2, beg.a($$1.g(), $$3.a($$3.a($$0))));
        return $$4.b().isEmpty() ? Optional.empty() : Optional.of($$1.a($$4));
    }

    public static List<jf.b<?>> a(jr.b $$0, List<jq.a<?>> $$1) {
        ArrayList $$22 = new ArrayList();
        $$0.a().forEach($$2 -> {
            jq.a $$3 = beg.a($$1, $$2.a());
            $$22.add($$3 != null ? $$3.c() : $$2.b());
        });
        return $$22;
    }

    private static @Nullable jq.a<?> a(List<jq.a<?>> $$0, amt<? extends jq<?>> $$1) {
        for (jq.a<?> $$2 : $$0) {
            if ($$2.a() != $$1) continue;
            return $$2;
        }
        return null;
    }

    public static interface a<T> {
        public Optional<? extends T> get(amo var1, boolean var2);

        public static <T> a<? extends jd<T>> a(jq<T> $$0) {
            return ($$1, $$2) -> $$0.c($$1);
        }

        public static <T> a<jd<T>> a(jz<T> $$0) {
            je $$1 = $$0.p();
            return ($$2, $$3) -> ($$3 ? $$1 : $$0).a(amt.a($$0.g(), $$2));
        }
    }

    public static final class b
    extends Record {
        final bed a;
        private final String b;

        public b(bed $$0, String $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public String toString() {
            return String.valueOf(this.a) + " (from " + this.b + ")";
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "entry;source", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "entry;source", "a", "b"}, this, $$0);
        }

        public bed a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }
    }

    public static final class c<T>
    extends Record {
        private final amt<? extends jq<T>> a;
        final Map<bef<T>, List<jd<T>>> b;

        public c(amt<? extends jq<T>> $$0, Map<bef<T>, List<jd<T>>> $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "key;tags", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "key;tags", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "key;tags", "a", "b"}, this, $$0);
        }

        public amt<? extends jq<T>> a() {
            return this.a;
        }

        public Map<bef<T>, List<jd<T>>> b() {
            return this.b;
        }
    }

    static final class d
    extends Record
    implements bfg.a<amo> {
        final List<b> a;

        d(List<b> $$0) {
            this.a = $$0;
        }

        @Override
        public void a(Consumer<amo> $$0) {
            this.a.forEach($$1 -> $$1.a.a($$0));
        }

        @Override
        public void b(Consumer<amo> $$0) {
            this.a.forEach($$1 -> $$1.a.b($$0));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "entries", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "entries", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "entries", "a"}, this, $$0);
        }

        public List<b> a() {
            return this.a;
        }
    }
}

