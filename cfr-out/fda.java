/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class fda
extends fcy {
    public static final MapCodec<fda> a = MapCodec.unit(() -> b);
    public static final fda b = new fda();

    @Override
    protected fcz<?> a() {
        return fcz.a;
    }

    @Override
    public void a(fcy.a $$0) {
        bgr $$1 = $$0.b();
        $$0.c().forEach($$2 -> {
            is $$6;
            is $$5;
            is $$4;
            is $$3;
            if ($$1.a(3) > 0 && $$0.a($$3 = $$2.h())) {
                $$0.a($$3, ejh.d);
            }
            if ($$1.a(3) > 0 && $$0.a($$4 = $$2.i())) {
                $$0.a($$4, ejh.f);
            }
            if ($$1.a(3) > 0 && $$0.a($$5 = $$2.f())) {
                $$0.a($$5, ejh.e);
            }
            if ($$1.a(3) > 0 && $$0.a($$6 = $$2.g())) {
                $$0.a($$6, ejh.c);
            }
        });
    }
}

