/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class ehk
extends ecb
implements dzt,
ehg {
    public static final MapCodec<ehk> c = ehk.b(ehk::new);
    private static final eoy e = eox.I;
    public static final epf<iz> d = eox.T;
    private static final fug f = dzq.b(12.0, 0.0, 13.0);

    public MapCodec<ehk> a() {
        return c;
    }

    public ehk(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)((eoh)this.C.b()).b(b, epd.b)).b(e, false)).b(d, iz.c));
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return f;
    }

    @Override
    protected boolean b(eoh $$0, dvt $$1, is $$2) {
        return $$0.a(bdp.bK) || $$1.b_($$2.d()).a(flc.c) && super.b($$0, $$1, $$2);
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        eoh $$1 = super.a($$0);
        if ($$1 != null) {
            return ehk.b($$0.q(), $$0.a(), (eoh)$$1.b(d, $$0.g().g()));
        }
        return null;
    }

    @Override
    public void a(dwo $$0, is $$1, eoh $$2, @Nullable chl $$3, dlt $$4) {
        if (!$$0.B_()) {
            is $$5 = $$1.d();
            eoh $$6 = ecb.b($$0, $$5, (eoh)((eoh)this.m().b(b, epd.a)).b(d, $$2.c(d)));
            $$0.a($$5, $$6, 3);
        }
    }

    @Override
    protected flb b_(eoh $$0) {
        if ($$0.c(e).booleanValue()) {
            return flc.c.a(false);
        }
        return super.b_($$0);
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        if ($$0.c(b) == epd.a) {
            return super.a($$0, $$1, $$2);
        }
        is $$3 = $$2.e();
        eoh $$4 = $$1.a_($$3);
        return this.b($$4, $$1, $$3);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$0.c(e).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(b, e, d);
    }

    @Override
    public boolean a(dwr $$0, is $$1, eoh $$2) {
        return true;
    }

    @Override
    public boolean a(dwo $$0, bgr $$1, is $$2, eoh $$3) {
        return true;
    }

    @Override
    public void a(axf $$0, bgr $$1, is $$2, eoh $$3) {
        if ($$3.c(ecb.b) == epd.b) {
            is $$4 = $$2.d();
            $$0.a($$4, $$0.b_($$4).g(), 18);
            dzn.a((dwp)$$0, $$1, $$2, $$3.c(d));
        } else {
            is $$5 = $$2.e();
            this.a($$0, $$1, $$5, $$0.a_($$5));
        }
    }

    @Override
    protected eoh a(eoh $$0, egm $$1) {
        return (eoh)$$0.b(d, $$1.a($$0.c(d)));
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        return $$0.a($$1.a($$0.c(d)));
    }

    @Override
    protected float av_() {
        return 0.1f;
    }
}

