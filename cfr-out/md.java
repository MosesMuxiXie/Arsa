/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class md
extends lx<md>
implements lw {
    private final MapCodec<md> a = MapCodec.unit(this::e);
    private final aao<xq, md> b = aao.a(this);

    protected md(boolean $$0) {
        super($$0);
    }

    public md e() {
        return this;
    }

    @Override
    public MapCodec<md> c() {
        return this.a;
    }

    @Override
    public aao<xq, md> d() {
        return this.b;
    }

    public /* synthetic */ lx a() {
        return this.e();
    }
}

