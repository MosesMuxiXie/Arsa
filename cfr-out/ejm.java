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
import java.util.Map;

public class ejm
extends dym {
    public static final MapCodec<ejm> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)ehh.a.b.fieldOf("kind").forGetter(dym::b), ejm.x()).apply((Applicative)$$0, ejm::new));
    public static final epf<iz> d = edt.f;
    private static final Map<iz, fug> b = fud.c(dzq.c(8.0, 8.0, 16.0));

    public MapCodec<? extends ejm> a() {
        return c;
    }

    protected ejm(ehh.a $$0, eog.d $$1) {
        super($$0, $$1);
        this.l((eoh)this.m().b(d, iz.c));
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return b.get($$0.c(d));
    }

    @Override
    public eoh a(dpu $$0) {
        iz[] $$4;
        eoh $$1 = super.a($$0);
        dwo $$2 = $$0.q();
        is $$3 = $$0.a();
        for (iz $$5 : $$4 = $$0.f()) {
            if (!$$5.o().d()) continue;
            iz $$6 = $$5.g();
            $$1 = (eoh)$$1.b(d, $$6);
            if ($$2.a_($$3.a($$5)).a($$0)) continue;
            return $$1;
        }
        return null;
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(d, $$1.a($$0.c(d)));
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        return $$0.a($$1.a($$0.c(d)));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        super.a($$0);
        $$0.a(new epk[]{d});
    }
}

