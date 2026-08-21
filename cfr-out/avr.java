/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class avr {
    private static final yh a = yh.c("multiplayer.disconnect.kicked");

    public static List<aue> a(auo $$0) {
        return $$0.c().a().stream().map(aue::a).toList();
    }

    public static List<aue> a(auo $$0, List<a> $$1, avh $$2) {
        ArrayList<aue> $$3 = new ArrayList<aue>();
        for (a $$4 : $$1) {
            axg $$5 = avr.a($$0, $$4.a());
            if ($$5 == null) continue;
            $$0.c().a($$5, $$2);
            $$5.g.a($$4.c.flatMap(avo::a).orElse(a));
            $$3.add($$4.a());
        }
        return $$3;
    }

    private static @Nullable axg a(auo $$0, aue $$1) {
        if ($$1.a().isPresent()) {
            return $$0.c().a($$1.a().get());
        }
        if ($$1.b().isPresent()) {
            return $$0.c().c($$1.b().get());
        }
        return null;
    }

    public static final class a
    extends Record {
        private final aue b;
        final Optional<avo> c;
        public static final MapCodec<a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)aue.a.codec().fieldOf("player").forGetter(a::a), (App)avo.a.optionalFieldOf("message").forGetter(a::b)).apply((Applicative)$$0, a::new));

        public a(aue $$0, Optional<avo> $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "player;message", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "player;message", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "player;message", "b", "c"}, this, $$0);
        }

        public aue a() {
            return this.b;
        }

        public Optional<avo> b() {
            return this.c;
        }
    }
}

