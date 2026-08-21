/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class eiu
extends ebp {
    public static final MapCodec<eiu> a = eiu.b(eiu::new);
    public static final int b = 1;
    public static final eph c = eox.au;
    private static final fug[] g = dzq.a(1, (int $$0) -> dzq.b(6.0, 0.0, 6 + $$0 * 4));
    private static final int h = 1;

    public MapCodec<eiu> a() {
        return a;
    }

    public eiu(eog.d $$0) {
        super($$0);
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{c});
    }

    @Override
    public fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return g[this.h($$0)];
    }

    @Override
    protected eph b() {
        return c;
    }

    @Override
    public int c() {
        return 2;
    }

    @Override
    protected dwn d() {
        return dlx.xx;
    }

    @Override
    public eoh b(int $$0) {
        if ($$0 == 2) {
            return dzs.cc.m();
        }
        return super.b($$0);
    }

    @Override
    public void b(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if ($$3.a(3) != 0) {
            super.b($$0, $$1, $$2, $$3);
        }
    }

    @Override
    protected int a(dwo $$0) {
        return 1;
    }
}

