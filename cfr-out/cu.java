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

public class cu
extends de<a> {
    @Override
    public Codec<a> a() {
        return a.a;
    }

    public void a(axg $$0, dlt $$1, @Nullable cgk $$2) {
        fnz $$32 = bs.b($$0, $$2);
        this.a($$0, (T $$3) -> $$3.a($$0, $$1, $$32));
    }

    public static final class a
    extends Record
    implements de.a {
        private final Optional<bc> b;
        private final Optional<cg> c;
        private final Optional<bc> d;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bs.b.optionalFieldOf("player").forGetter(a::a), (App)cg.a.optionalFieldOf("item").forGetter(a::b), (App)bs.b.optionalFieldOf("entity").forGetter(a::c)).apply((Applicative)$$0, a::new));

        public a(Optional<bc> $$0, Optional<cg> $$1, Optional<bc> $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        public static ak<a> a(bc $$0, Optional<cg> $$1, Optional<bc> $$2) {
            return aj.S.a(new a(Optional.of($$0), $$1, $$2));
        }

        public static ak<a> a(Optional<bc> $$0, Optional<cg> $$1, Optional<bc> $$2) {
            return aj.T.a(new a($$0, $$1, $$2));
        }

        public boolean a(axg $$0, dlt $$1, fnz $$2) {
            if (this.c.isPresent() && !this.c.get().a($$1)) {
                return false;
            }
            return !this.d.isPresent() || this.d.get().a($$2);
        }

        @Override
        public void a(bd $$0) {
            de.a.super.a($$0);
            $$0.a(this.d, "entity");
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "player;item;entity", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "player;item;entity", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "player;item;entity", "b", "c", "d"}, this, $$0);
        }

        @Override
        public Optional<bc> a() {
            return this.b;
        }

        public Optional<cg> b() {
            return this.c;
        }

        public Optional<bc> c() {
            return this.d;
        }
    }
}

