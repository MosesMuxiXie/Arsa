/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class fck
extends fcd {
    public static final MapCodec<fck> b = eoh.a.fieldOf("state").xmap(eog.a::b, dzq::m).xmap(fck::new, $$0 -> $$0.c);
    private final dzq c;

    public fck(dzq $$0) {
        this.c = $$0;
    }

    @Override
    protected fce<?> a() {
        return fce.f;
    }

    @Override
    public eoh a(bgr $$0, is $$1) {
        iz.a $$2 = iz.a.a($$0);
        return (eoh)this.c.m().c(egl.d, $$2);
    }
}

