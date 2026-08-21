/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class fis
extends fjk {
    public static final MapCodec<fis> a = mi.e.q().fieldOf("block").xmap(fis::new, $$0 -> $$0.b);
    private final dzq b;

    public fis(dzq $$0) {
        this.b = $$0;
    }

    @Override
    public boolean a(eoh $$0, bgr $$1) {
        return $$0.a(this.b);
    }

    @Override
    protected fjl<?> a() {
        return fjl.b;
    }
}

