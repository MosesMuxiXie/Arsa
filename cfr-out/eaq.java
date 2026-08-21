/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class eaq
extends edk
implements eao {
    public static final MapCodec<eaq> c = eaq.b(eaq::new);

    public MapCodec<eaq> a() {
        return c;
    }

    public eaq(eog.d $$0) {
        super($$0, iz.a, u_, false);
        this.l((eoh)((eoh)this.C.b()).b(v_, false));
    }

    @Override
    protected edl c() {
        return (edl)dzs.tS;
    }

    @Override
    protected eoh a(eoh $$0, eoh $$1) {
        return (eoh)$$1.b(v_, $$0.c(v_));
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

