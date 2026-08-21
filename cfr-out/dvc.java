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

public class dvc
extends dvh {
    public static final MapCodec<dvc> a = RecordCodecBuilder.mapCodec($$02 -> dvc.a($$02).and((App)bfm.r.fieldOf("limit").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, dvc::new));
    private final int c;

    private dvc(dvf $$0, int $$1) {
        super($$0);
        this.c = $$1;
    }

    public MapCodec<dvc> a() {
        return a;
    }

    @Override
    protected dve a(dve $$0) {
        return $$0.a(this.c);
    }
}

