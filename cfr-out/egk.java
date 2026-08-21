/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class egk
extends ejg {
    public static final MapCodec<egk> a = egk.b(egk::new);
    private static final fug b = dzq.b(12.0, 0.0, 13.0);

    public MapCodec<egk> a() {
        return a;
    }

    protected egk(eog.d $$0) {
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

