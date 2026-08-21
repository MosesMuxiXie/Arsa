/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.JavaOps
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.JavaOps;
import java.util.HashMap;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class iv<T> {
    private final Codec<T> a;

    iv(Codec<T> $$0) {
        this.a = $$0;
    }

    public T a(T $$02, jf.a $$1, jf.a $$2) {
        ams $$3 = $$1.a(JavaOps.INSTANCE);
        ams $$4 = $$2.a(JavaOps.INSTANCE);
        Object $$5 = this.a.encodeStart($$3, $$02).getOrThrow($$0 -> new IllegalStateException("Failed to encode: " + $$0));
        return (T)this.a.parse($$4, $$5).getOrThrow($$0 -> new IllegalStateException("Failed to decode: " + $$0));
    }

    public static class a {
        private final Map<amt<? extends jq<?>>, iv<?>> a = new HashMap();

        public <T> a a(amt<? extends jq<? extends T>> $$0, Codec<T> $$1) {
            this.a.put($$0, new iv<T>($$1));
            return this;
        }

        public <T> @Nullable iv<T> a(amt<? extends jq<? extends T>> $$0) {
            return this.a.get($$0);
        }
    }
}

