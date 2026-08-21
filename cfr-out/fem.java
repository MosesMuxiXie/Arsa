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
import java.util.List;
import java.util.stream.Stream;

public class fem
extends fev {
    public static final MapCodec<fem> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)is.a.listOf().fieldOf("positions").forGetter($$0 -> $$0.c)).apply((Applicative)$$02, fem::new));
    private final List<is> c;

    public static fem a(is ... $$0) {
        return new fem(List.of($$0));
    }

    private fem(List<is> $$0) {
        this.c = $$0;
    }

    @Override
    public Stream<is> a_(fet $$0, bgr $$1, is $$22) {
        int $$3 = jw.a($$22.u());
        int $$4 = jw.a($$22.w());
        boolean $$5 = false;
        for (is $$6 : this.c) {
            if (!fem.a($$3, $$4, $$6)) continue;
            $$5 = true;
            break;
        }
        if (!$$5) {
            return Stream.empty();
        }
        return this.c.stream().filter($$2 -> fem.a($$3, $$4, $$2));
    }

    private static boolean a(int $$0, int $$1, is $$2) {
        return $$0 == jw.a($$2.u()) && $$1 == jw.a($$2.w());
    }

    @Override
    public few<?> b() {
        return few.o;
    }
}

