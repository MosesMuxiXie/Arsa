/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class fjs
extends fjk {
    public static final MapCodec<fjs> a = bef.a(mj.i).fieldOf("tag").xmap(fjs::new, $$0 -> $$0.b);
    private final bef<dzq> b;

    public fjs(bef<dzq> $$0) {
        this.b = $$0;
    }

    @Override
    public boolean a(eoh $$0, bgr $$1) {
        return $$0.a(this.b);
    }

    @Override
    protected fjl<?> a() {
        return fjl.d;
    }
}

