/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Lifecycle
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;

public class ffd {
    public static final Codec<ffd> a = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.unboundedMap(amt.a(mj.bF), esi.a).fieldOf("dimensions").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, ffd::new)).validate(ffd::a);
    public static final Codec<jd<ffd>> b = amq.a(mj.bD, a);
    private final Map<amt<esi>, esi> c;

    public ffd(Map<amt<esi>, esi> $$0) {
        this.c = $$0;
    }

    private ImmutableMap<amt<esi>, esi> c() {
        ImmutableMap.Builder $$0 = ImmutableMap.builder();
        evl.a(this.c.keySet().stream()).forEach($$1 -> {
            esi $$2 = this.c.get($$1);
            if ($$2 != null) {
                $$0.put($$1, (Object)$$2);
            }
        });
        return $$0.build();
    }

    public evl a() {
        return new evl((Map<amt<esi>, esi>)this.c());
    }

    public Optional<esi> b() {
        return Optional.ofNullable(this.c.get(esi.b));
    }

    private static DataResult<ffd> a(ffd $$0) {
        if ($$0.b().isEmpty()) {
            return DataResult.error(() -> "Missing overworld dimension");
        }
        return DataResult.success((Object)$$0, (Lifecycle)Lifecycle.stable());
    }
}

