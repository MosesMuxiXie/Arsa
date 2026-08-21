/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class dzb
extends dyy {
    public static final MapCodec<dzb> c = dzb.b(dzb::new);
    public static final epf<iz> d = edt.f;
    private static final Map<iz, fug> e = fud.c(dzq.b(16.0, 8.0, 5.0, 16.0));

    public MapCodec<? extends dzb> a() {
        return c;
    }

    protected dzb(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)this.C.b()).b(d, iz.c)).b(b, true));
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return e.get($$0.c(d));
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
        $$0.a(d, b);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$0.c(b).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        if ($$4.g() == $$0.c(d) && !$$0.a($$1, $$3)) {
            return dzs.a.m();
        }
        return $$0;
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        iz $$3 = $$0.c(d);
        is $$4 = $$2.a($$3.g());
        eoh $$5 = $$1.a_($$4);
        return $$5.c((dvt)$$1, $$4, $$3);
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        iz[] $$4;
        eoh $$1 = super.a($$0);
        dwo $$2 = $$0.q();
        is $$3 = $$0.a();
        for (iz $$5 : $$4 = $$0.f()) {
            if (!$$5.o().d() || !($$1 = (eoh)$$1.b(d, $$5.g())).a((dwr)$$2, $$3)) continue;
            return $$1;
        }
        return null;
    }
}

