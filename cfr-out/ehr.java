/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class ehr
extends dzq {
    public static final MapCodec<ehr> a = ehr.b(ehr::new);
    private static final fug b = dzq.b(16.0, 0.0, 14.0);
    private static final int c = 20;

    public MapCodec<ehr> a() {
        return a;
    }

    public ehr(eog.d $$0) {
        super($$0);
    }

    @Override
    protected fug b(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return b;
    }

    @Override
    protected fug b_(eoh $$0, dvt $$1, is $$2) {
        return fud.b();
    }

    @Override
    protected fug c(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return fud.b();
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        dzx.b($$1, $$2.d(), $$0);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$4 == iz.b && $$6.a(dzs.J)) {
            $$2.a($$3, this, 20);
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, eoh $$3, boolean $$4) {
        $$1.a($$2, (dzq)this, 20);
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }

    @Override
    protected float c(eoh $$0, dvt $$1, is $$2) {
        return 0.2f;
    }
}

