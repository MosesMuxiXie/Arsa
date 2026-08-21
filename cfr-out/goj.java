/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public interface goj {
    public static final MapCodec<goj> b = gok.f.dispatchMap(goj::a, gok::a);

    public gok a();

    public Either<b, c> b();

    public static final class a
    extends Record {
        private final goj b;
        private final gnq.a c;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)b.forGetter(a::a), (App)gnq.a.a.optionalFieldOf("filter", (Object)gnq.a.b).forGetter(a::b)).apply((Applicative)$$0, a::new));

        public a(goj $$0, gnq.a $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "definition;filter", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "definition;filter", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "definition;filter", "b", "c"}, this, $$0);
        }

        public goj a() {
            return this.b;
        }

        public gnq.a b() {
            return this.c;
        }
    }

    public record c(amo a) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "id", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "id", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "id", "a"}, this, $$0);
        }
    }

    public static interface b {
        public fwq load(baz var1) throws IOException;
    }
}

