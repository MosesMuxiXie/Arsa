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

public class cy
extends de<a> {
    @Override
    public Codec<a> a() {
        return a.a;
    }

    public void a(axg $$02) {
        this.a($$02, (T $$0) -> true);
    }

    public static final class a
    extends Record
    implements de.a {
        private final Optional<bc> b;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bs.b.optionalFieldOf("player").forGetter(a::a)).apply((Applicative)$$0, a::new));

        public a(Optional<bc> $$0) {
            this.b = $$0;
        }

        public static ak<a> a(co.a $$0) {
            return aj.q.a(new a(Optional.of(bs.a(bs.a.a().a($$0)))));
        }

        public static ak<a> a(bs.a $$0) {
            return aj.q.a(new a(Optional.of(bs.a($$0.b()))));
        }

        public static ak<a> a(Optional<bs> $$0) {
            return aj.q.a(new a(bs.a($$0)));
        }

        public static ak<a> b() {
            return aj.r.a(new a(Optional.empty()));
        }

        public static ak<a> c() {
            return aj.J.a(new a(Optional.empty()));
        }

        public static ak<a> d() {
            return aj.ad.a(new a(Optional.empty()));
        }

        public static ak<a> e() {
            return aj.x.a(new a(Optional.empty()));
        }

        public static ak<a> a(je<dzq> $$0, je<dlp> $$1, dzq $$2, dlp $$3) {
            return cy$a.a(bs.a.a().a(bp.a.a().d(cg.a.a().a($$1, $$3))).b(co.a.a().a(as.a.a().a($$0, $$2))));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "player", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "player", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "player", "b"}, this, $$0);
        }

        @Override
        public Optional<bc> a() {
            return this.b;
        }
    }
}

