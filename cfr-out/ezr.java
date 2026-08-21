/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ezr {
    public static final Codec<ezr> a = RecordCodecBuilder.create($$02 -> $$02.group((App)fes.b.fieldOf("feature").forGetter($$0 -> $$0.b), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("chance").forGetter($$0 -> Float.valueOf($$0.c))).apply((Applicative)$$02, ezr::new));
    public final jd<fes> b;
    public final float c;

    public ezr(jd<fes> $$0, float $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public boolean a(dxn $$0, eqg $$1, bgr $$2, is $$3) {
        return this.b.a().a($$0, $$1, $$2, $$3);
    }
}

