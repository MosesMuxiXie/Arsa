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

public class eju
extends eas
implements ejq {
    public static final MapCodec<eju> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)ejq.a.f.fieldOf("weathering_state").forGetter(eju::q), eju.x()).apply((Applicative)$$0, eju::new));
    private final ejq.a f;

    public MapCodec<eju> a() {
        return e;
    }

    protected eju(ejq.a $$0, eog.d $$1) {
        super($$1);
        this.f = $$0;
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
        return this.f;
    }

    @Override
    public /* synthetic */ Enum c() {
        return this.q();
    }
}

