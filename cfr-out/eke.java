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

public class eke
extends een
implements ejq {
    public static final MapCodec<eke> f = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)ejq.a.f.fieldOf("weathering_state").forGetter(eke::q), eke.x()).apply((Applicative)$$0, eke::new));
    private final ejq.a g;

    public MapCodec<eke> a() {
        return f;
    }

    protected eke(ejq.a $$0, eog.d $$1) {
        super($$1);
        this.g = $$0;
    }

    @Override
    protected void b(eoh $$0, axf $$1, is $$2, bgr $$3) {
        this.a_($$0, $$1, $$2, $$3);
    }

    @Override
    protected boolean f(eoh $$0) {
        return ejq.c($$0.b()).isPresent();
    }

    public ejq.a q() {
        return this.g;
    }

    @Override
    public /* synthetic */ Enum c() {
        return this.q();
    }
}

