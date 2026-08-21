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

public class fbb
implements fac {
    public static final Codec<fbb> a = RecordCodecBuilder.create($$02 -> $$02.group((App)bef.b(mj.i).fieldOf("replaceable").forGetter($$0 -> $$0.b), (App)fcd.a.fieldOf("ground_state").forGetter($$0 -> $$0.c), (App)fes.b.fieldOf("vegetation_feature").forGetter($$0 -> $$0.d), (App)fei.c.fieldOf("surface").forGetter($$0 -> $$0.e), (App)cch.b(1, 128).fieldOf("depth").forGetter($$0 -> $$0.f), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("extra_bottom_block_chance").forGetter($$0 -> Float.valueOf($$0.g)), (App)Codec.intRange((int)1, (int)256).fieldOf("vertical_range").forGetter($$0 -> $$0.h), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("vegetation_chance").forGetter($$0 -> Float.valueOf($$0.i)), (App)cch.c.fieldOf("xz_radius").forGetter($$0 -> $$0.j), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("extra_edge_column_chance").forGetter($$0 -> Float.valueOf($$0.k))).apply((Applicative)$$02, fbb::new));
    public final bef<dzq> b;
    public final fcd c;
    public final jd<fes> d;
    public final fei e;
    public final cch f;
    public final float g;
    public final int h;
    public final float i;
    public final cch j;
    public final float k;

    public fbb(bef<dzq> $$0, fcd $$1, jd<fes> $$2, fei $$3, cch $$4, float $$5, int $$6, float $$7, cch $$8, float $$9) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
        this.h = $$6;
        this.i = $$7;
        this.j = $$8;
        this.k = $$9;
    }
}

