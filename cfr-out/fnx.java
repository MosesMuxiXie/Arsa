/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface fnx {
    public static final fnw<doo> a = new fnw<doo>(){

        @Override
        public kh<doo> a() {
            return ki.aw;
        }

        @Override
        public Stream<dlt> a(doo $$0) {
            return $$0.b();
        }

        public doo c() {
            return doo.a;
        }

        @Override
        public doo a(doo $$0, Stream<dlt> $$1) {
            return doo.a($$1.toList());
        }

        @Override
        public /* synthetic */ Object b() {
            return this.c();
        }
    };
    public static final fnw<dnz> b = new fnw<dnz>(){

        @Override
        public kh<dnz> a() {
            return ki.X;
        }

        public dnz c() {
            return dnz.a;
        }

        @Override
        public Stream<dlt> a(dnz $$0) {
            return $$0.b();
        }

        @Override
        public dnz a(dnz $$0, Stream<dlt> $$1) {
            dnz.a $$2 = new dnz.a($$0).a();
            $$1.forEach($$2::a);
            return $$2.d();
        }

        @Override
        public /* synthetic */ Object b() {
            return this.c();
        }
    };
    public static final fnw<doa> c = new fnw<doa>(){

        @Override
        public kh<doa> a() {
            return ki.W;
        }

        public doa c() {
            return doa.a;
        }

        @Override
        public Stream<dlt> a(doa $$0) {
            return $$0.a().stream();
        }

        @Override
        public doa a(doa $$0, Stream<dlt> $$1) {
            return doa.a($$1.toList());
        }

        @Override
        public /* synthetic */ Object b() {
            return this.c();
        }
    };
    public static final Map<kh<?>, fnw<?>> d = Stream.of(a, b, c).collect(Collectors.toMap(fnw::a, $$0 -> $$0));
    public static final Codec<fnw<?>> e = mi.am.q().comapFlatMap($$0 -> {
        fnw<?> $$1 = d.get($$0);
        return $$1 != null ? DataResult.success($$1) : DataResult.error(() -> "No items in component");
    }, fnw::a);
}

