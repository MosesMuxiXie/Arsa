/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class efk
extends ebw {
    public static final MapCodec<efk> b = efk.b(efk::new);
    public static final eoy c = eox.A;

    public MapCodec<efk> a() {
        return b;
    }

    public efk(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)this.C.b()).b(a, iz.d)).b(c, false));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(a, c);
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(a, $$1.a((iz)$$0.c(a)));
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        return $$0.a($$1.a((iz)$$0.c(a)));
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if ($$0.c(c).booleanValue()) {
            $$1.a($$2, (eoh)$$0.b(c, false), 2);
        } else {
            $$1.a($$2, (eoh)$$0.b(c, true), 2);
            $$1.a($$2, (dzq)this, 2);
        }
        this.a((dwo)$$1, $$2, $$0);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$0.c(a) == $$4 && !$$0.c(c).booleanValue()) {
            this.a($$1, $$2, $$3);
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    private void a(dwr $$0, dxd $$1, is $$2) {
        if (!$$0.B_() && !$$1.af().a($$2, this)) {
            $$1.a($$2, this, 2);
        }
    }

    protected void a(dwo $$0, is $$1, eoh $$2) {
        iz $$3 = (iz)$$2.c(a);
        is $$4 = $$1.a($$3.g());
        fmj $$5 = fmf.a($$0, $$3.g(), null);
        $$0.b($$4, this, $$5);
        $$0.a($$4, (dzq)this, $$3, $$5);
    }

    @Override
    protected boolean f_(eoh $$0) {
        return true;
    }

    @Override
    protected int b(eoh $$0, dvt $$1, is $$2, iz $$3) {
        return $$0.a($$1, $$2, $$3);
    }

    @Override
    protected int a(eoh $$0, dvt $$1, is $$2, iz $$3) {
        if ($$0.c(c).booleanValue() && $$0.c(a) == $$3) {
            return 15;
        }
        return 0;
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, eoh $$3, boolean $$4) {
        if ($$0.a($$3.b())) {
            return;
        }
        if (!$$1.B_() && $$0.c(c).booleanValue() && !$$1.af().a($$2, this)) {
            eoh $$5 = (eoh)$$0.b(c, false);
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
        }
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, boolean $$3) {
        if ($$0.c(c).booleanValue() && $$1.q().a($$2, this)) {
            this.a((dwo)$$1, $$2, (eoh)$$0.b(c, false));
        }
    }

    @Override
    public eoh a(dpu $$0) {
        return (eoh)this.m().b(a, $$0.d().g().g());
    }
}

