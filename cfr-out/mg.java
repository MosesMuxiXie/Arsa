/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class mg
implements lw {
    private static final Codec<eto> c = eto.c.validate($$0 -> $$0 instanceof eti ? DataResult.error(() -> "Entity position sources are not allowed") : DataResult.success((Object)$$0));
    public static final MapCodec<mg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)c.fieldOf("destination").forGetter(mg::b), (App)Codec.INT.fieldOf("arrival_in_ticks").forGetter(mg::c)).apply((Applicative)$$0, mg::new));
    public static final aao<xq, mg> b = aao.a(eto.d, mg::b, aam.h, mg::c, mg::new);
    private final eto d;
    private final int e;

    public mg(eto $$0, int $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    public lx<mg> a() {
        return ly.W;
    }

    public eto b() {
        return this.d;
    }

    public int c() {
        return this.e;
    }
}

