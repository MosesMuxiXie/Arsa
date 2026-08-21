/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.gson.JsonElement;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ng
implements mq {
    private final ms d;
    private static final b e = new b(true, false, true);
    private static final b f = new b(true, true, true);
    private static final b g = new b(true, true, false);
    private static final b h = new b(false, true, true);
    private static final Map<amt<? extends jq<?>>, b> i = Map.of(mj.bK, e, mj.bJ, e, mj.bG, f, mj.bH, f, mj.bI, f);
    private static final Map<String, a> j = Map.of("structure", new a(c.a, new b(true, false, true)), "function", new a(c.b, new b(true, true, true)));
    static final Codec<amt<? extends jq<?>>> k = amo.a.xmap(amt::a, amt::a);

    public ng(ms $$0) {
        this.d = $$0;
    }

    @Override
    public CompletableFuture<?> a(mo $$0) {
        d $$1 = new d(this.b(), j);
        Path $$2 = this.d.a(ms.b.c).resolve("datapack.json");
        return mq.a($$0, (JsonElement)ng$d.a.encodeStart((DynamicOps)JsonOps.INSTANCE, (Object)$$1).getOrThrow(), $$2);
    }

    @Override
    public String a() {
        return "Datapack Structure";
    }

    private void a(Map<amt<? extends jq<?>>, b> $$0, amt<? extends jq<?>> $$1, b $$2) {
        b $$3 = $$0.putIfAbsent($$1, $$2);
        if ($$3 != null) {
            throw new IllegalStateException("Duplicate entry for key " + String.valueOf($$1.a()));
        }
    }

    private Map<amt<? extends jq<?>>, b> b() {
        HashMap $$0 = new HashMap();
        mi.aR.forEach($$1 -> this.a($$0, $$1.g(), h));
        amp.a.forEach($$1 -> this.a($$0, $$1.a(), g));
        amp.b.forEach($$1 -> this.a($$0, $$1.a(), g));
        i.forEach(($$1, $$2) -> this.a($$0, (amt<? extends jq<?>>)$$1, (b)$$2));
        return $$0;
    }

    static final class d
    extends Record {
        private final Map<amt<? extends jq<?>>, b> b;
        private final Map<String, a> c;
        public static final Codec<d> a = RecordCodecBuilder.create($$0 -> $$0.group((App)Codec.unboundedMap(k, ng$b.b).fieldOf("registries").forGetter(d::a), (App)Codec.unboundedMap((Codec)Codec.STRING, ng$a.a).fieldOf("others").forGetter(d::b)).apply((Applicative)$$0, d::new));

        d(Map<amt<? extends jq<?>>, b> $$0, Map<String, a> $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{d.class, "registries;others", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{d.class, "registries;others", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{d.class, "registries;others", "b", "c"}, this, $$0);
        }

        public Map<amt<? extends jq<?>>, b> a() {
            return this.b;
        }

        public Map<String, a> b() {
            return this.c;
        }
    }

    static final class b
    extends Record {
        private final boolean c;
        private final boolean d;
        private final boolean e;
        public static final MapCodec<b> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.BOOL.fieldOf("elements").forGetter(b::a), (App)Codec.BOOL.fieldOf("tags").forGetter(b::b), (App)Codec.BOOL.fieldOf("stable").forGetter(b::c)).apply((Applicative)$$0, b::new));
        public static final Codec<b> b = a.codec();

        b(boolean $$0, boolean $$1, boolean $$2) {
            this.c = $$0;
            this.d = $$1;
            this.e = $$2;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "elements;tags;stable", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "elements;tags;stable", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "elements;tags;stable", "c", "d", "e"}, this, $$0);
        }

        public boolean a() {
            return this.c;
        }

        public boolean b() {
            return this.d;
        }

        public boolean c() {
            return this.e;
        }
    }

    static final class a
    extends Record {
        private final c b;
        private final b c;
        public static final Codec<a> a = RecordCodecBuilder.create($$0 -> $$0.group((App)ng$c.c.fieldOf("format").forGetter(a::a), (App)ng$b.a.forGetter(a::b)).apply((Applicative)$$0, a::new));

        a(c $$0, b $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "format;entry", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "format;entry", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "format;entry", "b", "c"}, this, $$0);
        }

        public c a() {
            return this.b;
        }

        public b b() {
            return this.c;
        }
    }

    static final class c
    extends Enum<c>
    implements bhh {
        public static final /* enum */ c a = new c("structure");
        public static final /* enum */ c b = new c("mcfunction");
        public static final Codec<c> c;
        private final String d;
        private static final /* synthetic */ c[] e;

        public static c[] values() {
            return (c[])e.clone();
        }

        public static c valueOf(String $$0) {
            return Enum.valueOf(c.class, $$0);
        }

        private c(String $$0) {
            this.d = $$0;
        }

        @Override
        public String c() {
            return this.d;
        }

        private static /* synthetic */ c[] a() {
            return new c[]{a, b};
        }

        static {
            e = ng$c.a();
            c = bhh.a(c::values);
        }
    }
}

