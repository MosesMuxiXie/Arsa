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

public class bk
extends de<a> {
    @Override
    public Codec<a> a() {
        return a.a;
    }

    public void a(axg $$0, ftm $$1) {
        ftm $$2 = $$0.dI();
        this.a($$0, (T $$3) -> $$3.a($$0.A(), $$1, $$2));
    }

    public static final class a
    extends Record
    implements de.a {
        private final Optional<bc> b;
        private final Optional<co> c;
        private final Optional<bj> d;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bs.b.optionalFieldOf("player").forGetter(a::a), (App)co.a.optionalFieldOf("start_position").forGetter(a::b), (App)bj.a.optionalFieldOf("distance").forGetter(a::c)).apply((Applicative)$$0, a::new));

        public a(Optional<bc> $$0, Optional<co> $$1, Optional<bj> $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        public static ak<a> a(bs.a $$0, bj $$1, co.a $$2) {
            return aj.Z.a(new a(Optional.of(bs.a($$0)), Optional.of($$2.b()), Optional.of($$1)));
        }

        public static ak<a> a(bs.a $$0, bj $$1) {
            return aj.aa.a(new a(Optional.of(bs.a($$0)), Optional.empty(), Optional.of($$1)));
        }

        public static ak<a> a(bj $$0) {
            return aj.D.a(new a(Optional.empty(), Optional.empty(), Optional.of($$0)));
        }

        public boolean a(axf $$0, ftm $$1, ftm $$2) {
            if (this.c.isPresent() && !this.c.get().a($$0, $$1.g, $$1.h, $$1.i)) {
                return false;
            }
            return !this.d.isPresent() || this.d.get().a($$1.g, $$1.h, $$1.i, $$2.g, $$2.h, $$2.i);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "player;startPosition;distance", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "player;startPosition;distance", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "player;startPosition;distance", "b", "c", "d"}, this, $$0);
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
    }
}

