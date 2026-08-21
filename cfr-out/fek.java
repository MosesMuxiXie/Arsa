/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class fek
extends fez {
    public static final MapCodec<fek> a = cch.b(0, 256).fieldOf("count").xmap(fek::new, $$0 -> $$0.c);
    private final cch c;

    private fek(cch $$0) {
        this.c = $$0;
    }

    public static fek a(cch $$0) {
        return new fek($$0);
    }

    public static fek a(int $$0) {
        return fek.a(cce.a($$0));
    }

    @Override
    protected int a(bgr $$0, is $$1) {
        return this.c.a($$0);
    }

    @Override
    public few<?> b() {
        return few.f;
    }
}

