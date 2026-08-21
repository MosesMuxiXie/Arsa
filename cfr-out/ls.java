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

public class ls
extends ma {
    public static final int a = 0xFF0000;
    public static final ls b = new ls(0xFF0000, 1.0f);
    public static final MapCodec<ls> c = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)bfm.l.fieldOf("color").forGetter($$0 -> $$0.h), (App)g.fieldOf("scale").forGetter(ma::d)).apply((Applicative)$$02, ls::new));
    public static final aao<xq, ls> d = aao.a(aam.g, $$0 -> $$0.h, aam.l, ma::d, ls::new);
    private final int h;

    public ls(int $$0, float $$1) {
        super($$1);
        this.h = $$0;
    }

    public lx<ls> a() {
        return ly.o;
    }

    public Vector3f b() {
        return bel.k(this.h);
    }
}

