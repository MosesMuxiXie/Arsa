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

public final class frw
extends Record
implements frm {
    private final Optional<Boolean> b;
    private final Optional<Boolean> c;
    public static final MapCodec<frw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.BOOL.optionalFieldOf("raining").forGetter(frw::d), (App)Codec.BOOL.optionalFieldOf("thundering").forGetter(frw::e)).apply((Applicative)$$0, frw::new));

    public frw(Optional<Boolean> $$0, Optional<Boolean> $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public frn a() {
        return fro.o;
    }

    public boolean a(fnz $$0) {
        axf $$1 = $$0.d();
        if (this.b.isPresent() && this.b.get().booleanValue() != $$1.ao()) {
            return false;
        }
        return !this.c.isPresent() || this.c.get().booleanValue() == $$1.an();
    }

    public static a c() {
        return new a();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{frw.class, "isRaining;isThundering", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{frw.class, "isRaining;isThundering", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{frw.class, "isRaining;isThundering", "b", "c"}, this, $$0);
    }

    public Optional<Boolean> d() {
        return this.b;
    }

    public Optional<Boolean> e() {
        return this.c;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.a((fnz)object);
    }

    public static class a
    implements frm.a {
        private Optional<Boolean> a = Optional.empty();
        private Optional<Boolean> b = Optional.empty();

        public a a(boolean $$0) {
            this.a = Optional.of($$0);
            return this;
        }

        public a b(boolean $$0) {
            this.b = Optional.of($$0);
            return this;
        }

        public frw a() {
            return new frw(this.a, this.b);
        }

        @Override
        public /* synthetic */ frm build() {
            return this.a();
        }
    }
}

