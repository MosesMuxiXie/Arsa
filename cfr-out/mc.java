/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class mc
implements lw {
    public static final MapCodec<mc> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)Codec.INT.fieldOf("delay").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, mc::new));
    public static final aao<xq, mc> b = aao.a(aam.h, $$0 -> $$0.c, mc::new);
    private final int c;

    public mc(int $$0) {
        this.c = $$0;
    }

    public lx<mc> a() {
        return ly.aZ;
    }

    public int b() {
        return this.c;
    }
}

