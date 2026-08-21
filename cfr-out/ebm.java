/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class ebm
extends dzc {
    public static final MapCodec<ebm> a = ebm.b(ebm::new);
    public static final eoy b = eox.bC;
    public static final eoy c = eox.G;
    private static final epf<jb> d = eox.W;
    private static final int e = 6;
    private static final int f = 4;
    private static final dqw g = new dqw(10);
    private static final int h = 17;

    public ebm(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)((eoh)this.C.b()).b(d, jb.k)).b(c, false)).b(b, false));
    }

    protected MapCodec<ebm> a() {
        return a;
    }

    @Override
    protected boolean c_(eoh $$0) {
        return true;
    }

    @Override
    protected int a(eoh $$0, dwo $$1, is $$2, iz $$3) {
        elb $$4 = $$1.c_($$2);
        if ($$4 instanceof elr) {
            elr $$5 = (elr)$$4;
            return $$5.w();
        }
        return 0;
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, dzq $$3, @Nullable fmj $$4, boolean $$5) {
        boolean $$6 = $$1.I($$2);
        boolean $$7 = $$0.c(c);
        elb $$8 = $$1.c_($$2);
        if ($$6 && !$$7) {
            $$1.a($$2, (dzq)this, 4);
            $$1.a($$2, (eoh)$$0.b(c, true), 2);
            this.a($$8, true);
        } else if (!$$6 && $$7) {
            $$1.a($$2, (eoh)((eoh)$$0.b(c, false)).b(b, false), 2);
            this.a($$8, false);
        }
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        this.a($$0, $$1, $$2);
    }

    @Override
    public <T extends elb> @Nullable elc<T> a(dwo $$0, eoh $$1, eld<T> $$2) {
        return $$0.B_() ? null : ebm.a($$2, eld.R, elr::a);
    }

    private void a(@Nullable elb $$0, boolean $$1) {
        if ($$0 instanceof elr) {
            elr $$2 = (elr)$$0;
            $$2.a($$1);
        }
    }

    @Override
    public elb a(is $$0, eoh $$1) {
        elr $$2 = new elr($$0, $$1);
        $$2.a($$1.b(c) && $$1.c(c) != false);
        return $$2;
    }

    @Override
    public eoh a(dpu $$0) {
        iz $$1 = $$0.d().g();
        iz $$2 = switch ($$1) {
            default -> throw new MatchException(null, null);
            case iz.a -> $$0.g().g();
            case iz.b -> $$0.g();
            case iz.c, iz.d, iz.e, iz.f -> iz.b;
        };
        return (eoh)((eoh)this.m().b(d, jb.a($$1, $$2))).b(c, $$0.q().I($$0.a()));
    }

    @Override
    public void a(dwo $$0, is $$1, eoh $$2, @Nullable chl $$3, dlt $$4) {
        if ($$2.c(c).booleanValue()) {
            $$0.a($$1, (dzq)this, 4);
        }
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, boolean $$3) {
        ccy.a($$0, $$1, $$2);
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        elb elb2;
        if (!$$1.B_() && (elb2 = $$1.c_($$2)) instanceof elr) {
            elr $$5 = (elr)elb2;
            $$3.a($$5);
        }
        return cdc.a;
    }

    /*
     * WARNING - void declaration
     */
    protected void a(eoh $$02, axf $$1, is $$2) {
        void $$4;
        elb elb2 = $$1.c_($$2);
        if (!(elb2 instanceof elr)) {
            return;
        }
        elr $$3 = (elr)elb2;
        dqg $$5 = $$4.aE_();
        Optional<dqx<dqh>> $$6 = ebm.a($$1, $$5);
        if ($$6.isEmpty()) {
            $$1.c(1050, $$2, 0);
            return;
        }
        dqx<dqh> $$7 = $$6.get();
        dlt $$8 = $$7.b().a($$5, $$1.J_());
        if ($$8.f()) {
            $$1.c(1050, $$2, 0);
            return;
        }
        $$4.e(6);
        $$1.a($$2, (eoh)$$02.b(b, true), 2);
        $$8.a($$1);
        this.a($$1, $$2, (elr)$$4, $$8, $$02, $$7);
        for (dlt $$9 : $$7.b().a($$5)) {
            if ($$9.f()) continue;
            this.a($$1, $$2, (elr)$$4, $$9, $$02, $$7);
        }
        $$4.g().forEach($$0 -> {
            if ($$0.f()) {
                return;
            }
            $$0.h(1);
        });
        $$4.e();
    }

    public static Optional<dqx<dqh>> a(axf $$0, dqg $$1) {
        return g.a($$0, $$1);
    }

    private void a(axf $$0, is $$1, elr $$2, dlt $$3, eoh $$4, dqx<?> $$5) {
        iz $$6 = $$4.c(d).a();
        ccv $$7 = emf.a((dwo)$$0, $$1.a($$6));
        dlt $$8 = $$3.v();
        if ($$7 != null && ($$7 instanceof elr || $$3.N() > $$7.f_($$3))) {
            dlt $$9;
            dlt $$10;
            while (!$$8.f() && ($$10 = emf.a((ccv)$$2, $$7, $$9 = $$8.c(1), $$6.g())).f()) {
                $$8.h(1);
            }
        } else if ($$7 != null) {
            int $$11;
            while (!$$8.f() && ($$11 = $$8.N()) != ($$8 = emf.a((ccv)$$2, $$7, $$8, $$6.g())).N()) {
            }
        }
        if (!$$8.f()) {
            ftm $$12 = ftm.b($$1);
            ftm $$13 = $$12.a($$6, 0.7);
            lf.a($$0, $$8, 6, $$6, $$13);
            for (axg $$14 : $$0.a(axg.class, fth.a($$12, 17.0, 17.0, 17.0))) {
                aj.af.a($$14, $$5.a(), $$2.g());
            }
            $$0.c(1049, $$1, 0);
            $$0.c(2010, $$1, $$6.d());
        }
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(d, $$1.a().a($$0.c(d)));
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        return (eoh)$$0.b(d, $$1.a().a($$0.c(d)));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(d, c, b);
    }
}

