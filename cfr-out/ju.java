/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DynamicOps
 *  io.netty.buffer.ByteBuf
 */
import com.mojang.serialization.DynamicOps;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ju {
    private static final Set<amt<? extends jq<?>>> a = amp.c.stream().map(amp.d::a).collect(Collectors.toUnmodifiableSet());

    public static void a(DynamicOps<vz> $$0, jr $$1, Set<bag> $$2, BiConsumer<amt<? extends jq<?>>, List<a>> $$3) {
        amp.c.forEach($$4 -> ju.a($$0, $$4, $$1, $$2, $$3));
    }

    private static <T> void a(DynamicOps<vz> $$0, amp.d<T> $$1, jr $$2, Set<bag> $$3, BiConsumer<amt<? extends jq<?>>, List<a>> $$42) {
        $$2.a($$1.a()).ifPresent($$4 -> {
            ArrayList $$52 = new ArrayList($$4.d());
            $$4.c().forEach($$5 -> {
                Optional<vz> $$9;
                boolean $$6 = $$4.d($$5.h()).flatMap(jp::a).filter($$3::contains).isPresent();
                if ($$6) {
                    Optional $$7 = Optional.empty();
                } else {
                    vz $$8 = (vz)$$1.b().encodeStart($$0, $$5.a()).getOrThrow($$1 -> new IllegalArgumentException("Failed to serialize " + String.valueOf($$5.h()) + ": " + $$1));
                    $$9 = Optional.of($$8);
                }
                $$52.add(new a($$5.h().a(), $$9));
            });
            $$42.accept($$4.g(), $$52);
        });
    }

    private static Stream<jr.d<?>> a(jr $$02) {
        return $$02.a().filter($$0 -> ju.a($$0.a()));
    }

    public static Stream<jr.d<?>> a(jk<anc> $$0) {
        return ju.a($$0.c(anc.b));
    }

    public static Stream<jr.d<?>> b(jk<anc> $$0) {
        Stream<jr.d<?>> $$1 = $$0.a(anc.a).a();
        Stream<jr.d<?>> $$2 = ju.a($$0);
        return Stream.concat($$2, $$1);
    }

    public static boolean a(amt<? extends jq<?>> $$0) {
        return a.contains($$0);
    }

    public static final class a
    extends Record {
        private final amo b;
        private final Optional<vz> c;
        public static final aao<ByteBuf, a> a = aao.a(amo.b, a::a, aam.q.a(aam::a), a::b, a::new);

        public a(amo $$0, Optional<vz> $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "id;data", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "id;data", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "id;data", "b", "c"}, this, $$0);
        }

        public amo a() {
            return this.b;
        }

        public Optional<vz> b() {
            return this.c;
        }
    }
}

