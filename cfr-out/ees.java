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

public class ees
extends eir
implements dzt {
    public static final MapCodec<ees> f = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)bfm.a(0.0f, 1.0f).fieldOf("leaf_particle_chance").forGetter($$0 -> Float.valueOf($$0.e)), ees.x()).apply((Applicative)$$02, ees::new));

    public MapCodec<ees> a() {
        return f;
    }

    public ees(float $$0, eog.d $$1) {
        super($$0, $$1);
    }

    @Override
    public boolean a(dwr $$0, is $$1, eoh $$2) {
        return $$0.a_($$1.e()).l();
    }

    @Override
    public boolean a(dwo $$0, bgr $$1, is $$2, eoh $$3) {
        return true;
    }

    @Override
    public void a(axf $$0, bgr $$1, is $$2, eoh $$3) {
        $$0.a($$2.e(), eet.c(), 2);
    }

    @Override
    public is a(is $$0) {
        return $$0.e();
    }
}

