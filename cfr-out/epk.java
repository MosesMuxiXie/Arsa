/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.base.MoreObjects;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public abstract class epk<T extends Comparable<T>> {
    private final Class<T> a;
    private final String b;
    private @Nullable Integer c;
    private final Codec<T> d = Codec.STRING.comapFlatMap($$0 -> this.b((String)$$0).map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unable to read property: " + String.valueOf(this) + " with value: " + $$0)), this::b);
    private final Codec<a<T>> e = this.d.xmap(this::c, a::b);

    protected epk(String $$02, Class<T> $$1) {
        this.a = $$1;
        this.b = $$02;
    }

    public a<T> c(T $$0) {
        return new a<T>(this, $$0);
    }

    public a<T> a(eoj<?, ?> $$0) {
        return new a(this, $$0.c(this));
    }

    public Stream<a<T>> c() {
        return this.a().stream().map(this::c);
    }

    public Codec<T> d() {
        return this.d;
    }

    public Codec<a<T>> e() {
        return this.e;
    }

    public String f() {
        return this.b;
    }

    public Class<T> g() {
        return this.a;
    }

    public abstract List<T> a();

    public abstract String b(T var1);

    public abstract Optional<T> b(String var1);

    public abstract int a(T var1);

    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("name", (Object)this.b).add("clazz", this.a).add("values", this.a()).toString();
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 instanceof epk) {
            epk $$1 = (epk)$$0;
            return this.a.equals($$1.a) && this.b.equals($$1.b);
        }
        return false;
    }

    public final int hashCode() {
        if (this.c == null) {
            this.c = this.b();
        }
        return this.c;
    }

    public int b() {
        return 31 * this.a.hashCode() + this.b.hashCode();
    }

    public <U, S extends eoj<?, S>> DataResult<S> a(DynamicOps<U> $$0, S $$12, U $$2) {
        DataResult $$3 = this.d.parse($$0, $$2);
        return $$3.map($$1 -> (eoj)$$12.b(this, $$1)).setPartial($$12);
    }

    public record a<T extends Comparable<T>>(epk<T> a, T b) {
        public a {
            if (!$$0.a().contains($$1)) {
                throw new IllegalArgumentException("Value " + String.valueOf($$1) + " does not belong to property " + String.valueOf($$0));
            }
        }

        @Override
        public String toString() {
            return this.a.f() + "=" + this.a.b(this.b);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "property;value", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "property;value", "a", "b"}, this, $$0);
        }
    }
}

