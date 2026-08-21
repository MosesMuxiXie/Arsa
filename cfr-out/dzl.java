/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class dzl
extends ebp {
    public static final MapCodec<dzl> a = dzl.b(dzl::new);
    public static final int b = 3;
    public static final eph c = eox.aw;
    private static final fug[] g = dzq.a(3, (int $$0) -> dzq.b(16.0, 0.0, 2 + $$0 * 2));

    public MapCodec<dzl> a() {
        return a;
    }

    public dzl(eog.d $$0) {
        super($$0);
    }

    @Override
    protected eph b() {
        return c;
    }

    @Override
    public int c() {
        return 3;
    }

    @Override
    protected dwn d() {
        return dlx.xA;
    }

    @Override
    protected void b(eoh $$0, axf $$1, is $$2, bgr $$3) {
        if ($$3.a(3) != 0) {
            super.b($$0, $$1, $$2, $$3);
        }
    }

    @Override
    protected int a(dwo $$0) {
        return super.a($$0) / 3;
    }

    @Override
    protected void a(eoi.a<dzq, eoh> $$0) {
        $$0.a(new epk[]{c});
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return g[this.h($$0)];
    }
}

