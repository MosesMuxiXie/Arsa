/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class edn
extends dzq
implements dzt {
    public static final MapCodec<edn> a = edn.b(edn::new);
    private static final fug c = dzq.b(14.0, 0.0, 16.0);
    private static final fug d = dzq.b(14.0, 2.0, 16.0);
    public static final eoy b = eox.F;

    public MapCodec<edn> a() {
        return a;
    }

    public edn(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)this.C.b()).b(b, true));
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return $$0.c(b) != false ? d : c;
    }

    @Override
    public void a(eoh $$0, dwo $$1, is $$2, bgr $$3) {
        eoh $$4;
        if ($$3.a(500) == 0 && (($$4 = $$1.a_($$2.d())).a(bdp.t) || $$4.a(dzs.aR))) {
            $$1.a($$2.u(), (double)$$2.v(), (double)$$2.w(), bda.uW, bdb.i, 1.0f, 1.0f, false);
        }
    }

    @Override
    protected boolean e_(eoh $$0) {
        return true;
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        return this.b($$1, $$2);
    }

    private boolean b(dvt $$0, is $$1) {
        eoh $$3;
        is $$2 = $$1.a(iz.b);
        return eey.a($$0, iz.b, $$2, $$3 = $$0.a_($$2)) || $$3.a(dzs.uV);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if (!this.b($$1, $$3)) {
            $$2.a($$3, this, 1);
        }
        return (eoh)$$0.b(b, !$$1.a_($$3.e()).a(this));
    }

    @Override
    protected void a(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if (!this.b($$1, $$2)) {
            $$1.b($$2, true);
        }
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{b});
    }

    @Override
    public boolean a(dwr $$0, is $$1, eoh $$2) {
        return this.p($$0.a_(this.a((dvt)$$0, $$1).e()));
    }

    private boolean p(eoh $$0) {
        return $$0.l();
    }

    public is a(dvt $$0, is $$1) {
        eoh $$3;
        is.a $$2 = $$1.k();
        do {
            $$2.c(iz.a);
        } while (($$3 = $$0.a_($$2)).a(this));
        return $$2.a(iz.b).j();
    }

    @Override
    public boolean a(dwo $$0, bgr $$1, is $$2, eoh $$3) {
        return true;
    }

    @Override
    public void a(axf $$0, bgr $$1, is $$2, eoh $$3) {
        is $$4 = this.a((dvt)$$0, $$2).e();
        if (!this.p($$0.a_($$4))) {
            return;
        }
        $$0.c($$4, (eoh)$$3.b(b, true));
    }
}

