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

public class cj
extends de<a> {
    @Override
    public Codec<a> a() {
        return a.a;
    }

    public void a(axg $$0, cgk $$1, cex $$2) {
        fnz $$32 = bs.b($$0, $$1);
        this.a($$0, (T $$3) -> $$3.a($$0, $$32, $$2));
    }

    public static final class a
    extends Record
    implements de.a {
        private final Optional<bc> b;
        private final Optional<bc> c;
        private final Optional<bg> d;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bs.b.optionalFieldOf("player").forGetter(a::a), (App)bs.b.optionalFieldOf("entity").forGetter(a::e), (App)bg.a.optionalFieldOf("killing_blow").forGetter(a::f)).apply((Applicative)$$0, a::new));

        public a(Optional<bc> $$0, Optional<bc> $$1, Optional<bg> $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        public static ak<a> a(Optional<bs> $$0) {
            return aj.c.a(new a(Optional.empty(), bs.a($$0), Optional.empty()));
        }

        public static ak<a> a(bs.a $$0) {
            return aj.c.a(new a(Optional.empty(), Optional.of(bs.a($$0)), Optional.empty()));
        }

        public static ak<a> b() {
            return aj.c.a(new a(Optional.empty(), Optional.empty(), Optional.empty()));
        }

        public static ak<a> a(Optional<bs> $$0, Optional<bg> $$1) {
            return aj.c.a(new a(Optional.empty(), bs.a($$0), $$1));
        }

        public static ak<a> a(bs.a $$0, Optional<bg> $$1) {
            return aj.c.a(new a(Optional.empty(), Optional.of(bs.a($$0)), $$1));
        }

        public static ak<a> a(Optional<bs> $$0, bg.a $$1) {
            return aj.c.a(new a(Optional.empty(), bs.a($$0), Optional.of($$1.b())));
        }

        public static ak<a> a(bs.a $$0, bg.a $$1) {
            return aj.c.a(new a(Optional.empty(), Optional.of(bs.a($$0)), Optional.of($$1.b())));
        }

        public static ak<a> c() {
            return aj.ab.a(new a(Optional.empty(), Optional.empty(), Optional.empty()));
        }

        public static ak<a> b(Optional<bs> $$0) {
            return aj.d.a(new a(Optional.empty(), bs.a($$0), Optional.empty()));
        }

        public static ak<a> b(bs.a $$0) {
            return aj.d.a(new a(Optional.empty(), Optional.of(bs.a($$0)), Optional.empty()));
        }

        public static ak<a> d() {
            return aj.d.a(new a(Optional.empty(), Optional.empty(), Optional.empty()));
        }

        public static ak<a> b(Optional<bs> $$0, Optional<bg> $$1) {
            return aj.d.a(new a(Optional.empty(), bs.a($$0), $$1));
        }

        public static ak<a> b(bs.a $$0, Optional<bg> $$1) {
            return aj.d.a(new a(Optional.empty(), Optional.of(bs.a($$0)), $$1));
        }

        public static ak<a> b(Optional<bs> $$0, bg.a $$1) {
            return aj.d.a(new a(Optional.empty(), bs.a($$0), Optional.of($$1.b())));
        }

        public static ak<a> b(bs.a $$0, bg.a $$1) {
            return aj.d.a(new a(Optional.empty(), Optional.of(bs.a($$0)), Optional.of($$1.b())));
        }

        public boolean a(axg $$0, fnz $$1, cex $$2) {
            if (this.d.isPresent() && !this.d.get().a($$0, $$2)) {
                return false;
            }
            return this.c.isEmpty() || this.c.get().a($$1);
        }

        @Override
        public void a(bd $$0) {
            de.a.super.a($$0);
            $$0.a(this.c, "entity");
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "player;entityPredicate;killingBlow", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "player;entityPredicate;killingBlow", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "player;entityPredicate;killingBlow", "b", "c", "d"}, this, $$0);
        }

        @Override
        public Optional<bc> a() {
            return this.b;
        }

        public Optional<bc> e() {
            return this.c;
        }

        public Optional<bg> f() {
            return this.d;
        }
    }
}

