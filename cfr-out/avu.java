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

public class avu {
    public static a a(auo $$0) {
        if (!$$0.g().a()) {
            return a.b;
        }
        return new a(true, avr.a($$0), alq.c.a());
    }

    public static boolean a(auo $$0, boolean $$1, avh $$2) {
        return $$0.g().a(true, $$1, true, $$2);
    }

    public static boolean a(auo $$0, avh $$1) {
        $$0.a(() -> $$0.g().a(false, $$1));
        return true;
    }

    public static boolean a(auo $$0, b $$1, avh $$2) {
        yh $$3 = $$1.a().a().orElse(null);
        if ($$3 == null) {
            return false;
        }
        if ($$1.c().isPresent()) {
            if ($$1.c().get().isEmpty()) {
                return false;
            }
            for (aue $$4 : $$1.c().get()) {
                axg $$6;
                if ($$4.a().isPresent()) {
                    axg $$5 = $$0.c().a($$4.a().get());
                } else {
                    if (!$$4.b().isPresent()) continue;
                    $$6 = $$0.c().c($$4.b().get());
                }
                if ($$6 == null) continue;
                $$6.b($$3, $$1.b());
            }
        } else {
            $$0.g().a($$3, $$1.b(), $$2);
        }
        return true;
    }

    public static final class a
    extends Record {
        private final boolean c;
        private final List<aue> d;
        private final alq.c e;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.BOOL.fieldOf("started").forGetter(a::a), (App)aue.a.codec().listOf().lenientOptionalFieldOf("players", List.of()).forGetter(a::b), (App)alq.c.a.fieldOf("version").forGetter(a::c)).apply((Applicative)$$0, a::new));
        public static final a b = new a(false, List.of(), alq.c.a());

        public a(boolean $$0, List<aue> $$1, alq.c $$2) {
            this.c = $$0;
            this.d = $$1;
            this.e = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "started;players;version", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "started;players;version", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "started;players;version", "c", "d", "e"}, this, $$0);
        }

        public boolean a() {
            return this.c;
        }

        public List<aue> b() {
            return this.d;
        }

        public alq.c c() {
            return this.e;
        }
    }

    public static final class b
    extends Record {
        private final avo b;
        private final boolean c;
        private final Optional<List<aue>> d;
        public static final Codec<b> a = RecordCodecBuilder.create($$0 -> $$0.group((App)avo.a.fieldOf("message").forGetter(b::a), (App)Codec.BOOL.fieldOf("overlay").forGetter(b::b), (App)aue.a.codec().listOf().lenientOptionalFieldOf("receivingPlayers").forGetter(b::c)).apply((Applicative)$$0, b::new));

        public b(avo $$0, boolean $$1, Optional<List<aue>> $$2) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "message;overlay;receivingPlayers", "b", "c", "d"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "message;overlay;receivingPlayers", "b", "c", "d"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "message;overlay;receivingPlayers", "b", "c", "d"}, this, $$0);
        }

        public avo a() {
            return this.b;
        }

        public boolean b() {
            return this.c;
        }

        public Optional<List<aue>> c() {
            return this.d;
        }
    }
}

