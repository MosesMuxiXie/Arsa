/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class dys
extends ejg
implements dzt {
    public static final MapCodec<dys> a = dys.b(dys::new);
    private static final fug b = fud.a(dzq.b(16.0, 8.0, 16.0), dzq.b(4.0, 0.0, 8.0));

    public MapCodec<dys> a() {
        return a;
    }

    protected dys(eog.d $$0) {
        super($$0);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return b;
    }

    @Override
    protected boolean b(eoh $$0, dvt $$1, is $$2) {
        return $$0.a(dzs.eu) || super.b($$0, $$1, $$2);
    }

    @Override
    public boolean a(dwr $$0, is $$1, eoh $$2) {
        return $$0.b_($$1.d()).c();
    }

    @Override
    public boolean a(dwo $$0, bgr $$1, is $$2, eoh $$3) {
        return (double)$$0.y.i() < 0.45;
    }

    @Override
    public void a(axf $$0, bgr $$1, is $$2, eoh $$3) {
        enu.e.a($$0, $$0.p().g(), $$2, $$3, $$1);
    }

    @Override
    protected boolean a(eoh $$0, flq $$1) {
        return false;
    }
}

