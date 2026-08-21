/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class bw
extends de<a> {
    @Override
    public Codec<a> a() {
        return a.a;
    }

    public void a(axg $$0, ftm $$1, @Nullable cgk $$2) {
        ftm $$3 = $$0.dI();
        fnz $$42 = $$2 != null ? bs.b($$0, $$2) : null;
        this.a($$0, (T $$4) -> $$4.a($$0.A(), $$1, $$3, $$42));
    }

    public static final class a
    extends Record
    implements de.a {
        private final Optional<bc> b;
        private final Optional<co> c;
        private final Optional<bj> d;
        private final Optional<bc> e;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bs.b.optionalFieldOf("player").forGetter(a::a), (App)co.a.optionalFieldOf("start_position").forGetter(a::b), (App)bj.a.optionalFieldOf("distance").forGetter(a::c), (App)bs.b.optionalFieldOf("cause").forGetter(a::d)).apply((Applicative)$$0, a::new));

        public a(Optional<bc> $$0, Optional<co> $$1, Optional<bj> $$2, Optional<bc> $$3) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
        }

        public static ak<a> a(bj $$0, bs.a $$1) {
            return aj.ag.a(new a(Optional.empty(), Optional.empty(), Optional.of($$0), Optional.of(bs.a($$1))));
        }

        @Override
        public void a(bd $$0) {
            de.a.super.a($$0);
            $$0.a(this.d(), "cause");
        }

        public boolean a(axf $$0, ftm $$1, ftm $$2, @Nullable fnz $$3) {
            if (this.c.isPresent() && !this.c.get().a($$0, $$1.g, $$1.h, $$1.i)) {
                return false;
            }
            if (this.d.isPresent() && !this.d.get().a($$1.g, $$1.h, $$1.i, $$2.g, $$2.h, $$2.i)) {
                return false;
            }
            return !this.e.isPresent() || $$3 != null && this.e.get().a($$3);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "player;startPosition;distance;cause", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "player;startPosition;distance;cause", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "player;startPosition;distance;cause", "b", "c", "d", "e"}, this, $$0);
        }

        @Override
        public Optional<bc> a() {
            return this.b;
        }

        public Optional<co> b() {
            return this.c;
        }

        public Optional<bj> c() {
            return this.d;
        }

        public Optional<bc> d() {
            return this.e;
        }
    }
}

