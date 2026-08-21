/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;
import org.jspecify.annotations.Nullable;

public class fry
implements fsa {
    private static final Codec<foa<vz>> c = foa.a($$0 -> $$0.b(a::new).a(b::new));
    public static final MapCodec<fry> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)c.fieldOf("target").forGetter($$0 -> $$0.d)).apply((Applicative)$$02, fry::new));
    public static final Codec<fry> b = c.xmap(fry::new, $$0 -> $$0.d);
    private final foa<vz> d;

    private fry(foa<vz> $$0) {
        this.d = $$0;
    }

    @Override
    public frz a() {
        return fsb.c;
    }

    @Override
    public @Nullable vz a(fnz $$0) {
        return this.d.a($$0);
    }

    @Override
    public Set<bhv<?>> b() {
        return Set.of(this.d.a());
    }

    public static fsa a(fnz.c $$0) {
        return new fry(new b($$0.a()));
    }

    record b(bhv<? extends cgk> a) implements foa.b<cgk, vz>
    {
        @Override
        public vz a(cgk $$0) {
            return ct.b($$0);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "contextParam", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "contextParam", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "contextParam", "a"}, this, $$0);
        }
    }

    record a(bhv<? extends elb> a) implements foa.b<elb, vz>
    {
        @Override
        public vz a(elb $$0) {
            return $$0.b($$0.j().J_());
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "contextParam", "a"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "contextParam", "a"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "contextParam", "a"}, this, $$0);
        }
    }
}

