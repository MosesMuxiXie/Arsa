/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class fea
extends fdv {
    public static final MapCodec<fea> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)cbn.b(fdv.c).fieldOf("distribution").forGetter($$0 -> $$0.b)).apply((Applicative)$$02, fea::new));
    private final cbn<fdv> b;

    public fea(cbn<fdv> $$0) {
        this.b = $$0;
    }

    @Override
    public int a(bgr $$0, evn $$1) {
        return this.b.b($$0).a($$0, $$1);
    }

    @Override
    public fdw<?> a() {
        return fdw.f;
    }
}

