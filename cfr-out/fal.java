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

public class fal
implements fac {
    public static final Codec<fal> a = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("chance_of_taller_dripstone").orElse((Object)Float.valueOf(0.2f)).forGetter($$0 -> Float.valueOf($$0.b)), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("chance_of_directional_spread").orElse((Object)Float.valueOf(0.7f)).forGetter($$0 -> Float.valueOf($$0.c)), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("chance_of_spread_radius2").orElse((Object)Float.valueOf(0.5f)).forGetter($$0 -> Float.valueOf($$0.d)), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("chance_of_spread_radius3").orElse((Object)Float.valueOf(0.5f)).forGetter($$0 -> Float.valueOf($$0.e))).apply((Applicative)$$02, fal::new));
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public fal(float $$0, float $$1, float $$2, float $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
    }
}

