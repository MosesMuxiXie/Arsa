/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class edq
extends dzq
implements ehg {
    public static final MapCodec<edq> a = edq.b(edq::new);
    public static final eoy b = eox.I;
    private static final fug c = dzq.b(8.0, 0.0, 8.0);

    public edq(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)this.C.b()).b(b, false));
    }

    public MapCodec<edq> a() {
        return a;
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{b});
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if ($$0.c(b).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected flb b_(eoh $$0) {
        if ($$0.c(b).booleanValue()) {
            return flc.c.a(false);
        }
        return super.b_($$0);
    }

    @Override
    public eoh a(dpu $$0) {
        flb $$1 = $$0.q().b_($$0.a());
        return (eoh)this.m().b(b, $$1.b(flc.c));
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return c;
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }
}

