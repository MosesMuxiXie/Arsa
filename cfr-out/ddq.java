/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public record ddq(iu.c a, @Nullable iu.c b, @Nullable iu.c c, ddp d, boolean e) {
    public static ddq a(iu.c $$0, @Nullable iu.c $$1, @Nullable iu.c $$2, ddp $$3) {
        return new ddq($$0, $$1, $$2, $$3, false);
    }

    public ddq a(a $$0) {
        if ($$0.equals(ddq$a.a)) {
            return this;
        }
        return ddq.a((iu.c)DataFixUtils.orElse($$0.d, (Object)this.a), (iu.c)DataFixUtils.orElse($$0.e, (Object)this.b), (iu.c)DataFixUtils.orElse($$0.f, (Object)this.c), $$0.g.orElse(this.d));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ddq.class, "body;cape;elytra;model;secure", "a", "b", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ddq.class, "body;cape;elytra;model;secure", "a", "b", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ddq.class, "body;cape;elytra;model;secure", "a", "b", "c", "d", "e"}, this, $$0);
    }

    public static final class a
    extends Record {
        final Optional<iu.b> d;
        final Optional<iu.b> e;
        final Optional<iu.b> f;
        final Optional<ddp> g;
        public static final a a = new a(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
        public static final MapCodec<a> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)iu.b.a.optionalFieldOf("texture").forGetter(a::a), (App)iu.b.a.optionalFieldOf("cape").forGetter(a::b), (App)iu.b.a.optionalFieldOf("elytra").forGetter(a::c), (App)ddp.c.optionalFieldOf("model").forGetter(a::d)).apply((Applicative)$$0, a::a));
        public static final aao<ByteBuf, a> c = aao.a(iu.b.c.a(aam::a), a::a, iu.b.c.a(aam::a), a::b, iu.b.c.a(aam::a), a::c, ddp.d.a(aam::a), a::d, a::a);

        public a(Optional<iu.b> $$0, Optional<iu.b> $$1, Optional<iu.b> $$2, Optional<ddp> $$3) {
            this.d = $$0;
            this.e = $$1;
            this.f = $$2;
            this.g = $$3;
        }

        public static a a(Optional<iu.b> $$0, Optional<iu.b> $$1, Optional<iu.b> $$2, Optional<ddp> $$3) {
            if ($$0.isEmpty() && $$1.isEmpty() && $$2.isEmpty() && $$3.isEmpty()) {
                return a;
            }
            return new a($$0, $$1, $$2, $$3);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "body;cape;elytra;model", "d", "e", "f", "g"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "body;cape;elytra;model", "d", "e", "f", "g"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "body;cape;elytra;model", "d", "e", "f", "g"}, this, $$0);
        }

        public Optional<iu.b> a() {
            return this.d;
        }

        public Optional<iu.b> b() {
            return this.e;
        }

        public Optional<iu.b> c() {
            return this.f;
        }

        public Optional<ddp> d() {
            return this.g;
        }
    }
}

