/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.google.common.collect.Maps;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dyv
extends dyh {
    public static final MapCodec<dyv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)dkr.q.fieldOf("color").forGetter(dyh::b), dyv.x()).apply((Applicative)$$0, dyv::new));
    public static final eph b = eox.bf;
    private static final Map<dkr, dzq> c = Maps.newHashMap();
    private static final fug d = dzq.b(8.0, 0.0, 16.0);

    public MapCodec<dyv> a() {
        return a;
    }

    public dyv(dkr $$0, eog.d $$1) {
        super($$0, $$1);
        this.l((eoh)((eoh)this.C.b()).b(b, 0));
        c.put($$0, this);
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        return $$1.a_($$2.e()).e();
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return d;
    }

    @Override
    public eoh a(dpu $$0) {
        return (eoh)this.m().b(b, epn.a($$0.i() + 180.0f));
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$4 == iz.a && !$$0.a($$1, $$3)) {
            return dzs.a.m();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(b, $$1.a($$0.c(b), 16));
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        return (eoh)$$0.b(b, $$1.a($$0.c(b), 16));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{b});
    }

    public static dzq a(dkr $$0) {
        return c.getOrDefault($$0, dzs.jB);
    }
}

