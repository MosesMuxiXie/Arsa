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

public class ekd
extends eee
implements ejq {
    public static final MapCodec<ekd> d = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)ejq.a.f.fieldOf("weathering_state").forGetter(ekd::q), ekd.x()).apply((Applicative)$$0, ekd::new));
    private final ejq.a e;

    public MapCodec<ekd> a() {
        return d;
    }

    protected ekd(ejq.a $$0, eog.d $$1) {
        super($$1);
        this.e = $$0;
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
        return this.e;
    }

    @Override
    public /* synthetic */ Enum c() {
        return this.q();
    }
}

