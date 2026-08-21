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

public class ehx
extends eiv
implements dzh {
    public static final MapCodec<ehx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)dkr.q.fieldOf("color").forGetter(ehx::b), ehx.x()).apply((Applicative)$$0, ehx::new));
    private final dkr c;

    public MapCodec<ehx> a() {
        return a;
    }

    public ehx(dkr $$0, eog.d $$1) {
        super($$1);
        this.c = $$0;
    }

    @Override
    public dkr b() {
        return this.c;
    }
}

