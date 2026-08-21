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
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class cn
extends de<a> {
    @Override
    public Codec<a> a() {
        return a.a;
    }

    public void a(axg $$0, chk $$12, List<cgk> $$22) {
        List $$3 = $$22.stream().map($$1 -> bs.b($$0, $$1)).collect(Collectors.toList());
        fnz $$4 = bs.b($$0, $$12);
        this.a($$0, (T $$2) -> $$2.a($$4, $$3));
    }

    public static final class a
    extends Record
    implements de.a {
        private final Optional<bc> b;
        private final Optional<bc> c;
        private final Optional<bc> d;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bs.b.optionalFieldOf("player").forGetter(a::a), (App)bs.b.optionalFieldOf("lightning").forGetter(a::b), (App)bs.b.optionalFieldOf("bystander").forGetter(a::c)).apply((Applicative)$$0, a::new));

        public a(Optional<bc> $$0, Optional<bc> $$1, Optional<bc> $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        public static ak<a> a(Optional<bs> $$0, Optional<bs> $$1) {
            return aj.X.a(new a(Optional.empty(), bs.a($$0), bs.a($$1)));
        }

        public boolean a(fnz $$0, List<fnz> $$1) {
            if (this.c.isPresent() && !this.c.get().a($$0)) {
                return false;
            }
            if (this.d.isPresent()) {
                if ($$1.stream().noneMatch(this.d.get()::a)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public void a(bd $$0) {
            de.a.super.a($$0);
            $$0.a(this.c, "lightning");
            $$0.a(this.d, "bystander");
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "player;lightning;bystander", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "player;lightning;bystander", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "player;lightning;bystander", "b", "c", "d"}, this, $$0);
        }

        @Override
        public Optional<bc> a() {
            return this.b;
        }

        public Optional<bc> b() {
            return this.c;
        }

        public Optional<bc> c() {
            return this.d;
        }
    }
}

