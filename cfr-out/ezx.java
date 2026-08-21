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

public class ezx
implements fac {
    public static final Codec<ezx> a = RecordCodecBuilder.create($$02 -> $$02.group((App)eoh.a.fieldOf("contents").forGetter($$0 -> $$0.b), (App)eoh.a.fieldOf("rim").forGetter($$0 -> $$0.c), (App)cch.b(0, 16).fieldOf("size").forGetter($$0 -> $$0.d), (App)cch.b(0, 16).fieldOf("rim_size").forGetter($$0 -> $$0.e)).apply((Applicative)$$02, ezx::new));
    private final eoh b;
    private final eoh c;
    private final cch d;
    private final cch e;

    public ezx(eoh $$0, eoh $$1, cch $$2, cch $$3) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
    }

    public eoh a() {
        return this.b;
    }

    public eoh b() {
        return this.c;
    }

    public cch c() {
        return this.d;
    }

    public cch d() {
        return this.e;
    }
}

