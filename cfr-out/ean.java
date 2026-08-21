/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class ean
extends dyj {
    public static final MapCodec<ean> d = ean.b(ean::new);
    private static final float e = 0.05f;
    private static final float f = 0.1f;

    public MapCodec<ean> a() {
        return d;
    }

    public ean(eog.d $$0) {
        super($$0, ka.c);
    }

    @Override
    public boolean d(eoh $$0) {
        return false;
    }

    protected static boolean a(dwo $$0, dxo.c $$1) {
        if ($$1 == dxo.c.b) {
            return $$0.G_().i() < 0.05f;
        }
        if ($$1 == dxo.c.c) {
            return $$0.G_().i() < 0.1f;
        }
        return false;
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, dxo.c $$3) {
        if (!ean.a($$1, $$3)) {
            return;
        }
        if ($$3 == dxo.c.b) {
            $$1.c($$2, dzs.gj.m());
            $$1.a(null, etk.c, $$2);
        } else if ($$3 == dxo.c.c) {
            $$1.c($$2, dzs.gl.m());
            $$1.a(null, etk.c, $$2);
        }
    }

    @Override
    protected boolean a(fla $$0) {
        return true;
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, fla $$3) {
        if ($$3 == flc.c) {
            eoh $$4 = dzs.gj.m();
            $$1.c($$2, $$4);
            $$1.a(etk.c, $$2, etk.a.a($$4));
            $$1.c(1047, $$2, 0);
        } else if ($$3 == flc.e) {
            eoh $$5 = dzs.gk.m();
            $$1.c($$2, $$5);
            $$1.a(etk.c, $$2, etk.a.a($$5));
            $$1.c(1046, $$2, 0);
        }
    }
}

