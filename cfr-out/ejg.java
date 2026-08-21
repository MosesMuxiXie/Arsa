/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public abstract class ejg
extends dzq {
    protected ejg(eog.d $$0) {
        super($$0);
    }

    protected abstract MapCodec<? extends ejg> a();

    protected boolean b(eoh $$0, dvt $$1, is $$2) {
        return $$0.a(bdp.ae) || $$0.a(dzs.cZ);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if (!$$0.a($$1, $$3)) {
            return dzs.a.m();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        is $$3 = $$2.e();
        return this.b($$1.a_($$3), $$1, $$3);
    }

    @Override
    protected boolean e_(eoh $$0) {
        return $$0.y().c();
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        if ($$1 == flq.c && !this.F) {
            return true;
        }
        return super.a($$0, $$1);
    }
}

