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

public class ejw
extends ebz
implements ejq {
    public static final MapCodec<ejw> g = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)eow.a.fieldOf("block_set_type").forGetter(ebz::b), (App)ejq.a.f.fieldOf("weathering_state").forGetter(ejw::q), ejw.x()).apply((Applicative)$$0, ejw::new));
    private final ejq.a h;

    public MapCodec<ejw> a() {
        return g;
    }

    protected ejw(eow $$0, ejq.a $$1, eog.d $$2) {
        super($$0, $$2);
        this.h = $$1;
    }

    @Override
    protected void b(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if ($$0.c(ebz.c) == epd.b) {
            this.a_($$0, $$1, $$2, $$3);
        }
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

