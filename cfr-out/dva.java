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

public class dva
extends dvh {
    public static final MapCodec<dva> a = RecordCodecBuilder.mapCodec($$02 -> dva.a($$02).and((App)cg.a.fieldOf("item_filter").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, dva::new));
    private final cg c;

    private dva(dvf $$0, cg $$1) {
        super($$0);
        this.c = $$1;
    }

    public MapCodec<dva> a() {
        return a;
    }

    @Override
    protected dve a(dve $$0) {
        return $$0.a(this.c);
    }
}

