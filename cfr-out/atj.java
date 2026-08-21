/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;

public record atj(int c, List<a> d, yh e, boolean f) implements atg
{
    public static final MapCodec<atj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)asj.b.optionalFieldOf("width", (Object)200).forGetter(atj::c), (App)bfm.b(atj$a.b.listOf()).fieldOf("options").forGetter(atj::d), (App)yj.a.fieldOf("label").forGetter(atj::e), (App)Codec.BOOL.optionalFieldOf("label_visible", (Object)true).forGetter(atj::f)).apply((Applicative)$$0, atj::new)).validate($$0 -> {
        long $$1 = $$0.d.stream().filter(a::d).count();
        if ($$1 > 1L) {
            return DataResult.error(() -> "Multiple initial values");
        }
        return DataResult.success((Object)$$0);
    });

    public MapCodec<atj> a() {
        return a;
    }

    public Optional<a> b() {
        return this.d.stream().filter(a::d).findFirst();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{atj.class, "width;entries;label;labelVisible", "c", "d", "e", "f"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{atj.class, "width;entries;label;labelVisible", "c", "d", "e", "f"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{atj.class, "width;entries;label;labelVisible", "c", "d", "e", "f"}, this, $$0);
    }

    public static final class a
    extends Record {
        private final String c;
        private final Optional<yh> d;
        private final boolean e;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.STRING.fieldOf("id").forGetter(a::b), (App)yj.a.optionalFieldOf("display").forGetter(a::c), (App)Codec.BOOL.optionalFieldOf("initial", (Object)false).forGetter(a::d)).apply((Applicative)$$0, a::new));
        public static final Codec<a> b = Codec.withAlternative(a, (Codec)Codec.STRING, $$0 -> new a((String)$$0, Optional.empty(), false));

        public a(String $$0, Optional<yh> $$1, boolean $$2) {
            this.c = $$0;
            this.d = $$1;
            this.e = $$2;
        }

        public yh a() {
            return this.d.orElseGet(() -> yh.b(this.c));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "id;display;initial", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "id;display;initial", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "id;display;initial", "c", "d", "e"}, this, $$0);
        }

        public String b() {
            return this.c;
        }

        public Optional<yh> c() {
            return this.d;
        }

        public boolean d() {
            return this.e;
        }
    }
}

