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

public class faf
implements fac {
    public static final Codec<faf> a = RecordCodecBuilder.create($$02 -> $$02.group((App)Codec.intRange((int)1, (int)512).fieldOf("floor_to_ceiling_search_range").orElse((Object)30).forGetter($$0 -> $$0.b), (App)cch.b(1, 60).fieldOf("column_radius").forGetter($$0 -> $$0.c), (App)ccf.a(0.0f, 20.0f).fieldOf("height_scale").forGetter($$0 -> $$0.d), (App)Codec.floatRange((float)0.1f, (float)1.0f).fieldOf("max_column_radius_to_cave_height_ratio").forGetter($$0 -> Float.valueOf($$0.e)), (App)ccf.a(0.1f, 10.0f).fieldOf("stalactite_bluntness").forGetter($$0 -> $$0.f), (App)ccf.a(0.1f, 10.0f).fieldOf("stalagmite_bluntness").forGetter($$0 -> $$0.g), (App)ccf.a(0.0f, 2.0f).fieldOf("wind_speed").forGetter($$0 -> $$0.h), (App)Codec.intRange((int)0, (int)100).fieldOf("min_radius_for_wind").forGetter($$0 -> $$0.i), (App)Codec.floatRange((float)0.0f, (float)5.0f).fieldOf("min_bluntness_for_wind").forGetter($$0 -> Float.valueOf($$0.j))).apply((Applicative)$$02, faf::new));
    public final int b;
    public final cch c;
    public final ccf d;
    public final float e;
    public final ccf f;
    public final ccf g;
    public final ccf h;
    public final int i;
    public final float j;

    public faf(int $$0, cch $$1, ccf $$2, float $$3, ccf $$4, ccf $$5, ccf $$6, int $$7, float $$8) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
        this.h = $$6;
        this.i = $$7;
        this.j = $$8;
    }
}

