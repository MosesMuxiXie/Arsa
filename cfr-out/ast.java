/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public interface ast {
    public static final Codec<ast> a = mi.aI.q().dispatch(ast::a, $$0 -> $$0);

    public MapCodec<? extends ast> a();

    public Optional<yf> a(Map<String, a> var1);

    public static interface a {
        public String a();

        public vz b();

        public static Map<String, String> a(Map<String, a> $$0) {
            return Maps.transformValues($$0, a::a);
        }

        public static a a(final String $$0) {
            return new a(){

                @Override
                public String a() {
                    return $$0;
                }

                @Override
                public vz b() {
                    return vx.a($$0);
                }
            };
        }

        public static a a(final Supplier<String> $$0) {
            return new a(){

                @Override
                public String a() {
                    return (String)$$0.get();
                }

                @Override
                public vz b() {
                    return vx.a((String)$$0.get());
                }
            };
        }
    }
}

