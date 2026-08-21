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
import java.util.IdentityHashMap;
import java.util.Map;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class eby
extends dzc {
    private static final Logger e = LogUtils.getLogger();
    public static final MapCodec<eby> a = eby.b(eby::new);
    public static final epf<iz> b = ebw.a;
    public static final eoy c = eox.G;
    private static final lf f = new lf();
    public static final Map<dlp, lg> d = new IdentityHashMap<dlp, lg>();
    private static final int g = 4;

    public MapCodec<? extends eby> a() {
        return a;
    }

    public static void a(dwn $$0, lg $$1) {
        d.put($$0.h(), $$1);
    }

    public static void a(dwn $$0) {
        d.put($$0.h(), new lk($$0.h()));
    }

    protected eby(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)this.C.b()).b(b, iz.c)).b(c, false));
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        elb elb2;
        if (!$$1.B_() && (elb2 = $$1.c_($$2)) instanceof elx) {
            elx $$5 = (elx)elb2;
            $$3.a($$5);
            $$3.a($$5 instanceof ely ? bdk.ae : bdk.ag);
        }
        return cdc.a;
    }

    protected void a(axf $$0, eoh $$1, is $$2) {
        elx $$3 = $$0.a($$2, eld.f).orElse(null);
        if ($$3 == null) {
            e.warn("Ignoring dispensing attempt for Dispenser without matching block entity at {}", (Object)$$2);
            return;
        }
        ld $$4 = new ld($$0, $$2, $$1, $$3);
        int $$5 = $$3.a($$0.y);
        if ($$5 < 0) {
            $$0.c(1001, $$2, 0);
            $$0.a(etk.a, $$2, etk.a.a($$3.o()));
            return;
        }
        dlt $$6 = $$3.a($$5);
        lg $$7 = this.a((dwo)$$0, $$6);
        if ($$7 != lg.b) {
            $$3.a($$5, $$7.dispense($$4, $$6));
        }
    }

    protected lg a(dwo $$0, dlt $$1) {
        if (!$$1.a($$0.Q())) {
            return f;
        }
        lg $$2 = d.get($$1.h());
        if ($$2 != null) {
            return $$2;
        }
        return eby.a($$1);
    }

    private static lg a(dlt $$0) {
        if ($$0.c(ki.H)) {
            return lh.c;
        }
        return f;
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, dzq $$3, @Nullable fmj $$4, boolean $$5) {
        boolean $$6 = $$1.I($$2) || $$1.I($$2.d());
        boolean $$7 = $$0.c(c);
        if ($$6 && !$$7) {
            $$1.a($$2, (dzq)this, 4);
            $$1.a($$2, (eoh)$$0.b(c, true), 2);
        } else if (!$$6 && $$7) {
            $$1.a($$2, (eoh)$$0.b(c, false), 2);
        }
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        this.a($$1, $$0, $$2);
    }

    @Override
    public elb a(is $$0, eoh $$1) {
        return new elx($$0, $$1);
    }

    @Override
    public eoh a(dpu $$0) {
        return (eoh)this.m().b(b, $$0.d().g());
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, boolean $$3) {
        ccy.a($$0, $$1, $$2);
    }

    public static jn a(ld $$0) {
        return eby.a($$0, 0.7, ftm.c);
    }

    public static jn a(ld $$0, double $$1, ftm $$2) {
        iz $$3 = $$0.d().c(b);
        return $$0.a().b($$1 * (double)$$3.j() + $$2.a(), $$1 * (double)$$3.k() + $$2.b(), $$1 * (double)$$3.l() + $$2.c());
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
        return (eoh)$$0.b(b, $$1.a($$0.c(b)));
    }

    @Override
    protected eoh a(eoh $$0, eev $$1) {
        return $$0.a($$1.a($$0.c(b)));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(b, c);
    }
}

