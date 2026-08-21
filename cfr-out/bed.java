/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class bed {
    private static final Codec<bed> b = RecordCodecBuilder.create($$02 -> $$02.group((App)bfm.A.fieldOf("id").forGetter(bed::a), (App)Codec.BOOL.optionalFieldOf("required", (Object)true).forGetter($$0 -> $$0.e)).apply((Applicative)$$02, bed::new));
    public static final Codec<bed> a = Codec.either(bfm.A, b).xmap($$02 -> (bed)$$02.map($$0 -> new bed((bfm.d)$$0, true), $$0 -> $$0), $$0 -> $$0.e ? Either.left((Object)$$0.a()) : Either.right((Object)$$0));
    private final amo c;
    private final boolean d;
    private final boolean e;

    private bed(amo $$0, boolean $$1, boolean $$2) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
    }

    private bed(bfm.d $$0, boolean $$1) {
        this.c = $$0.a();
        this.d = $$0.b();
        this.e = $$1;
    }

    private bfm.d a() {
        return new bfm.d(this.c, this.d);
    }

    public static bed a(amo $$0) {
        return new bed($$0, false, true);
    }

    public static bed b(amo $$0) {
        return new bed($$0, false, false);
    }

    public static bed c(amo $$0) {
        return new bed($$0, true, true);
    }

    public static bed d(amo $$0) {
        return new bed($$0, true, false);
    }

    public <T> boolean a(a<T> $$0, Consumer<T> $$1) {
        if (this.d) {
            Collection<T> $$2 = $$0.a(this.c);
            if ($$2 == null) {
                return !this.e;
            }
            $$2.forEach($$1);
        } else {
            T $$3 = $$0.a(this.c, this.e);
            if ($$3 == null) {
                return !this.e;
            }
            $$1.accept($$3);
        }
        return true;
    }

    public void a(Consumer<amo> $$0) {
        if (this.d && this.e) {
            $$0.accept(this.c);
        }
    }

    public void b(Consumer<amo> $$0) {
        if (this.d && !this.e) {
            $$0.accept(this.c);
        }
    }

    public boolean a(Predicate<amo> $$0, Predicate<amo> $$1) {
        return !this.e || (this.d ? $$1 : $$0).test(this.c);
    }

    public String toString() {
        StringBuilder $$0 = new StringBuilder();
        if (this.d) {
            $$0.append('#');
        }
        $$0.append(this.c);
        if (!this.e) {
            $$0.append('?');
        }
        return $$0.toString();
    }

    public static interface a<T> {
        public @Nullable T a(amo var1, boolean var2);

        public @Nullable Collection<T> a(amo var1);
    }
}

