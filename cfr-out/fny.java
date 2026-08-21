/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.ImmutableSet$Builder
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class fny {
    private static final Codec<fny> b = RecordCodecBuilder.create($$02 -> $$02.group((App)fsj.a.optionalFieldOf("min").forGetter($$0 -> Optional.ofNullable($$0.c)), (App)fsj.a.optionalFieldOf("max").forGetter($$0 -> Optional.ofNullable($$0.d))).apply((Applicative)$$02, fny::new));
    public static final Codec<fny> a = Codec.either((Codec)Codec.INT, b).xmap($$0 -> (fny)$$0.map(fny::a, Function.identity()), $$0 -> {
        OptionalInt $$1 = $$0.b();
        if ($$1.isPresent()) {
            return Either.left((Object)$$1.getAsInt());
        }
        return Either.right((Object)$$0);
    });
    private final @Nullable fsi c;
    private final @Nullable fsi d;
    private final b e;
    private final a f;

    public Set<bhv<?>> a() {
        ImmutableSet.Builder $$0 = ImmutableSet.builder();
        if (this.c != null) {
            $$0.addAll(this.c.b());
        }
        if (this.d != null) {
            $$0.addAll(this.d.b());
        }
        return $$0.build();
    }

    private fny(Optional<fsi> $$0, Optional<fsi> $$1) {
        this((fsi)$$0.orElse(null), (fsi)$$1.orElse(null));
    }

    private fny(@Nullable fsi $$02, @Nullable fsi $$12) {
        this.c = $$02;
        this.d = $$12;
        if ($$02 == null) {
            if ($$12 == null) {
                this.e = ($$0, $$1) -> $$1;
                this.f = ($$0, $$1) -> true;
            } else {
                this.e = ($$1, $$2) -> Math.min($$12.a($$1), $$2);
                this.f = ($$1, $$2) -> $$2 <= $$12.a($$1);
            }
        } else if ($$12 == null) {
            this.e = ($$1, $$2) -> Math.max($$02.a($$1), $$2);
            this.f = ($$1, $$2) -> $$2 >= $$02.a($$1);
        } else {
            this.e = ($$2, $$3) -> bgj.a($$3, $$02.a($$2), $$12.a($$2));
            this.f = ($$2, $$3) -> $$3 >= $$02.a($$2) && $$3 <= $$12.a($$2);
        }
    }

    public static fny a(int $$0) {
        fsf $$1 = fsf.a($$0);
        return new fny(Optional.of($$1), Optional.of($$1));
    }

    public static fny a(int $$0, int $$1) {
        return new fny(Optional.of(fsf.a($$0)), Optional.of(fsf.a($$1)));
    }

    public static fny b(int $$0) {
        return new fny(Optional.of(fsf.a($$0)), Optional.empty());
    }

    public static fny c(int $$0) {
        return new fny(Optional.empty(), Optional.of(fsf.a($$0)));
    }

    public int a(fnz $$0, int $$1) {
        return this.e.apply($$0, $$1);
    }

    public boolean b(fnz $$0, int $$1) {
        return this.f.test($$0, $$1);
    }

    private OptionalInt b() {
        fsf $$0;
        fsi fsi2;
        if (Objects.equals(this.c, this.d) && (fsi2 = this.c) instanceof fsf && Math.floor(($$0 = (fsf)fsi2).c()) == (double)$$0.c()) {
            return OptionalInt.of((int)$$0.c());
        }
        return OptionalInt.empty();
    }

    @FunctionalInterface
    static interface b {
        public int apply(fnz var1, int var2);
    }

    @FunctionalInterface
    static interface a {
        public boolean test(fnz var1, int var2);
    }
}

