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

public class cf
extends de<a> {
    @Override
    public Codec<a> a() {
        return a.a;
    }

    public void a(axg $$0, dlt $$1, int $$22) {
        this.a($$0, (T $$2) -> $$2.a($$1, $$22));
    }

    public static final class a
    extends Record
    implements de.a {
        private final Optional<bc> b;
        private final Optional<cg> c;
        private final cq.d d;
        private final cq.d e;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bs.b.optionalFieldOf("player").forGetter(a::a), (App)cg.a.optionalFieldOf("item").forGetter(a::b), (App)cq.d.d.optionalFieldOf("durability", (Object)cq.d.c).forGetter(a::c), (App)cq.d.d.optionalFieldOf("delta", (Object)cq.d.c).forGetter(a::d)).apply((Applicative)$$0, a::new));

        public a(Optional<bc> $$0, Optional<cg> $$1, cq.d $$2, cq.d $$3) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
        }

        public static ak<a> a(Optional<cg> $$0, cq.d $$1) {
            return cf$a.a(Optional.empty(), $$0, $$1);
        }

        public static ak<a> a(Optional<bc> $$0, Optional<cg> $$1, cq.d $$2) {
            return aj.u.a(new a($$0, $$1, $$2, cq.d.c));
        }

        public boolean a(dlt $$0, int $$1) {
            if (this.c.isPresent() && !this.c.get().a($$0)) {
                return false;
            }
            if (!this.d.d($$0.p() - $$1)) {
                return false;
            }
            return this.e.d($$0.o() - $$1);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "player;item;durability;delta", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "player;item;durability;delta", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "player;item;durability;delta", "b", "c", "d", "e"}, this, $$0);
        }

        @Override
        public Optional<bc> a() {
            return this.b;
        }

        public Optional<cg> b() {
            return this.c;
        }

        public cq.d c() {
            return this.d;
        }

        public cq.d d() {
            return this.e;
        }
    }
}

