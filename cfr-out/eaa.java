/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class eaa
extends ejg
implements dzt {
    public static final MapCodec<eaa> a = eaa.b(eaa::new);
    private static final fug b = dzq.b(16.0, 0.0, 13.0);

    public MapCodec<eaa> a() {
        return a;
    }

    protected eaa(eog.d $$0) {
        super($$0);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return b;
    }

    @Override
    public boolean a(dwr $$0, is $$1, eoh $$2) {
        return dzt.a_($$0, $$1, $$2);
    }

    @Override
    public boolean a(dwo $$0, bgr $$1, is $$2, eoh $$3) {
        return true;
    }

    @Override
    public void a(axf $$0, bgr $$12, is $$2, eoh $$3) {
        dzt.a($$0, $$2, $$3).ifPresent($$1 -> $$0.c((is)$$1, this.m()));
    }
}

