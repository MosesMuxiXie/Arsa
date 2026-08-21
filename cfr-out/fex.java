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

public class fex
extends fev {
    public static final MapCodec<fex> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)cch.b(-16, 16).fieldOf("xz_spread").forGetter($$0 -> $$0.c), (App)cch.b(-16, 16).fieldOf("y_spread").forGetter($$0 -> $$0.d)).apply((Applicative)$$02, fex::new));
    private final cch c;
    private final cch d;

    public static fex a(cch $$0, cch $$1) {
        return new fex($$0, $$1);
    }

    public static fex a(cch $$0) {
        return new fex(cce.a(0), $$0);
    }

    public static fex b(cch $$0) {
        return new fex($$0, cce.a(0));
    }

    private fex(cch $$0, cch $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    @Override
    public Stream<is> a_(fet $$0, bgr $$1, is $$2) {
        int $$3 = $$2.u() + this.c.a($$1);
        int $$4 = $$2.v() + this.d.a($$1);
        int $$5 = $$2.w() + this.c.a($$1);
        return Stream.of(new is($$3, $$4, $$5));
    }

    @Override
    public few<?> b() {
        return few.n;
    }
}

