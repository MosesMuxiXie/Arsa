/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class ecm
extends dyk<ema>
implements ehg {
    public static final MapCodec<ecm> b = ecm.b(ecm::new);
    public static final epf<iz> c = edt.f;
    public static final eoy d = eox.I;
    private static final fug e = dzq.b(14.0, 0.0, 14.0);
    private static final yh f = yh.c("container.enderchest");

    @Override
    public MapCodec<ecm> a() {
        return b;
    }

    protected ecm(eog.d $$0) {
        super($$0, () -> eld.d);
        this.l((eoh)((eoh)((eoh)this.C.b()).b(c, iz.c)).b(d, false));
    }

    @Override
    public eca.c<? extends elj> a(eoh $$0, dwo $$1, is $$2, boolean $$3) {
        return eca.b::b;
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return e;
    }

    @Override
    public eoh a(dpu $$0) {
        flb $$1 = $$0.q().b_($$0.a());
        return (eoh)((eoh)this.m().b(c, $$0.g().g())).b(d, $$1.a() == flc.c);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected cdc a(eoh $$0, dwo $$12, is $$22, ddm $$32, fti $$4) {
        diy $$5 = $$32.gZ();
        elb $$6 = $$12.c_($$22);
        if ($$5 == null || !($$6 instanceof ema)) {
            return cdc.a;
        }
        ema $$7 = (ema)$$6;
        is $$9 = $$22.d();
        if ($$12.a_($$9).d($$12, $$9)) {
            return cdc.a;
        }
        if ($$12 instanceof axf) {
            void $$8;
            axf $$10 = (axf)$$12;
            $$5.a((ema)$$8);
            $$32.a(new cdl(($$1, $$2, $$3) -> dhs.a($$1, $$2, $$5), f));
            $$32.a(bdk.al);
            dbk.a($$10, $$32, true);
        }
        return cdc.a;
    }

    @Override
    public elb a(is $$0, eoh $$1) {
        return new ema($$0, $$1);
    }

    @Override
    public <T extends elb> @Nullable elc<T> a(dwo $$0, eoh $$1, eld<T> $$2) {
        return $$0.B_() ? ecm.a($$2, eld.d, ema::a) : null;
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
        for (int $$4 = 0; $$4 < 3; ++$$4) {
            int $$5 = $$3.a(2) * 2 - 1;
            int $$6 = $$3.a(2) * 2 - 1;
            double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
            double $$8 = (float)$$2.v() + $$3.i();
            double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
            double $$10 = $$3.i() * (float)$$5;
            double $$11 = ((double)$$3.i() - 0.5) * 0.125;
            double $$12 = $$3.i() * (float)$$6;
            $$1.a(ly.ag, $$7, $$8, $$9, $$10, $$11, $$12);
        }
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(c, $$1.a($$0.c(c)));
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        return $$0.a($$1.a($$0.c(c)));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(c, d);
    }

    @Override
    protected flb b_(eoh $$0) {
        if ($$0.c(d).booleanValue()) {
            return flc.c.a(false);
        }
        return super.b_($$0);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$0.c(d).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        elb $$4 = $$1.c_($$2);
        if ($$4 instanceof ema) {
            ((ema)$$4).a();
        }
    }
}

