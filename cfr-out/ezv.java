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

public class ezv
implements fac {
    public static final Codec<ezv> a = RecordCodecBuilder.create($$02 -> $$02.group((App)cch.b(0, 3).fieldOf("reach").forGetter($$0 -> $$0.b), (App)cch.b(1, 10).fieldOf("height").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, ezv::new));
    private final cch b;
    private final cch c;

    public ezv(cch $$0, cch $$1) {
        this.b = $$0;
        this.c = $$1;
    }

    public cch a() {
        return this.b;
    }

    public cch b() {
        return this.c;
    }
}

