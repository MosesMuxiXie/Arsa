/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class efs
extends ebp {
    public static final MapCodec<efs> a = efs.b(efs::new);
    private static final fug[] b = dzq.a(7, (int $$0) -> dzq.b(16.0, 0.0, 2 + $$0));

    public MapCodec<efs> a() {
        return a;
    }

    public efs(eog.d $$0) {
        super($$0);
    }

    @Override
    protected dwn d() {
        return dlx.ws;
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return b[this.h($$0)];
    }
}

