/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class fit
extends fjn {
    public static final MapCodec<fit> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)js.a(mj.i).optionalFieldOf("rottable_blocks").forGetter($$0 -> $$0.b), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("integrity").forGetter($$0 -> Float.valueOf($$0.c))).apply((Applicative)$$02, fit::new));
    private final Optional<jh<dzq>> b;
    private final float c;

    public fit(jh<dzq> $$0, float $$1) {
        this(Optional.of($$0), $$1);
    }

    public fit(float $$0) {
        this(Optional.empty(), $$0);
    }

    private fit(Optional<jh<dzq>> $$0, float $$1) {
        this.c = $$1;
        this.b = $$0;
    }

    @Override
    public @Nullable fjq.d a(dwr $$0, is $$1, is $$2, fjq.d $$3, fjq.d $$4, fjm $$5) {
        bgr $$6 = $$5.b($$4.a());
        if (this.b.isPresent() && !$$3.b().a(this.b.get()) || $$6.i() <= this.c) {
            return $$4;
        }
        return null;
    }

    @Override
    protected fjp<?> a() {
        return fjp.f;
    }
}

