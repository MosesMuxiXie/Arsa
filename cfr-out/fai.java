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

public class fai
extends ezt {
    public static final Codec<fai> c = RecordCodecBuilder.create($$02 -> $$02.group((App)fcd.a.fieldOf("state_provider").forGetter($$0 -> $$0.b), (App)bfm.r.fieldOf("spread_width").forGetter($$0 -> $$0.d), (App)bfm.r.fieldOf("spread_height").forGetter($$0 -> $$0.e)).apply((Applicative)$$02, fai::new));
    public final int d;
    public final int e;

    public fai(fcd $$0, int $$1, int $$2) {
        super($$0);
        this.d = $$1;
        this.e = $$2;
    }
}

