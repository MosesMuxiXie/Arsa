/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.net.InetAddresses
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.google.common.net.InetAddresses;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Instant;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public class avn {
    private static final String a = "Management server";

    public static List<c> a(auo $$0) {
        return $$0.b().b().stream().map(b::a).map(c::a).toList();
    }

    public static List<c> a(auo $$02, List<a> $$1, avh $$22) {
        $$1.stream().map($$2 -> avn.a($$02, $$2, $$22)).flatMap(Collection::stream).forEach($$0 -> $$0.g.a(yh.c("multiplayer.disconnect.ip_banned")));
        return avn.a($$02);
    }

    private static List<axg> a(auo $$0, a $$1, avh $$2) {
        Optional<axg> $$4;
        b $$3 = $$1.f();
        if ($$3 != null) {
            return avn.a($$0, $$3, $$2);
        }
        if ($$1.a().isPresent() && ($$4 = $$0.c().b($$1.a().get().a(), $$1.a().get().b())).isPresent()) {
            return avn.a($$0, $$1.a($$4.get()), $$2);
        }
        return List.of();
    }

    private static List<axg> a(auo $$0, b $$1, avh $$2) {
        $$0.b().a($$1.e(), $$2);
        return $$0.c().b($$1.a());
    }

    public static List<c> a(auo $$0, avh $$1) {
        $$0.b().a($$1);
        return avn.a($$0);
    }

    public static List<c> b(auo $$0, List<String> $$1, avh $$22) {
        $$1.forEach($$2 -> $$0.b().a((String)$$2, $$22));
        return avn.a($$0);
    }

    public static List<c> c(auo $$02, List<c> $$12, avh $$22) {
        Set $$3 = $$12.stream().filter($$0 -> InetAddresses.isInetAddress((String)$$0.a())).map(c::e).collect(Collectors.toSet());
        Set $$4 = $$02.b().b().stream().map(b::a).collect(Collectors.toSet());
        $$4.stream().filter($$1 -> !$$3.contains($$1)).forEach($$2 -> $$02.b().a($$2.a(), $$22));
        $$3.stream().filter($$1 -> !$$4.contains($$1)).forEach($$2 -> $$02.b().a($$2.e(), $$22));
        $$3.stream().filter($$1 -> !$$4.contains($$1)).flatMap($$1 -> $$02.c().b($$1.a()).stream()).forEach($$0 -> $$0.g.a(yh.c("multiplayer.disconnect.ip_banned")));
        return avn.a($$02);
    }

    public static final class a
    extends Record {
        private final Optional<aue> b;
        private final Optional<String> c;
        private final Optional<String> d;
        private final Optional<String> e;
        private final Optional<Instant> f;
        public static final MapCodec<a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)aue.a.codec().optionalFieldOf("player").forGetter(a::a), (App)Codec.STRING.optionalFieldOf("ip").forGetter(a::b), (App)Codec.STRING.optionalFieldOf("reason").forGetter(a::c), (App)Codec.STRING.optionalFieldOf("source").forGetter(a::d), (App)bfm.x.optionalFieldOf("expires").forGetter(a::e)).apply((Applicative)$$0, a::new));

        public a(Optional<aue> $$0, Optional<String> $$1, Optional<String> $$2, Optional<String> $$3, Optional<Instant> $$4) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
            this.f = $$4;
        }

        b a(axg $$0) {
            return new b($$0.D(), this.c().orElse(null), this.d().orElse(avn.a), this.e());
        }

        @Nullable b f() {
            if (this.b().isEmpty() || !InetAddresses.isInetAddress((String)this.b().get())) {
                return null;
            }
            return new b(this.b().get(), this.c().orElse(null), this.d().orElse(avn.a), this.e());
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "player;ip;reason;source;expires", "b", "c", "d", "e", "f"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "player;ip;reason;source;expires", "b", "c", "d", "e", "f"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "player;ip;reason;source;expires", "b", "c", "d", "e", "f"}, this, $$0);
        }

        public Optional<aue> a() {
            return this.b;
        }

        public Optional<String> b() {
            return this.c;
        }

        public Optional<String> c() {
            return this.d;
        }

        public Optional<String> d() {
            return this.e;
        }

        public Optional<Instant> e() {
            return this.f;
        }
    }

    record b(String a, @Nullable String b, String c, Optional<Instant> d) {
        static b a(bbw $$0) {
            return new b(Objects.requireNonNull((String)$$0.h()), $$0.d(), $$0.b(), Optional.ofNullable($$0.c()).map(Date::toInstant));
        }

        bbw e() {
            return new bbw(this.a(), null, this.c(), (Date)this.d().map(Date::from).orElse(null), this.b());
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "ip;reason;source;expires", "a", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "ip;reason;source;expires", "a", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "ip;reason;source;expires", "a", "b", "c", "d"}, this, $$0);
        }
    }

    public static final class c
    extends Record {
        private final String b;
        private final Optional<String> c;
        private final Optional<String> d;
        private final Optional<Instant> e;
        public static final MapCodec<c> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.STRING.fieldOf("ip").forGetter(c::a), (App)Codec.STRING.optionalFieldOf("reason").forGetter(c::b), (App)Codec.STRING.optionalFieldOf("source").forGetter(c::c), (App)bfm.x.optionalFieldOf("expires").forGetter(c::d)).apply((Applicative)$$0, c::new));

        public c(String $$0, Optional<String> $$1, Optional<String> $$2, Optional<Instant> $$3) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
        }

        private static c a(b $$0) {
            return new c($$0.a(), Optional.ofNullable($$0.b()), Optional.of($$0.c()), $$0.d());
        }

        public static c a(bbw $$0) {
            return avn$c.a(avn$b.a($$0));
        }

        private b e() {
            return new b(this.a(), this.b().orElse(null), this.c().orElse(avn.a), this.d());
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "ip;reason;source;expires", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "ip;reason;source;expires", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "ip;reason;source;expires", "b", "c", "d", "e"}, this, $$0);
        }

        public String a() {
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

