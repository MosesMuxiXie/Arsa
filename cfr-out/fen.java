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
import java.util.stream.Stream;

public class fen
extends fev {
    public static final MapCodec<fen> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)fdv.c.fieldOf("height").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, fen::new));
    private final fdv c;

    private fen(fdv $$0) {
        this.c = $$0;
    }

    public static fen a(fdv $$0) {
        return new fen($$0);
    }

    public static fen a(evk $$0, evk $$1) {
        return fen.a(fdy.a($$0, $$1));
    }

    public static fen b(evk $$0, evk $$1) {
        return fen.a(fdx.a($$0, $$1));
    }

    @Override
    public Stream<is> a_(fet $$0, bgr $$1, is $$2) {
        return Stream.of($$2.h(this.c.a($$1, $$0)));
    }

    @Override
    public few<?> b() {
        return few.l;
    }
}

