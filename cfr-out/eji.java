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

public class eji
extends dyh {
    public static final MapCodec<eji> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)dkr.q.fieldOf("color").forGetter(dyh::b), eji.x()).apply((Applicative)$$0, eji::new));
    public static final epf<iz> b = edt.f;
    private static final Map<iz, fug> c = fud.c(dzq.a(16.0, 0.0, 12.5, 14.0, 16.0));

    public MapCodec<eji> a() {
        return a;
    }

    public eji(dkr $$0, eog.d $$1) {
        super($$0, $$1);
        this.l((eoh)((eoh)this.C.b()).b(b, iz.c));
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        return $$1.a_($$2.a($$0.c(b).g())).e();
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$4 == $$0.c(b).g() && !$$0.a($$1, $$3)) {
            return dzs.a.m();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return c.get($$0.c(b));
    }

    @Override
    public eoh a(dpu $$0) {
        iz[] $$4;
        eoh $$1 = this.m();
        dwo $$2 = $$0.q();
        is $$3 = $$0.a();
        for (iz $$5 : $$4 = $$0.f()) {
            iz $$6;
            if (!$$5.o().d() || !($$1 = (eoh)$$1.b(b, $$6 = $$5.g())).a((dwr)$$2, $$3)) continue;
            return $$1;
        }
        return null;
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(b, $$1.a($$0.c(b)));
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        return $$0.a($$1.a($$0.c(b)));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{b});
    }
}

