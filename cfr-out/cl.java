/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class cl
extends Record {
    private final cq.d b;
    public static final Codec<cl> a = RecordCodecBuilder.create($$0 -> $$0.group((App)cq.d.d.optionalFieldOf("light", (Object)cq.d.c).forGetter(cl::a)).apply((Applicative)$$0, cl::new));

    public cl(cq.d $$0) {
        this.b = $$0;
    }

    public boolean a(axf $$0, is $$1) {
        if (!$$0.t($$1)) {
            return false;
        }
        return this.b.d($$0.G($$1));
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cl.class, "composite", "b"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cl.class, "composite", "b"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cl.class, "composite", "b"}, this, $$0);
    }

    public cq.d a() {
        return this.b;
    }

    public static class a {
        private cq.d a = cq.d.c;

        public static a a() {
            return new a();
        }

        public a a(cq.d $$0) {
            this.a = $$0;
            return this;
        }

        public cl b() {
            return new cl(this.a);
        }
    }
}

