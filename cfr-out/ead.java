/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class ead
extends ejg {
    public static final MapCodec<ead> a = ead.b(ead::new);
    private static final fug b = dzq.b(14.0, 0.0, 12.0);

    public MapCodec<? extends ead> a() {
        return a;
    }

    public ead(eog.d $$0) {
        super($$0);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return b;
    }

    @Override
    protected boolean b(eoh $$0, dvt $$1, is $$2) {
        eoh $$3 = $$1.a_($$2);
        return $$3.a(dzs.es) || $$3.a(dzs.cZ) || $$3.a($$1, $$2, iz.b, eig.b);
    }
}

