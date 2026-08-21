/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class dzp
extends dyl {
    public static final MapCodec<dzp> c = dzp.b(dzp::new);

    public MapCodec<dzp> a() {
        return c;
    }

    protected dzp(eog.d $$0) {
        super($$0);
    }

    @Override
    public elb a(is $$0, eoh $$1) {
        return new ela($$0, $$1);
    }

    @Override
    public <T extends elb> @Nullable elc<T> a(dwo $$0, eoh $$1, eld<T> $$2) {
        return dzp.a($$0, $$2, eld.D);
    }

    @Override
    protected void a(dwo $$0, is $$1, ddm $$2) {
        elb $$3 = $$0.c_($$1);
        if ($$3 instanceof ela) {
            $$2.a((cdf)((Object)$$3));
            $$2.a(bdk.au);
        }
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
        if (!$$0.c(b).booleanValue()) {
            return;
        }
        double $$4 = (double)$$2.u() + 0.5;
        double $$5 = $$2.v();
        double $$6 = (double)$$2.w() + 0.5;
        if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, bda.cM, bdb.e, 1.0f, 1.0f, false);
        }
        iz $$7 = (iz)$$0.c(a);
        iz.a $$8 = $$7.o();
        double $$9 = 0.52;
        double $$10 = $$3.j() * 0.6 - 0.3;
        double $$11 = $$8 == iz.a.a ? (double)$$7.j() * 0.52 : $$10;
        double $$12 = $$3.j() * 9.0 / 16.0;
        double $$13 = $$8 == iz.a.c ? (double)$$7.l() * 0.52 : $$10;
        $$1.a(ly.ai, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
    }
}

