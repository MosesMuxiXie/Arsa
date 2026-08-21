/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class avq {
    public static List<b> a(auo $$02) {
        return $$02.e().a().stream().filter($$0 -> $$0.h() != null).map(b::a).toList();
    }

    public static List<b> a(auo $$0, avh $$1) {
        $$0.e().a($$1);
        return avq.a($$0);
    }

    public static List<b> a(auo $$0, List<aue> $$12, avh $$22) {
        List<CompletableFuture> $$3 = $$12.stream().map($$1 -> $$0.c().a($$1.a(), $$1.b())).toList();
        for (Optional $$4 : bhs.c($$3).join()) {
            $$4.ifPresent($$2 -> $$0.e().b((bbx)$$2, $$22));
        }
        return avq.a($$0);
    }

    public static List<b> b(auo $$0, List<b> $$12, avh $$22) {
        List<CompletableFuture> $$3 = $$12.stream().map($$1 -> $$0.c().a($$1.a().a(), $$1.a().b()).thenApply($$12 -> $$12.map($$1 -> new a((bbx)$$1, $$1.b(), $$1.c())))).toList();
        for (Optional $$4 : bhs.c($$3).join()) {
            $$4.ifPresent($$2 -> $$0.e().a($$2.a(), $$2.b(), $$2.c(), $$22));
        }
        return avq.a($$0);
    }

    public static List<b> c(auo $$02, List<b> $$12, avh $$22) {
        List<CompletableFuture> $$3 = $$12.stream().map($$1 -> $$02.c().a($$1.a().a(), $$1.a().b()).thenApply($$12 -> $$12.map($$1 -> new a((bbx)$$1, $$1.b(), $$1.c())))).toList();
        Set $$4 = bhs.c($$3).join().stream().flatMap(Optional::stream).collect(Collectors.toSet());
        Set $$5 = $$02.e().a().stream().filter($$0 -> $$0.h() != null).map($$0 -> new a((bbx)$$0.h(), Optional.of($$0.a().a()), Optional.of($$0.b()))).collect(Collectors.toSet());
        $$5.stream().filter($$1 -> !$$4.contains($$1)).forEach($$2 -> $$02.e().b($$2.a(), $$22));
        $$4.stream().filter($$1 -> !$$5.contains($$1)).forEach($$2 -> $$02.e().a($$2.a(), $$2.b(), $$2.c(), $$22));
        return avq.a($$02);
    }

    record a(bbx a, Optional<bbl> b, Optional<Boolean> c) {
        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "user;permissionLevel;bypassesPlayerLimit", "a", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "user;permissionLevel;bypassesPlayerLimit", "a", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "user;permissionLevel;bypassesPlayerLimit", "a", "b", "c"}, this, $$0);
        }
    }

    public static final class b
    extends Record {
        private final aue b;
        private final Optional<bbl> c;
        private final Optional<Boolean> d;
        public static final MapCodec<b> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)aue.a.codec().fieldOf("player").forGetter(b::a), (App)bbl.g.optionalFieldOf("permissionLevel").forGetter(b::b), (App)Codec.BOOL.optionalFieldOf("bypassesPlayerLimit").forGetter(b::c)).apply((Applicative)$$0, b::new));

        public b(aue $$0, Optional<bbl> $$1, Optional<Boolean> $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        public static b a(bcc $$0) {
            return new b(aue.a(Objects.requireNonNull((bbx)$$0.h())), Optional.of($$0.a().a()), Optional.of($$0.b()));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "player;permissionLevel;bypassesPlayerLimit", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "player;permissionLevel;bypassesPlayerLimit", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "player;permissionLevel;bypassesPlayerLimit", "b", "c", "d"}, this, $$0);
        }

        public aue a() {
            return this.b;
        }

        public Optional<bbl> b() {
            return this.c;
        }

        public Optional<Boolean> c() {
            return this.d;
        }
    }
}

