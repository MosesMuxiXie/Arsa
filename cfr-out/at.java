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

public class at
extends de<a> {
    @Override
    public Codec<a> a() {
        return a.a;
    }

    public void a(axg $$0, cth $$1, cth $$2, @Nullable cfy $$32) {
        fnz $$4 = bs.b($$0, $$1);
        fnz $$5 = bs.b($$0, $$2);
        fnz $$6 = $$32 != null ? bs.b($$0, $$32) : null;
        this.a($$0, (T $$3) -> $$3.a($$4, $$5, $$6));
    }

    public static final class a
    extends Record
    implements de.a {
        private final Optional<bc> b;
        private final Optional<bc> c;
        private final Optional<bc> d;
        private final Optional<bc> e;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bs.b.optionalFieldOf("player").forGetter(a::a), (App)bs.b.optionalFieldOf("parent").forGetter(a::c), (App)bs.b.optionalFieldOf("partner").forGetter(a::d), (App)bs.b.optionalFieldOf("child").forGetter(a::e)).apply((Applicative)$$0, a::new));

        public a(Optional<bc> $$0, Optional<bc> $$1, Optional<bc> $$2, Optional<bc> $$3) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
        }

        public static ak<a> b() {
            return aj.p.a(new a(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
        }

        public static ak<a> a(bs.a $$0) {
            return aj.p.a(new a(Optional.empty(), Optional.empty(), Optional.empty(), Optional.of(bs.a($$0))));
        }

        public static ak<a> a(Optional<bs> $$0, Optional<bs> $$1, Optional<bs> $$2) {
            return aj.p.a(new a(Optional.empty(), bs.a($$0), bs.a($$1), bs.a($$2)));
        }

        public boolean a(fnz $$0, fnz $$1, @Nullable fnz $$2) {
            if (this.e.isPresent() && ($$2 == null || !this.e.get().a($$2))) {
                return false;
            }
            return at$a.a(this.c, $$0) && at$a.a(this.d, $$1) || at$a.a(this.c, $$1) && at$a.a(this.d, $$0);
        }

        private static boolean a(Optional<bc> $$0, fnz $$1) {
            return $$0.isEmpty() || $$0.get().a($$1);
        }

        @Override
        public void a(bd $$0) {
            de.a.super.a($$0);
            $$0.a(this.c, "parent");
            $$0.a(this.d, "partner");
            $$0.a(this.e, "child");
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "player;parent;partner;child", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "player;parent;partner;child", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "player;parent;partner;child", "b", "c", "d", "e"}, this, $$0);
        }

        @Override
        public Optional<bc> a() {
            return this.b;
        }

        public Optional<bc> c() {
            return this.c;
        }

        public Optional<bc> d() {
            return this.d;
        }

        public Optional<bc> e() {
            return this.e;
        }
    }
}

