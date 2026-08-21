/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class ehp
extends dzq {
    public static final MapCodec<ehp> b = ehp.b(ehp::new);
    public static final eoy c = eox.E;

    protected MapCodec<? extends ehp> a() {
        return b;
    }

    protected ehp(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)this.C.b()).b(c, false));
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$4 == iz.b) {
            return (eoh)$$0.b(c, ehp.p($$6));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    public eoh a(dpu $$0) {
        eoh $$1 = $$0.q().a_($$0.a().d());
        return (eoh)this.m().b(c, ehp.p($$1));
    }

    protected static boolean p(eoh $$0) {
        return $$0.a(bdp.bM);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{c});
    }
}

