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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class avi {
    public static c a(List<aui<?>> $$0) {
        ArrayList $$12 = new ArrayList(mi.aC.d() + mi.aD.d());
        mi.aC.c().forEach($$1 -> {
            if (((ats)$$1.a()).b().b()) {
                $$12.add(((ats)$$1.a()).a().a($$1.h().a()));
            }
        });
        mi.aD.c().forEach($$1 -> {
            if (((atz)$$1.a()).b().a()) {
                $$12.add(((atz)$$1.a()).a().a($$1.h().a()));
            }
        });
        HashMap $$2 = new HashMap();
        for (aui<?> $$3 : $$0) {
            $$2.put($$3.c(), $$3.e().b());
        }
        b $$4 = new b("Minecraft Server JSON-RPC", "2.0.0");
        return new c("1.3.2", $$4, $$12, new a($$2));
    }

    public static final class b
    extends Record {
        private final String b;
        private final String c;
        public static final MapCodec<b> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.STRING.fieldOf("title").forGetter(b::a), (App)Codec.STRING.fieldOf("version").forGetter(b::b)).apply((Applicative)$$0, b::new));

        public b(String $$0, String $$1) {
            this.b = $$0;
            this.c = $$1;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{b.class, "title;version", "b", "c"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{b.class, "title;version", "b", "c"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{b.class, "title;version", "b", "c"}, this, $$0);
        }

        public String a() {
            return this.b;
        }

        public String b() {
            return this.c;
        }
    }

    public static final class c
    extends Record {
        private final String b;
        private final b c;
        private final List<auc.a<?, ?>> d;
        private final a e;
        public static final MapCodec<c> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.STRING.fieldOf("openrpc").forGetter(c::a), (App)avi$b.a.codec().fieldOf("info").forGetter(c::b), (App)Codec.list(auc.a.a).fieldOf("methods").forGetter(c::c), (App)avi$a.a.codec().fieldOf("components").forGetter(c::d)).apply((Applicative)$$0, c::new));

        public c(String $$0, b $$1, List<auc.a<?, ?>> $$2, a $$3) {
            this.b = $$0;
            this.c = $$1;
            this.d = $$2;
            this.e = $$3;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{c.class, "jsonRpcProtocolVersion;discoverInfo;methods;components", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{c.class, "jsonRpcProtocolVersion;discoverInfo;methods;components", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{c.class, "jsonRpcProtocolVersion;discoverInfo;methods;components", "b", "c", "d", "e"}, this, $$0);
        }

        public String a() {
            return this.b;
        }

        public b b() {
            return this.c;
        }

        public List<auc.a<?, ?>> c() {
            return this.d;
        }

        public a d() {
            return this.e;
        }
    }

    public static final class a
    extends Record {
        private final Map<String, auh<?>> b;
        public static final MapCodec<a> a = avi$a.b();

        public a(Map<String, auh<?>> $$0) {
            this.b = $$0;
        }

        private static MapCodec<a> b() {
            return RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)Codec.unboundedMap((Codec)Codec.STRING, auh.a).fieldOf("schemas").forGetter(a::a)).apply((Applicative)$$0, a::new));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "schemas", "b"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "schemas", "b"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "schemas", "b"}, this, $$0);
        }

        public Map<String, auh<?>> a() {
            return this.b;
        }
    }
}

