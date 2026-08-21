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

public class euo {
    public static final Codec<euo> a = RecordCodecBuilder.create($$02 -> $$02.group((App)fad.a.fieldOf("generate_crack_chance").orElse((Object)1.0).forGetter($$0 -> $$0.b), (App)Codec.doubleRange((double)0.0, (double)5.0).fieldOf("base_crack_size").orElse((Object)2.0).forGetter($$0 -> $$0.c), (App)Codec.intRange((int)0, (int)10).fieldOf("crack_point_offset").orElse((Object)2).forGetter($$0 -> $$0.d)).apply((Applicative)$$02, euo::new));
    public final double b;
    public final double c;
    public final int d;

    public euo(double $$0, double $$1, int $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }
}

