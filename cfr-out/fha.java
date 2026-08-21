/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Stream;

public interface fha {
    public static final Codec<fha> b = mi.ah.q().dispatch(fha::b, Function.identity());

    public void a(bgr var1, BiConsumer<amt<fgy>, amt<fgy>> var2);

    public Stream<amt<fgy>> a();

    public static fgz a(String $$0, String $$1) {
        return fha.a(qy.a($$0), qy.a($$1));
    }

    public static fgz a(amt<fgy> $$0, amt<fgy> $$1) {
        return new fgz($$0, $$1);
    }

    public static fhe a(String $$0, cbn<String> $$12) {
        cbn.a $$2 = cbn.b();
        $$12.d().forEach($$1 -> $$2.a(qy.a((String)$$1.a()), $$1.b()));
        return fha.a(qy.a($$0), $$2.a());
    }

    public static fhe a(amt<fgy> $$0, cbn<amt<fgy>> $$1) {
        return new fhe($$0, $$1);
    }

    public static fhd a(cbn<List<fha>> $$0) {
        return new fhd($$0);
    }

    public MapCodec<? extends fha> b();
}

