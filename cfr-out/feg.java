/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class feg
extends feu {
    private static final feg c = new feg();
    public static MapCodec<feg> a = MapCodec.unit(() -> c);

    private feg() {
    }

    public static feg a() {
        return c;
    }

    @Override
    protected boolean a(fet $$0, bgr $$1, is $$2) {
        fes $$3 = $$0.e().orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
        jd<dxo> $$4 = $$0.d().z($$2);
        return $$0.f().a($$4).a($$3);
    }

    @Override
    public few<?> b() {
        return few.e;
    }
}

