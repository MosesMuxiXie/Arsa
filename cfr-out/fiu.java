/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class fiu
extends fjk {
    public static final MapCodec<fiu> a = eoh.a.fieldOf("block_state").xmap(fiu::new, $$0 -> $$0.b);
    private final eoh b;

    public fiu(eoh $$0) {
        this.b = $$0;
    }

    @Override
    public boolean a(eoh $$0, bgr $$1) {
        return $$0 == this.b;
    }

    @Override
    protected fjl<?> a() {
        return fjl.c;
    }
}

