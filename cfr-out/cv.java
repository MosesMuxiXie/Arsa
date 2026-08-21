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

public class cv
extends de<a> {
    @Override
    public Codec<a> a() {
        return a.a;
    }

    public void a(axg $$0, cgk $$1, cex $$2, float $$3, float $$4, boolean $$5) {
        fnz $$62 = bs.b($$0, $$1);
        this.a($$0, (T $$6) -> $$6.a($$0, $$62, $$2, $$3, $$4, $$5));
    }

    public static final class a
    extends Record
    implements de.a {
        private final Optional<bc> b;
        private final Optional<bf> c;
        private final Optional<bc> d;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bs.b.optionalFieldOf("player").forGetter(a::a), (App)bf.a.optionalFieldOf("damage").forGetter(a::c), (App)bs.b.optionalFieldOf("entity").forGetter(a::d)).apply((Applicative)$$0, a::new));

        public a(Optional<bc> $$0, Optional<bf> $$1, Optional<bc> $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        public static ak<a> b() {
            return aj.h.a(new a(Optional.empty(), Optional.empty(), Optional.empty()));
        }

        public static ak<a> a(Optional<bf> $$0) {
            return aj.h.a(new a(Optional.empty(), $$0, Optional.empty()));
        }

        public static ak<a> a(bf.a $$0) {
            return aj.h.a(new a(Optional.empty(), Optional.of($$0.b()), Optional.empty()));
        }

        public static ak<a> b(Optional<bs> $$0) {
            return aj.h.a(new a(Optional.empty(), Optional.empty(), bs.a($$0)));
        }

        public static ak<a> a(Optional<bf> $$0, Optional<bs> $$1) {
            return aj.h.a(new a(Optional.empty(), $$0, bs.a($$1)));
        }

        public static ak<a> a(bf.a $$0, Optional<bs> $$1) {
            return aj.h.a(new a(Optional.empty(), Optional.of($$0.b()), bs.a($$1)));
        }

        public boolean a(axg $$0, fnz $$1, cex $$2, float $$3, float $$4, boolean $$5) {
            if (this.c.isPresent() && !this.c.get().a($$0, $$2, $$3, $$4, $$5)) {
                return false;
            }
            return !this.d.isPresent() || this.d.get().a($$1);
        }

        @Override
        public void a(bd $$0) {
            de.a.super.a($$0);
            $$0.a(this.d, "entity");
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "player;damage;entity", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "player;damage;entity", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "player;damage;entity", "b", "c", "d"}, this, $$0);
        }

        @Override
        public Optional<bc> a() {
            return this.b;
        }

        public Optional<bf> c() {
            return this.c;
        }

        public Optional<bc> d() {
            return this.d;
        }
    }
}

