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

public class ekb
extends ehz
implements ejq {
    public static final MapCodec<ekb> g = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)ejq.a.f.fieldOf("weathering_state").forGetter(eat::c), (App)eoh.a.fieldOf("base_state").forGetter($$0 -> $$0.f), ekb.x()).apply((Applicative)$$02, ekb::new));
    private final ejq.a h;

    public MapCodec<ekb> a() {
        return g;
    }

    public ekb(ejq.a $$0, eoh $$1, eog.d $$2) {
        super($$1, $$2);
        this.h = $$0;
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
        return this.h;
    }

    @Override
    public /* synthetic */ Enum c() {
        return this.q();
    }
}

