/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class dyt
extends dzq
implements dzt {
    public static final MapCodec<dyt> a = dyt.b(dyt::new);
    private static final fug b = dzq.b(8.0, 0.0, 12.0);

    public MapCodec<dyt> a() {
        return a;
    }

    public dyt(eog.d $$0) {
        super($$0);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return b.a($$0.a($$2));
    }

    @Override
    protected void b(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if ($$3.a(3) == 0 && $$1.A($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
            this.a($$1, $$2);
        }
    }

    @Override
    protected boolean a(eoh $$0, dwr $$1, is $$2) {
        return $$1.a_($$2.e()).a(bdp.aK);
    }

    @Override
    protected eoh a(eoh $$0, dwr $$1, dxd $$2, is $$3, iz $$4, is $$5, eoh $$6, bgr $$7) {
        if (!$$0.a($$1, $$3)) {
            return dzs.a.m();
        }
        if ($$4 == iz.b && $$6.a(dzs.nW)) {
            return dzs.nW.m();
        }
        return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
    }

    @Override
    protected dlt a(dwr $$0, is $$1, eoh $$2, boolean $$3) {
        return new dlt(dlx.ej);
    }

    @Override
    public boolean a(dwr $$0, is $$1, eoh $$2) {
        return $$0.a_($$1.d()).l();
    }

    @Override
    public boolean a(dwo $$0, bgr $$1, is $$2, eoh $$3) {
        return true;
    }

    @Override
    public void a(axf $$0, bgr $$1, is $$2, eoh $$3) {
        this.a($$0, $$2);
    }

    protected void a(dwo $$0, is $$1) {
        $$0.a($$1.d(), (eoh)dzs.nW.m().b(dyu.c, eot.b), 3);
    }
}

