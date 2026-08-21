/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class fae
implements fac {
    public static final Codec<fae> a = RecordCodecBuilder.create($$02 -> $$02.group((App)fcd.a.fieldOf("cap_provider").forGetter($$0 -> $$0.b), (App)fcd.a.fieldOf("stem_provider").forGetter($$0 -> $$0.c), (App)Codec.INT.fieldOf("foliage_radius").orElse((Object)2).forGetter($$0 -> $$0.d)).apply((Applicative)$$02, fae::new));
    public final fcd b;
    public final fcd c;
    public final int d;

    public fae(fcd $$0, fcd $$1, int $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }
}

