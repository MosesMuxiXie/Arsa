/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.ObjectArraySet
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.lang.runtime.SwitchBootstraps;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Stream;

public final class how
extends Record {
    private final Map<amo, b> b;
    private final List<c> c;
    public static final Codec<how> a = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.unboundedMap(amo.a, how$b.a).optionalFieldOf("targets", Map.of()).forGetter(how::a), (App)how$c.a.listOf().optionalFieldOf("passes", List.of()).forGetter(how::b)).apply((Applicative)$$0, how::new));

    public how(Map<amo, b> $$0, List<c> $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{how.class, "internalTargets;passes", "b", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{how.class, "internalTargets;passes", "b", "c"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{how.class, "internalTargets;passes", "b", "c"}, this, $$0);
    }

    public Map<amo, b> a() {
        return this.b;
    }

    public List<c> b() {
        return this.c;
    }

    public static final class b
    extends Record {
        private final Optional<Integer> b;
        private final Optional<Integer> c;
        private final boolean d;
        private final int e;
        public static final Codec<b> a = RecordCodecBuilder.create($$0 -> $$0.group((App)bfm.r.optionalFieldOf("width").forGetter(b::a), (App)bfm.r.optionalFieldOf("height").forGetter(b::b), (App)Codec.BOOL.optionalFieldOf("persistent", (Object)false).forGetter(b::c), (App)bfm.m.optionalFieldOf("clear_color", (Object)0).forGetter(b::d)).apply((Applicative)$$0, b::new));

        public b(Optional<Integer> $$0, Optional<Integer> $$1, boolean $$2, int $$3) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "width;height;persistent;clearColor", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "width;height;persistent;clearColor", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "width;height;persistent;clearColor", "b", "c", "d", "e"}, this, $$0);
        }

        public Optional<Integer> a() {
            return this.b;
        }

        public Optional<Integer> b() {
            return this.c;
        }

        public boolean c() {
            return this.d;
        }

        public int d() {
            return this.e;
        }
    }

    public record c(amo b, amo c, List<a> d, amo e, Map<String, List<hpq>> f) {
        private static final Codec<List<a>> g = how$a.a.listOf().validate($$0 -> {
            ObjectArraySet $$1 = new ObjectArraySet($$0.size());
            for (a $$2 : $$0) {
                if ($$1.add($$2.a())) continue;
                return DataResult.error(() -> "Encountered repeated sampler name: " + $$2.a());
            }
            return DataResult.success((Object)$$0);
        });
        private static final Codec<Map<String, List<hpq>>> h = Codec.unboundedMap((Codec)Codec.STRING, (Codec)hpq.a.listOf());
        public static final Codec<c> a = RecordCodecBuilder.create($$0 -> $$0.group((App)amo.a.fieldOf("vertex_shader").forGetter(c::b), (App)amo.a.fieldOf("fragment_shader").forGetter(c::c), (App)g.optionalFieldOf("inputs", List.of()).forGetter(c::d), (App)amo.a.fieldOf("output").forGetter(c::e), (App)h.optionalFieldOf("uniforms", Map.of()).forGetter(c::f)).apply((Applicative)$$0, c::new));

        public Stream<amo> a() {
            Stream $$02 = this.d.stream().flatMap($$0 -> $$0.b().stream());
            return Stream.concat($$02, Stream.of(this.e));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "vertexShaderId;fragmentShaderId;inputs;outputTarget;uniforms", "b", "c", "d", "e", "f"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "vertexShaderId;fragmentShaderId;inputs;outputTarget;uniforms", "b", "c", "d", "e", "f"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "vertexShaderId;fragmentShaderId;inputs;outputTarget;uniforms", "b", "c", "d", "e", "f"}, this, $$0);
        }
    }

    public static final class d
    extends Record
    implements a {
        private final String c;
        private final amo d;
        private final boolean e;
        private final boolean f;
        public static final Codec<d> b = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.STRING.fieldOf("sampler_name").forGetter(d::a), (App)amo.a.fieldOf("target").forGetter(d::c), (App)Codec.BOOL.optionalFieldOf("use_depth_buffer", (Object)false).forGetter(d::d), (App)Codec.BOOL.optionalFieldOf("bilinear", (Object)false).forGetter(d::e)).apply((Applicative)$$0, d::new));

        public d(String $$0, amo $$1, boolean $$2, boolean $$3) {
            this.c = $$0;
            this.d = $$1;
            this.e = $$2;
            this.f = $$3;
        }

        @Override
        public Set<amo> b() {
            return Set.of(this.d);
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "samplerName;targetId;useDepthBuffer;bilinear", "c", "d", "e", "f"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "samplerName;targetId;useDepthBuffer;bilinear", "c", "d", "e", "f"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "samplerName;targetId;useDepthBuffer;bilinear", "c", "d", "e", "f"}, this, $$0);
        }

        @Override
        public String a() {
            return this.c;
        }

        public amo c() {
            return this.d;
        }

        public boolean d() {
            return this.e;
        }

        public boolean e() {
            return this.f;
        }
    }

    public static final class e
    extends Record
    implements a {
        private final String c;
        private final amo d;
        private final int e;
        private final int f;
        private final boolean g;
        public static final Codec<e> b = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.STRING.fieldOf("sampler_name").forGetter(e::a), (App)amo.a.fieldOf("location").forGetter(e::c), (App)bfm.r.fieldOf("width").forGetter(e::d), (App)bfm.r.fieldOf("height").forGetter(e::e), (App)Codec.BOOL.optionalFieldOf("bilinear", (Object)false).forGetter(e::f)).apply((Applicative)$$0, e::new));

        public e(String $$0, amo $$1, int $$2, int $$3, boolean $$4) {
            this.c = $$0;
            this.d = $$1;
            this.e = $$2;
            this.f = $$3;
            this.g = $$4;
        }

        @Override
        public Set<amo> b() {
            return Set.of();
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{e.class, "samplerName;location;width;height;bilinear", "c", "d", "e", "f", "g"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{e.class, "samplerName;location;width;height;bilinear", "c", "d", "e", "f", "g"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{e.class, "samplerName;location;width;height;bilinear", "c", "d", "e", "f", "g"}, this, $$0);
        }

        @Override
        public String a() {
            return this.c;
        }

        public amo c() {
            return this.d;
        }

        public int d() {
            return this.e;
        }

        public int e() {
            return this.f;
        }

        public boolean f() {
            return this.g;
        }
    }

    public static sealed interface a
    permits e, d {
        public static final Codec<a> a = Codec.xor(e.b, d.b).xmap($$0 -> (a)$$0.map(Function.identity(), Function.identity()), $$0 -> {
            a a2 = $$0;
            Objects.requireNonNull(a2);
            a $$1 = a2;
            int $$2 = 0;
            return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{e.class, d.class}, (Object)$$1, $$2)) {
                default -> throw new MatchException(null, null);
                case 0 -> {
                    e $$3 = (e)$$1;
                    yield Either.left((Object)$$3);
                }
                case 1 -> {
                    d $$4 = (d)$$1;
                    yield Either.right((Object)$$4);
                }
            };
        });

        public String a();

        public Set<amo> b();
    }
}

