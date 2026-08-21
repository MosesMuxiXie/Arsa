/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class egg
extends ebv {
    public static final MapCodec<egg> a = egg.b(egg::new);
    public static final eoy b = eox.v;
    public static final eph d = eox.aE;

    public MapCodec<egg> a() {
        return a;
    }

    protected egg(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)((eoh)((eoh)this.C.b()).b(f, iz.c)).b(d, 1)).b(b, false)).b(c, false));
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        if (!$$3.gL().e) {
            return cdc.e;
        }
        $$1.a($$2, (eoh)$$0.a(d), 3);
        return cdc.a;
    }

    @Override
    protected int h(eoh $$0) {
        return $$0.c(d) * 2;
    }

    @Override
    public eoh a(dpu $$0) {
        eoh $$1 = super.a($$0);
        return (eoh)$$1.b(b, this.b((dwr)$$0.q(), $$0.a(), $$1));
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$4 == iz.a && !this.a($$1, $$5, $$6)) {
            return dzs.a.m();
        }
        if (!$$1.B_() && $$4.o() != ((iz)$$0.c(f)).o()) {
            return (eoh)$$0.b(b, this.b($$1, $$3, $$0));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    public boolean b(dwr $$0, is $$1, eoh $$2) {
        return this.a((dxg)$$0, $$1, $$2) > 0;
    }

    @Override
    protected boolean b() {
        return true;
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
        if (!$$0.c(c).booleanValue()) {
            return;
        }
        iz $$4 = (iz)$$0.c(f);
        double $$5 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
        double $$6 = (double)$$2.v() + 0.4 + ($$3.j() - 0.5) * 0.2;
        double $$7 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
        float $$8 = -5.0f;
        if ($$3.h()) {
            $$8 = $$0.c(d) * 2 - 1;
        }
        double $$9 = ($$8 /= 16.0f) * (float)$$4.j();
        double $$10 = $$8 * (float)$$4.l();
        $$1.a(ls.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(f, d, b, c);
    }
}

