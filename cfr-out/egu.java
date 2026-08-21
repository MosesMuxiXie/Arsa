/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class egu
extends dzc
implements ehg {
    public static final MapCodec<egu> a = egu.b(egu::new);
    public static final eoy b = eox.C;
    public static final eoy c = eox.I;
    public static final eoy d = eox.e;
    private static final fug f = dzq.b(16.0, 0.0, 8.0);
    public static final double e = f.c(iz.a.b);

    public MapCodec<egu> a() {
        return a;
    }

    public egu(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)((eoh)this.C.b()).b(b, false)).b(c, false)).b(d, false));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{b});
        $$0.a(new epk[]{c});
        $$0.a(new epk[]{d});
    }

    @Override
    public void a(dwo $$0, is $$1, eoh $$22, cgk $$3) {
        if ($$0 instanceof axf) {
            axf $$4 = (axf)$$0;
            axg $$5 = emp.a($$3);
            if ($$5 != null) {
                $$4.a($$1, eld.M).ifPresent($$2 -> $$2.a($$4, $$5));
            }
        }
        super.a($$0, $$1, $$22, $$3);
    }

    @Override
    protected void a(eoh $$0, axf $$12, is $$2, bgr $$3) {
        if ($$0.c(b).booleanValue()) {
            $$12.a($$2, (eoh)$$0.b(b, false), 3);
            $$12.a($$2, eld.M).ifPresent($$1 -> $$1.a($$12));
        }
    }

    @Override
    protected fug b(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return f;
    }

    @Override
    protected fug d_(eoh $$0) {
        return f;
    }

    @Override
    protected boolean g_(eoh $$0) {
        return true;
    }

    @Override
    public @Nullable elb a(is $$0, eoh $$1) {
        return new emp($$0, $$1);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$0.c(c).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        return (eoh)this.m().b(c, $$0.q().b_($$0.a()).a() == flc.c);
    }

    @Override
    protected flb b_(eoh $$0) {
        if ($$0.c(c).booleanValue()) {
            return flc.c.a(false);
        }
        return super.b_($$0);
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, dlt $$3, boolean $$4) {
        super.a($$0, $$1, $$2, $$3, $$4);
        if ($$4) {
            this.a($$1, $$2, $$3, cce.a(5));
        }
    }

    @Override
    public <T extends elb> @Nullable elc<T> a(dwo $$02, eoh $$12, eld<T> $$22) {
        if (!$$02.B_()) {
            return dzc.a($$22, eld.M, (dwo $$0, is $$1, eoh $$2, ? super E $$3) -> ett.c.a($$0, $$3.gS(), $$3.gT()));
        }
        return null;
    }
}

