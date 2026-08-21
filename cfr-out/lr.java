/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.joml.Vector3f
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.joml.Vector3f;

public class lr
extends ma {
    public static final int a = 3790560;
    public static final lr b = new lr(3790560, 0xFF0000, 1.0f);
    public static final MapCodec<lr> c = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)bfm.l.fieldOf("from_color").forGetter($$0 -> $$0.h), (App)bfm.l.fieldOf("to_color").forGetter($$0 -> $$0.i), (App)g.fieldOf("scale").forGetter(ma::d)).apply((Applicative)$$02, lr::new));
    public static final aao<xq, lr> d = aao.a(aam.g, $$0 -> $$0.h, aam.g, $$0 -> $$0.i, aam.l, ma::d, lr::new);
    private final int h;
    private final int i;

    public lr(int $$0, int $$1, float $$2) {
        super($$2);
        this.h = $$0;
        this.i = $$1;
    }

    public Vector3f b() {
        return bel.k(this.h);
    }

    public Vector3f c() {
        return bel.k(this.i);
    }

    public lx<lr> a() {
        return ly.p;
    }
}

