/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class eio
extends dzc
implements ede {
    public static final MapCodec<eio> a = eio.b(eio::new);
    public static final epf<ept> b = eox.bH;

    public eio(eog.d $$0) {
        super($$0);
    }

    @Override
    public @Nullable elb a(is $$0, eoh $$1) {
        return new emy($$0, $$1);
    }

    @Override
    public eoh a(dpu $$0) {
        ept $$3;
        dnw $$1 = $$0.n().a(ki.ax);
        eoh $$2 = this.m();
        if ($$1 != null && ($$3 = $$1.a(b)) != null) {
            $$2 = (eoh)$$2.b(b, $$3);
        }
        return $$2;
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{b});
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        elb $$5 = $$1.c_($$2);
        if (!($$5 instanceof emy)) {
            return cdc.e;
        }
        emy $$6 = (emy)$$5;
        if (!$$3.hi()) {
            return cdc.e;
        }
        if ($$1.B_()) {
            void $$7;
            $$3.a((emy)$$7);
        }
        return cdc.a;
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        emy $$4 = eio.a($$1, $$2);
        if ($$4 == null) {
            return;
        }
        $$4.f();
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, dzq $$3, @Nullable fmj $$4, boolean $$5) {
        emy $$6 = eio.a($$1, $$2);
        if ($$6 == null) {
            return;
        }
        if ($$6.d() == ept.a) {
            return;
        }
        boolean $$7 = $$1.I($$2);
        boolean $$8 = $$6.c();
        if ($$7 && !$$8) {
            $$6.a(true);
            $$6.h();
        } else if (!$$7 && $$8) {
            $$6.a(false);
        }
    }

    private static @Nullable emy a(dwo $$0, is $$1) {
        axf $$2;
        elb elb2;
        if ($$0 instanceof axf && (elb2 = ($$2 = (axf)$$0).c_($$1)) instanceof emy) {
            emy $$3 = (emy)elb2;
            return $$3;
        }
        return null;
    }

    @Override
    public int a(eoh $$0, dvt $$1, is $$2, iz $$3) {
        if ($$0.c(b) != ept.a) {
            return 0;
        }
        elb $$4 = $$1.c_($$2);
        if ($$4 instanceof emy) {
            emy $$5 = (emy)$$4;
            return $$5.c() ? 15 : 0;
        }
        return 0;
    }

    @Override
    protected dlt a(dwr $$0, is $$1, eoh $$2, boolean $$3) {
        dlt $$4 = super.a($$0, $$1, $$2, $$3);
        return eio.a($$4, $$2.c(b));
    }

    public static dlt a(dlt $$0, ept $$1) {
        $$0.b(ki.ax, $$0.a(ki.ax, dnw.a).a(b, $$1));
        return $$0;
    }

    protected MapCodec<eio> a() {
        return a;
    }
}

