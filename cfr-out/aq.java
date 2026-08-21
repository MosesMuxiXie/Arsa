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

public class aq
extends de<a> {
    @Override
    public Codec<a> a() {
        return a.a;
    }

    public void a(axg $$0, is $$12, dlt $$2) {
        axf $$3 = $$0.A();
        eoh $$4 = $$3.a_($$12);
        fod $$5 = new fod.a($$3).a(fqx.h, $$12.b()).a(fqx.a, $$0).a(fqx.i, $$4).a(fqx.k, $$2).a(fqw.o);
        fnz $$6 = new fnz.b($$5).a(Optional.empty());
        this.a($$0, (T $$1) -> $$1.a($$6));
    }

    public static final class a
    extends Record
    implements de.a {
        private final Optional<bc> b;
        private final Optional<bc> c;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bs.b.optionalFieldOf("player").forGetter(a::a), (App)bc.a.optionalFieldOf("location").forGetter(a::b)).apply((Applicative)$$0, a::new));

        public a(Optional<bc> $$0, Optional<bc> $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        public boolean a(fnz $$0) {
            return this.c.isEmpty() || this.c.get().a($$0);
        }

        @Override
        public void a(bd $$0) {
            de.a.super.a($$0);
            this.c.ifPresent($$1 -> $$0.a((bc)$$1, fqw.o, "location"));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "player;location", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "player;location", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "player;location", "b", "c"}, this, $$0);
        }

        @Override
        public Optional<bc> a() {
            return this.b;
        }

        public Optional<bc> b() {
            return this.c;
        }
    }
}

