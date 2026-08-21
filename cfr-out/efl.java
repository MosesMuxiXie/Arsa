/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class efl
extends ejm {
    public static final MapCodec<efl> b = efl.b(efl::new);
    private static final Map<iz, fug> e = fud.c(dzq.b(10.0, 8.0, 8.0, 16.0));

    public MapCodec<efl> a() {
        return b;
    }

    public efl(eog.d $$0) {
        super(ehh.b.h, $$0);
    }

    @Override
    protected fug a(eoh $$0, dvt $$1, is $$2, ftr $$3) {
        return e.get($$0.c(d));
    }
}

