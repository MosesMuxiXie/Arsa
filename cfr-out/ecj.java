/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import java.util.Set;
import org.jspecify.annotations.Nullable;

public class ecj
extends dzc
implements efr {
    public static final MapCodec<ecj> a = ecj.b(ecj::new);
    private static final fug b = dzq.b(16.0, 6.0, 12.0);

    public MapCodec<ecj> a() {
        return a;
    }

    protected ecj(eog.d $$0) {
        super($$0);
    }

    @Override
    public elb a(is $$0, eoh $$1) {
        return new enb($$0, $$1);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return b;
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, cgk $$3) {
        return $$0.f($$1, $$2);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, cgk $$3, chc $$4, boolean $$5) {
        if (!$$3.o(false)) return;
        if (!$$1.B_() && $$1.aq() == dwo.j && $$3 instanceof axg) {
            axg $$6 = (axg)$$3;
            if (!$$6.i) {
                $$6.p();
                return;
            }
        }
        $$3.a(this, $$2);
    }

    @Override
    public @Nullable fmb a(axf $$0, cgk $$1, is $$2) {
        Set<chz> $$15;
        float $$14;
        float $$13;
        fne.a $$3 = $$0.C();
        amt<dwo> $$4 = $$0.aq();
        boolean $$5 = $$4 == dwo.j;
        amt<dwo> $$6 = $$5 ? $$3.a() : dwo.j;
        is $$7 = $$5 ? $$3.b() : axf.a;
        axf $$8 = $$0.s().a($$6);
        if ($$8 == null) {
            return null;
        }
        ftm $$9 = $$7.c();
        if (!$$5) {
            exu.a($$8, is.a($$9).e(), true);
            float $$10 = iz.e.p();
            float $$11 = 0.0f;
            Set<chz> $$12 = chz.a(chz.l, Set.of(chz.e));
            if ($$1 instanceof axg) {
                $$9 = $$9.a(0.0, 1.0, 0.0);
            }
        } else {
            $$13 = $$3.d();
            $$14 = $$3.e();
            $$15 = chz.a(chz.l, chz.k);
            if ($$1 instanceof axg) {
                axg $$16 = (axg)$$1;
                return $$16.a(false, fmb.a);
            }
            $$9 = $$1.a($$8, $$7).c();
        }
        return new fmb($$8, $$9, ftm.c, $$13, $$14, $$15, fmb.b.then(fmb.c));
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
        double $$4 = (double)$$2.u() + $$3.j();
        double $$5 = (double)$$2.v() + 0.8;
        double $$6 = (double)$$2.w() + $$3.j();
        $$1.a(ly.ai, $$4, $$5, $$6, 0.0, 0.0, 0.0);
    }

    @Override
    protected dlt a(dwr $$0, is $$1, eoh $$2, boolean $$3) {
        return dlt.l;
    }

    @Override
    protected boolean a(eoh $$0, fla $$1) {
        return false;
    }

    @Override
    protected egf a_(eoh $$0) {
        return egf.a;
    }
}

