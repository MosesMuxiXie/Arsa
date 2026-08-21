/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Optional;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class efd
extends dzq
implements efr {
    private static final Logger c = LogUtils.getLogger();
    public static final MapCodec<efd> a = efd.b(efd::new);
    public static final epf<iz.a> b = eox.J;
    private static final Map<iz.a, fug> d = fud.a(dzq.a(4.0, 16.0, 0.0, 16.0));

    public MapCodec<efd> a() {
        return a;
    }

    public efd(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)this.C.b()).b(b, iz.a.a));
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return d.get($$0.c(b));
    }

    @Override
    protected void b(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if ($$1.O() && $$1.c().a(ceg.E, $$2).booleanValue() && $$3.a(2000) < $$1.av().a() && $$1.i($$2)) {
            dcp $$4;
            while ($$1.a_($$2).a(this)) {
                $$2 = $$2.e();
            }
            if ($$1.a_($$2).a((dvt)$$1, $$2, cgu.ca) && ($$4 = cgu.ca.a($$1, $$2.d(), cgt.d)) != null) {
                $$4.aM();
                cgk $$5 = $$4.dz();
                if ($$5 != null) {
                    $$5.aM();
                }
            }
        }
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        boolean $$10;
        iz.a $$8 = $$4.o();
        iz.a $$9 = $$0.c(b);
        boolean bl2 = $$10 = $$9 != $$8 && $$8.d();
        if ($$10 || $$6.a(this) || fma.a((dvt)$$1, $$3, $$9).b()) {
            return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
        }
        return dzs.a.m();
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, cgk $$3, chc $$4, boolean $$5) {
        if ($$3.o(false)) {
            $$3.a(this, $$2);
        }
    }

    @Override
    public int a(axf $$0, cgk $$1) {
        if ($$1 instanceof ddm) {
            ddm $$2 = (ddm)$$1;
            return Math.max(0, $$0.U().a($$2.gL().a ? eua.I : eua.J));
        }
        return 0;
    }

    @Override
    public @Nullable fmb a(axf $$0, cgk $$1, is $$2) {
        amt<dwo> $$3 = $$0.aq() == dwo.i ? dwo.h : dwo.i;
        axf $$4 = $$0.s().a($$3);
        if ($$4 == null) {
            return null;
        }
        boolean $$5 = $$4.aq() == dwo.i;
        eqa $$6 = $$4.w();
        double $$7 = esh.a($$0.F_(), $$4.F_());
        is $$8 = $$6.b($$1.dP() * $$7, $$1.dR(), $$1.dV() * $$7);
        return this.a($$4, $$1, $$2, $$8, $$5, $$6);
    }

    private @Nullable fmb a(axf $$0, cgk $$12, is $$22, is $$3, boolean $$4, eqa $$5) {
        fmb.a $$14;
        ber.a $$13;
        Optional<is> $$6 = $$0.t().a($$3, $$4, $$5);
        if ($$6.isPresent()) {
            is $$7 = $$6.get();
            eoh $$8 = $$0.a_($$7);
            ber.a $$9 = ber.a($$7, $$8.c(eox.J), 21, iz.a.b, 21, (is $$2) -> $$0.a_((is)$$2) == $$8);
            fmb.a $$10 = fmb.b.then($$1 -> $$1.f($$7));
        } else {
            iz.a $$11 = $$12.ao().a_($$22).d(b).orElse(iz.a.a);
            Optional<ber.a> $$122 = $$0.t().a($$3, $$11);
            if ($$122.isEmpty()) {
                c.error("Unable to create a portal, likely target out of worldborder");
                return null;
            }
            $$13 = $$122.get();
            $$14 = fmb.b.then(fmb.c);
        }
        return efd.a($$12, $$22, $$13, $$0, $$14);
    }

    private static fmb a(cgk $$0, is $$1, ber.a $$22, axf $$3, fmb.a $$4) {
        ftm $$10;
        iz.a $$9;
        eoh $$5 = $$0.ao().a_($$1);
        if ($$5.b(eox.J)) {
            iz.a $$6 = $$5.c(eox.J);
            ber.a $$7 = ber.a($$1, $$6, 21, iz.a.b, 21, (is $$2) -> $$0.ao().a_((is)$$2) == $$5);
            ftm $$8 = $$0.a($$6, $$7);
        } else {
            $$9 = iz.a.a;
            $$10 = new ftm(0.5, 0.0, 0.0);
        }
        return efd.a($$3, $$22, $$9, $$10, $$0, $$4);
    }

    private static fmb a(axf $$0, ber.a $$1, iz.a $$2, ftm $$3, cgk $$4, fmb.a $$5) {
        is $$6 = $$1.a;
        eoh $$7 = $$0.a_($$6);
        iz.a $$8 = $$7.d(eox.J).orElse(iz.a.a);
        double $$9 = $$1.b;
        double $$10 = $$1.c;
        cgn $$11 = $$4.a($$4.aF());
        int $$12 = $$2 == $$8 ? 0 : 90;
        double $$13 = (double)$$11.a() / 2.0 + ($$9 - (double)$$11.a()) * $$3.a();
        double $$14 = ($$10 - (double)$$11.b()) * $$3.b();
        double $$15 = 0.5 + $$3.c();
        boolean $$16 = $$8 == iz.a.a;
        ftm $$17 = new ftm((double)$$6.u() + ($$16 ? $$13 : $$15), (double)$$6.v() + $$14, (double)$$6.w() + ($$16 ? $$15 : $$13));
        ftm $$18 = fma.a($$17, $$0, $$4, $$11);
        return new fmb($$0, $$18, ftm.c, $$12, 0.0f, chz.a(chz.l, chz.k), $$5);
    }

    @Override
    public efr.a b() {
        return efr.a.a;
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
        if ($$3.a(100) == 0) {
            $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, bda.xt, bdb.e, 0.5f, $$3.i() * 0.4f + 0.8f, false);
        }
        for (int $$4 = 0; $$4 < 4; ++$$4) {
            double $$5 = (double)$$2.u() + $$3.j();
            double $$6 = (double)$$2.v() + $$3.j();
            double $$7 = (double)$$2.w() + $$3.j();
            double $$8 = ((double)$$3.i() - 0.5) * 0.5;
            double $$9 = ((double)$$3.i() - 0.5) * 0.5;
            double $$10 = ((double)$$3.i() - 0.5) * 0.5;
            int $$11 = $$3.a(2) * 2 - 1;
            if ($$1.a_($$2.h()).a(this) || $$1.a_($$2.i()).a(this)) {
                $$7 = (double)$$2.w() + 0.5 + 0.25 * (double)$$11;
                $$10 = $$3.i() * 2.0f * (float)$$11;
            } else {
                $$5 = (double)$$2.u() + 0.5 + 0.25 * (double)$$11;
                $$8 = $$3.i() * 2.0f * (float)$$11;
            }
            $$1.a(ly.ag, $$5, $$6, $$7, $$8, $$9, $$10);
        }
    }

    @Override
    protected dlt a(dwr $$0, is $$1, eoh $$2, boolean $$3) {
        return dlt.l;
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        switch ($$1) {
            case d: 
            case b: {
                switch ($$0.c(b)) {
                    case a: {
                        return (eoh)$$0.b(b, iz.a.c);
                    }
                    case c: {
                        return (eoh)$$0.b(b, iz.a.a);
                    }
                }
                return $$0;
            }
        }
        return $$0;
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{b});
    }
}

