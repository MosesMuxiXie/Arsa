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

public class far
implements fac {
    public static final Codec<far> a = RecordCodecBuilder.create($$02 -> $$02.group((App)eoh.a.fieldOf("target").forGetter($$0 -> $$0.b), (App)eoh.a.fieldOf("state").forGetter($$0 -> $$0.c), (App)cch.b(0, 12).fieldOf("radius").forGetter($$0 -> $$0.d)).apply((Applicative)$$02, far::new));
    public final eoh b;
    public final eoh c;
    private final cch d;

    public far(eoh $$0, eoh $$1, cch $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    public cch a() {
        return this.d;
    }
}

