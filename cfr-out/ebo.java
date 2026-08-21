/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import org.jspecify.annotations.Nullable;

public class ebo
extends dzc {
    public static final MapCodec<ebo> a = ebo.b(ebo::new);
    public static final epf<iz.a> b = eox.K;
    public static final epf<epb> c = eox.bF;
    public static final eoy d = eox.w;

    public MapCodec<ebo> a() {
        return a;
    }

    protected ebo(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)this.m().b(b, iz.a.b)).b(c, epb.a)).b(d, false));
    }

    @Override
    public elb a(is $$0, eoh $$1) {
        return new els($$0, $$1);
    }

    @Override
    public <T extends elb> @Nullable elc<T> a(dwo $$0, eoh $$1, eld<T> $$2) {
        if ($$0.B_()) {
            return null;
        }
        if ($$1.c(c) != epb.a) {
            return ebo.a($$2, eld.k, els::a);
        }
        return null;
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
        if (!$$1.c().a(ceg.L, $$2).booleanValue()) {
            return;
        }
        if ($$0.c(c) == epb.a) {
            return;
        }
        if ($$3.a(16) == 0 && ebo.a($$1, $$2)) {
            $$1.a($$2.u(), (double)$$2.v(), (double)$$2.w(), bda.hE, bdb.e, 1.0f, 1.0f, false);
        }
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        $$2.a($$3, this, 1);
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        eoh $$4 = ebo.c($$0, $$1, $$2);
        if ($$4 != $$0) {
            $$1.a($$2, $$4, 3);
        }
    }

    private static eoh c(eoh $$0, dwo $$1, is $$2) {
        boolean $$4;
        boolean $$3 = ebo.b($$0, (dwr)$$1, $$2);
        boolean bl2 = $$4 = $$0.c(c) == epb.a;
        if ($$3 && $$4) {
            return (eoh)$$0.b(c, $$1.c().a(ceg.L, $$2) != false ? epb.c : epb.b);
        }
        return $$0;
    }

    public static boolean b(eoh $$0, dwr $$1, is $$2) {
        iz.a $$3 = $$0.c(b);
        for (iz $$4 : $$3.g()) {
            eoh $$5 = $$1.a_($$2.a($$4));
            if ($$5.a(bdp.t) && $$5.c(b) == $$3) continue;
            return false;
        }
        return true;
    }

    private static boolean a(dwp $$0, is $$1) {
        for (iz $$2 : iz.values()) {
            is $$3 = $$1.a($$2);
            eoh $$4 = $$0.a_($$3);
            if ($$4.a(bdp.t)) continue;
            return false;
        }
        return true;
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        return ebo.c((eoh)this.m().b(b, $$0.k().o()), $$0.q(), $$0.a());
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        return egl.b($$0, $$1);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(b, c, d);
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, boolean $$3) {
        ccy.a($$0, $$1, $$2);
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, dwi $$3, BiConsumer<dlt, is> $$4) {
        elb elb2 = $$1.c_($$2);
        if (elb2 instanceof els) {
            els $$5 = (els)elb2;
            if ($$3 instanceof dxe) {
                dxe $$6 = (dxe)$$3;
                if ($$3.b().a()) {
                    $$5.a($$6.k());
                    chl chl2 = $$3.c();
                    if (chl2 instanceof ddm) {
                        ddm $$7 = (ddm)chl2;
                        if ($$3.b().a()) {
                            this.a($$7, $$0, $$1, $$2);
                        }
                    }
                }
            }
        }
        super.a($$0, $$1, $$2, $$3, $$4);
    }

    @Override
    public eoh a(dwo $$0, is $$1, eoh $$2, ddm $$3) {
        elb elb2 = $$0.c_($$1);
        if (elb2 instanceof els) {
            els $$4 = (els)elb2;
            $$4.a($$3.en().a($$3));
            this.a($$3, $$2, $$0, $$1);
        }
        return super.a($$0, $$1, $$2, $$3);
    }

    private void a(ddm $$0, eoh $$1, dwo $$2, is $$3) {
        if (!$$0.gM() && !$$0.au() && $$1.c(d).booleanValue() && $$2 instanceof axf) {
            axf $$4 = (axf)$$2;
            this.a($$4, $$3, $$2.y.a(20, 24));
        }
    }

    @Override
    protected boolean c_(eoh $$0) {
        return true;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected int a(eoh $$0, dwo $$1, is $$2, iz $$3) {
        void $$5;
        if ($$0.c(c) == epb.a) {
            return 0;
        }
        elb elb2 = $$1.c_($$2);
        if (!(elb2 instanceof els)) {
            return 0;
        }
        els $$4 = (els)elb2;
        return $$5.d();
    }
}

