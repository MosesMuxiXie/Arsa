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

public class eci
extends dzc
implements efr {
    public static final MapCodec<eci> a = eci.b(eci::new);

    public MapCodec<eci> a() {
        return a;
    }

    protected eci(eog.d $$0) {
        super($$0);
    }

    @Override
    public elb a(is $$0, eoh $$1) {
        return new ena($$0, $$1);
    }

    @Override
    public <T extends elb> @Nullable elc<T> a(dwo $$0, eoh $$1, eld<T> $$2) {
        return eci.a($$2, eld.w, $$0.B_() ? ena::a : ena::b);
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
        elb $$4 = $$1.c_($$2);
        if (!($$4 instanceof ena)) {
            return;
        }
        int $$5 = ((ena)$$4).f();
        for (int $$6 = 0; $$6 < $$5; ++$$6) {
            double $$7 = (double)$$2.u() + $$3.j();
            double $$8 = (double)$$2.v() + $$3.j();
            double $$9 = (double)$$2.w() + $$3.j();
            double $$10 = ($$3.j() - 0.5) * 0.5;
            double $$11 = ($$3.j() - 0.5) * 0.5;
            double $$12 = ($$3.j() - 0.5) * 0.5;
            int $$13 = $$3.a(2) * 2 - 1;
            if ($$3.h()) {
                $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$13;
                $$12 = $$3.i() * 2.0f * (float)$$13;
            } else {
                $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$13;
                $$10 = $$3.i() * 2.0f * (float)$$13;
            }
            $$1.a(ly.ag, $$7, $$8, $$9, $$10, $$11, $$12);
        }
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
    protected void a(eoh $$0, dwo $$1, is $$2, cgk $$3, chc $$4, boolean $$5) {
        if ($$3.o(false)) {
            ena $$7;
            elb $$6 = $$1.c_($$2);
            if (!$$1.B_() && $$6 instanceof ena && !($$7 = (ena)$$6).c()) {
                $$3.a(this, $$2);
                ena.c($$1, $$2, $$0, $$7);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public @Nullable fmb a(axf $$0, cgk $$1, is $$2) {
        void $$5;
        elb $$3 = $$0.c_($$2);
        if (!($$3 instanceof ena)) {
            return null;
        }
        ena $$4 = (ena)$$3;
        ftm $$6 = $$5.a($$0, $$2);
        if ($$6 == null) {
            return null;
        }
        if ($$1 instanceof dfc) {
            return new fmb($$0, $$6, ftm.c, 0.0f, 0.0f, Set.of(), fmb.c);
        }
        return new fmb($$0, $$6, ftm.c, 0.0f, 0.0f, chz.a(chz.l, chz.k), fmb.c);
    }

    @Override
    protected egf a_(eoh $$0) {
        return egf.a;
    }
}

