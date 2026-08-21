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

public class feo
extends fev {
    public static final MapCodec<feo> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)euq.a.g.fieldOf("heightmap").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, feo::new));
    private final euq.a c;

    private feo(euq.a $$0) {
        this.c = $$0;
    }

    public static feo a(euq.a $$0) {
        return new feo($$0);
    }

    @Override
    public Stream<is> a_(fet $$0, bgr $$1, is $$2) {
        int $$4;
        int $$3 = $$2.u();
        int $$5 = $$0.a(this.c, $$3, $$4 = $$2.w());
        if ($$5 > $$0.c()) {
            return Stream.of(new is($$3, $$5, $$4));
        }
        return Stream.of(new is[0]);
    }

    @Override
    public few<?> b() {
        return few.k;
    }
}

