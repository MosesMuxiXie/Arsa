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

public class av
extends de<a> {
    @Override
    public Codec<a> a() {
        return a.a;
    }

    public void a(axg $$0, amt<dwo> $$1, amt<dwo> $$22) {
        this.a($$0, (T $$2) -> $$2.b($$1, $$22));
    }

    public static final class a
    extends Record
    implements de.a {
        private final Optional<bc> b;
        private final Optional<amt<dwo>> c;
        private final Optional<amt<dwo>> d;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bs.b.optionalFieldOf("player").forGetter(a::a), (App)amt.a(mj.bE).optionalFieldOf("from").forGetter(a::c), (App)amt.a(mj.bE).optionalFieldOf("to").forGetter(a::d)).apply((Applicative)$$0, a::new));

        public a(Optional<bc> $$0, Optional<amt<dwo>> $$1, Optional<amt<dwo>> $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        public static ak<a> b() {
            return aj.w.a(new a(Optional.empty(), Optional.empty(), Optional.empty()));
        }

        public static ak<a> a(amt<dwo> $$0, amt<dwo> $$1) {
            return aj.w.a(new a(Optional.empty(), Optional.of($$0), Optional.of($$1)));
        }

        public static ak<a> a(amt<dwo> $$0) {
            return aj.w.a(new a(Optional.empty(), Optional.empty(), Optional.of($$0)));
        }

        public static ak<a> b(amt<dwo> $$0) {
            return aj.w.a(new a(Optional.empty(), Optional.of($$0), Optional.empty()));
        }

        public boolean b(amt<dwo> $$0, amt<dwo> $$1) {
            if (this.c.isPresent() && this.c.get() != $$0) {
                return false;
            }
            return !this.d.isPresent() || this.d.get() == $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "player;from;to", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "player;from;to", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "player;from;to", "b", "c", "d"}, this, $$0);
        }

        @Override
        public Optional<bc> a() {
            return this.b;
        }

        public Optional<amt<dwo>> c() {
            return this.c;
        }

        public Optional<amt<dwo>> d() {
            return this.d;
        }
    }
}

