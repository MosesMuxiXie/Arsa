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

public class ck
extends de<a> {
    @Override
    public Codec<a> a() {
        return a.a;
    }

    public void a(axg $$0, ftm $$1, int $$2) {
        this.a($$0, (T $$3) -> $$3.a($$0, $$1, $$2));
    }

    public static final class a
    extends Record
    implements de.a {
        private final Optional<bc> b;
        private final Optional<bj> c;
        private final cq.d d;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bs.b.optionalFieldOf("player").forGetter(a::a), (App)bj.a.optionalFieldOf("distance").forGetter(a::b), (App)cq.d.d.optionalFieldOf("duration", (Object)cq.d.c).forGetter(a::c)).apply((Applicative)$$0, a::new));

        public a(Optional<bc> $$0, Optional<bj> $$1, cq.d $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        public static ak<a> a(bj $$0) {
            return aj.v.a(new a(Optional.empty(), Optional.of($$0), cq.d.c));
        }

        public boolean a(axg $$0, ftm $$1, int $$2) {
            if (this.c.isPresent() && !this.c.get().a($$1.g, $$1.h, $$1.i, $$0.dP(), $$0.dR(), $$0.dV())) {
                return false;
            }
            return this.d.d($$2);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "player;distance;duration", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "player;distance;duration", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "player;distance;duration", "b", "c", "d"}, this, $$0);
        }

        @Override
        public Optional<bc> a() {
            return this.b;
        }

        public Optional<bj> b() {
            return this.c;
        }

        public cq.d c() {
            return this.d;
        }
    }
}

