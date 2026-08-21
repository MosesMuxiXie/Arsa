/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class eho
extends dzq {
    public static final MapCodec<eho> a = eho.b(eho::new);
    public static final int b = 8;
    public static final eph c = eox.aJ;
    private static final fug[] e = dzq.a(8, (int $$0) -> dzq.b(16.0, 0.0, $$0 * 2));
    public static final int d = 5;

    public MapCodec<eho> a() {
        return a;
    }

    protected eho(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)this.C.b()).b(c, 1));
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        if ($$1 == flq.a) {
            return $$0.c(c) < 5;
        }
        return false;
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return e[$$0.c(c)];
    }

    @Override
    protected fug b(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return e[$$0.c(c) - 1];
    }

    @Override
    protected fug b_(eoh $$0, dvt $$1, is $$2) {
        return e[$$0.c(c)];
    }

    @Override
    protected fug c(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return e[$$0.c(c)];
    }

    @Override
    protected boolean g_(eoh $$0) {
        return true;
    }

    @Override
    protected float c(eoh $$0, dvt $$1, is $$2) {
        return $$0.c(c) == 8 ? 0.2f : 1.0f;
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        eoh $$3 = $$1.a_($$2.e());
        if ($$3.a(bdp.cG)) {
            return false;
        }
        if ($$3.a(bdp.cH)) {
            return true;
        }
        return dzq.a($$3.g($$1, $$2.e()), iz.b) || $$3.a(this) && $$3.c(c) == 8;
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if (!$$0.a($$1, $$3)) {
            return dzs.a.m();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected void b(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if ($$1.a(dww.b, $$2) > 11) {
            eho.b($$0, $$1, $$2);
            $$1.a($$2, false);
        }
    }

    @Override
    protected boolean a(eoh $$0, dpu $$1) {
        int $$2 = $$0.c(c);
        if ($$1.n().a(this.h()) && $$2 < 8) {
            if ($$1.c()) {
                return $$1.k() == iz.b;
            }
            return true;
        }
        return $$2 == 1;
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        eoh $$1 = $$0.q().a_($$0.a());
        if ($$1.a(this)) {
            int $$2 = $$1.c(c);
            return (eoh)$$1.b(c, Math.min(8, $$2 + 1));
        }
        return super.a($$0);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{c});
    }
}

