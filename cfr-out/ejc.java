/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class ejc
extends edl {
    public static final MapCodec<ejc> c = ejc.b(ejc::new);
    private static final fug g = dzq.b(8.0, 0.0, 15.0);

    public MapCodec<ejc> a() {
        return c;
    }

    public ejc(eog.d $$0) {
        super($$0, iz.b, g, false, 0.1);
    }

    @Override
    protected int a(bgr $$0) {
        return eff.a($$0);
    }

    @Override
    protected dzq b() {
        return dzs.pA;
    }

    @Override
    protected boolean h(eoh $$0) {
        return eff.a($$0);
    }
}

