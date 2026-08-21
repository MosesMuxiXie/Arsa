/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class eem
extends dzq
implements ehg {
    public static final MapCodec<eem> a = eem.b(eem::new);
    public static final int b = 15;
    public static final eph c = eox.aT;
    public static final eoy d = eox.I;
    public static final ToIntFunction<eoh> e = $$0 -> $$0.c(c);

    public MapCodec<eem> a() {
        return a;
    }

    public eem(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)((eoh)this.C.b()).b(c, 15)).b(d, false));
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(c, d);
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        if (!$$1.B_() && $$3.hi()) {
            $$1.a($$2, (eoh)$$0.a(c), 2);
            return cdc.b;
        }
        return cdc.c;
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return $$3.a(dlx.iv) ? fud.b() : fud.a();
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
        if ($$0.c(d).booleanValue()) {
            $$2.a($$3, flc.c, flc.c.a($$1));
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected flb b_(eoh $$0) {
        if ($$0.c(d).booleanValue()) {
            return flc.c.a(false);
        }
        return super.b_($$0);
    }

    @Override
    protected dlt a(dwr $$0, is $$1, eoh $$2, boolean $$3) {
        return eem.a(super.a($$0, $$1, $$2, $$3), $$2.c(c));
    }

    public static dlt a(dlt $$0, int $$1) {
        $$0.b(ki.ax, dnw.a.a(c, $$1));
        return $$0;
    }
}

