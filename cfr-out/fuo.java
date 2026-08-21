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
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class fuo
implements fun {
    private int a;
    private boolean b = true;
    private @Nullable yh c;
    private @Nullable aag d;

    public fuo() {
    }

    public fuo(a $$0) {
        this.a = $$0.b;
        this.b = $$0.c;
        this.c = $$0.d.orElse(null);
        this.d = $$0.e.orElse(null);
    }

    public a d() {
        return new a(this.a, this.b, Optional.ofNullable(this.c), Optional.ofNullable(this.d));
    }

    @Override
    public int a() {
        return this.a;
    }

    public void a(int $$0) {
        this.a = $$0;
    }

    @Override
    public boolean b() {
        return this.b;
    }

    public void a(boolean $$0) {
        this.b = $$0;
    }

    public @Nullable yh e() {
        return this.c;
    }

    public void a(@Nullable yh $$0) {
        this.c = $$0;
    }

    @Override
    public @Nullable aag c() {
        return this.d;
    }

    public void b(@Nullable aag $$0) {
        this.d = $$0;
    }

    public static final class a
    extends Record {
        final int b;
        final boolean c;
        final Optional<yh> d;
        final Optional<aag> e;
        public static final MapCodec<a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.INT.optionalFieldOf("Score", (Object)0).forGetter(a::a), (App)Codec.BOOL.optionalFieldOf("Locked", (Object)false).forGetter(a::b), (App)yj.a.optionalFieldOf("display").forGetter(a::c), (App)aai.b.optionalFieldOf("format").forGetter(a::d)).apply((Applicative)$$0, a::new));

        public a(int $$0, boolean $$1, Optional<yh> $$2, Optional<aag> $$3) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "value;locked;display;numberFormat", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "value;locked;display;numberFormat", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "value;locked;display;numberFormat", "b", "c", "d", "e"}, this, $$0);
        }

        public int a() {
            return this.b;
        }

        public boolean b() {
            return this.c;
        }

        public Optional<yh> c() {
            return this.d;
        }

        public Optional<aag> d() {
            return this.e;
        }
    }
}

