/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class eid
extends dzc
implements ede {
    public static final MapCodec<eid> a = eid.b(eid::new);
    public static final epf<eps> b = eox.bo;

    public MapCodec<eid> a() {
        return a;
    }

    protected eid(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)this.C.b()).b(b, eps.b));
    }

    @Override
    public elb a(is $$0, eoh $$1) {
        return new emx($$0, $$1);
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        elb $$5 = $$1.c_($$2);
        if ($$5 instanceof emx) {
            return ((emx)$$5).a($$3) ? cdc.a : cdc.e;
        }
        return cdc.e;
    }

    @Override
    public void a(dwo $$0, is $$1, eoh $$2, @Nullable chl $$3, dlt $$4) {
        elb $$5;
        if ($$0.B_()) {
            return;
        }
        if ($$3 != null && ($$5 = $$0.c_($$1)) instanceof emx) {
            ((emx)$$5).a($$3);
        }
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{b});
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, dzq $$3, @Nullable fmj $$4, boolean $$5) {
        if (!($$1 instanceof axf)) {
            return;
        }
        elb $$6 = $$1.c_($$2);
        if (!($$6 instanceof emx)) {
            return;
        }
        emx $$7 = (emx)$$6;
        boolean $$8 = $$1.I($$2);
        boolean $$9 = $$7.G();
        if ($$8 && !$$9) {
            $$7.d(true);
            this.a((axf)$$1, $$7);
        } else if (!$$8 && $$9) {
            $$7.d(false);
        }
    }

    private void a(axf $$0, emx $$1) {
        switch ($$1.x()) {
            case a: {
                $$1.c(false);
                break;
            }
            case b: {
                $$1.c($$0);
                break;
            }
            case c: {
                $$1.E();
                break;
            }
            case d: {
                break;
            }
        }
    }
}

