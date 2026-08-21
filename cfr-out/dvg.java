/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

public interface dvg {
    public static final Codec<dvf> a = mi.aP.q().dispatch(dvf::a, $$0 -> $$0);
    public static final Codec<dvf> b = Codec.lazyInitialized(() -> Codec.withAlternative(a, dvb.c));

    public static MapCodec<? extends dvf> a(jq<MapCodec<? extends dvf>> $$0) {
        jq.a($$0, "group", dvb.b);
        jq.a($$0, "filtered", dva.a);
        jq.a($$0, "limit_slots", dvc.a);
        jq.a($$0, "slot_range", dvd.a);
        jq.a($$0, "contents", duy.a);
        return jq.a($$0, "empty", duz.a);
    }

    public static Function<fnz, dve> a(Collection<? extends dvf> $$02) {
        List<? extends dvf> $$12 = List.copyOf($$02);
        return switch ($$12.size()) {
            case 0 -> $$0 -> dve.a;
            case 1 -> $$12.getFirst()::a;
            case 2 -> {
                dvf $$2 = $$12.get(0);
                dvf $$3 = $$12.get(1);
                yield $$2 -> dve.a($$2.a((fnz)$$2), $$3.a((fnz)$$2));
            }
            default -> $$1 -> {
                ArrayList<dve> $$2 = new ArrayList<dve>();
                for (dvf $$3 : $$12) {
                    $$2.add($$3.a((fnz)$$1));
                }
                return dve.a($$2);
            };
        };
    }
}

