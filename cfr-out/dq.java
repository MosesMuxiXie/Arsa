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

public class dq
extends de<a> {
    @Override
    public Codec<a> a() {
        return a.a;
    }

    public void a(axg $$0, cgk $$1, ftm $$2, int $$32) {
        fnz $$4 = bs.b($$0, $$1);
        this.a($$0, (T $$3) -> $$3.a($$4, $$2, $$32));
    }

    public static final class a
    extends Record
    implements de.a {
        private final Optional<bc> b;
        private final cq.d c;
        private final Optional<bc> d;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bs.b.optionalFieldOf("player").forGetter(a::a), (App)cq.d.d.optionalFieldOf("signal_strength", (Object)cq.d.c).forGetter(a::b), (App)bs.b.optionalFieldOf("projectile").forGetter(a::c)).apply((Applicative)$$0, a::new));

        public a(Optional<bc> $$0, cq.d $$1, Optional<bc> $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        public static ak<a> a(cq.d $$0, Optional<bc> $$1) {
            return aj.N.a(new a(Optional.empty(), $$0, $$1));
        }

        public boolean a(fnz $$0, ftm $$1, int $$2) {
            if (!this.c.d($$2)) {
                return false;
            }
            return !this.d.isPresent() || this.d.get().a($$0);
        }

        @Override
        public void a(bd $$0) {
            de.a.super.a($$0);
            $$0.a(this.d, "projectile");
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "player;signalStrength;projectile", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "player;signalStrength;projectile", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "player;signalStrength;projectile", "b", "c", "d"}, this, $$0);
        }

        @Override
        public Optional<bc> a() {
            return this.b;
        }

        public cq.d b() {
            return this.c;
        }

        public Optional<bc> c() {
            return this.d;
        }
    }
}

