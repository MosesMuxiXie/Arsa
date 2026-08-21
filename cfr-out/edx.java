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

public class edx
extends edw {
    public static final MapCodec<edx> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)mi.e.q().fieldOf("host").forGetter(edw::b), edx.x()).apply((Applicative)$$0, edx::new));

    public MapCodec<edx> a() {
        return b;
    }

    public edx(dzq $$0, eog.d $$1) {
        super($$0, $$1);
        this.l((eoh)this.m().b(egl.d, iz.a.b));
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        return egl.b($$0, $$1);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{egl.d});
    }

    @Override
    public eoh a(dpu $$0) {
        return (eoh)this.m().b(egl.d, $$0.k().o());
    }
}

