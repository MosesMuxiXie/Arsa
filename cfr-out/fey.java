/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class fey
extends feu {
    public static final MapCodec<fey> a = bfm.r.fieldOf("chance").xmap(fey::new, $$0 -> $$0.c);
    private final int c;

    private fey(int $$0) {
        this.c = $$0;
    }

    public static fey a(int $$0) {
        return new fey($$0);
    }

    @Override
    protected boolean a(fet $$0, bgr $$1, is $$2) {
        return $$1.i() < 1.0f / (float)this.c;
    }

    @Override
    public few<?> b() {
        return few.b;
    }
}

