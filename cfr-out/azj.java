/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.annotations.VisibleForTesting;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.regex.Pattern;

public final class azj
extends Record {
    private final List<a> c;
    private static final Pattern d = Pattern.compile("[-_a-zA-Z0-9.]+");
    public static final azy<azj> a = new azy<azj>("overlays", azj.a(azn.a));
    public static final azy<azj> b = new azy<azj>("overlays", azj.a(azn.b));

    public azj(List<a> $$0) {
        this.c = $$0;
    }

    private static DataResult<String> a(String $$0) {
        if (!d.matcher($$0).matches()) {
            return DataResult.error(() -> $$0 + " is not accepted directory name");
        }
        return DataResult.success((Object)$$0);
    }

    @VisibleForTesting
    public static Codec<azj> a(azn $$0) {
        return RecordCodecBuilder.create($$1 -> $$1.group((App)azj$a.a($$0).fieldOf("entries").forGetter(azj::a)).apply((Applicative)$$1, azj::new));
    }

    public static azy<azj> b(azn $$0) {
        return switch ($$0) {
            default -> throw new MatchException(null, null);
            case azn.a -> a;
            case azn.b -> b;
        };
    }

    public List<String> a(azz $$0) {
        return this.c.stream().filter($$1 -> $$1.a($$0)).map(a::b).toList();
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{azj.class, "overlays", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{azj.class, "overlays", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{azj.class, "overlays", "c"}, this, $$0);
    }

    public List<a> a() {
        return this.c;
    }

    public record azj$a(bfz<azz> a, String b) {
        static Codec<List<azj$a>> a(azn $$0) {
            int $$1 = azz.a($$0);
            return a.c.listOf().flatXmap($$12 -> azz.a($$12, $$1, ($$0, $$1) -> new azj$a((bfz<azz>)$$1, $$0.b())), $$12 -> DataResult.success($$12.stream().map($$1 -> new a(azz.a.a($$1.a(), $$1), $$1.b())).toList()));
        }

        public boolean a(azz $$0) {
            return this.a.a($$0);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{azj$a.class, "format;overlay", "a", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{azj$a.class, "format;overlay", "a", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{azj$a.class, "format;overlay", "a", "b"}, this, $$0);
        }

        record a(azz.a a, String b) implements azz.b
        {
            static final Codec<a> c = RecordCodecBuilder.create($$0 -> $$0.group((App)azz.a.a.forGetter(a::a), (App)Codec.STRING.validate(azj::a).fieldOf("directory").forGetter(a::b)).apply((Applicative)$$0, a::new));

            @Override
            public String toString() {
                return this.b;
            }

            @Override
            public final int hashCode() {
                return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "format;overlay", "a", "b"}, this);
            }

            @Override
            public final boolean equals(Object $$0) {
                return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "format;overlay", "a", "b"}, this, $$0);
            }
        }
    }
}

