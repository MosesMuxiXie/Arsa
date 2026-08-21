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

public class eed
extends dzq
implements ehg {
    public static final MapCodec<eed> a = eed.b(eed::new);
    public static final epf<iz> b = edt.f;
    public static final eoy c = eox.I;
    public static final Map<iz, fug> d = fud.c(dzq.c(16.0, 13.0, 16.0));

    public MapCodec<eed> a() {
        return a;
    }

    protected eed(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)this.C.b()).b(b, iz.c)).b(c, false));
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return d.get($$0.c(b));
    }

    private boolean a(dvt $$0, is $$1, iz $$2) {
        eoh $$3 = $$0.a_($$1);
        return $$3.c($$0, $$1, $$2);
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        iz $$3 = $$0.c(b);
        return this.a($$1, $$2.a($$3.g()), $$3);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$4.g() == $$0.c(b) && !$$0.a($$1, $$3)) {
            return dzs.a.m();
        }
        if ($$0.c(c).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        eoh $$1;
        if (!$$0.c() && ($$1 = $$0.q().a_($$0.a().a($$0.k().g()))).a(this) && $$1.c(b) == $$0.k()) {
            return null;
        }
        eoh $$2 = this.m();
        dwo $$3 = $$0.q();
        is $$4 = $$0.a();
        flb $$5 = $$0.q().b_($$0.a());
        for (iz $$6 : $$0.f()) {
            if (!$$6.o().d() || !($$2 = (eoh)$$2.b(b, $$6.g())).a((dwr)$$3, $$4)) continue;
            return (eoh)$$2.b(c, $$5.a() == flc.c);
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
        $$0.a(b, c);
    }

    @Override
    protected flb b_(eoh $$0) {
        if ($$0.c(c).booleanValue()) {
            return flc.c.a(false);
        }
        return super.b_($$0);
    }
}

