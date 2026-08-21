/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Keyable
 */
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Keyable;
import java.lang.runtime.SwitchBootstraps;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;

@FunctionalInterface
public interface hqu {
    public static final Codec<hqu> a = Codec.recursive((String)"condition", $$03 -> {
        Codec $$1 = Codec.simpleMap(hqt.a.c, (Codec)$$03.listOf(), (Keyable)bhh.b(hqt.a.values())).codec().comapFlatMap($$0 -> {
            if ($$0.size() != 1) {
                return DataResult.error(() -> "Invalid map size for combiner condition, expected exactly one element");
            }
            Map.Entry $$1 = $$0.entrySet().iterator().next();
            return DataResult.success((Object)new hqt((hqt.a)$$1.getKey(), (List)$$1.getValue()));
        }, $$0 -> Map.of($$0.a(), $$0.b()));
        return Codec.either((Codec)$$1, hqv.b).flatComapMap($$02 -> (hqu)$$02.map($$0 -> $$0, $$0 -> $$0), $$0 -> {
            hqu hqu2 = $$0;
            Objects.requireNonNull(hqu2);
            hqu $$1 = hqu2;
            int $$2 = 0;
            DataResult $$5 = switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{hqt.class, hqv.class}, (Object)$$1, $$2)) {
                case 0 -> {
                    hqt $$3 = (hqt)$$1;
                    yield DataResult.success((Object)Either.left((Object)$$3));
                }
                case 1 -> {
                    hqv $$4 = (hqv)$$1;
                    yield DataResult.success((Object)Either.right((Object)$$4));
                }
                default -> DataResult.error(() -> "Unrecognized condition");
            };
            return $$5;
        });
    });

    public <O, S extends eoj<O, S>> Predicate<S> instantiate(eoi<O, S> var1);
}

