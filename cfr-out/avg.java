/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public class avg {
    private static final String a = "Management server";

    public static List<b> a(auo $$02) {
        return $$02.b().a().stream().filter($$0 -> $$0.h() != null).map(a::a).map(b::a).toList();
    }

    public static List<b> a(auo $$0, List<b> $$1, avh $$2) {
        List<CompletableFuture> $$3 = $$1.stream().map($$12 -> $$0.c().a($$12.a().a(), $$12.a().b()).thenApply($$1 -> $$1.map($$12::a))).toList();
        for (Optional $$4 : bhs.c($$3).join()) {
            if ($$4.isEmpty()) continue;
            a $$5 = (a)$$4.get();
            $$0.b().a($$5.e(), $$2);
            axg $$6 = $$0.c().a(((a)$$4.get()).a().a());
            if ($$6 == null) continue;
            $$6.g.a(yh.c("multiplayer.disconnect.banned"));
        }
        return avg.a($$0);
    }

    public static List<b> a(auo $$0, avh $$1) {
        $$0.b().b($$1);
        return avg.a($$0);
    }

    public static List<b> b(auo $$0, List<aue> $$12, avh $$2) {
        List<CompletableFuture> $$3 = $$12.stream().map($$1 -> $$0.c().a($$1.a(), $$1.b())).toList();
        for (Optional $$4 : bhs.c($$3).join()) {
            if ($$4.isEmpty()) continue;
            $$0.b().a((bbx)$$4.get(), $$2);
        }
        return avg.a($$0);
    }

    public static List<b> c(auo $$02, List<b> $$13, avh $$22) {
        List<CompletableFuture> $$3 = $$13.stream().map($$12 -> $$02.c().a($$12.a().a(), $$12.a().b()).thenApply($$1 -> $$1.map($$12::a))).toList();
        Set $$4 = bhs.c($$3).join().stream().flatMap(Optional::stream).collect(Collectors.toSet());
        Set $$5 = $$02.b().a().stream().filter($$0 -> $$0.h() != null).map(a::a).collect(Collectors.toSet());
        $$5.stream().filter($$1 -> !$$4.contains($$1)).forEach($$2 -> $$02.b().a($$2.a(), $$22));
        $$4.stream().filter($$1 -> !$$5.contains($$1)).forEach($$2 -> {
            $$02.b().a($$2.e(), $$22);
            axg $$3 = $$02.c().a($$2.a().a());
            if ($$3 != null) {
                $$3.g.a(yh.c("multiplayer.disconnect.banned"));
            }
        });
        return avg.a($$02);
    }

    record a(bbx a, @Nullable String b, String c, Optional<Instant> d) {
        static a a(bch $$0) {
            return new a(Objects.requireNonNull((bbx)$$0.h()), $$0.d(), $$0.b(), Optional.ofNullable($$0.c()).map(Date::toInstant));
        }

        bch e() {
            return new bch(new bbx(this.a().a(), this.a().b()), null, this.c(), (Date)this.d().map(Date::from).orElse(null), this.b());
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "player;reason;source;expires", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "player;reason;source;expires", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "player;reason;source;expires", "a", "b", "c", "d"}, this, $$0);
        }
    }

    public static final class b
    extends Record {
        private final aue b;
        private final Optional<String> c;
        private final Optional<String> d;
        private final Optional<Instant> e;
        public static final MapCodec<b> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)aue.a.codec().fieldOf("player").forGetter(b::a), (App)Codec.STRING.optionalFieldOf("reason").forGetter(b::b), (App)Codec.STRING.optionalFieldOf("source").forGetter(b::c), (App)bfm.x.optionalFieldOf("expires").forGetter(b::d)).apply((Applicative)$$0, b::new));

        public b(aue $$0, Optional<String> $$1, Optional<String> $$2, Optional<Instant> $$3) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
        }

        private static b a(a $$0) {
            return new b(aue.a($$0.a()), Optional.ofNullable($$0.b()), Optional.of($$0.c()), $$0.d());
        }

        public static b a(bch $$0) {
            return avg$b.a(avg$a.a($$0));
        }

        private a a(bbx $$0) {
            return new a($$0, this.b().orElse(null), this.c().orElse(avg.a), this.d());
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "player;reason;source;expires", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "player;reason;source;expires", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "player;reason;source;expires", "b", "c", "d", "e"}, this, $$0);
        }

        public aue a() {
            return this.b;
        }

        public Optional<String> b() {
            return this.c;
        }

        public Optional<String> c() {
            return this.d;
        }

        public Optional<Instant> d() {
            return this.e;
        }
    }
}

