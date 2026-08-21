/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;

public class bo
extends de<a> {
    @Override
    public Codec<a> a() {
        return a.a;
    }

    public void a(axg $$0, eoh $$12) {
        this.a($$0, (T $$1) -> $$1.a($$12));
    }

    public static final class a
    extends Record
    implements de.a {
        private final Optional<bc> b;
        private final Optional<jd<dzq>> c;
        private final Optional<dl> d;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bs.b.optionalFieldOf("player").forGetter(a::a), (App)mi.e.r().optionalFieldOf("block").forGetter(a::b), (App)dl.a.optionalFieldOf("state").forGetter(a::c)).apply((Applicative)$$0, a::new)).validate(a::a);

        public a(Optional<bc> $$0, Optional<jd<dzq>> $$1, Optional<dl> $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        private static DataResult<a> a(a $$0) {
            return $$0.c.flatMap($$12 -> $$0.d.flatMap($$1 -> $$1.a(((dzq)$$12.a()).l())).map($$1 -> DataResult.error(() -> "Block" + String.valueOf($$12) + " has no property " + $$1))).orElseGet(() -> DataResult.success((Object)$$0));
        }

        public static ak<a> a(dzq $$0) {
            return aj.e.a(new a(Optional.empty(), Optional.of($$0.p()), Optional.empty()));
        }

        public boolean a(eoh $$0) {
            if (this.c.isPresent() && !$$0.a(this.c.get())) {
                return false;
            }
            return !this.d.isPresent() || this.d.get().a($$0);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "player;block;state", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "player;block;state", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "player;block;state", "b", "c", "d"}, this, $$0);
        }

        @Override
        public Optional<bc> a() {
            return this.b;
        }

        public Optional<jd<dzq>> b() {
            return this.c;
        }

        public Optional<dl> c() {
            return this.d;
        }
    }
}

