/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Lifecycle
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class ams<T>
extends amk<T> {
    private final c b;

    public static <T> ams<T> a(DynamicOps<T> $$0, jf.a $$1) {
        return ams.a($$0, new a($$1));
    }

    public static <T> ams<T> a(DynamicOps<T> $$0, c $$1) {
        return new ams<T>($$0, $$1);
    }

    public static <T> Dynamic<T> a(Dynamic<T> $$0, jf.a $$1) {
        return new Dynamic($$1.a($$0.getOps()), $$0.getValue());
    }

    private ams(DynamicOps<T> $$0, c $$1) {
        super($$0);
        this.b = $$1;
    }

    public <U> ams<U> a(DynamicOps<U> $$0) {
        if ($$0 == this.a) {
            return this;
        }
        return new ams<U>($$0, this.b);
    }

    public <E> Optional<jg<E>> a(amt<? extends jq<? extends E>> $$0) {
        return this.b.a($$0).map(b::a);
    }

    public <E> Optional<je<E>> b(amt<? extends jq<? extends E>> $$0) {
        return this.b.a($$0).map(b::b);
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 == null || this.getClass() != $$0.getClass()) {
            return false;
        }
        ams $$1 = (ams)$$0;
        return this.a.equals((Object)$$1.a) && this.b.equals($$1.b);
    }

    public int hashCode() {
        return this.a.hashCode() * 31 + this.b.hashCode();
    }

    public static <E, O> RecordCodecBuilder<O, je<E>> c(amt<? extends jq<? extends E>> $$02) {
        return bfm.a((DynamicOps<?> $$1) -> {
            if ($$1 instanceof ams) {
                ams $$2 = (ams)$$1;
                return $$2.b.a($$02).map($$0 -> DataResult.success($$0.b(), (Lifecycle)$$0.c())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + String.valueOf($$02)));
            }
            return DataResult.error(() -> "Not a registry ops");
        }).forGetter($$0 -> null);
    }

    public static <E, O> RecordCodecBuilder<O, jd.c<E>> d(amt<E> $$02) {
        amt $$1 = amt.a($$02.b());
        return bfm.a((DynamicOps<?> $$2) -> {
            if ($$2 instanceof ams) {
                ams $$3 = (ams)$$2;
                return $$3.b.a($$1).flatMap($$1 -> $$1.b().a($$02)).map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Can't find value: " + String.valueOf($$02)));
            }
            return DataResult.error(() -> "Not a registry ops");
        }).forGetter($$0 -> null);
    }

    static final class a
    implements c {
        private final jf.a a;
        private final Map<amt<? extends jq<?>>, Optional<? extends b<?>>> b = new ConcurrentHashMap();

        public a(jf.a $$0) {
            this.a = $$0;
        }

        public <E> Optional<b<E>> a(amt<? extends jq<? extends E>> $$0) {
            return this.b.computeIfAbsent($$0, this::b);
        }

        private Optional<b<Object>> b(amt<? extends jq<?>> $$0) {
            return this.a.a($$0).map(b::a);
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public boolean equals(Object $$0) {
            if (this == $$0) {
                return true;
            }
            if (!($$0 instanceof a)) return false;
            a $$1 = (a)$$0;
            if (!this.a.equals($$1.a)) return false;
            return true;
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public static interface c {
        public <T> Optional<b<T>> a(amt<? extends jq<? extends T>> var1);
    }

    public record b<T>(jg<T> a, je<T> b, Lifecycle c) {
        public static <T> b<T> a(jf.b<T> $$0) {
            return new b<T>($$0, $$0, $$0.h());
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "owner;getter;elementsLifecycle", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "owner;getter;elementsLifecycle", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "owner;getter;elementsLifecycle", "a", "b", "c"}, this, $$0);
        }
    }
}

