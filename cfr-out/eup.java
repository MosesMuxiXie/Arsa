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

public class eup {
    private static final Codec<Double> f = Codec.doubleRange((double)0.01, (double)50.0);
    public static final Codec<eup> a = RecordCodecBuilder.create($$02 -> $$02.group((App)f.fieldOf("filling").orElse((Object)1.7).forGetter($$0 -> $$0.b), (App)f.fieldOf("inner_layer").orElse((Object)2.2).forGetter($$0 -> $$0.c), (App)f.fieldOf("middle_layer").orElse((Object)3.2).forGetter($$0 -> $$0.d), (App)f.fieldOf("outer_layer").orElse((Object)4.2).forGetter($$0 -> $$0.e)).apply((Applicative)$$02, eup::new));
    public final double b;
    public final double c;
    public final double d;
    public final double e;

    public eup(double $$0, double $$1, double $$2, double $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
    }
}

