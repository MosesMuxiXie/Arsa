/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.util.function.Function;

public class ect
extends ebq {
    public static final MapCodec<ect> g = ect.b(ect::new);
    private final Function<eoh, fug> h;

    public MapCodec<ect> a() {
        return g;
    }

    public ect(eog.d $$0) {
        super(4.0f, 16.0f, 4.0f, 16.0f, 24.0f, $$0);
        this.l((eoh)((eoh)((eoh)((eoh)((eoh)((eoh)this.C.b()).b(a, false)).b(b, false)).b(c, false)).b(d, false)).b(e, false));
        this.h = this.a(4.0f, 16.0f, 2.0f, 6.0f, 15.0f);
    }

    @Override
    protected fug d_(eoh $$0) {
        return this.h.apply($$0);
    }

    @Override
    protected fug c(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return this.a($$0, $$1, $$2, $$3);
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }

    public boolean a(eoh $$0, boolean $$1, iz $$2) {
        dzq $$3 = $$0.b();
        boolean $$4 = this.p($$0);
        boolean $$5 = $$3 instanceof ecu && ecu.a($$0, $$2);
        return !ect.k($$0) && $$1 || $$4 || $$5;
    }

    private boolean p(eoh $$0) {
        return $$0.a(bdp.S) && $$0.a(bdp.k) == this.m().a(bdp.k);
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        return !$$1.B_() ? dmd.a($$3, $$1, $$2) : cdc.e;
    }

    @Override
    public eoh a(dpu $$0) {
        dwo $$1 = $$0.q();
        is $$2 = $$0.a();
        flb $$3 = $$0.q().b_($$0.a());
        is $$4 = $$2.f();
        is $$5 = $$2.i();
        is $$6 = $$2.g();
        is $$7 = $$2.h();
        eoh $$8 = $$1.a_($$4);
        eoh $$9 = $$1.a_($$5);
        eoh $$10 = $$1.a_($$6);
        eoh $$11 = $$1.a_($$7);
        return (eoh)((eoh)((eoh)((eoh)((eoh)super.a($$0).b(a, this.a($$8, $$8.c((dvt)$$1, $$4, iz.d), iz.d))).b(b, this.a($$9, $$9.c((dvt)$$1, $$5, iz.e), iz.e))).b(c, this.a($$10, $$10.c((dvt)$$1, $$6, iz.c), iz.c))).b(d, this.a($$11, $$11.c((dvt)$$1, $$7, iz.f), iz.f))).b(e, $$3.a() == flc.c);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$0.c(e).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        if ($$4.o().d()) {
            return (eoh)$$0.b((epk)f.get($$4), this.a($$6, $$6.c((dvt)$$1, $$5, $$4.g()), $$4.g()));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(a, b, d, c, e);
    }
}

