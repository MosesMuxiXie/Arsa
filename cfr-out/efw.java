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

public class efw
extends dze {
    public static final MapCodec<efw> c = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)eow.a.fieldOf("block_set_type").forGetter($$0 -> $$0.b), efw.x()).apply((Applicative)$$02, efw::new));
    public static final eoy d = eox.A;

    public MapCodec<efw> a() {
        return c;
    }

    protected efw(eow $$0, eog.d $$1) {
        super($$1, $$0);
        this.l((eoh)((eoh)this.C.b()).b(d, false));
    }

    @Override
    protected int h(eoh $$0) {
        return $$0.c(d) != false ? 15 : 0;
    }

    @Override
    protected eoh a(eoh $$0, int $$1) {
        return (eoh)$$0.b(d, $$1 > 0);
    }

    @Override
    protected int b(dwo $$0, is $$1) {
        Class<cgk> $$2 = switch (this.b.f()) {
            default -> throw new MatchException(null, null);
            case eow.a.a -> cgk.class;
            case eow.a.b -> chl.class;
        };
        return efw.a($$0, a.a($$1), $$2) > 0 ? 15 : 0;
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{d});
    }
}

