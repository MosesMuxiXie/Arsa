/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class ebx
extends dzq {
    public static final MapCodec<ebx> a = ebx.b(ebx::new);
    private static final fug b = dzq.b(16.0, 0.0, 15.0);

    public MapCodec<ebx> a() {
        return a;
    }

    protected ebx(eog.d $$0) {
        super($$0);
    }

    @Override
    protected boolean g_(eoh $$0) {
        return true;
    }

    @Override
    public eoh a(dpu $$0) {
        if (!this.m().a((dwr)$$0.q(), $$0.a())) {
            return dzq.a(this.m(), dzs.j.m(), $$0.q(), $$0.a());
        }
        return super.a($$0);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$4 == iz.b && !$$0.a($$1, $$3)) {
            $$2.a($$3, this, 1);
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        ecs.a(null, $$0, $$1, $$2);
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        eoh $$3 = $$1.a_($$2.d());
        return !$$3.e() || $$3.b() instanceof ecu;
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return b;
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }
}

