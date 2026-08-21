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

public class eia
extends ehf {
    public static final MapCodec<eia> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)epw.a.fieldOf("wood_type").forGetter(ehf::d), eia.x()).apply((Applicative)$$0, eia::new));
    public static final eph b = eox.bf;

    public MapCodec<eia> a() {
        return a;
    }

    public eia(epw $$0, eog.d $$1) {
        super($$0, $$1.a($$0.d()));
        this.l((eoh)((eoh)((eoh)this.C.b()).b(b, 0)).b(d, false));
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        return $$1.a_($$2.e()).e();
    }

    @Override
    public eoh a(dpu $$0) {
        flb $$1 = $$0.q().b_($$0.a());
        return (eoh)((eoh)this.m().b(b, epn.a($$0.i() + 180.0f))).b(d, $$1.a() == flc.c);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$4 == iz.a && !this.a($$0, $$1, $$3)) {
            return dzs.a.m();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    public float h(eoh $$0) {
        return epn.b($$0.c(b));
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
        $$0.a(b, d);
    }
}

