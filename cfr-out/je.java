/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public interface je<T> {
    public Optional<jd.c<T>> a(amt<T> var1);

    default public jd.c<T> b(amt<T> $$0) {
        return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing element " + String.valueOf($$0)));
    }

    public Optional<jh.c<T>> a(bef<T> var1);

    default public jh.c<T> b(bef<T> $$0) {
        return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing tag " + String.valueOf($$0)));
    }

    default public Optional<jd<T>> a(bef<T> $$0, bgr $$12) {
        return this.a($$0).flatMap($$1 -> $$1.a($$12));
    }

    public static interface a {
        public <T> Optional<? extends je<T>> a(amt<? extends jq<? extends T>> var1);

        default public <T> je<T> b(amt<? extends jq<? extends T>> $$0) {
            return this.a($$0).orElseThrow(() -> new IllegalStateException("Registry " + String.valueOf($$0.a()) + " not found"));
        }

        default public <T> Optional<jd.c<T>> c(amt<T> $$0) {
            return this.a($$0.c()).flatMap($$1 -> $$1.a($$0));
        }

        default public <T> jd.c<T> d(amt<T> $$0) {
            return (jd.c)this.a($$0.c()).flatMap($$1 -> $$1.a($$0)).orElseThrow(() -> new IllegalStateException("Missing element " + String.valueOf($$0)));
        }
    }
}

