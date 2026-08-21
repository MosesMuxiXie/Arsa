/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class efg
extends ejg {
    public static final MapCodec<efg> a = efg.b(efg::new);
    public static final int b = 3;
    public static final eph c = eox.aw;
    private static final fug[] d = dzq.a(3, (int $$0) -> dzq.b(16.0, 0.0, 5 + $$0 * 3));

    public MapCodec<efg> a() {
        return a;
    }

    protected efg(eog.d $$0) {
        super($$0);
        this.l((eoh)((eoh)this.C.b()).b(c, 0));
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return d[$$0.c(c)];
    }

    @Override
    protected boolean b(eoh $$0, dvt $$1, is $$2) {
        return $$0.a(dzs.ez);
    }

    @Override
    protected boolean f(eoh $$0) {
        return $$0.c(c) < 3;
    }

    @Override
    protected void b(eoh $$0, axf $$1, is $$2, bgr $$3) {
        int $$4 = $$0.c(c);
        if ($$4 < 3 && $$3.a(10) == 0) {
            $$0 = (eoh)$$0.b(c, $$4 + 1);
            $$1.a($$2, $$0, 2);
        }
    }

    @Override
    protected dlt a(dwr $$0, is $$1, eoh $$2, boolean $$3) {
        return new dlt(dlx.un);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{c});
    }
}

