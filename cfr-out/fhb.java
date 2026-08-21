/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class fhb {
    public static MapCodec<? extends fha> a(jq<MapCodec<? extends fha>> $$0) {
        jq.a($$0, "random", fhe.a);
        jq.a($$0, "random_group", fhd.a);
        return jq.a($$0, "direct", fgz.a);
    }

    public static void a(qr<fgy> $$02, jd<fgy> $$1, List<fha> $$22) {
        $$22.stream().flatMap(fha::a).map($$0 -> $$0.a().a()).forEach($$2 -> qy.a($$02, $$2, new fgy($$1, List.of(Pair.of(fgw.b($$2), (Object)1)), fgy.a.b)));
    }
}

