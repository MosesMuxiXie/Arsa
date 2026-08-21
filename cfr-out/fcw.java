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
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class fcw
extends fcy {
    public static final MapCodec<fcw> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("leaves_probability").forGetter($$0 -> Float.valueOf($$0.b)), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("trunk_probability").forGetter($$0 -> Float.valueOf($$0.c)), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("ground_probability").forGetter($$0 -> Float.valueOf($$0.d))).apply((Applicative)$$02, fcw::new));
    private final float b;
    private final float c;
    private final float d;

    @Override
    protected fcz<?> a() {
        return fcz.c;
    }

    public fcw(float $$0, float $$1, float $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    @Override
    public void a(fcy.a $$02) {
        bgr $$1 = $$02.b();
        dxn $$22 = (dxn)$$02.a();
        List<is> $$32 = bhs.a($$02.c(), $$1);
        if ($$32.isEmpty()) {
            return;
        }
        is $$4 = Collections.min($$32, Comparator.comparingInt(jy::v));
        if ($$1.i() < this.d) {
            $$22.J_().a(mj.aY).flatMap($$0 -> $$0.a(ry.M)).ifPresent($$3 -> ((exi)$$3.a()).a($$22, $$22.a().p().g(), $$1, $$4.d()));
        }
        $$02.c().forEach($$2 -> {
            is $$3;
            if ($$1.i() < this.c && $$02.a($$3 = $$2.e())) {
                fcw.a($$3, $$02);
            }
        });
        $$02.d().forEach($$2 -> {
            is $$3;
            if ($$1.i() < this.b && $$02.a($$3 = $$2.e())) {
                fcw.a($$3, $$02);
            }
        });
    }

    private static void a(is $$0, fcy.a $$1) {
        while ($$1.a($$0.e()) && !((double)$$1.b().i() < 0.5)) {
            $$1.a($$0, (eoh)dzs.uV.m().b(edn.b, false));
            $$0 = $$0.e();
        }
        $$1.a($$0, (eoh)dzs.uV.m().b(edn.b, true));
    }
}

