/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.Set;

public record fru(Optional<Long> b, fny c) implements frm
{
    private final Optional<Long> b;
    private final fny c;
    public static final MapCodec<fru> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.LONG.optionalFieldOf("period").forGetter(fru::c), (App)fny.a.fieldOf("value").forGetter(fru::d)).apply((Applicative)$$0, fru::new));

    @Override
    public frn a() {
        return fro.q;
    }

    @Override
    public Set<bhv<?>> b() {
        return this.c.a();
    }

    public boolean a(fnz $$0) {
        axf $$1 = $$0.d();
        long $$2 = $$1.al();
        if (this.b.isPresent()) {
            $$2 %= this.b.get().longValue();
        }
        return this.c.b($$0, (int)$$2);
    }

    public static a a(fny $$0) {
        return new a($$0);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{fru.class, "period;value", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{fru.class, "period;value", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{fru.class, "period;value", "b", "c"}, this, $$0);
    }

    public Optional<Long> c() {
        return this.b;
    }

    public fny d() {
        return this.c;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.a((fnz)object);
    }

    public static class a
    implements frm.a {
        private Optional<Long> a = Optional.empty();
        private final fny b;

        public a(fny $$0) {
            this.b = $$0;
        }

        public a a(long $$0) {
            this.a = Optional.of($$0);
            return this;
        }

        public fru a() {
            return new fru(this.a, this.b);
        }

        @Override
        public /* synthetic */ frm build() {
            return this.a();
        }
    }
}

