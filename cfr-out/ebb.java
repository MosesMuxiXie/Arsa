/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class ebb
extends ebv
implements ecn {
    public static final MapCodec<ebb> a = ebb.b(ebb::new);
    public static final epf<epa> b = eox.bi;

    public MapCodec<ebb> a() {
        return a;
    }

    public ebb(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)((eoh)this.C.b()).b(f, iz.c)).b(c, false)).b(b, epa.a));
    }

    @Override
    protected int h(eoh $$0) {
        return 2;
    }

    @Override
    public eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$4 == iz.a && !this.a($$1, $$5, $$6)) {
            return dzs.a.m();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected int a(dvt $$0, is $$1, eoh $$2) {
        elb $$3 = $$0.c_($$1);
        if ($$3 instanceof eln) {
            return ((eln)$$3).a();
        }
        return 0;
    }

    private int e(dwo $$0, is $$1, eoh $$2) {
        int $$3 = this.b($$0, $$1, $$2);
        if ($$3 == 0) {
            return 0;
        }
        int $$4 = this.a((dxg)$$0, $$1, $$2);
        if ($$4 > $$3) {
            return 0;
        }
        if ($$2.c(b) == epa.b) {
            return $$3 - $$4;
        }
        return $$3;
    }

    @Override
    protected boolean a(dwo $$0, is $$1, eoh $$2) {
        int $$3 = this.b($$0, $$1, $$2);
        if ($$3 == 0) {
            return false;
        }
        int $$4 = this.a((dxg)$$0, $$1, $$2);
        if ($$3 > $$4) {
            return true;
        }
        return $$3 == $$4 && $$2.c(b) == epa.a;
    }

    @Override
    protected int b(dwo $$0, is $$1, eoh $$2) {
        int $$3 = super.b($$0, $$1, $$2);
        iz $$4 = (iz)$$2.c(f);
        is $$5 = $$1.a($$4);
        eoh $$6 = $$0.a_($$5);
        if ($$6.q()) {
            $$3 = $$6.a($$0, $$5, $$4.g());
        } else if ($$3 < 15 && $$6.d($$0, $$5)) {
            $$5 = $$5.a($$4);
            $$6 = $$0.a_($$5);
            czc $$7 = this.a($$0, $$4, $$5);
            int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.z(), $$6.q() ? $$6.a($$0, $$5, $$4.g()) : Integer.MIN_VALUE);
            if ($$8 != Integer.MIN_VALUE) {
                $$3 = $$8;
            }
        }
        return $$3;
    }

    private @Nullable czc a(dwo $$0, iz $$12, is $$2) {
        List<czc> $$3 = $$0.a(czc.class, new fth($$2.u(), $$2.v(), $$2.w(), $$2.u() + 1, $$2.v() + 1, $$2.w() + 1), (? super T $$1) -> $$1.dg() == $$12);
        if ($$3.size() == 1) {
            return $$3.get(0);
        }
        return null;
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        if (!$$3.gL().e) {
            return cdc.e;
        }
        float $$5 = ($$0 = (eoh)$$0.a(b)).c(b) == epa.b ? 0.55f : 0.5f;
        $$1.a((cgk)$$3, $$2, bda.fS, bdb.e, 0.3f, $$5);
        $$1.a($$2, $$0, 2);
        this.f($$1, $$2, $$0);
        return cdc.a;
    }

    @Override
    protected void c(dwo $$0, is $$1, eoh $$2) {
        int $$5;
        if ($$0.af().b($$1, this)) {
            return;
        }
        int $$3 = this.e($$0, $$1, $$2);
        elb $$4 = $$0.c_($$1);
        int n2 = $$5 = $$4 instanceof eln ? ((eln)$$4).a() : 0;
        if ($$3 != $$5 || $$2.c(c).booleanValue() != this.a($$0, $$1, $$2)) {
            fvi $$6 = this.b((dvt)$$0, $$1, $$2) ? fvi.c : fvi.d;
            $$0.a($$1, (dzq)this, 2, $$6);
        }
    }

    private void f(dwo $$0, is $$1, eoh $$2) {
        int $$3 = this.e($$0, $$1, $$2);
        elb $$4 = $$0.c_($$1);
        int $$5 = 0;
        if ($$4 instanceof eln) {
            eln $$6 = (eln)$$4;
            $$5 = $$6.a();
            $$6.a($$3);
        }
        if ($$5 != $$3 || $$2.c(b) == epa.a) {
            boolean $$7 = this.a($$0, $$1, $$2);
            boolean $$8 = $$2.c(c);
            if ($$8 && !$$7) {
                $$0.a($$1, (eoh)$$2.b(c, false), 2);
            } else if (!$$8 && $$7) {
                $$0.a($$1, (eoh)$$2.b(c, true), 2);
            }
            this.d($$0, $$1, $$2);
        }
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        this.f($$1, $$2, $$0);
    }

    @Override
    protected boolean a(eoh $$0, dwo $$1, is $$2, int $$3, int $$4) {
        super.a($$0, $$1, $$2, $$3, $$4);
        elb $$5 = $$1.c_($$2);
        return $$5 != null && $$5.a_($$3, $$4);
    }

    @Override
    public elb a(is $$0, eoh $$1) {
        return new eln($$0, $$1);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(f, b, c);
    }
}

