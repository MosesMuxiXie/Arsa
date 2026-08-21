/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cqv<T> {
    private final T a;
    private long b;

    public cqv(T $$0, long $$1) {
        this.a = $$0;
        this.b = $$1;
    }

    public void a() {
        if (this.e()) {
            --this.b;
        }
    }

    public static <T> cqv<T> a(T $$0) {
        return new cqv<T>($$0, Long.MAX_VALUE);
    }

    public static <T> cqv<T> a(T $$0, long $$1) {
        return new cqv<T>($$0, $$1);
    }

    public long b() {
        return this.b;
    }

    public T c() {
        return this.a;
    }

    public boolean d() {
        return this.b <= 0L;
    }

    public String toString() {
        return String.valueOf(this.a) + (String)(this.e() ? " (ttl: " + this.b + ")" : "");
    }

    @bht
    public boolean e() {
        return this.b != Long.MAX_VALUE;
    }

    public static <T> Codec<cqv<T>> a(Codec<T> $$0) {
        return RecordCodecBuilder.create($$12 -> $$12.group((App)$$0.fieldOf("value").forGetter($$0 -> $$0.a), (App)Codec.LONG.lenientOptionalFieldOf("ttl").forGetter($$0 -> $$0.e() ? Optional.of($$0.b) : Optional.empty())).apply((Applicative)$$12, ($$0, $$1) -> new cqv<Object>($$0, $$1.orElse(Long.MAX_VALUE))));
    }
}

