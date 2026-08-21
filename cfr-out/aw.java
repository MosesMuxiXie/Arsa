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
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class aw
extends de<a> {
    @Override
    public Codec<a> a() {
        return a.a;
    }

    @Override
    public void a(axg $$0, Collection<? extends cgk> $$12) {
        List $$2 = $$12.stream().map($$1 -> bs.b($$0, $$1)).collect(Collectors.toList());
        this.a($$0, (T $$1) -> $$1.a($$2));
    }

    public static final class a
    extends Record
    implements de.a {
        private final Optional<bc> b;
        private final List<bc> c;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bs.b.optionalFieldOf("player").forGetter(a::a), (App)bs.b.listOf().optionalFieldOf("victims", List.of()).forGetter(a::b)).apply((Applicative)$$0, a::new));

        public a(Optional<bc> $$0, List<bc> $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        public static ak<a> a(bs.a ... $$0) {
            return aj.F.a(new a(Optional.empty(), bs.a($$0)));
        }

        public boolean a(Collection<? extends fnz> $$0) {
            for (bc $$1 : this.c) {
                boolean $$2 = false;
                for (fnz fnz2 : $$0) {
                    if (!$$1.a(fnz2)) continue;
                    $$2 = true;
                    break;
                }
                if ($$2) continue;
                return false;
            }
            return true;
        }

        @Override
        public void a(bd $$0) {
            de.a.super.a($$0);
            $$0.a(this.c, "victims");
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "player;victims", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "player;victims", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "player;victims", "b", "c"}, this, $$0);
        }

        @Override
        public Optional<bc> a() {
            return this.b;
        }

        public List<bc> b() {
            return this.c;
        }
    }
}

