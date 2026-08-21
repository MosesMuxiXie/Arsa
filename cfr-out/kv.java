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
import java.util.Optional;
import java.util.function.Predicate;

public final class kv
extends Record
implements df<dok> {
    private final a e;
    public static final Codec<kv> a = kv$a.a.xmap(kv::new, kv::b);

    public kv(a $$0) {
        this.e = $$0;
    }

    @Override
    public kh<dok> a() {
        return ki.ap;
    }

    @Override
    public boolean a(dok $$0) {
        return this.e.a($$0);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{kv.class, "predicate", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{kv.class, "predicate", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{kv.class, "predicate", "e"}, this, $$0);
    }

    public a b() {
        return this.e;
    }

    public static final class a
    extends Record
    implements Predicate<dok> {
        private final Optional<dok.a> b;
        private final Optional<Boolean> c;
        private final Optional<Boolean> d;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)dok.a.g.optionalFieldOf("shape").forGetter(a::a), (App)Codec.BOOL.optionalFieldOf("has_twinkle").forGetter(a::b), (App)Codec.BOOL.optionalFieldOf("has_trail").forGetter(a::c)).apply((Applicative)$$0, a::new));

        public a(Optional<dok.a> $$0, Optional<Boolean> $$1, Optional<Boolean> $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        public boolean a(dok $$0) {
            if (this.b.isPresent() && this.b.get() != $$0.a()) {
                return false;
            }
            if (this.c.isPresent() && this.c.get().booleanValue() != $$0.e()) {
                return false;
            }
            return !this.d.isPresent() || this.d.get().booleanValue() == $$0.d();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "shape;twinkle;trail", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "shape;twinkle;trail", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "shape;twinkle;trail", "b", "c", "d"}, this, $$0);
        }

        public Optional<dok.a> a() {
            return this.b;
        }

        public Optional<Boolean> b() {
            return this.c;
        }

        public Optional<Boolean> c() {
            return this.d;
        }

        @Override
        public /* synthetic */ boolean test(Object object) {
            return this.a((dok)object);
        }
    }
}

