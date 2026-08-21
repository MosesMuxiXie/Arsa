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

public class fba
implements fac {
    public static final Codec<fba> a = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.intRange((int)0, (int)512).fieldOf("floor_search_range").forGetter($$0 -> $$0.b), (App)Codec.intRange((int)0, (int)64).fieldOf("placement_radius_around_floor").forGetter($$0 -> $$0.c), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("placement_probability_per_valid_position").forGetter($$0 -> Float.valueOf($$0.d))).apply((Applicative)$$02, fba::new));
    public final int b;
    public final int c;
    public final float d;

    public fba(int $$0, int $$1, float $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }
}

