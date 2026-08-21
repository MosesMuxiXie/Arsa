/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class ejl
extends ehf {
    public static final MapCodec<ejl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)epw.a.fieldOf("wood_type").forGetter(ehf::d), ejl.x()).apply((Applicative)$$0, ejl::new));
    public static final epf<iz> b = edt.f;
    private static final Map<iz, fug> c = fud.c(dzq.a(16.0, 4.5, 12.5, 14.0, 16.0));

    public MapCodec<ejl> a() {
        return a;
    }

    public ejl(epw $$0, eog.d $$1) {
        super($$0, $$1.a($$0.d()));
        this.l((eoh)((eoh)((eoh)this.C.b()).b(b, iz.c)).b(d, false));
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return c.get($$0.c(b));
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        return $$1.a_($$2.a($$0.c(b).g())).e();
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        iz[] $$5;
        eoh $$1 = this.m();
        flb $$2 = $$0.q().b_($$0.a());
        dwo $$3 = $$0.q();
        is $$4 = $$0.a();
        for (iz $$6 : $$5 = $$0.f()) {
            iz $$7;
            if (!$$6.o().d() || !($$1 = (eoh)$$1.b(b, $$7 = $$6.g())).a((dwr)$$3, $$4)) continue;
            return (eoh)$$1.b(d, $$2.a() == flc.c);
        }
        return null;
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$4.g() == $$0.c(b) && !$$0.a($$1, $$3)) {
            return dzs.a.m();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    public float h(eoh $$0) {
        return $$0.c(b).p();
    }

    @Override
    public ftm p(eoh $$0) {
        return c.get($$0.c(b)).a().f();
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
        $$0.a(b, d);
    }
}

