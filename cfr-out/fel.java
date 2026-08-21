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
import java.util.stream.Stream;

public class fel
extends fev {
    private final iz c;
    private final evx d;
    private final evx e;
    private final int f;
    public static final MapCodec<fel> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)iz.h.fieldOf("direction_of_search").forGetter($$0 -> $$0.c), (App)evx.b.fieldOf("target_condition").forGetter($$0 -> $$0.d), (App)evx.b.optionalFieldOf("allowed_search_condition", (Object)evx.e()).forGetter($$0 -> $$0.e), (App)Codec.intRange((int)1, (int)32).fieldOf("max_steps").forGetter($$0 -> $$0.f)).apply((Applicative)$$02, fel::new));

    private fel(iz $$0, evx $$1, evx $$2, int $$3) {
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
        this.f = $$3;
    }

    public static fel a(iz $$0, evx $$1, evx $$2, int $$3) {
        return new fel($$0, $$1, $$2, $$3);
    }

    public static fel a(iz $$0, evx $$1, int $$2) {
        return fel.a($$0, $$1, evx.e(), $$2);
    }

    @Override
    public Stream<is> a_(fet $$0, bgr $$1, is $$2) {
        is.a $$3 = $$2.k();
        dxn $$4 = $$0.d();
        if (!this.e.test($$4, $$3)) {
            return Stream.of(new is[0]);
        }
        for (int $$5 = 0; $$5 < this.f; ++$$5) {
            if (this.d.test($$4, $$3)) {
                return Stream.of($$3);
            }
            $$3.c(this.c);
            if ($$4.e($$3.v())) {
                return Stream.of(new is[0]);
            }
            if (!this.e.test($$4, $$3)) break;
        }
        if (this.d.test($$4, $$3)) {
            return Stream.of($$3);
        }
        return Stream.of(new is[0]);
    }

    @Override
    public few<?> b() {
        return few.j;
    }
}

