/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public abstract class ecr
extends dzq
implements ecq {
    public ecr(eog.d $$0) {
        super($$0);
    }

    protected abstract MapCodec<? extends ecr> a();

    @Override
    protected void a(eoh $$0, dwo $$1, is $$2, eoh $$3, boolean $$4) {
        $$1.a($$2, (dzq)this, this.b());
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        $$2.a($$3, this, this.b());
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if (!ecr.n($$1.a_($$2.e())) || $$2.v() < $$1.K_()) {
            return;
        }
        czk $$4 = czk.a($$1, $$2, $$0);
        this.a($$4);
    }

    protected void a(czk $$0) {
    }

    protected int b() {
        return 2;
    }

    public static boolean n(eoh $$0) {
        return $$0.l() || $$0.a(bdp.aY) || $$0.n() || $$0.v();
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
        is $$4;
        if ($$3.a(16) == 0 && ecr.n($$1.a_($$4 = $$2.e()))) {
            bgm.a($$1, $$2, $$3, (lw)new lp(ly.D, $$0));
        }
    }

    public abstract int b(eoh var1, dvt var2, is var3);
}

