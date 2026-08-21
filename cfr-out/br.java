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

public class br
extends de<a> {
    @Override
    public Codec<a> a() {
        return a.a;
    }

    public void a(axg $$0, cex $$1, float $$2, float $$3, boolean $$4) {
        this.a($$0, (T $$5) -> $$5.a($$0, $$1, $$2, $$3, $$4));
    }

    public static final class a
    extends Record
    implements de.a {
        private final Optional<bc> b;
        private final Optional<bf> c;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bs.b.optionalFieldOf("player").forGetter(a::a), (App)bf.a.optionalFieldOf("damage").forGetter(a::c)).apply((Applicative)$$0, a::new));

        public a(Optional<bc> $$0, Optional<bf> $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        public static ak<a> b() {
            return aj.i.a(new a(Optional.empty(), Optional.empty()));
        }

        public static ak<a> a(bf $$0) {
            return aj.i.a(new a(Optional.empty(), Optional.of($$0)));
        }

        public static ak<a> a(bf.a $$0) {
            return aj.i.a(new a(Optional.empty(), Optional.of($$0.b())));
        }

        public boolean a(axg $$0, cex $$1, float $$2, float $$3, boolean $$4) {
            return !this.c.isPresent() || this.c.get().a($$0, $$1, $$2, $$3, $$4);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "player;damage", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "player;damage", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "player;damage", "b", "c"}, this, $$0);
        }

        @Override
        public Optional<bc> a() {
            return this.b;
        }

        public Optional<bf> c() {
            return this.c;
        }
    }
}

