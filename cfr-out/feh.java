/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class feh
extends feu {
    public static final MapCodec<feh> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)evx.b.fieldOf("predicate").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, feh::new));
    private final evx c;

    private feh(evx $$0) {
        this.c = $$0;
    }

    public static feh a(evx $$0) {
        return new feh($$0);
    }

    @Override
    protected boolean a(fet $$0, bgr $$1, is $$2) {
        return this.c.test($$0.d(), $$2);
    }

    @Override
    public few<?> b() {
        return few.a;
    }
}

