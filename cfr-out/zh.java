/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Lifecycle
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public final class zh {
    private static final String b = "#";
    public static final Codec<zh> a = Codec.STRING.comapFlatMap(zh::a, zh::b);
    private static final Map<l, zh> c = (Map)Stream.of(l.values()).filter(l::e).collect(ImmutableMap.toImmutableMap(Function.identity(), $$0 -> new zh($$0.f(), $$0.g())));
    private static final Map<String, zh> d = (Map)c.values().stream().collect(ImmutableMap.toImmutableMap($$0 -> $$0.f, Function.identity()));
    private final int e;
    private final @Nullable String f;

    private zh(int $$0, String $$1) {
        this.e = $$0 & 0xFFFFFF;
        this.f = $$1;
    }

    private zh(int $$0) {
        this.e = $$0 & 0xFFFFFF;
        this.f = null;
    }

    public int a() {
        return this.e;
    }

    public String b() {
        return this.f != null ? this.f : this.c();
    }

    private String c() {
        return String.format(Locale.ROOT, "#%06X", this.e);
    }

    public boolean equals(Object $$0) {
        if (this == $$0) {
            return true;
        }
        if ($$0 == null || this.getClass() != $$0.getClass()) {
            return false;
        }
        zh $$1 = (zh)$$0;
        return this.e == $$1.e;
    }

    public int hashCode() {
        return Objects.hash(this.e, this.f);
    }

    public String toString() {
        return this.b();
    }

    public static @Nullable zh a(l $$0) {
        return c.get($$0);
    }

    public static zh a(int $$0) {
        return new zh($$0);
    }

    public static DataResult<zh> a(String $$0) {
        if ($$0.startsWith(b)) {
            try {
                int $$1 = Integer.parseInt($$0.substring(1), 16);
                if ($$1 < 0 || $$1 > 0xFFFFFF) {
                    return DataResult.error(() -> "Color value out of range: " + $$0);
                }
                return DataResult.success((Object)zh.a($$1), (Lifecycle)Lifecycle.stable());
            }
            catch (NumberFormatException $$2) {
                return DataResult.error(() -> "Invalid color value: " + $$0);
            }
        }
        zh $$3 = d.get($$0);
        if ($$3 == null) {
            return DataResult.error(() -> "Invalid color name: " + $$0);
        }
        return DataResult.success((Object)$$3, (Lifecycle)Lifecycle.stable());
    }
}

