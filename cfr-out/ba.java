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

public class ba
extends de<a> {
    @Override
    public Codec<a> a() {
        return a.a;
    }

    public void a(axg $$0, int $$12) {
        this.a($$0, (T $$1) -> $$1.a($$12));
    }

    public static final class a
    extends Record
    implements de.a {
        private final Optional<bc> b;
        private final cq.d c;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bs.b.optionalFieldOf("player").forGetter(a::a), (App)cq.d.d.optionalFieldOf("level", (Object)cq.d.c).forGetter(a::c)).apply((Applicative)$$0, a::new));

        public a(Optional<bc> $$0, cq.d $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        public static ak<a> b() {
            return aj.m.a(new a(Optional.empty(), cq.d.c));
        }

        public static ak<a> a(cq.d $$0) {
            return aj.m.a(new a(Optional.empty(), $$0));
        }

        public boolean a(int $$0) {
            return this.c.d($$0);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "player;level", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "player;level", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "player;level", "b", "c"}, this, $$0);
        }

        @Override
        public Optional<bc> a() {
            return this.b;
        }

        public cq.d c() {
            return this.c;
        }
    }
}

