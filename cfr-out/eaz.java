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

public class eaz
extends ecr {
    public static final MapCodec<eaz> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)bex.a.fieldOf("falling_dust_color").forGetter($$0 -> $$0.b), eaz.x()).apply((Applicative)$$02, eaz::new));
    protected final bex b;

    public MapCodec<? extends eaz> a() {
        return a;
    }

    public eaz(bex $$0, eog.d $$1) {
        super($$1);
        this.b = $$0;
    }

    @Override
    public int b(eoh $$0, dvt $$1, is $$2) {
        return this.b.a();
    }
}

