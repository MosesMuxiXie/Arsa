/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class ekg
extends edl {
    public static final MapCodec<ekg> c = ekg.b(ekg::new);
    private static final fug g = dzq.b(8.0, 9.0, 16.0);

    public MapCodec<ekg> a() {
        return c;
    }

    public ekg(eog.d $$0) {
        super($$0, iz.a, g, false, 0.1);
    }

    @Override
    protected int a(bgr $$0) {
        return eff.a($$0);
    }

    @Override
    protected dzq b() {
        return dzs.py;
    }

    @Override
    protected boolean h(eoh $$0) {
        return eff.a($$0);
    }
}

