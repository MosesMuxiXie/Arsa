/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class eap
extends edl
implements eao {
    public static final MapCodec<eap> c = eap.b(eap::new);
    private static final float g = 0.11f;

    public MapCodec<eap> a() {
        return c;
    }

    public eap(eog.d $$0) {
        super($$0, iz.a, u_, false, 0.1);
        this.l((eoh)((eoh)((eoh)this.C.b()).b(e, 0)).b(v_, false));
    }

    @Override
    protected int a(bgr $$0) {
        return 1;
    }

    @Override
    protected boolean h(eoh $$0) {
        return $$0.l();
    }

    @Override
    protected dzq b() {
        return dzs.tT;
    }

    @Override
    protected eoh a(eoh $$0, eoh $$1) {
        return (eoh)$$1.b(v_, $$0.c(v_));
    }

    @Override
    protected eoh a(eoh $$0, bgr $$1) {
        return (eoh)super.a($$0, $$1).b(v_, $$1.i() < 0.11f);
    }

    @Override
    protected dlt a(dwr $$0, is $$1, eoh $$2, boolean $$3) {
        return new dlt(dlx.zb);
    }

    @Override
    protected cdc a(eoh $$0, dwo $$1, is $$2, ddm $$3, fti $$4) {
        return eao.a($$3, $$0, $$1, $$2);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        super.a($$0);
        $$0.a(new epk[]{v_});
    }

    @Override
    public boolean a(dwr $$0, is $$1, eoh $$2) {
        return $$2.c(v_) == false;
    }

    @Override
    public boolean a(dwo $$0, bgr $$1, is $$2, eoh $$3) {
        return true;
    }

    @Override
    public void a(axf $$0, bgr $$1, is $$2, eoh $$3) {
        $$0.a($$2, (eoh)$$3.b(v_, true), 2);
    }
}

