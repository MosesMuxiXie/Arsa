/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ewp
extends fam {
    public static final MapCodec<ewp> d = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("probability").forGetter($$0 -> Float.valueOf($$0.l)), (App)fdv.c.fieldOf("y").forGetter($$0 -> $$0.e), (App)ccf.c.fieldOf("yScale").forGetter($$0 -> $$0.f), (App)evk.a.fieldOf("lava_level").forGetter($$0 -> $$0.g), (App)ewq.b.optionalFieldOf("debug_settings", (Object)ewq.a).forGetter($$0 -> $$0.h), (App)js.a(mj.i).fieldOf("replaceable").forGetter($$0 -> $$0.i)).apply((Applicative)$$02, ewp::new));
    public final fdv e;
    public final ccf f;
    public final evk g;
    public final ewq h;
    public final jh<dzq> i;

    public ewp(float $$0, fdv $$1, ccf $$2, evk $$3, ewq $$4, jh<dzq> $$5) {
        super($$0);
        this.e = $$1;
        this.f = $$2;
        this.g = $$3;
        this.h = $$4;
        this.i = $$5;
    }
}

