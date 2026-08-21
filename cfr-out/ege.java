/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class ege
extends egd {
    public static final MapCodec<ege> f = ege.b(ege::new);
    public static final epf<iz> g = edt.f;
    public static final eoy h = egd.b;

    public MapCodec<ege> a() {
        return f;
    }

    protected ege(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)this.C.b()).b(g, iz.c)).b(h, true));
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return ejn.p($$0);
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        return ejn.b($$1, $$2, $$0.c(g));
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$4.g() == $$0.c(g) && !$$0.a($$1, $$3)) {
            return dzs.a.m();
        }
        return $$0;
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        eoh $$1 = dzs.cM.a($$0);
        return $$1 == null ? null : (eoh)this.m().b(g, $$1.c(g));
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
        if (!$$0.c(h).booleanValue()) {
            return;
        }
        iz $$4 = $$0.c(g).g();
        double $$5 = 0.27;
        double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
        double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
        double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
        $$1.a(ls.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
    }

    @Override
    protected boolean a(dwo $$0, is $$1, eoh $$2) {
        iz $$3 = $$2.c(g).g();
        return $$0.b($$1.a($$3), $$3);
    }

    @Override
    protected int a(eoh $$0, dvt $$1, is $$2, iz $$3) {
        if ($$0.c(h).booleanValue() && $$0.c(g) != $$3) {
            return 15;
        }
        return 0;
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(g, $$1.a($$0.c(g)));
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        return $$0.a($$1.a($$0.c(g)));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(g, h);
    }

    @Override
    protected @Nullable fmj a(dwo $$0, eoh $$1) {
        return fmf.a($$0, $$1.c(g).g(), iz.b);
    }
}

