/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public interface dpp {
    public static final Codec<dpp> d = mi.ax.q().dispatch(dpp::a, a::a);
    public static final aao<xq, dpp> e = aam.a(mj.n).b(dpp::a, a::b);

    public a<? extends dpp> a();

    public boolean a(dwo var1, dlt var2, chl var3);

    public static final class a<T extends dpp>
    extends Record {
        private final MapCodec<T> f;
        private final aao<xq, T> g;
        public static final a<dpn> a = dpp$a.a("apply_effects", dpn.a, dpn.b);
        public static final a<dpr> b = dpp$a.a("remove_effects", dpr.a, dpr.b);
        public static final a<dpo> c = dpp$a.a("clear_all_effects", dpo.b, dpo.c);
        public static final a<dps> d = dpp$a.a("teleport_randomly", dps.a, dps.b);
        public static final a<dpq> e = dpp$a.a("play_sound", dpq.a, dpq.b);

        public a(MapCodec<T> $$0, aao<xq, T> $$1) {
            this.f = $$0;
            this.g = $$1;
        }

        private static <T extends dpp> a<T> a(String $$0, MapCodec<T> $$1, aao<xq, T> $$2) {
            return jq.a(mi.ax, $$0, new a<T>($$1, $$2));
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "codec;streamCodec", "f", "g"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "codec;streamCodec", "f", "g"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "codec;streamCodec", "f", "g"}, this, $$0);
        }

        public MapCodec<T> a() {
            return this.f;
        }

        public aao<xq, T> b() {
            return this.g;
        }
    }
}

