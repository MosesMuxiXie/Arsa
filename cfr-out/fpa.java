/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fpa
extends fpq {
    public static final MapCodec<fpa> a = RecordCodecBuilder.mapCodec($$0 -> fpa.a($$0).apply((Applicative)$$0, fpa::new));

    private fpa(List<frm> $$0) {
        super($$0);
    }

    public fps<fpa> a() {
        return fpt.z;
    }

    @Override
    public dlt a(dlt $$0, fnz $$1) {
        Float $$2 = $$1.c(fqx.l);
        if ($$2 != null) {
            bgr $$3 = $$1.b();
            float $$4 = 1.0f / $$2.floatValue();
            int $$5 = $$0.N();
            int $$6 = 0;
            for (int $$7 = 0; $$7 < $$5; ++$$7) {
                if (!($$3.i() <= $$4)) continue;
                ++$$6;
            }
            $$0.e($$6);
        }
        return $$0;
    }

    public static fpq.a<?> c() {
        return fpa.a(fpa::new);
    }
}

