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

public class dr
extends de<a> {
    @Override
    public Codec<a> a() {
        return a.a;
    }

    public void a(axg $$0, dcw $$1, dlt $$22) {
        fnz $$3 = bs.b($$0, $$1);
        this.a($$0, (T $$2) -> $$2.a($$3, $$22));
    }

    public static final class a
    extends Record
    implements de.a {
        private final Optional<bc> b;
        private final Optional<bc> c;
        private final Optional<cg> d;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bs.b.optionalFieldOf("player").forGetter(a::a), (App)bs.b.optionalFieldOf("villager").forGetter(a::c), (App)cg.a.optionalFieldOf("item").forGetter(a::d)).apply((Applicative)$$0, a::new));

        public a(Optional<bc> $$0, Optional<bc> $$1, Optional<cg> $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        public static ak<a> b() {
            return aj.t.a(new a(Optional.empty(), Optional.empty(), Optional.empty()));
        }

        public static ak<a> a(bs.a $$0) {
            return aj.t.a(new a(Optional.of(bs.a($$0)), Optional.empty(), Optional.empty()));
        }

        public boolean a(fnz $$0, dlt $$1) {
            if (this.c.isPresent() && !this.c.get().a($$0)) {
                return false;
            }
            return !this.d.isPresent() || this.d.get().a($$1);
        }

        @Override
        public void a(bd $$0) {
            de.a.super.a($$0);
            $$0.a(this.c, "villager");
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "player;villager;item", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "player;villager;item", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "player;villager;item", "b", "c", "d"}, this, $$0);
        }

        @Override
        public Optional<bc> a() {
            return this.b;
        }

        public Optional<bc> c() {
            return this.c;
        }

        public Optional<cg> d() {
            return this.d;
        }
    }
}

