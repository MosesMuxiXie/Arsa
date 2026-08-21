/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.jspecify.annotations.Nullable;

public class fjv
implements fjy {
    public static final MapCodec<fjv> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)uz.a.fieldOf("data").forGetter($$0 -> $$0.b)).apply((Applicative)$$02, fjv::new));
    private final uz b;

    public fjv(uz $$0) {
        this.b = $$0;
    }

    @Override
    public uz a(bgr $$0, @Nullable uz $$1) {
        return $$1 == null ? this.b.l() : $$1.a(this.b);
    }

    @Override
    public fjz<?> a() {
        return fjz.c;
    }
}

