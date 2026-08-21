/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class dyz
extends dza {
    public static final MapCodec<dyz> a = dyz.b(dyz::new);
    private static final fug c = dzq.b(12.0, 0.0, 15.0);

    public MapCodec<dyz> a() {
        return a;
    }

    protected dyz(eog.d $$0) {
        super($$0);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return c;
    }
}

