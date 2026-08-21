/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class fcv
extends fcy {
    public static final MapCodec<fcv> a = Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("probability").xmap(fcv::new, $$0 -> Float.valueOf($$0.b));
    private final float b;

    @Override
    protected fcz<?> a() {
        return fcz.b;
    }

    public fcv(float $$0) {
        this.b = $$0;
    }

    @Override
    public void a(fcy.a $$0) {
        bgr $$1 = $$0.b();
        $$0.d().forEach($$2 -> {
            is $$6;
            is $$5;
            is $$4;
            is $$3;
            if ($$1.i() < this.b && $$0.a($$3 = $$2.h())) {
                fcv.a($$3, ejh.d, $$0);
            }
            if ($$1.i() < this.b && $$0.a($$4 = $$2.i())) {
                fcv.a($$4, ejh.f, $$0);
            }
            if ($$1.i() < this.b && $$0.a($$5 = $$2.f())) {
                fcv.a($$5, ejh.e, $$0);
            }
            if ($$1.i() < this.b && $$0.a($$6 = $$2.g())) {
                fcv.a($$6, ejh.c, $$0);
            }
        });
    }

    private static void a(is $$0, eoy $$1, fcy.a $$2) {
        $$2.a($$0, $$1);
        $$0 = $$0.e();
        for (int $$3 = 4; $$2.a($$0) && $$3 > 0; --$$3) {
            $$2.a($$0, $$1);
            $$0 = $$0.e();
        }
    }
}

