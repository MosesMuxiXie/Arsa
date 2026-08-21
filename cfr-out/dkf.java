/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.List;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class dkf
extends dmo {
    public static final int a = 20;
    public static final int b = 15;

    public dkf(dlp.a $$0) {
        super($$0);
    }

    @Override
    public boolean a(dlt $$0, dwo $$1, chl $$2, int $$3) {
        if (!($$2 instanceof ddm)) {
            return false;
        }
        ddm $$4 = (ddm)$$2;
        dlt $$5 = $$4.d($$0);
        if ($$5.f()) {
            return false;
        }
        int $$6 = this.a($$0, $$2) - $$3;
        float $$7 = dkf.a($$6);
        if ((double)$$7 < 0.1) {
            return false;
        }
        List<dlt> $$8 = dkf.a($$0, $$5, $$4);
        if ($$1 instanceof axf) {
            axf $$9 = (axf)$$1;
            if (!$$8.isEmpty()) {
                this.a($$9, $$4, $$4.ga(), $$0, $$8, $$7 * 3.0f, 1.0f, $$7 == 1.0f, null);
            }
        }
        $$1.a(null, $$4.dP(), $$4.dR(), $$4.dV(), bda.aJ, bdb.h, 1.0f, 1.0f / ($$1.G_().i() * 0.4f + 1.2f) + $$7 * 0.5f);
        $$4.b(bdk.c.b(this));
        return true;
    }

    @Override
    protected void a(chl $$0, dec $$1, int $$2, float $$3, float $$4, float $$5, @Nullable chl $$6) {
        $$1.a($$0, $$0.ee(), $$0.ec() + $$5, 0.0f, $$3, $$4);
    }

    public static float a(int $$0) {
        float $$1 = (float)$$0 / 20.0f;
        if (($$1 = ($$1 * $$1 + $$1 * 2.0f) / 3.0f) > 1.0f) {
            $$1 = 1.0f;
        }
        return $$1;
    }

    @Override
    public int a(dlt $$0, chl $$1) {
        return 72000;
    }

    @Override
    public dlv b(dlt $$0) {
        return dlv.e;
    }

    @Override
    public cdc a(dwo $$0, ddm $$1, cdb $$2) {
        boolean $$4;
        dlt $$3 = $$1.b($$2);
        boolean bl2 = $$4 = !$$1.d($$3).f();
        if ($$1.gv() || $$4) {
            $$1.c($$2);
            return cdc.c;
        }
        return cdc.d;
    }

    @Override
    public Predicate<dlt> a() {
        return c;
    }

    @Override
    public int b() {
        return 15;
    }
}

