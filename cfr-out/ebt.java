/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class ebt
extends dzc
implements ehg {
    public static final MapCodec<ebt> a = ebt.b(ebt::new);
    public static final amo b = amo.b("sherds");
    public static final epf<iz> c = eox.T;
    public static final eoy d = eox.bB;
    public static final eoy e = eox.I;
    private static final fug f = dzq.b(14.0, 0.0, 16.0);

    public MapCodec<ebt> a() {
        return a;
    }

    protected ebt(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)((eoh)this.C.b()).b(c, iz.c)).b(e, false)).b(d, false));
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$0.c(e).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    public eoh a(dpu $$0) {
        flb $$1 = $$0.q().b_($$0.a());
        return (eoh)((eoh)((eoh)this.m().b(c, $$0.g())).b(e, $$1.a() == flc.c)).b(d, false);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected cdc a(dlt $$0, eoh $$1, dwo $$2, is $$3, ddm $$4, cdb $$5, fti $$6) {
        void $$8;
        elb elb2 = $$2.c_($$3);
        if (!(elb2 instanceof elu)) {
            return cdc.e;
        }
        elu $$7 = (elu)elb2;
        if ($$2.B_()) {
            return cdc.a;
        }
        dlt $$9 = $$8.g();
        if (!$$0.f() && ($$9.f() || dlt.c($$9, $$0) && $$9.N() < $$9.k())) {
            float $$12;
            $$8.a(elu.a.a);
            $$4.b(bdk.c.b($$0.h()));
            dlt $$10 = $$0.b(1, (chl)$$4);
            if ($$8.c()) {
                $$8.b($$10);
                float $$11 = (float)$$10.N() / (float)$$10.k();
            } else {
                $$9.g(1);
                $$12 = (float)$$9.N() / (float)$$9.k();
            }
            $$2.a(null, $$3, bda.hX, bdb.e, 1.0f, 0.7f + 0.5f * $$12);
            if ($$2 instanceof axf) {
                axf $$13 = (axf)$$2;
                $$13.a(ly.bb, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
            }
            $$8.e();
            $$2.a((cgk)$$4, etk.c, $$3);
            return cdc.a;
        }
        return cdc.f;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        void $$6;
        elb elb2 = $$1.c_($$2);
        if (!(elb2 instanceof elu)) {
            return cdc.e;
        }
        elu $$5 = (elu)elb2;
        $$1.a(null, $$2, bda.hY, bdb.e, 1.0f, 1.0f);
        $$6.a(elu.a.b);
        $$1.a((cgk)$$3, etk.c, $$2);
        return cdc.a;
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return f;
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(c, e, d);
    }

    @Override
    public @Nullable elb a(is $$0, eoh $$1) {
        return new elu($$0, $$1);
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, boolean $$3) {
        ccy.a($$0, $$1, $$2);
    }

    @Override
    protected List<dlt> a(eoh $$0, fod.a $$12) {
        elb $$2 = $$12.b(fqx.j);
        if ($$2 instanceof elu) {
            elu $$3 = (elu)$$2;
            $$12.a(b, (Consumer<dlt> $$1) -> {
                for (dlp $$2 : $$3.m().a()) {
                    $$1.accept($$2.m());
                }
            });
        }
        return super.a($$0, $$12);
    }

    @Override
    public eoh a(dwo $$0, is $$1, eoh $$2, ddm $$3) {
        dlt $$4 = $$3.fx();
        eoh $$5 = $$2;
        if ($$4.a(bdy.cg) && !dsq.a($$4, bds.r)) {
            $$5 = (eoh)$$2.b(d, true);
            $$0.a($$1, $$5, 260);
        }
        return super.a($$0, $$1, $$5, $$3);
    }

    @Override
    protected flb b_(eoh $$0) {
        if ($$0.c(e).booleanValue()) {
            return flc.c.a(false);
        }
        return super.b_($$0);
    }

    @Override
    protected ehs h_(eoh $$0) {
        if ($$0.c(d).booleanValue()) {
            return ehs.bg;
        }
        return ehs.bf;
    }

    @Override
    protected void a(dwo $$0, eoh $$1, fti $$2, dec $$3) {
        axf $$5;
        is $$4 = $$2.b();
        if ($$0 instanceof axf && $$3.c($$5 = (axf)$$0, $$4) && $$3.a($$5)) {
            $$0.a($$4, (eoh)$$1.b(d, true), 260);
            $$0.a($$4, true, $$3);
        }
    }

    @Override
    protected dlt a(dwr $$0, is $$1, eoh $$2, boolean $$3) {
        elb elb2 = $$0.c_($$1);
        if (elb2 instanceof elu) {
            elu $$4 = (elu)elb2;
            eml $$5 = $$4.m();
            return elu.a($$5);
        }
        return super.a($$0, $$1, $$2, $$3);
    }

    @Override
    protected boolean c_(eoh $$0) {
        return true;
    }

    @Override
    protected int a(eoh $$0, dwo $$1, is $$2, iz $$3) {
        return dhi.a($$1.c_($$2));
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(c, $$1.a($$0.c(c)));
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        return $$0.a($$1.a($$0.c(c)));
    }
}

