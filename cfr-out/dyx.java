/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class dyx
extends dzq
implements ehg {
    public static final MapCodec<dyx> a = dyx.b(dyx::new);
    public static final eoy b = eox.I;

    public MapCodec<dyx> a() {
        return a;
    }

    protected dyx(eog.d $$0) {
        super($$0);
        this.l((eoh)this.m().b(b, false));
    }

    @Override
    protected boolean e_(eoh $$0) {
        return $$0.y().c();
    }

    @Override
    protected egf a_(eoh $$0) {
        return egf.a;
    }

    @Override
    protected float c(eoh $$0, dvt $$1, is $$2) {
        return 1.0f;
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
    public @Nullable eoh a(dpu $$0) {
        return (eoh)this.m().b(b, $$0.q().b_($$0.a()).a() == flc.c);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{b});
    }

    @Override
    public dlt a(@Nullable chl $$0, dwp $$1, is $$2, eoh $$3) {
        ddm $$4;
        if (!($$0 instanceof ddm) || !($$4 = (ddm)$$0).ha()) {
            return dlt.l;
        }
        return ehg.super.a($$0, $$1, $$2, $$3);
    }

    @Override
    public boolean a(@Nullable chl $$0, dvt $$1, is $$2, eoh $$3, fla $$4) {
        ddm $$5;
        if (!($$0 instanceof ddm) || !($$5 = (ddm)$$0).ha()) {
            return false;
        }
        return ehg.super.a($$0, $$1, $$2, $$3, $$4);
    }
}

