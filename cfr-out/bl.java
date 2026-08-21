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

public class bl
extends de<a> {
    @Override
    public Codec<a> a() {
        return a.a;
    }

    public void a(axg $$0, @Nullable cgk $$1) {
        fnz $$22 = $$1 != null ? bs.b($$0, $$1) : null;
        this.a($$0, (T $$2) -> $$2.a($$0, $$22));
    }

    public static final class a
    extends Record
    implements de.a {
        private final Optional<bc> b;
        private final Optional<cr> c;
        private final Optional<bc> d;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bs.b.optionalFieldOf("player").forGetter(a::a), (App)cr.a.optionalFieldOf("effects").forGetter(a::b), (App)bs.b.optionalFieldOf("source").forGetter(a::c)).apply((Applicative)$$0, a::new));

        public a(Optional<bc> $$0, Optional<cr> $$1, Optional<bc> $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        public static ak<a> a(cr.a $$0) {
            return aj.B.a(new a(Optional.empty(), $$0.b(), Optional.empty()));
        }

        public static ak<a> a(bs.a $$0) {
            return aj.B.a(new a(Optional.empty(), Optional.empty(), Optional.of(bs.a($$0.b()))));
        }

        public boolean a(axg $$0, @Nullable fnz $$1) {
            if (this.c.isPresent() && !this.c.get().a($$0)) {
                return false;
            }
            return !this.d.isPresent() || $$1 != null && this.d.get().a($$1);
        }

        @Override
        public void a(bd $$0) {
            de.a.super.a($$0);
            $$0.a(this.d, "source");
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "player;effects;source", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "player;effects;source", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "player;effects;source", "b", "c", "d"}, this, $$0);
        }

        @Override
        public Optional<bc> a() {
            return this.b;
        }

        public Optional<cr> b() {
            return this.c;
        }

        public Optional<bc> c() {
            return this.d;
        }
    }
}

