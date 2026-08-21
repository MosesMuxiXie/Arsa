/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class fcm
extends fcd {
    public static final MapCodec<fcm> b = eoh.a.fieldOf("state").xmap(fcm::new, $$0 -> $$0.c);
    private final eoh c;

    protected fcm(eoh $$0) {
        this.c = $$0;
    }

    @Override
    protected fce<?> a() {
        return fce.a;
    }

    @Override
    public eoh a(bgr $$0, is $$1) {
        return this.c;
    }
}

