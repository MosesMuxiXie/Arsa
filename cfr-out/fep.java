/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class fep
extends fev {
    private static final fep c = new fep();
    public static final MapCodec<fep> a = MapCodec.unit(() -> c);

    public static fep a() {
        return c;
    }

    @Override
    public Stream<is> a_(fet $$0, bgr $$1, is $$2) {
        int $$3 = $$1.a(16) + $$2.u();
        int $$4 = $$1.a(16) + $$2.w();
        return Stream.of(new is($$3, $$2.v(), $$4));
    }

    @Override
    public few<?> b() {
        return few.m;
    }
}

