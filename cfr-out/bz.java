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
import java.util.Collection;
import java.util.Optional;

public class bz
extends de<a> {
    @Override
    public Codec<a> a() {
        return a.a;
    }

    public void a(axg $$0, dlt $$1, ddz $$2, Collection<dlt> $$32) {
        fnz $$4 = bs.b($$0, $$2.k() != null ? $$2.k() : $$2);
        this.a($$0, (T $$3) -> $$3.a($$1, $$4, $$32));
    }

    public static final class a
    extends Record
    implements de.a {
        private final Optional<bc> b;
        private final Optional<cg> c;
        private final Optional<bc> d;
        private final Optional<cg> e;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bs.b.optionalFieldOf("player").forGetter(a::a), (App)cg.a.optionalFieldOf("rod").forGetter(a::b), (App)bs.b.optionalFieldOf("entity").forGetter(a::c), (App)cg.a.optionalFieldOf("item").forGetter(a::d)).apply((Applicative)$$0, a::new));

        public a(Optional<bc> $$0, Optional<cg> $$1, Optional<bc> $$2, Optional<cg> $$3) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
        }

        public static ak<a> a(Optional<cg> $$0, Optional<bs> $$1, Optional<cg> $$2) {
            return aj.E.a(new a(Optional.empty(), $$0, bs.a($$1), $$2));
        }

        public boolean a(dlt $$0, fnz $$1, Collection<dlt> $$2) {
            if (this.c.isPresent() && !this.c.get().a($$0)) {
                return false;
            }
            if (this.d.isPresent() && !this.d.get().a($$1)) {
                return false;
            }
            if (this.e.isPresent()) {
                boolean $$3 = false;
                cgk $$4 = $$1.c(fqx.a);
                if ($$4 instanceof czl) {
                    czl $$5 = (czl)$$4;
                    if (this.e.get().a($$5.e())) {
                        $$3 = true;
                    }
                }
                for (dlt $$6 : $$2) {
                    if (!this.e.get().a($$6)) continue;
                    $$3 = true;
                    break;
                }
                if (!$$3) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public void a(bd $$0) {
            de.a.super.a($$0);
            $$0.a(this.d, "entity");
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "player;rod;entity;item", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "player;rod;entity;item", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "player;rod;entity;item", "b", "c", "d", "e"}, this, $$0);
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

        public Optional<cg> d() {
            return this.e;
        }
    }
}

