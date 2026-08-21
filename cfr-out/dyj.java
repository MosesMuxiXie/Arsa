/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public abstract class dyj
extends dzq {
    protected static final int a = 4;
    private static final fug d = dzq.b(12.0, 4.0, 16.0);
    protected static final fug b = bhs.a(() -> {
        int $$0 = 4;
        int $$1 = 3;
        int $$2 = 2;
        return fud.a(fud.b(), fud.a(dzq.a(16.0, 8.0, 0.0, 3.0), dzq.a(8.0, 16.0, 0.0, 3.0), dzq.b(12.0, 0.0, 3.0), d), ftq.e);
    });
    protected final ka.a c;

    protected abstract MapCodec<? extends dyj> a();

    public dyj(eog.d $$0, ka.a $$1) {
        super($$0);
        this.c = $$1;
    }

    protected double b(eoh $$0) {
        return 0.0;
    }

    @Override
    protected cdc a(dlt $$0, eoh $$1, dwo $$2, is $$3, ddm $$4, cdb $$5, fti $$6) {
        ka $$7 = this.c.b().get($$0.h());
        return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return b;
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2) {
        return d;
    }

    @Override
    protected boolean c_(eoh $$0) {
        return true;
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }

    public abstract boolean d(eoh var1);

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        is $$4 = efq.a((dwo)$$1, $$2);
        if ($$4 == null) {
            return;
        }
        fla $$5 = efq.a($$1, $$4);
        if ($$5 != flc.a && this.a($$5)) {
            this.a($$0, (dwo)$$1, $$2, $$5);
        }
    }

    protected boolean a(fla $$0) {
        return false;
    }

    protected void a(eoh $$0, dwo $$1, is $$2, fla $$3) {
    }
}

