/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.HashBiMap
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 */
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.Consumer;

public class fqw {
    private static final BiMap<amo, bhw> A = HashBiMap.create();
    public static final Codec<bhw> a = amo.a.comapFlatMap($$0 -> Optional.ofNullable((bhw)A.get($$0)).map(DataResult::success).orElseGet(() -> DataResult.error(() -> "No parameter set exists with id: '" + String.valueOf($$0) + "'")), arg_0 -> A.inverse().get(arg_0));
    public static final bhw b = fqw.a("empty", $$0 -> {});
    public static final bhw c = fqw.a("chest", $$0 -> $$0.a(fqx.h).b(fqx.a));
    public static final bhw d = fqw.a("command", $$0 -> $$0.a(fqx.h).b(fqx.a));
    public static final bhw e = fqw.a("selector", $$0 -> $$0.a(fqx.h).a(fqx.a));
    public static final bhw f = fqw.a("fishing", $$0 -> $$0.a(fqx.h).a(fqx.k).b(fqx.a));
    public static final bhw g = fqw.a("entity", $$0 -> $$0.a(fqx.a).a(fqx.h).a(fqx.e).b(fqx.f).b(fqx.g).b(fqx.d));
    public static final bhw h = fqw.a("equipment", $$0 -> $$0.a(fqx.h).a(fqx.a));
    public static final bhw i = fqw.a("archaeology", $$0 -> $$0.a(fqx.h).a(fqx.a).a(fqx.k));
    public static final bhw j = fqw.a("gift", $$0 -> $$0.a(fqx.h).a(fqx.a));
    public static final bhw k = fqw.a("barter", $$0 -> $$0.a(fqx.a));
    public static final bhw l = fqw.a("vault", $$0 -> $$0.a(fqx.h).b(fqx.a).b(fqx.k));
    public static final bhw m = fqw.a("advancement_reward", $$0 -> $$0.a(fqx.a).a(fqx.h));
    public static final bhw n = fqw.a("advancement_entity", $$0 -> $$0.a(fqx.a).a(fqx.h));
    public static final bhw o = fqw.a("advancement_location", $$0 -> $$0.a(fqx.a).a(fqx.h).a(fqx.k).a(fqx.i));
    public static final bhw p = fqw.a("block_use", $$0 -> $$0.a(fqx.a).a(fqx.h).a(fqx.i));
    public static final bhw q = fqw.a("generic", $$0 -> $$0.a(fqx.a).a(fqx.d).a(fqx.e).a(fqx.f).a(fqx.g).a(fqx.h).a(fqx.i).a(fqx.j).a(fqx.k).a(fqx.l));
    public static final bhw r = fqw.a("block", $$0 -> $$0.a(fqx.i).a(fqx.h).a(fqx.k).b(fqx.a).b(fqx.j).b(fqx.l));
    public static final bhw s = fqw.a("shearing", $$0 -> $$0.a(fqx.h).a(fqx.a).a(fqx.k));
    public static final bhw t = fqw.a("entity_interact", $$0 -> $$0.a(fqx.c).b(fqx.b).a(fqx.k));
    public static final bhw u = fqw.a("block_interact", $$0 -> $$0.a(fqx.i).b(fqx.j).b(fqx.b).b(fqx.k));
    public static final bhw v = fqw.a("enchanted_damage", $$0 -> $$0.a(fqx.a).a(fqx.m).a(fqx.h).a(fqx.e).b(fqx.g).b(fqx.f));
    public static final bhw w = fqw.a("enchanted_item", $$0 -> $$0.a(fqx.k).a(fqx.m));
    public static final bhw x = fqw.a("enchanted_location", $$0 -> $$0.a(fqx.a).a(fqx.m).a(fqx.h).a(fqx.n));
    public static final bhw y = fqw.a("enchanted_entity", $$0 -> $$0.a(fqx.a).a(fqx.m).a(fqx.h));
    public static final bhw z = fqw.a("hit_block", $$0 -> $$0.a(fqx.a).a(fqx.m).a(fqx.h).a(fqx.i));

    private static bhw a(String $$0, Consumer<bhw.a> $$1) {
        bhw.a $$2 = new bhw.a();
        $$1.accept($$2);
        bhw $$3 = $$2.a();
        amo $$4 = amo.b($$0);
        bhw $$5 = (bhw)A.put((Object)$$4, (Object)$$3);
        if ($$5 != null) {
            throw new IllegalStateException("Loot table parameter set " + String.valueOf($$4) + " is already registered");
        }
        return $$3;
    }
}

