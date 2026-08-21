/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.slf4j.Logger
 */
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.slf4j.Logger;

public final class hqf
extends Record {
    private final Optional<b> b;
    private final Optional<a> c;
    static final Logger d = LogUtils.getLogger();
    public static final Codec<hqf> a = RecordCodecBuilder.create($$0 -> $$0.group((App)hqf$b.a.optionalFieldOf("variants").forGetter(hqf::a), (App)hqf$a.a.optionalFieldOf("multipart").forGetter(hqf::b)).apply((Applicative)$$0, hqf::new)).validate($$0 -> {
        if ($$0.a().isEmpty() && $$0.b().isEmpty()) {
            return DataResult.error(() -> "Neither 'variants' nor 'multipart' found");
        }
        return DataResult.success((Object)$$0);
    });

    public hqf(Optional<b> $$0, Optional<a> $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public Map<eoh, hqh.c> a(eoi<dzq, eoh> $$0, Supplier<String> $$1) {
        IdentityHashMap<eoh, hqh.c> $$22 = new IdentityHashMap<eoh, hqh.c>();
        this.b.ifPresent($$3 -> $$3.a($$0, $$1, ($$1, $$2) -> {
            Object $$3 = $$22.put((eoh)$$1, (hqh.c)$$2);
            if ($$3 != null) {
                throw new IllegalArgumentException("Overlapping definition on state: " + String.valueOf($$1));
            }
        }));
        this.c.ifPresent($$2 -> {
            ImmutableList $$3 = $$0.a();
            hqw.c $$4 = $$2.a($$0);
            for (eoh $$5 : $$3) {
                $$22.putIfAbsent($$5, $$4);
            }
        });
        return $$22;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{hqf.class, "simpleModels;multiPart", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{hqf.class, "simpleModels;multiPart", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{hqf.class, "simpleModels;multiPart", "b", "c"}, this, $$0);
    }

    public Optional<b> a() {
        return this.b;
    }

    public Optional<a> b() {
        return this.c;
    }

    public static final class a
    extends Record {
        private final List<hqx> b;
        public static final Codec<a> a = bfm.b(hqx.a.listOf()).xmap(a::new, a::a);

        public a(List<hqx> $$0) {
            this.b = $$0;
        }

        public hqw.c a(eoi<dzq, eoh> $$0) {
            ImmutableList.Builder $$1 = ImmutableList.builderWithExpectedSize((int)this.b.size());
            for (hqx $$2 : this.b) {
                $$1.add(new hqw.a<hqh.b>($$2.a($$0), $$2.b()));
            }
            return new hqw.c((List<hqw.a<hqh.b>>)$$1.build());
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "selectors", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "selectors", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "selectors", "b"}, this, $$0);
        }

        public List<hqx> a() {
            return this.b;
        }
    }

    public static final class b
    extends Record {
        private final Map<String, hqh.b> b;
        public static final Codec<b> a = bfm.d(Codec.unboundedMap((Codec)Codec.STRING, hqh.b.c)).xmap(b::new, b::a);

        public b(Map<String, hqh.b> $$0) {
            this.b = $$0;
        }

        public void a(eoi<dzq, eoh> $$0, Supplier<String> $$1, BiConsumer<eoh, hqh.c> $$2) {
            this.b.forEach(($$3, $$4) -> {
                try {
                    Predicate $$5 = hqs.a($$0, $$3);
                    hqh.c $$6 = $$4.a();
                    for (eoh $$7 : $$0.a()) {
                        if (!$$5.test($$7)) continue;
                        $$2.accept($$7, $$6);
                    }
                }
                catch (Exception $$8) {
                    d.warn("Exception loading blockstate definition: '{}' for variant: '{}': {}", new Object[]{$$1.get(), $$3, $$8.getMessage()});
                }
            });
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "models", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "models", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "models", "b"}, this, $$0);
        }

        public Map<String, hqh.b> a() {
            return this.b;
        }
    }
}

