/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class ehq
extends dzd {
    public static final MapCodec<ehq> b = ehq.b(ehq::new);

    public MapCodec<ehq> a() {
        return b;
    }

    public ehq(eog.d $$0) {
        super($$0, 2.0f);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if (this.a($$0, $$1, $$3)) {
            return this.m();
        }
        return dzs.a.m();
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        return ehq.p($$1.a_($$2.e()));
    }

    public static boolean p(eoh $$0) {
        return $$0.a(bdp.T);
    }

    @Override
    protected boolean g(eoh $$0) {
        return true;
    }
}

