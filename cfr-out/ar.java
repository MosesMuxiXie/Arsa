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

public class ar
extends de<a> {
    @Override
    public Codec<a> a() {
        return a.a;
    }

    public void a(axg $$0, eoh $$1, dlt $$2, int $$32) {
        this.a($$0, (T $$3) -> $$3.a($$1, $$2, $$32));
    }

    public static final class a
    extends Record
    implements de.a {
        private final Optional<bc> b;
        private final Optional<jd<dzq>> c;
        private final Optional<cg> d;
        private final cq.d e;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bs.b.optionalFieldOf("player").forGetter(a::a), (App)mi.e.r().optionalFieldOf("block").forGetter(a::b), (App)cg.a.optionalFieldOf("item").forGetter(a::c), (App)cq.d.d.optionalFieldOf("num_bees_inside", (Object)cq.d.c).forGetter(a::d)).apply((Applicative)$$0, a::new));

        public a(Optional<bc> $$0, Optional<jd<dzq>> $$1, Optional<cg> $$2, cq.d $$3) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
        }

        public static ak<a> a(dzq $$0, cg.a $$1, cq.d $$2) {
            return aj.M.a(new a(Optional.empty(), Optional.of($$0.p()), Optional.of($$1.b()), $$2));
        }

        public boolean a(eoh $$0, dlt $$1, int $$2) {
            if (this.c.isPresent() && !$$0.a(this.c.get())) {
                return false;
            }
            if (this.d.isPresent() && !this.d.get().a($$1)) {
                return false;
            }
            return this.e.d($$2);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "player;block;item;beesInside", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "player;block;item;beesInside", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "player;block;item;beesInside", "b", "c", "d", "e"}, this, $$0);
        }

        @Override
        public Optional<bc> a() {
            return this.b;
        }

        public Optional<jd<dzq>> b() {
            return this.c;
        }

        public Optional<cg> c() {
            return this.d;
        }

        public cq.d d() {
            return this.e;
        }
    }
}

