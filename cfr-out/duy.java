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

public class duy
extends dvh {
    public static final MapCodec<duy> a = RecordCodecBuilder.mapCodec($$02 -> duy.a($$02).and((App)fnx.e.fieldOf("component").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, duy::new));
    private final fnw<?> c;

    private duy(dvf $$0, fnw<?> $$1) {
        super($$0);
        this.c = $$1;
    }

    public MapCodec<duy> a() {
        return a;
    }

    @Override
    protected dve a(dve $$0) {
        return $$0.a(this.c::a);
    }
}

