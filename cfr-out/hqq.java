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

public final class hqq
extends Record
implements hqg.a {
    private final amo c;
    private final a d;
    public static final MapCodec<hqq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)amo.a.fieldOf("model").forGetter(hqq::a), (App)hqq$a.a.forGetter(hqq::b)).apply((Applicative)$$0, hqq::new));
    public static final Codec<hqq> b = a.codec();

    public hqq(amo $$0) {
        this($$0, hqq$a.b);
    }

    public hqq(amo $$0, a $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    public hqq a(g $$0) {
        return this.a(this.d.a($$0));
    }

    public hqq b(g $$0) {
        return this.a(this.d.b($$0));
    }

    public hqq c(g $$0) {
        return this.a(this.d.c($$0));
    }

    public hqq a(boolean $$0) {
        return this.a(this.d.a($$0));
    }

    public hqq a(amo $$0) {
        return new hqq($$0, this.d);
    }

    public hqq a(a $$0) {
        return new hqq(this.c, $$0);
    }

    public hqq a(hqr $$0) {
        return (hqq)$$0.apply(this);
    }

    @Override
    public hqg a(inw $$0) {
        return hqm.a($$0, this.c, this.d.a());
    }

    @Override
    public void a(ioe.a $$0) {
        $$0.markDependency(this.c);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{hqq.class, "modelLocation;modelState", "c", "d"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{hqq.class, "modelLocation;modelState", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{hqq.class, "modelLocation;modelState", "c", "d"}, this, $$0);
    }

    public amo a() {
        return this.c;
    }

    public a b() {
        return this.d;
    }

    public static final class a
    extends Record {
        private final g c;
        private final g d;
        private final g e;
        private final boolean f;
        public static final MapCodec<a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)g.e.optionalFieldOf("x", (Object)g.a).forGetter(a::b), (App)g.e.optionalFieldOf("y", (Object)g.a).forGetter(a::c), (App)g.e.optionalFieldOf("z", (Object)g.a).forGetter(a::d), (App)Codec.BOOL.optionalFieldOf("uvlock", (Object)false).forGetter(a::e)).apply((Applicative)$$0, a::new));
        public static final a b = new a(g.a, g.a, g.a, false);

        public a(g $$0, g $$1, g $$2, boolean $$3) {
            this.c = $$0;
            this.d = $$1;
            this.e = $$2;
            this.f = $$3;
        }

        public ioc a() {
            inm $$0 = inm.a(g.a(this.c, this.d, this.e));
            return this.f ? $$0.b() : $$0;
        }

        public a a(g $$0) {
            return new a($$0, this.d, this.e, this.f);
        }

        public a b(g $$0) {
            return new a(this.c, $$0, this.e, this.f);
        }

        public a c(g $$0) {
            return new a(this.c, this.d, $$0, this.f);
        }

        public a a(boolean $$0) {
            return new a(this.c, this.d, this.e, $$0);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "x;y;z;uvLock", "c", "d", "e", "f"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "x;y;z;uvLock", "c", "d", "e", "f"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "x;y;z;uvLock", "c", "d", "e", "f"}, this, $$0);
        }

        public g b() {
            return this.c;
        }

        public g c() {
            return this.d;
        }

        public g d() {
            return this.e;
        }

        public boolean e() {
            return this.f;
        }
    }
}

