/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class edy
extends ebq {
    public static final MapCodec<edy> g = edy.b(edy::new);

    public MapCodec<? extends edy> a() {
        return g;
    }

    protected edy(eog.d $$0) {
        super(2.0f, 16.0f, 2.0f, 16.0f, 16.0f, $$0);
        this.l((eoh)((eoh)((eoh)((eoh)((eoh)((eoh)this.C.b()).b(a, false)).b(b, false)).b(c, false)).b(d, false)).b(e, false));
    }

    @Override
    public eoh a(dpu $$0) {
        dwo $$1 = $$0.q();
        is $$2 = $$0.a();
        flb $$3 = $$0.q().b_($$0.a());
        is $$4 = $$2.f();
        is $$5 = $$2.g();
        is $$6 = $$2.h();
        is $$7 = $$2.i();
        eoh $$8 = $$1.a_($$4);
        eoh $$9 = $$1.a_($$5);
        eoh $$10 = $$1.a_($$6);
        eoh $$11 = $$1.a_($$7);
        return (eoh)((eoh)((eoh)((eoh)((eoh)this.m().b(a, this.a($$8, $$8.c((dvt)$$1, $$4, iz.d)))).b(c, this.a($$9, $$9.c((dvt)$$1, $$5, iz.c)))).b(d, this.a($$10, $$10.c((dvt)$$1, $$6, iz.f)))).b(b, this.a($$11, $$11.c((dvt)$$1, $$7, iz.e)))).b(e, $$3.a() == flc.c);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$0.c(e).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        if ($$4.o().d()) {
            return (eoh)$$0.b((epk)f.get($$4), this.a($$6, $$6.c((dvt)$$1, $$5, $$4.g())));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected fug c(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return fud.a();
    }

    @Override
    protected boolean b(eoh $$0, eoh $$1, iz $$2) {
        if ($$1.a(this) || $$1.a(bdp.ao) && $$0.a(bdp.ao) && $$1.b((epk)f.get($$2.g()))) {
            if (!$$2.o().d()) {
                return true;
            }
            if (((Boolean)$$0.c((epk)f.get($$2))).booleanValue() && ((Boolean)$$1.c((epk)f.get($$2.g()))).booleanValue()) {
                return true;
            }
        }
        return super.b($$0, $$1, $$2);
    }

    public final boolean a(eoh $$0, boolean $$1) {
        return !edy.k($$0) && $$1 || $$0.b() instanceof edy || $$0.a(bdp.I);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(a, b, d, c, e);
    }
}

