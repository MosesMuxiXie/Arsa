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

public class ech
extends dzc {
    public static final MapCodec<ech> a = ech.b(ech::new);
    public static final List<is> b = is.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(is::j).toList();
    private static final fug c = dzq.b(16.0, 0.0, 12.0);

    public MapCodec<ech> a() {
        return a;
    }

    protected ech(eog.d $$0) {
        super($$0);
    }

    public static boolean a(dwo $$0, is $$1, is $$2) {
        return $$0.a_($$1.a($$2)).a(bdp.cN) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(bdp.cO);
    }

    @Override
    protected boolean g_(eoh $$0) {
        return true;
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return c;
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
        super.a($$0, $$1, $$2, $$3);
        for (is $$4 : b) {
            if ($$3.a(16) != 0 || !ech.a($$1, $$2, $$4)) continue;
            $$1.a(ly.t, (double)$$2.u() + 0.5, (double)$$2.v() + 2.0, (double)$$2.w() + 0.5, (double)((float)$$4.u() + $$3.i()) - 0.5, (double)((float)$$4.v() - $$3.i() - 1.0f), (double)((float)$$4.w() + $$3.i()) - 0.5);
        }
    }

    @Override
    public elb a(is $$0, eoh $$1) {
        return new elz($$0, $$1);
    }

    @Override
    public <T extends elb> @Nullable elc<T> a(dwo $$0, eoh $$1, eld<T> $$2) {
        return $$0.B_() ? ech.a($$2, eld.n, elz::a) : null;
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        if (!$$1.B_()) {
            $$3.a($$0.a($$1, $$2));
        }
        return cdc.a;
    }

    @Override
    protected @Nullable cdf a(eoh $$0, dwo $$1, is $$22) {
        elb $$32 = $$1.c_($$22);
        if ($$32 instanceof elz) {
            elz $$42 = (elz)$$32;
            yh $$5 = $$42.R_();
            return new cdl(($$2, $$3, $$4) -> new dif($$2, $$3, dhw.a($$1, $$22)), $$5);
        }
        return null;
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }
}

