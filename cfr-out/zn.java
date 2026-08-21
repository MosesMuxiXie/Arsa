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

public interface zn
extends yi {
    public static final MapCodec<zn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.STRING.fieldOf("text").forGetter(zn::b)).apply((Applicative)$$0, zn::a));
    public static final zn b = new zn(){

        public String toString() {
            return "empty";
        }

        @Override
        public String b() {
            return "";
        }
    };

    public static zn a(String $$0) {
        return $$0.isEmpty() ? b : new a($$0);
    }

    public String b();

    default public MapCodec<zn> a() {
        return a;
    }

    public static final class a
    extends Record
    implements zn {
        private final String c;

        public a(String $$0) {
            this.c = $$0;
        }

        @Override
        public <T> Optional<T> a(yn.a<T> $$0) {
            return $$0.accept(this.c);
        }

        @Override
        public <T> Optional<T> a(yn.b<T> $$0, zf $$1) {
            return $$0.accept($$1, this.c);
        }

        @Override
        public String toString() {
            return "literal{" + this.c + "}";
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "text", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "text", "c"}, this, $$0);
        }

        @Override
        public String b() {
            return this.c;
        }
    }
}

