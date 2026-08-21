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

public class ekn
extends eaj {
    public static final MapCodec<ekn> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)dkr.q.fieldOf("color").forGetter(ekn::b), ekn.x()).apply((Applicative)$$0, ekn::new));
    private final dkr c;

    public MapCodec<ekn> a() {
        return b;
    }

    protected ekn(dkr $$0, eog.d $$1) {
        super($$1);
        this.c = $$0;
    }

    public dkr b() {
        return this.c;
    }
}

