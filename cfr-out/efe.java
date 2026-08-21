/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class efe
extends ejg {
    public static final MapCodec<efe> a = efe.b(efe::new);
    private static final fug b = dzq.b(12.0, 0.0, 3.0);

    public MapCodec<efe> a() {
        return a;
    }

    public efe(eog.d $$0) {
        super($$0);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return b;
    }

    @Override
    protected boolean b(eoh $$0, dvt $$1, is $$2) {
        return $$0.a(bdp.aZ) || $$0.a(dzs.eA) || super.b($$0, $$1, $$2);
    }
}

