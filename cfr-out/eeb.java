/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class eeb
extends edl
implements eep {
    public static final MapCodec<eeb> c = eeb.b(eeb::new);
    private static final double g = 0.14;
    private static final fug h = dzq.b(16.0, 0.0, 9.0);

    public MapCodec<eeb> a() {
        return c;
    }

    protected eeb(eog.d $$0) {
        super($$0, iz.b, h, true, 0.14);
    }

    @Override
    protected boolean h(eoh $$0) {
        return $$0.a(dzs.J);
    }

    @Override
    protected dzq b() {
        return dzs.mZ;
    }

    @Override
    protected boolean p(eoh $$0) {
        return !$$0.a(dzs.lF);
    }

    @Override
    public boolean a(@Nullable chl $$0, dvt $$1, is $$2, eoh $$3, fla $$4) {
        return false;
    }

    @Override
    public boolean a(dwp $$0, is $$1, eoh $$2, flb $$3) {
        return false;
    }

    @Override
    protected int a(bgr $$0) {
        return 1;
    }

    @Override
    public @Nullable eoh a(dpu $$0) {
        flb $$1 = $$0.q().b_($$0.a());
        if ($$1.a(bdv.a) && $$1.e() == 8) {
            return super.a($$0);
        }
        return null;
    }

    @Override
    protected flb b_(eoh $$0) {
        return flc.c.a(false);
    }
}

